.class public final Lhd2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:I

.field public e:J

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/String;

.field public final h:Lra4;

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lra4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lhd2;->a:J

    .line 7
    .line 8
    iput-wide v0, p0, Lhd2;->b:J

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lhd2;->c:I

    .line 12
    .line 13
    iput v0, p0, Lhd2;->d:I

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    iput-wide v0, p0, Lhd2;->e:J

    .line 18
    .line 19
    new-instance v0, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lhd2;->f:Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lhd2;->i:I

    .line 28
    .line 29
    iput v0, p0, Lhd2;->j:I

    .line 30
    .line 31
    iput v0, p0, Lhd2;->k:I

    .line 32
    .line 33
    iput-object p1, p0, Lhd2;->g:Ljava/lang/String;

    .line 34
    .line 35
    iput-object p2, p0, Lhd2;->h:Lra4;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(Lpc4;J)V
    .locals 11

    .line 1
    iget-object v0, p0, Lhd2;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lhd2;->h:Lra4;

    .line 5
    .line 6
    invoke-virtual {v1}, Lra4;->h()V

    .line 7
    .line 8
    .line 9
    iget-object v2, v1, Lra4;->a:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    :try_start_1
    iget-wide v3, v1, Lra4;->o:J

    .line 13
    .line 14
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 15
    :try_start_2
    sget-object v2, Lhg4;->C:Lhg4;

    .line 16
    .line 17
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    iget-wide v7, p0, Lhd2;->b:J

    .line 27
    .line 28
    const-wide/16 v9, -0x1

    .line 29
    .line 30
    cmp-long v2, v7, v9

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    sub-long v2, v5, v3

    .line 35
    .line 36
    sget-object v4, Lmz1;->d1:Liz1;

    .line 37
    .line 38
    sget-object v7, Ltw1;->e:Ltw1;

    .line 39
    .line 40
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 41
    .line 42
    invoke-virtual {v7, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Long;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    cmp-long v2, v2, v7

    .line 53
    .line 54
    if-lez v2, :cond_0

    .line 55
    .line 56
    const/4 v2, -0x1

    .line 57
    iput v2, p0, Lhd2;->d:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_3

    .line 62
    :cond_0
    invoke-virtual {v1}, Lra4;->h()V

    .line 63
    .line 64
    .line 65
    iget-object v2, v1, Lra4;->a:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    :try_start_3
    iget v3, v1, Lra4;->q:I

    .line 69
    .line 70
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 71
    :try_start_4
    iput v3, p0, Lhd2;->d:I

    .line 72
    .line 73
    :goto_0
    iput-wide p2, p0, Lhd2;->b:J

    .line 74
    .line 75
    iput-wide p2, p0, Lhd2;->a:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 80
    :try_start_6
    throw p1

    .line 81
    :cond_1
    iput-wide p2, p0, Lhd2;->a:J

    .line 82
    .line 83
    :goto_1
    sget-object p2, Lmz1;->W3:Liz1;

    .line 84
    .line 85
    sget-object p3, Ltw1;->e:Ltw1;

    .line 86
    .line 87
    iget-object p3, p3, Ltw1;->c:Lkz1;

    .line 88
    .line 89
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    check-cast p2, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    const/4 p3, 0x1

    .line 100
    if-nez p2, :cond_2

    .line 101
    .line 102
    iget-object p1, p1, Lpc4;->h:Landroid/os/Bundle;

    .line 103
    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    const-string p2, "gw"

    .line 107
    .line 108
    const/4 v2, 0x2

    .line 109
    invoke-virtual {p1, p2, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-ne p1, p3, :cond_2

    .line 114
    .line 115
    monitor-exit v0

    .line 116
    return-void

    .line 117
    :cond_2
    iget p1, p0, Lhd2;->c:I

    .line 118
    .line 119
    add-int/2addr p1, p3

    .line 120
    iput p1, p0, Lhd2;->c:I

    .line 121
    .line 122
    iget p1, p0, Lhd2;->d:I

    .line 123
    .line 124
    add-int/2addr p1, p3

    .line 125
    iput p1, p0, Lhd2;->d:I

    .line 126
    .line 127
    if-nez p1, :cond_3

    .line 128
    .line 129
    const-wide/16 p1, 0x0

    .line 130
    .line 131
    iput-wide p1, p0, Lhd2;->e:J

    .line 132
    .line 133
    invoke-virtual {v1, v5, v6}, Lra4;->n(J)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    invoke-virtual {v1}, Lra4;->h()V

    .line 138
    .line 139
    .line 140
    iget-object p1, v1, Lra4;->a:Ljava/lang/Object;

    .line 141
    .line 142
    monitor-enter p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 143
    :try_start_7
    iget-wide p2, v1, Lra4;->p:J

    .line 144
    .line 145
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 146
    sub-long/2addr v5, p2

    .line 147
    :try_start_8
    iput-wide v5, p0, Lhd2;->e:J

    .line 148
    .line 149
    :goto_2
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 150
    return-void

    .line 151
    :catchall_2
    move-exception p2

    .line 152
    :try_start_9
    monitor-exit p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 153
    :try_start_a
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 154
    :catchall_3
    move-exception p1

    .line 155
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 156
    :try_start_c
    throw p1

    .line 157
    :goto_3
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 158
    throw p1
.end method

.method public final b()V
    .locals 2

    .line 1
    sget-object v0, Ld12;->a:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lhd2;->f:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget v1, p0, Lhd2;->c:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    iput v1, p0, Lhd2;->c:I

    .line 23
    .line 24
    iget v1, p0, Lhd2;->d:I

    .line 25
    .line 26
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    iput v1, p0, Lhd2;->d:I

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v1

    .line 35
    :cond_0
    return-void
.end method
