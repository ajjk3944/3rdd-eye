.class public final Lgd2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lra4;

.field public final c:Lid2;

.field public d:Z

.field public e:Landroid/content/Context;

.field public f:Le51;

.field public g:Ljava/lang/String;

.field public h:Lh2;

.field public i:Lmv2;

.field public j:Ljava/lang/Boolean;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final m:Lfd2;

.field public final n:Ljava/lang/Object;

.field public o:Ln70;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgd2;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lra4;

    .line 12
    .line 13
    invoke-direct {v0}, Lra4;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lgd2;->b:Lra4;

    .line 17
    .line 18
    new-instance v1, Lid2;

    .line 19
    .line 20
    sget-object v2, Lsv1;->f:Lsv1;

    .line 21
    .line 22
    iget-object v2, v2, Lsv1;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v1, v2, v0}, Lid2;-><init>(Ljava/lang/String;Lra4;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lgd2;->c:Lid2;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lgd2;->d:Z

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iput-object v1, p0, Lgd2;->h:Lh2;

    .line 34
    .line 35
    iput-object v1, p0, Lgd2;->i:Lmv2;

    .line 36
    .line 37
    iput-object v1, p0, Lgd2;->j:Ljava/lang/Boolean;

    .line 38
    .line 39
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lgd2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 45
    .line 46
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lgd2;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 52
    .line 53
    new-instance v0, Lfd2;

    .line 54
    .line 55
    invoke-direct {v0}, Lfd2;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lgd2;->m:Lfd2;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/Object;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lgd2;->n:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lgd2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final a()Lh2;
    .locals 2

    .line 1
    iget-object v0, p0, Lgd2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgd2;->h:Lh2;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final b(Landroid/content/Context;Le51;Lmv2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgd2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lgd2;->d:Z

    .line 5
    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lgd2;->e:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, p0, Lgd2;->f:Le51;

    .line 15
    .line 16
    sget-object v1, Lhg4;->C:Lhg4;

    .line 17
    .line 18
    iget-object v1, v1, Lhg4;->g:Lwy0;

    .line 19
    .line 20
    iget-object v2, p0, Lgd2;->c:Lid2;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lwy0;->f(Lwv1;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lgd2;->b:Lra4;

    .line 26
    .line 27
    iget-object v2, p0, Lgd2;->e:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lra4;->j(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lgd2;->e:Landroid/content/Context;

    .line 33
    .line 34
    iget-object v2, p0, Lgd2;->f:Le51;

    .line 35
    .line 36
    invoke-static {v1, v2}, Lr92;->b(Landroid/content/Context;Le51;)Ls92;

    .line 37
    .line 38
    .line 39
    iput-object p3, p0, Lgd2;->i:Lmv2;

    .line 40
    .line 41
    sget-object p3, Lmz1;->f2:Liz1;

    .line 42
    .line 43
    sget-object v1, Ltw1;->e:Ltw1;

    .line 44
    .line 45
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 46
    .line 47
    invoke-virtual {v2, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    check-cast p3, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-nez p3, :cond_0

    .line 58
    .line 59
    const-string p3, "CsiReporterFactory: CSI is not enabled. No CSI reporter created."

    .line 60
    .line 61
    invoke-static {p3}, Lgi2;->G(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p3, 0x0

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    new-instance p3, Lh2;

    .line 69
    .line 70
    invoke-direct {p3}, Lh2;-><init>()V

    .line 71
    .line 72
    .line 73
    :goto_0
    iput-object p3, p0, Lgd2;->h:Lh2;

    .line 74
    .line 75
    if-eqz p3, :cond_1

    .line 76
    .line 77
    new-instance p3, Lgc2;

    .line 78
    .line 79
    invoke-direct {p3, p0}, Lgc2;-><init>(Lgd2;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3}, Lf74;->r1()Ln70;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    const-string v2, "AppState.registerCsiReporter"

    .line 87
    .line 88
    invoke-static {p3, v2}, Lum;->F(Ln70;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-object p3, p0, Lgd2;->e:Landroid/content/Context;

    .line 92
    .line 93
    sget-object v2, Lmz1;->b9:Liz1;

    .line 94
    .line 95
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, 0x1

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    const-string v1, "connectivity"

    .line 111
    .line 112
    invoke-virtual {p3, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    check-cast p3, Landroid/net/ConnectivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    :try_start_1
    new-instance v1, Lra0;

    .line 119
    .line 120
    invoke-direct {v1, p0}, Lra0;-><init>(Lgd2;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, v1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catch_0
    const/4 p3, 0x5

    .line 128
    :try_start_2
    invoke-static {p3}, Lgi2;->q0(I)Z

    .line 129
    .line 130
    .line 131
    iget-object p3, p0, Lgd2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 132
    .line 133
    invoke-virtual {p3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 134
    .line 135
    .line 136
    :cond_2
    :goto_1
    iput-boolean v2, p0, Lgd2;->d:Z

    .line 137
    .line 138
    invoke-virtual {p0}, Lgd2;->h()Ln70;

    .line 139
    .line 140
    .line 141
    :cond_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    sget-object p3, Lmz1;->we:Liz1;

    .line 143
    .line 144
    sget-object v0, Ltw1;->e:Ltw1;

    .line 145
    .line 146
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 147
    .line 148
    invoke-virtual {v0, p3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    check-cast p3, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p3

    .line 158
    if-nez p3, :cond_4

    .line 159
    .line 160
    sget-object p3, Lhg4;->C:Lhg4;

    .line 161
    .line 162
    iget-object p3, p3, Lhg4;->c:Llf4;

    .line 163
    .line 164
    iget-object p2, p2, Le51;->f:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p3, p1, p2}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    :cond_4
    return-void

    .line 170
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    throw p1
.end method

.method public final c()Landroid/content/res/Resources;
    .locals 3

    .line 1
    iget-object v0, p0, Lgd2;->f:Le51;

    .line 2
    .line 3
    iget-boolean v0, v0, Le51;->i:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lgd2;->e:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :try_start_0
    sget-object v1, Lmz1;->Hb:Liz1;

    .line 16
    .line 17
    sget-object v2, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lgd2;->e:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v1}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v1, v1, Lar;->a:Landroid/content/Context;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_1
    iget-object v1, p0, Lgd2;->e:Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {v1}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v1, v1, Lar;->a:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    :try_end_0
    .catch Lze4; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :catch_0
    const/4 v1, 0x5

    .line 59
    invoke-static {v1}, Lgi2;->q0(I)Z

    .line 60
    .line 61
    .line 62
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgd2;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lgd2;->f:Le51;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr92;->b(Landroid/content/Context;Le51;)Ls92;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1, p2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgd2;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lgd2;->f:Le51;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr92;->b(Landroid/content/Context;Le51;)Ls92;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lf12;->f:Lso1;

    .line 10
    .line 11
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Double;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-interface {v0, p2, p1, v1}, Ls92;->g(Ljava/lang/Throwable;Ljava/lang/String;F)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgd2;->e:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lgd2;->f:Le51;

    .line 4
    .line 5
    sget-object v2, Lr92;->q:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    sget-object v3, Lr92;->s:Ls92;

    .line 9
    .line 10
    if-nez v3, :cond_1

    .line 11
    .line 12
    sget-object v3, Lmz1;->e8:Liz1;

    .line 13
    .line 14
    sget-object v4, Ltw1;->e:Ltw1;

    .line 15
    .line 16
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 17
    .line 18
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    sget-object v3, Lmz1;->d8:Liz1;

    .line 31
    .line 32
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    new-instance v3, Lr92;

    .line 47
    .line 48
    invoke-direct {v3, v0, v1}, Lr92;-><init>(Landroid/content/Context;Le51;)V

    .line 49
    .line 50
    .line 51
    sput-object v3, Lr92;->s:Ls92;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v0, Lus0;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lr92;->s:Ls92;

    .line 62
    .line 63
    :cond_1
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    sget-object v0, Lr92;->s:Ls92;

    .line 65
    .line 66
    invoke-interface {v0, p1, p2}, Ls92;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p1
.end method

.method public final g()Lra4;
    .locals 2

    .line 1
    iget-object v0, p0, Lgd2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgd2;->b:Lra4;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final h()Ln70;
    .locals 4

    .line 1
    iget-object v0, p0, Lgd2;->e:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lmz1;->j3:Liz1;

    .line 6
    .line 7
    sget-object v1, Ltw1;->e:Ltw1;

    .line 8
    .line 9
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lgd2;->n:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v0

    .line 27
    :try_start_0
    iget-object v1, p0, Lgd2;->o:Ln70;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-object v1

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object v1, Lmd2;->a:Lld2;

    .line 36
    .line 37
    new-instance v2, Lxs1;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-direct {v2, v3, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lgd2;->o:Ln70;

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-object v1

    .line 51
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw v1

    .line 53
    :cond_2
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public final i(Landroid/content/Context;)Z
    .locals 2

    .line 1
    sget-object v0, Lmz1;->b9:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "connectivity"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1

    .line 43
    :cond_1
    iget-object p1, p0, Lgd2;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1
.end method
