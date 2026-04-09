.class public final Lcu1;
.super Lhu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final h:Lzs1;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(Ljt1;Lfr1;ILzs1;JJ)V
    .locals 7

    .line 1
    const-string v3, "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14="

    .line 2
    .line 3
    const/16 v6, 0xb

    .line 4
    .line 5
    const-string v2, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p2

    .line 10
    move v5, p3

    .line 11
    invoke-direct/range {v0 .. v6}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    .line 12
    .line 13
    .line 14
    iput-object p4, v0, Lcu1;->h:Lzs1;

    .line 15
    .line 16
    iput-wide p5, v0, Lcu1;->i:J

    .line 17
    .line 18
    iput-wide p7, v0, Lcu1;->j:J

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcu1;->h:Lzs1;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    iget-object v0, v0, Lzs1;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/net/NetworkCapabilities;

    .line 10
    .line 11
    iget-wide v2, p0, Lcu1;->i:J

    .line 12
    .line 13
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-wide v3, p0, Lcu1;->j:J

    .line 18
    .line 19
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    filled-new-array {v0, v2, v3}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v1, Lys1;

    .line 35
    .line 36
    invoke-direct {v1}, Lys1;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, La30;->t(Ljava/lang/String;)Ljava/util/HashMap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/Long;

    .line 55
    .line 56
    iput-object v2, v1, Lys1;->u:Ljava/lang/Long;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Long;

    .line 68
    .line 69
    iput-object v2, v1, Lys1;->v:Ljava/lang/Object;

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/Long;

    .line 81
    .line 82
    iput-object v0, v1, Lys1;->w:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_0
    iget-object v0, p0, Lhu1;->d:Lfr1;

    .line 85
    .line 86
    monitor-enter v0

    .line 87
    :try_start_0
    iget-object v2, v1, Lys1;->u:Ljava/lang/Long;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    invoke-virtual {v0}, Ln54;->b()V

    .line 94
    .line 95
    .line 96
    iget-object v4, v0, Ln54;->g:Lp54;

    .line 97
    .line 98
    check-cast v4, Lqr1;

    .line 99
    .line 100
    invoke-virtual {v4, v2, v3}, Lqr1;->J0(J)V

    .line 101
    .line 102
    .line 103
    iget-object v2, v1, Lys1;->v:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    const-wide/16 v4, 0x0

    .line 112
    .line 113
    cmp-long v2, v2, v4

    .line 114
    .line 115
    if-ltz v2, :cond_1

    .line 116
    .line 117
    iget-object v2, v1, Lys1;->v:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Ljava/lang/Long;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    invoke-virtual {v0}, Ln54;->b()V

    .line 126
    .line 127
    .line 128
    iget-object v6, v0, Ln54;->g:Lp54;

    .line 129
    .line 130
    check-cast v6, Lqr1;

    .line 131
    .line 132
    invoke-virtual {v6, v2, v3}, Lqr1;->h0(J)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catchall_0
    move-exception v1

    .line 137
    goto :goto_1

    .line 138
    :cond_1
    :goto_0
    iget-object v2, v1, Lys1;->w:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, Ljava/lang/Long;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    cmp-long v2, v2, v4

    .line 147
    .line 148
    if-ltz v2, :cond_2

    .line 149
    .line 150
    iget-object v1, v1, Lys1;->w:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ljava/lang/Long;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 155
    .line 156
    .line 157
    move-result-wide v1

    .line 158
    invoke-virtual {v0}, Ln54;->b()V

    .line 159
    .line 160
    .line 161
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 162
    .line 163
    check-cast v3, Lqr1;

    .line 164
    .line 165
    invoke-virtual {v3, v1, v2}, Lqr1;->i0(J)V

    .line 166
    .line 167
    .line 168
    :cond_2
    monitor-exit v0

    .line 169
    return-void

    .line 170
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    throw v1

    .line 172
    :cond_3
    return-void
.end method
