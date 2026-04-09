.class public final Lew1;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Ljava/security/MessageDigest;

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0}, Lf74;-><init>(I)V

    .line 3
    .line 4
    .line 5
    and-int/lit8 v0, p1, 0x7

    .line 6
    .line 7
    shr-int/lit8 v1, p1, 0x3

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    :cond_0
    iput v1, p0, Lew1;->j:I

    .line 14
    .line 15
    iput p1, p0, Lew1;->k:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final U1(Ljava/lang/String;)[B
    .locals 9

    .line 1
    iget-object v0, p0, Lf74;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lf74;->s1()Ljava/security/MessageDigest;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iput-object v1, p0, Lew1;->i:Ljava/security/MessageDigest;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-array p1, v2, [B

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lew1;->i:Ljava/security/MessageDigest;

    .line 23
    .line 24
    const-string v3, "UTF-8"

    .line 25
    .line 26
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lew1;->i:Ljava/security/MessageDigest;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    array-length v1, p1

    .line 44
    iget v3, p0, Lew1;->j:I

    .line 45
    .line 46
    if-le v1, v3, :cond_1

    .line 47
    .line 48
    move v1, v3

    .line 49
    :cond_1
    new-array v4, v1, [B

    .line 50
    .line 51
    invoke-static {p1, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    iget p1, p0, Lew1;->k:I

    .line 55
    .line 56
    and-int/lit8 p1, p1, 0x7

    .line 57
    .line 58
    if-lez p1, :cond_4

    .line 59
    .line 60
    const-wide/16 v5, 0x0

    .line 61
    .line 62
    :goto_0
    const/16 v7, 0x8

    .line 63
    .line 64
    if-ge v2, v1, :cond_3

    .line 65
    .line 66
    if-lez v2, :cond_2

    .line 67
    .line 68
    shl-long/2addr v5, v7

    .line 69
    :cond_2
    aget-byte v7, v4, v2

    .line 70
    .line 71
    and-int/lit16 v7, v7, 0xff

    .line 72
    .line 73
    int-to-long v7, v7

    .line 74
    add-long/2addr v5, v7

    .line 75
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    rsub-int/lit8 p1, p1, 0x8

    .line 79
    .line 80
    ushr-long v1, v5, p1

    .line 81
    .line 82
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 83
    .line 84
    if-ltz v3, :cond_4

    .line 85
    .line 86
    const-wide/16 v5, 0xff

    .line 87
    .line 88
    and-long/2addr v5, v1

    .line 89
    long-to-int p1, v5

    .line 90
    int-to-byte p1, p1

    .line 91
    aput-byte p1, v4, v3

    .line 92
    .line 93
    ushr-long/2addr v1, v7

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    monitor-exit v0

    .line 96
    return-object v4

    .line 97
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw p1
.end method
