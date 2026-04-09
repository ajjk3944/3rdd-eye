.class public final La9;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La9;->f:I

    iput-object p2, p0, La9;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lub1;Lt3;)V
    .locals 0

    const/16 p1, 0x16

    iput p1, p0, La9;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La9;->g:Ljava/lang/Object;

    return-void
.end method

.method private final b()V
    .locals 5

    .line 1
    iget-object v0, p0, La9;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lps1;

    .line 4
    .line 5
    iget-object v1, v0, Lps1;->t:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, v0, Lps1;->u:Z

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iput-boolean v2, v0, Lps1;->u:Z

    .line 14
    .line 15
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    invoke-virtual {v0}, Lps1;->l()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    iget-object v1, p0, La9;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lps1;

    .line 24
    .line 25
    iget-object v1, v1, Lps1;->k:Lgd3;

    .line 26
    .line 27
    const/16 v2, 0x7e7

    .line 28
    .line 29
    const-wide/16 v3, -0x1

    .line 30
    .line 31
    invoke-virtual {v1, v2, v3, v4, v0}, Lgd3;->c(IJLjava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v0, p0, La9;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lps1;

    .line 37
    .line 38
    iget-object v2, v0, Lps1;->t:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v2

    .line 41
    const/4 v1, 0x0

    .line 42
    :try_start_2
    iput-boolean v1, v0, Lps1;->u:Z

    .line 43
    .line 44
    monitor-exit v2

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    throw v0

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :try_start_3
    monitor-exit v1

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    throw v0
.end method


# virtual methods
.method public a()Ljava/util/HashSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La9;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lo30;

    .line 9
    .line 10
    iget-object v1, v1, Lo30;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 11
    .line 12
    new-instance v2, Lts3;

    .line 13
    .line 14
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v2, v3, v4}, Lts3;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lpq0;->g(Llz0;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, La9;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lo30;

    .line 57
    .line 58
    iget-object v1, v1, Lo30;->f:Lpx;

    .line 59
    .line 60
    invoke-virtual {v1}, Lpx;->t()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object v0

    .line 64
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La9;->f:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lnt1;

    .line 16
    .line 17
    invoke-virtual {v0}, Lnt1;->c()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const-string v0, "Web view timed out."

    .line 22
    .line 23
    new-instance v3, Lah3;

    .line 24
    .line 25
    invoke-direct {v3, v0, v2}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lbw1;

    .line 31
    .line 32
    iget-object v0, v0, Lbw1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lyu1;

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v3}, Lah3;->a()Lbw;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Lyu1;->j(Lbw;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void

    .line 51
    :pswitch_1
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lqs1;

    .line 54
    .line 55
    iget-object v2, v0, Lqs1;->b:Ljava/lang/Boolean;

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    sget-object v2, Lqs1;->c:Landroid/os/ConditionVariable;

    .line 61
    .line 62
    monitor-enter v2

    .line 63
    :try_start_0
    iget-object v0, v0, Lqs1;->b:Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    :try_start_1
    sget-object v0, Lmz1;->L2:Lso1;

    .line 72
    .line 73
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    goto :goto_1

    .line 84
    :catch_0
    move v0, v6

    .line 85
    :goto_1
    if-eqz v0, :cond_3

    .line 86
    .line 87
    :try_start_2
    iget-object v3, v1, La9;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Lqs1;

    .line 90
    .line 91
    iget-object v3, v3, Lqs1;->a:Ljt1;

    .line 92
    .line 93
    iget-object v3, v3, Ljt1;->a:Landroid/content/Context;

    .line 94
    .line 95
    const-string v4, "ADSHIELD"

    .line 96
    .line 97
    invoke-static {v3, v4}, Lhe3;->a(Landroid/content/Context;Ljava/lang/String;)Lhe3;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sput-object v3, Lqs1;->d:Lhe3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    .line 103
    :cond_3
    move v6, v0

    .line 104
    :catchall_1
    :try_start_3
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lqs1;

    .line 107
    .line 108
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iput-object v3, v0, Lqs1;->b:Ljava/lang/Boolean;

    .line 113
    .line 114
    sget-object v0, Lqs1;->c:Landroid/os/ConditionVariable;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 117
    .line 118
    .line 119
    monitor-exit v2

    .line 120
    :goto_2
    return-void

    .line 121
    :goto_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    throw v0

    .line 123
    :pswitch_2
    invoke-direct {v1}, La9;->b()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_3
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lre1;

    .line 130
    .line 131
    iget-boolean v2, v0, Lre1;->m:Z

    .line 132
    .line 133
    if-eqz v2, :cond_4

    .line 134
    .line 135
    iget-object v0, v0, Lre1;->h:Landroid/app/Activity;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-void

    .line 141
    :pswitch_4
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Lae1;

    .line 144
    .line 145
    iget v2, v0, Lae1;->m:I

    .line 146
    .line 147
    add-int/lit8 v2, v2, -0x1

    .line 148
    .line 149
    iput v2, v0, Lae1;->m:I

    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_5
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lf74;

    .line 155
    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lf74;->p1()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_6
    throw v5

    .line 167
    :pswitch_7
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lkc1;

    .line 170
    .line 171
    iget-object v0, v0, Lkc1;->m:Lzb1;

    .line 172
    .line 173
    new-instance v3, Lrh;

    .line 174
    .line 175
    invoke-direct {v3, v2}, Lrh;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v3}, Lzb1;->a(Lrh;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_8
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Lz71;

    .line 185
    .line 186
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Lxb1;

    .line 189
    .line 190
    iget-object v0, v0, Lxb1;->g:Lv4;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const-string v3, " disconnecting because it was signed out."

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-interface {v0, v2}, Lv4;->d(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_9
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lxb1;

    .line 213
    .line 214
    invoke-virtual {v0}, Lxb1;->e()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_a
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v2, v0

    .line 221
    check-cast v2, Landroidx/work/Worker;

    .line 222
    .line 223
    :try_start_4
    invoke-virtual {v2}, Landroidx/work/Worker;->doWork()Lr70;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget-object v3, v2, Landroidx/work/Worker;->k:Lou0;

    .line 228
    .line 229
    invoke-virtual {v3, v0}, Lou0;->i(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :catchall_2
    move-exception v0

    .line 234
    iget-object v2, v2, Landroidx/work/Worker;->k:Lou0;

    .line 235
    .line 236
    invoke-virtual {v2, v0}, Lou0;->j(Ljava/lang/Throwable;)Z

    .line 237
    .line 238
    .line 239
    :goto_4
    return-void

    .line 240
    :pswitch_b
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Li61;

    .line 243
    .line 244
    invoke-virtual {v0, v6}, Li61;->n(I)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :pswitch_c
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Lf21;

    .line 251
    .line 252
    iget-object v2, v0, Lf21;->h:Landroid/view/Window$Callback;

    .line 253
    .line 254
    invoke-virtual {v0}, Lf21;->i0()Landroid/view/Menu;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    instance-of v3, v0, Lod0;

    .line 259
    .line 260
    if-eqz v3, :cond_5

    .line 261
    .line 262
    move-object v3, v0

    .line 263
    check-cast v3, Lod0;

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_5
    move-object v3, v5

    .line 267
    :goto_5
    if-eqz v3, :cond_6

    .line 268
    .line 269
    invoke-virtual {v3}, Lod0;->w()V

    .line 270
    .line 271
    .line 272
    :cond_6
    :try_start_5
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 273
    .line 274
    .line 275
    invoke-interface {v2, v6, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-eqz v4, :cond_7

    .line 280
    .line 281
    invoke-interface {v2, v6, v5, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-nez v2, :cond_8

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :catchall_3
    move-exception v0

    .line 289
    goto :goto_7

    .line 290
    :cond_7
    :goto_6
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 291
    .line 292
    .line 293
    :cond_8
    if-eqz v3, :cond_9

    .line 294
    .line 295
    invoke-virtual {v3}, Lod0;->v()V

    .line 296
    .line 297
    .line 298
    :cond_9
    return-void

    .line 299
    :goto_7
    if-eqz v3, :cond_a

    .line 300
    .line 301
    invoke-virtual {v3}, Lod0;->v()V

    .line 302
    .line 303
    .line 304
    :cond_a
    throw v0

    .line 305
    :pswitch_d
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :pswitch_e
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 316
    .line 317
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->h:Lus;

    .line 318
    .line 319
    iget-object v0, v0, Lus;->l:Lcom/google/android/material/internal/CheckableImageButton;

    .line 320
    .line 321
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :pswitch_f
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 331
    .line 332
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B0()Z

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :pswitch_10
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Lem0;

    .line 339
    .line 340
    invoke-virtual {v0}, Lem0;->j()V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_11
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Lbm0;

    .line 347
    .line 348
    iget-object v0, v0, Lbm0;->b0:Landroidx/recyclerview/widget/RecyclerView;

    .line 349
    .line 350
    invoke-virtual {v0, v0}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_12
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lnf0;

    .line 357
    .line 358
    iget-object v2, v0, Lnf0;->a:Ljava/lang/Object;

    .line 359
    .line 360
    monitor-enter v2

    .line 361
    :try_start_6
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lnf0;

    .line 364
    .line 365
    iget-object v0, v0, Lnf0;->f:Ljava/lang/Object;

    .line 366
    .line 367
    iget-object v3, v1, La9;->g:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v3, Lnf0;

    .line 370
    .line 371
    sget-object v4, Lnf0;->k:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v4, v3, Lnf0;->f:Ljava/lang/Object;

    .line 374
    .line 375
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 376
    iget-object v2, v1, La9;->g:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v2, Lnf0;

    .line 379
    .line 380
    invoke-virtual {v2, v0}, Lnf0;->d(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :catchall_4
    move-exception v0

    .line 385
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 386
    throw v0

    .line 387
    :pswitch_13
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lo30;

    .line 390
    .line 391
    iget-object v0, v0, Lo30;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 392
    .line 393
    iget-object v0, v0, Lpq0;->h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    :try_start_8
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 400
    .line 401
    .line 402
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lo30;

    .line 405
    .line 406
    invoke-virtual {v0}, Lo30;->a()Z

    .line 407
    .line 408
    .line 409
    move-result v0
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 410
    if-nez v0, :cond_b

    .line 411
    .line 412
    :goto_8
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_f

    .line 416
    .line 417
    :cond_b
    :try_start_9
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lo30;

    .line 420
    .line 421
    iget-object v0, v0, Lo30;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 422
    .line 423
    invoke-virtual {v0, v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-nez v0, :cond_c

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_c
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, Lo30;

    .line 433
    .line 434
    iget-object v0, v0, Lo30;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 435
    .line 436
    iget-object v0, v0, Lpq0;->c:Lkz0;

    .line 437
    .line 438
    invoke-interface {v0}, Lkz0;->j()Llx;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    iget-object v0, v0, Llx;->g:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 445
    .line 446
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_d

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_d
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lo30;

    .line 456
    .line 457
    iget-object v0, v0, Lo30;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 458
    .line 459
    iget-boolean v3, v0, Lpq0;->f:Z

    .line 460
    .line 461
    if-eqz v3, :cond_e

    .line 462
    .line 463
    iget-object v0, v0, Lpq0;->c:Lkz0;

    .line 464
    .line 465
    invoke-interface {v0}, Lkz0;->j()Llx;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v3}, Llx;->a()V
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 470
    .line 471
    .line 472
    :try_start_a
    invoke-virtual {v1}, La9;->a()Ljava/util/HashSet;

    .line 473
    .line 474
    .line 475
    move-result-object v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 476
    :try_start_b
    invoke-virtual {v3}, Llx;->q()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 477
    .line 478
    .line 479
    :try_start_c
    invoke-virtual {v3}, Llx;->k()V

    .line 480
    .line 481
    .line 482
    goto :goto_b

    .line 483
    :catchall_5
    move-exception v0

    .line 484
    goto :goto_10

    .line 485
    :catch_1
    move-exception v0

    .line 486
    goto :goto_c

    .line 487
    :catch_2
    move-exception v0

    .line 488
    goto :goto_c

    .line 489
    :catchall_6
    move-exception v0

    .line 490
    goto :goto_9

    .line 491
    :catchall_7
    move-exception v0

    .line 492
    move-object v4, v5

    .line 493
    :goto_9
    invoke-virtual {v3}, Llx;->k()V

    .line 494
    .line 495
    .line 496
    throw v0
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 497
    :catch_3
    move-exception v0

    .line 498
    :goto_a
    move-object v4, v5

    .line 499
    goto :goto_c

    .line 500
    :catch_4
    move-exception v0

    .line 501
    goto :goto_a

    .line 502
    :cond_e
    :try_start_d
    invoke-virtual {v1}, La9;->a()Ljava/util/HashSet;

    .line 503
    .line 504
    .line 505
    move-result-object v4
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 506
    :goto_b
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 507
    .line 508
    .line 509
    goto :goto_d

    .line 510
    :goto_c
    :try_start_e
    const-string v3, "ROOM"

    .line 511
    .line 512
    const-string v6, "Cannot run invalidation tracker. Is the db closed?"

    .line 513
    .line 514
    invoke-static {v3, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 515
    .line 516
    .line 517
    goto :goto_b

    .line 518
    :goto_d
    if-eqz v4, :cond_10

    .line 519
    .line 520
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-nez v0, :cond_10

    .line 525
    .line 526
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v0, Lo30;

    .line 529
    .line 530
    iget-object v2, v0, Lo30;->h:Los0;

    .line 531
    .line 532
    monitor-enter v2

    .line 533
    :try_start_f
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lo30;

    .line 536
    .line 537
    iget-object v0, v0, Lo30;->h:Los0;

    .line 538
    .line 539
    invoke-virtual {v0}, Los0;->iterator()Ljava/util/Iterator;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    check-cast v0, Lks0;

    .line 544
    .line 545
    invoke-virtual {v0}, Lks0;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    if-nez v3, :cond_f

    .line 550
    .line 551
    monitor-exit v2

    .line 552
    goto :goto_f

    .line 553
    :catchall_8
    move-exception v0

    .line 554
    goto :goto_e

    .line 555
    :cond_f
    invoke-virtual {v0}, Lks0;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    check-cast v0, Ljava/util/Map$Entry;

    .line 560
    .line 561
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    check-cast v0, Ln30;

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    throw v5

    .line 571
    :goto_e
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 572
    throw v0

    .line 573
    :cond_10
    :goto_f
    return-void

    .line 574
    :goto_10
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 575
    .line 576
    .line 577
    throw v0

    .line 578
    :pswitch_14
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Lxw;

    .line 581
    .line 582
    invoke-virtual {v0, v4}, Lxw;->y(Z)Z

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_15
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v0, Liu;

    .line 589
    .line 590
    iget-object v2, v0, Liu;->z:Landroid/animation/ValueAnimator;

    .line 591
    .line 592
    iget v5, v0, Liu;->A:I

    .line 593
    .line 594
    if-eq v5, v4, :cond_11

    .line 595
    .line 596
    if-eq v5, v3, :cond_12

    .line 597
    .line 598
    goto :goto_11

    .line 599
    :cond_11
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 600
    .line 601
    .line 602
    :cond_12
    const/4 v5, 0x3

    .line 603
    iput v5, v0, Liu;->A:I

    .line 604
    .line 605
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    check-cast v0, Ljava/lang/Float;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    new-array v3, v3, [F

    .line 616
    .line 617
    aput v0, v3, v6

    .line 618
    .line 619
    const/4 v0, 0x0

    .line 620
    aput v0, v3, v4

    .line 621
    .line 622
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 623
    .line 624
    .line 625
    const/16 v0, 0x1f4

    .line 626
    .line 627
    int-to-long v3, v0

    .line 628
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 632
    .line 633
    .line 634
    :goto_11
    return-void

    .line 635
    :pswitch_16
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v0, Lhr;

    .line 638
    .line 639
    invoke-virtual {v0}, Lhr;->V()V

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :pswitch_17
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v0, Lkq;

    .line 646
    .line 647
    iput-object v5, v0, Lkq;->q:La9;

    .line 648
    .line 649
    invoke-virtual {v0}, Lkq;->drawableStateChanged()V

    .line 650
    .line 651
    .line 652
    return-void

    .line 653
    :pswitch_18
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v0, Lxo;

    .line 656
    .line 657
    iget-object v2, v0, Lxo;->c0:Lvo;

    .line 658
    .line 659
    iget-object v0, v0, Lxo;->k0:Landroid/app/Dialog;

    .line 660
    .line 661
    invoke-virtual {v2, v0}, Lvo;->onDismiss(Landroid/content/DialogInterface;)V

    .line 662
    .line 663
    .line 664
    return-void

    .line 665
    :pswitch_19
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v0, Lqn;

    .line 668
    .line 669
    iget-object v2, v0, Lqn;->b:Landroid/view/ViewGroup;

    .line 670
    .line 671
    iget-object v3, v0, Lqn;->c:Landroid/view/View;

    .line 672
    .line 673
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 674
    .line 675
    .line 676
    iget-object v0, v0, Lqn;->d:Lrn;

    .line 677
    .line 678
    invoke-virtual {v0}, Le6;->e()V

    .line 679
    .line 680
    .line 681
    return-void

    .line 682
    :pswitch_1a
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 683
    .line 684
    move-object v2, v0

    .line 685
    check-cast v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getInputData()Lim;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    const-string v3, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 692
    .line 693
    invoke-virtual {v0, v3}, Lim;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-eqz v3, :cond_13

    .line 702
    .line 703
    invoke-static {}, Lh80;->d()Lh80;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Ljava/lang/String;

    .line 708
    .line 709
    const-string v4, "No worker to delegate to."

    .line 710
    .line 711
    new-array v5, v6, [Ljava/lang/Throwable;

    .line 712
    .line 713
    invoke-virtual {v0, v3, v4, v5}, Lh80;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 714
    .line 715
    .line 716
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 717
    .line 718
    new-instance v2, Lo70;

    .line 719
    .line 720
    invoke-direct {v2}, Lo70;-><init>()V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v0, v2}, Lou0;->i(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    goto/16 :goto_14

    .line 727
    .line 728
    :cond_13
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getWorkerFactory()Lva1;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    iget-object v5, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Landroidx/work/WorkerParameters;

    .line 737
    .line 738
    invoke-virtual {v3, v4, v0, v5}, Lva1;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    iput-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->o:Landroidx/work/ListenableWorker;

    .line 743
    .line 744
    if-nez v0, :cond_14

    .line 745
    .line 746
    invoke-static {}, Lh80;->d()Lh80;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Ljava/lang/String;

    .line 751
    .line 752
    new-array v3, v6, [Ljava/lang/Throwable;

    .line 753
    .line 754
    invoke-virtual {v0, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 755
    .line 756
    .line 757
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 758
    .line 759
    new-instance v2, Lo70;

    .line 760
    .line 761
    invoke-direct {v2}, Lo70;-><init>()V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v0, v2}, Lou0;->i(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    goto/16 :goto_14

    .line 768
    .line 769
    :cond_14
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-static {v0}, Lha1;->j0(Landroid/content/Context;)Lha1;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    iget-object v0, v0, Lha1;->r:Landroidx/work/impl/WorkDatabase;

    .line 778
    .line 779
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Lh2;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    invoke-virtual {v0, v3}, Lh2;->h(Ljava/lang/String;)Loa1;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    if-nez v0, :cond_15

    .line 796
    .line 797
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 798
    .line 799
    new-instance v2, Lo70;

    .line 800
    .line 801
    invoke-direct {v2}, Lo70;-><init>()V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0, v2}, Lou0;->i(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto/16 :goto_14

    .line 808
    .line 809
    :cond_15
    new-instance v3, Lv91;

    .line 810
    .line 811
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 812
    .line 813
    .line 814
    move-result-object v4

    .line 815
    invoke-virtual {v2}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->getTaskExecutor()Ll01;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    invoke-direct {v3, v4, v5, v2}, Lv91;-><init>(Landroid/content/Context;Ll01;Lu91;)V

    .line 820
    .line 821
    .line 822
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v3, v0}, Lv91;->b(Ljava/util/Collection;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v3, v0}, Lv91;->a(Ljava/lang/String;)Z

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    if-eqz v0, :cond_17

    .line 842
    .line 843
    invoke-static {}, Lh80;->d()Lh80;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Ljava/lang/String;

    .line 848
    .line 849
    new-array v3, v6, [Ljava/lang/Throwable;

    .line 850
    .line 851
    invoke-virtual {v0, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 852
    .line 853
    .line 854
    :try_start_10
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->o:Landroidx/work/ListenableWorker;

    .line 855
    .line 856
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->startWork()Ln70;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    new-instance v3, Ljq3;

    .line 861
    .line 862
    const/4 v4, 0x7

    .line 863
    invoke-direct {v3, v2, v0, v4, v6}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getBackgroundExecutor()Ljava/util/concurrent/Executor;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    invoke-interface {v0, v3, v4}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 871
    .line 872
    .line 873
    goto :goto_14

    .line 874
    :catchall_9
    move-exception v0

    .line 875
    invoke-static {}, Lh80;->d()Lh80;

    .line 876
    .line 877
    .line 878
    move-result-object v3

    .line 879
    sget-object v4, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Ljava/lang/String;

    .line 880
    .line 881
    filled-new-array {v0}, [Ljava/lang/Throwable;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    invoke-virtual {v3, v0}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 886
    .line 887
    .line 888
    iget-object v3, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/Object;

    .line 889
    .line 890
    monitor-enter v3

    .line 891
    :try_start_11
    iget-boolean v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Z

    .line 892
    .line 893
    if-eqz v0, :cond_16

    .line 894
    .line 895
    invoke-static {}, Lh80;->d()Lh80;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    new-array v4, v6, [Ljava/lang/Throwable;

    .line 900
    .line 901
    invoke-virtual {v0, v4}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 902
    .line 903
    .line 904
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 905
    .line 906
    new-instance v2, Lp70;

    .line 907
    .line 908
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v0, v2}, Lou0;->i(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    goto :goto_12

    .line 915
    :catchall_a
    move-exception v0

    .line 916
    goto :goto_13

    .line 917
    :cond_16
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 918
    .line 919
    new-instance v2, Lo70;

    .line 920
    .line 921
    invoke-direct {v2}, Lo70;-><init>()V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v0, v2}, Lou0;->i(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    :goto_12
    monitor-exit v3

    .line 928
    goto :goto_14

    .line 929
    :goto_13
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 930
    throw v0

    .line 931
    :cond_17
    invoke-static {}, Lh80;->d()Lh80;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->p:Ljava/lang/String;

    .line 936
    .line 937
    new-array v3, v6, [Ljava/lang/Throwable;

    .line 938
    .line 939
    invoke-virtual {v0, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 940
    .line 941
    .line 942
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 943
    .line 944
    new-instance v2, Lp70;

    .line 945
    .line 946
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v0, v2}, Lou0;->i(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    :goto_14
    return-void

    .line 953
    :pswitch_1b
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v0, Lrb;

    .line 956
    .line 957
    iput-boolean v6, v0, Lrb;->c:Z

    .line 958
    .line 959
    iget-object v2, v0, Lrb;->e:Ljava/lang/Object;

    .line 960
    .line 961
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 962
    .line 963
    iget-object v4, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O:Li61;

    .line 964
    .line 965
    if-eqz v4, :cond_18

    .line 966
    .line 967
    invoke-virtual {v4}, Li61;->f()Z

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    if-eqz v4, :cond_18

    .line 972
    .line 973
    iget v2, v0, Lrb;->b:I

    .line 974
    .line 975
    invoke-virtual {v0, v2}, Lrb;->a(I)V

    .line 976
    .line 977
    .line 978
    goto :goto_15

    .line 979
    :cond_18
    iget v4, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:I

    .line 980
    .line 981
    if-ne v4, v3, :cond_19

    .line 982
    .line 983
    iget v0, v0, Lrb;->b:I

    .line 984
    .line 985
    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 986
    .line 987
    .line 988
    :cond_19
    :goto_15
    return-void

    .line 989
    :pswitch_1c
    iget-object v0, v1, La9;->g:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v0, Lm70;

    .line 992
    .line 993
    iget-object v2, v0, Lm70;->h:Lkq;

    .line 994
    .line 995
    iget-object v3, v0, Lm70;->f:Lz8;

    .line 996
    .line 997
    iget-boolean v4, v0, Lm70;->t:Z

    .line 998
    .line 999
    if-nez v4, :cond_1a

    .line 1000
    .line 1001
    goto/16 :goto_17

    .line 1002
    .line 1003
    :cond_1a
    iget-boolean v4, v0, Lm70;->r:Z

    .line 1004
    .line 1005
    if-eqz v4, :cond_1b

    .line 1006
    .line 1007
    iput-boolean v6, v0, Lm70;->r:Z

    .line 1008
    .line 1009
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v4

    .line 1013
    iput-wide v4, v3, Lz8;->e:J

    .line 1014
    .line 1015
    const-wide/16 v7, -0x1

    .line 1016
    .line 1017
    iput-wide v7, v3, Lz8;->g:J

    .line 1018
    .line 1019
    iput-wide v4, v3, Lz8;->f:J

    .line 1020
    .line 1021
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1022
    .line 1023
    iput v4, v3, Lz8;->h:F

    .line 1024
    .line 1025
    :cond_1b
    iget-wide v4, v3, Lz8;->g:J

    .line 1026
    .line 1027
    const-wide/16 v7, 0x0

    .line 1028
    .line 1029
    cmp-long v4, v4, v7

    .line 1030
    .line 1031
    if-lez v4, :cond_1c

    .line 1032
    .line 1033
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1034
    .line 1035
    .line 1036
    move-result-wide v4

    .line 1037
    iget-wide v9, v3, Lz8;->g:J

    .line 1038
    .line 1039
    iget v11, v3, Lz8;->i:I

    .line 1040
    .line 1041
    int-to-long v11, v11

    .line 1042
    add-long/2addr v9, v11

    .line 1043
    cmp-long v4, v4, v9

    .line 1044
    .line 1045
    if-lez v4, :cond_1c

    .line 1046
    .line 1047
    goto :goto_16

    .line 1048
    :cond_1c
    invoke-virtual {v0}, Lm70;->e()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v4

    .line 1052
    if-nez v4, :cond_1d

    .line 1053
    .line 1054
    :goto_16
    iput-boolean v6, v0, Lm70;->t:Z

    .line 1055
    .line 1056
    goto :goto_17

    .line 1057
    :cond_1d
    iget-boolean v4, v0, Lm70;->s:Z

    .line 1058
    .line 1059
    if-eqz v4, :cond_1e

    .line 1060
    .line 1061
    iput-boolean v6, v0, Lm70;->s:Z

    .line 1062
    .line 1063
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1064
    .line 1065
    .line 1066
    move-result-wide v9

    .line 1067
    const/4 v15, 0x0

    .line 1068
    const/16 v16, 0x0

    .line 1069
    .line 1070
    const/4 v13, 0x3

    .line 1071
    const/4 v14, 0x0

    .line 1072
    move-wide v11, v9

    .line 1073
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v4

    .line 1077
    invoke-virtual {v2, v4}, Lkq;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 1081
    .line 1082
    .line 1083
    :cond_1e
    iget-wide v4, v3, Lz8;->f:J

    .line 1084
    .line 1085
    cmp-long v4, v4, v7

    .line 1086
    .line 1087
    if-eqz v4, :cond_1f

    .line 1088
    .line 1089
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1090
    .line 1091
    .line 1092
    move-result-wide v4

    .line 1093
    invoke-virtual {v3, v4, v5}, Lz8;->a(J)F

    .line 1094
    .line 1095
    .line 1096
    move-result v6

    .line 1097
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1098
    .line 1099
    mul-float/2addr v7, v6

    .line 1100
    mul-float/2addr v7, v6

    .line 1101
    const/high16 v8, 0x40800000    # 4.0f

    .line 1102
    .line 1103
    mul-float/2addr v6, v8

    .line 1104
    add-float/2addr v6, v7

    .line 1105
    iget-wide v7, v3, Lz8;->f:J

    .line 1106
    .line 1107
    sub-long v7, v4, v7

    .line 1108
    .line 1109
    iput-wide v4, v3, Lz8;->f:J

    .line 1110
    .line 1111
    long-to-float v4, v7

    .line 1112
    mul-float/2addr v4, v6

    .line 1113
    iget v3, v3, Lz8;->d:F

    .line 1114
    .line 1115
    mul-float/2addr v4, v3

    .line 1116
    float-to-int v3, v4

    .line 1117
    iget-object v0, v0, Lm70;->v:Lkq;

    .line 1118
    .line 1119
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1120
    .line 1121
    .line 1122
    sget-object v0, Le61;->a:Ljava/util/WeakHashMap;

    .line 1123
    .line 1124
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1125
    .line 1126
    .line 1127
    :goto_17
    return-void

    .line 1128
    :cond_1f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1129
    .line 1130
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 1131
    .line 1132
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    throw v0

    .line 1136
    nop

    .line 1137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
