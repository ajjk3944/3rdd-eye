.class public final Lsq0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lti0;
.implements Ld71;
.implements Lm2;
.implements Lpm0;
.implements Lh81;
.implements Lzb3;
.implements Lqn1;
.implements Ldp2;
.implements Loy2;
.implements Lo93;
.implements Lch3;
.implements Ll34;


# static fields
.field public static h:Lsq0;

.field public static final i:Ltq0;

.field public static final j:Ljava/lang/Object;

.field public static volatile k:Lsq0;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ltq0;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, Ltq0;-><init>(IIIZZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lsq0;->i:Ltq0;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lsq0;->j:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lsq0;->f:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsq0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lsq0;->f:I

    iput-object p2, p0, Lsq0;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lsq0;->f:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Context can not be null"

    invoke-static {p1, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsq0;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lsq0;->f:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lsq0;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lth2;)V
    .locals 8

    const/16 v0, 0xd

    iput v0, p0, Lsq0;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lth2;->S:Lrh2;

    .line 3
    new-instance v4, Lri2;

    const/16 v1, 0x12

    invoke-direct {v4, v0, v1}, Lri2;-><init>(Lga4;I)V

    .line 4
    iget-object v2, p1, Lth2;->g:Lhh2;

    iget-object v3, p1, Lth2;->R:Loh2;

    iget-object v5, p1, Lth2;->T:Lba4;

    iget-object v6, p1, Lth2;->t:Lba4;

    .line 5
    new-instance v1, Lic2;

    const/16 v7, 0x9

    invoke-direct/range {v1 .. v7}, Lic2;-><init>(Lga4;Lga4;Lga4;Lga4;Lga4;I)V

    .line 6
    iput-object v1, p0, Lsq0;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx12;)V
    .locals 6

    const/16 v0, 0xc

    iput v0, p0, Lsq0;->f:I

    .line 10
    const-string v0, ""

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lsq0;->g:Ljava/lang/Object;

    .line 13
    :try_start_0
    invoke-interface {p1}, Lx12;->d()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 14
    invoke-static {v0, v1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    :goto_0
    :try_start_1
    invoke-interface {p1}, Lx12;->h()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    :goto_1
    if-ge v2, v1, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    .line 16
    instance-of v4, v3, Landroid/os/IBinder;

    if-eqz v4, :cond_1

    .line 17
    check-cast v3, Landroid/os/IBinder;

    invoke-static {v3}, Lp12;->B3(Landroid/os/IBinder;)Lb22;

    move-result-object v3

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_0

    iget-object v4, p0, Lsq0;->g:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    new-instance v5, Ll92;

    .line 18
    invoke-direct {v5, v3}, Ll92;-><init>(Lb22;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 19
    :goto_3
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public static declared-synchronized k()Lsq0;
    .locals 3

    .line 1
    const-class v0, Lsq0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lsq0;->h:Lsq0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lsq0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lsq0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lsq0;->h:Lsq0;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    sget-object v1, Lsq0;->h:Lsq0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v1
.end method

.method public static n()Lsq0;
    .locals 2

    .line 1
    sget-object v0, Lsq0;->k:Lsq0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lsq0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lsq0;->k:Lsq0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lsq0;

    .line 13
    .line 14
    invoke-direct {v1}, Lsq0;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lsq0;->k:Lsq0;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lsq0;->k:Lsq0;

    .line 27
    .line 28
    invoke-static {v0}, Lou1;->j(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static p(Lyk3;)Lsq0;
    .locals 3

    .line 1
    new-instance v0, Lsq0;

    .line 2
    .line 3
    new-instance v1, Lof3;

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    invoke-direct {v1, v2, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/16 p0, 0x15

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public B(Landroid/view/View;Lo91;)Lo91;
    .locals 2

    .line 1
    iget-object p1, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    iget-object v1, p1, Lcom/google/android/material/appbar/AppBarLayout;->l:Lo91;

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iput-object v0, p1, Lcom/google/android/material/appbar/AppBarLayout;->l:Lo91;

    .line 23
    .line 24
    iget-object v0, p1, Lcom/google/android/material/appbar/AppBarLayout;->B:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-lez v0, :cond_1

    .line 34
    .line 35
    move v0, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_1
    xor-int/2addr v0, v1

    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-object p2
.end method

.method public synthetic S(JLkz2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljj1;

    .line 4
    .line 5
    iget-object v0, v0, Ljj1;->I:[Ljg1;

    .line 6
    .line 7
    invoke-static {p1, p2, p3, v0}, Lzt0;->B(JLkz2;[Ljg1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    return-wide v0
.end method

.method public b()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    check-cast v0, Lug4;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 1
    invoke-static {p1, v0}, Ljz2;->f(Landroid/database/sqlite/SQLiteDatabase;Lug4;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsq0;->f:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll42;

    .line 2
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    check-cast v0, Lta2;

    invoke-interface {p1, v0}, Ll42;->T(Lta2;)V

    return-void

    .line 3
    :pswitch_0
    check-cast p1, Lbn2;

    .line 4
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    check-cast v0, Lnx2;

    invoke-interface {p1, v0}, Lbn2;->s(Lnx2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 1

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->createWebView(Landroid/webkit/WebView;)Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lyb;->e(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 16
    .line 17
    return-object p1
.end method

.method public declared-synchronized d()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lch3;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lch3;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public e(Lfa2;)Ln70;
    .locals 5

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Liy2;

    .line 4
    .line 5
    iget-object v1, v0, Lfy2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget v2, v0, Liy2;->m:I

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x2

    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    if-eq v2, v4, :cond_0

    .line 15
    .line 16
    new-instance p1, Lmy2;

    .line 17
    .line 18
    invoke-direct {p1, v4}, Lhx2;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lpu1;->B(Ljava/lang/Throwable;)Lkq3;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    monitor-exit v1

    .line 26
    return-object p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-boolean v2, v0, Lfy2;->h:Z

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget-object p1, v0, Lfy2;->f:Lpd2;

    .line 34
    .line 35
    monitor-exit v1

    .line 36
    return-object p1

    .line 37
    :cond_1
    iput v4, v0, Liy2;->m:I

    .line 38
    .line 39
    iput-boolean v3, v0, Lfy2;->h:Z

    .line 40
    .line 41
    iput-object p1, v0, Lfy2;->j:Lfa2;

    .line 42
    .line 43
    iget-object p1, v0, Lfy2;->k:Lvw1;

    .line 44
    .line 45
    invoke-virtual {p1}, Lw9;->n()V

    .line 46
    .line 47
    .line 48
    iget-object p1, v0, Lfy2;->f:Lpd2;

    .line 49
    .line 50
    new-instance v2, Lgy2;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-direct {v2, v0, v3}, Lgy2;-><init>(Liy2;I)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lmd2;->g:Lld2;

    .line 57
    .line 58
    iget-object v3, p1, Lpd2;->f:Lwq3;

    .line 59
    .line 60
    invoke-virtual {v3, v2, v0}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 61
    .line 62
    .line 63
    monitor-exit v1

    .line 64
    return-object p1

    .line 65
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lxw;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v3, v2, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/String;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    new-array p1, p1, [I

    .line 34
    .line 35
    move v3, v2

    .line 36
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-ge v3, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    move v4, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const/4 v4, -0x1

    .line 57
    :goto_1
    aput v4, p1, v3

    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object p1, v0, Lxw;->C:Ljava/util/ArrayDeque;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Luw;

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    iget-object p1, p1, Luw;->f:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v0, v0, Lxw;->c:Lp21;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lp21;->j(Ljava/lang/String;)Liw;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public g([Ljava/security/MessageDigest;JI)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    long-to-int p2, p2

    .line 7
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 8
    .line 9
    .line 10
    add-int/2addr p2, p4

    .line 11
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    array-length p3, p1

    .line 20
    const/4 p4, 0x0

    .line 21
    move v0, p4

    .line 22
    :goto_0
    if-ge v0, p3, :cond_0

    .line 23
    .line 24
    aget-object v1, p1, v0

    .line 25
    .line 26
    invoke-virtual {p2, p4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update(Ljava/nio/ByteBuffer;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
.end method

.method public getProfileStore()Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getProfileStore()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lyb;->e(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lyb;->e(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public declared-synchronized h()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lch3;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lch3;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public i(Landroid/view/View;Lo91;Le71;)Lo91;
    .locals 4

    .line 1
    iget-object p1, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 4
    .line 5
    iget-boolean p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->o0:Z

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Lo91;->a()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iput p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->u0:I

    .line 14
    .line 15
    :cond_0
    iget-boolean p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->p0:Z

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    iget p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->w0:I

    .line 22
    .line 23
    invoke-virtual {p2}, Lo91;->b()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eq p3, v2, :cond_1

    .line 28
    .line 29
    move p3, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move p3, v1

    .line 32
    :goto_0
    invoke-virtual {p2}, Lo91;->b()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput v2, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->w0:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move p3, v1

    .line 40
    :goto_1
    iget-boolean v2, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->q0:Z

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iget v2, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->v0:I

    .line 45
    .line 46
    invoke-virtual {p2}, Lo91;->c()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eq v2, v3, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v0, v1

    .line 54
    :goto_2
    invoke-virtual {p2}, Lo91;->c()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->v0:I

    .line 59
    .line 60
    move v1, v0

    .line 61
    :cond_4
    if-nez p3, :cond_6

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    return-object p2

    .line 67
    :cond_6
    :goto_3
    iget-object p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->f0:Landroid/animation/AnimatorSet;

    .line 68
    .line 69
    if-eqz p3, :cond_7

    .line 70
    .line 71
    invoke-virtual {p3}, Landroid/animation/Animator;->cancel()V

    .line 72
    .line 73
    .line 74
    :cond_7
    iget-object p3, p1, Lcom/google/android/material/bottomappbar/BottomAppBar;->e0:Landroid/animation/AnimatorSet;

    .line 75
    .line 76
    if-eqz p3, :cond_8

    .line 77
    .line 78
    invoke-virtual {p3}, Landroid/animation/Animator;->cancel()V

    .line 79
    .line 80
    .line 81
    :cond_8
    invoke-virtual {p1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->H()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/google/android/material/bottomappbar/BottomAppBar;->G()V

    .line 85
    .line 86
    .line 87
    return-object p2
.end method

.method public j(Lck;)Lck;
    .locals 2

    .line 1
    instance-of v0, p1, Lfp0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, Li3;

    .line 7
    .line 8
    iget-object v1, p0, Lsq0;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lnc0;

    .line 11
    .line 12
    invoke-virtual {v1}, Lnc0;->j()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    neg-float v1, v1

    .line 17
    invoke-direct {v0, v1, p1}, Li3;-><init>(FLck;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public l(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "AndroidOpenSSL"

    .line 2
    .line 3
    const-string v1, "Conscrypt"

    .line 4
    .line 5
    const-string v2, "GmsCore_OpenSSL"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    const/4 v4, 0x3

    .line 19
    if-ge v3, v4, :cond_1

    .line 20
    .line 21
    aget-object v4, v0, v3

    .line 22
    .line 23
    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v3, 0x0

    .line 40
    :cond_2
    :goto_1
    if-ge v2, v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    check-cast v4, Ljava/security/Provider;

    .line 49
    .line 50
    :try_start_0
    iget-object v5, p0, Lsq0;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, Lo34;

    .line 53
    .line 54
    invoke-interface {v5, p1, v4}, Lo34;->d(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-object p1

    .line 59
    :catch_0
    move-exception v4

    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    move-object v3, v4

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 65
    .line 66
    const-string v0, "No good Provider found."

    .line 67
    .line 68
    invoke-direct {p1, v0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public declared-synchronized m(Landroid/view/View;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lch3;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lch3;->m(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public o(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    instance-of v1, p2, Lud4;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/content/ServiceConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {p1, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    :goto_0
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_0
    :try_start_2
    invoke-virtual {p1, p2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_2 .. :try_end_2} :catch_1

    .line 36
    .line 37
    .line 38
    :catch_1
    return-void
.end method

.method public q(IJLqb3;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "action"

    .line 10
    .line 11
    const-string v2, "start_preload"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "sp_ts"

    .line 17
    .line 18
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {v0, v1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p2, "ad_format"

    .line 26
    .line 27
    invoke-virtual {p4}, Lqb3;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p2, "ad_unit_id"

    .line 35
    .line 36
    iget-object p3, p4, Lqb3;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p2, "pid"

    .line 42
    .line 43
    iget-object p3, p4, Lqb3;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string p2, "max_ads"

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string p1, "pv"

    .line 58
    .line 59
    invoke-virtual {v0, p1, p5}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Llv2;->m()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public r(Ljava/util/EnumMap;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "action"

    .line 10
    .line 11
    const-string v2, "start_preload"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "sp_ts"

    .line 17
    .line 18
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {v0, v1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p2, "pv"

    .line 26
    .line 27
    const-string p3, "1"

    .line 28
    .line 29
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/EnumMap;->keySet()Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    check-cast p3, Ls2;

    .line 51
    .line 52
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1, p3}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    check-cast p3, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    const-string v2, "_count"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v0}, Llv2;->m()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public s(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v3, "com.google.android.gms"

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v1, v2}, Lzj0;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    const/high16 v3, 0x200000

    .line 33
    .line 34
    and-int/2addr v1, v3

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    return v2

    .line 38
    :catch_0
    :cond_1
    :goto_0
    instance-of v1, p4, Lud4;

    .line 39
    .line 40
    const/16 v3, 0x1d

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-nez v1, :cond_6

    .line 44
    .line 45
    invoke-virtual {v0, p4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/content/ServiceConnection;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    if-eq p4, v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    filled-new-array {p4, p2, v1}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const-string v1, "Duplicate binding with the same ServiceConnection: %s, %s, %s."

    .line 64
    .line 65
    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    :cond_2
    if-nez p6, :cond_3

    .line 69
    .line 70
    move-object p6, v4

    .line 71
    :cond_3
    :try_start_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    if-lt p2, v3, :cond_4

    .line 74
    .line 75
    if-eqz p6, :cond_4

    .line 76
    .line 77
    invoke-static {p1, p3, p5, p6, p4}, Lr0;->t(Landroid/content/Context;Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    invoke-virtual {p1, p3, p4, p5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 83
    .line 84
    .line 85
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :goto_1
    if-eqz p1, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-virtual {v0, p4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    return v2

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    invoke-virtual {v0, p4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_6
    if-nez p6, :cond_7

    .line 99
    .line 100
    move-object p6, v4

    .line 101
    :cond_7
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    if-lt p2, v3, :cond_8

    .line 104
    .line 105
    if-eqz p6, :cond_8

    .line 106
    .line 107
    invoke-static {p1, p3, p5, p6, p4}, Lr0;->t(Landroid/content/Context;Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    goto :goto_2

    .line 112
    :cond_8
    invoke-virtual {p1, p3, p4, p5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    :goto_2
    return p1
.end method

.method public t(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    const-string v0, "Intent can not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    return v1
.end method

.method public u(IIJLjava/lang/Long;Ljava/lang/String;Lqb3;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "plaac_ts"

    .line 10
    .line 11
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {v0, v1, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p3, "max_ads"

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p3, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "cache_size"

    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "action"

    .line 37
    .line 38
    const-string p2, "is_ad_available"

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    if-eqz p7, :cond_0

    .line 44
    .line 45
    const-string p1, "ad_unit_id"

    .line 46
    .line 47
    iget-object p2, p7, Lqb3;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p1, "pid"

    .line 53
    .line 54
    iget-object p2, p7, Lqb3;->c:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string p1, "ad_format"

    .line 60
    .line 61
    invoke-virtual {p7}, Lqb3;->a()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    if-eqz p5, :cond_1

    .line 69
    .line 70
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string p2, "plaay_ts"

    .line 79
    .line 80
    invoke-virtual {v0, p2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    if-eqz p6, :cond_2

    .line 84
    .line 85
    const-string p1, "gqi"

    .line 86
    .line 87
    invoke-virtual {v0, p1, p6}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    const-string p1, "pv"

    .line 91
    .line 92
    invoke-virtual {v0, p1, p8}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Llv2;->m()V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public v(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lkl3;

    .line 7
    .line 8
    invoke-interface {v0, p0, p1}, Lkl3;->d(Lsq0;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    move-object v1, p1

    .line 18
    check-cast v1, Ljl3;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljl3;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Ljl3;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public w(JIILjava/lang/String;Lqb3;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "ppla_ts"

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, v1, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "ad_format"

    .line 19
    .line 20
    invoke-virtual {p6}, Lqb3;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "ad_unit_id"

    .line 28
    .line 29
    iget-object p2, p6, Lqb3;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p1, "pid"

    .line 35
    .line 36
    iget-object p2, p6, Lqb3;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "max_ads"

    .line 42
    .line 43
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "cache_size"

    .line 51
    .line 52
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string p1, "action"

    .line 60
    .line 61
    const-string p2, "poll_ad"

    .line 62
    .line 63
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    if-eqz p5, :cond_0

    .line 67
    .line 68
    const-string p1, "gqi"

    .line 69
    .line 70
    invoke-virtual {v0, p1, p5}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    const-string p1, "pv"

    .line 74
    .line 75
    invoke-virtual {v0, p1, p7}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Llv2;->m()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public x(JLqb3;Lnx2;IILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "action"

    .line 10
    .line 11
    const-string v2, "pftla"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "pftlat_ts"

    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, v1, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget p1, p4, Lnx2;->f:I

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "pftlaec"

    .line 32
    .line 33
    invoke-virtual {v0, p2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "ad_format"

    .line 37
    .line 38
    invoke-virtual {p3}, Lqb3;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "max_ads"

    .line 46
    .line 47
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string p1, "cache_size"

    .line 55
    .line 56
    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string p1, "ad_unit_id"

    .line 64
    .line 65
    iget-object p2, p3, Lqb3;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string p1, "pid"

    .line 71
    .line 72
    iget-object p2, p3, Lqb3;->c:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string p1, "pv"

    .line 78
    .line 79
    invoke-virtual {v0, p1, p7}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Llv2;->m()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public y(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ls2;III)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "action"

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "pat"

    .line 15
    .line 16
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string p2, "ad_format"

    .line 34
    .line 35
    invoke-virtual {v0, p2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string p1, "max_ads"

    .line 39
    .line 40
    invoke-static {p7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string p1, "cache_size"

    .line 48
    .line 49
    invoke-static {p8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string p1, "pas"

    .line 57
    .line 58
    invoke-static {p9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string p1, "pv"

    .line 66
    .line 67
    const-string p2, "2"

    .line 68
    .line 69
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string p1, "ad_unit_id"

    .line 73
    .line 74
    invoke-virtual {v0, p1, p5}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string p1, "pid"

    .line 78
    .line 79
    invoke-virtual {v0, p1, p4}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Llv2;->m()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public z(Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Lqb3;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsq0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmv2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz p8, :cond_0

    .line 17
    .line 18
    const-string p2, "ad_unit_id"

    .line 19
    .line 20
    iget-object p3, p8, Lqb3;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p2, "ad_format"

    .line 26
    .line 27
    invoke-virtual {p8}, Lqb3;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p2, "pid"

    .line 35
    .line 36
    iget-object p3, p8, Lqb3;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    const-string p2, "action"

    .line 42
    .line 43
    invoke-virtual {v0, p2, p1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    if-eqz p7, :cond_1

    .line 47
    .line 48
    const-string p1, "gqi"

    .line 49
    .line 50
    invoke-virtual {v0, p1, p7}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    if-ltz p5, :cond_2

    .line 54
    .line 55
    const-string p1, "max_ads"

    .line 56
    .line 57
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    if-ltz p6, :cond_3

    .line 65
    .line 66
    const-string p1, "cache_size"

    .line 67
    .line 68
    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {v0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    const-string p1, "pv"

    .line 76
    .line 77
    invoke-virtual {v0, p1, p9}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Llv2;->m()V

    .line 81
    .line 82
    .line 83
    return-void
.end method
