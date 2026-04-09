.class public final Lpm1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgm1;


# instance fields
.field public final a:Lt83;

.field public b:Ljava/lang/String;

.field public c:Ljg1;

.field public d:Lom1;

.field public e:Z

.field public final f:[Z

.field public final g:Lr60;

.field public final h:Lr60;

.field public final i:Lr60;

.field public final j:Lr60;

.field public final k:Lr60;

.field public l:J

.field public m:J

.field public final n:Lkz2;


# direct methods
.method public constructor <init>(Lt83;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpm1;->a:Lt83;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, Lpm1;->f:[Z

    .line 10
    .line 11
    new-instance p1, Lr60;

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lpm1;->g:Lr60;

    .line 19
    .line 20
    new-instance p1, Lr60;

    .line 21
    .line 22
    const/16 v0, 0x21

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lpm1;->h:Lr60;

    .line 28
    .line 29
    new-instance p1, Lr60;

    .line 30
    .line 31
    const/16 v0, 0x22

    .line 32
    .line 33
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lpm1;->i:Lr60;

    .line 37
    .line 38
    new-instance p1, Lr60;

    .line 39
    .line 40
    const/16 v0, 0x27

    .line 41
    .line 42
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lpm1;->j:Lr60;

    .line 46
    .line 47
    new-instance p1, Lr60;

    .line 48
    .line 49
    const/16 v0, 0x28

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lr60;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lpm1;->k:Lr60;

    .line 55
    .line 56
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    iput-wide v0, p0, Lpm1;->m:J

    .line 62
    .line 63
    new-instance p1, Lkz2;

    .line 64
    .line 65
    invoke-direct {p1}, Lkz2;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lpm1;->n:Lkz2;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lpm1;->l:J

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iput-wide v0, p0, Lpm1;->m:J

    .line 11
    .line 12
    iget-object v0, p0, Lpm1;->f:[Z

    .line 13
    .line 14
    invoke-static {v0}, Lwl2;->Z([Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lpm1;->g:Lr60;

    .line 18
    .line 19
    invoke-virtual {v0}, Lr60;->e()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lpm1;->h:Lr60;

    .line 23
    .line 24
    invoke-virtual {v0}, Lr60;->e()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lpm1;->i:Lr60;

    .line 28
    .line 29
    invoke-virtual {v0}, Lr60;->e()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lpm1;->j:Lr60;

    .line 33
    .line 34
    invoke-virtual {v0}, Lr60;->e()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lpm1;->k:Lr60;

    .line 38
    .line 39
    invoke-virtual {v0}, Lr60;->e()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lpm1;->a:Lt83;

    .line 43
    .line 44
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lfw3;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, Lfw3;->y(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lpm1;->d:Lom1;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    iput-boolean v1, v0, Lom1;->f:Z

    .line 57
    .line 58
    iput-boolean v1, v0, Lom1;->g:Z

    .line 59
    .line 60
    iput-boolean v1, v0, Lom1;->h:Z

    .line 61
    .line 62
    iput-boolean v1, v0, Lom1;->i:Z

    .line 63
    .line 64
    iput-boolean v1, v0, Lom1;->j:Z

    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final b(Lkz2;)V
    .locals 15

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    iget-object v1, p0, Lpm1;->c:Ljg1;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v7}, Lkz2;->B()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lez v1, :cond_5

    .line 15
    .line 16
    iget v1, v7, Lkz2;->b:I

    .line 17
    .line 18
    iget v8, v7, Lkz2;->c:I

    .line 19
    .line 20
    iget-object v9, v7, Lkz2;->a:[B

    .line 21
    .line 22
    iget-wide v2, p0, Lpm1;->l:J

    .line 23
    .line 24
    invoke-virtual {v7}, Lkz2;->B()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    int-to-long v4, v4

    .line 29
    add-long/2addr v2, v4

    .line 30
    iput-wide v2, p0, Lpm1;->l:J

    .line 31
    .line 32
    iget-object v2, p0, Lpm1;->c:Ljg1;

    .line 33
    .line 34
    invoke-virtual {v7}, Lkz2;->B()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-interface {v2, v7, v3, v10}, Ljg1;->a(Lkz2;II)V

    .line 40
    .line 41
    .line 42
    :goto_0
    if-ge v1, v8, :cond_0

    .line 43
    .line 44
    iget-object v2, p0, Lpm1;->f:[Z

    .line 45
    .line 46
    invoke-static {v9, v1, v8, v2}, Lwl2;->W([BII[Z)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eq v2, v8, :cond_4

    .line 51
    .line 52
    add-int/lit8 v3, v2, 0x3

    .line 53
    .line 54
    aget-byte v3, v9, v3

    .line 55
    .line 56
    and-int/lit8 v3, v3, 0x7e

    .line 57
    .line 58
    const/4 v4, 0x3

    .line 59
    if-lez v2, :cond_1

    .line 60
    .line 61
    add-int/lit8 v5, v2, -0x1

    .line 62
    .line 63
    aget-byte v6, v9, v5

    .line 64
    .line 65
    if-nez v6, :cond_1

    .line 66
    .line 67
    const/4 v4, 0x4

    .line 68
    move v12, v4

    .line 69
    move v11, v5

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v11, v2

    .line 72
    move v12, v4

    .line 73
    :goto_1
    sub-int v2, v11, v1

    .line 74
    .line 75
    if-lez v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, v9, v1, v11}, Lpm1;->g([BII)V

    .line 78
    .line 79
    .line 80
    :cond_2
    sub-int v1, v8, v11

    .line 81
    .line 82
    iget-wide v4, p0, Lpm1;->l:J

    .line 83
    .line 84
    int-to-long v13, v1

    .line 85
    sub-long/2addr v4, v13

    .line 86
    if-gez v2, :cond_3

    .line 87
    .line 88
    neg-int v2, v2

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move v2, v10

    .line 91
    :goto_2
    shr-int/lit8 v13, v3, 0x1

    .line 92
    .line 93
    move-wide v3, v4

    .line 94
    iget-wide v5, p0, Lpm1;->m:J

    .line 95
    .line 96
    move-object v0, p0

    .line 97
    invoke-virtual/range {v0 .. v6}, Lpm1;->h(IIJJ)V

    .line 98
    .line 99
    .line 100
    iget-wide v5, p0, Lpm1;->m:J

    .line 101
    .line 102
    move v2, v13

    .line 103
    invoke-virtual/range {v0 .. v6}, Lpm1;->f(IIJJ)V

    .line 104
    .line 105
    .line 106
    add-int v1, v11, v12

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    invoke-virtual {p0, v9, v1, v8}, Lpm1;->g([BII)V

    .line 110
    .line 111
    .line 112
    :cond_5
    return-void
.end method

.method public final c(Z)V
    .locals 7

    .line 1
    iget-object v1, p0, Lpm1;->c:Ljg1;

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
    iget-object v1, p0, Lpm1;->a:Lt83;

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
    iget-wide v3, p0, Lpm1;->l:J

    .line 21
    .line 22
    iget-wide v5, p0, Lpm1;->m:J

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-virtual/range {v0 .. v6}, Lpm1;->h(IIJJ)V

    .line 27
    .line 28
    .line 29
    iget-wide v3, p0, Lpm1;->l:J

    .line 30
    .line 31
    const/16 v2, 0x30

    .line 32
    .line 33
    iget-wide v5, p0, Lpm1;->m:J

    .line 34
    .line 35
    invoke-virtual/range {v0 .. v6}, Lpm1;->f(IIJJ)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lpm1;->m:J

    .line 2
    .line 3
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
    iput-object v0, p0, Lpm1;->b:Ljava/lang/String;

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
    iput-object v0, p0, Lpm1;->c:Ljg1;

    .line 22
    .line 23
    new-instance v1, Lom1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lom1;-><init>(Ljg1;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lpm1;->d:Lom1;

    .line 29
    .line 30
    iget-object v0, p0, Lpm1;->a:Lt83;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lt83;->U(Lnf1;Lin1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final f(IIJJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lpm1;->d:Lom1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lpm1;->e:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-boolean v2, v0, Lom1;->g:Z

    .line 7
    .line 8
    iput-boolean v2, v0, Lom1;->h:Z

    .line 9
    .line 10
    iput-wide p5, v0, Lom1;->e:J

    .line 11
    .line 12
    iput v2, v0, Lom1;->d:I

    .line 13
    .line 14
    iput-wide p3, v0, Lom1;->b:J

    .line 15
    .line 16
    const/16 p3, 0x20

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    if-lt p2, p3, :cond_4

    .line 20
    .line 21
    const/16 p3, 0x28

    .line 22
    .line 23
    if-ne p2, p3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-boolean p3, v0, Lom1;->i:Z

    .line 27
    .line 28
    if-eqz p3, :cond_2

    .line 29
    .line 30
    iget-boolean p3, v0, Lom1;->j:Z

    .line 31
    .line 32
    if-nez p3, :cond_2

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lom1;->a(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-boolean v2, v0, Lom1;->i:Z

    .line 40
    .line 41
    :cond_2
    const/16 p1, 0x23

    .line 42
    .line 43
    if-le p2, p1, :cond_3

    .line 44
    .line 45
    const/16 p1, 0x27

    .line 46
    .line 47
    if-ne p2, p1, :cond_4

    .line 48
    .line 49
    :cond_3
    iget-boolean p1, v0, Lom1;->j:Z

    .line 50
    .line 51
    xor-int/2addr p1, p4

    .line 52
    iput-boolean p1, v0, Lom1;->h:Z

    .line 53
    .line 54
    iput-boolean p4, v0, Lom1;->j:Z

    .line 55
    .line 56
    :cond_4
    :goto_0
    const/16 p1, 0x10

    .line 57
    .line 58
    if-lt p2, p1, :cond_5

    .line 59
    .line 60
    const/16 p1, 0x15

    .line 61
    .line 62
    if-gt p2, p1, :cond_5

    .line 63
    .line 64
    move p1, p4

    .line 65
    goto :goto_1

    .line 66
    :cond_5
    move p1, v2

    .line 67
    :goto_1
    iput-boolean p1, v0, Lom1;->c:Z

    .line 68
    .line 69
    if-nez p1, :cond_6

    .line 70
    .line 71
    const/16 p1, 0x9

    .line 72
    .line 73
    if-gt p2, p1, :cond_7

    .line 74
    .line 75
    :cond_6
    move v2, p4

    .line 76
    :cond_7
    iput-boolean v2, v0, Lom1;->f:Z

    .line 77
    .line 78
    iget-boolean p1, p0, Lpm1;->e:Z

    .line 79
    .line 80
    if-nez p1, :cond_8

    .line 81
    .line 82
    iget-object p1, p0, Lpm1;->g:Lr60;

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lr60;->g(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lpm1;->h:Lr60;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Lr60;->g(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lpm1;->i:Lr60;

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Lr60;->g(I)V

    .line 95
    .line 96
    .line 97
    :cond_8
    iget-object p1, p0, Lpm1;->j:Lr60;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lr60;->g(I)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lpm1;->k:Lr60;

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lr60;->g(I)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final g([BII)V
    .locals 3

    .line 1
    iget-object v0, p0, Lpm1;->d:Lom1;

    .line 2
    .line 3
    iget-boolean v1, v0, Lom1;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    add-int/lit8 v1, p2, 0x2

    .line 8
    .line 9
    iget v2, v0, Lom1;->d:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    if-ge v1, p3, :cond_1

    .line 13
    .line 14
    aget-byte v1, p1, v1

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0x80

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    iput-boolean v1, v0, Lom1;->g:Z

    .line 25
    .line 26
    iput-boolean v2, v0, Lom1;->f:Z

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sub-int v1, p3, p2

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, v0, Lom1;->d:I

    .line 33
    .line 34
    :cond_2
    :goto_1
    iget-boolean v0, p0, Lpm1;->e:Z

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lpm1;->g:Lr60;

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, p3}, Lr60;->h([BII)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lpm1;->h:Lr60;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lr60;->h([BII)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lpm1;->i:Lr60;

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2, p3}, Lr60;->h([BII)V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget-object v0, p0, Lpm1;->j:Lr60;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lr60;->h([BII)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lpm1;->k:Lr60;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2, p3}, Lr60;->h([BII)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final h(IIJJ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-wide/from16 v2, p5

    .line 6
    .line 7
    iget-object v4, v0, Lpm1;->a:Lt83;

    .line 8
    .line 9
    iget-object v4, v4, Lt83;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Lfw3;

    .line 12
    .line 13
    iget-object v5, v0, Lpm1;->d:Lom1;

    .line 14
    .line 15
    iget-boolean v6, v0, Lpm1;->e:Z

    .line 16
    .line 17
    iget-boolean v7, v5, Lom1;->j:Z

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    if-eqz v7, :cond_1

    .line 22
    .line 23
    iget-boolean v7, v5, Lom1;->g:Z

    .line 24
    .line 25
    if-nez v7, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-boolean v6, v5, Lom1;->c:Z

    .line 29
    .line 30
    iput-boolean v6, v5, Lom1;->m:Z

    .line 31
    .line 32
    iput-boolean v9, v5, Lom1;->j:Z

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    iget-boolean v7, v5, Lom1;->h:Z

    .line 36
    .line 37
    if-nez v7, :cond_2

    .line 38
    .line 39
    iget-boolean v7, v5, Lom1;->g:Z

    .line 40
    .line 41
    if-eqz v7, :cond_4

    .line 42
    .line 43
    :cond_2
    if-eqz v6, :cond_3

    .line 44
    .line 45
    iget-boolean v6, v5, Lom1;->i:Z

    .line 46
    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    iget-wide v6, v5, Lom1;->b:J

    .line 50
    .line 51
    sub-long v6, p3, v6

    .line 52
    .line 53
    long-to-int v6, v6

    .line 54
    add-int v6, p1, v6

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Lom1;->a(I)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-wide v6, v5, Lom1;->b:J

    .line 60
    .line 61
    iput-wide v6, v5, Lom1;->k:J

    .line 62
    .line 63
    iget-wide v6, v5, Lom1;->e:J

    .line 64
    .line 65
    iput-wide v6, v5, Lom1;->l:J

    .line 66
    .line 67
    iget-boolean v6, v5, Lom1;->c:Z

    .line 68
    .line 69
    iput-boolean v6, v5, Lom1;->m:Z

    .line 70
    .line 71
    iput-boolean v8, v5, Lom1;->i:Z

    .line 72
    .line 73
    :cond_4
    :goto_1
    iget-boolean v5, v0, Lpm1;->e:Z

    .line 74
    .line 75
    if-nez v5, :cond_7

    .line 76
    .line 77
    iget-object v5, v0, Lpm1;->g:Lr60;

    .line 78
    .line 79
    invoke-virtual {v5, v1}, Lr60;->i(I)Z

    .line 80
    .line 81
    .line 82
    iget-object v6, v0, Lpm1;->h:Lr60;

    .line 83
    .line 84
    invoke-virtual {v6, v1}, Lr60;->i(I)Z

    .line 85
    .line 86
    .line 87
    iget-object v7, v0, Lpm1;->i:Lr60;

    .line 88
    .line 89
    invoke-virtual {v7, v1}, Lr60;->i(I)Z

    .line 90
    .line 91
    .line 92
    iget-boolean v10, v5, Lr60;->d:Z

    .line 93
    .line 94
    if-eqz v10, :cond_7

    .line 95
    .line 96
    iget-boolean v10, v6, Lr60;->d:Z

    .line 97
    .line 98
    if-eqz v10, :cond_7

    .line 99
    .line 100
    iget-boolean v10, v7, Lr60;->d:Z

    .line 101
    .line 102
    if-eqz v10, :cond_7

    .line 103
    .line 104
    iget-object v10, v0, Lpm1;->b:Ljava/lang/String;

    .line 105
    .line 106
    iget v11, v5, Lr60;->e:I

    .line 107
    .line 108
    iget v12, v6, Lr60;->e:I

    .line 109
    .line 110
    add-int/2addr v12, v11

    .line 111
    iget v13, v7, Lr60;->e:I

    .line 112
    .line 113
    add-int/2addr v12, v13

    .line 114
    new-array v12, v12, [B

    .line 115
    .line 116
    iget-object v13, v5, Lr60;->f:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v13, [B

    .line 119
    .line 120
    invoke-static {v13, v9, v12, v9, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    iget-object v11, v6, Lr60;->f:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v11, [B

    .line 126
    .line 127
    iget v13, v5, Lr60;->e:I

    .line 128
    .line 129
    iget v14, v6, Lr60;->e:I

    .line 130
    .line 131
    invoke-static {v11, v9, v12, v13, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    .line 133
    .line 134
    iget-object v11, v7, Lr60;->f:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v11, [B

    .line 137
    .line 138
    iget v5, v5, Lr60;->e:I

    .line 139
    .line 140
    iget v13, v6, Lr60;->e:I

    .line 141
    .line 142
    add-int/2addr v5, v13

    .line 143
    iget v7, v7, Lr60;->e:I

    .line 144
    .line 145
    invoke-static {v11, v9, v12, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    .line 147
    .line 148
    iget-object v5, v6, Lr60;->f:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v5, [B

    .line 151
    .line 152
    const/4 v7, 0x3

    .line 153
    iget v6, v6, Lr60;->e:I

    .line 154
    .line 155
    const/4 v11, 0x0

    .line 156
    invoke-static {v5, v7, v6, v11}, Lwl2;->T([BIILp21;)Lf83;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    iget-object v6, v5, Lf83;->b:Lq63;

    .line 161
    .line 162
    if-eqz v6, :cond_5

    .line 163
    .line 164
    iget v7, v6, Lq63;->f:I

    .line 165
    .line 166
    iget-object v11, v6, Lq63;->e:[I

    .line 167
    .line 168
    iget v13, v6, Lq63;->d:I

    .line 169
    .line 170
    iget v15, v6, Lq63;->c:I

    .line 171
    .line 172
    iget-boolean v14, v6, Lq63;->b:Z

    .line 173
    .line 174
    iget v6, v6, Lq63;->a:I

    .line 175
    .line 176
    move/from16 v18, v7

    .line 177
    .line 178
    move-object/from16 v17, v11

    .line 179
    .line 180
    move/from16 v16, v13

    .line 181
    .line 182
    move v13, v6

    .line 183
    invoke-static/range {v13 .. v18}, Lmo2;->a(IZII[II)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    :cond_5
    new-instance v6, Lgg4;

    .line 188
    .line 189
    invoke-direct {v6}, Lgg4;-><init>()V

    .line 190
    .line 191
    .line 192
    iput-object v10, v6, Lgg4;->a:Ljava/lang/String;

    .line 193
    .line 194
    const-string v7, "video/mp2t"

    .line 195
    .line 196
    invoke-virtual {v6, v7}, Lgg4;->d(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const-string v7, "video/hevc"

    .line 200
    .line 201
    invoke-virtual {v6, v7}, Lgg4;->e(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iput-object v11, v6, Lgg4;->i:Ljava/lang/String;

    .line 205
    .line 206
    iget v7, v5, Lf83;->e:I

    .line 207
    .line 208
    iput v7, v6, Lgg4;->s:I

    .line 209
    .line 210
    iget v7, v5, Lf83;->f:I

    .line 211
    .line 212
    iput v7, v6, Lgg4;->t:I

    .line 213
    .line 214
    iget v7, v5, Lf83;->g:I

    .line 215
    .line 216
    iput v7, v6, Lgg4;->u:I

    .line 217
    .line 218
    iget v7, v5, Lf83;->h:I

    .line 219
    .line 220
    iput v7, v6, Lgg4;->v:I

    .line 221
    .line 222
    iget v14, v5, Lf83;->k:I

    .line 223
    .line 224
    iget v15, v5, Lf83;->l:I

    .line 225
    .line 226
    iget v7, v5, Lf83;->m:I

    .line 227
    .line 228
    iget v10, v5, Lf83;->c:I

    .line 229
    .line 230
    add-int/lit8 v18, v10, 0x8

    .line 231
    .line 232
    iget v10, v5, Lf83;->d:I

    .line 233
    .line 234
    add-int/lit8 v19, v10, 0x8

    .line 235
    .line 236
    new-instance v13, Ln74;

    .line 237
    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    move/from16 v16, v7

    .line 241
    .line 242
    invoke-direct/range {v13 .. v19}, Ln74;-><init>(III[BII)V

    .line 243
    .line 244
    .line 245
    iput-object v13, v6, Lgg4;->B:Ln74;

    .line 246
    .line 247
    iget v7, v5, Lf83;->i:F

    .line 248
    .line 249
    iput v7, v6, Lgg4;->y:F

    .line 250
    .line 251
    iget v7, v5, Lf83;->j:I

    .line 252
    .line 253
    iput v7, v6, Lgg4;->n:I

    .line 254
    .line 255
    iget v5, v5, Lf83;->a:I

    .line 256
    .line 257
    add-int/2addr v5, v8

    .line 258
    iput v5, v6, Lgg4;->C:I

    .line 259
    .line 260
    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    iput-object v5, v6, Lgg4;->o:Ljava/util/List;

    .line 265
    .line 266
    new-instance v5, Lph4;

    .line 267
    .line 268
    invoke-direct {v5, v6}, Lph4;-><init>(Lgg4;)V

    .line 269
    .line 270
    .line 271
    iget-object v6, v0, Lpm1;->c:Ljg1;

    .line 272
    .line 273
    invoke-interface {v6, v5}, Ljg1;->d(Lph4;)V

    .line 274
    .line 275
    .line 276
    const/4 v6, -0x1

    .line 277
    iget v5, v5, Lph4;->o:I

    .line 278
    .line 279
    if-eq v5, v6, :cond_6

    .line 280
    .line 281
    move v9, v8

    .line 282
    :cond_6
    invoke-static {v9}, Lzt0;->b0(Z)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, v5}, Lfw3;->w(I)V

    .line 286
    .line 287
    .line 288
    iput-boolean v8, v0, Lpm1;->e:Z

    .line 289
    .line 290
    :cond_7
    iget-object v5, v0, Lpm1;->j:Lr60;

    .line 291
    .line 292
    invoke-virtual {v5, v1}, Lr60;->i(I)Z

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    const/4 v7, 0x5

    .line 297
    iget-object v8, v0, Lpm1;->n:Lkz2;

    .line 298
    .line 299
    if-eqz v6, :cond_8

    .line 300
    .line 301
    iget-object v6, v5, Lr60;->f:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v6, [B

    .line 304
    .line 305
    iget v9, v5, Lr60;->e:I

    .line 306
    .line 307
    invoke-static {v9, v6}, Lwl2;->z(I[B)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    iget-object v5, v5, Lr60;->f:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v5, [B

    .line 314
    .line 315
    invoke-virtual {v8, v6, v5}, Lkz2;->z(I[B)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8, v7}, Lkz2;->G(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v2, v3, v8}, Lfw3;->x(JLkz2;)V

    .line 322
    .line 323
    .line 324
    :cond_8
    iget-object v5, v0, Lpm1;->k:Lr60;

    .line 325
    .line 326
    invoke-virtual {v5, v1}, Lr60;->i(I)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_9

    .line 331
    .line 332
    iget-object v1, v5, Lr60;->f:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, [B

    .line 335
    .line 336
    iget v6, v5, Lr60;->e:I

    .line 337
    .line 338
    invoke-static {v6, v1}, Lwl2;->z(I[B)I

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    iget-object v5, v5, Lr60;->f:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v5, [B

    .line 345
    .line 346
    invoke-virtual {v8, v1, v5}, Lkz2;->z(I[B)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v8, v7}, Lkz2;->G(I)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4, v2, v3, v8}, Lfw3;->x(JLkz2;)V

    .line 353
    .line 354
    .line 355
    :cond_9
    return-void
.end method
