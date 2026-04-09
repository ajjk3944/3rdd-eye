.class public Lfr;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lo41;
.implements Lgk;
.implements Lh81;
.implements Li64;
.implements Lee0;
.implements Lwl0;
.implements Lorg/slf4j/ILoggerFactory;
.implements Lqm0;


# static fields
.field public static final g:Lfr;

.field public static final synthetic h:Lfr;

.field public static final i:[Ljava/lang/String;

.field public static final synthetic j:Lfr;

.field public static final k:Lfr;

.field public static final l:Lfr;

.field public static final m:Lfr;

.field public static n:Ljavax/crypto/Cipher;

.field public static final o:Ljava/lang/Object;

.field public static final p:Ljava/lang/Object;

.field public static final q:Lfr;

.field public static final r:Lfr;

.field public static final s:Lfr;

.field public static t:Lfr;


# instance fields
.field public final synthetic f:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfr;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfr;->g:Lfr;

    .line 8
    .line 9
    new-instance v0, Lfr;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lfr;->h:Lfr;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    new-array v0, v0, [Ljava/lang/String;

    .line 19
    .line 20
    sput-object v0, Lfr;->i:[Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Lfr;

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lfr;->j:Lfr;

    .line 29
    .line 30
    new-instance v0, Lfr;

    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lfr;->k:Lfr;

    .line 37
    .line 38
    new-instance v0, Lfr;

    .line 39
    .line 40
    const/4 v1, 0x6

    .line 41
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lfr;->l:Lfr;

    .line 45
    .line 46
    new-instance v0, Lfr;

    .line 47
    .line 48
    const/4 v1, 0x7

    .line 49
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lfr;->m:Lfr;

    .line 53
    .line 54
    new-instance v0, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lfr;->o:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/Object;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lfr;->p:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v0, Lfr;

    .line 69
    .line 70
    const/16 v1, 0x9

    .line 71
    .line 72
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lfr;->q:Lfr;

    .line 76
    .line 77
    new-instance v0, Lfr;

    .line 78
    .line 79
    const/16 v1, 0xa

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 82
    .line 83
    .line 84
    sput-object v0, Lfr;->r:Lfr;

    .line 85
    .line 86
    new-instance v0, Lfr;

    .line 87
    .line 88
    const/16 v1, 0xb

    .line 89
    .line 90
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lfr;->s:Lfr;

    .line 94
    .line 95
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfr;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static c(Ljava/lang/String;)Llx;
    .locals 2

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    const-string v0, "GET"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/net/URLConnection;->connect()V

    .line 18
    .line 19
    .line 20
    new-instance v0, Llx;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, v1, p0}, Llx;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static n([B[B)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 3
    .line 4
    const-string v1, "AES"

    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lfr;->o:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :try_start_1
    invoke-static {}, Lfr;->q()Ljavax/crypto/Cipher;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lfr;->q()Ljavax/crypto/Cipher;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {}, Lfr;->q()Ljavax/crypto/Cipher;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljavax/crypto/Cipher;->getIV()[B

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :try_start_2
    array-length p0, p1

    .line 39
    array-length v1, v0

    .line 40
    add-int/2addr p0, v1

    .line 41
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 53
    .line 54
    .line 55
    new-array p0, p0, [B

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x2

    .line 61
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_2 .. :try_end_2} :catch_0

    .line 65
    return-object p0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljavax/crypto/BadPaddingException; {:try_start_4 .. :try_end_4} :catch_0

    .line 69
    :catch_0
    move-exception p0

    .line 70
    new-instance p1, Lat1;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :catch_1
    move-exception p0

    .line 77
    new-instance p1, Lat1;

    .line 78
    .line 79
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :catch_2
    move-exception p0

    .line 84
    new-instance p1, Lat1;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :catch_3
    move-exception p0

    .line 91
    new-instance p1, Lat1;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :catch_4
    move-exception p0

    .line 98
    new-instance p1, Lat1;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public static o(Landroid/content/Context;Le13;)Lpc4;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v13, v0, Le13;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, v0, Le13;->c:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v6, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v6, v3

    .line 26
    :goto_0
    invoke-static {}, Lf53;->d()Lf53;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v1, v1, Lf53;->g:Lpp0;

    .line 31
    .line 32
    sget-object v2, Lsv1;->f:Lsv1;

    .line 33
    .line 34
    iget-object v2, v2, Lsv1;->a:Lj63;

    .line 35
    .line 36
    iget-object v2, v0, Le13;->h:Ljava/util/Set;

    .line 37
    .line 38
    invoke-static/range {p0 .. p0}, Lj63;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v5, 0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object v1, v1, Lpp0;->a:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v1, v7

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    :goto_1
    move v1, v7

    .line 70
    move v7, v5

    .line 71
    :goto_2
    iget-object v2, v0, Le13;->d:Landroid/os/Bundle;

    .line 72
    .line 73
    const-class v4, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-object v10, v0, Le13;->e:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_9

    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v8}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    :goto_3
    add-int/lit8 v9, v1, 0x1

    .line 104
    .line 105
    array-length v11, v8

    .line 106
    if-ge v9, v11, :cond_5

    .line 107
    .line 108
    aget-object v1, v8, v1

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v12, "loadAd"

    .line 119
    .line 120
    invoke-virtual {v12, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    sget-object v1, Lj63;->c:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_3

    .line 133
    .line 134
    sget-object v1, Lj63;->d:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_3

    .line 141
    .line 142
    sget-object v1, Lj63;->e:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_3

    .line 149
    .line 150
    sget-object v1, Lj63;->f:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_3

    .line 157
    .line 158
    sget-object v1, Lj63;->g:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_3

    .line 165
    .line 166
    sget-object v1, Lj63;->h:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v1, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_4

    .line 173
    .line 174
    :cond_3
    aget-object v1, v8, v9

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    goto :goto_4

    .line 181
    :cond_4
    move v1, v9

    .line 182
    goto :goto_3

    .line 183
    :cond_5
    move-object v1, v3

    .line 184
    :goto_4
    if-eqz v2, :cond_8

    .line 185
    .line 186
    new-instance v8, Ljava/util/StringTokenizer;

    .line 187
    .line 188
    const-string v9, "."

    .line 189
    .line 190
    invoke-direct {v8, v2, v9}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    new-instance v11, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    if-eqz v12, :cond_7

    .line 203
    .line 204
    invoke-virtual {v8}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const/4 v2, 0x2

    .line 212
    :goto_5
    if-lez v2, :cond_6

    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    if-eqz v12, :cond_6

    .line 219
    .line 220
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    add-int/lit8 v2, v2, -0x1

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_6
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    :cond_7
    if-eqz v1, :cond_8

    .line 238
    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_8

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_8
    move-object v1, v3

    .line 247
    :goto_6
    move-object/from16 v18, v1

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_9
    move-object/from16 v18, v3

    .line 251
    .line 252
    :goto_7
    iget-boolean v1, v0, Le13;->k:Z

    .line 253
    .line 254
    invoke-static {}, Lf53;->d()Lf53;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iget-object v2, v2, Lf53;->g:Lpp0;

    .line 259
    .line 260
    iget v8, v0, Le13;->g:I

    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    const/4 v2, -0x1

    .line 266
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    const-string v2, ""

    .line 271
    .line 272
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    sget-object v3, Lbk;->i:Lbk;

    .line 281
    .line 282
    invoke-static {v2, v3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    move-object/from16 v22, v2

    .line 287
    .line 288
    check-cast v22, Ljava/lang/String;

    .line 289
    .line 290
    new-instance v2, Ljava/util/ArrayList;

    .line 291
    .line 292
    iget-object v3, v0, Le13;->b:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 295
    .line 296
    .line 297
    new-instance v3, Lpc4;

    .line 298
    .line 299
    iget-object v14, v0, Le13;->d:Landroid/os/Bundle;

    .line 300
    .line 301
    iget-object v15, v0, Le13;->i:Landroid/os/Bundle;

    .line 302
    .line 303
    new-instance v9, Ljava/util/ArrayList;

    .line 304
    .line 305
    iget-object v11, v0, Le13;->j:Ljava/util/Set;

    .line 306
    .line 307
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v16

    .line 314
    iget-object v9, v0, Le13;->f:Ljava/lang/String;

    .line 315
    .line 316
    iget v11, v0, Le13;->l:I

    .line 317
    .line 318
    invoke-static {v5}, Lex0;->s(I)I

    .line 319
    .line 320
    .line 321
    move-result v26

    .line 322
    move/from16 v19, v1

    .line 323
    .line 324
    iget-wide v0, v0, Le13;->m:J

    .line 325
    .line 326
    const-wide/16 v29, 0x0

    .line 327
    .line 328
    move-wide/from16 v27, v0

    .line 329
    .line 330
    const/16 v1, 0x8

    .line 331
    .line 332
    move-object/from16 v23, v2

    .line 333
    .line 334
    move-object v0, v3

    .line 335
    const-wide/16 v2, -0x1

    .line 336
    .line 337
    const/4 v5, -0x1

    .line 338
    move-object/from16 v17, v9

    .line 339
    .line 340
    const/4 v9, 0x0

    .line 341
    move/from16 v24, v11

    .line 342
    .line 343
    const/4 v11, 0x0

    .line 344
    const/4 v12, 0x0

    .line 345
    const/16 v20, 0x0

    .line 346
    .line 347
    const/16 v21, -0x1

    .line 348
    .line 349
    const/16 v25, 0x0

    .line 350
    .line 351
    invoke-direct/range {v0 .. v30}, Lpc4;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lqf3;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLec2;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 352
    .line 353
    .line 354
    return-object v0
.end method

.method public static p(Ljava/lang/String;[B)[B
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v0, 0x2

    .line 3
    :try_start_0
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    array-length v2, v1

    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-gtz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "Unable to decode "

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    :goto_0
    array-length p0, v1

    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    if-le p0, v2, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 42
    .line 43
    .line 44
    new-array v1, v2, [B

    .line 45
    .line 46
    add-int/lit8 p0, p0, -0x10

    .line 47
    .line 48
    new-array p0, p0, [B

    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 57
    .line 58
    const-string v3, "AES"

    .line 59
    .line 60
    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lfr;->o:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :try_start_1
    invoke-static {}, Lfr;->q()Ljavax/crypto/Cipher;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    .line 71
    .line 72
    invoke-direct {v4, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v0, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lfr;->q()Ljavax/crypto/Cipher;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    monitor-exit p1

    .line 87
    return-object p0

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :try_start_2
    throw p0

    .line 91
    :cond_2
    new-instance p0, Lat1;

    .line 92
    .line 93
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 94
    .line 95
    .line 96
    throw p0
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 97
    :catch_0
    move-exception p0

    .line 98
    goto :goto_1

    .line 99
    :catch_1
    move-exception p0

    .line 100
    goto :goto_2

    .line 101
    :catch_2
    move-exception p0

    .line 102
    goto :goto_3

    .line 103
    :catch_3
    move-exception p0

    .line 104
    goto :goto_4

    .line 105
    :catch_4
    move-exception p0

    .line 106
    goto :goto_5

    .line 107
    :catch_5
    move-exception p0

    .line 108
    goto :goto_6

    .line 109
    :catch_6
    move-exception p0

    .line 110
    goto :goto_7

    .line 111
    :goto_1
    new-instance p1, Lat1;

    .line 112
    .line 113
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :goto_2
    new-instance p1, Lat1;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :goto_3
    new-instance p1, Lat1;

    .line 124
    .line 125
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :goto_4
    new-instance p1, Lat1;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :goto_5
    new-instance p1, Lat1;

    .line 136
    .line 137
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    throw p1

    .line 141
    :goto_6
    new-instance p1, Lat1;

    .line 142
    .line 143
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :goto_7
    new-instance p1, Lat1;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method

.method public static final q()Ljavax/crypto/Cipher;
    .locals 2

    .line 1
    sget-object v0, Lfr;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lfr;->n:Ljavax/crypto/Cipher;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "AES/CBC/PKCS5Padding"

    .line 9
    .line 10
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, Lfr;->n:Ljavax/crypto/Cipher;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    sget-object v1, Lfr;->n:Ljavax/crypto/Cipher;

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v1

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
.end method

.method public static final t(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "javascript: "

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    :try_start_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/lit8 v1, v1, 0xc

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :catch_1
    move-exception p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Li80;
    .locals 0

    .line 1
    sget-object p1, Lvf0;->f:Lvf0;

    .line 2
    .line 3
    return-object p1
.end method

.method public b()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lfr;->i:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public d(FFFLk90;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p4, p1, p2}, Lk90;->d(FF)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public e(Landroid/content/Context;)Lf20;
    .locals 1

    .line 1
    sget-object v0, Lf20;->i:Lf20;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    sget-object v0, Lf20;->i:Lf20;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lf20;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lf20;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lf20;->i:Lf20;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :goto_1
    monitor-exit p0

    .line 23
    throw p1

    .line 24
    :cond_1
    return-object v0
.end method

.method public f(Lod0;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const-class v0, Lp54;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getProfileStore()Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "This should never happen, if this method was called it means we\'re trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public h(Landroidx/preference/Preference;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    check-cast p1, Landroidx/preference/ListPreference;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/preference/ListPreference;->Y:[Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget-object v1, p1, Landroidx/preference/ListPreference;->a0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroidx/preference/ListPreference;->y(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ltz v1, :cond_0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    aget-object v1, v0, v1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v2

    .line 20
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object p1, p1, Landroidx/preference/Preference;->f:Landroid/content/Context;

    .line 27
    .line 28
    const v0, 0x7f1200d9

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    iget-object v1, p1, Landroidx/preference/ListPreference;->a0:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroidx/preference/ListPreference;->y(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-ltz p1, :cond_2

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    aget-object p1, v0, p1

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    return-object v2
.end method

.method public i(ILjava/lang/Object;)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    if-eq p1, v1, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    if-eq p1, v1, :cond_0

    .line 41
    .line 42
    const/16 v1, 0x8

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string p1, "ProfileInstaller"

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-static {p1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public j(Ljava/lang/Class;)Lr64;
    .locals 3

    .line 1
    const-class v0, Lp54;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lp54;->t(Ljava/lang/Class;)Lp54;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x3

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v1, v2}, Lp54;->w(ILp54;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lr64;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    new-instance v1, Ljava/lang/RuntimeException;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v2, "Unable to get message info for "

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v1, "Unsupported message type: "

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method public k(Li40;F)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lfr;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Li40;->o()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Li40;->a()V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p1}, Li40;->l()D

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    double-to-float v0, v2

    .line 25
    invoke-virtual {p1}, Li40;->l()D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    double-to-float v2, v2

    .line 30
    :goto_1
    invoke-virtual {p1}, Li40;->i()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Li40;->s()V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Li40;->f()V

    .line 43
    .line 44
    .line 45
    :cond_3
    new-instance p1, Ldt0;

    .line 46
    .line 47
    const/high16 v1, 0x42c80000    # 100.0f

    .line 48
    .line 49
    div-float/2addr v0, v1

    .line 50
    mul-float/2addr v0, p2

    .line 51
    div-float/2addr v2, v1

    .line 52
    mul-float/2addr v2, p2

    .line 53
    invoke-direct {p1, v0, v2}, Ldt0;-><init>(FF)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :sswitch_0
    invoke-static {p1, p2}, Lk40;->b(Li40;F)Landroid/graphics/PointF;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :sswitch_1
    invoke-virtual {p1}, Li40;->o()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/4 v0, 0x1

    .line 67
    if-ne p2, v0, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const/4 v0, 0x0

    .line 71
    :goto_2
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Li40;->a()V

    .line 74
    .line 75
    .line 76
    :cond_5
    invoke-virtual {p1}, Li40;->l()D

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    invoke-virtual {p1}, Li40;->l()D

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    invoke-virtual {p1}, Li40;->l()D

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    invoke-virtual {p1}, Li40;->o()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    const/4 v7, 0x7

    .line 93
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 94
    .line 95
    if-ne p2, v7, :cond_6

    .line 96
    .line 97
    invoke-virtual {p1}, Li40;->l()D

    .line 98
    .line 99
    .line 100
    move-result-wide v10

    .line 101
    goto :goto_3

    .line 102
    :cond_6
    move-wide v10, v8

    .line 103
    :goto_3
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-virtual {p1}, Li40;->f()V

    .line 106
    .line 107
    .line 108
    :cond_7
    cmpg-double p1, v1, v8

    .line 109
    .line 110
    if-gtz p1, :cond_8

    .line 111
    .line 112
    cmpg-double p1, v3, v8

    .line 113
    .line 114
    if-gtz p1, :cond_8

    .line 115
    .line 116
    cmpg-double p1, v5, v8

    .line 117
    .line 118
    if-gtz p1, :cond_8

    .line 119
    .line 120
    const-wide p1, 0x406fe00000000000L    # 255.0

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    mul-double/2addr v1, p1

    .line 126
    mul-double/2addr v3, p1

    .line 127
    mul-double/2addr v5, p1

    .line 128
    cmpg-double v0, v10, v8

    .line 129
    .line 130
    if-gtz v0, :cond_8

    .line 131
    .line 132
    mul-double/2addr v10, p1

    .line 133
    :cond_8
    double-to-int p1, v10

    .line 134
    double-to-int p2, v1

    .line 135
    double-to-int v0, v3

    .line 136
    double-to-int v1, v5

    .line 137
    invoke-static {p1, p2, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    nop

    .line 147
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method public l(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
.end method

.method public m(Ll92;F)V
    .locals 5

    .line 1
    iget-object v0, p1, Ll92;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    check-cast v0, Luq0;

    .line 6
    .line 7
    iget-object v1, p1, Ll92;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lod;

    .line 10
    .line 11
    invoke-virtual {v1}, Lod;->getUseCompatPadding()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1}, Lod;->getPreventCornerOverlap()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget v4, v0, Luq0;->e:F

    .line 20
    .line 21
    cmpl-float v4, p2, v4

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    iget-boolean v4, v0, Luq0;->f:Z

    .line 26
    .line 27
    if-ne v4, v2, :cond_0

    .line 28
    .line 29
    iget-boolean v4, v0, Luq0;->g:Z

    .line 30
    .line 31
    if-ne v4, v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput p2, v0, Luq0;->e:F

    .line 35
    .line 36
    iput-boolean v2, v0, Luq0;->f:Z

    .line 37
    .line 38
    iput-boolean v3, v0, Luq0;->g:Z

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-virtual {v0, p2}, Luq0;->b(Landroid/graphics/Rect;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {v1}, Lod;->getUseCompatPadding()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-virtual {p1, p2, p2, p2, p2}, Ll92;->H(IIII)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    iget-object p2, p1, Ll92;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    check-cast p2, Luq0;

    .line 63
    .line 64
    iget v0, p2, Luq0;->e:F

    .line 65
    .line 66
    iget p2, p2, Luq0;->a:F

    .line 67
    .line 68
    invoke-virtual {v1}, Lod;->getPreventCornerOverlap()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v0, p2, v2}, Lvq0;->a(FFZ)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    float-to-double v2, v2

    .line 77
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    double-to-int v2, v2

    .line 82
    invoke-virtual {v1}, Lod;->getPreventCornerOverlap()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v0, p2, v1}, Lvq0;->b(FFZ)F

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    float-to-double v0, p2

    .line 91
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    double-to-int p2, v0

    .line 96
    invoke-virtual {p1, v2, p2, v2, p2}, Ll92;->H(IIII)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public r(Lod0;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public varargs s(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const/16 v1, 0x80

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "if(window.omidBridge!==undefined){omidBridge."

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p2, "("

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    array-length p2, p3

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-ge v1, p2, :cond_3

    .line 26
    .line 27
    aget-object v2, p3, v1

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    const-string v2, "null"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    instance-of v3, v2, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "{"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/16 v3, 0x22

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :goto_1
    const-string v2, ","

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    add-int/lit8 p2, p2, -0x1

    .line 85
    .line 86
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 87
    .line 88
    .line 89
    const-string p2, ")}"

    .line 90
    .line 91
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-nez p3, :cond_4

    .line 103
    .line 104
    new-instance p3, Landroid/os/Handler;

    .line 105
    .line 106
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-ne v0, v1, :cond_5

    .line 122
    .line 123
    invoke-static {p1, p2}, Lfr;->t(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_5
    new-instance v0, Lsz2;

    .line 128
    .line 129
    invoke-direct {v0, p0, p1, p2}, Lsz2;-><init>(Lfr;Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 133
    .line 134
    .line 135
    :cond_6
    return-void
.end method
