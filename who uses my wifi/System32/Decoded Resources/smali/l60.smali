.class public final Ll60;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq10;


# instance fields
.field public A:Z

.field public B:I

.field public C:Ljava/util/ArrayList;

.field public D:I

.field public E:F

.field public final F:F

.field public G:F

.field public H:Landroid/graphics/DashPathEffect;

.field public final I:Lpz;

.field public J:Z

.field public final K:Z

.field public a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Z

.field public transient f:Ln41;

.field public g:I

.field public h:F

.field public i:F

.field public j:Z

.field public k:Z

.field public l:Laa0;

.field public m:F

.field public n:Z

.field public o:Ljava/util/ArrayList;

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:I

.field public u:Z

.field public v:Z

.field public w:F

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object v0, p0, Ll60;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    const-string v1, "DataSet"

    .line 10
    .line 11
    iput-object v1, p0, Ll60;->c:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput v1, p0, Ll60;->d:I

    .line 15
    .line 16
    iput-boolean v1, p0, Ll60;->e:Z

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    iput v2, p0, Ll60;->g:I

    .line 20
    .line 21
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 22
    .line 23
    iput v2, p0, Ll60;->h:F

    .line 24
    .line 25
    iput v2, p0, Ll60;->i:F

    .line 26
    .line 27
    iput-boolean v1, p0, Ll60;->j:Z

    .line 28
    .line 29
    iput-boolean v1, p0, Ll60;->k:Z

    .line 30
    .line 31
    new-instance v2, Laa0;

    .line 32
    .line 33
    invoke-direct {v2}, Lmi0;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Ll60;->l:Laa0;

    .line 37
    .line 38
    const/high16 v2, 0x41880000    # 17.0f

    .line 39
    .line 40
    iput v2, p0, Ll60;->m:F

    .line 41
    .line 42
    iput-boolean v1, p0, Ll60;->n:Z

    .line 43
    .line 44
    new-instance v2, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Ll60;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    iget-object v3, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v4, 0x8c

    .line 61
    .line 62
    const/16 v5, 0xea

    .line 63
    .line 64
    const/16 v6, 0xff

    .line 65
    .line 66
    invoke-static {v4, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    const/high16 v3, -0x1000000

    .line 78
    .line 79
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    const-string v2, ""

    .line 87
    .line 88
    iput-object v2, p0, Ll60;->c:Ljava/lang/String;

    .line 89
    .line 90
    const v2, -0x800001

    .line 91
    .line 92
    .line 93
    iput v2, p0, Ll60;->p:F

    .line 94
    .line 95
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 96
    .line 97
    .line 98
    iput v3, p0, Ll60;->q:F

    .line 99
    .line 100
    iput v2, p0, Ll60;->r:F

    .line 101
    .line 102
    iput v3, p0, Ll60;->s:F

    .line 103
    .line 104
    iput-object v0, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 105
    .line 106
    new-instance v7, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v7, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    const/4 v9, 0x0

    .line 118
    if-eqz v8, :cond_0

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_0
    iput v2, p0, Ll60;->p:F

    .line 122
    .line 123
    iput v3, p0, Ll60;->q:F

    .line 124
    .line 125
    iput v2, p0, Ll60;->r:F

    .line 126
    .line 127
    iput v3, p0, Ll60;->s:F

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    move v3, v9

    .line 134
    :cond_1
    :goto_0
    if-ge v3, v2, :cond_6

    .line 135
    .line 136
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    check-cast v8, Lxs;

    .line 143
    .line 144
    if-nez v8, :cond_2

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    iget v10, v8, Lxs;->h:F

    .line 148
    .line 149
    iget v11, p0, Ll60;->s:F

    .line 150
    .line 151
    cmpg-float v11, v10, v11

    .line 152
    .line 153
    if-gez v11, :cond_3

    .line 154
    .line 155
    iput v10, p0, Ll60;->s:F

    .line 156
    .line 157
    :cond_3
    iget v11, p0, Ll60;->r:F

    .line 158
    .line 159
    cmpl-float v11, v10, v11

    .line 160
    .line 161
    if-lez v11, :cond_4

    .line 162
    .line 163
    iput v10, p0, Ll60;->r:F

    .line 164
    .line 165
    :cond_4
    iget v8, v8, Lxs;->f:F

    .line 166
    .line 167
    iget v10, p0, Ll60;->q:F

    .line 168
    .line 169
    cmpg-float v10, v8, v10

    .line 170
    .line 171
    if-gez v10, :cond_5

    .line 172
    .line 173
    iput v8, p0, Ll60;->q:F

    .line 174
    .line 175
    :cond_5
    iget v10, p0, Ll60;->p:F

    .line 176
    .line 177
    cmpl-float v10, v8, v10

    .line 178
    .line 179
    if-lez v10, :cond_1

    .line 180
    .line 181
    iput v8, p0, Ll60;->p:F

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_6
    :goto_1
    const/16 v2, 0xbb

    .line 185
    .line 186
    const/16 v3, 0x73

    .line 187
    .line 188
    invoke-static {v6, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    iput v2, p0, Ll60;->t:I

    .line 193
    .line 194
    iput-boolean v1, p0, Ll60;->u:Z

    .line 195
    .line 196
    iput-boolean v1, p0, Ll60;->v:Z

    .line 197
    .line 198
    const/high16 v2, 0x3f000000    # 0.5f

    .line 199
    .line 200
    iput v2, p0, Ll60;->w:F

    .line 201
    .line 202
    invoke-static {v2}, Lk41;->c(F)F

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    iput v2, p0, Ll60;->w:F

    .line 207
    .line 208
    invoke-static {v4, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    iput v2, p0, Ll60;->x:I

    .line 213
    .line 214
    const/16 v2, 0x55

    .line 215
    .line 216
    iput v2, p0, Ll60;->y:I

    .line 217
    .line 218
    const/high16 v2, 0x40200000    # 2.5f

    .line 219
    .line 220
    iput v2, p0, Ll60;->z:F

    .line 221
    .line 222
    iput-boolean v9, p0, Ll60;->A:Z

    .line 223
    .line 224
    iput v1, p0, Ll60;->B:I

    .line 225
    .line 226
    iput-object v0, p0, Ll60;->C:Ljava/util/ArrayList;

    .line 227
    .line 228
    const/4 v2, -0x1

    .line 229
    iput v2, p0, Ll60;->D:I

    .line 230
    .line 231
    const/high16 v2, 0x41000000    # 8.0f

    .line 232
    .line 233
    iput v2, p0, Ll60;->E:F

    .line 234
    .line 235
    const/high16 v2, 0x40800000    # 4.0f

    .line 236
    .line 237
    iput v2, p0, Ll60;->F:F

    .line 238
    .line 239
    const v2, 0x3e4ccccd    # 0.2f

    .line 240
    .line 241
    .line 242
    iput v2, p0, Ll60;->G:F

    .line 243
    .line 244
    iput-object v0, p0, Ll60;->H:Landroid/graphics/DashPathEffect;

    .line 245
    .line 246
    new-instance v0, Lpz;

    .line 247
    .line 248
    const/16 v2, 0x11

    .line 249
    .line 250
    invoke-direct {v0, v2}, Lpz;-><init>(I)V

    .line 251
    .line 252
    .line 253
    iput-object v0, p0, Ll60;->I:Lpz;

    .line 254
    .line 255
    iput-boolean v1, p0, Ll60;->J:Z

    .line 256
    .line 257
    iput-boolean v1, p0, Ll60;->K:Z

    .line 258
    .line 259
    new-instance v0, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    iput-object v0, p0, Ll60;->C:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, Ll60;->C:Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-static {v4, v5, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    return-void
.end method


# virtual methods
.method public final a(F)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    add-int/lit8 v2, v2, -0x1

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-gt v3, v2, :cond_3

    .line 16
    .line 17
    add-int v4, v2, v3

    .line 18
    .line 19
    div-int/lit8 v4, v4, 0x2

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lxs;

    .line 26
    .line 27
    iget v5, v5, Lxs;->h:F

    .line 28
    .line 29
    cmpl-float v5, p1, v5

    .line 30
    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    :goto_1
    if-lez v4, :cond_0

    .line 34
    .line 35
    add-int/lit8 v2, v4, -0x1

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lxs;

    .line 42
    .line 43
    iget v2, v2, Lxs;->h:F

    .line 44
    .line 45
    cmpl-float v2, v2, p1

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    add-int/lit8 v4, v4, -0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :goto_2
    if-ge v4, v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lxs;

    .line 63
    .line 64
    iget v5, v3, Lxs;->h:F

    .line 65
    .line 66
    cmpl-float v5, v5, p1

    .line 67
    .line 68
    if-nez v5, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    if-lez v5, :cond_2

    .line 77
    .line 78
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    move v3, v4

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 83
    .line 84
    move v2, v4

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    return-object v0
.end method

.method public final b(I)Lxs;
    .locals 1

    .line 1
    iget-object v0, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lxs;

    .line 8
    .line 9
    return-object p1
.end method

.method public final c(FFI)Lxs;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ll60;->d(FFI)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, -0x1

    .line 6
    if-le p1, p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lxs;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public final d(FFI)I
    .locals 12

    .line 1
    iget-object v0, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_d

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_7

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    sub-int/2addr v2, v3

    .line 20
    const/4 v4, 0x0

    .line 21
    :cond_1
    :goto_0
    const/4 v5, 0x2

    .line 22
    if-ge v4, v2, :cond_5

    .line 23
    .line 24
    add-int v6, v4, v2

    .line 25
    .line 26
    div-int/2addr v6, v5

    .line 27
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Lxs;

    .line 32
    .line 33
    iget v5, v5, Lxs;->h:F

    .line 34
    .line 35
    sub-float/2addr v5, p1

    .line 36
    add-int/lit8 v7, v6, 0x1

    .line 37
    .line 38
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    check-cast v8, Lxs;

    .line 43
    .line 44
    iget v8, v8, Lxs;->h:F

    .line 45
    .line 46
    sub-float/2addr v8, p1

    .line 47
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    cmpg-float v10, v8, v9

    .line 56
    .line 57
    if-gez v10, :cond_2

    .line 58
    .line 59
    :goto_1
    move v4, v7

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    cmpg-float v8, v9, v8

    .line 62
    .line 63
    if-gez v8, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    float-to-double v8, v5

    .line 67
    const-wide/16 v10, 0x0

    .line 68
    .line 69
    cmpl-double v5, v8, v10

    .line 70
    .line 71
    if-ltz v5, :cond_4

    .line 72
    .line 73
    :goto_2
    move v2, v6

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    cmpg-double v5, v8, v10

    .line 76
    .line 77
    if-gez v5, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    if-eq v2, v1, :cond_c

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lxs;

    .line 87
    .line 88
    iget v1, v1, Lxs;->h:F

    .line 89
    .line 90
    if-ne p3, v3, :cond_6

    .line 91
    .line 92
    cmpg-float p1, v1, p1

    .line 93
    .line 94
    if-gez p1, :cond_7

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    sub-int/2addr p1, v3

    .line 101
    if-ge v2, p1, :cond_7

    .line 102
    .line 103
    add-int/lit8 v2, v2, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    if-ne p3, v5, :cond_7

    .line 107
    .line 108
    cmpl-float p1, v1, p1

    .line 109
    .line 110
    if-lez p1, :cond_7

    .line 111
    .line 112
    if-lez v2, :cond_7

    .line 113
    .line 114
    add-int/lit8 v2, v2, -0x1

    .line 115
    .line 116
    :cond_7
    :goto_3
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_c

    .line 121
    .line 122
    :goto_4
    if-lez v2, :cond_8

    .line 123
    .line 124
    add-int/lit8 p1, v2, -0x1

    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Lxs;

    .line 131
    .line 132
    iget p1, p1, Lxs;->h:F

    .line 133
    .line 134
    cmpl-float p1, p1, v1

    .line 135
    .line 136
    if-nez p1, :cond_8

    .line 137
    .line 138
    add-int/lit8 v2, v2, -0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lxs;

    .line 146
    .line 147
    iget p1, p1, Lxs;->f:F

    .line 148
    .line 149
    :goto_5
    move p3, v2

    .line 150
    :cond_9
    add-int/2addr v2, v3

    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-lt v2, v4, :cond_a

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_a
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Lxs;

    .line 163
    .line 164
    iget v5, v4, Lxs;->h:F

    .line 165
    .line 166
    cmpl-float v5, v5, v1

    .line 167
    .line 168
    if-eqz v5, :cond_b

    .line 169
    .line 170
    :goto_6
    return p3

    .line 171
    :cond_b
    iget v4, v4, Lxs;->f:F

    .line 172
    .line 173
    sub-float/2addr v4, p2

    .line 174
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    sub-float v5, p1, p2

    .line 179
    .line 180
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    cmpg-float v4, v4, v5

    .line 185
    .line 186
    if-gez v4, :cond_9

    .line 187
    .line 188
    move p1, p2

    .line 189
    goto :goto_5

    .line 190
    :cond_c
    return v2

    .line 191
    :cond_d
    :goto_7
    return v1
.end method

.method public final e(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ll60;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ll60;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuffer;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuffer;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v4, "DataSet, label: "

    .line 16
    .line 17
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, Ll60;->c:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    const-string v4, ""

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v4, ", entries: "

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "\n"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v2, v3, :cond_1

    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Lxs;

    .line 77
    .line 78
    invoke-virtual {v4}, Lxs;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v4, " "

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
.end method
