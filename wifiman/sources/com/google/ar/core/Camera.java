package com.google.ar.core;

/* loaded from: classes3.dex */
public class Camera {
    private static final String TAG = "ARCore-Camera";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected Camera() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeAcquireCamera(long j10, long j11);

    private native long nativeCreateCameraIntrinsics(long j10);

    private native Pose nativeDisplayOrientedPose(long j10, long j11);

    private native void nativeGetImageIntrinsics(long j10, long j11, long j12);

    private native Pose nativeGetPose(long j10, long j11);

    private native void nativeGetProjectionMatrix(long j10, long j11, float[] fArr, int i10, float f10, float f11);

    private native void nativeGetTextureIntrinsics(long j10, long j11, long j12);

    private native int nativeGetTrackingFailureReason(long j10, long j11);

    private native int nativeGetTrackingState(long j10, long j11);

    private native void nativeGetViewMatrix(long j10, long j11, float[] fArr, int i10);

    private static native void nativeReleaseCamera(long j10, long j11);

    public boolean equals(Object obj) {
        return (obj instanceof Camera) && ((Camera) obj).nativeHandle == this.nativeHandle;
    }

    protected void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public Pose getDisplayOrientedPose() {
        return nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public CameraIntrinsics getImageIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getProjectionMatrix(float[] fArr, int i10, float f10, float f11) {
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10, f10, f11);
    }

    public CameraIntrinsics getTextureIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public TrackingFailureReason getTrackingFailureReason() {
        return TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void getViewMatrix(float[] fArr, int i10) {
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i10);
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    Camera(Session session, Frame frame) {
        this.session = session;
        this.nativeHandle = nativeAcquireCamera(session.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
