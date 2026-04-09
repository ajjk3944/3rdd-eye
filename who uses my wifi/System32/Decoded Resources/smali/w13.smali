.class public final Lw13;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lb03;


# instance fields
.field public final synthetic a:I

.field public final b:Lyu2;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh23;Lyu2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw13;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw13;->c:Ljava/lang/Object;

    iput-object p2, p0, Lw13;->b:Lyu2;

    return-void
.end method

.method public constructor <init>(Lyu2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw13;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lw13;->c:Ljava/lang/Object;

    iput-object p1, p0, Lw13;->b:Lyu2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lc03;
    .locals 3

    .line 1
    iget v0, p0, Lw13;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p2, Lmz1;->M1:Liz1;

    .line 7
    .line 8
    sget-object v0, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    :try_start_0
    iget-object p2, p0, Lw13;->b:Lyu2;

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lyu2;->b(Ljava/lang/String;)Ld82;

    .line 28
    .line 29
    .line 30
    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p2

    .line 33
    const-string v1, "Coundn\'t create RTB adapter: "

    .line 34
    .line 35
    invoke-static {v1, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    move-object p2, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object p2, p0, Lw13;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Lh23;

    .line 43
    .line 44
    iget-object p2, p2, Lh23;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, Ld82;

    .line 57
    .line 58
    :goto_0
    if-nez p2, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance v0, Lu03;

    .line 62
    .line 63
    invoke-direct {v0}, Ly62;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lc03;

    .line 67
    .line 68
    invoke-direct {v1, p2, v0, p1}, Lc03;-><init>(Ljava/lang/Object;Lhn2;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v0, v1

    .line 72
    :goto_1
    return-object v0

    .line 73
    :pswitch_0
    monitor-enter p0

    .line 74
    :try_start_1
    iget-object v0, p0, Lw13;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lc03;

    .line 83
    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    iget-object v1, p0, Lw13;->b:Lyu2;

    .line 87
    .line 88
    invoke-virtual {v1, p1, p2}, Lyu2;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lu83;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    new-instance v1, Lc03;

    .line 93
    .line 94
    new-instance v2, Lw03;

    .line 95
    .line 96
    invoke-direct {v2}, Lra2;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, p2, v2, p1}, Lc03;-><init>(Ljava/lang/Object;Lhn2;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    :goto_2
    monitor-exit p0

    .line 109
    return-object v1

    .line 110
    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    throw p1

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
