.class public final Lac;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lec;
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;
.implements Ljava/nio/channels/WritableByteChannel;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# instance fields
.field public f:Lxt0;

.field public g:J


# virtual methods
.method public final a(J)B
    .locals 6

    .line 1
    iget-wide v0, p0, Lac;->g:J

    .line 2
    .line 3
    const-wide/16 v4, 0x1

    .line 4
    .line 5
    move-wide v2, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lj41;->a(JJJ)V

    .line 7
    .line 8
    .line 9
    iget-wide p1, p0, Lac;->g:J

    .line 10
    .line 11
    sub-long v0, p1, v2

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lac;->f:Lxt0;

    .line 18
    .line 19
    :goto_0
    iget p2, p1, Lxt0;->c:I

    .line 20
    .line 21
    iget v0, p1, Lxt0;->b:I

    .line 22
    .line 23
    sub-int/2addr p2, v0

    .line 24
    int-to-long v4, p2

    .line 25
    cmp-long p2, v2, v4

    .line 26
    .line 27
    if-gez p2, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, Lxt0;->a:[B

    .line 30
    .line 31
    long-to-int p2, v2

    .line 32
    add-int/2addr v0, p2

    .line 33
    aget-byte p1, p1, v0

    .line 34
    .line 35
    return p1

    .line 36
    :cond_0
    sub-long/2addr v2, v4

    .line 37
    iget-object p1, p1, Lxt0;->f:Lxt0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sub-long p1, v2, p1

    .line 41
    .line 42
    iget-object v0, p0, Lac;->f:Lxt0;

    .line 43
    .line 44
    :cond_2
    iget-object v0, v0, Lxt0;->g:Lxt0;

    .line 45
    .line 46
    iget v1, v0, Lxt0;->c:I

    .line 47
    .line 48
    iget v2, v0, Lxt0;->b:I

    .line 49
    .line 50
    sub-int/2addr v1, v2

    .line 51
    int-to-long v3, v1

    .line 52
    add-long/2addr p1, v3

    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    cmp-long v1, p1, v3

    .line 56
    .line 57
    if-ltz v1, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Lxt0;->a:[B

    .line 60
    .line 61
    long-to-int p1, p1

    .line 62
    add-int/2addr v2, p1

    .line 63
    aget-byte p1, v0, v2

    .line 64
    .line 65
    return p1
.end method

.method public final b()Lac;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final c()B
    .locals 9

    .line 1
    iget-wide v0, p0, Lac;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, Lac;->f:Lxt0;

    .line 10
    .line 11
    iget v3, v2, Lxt0;->b:I

    .line 12
    .line 13
    iget v4, v2, Lxt0;->c:I

    .line 14
    .line 15
    iget-object v5, v2, Lxt0;->a:[B

    .line 16
    .line 17
    add-int/lit8 v6, v3, 0x1

    .line 18
    .line 19
    aget-byte v3, v5, v3

    .line 20
    .line 21
    const-wide/16 v7, 0x1

    .line 22
    .line 23
    sub-long/2addr v0, v7

    .line 24
    iput-wide v0, p0, Lac;->g:J

    .line 25
    .line 26
    if-ne v6, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lxt0;->a()Lxt0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lac;->f:Lxt0;

    .line 33
    .line 34
    invoke-static {v2}, Lzt0;->r(Lxt0;)V

    .line 35
    .line 36
    .line 37
    return v3

    .line 38
    :cond_0
    iput v6, v2, Lxt0;->b:I

    .line 39
    .line 40
    return v3

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v1, "size == 0"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lac;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lac;->g:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, p0, Lac;->f:Lxt0;

    .line 16
    .line 17
    invoke-virtual {v1}, Lxt0;->c()Lxt0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lac;->f:Lxt0;

    .line 22
    .line 23
    iput-object v1, v1, Lxt0;->g:Lxt0;

    .line 24
    .line 25
    iput-object v1, v1, Lxt0;->f:Lxt0;

    .line 26
    .line 27
    iget-object v1, p0, Lac;->f:Lxt0;

    .line 28
    .line 29
    :goto_0
    iget-object v1, v1, Lxt0;->f:Lxt0;

    .line 30
    .line 31
    iget-object v2, p0, Lac;->f:Lxt0;

    .line 32
    .line 33
    if-eq v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v2, v0, Lac;->f:Lxt0;

    .line 36
    .line 37
    iget-object v2, v2, Lxt0;->g:Lxt0;

    .line 38
    .line 39
    invoke-virtual {v1}, Lxt0;->c()Lxt0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v2, v3}, Lxt0;->b(Lxt0;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-wide v1, p0, Lac;->g:J

    .line 48
    .line 49
    iput-wide v1, v0, Lac;->g:J

    .line 50
    .line 51
    return-object v0
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lac;->g:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final e(Lac;J)J
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v2, p2, v0

    .line 6
    .line 7
    if-ltz v2, :cond_2

    .line 8
    .line 9
    iget-wide v2, p0, Lac;->g:J

    .line 10
    .line 11
    cmp-long v0, v2, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-wide/16 p1, -0x1

    .line 16
    .line 17
    return-wide p1

    .line 18
    :cond_0
    cmp-long v0, p2, v2

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    move-wide p2, v2

    .line 23
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lac;->k(Lac;J)V

    .line 24
    .line 25
    .line 26
    return-wide p2

    .line 27
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "byteCount < 0: "

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string p2, "sink == null"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lac;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lac;

    .line 12
    .line 13
    iget-wide v3, p0, Lac;->g:J

    .line 14
    .line 15
    iget-wide v5, p1, Lac;->g:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v1, v3, v5

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    return v0

    .line 29
    :cond_3
    iget-object v1, p0, Lac;->f:Lxt0;

    .line 30
    .line 31
    iget-object p1, p1, Lac;->f:Lxt0;

    .line 32
    .line 33
    iget v3, v1, Lxt0;->b:I

    .line 34
    .line 35
    iget v4, p1, Lxt0;->b:I

    .line 36
    .line 37
    :goto_0
    iget-wide v7, p0, Lac;->g:J

    .line 38
    .line 39
    cmp-long v7, v5, v7

    .line 40
    .line 41
    if-gez v7, :cond_8

    .line 42
    .line 43
    iget v7, v1, Lxt0;->c:I

    .line 44
    .line 45
    sub-int/2addr v7, v3

    .line 46
    iget v8, p1, Lxt0;->c:I

    .line 47
    .line 48
    sub-int/2addr v8, v4

    .line 49
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    int-to-long v7, v7

    .line 54
    move v9, v2

    .line 55
    :goto_1
    int-to-long v10, v9

    .line 56
    cmp-long v10, v10, v7

    .line 57
    .line 58
    if-gez v10, :cond_5

    .line 59
    .line 60
    iget-object v10, v1, Lxt0;->a:[B

    .line 61
    .line 62
    add-int/lit8 v11, v3, 0x1

    .line 63
    .line 64
    aget-byte v3, v10, v3

    .line 65
    .line 66
    iget-object v10, p1, Lxt0;->a:[B

    .line 67
    .line 68
    add-int/lit8 v12, v4, 0x1

    .line 69
    .line 70
    aget-byte v4, v10, v4

    .line 71
    .line 72
    if-eq v3, v4, :cond_4

    .line 73
    .line 74
    return v2

    .line 75
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 76
    .line 77
    move v3, v11

    .line 78
    move v4, v12

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    iget v9, v1, Lxt0;->c:I

    .line 81
    .line 82
    if-ne v3, v9, :cond_6

    .line 83
    .line 84
    iget-object v1, v1, Lxt0;->f:Lxt0;

    .line 85
    .line 86
    iget v3, v1, Lxt0;->b:I

    .line 87
    .line 88
    :cond_6
    iget v9, p1, Lxt0;->c:I

    .line 89
    .line 90
    if-ne v4, v9, :cond_7

    .line 91
    .line 92
    iget-object p1, p1, Lxt0;->f:Lxt0;

    .line 93
    .line 94
    iget v4, p1, Lxt0;->b:I

    .line 95
    .line 96
    :cond_7
    add-long/2addr v5, v7

    .line 97
    goto :goto_0

    .line 98
    :cond_8
    return v0
.end method

.method public final f(J)[B
    .locals 6

    .line 1
    iget-wide v0, p0, Lac;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    move-wide v4, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lj41;->a(JJJ)V

    .line 7
    .line 8
    .line 9
    const-wide/32 p1, 0x7fffffff

    .line 10
    .line 11
    .line 12
    cmp-long p1, v4, p1

    .line 13
    .line 14
    if-gtz p1, :cond_2

    .line 15
    .line 16
    long-to-int p1, v4

    .line 17
    new-array p2, p1, [B

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-ge v0, p1, :cond_1

    .line 21
    .line 22
    sub-int v1, p1, v0

    .line 23
    .line 24
    invoke-virtual {p0, p2, v0, v1}, Lac;->read([BII)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, -0x1

    .line 29
    if-eq v1, v2, :cond_0

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    return-object p2

    .line 40
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "byteCount > Integer.MAX_VALUE: "

    .line 45
    .line 46
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Lac;->g:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    move-wide v4, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lj41;->a(JJJ)V

    .line 7
    .line 8
    .line 9
    if-eqz p3, :cond_4

    .line 10
    .line 11
    const-wide/32 p1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    cmp-long p1, v4, p1

    .line 15
    .line 16
    if-gtz p1, :cond_3

    .line 17
    .line 18
    const-wide/16 p1, 0x0

    .line 19
    .line 20
    cmp-long p1, v4, p1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const-string p1, ""

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    iget-object p1, p0, Lac;->f:Lxt0;

    .line 28
    .line 29
    iget p2, p1, Lxt0;->b:I

    .line 30
    .line 31
    int-to-long v0, p2

    .line 32
    add-long/2addr v0, v4

    .line 33
    iget v2, p1, Lxt0;->c:I

    .line 34
    .line 35
    int-to-long v2, v2

    .line 36
    cmp-long v0, v0, v2

    .line 37
    .line 38
    if-lez v0, :cond_1

    .line 39
    .line 40
    new-instance p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0, v4, v5}, Lac;->f(J)[B

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p1, p2, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, Lxt0;->a:[B

    .line 53
    .line 54
    long-to-int v2, v4

    .line 55
    invoke-direct {v0, v1, p2, v2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 56
    .line 57
    .line 58
    iget p2, p1, Lxt0;->b:I

    .line 59
    .line 60
    int-to-long p2, p2

    .line 61
    add-long/2addr p2, v4

    .line 62
    long-to-int p2, p2

    .line 63
    iput p2, p1, Lxt0;->b:I

    .line 64
    .line 65
    iget-wide v1, p0, Lac;->g:J

    .line 66
    .line 67
    sub-long/2addr v1, v4

    .line 68
    iput-wide v1, p0, Lac;->g:J

    .line 69
    .line 70
    iget p3, p1, Lxt0;->c:I

    .line 71
    .line 72
    if-ne p2, p3, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1}, Lxt0;->a()Lxt0;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iput-object p2, p0, Lac;->f:Lxt0;

    .line 79
    .line 80
    invoke-static {p1}, Lzt0;->r(Lxt0;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-object v0

    .line 84
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string p3, "byteCount > Integer.MAX_VALUE: "

    .line 89
    .line 90
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    const-string p2, "charset == null"

    .line 107
    .line 108
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method

.method public final h(J)V
    .locals 5

    .line 1
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lac;->f:Lxt0;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, v0, Lxt0;->c:I

    .line 12
    .line 13
    iget v0, v0, Lxt0;->b:I

    .line 14
    .line 15
    sub-int/2addr v1, v0

    .line 16
    int-to-long v0, v1

    .line 17
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    long-to-int v0, v0

    .line 22
    iget-wide v1, p0, Lac;->g:J

    .line 23
    .line 24
    int-to-long v3, v0

    .line 25
    sub-long/2addr v1, v3

    .line 26
    iput-wide v1, p0, Lac;->g:J

    .line 27
    .line 28
    sub-long/2addr p1, v3

    .line 29
    iget-object v1, p0, Lac;->f:Lxt0;

    .line 30
    .line 31
    iget v2, v1, Lxt0;->b:I

    .line 32
    .line 33
    add-int/2addr v2, v0

    .line 34
    iput v2, v1, Lxt0;->b:I

    .line 35
    .line 36
    iget v0, v1, Lxt0;->c:I

    .line 37
    .line 38
    if-ne v2, v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Lxt0;->a()Lxt0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lac;->f:Lxt0;

    .line 45
    .line 46
    invoke-static {v1}, Lzt0;->r(Lxt0;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lac;->f:Lxt0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x1

    .line 8
    :cond_1
    iget v2, v0, Lxt0;->b:I

    .line 9
    .line 10
    iget v3, v0, Lxt0;->c:I

    .line 11
    .line 12
    :goto_0
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v4, v0, Lxt0;->a:[B

    .line 17
    .line 18
    aget-byte v4, v4, v2

    .line 19
    .line 20
    add-int/2addr v1, v4

    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, v0, Lxt0;->f:Lxt0;

    .line 25
    .line 26
    iget-object v2, p0, Lac;->f:Lxt0;

    .line 27
    .line 28
    if-ne v0, v2, :cond_1

    .line 29
    .line 30
    return v1
.end method

.method public final i(I)Lxt0;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_3

    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    if-gt p1, v0, :cond_3

    .line 7
    .line 8
    iget-object v1, p0, Lac;->f:Lxt0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lzt0;->x()Lxt0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lac;->f:Lxt0;

    .line 17
    .line 18
    iput-object p1, p1, Lxt0;->g:Lxt0;

    .line 19
    .line 20
    iput-object p1, p1, Lxt0;->f:Lxt0;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object v1, v1, Lxt0;->g:Lxt0;

    .line 24
    .line 25
    iget v2, v1, Lxt0;->c:I

    .line 26
    .line 27
    add-int/2addr v2, p1

    .line 28
    if-gt v2, v0, :cond_2

    .line 29
    .line 30
    iget-boolean p1, v1, Lxt0;->e:Z

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object v1

    .line 36
    :cond_2
    :goto_0
    invoke-static {}, Lzt0;->x()Lxt0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v1, p1}, Lxt0;->b(Lxt0;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k(Lac;J)V
    .locals 8

    .line 1
    if-eq p1, p0, :cond_c

    .line 2
    .line 3
    iget-wide v0, p1, Lac;->g:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    move-wide v4, p2

    .line 8
    invoke-static/range {v0 .. v5}, Lj41;->a(JJJ)V

    .line 9
    .line 10
    .line 11
    :goto_0
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long v0, p2, v0

    .line 14
    .line 15
    if-lez v0, :cond_b

    .line 16
    .line 17
    iget-object v0, p1, Lac;->f:Lxt0;

    .line 18
    .line 19
    iget v1, v0, Lxt0;->c:I

    .line 20
    .line 21
    iget v2, v0, Lxt0;->b:I

    .line 22
    .line 23
    sub-int/2addr v1, v2

    .line 24
    int-to-long v2, v1

    .line 25
    cmp-long v2, p2, v2

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-gez v2, :cond_5

    .line 29
    .line 30
    iget-object v2, p0, Lac;->f:Lxt0;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v2, Lxt0;->g:Lxt0;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    :goto_1
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-boolean v4, v2, Lxt0;->e:Z

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    iget v4, v2, Lxt0;->c:I

    .line 45
    .line 46
    int-to-long v4, v4

    .line 47
    add-long/2addr v4, p2

    .line 48
    iget-boolean v6, v2, Lxt0;->d:Z

    .line 49
    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    move v6, v3

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    iget v6, v2, Lxt0;->b:I

    .line 55
    .line 56
    :goto_2
    int-to-long v6, v6

    .line 57
    sub-long/2addr v4, v6

    .line 58
    const-wide/16 v6, 0x2000

    .line 59
    .line 60
    cmp-long v4, v4, v6

    .line 61
    .line 62
    if-gtz v4, :cond_2

    .line 63
    .line 64
    long-to-int v1, p2

    .line 65
    invoke-virtual {v0, v2, v1}, Lxt0;->d(Lxt0;I)V

    .line 66
    .line 67
    .line 68
    iget-wide v0, p1, Lac;->g:J

    .line 69
    .line 70
    sub-long/2addr v0, p2

    .line 71
    iput-wide v0, p1, Lac;->g:J

    .line 72
    .line 73
    iget-wide v0, p0, Lac;->g:J

    .line 74
    .line 75
    add-long/2addr v0, p2

    .line 76
    iput-wide v0, p0, Lac;->g:J

    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    long-to-int v2, p2

    .line 80
    if-lez v2, :cond_4

    .line 81
    .line 82
    if-gt v2, v1, :cond_4

    .line 83
    .line 84
    const/16 v1, 0x400

    .line 85
    .line 86
    if-lt v2, v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0}, Lxt0;->c()Lxt0;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    invoke-static {}, Lzt0;->x()Lxt0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v4, v0, Lxt0;->a:[B

    .line 98
    .line 99
    iget v5, v0, Lxt0;->b:I

    .line 100
    .line 101
    iget-object v6, v1, Lxt0;->a:[B

    .line 102
    .line 103
    invoke-static {v4, v5, v6, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 104
    .line 105
    .line 106
    :goto_3
    iget v4, v1, Lxt0;->b:I

    .line 107
    .line 108
    add-int/2addr v4, v2

    .line 109
    iput v4, v1, Lxt0;->c:I

    .line 110
    .line 111
    iget v4, v0, Lxt0;->b:I

    .line 112
    .line 113
    add-int/2addr v4, v2

    .line 114
    iput v4, v0, Lxt0;->b:I

    .line 115
    .line 116
    iget-object v0, v0, Lxt0;->g:Lxt0;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lxt0;->b(Lxt0;)V

    .line 119
    .line 120
    .line 121
    iput-object v1, p1, Lac;->f:Lxt0;

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_5
    :goto_4
    iget-object v0, p1, Lac;->f:Lxt0;

    .line 131
    .line 132
    iget v1, v0, Lxt0;->c:I

    .line 133
    .line 134
    iget v2, v0, Lxt0;->b:I

    .line 135
    .line 136
    sub-int/2addr v1, v2

    .line 137
    int-to-long v1, v1

    .line 138
    invoke-virtual {v0}, Lxt0;->a()Lxt0;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    iput-object v4, p1, Lac;->f:Lxt0;

    .line 143
    .line 144
    iget-object v4, p0, Lac;->f:Lxt0;

    .line 145
    .line 146
    if-nez v4, :cond_6

    .line 147
    .line 148
    iput-object v0, p0, Lac;->f:Lxt0;

    .line 149
    .line 150
    iput-object v0, v0, Lxt0;->g:Lxt0;

    .line 151
    .line 152
    iput-object v0, v0, Lxt0;->f:Lxt0;

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_6
    iget-object v4, v4, Lxt0;->g:Lxt0;

    .line 156
    .line 157
    invoke-virtual {v4, v0}, Lxt0;->b(Lxt0;)V

    .line 158
    .line 159
    .line 160
    iget-object v4, v0, Lxt0;->g:Lxt0;

    .line 161
    .line 162
    if-eq v4, v0, :cond_a

    .line 163
    .line 164
    iget-boolean v5, v4, Lxt0;->e:Z

    .line 165
    .line 166
    if-nez v5, :cond_7

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_7
    iget v5, v0, Lxt0;->c:I

    .line 170
    .line 171
    iget v6, v0, Lxt0;->b:I

    .line 172
    .line 173
    sub-int/2addr v5, v6

    .line 174
    iget v6, v4, Lxt0;->c:I

    .line 175
    .line 176
    rsub-int v6, v6, 0x2000

    .line 177
    .line 178
    iget-boolean v7, v4, Lxt0;->d:Z

    .line 179
    .line 180
    if-eqz v7, :cond_8

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    iget v3, v4, Lxt0;->b:I

    .line 184
    .line 185
    :goto_5
    add-int/2addr v6, v3

    .line 186
    if-le v5, v6, :cond_9

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_9
    invoke-virtual {v0, v4, v5}, Lxt0;->d(Lxt0;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lxt0;->a()Lxt0;

    .line 193
    .line 194
    .line 195
    invoke-static {v0}, Lzt0;->r(Lxt0;)V

    .line 196
    .line 197
    .line 198
    :goto_6
    iget-wide v3, p1, Lac;->g:J

    .line 199
    .line 200
    sub-long/2addr v3, v1

    .line 201
    iput-wide v3, p1, Lac;->g:J

    .line 202
    .line 203
    iget-wide v3, p0, Lac;->g:J

    .line 204
    .line 205
    add-long/2addr v3, v1

    .line 206
    iput-wide v3, p0, Lac;->g:J

    .line 207
    .line 208
    sub-long/2addr p2, v1

    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 212
    .line 213
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :cond_b
    return-void

    .line 218
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 219
    .line 220
    const-string p2, "source == this"

    .line 221
    .line 222
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p1
.end method

.method public final l(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lac;->i(I)Lxt0;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, v0, Lxt0;->a:[B

    .line 7
    .line 8
    iget v2, v0, Lxt0;->c:I

    .line 9
    .line 10
    add-int/lit8 v3, v2, 0x1

    .line 11
    .line 12
    iput v3, v0, Lxt0;->c:I

    .line 13
    .line 14
    int-to-byte p1, p1

    .line 15
    aput-byte p1, v1, v2

    .line 16
    .line 17
    iget-wide v0, p0, Lac;->g:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    add-long/2addr v0, v2

    .line 22
    iput-wide v0, p0, Lac;->g:J

    .line 23
    .line 24
    return-void
.end method

.method public final m(I)V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lac;->i(I)Lxt0;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, v1, Lxt0;->a:[B

    .line 7
    .line 8
    iget v3, v1, Lxt0;->c:I

    .line 9
    .line 10
    add-int/lit8 v4, v3, 0x1

    .line 11
    .line 12
    ushr-int/lit8 v5, p1, 0x18

    .line 13
    .line 14
    and-int/lit16 v5, v5, 0xff

    .line 15
    .line 16
    int-to-byte v5, v5

    .line 17
    aput-byte v5, v2, v3

    .line 18
    .line 19
    add-int/lit8 v5, v3, 0x2

    .line 20
    .line 21
    ushr-int/lit8 v6, p1, 0x10

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    int-to-byte v6, v6

    .line 26
    aput-byte v6, v2, v4

    .line 27
    .line 28
    add-int/lit8 v4, v3, 0x3

    .line 29
    .line 30
    ushr-int/lit8 v6, p1, 0x8

    .line 31
    .line 32
    and-int/lit16 v6, v6, 0xff

    .line 33
    .line 34
    int-to-byte v6, v6

    .line 35
    aput-byte v6, v2, v5

    .line 36
    .line 37
    add-int/2addr v3, v0

    .line 38
    and-int/lit16 p1, p1, 0xff

    .line 39
    .line 40
    int-to-byte p1, p1

    .line 41
    aput-byte p1, v2, v4

    .line 42
    .line 43
    iput v3, v1, Lxt0;->c:I

    .line 44
    .line 45
    iget-wide v0, p0, Lac;->g:J

    .line 46
    .line 47
    const-wide/16 v2, 0x4

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    iput-wide v0, p0, Lac;->g:J

    .line 51
    .line 52
    return-void
.end method

.method public final n(Ljava/lang/String;II)V
    .locals 7

    .line 1
    if-ltz p2, :cond_c

    .line 2
    .line 3
    if-lt p3, p2, :cond_b

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gt p3, v0, :cond_a

    .line 10
    .line 11
    :goto_0
    if-ge p2, p3, :cond_9

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x80

    .line 18
    .line 19
    if-ge v0, v1, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0, v2}, Lac;->i(I)Lxt0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, v2, Lxt0;->a:[B

    .line 27
    .line 28
    iget v4, v2, Lxt0;->c:I

    .line 29
    .line 30
    sub-int/2addr v4, p2

    .line 31
    rsub-int v5, v4, 0x2000

    .line 32
    .line 33
    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    add-int/lit8 v6, p2, 0x1

    .line 38
    .line 39
    add-int/2addr p2, v4

    .line 40
    int-to-byte v0, v0

    .line 41
    aput-byte v0, v3, p2

    .line 42
    .line 43
    :goto_1
    if-ge v6, v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-lt p2, v1, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    add-int/lit8 v0, v6, 0x1

    .line 53
    .line 54
    add-int/2addr v6, v4

    .line 55
    int-to-byte p2, p2

    .line 56
    aput-byte p2, v3, v6

    .line 57
    .line 58
    move v6, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    :goto_2
    add-int/2addr v4, v6

    .line 61
    iget p2, v2, Lxt0;->c:I

    .line 62
    .line 63
    sub-int/2addr v4, p2

    .line 64
    add-int/2addr p2, v4

    .line 65
    iput p2, v2, Lxt0;->c:I

    .line 66
    .line 67
    iget-wide v0, p0, Lac;->g:J

    .line 68
    .line 69
    int-to-long v2, v4

    .line 70
    add-long/2addr v0, v2

    .line 71
    iput-wide v0, p0, Lac;->g:J

    .line 72
    .line 73
    move p2, v6

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/16 v2, 0x800

    .line 76
    .line 77
    if-ge v0, v2, :cond_3

    .line 78
    .line 79
    shr-int/lit8 v2, v0, 0x6

    .line 80
    .line 81
    or-int/lit16 v2, v2, 0xc0

    .line 82
    .line 83
    invoke-virtual {p0, v2}, Lac;->l(I)V

    .line 84
    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x3f

    .line 87
    .line 88
    or-int/2addr v0, v1

    .line 89
    invoke-virtual {p0, v0}, Lac;->l(I)V

    .line 90
    .line 91
    .line 92
    :goto_3
    add-int/lit8 p2, p2, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    const v2, 0xd800

    .line 96
    .line 97
    .line 98
    const/16 v3, 0x3f

    .line 99
    .line 100
    if-lt v0, v2, :cond_8

    .line 101
    .line 102
    const v2, 0xdfff

    .line 103
    .line 104
    .line 105
    if-le v0, v2, :cond_4

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_4
    add-int/lit8 v4, p2, 0x1

    .line 109
    .line 110
    if-ge v4, p3, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    goto :goto_4

    .line 117
    :cond_5
    const/4 v5, 0x0

    .line 118
    :goto_4
    const v6, 0xdbff

    .line 119
    .line 120
    .line 121
    if-gt v0, v6, :cond_7

    .line 122
    .line 123
    const v6, 0xdc00

    .line 124
    .line 125
    .line 126
    if-lt v5, v6, :cond_7

    .line 127
    .line 128
    if-le v5, v2, :cond_6

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_6
    const v2, -0xd801

    .line 132
    .line 133
    .line 134
    and-int/2addr v0, v2

    .line 135
    shl-int/lit8 v0, v0, 0xa

    .line 136
    .line 137
    const v2, -0xdc01

    .line 138
    .line 139
    .line 140
    and-int/2addr v2, v5

    .line 141
    or-int/2addr v0, v2

    .line 142
    const/high16 v2, 0x10000

    .line 143
    .line 144
    add-int/2addr v0, v2

    .line 145
    shr-int/lit8 v2, v0, 0x12

    .line 146
    .line 147
    or-int/lit16 v2, v2, 0xf0

    .line 148
    .line 149
    invoke-virtual {p0, v2}, Lac;->l(I)V

    .line 150
    .line 151
    .line 152
    shr-int/lit8 v2, v0, 0xc

    .line 153
    .line 154
    and-int/2addr v2, v3

    .line 155
    or-int/2addr v2, v1

    .line 156
    invoke-virtual {p0, v2}, Lac;->l(I)V

    .line 157
    .line 158
    .line 159
    shr-int/lit8 v2, v0, 0x6

    .line 160
    .line 161
    and-int/2addr v2, v3

    .line 162
    or-int/2addr v2, v1

    .line 163
    invoke-virtual {p0, v2}, Lac;->l(I)V

    .line 164
    .line 165
    .line 166
    and-int/2addr v0, v3

    .line 167
    or-int/2addr v0, v1

    .line 168
    invoke-virtual {p0, v0}, Lac;->l(I)V

    .line 169
    .line 170
    .line 171
    add-int/lit8 p2, p2, 0x2

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_7
    :goto_5
    invoke-virtual {p0, v3}, Lac;->l(I)V

    .line 176
    .line 177
    .line 178
    move p2, v4

    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_8
    :goto_6
    shr-int/lit8 v2, v0, 0xc

    .line 182
    .line 183
    or-int/lit16 v2, v2, 0xe0

    .line 184
    .line 185
    invoke-virtual {p0, v2}, Lac;->l(I)V

    .line 186
    .line 187
    .line 188
    shr-int/lit8 v2, v0, 0x6

    .line 189
    .line 190
    and-int/2addr v2, v3

    .line 191
    or-int/2addr v2, v1

    .line 192
    invoke-virtual {p0, v2}, Lac;->l(I)V

    .line 193
    .line 194
    .line 195
    and-int/lit8 v0, v0, 0x3f

    .line 196
    .line 197
    or-int/2addr v0, v1

    .line 198
    invoke-virtual {p0, v0}, Lac;->l(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_9
    return-void

    .line 203
    :cond_a
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 204
    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v1, "endIndex > string.length: "

    .line 208
    .line 209
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string p3, " > "

    .line 216
    .line 217
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p2

    .line 235
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 236
    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v1, "endIndex < beginIndex: "

    .line 240
    .line 241
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string p3, " < "

    .line 248
    .line 249
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 264
    .line 265
    const-string p3, "beginIndex < 0: "

    .line 266
    .line 267
    invoke-static {p3, p2}, Lex0;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p1
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 10
    iget-object v0, p0, Lac;->f:Lxt0;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    iget v2, v0, Lxt0;->c:I

    iget v3, v0, Lxt0;->b:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 12
    iget-object v2, v0, Lxt0;->a:[B

    iget v3, v0, Lxt0;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 13
    iget p1, v0, Lxt0;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Lxt0;->b:I

    .line 14
    iget-wide v2, p0, Lac;->g:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lac;->g:J

    .line 15
    iget v2, v0, Lxt0;->c:I

    if-ne p1, v2, :cond_1

    .line 16
    invoke-virtual {v0}, Lxt0;->a()Lxt0;

    move-result-object p1

    iput-object p1, p0, Lac;->f:Lxt0;

    .line 17
    invoke-static {v0}, Lzt0;->r(Lxt0;)V

    :cond_1
    return v1
.end method

.method public final read([BII)I
    .locals 7

    .line 1
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lj41;->a(JJJ)V

    .line 2
    iget-object v0, p0, Lac;->f:Lxt0;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 3
    :cond_0
    iget v1, v0, Lxt0;->c:I

    iget v2, v0, Lxt0;->b:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 4
    iget-object v1, v0, Lxt0;->a:[B

    iget v2, v0, Lxt0;->b:I

    invoke-static {v1, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iget p1, v0, Lxt0;->b:I

    add-int/2addr p1, p3

    iput p1, v0, Lxt0;->b:I

    .line 6
    iget-wide v1, p0, Lac;->g:J

    int-to-long v3, p3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lac;->g:J

    .line 7
    iget p2, v0, Lxt0;->c:I

    if-ne p1, p2, :cond_1

    .line 8
    invoke-virtual {v0}, Lxt0;->a()Lxt0;

    move-result-object p1

    iput-object p1, p0, Lac;->f:Lxt0;

    .line 9
    invoke-static {v0}, Lzt0;->r(Lxt0;)V

    :cond_1
    return p3
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-wide v0, p0, Lac;->g:J

    .line 2
    .line 3
    const-wide/32 v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-gtz v2, :cond_1

    .line 9
    .line 10
    long-to-int v0, v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ljc;->j:Ljc;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v1, Lau0;

    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, Lau0;-><init>(Lac;I)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :goto_0
    invoke-virtual {v0}, Ljc;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "size > Integer.MAX_VALUE: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-wide v2, p0, Lac;->g:J

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    if-lez v1, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {p0, v2}, Lac;->i(I)Lxt0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget v3, v2, Lxt0;->c:I

    .line 16
    .line 17
    rsub-int v3, v3, 0x2000

    .line 18
    .line 19
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, v2, Lxt0;->a:[B

    .line 24
    .line 25
    iget v5, v2, Lxt0;->c:I

    .line 26
    .line 27
    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    sub-int/2addr v1, v3

    .line 31
    iget v4, v2, Lxt0;->c:I

    .line 32
    .line 33
    add-int/2addr v4, v3

    .line 34
    iput v4, v2, Lxt0;->c:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-wide v1, p0, Lac;->g:J

    .line 38
    .line 39
    int-to-long v3, v0

    .line 40
    add-long/2addr v1, v3

    .line 41
    iput-wide v1, p0, Lac;->g:J

    .line 42
    .line 43
    return v0

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    const-string v0, "source == null"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method
