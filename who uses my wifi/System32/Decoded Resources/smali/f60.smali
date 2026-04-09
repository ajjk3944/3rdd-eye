.class public abstract Lf60;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf60;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lf60;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/reflect/Constructor;La60;)V
    .locals 0

    .line 1
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Li30;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/lang/ClassCastException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :catch_0
    move-exception p0

    .line 19
    new-instance p1, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :catch_1
    move-exception p0

    .line 26
    new-instance p1, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :catch_2
    move-exception p0

    .line 33
    new-instance p1, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public static b(Ljava/lang/Class;)I
    .locals 13

    .line 1
    sget-object v0, Lf60;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto/16 :goto_c

    .line 24
    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const-string v3, ""

    .line 42
    .line 43
    :goto_0
    invoke-static {v3}, Li30;->j(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-static {v4}, Li30;->j(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/2addr v5, v2

    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v5, "substring(...)"

    .line 66
    .line 67
    invoke-static {v4, v5}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-static {v4}, Li30;->j(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string v5, "."

    .line 74
    .line 75
    const-string v6, "_"

    .line 76
    .line 77
    invoke-static {v4, v5, v6}, Lsy0;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const-string v5, "_LifecycleAdapter"

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-nez v5, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const/16 v3, 0x2e

    .line 103
    .line 104
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :goto_2
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_5

    .line 131
    .line 132
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :catch_0
    move-exception p0

    .line 137
    new-instance v0, Ljava/lang/RuntimeException;

    .line 138
    .line 139
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :catch_1
    move-object v3, v1

    .line 144
    :cond_5
    :goto_3
    const/4 v4, 0x2

    .line 145
    sget-object v5, Lf60;->b:Ljava/util/HashMap;

    .line 146
    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    invoke-static {v3}, Lzt0;->o(Ljava/lang/Object;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v5, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :goto_4
    move v2, v4

    .line 157
    goto/16 :goto_c

    .line 158
    .line 159
    :cond_6
    sget-object v3, Llf;->c:Llf;

    .line 160
    .line 161
    iget-object v6, v3, Llf;->b:Ljava/util/HashMap;

    .line 162
    .line 163
    invoke-virtual {v6, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    check-cast v7, Ljava/lang/Boolean;

    .line 168
    .line 169
    const/4 v8, 0x0

    .line 170
    if-eqz v7, :cond_7

    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    goto :goto_6

    .line 177
    :cond_7
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_3

    .line 181
    array-length v9, v7

    .line 182
    move v10, v8

    .line 183
    :goto_5
    if-ge v10, v9, :cond_9

    .line 184
    .line 185
    aget-object v11, v7, v10

    .line 186
    .line 187
    const-class v12, Lhj0;

    .line 188
    .line 189
    invoke-virtual {v11, v12}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    check-cast v11, Lhj0;

    .line 194
    .line 195
    if-eqz v11, :cond_8

    .line 196
    .line 197
    invoke-virtual {v3, p0, v7}, Llf;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ljf;

    .line 198
    .line 199
    .line 200
    move v3, v2

    .line 201
    goto :goto_6

    .line 202
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_9
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v6, p0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move v3, v8

    .line 211
    :goto_6
    if-eqz v3, :cond_a

    .line 212
    .line 213
    goto/16 :goto_c

    .line 214
    .line 215
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    const-class v6, La60;

    .line 220
    .line 221
    if-eqz v3, :cond_b

    .line 222
    .line 223
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_b

    .line 228
    .line 229
    move v7, v2

    .line 230
    goto :goto_7

    .line 231
    :cond_b
    move v7, v8

    .line 232
    :goto_7
    if-eqz v7, :cond_d

    .line 233
    .line 234
    invoke-static {v3}, Li30;->j(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v3}, Lf60;->b(Ljava/lang/Class;)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-ne v1, v2, :cond_c

    .line 242
    .line 243
    goto/16 :goto_c

    .line 244
    .line 245
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v3}, Li30;->j(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    check-cast v3, Ljava/util/Collection;

    .line 255
    .line 256
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 257
    .line 258
    .line 259
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    const-string v7, "array"

    .line 264
    .line 265
    invoke-static {v3, v7}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    move v7, v8

    .line 269
    :goto_8
    array-length v9, v3

    .line 270
    if-ge v7, v9, :cond_e

    .line 271
    .line 272
    move v9, v2

    .line 273
    goto :goto_9

    .line 274
    :cond_e
    move v9, v8

    .line 275
    :goto_9
    if-eqz v9, :cond_13

    .line 276
    .line 277
    add-int/lit8 v9, v7, 0x1

    .line 278
    .line 279
    :try_start_2
    aget-object v7, v3, v7
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    .line 280
    .line 281
    if-eqz v7, :cond_f

    .line 282
    .line 283
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    if-eqz v10, :cond_f

    .line 288
    .line 289
    move v10, v2

    .line 290
    goto :goto_a

    .line 291
    :cond_f
    move v10, v8

    .line 292
    :goto_a
    if-nez v10, :cond_10

    .line 293
    .line 294
    :goto_b
    move v7, v9

    .line 295
    goto :goto_8

    .line 296
    :cond_10
    invoke-static {v7}, Li30;->j(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v7}, Lf60;->b(Ljava/lang/Class;)I

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    if-ne v10, v2, :cond_11

    .line 304
    .line 305
    goto :goto_c

    .line 306
    :cond_11
    if-nez v1, :cond_12

    .line 307
    .line 308
    new-instance v1, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 311
    .line 312
    .line 313
    :cond_12
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-static {v7}, Li30;->j(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    check-cast v7, Ljava/util/Collection;

    .line 321
    .line 322
    invoke-interface {v1, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_b

    .line 326
    :catch_2
    move-exception p0

    .line 327
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :cond_13
    if-eqz v1, :cond_14

    .line 338
    .line 339
    invoke-virtual {v5, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    goto/16 :goto_4

    .line 343
    .line 344
    :cond_14
    :goto_c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    return v2

    .line 352
    :catch_3
    move-exception p0

    .line 353
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 354
    .line 355
    const-string v1, "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."

    .line 356
    .line 357
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 358
    .line 359
    .line 360
    throw v0
.end method
