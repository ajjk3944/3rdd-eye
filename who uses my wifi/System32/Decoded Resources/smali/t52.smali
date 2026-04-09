.class public final Lt52;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmm2;Lq52;Lf20;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lt52;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt52;->g:Ljava/lang/Object;

    iput-object p3, p0, Lt52;->h:Ljava/lang/Object;

    iput-object p1, p0, Lt52;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyr2;Ltr2;Lau2;Lz94;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lt52;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Ltr2;->g()Ljava/lang/String;

    move-result-object p2

    .line 3
    iget-object p1, p1, Lyr2;->g:Lbw0;

    .line 4
    invoke-virtual {p1, p2}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt22;

    .line 5
    iput-object p1, p0, Lt52;->g:Ljava/lang/Object;

    iput-object p3, p0, Lt52;->h:Ljava/lang/Object;

    iput-object p4, p0, Lt52;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    .line 1
    iget v0, p0, Lt52;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p1, "asset"

    .line 7
    .line 8
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    :try_start_0
    iget-object p2, p0, Lt52;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Lt22;

    .line 17
    .line 18
    iget-object v0, p0, Lt52;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lz94;

    .line 21
    .line 22
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lp22;

    .line 27
    .line 28
    invoke-interface {p2, v0, p1}, Lt22;->Q0(Lp22;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    new-instance p2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x28

    .line 43
    .line 44
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x5

    .line 48
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_0
    check-cast p1, Lc62;

    .line 53
    .line 54
    const-string p1, "loadJavascriptEngine > /requestReload handler: Trying to acquire lock"

    .line 55
    .line 56
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lt52;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lmm2;

    .line 62
    .line 63
    iget-object p2, p1, Lmm2;->b:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter p2

    .line 66
    :try_start_1
    const-string v0, "loadJavascriptEngine > /requestReload handler: Lock acquired"

    .line 67
    .line 68
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "JS Engine is requesting an update"

    .line 72
    .line 73
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget v0, p1, Lmm2;->g:I

    .line 77
    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    const-string v0, "Starting reload."

    .line 81
    .line 82
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x2

    .line 86
    iput v0, p1, Lmm2;->g:I

    .line 87
    .line 88
    invoke-virtual {p1}, Lmm2;->a()Lb62;

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    :goto_1
    iget-object p1, p0, Lt52;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lq52;

    .line 97
    .line 98
    const-string v0, "/requestReload"

    .line 99
    .line 100
    iget-object v1, p0, Lt52;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lf20;

    .line 103
    .line 104
    iget-object v1, v1, Lf20;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Lt52;

    .line 107
    .line 108
    invoke-virtual {p1, v0, v1}, Lq52;->h(Ljava/lang/String;Ly32;)V

    .line 109
    .line 110
    .line 111
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    const-string p1, "loadJavascriptEngine > /requestReload handler: Lock released"

    .line 113
    .line 114
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_2
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    throw p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
