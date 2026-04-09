.class public final Le;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:Ljava/util/ArrayList;


# virtual methods
.method public final k(Lcm;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Le;->k:Ljava/util/ArrayList;

    .line 8
    .line 9
    :goto_0
    iget-object v0, p1, Lcm;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_8

    .line 18
    .line 19
    invoke-virtual {p1}, Lcm;->f()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lcm;->i()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p1}, Lcm;->i()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    and-int/lit16 v4, v3, 0x80

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    move v4, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v4, v5

    .line 39
    :goto_1
    and-int/lit16 v3, v3, -0x81

    .line 40
    .line 41
    invoke-virtual {p1, v3}, Lcm;->c(I)[B

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-ltz v2, :cond_7

    .line 46
    .line 47
    const/16 v6, 0x100

    .line 48
    .line 49
    if-ge v2, v6, :cond_7

    .line 50
    .line 51
    if-ne v0, v1, :cond_1

    .line 52
    .line 53
    const/16 v6, 0x20

    .line 54
    .line 55
    if-gt v2, v6, :cond_7

    .line 56
    .line 57
    :cond_1
    const/4 v6, 0x2

    .line 58
    if-ne v0, v6, :cond_2

    .line 59
    .line 60
    const/16 v7, 0x80

    .line 61
    .line 62
    if-gt v2, v7, :cond_7

    .line 63
    .line 64
    :cond_2
    if-eq v0, v1, :cond_4

    .line 65
    .line 66
    if-ne v0, v6, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    new-instance v5, Ld;

    .line 70
    .line 71
    invoke-direct {v5, v0, v4, v3, v2}, Ld;-><init>(IZLjava/io/Serializable;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    :goto_2
    invoke-static {v0}, La30;->a(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    array-length v6, v3

    .line 80
    if-gt v6, v0, :cond_6

    .line 81
    .line 82
    array-length v6, v3

    .line 83
    if-ne v6, v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    new-array v0, v0, [B

    .line 87
    .line 88
    array-length v6, v3

    .line 89
    invoke-static {v3, v5, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    .line 92
    move-object v3, v0

    .line 93
    :goto_3
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v5, Ld;

    .line 98
    .line 99
    invoke-static {v0}, La30;->d(Ljava/net/InetAddress;)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-direct {v5, v3, v4, v0, v2}, Ld;-><init>(IZLjava/io/Serializable;I)V

    .line 104
    .line 105
    .line 106
    :goto_4
    iget-object v0, p0, Le;->k:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    new-instance p1, Lt91;

    .line 113
    .line 114
    const-string v0, "invalid address length"

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_7
    new-instance p1, Lt91;

    .line 121
    .line 122
    const-string v0, "invalid prefix length"

    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_8
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Le;->k:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ld;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const-string v2, " "

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 7

    .line 1
    iget-object p2, p0, Le;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p3, :cond_5

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    check-cast v2, Ld;

    .line 18
    .line 19
    iget v3, v2, Ld;->f:I

    .line 20
    .line 21
    iget-object v4, v2, Ld;->i:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    if-eq v3, v5, :cond_1

    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    if-ne v3, v6, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    check-cast v4, [B

    .line 31
    .line 32
    array-length v3, v4

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    :goto_1
    check-cast v4, Ljava/net/InetAddress;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/net/InetAddress;->getAddress()[B

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    array-length v3, v4

    .line 41
    sub-int/2addr v3, v5

    .line 42
    :goto_2
    if-ltz v3, :cond_3

    .line 43
    .line 44
    aget-byte v5, v4, v3

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move v3, v0

    .line 55
    :goto_3
    iget-boolean v5, v2, Ld;->g:Z

    .line 56
    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    or-int/lit16 v5, v3, 0x80

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move v5, v3

    .line 63
    :goto_4
    iget v6, v2, Ld;->f:I

    .line 64
    .line 65
    invoke-virtual {p1, v6}, Lt3;->m(I)V

    .line 66
    .line 67
    .line 68
    iget v2, v2, Ld;->h:I

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Lt3;->q(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v5}, Lt3;->q(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v4, v0, v3}, Lt3;->k([BII)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    return-void
.end method
