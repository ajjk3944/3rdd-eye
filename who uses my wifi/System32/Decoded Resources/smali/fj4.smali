.class public final Lfj4;
.super Ljj4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final j:I

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:Z


# direct methods
.method public constructor <init>(ILd02;ILdj4;ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ljj4;-><init>(ILd02;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p5, p1}, Lkg4;->I(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iput-boolean p2, p0, Lfj4;->k:Z

    .line 10
    .line 11
    iget-object p2, p0, Ljj4;->i:Lph4;

    .line 12
    .line 13
    iget p2, p2, Lph4;->e:I

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p3, p4, Lr32;->r:Lxm3;

    .line 19
    .line 20
    and-int/lit8 v0, p2, 0x1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq v1, v0, :cond_0

    .line 24
    .line 25
    move v0, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v1

    .line 28
    :goto_0
    iput-boolean v0, p0, Lfj4;->l:Z

    .line 29
    .line 30
    and-int/lit8 p2, p2, 0x2

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    move p2, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move p2, p1

    .line 37
    :goto_1
    iput-boolean p2, p0, Lfj4;->m:Z

    .line 38
    .line 39
    if-eqz p7, :cond_2

    .line 40
    .line 41
    invoke-static {p7}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_3

    .line 51
    .line 52
    const-string p2, ""

    .line 53
    .line 54
    invoke-static {p2}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object p2, p3

    .line 60
    :goto_2
    move v0, p1

    .line 61
    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const v3, 0x7fffffff

    .line 66
    .line 67
    .line 68
    if-ge v0, v2, :cond_5

    .line 69
    .line 70
    iget-object v2, p0, Ljj4;->i:Lph4;

    .line 71
    .line 72
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v2, v4, p1}, Llj4;->d(Lph4;Ljava/lang/String;Z)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-lez v2, :cond_4

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move v2, p1

    .line 89
    move v0, v3

    .line 90
    :goto_4
    iput v0, p0, Lfj4;->n:I

    .line 91
    .line 92
    iput v2, p0, Lfj4;->o:I

    .line 93
    .line 94
    const/16 p2, 0x440

    .line 95
    .line 96
    if-eqz p7, :cond_6

    .line 97
    .line 98
    move p7, p2

    .line 99
    goto :goto_5

    .line 100
    :cond_6
    move p7, p1

    .line 101
    :goto_5
    iget-object v0, p0, Ljj4;->i:Lph4;

    .line 102
    .line 103
    iget v0, v0, Lph4;->f:I

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    if-ne v0, p7, :cond_7

    .line 108
    .line 109
    move p7, v3

    .line 110
    goto :goto_6

    .line 111
    :cond_7
    and-int/2addr p7, v0

    .line 112
    invoke-static {p7}, Ljava/lang/Integer;->bitCount(I)I

    .line 113
    .line 114
    .line 115
    move-result p7

    .line 116
    :goto_6
    iput p7, p0, Lfj4;->p:I

    .line 117
    .line 118
    iget-object v0, p0, Ljj4;->i:Lph4;

    .line 119
    .line 120
    iget v4, v0, Lph4;->f:I

    .line 121
    .line 122
    and-int/2addr p2, v4

    .line 123
    if-eqz p2, :cond_8

    .line 124
    .line 125
    move p2, v1

    .line 126
    goto :goto_7

    .line 127
    :cond_8
    move p2, p1

    .line 128
    :goto_7
    iput-boolean p2, p0, Lfj4;->s:Z

    .line 129
    .line 130
    iget-object p2, p4, Lr32;->s:Lxm3;

    .line 131
    .line 132
    invoke-static {v0, p2}, Llj4;->e(Lph4;Lxm3;)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    iput p2, p0, Lfj4;->q:I

    .line 137
    .line 138
    invoke-static {p6}, Llj4;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-nez v0, :cond_9

    .line 143
    .line 144
    move v0, v1

    .line 145
    goto :goto_8

    .line 146
    :cond_9
    move v0, p1

    .line 147
    :goto_8
    iget-object v4, p0, Ljj4;->i:Lph4;

    .line 148
    .line 149
    invoke-static {v4, p6, v0}, Llj4;->d(Lph4;Ljava/lang/String;Z)I

    .line 150
    .line 151
    .line 152
    move-result p6

    .line 153
    iput p6, p0, Lfj4;->r:I

    .line 154
    .line 155
    if-gtz v2, :cond_a

    .line 156
    .line 157
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_b

    .line 162
    .line 163
    if-gtz p7, :cond_a

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_a
    move p2, v1

    .line 167
    goto :goto_a

    .line 168
    :cond_b
    :goto_9
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_c

    .line 173
    .line 174
    if-ne p2, v3, :cond_a

    .line 175
    .line 176
    :cond_c
    iget-boolean p2, p0, Lfj4;->l:Z

    .line 177
    .line 178
    if-nez p2, :cond_a

    .line 179
    .line 180
    iget-boolean p2, p0, Lfj4;->m:Z

    .line 181
    .line 182
    if-eqz p2, :cond_d

    .line 183
    .line 184
    if-gtz p6, :cond_a

    .line 185
    .line 186
    :cond_d
    move p2, p1

    .line 187
    :goto_a
    iget-boolean p3, p4, Ldj4;->B:Z

    .line 188
    .line 189
    invoke-static {p5, p3}, Lkg4;->I(IZ)Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-eqz p3, :cond_e

    .line 194
    .line 195
    if-eqz p2, :cond_e

    .line 196
    .line 197
    move p1, v1

    .line 198
    :cond_e
    iput p1, p0, Lfj4;->j:I

    .line 199
    .line 200
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lfj4;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic b(Ljj4;)Z
    .locals 0

    .line 1
    check-cast p1, Lfj4;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1
.end method

.method public final c(Lfj4;)I
    .locals 7

    .line 1
    iget-boolean v0, p0, Lfj4;->k:Z

    .line 2
    .line 3
    iget-boolean v1, p1, Lfj4;->k:Z

    .line 4
    .line 5
    sget-object v2, Lpm3;->a:Lnm3;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lnm3;->d(ZZ)Lpm3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lfj4;->n:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Lfj4;->n:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lqn3;->g:Lqn3;

    .line 24
    .line 25
    sget-object v4, Lqn3;->h:Lqn3;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v4}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v1, p1, Lfj4;->o:I

    .line 32
    .line 33
    iget v2, p0, Lfj4;->o:I

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lpm3;->b(II)Lpm3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget v1, p1, Lfj4;->p:I

    .line 40
    .line 41
    iget v5, p0, Lfj4;->p:I

    .line 42
    .line 43
    invoke-virtual {v0, v5, v1}, Lpm3;->b(II)Lpm3;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget v1, p0, Lfj4;->q:I

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget v6, p1, Lfj4;->q:I

    .line 54
    .line 55
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v0, v1, v6, v4}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-boolean v1, p0, Lfj4;->l:Z

    .line 64
    .line 65
    iget-boolean v6, p1, Lfj4;->l:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1, v6}, Lpm3;->d(ZZ)Lpm3;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-boolean v1, p0, Lfj4;->m:Z

    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-boolean v6, p1, Lfj4;->m:Z

    .line 78
    .line 79
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    if-nez v2, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move-object v3, v4

    .line 87
    :goto_0
    invoke-virtual {v0, v1, v6, v3}, Lpm3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lpm3;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget v1, p0, Lfj4;->r:I

    .line 92
    .line 93
    iget v2, p1, Lfj4;->r:I

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lpm3;->b(II)Lpm3;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-nez v5, :cond_1

    .line 100
    .line 101
    iget-boolean v1, p0, Lfj4;->s:Z

    .line 102
    .line 103
    iget-boolean p1, p1, Lfj4;->s:Z

    .line 104
    .line 105
    invoke-virtual {v0, v1, p1}, Lpm3;->c(ZZ)Lpm3;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_1
    invoke-virtual {v0}, Lpm3;->e()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lfj4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfj4;->c(Lfj4;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
