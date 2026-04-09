.class public final Lam1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:Lzl1;

.field public final b:Lkz2;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Lqb1;->v:I

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzl1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "audio/ac4"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lzl1;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lam1;->a:Lzl1;

    .line 15
    .line 16
    new-instance v0, Lkz2;

    .line 17
    .line 18
    const/16 v1, 0x4000

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lam1;->b:Lkz2;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final b(Lmf1;)Z
    .locals 14

    .line 1
    new-instance v0, Lkz2;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    iget-object v4, v0, Lkz2;->a:[B

    .line 11
    .line 12
    move-object v5, p1

    .line 13
    check-cast v5, Ldf1;

    .line 14
    .line 15
    invoke-virtual {v5, v4, v2, v1, v2}, Ldf1;->B([BIIZ)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lkz2;->E(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lkz2;->O()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const v6, 0x494433

    .line 26
    .line 27
    .line 28
    const/4 v7, 0x3

    .line 29
    if-eq v4, v6, :cond_7

    .line 30
    .line 31
    iput v2, v5, Ldf1;->k:I

    .line 32
    .line 33
    invoke-virtual {v5, v3, v2}, Ldf1;->e(IZ)Z

    .line 34
    .line 35
    .line 36
    move p1, v2

    .line 37
    move v1, v3

    .line 38
    :goto_1
    iget-object v4, v0, Lkz2;->a:[B

    .line 39
    .line 40
    const/4 v6, 0x7

    .line 41
    invoke-virtual {v5, v4, v2, v6, v2}, Ldf1;->B([BIIZ)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lkz2;->E(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lkz2;->L()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const v8, 0xac40

    .line 52
    .line 53
    .line 54
    const v9, 0xac41

    .line 55
    .line 56
    .line 57
    if-eq v4, v8, :cond_0

    .line 58
    .line 59
    if-eq v4, v9, :cond_0

    .line 60
    .line 61
    iput v2, v5, Ldf1;->k:I

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    sub-int p1, v1, v3

    .line 66
    .line 67
    const/16 v4, 0x2000

    .line 68
    .line 69
    if-ge p1, v4, :cond_5

    .line 70
    .line 71
    invoke-virtual {v5, v1, v2}, Ldf1;->e(IZ)Z

    .line 72
    .line 73
    .line 74
    move p1, v2

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    const/4 v8, 0x1

    .line 77
    add-int/2addr p1, v8

    .line 78
    const/4 v10, 0x4

    .line 79
    if-lt p1, v10, :cond_1

    .line 80
    .line 81
    return v8

    .line 82
    :cond_1
    iget-object v8, v0, Lkz2;->a:[B

    .line 83
    .line 84
    array-length v11, v8

    .line 85
    const/4 v12, -0x1

    .line 86
    if-ge v11, v6, :cond_2

    .line 87
    .line 88
    move v11, v12

    .line 89
    goto :goto_3

    .line 90
    :cond_2
    const/4 v11, 0x2

    .line 91
    aget-byte v11, v8, v11

    .line 92
    .line 93
    and-int/lit16 v11, v11, 0xff

    .line 94
    .line 95
    aget-byte v13, v8, v7

    .line 96
    .line 97
    shl-int/lit8 v11, v11, 0x8

    .line 98
    .line 99
    and-int/lit16 v13, v13, 0xff

    .line 100
    .line 101
    or-int/2addr v11, v13

    .line 102
    const v13, 0xffff

    .line 103
    .line 104
    .line 105
    if-ne v11, v13, :cond_3

    .line 106
    .line 107
    aget-byte v10, v8, v10

    .line 108
    .line 109
    and-int/lit16 v10, v10, 0xff

    .line 110
    .line 111
    const/4 v11, 0x5

    .line 112
    aget-byte v11, v8, v11

    .line 113
    .line 114
    and-int/lit16 v11, v11, 0xff

    .line 115
    .line 116
    shl-int/lit8 v10, v10, 0x10

    .line 117
    .line 118
    shl-int/lit8 v11, v11, 0x8

    .line 119
    .line 120
    const/4 v13, 0x6

    .line 121
    aget-byte v8, v8, v13

    .line 122
    .line 123
    and-int/lit16 v8, v8, 0xff

    .line 124
    .line 125
    or-int/2addr v10, v11

    .line 126
    or-int v11, v10, v8

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    move v6, v10

    .line 130
    :goto_2
    if-ne v4, v9, :cond_4

    .line 131
    .line 132
    add-int/lit8 v6, v6, 0x2

    .line 133
    .line 134
    :cond_4
    add-int/2addr v11, v6

    .line 135
    :goto_3
    if-ne v11, v12, :cond_6

    .line 136
    .line 137
    :cond_5
    return v2

    .line 138
    :cond_6
    add-int/lit8 v11, v11, -0x7

    .line 139
    .line 140
    invoke-virtual {v5, v11, v2}, Ldf1;->e(IZ)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_7
    invoke-virtual {v0, v7}, Lkz2;->G(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lkz2;->g()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    add-int/lit8 v6, v4, 0xa

    .line 152
    .line 153
    add-int/2addr v3, v6

    .line 154
    invoke-virtual {v5, v4, v2}, Ldf1;->e(IZ)Z

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 5

    .line 1
    iget-object p2, p0, Lam1;->b:Lkz2;

    .line 2
    .line 3
    iget-object v0, p2, Lkz2;->a:[B

    .line 4
    .line 5
    const/16 v1, 0x4000

    .line 6
    .line 7
    check-cast p1, Ldf1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v2, v1}, Ldf1;->d([BII)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, -0x1

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    invoke-virtual {p2, v2}, Lkz2;->E(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, Lkz2;->C(I)V

    .line 22
    .line 23
    .line 24
    iget-boolean p1, p0, Lam1;->c:Z

    .line 25
    .line 26
    iget-object v0, p0, Lam1;->a:Lzl1;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    iput-wide v3, v0, Lzl1;->o:J

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Lam1;->c:Z

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0, p2}, Lzl1;->b(Lkz2;)V

    .line 38
    .line 39
    .line 40
    return v2
.end method

.method public final e(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lam1;->c:Z

    .line 3
    .line 4
    iget-object p1, p0, Lam1;->a:Lzl1;

    .line 5
    .line 6
    invoke-virtual {p1}, Lzl1;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 5

    .line 1
    new-instance v0, Lin1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/high16 v3, -0x80000000

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lin1;-><init>(III)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lam1;->a:Lzl1;

    .line 11
    .line 12
    invoke-virtual {v1, p1, v0}, Lzl1;->e(Lnf1;Lin1;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lnf1;->s()V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lqf1;

    .line 19
    .line 20
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lqf1;-><init>(JJ)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0}, Lnf1;->v(Lcg1;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
