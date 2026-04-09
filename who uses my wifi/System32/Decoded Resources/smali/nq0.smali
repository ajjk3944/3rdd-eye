.class public abstract Lnq0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lgg0;

.field public static final b:Lgg0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "in-addr.arpa."

    .line 2
    .line 3
    invoke-static {v0}, Lgg0;->h(Ljava/lang/String;)Lgg0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnq0;->a:Lgg0;

    .line 8
    .line 9
    const-string v0, "ip6.arpa."

    .line 10
    .line 11
    invoke-static {v0}, Lgg0;->h(Ljava/lang/String;)Lgg0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnq0;->b:Lgg0;

    .line 16
    .line 17
    return-void
.end method

.method public static a(Ljava/net/InetAddress;)Lgg0;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/net/InetAddress;->getAddress()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x4

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "array must contain 4 or 16 elements"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    array-length v2, p0

    .line 29
    const-string v3, "."

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-ne v2, v1, :cond_3

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v4

    .line 36
    :goto_1
    if-ltz v2, :cond_7

    .line 37
    .line 38
    aget-byte v4, p0, v2

    .line 39
    .line 40
    and-int/lit16 v4, v4, 0xff

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    if-lez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    array-length v2, p0

    .line 54
    sub-int/2addr v2, v4

    .line 55
    :goto_2
    if-ltz v2, :cond_7

    .line 56
    .line 57
    aget-byte v5, p0, v2

    .line 58
    .line 59
    and-int/lit16 v6, v5, 0xff

    .line 60
    .line 61
    shr-int/2addr v6, v1

    .line 62
    and-int/lit8 v5, v5, 0xf

    .line 63
    .line 64
    filled-new-array {v6, v5}, [I

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    move v6, v4

    .line 69
    :goto_3
    if-ltz v6, :cond_6

    .line 70
    .line 71
    aget v7, v5, v6

    .line 72
    .line 73
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    if-gtz v2, :cond_4

    .line 81
    .line 82
    if-lez v6, :cond_5

    .line 83
    .line 84
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    add-int/lit8 v2, v2, -0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_7
    :try_start_0
    array-length p0, p0

    .line 94
    if-ne p0, v1, :cond_8

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    sget-object v0, Lnq0;->a:Lgg0;

    .line 101
    .line 102
    invoke-static {p0, v0}, Lgg0;->j(Ljava/lang/String;Lgg0;)Lgg0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    sget-object v0, Lnq0;->b:Lgg0;

    .line 112
    .line 113
    invoke-static {p0, v0}, Lgg0;->j(Ljava/lang/String;Lgg0;)Lgg0;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_0
    .catch Lf11; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    return-object p0

    .line 118
    :catch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string v0, "name cannot be invalid"

    .line 121
    .line 122
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0
.end method
