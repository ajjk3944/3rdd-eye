.class public final Lt03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbi2;Lu93;Lpq3;Lvz1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lt03;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt03;->b:Landroid/content/Context;

    iput-object p2, p0, Lt03;->c:Ljava/lang/Object;

    iput-object p3, p0, Lt03;->f:Ljava/lang/Object;

    iput-object p4, p0, Lt03;->e:Ljava/lang/Object;

    iput-object p5, p0, Lt03;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lei2;Lz73;Lmv2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lt03;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt03;->b:Landroid/content/Context;

    iput-object p3, p0, Lt03;->c:Ljava/lang/Object;

    iput-object p2, p0, Lt03;->d:Ljava/lang/Object;

    iput-object p4, p0, Lt03;->e:Ljava/lang/Object;

    iput-object p5, p0, Lt03;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 1

    .line 1
    iget p1, p0, Lt03;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lt03;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lvz1;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p2, La83;->s:Le83;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Le83;->a:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    return p1

    .line 24
    :pswitch_0
    iget-object p1, p0, Lt03;->b:Landroid/content/Context;

    .line 25
    .line 26
    instance-of v0, p1, Landroid/app/Activity;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lyz1;->a(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    :try_start_0
    iget-object p1, p2, La83;->v:Lorg/json/JSONObject;

    .line 37
    .line 38
    const-string p2, "tab_url"

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_1

    .line 45
    :catch_0
    const/4 p1, 0x0

    .line 46
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    :goto_2
    return p1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 10

    .line 1
    iget v0, p0, Lt03;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld23;

    .line 7
    .line 8
    new-instance v1, Landroid/view/View;

    .line 9
    .line 10
    iget-object v2, p0, Lt03;->b:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Ltv2;->i:Ltv2;

    .line 16
    .line 17
    iget-object v3, p2, La83;->u:Ljava/util/List;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lb83;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct {v0, v1, v4, v2, v3}, Lp21;-><init>(Landroid/view/View;Lag2;Ldl2;Lb83;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lxb4;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2, v4}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lt03;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lbi2;

    .line 38
    .line 39
    new-instance v2, Lai2;

    .line 40
    .line 41
    iget-object v3, p1, Lbi2;->d:Lth2;

    .line 42
    .line 43
    iget-object p1, p1, Lbi2;->e:Lbi2;

    .line 44
    .line 45
    invoke-direct {v2, v3, p1, v1, v0}, Lai2;-><init>(Lth2;Lbi2;Lxb4;Lp21;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Luz1;

    .line 49
    .line 50
    iget-object v0, v2, Lai2;->x:Lba4;

    .line 51
    .line 52
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v4, v0

    .line 57
    check-cast v4, Lsm2;

    .line 58
    .line 59
    iget-object v0, v2, Lai2;->A:Lba4;

    .line 60
    .line 61
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v5, v0

    .line 66
    check-cast v5, Lcn2;

    .line 67
    .line 68
    iget-object v0, v2, Lai2;->C:Lba4;

    .line 69
    .line 70
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v6, v0

    .line 75
    check-cast v6, Lyp2;

    .line 76
    .line 77
    iget-object v0, v2, Lai2;->L:Lba4;

    .line 78
    .line 79
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v7, v0

    .line 84
    check-cast v7, Lvp2;

    .line 85
    .line 86
    iget-object v0, v2, Lai2;->r:Lba4;

    .line 87
    .line 88
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v8, v0

    .line 93
    check-cast v8, Lxj2;

    .line 94
    .line 95
    new-instance v3, Lbu1;

    .line 96
    .line 97
    invoke-direct/range {v3 .. v8}, Lbu1;-><init>(Lsm2;Lcn2;Lyp2;Lvp2;Lxj2;)V

    .line 98
    .line 99
    .line 100
    iget-object p2, p2, La83;->s:Le83;

    .line 101
    .line 102
    iget-object v0, p2, Le83;->b:Ljava/lang/String;

    .line 103
    .line 104
    iget-object p2, p2, Le83;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-direct {p1, v3, v0, p2}, Luz1;-><init>(Lch3;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object p2, p0, Lt03;->f:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v4, p2

    .line 112
    check-cast v4, Lu93;

    .line 113
    .line 114
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    new-instance p2, Lmr2;

    .line 118
    .line 119
    const/4 v0, 0x6

    .line 120
    const/4 v1, 0x0

    .line 121
    invoke-direct {p2, p0, p1, v0, v1}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lt03;->e:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, Lpq3;

    .line 127
    .line 128
    new-instance v0, Lw53;

    .line 129
    .line 130
    const/4 v1, 0x3

    .line 131
    invoke-direct {v0, v1, p2}, Lw53;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v3, Lbu1;

    .line 135
    .line 136
    sget-object v7, Lu93;->d:Llq3;

    .line 137
    .line 138
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 139
    .line 140
    check-cast p1, Lld2;

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    const/4 v6, 0x0

    .line 147
    sget-object v5, Ls93;->v:Ls93;

    .line 148
    .line 149
    invoke-direct/range {v3 .. v9}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, v3, Lbu1;->l:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Lu93;

    .line 155
    .line 156
    invoke-virtual {v3}, Lbu1;->A()Lq93;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    sget-object v0, Ls93;->w:Ls93;

    .line 161
    .line 162
    invoke-virtual {p1, p2, v0}, Lu93;->a(Ln70;Ljava/lang/Object;)Lbu1;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {v2}, Lai2;->z()Lik2;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-static {p2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    new-instance v0, Lp62;

    .line 175
    .line 176
    const/4 v1, 0x1

    .line 177
    invoke-direct {v0, v1, p2}, Lp62;-><init>(ILn70;)V

    .line 178
    .line 179
    .line 180
    sget-object p2, Lmd2;->g:Lld2;

    .line 181
    .line 182
    new-instance v1, Lbu1;

    .line 183
    .line 184
    iget-object v2, p1, Lbu1;->k:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Ln70;

    .line 187
    .line 188
    iget-object v3, p1, Lbu1;->l:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v3, Lu93;

    .line 191
    .line 192
    move-object v4, v2

    .line 193
    move-object v2, v3

    .line 194
    iget-object v3, p1, Lbu1;->g:Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v5, p1, Lbu1;->h:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v5, Ljava/lang/String;

    .line 199
    .line 200
    iget-object v6, p1, Lbu1;->i:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v6, Ln70;

    .line 203
    .line 204
    iget-object p1, p1, Lbu1;->j:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p1, Ljava/util/List;

    .line 207
    .line 208
    invoke-static {v4, v0, p2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    move-object v4, v5

    .line 213
    move-object v5, v6

    .line 214
    move-object v6, p1

    .line 215
    invoke-direct/range {v1 .. v7}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lbu1;->A()Lq93;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    return-object p1

    .line 223
    :pswitch_0
    sget-object v0, Lmz1;->Sd:Liz1;

    .line 224
    .line 225
    sget-object v1, Ltw1;->e:Ltw1;

    .line 226
    .line 227
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 228
    .line 229
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_0

    .line 240
    .line 241
    iget-object v0, p0, Lt03;->f:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lmv2;

    .line 244
    .line 245
    invoke-virtual {v0}, Lmv2;->a()Llv2;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-string v1, "action"

    .line 250
    .line 251
    const-string v2, "cstm_tbs_rndr"

    .line 252
    .line 253
    invoke-virtual {v0, v1, v2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Llv2;->m()V

    .line 257
    .line 258
    .line 259
    :cond_0
    const/4 v0, 0x0

    .line 260
    :try_start_0
    iget-object v1, p2, La83;->v:Lorg/json/JSONObject;

    .line 261
    .line 262
    const-string v2, "tab_url"

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    goto :goto_0

    .line 269
    :catch_0
    move-object v1, v0

    .line 270
    :goto_0
    if-eqz v1, :cond_1

    .line 271
    .line 272
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    :cond_1
    move-object v3, v0

    .line 277
    iget-object v0, p1, Lh83;->b:Lp21;

    .line 278
    .line 279
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v6, v0

    .line 282
    check-cast v6, Lc83;

    .line 283
    .line 284
    sget-object v0, Llq3;->g:Llq3;

    .line 285
    .line 286
    new-instance v1, Ls03;

    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    move-object v2, p0

    .line 290
    move-object v4, p1

    .line 291
    move-object v5, p2

    .line 292
    invoke-direct/range {v1 .. v7}, Ls03;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 293
    .line 294
    .line 295
    iget-object p1, v2, Lt03;->d:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 298
    .line 299
    invoke-static {v0, v1, p1}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    return-object p1

    .line 304
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
