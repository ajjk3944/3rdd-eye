.class public final Lwa0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public j:I

.field public final synthetic k:Leu0;

.field public final synthetic l:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

.field public final synthetic m:Lhy;

.field public final synthetic n:J

.field public final synthetic o:Lso1;


# direct methods
.method public constructor <init>(Leu0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lhy;JLso1;Loj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwa0;->k:Leu0;

    .line 2
    .line 3
    iput-object p2, p0, Lwa0;->l:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    iput-object p3, p0, Lwa0;->m:Lhy;

    .line 6
    .line 7
    iput-wide p4, p0, Lwa0;->n:J

    .line 8
    .line 9
    iput-object p6, p0, Lwa0;->o:Lso1;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, Lmz0;-><init>(ILoj;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqk;

    .line 2
    .line 3
    check-cast p2, Loj;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lwa0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwa0;

    .line 10
    .line 11
    sget-object p2, Lz31;->a:Lz31;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwa0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 8

    .line 1
    new-instance v0, Lwa0;

    .line 2
    .line 3
    iget-wide v4, p0, Lwa0;->n:J

    .line 4
    .line 5
    iget-object v6, p0, Lwa0;->o:Lso1;

    .line 6
    .line 7
    iget-object v1, p0, Lwa0;->k:Leu0;

    .line 8
    .line 9
    iget-object v2, p0, Lwa0;->l:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 10
    .line 11
    iget-object v3, p0, Lwa0;->m:Lhy;

    .line 12
    .line 13
    move-object v7, p1

    .line 14
    invoke-direct/range {v0 .. v7}, Lwa0;-><init>(Leu0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lhy;JLso1;Loj;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lwa0;->k:Leu0;

    .line 4
    .line 5
    iget v0, v2, Leu0;->a:I

    .line 6
    .line 7
    iget v3, v1, Lwa0;->j:I

    .line 8
    .line 9
    iget-object v8, v1, Lwa0;->l:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 10
    .line 11
    sget-object v10, Lz31;->a:Lz31;

    .line 12
    .line 13
    const/4 v11, 0x5

    .line 14
    const/4 v12, 0x4

    .line 15
    const/4 v13, 0x3

    .line 16
    const/4 v4, 0x2

    .line 17
    iget-object v14, v1, Lwa0;->m:Lhy;

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v15, 0x0

    .line 21
    sget-object v6, Lrk;->f:Lrk;

    .line 22
    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    if-eq v3, v5, :cond_4

    .line 26
    .line 27
    if-eq v3, v4, :cond_3

    .line 28
    .line 29
    if-eq v3, v13, :cond_2

    .line 30
    .line 31
    if-eq v3, v12, :cond_1

    .line 32
    .line 33
    if-ne v3, v11, :cond_0

    .line 34
    .line 35
    :try_start_0
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_c

    .line 42
    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    :try_start_1
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :catch_0
    move-object v3, v6

    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :cond_2
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v0, p1

    .line 63
    .line 64
    move-object v3, v6

    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_3
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_4
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_5
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput v5, v1, Lwa0;->j:I

    .line 80
    .line 81
    :cond_6
    sget-object v3, Leu0;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 82
    .line 83
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-gt v3, v0, :cond_6

    .line 88
    .line 89
    if-lez v3, :cond_7

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_7
    invoke-static {v1}, Luk2;->r(Loj;)Loj;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v3}, Lm54;->j(Loj;)Lkd;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    :try_start_2
    invoke-virtual {v2, v3}, Leu0;->a(Lw71;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-nez v5, :cond_a

    .line 105
    .line 106
    :cond_8
    sget-object v5, Leu0;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 107
    .line 108
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-gt v5, v0, :cond_8

    .line 113
    .line 114
    if-lez v5, :cond_9

    .line 115
    .line 116
    iget-object v0, v2, Leu0;->b:Lcu0;

    .line 117
    .line 118
    invoke-virtual {v3, v10, v0}, Lkd;->k(Ljava/lang/Object;Ldy;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_9
    invoke-virtual {v2, v3}, Leu0;->a(Lw71;)Z

    .line 123
    .line 124
    .line 125
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    if-eqz v5, :cond_8

    .line 127
    .line 128
    :cond_a
    :goto_0
    invoke-virtual {v3}, Lkd;->t()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-ne v0, v6, :cond_b

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_b
    move-object v0, v10

    .line 136
    :goto_1
    if-ne v0, v6, :cond_c

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_c
    :goto_2
    move-object v0, v10

    .line 140
    :goto_3
    if-ne v0, v6, :cond_d

    .line 141
    .line 142
    :goto_4
    move-object v3, v6

    .line 143
    goto :goto_a

    .line 144
    :cond_d
    :goto_5
    :try_start_3
    iget-object v0, v8, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->Z:Lyn;

    .line 145
    .line 146
    if-eqz v0, :cond_12

    .line 147
    .line 148
    invoke-virtual {v0}, Lg40;->A()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    instance-of v3, v0, Lpg;

    .line 153
    .line 154
    if-nez v3, :cond_e

    .line 155
    .line 156
    instance-of v3, v0, Le40;

    .line 157
    .line 158
    if-eqz v3, :cond_f

    .line 159
    .line 160
    check-cast v0, Le40;

    .line 161
    .line 162
    invoke-virtual {v0}, Le40;->d()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_f

    .line 167
    .line 168
    :cond_e
    iput v4, v1, Lwa0;->j:I

    .line 169
    .line 170
    invoke-interface {v14, v15, v1}, Lhy;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-ne v0, v6, :cond_f

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_f
    :goto_6
    new-instance v4, Lva0;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 178
    .line 179
    move-object v0, v6

    .line 180
    :try_start_4
    iget-wide v5, v1, Lwa0;->n:J

    .line 181
    .line 182
    iget-object v7, v1, Lwa0;->o:Lso1;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 183
    .line 184
    const/4 v9, 0x0

    .line 185
    move-object v3, v0

    .line 186
    :try_start_5
    invoke-direct/range {v4 .. v9}, Lva0;-><init>(JLso1;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Loj;)V

    .line 187
    .line 188
    .line 189
    iput v13, v1, Lwa0;->j:I

    .line 190
    .line 191
    const-wide/32 v5, 0x1d4c0

    .line 192
    .line 193
    .line 194
    invoke-static {v5, v6, v4, v1}, Lpu1;->p(JLva0;Lqj;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-ne v0, v3, :cond_10

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_10
    :goto_7
    check-cast v0, Ld10;

    .line 202
    .line 203
    iput v12, v1, Lwa0;->j:I

    .line 204
    .line 205
    invoke-interface {v14, v0, v1}, Lhy;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    if-ne v0, v3, :cond_11

    .line 210
    .line 211
    goto :goto_a

    .line 212
    :cond_11
    :goto_8
    invoke-virtual {v2}, Leu0;->b()V

    .line 213
    .line 214
    .line 215
    return-object v10

    .line 216
    :catch_1
    move-object v3, v0

    .line 217
    goto :goto_9

    .line 218
    :cond_12
    move-object v3, v6

    .line 219
    :try_start_6
    const-string v0, "job"

    .line 220
    .line 221
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v15
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 225
    :catch_2
    :goto_9
    :try_start_7
    iput v11, v1, Lwa0;->j:I

    .line 226
    .line 227
    invoke-interface {v14, v15, v1}, Lhy;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 231
    if-ne v0, v3, :cond_13

    .line 232
    .line 233
    :goto_a
    return-object v3

    .line 234
    :cond_13
    :goto_b
    invoke-virtual {v2}, Leu0;->b()V

    .line 235
    .line 236
    .line 237
    return-object v10

    .line 238
    :goto_c
    invoke-virtual {v2}, Leu0;->b()V

    .line 239
    .line 240
    .line 241
    throw v0

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    invoke-virtual {v3}, Lkd;->A()V

    .line 244
    .line 245
    .line 246
    throw v0
.end method
