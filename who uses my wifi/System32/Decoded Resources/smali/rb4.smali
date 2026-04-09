.class public final Lrb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lsw1;

.field public final b:Lez1;

.field public final c:Lmd4;

.field public final d:Ld13;

.field public e:J

.field public f:I

.field public g:Z

.field public h:Lpb4;

.field public i:Lpb4;

.field public j:Lpb4;

.field public k:Lpb4;

.field public l:Lpb4;

.field public m:I

.field public n:Ljava/lang/Object;

.field public o:J

.field public p:Ljava/util/ArrayList;

.field public final q:Lx34;


# direct methods
.method public constructor <init>(Lmd4;Ld13;Lx34;Lla4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrb4;->c:Lmd4;

    .line 5
    .line 6
    iput-object p2, p0, Lrb4;->d:Ld13;

    .line 7
    .line 8
    iput-object p3, p0, Lrb4;->q:Lx34;

    .line 9
    .line 10
    new-instance p1, Lsw1;

    .line 11
    .line 12
    invoke-direct {p1}, Lsw1;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lrb4;->a:Lsw1;

    .line 16
    .line 17
    new-instance p1, Lez1;

    .line 18
    .line 19
    invoke-direct {p1}, Lez1;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lrb4;->b:Lez1;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 30
    .line 31
    return-void
.end method

.method public static a(Loz1;Ljava/lang/Object;JLez1;Lsw1;)Lkh4;
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p5}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 2
    .line 3
    .line 4
    iget v0, p5, Lsw1;->c:I

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, v0, p4, v1, v2}, Loz1;->b(ILez1;J)Lez1;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Loz1;->e(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    iget-object p4, p5, Lsw1;->f:Lzb2;

    .line 15
    .line 16
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p5}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 20
    .line 21
    .line 22
    iget-object p0, p5, Lsw1;->f:Lzb2;

    .line 23
    .line 24
    const/4 p4, -0x1

    .line 25
    invoke-virtual {p0, p4}, Lzb2;->a(I)Lcd1;

    .line 26
    .line 27
    .line 28
    new-instance p0, Lkh4;

    .line 29
    .line 30
    invoke-direct {p0, p1, p2, p3, p4}, Lkh4;-><init>(Ljava/lang/Object;JI)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final A(Ljh4;)Lpb4;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lpb4;

    .line 17
    .line 18
    iget-object v2, v1, Lpb4;->a:Ljava/lang/Object;

    .line 19
    .line 20
    if-ne v2, p1, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public final B()V
    .locals 3

    .line 1
    iget v0, p0, Lrb4;->m:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lpb4;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v1, p0, Lrb4;->n:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, v0, Lpb4;->g:Lqb4;

    .line 16
    .line 17
    iget-object v1, v1, Lqb4;->a:Lkh4;

    .line 18
    .line 19
    iget-wide v1, v1, Lkh4;->d:J

    .line 20
    .line 21
    iput-wide v1, p0, Lrb4;->o:J

    .line 22
    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lpb4;->h()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lpb4;->m:Lpb4;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lrb4;->h:Lpb4;

    .line 33
    .line 34
    iput-object v0, p0, Lrb4;->k:Lpb4;

    .line 35
    .line 36
    iput-object v0, p0, Lrb4;->i:Lpb4;

    .line 37
    .line 38
    iput-object v0, p0, Lrb4;->j:Lpb4;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p0, Lrb4;->m:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lrb4;->b()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final C(Loz1;JJJ)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lrb4;->h:Lpb4;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_f

    .line 10
    .line 11
    iget-object v5, v2, Lpb4;->g:Lqb4;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1, v5}, Lrb4;->D(Loz1;Lqb4;)Lqb4;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move-wide/from16 v6, p2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-wide/from16 v6, p2

    .line 23
    .line 24
    invoke-virtual {v0, v1, v3, v6, v7}, Lrb4;->e(Loz1;Lpb4;J)Lqb4;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    if-eqz v8, :cond_e

    .line 29
    .line 30
    iget-wide v9, v5, Lqb4;->b:J

    .line 31
    .line 32
    iget-wide v11, v8, Lqb4;->b:J

    .line 33
    .line 34
    cmp-long v9, v9, v11

    .line 35
    .line 36
    if-nez v9, :cond_e

    .line 37
    .line 38
    iget-object v9, v5, Lqb4;->a:Lkh4;

    .line 39
    .line 40
    iget-object v10, v8, Lqb4;->a:Lkh4;

    .line 41
    .line 42
    invoke-virtual {v9, v10}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_e

    .line 47
    .line 48
    move-object v3, v8

    .line 49
    :goto_1
    iget-wide v8, v5, Lqb4;->c:J

    .line 50
    .line 51
    invoke-virtual {v3, v8, v9}, Lqb4;->b(J)Lqb4;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    iput-object v8, v2, Lpb4;->g:Lqb4;

    .line 56
    .line 57
    iget-wide v9, v5, Lqb4;->e:J

    .line 58
    .line 59
    iget-wide v11, v3, Lqb4;->e:J

    .line 60
    .line 61
    cmp-long v3, v9, v11

    .line 62
    .line 63
    if-eqz v3, :cond_d

    .line 64
    .line 65
    iget-object v1, v2, Lpb4;->a:Ljava/lang/Object;

    .line 66
    .line 67
    instance-of v3, v1, Lrg4;

    .line 68
    .line 69
    const-wide/high16 v5, -0x8000000000000000L

    .line 70
    .line 71
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    iget-wide v7, v8, Lqb4;->d:J

    .line 79
    .line 80
    cmp-long v3, v7, v13

    .line 81
    .line 82
    if-nez v3, :cond_1

    .line 83
    .line 84
    move-wide v7, v5

    .line 85
    :cond_1
    check-cast v1, Lrg4;

    .line 86
    .line 87
    iput-wide v7, v1, Lrg4;->j:J

    .line 88
    .line 89
    :cond_2
    cmp-long v1, v11, v13

    .line 90
    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    const-wide v7, 0x7fffffffffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    iget-wide v7, v2, Lpb4;->p:J

    .line 100
    .line 101
    add-long/2addr v7, v11

    .line 102
    :goto_2
    iget-object v1, v0, Lrb4;->i:Lpb4;

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    if-ne v2, v1, :cond_5

    .line 106
    .line 107
    cmp-long v1, p4, v5

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    cmp-long v1, p4, v7

    .line 112
    .line 113
    if-ltz v1, :cond_5

    .line 114
    .line 115
    :cond_4
    move v1, v3

    .line 116
    goto :goto_3

    .line 117
    :cond_5
    move v1, v4

    .line 118
    :goto_3
    iget-object v11, v0, Lrb4;->j:Lpb4;

    .line 119
    .line 120
    if-ne v2, v11, :cond_7

    .line 121
    .line 122
    cmp-long v5, p6, v5

    .line 123
    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    cmp-long v5, p6, v7

    .line 127
    .line 128
    if-ltz v5, :cond_7

    .line 129
    .line 130
    :cond_6
    move v5, v3

    .line 131
    goto :goto_4

    .line 132
    :cond_7
    move v5, v4

    .line 133
    :goto_4
    invoke-virtual {v0, v2}, Lrb4;->y(Lpb4;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    return v2

    .line 140
    :cond_8
    cmp-long v2, v9, v13

    .line 141
    .line 142
    if-nez v2, :cond_9

    .line 143
    .line 144
    move-wide v9, v13

    .line 145
    :cond_9
    if-eqz v1, :cond_b

    .line 146
    .line 147
    cmp-long v1, v9, v13

    .line 148
    .line 149
    if-nez v1, :cond_a

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_a
    move v4, v3

    .line 153
    :cond_b
    :goto_5
    if-eqz v5, :cond_c

    .line 154
    .line 155
    or-int/lit8 v1, v4, 0x2

    .line 156
    .line 157
    return v1

    .line 158
    :cond_c
    return v4

    .line 159
    :cond_d
    iget-object v3, v2, Lpb4;->m:Lpb4;

    .line 160
    .line 161
    move-object v15, v3

    .line 162
    move-object v3, v2

    .line 163
    move-object v2, v15

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_e
    invoke-virtual {v0, v3}, Lrb4;->y(Lpb4;)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    return v1

    .line 171
    :cond_f
    return v4
.end method

.method public final D(Loz1;Lqb4;)Lqb4;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, Lqb4;->a:Lkh4;

    .line 8
    .line 9
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget v5, v3, Lkh4;->e:I

    .line 14
    .line 15
    const/4 v6, -0x1

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    if-ne v5, v6, :cond_0

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    :goto_0
    move v11, v4

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v4, 0x0

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    iget v4, v3, Lkh4;->b:I

    .line 26
    .line 27
    invoke-virtual {v0, v1, v3}, Lrb4;->i(Loz1;Lkh4;)Z

    .line 28
    .line 29
    .line 30
    move-result v12

    .line 31
    invoke-virtual {v0, v1, v3, v11}, Lrb4;->j(Loz1;Lkh4;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v13

    .line 35
    iget-object v7, v3, Lkh4;->a:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v8, v0, Lrb4;->a:Lsw1;

    .line 38
    .line 39
    invoke-virtual {v1, v7, v8}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const-wide/16 v9, 0x0

    .line 47
    .line 48
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    if-ne v5, v6, :cond_2

    .line 56
    .line 57
    :cond_1
    move-wide/from16 v16, v14

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    iget-object v1, v8, Lsw1;->f:Lzb2;

    .line 61
    .line 62
    invoke-virtual {v1, v5}, Lzb2;->a(I)Lcd1;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-wide/from16 v16, v9

    .line 70
    .line 71
    :goto_2
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget v1, v3, Lkh4;->c:I

    .line 78
    .line 79
    invoke-virtual {v8, v4, v1}, Lsw1;->b(II)J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    :goto_3
    move-wide v14, v9

    .line 84
    move-wide/from16 v9, v16

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    cmp-long v1, v16, v14

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    move-wide v14, v9

    .line 92
    goto :goto_4

    .line 93
    :cond_4
    iget-wide v9, v8, Lsw1;->d:J

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_4
    invoke-virtual {v3}, Lkh4;->b()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    invoke-virtual {v8, v4}, Lsw1;->c(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_5
    if-eq v5, v6, :cond_6

    .line 107
    .line 108
    invoke-virtual {v8, v5}, Lsw1;->c(I)V

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_5
    new-instance v1, Lqb4;

    .line 112
    .line 113
    move-object v5, v3

    .line 114
    iget-wide v3, v2, Lqb4;->b:J

    .line 115
    .line 116
    iget-wide v6, v2, Lqb4;->c:J

    .line 117
    .line 118
    move-object v2, v5

    .line 119
    move-wide v5, v6

    .line 120
    move-wide v7, v9

    .line 121
    move-wide v9, v14

    .line 122
    invoke-direct/range {v1 .. v13}, Lqb4;-><init>(Lkh4;JJJJZZZ)V

    .line 123
    .line 124
    .line 125
    return-object v1
.end method

.method public final E(Loz1;Ljava/lang/Object;)Lkh4;
    .locals 9

    .line 1
    iget-object v5, p0, Lrb4;->a:Lsw1;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v5}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lsw1;->c:I

    .line 8
    .line 9
    iget-object v1, p0, Lrb4;->n:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v6, -0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Loz1;->e(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v1, v6, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v1, v5, v2}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget v1, v1, Lsw1;->c:I

    .line 26
    .line 27
    if-ne v1, v0, :cond_1

    .line 28
    .line 29
    iget-wide v0, p0, Lrb4;->o:J

    .line 30
    .line 31
    :cond_0
    :goto_0
    move-wide v2, v0

    .line 32
    goto :goto_3

    .line 33
    :cond_1
    iget-object v1, p0, Lrb4;->h:Lpb4;

    .line 34
    .line 35
    :goto_1
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-object v3, v1, Lpb4;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    iget-object v0, v1, Lpb4;->g:Lqb4;

    .line 46
    .line 47
    iget-object v0, v0, Lqb4;->a:Lkh4;

    .line 48
    .line 49
    iget-wide v0, v0, Lkh4;->d:J

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget-object v1, v1, Lpb4;->m:Lpb4;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    iget-object v1, p0, Lrb4;->h:Lpb4;

    .line 56
    .line 57
    :goto_2
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget-object v3, v1, Lpb4;->b:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {p1, v3}, Loz1;->e(Ljava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eq v3, v6, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1, v3, v5, v2}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget v3, v3, Lsw1;->c:I

    .line 72
    .line 73
    if-ne v3, v0, :cond_4

    .line 74
    .line 75
    iget-object v0, v1, Lpb4;->g:Lqb4;

    .line 76
    .line 77
    iget-object v0, v0, Lqb4;->a:Lkh4;

    .line 78
    .line 79
    iget-wide v0, v0, Lkh4;->d:J

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    iget-object v1, v1, Lpb4;->m:Lpb4;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    invoke-virtual {p0, p2}, Lrb4;->c(Ljava/lang/Object;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    const-wide/16 v2, -0x1

    .line 90
    .line 91
    cmp-long v2, v0, v2

    .line 92
    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    iget-wide v0, p0, Lrb4;->e:J

    .line 97
    .line 98
    const-wide/16 v2, 0x1

    .line 99
    .line 100
    add-long/2addr v2, v0

    .line 101
    iput-wide v2, p0, Lrb4;->e:J

    .line 102
    .line 103
    iget-object v2, p0, Lrb4;->h:Lpb4;

    .line 104
    .line 105
    if-nez v2, :cond_0

    .line 106
    .line 107
    iput-object p2, p0, Lrb4;->n:Ljava/lang/Object;

    .line 108
    .line 109
    iput-wide v0, p0, Lrb4;->o:J

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :goto_3
    invoke-virtual {p1, p2, v5}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 113
    .line 114
    .line 115
    iget v0, v5, Lsw1;->c:I

    .line 116
    .line 117
    const-wide/16 v7, 0x0

    .line 118
    .line 119
    iget-object v4, p0, Lrb4;->b:Lez1;

    .line 120
    .line 121
    invoke-virtual {p1, v0, v4, v7, v8}, Loz1;->b(ILez1;J)Lez1;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Loz1;->e(Ljava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    :goto_4
    iget v1, v4, Lez1;->k:I

    .line 129
    .line 130
    if-lt v0, v1, :cond_7

    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    invoke-virtual {p1, v0, v5, v1}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 134
    .line 135
    .line 136
    iget-object v1, v5, Lsw1;->f:Lzb2;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v1, v5, Lsw1;->f:Lzb2;

    .line 142
    .line 143
    invoke-virtual {v1, v6}, Lzb2;->a(I)Lcd1;

    .line 144
    .line 145
    .line 146
    add-int/lit8 v0, v0, -0x1

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    move-object v0, p1

    .line 150
    move-object v1, p2

    .line 151
    invoke-static/range {v0 .. v5}, Lrb4;->a(Loz1;Ljava/lang/Object;JLez1;Lsw1;)Lkh4;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1
.end method

.method public final b()V
    .locals 4

    .line 1
    sget-object v0, Lxm3;->g:Lvm3;

    .line 2
    .line 3
    new-instance v0, Lum3;

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-direct {v0, v1}, Lrm3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lrb4;->h:Lpb4;

    .line 10
    .line 11
    :goto_0
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v2, v1, Lpb4;->g:Lqb4;

    .line 14
    .line 15
    iget-object v2, v2, Lqb4;->a:Lkh4;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lrm3;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lpb4;->m:Lpb4;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lrb4;->i:Lpb4;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object v1, v1, Lpb4;->g:Lqb4;

    .line 30
    .line 31
    iget-object v1, v1, Lqb4;->a:Lkh4;

    .line 32
    .line 33
    :goto_1
    new-instance v2, Lgi;

    .line 34
    .line 35
    const/16 v3, 0x19

    .line 36
    .line 37
    invoke-direct {v2, p0, v0, v1, v3}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lrb4;->d:Ld13;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final c(Ljava/lang/Object;)J
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lpb4;

    .line 17
    .line 18
    iget-object v2, v1, Lpb4;->b:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object p1, v1, Lpb4;->g:Lqb4;

    .line 27
    .line 28
    iget-object p1, p1, Lqb4;->a:Lkh4;

    .line 29
    .line 30
    iget-wide v0, p1, Lkh4;->d:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-wide/16 v0, -0x1

    .line 37
    .line 38
    return-wide v0
.end method

.method public final d(Loz1;)I
    .locals 7

    .line 1
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v1, v0, Lpb4;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Loz1;->e(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    move v2, v1

    .line 14
    :goto_0
    iget v5, p0, Lrb4;->f:I

    .line 15
    .line 16
    iget-boolean v6, p0, Lrb4;->g:Z

    .line 17
    .line 18
    iget-object v3, p0, Lrb4;->a:Lsw1;

    .line 19
    .line 20
    iget-object v4, p0, Lrb4;->b:Lez1;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    invoke-virtual/range {v1 .. v6}, Loz1;->l(ILsw1;Lez1;IZ)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :goto_1
    iget-object p1, v0, Lpb4;->m:Lpb4;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object v3, v0, Lpb4;->g:Lqb4;

    .line 32
    .line 33
    iget-boolean v3, v3, Lqb4;->f:Z

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    move-object v0, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v3, -0x1

    .line 40
    if-eq v2, v3, :cond_4

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object v3, p1, Lpb4;->b:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Loz1;->e(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eq v3, v2, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v0, p1

    .line 55
    move-object p1, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Lrb4;->y(Lpb4;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget-object v2, v0, Lpb4;->g:Lqb4;

    .line 62
    .line 63
    invoke-virtual {p0, v1, v2}, Lrb4;->D(Loz1;Lqb4;)Lqb4;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, v0, Lpb4;->g:Lqb4;

    .line 68
    .line 69
    return p1
.end method

.method public final e(Loz1;Lpb4;J)Lqb4;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v2, v9, Lpb4;->g:Lqb4;

    .line 8
    .line 9
    iget-wide v3, v9, Lpb4;->p:J

    .line 10
    .line 11
    iget-wide v5, v2, Lqb4;->e:J

    .line 12
    .line 13
    iget-wide v10, v2, Lqb4;->c:J

    .line 14
    .line 15
    iget-object v8, v2, Lqb4;->a:Lkh4;

    .line 16
    .line 17
    add-long/2addr v3, v5

    .line 18
    iget-boolean v7, v2, Lqb4;->f:Z

    .line 19
    .line 20
    sub-long v12, v3, p3

    .line 21
    .line 22
    const/4 v14, 0x1

    .line 23
    const/4 v15, -0x1

    .line 24
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    if-eqz v7, :cond_6

    .line 32
    .line 33
    iget-object v7, v8, Lkh4;->a:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v1, v7}, Loz1;->e(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget v5, v0, Lrb4;->f:I

    .line 40
    .line 41
    iget-boolean v6, v0, Lrb4;->g:Z

    .line 42
    .line 43
    move-wide/from16 v18, v3

    .line 44
    .line 45
    iget-object v3, v0, Lrb4;->a:Lsw1;

    .line 46
    .line 47
    iget-object v4, v0, Lrb4;->b:Lez1;

    .line 48
    .line 49
    move-wide/from16 v20, v10

    .line 50
    .line 51
    move-wide/from16 v10, v18

    .line 52
    .line 53
    invoke-virtual/range {v1 .. v6}, Loz1;->l(ILsw1;Lez1;IZ)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ne v2, v15, :cond_0

    .line 58
    .line 59
    :goto_0
    move-object v9, v0

    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_0
    invoke-virtual {v1, v2, v3, v14}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    iget v5, v5, Lsw1;->c:I

    .line 67
    .line 68
    iget-object v6, v3, Lsw1;->b:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-wide v14, v8, Lkh4;->d:J

    .line 74
    .line 75
    invoke-virtual {v1, v5, v4, v10, v11}, Loz1;->b(ILez1;J)Lez1;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iget v8, v8, Lez1;->k:I

    .line 80
    .line 81
    if-ne v8, v2, :cond_4

    .line 82
    .line 83
    move-object v2, v4

    .line 84
    move v4, v5

    .line 85
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    move-object v14, v7

    .line 91
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    move-object v12, v14

    .line 96
    invoke-virtual/range {v1 .. v8}, Loz1;->n(Lez1;Lsw1;IJJ)Landroid/util/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-nez v4, :cond_1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v1, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    iget-object v1, v9, Lpb4;->m:Lpb4;

    .line 114
    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    iget-object v7, v1, Lpb4;->b:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_2

    .line 124
    .line 125
    iget-object v1, v1, Lpb4;->g:Lqb4;

    .line 126
    .line 127
    iget-object v1, v1, Lqb4;->a:Lkh4;

    .line 128
    .line 129
    iget-wide v14, v1, Lkh4;->d:J

    .line 130
    .line 131
    :goto_1
    move-object/from16 v1, p1

    .line 132
    .line 133
    move-wide v10, v4

    .line 134
    move-wide/from16 v7, v16

    .line 135
    .line 136
    move-object v5, v2

    .line 137
    move-object v2, v6

    .line 138
    :goto_2
    move-object v6, v3

    .line 139
    move-wide v3, v14

    .line 140
    goto :goto_3

    .line 141
    :cond_2
    invoke-virtual {v0, v6}, Lrb4;->c(Ljava/lang/Object;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v7

    .line 145
    const-wide/16 v9, -0x1

    .line 146
    .line 147
    cmp-long v1, v7, v9

    .line 148
    .line 149
    if-nez v1, :cond_3

    .line 150
    .line 151
    iget-wide v7, v0, Lrb4;->e:J

    .line 152
    .line 153
    const-wide/16 v9, 0x1

    .line 154
    .line 155
    add-long/2addr v9, v7

    .line 156
    iput-wide v9, v0, Lrb4;->e:J

    .line 157
    .line 158
    :cond_3
    move-wide v14, v7

    .line 159
    goto :goto_1

    .line 160
    :cond_4
    move-object v12, v7

    .line 161
    move-object/from16 v1, p1

    .line 162
    .line 163
    move-object v5, v4

    .line 164
    move-object v2, v6

    .line 165
    move-wide v7, v10

    .line 166
    goto :goto_2

    .line 167
    :goto_3
    invoke-static/range {v1 .. v6}, Lrb4;->a(Loz1;Ljava/lang/Object;JLez1;Lsw1;)Lkh4;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    move-object v3, v6

    .line 172
    cmp-long v4, v7, v16

    .line 173
    .line 174
    if-eqz v4, :cond_5

    .line 175
    .line 176
    cmp-long v4, v20, v16

    .line 177
    .line 178
    if-eqz v4, :cond_5

    .line 179
    .line 180
    invoke-virtual {v1, v12, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    iget-object v4, v4, Lsw1;->f:Lzb2;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v3, v3, Lsw1;->f:Lzb2;

    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    :cond_5
    move-wide v3, v7

    .line 195
    move-wide v5, v10

    .line 196
    invoke-virtual/range {v0 .. v6}, Lrb4;->f(Loz1;Lkh4;JJ)Lqb4;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    return-object v1

    .line 201
    :cond_6
    move-wide/from16 v20, v10

    .line 202
    .line 203
    move-wide v10, v3

    .line 204
    iget-object v3, v8, Lkh4;->a:Ljava/lang/Object;

    .line 205
    .line 206
    iget-object v4, v0, Lrb4;->a:Lsw1;

    .line 207
    .line 208
    invoke-virtual {v1, v3, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8}, Lkh4;->b()Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_d

    .line 216
    .line 217
    move-object v7, v3

    .line 218
    iget v3, v8, Lkh4;->b:I

    .line 219
    .line 220
    iget-object v5, v4, Lsw1;->f:Lzb2;

    .line 221
    .line 222
    invoke-virtual {v5, v3}, Lzb2;->a(I)Lcd1;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    iget v5, v5, Lcd1;->a:I

    .line 227
    .line 228
    if-ne v5, v15, :cond_7

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_7
    iget v5, v8, Lkh4;->c:I

    .line 233
    .line 234
    iget-object v6, v4, Lsw1;->f:Lzb2;

    .line 235
    .line 236
    invoke-virtual {v6, v3}, Lzb2;->a(I)Lcd1;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    add-int/2addr v5, v14

    .line 241
    :goto_4
    iget-object v9, v6, Lcd1;->d:[I

    .line 242
    .line 243
    array-length v15, v9

    .line 244
    if-ge v5, v15, :cond_9

    .line 245
    .line 246
    aget v9, v9, v5

    .line 247
    .line 248
    if-eqz v9, :cond_9

    .line 249
    .line 250
    if-ne v9, v14, :cond_8

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_9
    :goto_5
    if-gez v5, :cond_a

    .line 257
    .line 258
    iget-wide v9, v2, Lqb4;->c:J

    .line 259
    .line 260
    move-object v2, v7

    .line 261
    iget-wide v7, v8, Lkh4;->d:J

    .line 262
    .line 263
    move v4, v5

    .line 264
    move-wide v5, v9

    .line 265
    invoke-virtual/range {v0 .. v8}, Lrb4;->g(Loz1;Ljava/lang/Object;IIJJ)Lqb4;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    move-object v9, v0

    .line 270
    return-object v1

    .line 271
    :cond_a
    move-object v9, v0

    .line 272
    move v15, v3

    .line 273
    move-object v14, v7

    .line 274
    cmp-long v0, v20, v16

    .line 275
    .line 276
    if-nez v0, :cond_c

    .line 277
    .line 278
    iget v3, v4, Lsw1;->c:I

    .line 279
    .line 280
    move-object v2, v4

    .line 281
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v6

    .line 290
    iget-object v1, v9, Lrb4;->b:Lez1;

    .line 291
    .line 292
    move-object/from16 v0, p1

    .line 293
    .line 294
    invoke-virtual/range {v0 .. v7}, Loz1;->n(Lez1;Lsw1;IJJ)Landroid/util/Pair;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    if-nez v1, :cond_b

    .line 299
    .line 300
    :goto_6
    const/4 v0, 0x0

    .line 301
    return-object v0

    .line 302
    :cond_b
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Ljava/lang/Long;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 307
    .line 308
    .line 309
    move-result-wide v3

    .line 310
    move-wide/from16 v5, v16

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_c
    move-object/from16 v0, p1

    .line 314
    .line 315
    move-object v2, v4

    .line 316
    move-wide/from16 v3, v20

    .line 317
    .line 318
    move-wide v5, v3

    .line 319
    :goto_7
    invoke-virtual {v0, v14, v2}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 320
    .line 321
    .line 322
    iget-object v1, v2, Lsw1;->f:Lzb2;

    .line 323
    .line 324
    invoke-virtual {v1, v15}, Lzb2;->a(I)Lcd1;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    iget-object v1, v2, Lsw1;->f:Lzb2;

    .line 332
    .line 333
    invoke-virtual {v1, v15}, Lzb2;->a(I)Lcd1;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 341
    .line 342
    .line 343
    move-result-wide v3

    .line 344
    iget-wide v7, v8, Lkh4;->d:J

    .line 345
    .line 346
    move-object v1, v0

    .line 347
    move-object v0, v9

    .line 348
    move-object v2, v14

    .line 349
    invoke-virtual/range {v0 .. v8}, Lrb4;->h(Loz1;Ljava/lang/Object;JJJ)Lqb4;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    return-object v1

    .line 354
    :cond_d
    move-object v7, v3

    .line 355
    move-object v2, v4

    .line 356
    iget v3, v8, Lkh4;->e:I

    .line 357
    .line 358
    if-eq v3, v15, :cond_e

    .line 359
    .line 360
    iget-object v0, v2, Lsw1;->f:Lzb2;

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    if-ne v3, v15, :cond_e

    .line 366
    .line 367
    iget-object v0, v2, Lsw1;->f:Lzb2;

    .line 368
    .line 369
    invoke-virtual {v0, v15}, Lzb2;->a(I)Lcd1;

    .line 370
    .line 371
    .line 372
    :cond_e
    iget-object v0, v2, Lsw1;->f:Lzb2;

    .line 373
    .line 374
    invoke-virtual {v0, v3}, Lzb2;->a(I)Lcd1;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const/4 v1, 0x0

    .line 379
    move v4, v1

    .line 380
    :goto_8
    iget-object v1, v0, Lcd1;->d:[I

    .line 381
    .line 382
    array-length v9, v1

    .line 383
    if-ge v4, v9, :cond_10

    .line 384
    .line 385
    aget v1, v1, v4

    .line 386
    .line 387
    if-eqz v1, :cond_10

    .line 388
    .line 389
    if-ne v1, v14, :cond_f

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 393
    .line 394
    goto :goto_8

    .line 395
    :cond_10
    :goto_9
    invoke-virtual {v2, v3}, Lsw1;->c(I)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v2, Lsw1;->f:Lzb2;

    .line 399
    .line 400
    invoke-virtual {v0, v3}, Lzb2;->a(I)Lcd1;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    iget v0, v0, Lcd1;->a:I

    .line 405
    .line 406
    if-eq v4, v0, :cond_11

    .line 407
    .line 408
    move-object v14, v7

    .line 409
    iget-wide v7, v8, Lkh4;->d:J

    .line 410
    .line 411
    move-object/from16 v0, p0

    .line 412
    .line 413
    move-object/from16 v1, p1

    .line 414
    .line 415
    move-object v2, v14

    .line 416
    invoke-virtual/range {v0 .. v8}, Lrb4;->g(Loz1;Ljava/lang/Object;IIJJ)Lqb4;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    return-object v1

    .line 421
    :cond_11
    move-object/from16 v1, p1

    .line 422
    .line 423
    move-object v14, v7

    .line 424
    invoke-virtual {v1, v14, v2}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 425
    .line 426
    .line 427
    iget-object v0, v2, Lsw1;->f:Lzb2;

    .line 428
    .line 429
    invoke-virtual {v0, v3}, Lzb2;->a(I)Lcd1;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    iget-object v0, v2, Lsw1;->f:Lzb2;

    .line 437
    .line 438
    invoke-virtual {v0, v3}, Lzb2;->a(I)Lcd1;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    const-wide/16 v3, 0x0

    .line 446
    .line 447
    iget-wide v7, v8, Lkh4;->d:J

    .line 448
    .line 449
    move-object/from16 v0, p0

    .line 450
    .line 451
    move-object v2, v14

    .line 452
    invoke-virtual/range {v0 .. v8}, Lrb4;->h(Loz1;Ljava/lang/Object;JJJ)Lqb4;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    return-object v1
.end method

.method public final f(Loz1;Lkh4;JJ)Lqb4;
    .locals 9

    .line 1
    iget-object v2, p2, Lkh4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lrb4;->a:Lsw1;

    .line 4
    .line 5
    invoke-virtual {p1, v2, v0}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lkh4;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v3, p2, Lkh4;->b:I

    .line 15
    .line 16
    iget v4, p2, Lkh4;->c:I

    .line 17
    .line 18
    iget-wide v7, p2, Lkh4;->d:J

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-wide v5, p3

    .line 23
    invoke-virtual/range {v0 .. v8}, Lrb4;->g(Loz1;Ljava/lang/Object;IIJJ)Lqb4;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    move-object v1, p1

    .line 29
    move-wide v5, p3

    .line 30
    iget-wide v7, p2, Lkh4;->d:J

    .line 31
    .line 32
    move-object v0, p0

    .line 33
    move-wide v3, p5

    .line 34
    invoke-virtual/range {v0 .. v8}, Lrb4;->h(Loz1;Ljava/lang/Object;JJJ)Lqb4;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public final g(Loz1;Ljava/lang/Object;IIJJ)Lqb4;
    .locals 13

    .line 1
    new-instance v0, Lkh4;

    .line 2
    .line 3
    const/4 v6, -0x1

    .line 4
    move-object v1, p2

    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-wide/from16 v4, p7

    .line 10
    .line 11
    invoke-direct/range {v0 .. v6}, Lkh4;-><init>(Ljava/lang/Object;IIJI)V

    .line 12
    .line 13
    .line 14
    iget-object v4, p0, Lrb4;->a:Lsw1;

    .line 15
    .line 16
    invoke-virtual {p1, p2, v4}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1, v2, v3}, Lsw1;->b(II)J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    iget-object p1, v4, Lsw1;->f:Lzb2;

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lzb2;->a(I)Lcd1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 p2, 0x0

    .line 31
    :goto_0
    iget-object v1, p1, Lcd1;->d:[I

    .line 32
    .line 33
    array-length v5, v1

    .line 34
    if-ge p2, v5, :cond_1

    .line 35
    .line 36
    aget v1, v1, p2

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    if-ne v1, v5, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    if-ne v3, p2, :cond_2

    .line 48
    .line 49
    iget-object p1, v4, Lsw1;->f:Lzb2;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v4, v2}, Lsw1;->c(I)V

    .line 55
    .line 56
    .line 57
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    cmp-long p1, v8, p1

    .line 63
    .line 64
    const-wide/16 v1, 0x0

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    cmp-long p1, v8, v1

    .line 69
    .line 70
    if-gtz p1, :cond_3

    .line 71
    .line 72
    const-wide/16 p1, -0x1

    .line 73
    .line 74
    add-long/2addr p1, v8

    .line 75
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    :cond_3
    move-wide v2, v1

    .line 80
    move-object v1, v0

    .line 81
    new-instance v0, Lqb4;

    .line 82
    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x0

    .line 85
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    const/4 v10, 0x0

    .line 91
    move-wide/from16 v4, p5

    .line 92
    .line 93
    invoke-direct/range {v0 .. v12}, Lqb4;-><init>(Lkh4;JJJJZZZ)V

    .line 94
    .line 95
    .line 96
    return-object v0
.end method

.method public final h(Loz1;Ljava/lang/Object;JJJ)Lqb4;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lrb4;->a:Lsw1;

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v4, v3, Lsw1;->f:Lzb2;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v6, Lkh4;

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    move-wide/from16 v7, p7

    .line 24
    .line 25
    invoke-direct {v6, v2, v7, v8, v4}, Lkh4;-><init>(Ljava/lang/Object;JI)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Lkh4;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    xor-int/lit8 v15, v2, 0x1

    .line 33
    .line 34
    invoke-virtual {v0, v1, v6}, Lrb4;->i(Loz1;Lkh4;)Z

    .line 35
    .line 36
    .line 37
    move-result v16

    .line 38
    invoke-virtual {v0, v1, v6, v15}, Lrb4;->j(Loz1;Lkh4;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v17

    .line 42
    iget-wide v13, v3, Lsw1;->d:J

    .line 43
    .line 44
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long v1, v13, v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    cmp-long v1, p3, v13

    .line 54
    .line 55
    if-ltz v1, :cond_0

    .line 56
    .line 57
    const-wide/16 v1, -0x1

    .line 58
    .line 59
    add-long/2addr v1, v13

    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    move-wide v7, v1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move-wide/from16 v7, p3

    .line 69
    .line 70
    :goto_0
    new-instance v5, Lqb4;

    .line 71
    .line 72
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    move-wide/from16 v9, p5

    .line 78
    .line 79
    invoke-direct/range {v5 .. v17}, Lqb4;-><init>(Lkh4;JJJJZZZ)V

    .line 80
    .line 81
    .line 82
    return-object v5
.end method

.method public final i(Loz1;Lkh4;)Z
    .locals 5

    .line 1
    invoke-virtual {p2}, Lkh4;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget v0, p2, Lkh4;->e:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Lkh4;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, p0, Lrb4;->a:Lsw1;

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v0, v0, Lsw1;->c:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Loz1;->e(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iget-object v2, p0, Lrb4;->b:Lez1;

    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2, v3, v4}, Loz1;->b(ILez1;J)Lez1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget p1, p1, Lez1;->l:I

    .line 36
    .line 37
    if-ne p1, p2, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    return v1
.end method

.method public final j(Loz1;Lkh4;Z)Z
    .locals 6

    .line 1
    iget-object p2, p2, Lkh4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Loz1;->e(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lrb4;->a:Lsw1;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-virtual {p1, v1, v2, p2}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, Lsw1;->c:I

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    move-wide v4, v3

    .line 19
    iget-object v3, p0, Lrb4;->b:Lez1;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v3, v4, v5}, Loz1;->b(ILez1;J)Lez1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-boolean v0, v0, Lez1;->g:Z

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget v4, p0, Lrb4;->f:I

    .line 30
    .line 31
    iget-boolean v5, p0, Lrb4;->g:Z

    .line 32
    .line 33
    move-object v0, p1

    .line 34
    invoke-virtual/range {v0 .. v5}, Loz1;->l(ILsw1;Lez1;IZ)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v0, -0x1

    .line 39
    if-ne p1, v0, :cond_0

    .line 40
    .line 41
    if-eqz p3, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_0
    return p2
.end method

.method public final k(Loz1;I)I
    .locals 0

    .line 1
    iput p2, p0, Lrb4;->f:I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrb4;->d(Loz1;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l(Loz1;Z)I
    .locals 0

    .line 1
    iput-boolean p2, p0, Lrb4;->g:Z

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrb4;->d(Loz1;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final m(Lla4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lrb4;->r()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final n(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lrb4;->k:Lpb4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lpb4;->m:Lpb4;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Lzt0;->b0(Z)V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, v0, Lpb4;->e:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lpb4;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-wide v2, v0, Lpb4;->p:J

    .line 22
    .line 23
    sub-long/2addr p1, v2

    .line 24
    invoke-interface {v1, p1, p2}, Lmi4;->k(J)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lrb4;->k:Lpb4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v2, v0, Lpb4;->g:Lqb4;

    .line 7
    .line 8
    iget-boolean v2, v2, Lqb4;->h:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lpb4;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lrb4;->k:Lpb4;

    .line 20
    .line 21
    iget-object v0, v0, Lpb4;->g:Lqb4;

    .line 22
    .line 23
    iget-wide v4, v0, Lqb4;->e:J

    .line 24
    .line 25
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    cmp-long v0, v4, v6

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget v0, p0, Lrb4;->m:I

    .line 35
    .line 36
    const/16 v2, 0x64

    .line 37
    .line 38
    if-ge v0, v2, :cond_0

    .line 39
    .line 40
    return v1

    .line 41
    :cond_0
    return v3

    .line 42
    :cond_1
    return v1
.end method

.method public final p(JLdc4;)Lqb4;
    .locals 8

    .line 1
    iget-object v0, p0, Lrb4;->k:Lpb4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v2, p3, Ldc4;->a:Loz1;

    .line 6
    .line 7
    iget-object v3, p3, Ldc4;->b:Lkh4;

    .line 8
    .line 9
    iget-wide v4, p3, Ldc4;->c:J

    .line 10
    .line 11
    iget-wide v6, p3, Ldc4;->r:J

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    invoke-virtual/range {v1 .. v7}, Lrb4;->f(Loz1;Lkh4;JJ)Lqb4;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    move-object v1, p0

    .line 20
    iget-object p3, p3, Ldc4;->a:Loz1;

    .line 21
    .line 22
    invoke-virtual {p0, p3, v0, p1, p2}, Lrb4;->e(Loz1;Lpb4;J)Lqb4;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final q(Lqb4;)Lpb4;
    .locals 14

    .line 1
    iget-wide v0, p1, Lqb4;->b:J

    .line 2
    .line 3
    iget-object v2, p0, Lrb4;->k:Lpb4;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const-wide v2, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    move-wide v6, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v3, v2, Lpb4;->p:J

    .line 15
    .line 16
    iget-object v2, v2, Lpb4;->g:Lqb4;

    .line 17
    .line 18
    iget-wide v5, v2, Lqb4;->e:J

    .line 19
    .line 20
    add-long/2addr v3, v5

    .line 21
    sub-long v2, v3, v0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    const/4 v2, 0x0

    .line 25
    :goto_2
    iget-object v3, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v13, 0x0

    .line 32
    if-ge v2, v3, :cond_3

    .line 33
    .line 34
    iget-object v3, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lpb4;

    .line 41
    .line 42
    iget-object v3, v3, Lpb4;->g:Lqb4;

    .line 43
    .line 44
    iget-wide v4, v3, Lqb4;->e:J

    .line 45
    .line 46
    iget-wide v8, p1, Lqb4;->e:J

    .line 47
    .line 48
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long v10, v4, v10

    .line 54
    .line 55
    if-eqz v10, :cond_1

    .line 56
    .line 57
    cmp-long v4, v4, v8

    .line 58
    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    :cond_1
    iget-wide v4, v3, Lqb4;->b:J

    .line 62
    .line 63
    cmp-long v4, v4, v0

    .line 64
    .line 65
    if-nez v4, :cond_2

    .line 66
    .line 67
    iget-object v3, v3, Lqb4;->a:Lkh4;

    .line 68
    .line 69
    iget-object v4, p1, Lqb4;->a:Lkh4;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Lkh4;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    iget-object v0, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lpb4;

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object v0, v13

    .line 90
    :goto_3
    if-nez v0, :cond_4

    .line 91
    .line 92
    iget-object v0, p0, Lrb4;->q:Lx34;

    .line 93
    .line 94
    iget-object v0, v0, Lx34;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ljb4;

    .line 97
    .line 98
    iget-object v1, v0, Ljb4;->k:Llb4;

    .line 99
    .line 100
    iget-object v2, v0, Ljb4;->z:Lxd4;

    .line 101
    .line 102
    new-instance v4, Lpb4;

    .line 103
    .line 104
    invoke-interface {v1, v2}, Llb4;->i(Lxd4;)Lrj4;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    iget-object v1, v0, Ljb4;->d0:Lla4;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v12, v0, Ljb4;->j:Lpj4;

    .line 114
    .line 115
    iget-object v10, v0, Ljb4;->x:Luu0;

    .line 116
    .line 117
    iget-object v8, v0, Ljb4;->i:Llj4;

    .line 118
    .line 119
    iget-object v5, v0, Ljb4;->g:[Lkg4;

    .line 120
    .line 121
    move-object v11, p1

    .line 122
    invoke-direct/range {v4 .. v12}, Lpb4;-><init>([Lkg4;JLlj4;Lrj4;Luu0;Lqb4;Lpj4;)V

    .line 123
    .line 124
    .line 125
    move-object v0, v4

    .line 126
    goto :goto_4

    .line 127
    :cond_4
    move-object v11, p1

    .line 128
    iput-object v11, v0, Lpb4;->g:Lqb4;

    .line 129
    .line 130
    iput-wide v6, v0, Lpb4;->p:J

    .line 131
    .line 132
    :goto_4
    iget-object p1, p0, Lrb4;->k:Lpb4;

    .line 133
    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    iget-object v1, p1, Lpb4;->m:Lpb4;

    .line 137
    .line 138
    if-ne v0, v1, :cond_5

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_5
    invoke-virtual {p1}, Lpb4;->l()V

    .line 142
    .line 143
    .line 144
    iput-object v0, p1, Lpb4;->m:Lpb4;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_6
    iput-object v0, p0, Lrb4;->h:Lpb4;

    .line 148
    .line 149
    iput-object v0, p0, Lrb4;->i:Lpb4;

    .line 150
    .line 151
    iput-object v0, p0, Lrb4;->j:Lpb4;

    .line 152
    .line 153
    :goto_5
    iput-object v13, p0, Lrb4;->n:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v0, p0, Lrb4;->k:Lpb4;

    .line 156
    .line 157
    iget p1, p0, Lrb4;->m:I

    .line 158
    .line 159
    add-int/lit8 p1, p1, 0x1

    .line 160
    .line 161
    iput p1, p0, Lrb4;->m:I

    .line 162
    .line 163
    invoke-virtual {p0}, Lrb4;->b()V

    .line 164
    .line 165
    .line 166
    return-object v0
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lpb4;

    .line 30
    .line 31
    invoke-virtual {v2}, Lpb4;->h()V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iput-object v0, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lrb4;->l:Lpb4;

    .line 41
    .line 42
    invoke-virtual {p0}, Lrb4;->z()V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final s()Lpb4;
    .locals 1

    .line 1
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Lpb4;
    .locals 1

    .line 1
    iget-object v0, p0, Lrb4;->i:Lpb4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Lpb4;
    .locals 1

    .line 1
    iget-object v0, p0, Lrb4;->j:Lpb4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Lpb4;
    .locals 2

    .line 1
    iget-object v0, p0, Lrb4;->j:Lpb4;

    .line 2
    .line 3
    iget-object v1, p0, Lrb4;->i:Lpb4;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lpb4;->m:Lpb4;

    .line 11
    .line 12
    iput-object v0, p0, Lrb4;->j:Lpb4;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lpb4;->m:Lpb4;

    .line 18
    .line 19
    iput-object v0, p0, Lrb4;->i:Lpb4;

    .line 20
    .line 21
    invoke-virtual {p0}, Lrb4;->b()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lrb4;->i:Lpb4;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lrb4;->j:Lpb4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lpb4;->m:Lpb4;

    .line 7
    .line 8
    iput-object v0, p0, Lrb4;->j:Lpb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lrb4;->b()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lrb4;->j:Lpb4;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final x()Lpb4;
    .locals 3

    .line 1
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, p0, Lrb4;->i:Lpb4;

    .line 8
    .line 9
    if-ne v0, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, Lpb4;->m:Lpb4;

    .line 12
    .line 13
    iput-object v2, p0, Lrb4;->i:Lpb4;

    .line 14
    .line 15
    :cond_1
    iget-object v2, p0, Lrb4;->j:Lpb4;

    .line 16
    .line 17
    if-ne v0, v2, :cond_2

    .line 18
    .line 19
    iget-object v2, v0, Lpb4;->m:Lpb4;

    .line 20
    .line 21
    iput-object v2, p0, Lrb4;->j:Lpb4;

    .line 22
    .line 23
    :cond_2
    invoke-virtual {v0}, Lpb4;->h()V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Lrb4;->m:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    iput v0, p0, Lrb4;->m:I

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iput-object v1, p0, Lrb4;->k:Lpb4;

    .line 35
    .line 36
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 37
    .line 38
    iget-object v1, v0, Lpb4;->b:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, Lrb4;->n:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v0, v0, Lpb4;->g:Lqb4;

    .line 43
    .line 44
    iget-object v0, v0, Lqb4;->a:Lkh4;

    .line 45
    .line 46
    iget-wide v0, v0, Lkh4;->d:J

    .line 47
    .line 48
    iput-wide v0, p0, Lrb4;->o:J

    .line 49
    .line 50
    :cond_3
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 51
    .line 52
    iget-object v0, v0, Lpb4;->m:Lpb4;

    .line 53
    .line 54
    iput-object v0, p0, Lrb4;->h:Lpb4;

    .line 55
    .line 56
    invoke-virtual {p0}, Lrb4;->b()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 60
    .line 61
    return-object v0
.end method

.method public final y(Lpb4;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lrb4;->k:Lpb4;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iput-object p1, p0, Lrb4;->k:Lpb4;

    .line 15
    .line 16
    move v0, v1

    .line 17
    :goto_0
    iget-object p1, p1, Lpb4;->m:Lpb4;

    .line 18
    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    iget-object v2, p0, Lrb4;->i:Lpb4;

    .line 22
    .line 23
    if-ne p1, v2, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lrb4;->h:Lpb4;

    .line 26
    .line 27
    iput-object v0, p0, Lrb4;->i:Lpb4;

    .line 28
    .line 29
    iput-object v0, p0, Lrb4;->j:Lpb4;

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    :cond_1
    iget-object v2, p0, Lrb4;->j:Lpb4;

    .line 33
    .line 34
    if-ne p1, v2, :cond_2

    .line 35
    .line 36
    iget-object v2, p0, Lrb4;->i:Lpb4;

    .line 37
    .line 38
    iput-object v2, p0, Lrb4;->j:Lpb4;

    .line 39
    .line 40
    or-int/lit8 v0, v0, 0x2

    .line 41
    .line 42
    :cond_2
    invoke-virtual {p1}, Lpb4;->h()V

    .line 43
    .line 44
    .line 45
    iget v2, p0, Lrb4;->m:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, -0x1

    .line 48
    .line 49
    iput v2, p0, Lrb4;->m:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object p1, p0, Lrb4;->k:Lpb4;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v2, p1, Lpb4;->m:Lpb4;

    .line 58
    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    invoke-virtual {p1}, Lpb4;->l()V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    iput-object v2, p1, Lpb4;->m:Lpb4;

    .line 67
    .line 68
    :goto_1
    iget-object v2, p1, Lpb4;->o:Lpj4;

    .line 69
    .line 70
    iget v3, v2, Lpj4;->f:I

    .line 71
    .line 72
    if-ge v1, v3, :cond_5

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Lpj4;->a(I)Z

    .line 75
    .line 76
    .line 77
    iget-object v2, p1, Lpb4;->o:Lpj4;

    .line 78
    .line 79
    iget-object v2, v2, Lpj4;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, [Lnj4;

    .line 82
    .line 83
    aget-object v2, v2, v1

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lrb4;->b()V

    .line 89
    .line 90
    .line 91
    return v0
.end method

.method public final z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrb4;->l:Lpb4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lpb4;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lrb4;->l:Lpb4;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lrb4;->p:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lpb4;

    .line 30
    .line 31
    invoke-virtual {v1}, Lpb4;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    iput-object v1, p0, Lrb4;->l:Lpb4;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method
