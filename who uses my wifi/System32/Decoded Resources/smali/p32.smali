.class public final Lp32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static a:Lko1;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp32;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    sget-object v0, Lp32;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    sget-object v1, Lp32;->a:Lko1;

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Lmz1;->a(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lmz1;->P4:Liz1;

    .line 25
    .line 26
    sget-object v2, Ltw1;->e:Ltw1;

    .line 27
    .line 28
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, Lht1;->u(Landroid/content/Context;)Lko1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v1, Lvq2;

    .line 50
    .line 51
    new-instance v2, Lus0;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v2}, Lvq2;-><init>(Lus0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v2, Lgw3;

    .line 64
    .line 65
    const/16 v3, 0x15

    .line 66
    .line 67
    invoke-direct {v2, v3, p1}, Lgw3;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lko1;

    .line 71
    .line 72
    new-instance v3, Lwo1;

    .line 73
    .line 74
    invoke-direct {v3, v2}, Lwo1;-><init>(Lgw3;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, v3, v1}, Lko1;-><init>(Lwo1;Lvq2;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lko1;->a()V

    .line 81
    .line 82
    .line 83
    :goto_0
    sput-object p1, Lp32;->a:Lko1;

    .line 84
    .line 85
    :cond_2
    monitor-exit v0

    .line 86
    return-void

    .line 87
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    throw p1
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/HashMap;[B)Lt12;
    .locals 10

    .line 1
    new-instance v5, Lt12;

    .line 2
    .line 3
    invoke-direct {v5}, Lpd2;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v6, Ll92;

    .line 7
    .line 8
    invoke-direct {v6, p0, p2, v5}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v9, Lwb4;

    .line 12
    .line 13
    invoke-direct {v9}, Lwb4;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ly02;

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    move v3, p1

    .line 20
    move-object v4, p2

    .line 21
    move-object v8, p3

    .line 22
    move-object v7, p4

    .line 23
    invoke-direct/range {v1 .. v9}, Ly02;-><init>(Lp32;ILjava/lang/String;Lt12;Ll92;[BLjava/util/Map;Lwb4;)V

    .line 24
    .line 25
    .line 26
    move-object p2, v1

    .line 27
    move-object v1, v4

    .line 28
    move-object p1, v5

    .line 29
    invoke-static {}, Lwb4;->c()Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-eqz p3, :cond_2

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {p2}, Ly02;->e()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-nez v7, :cond_0

    .line 40
    .line 41
    const/4 p4, 0x0

    .line 42
    move-object v4, p4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v4, v7

    .line 45
    :goto_0
    invoke-static {}, Lwb4;->c()Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    if-nez p3, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const-string v2, "GET"

    .line 53
    .line 54
    new-instance v0, Lmc2;

    .line 55
    .line 56
    const/16 v5, 0x1a

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct/range {v0 .. v6}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 60
    .line 61
    .line 62
    const-string p3, "onNetworkRequest"

    .line 63
    .line 64
    invoke-virtual {v9, p3, v0}, Lwb4;->e(Ljava/lang/String;Lbb4;)V
    :try_end_0
    .catch Lzn1; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object p3, v0

    .line 70
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-static {p3}, Lgi2;->i0(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    sget-object p3, Lp32;->a:Lko1;

    .line 78
    .line 79
    invoke-virtual {p3, p2}, Lko1;->b(Ljo1;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method
