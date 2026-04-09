.class public final Lv71;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:[B

.field public l:I

.field public m:[I


# virtual methods
.method public final k(Lcm;)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iput-object v0, p0, Lv71;->k:[B

    .line 7
    .line 8
    invoke-virtual {p1}, Lcm;->i()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lv71;->l:I

    .line 13
    .line 14
    invoke-virtual {p1}, Lcm;->b()[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    array-length v3, p1

    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    move v3, v1

    .line 29
    :goto_1
    const/16 v4, 0x8

    .line 30
    .line 31
    if-ge v3, v4, :cond_1

    .line 32
    .line 33
    aget-byte v4, p1, v2

    .line 34
    .line 35
    and-int/lit16 v4, v4, 0xff

    .line 36
    .line 37
    rsub-int/lit8 v5, v3, 0x7

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    shl-int v5, v6, v5

    .line 41
    .line 42
    and-int/2addr v4, v5

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    mul-int/lit8 v4, v2, 0x8

    .line 46
    .line 47
    add-int/2addr v4, v3

    .line 48
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    new-array p1, p1, [I

    .line 66
    .line 67
    iput-object p1, p0, Lv71;->m:[I

    .line 68
    .line 69
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-ge v1, p1, :cond_3

    .line 74
    .line 75
    iget-object p1, p0, Lv71;->m:[I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    aput v2, p1, v1

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv71;->k:[B

    .line 7
    .line 8
    invoke-static {v1}, La30;->j([B)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v2, p0, Lv71;->l:I

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lv71;->m:[I

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    const/4 v4, 0x0

    .line 29
    :goto_0
    if-ge v4, v3, :cond_0

    .line 30
    .line 31
    aget v5, v2, v4

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 8

    .line 1
    iget-object p2, p0, Lv71;->k:[B

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->j([B)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lv71;->l:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lv71;->m:[I

    .line 12
    .line 13
    array-length p3, p2

    .line 14
    const/4 v0, 0x1

    .line 15
    sub-int/2addr p3, v0

    .line 16
    aget p3, p2, p3

    .line 17
    .line 18
    div-int/lit8 p3, p3, 0x8

    .line 19
    .line 20
    add-int/2addr p3, v0

    .line 21
    new-array v1, p3, [B

    .line 22
    .line 23
    array-length v2, p2

    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v4, v2, :cond_0

    .line 27
    .line 28
    aget v5, p2, v4

    .line 29
    .line 30
    div-int/lit8 v6, v5, 0x8

    .line 31
    .line 32
    aget-byte v7, v1, v6

    .line 33
    .line 34
    rem-int/lit8 v5, v5, 0x8

    .line 35
    .line 36
    rsub-int/lit8 v5, v5, 0x7

    .line 37
    .line 38
    shl-int v5, v0, v5

    .line 39
    .line 40
    or-int/2addr v5, v7

    .line 41
    int-to-byte v5, v5

    .line 42
    aput-byte v5, v1, v6

    .line 43
    .line 44
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p1, v1, v3, p3}, Lt3;->k([BII)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
