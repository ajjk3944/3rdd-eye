.class public abstract Let3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lvv3;

.field public static final b:Ltv3;

.field public static final c:Lzu3;

.field public static final d:Lwu3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    .line 2
    .line 3
    invoke-static {v0}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ltv2;->z:Ltv2;

    .line 8
    .line 9
    new-instance v2, Lvv3;

    .line 10
    .line 11
    const-class v3, Ldt3;

    .line 12
    .line 13
    invoke-direct {v2, v3, v1}, Lvv3;-><init>(Ljava/lang/Class;Lwv3;)V

    .line 14
    .line 15
    .line 16
    sput-object v2, Let3;->a:Lvv3;

    .line 17
    .line 18
    sget-object v1, Lsu2;->w:Lsu2;

    .line 19
    .line 20
    new-instance v2, Ltv3;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Ltv3;-><init>(Lv34;Luv3;)V

    .line 23
    .line 24
    .line 25
    sput-object v2, Let3;->b:Ltv3;

    .line 26
    .line 27
    sget-object v1, Ltv2;->y:Ltv2;

    .line 28
    .line 29
    new-instance v2, Lzu3;

    .line 30
    .line 31
    const-class v3, Lct3;

    .line 32
    .line 33
    invoke-direct {v2, v3, v1}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Let3;->c:Lzu3;

    .line 37
    .line 38
    sget-object v1, Lsu2;->x:Lsu2;

    .line 39
    .line 40
    new-instance v2, Lwu3;

    .line 41
    .line 42
    invoke-direct {v2, v0, v1}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 43
    .line 44
    .line 45
    sput-object v2, Let3;->d:Lwu3;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Ler3;)Li04;
    .locals 2

    .line 1
    sget-object v0, Ler3;->k:Ler3;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Li04;->h:Li04;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ler3;->l:Ler3;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Li04;->j:Li04;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "Unable to serialize variant: "

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public static b(Ldt3;)Lh04;
    .locals 3

    .line 1
    iget-object v0, p0, Ldt3;->d:Ltr3;

    .line 2
    .line 3
    sget-object v1, Lrv3;->b:Lrv3;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lrv3;->h(Lmr3;)Lkw3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lgw3;

    .line 10
    .line 11
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lqz3;

    .line 14
    .line 15
    invoke-virtual {v0}, Ls44;->b()[B

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :try_start_0
    sget-object v1, Lh54;->a:Lh54;

    .line 20
    .line 21
    sget v1, Lu44;->a:I

    .line 22
    .line 23
    sget-object v1, Lh54;->b:Lh54;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lqz3;->D([BLh54;)Lqz3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {}, Lh04;->D()Lg04;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object p0, p0, Ldt3;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1}, Ln54;->b()V

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Ln54;->g:Lp54;

    .line 39
    .line 40
    check-cast v2, Lh04;

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Lh04;->F(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ln54;->b()V

    .line 46
    .line 47
    .line 48
    iget-object p0, v1, Ln54;->g:Lp54;

    .line 49
    .line 50
    check-cast p0, Lh04;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lh04;->G(Lqz3;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ln54;->d()Lp54;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lh04;
    :try_end_0
    .catch La64; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    return-object p0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 64
    .line 65
    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    .line 66
    .line 67
    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v0
.end method

.method public static c(Lh04;Li04;)Ldt3;
    .locals 12

    .line 1
    sget-object v0, Ler3;->l:Ler3;

    .line 2
    .line 3
    sget-object v1, Lz71;->o:Lz71;

    .line 4
    .line 5
    sget-object v2, Lz71;->n:Lz71;

    .line 6
    .line 7
    sget-object v3, Lz71;->m:Lz71;

    .line 8
    .line 9
    sget-object v4, Lz71;->k:Lz71;

    .line 10
    .line 11
    sget-object v5, Lz71;->l:Lz71;

    .line 12
    .line 13
    sget-object v6, Lz71;->j:Lz71;

    .line 14
    .line 15
    invoke-static {}, Lqz3;->E()Lpz3;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-virtual {p0}, Lh04;->B()Lqz3;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    invoke-virtual {v8}, Lqz3;->A()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v7, v8}, Lpz3;->g(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lh04;->B()Lqz3;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v8}, Lqz3;->B()La54;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v7, v8}, Lpz3;->h(La54;)V

    .line 39
    .line 40
    .line 41
    sget-object v8, Li04;->j:Li04;

    .line 42
    .line 43
    invoke-virtual {v7, v8}, Lpz3;->i(Li04;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7}, Ln54;->d()Lp54;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Lqz3;

    .line 51
    .line 52
    invoke-virtual {v7}, Ls44;->b()[B

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-static {v7}, Lwl2;->J([B)Lmr3;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    instance-of v8, v7, Lms3;

    .line 61
    .line 62
    if-eqz v8, :cond_0

    .line 63
    .line 64
    move-object v8, v6

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    instance-of v8, v7, Lus3;

    .line 67
    .line 68
    if-eqz v8, :cond_1

    .line 69
    .line 70
    move-object v8, v5

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    instance-of v8, v7, Lrt3;

    .line 73
    .line 74
    if-eqz v8, :cond_2

    .line 75
    .line 76
    move-object v8, v4

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    instance-of v8, v7, Lds3;

    .line 79
    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    move-object v8, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    instance-of v8, v7, Lhs3;

    .line 85
    .line 86
    if-eqz v8, :cond_4

    .line 87
    .line 88
    move-object v8, v2

    .line 89
    goto :goto_0

    .line 90
    :cond_4
    instance-of v8, v7, Lqs3;

    .line 91
    .line 92
    if-eqz v8, :cond_11

    .line 93
    .line 94
    move-object v8, v1

    .line 95
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    const/4 v10, 0x1

    .line 100
    if-eq v9, v10, :cond_6

    .line 101
    .line 102
    const/4 v11, 0x3

    .line 103
    if-ne v9, v11, :cond_5

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 107
    .line 108
    invoke-virtual {p1}, Li04;->a()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    add-int/lit8 v0, v0, 0x22

    .line 123
    .line 124
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 125
    .line 126
    .line 127
    const-string v0, "Unable to parse OutputPrefixType: "

    .line 128
    .line 129
    invoke-static {v1, v0, p1}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_6
    sget-object v0, Ler3;->k:Ler3;

    .line 138
    .line 139
    :goto_1
    invoke-virtual {p0}, Lh04;->A()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast v7, Ltr3;

    .line 144
    .line 145
    if-eqz p0, :cond_10

    .line 146
    .line 147
    if-eqz v7, :cond_f

    .line 148
    .line 149
    invoke-virtual {v7}, Lmr3;->a()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_e

    .line 154
    .line 155
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    instance-of p1, v7, Lms3;

    .line 162
    .line 163
    if-nez p1, :cond_c

    .line 164
    .line 165
    :cond_7
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    instance-of p1, v7, Lus3;

    .line 172
    .line 173
    if-nez p1, :cond_c

    .line 174
    .line 175
    :cond_8
    invoke-virtual {v8, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_9

    .line 180
    .line 181
    instance-of p1, v7, Lrt3;

    .line 182
    .line 183
    if-nez p1, :cond_c

    .line 184
    .line 185
    :cond_9
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_a

    .line 190
    .line 191
    instance-of p1, v7, Lds3;

    .line 192
    .line 193
    if-nez p1, :cond_c

    .line 194
    .line 195
    :cond_a
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_b

    .line 200
    .line 201
    instance-of p1, v7, Lhs3;

    .line 202
    .line 203
    if-nez p1, :cond_c

    .line 204
    .line 205
    :cond_b
    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_d

    .line 210
    .line 211
    instance-of p1, v7, Lqs3;

    .line 212
    .line 213
    if-eqz p1, :cond_d

    .line 214
    .line 215
    :cond_c
    new-instance p1, Ldt3;

    .line 216
    .line 217
    invoke-direct {p1, v0, p0, v8, v7}, Ldt3;-><init>(Ler3;Ljava/lang/String;Lz71;Ltr3;)V

    .line 218
    .line 219
    .line 220
    return-object p1

    .line 221
    :cond_d
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 222
    .line 223
    iget-object p1, v8, Lz71;->g:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    add-int/lit8 v1, v1, 0x43

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    add-int/2addr v2, v1

    .line 242
    new-instance v1, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    add-int/2addr v2, v10

    .line 245
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 246
    .line 247
    .line 248
    const-string v2, "Cannot use parsing strategy "

    .line 249
    .line 250
    const-string v3, " when new keys are picked according to "

    .line 251
    .line 252
    invoke-static {v1, v2, p1, v3, v0}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const-string p1, "."

    .line 256
    .line 257
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p0

    .line 268
    :cond_e
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 269
    .line 270
    const-string p1, "dekParametersForNewKeys must not have ID Requirements"

    .line 271
    .line 272
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw p0

    .line 276
    :cond_f
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 277
    .line 278
    const-string p1, "dekParametersForNewKeys must be set"

    .line 279
    .line 280
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p0

    .line 284
    :cond_10
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 285
    .line 286
    const-string p1, "kekUri must be set"

    .line 287
    .line 288
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw p0

    .line 292
    :cond_11
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 293
    .line 294
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    const-string v0, "Unsupported DEK parameters when parsing "

    .line 299
    .line 300
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    throw p0
.end method
