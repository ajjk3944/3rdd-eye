.class public final Lmi3;
.super Lti3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Ljava/util/Map;

.field public final g:Landroid/content/Context;

.field public final h:Leg3;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(Lfr1;Lgi3;Ljava/util/Map;Landroid/content/Context;Leg3;Lvf3;Lgk3;)V
    .locals 7

    .line 1
    const/16 v0, 0x71

    .line 2
    .line 3
    invoke-virtual {p7, v0}, Lgk3;->a(I)Lfk3;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1"

    .line 8
    .line 9
    const-string v3, "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lti3;-><init>(Ljava/lang/String;Ljava/lang/String;Lfr1;Lgi3;Lfk3;)V

    .line 15
    .line 16
    .line 17
    iput-object p4, v1, Lmi3;->g:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p3, v1, Lmi3;->f:Ljava/util/Map;

    .line 20
    .line 21
    iput-object p5, v1, Lmi3;->h:Leg3;

    .line 22
    .line 23
    invoke-virtual {p6}, Lvf3;->L()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    iput-wide p1, v1, Lmi3;->i:J

    .line 28
    .line 29
    invoke-virtual {p6}, Lvf3;->M()J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    iput-wide p1, v1, Lmi3;->j:J

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Method;Lfr1;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lmi3;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lmi3;->h:Leg3;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ""

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v0, "E"

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    :try_start_0
    iget-object v2, p0, Lmi3;->f:Ljava/util/Map;

    .line 32
    .line 33
    const-string v3, "gs"

    .line 34
    .line 35
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ln70;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v4, 0x1f

    .line 46
    .line 47
    if-lt v3, v4, :cond_0

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    :cond_0
    iget-wide v3, p0, Lmi3;->i:J

    .line 56
    .line 57
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-interface {v2, v3, v4, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lqr1;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v2}, Lqr1;->v0()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-le v3, v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {v2}, Lqr1;->v0()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :catch_0
    :cond_1
    const-string v2, "E"

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    :try_start_1
    iget-object v2, p0, Lmi3;->f:Ljava/util/Map;

    .line 90
    .line 91
    const-string v3, "ai"

    .line 92
    .line 93
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ln70;

    .line 98
    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    iget-wide v3, p0, Lmi3;->j:J

    .line 102
    .line 103
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 104
    .line 105
    invoke-interface {v2, v3, v4, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v2}, Lyc0;->s(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v3
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    .line 115
    if-nez v3, :cond_2

    .line 116
    .line 117
    move-object v0, v2

    .line 118
    :catch_1
    :cond_2
    const/4 v2, 0x5

    .line 119
    aget-object v2, p1, v2

    .line 120
    .line 121
    check-cast v2, Ljava/lang/Boolean;

    .line 122
    .line 123
    monitor-enter p2

    .line 124
    const/4 v3, 0x0

    .line 125
    :try_start_2
    aget-object v3, p1, v3

    .line 126
    .line 127
    check-cast v3, Ljava/lang/Long;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide v3

    .line 133
    invoke-virtual {p2}, Ln54;->b()V

    .line 134
    .line 135
    .line 136
    iget-object v5, p2, Ln54;->g:Lp54;

    .line 137
    .line 138
    check-cast v5, Lqr1;

    .line 139
    .line 140
    invoke-virtual {v5, v3, v4}, Lqr1;->F(J)V

    .line 141
    .line 142
    .line 143
    aget-object v3, p1, v1

    .line 144
    .line 145
    check-cast v3, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p2}, Ln54;->b()V

    .line 148
    .line 149
    .line 150
    iget-object v4, p2, Ln54;->g:Lp54;

    .line 151
    .line 152
    check-cast v4, Lqr1;

    .line 153
    .line 154
    invoke-virtual {v4, v3}, Lqr1;->E(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const/4 v3, 0x2

    .line 158
    aget-object v4, p1, v3

    .line 159
    .line 160
    check-cast v4, Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {p2}, Ln54;->b()V

    .line 163
    .line 164
    .line 165
    iget-object v5, p2, Ln54;->g:Lp54;

    .line 166
    .line 167
    check-cast v5, Lqr1;

    .line 168
    .line 169
    invoke-virtual {v5, v4}, Lqr1;->O(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const/4 v4, 0x3

    .line 173
    aget-object v4, p1, v4

    .line 174
    .line 175
    check-cast v4, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {p2}, Ln54;->b()V

    .line 178
    .line 179
    .line 180
    iget-object v5, p2, Ln54;->g:Lp54;

    .line 181
    .line 182
    check-cast v5, Lqr1;

    .line 183
    .line 184
    invoke-virtual {v5, v4}, Lqr1;->P(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    sget-object v4, Ljo3;->f:Lgo3;

    .line 188
    .line 189
    invoke-virtual {v4}, Ljo3;->f()Ljo3;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const/4 v5, 0x4

    .line 194
    aget-object p1, p1, v5

    .line 195
    .line 196
    check-cast p1, [B

    .line 197
    .line 198
    array-length v5, p1

    .line 199
    invoke-virtual {v4, v5, p1}, Ljo3;->g(I[B)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p2}, Ln54;->b()V

    .line 204
    .line 205
    .line 206
    iget-object v4, p2, Ln54;->g:Lp54;

    .line 207
    .line 208
    check-cast v4, Lqr1;

    .line 209
    .line 210
    invoke-virtual {v4, p1}, Lqr1;->A(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2}, Ln54;->b()V

    .line 214
    .line 215
    .line 216
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 217
    .line 218
    check-cast p1, Lqr1;

    .line 219
    .line 220
    invoke-virtual {p1, v0}, Lqr1;->S0(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    if-eqz v2, :cond_4

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eq v1, p1, :cond_3

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_3
    move v1, v3

    .line 233
    :goto_0
    invoke-virtual {p2}, Ln54;->b()V

    .line 234
    .line 235
    .line 236
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 237
    .line 238
    check-cast p1, Lqr1;

    .line 239
    .line 240
    invoke-virtual {p1, v1}, Lqr1;->t0(I)V

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :catchall_0
    move-exception p1

    .line 245
    goto :goto_2

    .line 246
    :cond_4
    :goto_1
    monitor-exit p2

    .line 247
    return-void

    .line 248
    :goto_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 249
    throw p1
.end method
