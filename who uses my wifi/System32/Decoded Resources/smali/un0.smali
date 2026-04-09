.class public final Lun0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly50;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lun0;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lun0;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lb60;Lt50;)V
    .locals 8

    .line 1
    iget v0, p0, Lun0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lt50;->ON_CREATE:Lt50;

    .line 7
    .line 8
    if-ne p2, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lb60;->e()Ld60;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Ld60;->f(La60;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lun0;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lvs0;

    .line 20
    .line 21
    invoke-virtual {p1}, Lvs0;->b()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v0, "Next event must be ON_CREATE, it was "

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p2

    .line 49
    :pswitch_0
    sget-object p1, Lt50;->ON_STOP:Lt50;

    .line 50
    .line 51
    if-ne p2, p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p0, Lun0;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Liw;

    .line 56
    .line 57
    iget-object p1, p1, Liw;->J:Landroid/view/View;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void

    .line 65
    :pswitch_1
    new-instance p1, Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lun0;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, [Lvy;

    .line 73
    .line 74
    array-length p2, p1

    .line 75
    const/4 v0, 0x0

    .line 76
    const/4 v1, 0x0

    .line 77
    if-gtz p2, :cond_3

    .line 78
    .line 79
    array-length p2, p1

    .line 80
    if-gtz p2, :cond_2

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    aget-object p1, p1, v1

    .line 84
    .line 85
    throw v0

    .line 86
    :cond_3
    aget-object p1, p1, v1

    .line 87
    .line 88
    throw v0

    .line 89
    :pswitch_2
    iget-object p1, p0, Lun0;->g:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Li5;

    .line 92
    .line 93
    iget-object p2, p1, Lch;->j:Lq61;

    .line 94
    .line 95
    if-nez p2, :cond_5

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Lzg;

    .line 102
    .line 103
    if-eqz p2, :cond_4

    .line 104
    .line 105
    iget-object p2, p2, Lzg;->a:Lq61;

    .line 106
    .line 107
    iput-object p2, p1, Lch;->j:Lq61;

    .line 108
    .line 109
    :cond_4
    iget-object p2, p1, Lch;->j:Lq61;

    .line 110
    .line 111
    if-nez p2, :cond_5

    .line 112
    .line 113
    new-instance p2, Lq61;

    .line 114
    .line 115
    invoke-direct {p2}, Lq61;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object p2, p1, Lch;->j:Lq61;

    .line 119
    .line 120
    :cond_5
    iget-object p1, p1, Lch;->f:Ld60;

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Ld60;->f(La60;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_3
    iget-object v0, p0, Lun0;->g:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lat0;

    .line 129
    .line 130
    sget-object v1, Lt50;->ON_CREATE:Lt50;

    .line 131
    .line 132
    if-ne p2, v1, :cond_d

    .line 133
    .line 134
    invoke-interface {p1}, Lb60;->e()Ld60;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1, p0}, Ld60;->f(La60;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0}, Lat0;->a()Lvq2;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    const-string p2, "androidx.savedstate.Restarter"

    .line 146
    .line 147
    invoke-virtual {p1, p2}, Lvq2;->e(Ljava/lang/String;)Landroid/os/Bundle;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-nez p1, :cond_6

    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :cond_6
    const-string p2, "classes_to_restore"

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-eqz p1, :cond_c

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    const/4 v1, 0x0

    .line 168
    move v2, v1

    .line 169
    :cond_7
    :goto_0
    if-ge v2, p2, :cond_b

    .line 170
    .line 171
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    check-cast v3, Ljava/lang/String;

    .line 178
    .line 179
    const-string v4, "Class "

    .line 180
    .line 181
    :try_start_0
    const-class v5, Lun0;

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v3, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    const-class v6, Lxs0;

    .line 192
    .line 193
    invoke-virtual {v5, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {v5}, Li30;->j(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 198
    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 202
    .line 203
    .line 204
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 205
    const/4 v5, 0x1

    .line 206
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 207
    .line 208
    .line 209
    :try_start_2
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-static {v4}, Li30;->j(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    check-cast v4, Lxs0;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 217
    .line 218
    instance-of v3, v0, Lr61;

    .line 219
    .line 220
    if-eqz v3, :cond_a

    .line 221
    .line 222
    move-object v3, v0

    .line 223
    check-cast v3, Lr61;

    .line 224
    .line 225
    invoke-interface {v3}, Lr61;->d()Lq61;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-interface {v0}, Lat0;->a()Lvq2;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object v3, v3, Lq61;->a:Ljava/util/LinkedHashMap;

    .line 237
    .line 238
    new-instance v5, Ljava/util/HashSet;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-eqz v6, :cond_9

    .line 256
    .line 257
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, Ljava/lang/String;

    .line 262
    .line 263
    const-string v7, "key"

    .line 264
    .line 265
    invoke-static {v6, v7}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    check-cast v6, Lm61;

    .line 273
    .line 274
    if-nez v6, :cond_8

    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_8
    invoke-interface {v0}, Lb60;->e()Ld60;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-static {v6, v4, v7}, Li30;->f(Lm61;Lvq2;Ld60;)V

    .line 282
    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_9
    new-instance v5, Ljava/util/HashSet;

    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-nez v3, :cond_7

    .line 299
    .line 300
    invoke-virtual {v4}, Lvq2;->r()V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    .line 308
    .line 309
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw p2

    .line 329
    :catch_0
    move-exception p1

    .line 330
    new-instance p2, Ljava/lang/RuntimeException;

    .line 331
    .line 332
    new-instance v0, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v1, "Failed to instantiate "

    .line 335
    .line 336
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    throw p2

    .line 350
    :catch_1
    move-exception p1

    .line 351
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 352
    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 366
    .line 367
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 375
    .line 376
    .line 377
    throw p2

    .line 378
    :catch_2
    move-exception p1

    .line 379
    new-instance p2, Ljava/lang/RuntimeException;

    .line 380
    .line 381
    const-string v0, " wasn\'t found"

    .line 382
    .line 383
    invoke-static {v4, v3, v0}, Lex0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 388
    .line 389
    .line 390
    throw p2

    .line 391
    :cond_b
    :goto_2
    return-void

    .line 392
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 393
    .line 394
    const-string p2, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 395
    .line 396
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw p1

    .line 400
    :cond_d
    new-instance p1, Ljava/lang/AssertionError;

    .line 401
    .line 402
    const-string p2, "Next event must be ON_CREATE"

    .line 403
    .line 404
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    throw p1

    .line 408
    nop

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
