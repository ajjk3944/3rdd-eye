package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import org.snmp4j.asn1.BER;

/* loaded from: classes3.dex */
public class Config {
    private static final String TAG = "ARCore-Config";
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2);

        final int nativeCode;

        AugmentedFaceMode(int i10) {
            this.nativeCode = i10;
        }

        static AugmentedFaceMode forNumber(int i10) {
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i10) {
                    return augmentedFaceMode;
                }
            }
            throw new FatalException(F.b((byte) 53, i10, "Unexpected value for native AugmentedFaceMode, value="));
        }
    }

    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        CloudAnchorMode(int i10) {
            this.nativeCode = i10;
        }

        static CloudAnchorMode forNumber(int i10) {
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i10) {
                    return cloudAnchorMode;
                }
            }
            throw new FatalException(F.b((byte) 53, i10, "Unexpected value for native AnchorHostingMode, value="));
        }
    }

    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        RAW_DEPTH_ONLY(3);

        final int nativeCode;

        DepthMode(int i10) {
            this.nativeCode = i10;
        }

        static DepthMode forNumber(int i10) {
            for (DepthMode depthMode : values()) {
                if (depthMode.nativeCode == i10) {
                    return depthMode;
                }
            }
            throw new FatalException(F.b((byte) 45, i10, "Unexpected value for native DepthMode, value="));
        }
    }

    public enum FlashMode {
        OFF(0),
        TORCH(2);

        final int nativeCode;

        FlashMode(int i10) {
            this.nativeCode = i10;
        }

        static FlashMode forNumber(int i10) {
            for (FlashMode flashMode : values()) {
                if (flashMode.nativeCode == i10) {
                    return flashMode;
                }
            }
            throw new FatalException(F.b((byte) 45, i10, "Unexpected value for native FlashMode, value="));
        }
    }

    public enum FocusMode {
        FIXED(0),
        AUTO(1);

        final int nativeCode;

        FocusMode(int i10) {
            this.nativeCode = i10;
        }

        static FocusMode forNumber(int i10) {
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i10) {
                    return focusMode;
                }
            }
            throw new FatalException(F.b((byte) 45, i10, "Unexpected value for native FocusMode, value="));
        }
    }

    public enum GeospatialMode {
        DISABLED(0),
        ENABLED(2);

        final int nativeCode;

        GeospatialMode(int i10) {
            this.nativeCode = i10;
        }

        static GeospatialMode forNumber(int i10) {
            for (GeospatialMode geospatialMode : values()) {
                if (geospatialMode.nativeCode == i10) {
                    return geospatialMode;
                }
            }
            throw new FatalException(F.b((byte) 50, i10, "Unexpected value for native GeospatialMode, value="));
        }
    }

    public enum ImageStabilizationMode {
        OFF(0),
        EIS(1);

        final int nativeCode;

        ImageStabilizationMode(int i10) {
            this.nativeCode = i10;
        }

        static ImageStabilizationMode forNumber(int i10) {
            for (ImageStabilizationMode imageStabilizationMode : values()) {
                if (imageStabilizationMode.nativeCode == i10) {
                    return imageStabilizationMode;
                }
            }
            throw new FatalException(F.b((byte) 58, i10, "Unexpected value for native ImageStabilizationMode, value="));
        }
    }

    public enum InstantPlacementMode {
        DISABLED(0),
        LOCAL_Y_UP(2);

        final int nativeCode;

        InstantPlacementMode(int i10) {
            this.nativeCode = i10;
        }

        static InstantPlacementMode forNumber(int i10) {
            for (InstantPlacementMode instantPlacementMode : values()) {
                if (instantPlacementMode.nativeCode == i10) {
                    return instantPlacementMode;
                }
            }
            throw new FatalException(F.b((byte) 56, i10, "Unexpected value for native InstantPlacementMode, value="));
        }
    }

    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);

        final int nativeCode;

        LightEstimationMode(int i10) {
            this.nativeCode = i10;
        }

        static LightEstimationMode forNumber(int i10) {
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i10) {
                    return lightEstimationMode;
                }
            }
            throw new FatalException(F.b((byte) 55, i10, "Unexpected value for native LightEstimationMode, value="));
        }
    }

    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3);

        final int nativeCode;

        PlaneFindingMode(int i10) {
            this.nativeCode = i10;
        }

        static PlaneFindingMode forNumber(int i10) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i10) {
                    return planeFindingMode;
                }
            }
            throw new FatalException(F.b((byte) 52, i10, "Unexpected value for native PlaneFindingMode, value="));
        }
    }

    public enum SemanticMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        SemanticMode(int i10) {
            this.nativeCode = i10;
        }

        static SemanticMode forNumber(int i10) {
            for (SemanticMode semanticMode : values()) {
                if (semanticMode.nativeCode == i10) {
                    return semanticMode;
                }
            }
            throw new FatalException(F.b(BER.SEQUENCE, i10, "Unexpected value for native SemanticMode, value="));
        }
    }

    public enum StreetscapeGeometryMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        StreetscapeGeometryMode(int i10) {
            this.nativeCode = i10;
        }

        static StreetscapeGeometryMode forNumber(int i10) {
            for (StreetscapeGeometryMode streetscapeGeometryMode : values()) {
                if (streetscapeGeometryMode.nativeCode == i10) {
                    return streetscapeGeometryMode;
                }
            }
            throw new FatalException(F.b((byte) 59, i10, "Unexpected value for native StreetscapeGeometryMode, value="));
        }
    }

    public enum TextureUpdateMode {
        BIND_TO_TEXTURE_EXTERNAL_OES(0),
        EXPOSE_HARDWARE_BUFFER(1);

        final int nativeCode;

        TextureUpdateMode(int i10) {
            this.nativeCode = i10;
        }

        static TextureUpdateMode forNumber(int i10) {
            for (TextureUpdateMode textureUpdateMode : values()) {
                if (textureUpdateMode.nativeCode == i10) {
                    return textureUpdateMode;
                }
            }
            throw new FatalException(F.b((byte) 53, i10, "Unexpected value for native TextureUpdateMode, value="));
        }
    }

    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);

        final int nativeCode;

        UpdateMode(int i10) {
            this.nativeCode = i10;
        }

        static UpdateMode forNumber(int i10) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i10) {
                    return updateMode;
                }
            }
            throw new FatalException(F.b((byte) 46, i10, "Unexpected value for native UpdateMode, value="));
        }
    }

    protected Config() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeCreate(long j10);

    private static native void nativeDestroy(long j10, long j11);

    private native int nativeGetAugmentedFaceMode(long j10, long j11);

    private native long nativeGetAugmentedImageDatabase(long j10, long j11);

    private native int nativeGetCloudAnchorMode(long j10, long j11);

    private native int nativeGetDepthMode(long j10, long j11);

    private native int nativeGetFlashMode(long j10, long j11);

    private native int nativeGetFocusMode(long j10, long j11);

    private native int nativeGetGeospatialMode(long j10, long j11, long j12);

    private native int nativeGetImageStabilizationMode(long j10, long j11);

    private native int nativeGetInstantPlacementMode(long j10, long j11);

    private native int nativeGetLightEstimationMode(long j10, long j11);

    private native int nativeGetPlaneFindingMode(long j10, long j11);

    private native int nativeGetSemanticMode(long j10, long j11);

    private native int nativeGetStreetscapeGeometryMode(long j10, long j11, long j12);

    private native int nativeGetTextureUpdateMode(long j10, long j11);

    private native int nativeGetUpdateMode(long j10, long j11);

    private native void nativeSetAugmentedFaceMode(long j10, long j11, int i10);

    private native void nativeSetAugmentedImageDatabase(long j10, long j11, long j12);

    private native void nativeSetCloudAnchorMode(long j10, long j11, int i10);

    private native void nativeSetDepthMode(long j10, long j11, int i10);

    private native void nativeSetFlashMode(long j10, long j11, int i10);

    private native void nativeSetFocusMode(long j10, long j11, int i10);

    private native void nativeSetGeospatialMode(long j10, long j11, long j12, int i10);

    private native void nativeSetImageStabilizationMode(long j10, long j11, int i10);

    private native void nativeSetInstantPlacementMode(long j10, long j11, int i10);

    private native void nativeSetLightEstimationMode(long j10, long j11, int i10);

    private native void nativeSetPlaneFindingMode(long j10, long j11, int i10);

    private native void nativeSetSemanticMode(long j10, long j11, int i10);

    private native void nativeSetStreetscapeGeometryMode(long j10, long j11, long j12, int i10);

    private native void nativeSetTextureUpdateMode(long j10, long j11, int i10);

    private native void nativeSetUpdateMode(long j10, long j11, int i10);

    protected void finalize() throws Throwable {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthMode() {
        return DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FlashMode getFlashMode() {
        return FlashMode.forNumber(nativeGetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public GeospatialMode getGeospatialMode() {
        return GeospatialMode.forNumber(nativeGetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public ImageStabilizationMode getImageStabilizationMode() {
        return ImageStabilizationMode.forNumber(nativeGetImageStabilizationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementMode() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public SemanticMode getSemanticMode() {
        return SemanticMode.forNumber(nativeGetSemanticMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public StreetscapeGeometryMode getStreetscapeGeometryMode() {
        return StreetscapeGeometryMode.forNumber(nativeGetStreetscapeGeometryMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TextureUpdateMode getTextureUpdateMode() {
        return TextureUpdateMode.forNumber(nativeGetTextureUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        nativeSetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle, augmentedImageDatabase == null ? 0L : augmentedImageDatabase.nativeHandle);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setFlashMode(FlashMode flashMode) {
        nativeSetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle, flashMode.nativeCode);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    public Config setGeospatialMode(GeospatialMode geospatialMode) {
        nativeSetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, geospatialMode.nativeCode);
        return this;
    }

    public Config setImageStabilizationMode(ImageStabilizationMode imageStabilizationMode) {
        nativeSetImageStabilizationMode(this.session.nativeWrapperHandle, this.nativeHandle, imageStabilizationMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    public Config setSemanticMode(SemanticMode semanticMode) {
        nativeSetSemanticMode(this.session.nativeWrapperHandle, this.nativeHandle, semanticMode.nativeCode);
        return this;
    }

    public Config setStreetscapeGeometryMode(StreetscapeGeometryMode streetscapeGeometryMode) {
        nativeSetStreetscapeGeometryMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, streetscapeGeometryMode.nativeCode);
        return this;
    }

    public Config setTextureUpdateMode(TextureUpdateMode textureUpdateMode) {
        nativeSetTextureUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, textureUpdateMode.nativeCode);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }

    public Config(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    Config(Session session, long j10) {
        this.session = session;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
