.class public final Ldu;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldu;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ldu;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    sget-object v0, Lm34;->b:Lm34;

    .line 8
    .line 9
    const-string v1, "AES/CTR/NOPADDING"

    .line 10
    .line 11
    iget-object v0, v0, Lm34;->a:Ll34;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    return-object v0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :pswitch_0
    :try_start_1
    sget-object v0, Lm34;->b:Lm34;

    .line 28
    .line 29
    const-string v1, "AES/CTR/NoPadding"

    .line 30
    .line 31
    iget-object v0, v0, Lm34;->a:Ll34;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljavax/crypto/Cipher;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 38
    .line 39
    return-object v0

    .line 40
    :catch_1
    move-exception v0

    .line 41
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :pswitch_1
    :try_start_2
    sget-object v0, Lm34;->b:Lm34;

    .line 48
    .line 49
    const-string v1, "AES/ECB/NoPadding"

    .line 50
    .line 51
    iget-object v0, v0, Lm34;->a:Ll34;

    .line 52
    .line 53
    invoke-interface {v0, v1}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljavax/crypto/Cipher;
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :catch_2
    move-exception v0

    .line 61
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :pswitch_2
    invoke-static {}, Lob1;->t()Ljava/security/Provider;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v2, "SHA1PRNG"

    .line 72
    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    :try_start_3
    invoke-static {v2, v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/SecureRandom;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_3
    .catch Ljava/security/GeneralSecurityException; {:try_start_3 .. :try_end_3} :catch_3

    .line 79
    goto :goto_0

    .line 80
    :catch_3
    :cond_0
    :try_start_4
    const-string v0, "org.conscrypt.Conscrypt"

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v3, "newProvider"

    .line 87
    .line 88
    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/security/Provider;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    .line 97
    .line 98
    move-object v1, v0

    .line 99
    :catch_4
    if-eqz v1, :cond_1

    .line 100
    .line 101
    :try_start_5
    invoke-static {v2, v1}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/SecureRandom;

    .line 102
    .line 103
    .line 104
    move-result-object v0
    :try_end_5
    .catch Ljava/security/GeneralSecurityException; {:try_start_5 .. :try_end_5} :catch_5

    .line 105
    goto :goto_0

    .line 106
    :catch_5
    :cond_1
    new-instance v0, Ljava/security/SecureRandom;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 109
    .line 110
    .line 111
    :goto_0
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_3
    :try_start_6
    sget-object v0, Lm34;->b:Lm34;

    .line 116
    .line 117
    const-string v2, "AES/GCM-SIV/NoPadding"

    .line 118
    .line 119
    iget-object v0, v0, Lm34;->a:Ll34;

    .line 120
    .line 121
    invoke-interface {v0, v2}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljavax/crypto/Cipher;

    .line 126
    .line 127
    invoke-static {v0}, Lzt3;->a(Ljavax/crypto/Cipher;)Z

    .line 128
    .line 129
    .line 130
    move-result v2
    :try_end_6
    .catch Ljava/security/GeneralSecurityException; {:try_start_6 .. :try_end_6} :catch_6

    .line 131
    if-nez v2, :cond_2

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    move-object v1, v0

    .line 135
    :goto_1
    return-object v1

    .line 136
    :catch_6
    move-exception v0

    .line 137
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :pswitch_4
    :try_start_7
    sget-object v0, Lm34;->b:Lm34;

    .line 144
    .line 145
    const-string v2, "ChaCha20-Poly1305"

    .line 146
    .line 147
    iget-object v0, v0, Lm34;->a:Ll34;

    .line 148
    .line 149
    invoke-interface {v0, v2}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljavax/crypto/Cipher;

    .line 154
    .line 155
    invoke-static {v0}, Lbu3;->a(Ljavax/crypto/Cipher;)Z

    .line 156
    .line 157
    .line 158
    move-result v2
    :try_end_7
    .catch Ljava/security/GeneralSecurityException; {:try_start_7 .. :try_end_7} :catch_7

    .line 159
    if-nez v2, :cond_3

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_3
    move-object v1, v0

    .line 163
    :catch_7
    :goto_2
    return-object v1

    .line 164
    :pswitch_5
    :try_start_8
    sget-object v0, Lm34;->b:Lm34;

    .line 165
    .line 166
    const-string v1, "AES/GCM/NoPadding"

    .line 167
    .line 168
    iget-object v0, v0, Lm34;->a:Ll34;

    .line 169
    .line 170
    invoke-interface {v0, v1}, Ll34;->l(Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljavax/crypto/Cipher;
    :try_end_8
    .catch Ljava/security/GeneralSecurityException; {:try_start_8 .. :try_end_8} :catch_8

    .line 175
    .line 176
    return-object v0

    .line 177
    :catch_8
    move-exception v0

    .line 178
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    throw v1

    .line 184
    :pswitch_6
    const-wide/16 v0, 0x0

    .line 185
    .line 186
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_7
    const/16 v0, 0x20

    .line 192
    .line 193
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_8
    const/4 v0, 0x4

    .line 199
    new-array v0, v0, [F

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_9
    new-instance v0, Landroid/graphics/Path;

    .line 203
    .line 204
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 205
    .line 206
    .line 207
    return-object v0

    .line 208
    :pswitch_a
    new-instance v0, Landroid/graphics/Path;

    .line 209
    .line 210
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_b
    new-instance v0, Landroid/graphics/PathMeasure;

    .line 215
    .line 216
    invoke-direct {v0}, Landroid/graphics/PathMeasure;-><init>()V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_c
    new-instance v0, Ljava/util/Random;

    .line 221
    .line 222
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 223
    .line 224
    .line 225
    return-object v0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
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
