.class public abstract Ltn0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final j:Ljava/text/DecimalFormat;


# instance fields
.field public f:Lgg0;

.field public g:I

.field public h:I

.field public i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Ltn0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/text/DecimalFormat;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ltn0;->j:Ljava/text/DecimalFormat;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setMinimumIntegerDigits(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lgg0;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lgg0;->isAbsolute()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Lk31;->a(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p3}, Lyl;->a(I)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    invoke-static {v0, v1}, Lqb1;->e(J)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ltn0;->f:Lgg0;

    .line 22
    .line 23
    iput p2, p0, Ltn0;->g:I

    .line 24
    .line 25
    iput p3, p0, Ltn0;->h:I

    .line 26
    .line 27
    iput-wide v0, p0, Ltn0;->i:J

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p2, Ll30;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Ll30;-><init>(Lgg0;)V

    .line 33
    .line 34
    .line 35
    throw p2
.end method

.method public static a([BZ)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x22

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    :cond_0
    array-length v2, p0

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v2, :cond_5

    .line 16
    .line 17
    aget-byte v4, p0, v3

    .line 18
    .line 19
    and-int/lit16 v4, v4, 0xff

    .line 20
    .line 21
    const/16 v5, 0x20

    .line 22
    .line 23
    const/16 v6, 0x5c

    .line 24
    .line 25
    if-lt v4, v5, :cond_4

    .line 26
    .line 27
    const/16 v5, 0x7f

    .line 28
    .line 29
    if-lt v4, v5, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    if-eq v4, v1, :cond_3

    .line 33
    .line 34
    if-ne v4, v6, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    int-to-char v4, v4

    .line 38
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    int-to-char v4, v4

    .line 46
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    :goto_2
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    sget-object v5, Ltn0;->j:Ljava/text/DecimalFormat;

    .line 54
    .line 55
    int-to-long v6, v4

    .line 56
    invoke-virtual {v5, v6, v7}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    if-eqz p1, :cond_6

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public static b(Ljava/lang/String;Lgg0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lgg0;->isAbsolute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ll30;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "\'"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, "\' on field "

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, " is not an absolute name"

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method public static c(Ljava/lang/String;I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const v0, 0xffff

    .line 4
    .line 5
    .line 6
    if-gt p1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "\""

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, "\" "

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " must be an unsigned 16 bit value"

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static e(Lcm;IZ)Ltn0;
    .locals 9

    .line 1
    iget v0, p0, Lcm;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lcm;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    new-instance v2, Lgg0;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lgg0;-><init>(Lcm;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcm;->f()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-virtual {p0}, Lcm;->f()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const-wide/16 p0, 0x0

    .line 23
    .line 24
    invoke-static {v2, v3, v4, p0, p1}, Ltn0;->i(Lgg0;IIJ)Ltn0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lcm;->g()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {p0}, Lcm;->f()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-nez v8, :cond_2

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    if-eq p1, p2, :cond_1

    .line 43
    .line 44
    const/4 p2, 0x2

    .line 45
    if-ne p1, p2, :cond_2

    .line 46
    .line 47
    :cond_1
    invoke-static {v2, v3, v4, v5, v6}, Ltn0;->i(Lgg0;IIJ)Ltn0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    const/4 v7, 0x1

    .line 53
    invoke-static/range {v2 .. v7}, Ltn0;->g(Lgg0;IIJZ)Ltn0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-lt p2, v8, :cond_5

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    sub-int p2, v0, p2

    .line 68
    .line 69
    if-gt v8, p2, :cond_4

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    add-int/2addr p2, v8

    .line 76
    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p0}, Ltn0;->k(Lcm;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-gtz p0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_3
    new-instance p0, Lt91;

    .line 93
    .line 94
    const-string p1, "invalid record length"

    .line 95
    .line 96
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    const-string p1, "cannot set active region past end of input"

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_5
    new-instance p0, Lt91;

    .line 109
    .line 110
    const-string p1, "truncated record"

    .line 111
    .line 112
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0
.end method

.method public static g(Lgg0;IIJZ)Ltn0;
    .locals 1

    .line 1
    if-eqz p5, :cond_1

    .line 2
    .line 3
    sget-object p5, Lk31;->a:Lbs0;

    .line 4
    .line 5
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lk31;->a(I)V

    .line 9
    .line 10
    .line 11
    iget-object p5, p5, Lbs0;->m:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p5

    .line 21
    check-cast p5, Ljava/util/function/Supplier;

    .line 22
    .line 23
    if-eqz p5, :cond_0

    .line 24
    .line 25
    invoke-interface {p5}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p5

    .line 29
    check-cast p5, Ltn0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p5, Lt31;

    .line 33
    .line 34
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p5, Lps;

    .line 39
    .line 40
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iput-object p0, p5, Ltn0;->f:Lgg0;

    .line 44
    .line 45
    iput p1, p5, Ltn0;->g:I

    .line 46
    .line 47
    iput p2, p5, Ltn0;->h:I

    .line 48
    .line 49
    iput-wide p3, p5, Ltn0;->i:J

    .line 50
    .line 51
    return-object p5
.end method

.method public static i(Lgg0;IIJ)Ltn0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lgg0;->isAbsolute()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lk31;->a(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lyl;->a(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p3, p4}, Lqb1;->e(J)V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p0

    .line 18
    move v2, p1

    .line 19
    move v3, p2

    .line 20
    move-wide v4, p3

    .line 21
    invoke-static/range {v1 .. v6}, Ltn0;->g(Lgg0;IIJZ)Ltn0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    move-object v1, p0

    .line 27
    new-instance p0, Ll30;

    .line 28
    .line 29
    invoke-direct {p0, v1}, Ll30;-><init>(Lgg0;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    .line 1
    check-cast p1, Ltn0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v1, p0, Ltn0;->f:Lgg0;

    .line 8
    .line 9
    iget-object v2, p1, Ltn0;->f:Lgg0;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lgg0;->d(Lgg0;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    iget v1, p0, Ltn0;->h:I

    .line 19
    .line 20
    iget v2, p1, Ltn0;->h:I

    .line 21
    .line 22
    sub-int/2addr v1, v2

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget v1, p0, Ltn0;->g:I

    .line 27
    .line 28
    iget v2, p1, Ltn0;->g:I

    .line 29
    .line 30
    sub-int/2addr v1, v2

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    return v1

    .line 34
    :cond_3
    invoke-virtual {p0}, Ltn0;->j()[B

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Ltn0;->j()[B

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    array-length v2, v1

    .line 43
    array-length v3, p1

    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_0
    if-ge v0, v2, :cond_5

    .line 49
    .line 50
    aget-byte v3, v1, v0

    .line 51
    .line 52
    aget-byte v4, p1, v0

    .line 53
    .line 54
    if-eq v3, v4, :cond_4

    .line 55
    .line 56
    and-int/lit16 p1, v3, 0xff

    .line 57
    .line 58
    and-int/lit16 v0, v4, 0xff

    .line 59
    .line 60
    sub-int/2addr p1, v0

    .line 61
    return p1

    .line 62
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_5
    array-length v0, v1

    .line 66
    array-length p1, p1

    .line 67
    sub-int/2addr v0, p1

    .line 68
    return v0
.end method

.method public final d()Ltn0;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ltn0;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ltn0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ltn0;

    .line 7
    .line 8
    iget v0, p0, Ltn0;->g:I

    .line 9
    .line 10
    iget v1, p1, Ltn0;->g:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_2

    .line 13
    .line 14
    iget v0, p0, Ltn0;->h:I

    .line 15
    .line 16
    iget v1, p1, Ltn0;->h:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Ltn0;->f:Lgg0;

    .line 21
    .line 22
    iget-object v1, p1, Ltn0;->f:Lgg0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Ltn0;->j()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Ltn0;->j()[B

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public f()Lgg0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Ltn0;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ltn0;->p(Z)[B

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    .line 11
    aget-byte v4, v0, v2

    .line 12
    .line 13
    shl-int/lit8 v5, v3, 0x3

    .line 14
    .line 15
    and-int/lit16 v4, v4, 0xff

    .line 16
    .line 17
    add-int/2addr v5, v4

    .line 18
    add-int/2addr v3, v5

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v3
.end method

.method public final j()[B
    .locals 3

    .line 1
    new-instance v0, Lt3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lt3;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v0, v1, v2}, Ltn0;->m(Lt3;Ljh;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lt3;->i()[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public abstract k(Lcm;)V
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public abstract m(Lt3;Ljh;Z)V
.end method

.method public final n(Ltn0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ltn0;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ltn0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget v0, p0, Ltn0;->h:I

    .line 12
    .line 13
    iget v1, p1, Ltn0;->h:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ltn0;->f:Lgg0;

    .line 18
    .line 19
    iget-object p1, p1, Ltn0;->f:Lgg0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public final o(Lt3;ILjh;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltn0;->f:Lgg0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p3}, Lgg0;->q(Lt3;Ljh;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ltn0;->g:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Ltn0;->h:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 14
    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-wide v0, p0, Ltn0;->i:J

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Lt3;->o(J)V

    .line 22
    .line 23
    .line 24
    iget p2, p1, Lt3;->g:I

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p3, v0}, Ltn0;->m(Lt3;Ljh;Z)V

    .line 31
    .line 32
    .line 33
    iget p3, p1, Lt3;->g:I

    .line 34
    .line 35
    sub-int/2addr p3, p2

    .line 36
    add-int/lit8 p3, p3, -0x2

    .line 37
    .line 38
    invoke-virtual {p1, p3, p2}, Lt3;->n(II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final p(Z)[B
    .locals 3

    .line 1
    new-instance v0, Lt3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lt3;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ltn0;->f:Lgg0;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lgg0;->s(Lt3;)V

    .line 11
    .line 12
    .line 13
    iget v1, p0, Ltn0;->g:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lt3;->m(I)V

    .line 16
    .line 17
    .line 18
    iget v1, p0, Ltn0;->h:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lt3;->m(I)V

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lt3;->o(J)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-wide v1, p0, Ltn0;->i:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lt3;->o(J)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget p1, v0, Lt3;->g:I

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Lt3;->m(I)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-virtual {p0, v0, v1, v2}, Ltn0;->m(Lt3;Ljh;Z)V

    .line 45
    .line 46
    .line 47
    iget v1, v0, Lt3;->g:I

    .line 48
    .line 49
    sub-int/2addr v1, p1

    .line 50
    add-int/lit8 v1, v1, -0x2

    .line 51
    .line 52
    invoke-virtual {v0, v1, p1}, Lt3;->n(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lt3;->i()[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Ltn0;->f:Lgg0;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x8

    .line 18
    .line 19
    const-string v4, "\t"

    .line 20
    .line 21
    if-ge v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    if-ge v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    sget-object v2, Ltj0;->a:Ljava/util/HashMap;

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_2
    const-string v3, "BINDTTL"

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_9

    .line 57
    .line 58
    iget-wide v2, v0, Ltn0;->i:J

    .line 59
    .line 60
    invoke-static {v2, v3}, Lqb1;->e(J)V

    .line 61
    .line 62
    .line 63
    new-instance v5, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-wide/16 v6, 0x3c

    .line 69
    .line 70
    rem-long v8, v2, v6

    .line 71
    .line 72
    div-long/2addr v2, v6

    .line 73
    rem-long v10, v2, v6

    .line 74
    .line 75
    div-long/2addr v2, v6

    .line 76
    const-wide/16 v6, 0x18

    .line 77
    .line 78
    rem-long v12, v2, v6

    .line 79
    .line 80
    div-long/2addr v2, v6

    .line 81
    const-wide/16 v6, 0x7

    .line 82
    .line 83
    rem-long v14, v2, v6

    .line 84
    .line 85
    div-long/2addr v2, v6

    .line 86
    const-wide/16 v6, 0x0

    .line 87
    .line 88
    cmp-long v16, v2, v6

    .line 89
    .line 90
    if-lez v16, :cond_3

    .line 91
    .line 92
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v2, "W"

    .line 96
    .line 97
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_3
    cmp-long v2, v14, v6

    .line 101
    .line 102
    if-lez v2, :cond_4

    .line 103
    .line 104
    invoke-virtual {v5, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v3, "D"

    .line 108
    .line 109
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    :cond_4
    cmp-long v3, v12, v6

    .line 113
    .line 114
    if-lez v3, :cond_5

    .line 115
    .line 116
    invoke-virtual {v5, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v12, "H"

    .line 120
    .line 121
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    :cond_5
    cmp-long v12, v10, v6

    .line 125
    .line 126
    if-lez v12, :cond_6

    .line 127
    .line 128
    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v10, "M"

    .line 132
    .line 133
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    :cond_6
    cmp-long v6, v8, v6

    .line 137
    .line 138
    if-gtz v6, :cond_7

    .line 139
    .line 140
    if-nez v16, :cond_8

    .line 141
    .line 142
    if-nez v2, :cond_8

    .line 143
    .line 144
    if-nez v3, :cond_8

    .line 145
    .line 146
    if-nez v12, :cond_8

    .line 147
    .line 148
    :cond_7
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v2, "S"

    .line 152
    .line 153
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    :cond_8
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_9
    :goto_0
    iget-wide v2, v0, Ltn0;->i:J

    .line 165
    .line 166
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    :goto_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    iget v2, v0, Ltn0;->h:I

    .line 173
    .line 174
    const/4 v3, 0x1

    .line 175
    if-ne v2, v3, :cond_b

    .line 176
    .line 177
    sget-object v2, Ltj0;->a:Ljava/util/HashMap;

    .line 178
    .line 179
    if-nez v2, :cond_a

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_a
    const-string v3, "noPrintIN"

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-eqz v2, :cond_b

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_b
    :goto_2
    iget v2, v0, Ltn0;->h:I

    .line 196
    .line 197
    sget-object v3, Lyl;->a:Lxl;

    .line 198
    .line 199
    invoke-virtual {v3, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    :goto_3
    iget v2, v0, Ltn0;->g:I

    .line 210
    .line 211
    sget-object v3, Lk31;->a:Lbs0;

    .line 212
    .line 213
    invoke-virtual {v3, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ltn0;->l()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-nez v3, :cond_c

    .line 229
    .line 230
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    return-object v1
.end method
