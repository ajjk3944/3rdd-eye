.class public final Lqi1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lui1;
.implements Lcg1;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:I

.field public final i:I

.field public final j:J


# direct methods
.method public constructor <init>(IIJJ)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lqi1;->a:J

    .line 5
    .line 6
    iput-wide p5, p0, Lqi1;->b:J

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, p2

    .line 14
    :goto_0
    iput v0, p0, Lqi1;->c:I

    .line 15
    .line 16
    iput p1, p0, Lqi1;->e:I

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    cmp-long v2, p3, v0

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iput-wide v0, p0, Lqi1;->d:J

    .line 25
    .line 26
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    :goto_1
    iput-wide v3, p0, Lqi1;->f:J

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    sub-long v3, p3, p5

    .line 35
    .line 36
    iput-wide v3, p0, Lqi1;->d:J

    .line 37
    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    const-wide/32 v5, 0x7a1200

    .line 45
    .line 46
    .line 47
    mul-long/2addr v3, v5

    .line 48
    int-to-long v5, p1

    .line 49
    div-long/2addr v3, v5

    .line 50
    goto :goto_1

    .line 51
    :goto_2
    iput-wide p5, p0, Lqi1;->g:J

    .line 52
    .line 53
    iput p1, p0, Lqi1;->h:I

    .line 54
    .line 55
    iput p2, p0, Lqi1;->i:I

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    move-wide p3, v0

    .line 61
    :goto_3
    iput-wide p3, p0, Lqi1;->j:J

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lqi1;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b(J)Lbg1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    iget-wide v3, v0, Lqi1;->d:J

    .line 6
    .line 7
    cmp-long v1, v3, v1

    .line 8
    .line 9
    iget-wide v5, v0, Lqi1;->b:J

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    iget v2, v0, Lqi1;->e:I

    .line 16
    .line 17
    int-to-long v9, v2

    .line 18
    mul-long v9, v9, p1

    .line 19
    .line 20
    const-wide/32 v11, 0x7a1200

    .line 21
    .line 22
    .line 23
    div-long/2addr v9, v11

    .line 24
    iget v13, v0, Lqi1;->c:I

    .line 25
    .line 26
    int-to-long v13, v13

    .line 27
    div-long/2addr v9, v13

    .line 28
    mul-long/2addr v9, v13

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    sub-long/2addr v3, v13

    .line 32
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v9

    .line 36
    :cond_0
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    add-long/2addr v3, v5

    .line 41
    sub-long v9, v3, v5

    .line 42
    .line 43
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v9

    .line 47
    mul-long/2addr v9, v11

    .line 48
    move-wide v15, v11

    .line 49
    int-to-long v11, v2

    .line 50
    div-long/2addr v9, v11

    .line 51
    new-instance v11, Ldg1;

    .line 52
    .line 53
    invoke-direct {v11, v9, v10, v3, v4}, Ldg1;-><init>(JJ)V

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    cmp-long v1, v9, p1

    .line 59
    .line 60
    if-gez v1, :cond_2

    .line 61
    .line 62
    add-long/2addr v3, v13

    .line 63
    iget-wide v9, v0, Lqi1;->a:J

    .line 64
    .line 65
    cmp-long v1, v3, v9

    .line 66
    .line 67
    if-ltz v1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sub-long v5, v3, v5

    .line 71
    .line 72
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    mul-long/2addr v5, v15

    .line 77
    int-to-long v1, v2

    .line 78
    div-long/2addr v5, v1

    .line 79
    new-instance v1, Ldg1;

    .line 80
    .line 81
    invoke-direct {v1, v5, v6, v3, v4}, Ldg1;-><init>(JJ)V

    .line 82
    .line 83
    .line 84
    new-instance v2, Lbg1;

    .line 85
    .line 86
    invoke-direct {v2, v11, v1}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 87
    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_2
    :goto_0
    new-instance v1, Lbg1;

    .line 91
    .line 92
    invoke-direct {v1, v11, v11}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_3
    new-instance v1, Lbg1;

    .line 97
    .line 98
    new-instance v2, Ldg1;

    .line 99
    .line 100
    invoke-direct {v2, v7, v8, v5, v6}, Ldg1;-><init>(JJ)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v2, v2}, Lbg1;-><init>(Ldg1;Ldg1;)V

    .line 104
    .line 105
    .line 106
    return-object v1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lqi1;->j:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lqi1;->d:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    return v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lqi1;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final f(J)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Lqi1;->b:J

    .line 4
    .line 5
    sub-long/2addr p1, v2

    .line 6
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    const-wide/32 v0, 0x7a1200

    .line 11
    .line 12
    .line 13
    mul-long/2addr p1, v0

    .line 14
    iget v0, p0, Lqi1;->e:I

    .line 15
    .line 16
    int-to-long v0, v0

    .line 17
    div-long/2addr p1, v0

    .line 18
    return-wide p1
.end method
