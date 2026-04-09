.class public final Lr83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public static final a([B[BLjava/lang/String;Ljv2;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    const/16 v1, 0xb

    .line 7
    .line 8
    :try_start_0
    invoke-static {p2, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 9
    .line 10
    .line 11
    move-result-object p2
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 12
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 13
    .line 14
    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    .line 17
    :try_start_2
    sget-object p2, Lh54;->a:Lh54;

    .line 18
    .line 19
    sget p2, Lu44;->a:I

    .line 20
    .line 21
    sget-object p2, Lh54;->b:Lh54;

    .line 22
    .line 23
    invoke-static {v1, p2}, Lvz3;->F(Ljava/io/ByteArrayInputStream;Lh54;)Lvz3;

    .line 24
    .line 25
    .line 26
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Ljr3;->a(Lvz3;)Ljr3;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p2

    .line 36
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 37
    .line 38
    .line 39
    throw p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_3 .. :try_end_3} :catch_1

    .line 40
    :catch_0
    :try_start_4
    new-instance p2, Ljava/security/GeneralSecurityException;

    .line 41
    .line 42
    const-string v1, "Parse keyset failed"

    .line 43
    .line 44
    invoke-direct {p2, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p2
    :try_end_4
    .catch Ljava/security/GeneralSecurityException; {:try_start_4 .. :try_end_4} :catch_1

    .line 48
    :catch_1
    move-exception p2

    .line 49
    const-string v1, "Failed to get keysethandle"

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lhg4;->C:Lhg4;

    .line 63
    .line 64
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 65
    .line 66
    const-string v2, "CryptoUtils.getHandle"

    .line 67
    .line 68
    invoke-virtual {v1, v2, p2}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p2, v0

    .line 72
    :goto_0
    if-eqz p2, :cond_1

    .line 73
    .line 74
    :try_start_5
    invoke-static {}, Lum;->E()Lsu3;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-class v2, Lcr3;

    .line 79
    .line 80
    invoke-virtual {p2, v1, v2}, Ljr3;->q(Lyc0;Ljava/lang/Class;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Lcr3;

    .line 85
    .line 86
    invoke-interface {p2, p0, p1}, Lcr3;->b([B[B)[B

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget-object p1, p3, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 91
    .line 92
    const-string p2, "ds"

    .line 93
    .line 94
    const-string v1, "1"

    .line 95
    .line 96
    invoke-virtual {p1, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    new-instance p1, Ljava/lang/String;

    .line 100
    .line 101
    const-string p2, "UTF-8"

    .line 102
    .line 103
    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_5
    .catch Ljava/security/GeneralSecurityException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5 .. :try_end_5} :catch_2

    .line 104
    .line 105
    .line 106
    return-object p1

    .line 107
    :catch_2
    move-exception p0

    .line 108
    goto :goto_1

    .line 109
    :catch_3
    move-exception p0

    .line 110
    goto :goto_1

    .line 111
    :catch_4
    move-exception p0

    .line 112
    :goto_1
    const-string p1, "Failed to decrypt "

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    sget-object p1, Lhg4;->C:Lhg4;

    .line 126
    .line 127
    iget-object p1, p1, Lhg4;->h:Lgd2;

    .line 128
    .line 129
    const-string p2, "CryptoUtils.decrypt"

    .line 130
    .line 131
    invoke-virtual {p1, p2, p0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p3, Ljv2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 135
    .line 136
    const-string p2, "dsf"

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p1, p2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :cond_1
    :goto_2
    return-object v0
.end method
