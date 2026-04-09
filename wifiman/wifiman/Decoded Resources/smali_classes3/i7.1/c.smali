.class public final Li7/c;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Li7/a;


# instance fields
.field private final a:Le7/i;

.field private b:Lm7/e;

.field private final c:Le7/k;

.field private final d:Li7/f;

.field private e:Le7/d;

.field private f:Le7/d;

.field private g:Le7/d;

.field private h:Lcom/google/ar/core/Session;

.field private i:Z

.field private final j:Lcom/google/ar/core/Config$DepthMode;

.field private k:Z

.field private l:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setPreserveEGLContextOnPause(Z)V

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/16 v3, 0x8

    const/16 v4, 0x8

    const/16 v5, 0x8

    const/16 v6, 0x8

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, Landroid/opengl/GLSurfaceView;->setEGLConfigChooser(IIIIII)V

    invoke-virtual {p0, p0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v0, Le7/i;

    invoke-direct {v0}, Le7/i;-><init>()V

    iput-object v0, p0, Li7/c;->a:Le7/i;

    new-instance v0, Le7/k;

    invoke-direct {v0, p1}, Le7/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Li7/c;->c:Le7/k;

    new-instance p1, Li7/f;

    invoke-direct {p1}, Li7/f;-><init>()V

    iput-object p1, p0, Li7/c;->d:Li7/f;

    sget-object p1, Lcom/google/ar/core/Config$DepthMode;->RAW_DEPTH_ONLY:Lcom/google/ar/core/Config$DepthMode;

    iput-object p1, p0, Li7/c;->j:Lcom/google/ar/core/Config$DepthMode;

    return-void
.end method

.method private final a()V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "Closing ArCore session"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/core/Session;->close()V

    :cond_0
    iput-object v2, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    const/4 v0, 0x0

    iput-boolean v0, p0, Li7/c;->i:Z

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Lcom/google/ar/core/TrackingState;->STOPPED:Lcom/google/ar/core/TrackingState;

    sget-object v2, Lcom/google/ar/core/TrackingFailureReason;->NONE:Lcom/google/ar/core/TrackingFailureReason;

    invoke-virtual {v0, v1, v2}, Li7/f;->l(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$b;->a:Le7/f$b;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void
.end method

.method private final b()V
    .locals 5

    const-string v0, "ARSession creation error"

    sget-object v1, Le7/b;->Companion:Le7/b$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Le7/b$a;->e(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const-string/jumbo v0, "Skipped ArCore session creation since arcore unavailable"

    invoke-static {v0, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    const/4 v4, 0x4

    if-nez v1, :cond_1

    const-string v1, "Creating arcore session"

    invoke-static {v1, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :try_start_0
    new-instance v1, Lcom/google/ar/core/Session;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/ar/core/Session;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Li7/c;->h:Lcom/google/ar/core/Session;
    :try_end_0
    .catch Lcom/google/ar/core/exceptions/UnavailableArcoreNotInstalledException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/google/ar/core/exceptions/UnavailableApkTooOldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/ar/core/exceptions/UnavailableSdkTooOldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/ar/core/exceptions/FatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_4

    :goto_0
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$a$a;->a:Le7/f$a$a;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void

    :goto_1
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$a$c;->a:Le7/f$a$c;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void

    :goto_2
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$a$c;->a:Le7/f$a$c;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void

    :goto_3
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$a$b;->a:Le7/f$a$b;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void

    :goto_4
    invoke-static {v0, v1, v3, v4, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$a$b;->a:Le7/f$a$b;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void

    :cond_1
    :goto_5
    :try_start_1
    iget-object v0, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Li7/c;->d(Lcom/google/ar/core/Session;)V

    iget-object v0, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/ar/core/Session;->resume()V
    :try_end_1
    .catch Lcom/google/ar/core/exceptions/CameraNotAvailableException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lcom/google/ar/core/exceptions/FatalException; {:try_start_1 .. :try_end_1} :catch_5

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Le7/f$c;->a:Le7/f$c;

    invoke-virtual {v0, v1}, Li7/f;->k(Le7/f;)V

    return-void

    :catch_5
    move-exception v0

    const-string/jumbo v1, "Failed top start ar core floorplan"

    invoke-static {v1, v0, v3, v4, v3}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iput-object v3, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    return-void

    :catch_6
    iput-object v3, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    return-void
.end method

.method private final c()V
    .locals 3

    iget-object v0, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/ar/core/Session;->pause()V

    iget-object v0, p0, Li7/c;->d:Li7/f;

    sget-object v1, Lcom/google/ar/core/TrackingState;->PAUSED:Lcom/google/ar/core/TrackingState;

    sget-object v2, Lcom/google/ar/core/TrackingFailureReason;->NONE:Lcom/google/ar/core/TrackingFailureReason;

    invoke-virtual {v0, v1, v2}, Li7/f;->l(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)V

    :cond_0
    return-void
.end method

.method private final d(Lcom/google/ar/core/Session;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    const-string/jumbo v1, "getConfig(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v1

    sget-object v2, Lcom/google/ar/core/Config$UpdateMode;->BLOCKING:Lcom/google/ar/core/Config$UpdateMode;

    invoke-virtual {v1, v2}, Lcom/google/ar/core/Config;->setUpdateMode(Lcom/google/ar/core/Config$UpdateMode;)Lcom/google/ar/core/Config;

    invoke-virtual {p1}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v1

    sget-object v2, Lcom/google/ar/core/Config$FocusMode;->AUTO:Lcom/google/ar/core/Config$FocusMode;

    invoke-virtual {v1, v2}, Lcom/google/ar/core/Config;->setFocusMode(Lcom/google/ar/core/Config$FocusMode;)Lcom/google/ar/core/Config;

    invoke-direct {p0, p1}, Li7/c;->e(Lcom/google/ar/core/Session;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Li7/c;->j:Lcom/google/ar/core/Config$DepthMode;

    invoke-virtual {v0, v1}, Lcom/google/ar/core/Config;->setDepthMode(Lcom/google/ar/core/Config$DepthMode;)Lcom/google/ar/core/Config;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/ar/core/Config$DepthMode;->DISABLED:Lcom/google/ar/core/Config$DepthMode;

    invoke-virtual {v0, v1}, Lcom/google/ar/core/Config;->setDepthMode(Lcom/google/ar/core/Config$DepthMode;)Lcom/google/ar/core/Config;

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/ar/core/Session;->configure(Lcom/google/ar/core/Config;)V

    return-void
.end method

.method private final e(Lcom/google/ar/core/Session;)Z
    .locals 1

    iget-object v0, p0, Li7/c;->j:Lcom/google/ar/core/Config$DepthMode;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/Session;->isDepthModeSupported(Lcom/google/ar/core/Config$DepthMode;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final f()V
    .locals 3

    iget-boolean v0, p0, Li7/c;->k:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li7/c;->c:Le7/k;

    invoke-virtual {v0}, Le7/k;->b()V

    invoke-direct {p0}, Li7/c;->c()V

    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Li7/c;->k:Z

    const-string v0, "ArCore view paused"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Z)V
    .locals 2

    iget-boolean v0, p0, Li7/c;->k:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li7/c;->c:Le7/k;

    invoke-virtual {v0}, Le7/k;->c()V

    if-eqz p1, :cond_1

    invoke-direct {p0}, Li7/c;->b()V

    :cond_1
    invoke-virtual {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Li7/c;->k:Z

    const-string p1, "ArCore view resumed"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final getController()Li7/b;
    .locals 1

    iget-object v0, p0, Li7/c;->d:Li7/f;

    return-object v0
.end method

.method public final getDisplayRotationHelper$ar_floorplan_release()Le7/k;
    .locals 1

    iget-object v0, p0, Li7/c;->c:Le7/k;

    return-object v0
.end method

.method public final getFrameObjectDetector$ar_floorplan_release()Le7/d;
    .locals 1

    iget-object v0, p0, Li7/c;->g:Le7/d;

    return-object v0
.end method

.method public final getFrameSpacePositionProcessor$ar_floorplan_release()Le7/d;
    .locals 1

    iget-object v0, p0, Li7/c;->f:Le7/d;

    return-object v0
.end method

.method public final getFrameSpaceProcessor$ar_floorplan_release()Le7/d;
    .locals 1

    iget-object v0, p0, Li7/c;->e:Le7/d;

    return-object v0
.end method

.method public final getTilesRenderer()Lm7/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm7/e;"
        }
    .end annotation

    iget-object v0, p0, Li7/c;->b:Lm7/e;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    invoke-direct {p0}, Li7/c;->a()V

    return-void
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 6

    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    iget-object v0, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    if-eqz v0, :cond_4

    iget-boolean v1, p0, Li7/c;->i:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Li7/c;->a:Le7/i;

    invoke-virtual {v1}, Le7/i;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/ar/core/Session;->setCameraTextureName(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Li7/c;->i:Z

    :cond_0
    iget-object v0, p0, Li7/c;->c:Le7/k;

    iget-object v1, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Le7/k;->f(Lcom/google/ar/core/Session;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/google/ar/core/Session;->update()Lcom/google/ar/core/Frame;

    move-result-object v1
    :try_end_0
    .catch Lcom/google/ar/core/exceptions/CameraNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/ar/core/exceptions/FatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/ar/core/exceptions/SessionPausedException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    :catch_2
    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/ar/core/Frame;->getCamera()Lcom/google/ar/core/Camera;

    move-result-object v0

    const-string/jumbo v2, "getCamera(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v2}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v2

    invoke-interface {v2}, Lcom/ubnt/usurvey/a$b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/usurvey/a;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Li7/c;->a:Le7/i;

    invoke-virtual {v2, v1}, Le7/i;->e(Lcom/google/ar/core/Frame;)V

    :cond_1
    iget-object v2, p0, Li7/c;->d:Li7/f;

    invoke-virtual {v0}, Lcom/google/ar/core/Camera;->getTrackingState()Lcom/google/ar/core/TrackingState;

    move-result-object v3

    const-string/jumbo v4, "getTrackingState(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/ar/core/Camera;->getTrackingFailureReason()Lcom/google/ar/core/TrackingFailureReason;

    move-result-object v0

    const-string/jumbo v4, "getTrackingFailureReason(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v0}, Li7/f;->l(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)V

    invoke-virtual {v1}, Lcom/google/ar/core/Frame;->getTimestamp()J

    move-result-wide v2

    iget-wide v4, p0, Li7/c;->l:J

    cmp-long v0, v2, v4

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lcom/google/ar/core/Frame;->getTimestamp()J

    move-result-wide v2

    iput-wide v2, p0, Li7/c;->l:J

    iget-object v0, p0, Li7/c;->c:Le7/k;

    iget-object v2, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/google/ar/core/Session;->getCameraConfig()Lcom/google/ar/core/CameraConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/ar/core/CameraConfig;->getCameraId()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "getCameraId(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Le7/k;->a(Ljava/lang/String;)I

    move-result v0

    iget-object v2, p0, Li7/c;->f:Le7/d;

    if-eqz v2, :cond_2

    invoke-interface {v2, v1, v0}, Le7/d;->a(Lcom/google/ar/core/Frame;I)V

    :cond_2
    iget-object v2, p0, Li7/c;->h:Lcom/google/ar/core/Session;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v2}, Li7/c;->e(Lcom/google/ar/core/Session;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Li7/c;->e:Le7/d;

    if-eqz v2, :cond_3

    invoke-interface {v2, v1, v0}, Le7/d;->a(Lcom/google/ar/core/Frame;I)V

    :cond_3
    iget-object v2, p0, Li7/c;->g:Le7/d;

    if-eqz v2, :cond_4

    invoke-interface {v2, v1, v0}, Le7/d;->a(Lcom/google/ar/core/Frame;I)V

    goto :goto_3

    :goto_1
    const-string/jumbo v2, "Fatal exception during onDrawFrame"

    invoke-static {v2, p1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-direct {p0}, Li7/c;->a()V

    iget-object p1, p0, Li7/c;->d:Li7/f;

    sget-object v0, Le7/f$a$a;->a:Le7/f$a$a;

    invoke-virtual {p1, v0}, Li7/f;->k(Le7/f;)V

    return-void

    :goto_2
    const-string v2, "Camera not available during onDrawFrame"

    invoke-static {v2, p1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_4
    :goto_3
    iget-object v0, p0, Li7/c;->b:Lm7/e;

    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, Landroid/opengl/GLSurfaceView$Renderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    :cond_5
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    iget-object v0, p0, Li7/c;->c:Le7/k;

    invoke-virtual {v0, p2, p3}, Le7/k;->d(II)V

    iget-object v0, p0, Li7/c;->b:Lm7/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Landroid/opengl/GLSurfaceView$Renderer;->onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 3

    const-string/jumbo v0, "Failed to enable blending"

    const-string/jumbo v1, "glEnable"

    invoke-static {v0, v1}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Li7/c;->a:Le7/i;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le7/i;->c(Landroid/content/Context;)V

    iget-object v0, p0, Li7/c;->b:Lm7/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroid/opengl/GLSurfaceView$Renderer;->onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V

    :cond_0
    return-void
.end method

.method public final setFrameObjectDetector$ar_floorplan_release(Le7/d;)V
    .locals 0

    iput-object p1, p0, Li7/c;->g:Le7/d;

    return-void
.end method

.method public final setFrameSpacePositionProcessor$ar_floorplan_release(Le7/d;)V
    .locals 0

    iput-object p1, p0, Li7/c;->f:Le7/d;

    return-void
.end method

.method public final setFrameSpaceProcessor$ar_floorplan_release(Le7/d;)V
    .locals 0

    iput-object p1, p0, Li7/c;->e:Le7/d;

    return-void
.end method

.method public final setTilesRenderer(Lm7/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/e;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Li7/c;->b:Lm7/e;

    return-void
.end method
