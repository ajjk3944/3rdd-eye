.class public final Lf;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public k:I


# direct methods
.method public static q([B)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-byte v0, p0, v0

    .line 3
    .line 4
    and-int/lit16 v0, v0, 0xff

    .line 5
    .line 6
    shl-int/lit8 v0, v0, 0x18

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    aget-byte v1, p0, v1

    .line 10
    .line 11
    and-int/lit16 v1, v1, 0xff

    .line 12
    .line 13
    shl-int/lit8 v1, v1, 0x10

    .line 14
    .line 15
    or-int/2addr v0, v1

    .line 16
    const/4 v1, 0x2

    .line 17
    aget-byte v1, p0, v1

    .line 18
    .line 19
    and-int/lit16 v1, v1, 0xff

    .line 20
    .line 21
    shl-int/lit8 v1, v1, 0x8

    .line 22
    .line 23
    or-int/2addr v0, v1

    .line 24
    const/4 v1, 0x3

    .line 25
    aget-byte p0, p0, v1

    .line 26
    .line 27
    and-int/lit16 p0, p0, 0xff

    .line 28
    .line 29
    or-int/2addr p0, v0

    .line 30
    return p0
.end method


# virtual methods
.method public final k(Lcm;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p1, v0}, Lcm;->c(I)[B

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Lf;->q([B)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lf;->k:I

    .line 11
    .line 12
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lf;->k:I

    .line 2
    .line 3
    ushr-int/lit8 v1, v0, 0x18

    .line 4
    .line 5
    and-int/lit16 v1, v1, 0xff

    .line 6
    .line 7
    int-to-byte v1, v1

    .line 8
    ushr-int/lit8 v2, v0, 0x10

    .line 9
    .line 10
    and-int/lit16 v2, v2, 0xff

    .line 11
    .line 12
    int-to-byte v2, v2

    .line 13
    ushr-int/lit8 v3, v0, 0x8

    .line 14
    .line 15
    and-int/lit16 v3, v3, 0xff

    .line 16
    .line 17
    int-to-byte v3, v3

    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    .line 20
    int-to-byte v0, v0

    .line 21
    const/4 v4, 0x4

    .line 22
    new-array v4, v4, [B

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    aput-byte v1, v4, v5

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    aput-byte v2, v4, v1

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    aput-byte v3, v4, v1

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    aput-byte v0, v4, v1

    .line 35
    .line 36
    invoke-static {v4}, La30;->j([B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 2

    .line 1
    iget p2, p0, Lf;->k:I

    .line 2
    .line 3
    int-to-long p2, p2

    .line 4
    const-wide v0, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    and-long/2addr p2, v0

    .line 10
    invoke-virtual {p1, p2, p3}, Lt3;->o(J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
