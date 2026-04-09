.class final enum Lcom/google/ar/core/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum A:Lcom/google/ar/core/i;

.field public static final enum B:Lcom/google/ar/core/i;

.field public static final enum C:Lcom/google/ar/core/i;

.field public static final enum D:Lcom/google/ar/core/i;

.field public static final enum E:Lcom/google/ar/core/i;

.field public static final enum F:Lcom/google/ar/core/i;

.field private static final synthetic J:[Lcom/google/ar/core/i;

.field public static final enum a:Lcom/google/ar/core/i;

.field public static final enum b:Lcom/google/ar/core/i;

.field public static final enum c:Lcom/google/ar/core/i;

.field public static final enum d:Lcom/google/ar/core/i;

.field public static final enum e:Lcom/google/ar/core/i;

.field public static final enum f:Lcom/google/ar/core/i;

.field public static final enum g:Lcom/google/ar/core/i;

.field public static final enum h:Lcom/google/ar/core/i;

.field public static final enum i:Lcom/google/ar/core/i;

.field public static final enum j:Lcom/google/ar/core/i;

.field public static final enum k:Lcom/google/ar/core/i;

.field public static final enum l:Lcom/google/ar/core/i;

.field public static final enum m:Lcom/google/ar/core/i;

.field public static final enum n:Lcom/google/ar/core/i;

.field public static final enum o:Lcom/google/ar/core/i;

.field public static final enum p:Lcom/google/ar/core/i;

.field public static final enum q:Lcom/google/ar/core/i;

.field public static final enum r:Lcom/google/ar/core/i;

.field public static final enum s:Lcom/google/ar/core/i;

.field public static final enum t:Lcom/google/ar/core/i;

.field public static final enum u:Lcom/google/ar/core/i;

.field public static final enum v:Lcom/google/ar/core/i;

.field public static final enum w:Lcom/google/ar/core/i;

.field public static final enum x:Lcom/google/ar/core/i;

.field public static final enum y:Lcom/google/ar/core/i;

.field public static final enum z:Lcom/google/ar/core/i;


# instance fields
.field final G:I

.field final H:Ljava/lang/Class;

.field final I:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 43

    new-instance v1, Lcom/google/ar/core/i;

    move-object v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string/jumbo v4, "SUCCESS"

    invoke-direct {v1, v4, v2, v2, v3}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v1, Lcom/google/ar/core/i;->a:Lcom/google/ar/core/i;

    new-instance v2, Lcom/google/ar/core/i;

    move-object v1, v2

    const/4 v3, 0x1

    const/4 v4, -0x1

    const-string/jumbo v5, "ERROR_INVALID_ARGUMENT"

    const-class v6, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v5, v3, v4, v6}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v2, Lcom/google/ar/core/i;->b:Lcom/google/ar/core/i;

    new-instance v3, Lcom/google/ar/core/i;

    move-object v2, v3

    const/4 v4, 0x2

    const/4 v5, -0x2

    const-string/jumbo v6, "ERROR_FATAL"

    const-class v7, Lcom/google/ar/core/exceptions/FatalException;

    invoke-direct {v3, v6, v4, v5, v7}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/i;->c:Lcom/google/ar/core/i;

    new-instance v4, Lcom/google/ar/core/i;

    move-object v3, v4

    const/4 v5, 0x3

    const/4 v6, -0x3

    const-string/jumbo v7, "ERROR_SESSION_PAUSED"

    const-class v8, Lcom/google/ar/core/exceptions/SessionPausedException;

    invoke-direct {v4, v7, v5, v6, v8}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v4, Lcom/google/ar/core/i;->d:Lcom/google/ar/core/i;

    new-instance v5, Lcom/google/ar/core/i;

    move-object v4, v5

    const/4 v6, 0x4

    const/4 v7, -0x4

    const-string/jumbo v8, "ERROR_SESSION_NOT_PAUSED"

    const-class v9, Lcom/google/ar/core/exceptions/SessionNotPausedException;

    invoke-direct {v5, v8, v6, v7, v9}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/i;->e:Lcom/google/ar/core/i;

    new-instance v6, Lcom/google/ar/core/i;

    move-object v5, v6

    const/4 v7, 0x5

    const/4 v8, -0x5

    const-string/jumbo v9, "ERROR_NOT_TRACKING"

    const-class v10, Lcom/google/ar/core/exceptions/NotTrackingException;

    invoke-direct {v6, v9, v7, v8, v10}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v6, Lcom/google/ar/core/i;->f:Lcom/google/ar/core/i;

    new-instance v7, Lcom/google/ar/core/i;

    move-object v6, v7

    const/4 v8, 0x6

    const/4 v9, -0x6

    const-string/jumbo v10, "ERROR_TEXTURE_NOT_SET"

    const-class v11, Lcom/google/ar/core/exceptions/TextureNotSetException;

    invoke-direct {v7, v10, v8, v9, v11}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/i;->g:Lcom/google/ar/core/i;

    new-instance v8, Lcom/google/ar/core/i;

    move-object v7, v8

    const/4 v9, 0x7

    const/4 v10, -0x7

    const-string/jumbo v11, "ERROR_MISSING_GL_CONTEXT"

    const-class v12, Lcom/google/ar/core/exceptions/MissingGlContextException;

    invoke-direct {v8, v11, v9, v10, v12}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v8, Lcom/google/ar/core/i;->h:Lcom/google/ar/core/i;

    new-instance v9, Lcom/google/ar/core/i;

    move-object v8, v9

    const/4 v10, -0x8

    const-class v11, Lcom/google/ar/core/exceptions/UnsupportedConfigurationException;

    const-string/jumbo v12, "ERROR_UNSUPPORTED_CONFIGURATION"

    const/16 v13, 0x8

    invoke-direct {v9, v12, v13, v10, v11}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v9, Lcom/google/ar/core/i;->i:Lcom/google/ar/core/i;

    new-instance v10, Lcom/google/ar/core/i;

    move-object v9, v10

    const/16 v11, -0x15

    const-class v12, Lcom/google/ar/core/exceptions/FineLocationPermissionNotGrantedException;

    const-string/jumbo v13, "ERROR_FINE_LOCATION_PERMISSION_NOT_GRANTED"

    const/16 v14, 0x9

    invoke-direct {v10, v13, v14, v11, v12}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v10, Lcom/google/ar/core/i;->j:Lcom/google/ar/core/i;

    new-instance v11, Lcom/google/ar/core/i;

    move-object v10, v11

    const/16 v12, -0x16

    const-class v13, Lcom/google/ar/core/exceptions/GooglePlayServicesLocationLibraryNotLinkedException;

    const-string/jumbo v14, "ERROR_GOOGLE_PLAY_SERVICES_LOCATION_LIBRARY_NOT_LINKED"

    const/16 v15, 0xa

    invoke-direct {v11, v14, v15, v12, v13}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v11, Lcom/google/ar/core/i;->k:Lcom/google/ar/core/i;

    new-instance v12, Lcom/google/ar/core/i;

    move-object v11, v12

    const-class v20, Ljava/lang/SecurityException;

    const-string v21, "Camera permission is not granted"

    const-string/jumbo v17, "ERROR_CAMERA_PERMISSION_NOT_GRANTED"

    const/16 v18, 0xb

    const/16 v19, -0x9

    move-object/from16 v16, v12

    invoke-direct/range {v16 .. v21}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V

    sput-object v12, Lcom/google/ar/core/i;->l:Lcom/google/ar/core/i;

    new-instance v13, Lcom/google/ar/core/i;

    move-object v12, v13

    const/16 v14, -0xa

    const-class v15, Lcom/google/ar/core/exceptions/DeadlineExceededException;

    move-object/from16 v32, v0

    const-string/jumbo v0, "ERROR_DEADLINE_EXCEEDED"

    move-object/from16 v33, v1

    const/16 v1, 0xc

    invoke-direct {v13, v0, v1, v14, v15}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v13, Lcom/google/ar/core/i;->m:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object v13, v0

    const/16 v1, -0xb

    const-class v14, Lcom/google/ar/core/exceptions/ResourceExhaustedException;

    const-string/jumbo v15, "ERROR_RESOURCE_EXHAUSTED"

    move-object/from16 v34, v2

    const/16 v2, 0xd

    invoke-direct {v0, v15, v2, v1, v14}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->n:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object v14, v0

    const/16 v1, -0xc

    const-class v2, Lcom/google/ar/core/exceptions/NotYetAvailableException;

    const-string/jumbo v15, "ERROR_NOT_YET_AVAILABLE"

    move-object/from16 v35, v3

    const/16 v3, 0xe

    invoke-direct {v0, v15, v3, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->o:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object v15, v0

    const/16 v1, -0xd

    const-class v2, Lcom/google/ar/core/exceptions/CameraNotAvailableException;

    const-string/jumbo v3, "ERROR_CAMERA_NOT_AVAILABLE"

    move-object/from16 v36, v4

    const/16 v4, 0xf

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->p:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v16, v0

    const/16 v1, -0x10

    const-class v2, Lcom/google/ar/core/exceptions/AnchorNotSupportedForHostingException;

    const-string/jumbo v3, "ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING"

    const/16 v4, 0x10

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->q:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v17, v0

    const/16 v1, -0x11

    const-class v2, Lcom/google/ar/core/exceptions/ImageInsufficientQualityException;

    const-string/jumbo v3, "ERROR_IMAGE_INSUFFICIENT_QUALITY"

    const/16 v4, 0x11

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->r:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v18, v0

    const/16 v1, -0x12

    const-class v2, Lcom/google/ar/core/exceptions/DataInvalidFormatException;

    const-string/jumbo v3, "ERROR_DATA_INVALID_FORMAT"

    const/16 v4, 0x12

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->s:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v19, v0

    const/16 v1, -0x13

    const-class v2, Lcom/google/ar/core/exceptions/DataUnsupportedVersionException;

    const-string/jumbo v3, "ERROR_DATA_UNSUPPORTED_VERSION"

    const/16 v4, 0x13

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->t:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v20, v0

    const/16 v1, -0x14

    const-class v2, Ljava/lang/IllegalStateException;

    const-string/jumbo v3, "ERROR_ILLEGAL_STATE"

    const/16 v4, 0x14

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->u:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v21, v0

    const/16 v1, -0x17

    const-class v2, Lcom/google/ar/core/exceptions/RecordingFailedException;

    const-string/jumbo v3, "ERROR_RECORDING_FAILED"

    const/16 v4, 0x15

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->v:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v22, v0

    const/16 v1, -0x18

    const-class v2, Lcom/google/ar/core/exceptions/PlaybackFailedException;

    const-string/jumbo v3, "ERROR_PLAYBACK_FAILED"

    const/16 v4, 0x16

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->w:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v23, v0

    const/16 v1, -0x19

    const-class v2, Lcom/google/ar/core/exceptions/SessionUnsupportedException;

    const-string/jumbo v3, "ERROR_SESSION_UNSUPPORTED"

    const/16 v4, 0x17

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->x:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v24, v0

    const/16 v1, -0x1a

    const-class v2, Lcom/google/ar/core/exceptions/MetadataNotFoundException;

    const-string/jumbo v3, "ERROR_METADATA_NOT_FOUND"

    const/16 v4, 0x18

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->y:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v25, v0

    const/16 v1, -0xe

    const-class v2, Lcom/google/ar/core/exceptions/CloudAnchorsNotConfiguredException;

    const-string/jumbo v3, "ERROR_CLOUD_ANCHORS_NOT_CONFIGURED"

    const/16 v4, 0x19

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->z:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v26, v0

    const-class v41, Ljava/lang/SecurityException;

    const-string/jumbo v42, "Internet permission is not granted"

    const-string/jumbo v38, "ERROR_INTERNET_PERMISSION_NOT_GRANTED"

    const/16 v39, 0x1a

    const/16 v40, -0xf

    move-object/from16 v37, v0

    invoke-direct/range {v37 .. v42}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/google/ar/core/i;->A:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v27, v0

    const/16 v1, -0x64

    const-class v2, Lcom/google/ar/core/exceptions/UnavailableArcoreNotInstalledException;

    const-string/jumbo v3, "UNAVAILABLE_ARCORE_NOT_INSTALLED"

    const/16 v4, 0x1b

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->B:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v28, v0

    const/16 v1, -0x65

    const-class v2, Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException;

    const-string/jumbo v3, "UNAVAILABLE_DEVICE_NOT_COMPATIBLE"

    const/16 v4, 0x1c

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->C:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v29, v0

    const/16 v1, -0x67

    const-class v2, Lcom/google/ar/core/exceptions/UnavailableApkTooOldException;

    const-string/jumbo v3, "UNAVAILABLE_APK_TOO_OLD"

    const/16 v4, 0x1d

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->D:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v30, v0

    const/16 v1, -0x68

    const-class v2, Lcom/google/ar/core/exceptions/UnavailableSdkTooOldException;

    const-string/jumbo v3, "UNAVAILABLE_SDK_TOO_OLD"

    const/16 v4, 0x1e

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->E:Lcom/google/ar/core/i;

    new-instance v0, Lcom/google/ar/core/i;

    move-object/from16 v31, v0

    const/16 v1, -0x69

    const-class v2, Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException;

    const-string/jumbo v3, "UNAVAILABLE_USER_DECLINED_INSTALLATION"

    const/16 v4, 0x1f

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/i;->F:Lcom/google/ar/core/i;

    move-object/from16 v0, v32

    move-object/from16 v1, v33

    move-object/from16 v2, v34

    move-object/from16 v3, v35

    move-object/from16 v4, v36

    filled-new-array/range {v0 .. v31}, [Lcom/google/ar/core/i;

    move-result-object v0

    sput-object v0, Lcom/google/ar/core/i;->J:[Lcom/google/ar/core/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/google/ar/core/i;-><init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/ar/core/i;->G:I

    iput-object p4, p0, Lcom/google/ar/core/i;->H:Ljava/lang/Class;

    iput-object p5, p0, Lcom/google/ar/core/i;->I:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/ar/core/i;
    .locals 1

    sget-object v0, Lcom/google/ar/core/i;->J:[Lcom/google/ar/core/i;

    invoke-virtual {v0}, [Lcom/google/ar/core/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/ar/core/i;

    return-object v0
.end method
