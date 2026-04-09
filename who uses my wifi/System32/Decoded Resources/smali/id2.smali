.class public final Lid2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lwv1;


# instance fields
.field public final f:Ljava/lang/Object;

.field public final g:Lra4;

.field public final h:Ll92;

.field public final i:Lhd2;

.field public final j:Ljava/util/HashSet;

.field public final k:Ljava/util/HashSet;

.field public l:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lra4;)V
    .locals 1

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
    iput-object v0, p0, Lid2;->f:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lid2;->j:Ljava/util/HashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lid2;->k:Ljava/util/HashSet;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lid2;->l:Z

    .line 27
    .line 28
    new-instance v0, Lhd2;

    .line 29
    .line 30
    invoke-direct {v0, p1, p2}, Lhd2;-><init>(Ljava/lang/String;Lra4;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lid2;->i:Lhd2;

    .line 34
    .line 35
    iput-object p2, p0, Lid2;->g:Lra4;

    .line 36
    .line 37
    new-instance p1, Ll92;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object p2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 43
    .line 44
    iput-object p2, p1, Ll92;->f:Ljava/lang/Object;

    .line 45
    .line 46
    const-string p2, "0"

    .line 47
    .line 48
    iput-object p2, p1, Ll92;->g:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object p1, p0, Lid2;->h:Ll92;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final T(Z)V
    .locals 5

    .line 1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 2
    .line 3
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lid2;->g:Lra4;

    .line 15
    .line 16
    invoke-virtual {p1}, Lra4;->h()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p1, Lra4;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    iget-wide v3, p1, Lra4;->o:J

    .line 23
    .line 24
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    sub-long/2addr v0, v3

    .line 26
    sget-object v2, Lmz1;->d1:Liz1;

    .line 27
    .line 28
    sget-object v3, Ltw1;->e:Ltw1;

    .line 29
    .line 30
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v0, v0, v2

    .line 43
    .line 44
    if-lez v0, :cond_0

    .line 45
    .line 46
    iget-object p1, p0, Lid2;->i:Lhd2;

    .line 47
    .line 48
    const/4 v0, -0x1

    .line 49
    iput v0, p1, Lhd2;->d:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lid2;->i:Lhd2;

    .line 53
    .line 54
    invoke-virtual {p1}, Lra4;->h()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p1, Lra4;->a:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter v1

    .line 60
    :try_start_1
    iget p1, p1, Lra4;->q:I

    .line 61
    .line 62
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    iput p1, v0, Lhd2;->d:I

    .line 64
    .line 65
    :goto_0
    const/4 p1, 0x1

    .line 66
    iput-boolean p1, p0, Lid2;->l:Z

    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    throw p1

    .line 72
    :catchall_1
    move-exception p1

    .line 73
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 74
    throw p1

    .line 75
    :cond_1
    iget-object p1, p0, Lid2;->g:Lra4;

    .line 76
    .line 77
    invoke-virtual {p1}, Lra4;->h()V

    .line 78
    .line 79
    .line 80
    iget-object v2, p1, Lra4;->a:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-enter v2

    .line 83
    :try_start_4
    iget-wide v3, p1, Lra4;->o:J

    .line 84
    .line 85
    cmp-long v3, v3, v0

    .line 86
    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    monitor-exit v2

    .line 90
    goto :goto_1

    .line 91
    :catchall_2
    move-exception p1

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    iput-wide v0, p1, Lra4;->o:J

    .line 94
    .line 95
    iget-object v3, p1, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    const-string v4, "app_last_background_time_ms"

    .line 100
    .line 101
    invoke-interface {v3, v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    iget-object v0, p1, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 105
    .line 106
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-virtual {p1}, Lra4;->i()V

    .line 110
    .line 111
    .line 112
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 113
    :goto_1
    iget-object v0, p0, Lid2;->i:Lhd2;

    .line 114
    .line 115
    iget v0, v0, Lhd2;->d:I

    .line 116
    .line 117
    invoke-virtual {p1}, Lra4;->h()V

    .line 118
    .line 119
    .line 120
    iget-object v1, p1, Lra4;->a:Ljava/lang/Object;

    .line 121
    .line 122
    monitor-enter v1

    .line 123
    :try_start_5
    iget v2, p1, Lra4;->q:I

    .line 124
    .line 125
    if-ne v2, v0, :cond_4

    .line 126
    .line 127
    monitor-exit v1

    .line 128
    return-void

    .line 129
    :catchall_3
    move-exception p1

    .line 130
    goto :goto_2

    .line 131
    :cond_4
    iput v0, p1, Lra4;->q:I

    .line 132
    .line 133
    iget-object v2, p1, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    if-eqz v2, :cond_5

    .line 136
    .line 137
    const-string v3, "request_in_session_count"

    .line 138
    .line 139
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 140
    .line 141
    .line 142
    iget-object v0, p1, Lra4;->g:Landroid/content/SharedPreferences$Editor;

    .line 143
    .line 144
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 145
    .line 146
    .line 147
    :cond_5
    invoke-virtual {p1}, Lra4;->i()V

    .line 148
    .line 149
    .line 150
    monitor-exit v1

    .line 151
    return-void

    .line 152
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 153
    throw p1

    .line 154
    :goto_3
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 155
    throw p1
.end method

.method public final a(Ldd2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lid2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lid2;->j:Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method
