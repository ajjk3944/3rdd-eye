.class public final Lq52;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lm52;
.implements Lc62;


# instance fields
.field public final f:Lag2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le51;)V
    .locals 17

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lhg4;->C:Lhg4;

    .line 5
    .line 6
    iget-object v0, v0, Lhg4;->d:Lsd2;

    .line 7
    .line 8
    new-instance v2, Lzq;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v2, v0, v0, v0}, Lzq;-><init>(III)V

    .line 12
    .line 13
    .line 14
    new-instance v11, Lcx1;

    .line 15
    .line 16
    invoke-direct {v11}, Lcx1;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v15, 0x0

    .line 20
    const/16 v16, 0x0

    .line 21
    .line 22
    const-string v3, ""

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v14, 0x0

    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    move-object/from16 v8, p2

    .line 36
    .line 37
    invoke-static/range {v1 .. v16}, Lsd2;->b(Landroid/content/Context;Lzq;Ljava/lang/String;ZZLvs1;Lf02;Le51;Lkf3;Ll92;Lcx1;La83;Lc83;Lpz2;Lm83;Lmv2;)Lag2;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object/from16 v1, p0

    .line 42
    .line 43
    iput-object v0, v1, Lq52;->f:Lag2;

    .line 44
    .line 45
    invoke-interface {v0}, Lag2;->p0()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-virtual {v0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static final e(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object v0, Lsv1;->f:Lsv1;

    .line 2
    .line 3
    iget-object v0, v0, Lsv1;->a:Lj63;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const-string v0, "runOnUiThread > the UI thread is the main thread, the runnable will be run now"

    .line 16
    .line 17
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, "runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue"

    .line 25
    .line 26
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Llf4;->l:Li63;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    const-string p0, "runOnUiThread > the runnable could not be placed to the message queue"

    .line 38
    .line 39
    invoke-static {p0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/String;Ly32;)V
    .locals 2

    .line 1
    new-instance v0, Lvg0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lq52;->f:Lag2;

    .line 9
    .line 10
    invoke-interface {p2, p1, v0}, Lag2;->E(Ljava/lang/String;Lvg0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "invokeJavascript on adWebView from js"

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lo52;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lo52;-><init>(Lq52;Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lq52;->e(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p(Ljava/lang/String;Ly32;)V
    .locals 1

    .line 1
    new-instance v0, Ln52;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2}, Ln52;-><init>(Lq52;Ly32;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lq52;->f:Lag2;

    .line 7
    .line 8
    invoke-interface {p2, p1, v0}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
