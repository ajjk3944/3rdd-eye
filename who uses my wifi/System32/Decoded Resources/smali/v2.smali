.class public final Lv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La62;


# direct methods
.method public constructor <init>(Landroid/content/Context;La62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv2;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lv2;->b:La62;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lb3;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lb3;->a:Le13;

    .line 2
    .line 3
    iget-object v0, p0, Lv2;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0}, Lmz1;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lq02;->c:Lso1;

    .line 9
    .line 10
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lmz1;->Wb:Liz1;

    .line 23
    .line 24
    sget-object v2, Ltw1;->e:Ltw1;

    .line 25
    .line 26
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Luu1;->b:Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    new-instance v1, Ljq3;

    .line 44
    .line 45
    const/16 v2, 0x13

    .line 46
    .line 47
    invoke-direct {v1, p0, p1, v2}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, p0, Lv2;->b:La62;

    .line 55
    .line 56
    invoke-static {v0, p1}, Lfr;->o(Landroid/content/Context;Le13;)Lpc4;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {v1, p1}, La62;->Z(Lpc4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    move-exception p1

    .line 65
    const-string v0, "Failed to load ad."

    .line 66
    .line 67
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
