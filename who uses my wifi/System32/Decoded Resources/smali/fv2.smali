.class public final Lfv2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lv93;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcx1;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfv2;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfv2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lfv2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lez2;Lfz2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lfv2;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lfv2;->h:Ljava/lang/Object;

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final H(Ls93;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget p2, p0, Lfv2;->f:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p2, Lmz1;->C6:Liz1;

    .line 7
    .line 8
    sget-object p3, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    if-eqz p2, :cond_0

    .line 23
    .line 24
    sget-object p2, Ls93;->j:Ls93;

    .line 25
    .line 26
    if-ne p2, p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lez2;

    .line 31
    .line 32
    invoke-virtual {p1}, Lez2;->b()J

    .line 33
    .line 34
    .line 35
    move-result-wide p2

    .line 36
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    cmp-long p2, p2, v0

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    sget-object p2, Lhg4;->C:Lhg4;

    .line 43
    .line 44
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    invoke-virtual {p1}, Lez2;->b()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    sub-long/2addr p2, v0

    .line 58
    monitor-enter p1

    .line 59
    :try_start_0
    iget-object v0, p1, Lez2;->j:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    :try_start_1
    iput-wide p2, p1, Lez2;->e:J

    .line 63
    .line 64
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    monitor-exit p1

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p2

    .line 68
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    :try_start_3
    throw p2

    .line 70
    :catchall_1
    move-exception p2

    .line 71
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 72
    throw p2

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 74
    :pswitch_0
    iget-object p2, p0, Lfv2;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-eqz p3, :cond_1

    .line 83
    .line 84
    iget-object p3, p0, Lfv2;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p3, Lcx1;

    .line 87
    .line 88
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lev2;

    .line 93
    .line 94
    iget p1, p1, Lev2;->c:I

    .line 95
    .line 96
    invoke-virtual {p3, p1}, Lcx1;->b(I)V

    .line 97
    .line 98
    .line 99
    :cond_1
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final R(Ljava/lang/String;Ls93;)V
    .locals 4

    .line 1
    iget p1, p0, Lfv2;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lmz1;->C6:Liz1;

    .line 7
    .line 8
    sget-object v0, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object p1, Ls93;->j:Ls93;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lez2;

    .line 31
    .line 32
    invoke-virtual {p1}, Lez2;->b()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    cmp-long p2, v0, v2

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    sget-object p2, Lhg4;->C:Lhg4;

    .line 43
    .line 44
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-virtual {p1}, Lez2;->b()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    sub-long/2addr v0, v2

    .line 58
    monitor-enter p1

    .line 59
    :try_start_0
    iget-object p2, p1, Lez2;->j:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    :try_start_1
    iput-wide v0, p1, Lez2;->e:J

    .line 63
    .line 64
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    monitor-exit p1

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    :try_start_3
    throw v0

    .line 70
    :catchall_1
    move-exception p2

    .line 71
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 72
    throw p2

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 74
    :pswitch_0
    iget-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/util/Map;

    .line 77
    .line 78
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    iget-object v0, p0, Lfv2;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lcx1;

    .line 87
    .line 88
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lev2;

    .line 93
    .line 94
    iget p1, p1, Lev2;->b:I

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Lcx1;->b(I)V

    .line 97
    .line 98
    .line 99
    :cond_1
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget p1, p0, Lfv2;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public final w(Ljava/lang/String;Ls93;)V
    .locals 3

    .line 1
    iget p1, p0, Lfv2;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lmz1;->C6:Liz1;

    .line 7
    .line 8
    sget-object v0, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Ls93;->j:Ls93;

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lez2;

    .line 32
    .line 33
    sget-object p2, Lhg4;->C:Lhg4;

    .line 34
    .line 35
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    monitor-enter p1

    .line 45
    :try_start_0
    iget-object p2, p1, Lez2;->i:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    :try_start_1
    iput-wide v0, p1, Lez2;->d:J

    .line 49
    .line 50
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    monitor-exit p1

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    :try_start_3
    throw v0

    .line 56
    :catchall_1
    move-exception p2

    .line 57
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 58
    throw p2

    .line 59
    :cond_1
    sget-object p1, Ls93;->C:Ls93;

    .line 60
    .line 61
    if-eq p1, p2, :cond_2

    .line 62
    .line 63
    sget-object p1, Ls93;->i:Ls93;

    .line 64
    .line 65
    if-ne p1, p2, :cond_3

    .line 66
    .line 67
    :cond_2
    iget-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lez2;

    .line 70
    .line 71
    sget-object p2, Lhg4;->C:Lhg4;

    .line 72
    .line 73
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    monitor-enter p1

    .line 83
    :try_start_4
    iget-object p2, p1, Lez2;->f:Ljava/lang/Object;

    .line 84
    .line 85
    monitor-enter p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 86
    :try_start_5
    iput-wide v0, p1, Lez2;->a:J

    .line 87
    .line 88
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 89
    monitor-exit p1

    .line 90
    iget-object p2, p0, Lfv2;->h:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p2, Lfz2;

    .line 93
    .line 94
    invoke-virtual {p1}, Lez2;->a()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    new-instance p1, Lue;

    .line 99
    .line 100
    const/4 v2, 0x6

    .line 101
    invoke-direct {p1, p2, v0, v1, v2}, Lue;-><init>(Ljava/lang/Object;JI)V

    .line 102
    .line 103
    .line 104
    iget-object p2, p2, Le6;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p2, Lwt2;

    .line 107
    .line 108
    invoke-virtual {p2, p1}, Lwt2;->e(Lo93;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_0
    return-void

    .line 112
    :catchall_2
    move-exception v0

    .line 113
    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 114
    :try_start_7
    throw v0

    .line 115
    :catchall_3
    move-exception p2

    .line 116
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 117
    throw p2

    .line 118
    :pswitch_0
    iget-object p1, p0, Lfv2;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    iget-object v0, p0, Lfv2;->h:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lcx1;

    .line 131
    .line 132
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lev2;

    .line 137
    .line 138
    iget p1, p1, Lev2;->a:I

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Lcx1;->b(I)V

    .line 141
    .line 142
    .line 143
    :cond_4
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
