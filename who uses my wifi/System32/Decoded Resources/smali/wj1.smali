.class public final Lwj1;
.super Lck1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public n:Lrf1;

.field public o:Lcj1;


# virtual methods
.method public final a(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lck1;->a(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lwj1;->n:Lrf1;

    .line 8
    .line 9
    iput-object p1, p0, Lwj1;->o:Lcj1;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final b(Lkz2;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lkz2;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v2, v0, v1

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    if-ne v2, v3, :cond_2

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    aget-byte v0, v0, v2

    .line 11
    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    shr-int/2addr v0, v2

    .line 16
    const/4 v3, 0x6

    .line 17
    if-eq v0, v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x7

    .line 20
    if-ne v0, v3, :cond_1

    .line 21
    .line 22
    move v0, v3

    .line 23
    :cond_0
    invoke-virtual {p1, v2}, Lkz2;->G(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lkz2;->o()J

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {v0, p1}, Li41;->O(ILkz2;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v1}, Lkz2;->E(I)V

    .line 34
    .line 35
    .line 36
    int-to-long v0, v0

    .line 37
    return-wide v0

    .line 38
    :cond_2
    const-wide/16 v0, -0x1

    .line 39
    .line 40
    return-wide v0
.end method

.method public final c(Lkz2;JLl92;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v1, Lkz2;->a:[B

    .line 8
    .line 9
    iget-object v4, v0, Lwj1;->n:Lrf1;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    new-instance v4, Lrf1;

    .line 15
    .line 16
    const/16 v6, 0x11

    .line 17
    .line 18
    invoke-direct {v4, v6, v3}, Lrf1;-><init>(I[B)V

    .line 19
    .line 20
    .line 21
    iput-object v4, v0, Lwj1;->n:Lrf1;

    .line 22
    .line 23
    const/16 v6, 0x9

    .line 24
    .line 25
    iget v1, v1, Lkz2;->c:I

    .line 26
    .line 27
    invoke-static {v3, v6, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v4, v1, v3}, Lrf1;->b([BLwn1;)Lph4;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v3, Lgg4;

    .line 37
    .line 38
    invoke-direct {v3, v1}, Lgg4;-><init>(Lph4;)V

    .line 39
    .line 40
    .line 41
    const-string v1, "audio/ogg"

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Lgg4;->d(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lph4;

    .line 47
    .line 48
    invoke-direct {v1, v3}, Lph4;-><init>(Lgg4;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, v2, Ll92;->f:Ljava/lang/Object;

    .line 52
    .line 53
    return v5

    .line 54
    :cond_0
    const/4 v6, 0x0

    .line 55
    aget-byte v3, v3, v6

    .line 56
    .line 57
    and-int/lit8 v7, v3, 0x7f

    .line 58
    .line 59
    const/4 v8, 0x3

    .line 60
    if-ne v7, v8, :cond_1

    .line 61
    .line 62
    invoke-static {v1}, Lob1;->B(Lkz2;)Lvq2;

    .line 63
    .line 64
    .line 65
    move-result-object v19

    .line 66
    iget-object v1, v4, Lrf1;->l:Lwn1;

    .line 67
    .line 68
    new-instance v9, Lrf1;

    .line 69
    .line 70
    iget v10, v4, Lrf1;->a:I

    .line 71
    .line 72
    iget v11, v4, Lrf1;->b:I

    .line 73
    .line 74
    iget v12, v4, Lrf1;->c:I

    .line 75
    .line 76
    iget v13, v4, Lrf1;->d:I

    .line 77
    .line 78
    iget v14, v4, Lrf1;->e:I

    .line 79
    .line 80
    iget v15, v4, Lrf1;->g:I

    .line 81
    .line 82
    iget v2, v4, Lrf1;->h:I

    .line 83
    .line 84
    iget-wide v3, v4, Lrf1;->j:J

    .line 85
    .line 86
    move-object/from16 v20, v1

    .line 87
    .line 88
    move/from16 v16, v2

    .line 89
    .line 90
    move-wide/from16 v17, v3

    .line 91
    .line 92
    invoke-direct/range {v9 .. v20}, Lrf1;-><init>(IIIIIIIJLvq2;Lwn1;)V

    .line 93
    .line 94
    .line 95
    move-object/from16 v1, v19

    .line 96
    .line 97
    iput-object v9, v0, Lwj1;->n:Lrf1;

    .line 98
    .line 99
    new-instance v2, Lcj1;

    .line 100
    .line 101
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v9, v2, Lcj1;->h:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v1, v2, Lcj1;->i:Ljava/lang/Object;

    .line 107
    .line 108
    const-wide/16 v3, -0x1

    .line 109
    .line 110
    iput-wide v3, v2, Lcj1;->f:J

    .line 111
    .line 112
    iput-wide v3, v2, Lcj1;->g:J

    .line 113
    .line 114
    iput-object v2, v0, Lwj1;->o:Lcj1;

    .line 115
    .line 116
    return v5

    .line 117
    :cond_1
    const/4 v1, -0x1

    .line 118
    if-ne v3, v1, :cond_3

    .line 119
    .line 120
    iget-object v1, v0, Lwj1;->o:Lcj1;

    .line 121
    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    move-wide/from16 v3, p2

    .line 125
    .line 126
    iput-wide v3, v1, Lcj1;->f:J

    .line 127
    .line 128
    iput-object v1, v2, Ll92;->g:Ljava/lang/Object;

    .line 129
    .line 130
    :cond_2
    iget-object v1, v2, Ll92;->f:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lph4;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    return v6

    .line 138
    :cond_3
    return v5
.end method
