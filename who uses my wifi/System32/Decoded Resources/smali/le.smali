.class public abstract Lle;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:Ljava/util/ArrayList;


# virtual methods
.method public final a(Ll60;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lle;->c(Lq10;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lle;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final b(Lxs;I)V
    .locals 5

    .line 1
    iget v0, p1, Lxs;->h:F

    .line 2
    .line 3
    iget-object v1, p0, Lle;->i:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-le v2, p2, :cond_e

    .line 10
    .line 11
    if-ltz p2, :cond_e

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lq10;

    .line 18
    .line 19
    move-object v1, p2

    .line 20
    check-cast v1, Ll60;

    .line 21
    .line 22
    iget-object v2, v1, Ll60;->o:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget v3, v1, Ll60;->s:F

    .line 32
    .line 33
    cmpg-float v3, v0, v3

    .line 34
    .line 35
    if-gez v3, :cond_1

    .line 36
    .line 37
    iput v0, v1, Ll60;->s:F

    .line 38
    .line 39
    :cond_1
    iget v3, v1, Ll60;->r:F

    .line 40
    .line 41
    cmpl-float v3, v0, v3

    .line 42
    .line 43
    if-lez v3, :cond_2

    .line 44
    .line 45
    iput v0, v1, Ll60;->r:F

    .line 46
    .line 47
    :cond_2
    iget v3, p1, Lxs;->f:F

    .line 48
    .line 49
    iget v4, v1, Ll60;->q:F

    .line 50
    .line 51
    cmpg-float v4, v3, v4

    .line 52
    .line 53
    if-gez v4, :cond_3

    .line 54
    .line 55
    iput v3, v1, Ll60;->q:F

    .line 56
    .line 57
    :cond_3
    iget v4, v1, Ll60;->p:F

    .line 58
    .line 59
    cmpl-float v4, v3, v4

    .line 60
    .line 61
    if-lez v4, :cond_4

    .line 62
    .line 63
    iput v3, v1, Ll60;->p:F

    .line 64
    .line 65
    :cond_4
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    check-cast p2, Ll60;

    .line 73
    .line 74
    iget p2, p2, Ll60;->d:I

    .line 75
    .line 76
    iget v1, p0, Lle;->a:F

    .line 77
    .line 78
    iget p1, p1, Lxs;->f:F

    .line 79
    .line 80
    cmpg-float v1, v1, p1

    .line 81
    .line 82
    if-gez v1, :cond_6

    .line 83
    .line 84
    iput p1, p0, Lle;->a:F

    .line 85
    .line 86
    :cond_6
    iget v1, p0, Lle;->b:F

    .line 87
    .line 88
    cmpl-float v1, v1, p1

    .line 89
    .line 90
    if-lez v1, :cond_7

    .line 91
    .line 92
    iput p1, p0, Lle;->b:F

    .line 93
    .line 94
    :cond_7
    iget v1, p0, Lle;->c:F

    .line 95
    .line 96
    cmpg-float v1, v1, v0

    .line 97
    .line 98
    if-gez v1, :cond_8

    .line 99
    .line 100
    iput v0, p0, Lle;->c:F

    .line 101
    .line 102
    :cond_8
    iget v1, p0, Lle;->d:F

    .line 103
    .line 104
    cmpl-float v1, v1, v0

    .line 105
    .line 106
    if-lez v1, :cond_9

    .line 107
    .line 108
    iput v0, p0, Lle;->d:F

    .line 109
    .line 110
    :cond_9
    const/4 v0, 0x1

    .line 111
    if-ne p2, v0, :cond_b

    .line 112
    .line 113
    iget p2, p0, Lle;->e:F

    .line 114
    .line 115
    cmpg-float p2, p2, p1

    .line 116
    .line 117
    if-gez p2, :cond_a

    .line 118
    .line 119
    iput p1, p0, Lle;->e:F

    .line 120
    .line 121
    :cond_a
    iget p2, p0, Lle;->f:F

    .line 122
    .line 123
    cmpl-float p2, p2, p1

    .line 124
    .line 125
    if-lez p2, :cond_d

    .line 126
    .line 127
    iput p1, p0, Lle;->f:F

    .line 128
    .line 129
    return-void

    .line 130
    :cond_b
    iget p2, p0, Lle;->g:F

    .line 131
    .line 132
    cmpg-float p2, p2, p1

    .line 133
    .line 134
    if-gez p2, :cond_c

    .line 135
    .line 136
    iput p1, p0, Lle;->g:F

    .line 137
    .line 138
    :cond_c
    iget p2, p0, Lle;->h:F

    .line 139
    .line 140
    cmpl-float p2, p2, p1

    .line 141
    .line 142
    if-lez p2, :cond_d

    .line 143
    .line 144
    iput p1, p0, Lle;->h:F

    .line 145
    .line 146
    :cond_d
    :goto_0
    return-void

    .line 147
    :cond_e
    const-string p1, "addEntry"

    .line 148
    .line 149
    const-string p2, "Cannot add Entry because dataSetIndex too high or too low."

    .line 150
    .line 151
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final c(Lq10;)V
    .locals 5

    .line 1
    iget v0, p0, Lle;->a:F

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    check-cast v1, Ll60;

    .line 5
    .line 6
    iget v2, v1, Ll60;->p:F

    .line 7
    .line 8
    cmpg-float v0, v0, v2

    .line 9
    .line 10
    if-gez v0, :cond_0

    .line 11
    .line 12
    iput v2, p0, Lle;->a:F

    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lle;->b:F

    .line 15
    .line 16
    iget v3, v1, Ll60;->q:F

    .line 17
    .line 18
    cmpl-float v0, v0, v3

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    iput v3, p0, Lle;->b:F

    .line 23
    .line 24
    :cond_1
    iget v0, p0, Lle;->c:F

    .line 25
    .line 26
    iget v4, v1, Ll60;->r:F

    .line 27
    .line 28
    cmpg-float v0, v0, v4

    .line 29
    .line 30
    if-gez v0, :cond_2

    .line 31
    .line 32
    iput v4, p0, Lle;->c:F

    .line 33
    .line 34
    :cond_2
    iget v0, p0, Lle;->d:F

    .line 35
    .line 36
    iget v1, v1, Ll60;->s:F

    .line 37
    .line 38
    cmpl-float v0, v0, v1

    .line 39
    .line 40
    if-lez v0, :cond_3

    .line 41
    .line 42
    iput v1, p0, Lle;->d:F

    .line 43
    .line 44
    :cond_3
    check-cast p1, Ll60;

    .line 45
    .line 46
    iget p1, p1, Ll60;->d:I

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-ne p1, v0, :cond_5

    .line 50
    .line 51
    iget p1, p0, Lle;->e:F

    .line 52
    .line 53
    cmpg-float p1, p1, v2

    .line 54
    .line 55
    if-gez p1, :cond_4

    .line 56
    .line 57
    iput v2, p0, Lle;->e:F

    .line 58
    .line 59
    :cond_4
    iget p1, p0, Lle;->f:F

    .line 60
    .line 61
    cmpl-float p1, p1, v3

    .line 62
    .line 63
    if-lez p1, :cond_7

    .line 64
    .line 65
    iput v3, p0, Lle;->f:F

    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    iget p1, p0, Lle;->g:F

    .line 69
    .line 70
    cmpg-float p1, p1, v2

    .line 71
    .line 72
    if-gez p1, :cond_6

    .line 73
    .line 74
    iput v2, p0, Lle;->g:F

    .line 75
    .line 76
    :cond_6
    iget p1, p0, Lle;->h:F

    .line 77
    .line 78
    cmpl-float p1, p1, v3

    .line 79
    .line 80
    if-lez p1, :cond_7

    .line 81
    .line 82
    iput v3, p0, Lle;->h:F

    .line 83
    .line 84
    :cond_7
    return-void
.end method

.method public final d(I)Lq10;
    .locals 2

    .line 1
    iget-object v0, p0, Lle;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lt p1, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lq10;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public final e()I
    .locals 5

    .line 1
    iget-object v0, p0, Lle;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    check-cast v4, Lq10;

    .line 18
    .line 19
    check-cast v4, Ll60;

    .line 20
    .line 21
    iget-object v4, v4, Ll60;->o:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    add-int/2addr v2, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2
.end method

.method public final f(I)F
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, -0x800001

    .line 3
    .line 4
    .line 5
    if-ne p1, v0, :cond_1

    .line 6
    .line 7
    iget p1, p0, Lle;->e:F

    .line 8
    .line 9
    cmpl-float v0, p1, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lle;->g:F

    .line 14
    .line 15
    :cond_0
    return p1

    .line 16
    :cond_1
    iget p1, p0, Lle;->g:F

    .line 17
    .line 18
    cmpl-float v0, p1, v1

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget p1, p0, Lle;->e:F

    .line 23
    .line 24
    :cond_2
    return p1
.end method

.method public final g(I)F
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    .line 4
    .line 5
    if-ne p1, v0, :cond_1

    .line 6
    .line 7
    iget p1, p0, Lle;->f:F

    .line 8
    .line 9
    cmpl-float v0, p1, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lle;->h:F

    .line 14
    .line 15
    :cond_0
    return p1

    .line 16
    :cond_1
    iget p1, p0, Lle;->h:F

    .line 17
    .line 18
    cmpl-float v0, p1, v1

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget p1, p0, Lle;->f:F

    .line 23
    .line 24
    :cond_2
    return p1
.end method
