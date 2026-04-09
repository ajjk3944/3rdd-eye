.class public final Lmd1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lpe1;


# instance fields
.field public final a:Lde1;

.field public final b:Lee1;

.field public final c:Lie1;

.field public final d:Ljava/util/ArrayDeque;

.field public e:Landroid/view/Surface;

.field public f:Lph4;

.field public g:J

.field public h:Lne1;

.field public i:Ljava/util/concurrent/Executor;

.field public j:Lbe1;


# direct methods
.method public constructor <init>(Lde1;Lee1;Lpz;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmd1;->a:Lde1;

    .line 5
    .line 6
    iput-object p2, p0, Lmd1;->b:Lee1;

    .line 7
    .line 8
    iput-object p3, p1, Lde1;->k:Lpz;

    .line 9
    .line 10
    new-instance p3, Lie1;

    .line 11
    .line 12
    new-instance v0, Lvq2;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lvq2;-><init>(Lmd1;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p3, v0, p1, p2}, Lie1;-><init>(Lvq2;Lde1;Lee1;)V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, Lmd1;->c:Lie1;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lmd1;->d:Ljava/util/ArrayDeque;

    .line 28
    .line 29
    new-instance p1, Lgg4;

    .line 30
    .line 31
    invoke-direct {p1}, Lgg4;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance p2, Lph4;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Lph4;-><init>(Lgg4;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lmd1;->f:Lph4;

    .line 40
    .line 41
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    iput-wide p1, p0, Lmd1;->g:J

    .line 47
    .line 48
    sget-object p1, Lne1;->a:Lme1;

    .line 49
    .line 50
    iput-object p1, p0, Lmd1;->h:Lne1;

    .line 51
    .line 52
    sget-object p1, Lt5;->g:Lt5;

    .line 53
    .line 54
    iput-object p1, p0, Lmd1;->i:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    sget-object p1, Lwa4;->g:Lwa4;

    .line 57
    .line 58
    iput-object p1, p0, Lmd1;->j:Lbe1;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final A0(Lph4;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final K()V
    .locals 0

    .line 1
    return-void
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 2
    .line 3
    iget v1, v0, Lde1;->d:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput v1, v0, Lde1;->d:I

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final Q(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lde1;->f(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd1;->b:Lee1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lee1;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lde1;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd1;->b:Lee1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lee1;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lde1;->c()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lmd1;->c:Lie1;

    .line 2
    .line 3
    iget-wide v1, v0, Lie1;->i:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iget-wide v3, v0, Lie1;->h:J

    .line 15
    .line 16
    cmp-long v0, v3, v1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lmd1;->c:Lie1;

    .line 2
    .line 3
    iget-wide v1, v0, Lie1;->g:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    const-wide/high16 v1, -0x8000000000000000L

    .line 15
    .line 16
    iput-wide v1, v0, Lie1;->g:J

    .line 17
    .line 18
    iput-wide v1, v0, Lie1;->h:J

    .line 19
    .line 20
    :cond_0
    iput-wide v1, v0, Lie1;->i:J

    .line 21
    .line 22
    return-void
.end method

.method public final k()Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd1;->e:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lmd1;->e:Landroid/view/Surface;

    .line 3
    .line 4
    iget-object v1, p0, Lmd1;->a:Lde1;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Lde1;->d(Landroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final o0(Z)V
    .locals 8

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lmd1;->a:Lde1;

    .line 12
    .line 13
    iget-object v5, p1, Lde1;->b:Lhe1;

    .line 14
    .line 15
    iput-wide v2, v5, Lhe1;->m:J

    .line 16
    .line 17
    const-wide/16 v6, -0x1

    .line 18
    .line 19
    iput-wide v6, v5, Lhe1;->p:J

    .line 20
    .line 21
    iput-wide v6, v5, Lhe1;->n:J

    .line 22
    .line 23
    iput-wide v0, p1, Lde1;->g:J

    .line 24
    .line 25
    iput-wide v0, p1, Lde1;->e:J

    .line 26
    .line 27
    iget v5, p1, Lde1;->d:I

    .line 28
    .line 29
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iput v5, p1, Lde1;->d:I

    .line 34
    .line 35
    iput-wide v0, p1, Lde1;->h:J

    .line 36
    .line 37
    :cond_0
    iget-object p1, p0, Lmd1;->b:Lee1;

    .line 38
    .line 39
    invoke-virtual {p1}, Lee1;->a()V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lmd1;->c:Lie1;

    .line 43
    .line 44
    iget-object v5, p1, Lie1;->e:Lcm;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    iput v6, v5, Lcm;->f:I

    .line 48
    .line 49
    const/4 v7, -0x1

    .line 50
    iput v7, v5, Lcm;->g:I

    .line 51
    .line 52
    iput v6, v5, Lcm;->h:I

    .line 53
    .line 54
    iput-wide v0, p1, Lie1;->g:J

    .line 55
    .line 56
    iput-wide v0, p1, Lie1;->h:J

    .line 57
    .line 58
    iput-wide v0, p1, Lie1;->i:J

    .line 59
    .line 60
    iget-object v0, p1, Lie1;->d:Lts;

    .line 61
    .line 62
    invoke-virtual {v0}, Lts;->c()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-lez v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Lts;->c()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-lez v1, :cond_1

    .line 73
    .line 74
    move v1, v4

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move v1, v6

    .line 77
    :goto_0
    invoke-static {v1}, Lzt0;->D(Z)V

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {v0}, Lts;->c()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-le v1, v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0}, Lts;->d()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v0}, Lts;->d()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast v0, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    iput-wide v0, p1, Lie1;->k:J

    .line 104
    .line 105
    :cond_3
    iget-object p1, p1, Lie1;->c:Lts;

    .line 106
    .line 107
    invoke-virtual {p1}, Lts;->c()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-lez v0, :cond_6

    .line 112
    .line 113
    invoke-virtual {p1}, Lts;->c()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-lez v0, :cond_4

    .line 118
    .line 119
    move v6, v4

    .line 120
    :cond_4
    invoke-static {v6}, Lzt0;->D(Z)V

    .line 121
    .line 122
    .line 123
    :goto_2
    invoke-virtual {p1}, Lts;->c()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-le v0, v4, :cond_5

    .line 128
    .line 129
    invoke-virtual {p1}, Lts;->d()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    invoke-virtual {p1}, Lts;->d()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    check-cast v0, Lt82;

    .line 141
    .line 142
    invoke-virtual {p1, v2, v3, v0}, Lts;->b(JLjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    iget-object p1, p0, Lmd1;->d:Ljava/util/ArrayDeque;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final p0(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lde1;->h(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q0(Lbe1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd1;->j:Lbe1;

    .line 2
    .line 3
    return-void
.end method

.method public final r0(JLrd1;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lmd1;->d:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lmd1;->c:Lie1;

    .line 7
    .line 8
    iget-object v0, p3, Lie1;->e:Lcm;

    .line 9
    .line 10
    iget v1, v0, Lcm;->h:I

    .line 11
    .line 12
    iget-object v2, v0, Lcm;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [J

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-ne v1, v3, :cond_1

    .line 18
    .line 19
    add-int v1, v3, v3

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    new-array v4, v1, [J

    .line 24
    .line 25
    iget v5, v0, Lcm;->f:I

    .line 26
    .line 27
    sub-int/2addr v3, v5

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static {v2, v5, v4, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v0, Lcm;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, [J

    .line 35
    .line 36
    invoke-static {v2, v6, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    iput v6, v0, Lcm;->f:I

    .line 40
    .line 41
    iget v2, v0, Lcm;->h:I

    .line 42
    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    iput v2, v0, Lcm;->g:I

    .line 46
    .line 47
    iput-object v4, v0, Lcm;->j:Ljava/lang/Object;

    .line 48
    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    iput v1, v0, Lcm;->i:I

    .line 52
    .line 53
    move-object v2, v4

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_1
    :goto_0
    iget v1, v0, Lcm;->g:I

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    add-int/2addr v1, v3

    .line 65
    iget v4, v0, Lcm;->i:I

    .line 66
    .line 67
    and-int/2addr v1, v4

    .line 68
    iput v1, v0, Lcm;->g:I

    .line 69
    .line 70
    aput-wide p1, v2, v1

    .line 71
    .line 72
    iget v1, v0, Lcm;->h:I

    .line 73
    .line 74
    add-int/2addr v1, v3

    .line 75
    iput v1, v0, Lcm;->h:I

    .line 76
    .line 77
    iput-wide p1, p3, Lie1;->g:J

    .line 78
    .line 79
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide p1, p3, Lie1;->i:J

    .line 85
    .line 86
    iget-object p1, p0, Lmd1;->i:Ljava/util/concurrent/Executor;

    .line 87
    .line 88
    new-instance p2, Lbh3;

    .line 89
    .line 90
    const/16 p3, 0x11

    .line 91
    .line 92
    invoke-direct {p2, p3, p0}, Lbh3;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    return v3
.end method

.method public final s0(JJ)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lmd1;->c:Lie1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lie1;->a(JJ)V
    :try_end_0
    .catch Lb84; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    new-instance p2, Loe1;

    .line 9
    .line 10
    iget-object p3, p0, Lmd1;->f:Lph4;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, Loe1;-><init>(Ljava/lang/Exception;Lph4;)V

    .line 13
    .line 14
    .line 15
    throw p2
.end method

.method public final t0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 2
    .line 3
    iget-object v0, v0, Lde1;->b:Lhe1;

    .line 4
    .line 5
    iget v1, v0, Lhe1;->j:I

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput p1, v0, Lhe1;->j:I

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {v0, p1}, Lhe1;->c(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final u0(Lph4;JILjava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-static {v4}, Lzt0;->b0(Z)V

    .line 12
    .line 13
    .line 14
    iget v4, v1, Lph4;->t:I

    .line 15
    .line 16
    iget v5, v1, Lph4;->u:I

    .line 17
    .line 18
    iget-object v6, v0, Lmd1;->f:Lph4;

    .line 19
    .line 20
    iget v7, v6, Lph4;->t:I

    .line 21
    .line 22
    const-wide/16 v8, 0x1

    .line 23
    .line 24
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iget-object v12, v0, Lmd1;->c:Lie1;

    .line 30
    .line 31
    if-ne v4, v7, :cond_0

    .line 32
    .line 33
    iget v6, v6, Lph4;->u:I

    .line 34
    .line 35
    if-eq v5, v6, :cond_2

    .line 36
    .line 37
    :cond_0
    iget-wide v6, v12, Lie1;->g:J

    .line 38
    .line 39
    cmp-long v13, v6, v10

    .line 40
    .line 41
    if-nez v13, :cond_1

    .line 42
    .line 43
    const-wide/16 v6, 0x0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    add-long/2addr v6, v8

    .line 47
    :goto_0
    iget-object v13, v12, Lie1;->c:Lts;

    .line 48
    .line 49
    new-instance v14, Lt82;

    .line 50
    .line 51
    const/high16 v15, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-direct {v14, v15, v4, v5}, Lt82;-><init>(FII)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v13, v6, v7, v14}, Lts;->b(JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget v4, v1, Lph4;->x:F

    .line 60
    .line 61
    iget-object v5, v0, Lmd1;->f:Lph4;

    .line 62
    .line 63
    iget v5, v5, Lph4;->x:F

    .line 64
    .line 65
    cmpl-float v5, v4, v5

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    iget-object v5, v0, Lmd1;->a:Lde1;

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Lde1;->e(F)V

    .line 72
    .line 73
    .line 74
    :cond_3
    iput-object v1, v0, Lmd1;->f:Lph4;

    .line 75
    .line 76
    iget-wide v4, v0, Lmd1;->g:J

    .line 77
    .line 78
    cmp-long v1, v2, v4

    .line 79
    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    iget-object v1, v12, Lie1;->e:Lcm;

    .line 83
    .line 84
    iget v1, v1, Lcm;->h:I

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    iget-object v1, v12, Lie1;->a:Lde1;

    .line 89
    .line 90
    move/from16 v4, p4

    .line 91
    .line 92
    invoke-virtual {v1, v4}, Lde1;->a(I)V

    .line 93
    .line 94
    .line 95
    iput-wide v2, v12, Lie1;->k:J

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    iget-object v1, v12, Lie1;->d:Lts;

    .line 99
    .line 100
    iget-wide v4, v12, Lie1;->g:J

    .line 101
    .line 102
    cmp-long v6, v4, v10

    .line 103
    .line 104
    if-nez v6, :cond_5

    .line 105
    .line 106
    const-wide/high16 v4, -0x4000000000000000L    # -2.0

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    add-long/2addr v4, v8

    .line 110
    :goto_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v1, v4, v5, v6}, Lts;->b(JLjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    iput-wide v2, v0, Lmd1;->g:J

    .line 118
    .line 119
    :cond_6
    return-void
.end method

.method public final v0(Ljava/util/List;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final w0(Lqd1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd1;->h:Lne1;

    .line 2
    .line 3
    sget-object p1, Ldq3;->f:Ldq3;

    .line 4
    .line 5
    iput-object p1, p0, Lmd1;->i:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    return-void
.end method

.method public final x0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lmd1;->a:Lde1;

    .line 2
    .line 3
    iput-boolean p1, v0, Lde1;->i:Z

    .line 4
    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iput-wide v1, v0, Lde1;->h:J

    .line 11
    .line 12
    return-void
.end method

.method public final y0(J)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final z0(Landroid/view/Surface;Luz2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd1;->e:Landroid/view/Surface;

    .line 2
    .line 3
    iget-object p2, p0, Lmd1;->a:Lde1;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Lde1;->d(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
