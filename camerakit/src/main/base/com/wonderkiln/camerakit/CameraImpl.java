package com.wonderkiln.camerakit;

import android.support.annotation.Nullable;

abstract class CameraImpl {

    protected final CameraListener mCameraListener;
    protected final PreviewImpl mPreview;

    CameraImpl(CameraListener callback, PreviewImpl preview) {
        mCameraListener = callback;
        mPreview = preview;
    }

    abstract void start();
    abstract void stop();

    abstract void setDisplayAndDeviceOrientation(int displayOrientation, int deviceOrientation);

    abstract void setFacing(@Facing int facing);
    abstract void setFlash(@Flash int flash);
    abstract void setFocus(@Focus int focus);
    abstract void setMethod(@Method int method);
    abstract void setZoom(@Zoom int zoom);
    abstract void setVideoQuality(@VideoQuality int videoQuality);
    abstract void setVideoBitRate(int videoBitRate);

    abstract void captureImage();
    abstract void startVideo();
    abstract void endVideo();

    abstract Size getCaptureResolution();
    abstract Size getVideoResolution();
    abstract Size getPreviewResolution();
    abstract boolean isCameraOpened();
    abstract boolean frontCameraOnly();

    abstract void setErrorListener(ErrorListener listener);

    @Nullable
    abstract CameraProperties getCameraProperties();

}