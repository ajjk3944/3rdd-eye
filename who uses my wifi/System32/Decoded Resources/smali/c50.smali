.class public final Lc50;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final q:Ljava/text/DecimalFormat;

.field public static final r:Ljava/text/DecimalFormat;


# instance fields
.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/text/DecimalFormat;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc50;->q:Ljava/text/DecimalFormat;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMinimumIntegerDigits(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/text/DecimalFormat;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lc50;->r:Ljava/text/DecimalFormat;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMinimumIntegerDigits(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static q(I)J
    .locals 5

    .line 1
    shr-int/lit8 v0, p0, 0x4

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    and-int/lit8 p0, p0, 0xf

    .line 5
    .line 6
    const-wide/16 v2, 0x9

    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-gtz v2, :cond_1

    .line 11
    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    if-gt p0, v2, :cond_1

    .line 15
    .line 16
    :goto_0
    add-int/lit8 v2, p0, -0x1

    .line 17
    .line 18
    if-lez p0, :cond_0

    .line 19
    .line 20
    const-wide/16 v3, 0xa

    .line 21
    .line 22
    mul-long/2addr v0, v3

    .line 23
    move p0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-wide v0

    .line 26
    :cond_1
    new-instance p0, Lt91;

    .line 27
    .line 28
    const-string v0, "Invalid LOC Encoding"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public static r(JCC)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, 0x80000000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    sub-long/2addr p0, v1

    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    cmp-long v1, p0, v1

    .line 15
    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    neg-long p0, p0

    .line 19
    move p2, p3

    .line 20
    :cond_0
    const-wide/32 v1, 0x36ee80

    .line 21
    .line 22
    .line 23
    div-long v3, p0, v1

    .line 24
    .line 25
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    rem-long/2addr p0, v1

    .line 29
    const-string p3, " "

    .line 30
    .line 31
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-wide/32 v1, 0xea60

    .line 35
    .line 36
    .line 37
    div-long v3, p0, v1

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    rem-long v2, p0, v1

    .line 43
    .line 44
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    sget-object v1, Lc50;->r:Ljava/text/DecimalFormat;

    .line 48
    .line 49
    const-wide/16 v4, 0x3e8

    .line 50
    .line 51
    invoke-static/range {v0 .. v5}, Lc50;->s(Ljava/lang/StringBuilder;Ljava/text/NumberFormat;JJ)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static s(Ljava/lang/StringBuilder;Ljava/text/NumberFormat;JJ)V
    .locals 2

    .line 1
    div-long v0, p2, p4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    rem-long/2addr p2, p4

    .line 7
    const-wide/16 p4, 0x0

    .line 8
    .line 9
    cmp-long p4, p2, p4

    .line 10
    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    const-string p4, "."

    .line 14
    .line 15
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, p3}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public static t(J)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const-wide/16 v1, 0x9

    .line 3
    .line 4
    cmp-long v1, p0, v1

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    int-to-byte v0, v0

    .line 11
    const-wide/16 v1, 0xa

    .line 12
    .line 13
    div-long/2addr p0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x4

    .line 16
    shl-long/2addr p0, v1

    .line 17
    and-int/lit16 v0, v0, 0xff

    .line 18
    .line 19
    int-to-long v0, v0

    .line 20
    add-long/2addr p0, v0

    .line 21
    long-to-int p0, p0

    .line 22
    return p0
.end method


# virtual methods
.method public final k(Lcm;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcm;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcm;->i()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Lc50;->q(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lc50;->k:J

    .line 16
    .line 17
    invoke-virtual {p1}, Lcm;->i()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Lc50;->q(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iput-wide v0, p0, Lc50;->l:J

    .line 26
    .line 27
    invoke-virtual {p1}, Lcm;->i()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Lc50;->q(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    iput-wide v0, p0, Lc50;->m:J

    .line 36
    .line 37
    invoke-virtual {p1}, Lcm;->g()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iput-wide v0, p0, Lc50;->n:J

    .line 42
    .line 43
    invoke-virtual {p1}, Lcm;->g()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iput-wide v0, p0, Lc50;->o:J

    .line 48
    .line 49
    invoke-virtual {p1}, Lcm;->g()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    iput-wide v0, p0, Lc50;->p:J

    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    new-instance p1, Lt91;

    .line 57
    .line 58
    const-string v0, "Invalid LOC version"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public final l()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lc50;->n:J

    .line 7
    .line 8
    const/16 v3, 0x4e

    .line 9
    .line 10
    const/16 v4, 0x53

    .line 11
    .line 12
    invoke-static {v1, v2, v3, v4}, Lc50;->r(JCC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-wide v2, p0, Lc50;->o:J

    .line 25
    .line 26
    const/16 v4, 0x45

    .line 27
    .line 28
    const/16 v5, 0x57

    .line 29
    .line 30
    invoke-static {v2, v3, v4, v5}, Lc50;->r(JCC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-wide v1, p0, Lc50;->p:J

    .line 41
    .line 42
    const-wide/32 v3, 0x989680

    .line 43
    .line 44
    .line 45
    sub-long v2, v1, v3

    .line 46
    .line 47
    const-wide/16 v4, 0x64

    .line 48
    .line 49
    sget-object v1, Lc50;->q:Ljava/text/DecimalFormat;

    .line 50
    .line 51
    invoke-static/range {v0 .. v5}, Lc50;->s(Ljava/lang/StringBuilder;Ljava/text/NumberFormat;JJ)V

    .line 52
    .line 53
    .line 54
    const-string v6, "m "

    .line 55
    .line 56
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-wide v2, p0, Lc50;->k:J

    .line 60
    .line 61
    invoke-static/range {v0 .. v5}, Lc50;->s(Ljava/lang/StringBuilder;Ljava/text/NumberFormat;JJ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-wide v2, p0, Lc50;->l:J

    .line 68
    .line 69
    invoke-static/range {v0 .. v5}, Lc50;->s(Ljava/lang/StringBuilder;Ljava/text/NumberFormat;JJ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-wide v2, p0, Lc50;->m:J

    .line 76
    .line 77
    invoke-static/range {v0 .. v5}, Lc50;->s(Ljava/lang/StringBuilder;Ljava/text/NumberFormat;JJ)V

    .line 78
    .line 79
    .line 80
    const-string v1, "m"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 3
    .line 4
    .line 5
    iget-wide p2, p0, Lc50;->k:J

    .line 6
    .line 7
    invoke-static {p2, p3}, Lc50;->t(J)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 12
    .line 13
    .line 14
    iget-wide p2, p0, Lc50;->l:J

    .line 15
    .line 16
    invoke-static {p2, p3}, Lc50;->t(J)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 21
    .line 22
    .line 23
    iget-wide p2, p0, Lc50;->m:J

    .line 24
    .line 25
    invoke-static {p2, p3}, Lc50;->t(J)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {p1, p2}, Lt3;->q(I)V

    .line 30
    .line 31
    .line 32
    iget-wide p2, p0, Lc50;->n:J

    .line 33
    .line 34
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 35
    .line 36
    .line 37
    iget-wide p2, p0, Lc50;->o:J

    .line 38
    .line 39
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 40
    .line 41
    .line 42
    iget-wide p2, p0, Lc50;->p:J

    .line 43
    .line 44
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
