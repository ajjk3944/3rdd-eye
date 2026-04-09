.class public final Lnm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final a:Lt83;

.field public final b:Lr60;

.field public final c:Lr60;

.field public final d:Lr60;

.field public e:J

.field public final f:[Z

.field public g:Ljava/lang/String;

.field public h:Ljg1;

.field public i:Lmm1;

.field public j:Z

.field public k:J

.field public l:Z

.field public final m:Lkz2;


# direct methods
.method public constructor <init>(Lt83;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnm1;->a:Lt83;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, Lnm1;->f:[Z

    .line 10
    .line 11
    new-instance p1, Lr60;

    .line 12
    .line 13
    const/4 v0, 0x7

    .line 14
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lnm1;->b:Lr60;

    .line 18
    .line 19
    new-instance p1, Lr60;

    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lnm1;->c:Lr60;

    .line 27
    .line 28
    new-instance p1, Lr60;

    .line 29
    .line 30
    const/4 v0, 0x6

    .line 31
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lnm1;->d:Lr60;

    .line 35
    .line 36
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    iput-wide v0, p0, Lnm1;->k:J

    .line 42
    .line 43
    new-instance p1, Lkz2;

    .line 44
    .line 45
    invoke-direct {p1}, Lkz2;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lnm1;->m:Lkz2;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lnm1;->e:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lnm1;->l:Z

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Lnm1;->k:J

    .line 14
    .line 15
    iget-object v1, p0, Lnm1;->f:[Z

    .line 16
    .line 17
    invoke-static {v1}, Lwl2;->Z([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lnm1;->b:Lr60;

    .line 21
    .line 22
    invoke-virtual {v1}, Lr60;->e()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lnm1;->c:Lr60;

    .line 26
    .line 27
    invoke-virtual {v1}, Lr60;->e()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lnm1;->d:Lr60;

    .line 31
    .line 32
    invoke-virtual {v1}, Lr60;->e()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lnm1;->a:Lt83;

    .line 36
    .line 37
    iget-object v1, v1, Lt83;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lfw3;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lfw3;->y(I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lnm1;->i:Lmm1;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iput-boolean v0, v1, Lmm1;->g:Z

    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 13

    .line 1
    iget-object v2, p0, Lnm1;->h:Ljg1;

    .line 2
    .line 3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p1, Lkz2;->b:I

    .line 9
    .line 10
    iget v7, p1, Lkz2;->c:I

    .line 11
    .line 12
    iget-object v8, p1, Lkz2;->a:[B

    .line 13
    .line 14
    iget-wide v3, p0, Lnm1;->e:J

    .line 15
    .line 16
    invoke-virtual {p1}, Lkz2;->B()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    int-to-long v5, v5

    .line 21
    add-long/2addr v3, v5

    .line 22
    iput-wide v3, p0, Lnm1;->e:J

    .line 23
    .line 24
    iget-object v3, p0, Lnm1;->h:Ljg1;

    .line 25
    .line 26
    invoke-virtual {p1}, Lkz2;->B()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v9, 0x0

    .line 31
    invoke-interface {v3, p1, v4, v9}, Ljg1;->a(Lkz2;II)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v1, p0, Lnm1;->f:[Z

    .line 35
    .line 36
    invoke-static {v8, v2, v7, v1}, Lwl2;->W([BII[Z)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v3, p0, Lnm1;->d:Lr60;

    .line 41
    .line 42
    iget-object v4, p0, Lnm1;->c:Lr60;

    .line 43
    .line 44
    iget-object v5, p0, Lnm1;->b:Lr60;

    .line 45
    .line 46
    if-eq v1, v7, :cond_4

    .line 47
    .line 48
    add-int/lit8 v6, v1, 0x3

    .line 49
    .line 50
    aget-byte v6, v8, v6

    .line 51
    .line 52
    and-int/lit8 v10, v6, 0x1f

    .line 53
    .line 54
    const/4 v6, 0x3

    .line 55
    if-lez v1, :cond_0

    .line 56
    .line 57
    add-int/lit8 v11, v1, -0x1

    .line 58
    .line 59
    aget-byte v12, v8, v11

    .line 60
    .line 61
    if-nez v12, :cond_0

    .line 62
    .line 63
    const/4 v6, 0x4

    .line 64
    :goto_1
    move v12, v6

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    move v11, v1

    .line 67
    goto :goto_1

    .line 68
    :goto_2
    sub-int v1, v11, v2

    .line 69
    .line 70
    if-lez v1, :cond_2

    .line 71
    .line 72
    iget-boolean v6, p0, Lnm1;->j:Z

    .line 73
    .line 74
    if-nez v6, :cond_1

    .line 75
    .line 76
    invoke-virtual {v5, v8, v2, v11}, Lr60;->h([BII)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v8, v2, v11}, Lr60;->h([BII)V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v3, v8, v2, v11}, Lr60;->h([BII)V

    .line 83
    .line 84
    .line 85
    :cond_2
    sub-int v2, v7, v11

    .line 86
    .line 87
    iget-wide v3, p0, Lnm1;->e:J

    .line 88
    .line 89
    int-to-long v5, v2

    .line 90
    sub-long/2addr v3, v5

    .line 91
    if-gez v1, :cond_3

    .line 92
    .line 93
    neg-int v1, v1

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move v1, v9

    .line 96
    :goto_3
    iget-wide v5, p0, Lnm1;->k:J

    .line 97
    .line 98
    move v0, v2

    .line 99
    move v2, v1

    .line 100
    move v1, v0

    .line 101
    move-object v0, p0

    .line 102
    invoke-virtual/range {v0 .. v6}, Lnm1;->g(IIJJ)V

    .line 103
    .line 104
    .line 105
    move-wide v2, v3

    .line 106
    iget-wide v4, p0, Lnm1;->k:J

    .line 107
    .line 108
    move v1, v10

    .line 109
    invoke-virtual/range {v0 .. v5}, Lnm1;->f(IJJ)V

    .line 110
    .line 111
    .line 112
    add-int v2, v11, v12

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    iget-boolean v1, p0, Lnm1;->j:Z

    .line 116
    .line 117
    if-nez v1, :cond_5

    .line 118
    .line 119
    invoke-virtual {v5, v8, v2, v7}, Lr60;->h([BII)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v8, v2, v7}, Lr60;->h([BII)V

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-virtual {v3, v8, v2, v7}, Lr60;->h([BII)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final c(Z)V
    .locals 7

    .line 1
    iget-object v1, p0, Lnm1;->h:Ljg1;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lnm1;->a:Lt83;

    .line 11
    .line 12
    iget-object v1, v1, Lt83;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lfw3;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Lfw3;->y(I)V

    .line 18
    .line 19
    .line 20
    iget-wide v3, p0, Lnm1;->e:J

    .line 21
    .line 22
    iget-wide v5, p0, Lnm1;->k:J

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-virtual/range {v0 .. v6}, Lnm1;->g(IIJJ)V

    .line 27
    .line 28
    .line 29
    iget-wide v2, p0, Lnm1;->e:J

    .line 30
    .line 31
    const/16 v1, 0x9

    .line 32
    .line 33
    iget-wide v4, p0, Lnm1;->k:J

    .line 34
    .line 35
    invoke-virtual/range {v0 .. v5}, Lnm1;->f(IJJ)V

    .line 36
    .line 37
    .line 38
    iget-wide v3, p0, Lnm1;->e:J

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget-wide v5, p0, Lnm1;->k:J

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual/range {v0 .. v6}, Lnm1;->g(IIJJ)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lnm1;->k:J

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-boolean p2, p0, Lnm1;->l:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    or-int/2addr p1, p2

    .line 13
    iput-boolean p1, p0, Lnm1;->l:Z

    .line 14
    .line 15
    return-void
.end method

.method public final e(Lnf1;Lin1;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lin1;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lin1;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lin1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lnm1;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lin1;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lin1;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lnf1;->z(II)Ljg1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lnm1;->h:Ljg1;

    .line 22
    .line 23
    new-instance v1, Lmm1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lmm1;-><init>(Ljg1;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lnm1;->i:Lmm1;

    .line 29
    .line 30
    iget-object v0, p0, Lnm1;->a:Lt83;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lt83;->U(Lnf1;Lin1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final f(IJJ)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lnm1;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnm1;->b:Lr60;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lr60;->g(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lnm1;->c:Lr60;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lr60;->g(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lnm1;->d:Lr60;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lr60;->g(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lnm1;->i:Lmm1;

    .line 21
    .line 22
    iget-boolean v1, p0, Lnm1;->l:Z

    .line 23
    .line 24
    iput p1, v0, Lmm1;->d:I

    .line 25
    .line 26
    iput-wide p4, v0, Lmm1;->f:J

    .line 27
    .line 28
    iput-wide p2, v0, Lmm1;->e:J

    .line 29
    .line 30
    iput-boolean v1, v0, Lmm1;->k:Z

    .line 31
    .line 32
    return-void
.end method

.method public final g(IIJJ)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lnm1;->a:Lt83;

    .line 6
    .line 7
    iget-object v2, v2, Lt83;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lfw3;

    .line 10
    .line 11
    iget-boolean v3, v0, Lnm1;->j:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x4

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v3, v0, Lnm1;->b:Lr60;

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Lr60;->i(I)Z

    .line 22
    .line 23
    .line 24
    iget-object v6, v0, Lnm1;->c:Lr60;

    .line 25
    .line 26
    invoke-virtual {v6, v1}, Lr60;->i(I)Z

    .line 27
    .line 28
    .line 29
    iget-boolean v7, v0, Lnm1;->j:Z

    .line 30
    .line 31
    if-nez v7, :cond_1

    .line 32
    .line 33
    iget-boolean v7, v3, Lr60;->d:Z

    .line 34
    .line 35
    if-eqz v7, :cond_3

    .line 36
    .line 37
    iget-boolean v7, v6, Lr60;->d:Z

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    new-instance v7, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v8, v3, Lr60;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v8, [B

    .line 49
    .line 50
    iget v9, v3, Lr60;->e:I

    .line 51
    .line 52
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    iget-object v8, v6, Lr60;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, [B

    .line 62
    .line 63
    iget v9, v6, Lr60;->e:I

    .line 64
    .line 65
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iget-object v8, v3, Lr60;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, [B

    .line 75
    .line 76
    iget v9, v3, Lr60;->e:I

    .line 77
    .line 78
    invoke-static {v8, v5, v9}, Lwl2;->O([BII)Lx93;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    iget-object v9, v6, Lr60;->f:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v9, [B

    .line 85
    .line 86
    iget v10, v6, Lr60;->e:I

    .line 87
    .line 88
    new-instance v11, Llg1;

    .line 89
    .line 90
    invoke-direct {v11, v9, v5, v10}, Llg1;-><init>([BII)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v11}, Llg1;->p()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-virtual {v11}, Llg1;->p()I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11}, Llg1;->a()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v11}, Llg1;->j()Z

    .line 104
    .line 105
    .line 106
    new-instance v10, Ltv2;

    .line 107
    .line 108
    invoke-direct {v10, v9}, Ltv2;-><init>(I)V

    .line 109
    .line 110
    .line 111
    iget v11, v8, Lx93;->a:I

    .line 112
    .line 113
    iget v12, v8, Lx93;->b:I

    .line 114
    .line 115
    iget v13, v8, Lx93;->c:I

    .line 116
    .line 117
    sget-object v14, Lmo2;->a:[B

    .line 118
    .line 119
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    filled-new-array {v11, v12, v13}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    const-string v12, "avc1.%02X%02X%02X"

    .line 136
    .line 137
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    iget-object v12, v0, Lnm1;->h:Ljg1;

    .line 142
    .line 143
    new-instance v13, Lgg4;

    .line 144
    .line 145
    invoke-direct {v13}, Lgg4;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v14, v0, Lnm1;->g:Ljava/lang/String;

    .line 149
    .line 150
    iput-object v14, v13, Lgg4;->a:Ljava/lang/String;

    .line 151
    .line 152
    const-string v14, "video/mp2t"

    .line 153
    .line 154
    invoke-virtual {v13, v14}, Lgg4;->d(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v14, "video/avc"

    .line 158
    .line 159
    invoke-virtual {v13, v14}, Lgg4;->e(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iput-object v11, v13, Lgg4;->i:Ljava/lang/String;

    .line 163
    .line 164
    iget v11, v8, Lx93;->e:I

    .line 165
    .line 166
    iput v11, v13, Lgg4;->s:I

    .line 167
    .line 168
    iget v11, v8, Lx93;->f:I

    .line 169
    .line 170
    iput v11, v13, Lgg4;->t:I

    .line 171
    .line 172
    iget v15, v8, Lx93;->j:I

    .line 173
    .line 174
    iget v11, v8, Lx93;->k:I

    .line 175
    .line 176
    iget v14, v8, Lx93;->l:I

    .line 177
    .line 178
    iget v5, v8, Lx93;->h:I

    .line 179
    .line 180
    add-int/lit8 v19, v5, 0x8

    .line 181
    .line 182
    iget v5, v8, Lx93;->i:I

    .line 183
    .line 184
    add-int/lit8 v20, v5, 0x8

    .line 185
    .line 186
    move/from16 v17, v14

    .line 187
    .line 188
    new-instance v14, Ln74;

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    move/from16 v16, v11

    .line 193
    .line 194
    invoke-direct/range {v14 .. v20}, Ln74;-><init>(III[BII)V

    .line 195
    .line 196
    .line 197
    iput-object v14, v13, Lgg4;->B:Ln74;

    .line 198
    .line 199
    iget v5, v8, Lx93;->g:F

    .line 200
    .line 201
    iput v5, v13, Lgg4;->y:F

    .line 202
    .line 203
    iput-object v7, v13, Lgg4;->o:Ljava/util/List;

    .line 204
    .line 205
    iget v5, v8, Lx93;->m:I

    .line 206
    .line 207
    iput v5, v13, Lgg4;->n:I

    .line 208
    .line 209
    new-instance v7, Lph4;

    .line 210
    .line 211
    invoke-direct {v7, v13}, Lph4;-><init>(Lgg4;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v12, v7}, Ljg1;->d(Lph4;)V

    .line 215
    .line 216
    .line 217
    iput-boolean v4, v0, Lnm1;->j:Z

    .line 218
    .line 219
    invoke-virtual {v2, v5}, Lfw3;->w(I)V

    .line 220
    .line 221
    .line 222
    iget-object v5, v0, Lnm1;->i:Lmm1;

    .line 223
    .line 224
    iget-object v5, v5, Lmm1;->b:Landroid/util/SparseArray;

    .line 225
    .line 226
    iget v7, v8, Lx93;->d:I

    .line 227
    .line 228
    invoke-virtual {v5, v7, v8}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v5, v0, Lnm1;->i:Lmm1;

    .line 232
    .line 233
    iget-object v5, v5, Lmm1;->c:Landroid/util/SparseArray;

    .line 234
    .line 235
    invoke-virtual {v5, v9, v10}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Lr60;->e()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Lr60;->e()V

    .line 242
    .line 243
    .line 244
    goto :goto_0

    .line 245
    :cond_1
    iget-boolean v5, v3, Lr60;->d:Z

    .line 246
    .line 247
    if-eqz v5, :cond_2

    .line 248
    .line 249
    iget-object v5, v3, Lr60;->f:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v5, [B

    .line 252
    .line 253
    iget v6, v3, Lr60;->e:I

    .line 254
    .line 255
    const/4 v7, 0x4

    .line 256
    invoke-static {v5, v7, v6}, Lwl2;->O([BII)Lx93;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    iget v6, v5, Lx93;->m:I

    .line 261
    .line 262
    invoke-virtual {v2, v6}, Lfw3;->w(I)V

    .line 263
    .line 264
    .line 265
    iget-object v6, v0, Lnm1;->i:Lmm1;

    .line 266
    .line 267
    iget-object v6, v6, Lmm1;->b:Landroid/util/SparseArray;

    .line 268
    .line 269
    iget v7, v5, Lx93;->d:I

    .line 270
    .line 271
    invoke-virtual {v6, v7, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Lr60;->e()V

    .line 275
    .line 276
    .line 277
    goto :goto_0

    .line 278
    :cond_2
    iget-boolean v3, v6, Lr60;->d:Z

    .line 279
    .line 280
    if-eqz v3, :cond_3

    .line 281
    .line 282
    iget-object v3, v6, Lr60;->f:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v3, [B

    .line 285
    .line 286
    iget v5, v6, Lr60;->e:I

    .line 287
    .line 288
    new-instance v7, Llg1;

    .line 289
    .line 290
    const/4 v8, 0x4

    .line 291
    invoke-direct {v7, v3, v8, v5}, Llg1;-><init>([BII)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7}, Llg1;->p()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    invoke-virtual {v7}, Llg1;->p()I

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7}, Llg1;->a()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7}, Llg1;->j()Z

    .line 305
    .line 306
    .line 307
    new-instance v5, Ltv2;

    .line 308
    .line 309
    invoke-direct {v5, v3}, Ltv2;-><init>(I)V

    .line 310
    .line 311
    .line 312
    iget-object v7, v0, Lnm1;->i:Lmm1;

    .line 313
    .line 314
    iget-object v7, v7, Lmm1;->c:Landroid/util/SparseArray;

    .line 315
    .line 316
    invoke-virtual {v7, v3, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6}, Lr60;->e()V

    .line 320
    .line 321
    .line 322
    :cond_3
    :goto_0
    iget-object v3, v0, Lnm1;->d:Lr60;

    .line 323
    .line 324
    invoke-virtual {v3, v1}, Lr60;->i(I)Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_4

    .line 329
    .line 330
    iget-object v1, v3, Lr60;->f:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v1, [B

    .line 333
    .line 334
    iget v5, v3, Lr60;->e:I

    .line 335
    .line 336
    invoke-static {v5, v1}, Lwl2;->z(I[B)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    iget-object v3, v3, Lr60;->f:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v3, [B

    .line 343
    .line 344
    iget-object v5, v0, Lnm1;->m:Lkz2;

    .line 345
    .line 346
    invoke-virtual {v5, v1, v3}, Lkz2;->z(I[B)V

    .line 347
    .line 348
    .line 349
    const/4 v7, 0x4

    .line 350
    invoke-virtual {v5, v7}, Lkz2;->E(I)V

    .line 351
    .line 352
    .line 353
    move-wide/from16 v6, p5

    .line 354
    .line 355
    invoke-virtual {v2, v6, v7, v5}, Lfw3;->x(JLkz2;)V

    .line 356
    .line 357
    .line 358
    :cond_4
    iget-object v1, v0, Lnm1;->i:Lmm1;

    .line 359
    .line 360
    iget-boolean v2, v0, Lnm1;->j:Z

    .line 361
    .line 362
    iget v3, v1, Lmm1;->d:I

    .line 363
    .line 364
    const/16 v5, 0x9

    .line 365
    .line 366
    const/4 v6, 0x0

    .line 367
    if-eq v3, v5, :cond_5

    .line 368
    .line 369
    goto :goto_1

    .line 370
    :cond_5
    if-eqz v2, :cond_6

    .line 371
    .line 372
    iget-boolean v2, v1, Lmm1;->g:Z

    .line 373
    .line 374
    if-eqz v2, :cond_6

    .line 375
    .line 376
    iget-wide v2, v1, Lmm1;->e:J

    .line 377
    .line 378
    sub-long v7, p3, v2

    .line 379
    .line 380
    long-to-int v5, v7

    .line 381
    add-int v12, p1, v5

    .line 382
    .line 383
    iget-wide v8, v1, Lmm1;->i:J

    .line 384
    .line 385
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    cmp-long v5, v8, v10

    .line 391
    .line 392
    if-eqz v5, :cond_6

    .line 393
    .line 394
    iget-wide v10, v1, Lmm1;->h:J

    .line 395
    .line 396
    cmp-long v5, v2, v10

    .line 397
    .line 398
    if-eqz v5, :cond_6

    .line 399
    .line 400
    move-wide v13, v10

    .line 401
    iget-boolean v10, v1, Lmm1;->j:Z

    .line 402
    .line 403
    iget-object v7, v1, Lmm1;->a:Ljg1;

    .line 404
    .line 405
    sub-long/2addr v2, v13

    .line 406
    long-to-int v11, v2

    .line 407
    const/4 v13, 0x0

    .line 408
    invoke-interface/range {v7 .. v13}, Ljg1;->c(JIIILig1;)V

    .line 409
    .line 410
    .line 411
    :cond_6
    iget-wide v2, v1, Lmm1;->e:J

    .line 412
    .line 413
    iput-wide v2, v1, Lmm1;->h:J

    .line 414
    .line 415
    iget-wide v2, v1, Lmm1;->f:J

    .line 416
    .line 417
    iput-wide v2, v1, Lmm1;->i:J

    .line 418
    .line 419
    iput-boolean v6, v1, Lmm1;->j:Z

    .line 420
    .line 421
    iput-boolean v4, v1, Lmm1;->g:Z

    .line 422
    .line 423
    :goto_1
    iget-boolean v2, v1, Lmm1;->k:Z

    .line 424
    .line 425
    iget-boolean v3, v1, Lmm1;->j:Z

    .line 426
    .line 427
    iget v5, v1, Lmm1;->d:I

    .line 428
    .line 429
    const/4 v7, 0x5

    .line 430
    if-eq v5, v7, :cond_8

    .line 431
    .line 432
    if-eqz v2, :cond_7

    .line 433
    .line 434
    if-ne v5, v4, :cond_7

    .line 435
    .line 436
    goto :goto_2

    .line 437
    :cond_7
    move v4, v6

    .line 438
    :cond_8
    :goto_2
    or-int v2, v3, v4

    .line 439
    .line 440
    iput-boolean v2, v1, Lmm1;->j:Z

    .line 441
    .line 442
    const/16 v3, 0x18

    .line 443
    .line 444
    iput v3, v1, Lmm1;->d:I

    .line 445
    .line 446
    if-eqz v2, :cond_9

    .line 447
    .line 448
    iput-boolean v6, v0, Lnm1;->l:Z

    .line 449
    .line 450
    :cond_9
    return-void
.end method
