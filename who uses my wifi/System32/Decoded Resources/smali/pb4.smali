.class public final Lpb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Lli4;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lqb4;

.field public h:Z

.field public final i:[Z

.field public final j:[Lkg4;

.field public final k:Llj4;

.field public final l:Luu0;

.field public m:Lpb4;

.field public n:Lri4;

.field public o:Lpj4;

.field public p:J


# direct methods
.method public constructor <init>([Lkg4;JLlj4;Lrj4;Luu0;Lqb4;Lpj4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpb4;->j:[Lkg4;

    .line 5
    .line 6
    iput-wide p2, p0, Lpb4;->p:J

    .line 7
    .line 8
    iput-object p4, p0, Lpb4;->k:Llj4;

    .line 9
    .line 10
    iput-object p6, p0, Lpb4;->l:Luu0;

    .line 11
    .line 12
    iget-object p1, p7, Lqb4;->a:Lkh4;

    .line 13
    .line 14
    iget-object p2, p1, Lkh4;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p2, p0, Lpb4;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p7, p0, Lpb4;->g:Lqb4;

    .line 19
    .line 20
    sget-object p2, Lri4;->d:Lri4;

    .line 21
    .line 22
    iput-object p2, p0, Lpb4;->n:Lri4;

    .line 23
    .line 24
    iput-object p8, p0, Lpb4;->o:Lpj4;

    .line 25
    .line 26
    const/4 p2, 0x2

    .line 27
    new-array p3, p2, [Lli4;

    .line 28
    .line 29
    iput-object p3, p0, Lpb4;->c:[Lli4;

    .line 30
    .line 31
    new-array p2, p2, [Z

    .line 32
    .line 33
    iput-object p2, p0, Lpb4;->i:[Z

    .line 34
    .line 35
    iget-wide p2, p7, Lqb4;->b:J

    .line 36
    .line 37
    iget-wide p7, p7, Lqb4;->d:J

    .line 38
    .line 39
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget p4, Lic4;->k:I

    .line 43
    .line 44
    iget-object p4, p1, Lkh4;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p4, Landroid/util/Pair;

    .line 47
    .line 48
    iget-object v0, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object p4, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p1, p4}, Lkh4;->a(Ljava/lang/Object;)Lkh4;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p4, p6, Luu0;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p4, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {p4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    check-cast p4, Lbc4;

    .line 65
    .line 66
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v0, p6, Luu0;->m:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/util/HashSet;

    .line 72
    .line 73
    invoke-virtual {v0, p4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, p6, Luu0;->l:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v0, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lac4;

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    iget-object v1, v0, Lac4;->a:Lpg4;

    .line 89
    .line 90
    iget-object v0, v0, Lac4;->b:Lcc4;

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Lpg4;->o(Llh4;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    iget-object v0, p4, Lbc4;->c:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    iget-object v0, p4, Lbc4;->a:Lgh4;

    .line 101
    .line 102
    invoke-virtual {v0, p1, p5, p2, p3}, Lgh4;->x(Lkh4;Lrj4;J)Ldh4;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p2, p6, Luu0;->i:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p2, Ljava/util/IdentityHashMap;

    .line 109
    .line 110
    invoke-virtual {p2, p1, p4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p6}, Luu0;->m()V

    .line 114
    .line 115
    .line 116
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    cmp-long p2, p7, p2

    .line 122
    .line 123
    if-eqz p2, :cond_1

    .line 124
    .line 125
    new-instance p2, Lrg4;

    .line 126
    .line 127
    invoke-direct {p2, p1, p7, p8}, Lrg4;-><init>(Ldh4;J)V

    .line 128
    .line 129
    .line 130
    move-object p1, p2

    .line 131
    :cond_1
    iput-object p1, p0, Lpb4;->a:Ljava/lang/Object;

    .line 132
    .line 133
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget-object v0, p0, Lpb4;->g:Lqb4;

    .line 2
    .line 3
    iget-wide v0, v0, Lqb4;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, Lpb4;->p:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lpb4;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lpb4;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lpb4;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lmi4;->j()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public final c()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lpb4;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lpb4;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lpb4;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lpb4;->g:Lqb4;

    .line 16
    .line 17
    iget-wide v2, v2, Lqb4;->b:J

    .line 18
    .line 19
    sub-long/2addr v0, v2

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-gez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 33
    return v0
.end method

.method public final d()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lpb4;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lpb4;->g:Lqb4;

    .line 6
    .line 7
    iget-wide v0, v0, Lqb4;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Lpb4;->f:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lpb4;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Lmi4;->j()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v3, v1

    .line 24
    :goto_0
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lpb4;->g:Lqb4;

    .line 29
    .line 30
    iget-wide v0, v0, Lqb4;->e:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    return-wide v3
.end method

.method public final e(Loz1;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lpb4;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lpb4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Ljh4;->l()Lri4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lpb4;->n:Lri4;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lpb4;->f(Loz1;)Lpj4;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p1, p0, Lpb4;->g:Lqb4;

    .line 17
    .line 18
    iget-wide v0, p1, Lqb4;->b:J

    .line 19
    .line 20
    iget-wide v3, p1, Lqb4;->e:J

    .line 21
    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p1, v3, v5

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    cmp-long p1, v0, v3

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    const-wide/16 v0, -0x1

    .line 36
    .line 37
    add-long/2addr v3, v0

    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    :cond_0
    move-wide v3, v0

    .line 45
    const/4 p1, 0x2

    .line 46
    new-array v6, p1, [Z

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    move-object v1, p0

    .line 50
    invoke-virtual/range {v1 .. v6}, Lpb4;->g(Lpj4;JZ[Z)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-wide v4, v1, Lpb4;->p:J

    .line 55
    .line 56
    iget-object p1, v1, Lpb4;->g:Lqb4;

    .line 57
    .line 58
    iget-wide v6, p1, Lqb4;->b:J

    .line 59
    .line 60
    sub-long/2addr v6, v2

    .line 61
    add-long/2addr v6, v4

    .line 62
    iput-wide v6, v1, Lpb4;->p:J

    .line 63
    .line 64
    invoke-virtual {p1, v2, v3}, Lqb4;->a(J)Lqb4;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, v1, Lpb4;->g:Lqb4;

    .line 69
    .line 70
    return-void
.end method

.method public final f(Loz1;)Lpj4;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lpb4;->n:Lri4;

    .line 4
    .line 5
    iget-object v2, v1, Lpb4;->k:Llj4;

    .line 6
    .line 7
    iget-object v3, v1, Lpb4;->j:[Lkg4;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x3

    .line 13
    new-array v5, v4, [I

    .line 14
    .line 15
    new-array v6, v4, [[Ld02;

    .line 16
    .line 17
    new-array v11, v4, [[[I

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    :goto_0
    if-ge v7, v4, :cond_0

    .line 21
    .line 22
    iget v8, v0, Lri4;->a:I

    .line 23
    .line 24
    new-array v9, v8, [Ld02;

    .line 25
    .line 26
    aput-object v9, v6, v7

    .line 27
    .line 28
    new-array v8, v8, [[I

    .line 29
    .line 30
    aput-object v8, v11, v7

    .line 31
    .line 32
    add-int/lit8 v7, v7, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v14, 0x2

    .line 36
    new-array v10, v14, [I

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    :goto_1
    if-ge v7, v14, :cond_1

    .line 40
    .line 41
    aget-object v8, v3, v7

    .line 42
    .line 43
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/16 v8, 0x8

    .line 47
    .line 48
    aput v8, v10, v7

    .line 49
    .line 50
    add-int/lit8 v7, v7, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v7, 0x0

    .line 54
    :goto_2
    iget v8, v0, Lri4;->a:I

    .line 55
    .line 56
    if-ge v7, v8, :cond_9

    .line 57
    .line 58
    invoke-virtual {v0, v7}, Lri4;->a(I)Ld02;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iget v9, v8, Ld02;->c:I

    .line 63
    .line 64
    iget-object v12, v8, Ld02;->d:[Lph4;

    .line 65
    .line 66
    iget v4, v8, Ld02;->a:I

    .line 67
    .line 68
    move-object/from16 v18, v0

    .line 69
    .line 70
    move v0, v14

    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x1

    .line 74
    .line 75
    const/16 v17, 0x1

    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    :goto_3
    if-ge v13, v14, :cond_6

    .line 80
    .line 81
    aget-object v14, v3, v13

    .line 82
    .line 83
    move-object/from16 v24, v3

    .line 84
    .line 85
    move/from16 v1, v22

    .line 86
    .line 87
    move v3, v1

    .line 88
    :goto_4
    if-ge v1, v4, :cond_2

    .line 89
    .line 90
    move/from16 v19, v1

    .line 91
    .line 92
    aget-object v1, v12, v19

    .line 93
    .line 94
    invoke-virtual {v14, v1}, Lkg4;->J(Lph4;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    and-int/lit8 v1, v1, 0x7

    .line 99
    .line 100
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    add-int/lit8 v1, v19, 0x1

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_2
    aget v1, v5, v13

    .line 108
    .line 109
    if-nez v1, :cond_3

    .line 110
    .line 111
    move/from16 v1, v16

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_3
    move/from16 v1, v22

    .line 115
    .line 116
    :goto_5
    if-gt v3, v15, :cond_4

    .line 117
    .line 118
    if-ne v3, v15, :cond_5

    .line 119
    .line 120
    const/4 v14, 0x5

    .line 121
    if-ne v9, v14, :cond_5

    .line 122
    .line 123
    if-nez v17, :cond_5

    .line 124
    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    move v15, v3

    .line 128
    move v0, v13

    .line 129
    move/from16 v17, v16

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_4
    move/from16 v17, v1

    .line 133
    .line 134
    move v15, v3

    .line 135
    move v0, v13

    .line 136
    :cond_5
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 137
    .line 138
    move-object/from16 v1, p0

    .line 139
    .line 140
    move-object/from16 v3, v24

    .line 141
    .line 142
    const/4 v14, 0x2

    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move-object/from16 v24, v3

    .line 145
    .line 146
    move v1, v14

    .line 147
    if-ne v0, v1, :cond_7

    .line 148
    .line 149
    new-array v1, v4, [I

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_7
    aget-object v1, v24, v0

    .line 153
    .line 154
    new-array v3, v4, [I

    .line 155
    .line 156
    move/from16 v9, v22

    .line 157
    .line 158
    :goto_7
    if-ge v9, v4, :cond_8

    .line 159
    .line 160
    aget-object v13, v12, v9

    .line 161
    .line 162
    invoke-virtual {v1, v13}, Lkg4;->J(Lph4;)I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    aput v13, v3, v9

    .line 167
    .line 168
    add-int/lit8 v9, v9, 0x1

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_8
    move-object v1, v3

    .line 172
    :goto_8
    aget v3, v5, v0

    .line 173
    .line 174
    aget-object v4, v6, v0

    .line 175
    .line 176
    aput-object v8, v4, v3

    .line 177
    .line 178
    aget-object v4, v11, v0

    .line 179
    .line 180
    aput-object v1, v4, v3

    .line 181
    .line 182
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    aput v3, v5, v0

    .line 185
    .line 186
    add-int/lit8 v7, v7, 0x1

    .line 187
    .line 188
    move-object/from16 v1, p0

    .line 189
    .line 190
    move-object/from16 v0, v18

    .line 191
    .line 192
    move-object/from16 v3, v24

    .line 193
    .line 194
    const/4 v4, 0x3

    .line 195
    const/4 v14, 0x2

    .line 196
    goto/16 :goto_2

    .line 197
    .line 198
    :cond_9
    move-object/from16 v24, v3

    .line 199
    .line 200
    move v1, v14

    .line 201
    const/16 v16, 0x1

    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    new-array v9, v1, [Lri4;

    .line 206
    .line 207
    new-array v0, v1, [Ljava/lang/String;

    .line 208
    .line 209
    new-array v8, v1, [I

    .line 210
    .line 211
    move/from16 v3, v22

    .line 212
    .line 213
    :goto_9
    if-ge v3, v1, :cond_a

    .line 214
    .line 215
    aget v1, v5, v3

    .line 216
    .line 217
    new-instance v4, Lri4;

    .line 218
    .line 219
    aget-object v7, v6, v3

    .line 220
    .line 221
    invoke-static {v7, v1}, Lv23;->m([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    check-cast v7, [Ld02;

    .line 226
    .line 227
    invoke-direct {v4, v7}, Lri4;-><init>([Ld02;)V

    .line 228
    .line 229
    .line 230
    aput-object v4, v9, v3

    .line 231
    .line 232
    aget-object v4, v11, v3

    .line 233
    .line 234
    invoke-static {v4, v1}, Lv23;->m([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, [[I

    .line 239
    .line 240
    aput-object v1, v11, v3

    .line 241
    .line 242
    aget-object v1, v24, v3

    .line 243
    .line 244
    invoke-virtual {v1}, Lkg4;->o()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    aput-object v1, v0, v3

    .line 249
    .line 250
    aget-object v1, v24, v3

    .line 251
    .line 252
    iget v1, v1, Lkg4;->g:I

    .line 253
    .line 254
    aput v1, v8, v3

    .line 255
    .line 256
    add-int/lit8 v3, v3, 0x1

    .line 257
    .line 258
    const/4 v1, 0x2

    .line 259
    goto :goto_9

    .line 260
    :cond_a
    move/from16 v23, v1

    .line 261
    .line 262
    aget v0, v5, v23

    .line 263
    .line 264
    new-instance v12, Lri4;

    .line 265
    .line 266
    aget-object v1, v6, v23

    .line 267
    .line 268
    invoke-static {v1, v0}, Lv23;->m([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, [Ld02;

    .line 273
    .line 274
    invoke-direct {v12, v0}, Lri4;-><init>([Ld02;)V

    .line 275
    .line 276
    .line 277
    new-instance v7, Loj4;

    .line 278
    .line 279
    invoke-direct/range {v7 .. v12}, Loj4;-><init>([I[Lri4;[I[[[ILri4;)V

    .line 280
    .line 281
    .line 282
    iget-object v1, v2, Llj4;->c:Ljava/lang/Object;

    .line 283
    .line 284
    monitor-enter v1

    .line 285
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iput-object v0, v2, Llj4;->f:Ljava/lang/Thread;

    .line 290
    .line 291
    iget-object v0, v2, Llj4;->e:Ldj4;

    .line 292
    .line 293
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    iget-object v1, v2, Llj4;->i:Ljava/lang/Boolean;

    .line 295
    .line 296
    if-nez v1, :cond_b

    .line 297
    .line 298
    iget-object v1, v2, Llj4;->d:Landroid/content/Context;

    .line 299
    .line 300
    if-eqz v1, :cond_b

    .line 301
    .line 302
    invoke-static {v1}, Lv23;->h(Landroid/content/Context;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    iput-object v1, v2, Llj4;->i:Ljava/lang/Boolean;

    .line 311
    .line 312
    :cond_b
    iget-boolean v1, v0, Ldj4;->A:Z

    .line 313
    .line 314
    if-eqz v1, :cond_c

    .line 315
    .line 316
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 317
    .line 318
    const/16 v3, 0x20

    .line 319
    .line 320
    if-lt v1, v3, :cond_c

    .line 321
    .line 322
    iget-object v1, v2, Llj4;->g:Lrl;

    .line 323
    .line 324
    if-nez v1, :cond_c

    .line 325
    .line 326
    iget-object v1, v2, Llj4;->d:Landroid/content/Context;

    .line 327
    .line 328
    new-instance v3, Lrl;

    .line 329
    .line 330
    iget-object v4, v2, Llj4;->i:Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-direct {v3, v1, v2, v4}, Lrl;-><init>(Landroid/content/Context;Llj4;Ljava/lang/Boolean;)V

    .line 333
    .line 334
    .line 335
    iput-object v3, v2, Llj4;->g:Lrl;

    .line 336
    .line 337
    :cond_c
    const/4 v1, 0x2

    .line 338
    new-array v3, v1, [Lmj4;

    .line 339
    .line 340
    move/from16 v4, v22

    .line 341
    .line 342
    :goto_a
    if-ge v4, v1, :cond_e

    .line 343
    .line 344
    iget-object v5, v7, Loj4;->a:[I

    .line 345
    .line 346
    aget v5, v5, v4

    .line 347
    .line 348
    if-ne v5, v1, :cond_d

    .line 349
    .line 350
    iget-object v1, v7, Loj4;->b:[Lri4;

    .line 351
    .line 352
    aget-object v1, v1, v4

    .line 353
    .line 354
    iget v1, v1, Lri4;->a:I

    .line 355
    .line 356
    if-lez v1, :cond_d

    .line 357
    .line 358
    move/from16 v1, v16

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 362
    .line 363
    const/4 v1, 0x2

    .line 364
    goto :goto_a

    .line 365
    :cond_e
    move/from16 v1, v22

    .line 366
    .line 367
    :goto_b
    new-instance v4, Lrl;

    .line 368
    .line 369
    invoke-direct {v4, v2, v0, v1, v10}, Lrl;-><init>(Llj4;Ldj4;Z[I)V

    .line 370
    .line 371
    .line 372
    sget-object v1, Lbk;->k:Lbk;

    .line 373
    .line 374
    move/from16 v5, v16

    .line 375
    .line 376
    invoke-static {v5, v7, v11, v4, v1}, Llj4;->g(ILoj4;[[[ILgj4;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    if-eqz v1, :cond_f

    .line 381
    .line 382
    iget-object v4, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v4, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v5, Lmj4;

    .line 393
    .line 394
    aput-object v5, v3, v4

    .line 395
    .line 396
    :cond_f
    if-nez v1, :cond_10

    .line 397
    .line 398
    const/16 v17, 0x0

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_10
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v1, Lmj4;

    .line 404
    .line 405
    iget-object v5, v1, Lmj4;->a:Ld02;

    .line 406
    .line 407
    iget-object v1, v1, Lmj4;->b:[I

    .line 408
    .line 409
    aget v1, v1, v22

    .line 410
    .line 411
    iget-object v5, v5, Ld02;->d:[Lph4;

    .line 412
    .line 413
    aget-object v1, v5, v1

    .line 414
    .line 415
    iget-object v1, v1, Lph4;->d:Ljava/lang/String;

    .line 416
    .line 417
    move-object/from16 v17, v1

    .line 418
    .line 419
    :goto_c
    iget-object v1, v0, Lr32;->q:Lm22;

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-boolean v1, v0, Lr32;->g:Z

    .line 425
    .line 426
    const/4 v5, -0x1

    .line 427
    if-eqz v1, :cond_19

    .line 428
    .line 429
    iget-object v1, v2, Llj4;->d:Landroid/content/Context;

    .line 430
    .line 431
    if-eqz v1, :cond_19

    .line 432
    .line 433
    sget-object v6, Lv23;->a:Ljava/lang/String;

    .line 434
    .line 435
    const-string v6, "display"

    .line 436
    .line 437
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    check-cast v6, Landroid/hardware/display/DisplayManager;

    .line 442
    .line 443
    if-eqz v6, :cond_11

    .line 444
    .line 445
    move/from16 v8, v22

    .line 446
    .line 447
    invoke-virtual {v6, v8}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    goto :goto_d

    .line 452
    :cond_11
    const/4 v6, 0x0

    .line 453
    :goto_d
    if-nez v6, :cond_12

    .line 454
    .line 455
    const-string v6, "window"

    .line 456
    .line 457
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    check-cast v6, Landroid/view/WindowManager;

    .line 462
    .line 463
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    :cond_12
    invoke-virtual {v6}, Landroid/view/Display;->getDisplayId()I

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    if-nez v8, :cond_17

    .line 475
    .line 476
    invoke-static {v1}, Lv23;->h(Landroid/content/Context;)Z

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    if-eqz v8, :cond_17

    .line 481
    .line 482
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 483
    .line 484
    const/16 v12, 0x1c

    .line 485
    .line 486
    if-ge v8, v12, :cond_13

    .line 487
    .line 488
    const-string v8, "sys.display-size"

    .line 489
    .line 490
    invoke-static {v8}, Lv23;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    goto :goto_e

    .line 495
    :cond_13
    const-string v8, "vendor.display-size"

    .line 496
    .line 497
    invoke-static {v8}, Lv23;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    :goto_e
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 502
    .line 503
    .line 504
    move-result v12

    .line 505
    if-nez v12, :cond_16

    .line 506
    .line 507
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v12

    .line 511
    const-string v13, "x"

    .line 512
    .line 513
    invoke-virtual {v12, v13, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v12

    .line 517
    array-length v13, v12

    .line 518
    const/4 v14, 0x2

    .line 519
    if-ne v13, v14, :cond_14

    .line 520
    .line 521
    const/16 v22, 0x0

    .line 522
    .line 523
    aget-object v13, v12, v22

    .line 524
    .line 525
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 526
    .line 527
    .line 528
    move-result v13
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 529
    const/16 v16, 0x1

    .line 530
    .line 531
    :try_start_2
    aget-object v12, v12, v16

    .line 532
    .line 533
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    move-result v12

    .line 537
    if-lez v13, :cond_15

    .line 538
    .line 539
    if-lez v12, :cond_15

    .line 540
    .line 541
    new-instance v14, Landroid/graphics/Point;

    .line 542
    .line 543
    invoke-direct {v14, v13, v12}, Landroid/graphics/Point;-><init>(II)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 544
    .line 545
    .line 546
    goto :goto_11

    .line 547
    :catch_0
    :cond_14
    const/16 v16, 0x1

    .line 548
    .line 549
    :catch_1
    :cond_15
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v8

    .line 553
    const-string v12, "Invalid display size: "

    .line 554
    .line 555
    const-string v13, "Util"

    .line 556
    .line 557
    invoke-virtual {v12, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    invoke-static {v13, v8}, La30;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    goto :goto_f

    .line 565
    :cond_16
    const/16 v16, 0x1

    .line 566
    .line 567
    :goto_f
    const-string v8, "Sony"

    .line 568
    .line 569
    sget-object v12, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    if-eqz v8, :cond_18

    .line 576
    .line 577
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 578
    .line 579
    const-string v12, "BRAVIA"

    .line 580
    .line 581
    invoke-virtual {v8, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 582
    .line 583
    .line 584
    move-result v8

    .line 585
    if-eqz v8, :cond_18

    .line 586
    .line 587
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    const-string v8, "com.sony.dtv.hardware.panel.qfhd"

    .line 592
    .line 593
    invoke-virtual {v1, v8}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-eqz v1, :cond_18

    .line 598
    .line 599
    new-instance v1, Landroid/graphics/Point;

    .line 600
    .line 601
    const/16 v6, 0xf00

    .line 602
    .line 603
    const/16 v8, 0x870

    .line 604
    .line 605
    invoke-direct {v1, v6, v8}, Landroid/graphics/Point;-><init>(II)V

    .line 606
    .line 607
    .line 608
    :goto_10
    move-object v14, v1

    .line 609
    goto :goto_11

    .line 610
    :cond_17
    const/16 v16, 0x1

    .line 611
    .line 612
    :cond_18
    new-instance v1, Landroid/graphics/Point;

    .line 613
    .line 614
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v6}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    invoke-virtual {v6}, Landroid/view/Display$Mode;->getPhysicalWidth()I

    .line 622
    .line 623
    .line 624
    move-result v8

    .line 625
    iput v8, v1, Landroid/graphics/Point;->x:I

    .line 626
    .line 627
    invoke-virtual {v6}, Landroid/view/Display$Mode;->getPhysicalHeight()I

    .line 628
    .line 629
    .line 630
    move-result v6

    .line 631
    iput v6, v1, Landroid/graphics/Point;->y:I

    .line 632
    .line 633
    goto :goto_10

    .line 634
    :goto_11
    move-object/from16 v19, v14

    .line 635
    .line 636
    goto :goto_12

    .line 637
    :cond_19
    const/16 v16, 0x1

    .line 638
    .line 639
    const/16 v19, 0x0

    .line 640
    .line 641
    :goto_12
    new-instance v15, Lmc2;

    .line 642
    .line 643
    const/16 v20, 0x1c

    .line 644
    .line 645
    const/16 v21, 0x0

    .line 646
    .line 647
    move/from16 v18, v16

    .line 648
    .line 649
    move-object/from16 v16, v0

    .line 650
    .line 651
    move/from16 v0, v18

    .line 652
    .line 653
    move-object/from16 v18, v10

    .line 654
    .line 655
    invoke-direct/range {v15 .. v21}, Lmc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v1, v16

    .line 659
    .line 660
    move-object/from16 v6, v17

    .line 661
    .line 662
    sget-object v8, Lbk;->n:Lbk;

    .line 663
    .line 664
    const/4 v14, 0x2

    .line 665
    invoke-static {v14, v7, v11, v15, v8}, Llj4;->g(ILoj4;[[[ILgj4;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 666
    .line 667
    .line 668
    move-result-object v8

    .line 669
    const/4 v10, 0x4

    .line 670
    if-nez v8, :cond_1a

    .line 671
    .line 672
    new-instance v12, Lrc3;

    .line 673
    .line 674
    const/16 v13, 0xa

    .line 675
    .line 676
    invoke-direct {v12, v13, v1}, Lrc3;-><init>(ILjava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    sget-object v13, Lbk;->l:Lbk;

    .line 680
    .line 681
    invoke-static {v10, v7, v11, v12, v13}, Llj4;->g(ILoj4;[[[ILgj4;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 682
    .line 683
    .line 684
    move-result-object v12

    .line 685
    goto :goto_13

    .line 686
    :cond_1a
    const/4 v12, 0x0

    .line 687
    :goto_13
    if-eqz v12, :cond_1b

    .line 688
    .line 689
    iget-object v8, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v8, Ljava/lang/Integer;

    .line 692
    .line 693
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 694
    .line 695
    .line 696
    move-result v8

    .line 697
    iget-object v12, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v12, Lmj4;

    .line 700
    .line 701
    aput-object v12, v3, v8

    .line 702
    .line 703
    goto :goto_14

    .line 704
    :cond_1b
    if-eqz v8, :cond_1c

    .line 705
    .line 706
    iget-object v12, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v12, Ljava/lang/Integer;

    .line 709
    .line 710
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 711
    .line 712
    .line 713
    move-result v12

    .line 714
    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v8, Lmj4;

    .line 717
    .line 718
    aput-object v8, v3, v12

    .line 719
    .line 720
    :cond_1c
    :goto_14
    iget-boolean v8, v1, Lr32;->t:Z

    .line 721
    .line 722
    if-eqz v8, :cond_1d

    .line 723
    .line 724
    iget-object v8, v2, Llj4;->d:Landroid/content/Context;

    .line 725
    .line 726
    if-nez v8, :cond_1e

    .line 727
    .line 728
    :cond_1d
    :goto_15
    const/4 v8, 0x0

    .line 729
    goto :goto_16

    .line 730
    :cond_1e
    const-string v12, "captioning"

    .line 731
    .line 732
    invoke-virtual {v8, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v8

    .line 736
    check-cast v8, Landroid/view/accessibility/CaptioningManager;

    .line 737
    .line 738
    if-eqz v8, :cond_1d

    .line 739
    .line 740
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 741
    .line 742
    .line 743
    move-result v12

    .line 744
    if-nez v12, :cond_1f

    .line 745
    .line 746
    goto :goto_15

    .line 747
    :cond_1f
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    if-nez v8, :cond_20

    .line 752
    .line 753
    goto :goto_15

    .line 754
    :cond_20
    sget-object v12, Lv23;->a:Ljava/lang/String;

    .line 755
    .line 756
    invoke-virtual {v8}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v8

    .line 760
    :goto_16
    new-instance v12, Lpb3;

    .line 761
    .line 762
    invoke-direct {v12, v1, v6, v8}, Lpb3;-><init>(Ldj4;Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    sget-object v6, Lbk;->m:Lbk;

    .line 766
    .line 767
    const/4 v8, 0x3

    .line 768
    invoke-static {v8, v7, v11, v12, v6}, Llj4;->g(ILoj4;[[[ILgj4;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 769
    .line 770
    .line 771
    move-result-object v6

    .line 772
    if-eqz v6, :cond_21

    .line 773
    .line 774
    iget-object v8, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v8, Ljava/lang/Integer;

    .line 777
    .line 778
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 779
    .line 780
    .line 781
    move-result v8

    .line 782
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v6, Lmj4;

    .line 785
    .line 786
    aput-object v6, v3, v8

    .line 787
    .line 788
    :cond_21
    const/4 v6, 0x0

    .line 789
    :goto_17
    const/4 v14, 0x2

    .line 790
    if-ge v6, v14, :cond_29

    .line 791
    .line 792
    iget-object v8, v7, Loj4;->a:[I

    .line 793
    .line 794
    aget v8, v8, v6

    .line 795
    .line 796
    if-eq v8, v14, :cond_28

    .line 797
    .line 798
    if-eq v8, v0, :cond_28

    .line 799
    .line 800
    const/4 v12, 0x3

    .line 801
    if-eq v8, v12, :cond_28

    .line 802
    .line 803
    if-eq v8, v10, :cond_28

    .line 804
    .line 805
    iget-object v8, v7, Loj4;->b:[Lri4;

    .line 806
    .line 807
    aget-object v8, v8, v6

    .line 808
    .line 809
    aget-object v13, v11, v6

    .line 810
    .line 811
    const/4 v12, 0x0

    .line 812
    const/4 v14, 0x0

    .line 813
    const/4 v15, 0x0

    .line 814
    const/16 v16, 0x0

    .line 815
    .line 816
    :goto_18
    iget v5, v8, Lri4;->a:I

    .line 817
    .line 818
    if-ge v14, v5, :cond_26

    .line 819
    .line 820
    invoke-virtual {v8, v14}, Lri4;->a(I)Ld02;

    .line 821
    .line 822
    .line 823
    move-result-object v5

    .line 824
    aget-object v18, v13, v14

    .line 825
    .line 826
    move-object/from16 v4, v16

    .line 827
    .line 828
    const/4 v10, 0x0

    .line 829
    const/16 v16, 0x0

    .line 830
    .line 831
    :goto_19
    iget v0, v5, Ld02;->a:I

    .line 832
    .line 833
    if-ge v10, v0, :cond_25

    .line 834
    .line 835
    aget v0, v18, v10

    .line 836
    .line 837
    move-object/from16 v21, v3

    .line 838
    .line 839
    iget-boolean v3, v1, Ldj4;->B:Z

    .line 840
    .line 841
    invoke-static {v0, v3}, Lkg4;->I(IZ)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-eqz v0, :cond_23

    .line 846
    .line 847
    iget-object v0, v5, Ld02;->d:[Lph4;

    .line 848
    .line 849
    aget-object v0, v0, v10

    .line 850
    .line 851
    new-instance v3, Lbj4;

    .line 852
    .line 853
    move-object/from16 v25, v5

    .line 854
    .line 855
    aget v5, v18, v10

    .line 856
    .line 857
    invoke-direct {v3, v0, v5}, Lbj4;-><init>(Lph4;I)V

    .line 858
    .line 859
    .line 860
    if-eqz v4, :cond_22

    .line 861
    .line 862
    sget-object v0, Lpm3;->a:Lnm3;

    .line 863
    .line 864
    iget-boolean v5, v3, Lbj4;->g:Z

    .line 865
    .line 866
    move/from16 v26, v6

    .line 867
    .line 868
    iget-boolean v6, v4, Lbj4;->g:Z

    .line 869
    .line 870
    invoke-virtual {v0, v5, v6}, Lnm3;->d(ZZ)Lpm3;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    iget-boolean v5, v3, Lbj4;->f:Z

    .line 875
    .line 876
    iget-boolean v6, v4, Lbj4;->f:Z

    .line 877
    .line 878
    invoke-virtual {v0, v5, v6}, Lpm3;->d(ZZ)Lpm3;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    invoke-virtual {v0}, Lpm3;->e()I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    if-lez v0, :cond_24

    .line 887
    .line 888
    goto :goto_1a

    .line 889
    :cond_22
    move/from16 v26, v6

    .line 890
    .line 891
    :goto_1a
    move-object v4, v3

    .line 892
    move v15, v10

    .line 893
    move-object/from16 v12, v25

    .line 894
    .line 895
    goto :goto_1b

    .line 896
    :cond_23
    move-object/from16 v25, v5

    .line 897
    .line 898
    move/from16 v26, v6

    .line 899
    .line 900
    :cond_24
    :goto_1b
    add-int/lit8 v10, v10, 0x1

    .line 901
    .line 902
    move-object/from16 v3, v21

    .line 903
    .line 904
    move-object/from16 v5, v25

    .line 905
    .line 906
    move/from16 v6, v26

    .line 907
    .line 908
    goto :goto_19

    .line 909
    :cond_25
    move-object/from16 v21, v3

    .line 910
    .line 911
    move/from16 v26, v6

    .line 912
    .line 913
    add-int/lit8 v14, v14, 0x1

    .line 914
    .line 915
    move-object/from16 v16, v4

    .line 916
    .line 917
    const/4 v0, 0x1

    .line 918
    const/4 v10, 0x4

    .line 919
    goto :goto_18

    .line 920
    :cond_26
    move-object/from16 v21, v3

    .line 921
    .line 922
    move/from16 v26, v6

    .line 923
    .line 924
    const/16 v16, 0x0

    .line 925
    .line 926
    if-nez v12, :cond_27

    .line 927
    .line 928
    move-object/from16 v0, v16

    .line 929
    .line 930
    goto :goto_1c

    .line 931
    :cond_27
    new-instance v0, Lmj4;

    .line 932
    .line 933
    filled-new-array {v15}, [I

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-direct {v0, v12, v3}, Lmj4;-><init>(Ld02;[I)V

    .line 938
    .line 939
    .line 940
    :goto_1c
    aput-object v0, v21, v26

    .line 941
    .line 942
    goto :goto_1d

    .line 943
    :cond_28
    move-object/from16 v21, v3

    .line 944
    .line 945
    move/from16 v26, v6

    .line 946
    .line 947
    const/16 v16, 0x0

    .line 948
    .line 949
    :goto_1d
    add-int/lit8 v6, v26, 0x1

    .line 950
    .line 951
    move-object/from16 v3, v21

    .line 952
    .line 953
    const/4 v0, 0x1

    .line 954
    const/4 v5, -0x1

    .line 955
    const/4 v10, 0x4

    .line 956
    goto/16 :goto_17

    .line 957
    .line 958
    :cond_29
    move-object/from16 v21, v3

    .line 959
    .line 960
    const/16 v16, 0x0

    .line 961
    .line 962
    new-instance v0, Ljava/util/HashMap;

    .line 963
    .line 964
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 965
    .line 966
    .line 967
    const/4 v3, 0x0

    .line 968
    :goto_1e
    const/4 v14, 0x2

    .line 969
    if-ge v3, v14, :cond_2c

    .line 970
    .line 971
    iget-object v4, v7, Loj4;->b:[Lri4;

    .line 972
    .line 973
    aget-object v4, v4, v3

    .line 974
    .line 975
    const/4 v5, 0x0

    .line 976
    :goto_1f
    iget v6, v4, Lri4;->a:I

    .line 977
    .line 978
    if-ge v5, v6, :cond_2b

    .line 979
    .line 980
    invoke-virtual {v4, v5}, Lri4;->a(I)Ld02;

    .line 981
    .line 982
    .line 983
    move-result-object v6

    .line 984
    iget-object v8, v1, Lr32;->u:Lxn3;

    .line 985
    .line 986
    invoke-virtual {v8, v6}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v6

    .line 990
    if-nez v6, :cond_2a

    .line 991
    .line 992
    add-int/lit8 v5, v5, 0x1

    .line 993
    .line 994
    goto :goto_1f

    .line 995
    :cond_2a
    new-instance v0, Ljava/lang/ClassCastException;

    .line 996
    .line 997
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 998
    .line 999
    .line 1000
    throw v0

    .line 1001
    :cond_2b
    add-int/lit8 v3, v3, 0x1

    .line 1002
    .line 1003
    goto :goto_1e

    .line 1004
    :cond_2c
    iget-object v3, v7, Loj4;->d:Lri4;

    .line 1005
    .line 1006
    const/4 v4, 0x0

    .line 1007
    :goto_20
    iget v5, v3, Lri4;->a:I

    .line 1008
    .line 1009
    if-ge v4, v5, :cond_2e

    .line 1010
    .line 1011
    invoke-virtual {v3, v4}, Lri4;->a(I)Ld02;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v5

    .line 1015
    iget-object v6, v1, Lr32;->u:Lxn3;

    .line 1016
    .line 1017
    invoke-virtual {v6, v5}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    if-nez v5, :cond_2d

    .line 1022
    .line 1023
    add-int/lit8 v4, v4, 0x1

    .line 1024
    .line 1025
    goto :goto_20

    .line 1026
    :cond_2d
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1027
    .line 1028
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    throw v0

    .line 1032
    :cond_2e
    const/4 v3, 0x0

    .line 1033
    :goto_21
    const/4 v14, 0x2

    .line 1034
    if-ge v3, v14, :cond_30

    .line 1035
    .line 1036
    iget-object v4, v7, Loj4;->a:[I

    .line 1037
    .line 1038
    aget v4, v4, v3

    .line 1039
    .line 1040
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v4

    .line 1044
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    if-nez v4, :cond_2f

    .line 1049
    .line 1050
    add-int/lit8 v3, v3, 0x1

    .line 1051
    .line 1052
    goto :goto_21

    .line 1053
    :cond_2f
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1054
    .line 1055
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1056
    .line 1057
    .line 1058
    throw v0

    .line 1059
    :cond_30
    const/4 v0, 0x0

    .line 1060
    :goto_22
    if-ge v0, v14, :cond_34

    .line 1061
    .line 1062
    iget-object v3, v7, Loj4;->b:[Lri4;

    .line 1063
    .line 1064
    aget-object v3, v3, v0

    .line 1065
    .line 1066
    iget-object v4, v1, Ldj4;->D:Landroid/util/SparseArray;

    .line 1067
    .line 1068
    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    check-cast v4, Ljava/util/Map;

    .line 1073
    .line 1074
    if-eqz v4, :cond_33

    .line 1075
    .line 1076
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    if-eqz v4, :cond_33

    .line 1081
    .line 1082
    iget-object v4, v1, Ldj4;->D:Landroid/util/SparseArray;

    .line 1083
    .line 1084
    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v4

    .line 1088
    check-cast v4, Ljava/util/Map;

    .line 1089
    .line 1090
    if-eqz v4, :cond_32

    .line 1091
    .line 1092
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    if-nez v3, :cond_31

    .line 1097
    .line 1098
    goto :goto_23

    .line 1099
    :cond_31
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1100
    .line 1101
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1102
    .line 1103
    .line 1104
    throw v0

    .line 1105
    :cond_32
    :goto_23
    aput-object v16, v21, v0

    .line 1106
    .line 1107
    :cond_33
    add-int/lit8 v0, v0, 0x1

    .line 1108
    .line 1109
    const/4 v14, 0x2

    .line 1110
    goto :goto_22

    .line 1111
    :cond_34
    const/4 v0, 0x0

    .line 1112
    :goto_24
    if-ge v0, v14, :cond_37

    .line 1113
    .line 1114
    iget-object v3, v7, Loj4;->a:[I

    .line 1115
    .line 1116
    aget v3, v3, v0

    .line 1117
    .line 1118
    iget-object v4, v1, Ldj4;->E:Landroid/util/SparseBooleanArray;

    .line 1119
    .line 1120
    invoke-virtual {v4, v0}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v4

    .line 1124
    if-nez v4, :cond_35

    .line 1125
    .line 1126
    iget-object v4, v1, Lr32;->v:Ldn3;

    .line 1127
    .line 1128
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v3

    .line 1132
    invoke-virtual {v4, v3}, Ltm3;->contains(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v3

    .line 1136
    if-eqz v3, :cond_36

    .line 1137
    .line 1138
    :cond_35
    aput-object v16, v21, v0

    .line 1139
    .line 1140
    :cond_36
    add-int/lit8 v0, v0, 0x1

    .line 1141
    .line 1142
    const/4 v14, 0x2

    .line 1143
    goto :goto_24

    .line 1144
    :cond_37
    iget-object v0, v2, Llj4;->j:Lid4;

    .line 1145
    .line 1146
    iget-object v2, v2, Llj4;->b:Luj4;

    .line 1147
    .line 1148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    new-instance v2, Ljava/util/ArrayList;

    .line 1152
    .line 1153
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1154
    .line 1155
    .line 1156
    const/4 v3, 0x0

    .line 1157
    :goto_25
    const-wide/16 v4, 0x0

    .line 1158
    .line 1159
    const/4 v14, 0x2

    .line 1160
    if-ge v3, v14, :cond_39

    .line 1161
    .line 1162
    aget-object v6, v21, v3

    .line 1163
    .line 1164
    if-eqz v6, :cond_38

    .line 1165
    .line 1166
    iget-object v6, v6, Lmj4;->b:[I

    .line 1167
    .line 1168
    array-length v6, v6

    .line 1169
    const/4 v8, 0x1

    .line 1170
    if-le v6, v8, :cond_38

    .line 1171
    .line 1172
    sget-object v6, Lxm3;->g:Lvm3;

    .line 1173
    .line 1174
    new-instance v6, Lum3;

    .line 1175
    .line 1176
    const/4 v8, 0x4

    .line 1177
    invoke-direct {v6, v8}, Lrm3;-><init>(I)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v8, Lwi4;

    .line 1181
    .line 1182
    invoke-direct {v8, v4, v5, v4, v5}, Lwi4;-><init>(JJ)V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v6, v8}, Lrm3;->a(Ljava/lang/Object;)V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1189
    .line 1190
    .line 1191
    move-object/from16 v6, v16

    .line 1192
    .line 1193
    goto :goto_26

    .line 1194
    :cond_38
    move-object/from16 v6, v16

    .line 1195
    .line 1196
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1197
    .line 1198
    .line 1199
    :goto_26
    add-int/lit8 v3, v3, 0x1

    .line 1200
    .line 1201
    move-object/from16 v16, v6

    .line 1202
    .line 1203
    goto :goto_25

    .line 1204
    :cond_39
    move-object/from16 v6, v16

    .line 1205
    .line 1206
    new-array v3, v14, [[J

    .line 1207
    .line 1208
    const/4 v8, 0x0

    .line 1209
    :goto_27
    const-wide/16 v12, -0x1

    .line 1210
    .line 1211
    if-ge v8, v14, :cond_3d

    .line 1212
    .line 1213
    aget-object v10, v21, v8

    .line 1214
    .line 1215
    if-nez v10, :cond_3a

    .line 1216
    .line 1217
    const/4 v14, 0x0

    .line 1218
    new-array v10, v14, [J

    .line 1219
    .line 1220
    aput-object v10, v3, v8

    .line 1221
    .line 1222
    goto :goto_29

    .line 1223
    :cond_3a
    iget-object v14, v10, Lmj4;->b:[I

    .line 1224
    .line 1225
    array-length v15, v14

    .line 1226
    new-array v15, v15, [J

    .line 1227
    .line 1228
    aput-object v15, v3, v8

    .line 1229
    .line 1230
    const/4 v15, 0x0

    .line 1231
    :goto_28
    array-length v4, v14

    .line 1232
    if-ge v15, v4, :cond_3c

    .line 1233
    .line 1234
    iget-object v4, v10, Lmj4;->a:Ld02;

    .line 1235
    .line 1236
    aget v5, v14, v15

    .line 1237
    .line 1238
    iget-object v4, v4, Ld02;->d:[Lph4;

    .line 1239
    .line 1240
    aget-object v4, v4, v5

    .line 1241
    .line 1242
    iget v4, v4, Lph4;->i:I

    .line 1243
    .line 1244
    int-to-long v4, v4

    .line 1245
    aget-object v16, v3, v8

    .line 1246
    .line 1247
    cmp-long v18, v4, v12

    .line 1248
    .line 1249
    if-nez v18, :cond_3b

    .line 1250
    .line 1251
    const-wide/16 v4, 0x0

    .line 1252
    .line 1253
    :cond_3b
    aput-wide v4, v16, v15

    .line 1254
    .line 1255
    add-int/lit8 v15, v15, 0x1

    .line 1256
    .line 1257
    goto :goto_28

    .line 1258
    :cond_3c
    aget-object v4, v3, v8

    .line 1259
    .line 1260
    invoke-static {v4}, Ljava/util/Arrays;->sort([J)V

    .line 1261
    .line 1262
    .line 1263
    :goto_29
    add-int/lit8 v8, v8, 0x1

    .line 1264
    .line 1265
    const-wide/16 v4, 0x0

    .line 1266
    .line 1267
    const/4 v14, 0x2

    .line 1268
    goto :goto_27

    .line 1269
    :cond_3d
    new-array v4, v14, [I

    .line 1270
    .line 1271
    new-array v5, v14, [J

    .line 1272
    .line 1273
    const/4 v8, 0x0

    .line 1274
    :goto_2a
    if-ge v8, v14, :cond_3f

    .line 1275
    .line 1276
    aget-object v10, v3, v8

    .line 1277
    .line 1278
    array-length v14, v10

    .line 1279
    if-nez v14, :cond_3e

    .line 1280
    .line 1281
    const-wide/16 v14, 0x0

    .line 1282
    .line 1283
    goto :goto_2b

    .line 1284
    :cond_3e
    const/16 v22, 0x0

    .line 1285
    .line 1286
    aget-wide v14, v10, v22

    .line 1287
    .line 1288
    :goto_2b
    aput-wide v14, v5, v8

    .line 1289
    .line 1290
    add-int/lit8 v8, v8, 0x1

    .line 1291
    .line 1292
    const/4 v14, 0x2

    .line 1293
    goto :goto_2a

    .line 1294
    :cond_3f
    invoke-static {v2, v5}, Lxi4;->d(Ljava/util/ArrayList;[J)V

    .line 1295
    .line 1296
    .line 1297
    new-instance v8, Ljava/util/TreeMap;

    .line 1298
    .line 1299
    sget-object v10, Lqn3;->g:Lqn3;

    .line 1300
    .line 1301
    invoke-direct {v8, v10}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 1302
    .line 1303
    .line 1304
    new-instance v10, Lwc;

    .line 1305
    .line 1306
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1307
    .line 1308
    .line 1309
    new-instance v14, Lpn3;

    .line 1310
    .line 1311
    invoke-direct {v14, v8, v10}, Lpn3;-><init>(Ljava/util/Map;Lwc;)V

    .line 1312
    .line 1313
    .line 1314
    const/4 v8, 0x0

    .line 1315
    :goto_2c
    const/4 v10, 0x2

    .line 1316
    if-ge v8, v10, :cond_48

    .line 1317
    .line 1318
    aget-object v10, v3, v8

    .line 1319
    .line 1320
    array-length v10, v10

    .line 1321
    const/4 v15, 0x1

    .line 1322
    if-gt v10, v15, :cond_41

    .line 1323
    .line 1324
    move-object/from16 v18, v4

    .line 1325
    .line 1326
    move-wide/from16 v25, v12

    .line 1327
    .line 1328
    move-object v13, v3

    .line 1329
    :cond_40
    move-object/from16 v29, v0

    .line 1330
    .line 1331
    goto/16 :goto_32

    .line 1332
    .line 1333
    :cond_41
    new-array v15, v10, [D

    .line 1334
    .line 1335
    move-wide/from16 v25, v12

    .line 1336
    .line 1337
    const/4 v6, 0x0

    .line 1338
    :goto_2d
    aget-object v12, v3, v8

    .line 1339
    .line 1340
    array-length v13, v12

    .line 1341
    const-wide/16 v27, 0x0

    .line 1342
    .line 1343
    if-ge v6, v13, :cond_43

    .line 1344
    .line 1345
    move-object v13, v3

    .line 1346
    move-object/from16 v18, v4

    .line 1347
    .line 1348
    aget-wide v3, v12, v6

    .line 1349
    .line 1350
    cmp-long v12, v3, v25

    .line 1351
    .line 1352
    if-nez v12, :cond_42

    .line 1353
    .line 1354
    goto :goto_2e

    .line 1355
    :cond_42
    long-to-double v3, v3

    .line 1356
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    .line 1357
    .line 1358
    .line 1359
    move-result-wide v27

    .line 1360
    :goto_2e
    aput-wide v27, v15, v6

    .line 1361
    .line 1362
    add-int/lit8 v6, v6, 0x1

    .line 1363
    .line 1364
    move-object v3, v13

    .line 1365
    move-object/from16 v4, v18

    .line 1366
    .line 1367
    goto :goto_2d

    .line 1368
    :cond_43
    move-object v13, v3

    .line 1369
    move-object/from16 v18, v4

    .line 1370
    .line 1371
    add-int/lit8 v10, v10, -0x1

    .line 1372
    .line 1373
    aget-wide v3, v15, v10

    .line 1374
    .line 1375
    const/16 v22, 0x0

    .line 1376
    .line 1377
    aget-wide v29, v15, v22

    .line 1378
    .line 1379
    sub-double v3, v3, v29

    .line 1380
    .line 1381
    const/4 v6, 0x0

    .line 1382
    :goto_2f
    if-ge v6, v10, :cond_40

    .line 1383
    .line 1384
    aget-wide v29, v15, v6

    .line 1385
    .line 1386
    add-int/lit8 v6, v6, 0x1

    .line 1387
    .line 1388
    aget-wide v31, v15, v6

    .line 1389
    .line 1390
    add-double v29, v29, v31

    .line 1391
    .line 1392
    cmpl-double v12, v3, v27

    .line 1393
    .line 1394
    if-nez v12, :cond_44

    .line 1395
    .line 1396
    const-wide/high16 v29, 0x3ff0000000000000L    # 1.0

    .line 1397
    .line 1398
    goto :goto_30

    .line 1399
    :cond_44
    const-wide/high16 v31, 0x3fe0000000000000L    # 0.5

    .line 1400
    .line 1401
    mul-double v29, v29, v31

    .line 1402
    .line 1403
    const/16 v22, 0x0

    .line 1404
    .line 1405
    aget-wide v31, v15, v22

    .line 1406
    .line 1407
    sub-double v29, v29, v31

    .line 1408
    .line 1409
    div-double v29, v29, v3

    .line 1410
    .line 1411
    :goto_30
    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v12

    .line 1415
    move-object/from16 v29, v0

    .line 1416
    .line 1417
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    move-wide/from16 v30, v3

    .line 1422
    .line 1423
    iget-object v3, v14, Lpn3;->i:Ljava/util/Map;

    .line 1424
    .line 1425
    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v4

    .line 1429
    check-cast v4, Ljava/util/Collection;

    .line 1430
    .line 1431
    if-nez v4, :cond_46

    .line 1432
    .line 1433
    iget-object v4, v14, Lpn3;->k:Lwc;

    .line 1434
    .line 1435
    invoke-virtual {v4}, Lwc;->a()Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v4

    .line 1439
    check-cast v4, Ljava/util/List;

    .line 1440
    .line 1441
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    if-eqz v0, :cond_45

    .line 1446
    .line 1447
    iget v0, v14, Lpn3;->j:I

    .line 1448
    .line 1449
    const/16 v20, 0x1

    .line 1450
    .line 1451
    add-int/lit8 v0, v0, 0x1

    .line 1452
    .line 1453
    iput v0, v14, Lpn3;->j:I

    .line 1454
    .line 1455
    invoke-interface {v3, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    goto :goto_31

    .line 1459
    :cond_45
    new-instance v0, Ljava/lang/AssertionError;

    .line 1460
    .line 1461
    const-string v1, "New Collection violated the Collection spec"

    .line 1462
    .line 1463
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 1464
    .line 1465
    .line 1466
    throw v0

    .line 1467
    :cond_46
    const/16 v20, 0x1

    .line 1468
    .line 1469
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1470
    .line 1471
    .line 1472
    move-result v0

    .line 1473
    if-eqz v0, :cond_47

    .line 1474
    .line 1475
    iget v0, v14, Lpn3;->j:I

    .line 1476
    .line 1477
    add-int/lit8 v0, v0, 0x1

    .line 1478
    .line 1479
    iput v0, v14, Lpn3;->j:I

    .line 1480
    .line 1481
    :cond_47
    :goto_31
    move-object/from16 v0, v29

    .line 1482
    .line 1483
    move-wide/from16 v3, v30

    .line 1484
    .line 1485
    goto :goto_2f

    .line 1486
    :goto_32
    add-int/lit8 v8, v8, 0x1

    .line 1487
    .line 1488
    move-object v3, v13

    .line 1489
    move-object/from16 v4, v18

    .line 1490
    .line 1491
    move-wide/from16 v12, v25

    .line 1492
    .line 1493
    move-object/from16 v0, v29

    .line 1494
    .line 1495
    const/4 v6, 0x0

    .line 1496
    goto/16 :goto_2c

    .line 1497
    .line 1498
    :cond_48
    move-object/from16 v29, v0

    .line 1499
    .line 1500
    move-object v13, v3

    .line 1501
    move-object/from16 v18, v4

    .line 1502
    .line 1503
    iget-object v0, v14, Lem3;->g:Ljava/util/Collection;

    .line 1504
    .line 1505
    if-nez v0, :cond_49

    .line 1506
    .line 1507
    invoke-virtual {v14}, Lem3;->a()Ljava/util/Collection;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    iput-object v0, v14, Lem3;->g:Ljava/util/Collection;

    .line 1512
    .line 1513
    :cond_49
    invoke-static {v0}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    const/4 v3, 0x0

    .line 1518
    :goto_33
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 1519
    .line 1520
    .line 1521
    move-result v4

    .line 1522
    if-ge v3, v4, :cond_4a

    .line 1523
    .line 1524
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v4

    .line 1528
    check-cast v4, Ljava/lang/Integer;

    .line 1529
    .line 1530
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1531
    .line 1532
    .line 1533
    move-result v4

    .line 1534
    aget v6, v18, v4

    .line 1535
    .line 1536
    const/16 v20, 0x1

    .line 1537
    .line 1538
    add-int/lit8 v6, v6, 0x1

    .line 1539
    .line 1540
    aput v6, v18, v4

    .line 1541
    .line 1542
    aget-object v8, v13, v4

    .line 1543
    .line 1544
    aget-wide v14, v8, v6

    .line 1545
    .line 1546
    aput-wide v14, v5, v4

    .line 1547
    .line 1548
    invoke-static {v2, v5}, Lxi4;->d(Ljava/util/ArrayList;[J)V

    .line 1549
    .line 1550
    .line 1551
    add-int/lit8 v3, v3, 0x1

    .line 1552
    .line 1553
    goto :goto_33

    .line 1554
    :cond_4a
    const/4 v0, 0x0

    .line 1555
    :goto_34
    const/4 v14, 0x2

    .line 1556
    if-ge v0, v14, :cond_4c

    .line 1557
    .line 1558
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v3

    .line 1562
    if-eqz v3, :cond_4b

    .line 1563
    .line 1564
    aget-wide v3, v5, v0

    .line 1565
    .line 1566
    add-long/2addr v3, v3

    .line 1567
    aput-wide v3, v5, v0

    .line 1568
    .line 1569
    :cond_4b
    add-int/lit8 v0, v0, 0x1

    .line 1570
    .line 1571
    goto :goto_34

    .line 1572
    :cond_4c
    invoke-static {v2, v5}, Lxi4;->d(Ljava/util/ArrayList;[J)V

    .line 1573
    .line 1574
    .line 1575
    const-string v0, "initialCapacity"

    .line 1576
    .line 1577
    const/4 v8, 0x4

    .line 1578
    invoke-static {v0, v8}, Lob1;->z(Ljava/lang/String;I)V

    .line 1579
    .line 1580
    .line 1581
    new-array v0, v8, [Ljava/lang/Object;

    .line 1582
    .line 1583
    const/4 v3, 0x0

    .line 1584
    const/4 v4, 0x0

    .line 1585
    :goto_35
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1586
    .line 1587
    .line 1588
    move-result v5

    .line 1589
    if-ge v3, v5, :cond_4f

    .line 1590
    .line 1591
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v5

    .line 1595
    check-cast v5, Lum3;

    .line 1596
    .line 1597
    if-nez v5, :cond_4d

    .line 1598
    .line 1599
    sget-object v5, Lsn3;->j:Lsn3;

    .line 1600
    .line 1601
    goto :goto_36

    .line 1602
    :cond_4d
    invoke-virtual {v5}, Lum3;->f()Lsn3;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v5

    .line 1606
    :goto_36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1607
    .line 1608
    .line 1609
    array-length v6, v0

    .line 1610
    add-int/lit8 v8, v4, 0x1

    .line 1611
    .line 1612
    invoke-static {v6, v8}, Lrm3;->d(II)I

    .line 1613
    .line 1614
    .line 1615
    move-result v10

    .line 1616
    if-gt v10, v6, :cond_4e

    .line 1617
    .line 1618
    goto :goto_37

    .line 1619
    :cond_4e
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    :goto_37
    aput-object v5, v0, v4

    .line 1624
    .line 1625
    add-int/lit8 v3, v3, 0x1

    .line 1626
    .line 1627
    move v4, v8

    .line 1628
    goto :goto_35

    .line 1629
    :cond_4f
    invoke-static {v0, v4}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    const/4 v14, 0x2

    .line 1634
    new-array v2, v14, [Lnj4;

    .line 1635
    .line 1636
    const/4 v8, 0x0

    .line 1637
    :goto_38
    if-ge v8, v14, :cond_53

    .line 1638
    .line 1639
    aget-object v3, v21, v8

    .line 1640
    .line 1641
    if-eqz v3, :cond_52

    .line 1642
    .line 1643
    iget-object v4, v3, Lmj4;->b:[I

    .line 1644
    .line 1645
    array-length v5, v4

    .line 1646
    if-nez v5, :cond_50

    .line 1647
    .line 1648
    goto :goto_3a

    .line 1649
    :cond_50
    const/4 v15, 0x1

    .line 1650
    if-ne v5, v15, :cond_51

    .line 1651
    .line 1652
    iget-object v3, v3, Lmj4;->a:Ld02;

    .line 1653
    .line 1654
    new-instance v5, Lxi4;

    .line 1655
    .line 1656
    const/16 v22, 0x0

    .line 1657
    .line 1658
    aget v4, v4, v22

    .line 1659
    .line 1660
    filled-new-array {v4}, [I

    .line 1661
    .line 1662
    .line 1663
    move-result-object v4

    .line 1664
    invoke-direct {v5, v3, v4}, Lxi4;-><init>(Ld02;[I)V

    .line 1665
    .line 1666
    .line 1667
    goto :goto_39

    .line 1668
    :cond_51
    iget-object v3, v3, Lmj4;->a:Ld02;

    .line 1669
    .line 1670
    invoke-virtual {v0, v8}, Lsn3;->get(I)Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v5

    .line 1674
    check-cast v5, Lxm3;

    .line 1675
    .line 1676
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    new-instance v6, Lxi4;

    .line 1680
    .line 1681
    invoke-direct {v6, v3, v4}, Lxi4;-><init>(Ld02;[I)V

    .line 1682
    .line 1683
    .line 1684
    invoke-static {v5}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 1685
    .line 1686
    .line 1687
    move-object v5, v6

    .line 1688
    :goto_39
    aput-object v5, v2, v8

    .line 1689
    .line 1690
    :cond_52
    :goto_3a
    add-int/lit8 v8, v8, 0x1

    .line 1691
    .line 1692
    const/4 v14, 0x2

    .line 1693
    goto :goto_38

    .line 1694
    :cond_53
    new-array v0, v14, [Ljc4;

    .line 1695
    .line 1696
    const/4 v8, 0x0

    .line 1697
    :goto_3b
    if-ge v8, v14, :cond_57

    .line 1698
    .line 1699
    iget-object v3, v7, Loj4;->a:[I

    .line 1700
    .line 1701
    aget v3, v3, v8

    .line 1702
    .line 1703
    iget-object v4, v1, Ldj4;->E:Landroid/util/SparseBooleanArray;

    .line 1704
    .line 1705
    invoke-virtual {v4, v8}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v4

    .line 1709
    if-nez v4, :cond_54

    .line 1710
    .line 1711
    iget-object v4, v1, Lr32;->v:Ldn3;

    .line 1712
    .line 1713
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v3

    .line 1717
    invoke-virtual {v4, v3}, Ltm3;->contains(Ljava/lang/Object;)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v3

    .line 1721
    if-eqz v3, :cond_55

    .line 1722
    .line 1723
    :cond_54
    const/4 v3, 0x0

    .line 1724
    goto :goto_3c

    .line 1725
    :cond_55
    iget-object v3, v7, Loj4;->a:[I

    .line 1726
    .line 1727
    aget v3, v3, v8

    .line 1728
    .line 1729
    const/4 v4, -0x2

    .line 1730
    if-eq v3, v4, :cond_56

    .line 1731
    .line 1732
    aget-object v3, v2, v8

    .line 1733
    .line 1734
    if-eqz v3, :cond_54

    .line 1735
    .line 1736
    :cond_56
    sget-object v3, Ljc4;->a:Ljc4;

    .line 1737
    .line 1738
    :goto_3c
    aput-object v3, v0, v8

    .line 1739
    .line 1740
    add-int/lit8 v8, v8, 0x1

    .line 1741
    .line 1742
    const/4 v14, 0x2

    .line 1743
    goto :goto_3b

    .line 1744
    :cond_57
    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v0

    .line 1748
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1749
    .line 1750
    check-cast v1, [Lnj4;

    .line 1751
    .line 1752
    array-length v2, v1

    .line 1753
    new-array v2, v2, [Ljava/util/List;

    .line 1754
    .line 1755
    const/4 v8, 0x0

    .line 1756
    :goto_3d
    array-length v3, v1

    .line 1757
    if-ge v8, v3, :cond_59

    .line 1758
    .line 1759
    aget-object v3, v1, v8

    .line 1760
    .line 1761
    if-eqz v3, :cond_58

    .line 1762
    .line 1763
    invoke-static {v3}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v3

    .line 1767
    goto :goto_3e

    .line 1768
    :cond_58
    sget-object v3, Lsn3;->j:Lsn3;

    .line 1769
    .line 1770
    :goto_3e
    aput-object v3, v2, v8

    .line 1771
    .line 1772
    add-int/lit8 v8, v8, 0x1

    .line 1773
    .line 1774
    goto :goto_3d

    .line 1775
    :cond_59
    new-instance v1, Lum3;

    .line 1776
    .line 1777
    const/4 v8, 0x4

    .line 1778
    invoke-direct {v1, v8}, Lrm3;-><init>(I)V

    .line 1779
    .line 1780
    .line 1781
    const/4 v8, 0x0

    .line 1782
    :goto_3f
    const/4 v14, 0x2

    .line 1783
    if-ge v8, v14, :cond_65

    .line 1784
    .line 1785
    aget-object v3, v9, v8

    .line 1786
    .line 1787
    aget-object v4, v2, v8

    .line 1788
    .line 1789
    const/4 v5, 0x0

    .line 1790
    :goto_40
    iget v6, v3, Lri4;->a:I

    .line 1791
    .line 1792
    if-ge v5, v6, :cond_64

    .line 1793
    .line 1794
    invoke-virtual {v3, v5}, Lri4;->a(I)Ld02;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v6

    .line 1798
    aget-object v10, v9, v8

    .line 1799
    .line 1800
    invoke-virtual {v10, v5}, Lri4;->a(I)Ld02;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v10

    .line 1804
    iget v10, v10, Ld02;->a:I

    .line 1805
    .line 1806
    new-array v12, v10, [I

    .line 1807
    .line 1808
    const/4 v13, 0x0

    .line 1809
    const/4 v15, 0x0

    .line 1810
    :goto_41
    if-ge v13, v10, :cond_5b

    .line 1811
    .line 1812
    aget-object v18, v11, v8

    .line 1813
    .line 1814
    aget-object v18, v18, v5

    .line 1815
    .line 1816
    aget v18, v18, v13

    .line 1817
    .line 1818
    and-int/lit8 v14, v18, 0x7

    .line 1819
    .line 1820
    move-object/from16 v18, v2

    .line 1821
    .line 1822
    const/4 v2, 0x4

    .line 1823
    if-ne v14, v2, :cond_5a

    .line 1824
    .line 1825
    add-int/lit8 v14, v15, 0x1

    .line 1826
    .line 1827
    aput v13, v12, v15

    .line 1828
    .line 1829
    move v15, v14

    .line 1830
    :cond_5a
    add-int/lit8 v13, v13, 0x1

    .line 1831
    .line 1832
    move-object/from16 v2, v18

    .line 1833
    .line 1834
    const/4 v14, 0x2

    .line 1835
    goto :goto_41

    .line 1836
    :cond_5b
    move-object/from16 v18, v2

    .line 1837
    .line 1838
    const/4 v2, 0x4

    .line 1839
    invoke-static {v12, v15}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1840
    .line 1841
    .line 1842
    move-result-object v10

    .line 1843
    const/16 v12, 0x10

    .line 1844
    .line 1845
    move-object/from16 p1, v3

    .line 1846
    .line 1847
    move v15, v12

    .line 1848
    const/4 v2, 0x0

    .line 1849
    const/4 v12, 0x0

    .line 1850
    const/4 v13, 0x0

    .line 1851
    const/4 v14, 0x0

    .line 1852
    :goto_42
    array-length v3, v10

    .line 1853
    if-ge v12, v3, :cond_5d

    .line 1854
    .line 1855
    aget v3, v10, v12

    .line 1856
    .line 1857
    move/from16 v21, v3

    .line 1858
    .line 1859
    aget-object v3, v9, v8

    .line 1860
    .line 1861
    invoke-virtual {v3, v5}, Lri4;->a(I)Ld02;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v3

    .line 1865
    iget-object v3, v3, Ld02;->d:[Lph4;

    .line 1866
    .line 1867
    aget-object v3, v3, v21

    .line 1868
    .line 1869
    iget-object v3, v3, Lph4;->m:Ljava/lang/String;

    .line 1870
    .line 1871
    add-int/lit8 v21, v14, 0x1

    .line 1872
    .line 1873
    if-nez v14, :cond_5c

    .line 1874
    .line 1875
    move-object v2, v3

    .line 1876
    const/16 v20, 0x1

    .line 1877
    .line 1878
    goto :goto_43

    .line 1879
    :cond_5c
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1880
    .line 1881
    .line 1882
    move-result v3

    .line 1883
    const/16 v20, 0x1

    .line 1884
    .line 1885
    xor-int/lit8 v3, v3, 0x1

    .line 1886
    .line 1887
    or-int/2addr v3, v13

    .line 1888
    move v13, v3

    .line 1889
    :goto_43
    aget-object v3, v11, v8

    .line 1890
    .line 1891
    aget-object v3, v3, v5

    .line 1892
    .line 1893
    aget v3, v3, v12

    .line 1894
    .line 1895
    and-int/lit8 v3, v3, 0x18

    .line 1896
    .line 1897
    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    .line 1898
    .line 1899
    .line 1900
    move-result v15

    .line 1901
    add-int/lit8 v12, v12, 0x1

    .line 1902
    .line 1903
    move/from16 v14, v21

    .line 1904
    .line 1905
    goto :goto_42

    .line 1906
    :cond_5d
    const/16 v20, 0x1

    .line 1907
    .line 1908
    if-eqz v13, :cond_5e

    .line 1909
    .line 1910
    iget-object v2, v7, Loj4;->c:[I

    .line 1911
    .line 1912
    aget v2, v2, v8

    .line 1913
    .line 1914
    invoke-static {v15, v2}, Ljava/lang/Math;->min(II)I

    .line 1915
    .line 1916
    .line 1917
    move-result v15

    .line 1918
    :cond_5e
    if-eqz v15, :cond_5f

    .line 1919
    .line 1920
    move/from16 v15, v20

    .line 1921
    .line 1922
    goto :goto_44

    .line 1923
    :cond_5f
    const/4 v15, 0x0

    .line 1924
    :goto_44
    iget v2, v6, Ld02;->a:I

    .line 1925
    .line 1926
    new-array v3, v2, [I

    .line 1927
    .line 1928
    new-array v10, v2, [Z

    .line 1929
    .line 1930
    const/4 v12, 0x0

    .line 1931
    :goto_45
    if-ge v12, v2, :cond_63

    .line 1932
    .line 1933
    aget-object v13, v11, v8

    .line 1934
    .line 1935
    aget-object v13, v13, v5

    .line 1936
    .line 1937
    aget v13, v13, v12

    .line 1938
    .line 1939
    and-int/lit8 v13, v13, 0x7

    .line 1940
    .line 1941
    aput v13, v3, v12

    .line 1942
    .line 1943
    const/4 v13, 0x0

    .line 1944
    :goto_46
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1945
    .line 1946
    .line 1947
    move-result v14

    .line 1948
    if-ge v13, v14, :cond_62

    .line 1949
    .line 1950
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v14

    .line 1954
    check-cast v14, Lnj4;

    .line 1955
    .line 1956
    move/from16 v21, v2

    .line 1957
    .line 1958
    invoke-interface {v14}, Lnj4;->a()Ld02;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v2

    .line 1962
    invoke-virtual {v2, v6}, Ld02;->equals(Ljava/lang/Object;)Z

    .line 1963
    .line 1964
    .line 1965
    move-result v2

    .line 1966
    if-eqz v2, :cond_60

    .line 1967
    .line 1968
    invoke-interface {v14, v12}, Lnj4;->m0(I)I

    .line 1969
    .line 1970
    .line 1971
    move-result v2

    .line 1972
    const/4 v14, -0x1

    .line 1973
    if-eq v2, v14, :cond_61

    .line 1974
    .line 1975
    move/from16 v2, v20

    .line 1976
    .line 1977
    goto :goto_47

    .line 1978
    :cond_60
    const/4 v14, -0x1

    .line 1979
    :cond_61
    add-int/lit8 v13, v13, 0x1

    .line 1980
    .line 1981
    move/from16 v2, v21

    .line 1982
    .line 1983
    goto :goto_46

    .line 1984
    :cond_62
    move/from16 v21, v2

    .line 1985
    .line 1986
    const/4 v14, -0x1

    .line 1987
    const/4 v2, 0x0

    .line 1988
    :goto_47
    aput-boolean v2, v10, v12

    .line 1989
    .line 1990
    add-int/lit8 v12, v12, 0x1

    .line 1991
    .line 1992
    move/from16 v2, v21

    .line 1993
    .line 1994
    goto :goto_45

    .line 1995
    :cond_63
    const/4 v14, -0x1

    .line 1996
    new-instance v2, Lc42;

    .line 1997
    .line 1998
    invoke-direct {v2, v6, v15, v3, v10}, Lc42;-><init>(Ld02;Z[I[Z)V

    .line 1999
    .line 2000
    .line 2001
    invoke-virtual {v1, v2}, Lrm3;->a(Ljava/lang/Object;)V

    .line 2002
    .line 2003
    .line 2004
    add-int/lit8 v5, v5, 0x1

    .line 2005
    .line 2006
    move-object/from16 v3, p1

    .line 2007
    .line 2008
    move-object/from16 v2, v18

    .line 2009
    .line 2010
    const/4 v14, 0x2

    .line 2011
    goto/16 :goto_40

    .line 2012
    .line 2013
    :cond_64
    move-object/from16 v18, v2

    .line 2014
    .line 2015
    const/4 v14, -0x1

    .line 2016
    const/16 v20, 0x1

    .line 2017
    .line 2018
    add-int/lit8 v8, v8, 0x1

    .line 2019
    .line 2020
    goto/16 :goto_3f

    .line 2021
    .line 2022
    :cond_65
    const/16 v20, 0x1

    .line 2023
    .line 2024
    iget-object v2, v7, Loj4;->d:Lri4;

    .line 2025
    .line 2026
    const/4 v8, 0x0

    .line 2027
    :goto_48
    iget v3, v2, Lri4;->a:I

    .line 2028
    .line 2029
    if-ge v8, v3, :cond_66

    .line 2030
    .line 2031
    invoke-virtual {v2, v8}, Lri4;->a(I)Ld02;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v3

    .line 2035
    iget v4, v3, Ld02;->a:I

    .line 2036
    .line 2037
    new-array v5, v4, [I

    .line 2038
    .line 2039
    const/4 v14, 0x0

    .line 2040
    invoke-static {v5, v14}, Ljava/util/Arrays;->fill([II)V

    .line 2041
    .line 2042
    .line 2043
    new-array v4, v4, [Z

    .line 2044
    .line 2045
    new-instance v6, Lc42;

    .line 2046
    .line 2047
    invoke-direct {v6, v3, v14, v5, v4}, Lc42;-><init>(Ld02;Z[I[Z)V

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v1, v6}, Lrm3;->a(Ljava/lang/Object;)V

    .line 2051
    .line 2052
    .line 2053
    add-int/lit8 v8, v8, 0x1

    .line 2054
    .line 2055
    goto :goto_48

    .line 2056
    :cond_66
    const/4 v14, 0x0

    .line 2057
    new-instance v2, Lo42;

    .line 2058
    .line 2059
    invoke-virtual {v1}, Lum3;->f()Lsn3;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v1

    .line 2063
    invoke-direct {v2, v1}, Lo42;-><init>(Lsn3;)V

    .line 2064
    .line 2065
    .line 2066
    new-instance v1, Lpj4;

    .line 2067
    .line 2068
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2069
    .line 2070
    check-cast v3, [Ljc4;

    .line 2071
    .line 2072
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2073
    .line 2074
    check-cast v0, [Lnj4;

    .line 2075
    .line 2076
    invoke-direct {v1, v3, v0, v2, v7}, Lpj4;-><init>([Ljc4;[Lnj4;Lo42;Loj4;)V

    .line 2077
    .line 2078
    .line 2079
    iget-object v0, v1, Lpj4;->h:Ljava/lang/Object;

    .line 2080
    .line 2081
    check-cast v0, [Lnj4;

    .line 2082
    .line 2083
    move v8, v14

    .line 2084
    :goto_49
    iget v2, v1, Lpj4;->f:I

    .line 2085
    .line 2086
    if-ge v8, v2, :cond_6a

    .line 2087
    .line 2088
    invoke-virtual {v1, v8}, Lpj4;->a(I)Z

    .line 2089
    .line 2090
    .line 2091
    move-result v2

    .line 2092
    if-eqz v2, :cond_68

    .line 2093
    .line 2094
    aget-object v2, v0, v8

    .line 2095
    .line 2096
    if-nez v2, :cond_67

    .line 2097
    .line 2098
    aget-object v2, v24, v8

    .line 2099
    .line 2100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2101
    .line 2102
    .line 2103
    move v15, v14

    .line 2104
    goto :goto_4a

    .line 2105
    :cond_67
    move/from16 v15, v20

    .line 2106
    .line 2107
    :goto_4a
    invoke-static {v15}, Lzt0;->b0(Z)V

    .line 2108
    .line 2109
    .line 2110
    goto :goto_4c

    .line 2111
    :cond_68
    aget-object v2, v0, v8

    .line 2112
    .line 2113
    if-nez v2, :cond_69

    .line 2114
    .line 2115
    move/from16 v15, v20

    .line 2116
    .line 2117
    goto :goto_4b

    .line 2118
    :cond_69
    move v15, v14

    .line 2119
    :goto_4b
    invoke-static {v15}, Lzt0;->b0(Z)V

    .line 2120
    .line 2121
    .line 2122
    :goto_4c
    add-int/lit8 v8, v8, 0x1

    .line 2123
    .line 2124
    goto :goto_49

    .line 2125
    :cond_6a
    array-length v2, v0

    .line 2126
    move v13, v14

    .line 2127
    :goto_4d
    if-ge v13, v2, :cond_6b

    .line 2128
    .line 2129
    aget-object v3, v0, v13

    .line 2130
    .line 2131
    add-int/lit8 v13, v13, 0x1

    .line 2132
    .line 2133
    goto :goto_4d

    .line 2134
    :cond_6b
    return-object v1

    .line 2135
    :catchall_0
    move-exception v0

    .line 2136
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2137
    throw v0
.end method

.method public final g(Lpj4;JZ[Z)J
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p1, Lpj4;->f:I

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    if-nez p4, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lpb4;->o:Lpj4;

    .line 11
    .line 12
    invoke-virtual {p1, v2, v1}, Lpj4;->c(Lpj4;I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v3, v0

    .line 20
    :goto_1
    iget-object v2, p0, Lpb4;->i:[Z

    .line 21
    .line 22
    aput-boolean v3, v2, v1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v1, v0

    .line 28
    :goto_2
    const/4 v2, 0x2

    .line 29
    iget-object v4, p0, Lpb4;->j:[Lkg4;

    .line 30
    .line 31
    if-ge v1, v2, :cond_2

    .line 32
    .line 33
    aget-object v2, v4, v1

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-virtual {p0}, Lpb4;->l()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lpb4;->o:Lpj4;

    .line 45
    .line 46
    iget-object v1, p0, Lpb4;->m:Lpb4;

    .line 47
    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    move v1, v0

    .line 51
    :goto_3
    iget-object v5, p0, Lpb4;->o:Lpj4;

    .line 52
    .line 53
    iget v6, v5, Lpj4;->f:I

    .line 54
    .line 55
    if-ge v1, v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5, v1}, Lpj4;->a(I)Z

    .line 58
    .line 59
    .line 60
    iget-object v5, p0, Lpb4;->o:Lpj4;

    .line 61
    .line 62
    iget-object v5, v5, Lpj4;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, [Lnj4;

    .line 65
    .line 66
    aget-object v5, v5, v1

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v1, p1, Lpj4;->h:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v6, v1

    .line 74
    check-cast v6, [Lnj4;

    .line 75
    .line 76
    iget-object v5, p0, Lpb4;->a:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v7, p0, Lpb4;->i:[Z

    .line 79
    .line 80
    iget-object v8, p0, Lpb4;->c:[Lli4;

    .line 81
    .line 82
    move-wide v10, p2

    .line 83
    move-object/from16 v9, p5

    .line 84
    .line 85
    invoke-interface/range {v5 .. v11}, Ljh4;->m([Lnj4;[Z[Lli4;[ZJ)J

    .line 86
    .line 87
    .line 88
    move-result-wide p2

    .line 89
    move v1, v0

    .line 90
    :goto_4
    if-ge v1, v2, :cond_4

    .line 91
    .line 92
    aget-object v5, v4, v1

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    iput-boolean v0, p0, Lpb4;->f:Z

    .line 101
    .line 102
    move v1, v0

    .line 103
    :goto_5
    if-ge v1, v2, :cond_7

    .line 104
    .line 105
    aget-object v5, v8, v1

    .line 106
    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Lpj4;->a(I)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-static {v5}, Lzt0;->b0(Z)V

    .line 114
    .line 115
    .line 116
    aget-object v5, v4, v1

    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iput-boolean v3, p0, Lpb4;->f:Z

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_5
    aget-object v5, v6, v1

    .line 125
    .line 126
    if-nez v5, :cond_6

    .line 127
    .line 128
    move v5, v3

    .line 129
    goto :goto_6

    .line 130
    :cond_6
    move v5, v0

    .line 131
    :goto_6
    invoke-static {v5}, Lzt0;->b0(Z)V

    .line 132
    .line 133
    .line 134
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    return-wide p2
.end method

.method public final h()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lpb4;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpb4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    :try_start_0
    instance-of v1, v0, Lrg4;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    iget-object v2, p0, Lpb4;->l:Luu0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    check-cast v0, Lrg4;

    .line 13
    .line 14
    iget-object v0, v0, Lrg4;->f:Ldh4;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Luu0;->g(Ljh4;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, v0}, Luu0;->g(Ljh4;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_0
    const-string v1, "MediaPeriodHolder"

    .line 27
    .line 28
    const-string v2, "Period release failed."

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, La30;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final i()Lpb4;
    .locals 1

    .line 1
    iget-object v0, p0, Lpb4;->m:Lpb4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lri4;
    .locals 1

    .line 1
    iget-object v0, p0, Lpb4;->n:Lri4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lpj4;
    .locals 1

    .line 1
    iget-object v0, p0, Lpb4;->o:Lpj4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lpb4;->m:Lpb4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lpb4;->o:Lpj4;

    .line 7
    .line 8
    iget v2, v1, Lpj4;->f:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lpj4;->a(I)Z

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lpb4;->o:Lpj4;

    .line 16
    .line 17
    iget-object v1, v1, Lpj4;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, [Lnj4;

    .line 20
    .line 21
    aget-object v1, v1, v0

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method
