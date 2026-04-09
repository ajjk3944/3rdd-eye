.class public final Lbm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llf1;


# instance fields
.field public final a:Lcm1;

.field public final b:Lkz2;

.field public final c:Lkz2;

.field public final d:Llg1;

.field public e:Lnf1;

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Li41;->B:I

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
    new-instance v0, Lcm1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "audio/mp4a-latm"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-direct {v0, v3, v1, v2, v4}, Lcm1;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lbm1;->a:Lcm1;

    .line 15
    .line 16
    new-instance v0, Lkz2;

    .line 17
    .line 18
    const/16 v1, 0x800

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lbm1;->b:Lkz2;

    .line 24
    .line 25
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    iput-wide v0, p0, Lbm1;->g:J

    .line 28
    .line 29
    new-instance v0, Lkz2;

    .line 30
    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lkz2;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lbm1;->c:Lkz2;

    .line 37
    .line 38
    new-instance v1, Llg1;

    .line 39
    .line 40
    iget-object v0, v0, Lkz2;->a:[B

    .line 41
    .line 42
    array-length v2, v0

    .line 43
    invoke-direct {v1, v2, v0}, Llg1;-><init>(I[B)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lbm1;->d:Llg1;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final b(Lmf1;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lbm1;->c:Lkz2;

    .line 4
    .line 5
    iget-object v3, v2, Lkz2;->a:[B

    .line 6
    .line 7
    move-object v4, p1

    .line 8
    check-cast v4, Ldf1;

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    invoke-virtual {v4, v3, v0, v5, v0}, Ldf1;->B([BIIZ)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lkz2;->E(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lkz2;->O()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const v5, 0x494433

    .line 23
    .line 24
    .line 25
    if-eq v3, v5, :cond_6

    .line 26
    .line 27
    iput v0, v4, Ldf1;->k:I

    .line 28
    .line 29
    invoke-virtual {v4, v1, v0}, Ldf1;->e(IZ)Z

    .line 30
    .line 31
    .line 32
    iget-wide v5, p0, Lbm1;->g:J

    .line 33
    .line 34
    const-wide/16 v7, -0x1

    .line 35
    .line 36
    cmp-long p1, v5, v7

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    int-to-long v5, v1

    .line 41
    iput-wide v5, p0, Lbm1;->g:J

    .line 42
    .line 43
    :cond_0
    move p1, v0

    .line 44
    move v5, p1

    .line 45
    move v3, v1

    .line 46
    :cond_1
    iget-object v6, v2, Lkz2;->a:[B

    .line 47
    .line 48
    const/4 v7, 0x2

    .line 49
    invoke-virtual {v4, v6, v0, v7, v0}, Ldf1;->B([BIIZ)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Lkz2;->E(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lkz2;->L()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const v7, 0xfff6

    .line 60
    .line 61
    .line 62
    and-int/2addr v6, v7

    .line 63
    const v7, 0xfff0

    .line 64
    .line 65
    .line 66
    if-ne v6, v7, :cond_5

    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    add-int/2addr p1, v6

    .line 70
    const/4 v7, 0x4

    .line 71
    if-lt p1, v7, :cond_3

    .line 72
    .line 73
    const/16 v8, 0xbc

    .line 74
    .line 75
    if-gt v5, v8, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    return v6

    .line 79
    :cond_3
    :goto_1
    iget-object v6, v2, Lkz2;->a:[B

    .line 80
    .line 81
    invoke-virtual {v4, v6, v0, v7, v0}, Ldf1;->B([BIIZ)Z

    .line 82
    .line 83
    .line 84
    const/16 v6, 0xe

    .line 85
    .line 86
    iget-object v7, p0, Lbm1;->d:Llg1;

    .line 87
    .line 88
    invoke-virtual {v7, v6}, Llg1;->l(I)V

    .line 89
    .line 90
    .line 91
    const/16 v6, 0xd

    .line 92
    .line 93
    invoke-virtual {v7, v6}, Llg1;->r(I)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    const/4 v7, 0x6

    .line 98
    if-gt v6, v7, :cond_4

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    iput v0, v4, Ldf1;->k:I

    .line 103
    .line 104
    invoke-virtual {v4, v3, v0}, Ldf1;->e(IZ)Z

    .line 105
    .line 106
    .line 107
    :goto_2
    move p1, v0

    .line 108
    move v5, p1

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    add-int/lit8 v7, v6, -0x6

    .line 111
    .line 112
    invoke-virtual {v4, v7, v0}, Ldf1;->e(IZ)Z

    .line 113
    .line 114
    .line 115
    add-int/2addr v5, v6

    .line 116
    goto :goto_3

    .line 117
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    iput v0, v4, Ldf1;->k:I

    .line 120
    .line 121
    invoke-virtual {v4, v3, v0}, Ldf1;->e(IZ)Z

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :goto_3
    sub-int v6, v3, v1

    .line 126
    .line 127
    const/16 v7, 0x2000

    .line 128
    .line 129
    if-lt v6, v7, :cond_1

    .line 130
    .line 131
    return v0

    .line 132
    :cond_6
    const/4 v3, 0x3

    .line 133
    invoke-virtual {v2, v3}, Lkz2;->G(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lkz2;->g()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-int/lit8 v3, v2, 0xa

    .line 141
    .line 142
    add-int/2addr v1, v3

    .line 143
    invoke-virtual {v4, v2, v0}, Ldf1;->e(IZ)Z

    .line 144
    .line 145
    .line 146
    goto/16 :goto_0
.end method

.method public final c(Lmf1;Lpf1;)I
    .locals 8

    .line 1
    iget-object p2, p0, Lbm1;->e:Lnf1;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lbm1;->b:Lkz2;

    .line 7
    .line 8
    iget-object v0, p2, Lkz2;->a:[B

    .line 9
    .line 10
    const/16 v1, 0x800

    .line 11
    .line 12
    check-cast p1, Ldf1;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p1, v0, v2, v1}, Ldf1;->d([BII)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-boolean v0, p0, Lbm1;->i:Z

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lbm1;->e:Lnf1;

    .line 25
    .line 26
    new-instance v3, Lqf1;

    .line 27
    .line 28
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const-wide/16 v6, 0x0

    .line 34
    .line 35
    invoke-direct {v3, v4, v5, v6, v7}, Lqf1;-><init>(JJ)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v3}, Lnf1;->v(Lcg1;)V

    .line 39
    .line 40
    .line 41
    iput-boolean v1, p0, Lbm1;->i:Z

    .line 42
    .line 43
    :cond_0
    const/4 v0, -0x1

    .line 44
    if-ne p1, v0, :cond_1

    .line 45
    .line 46
    return v0

    .line 47
    :cond_1
    invoke-virtual {p2, v2}, Lkz2;->E(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Lkz2;->C(I)V

    .line 51
    .line 52
    .line 53
    iget-boolean p1, p0, Lbm1;->h:Z

    .line 54
    .line 55
    iget-object v0, p0, Lbm1;->a:Lcm1;

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    iget-wide v3, p0, Lbm1;->f:J

    .line 60
    .line 61
    iput-wide v3, v0, Lcm1;->u:J

    .line 62
    .line 63
    iput-boolean v1, p0, Lbm1;->h:Z

    .line 64
    .line 65
    :cond_2
    invoke-virtual {v0, p2}, Lcm1;->b(Lkz2;)V

    .line 66
    .line 67
    .line 68
    return v2
.end method

.method public final e(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lbm1;->h:Z

    .line 3
    .line 4
    iget-object p1, p0, Lbm1;->a:Lcm1;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcm1;->a()V

    .line 7
    .line 8
    .line 9
    iput-wide p3, p0, Lbm1;->f:J

    .line 10
    .line 11
    return-void
.end method

.method public final f(Lnf1;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lbm1;->e:Lnf1;

    .line 2
    .line 3
    new-instance v0, Lin1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lin1;-><init>(III)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lbm1;->a:Lcm1;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0}, Lcm1;->e(Lnf1;Lin1;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lnf1;->s()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
