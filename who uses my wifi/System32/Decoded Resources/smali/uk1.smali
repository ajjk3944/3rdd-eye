.class public final Luk1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkk1;
.implements Lws2;


# static fields
.field public static final m:[B

.field public static final n:[B

.field public static final o:[B


# instance fields
.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Luk1;->m:[B

    .line 8
    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    fill-array-data v0, :array_1

    .line 12
    .line 13
    .line 14
    sput-object v0, Luk1;->n:[B

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_2

    .line 21
    .line 22
    .line 23
    sput-object v0, Luk1;->o:[B

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :array_0
    .array-data 1
        0x0t
        0x7t
        0x8t
        0xft
    .end array-data

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :array_1
    .array-data 1
        0x0t
        0x77t
        -0x78t
        -0x1t
    .end array-data

    .line 34
    :array_2
    .array-data 1
        0x0t
        0x11t
        0x22t
        0x33t
        0x44t
        0x55t
        0x66t
        0x77t
        -0x78t
        -0x67t
        -0x56t
        -0x45t
        -0x34t
        -0x23t
        -0x12t
        -0x1t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbw0;

    const/4 v1, 0x0

    .line 3
    invoke-direct {v0, v1}, Lbw0;-><init>(I)V

    .line 4
    iput-object v0, p0, Luk1;->k:Ljava/lang/Object;

    new-instance v0, Lbw0;

    .line 5
    invoke-direct {v0, v1}, Lbw0;-><init>(I)V

    .line 6
    iput-object v0, p0, Luk1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Le13;Lbx2;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls62;

    invoke-direct {v0}, Ls62;-><init>()V

    iput-object v0, p0, Luk1;->k:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->g:Ljava/lang/Object;

    iput-object p2, p0, Luk1;->h:Ljava/lang/Object;

    iput-object p3, p0, Luk1;->i:Ljava/lang/Object;

    iput-object p4, p0, Luk1;->j:Ljava/lang/Object;

    sget-object p1, Lfr;->s:Lfr;

    iput-object p1, p0, Luk1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lof0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lwb3;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luk1;->h:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Luk1;->i:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->f:Ljava/lang/Object;

    iput-object p2, p0, Luk1;->g:Ljava/lang/Object;

    iput-object p5, p0, Luk1;->l:Ljava/lang/Object;

    iput-object p3, p0, Luk1;->k:Ljava/lang/Object;

    iput-object p4, p0, Luk1;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu61;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 12
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Luk1;->g:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 13
    new-array v0, v0, [F

    iput-object v0, p0, Luk1;->i:Ljava/lang/Object;

    .line 14
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Luk1;->j:Ljava/lang/Object;

    const/4 v0, 0x2

    .line 15
    new-array v0, v0, [F

    iput-object v0, p0, Luk1;->k:Ljava/lang/Object;

    .line 16
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Luk1;->l:Ljava/lang/Object;

    .line 17
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 18
    iput-object p1, p0, Luk1;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput-object p1, p0, Luk1;->f:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->g:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->h:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->i:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->j:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->k:Ljava/lang/Object;

    iput-object p1, p0, Luk1;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static k(Llg1;I)Lnk1;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0, v1}, Llg1;->o(I)V

    .line 10
    .line 11
    .line 12
    const/high16 v3, -0x1000000

    .line 13
    .line 14
    const v4, -0x808081

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, -0x1

    .line 19
    filled-new-array {v5, v6, v3, v4}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {}, Luk1;->m()[I

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {}, Luk1;->p()[I

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    add-int/lit8 v7, p1, -0x2

    .line 32
    .line 33
    :goto_0
    if-lez v7, :cond_6

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    and-int/lit16 v10, v9, 0x80

    .line 44
    .line 45
    if-eqz v10, :cond_0

    .line 46
    .line 47
    move-object v10, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    and-int/lit8 v10, v9, 0x40

    .line 50
    .line 51
    if-eqz v10, :cond_1

    .line 52
    .line 53
    move-object v10, v4

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v10, v6

    .line 56
    :goto_1
    and-int/lit8 v9, v9, 0x1

    .line 57
    .line 58
    if-eqz v9, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    invoke-virtual {v0, v1}, Llg1;->r(I)I

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    add-int/lit8 v7, v7, -0x6

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 v9, 0x6

    .line 80
    invoke-virtual {v0, v9}, Llg1;->r(I)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    const/4 v12, 0x2

    .line 85
    shl-int/2addr v11, v12

    .line 86
    const/4 v13, 0x4

    .line 87
    invoke-virtual {v0, v13}, Llg1;->r(I)I

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    shl-int/2addr v14, v13

    .line 92
    invoke-virtual {v0, v13}, Llg1;->r(I)I

    .line 93
    .line 94
    .line 95
    move-result v15

    .line 96
    shl-int/lit8 v13, v15, 0x4

    .line 97
    .line 98
    invoke-virtual {v0, v12}, Llg1;->r(I)I

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    shl-int/lit8 v9, v12, 0x6

    .line 103
    .line 104
    add-int/lit8 v7, v7, -0x4

    .line 105
    .line 106
    move v12, v13

    .line 107
    move v13, v9

    .line 108
    move v9, v11

    .line 109
    move v11, v14

    .line 110
    :goto_2
    const/16 v14, 0xff

    .line 111
    .line 112
    if-nez v9, :cond_3

    .line 113
    .line 114
    move v13, v14

    .line 115
    :cond_3
    if-nez v9, :cond_4

    .line 116
    .line 117
    move v12, v5

    .line 118
    :cond_4
    if-nez v9, :cond_5

    .line 119
    .line 120
    move v11, v5

    .line 121
    :cond_5
    and-int/2addr v13, v14

    .line 122
    rsub-int v13, v13, 0xff

    .line 123
    .line 124
    add-int/lit8 v12, v12, -0x80

    .line 125
    .line 126
    move/from16 v16, v2

    .line 127
    .line 128
    int-to-double v1, v9

    .line 129
    sget-object v9, Lv23;->a:Ljava/lang/String;

    .line 130
    .line 131
    add-int/lit8 v11, v11, -0x80

    .line 132
    .line 133
    move-object/from16 v17, v6

    .line 134
    .line 135
    int-to-double v5, v11

    .line 136
    const-wide v18, 0x3ff66e978d4fdf3bL    # 1.402

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    mul-double v18, v18, v5

    .line 142
    .line 143
    move-object/from16 p1, v10

    .line 144
    .line 145
    add-double v9, v18, v1

    .line 146
    .line 147
    double-to-int v9, v9

    .line 148
    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    int-to-byte v10, v13

    .line 153
    const/4 v11, 0x0

    .line 154
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    int-to-double v12, v12

    .line 159
    const-wide v18, 0x3fd60663c74fb54aL    # 0.34414

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    mul-double v18, v18, v12

    .line 165
    .line 166
    sub-double v18, v1, v18

    .line 167
    .line 168
    const-wide v20, 0x3fe6da3c21187e7cL    # 0.71414

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    mul-double v5, v5, v20

    .line 174
    .line 175
    sub-double v5, v18, v5

    .line 176
    .line 177
    double-to-int v5, v5

    .line 178
    invoke-static {v5, v14}, Ljava/lang/Math;->min(II)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    const-wide v18, 0x3ffc5a1cac083127L    # 1.772

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    mul-double v12, v12, v18

    .line 192
    .line 193
    add-double/2addr v12, v1

    .line 194
    double-to-int v1, v12

    .line 195
    invoke-static {v1, v14}, Ljava/lang/Math;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-static {v10, v9, v5, v1}, Luk1;->q(IIII)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    aput v1, p1, v8

    .line 208
    .line 209
    move v5, v11

    .line 210
    move/from16 v2, v16

    .line 211
    .line 212
    move-object/from16 v6, v17

    .line 213
    .line 214
    const/16 v1, 0x8

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_6
    move/from16 v16, v2

    .line 219
    .line 220
    move-object/from16 v17, v6

    .line 221
    .line 222
    new-instance v0, Lnk1;

    .line 223
    .line 224
    move/from16 v1, v16

    .line 225
    .line 226
    move-object/from16 v2, v17

    .line 227
    .line 228
    invoke-direct {v0, v1, v3, v4, v2}, Lnk1;-><init>(I[I[I[I)V

    .line 229
    .line 230
    .line 231
    return-object v0
.end method

.method public static l(Llg1;)Lpk1;
    .locals 9

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Llg1;->r(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-virtual {p0, v2}, Llg1;->o(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-virtual {p0, v2}, Llg1;->r(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Llg1;->q()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-virtual {p0, v4}, Llg1;->o(I)V

    .line 22
    .line 23
    .line 24
    sget-object v5, Lv23;->b:[B

    .line 25
    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Llg1;->r(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    mul-int/2addr v2, v0

    .line 35
    invoke-virtual {p0, v2}, Llg1;->o(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    if-nez v2, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Llg1;->r(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p0, v0}, Llg1;->r(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v6, 0x0

    .line 50
    if-lez v2, :cond_2

    .line 51
    .line 52
    new-array v5, v2, [B

    .line 53
    .line 54
    iget v7, p0, Llg1;->c:I

    .line 55
    .line 56
    if-nez v7, :cond_1

    .line 57
    .line 58
    move v7, v4

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v7, v6

    .line 61
    :goto_0
    invoke-static {v7}, Lzt0;->b0(Z)V

    .line 62
    .line 63
    .line 64
    iget-object v7, p0, Llg1;->a:[B

    .line 65
    .line 66
    iget v8, p0, Llg1;->b:I

    .line 67
    .line 68
    invoke-static {v7, v8, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 69
    .line 70
    .line 71
    iget v7, p0, Llg1;->b:I

    .line 72
    .line 73
    add-int/2addr v7, v2

    .line 74
    iput v7, p0, Llg1;->b:I

    .line 75
    .line 76
    invoke-virtual {p0}, Llg1;->y()V

    .line 77
    .line 78
    .line 79
    :cond_2
    if-lez v0, :cond_4

    .line 80
    .line 81
    new-array v2, v0, [B

    .line 82
    .line 83
    iget v7, p0, Llg1;->c:I

    .line 84
    .line 85
    if-nez v7, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move v4, v6

    .line 89
    :goto_1
    invoke-static {v4}, Lzt0;->b0(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v4, p0, Llg1;->a:[B

    .line 93
    .line 94
    iget v7, p0, Llg1;->b:I

    .line 95
    .line 96
    invoke-static {v4, v7, v2, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    .line 99
    iget v4, p0, Llg1;->b:I

    .line 100
    .line 101
    add-int/2addr v4, v0

    .line 102
    iput v4, p0, Llg1;->b:I

    .line 103
    .line 104
    invoke-virtual {p0}, Llg1;->y()V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    :goto_2
    move-object v2, v5

    .line 109
    :goto_3
    new-instance p0, Lpk1;

    .line 110
    .line 111
    invoke-direct {p0, v1, v3, v5, v2}, Lpk1;-><init>(IZ[B[B)V

    .line 112
    .line 113
    .line 114
    return-object p0
.end method

.method public static m()[I
    .locals 10

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aput v2, v1, v2

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v0, :cond_7

    .line 11
    .line 12
    and-int/lit8 v5, v4, 0x4

    .line 13
    .line 14
    and-int/lit8 v6, v4, 0x2

    .line 15
    .line 16
    and-int/lit8 v7, v4, 0x1

    .line 17
    .line 18
    const/16 v8, 0x8

    .line 19
    .line 20
    const/16 v9, 0xff

    .line 21
    .line 22
    if-ge v4, v8, :cond_3

    .line 23
    .line 24
    if-eq v3, v7, :cond_0

    .line 25
    .line 26
    move v7, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v7, v9

    .line 29
    :goto_1
    if-eqz v6, :cond_1

    .line 30
    .line 31
    move v6, v9

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    move v6, v2

    .line 34
    :goto_2
    if-eqz v5, :cond_2

    .line 35
    .line 36
    move v5, v9

    .line 37
    goto :goto_3

    .line 38
    :cond_2
    move v5, v2

    .line 39
    :goto_3
    invoke-static {v9, v7, v6, v5}, Luk1;->q(IIII)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    aput v5, v1, v4

    .line 44
    .line 45
    goto :goto_7

    .line 46
    :cond_3
    const/16 v8, 0x7f

    .line 47
    .line 48
    if-eq v3, v7, :cond_4

    .line 49
    .line 50
    move v7, v2

    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move v7, v8

    .line 53
    :goto_4
    if-eqz v6, :cond_5

    .line 54
    .line 55
    move v6, v8

    .line 56
    goto :goto_5

    .line 57
    :cond_5
    move v6, v2

    .line 58
    :goto_5
    if-eqz v5, :cond_6

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_6
    move v8, v2

    .line 62
    :goto_6
    invoke-static {v9, v7, v6, v8}, Luk1;->q(IIII)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    aput v5, v1, v4

    .line 67
    .line 68
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    return-object v1
.end method

.method public static p()[I
    .locals 15

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aput v2, v1, v2

    .line 7
    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_20

    .line 10
    .line 11
    const/16 v4, 0x8

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-ge v3, v4, :cond_3

    .line 17
    .line 18
    and-int/lit8 v4, v3, 0x1

    .line 19
    .line 20
    and-int/lit8 v7, v3, 0x2

    .line 21
    .line 22
    and-int/lit8 v8, v3, 0x4

    .line 23
    .line 24
    if-eq v6, v4, :cond_0

    .line 25
    .line 26
    move v4, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v4, v5

    .line 29
    :goto_1
    if-eqz v7, :cond_1

    .line 30
    .line 31
    move v6, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    move v6, v2

    .line 34
    :goto_2
    if-eqz v8, :cond_2

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    move v5, v2

    .line 38
    :goto_3
    const/16 v7, 0x3f

    .line 39
    .line 40
    invoke-static {v7, v4, v6, v5}, Luk1;->q(IIII)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    aput v4, v1, v3

    .line 45
    .line 46
    goto/16 :goto_1c

    .line 47
    .line 48
    :cond_3
    and-int/lit16 v7, v3, 0x88

    .line 49
    .line 50
    const/16 v8, 0xaa

    .line 51
    .line 52
    const/16 v9, 0x55

    .line 53
    .line 54
    if-eqz v7, :cond_19

    .line 55
    .line 56
    const/16 v10, 0x7f

    .line 57
    .line 58
    if-eq v7, v4, :cond_12

    .line 59
    .line 60
    const/16 v4, 0x80

    .line 61
    .line 62
    const/16 v8, 0x2b

    .line 63
    .line 64
    if-eq v7, v4, :cond_b

    .line 65
    .line 66
    const/16 v4, 0x88

    .line 67
    .line 68
    if-eq v7, v4, :cond_4

    .line 69
    .line 70
    goto/16 :goto_1c

    .line 71
    .line 72
    :cond_4
    and-int/lit8 v4, v3, 0x10

    .line 73
    .line 74
    and-int/lit8 v7, v3, 0x1

    .line 75
    .line 76
    and-int/lit8 v10, v3, 0x20

    .line 77
    .line 78
    and-int/lit8 v11, v3, 0x2

    .line 79
    .line 80
    and-int/lit8 v12, v3, 0x40

    .line 81
    .line 82
    and-int/lit8 v13, v3, 0x4

    .line 83
    .line 84
    if-eq v6, v7, :cond_5

    .line 85
    .line 86
    move v6, v2

    .line 87
    goto :goto_4

    .line 88
    :cond_5
    move v6, v8

    .line 89
    :goto_4
    if-eqz v4, :cond_6

    .line 90
    .line 91
    move v4, v9

    .line 92
    goto :goto_5

    .line 93
    :cond_6
    move v4, v2

    .line 94
    :goto_5
    if-eqz v11, :cond_7

    .line 95
    .line 96
    move v7, v8

    .line 97
    goto :goto_6

    .line 98
    :cond_7
    move v7, v2

    .line 99
    :goto_6
    if-eqz v10, :cond_8

    .line 100
    .line 101
    move v10, v9

    .line 102
    goto :goto_7

    .line 103
    :cond_8
    move v10, v2

    .line 104
    :goto_7
    if-eqz v13, :cond_9

    .line 105
    .line 106
    goto :goto_8

    .line 107
    :cond_9
    move v8, v2

    .line 108
    :goto_8
    if-eqz v12, :cond_a

    .line 109
    .line 110
    goto :goto_9

    .line 111
    :cond_a
    move v9, v2

    .line 112
    :goto_9
    add-int/2addr v6, v4

    .line 113
    add-int/2addr v7, v10

    .line 114
    add-int/2addr v8, v9

    .line 115
    invoke-static {v5, v6, v7, v8}, Luk1;->q(IIII)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    aput v4, v1, v3

    .line 120
    .line 121
    goto/16 :goto_1c

    .line 122
    .line 123
    :cond_b
    and-int/lit8 v4, v3, 0x10

    .line 124
    .line 125
    and-int/lit8 v7, v3, 0x1

    .line 126
    .line 127
    and-int/lit8 v11, v3, 0x20

    .line 128
    .line 129
    and-int/lit8 v12, v3, 0x2

    .line 130
    .line 131
    and-int/lit8 v13, v3, 0x40

    .line 132
    .line 133
    and-int/lit8 v14, v3, 0x4

    .line 134
    .line 135
    if-eq v6, v7, :cond_c

    .line 136
    .line 137
    move v6, v2

    .line 138
    goto :goto_a

    .line 139
    :cond_c
    move v6, v8

    .line 140
    :goto_a
    add-int/2addr v6, v10

    .line 141
    if-eqz v4, :cond_d

    .line 142
    .line 143
    move v4, v9

    .line 144
    goto :goto_b

    .line 145
    :cond_d
    move v4, v2

    .line 146
    :goto_b
    if-eqz v12, :cond_e

    .line 147
    .line 148
    move v7, v8

    .line 149
    goto :goto_c

    .line 150
    :cond_e
    move v7, v2

    .line 151
    :goto_c
    add-int/2addr v7, v10

    .line 152
    if-eqz v11, :cond_f

    .line 153
    .line 154
    move v11, v9

    .line 155
    goto :goto_d

    .line 156
    :cond_f
    move v11, v2

    .line 157
    :goto_d
    if-eqz v14, :cond_10

    .line 158
    .line 159
    goto :goto_e

    .line 160
    :cond_10
    move v8, v2

    .line 161
    :goto_e
    add-int/2addr v8, v10

    .line 162
    if-eqz v13, :cond_11

    .line 163
    .line 164
    goto :goto_f

    .line 165
    :cond_11
    move v9, v2

    .line 166
    :goto_f
    add-int/2addr v6, v4

    .line 167
    add-int/2addr v7, v11

    .line 168
    add-int/2addr v8, v9

    .line 169
    invoke-static {v5, v6, v7, v8}, Luk1;->q(IIII)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    aput v4, v1, v3

    .line 174
    .line 175
    goto/16 :goto_1c

    .line 176
    .line 177
    :cond_12
    and-int/lit8 v4, v3, 0x10

    .line 178
    .line 179
    and-int/lit8 v5, v3, 0x1

    .line 180
    .line 181
    and-int/lit8 v7, v3, 0x20

    .line 182
    .line 183
    and-int/lit8 v11, v3, 0x2

    .line 184
    .line 185
    and-int/lit8 v12, v3, 0x40

    .line 186
    .line 187
    and-int/lit8 v13, v3, 0x4

    .line 188
    .line 189
    if-eq v6, v5, :cond_13

    .line 190
    .line 191
    move v5, v2

    .line 192
    goto :goto_10

    .line 193
    :cond_13
    move v5, v9

    .line 194
    :goto_10
    if-eqz v4, :cond_14

    .line 195
    .line 196
    move v4, v8

    .line 197
    goto :goto_11

    .line 198
    :cond_14
    move v4, v2

    .line 199
    :goto_11
    if-eqz v11, :cond_15

    .line 200
    .line 201
    move v6, v9

    .line 202
    goto :goto_12

    .line 203
    :cond_15
    move v6, v2

    .line 204
    :goto_12
    if-eqz v7, :cond_16

    .line 205
    .line 206
    move v7, v8

    .line 207
    goto :goto_13

    .line 208
    :cond_16
    move v7, v2

    .line 209
    :goto_13
    if-eqz v13, :cond_17

    .line 210
    .line 211
    goto :goto_14

    .line 212
    :cond_17
    move v9, v2

    .line 213
    :goto_14
    if-eqz v12, :cond_18

    .line 214
    .line 215
    goto :goto_15

    .line 216
    :cond_18
    move v8, v2

    .line 217
    :goto_15
    add-int/2addr v9, v8

    .line 218
    add-int/2addr v6, v7

    .line 219
    add-int/2addr v5, v4

    .line 220
    invoke-static {v10, v5, v6, v9}, Luk1;->q(IIII)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    aput v4, v1, v3

    .line 225
    .line 226
    goto :goto_1c

    .line 227
    :cond_19
    and-int/lit8 v4, v3, 0x10

    .line 228
    .line 229
    and-int/lit8 v7, v3, 0x1

    .line 230
    .line 231
    and-int/lit8 v10, v3, 0x20

    .line 232
    .line 233
    and-int/lit8 v11, v3, 0x2

    .line 234
    .line 235
    and-int/lit8 v12, v3, 0x40

    .line 236
    .line 237
    and-int/lit8 v13, v3, 0x4

    .line 238
    .line 239
    if-eq v6, v7, :cond_1a

    .line 240
    .line 241
    move v6, v2

    .line 242
    goto :goto_16

    .line 243
    :cond_1a
    move v6, v9

    .line 244
    :goto_16
    if-eqz v4, :cond_1b

    .line 245
    .line 246
    move v4, v8

    .line 247
    goto :goto_17

    .line 248
    :cond_1b
    move v4, v2

    .line 249
    :goto_17
    if-eqz v11, :cond_1c

    .line 250
    .line 251
    move v7, v9

    .line 252
    goto :goto_18

    .line 253
    :cond_1c
    move v7, v2

    .line 254
    :goto_18
    if-eqz v10, :cond_1d

    .line 255
    .line 256
    move v10, v8

    .line 257
    goto :goto_19

    .line 258
    :cond_1d
    move v10, v2

    .line 259
    :goto_19
    if-eqz v13, :cond_1e

    .line 260
    .line 261
    goto :goto_1a

    .line 262
    :cond_1e
    move v9, v2

    .line 263
    :goto_1a
    if-eqz v12, :cond_1f

    .line 264
    .line 265
    goto :goto_1b

    .line 266
    :cond_1f
    move v8, v2

    .line 267
    :goto_1b
    add-int/2addr v9, v8

    .line 268
    add-int/2addr v7, v10

    .line 269
    add-int/2addr v6, v4

    .line 270
    invoke-static {v5, v6, v7, v9}, Luk1;->q(IIII)I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    aput v4, v1, v3

    .line 275
    .line 276
    :goto_1c
    add-int/lit8 v3, v3, 0x1

    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_20
    return-object v1
.end method

.method public static q(IIII)I
    .locals 0

    .line 1
    shl-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x10

    .line 4
    .line 5
    or-int/2addr p0, p1

    .line 6
    shl-int/lit8 p1, p2, 0x8

    .line 7
    .line 8
    or-int/2addr p0, p1

    .line 9
    or-int/2addr p0, p3

    .line 10
    return p0
.end method

.method public static r([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v7, p5

    .line 6
    .line 7
    new-instance v8, Llg1;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    invoke-direct {v8, v2, v0}, Llg1;-><init>(I[B)V

    .line 11
    .line 12
    .line 13
    move/from16 v2, p3

    .line 14
    .line 15
    move/from16 v9, p4

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x0

    .line 20
    :goto_0
    invoke-virtual {v8}, Llg1;->f()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_21

    .line 25
    .line 26
    const/16 v13, 0x8

    .line 27
    .line 28
    invoke-virtual {v8, v13}, Llg1;->r(I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0xf0

    .line 33
    .line 34
    if-eq v3, v4, :cond_20

    .line 35
    .line 36
    const/4 v14, 0x3

    .line 37
    const/4 v15, 0x4

    .line 38
    const/4 v4, 0x1

    .line 39
    const/4 v5, 0x2

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    packed-switch v3, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    packed-switch v3, :pswitch_data_1

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_0
    const/16 v3, 0x10

    .line 50
    .line 51
    invoke-static {v3, v13, v8}, Luk1;->s(IILlg1;)[B

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    invoke-static {v15, v13, v8}, Luk1;->s(IILlg1;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    invoke-static {v15, v15, v8}, Luk1;->s(IILlg1;)[B

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    goto :goto_0

    .line 66
    :pswitch_3
    move v14, v2

    .line 67
    move/from16 v2, v16

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v8, v13}, Llg1;->r(I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_0

    .line 74
    .line 75
    move v15, v2

    .line 76
    move/from16 v17, v4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_0
    invoke-virtual {v8}, Llg1;->q()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v5, 0x7

    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v8, v5}, Llg1;->r(I)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_1

    .line 91
    .line 92
    move v15, v2

    .line 93
    move/from16 v17, v3

    .line 94
    .line 95
    move/from16 v3, v16

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    move v15, v4

    .line 99
    move/from16 v3, v16

    .line 100
    .line 101
    move/from16 v17, v3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    invoke-virtual {v8, v5}, Llg1;->r(I)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-virtual {v8, v13}, Llg1;->r(I)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    move v15, v2

    .line 113
    move/from16 v17, v3

    .line 114
    .line 115
    move v3, v5

    .line 116
    :goto_2
    if-eqz v17, :cond_3

    .line 117
    .line 118
    if-eqz v7, :cond_3

    .line 119
    .line 120
    add-int/lit8 v2, v9, 0x1

    .line 121
    .line 122
    move v5, v4

    .line 123
    int-to-float v4, v9

    .line 124
    aget v3, p1, v3

    .line 125
    .line 126
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 127
    .line 128
    .line 129
    int-to-float v3, v14

    .line 130
    add-int v6, v14, v17

    .line 131
    .line 132
    int-to-float v6, v6

    .line 133
    int-to-float v2, v2

    .line 134
    move v0, v5

    .line 135
    move v5, v6

    .line 136
    move v6, v2

    .line 137
    move-object/from16 v2, p6

    .line 138
    .line 139
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_3
    move v0, v4

    .line 144
    :goto_3
    add-int v14, v14, v17

    .line 145
    .line 146
    if-nez v15, :cond_4

    .line 147
    .line 148
    move v4, v0

    .line 149
    move v2, v15

    .line 150
    goto :goto_1

    .line 151
    :cond_4
    move v2, v14

    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :pswitch_4
    move v0, v4

    .line 155
    if-ne v1, v14, :cond_6

    .line 156
    .line 157
    if-nez v11, :cond_5

    .line 158
    .line 159
    sget-object v3, Luk1;->o:[B

    .line 160
    .line 161
    move-object/from16 v17, v3

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    move-object/from16 v17, v11

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    const/16 v17, 0x0

    .line 168
    .line 169
    :goto_4
    move/from16 v4, v16

    .line 170
    .line 171
    :goto_5
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_7

    .line 176
    .line 177
    move/from16 v18, v0

    .line 178
    .line 179
    move/from16 v19, v4

    .line 180
    .line 181
    goto/16 :goto_a

    .line 182
    .line 183
    :cond_7
    invoke-virtual {v8}, Llg1;->q()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-nez v3, :cond_9

    .line 188
    .line 189
    invoke-virtual {v8, v14}, Llg1;->r(I)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_8

    .line 194
    .line 195
    add-int/lit8 v3, v3, 0x2

    .line 196
    .line 197
    move/from16 v18, v3

    .line 198
    .line 199
    :goto_6
    move/from16 v19, v4

    .line 200
    .line 201
    :goto_7
    move/from16 v3, v16

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_8
    move/from16 v19, v0

    .line 205
    .line 206
    :goto_8
    move/from16 v3, v16

    .line 207
    .line 208
    move/from16 v18, v3

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :cond_9
    invoke-virtual {v8}, Llg1;->q()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-nez v3, :cond_a

    .line 216
    .line 217
    invoke-virtual {v8, v5}, Llg1;->r(I)I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    add-int/2addr v3, v15

    .line 222
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    :goto_9
    move/from16 v18, v3

    .line 227
    .line 228
    move/from16 v19, v4

    .line 229
    .line 230
    move v3, v6

    .line 231
    goto :goto_a

    .line 232
    :cond_a
    invoke-virtual {v8, v5}, Llg1;->r(I)I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_e

    .line 237
    .line 238
    if-eq v3, v0, :cond_d

    .line 239
    .line 240
    if-eq v3, v5, :cond_c

    .line 241
    .line 242
    if-eq v3, v14, :cond_b

    .line 243
    .line 244
    move/from16 v19, v4

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_b
    invoke-virtual {v8, v13}, Llg1;->r(I)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    add-int/lit8 v3, v3, 0x19

    .line 252
    .line 253
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    goto :goto_9

    .line 258
    :cond_c
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    add-int/lit8 v3, v3, 0x9

    .line 263
    .line 264
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    goto :goto_9

    .line 269
    :cond_d
    move/from16 v19, v4

    .line 270
    .line 271
    move/from16 v18, v5

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_e
    move/from16 v18, v0

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :goto_a
    if-eqz v18, :cond_10

    .line 278
    .line 279
    if-eqz v7, :cond_10

    .line 280
    .line 281
    add-int/lit8 v4, v9, 0x1

    .line 282
    .line 283
    int-to-float v6, v9

    .line 284
    if-eqz v17, :cond_f

    .line 285
    .line 286
    aget-byte v3, v17, v3

    .line 287
    .line 288
    :cond_f
    int-to-float v4, v4

    .line 289
    aget v3, p1, v3

    .line 290
    .line 291
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 292
    .line 293
    .line 294
    int-to-float v3, v2

    .line 295
    add-int v5, v2, v18

    .line 296
    .line 297
    int-to-float v5, v5

    .line 298
    move v15, v6

    .line 299
    move v6, v4

    .line 300
    move v4, v15

    .line 301
    move/from16 v20, v2

    .line 302
    .line 303
    const/4 v15, 0x2

    .line 304
    move-object/from16 v2, p6

    .line 305
    .line 306
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 307
    .line 308
    .line 309
    goto :goto_b

    .line 310
    :cond_10
    move/from16 v20, v2

    .line 311
    .line 312
    move v15, v5

    .line 313
    :goto_b
    add-int v2, v20, v18

    .line 314
    .line 315
    if-eqz v19, :cond_11

    .line 316
    .line 317
    invoke-virtual {v8}, Llg1;->w()V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_0

    .line 321
    .line 322
    :cond_11
    move v5, v15

    .line 323
    move/from16 v4, v19

    .line 324
    .line 325
    const/4 v15, 0x4

    .line 326
    goto/16 :goto_5

    .line 327
    .line 328
    :pswitch_5
    move v0, v4

    .line 329
    move v15, v5

    .line 330
    if-ne v1, v14, :cond_13

    .line 331
    .line 332
    if-nez v10, :cond_12

    .line 333
    .line 334
    sget-object v3, Luk1;->n:[B

    .line 335
    .line 336
    :goto_c
    move-object/from16 v17, v3

    .line 337
    .line 338
    goto :goto_d

    .line 339
    :cond_12
    move-object/from16 v17, v10

    .line 340
    .line 341
    goto :goto_d

    .line 342
    :cond_13
    if-ne v1, v15, :cond_15

    .line 343
    .line 344
    if-nez v12, :cond_14

    .line 345
    .line 346
    sget-object v3, Luk1;->m:[B

    .line 347
    .line 348
    goto :goto_c

    .line 349
    :cond_14
    move-object/from16 v17, v12

    .line 350
    .line 351
    goto :goto_d

    .line 352
    :cond_15
    const/16 v17, 0x0

    .line 353
    .line 354
    :goto_d
    move/from16 v4, v16

    .line 355
    .line 356
    :goto_e
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-eqz v3, :cond_16

    .line 361
    .line 362
    move/from16 v18, v0

    .line 363
    .line 364
    move v5, v3

    .line 365
    :goto_f
    move/from16 v19, v4

    .line 366
    .line 367
    :goto_10
    const/4 v3, 0x4

    .line 368
    goto/16 :goto_12

    .line 369
    .line 370
    :cond_16
    invoke-virtual {v8}, Llg1;->q()Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-eqz v3, :cond_17

    .line 375
    .line 376
    invoke-virtual {v8, v14}, Llg1;->r(I)I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    add-int/2addr v3, v14

    .line 381
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    :goto_11
    move/from16 v18, v3

    .line 386
    .line 387
    goto :goto_f

    .line 388
    :cond_17
    invoke-virtual {v8}, Llg1;->q()Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_18

    .line 393
    .line 394
    move/from16 v18, v0

    .line 395
    .line 396
    move/from16 v19, v4

    .line 397
    .line 398
    move/from16 v5, v16

    .line 399
    .line 400
    goto :goto_10

    .line 401
    :cond_18
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-eqz v3, :cond_1c

    .line 406
    .line 407
    if-eq v3, v0, :cond_1b

    .line 408
    .line 409
    if-eq v3, v15, :cond_1a

    .line 410
    .line 411
    if-eq v3, v14, :cond_19

    .line 412
    .line 413
    move/from16 v19, v4

    .line 414
    .line 415
    move/from16 v5, v16

    .line 416
    .line 417
    move/from16 v18, v5

    .line 418
    .line 419
    goto :goto_10

    .line 420
    :cond_19
    invoke-virtual {v8, v13}, Llg1;->r(I)I

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    add-int/lit8 v3, v3, 0x1d

    .line 425
    .line 426
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    goto :goto_11

    .line 431
    :cond_1a
    const/4 v3, 0x4

    .line 432
    invoke-virtual {v8, v3}, Llg1;->r(I)I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    add-int/lit8 v5, v5, 0xc

    .line 437
    .line 438
    invoke-virtual {v8, v15}, Llg1;->r(I)I

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    move/from16 v19, v4

    .line 443
    .line 444
    move/from16 v18, v5

    .line 445
    .line 446
    move v5, v6

    .line 447
    goto :goto_12

    .line 448
    :cond_1b
    const/4 v3, 0x4

    .line 449
    move/from16 v19, v4

    .line 450
    .line 451
    move/from16 v18, v15

    .line 452
    .line 453
    move/from16 v5, v16

    .line 454
    .line 455
    goto :goto_12

    .line 456
    :cond_1c
    const/4 v3, 0x4

    .line 457
    move/from16 v19, v0

    .line 458
    .line 459
    move/from16 v5, v16

    .line 460
    .line 461
    move/from16 v18, v5

    .line 462
    .line 463
    :goto_12
    if-eqz v18, :cond_1e

    .line 464
    .line 465
    if-eqz v7, :cond_1e

    .line 466
    .line 467
    add-int/lit8 v4, v9, 0x1

    .line 468
    .line 469
    int-to-float v6, v9

    .line 470
    if-eqz v17, :cond_1d

    .line 471
    .line 472
    aget-byte v5, v17, v5

    .line 473
    .line 474
    :cond_1d
    int-to-float v4, v4

    .line 475
    aget v5, p1, v5

    .line 476
    .line 477
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 478
    .line 479
    .line 480
    move v5, v3

    .line 481
    int-to-float v3, v2

    .line 482
    add-int v0, v2, v18

    .line 483
    .line 484
    int-to-float v0, v0

    .line 485
    move/from16 v21, v6

    .line 486
    .line 487
    move v6, v4

    .line 488
    move/from16 v4, v21

    .line 489
    .line 490
    move/from16 v21, v5

    .line 491
    .line 492
    move v5, v0

    .line 493
    move v0, v2

    .line 494
    move-object/from16 v2, p6

    .line 495
    .line 496
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 497
    .line 498
    .line 499
    goto :goto_13

    .line 500
    :cond_1e
    move v0, v2

    .line 501
    move/from16 v21, v3

    .line 502
    .line 503
    :goto_13
    add-int v2, v0, v18

    .line 504
    .line 505
    if-eqz v19, :cond_1f

    .line 506
    .line 507
    invoke-virtual {v8}, Llg1;->w()V

    .line 508
    .line 509
    .line 510
    :goto_14
    move-object/from16 v7, p5

    .line 511
    .line 512
    goto/16 :goto_0

    .line 513
    .line 514
    :cond_1f
    move-object/from16 v7, p5

    .line 515
    .line 516
    move/from16 v4, v19

    .line 517
    .line 518
    const/4 v0, 0x1

    .line 519
    goto/16 :goto_e

    .line 520
    .line 521
    :cond_20
    add-int/lit8 v9, v9, 0x2

    .line 522
    .line 523
    move/from16 v2, p3

    .line 524
    .line 525
    goto :goto_14

    .line 526
    :cond_21
    return-void

    .line 527
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static s(IILlg1;)[B
    .locals 3

    .line 1
    new-array v0, p0, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Llg1;->r(I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-byte v2, v2

    .line 11
    aput-byte v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Luk1;->j()Lgi1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b(FFLz90;)V
    .locals 3

    .line 1
    iget-object v0, p0, Luk1;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aput p1, v0, v1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    aput p2, v0, p1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Luk1;->d([F)V

    .line 12
    .line 13
    .line 14
    aget p2, v0, v1

    .line 15
    .line 16
    float-to-double v1, p2

    .line 17
    iput-wide v1, p3, Lz90;->g:D

    .line 18
    .line 19
    aget p1, v0, p1

    .line 20
    .line 21
    float-to-double p1, p1

    .line 22
    iput-wide p1, p3, Lz90;->h:D

    .line 23
    .line 24
    return-void
.end method

.method public c(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Luk1;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lu61;

    .line 11
    .line 12
    iget-object v0, v0, Lu61;->a:Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Luk1;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public d([F)V
    .locals 2

    .line 1
    iget-object v0, p0, Luk1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Luk1;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Luk1;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lu61;

    .line 21
    .line 22
    iget-object v1, v1, Lu61;->a:Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Luk1;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public e([F)V
    .locals 1

    .line 1
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Luk1;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lu61;

    .line 11
    .line 12
    iget-object v0, v0, Lu61;->a:Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Luk1;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public f()V
    .locals 4

    .line 1
    iget-object v0, p0, Luk1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu61;

    .line 4
    .line 5
    iget-object v1, p0, Luk1;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Lu61;->b:Landroid/graphics/RectF;

    .line 13
    .line 14
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 15
    .line 16
    iget v0, v0, Lu61;->d:F

    .line 17
    .line 18
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 19
    .line 20
    sub-float v2, v0, v2

    .line 21
    .line 22
    sub-float/2addr v0, v2

    .line 23
    invoke-virtual {v1, v3, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public g([BIILlk1;)V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Luk1;->h:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v9, v2

    .line 8
    check-cast v9, Landroid/graphics/Canvas;

    .line 9
    .line 10
    iget-object v2, v0, Luk1;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ltk1;

    .line 13
    .line 14
    add-int v3, v1, p3

    .line 15
    .line 16
    new-instance v4, Llg1;

    .line 17
    .line 18
    move-object/from16 v5, p1

    .line 19
    .line 20
    invoke-direct {v4, v3, v5}, Llg1;-><init>(I[B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v1}, Llg1;->l(I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v4}, Llg1;->f()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v3, 0x30

    .line 31
    .line 32
    const/4 v10, 0x3

    .line 33
    const/4 v12, 0x1

    .line 34
    const/4 v13, 0x2

    .line 35
    if-lt v1, v3, :cond_b

    .line 36
    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    invoke-virtual {v4, v1}, Llg1;->r(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v5, 0xf

    .line 44
    .line 45
    if-ne v3, v5, :cond_b

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Llg1;->r(I)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/16 v5, 0x10

    .line 52
    .line 53
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {v4}, Llg1;->i()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    add-int/2addr v8, v7

    .line 66
    mul-int/lit8 v14, v7, 0x8

    .line 67
    .line 68
    invoke-virtual {v4}, Llg1;->f()I

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    if-le v14, v15, :cond_0

    .line 73
    .line 74
    const-string v1, "Data field length exceeds limit"

    .line 75
    .line 76
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Llg1;->f()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v4, v1}, Llg1;->o(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const/4 v14, 0x4

    .line 88
    packed-switch v3, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :pswitch_0
    iget v1, v2, Ltk1;->a:I

    .line 94
    .line 95
    if-ne v6, v1, :cond_a

    .line 96
    .line 97
    invoke-virtual {v4, v14}, Llg1;->o(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Llg1;->q()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v4, v10}, Llg1;->o(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-eqz v1, :cond_1

    .line 116
    .line 117
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    move/from16 v16, v1

    .line 134
    .line 135
    move/from16 v17, v3

    .line 136
    .line 137
    move/from16 v18, v5

    .line 138
    .line 139
    move v15, v11

    .line 140
    goto :goto_1

    .line 141
    :cond_1
    move/from16 v16, v13

    .line 142
    .line 143
    move/from16 v18, v14

    .line 144
    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    :goto_1
    new-instance v12, Lok1;

    .line 149
    .line 150
    invoke-direct/range {v12 .. v18}, Lok1;-><init>(IIIIII)V

    .line 151
    .line 152
    .line 153
    iput-object v12, v2, Ltk1;->h:Lok1;

    .line 154
    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    :pswitch_1
    iget v1, v2, Ltk1;->a:I

    .line 158
    .line 159
    if-ne v6, v1, :cond_2

    .line 160
    .line 161
    invoke-static {v4}, Luk1;->l(Llg1;)Lpk1;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iget-object v3, v2, Ltk1;->e:Landroid/util/SparseArray;

    .line 166
    .line 167
    iget v5, v1, Lpk1;->a:I

    .line 168
    .line 169
    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :cond_2
    iget v1, v2, Ltk1;->b:I

    .line 175
    .line 176
    if-ne v6, v1, :cond_a

    .line 177
    .line 178
    invoke-static {v4}, Luk1;->l(Llg1;)Lpk1;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iget-object v3, v2, Ltk1;->g:Landroid/util/SparseArray;

    .line 183
    .line 184
    iget v5, v1, Lpk1;->a:I

    .line 185
    .line 186
    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_7

    .line 190
    .line 191
    :pswitch_2
    iget v1, v2, Ltk1;->a:I

    .line 192
    .line 193
    if-ne v6, v1, :cond_3

    .line 194
    .line 195
    invoke-static {v4, v7}, Luk1;->k(Llg1;I)Lnk1;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    iget-object v3, v2, Ltk1;->d:Landroid/util/SparseArray;

    .line 200
    .line 201
    iget v5, v1, Lnk1;->a:I

    .line 202
    .line 203
    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_7

    .line 207
    .line 208
    :cond_3
    iget v1, v2, Ltk1;->b:I

    .line 209
    .line 210
    if-ne v6, v1, :cond_a

    .line 211
    .line 212
    invoke-static {v4, v7}, Luk1;->k(Llg1;I)Lnk1;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iget-object v3, v2, Ltk1;->f:Landroid/util/SparseArray;

    .line 217
    .line 218
    iget v5, v1, Lnk1;->a:I

    .line 219
    .line 220
    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_7

    .line 224
    .line 225
    :pswitch_3
    iget-object v3, v2, Ltk1;->i:Lpi1;

    .line 226
    .line 227
    iget-object v15, v2, Ltk1;->c:Landroid/util/SparseArray;

    .line 228
    .line 229
    iget v11, v2, Ltk1;->a:I

    .line 230
    .line 231
    if-ne v6, v11, :cond_a

    .line 232
    .line 233
    if-eqz v3, :cond_a

    .line 234
    .line 235
    invoke-virtual {v4, v1}, Llg1;->r(I)I

    .line 236
    .line 237
    .line 238
    move-result v17

    .line 239
    invoke-virtual {v4, v14}, Llg1;->o(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4}, Llg1;->q()Z

    .line 243
    .line 244
    .line 245
    move-result v18

    .line 246
    invoke-virtual {v4, v10}, Llg1;->o(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 250
    .line 251
    .line 252
    move-result v19

    .line 253
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 254
    .line 255
    .line 256
    move-result v20

    .line 257
    invoke-virtual {v4, v10}, Llg1;->r(I)I

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v10}, Llg1;->r(I)I

    .line 261
    .line 262
    .line 263
    move-result v21

    .line 264
    invoke-virtual {v4, v13}, Llg1;->o(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v1}, Llg1;->r(I)I

    .line 268
    .line 269
    .line 270
    move-result v22

    .line 271
    invoke-virtual {v4, v1}, Llg1;->r(I)I

    .line 272
    .line 273
    .line 274
    move-result v23

    .line 275
    invoke-virtual {v4, v14}, Llg1;->r(I)I

    .line 276
    .line 277
    .line 278
    move-result v24

    .line 279
    invoke-virtual {v4, v13}, Llg1;->r(I)I

    .line 280
    .line 281
    .line 282
    move-result v25

    .line 283
    invoke-virtual {v4, v13}, Llg1;->o(I)V

    .line 284
    .line 285
    .line 286
    add-int/lit8 v7, v7, -0xa

    .line 287
    .line 288
    new-instance v6, Landroid/util/SparseArray;

    .line 289
    .line 290
    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    .line 291
    .line 292
    .line 293
    :goto_2
    if-lez v7, :cond_6

    .line 294
    .line 295
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    invoke-virtual {v4, v13}, Llg1;->r(I)I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    invoke-virtual {v4, v13}, Llg1;->r(I)I

    .line 304
    .line 305
    .line 306
    const/16 v5, 0xc

    .line 307
    .line 308
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-virtual {v4, v14}, Llg1;->o(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v4, v5}, Llg1;->r(I)I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    add-int/lit8 v16, v7, -0x6

    .line 320
    .line 321
    if-eq v11, v12, :cond_4

    .line 322
    .line 323
    if-ne v11, v13, :cond_5

    .line 324
    .line 325
    :cond_4
    const/16 v11, 0x8

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_5
    move/from16 v7, v16

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :goto_3
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    .line 335
    .line 336
    .line 337
    add-int/lit8 v7, v7, -0x8

    .line 338
    .line 339
    :goto_4
    new-instance v11, Lsk1;

    .line 340
    .line 341
    invoke-direct {v11, v1, v5}, Lsk1;-><init>(II)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v6, v10, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    const/16 v1, 0x8

    .line 348
    .line 349
    const/16 v5, 0x10

    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_6
    new-instance v16, Lrk1;

    .line 353
    .line 354
    move-object/from16 v26, v6

    .line 355
    .line 356
    invoke-direct/range {v16 .. v26}, Lrk1;-><init>(IZIIIIIIILandroid/util/SparseArray;)V

    .line 357
    .line 358
    .line 359
    move-object/from16 v5, v16

    .line 360
    .line 361
    move/from16 v1, v17

    .line 362
    .line 363
    iget v3, v3, Lpi1;->g:I

    .line 364
    .line 365
    if-nez v3, :cond_7

    .line 366
    .line 367
    invoke-virtual {v15, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    check-cast v1, Lrk1;

    .line 372
    .line 373
    if-eqz v1, :cond_7

    .line 374
    .line 375
    const/4 v11, 0x0

    .line 376
    :goto_5
    iget-object v3, v1, Lrk1;->j:Landroid/util/SparseArray;

    .line 377
    .line 378
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-ge v11, v6, :cond_7

    .line 383
    .line 384
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->keyAt(I)I

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, Lsk1;

    .line 393
    .line 394
    iget-object v7, v5, Lrk1;->j:Landroid/util/SparseArray;

    .line 395
    .line 396
    invoke-virtual {v7, v6, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    add-int/lit8 v11, v11, 0x1

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_7
    iget v1, v5, Lrk1;->a:I

    .line 403
    .line 404
    invoke-virtual {v15, v1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    goto :goto_7

    .line 408
    :pswitch_4
    iget v1, v2, Ltk1;->a:I

    .line 409
    .line 410
    if-ne v6, v1, :cond_a

    .line 411
    .line 412
    iget-object v1, v2, Ltk1;->i:Lpi1;

    .line 413
    .line 414
    const/16 v11, 0x8

    .line 415
    .line 416
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v14}, Llg1;->r(I)I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    invoke-virtual {v4, v13}, Llg1;->r(I)I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    invoke-virtual {v4, v13}, Llg1;->o(I)V

    .line 428
    .line 429
    .line 430
    add-int/lit8 v7, v7, -0x2

    .line 431
    .line 432
    new-instance v6, Landroid/util/SparseArray;

    .line 433
    .line 434
    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    .line 435
    .line 436
    .line 437
    :goto_6
    if-lez v7, :cond_8

    .line 438
    .line 439
    invoke-virtual {v4, v11}, Llg1;->r(I)I

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    invoke-virtual {v4, v11}, Llg1;->o(I)V

    .line 444
    .line 445
    .line 446
    const/16 v12, 0x10

    .line 447
    .line 448
    invoke-virtual {v4, v12}, Llg1;->r(I)I

    .line 449
    .line 450
    .line 451
    move-result v13

    .line 452
    invoke-virtual {v4, v12}, Llg1;->r(I)I

    .line 453
    .line 454
    .line 455
    move-result v14

    .line 456
    new-instance v15, Lqk1;

    .line 457
    .line 458
    invoke-direct {v15, v13, v14}, Lqk1;-><init>(II)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v6, v10, v15}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    add-int/lit8 v7, v7, -0x6

    .line 465
    .line 466
    goto :goto_6

    .line 467
    :cond_8
    new-instance v7, Lpi1;

    .line 468
    .line 469
    invoke-direct {v7, v3, v6, v5}, Lpi1;-><init>(ILjava/lang/Object;I)V

    .line 470
    .line 471
    .line 472
    if-eqz v5, :cond_9

    .line 473
    .line 474
    iput-object v7, v2, Ltk1;->i:Lpi1;

    .line 475
    .line 476
    iget-object v1, v2, Ltk1;->c:Landroid/util/SparseArray;

    .line 477
    .line 478
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 479
    .line 480
    .line 481
    iget-object v1, v2, Ltk1;->d:Landroid/util/SparseArray;

    .line 482
    .line 483
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 484
    .line 485
    .line 486
    iget-object v1, v2, Ltk1;->e:Landroid/util/SparseArray;

    .line 487
    .line 488
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 489
    .line 490
    .line 491
    goto :goto_7

    .line 492
    :cond_9
    if-eqz v1, :cond_a

    .line 493
    .line 494
    iget v1, v1, Lpi1;->f:I

    .line 495
    .line 496
    if-eq v1, v3, :cond_a

    .line 497
    .line 498
    iput-object v7, v2, Ltk1;->i:Lpi1;

    .line 499
    .line 500
    :cond_a
    :goto_7
    invoke-virtual {v4}, Llg1;->i()I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    sub-int/2addr v8, v1

    .line 505
    invoke-virtual {v4, v8}, Llg1;->x(I)V

    .line 506
    .line 507
    .line 508
    goto/16 :goto_0

    .line 509
    .line 510
    :cond_b
    iget-object v1, v2, Ltk1;->i:Lpi1;

    .line 511
    .line 512
    if-nez v1, :cond_c

    .line 513
    .line 514
    new-instance v3, Lgk1;

    .line 515
    .line 516
    sget-object v1, Lxm3;->g:Lvm3;

    .line 517
    .line 518
    sget-object v4, Lsn3;->j:Lsn3;

    .line 519
    .line 520
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    move-wide v7, v5

    .line 526
    invoke-direct/range {v3 .. v8}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 527
    .line 528
    .line 529
    :goto_8
    move-object/from16 v1, p4

    .line 530
    .line 531
    goto/16 :goto_12

    .line 532
    .line 533
    :cond_c
    iget-object v3, v2, Ltk1;->h:Lok1;

    .line 534
    .line 535
    if-nez v3, :cond_d

    .line 536
    .line 537
    iget-object v3, v0, Luk1;->i:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v3, Lok1;

    .line 540
    .line 541
    :cond_d
    move-object v11, v3

    .line 542
    iget-object v3, v0, Luk1;->l:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v3, Landroid/graphics/Bitmap;

    .line 545
    .line 546
    if-eqz v3, :cond_e

    .line 547
    .line 548
    iget v4, v11, Lok1;->a:I

    .line 549
    .line 550
    add-int/2addr v4, v12

    .line 551
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-ne v4, v3, :cond_e

    .line 556
    .line 557
    iget v3, v11, Lok1;->b:I

    .line 558
    .line 559
    add-int/2addr v3, v12

    .line 560
    iget-object v4, v0, Luk1;->l:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v4, Landroid/graphics/Bitmap;

    .line 563
    .line 564
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-eq v3, v4, :cond_f

    .line 569
    .line 570
    :cond_e
    iget v3, v11, Lok1;->a:I

    .line 571
    .line 572
    add-int/2addr v3, v12

    .line 573
    iget v4, v11, Lok1;->b:I

    .line 574
    .line 575
    add-int/2addr v4, v12

    .line 576
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 577
    .line 578
    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    iput-object v3, v0, Luk1;->l:Ljava/lang/Object;

    .line 583
    .line 584
    invoke-virtual {v9, v3}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 585
    .line 586
    .line 587
    :cond_f
    new-instance v15, Ljava/util/ArrayList;

    .line 588
    .line 589
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 590
    .line 591
    .line 592
    iget-object v1, v1, Lpi1;->h:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v1, Landroid/util/SparseArray;

    .line 595
    .line 596
    const/4 v14, 0x0

    .line 597
    :goto_9
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    if-ge v14, v3, :cond_1a

    .line 602
    .line 603
    invoke-virtual {v9}, Landroid/graphics/Canvas;->save()I

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    check-cast v3, Lqk1;

    .line 611
    .line 612
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->keyAt(I)I

    .line 613
    .line 614
    .line 615
    move-result v4

    .line 616
    iget-object v5, v2, Ltk1;->c:Landroid/util/SparseArray;

    .line 617
    .line 618
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    check-cast v4, Lrk1;

    .line 623
    .line 624
    iget v5, v3, Lqk1;->a:I

    .line 625
    .line 626
    iget v6, v11, Lok1;->c:I

    .line 627
    .line 628
    add-int/2addr v5, v6

    .line 629
    iget v3, v3, Lqk1;->b:I

    .line 630
    .line 631
    iget v6, v11, Lok1;->e:I

    .line 632
    .line 633
    add-int/2addr v3, v6

    .line 634
    iget v6, v4, Lrk1;->c:I

    .line 635
    .line 636
    add-int v7, v5, v6

    .line 637
    .line 638
    iget v8, v11, Lok1;->d:I

    .line 639
    .line 640
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 641
    .line 642
    .line 643
    move-result v8

    .line 644
    move/from16 p2, v12

    .line 645
    .line 646
    iget v12, v4, Lrk1;->d:I

    .line 647
    .line 648
    add-int v13, v3, v12

    .line 649
    .line 650
    iget v10, v11, Lok1;->f:I

    .line 651
    .line 652
    invoke-static {v13, v10}, Ljava/lang/Math;->min(II)I

    .line 653
    .line 654
    .line 655
    move-result v10

    .line 656
    invoke-virtual {v9, v5, v3, v8, v10}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 657
    .line 658
    .line 659
    iget v8, v4, Lrk1;->f:I

    .line 660
    .line 661
    iget-object v10, v2, Ltk1;->d:Landroid/util/SparseArray;

    .line 662
    .line 663
    invoke-virtual {v10, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v10

    .line 667
    check-cast v10, Lnk1;

    .line 668
    .line 669
    if-nez v10, :cond_10

    .line 670
    .line 671
    iget-object v10, v2, Ltk1;->f:Landroid/util/SparseArray;

    .line 672
    .line 673
    invoke-virtual {v10, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v8

    .line 677
    move-object v10, v8

    .line 678
    check-cast v10, Lnk1;

    .line 679
    .line 680
    if-nez v10, :cond_10

    .line 681
    .line 682
    iget-object v8, v0, Luk1;->j:Ljava/lang/Object;

    .line 683
    .line 684
    move-object v10, v8

    .line 685
    check-cast v10, Lnk1;

    .line 686
    .line 687
    :cond_10
    iget-object v8, v4, Lrk1;->j:Landroid/util/SparseArray;

    .line 688
    .line 689
    move-object/from16 v17, v1

    .line 690
    .line 691
    move/from16 v18, v3

    .line 692
    .line 693
    const/4 v1, 0x0

    .line 694
    :goto_a
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    if-ge v1, v3, :cond_16

    .line 699
    .line 700
    invoke-virtual {v8, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    invoke-virtual {v8, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v19

    .line 708
    move/from16 v20, v1

    .line 709
    .line 710
    move-object/from16 v1, v19

    .line 711
    .line 712
    check-cast v1, Lsk1;

    .line 713
    .line 714
    move/from16 v19, v5

    .line 715
    .line 716
    iget-object v5, v2, Ltk1;->e:Landroid/util/SparseArray;

    .line 717
    .line 718
    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    check-cast v5, Lpk1;

    .line 723
    .line 724
    if-nez v5, :cond_11

    .line 725
    .line 726
    iget-object v5, v2, Ltk1;->g:Landroid/util/SparseArray;

    .line 727
    .line 728
    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    move-object v5, v3

    .line 733
    check-cast v5, Lpk1;

    .line 734
    .line 735
    :cond_11
    move-object v3, v5

    .line 736
    if-eqz v3, :cond_15

    .line 737
    .line 738
    iget-boolean v5, v3, Lpk1;->b:Z

    .line 739
    .line 740
    if-eqz v5, :cond_12

    .line 741
    .line 742
    const/4 v5, 0x0

    .line 743
    :goto_b
    move-object/from16 v21, v2

    .line 744
    .line 745
    goto :goto_c

    .line 746
    :cond_12
    iget-object v5, v0, Luk1;->f:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v5, Landroid/graphics/Paint;

    .line 749
    .line 750
    goto :goto_b

    .line 751
    :goto_c
    iget v2, v4, Lrk1;->e:I

    .line 752
    .line 753
    move-object/from16 v22, v4

    .line 754
    .line 755
    iget v4, v1, Lsk1;->a:I

    .line 756
    .line 757
    add-int v4, v19, v4

    .line 758
    .line 759
    iget v1, v1, Lsk1;->b:I

    .line 760
    .line 761
    add-int v1, v18, v1

    .line 762
    .line 763
    move/from16 v23, v1

    .line 764
    .line 765
    const/4 v1, 0x3

    .line 766
    if-ne v2, v1, :cond_13

    .line 767
    .line 768
    iget-object v1, v10, Lnk1;->d:[I

    .line 769
    .line 770
    :goto_d
    move-object/from16 v24, v1

    .line 771
    .line 772
    move-object v1, v3

    .line 773
    goto :goto_e

    .line 774
    :cond_13
    const/4 v1, 0x2

    .line 775
    if-ne v2, v1, :cond_14

    .line 776
    .line 777
    iget-object v1, v10, Lnk1;->c:[I

    .line 778
    .line 779
    goto :goto_d

    .line 780
    :cond_14
    iget-object v1, v10, Lnk1;->b:[I

    .line 781
    .line 782
    goto :goto_d

    .line 783
    :goto_e
    iget-object v3, v1, Lpk1;->c:[B

    .line 784
    .line 785
    move/from16 v40, v12

    .line 786
    .line 787
    move-object v12, v1

    .line 788
    move-object/from16 v1, v22

    .line 789
    .line 790
    move-object/from16 v22, v11

    .line 791
    .line 792
    move v11, v7

    .line 793
    move/from16 v7, v23

    .line 794
    .line 795
    move-object/from16 v23, v8

    .line 796
    .line 797
    move-object v8, v5

    .line 798
    move v5, v2

    .line 799
    move/from16 v2, v19

    .line 800
    .line 801
    move-object/from16 v19, v15

    .line 802
    .line 803
    move v15, v6

    .line 804
    move v6, v4

    .line 805
    move-object/from16 v4, v24

    .line 806
    .line 807
    move/from16 v24, v40

    .line 808
    .line 809
    move/from16 v40, v18

    .line 810
    .line 811
    move/from16 v18, v14

    .line 812
    .line 813
    move/from16 v14, v40

    .line 814
    .line 815
    invoke-static/range {v3 .. v9}, Luk1;->r([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 816
    .line 817
    .line 818
    iget-object v3, v12, Lpk1;->d:[B

    .line 819
    .line 820
    add-int/lit8 v7, v7, 0x1

    .line 821
    .line 822
    invoke-static/range {v3 .. v9}, Luk1;->r([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 823
    .line 824
    .line 825
    goto :goto_f

    .line 826
    :cond_15
    move/from16 v1, v18

    .line 827
    .line 828
    move/from16 v18, v14

    .line 829
    .line 830
    move v14, v1

    .line 831
    move-object/from16 v21, v2

    .line 832
    .line 833
    move-object v1, v4

    .line 834
    move-object/from16 v23, v8

    .line 835
    .line 836
    move-object/from16 v22, v11

    .line 837
    .line 838
    move/from16 v24, v12

    .line 839
    .line 840
    move/from16 v2, v19

    .line 841
    .line 842
    move v11, v7

    .line 843
    move-object/from16 v19, v15

    .line 844
    .line 845
    move v15, v6

    .line 846
    :goto_f
    add-int/lit8 v3, v20, 0x1

    .line 847
    .line 848
    move/from16 v4, v18

    .line 849
    .line 850
    move/from16 v18, v14

    .line 851
    .line 852
    move v14, v4

    .line 853
    move-object v4, v1

    .line 854
    move v5, v2

    .line 855
    move v1, v3

    .line 856
    move v7, v11

    .line 857
    move v6, v15

    .line 858
    move-object/from16 v15, v19

    .line 859
    .line 860
    move-object/from16 v2, v21

    .line 861
    .line 862
    move-object/from16 v11, v22

    .line 863
    .line 864
    move-object/from16 v8, v23

    .line 865
    .line 866
    move/from16 v12, v24

    .line 867
    .line 868
    goto/16 :goto_a

    .line 869
    .line 870
    :cond_16
    move/from16 v1, v18

    .line 871
    .line 872
    move/from16 v18, v14

    .line 873
    .line 874
    move v14, v1

    .line 875
    move-object/from16 v21, v2

    .line 876
    .line 877
    move-object v1, v4

    .line 878
    move v2, v5

    .line 879
    move-object/from16 v22, v11

    .line 880
    .line 881
    move/from16 v24, v12

    .line 882
    .line 883
    move-object/from16 v19, v15

    .line 884
    .line 885
    move v15, v6

    .line 886
    move v11, v7

    .line 887
    int-to-float v5, v14

    .line 888
    int-to-float v4, v2

    .line 889
    iget-boolean v3, v1, Lrk1;->b:Z

    .line 890
    .line 891
    if-eqz v3, :cond_19

    .line 892
    .line 893
    iget v3, v1, Lrk1;->e:I

    .line 894
    .line 895
    const/4 v12, 0x3

    .line 896
    if-ne v3, v12, :cond_17

    .line 897
    .line 898
    iget-object v3, v10, Lnk1;->d:[I

    .line 899
    .line 900
    iget v1, v1, Lrk1;->g:I

    .line 901
    .line 902
    aget v1, v3, v1

    .line 903
    .line 904
    const/4 v6, 0x2

    .line 905
    goto :goto_10

    .line 906
    :cond_17
    const/4 v6, 0x2

    .line 907
    if-ne v3, v6, :cond_18

    .line 908
    .line 909
    iget-object v3, v10, Lnk1;->c:[I

    .line 910
    .line 911
    iget v1, v1, Lrk1;->h:I

    .line 912
    .line 913
    aget v1, v3, v1

    .line 914
    .line 915
    goto :goto_10

    .line 916
    :cond_18
    iget-object v3, v10, Lnk1;->b:[I

    .line 917
    .line 918
    iget v1, v1, Lrk1;->i:I

    .line 919
    .line 920
    aget v1, v3, v1

    .line 921
    .line 922
    :goto_10
    iget-object v3, v0, Luk1;->g:Ljava/lang/Object;

    .line 923
    .line 924
    move-object v8, v3

    .line 925
    check-cast v8, Landroid/graphics/Paint;

    .line 926
    .line 927
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 928
    .line 929
    .line 930
    int-to-float v7, v13

    .line 931
    int-to-float v1, v11

    .line 932
    move v3, v6

    .line 933
    move v6, v1

    .line 934
    move v1, v3

    .line 935
    move-object v3, v9

    .line 936
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 937
    .line 938
    .line 939
    goto :goto_11

    .line 940
    :cond_19
    const/4 v1, 0x2

    .line 941
    const/4 v12, 0x3

    .line 942
    :goto_11
    iget-object v3, v0, Luk1;->l:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v3, Landroid/graphics/Bitmap;

    .line 945
    .line 946
    move/from16 v6, v24

    .line 947
    .line 948
    invoke-static {v3, v2, v14, v15, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 949
    .line 950
    .line 951
    move-result-object v27

    .line 952
    move-object/from16 v3, v22

    .line 953
    .line 954
    iget v2, v3, Lok1;->a:I

    .line 955
    .line 956
    int-to-float v2, v2

    .line 957
    div-float v31, v4, v2

    .line 958
    .line 959
    iget v4, v3, Lok1;->b:I

    .line 960
    .line 961
    int-to-float v4, v4

    .line 962
    div-float v28, v5, v4

    .line 963
    .line 964
    int-to-float v5, v15

    .line 965
    div-float v35, v5, v2

    .line 966
    .line 967
    int-to-float v2, v6

    .line 968
    div-float v36, v2, v4

    .line 969
    .line 970
    new-instance v23, Lfi2;

    .line 971
    .line 972
    const/16 v24, 0x0

    .line 973
    .line 974
    const/16 v25, 0x0

    .line 975
    .line 976
    const/16 v29, 0x0

    .line 977
    .line 978
    const/16 v30, 0x0

    .line 979
    .line 980
    const/16 v32, 0x0

    .line 981
    .line 982
    const/high16 v33, -0x80000000

    .line 983
    .line 984
    const v34, -0x800001

    .line 985
    .line 986
    .line 987
    const/16 v38, 0x0

    .line 988
    .line 989
    const/16 v39, 0x0

    .line 990
    .line 991
    move-object/from16 v26, v25

    .line 992
    .line 993
    move/from16 v37, v33

    .line 994
    .line 995
    invoke-direct/range {v23 .. v39}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 996
    .line 997
    .line 998
    move-object/from16 v15, v19

    .line 999
    .line 1000
    move-object/from16 v2, v23

    .line 1001
    .line 1002
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 1006
    .line 1007
    const/4 v4, 0x0

    .line 1008
    invoke-virtual {v9, v4, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v9}, Landroid/graphics/Canvas;->restore()V

    .line 1012
    .line 1013
    .line 1014
    add-int/lit8 v14, v18, 0x1

    .line 1015
    .line 1016
    move v13, v1

    .line 1017
    move-object v11, v3

    .line 1018
    move v10, v12

    .line 1019
    move-object/from16 v1, v17

    .line 1020
    .line 1021
    move-object/from16 v2, v21

    .line 1022
    .line 1023
    move/from16 v12, p2

    .line 1024
    .line 1025
    goto/16 :goto_9

    .line 1026
    .line 1027
    :cond_1a
    new-instance v14, Lgk1;

    .line 1028
    .line 1029
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    move-wide/from16 v18, v16

    .line 1035
    .line 1036
    invoke-direct/range {v14 .. v19}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 1037
    .line 1038
    .line 1039
    move-object v3, v14

    .line 1040
    goto/16 :goto_8

    .line 1041
    .line 1042
    :goto_12
    invoke-virtual {v1, v3}, Llk1;->c(Ljava/lang/Object;)V

    .line 1043
    .line 1044
    .line 1045
    return-void

    .line 1046
    nop

    .line 1047
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(FFFF)V
    .locals 3

    .line 1
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Matrix;

    .line 4
    .line 5
    iget-object v1, p0, Luk1;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lu61;

    .line 8
    .line 9
    iget-object v2, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    div-float/2addr v2, p2

    .line 16
    iget-object p2, v1, Lu61;->b:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    div-float/2addr p2, p3

    .line 23
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    move v2, v1

    .line 31
    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    move p2, v1

    .line 38
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 39
    .line 40
    .line 41
    neg-float p1, p1

    .line 42
    neg-float p3, p4

    .line 43
    invoke-virtual {v0, p1, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 44
    .line 45
    .line 46
    neg-float p1, p2

    .line 47
    invoke-virtual {v0, v2, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public i()V
    .locals 8

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, Lxe4;->b()Lxe4;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    sget-object v2, Lsv1;->f:Lsv1;

    .line 10
    .line 11
    iget-object v3, v2, Lsv1;->b:Lbu1;

    .line 12
    .line 13
    iget-object v2, p0, Luk1;->g:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v2

    .line 16
    check-cast v4, Landroid/content/Context;

    .line 17
    .line 18
    iget-object v2, p0, Luk1;->h:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v2

    .line 21
    check-cast v6, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Luk1;->k:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v2

    .line 26
    check-cast v7, Ls62;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, Lxl1;

    .line 32
    .line 33
    invoke-direct/range {v2 .. v7}, Lxl1;-><init>(Lbu1;Landroid/content/Context;Lxe4;Ljava/lang/String;Lu62;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v2, v4, v3}, Lzu1;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lba2;

    .line 42
    .line 43
    iput-object v2, p0, Luk1;->f:Ljava/lang/Object;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    iget-object v3, p0, Luk1;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Le13;

    .line 50
    .line 51
    iput-wide v0, v3, Le13;->m:J

    .line 52
    .line 53
    new-instance v0, Lgw1;

    .line 54
    .line 55
    iget-object v1, p0, Luk1;->j:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lbx2;

    .line 58
    .line 59
    invoke-direct {v0, v1, v6}, Lgw1;-><init>(Lbx2;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v2, v0}, Lba2;->K2(Lnw1;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lba2;

    .line 68
    .line 69
    iget-object v1, p0, Luk1;->l:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lfr;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v3}, Lfr;->o(Landroid/content/Context;Le13;)Lpc4;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v0, v1}, Lba2;->Z(Lpc4;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :catch_0
    move-exception v0

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    return-void

    .line 87
    :goto_0
    const-string v1, "#007 Could not call remote method."

    .line 88
    .line 89
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public j()Lgi1;
    .locals 10

    .line 1
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lax0;

    .line 4
    .line 5
    iget-object v0, v0, Lax0;->f:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Landroid/app/Application;

    .line 9
    .line 10
    iget-object v0, p0, Luk1;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lls2;

    .line 13
    .line 14
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljf1;

    .line 19
    .line 20
    sget-object v3, Lok2;->a:Landroid/os/Handler;

    .line 21
    .line 22
    invoke-static {v3}, Lpu1;->s(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v4, Lok2;->b:Ldk2;

    .line 26
    .line 27
    invoke-static {v4}, Lpu1;->s(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Luk1;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lls2;

    .line 33
    .line 34
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v5, v0

    .line 39
    check-cast v5, Lmo1;

    .line 40
    .line 41
    iget-object v0, p0, Luk1;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lls2;

    .line 44
    .line 45
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v6, v0

    .line 50
    check-cast v6, Lz42;

    .line 51
    .line 52
    iget-object v0, p0, Luk1;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Llv2;

    .line 55
    .line 56
    invoke-virtual {v0}, Llv2;->h()Lwt2;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget-object v0, p0, Luk1;->k:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lxb4;

    .line 63
    .line 64
    invoke-virtual {v0}, Lxb4;->D()Ljr3;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    iget-object v0, p0, Luk1;->l:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lls2;

    .line 71
    .line 72
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v9, v0

    .line 77
    check-cast v9, Llx2;

    .line 78
    .line 79
    new-instance v1, Lgi1;

    .line 80
    .line 81
    invoke-direct/range {v1 .. v9}, Lgi1;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v1
.end method

.method public n()Ld24;
    .locals 11

    .line 1
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le24;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iget-object v1, p0, Luk1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lx34;

    .line 10
    .line 11
    if-eqz v1, :cond_a

    .line 12
    .line 13
    iget-object v2, p0, Luk1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lx34;

    .line 16
    .line 17
    if-eqz v2, :cond_a

    .line 18
    .line 19
    iget-object v3, p0, Luk1;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lx34;

    .line 22
    .line 23
    if-eqz v3, :cond_9

    .line 24
    .line 25
    iget-object v4, p0, Luk1;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lx34;

    .line 28
    .line 29
    if-eqz v4, :cond_8

    .line 30
    .line 31
    iget-object v5, p0, Luk1;->k:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, Lx34;

    .line 34
    .line 35
    if-eqz v5, :cond_8

    .line 36
    .line 37
    iget-object v6, p0, Luk1;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, Lx34;

    .line 40
    .line 41
    if-eqz v6, :cond_7

    .line 42
    .line 43
    iget-object v7, v0, Le24;->j:Lc24;

    .line 44
    .line 45
    iget-object v7, v7, Lc24;->b:Ljava/math/BigInteger;

    .line 46
    .line 47
    iget-object v0, v0, Le24;->k:Ljava/math/BigInteger;

    .line 48
    .line 49
    iget-object v1, v1, Lx34;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/math/BigInteger;

    .line 52
    .line 53
    iget-object v2, v2, Lx34;->f:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/math/BigInteger;

    .line 56
    .line 57
    iget-object v3, v3, Lx34;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Ljava/math/BigInteger;

    .line 60
    .line 61
    iget-object v4, v4, Lx34;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Ljava/math/BigInteger;

    .line 64
    .line 65
    iget-object v5, v5, Lx34;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v5, Ljava/math/BigInteger;

    .line 68
    .line 69
    iget-object v6, v6, Lx34;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Ljava/math/BigInteger;

    .line 72
    .line 73
    const/16 v8, 0xa

    .line 74
    .line 75
    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_6

    .line 80
    .line 81
    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_5

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v8, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3, v10}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_3

    .line 132
    .line 133
    invoke-virtual {v7, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_2

    .line 146
    .line 147
    invoke-virtual {v7, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_1

    .line 160
    .line 161
    invoke-virtual {v2, v6}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_0

    .line 174
    .line 175
    new-instance v1, Ld24;

    .line 176
    .line 177
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 178
    .line 179
    move-object v2, v0

    .line 180
    check-cast v2, Le24;

    .line 181
    .line 182
    iget-object v0, p0, Luk1;->h:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v3, v0

    .line 185
    check-cast v3, Lx34;

    .line 186
    .line 187
    iget-object v0, p0, Luk1;->i:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v4, v0

    .line 190
    check-cast v4, Lx34;

    .line 191
    .line 192
    iget-object v0, p0, Luk1;->g:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v5, v0

    .line 195
    check-cast v5, Lx34;

    .line 196
    .line 197
    iget-object v0, p0, Luk1;->j:Ljava/lang/Object;

    .line 198
    .line 199
    move-object v6, v0

    .line 200
    check-cast v6, Lx34;

    .line 201
    .line 202
    iget-object v0, p0, Luk1;->k:Ljava/lang/Object;

    .line 203
    .line 204
    move-object v7, v0

    .line 205
    check-cast v7, Lx34;

    .line 206
    .line 207
    iget-object v0, p0, Luk1;->l:Ljava/lang/Object;

    .line 208
    .line 209
    move-object v8, v0

    .line 210
    check-cast v8, Lx34;

    .line 211
    .line 212
    invoke-direct/range {v1 .. v8}, Ld24;-><init>(Le24;Lx34;Lx34;Lx34;Lx34;Lx34;Lx34;)V

    .line 213
    .line 214
    .line 215
    return-object v1

    .line 216
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 217
    .line 218
    const-string v1, "qInv is invalid."

    .line 219
    .line 220
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 225
    .line 226
    const-string v1, "dQ is invalid."

    .line 227
    .line 228
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 233
    .line 234
    const-string v1, "dP is invalid."

    .line 235
    .line 236
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v0

    .line 240
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 241
    .line 242
    const-string v1, "D is invalid."

    .line 243
    .line 244
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 249
    .line 250
    const-string v1, "Prime p times prime q is not equal to the public key\'s modulus"

    .line 251
    .line 252
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 257
    .line 258
    const-string v1, "q is not a prime"

    .line 259
    .line 260
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0

    .line 264
    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 265
    .line 266
    const-string v1, "p is not a prime"

    .line 267
    .line 268
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 273
    .line 274
    const-string v1, "Cannot build without CRT coefficient"

    .line 275
    .line 276
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 281
    .line 282
    const-string v1, "Cannot build without prime exponents"

    .line 283
    .line 284
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 289
    .line 290
    const-string v1, "Cannot build without private exponent"

    .line 291
    .line 292
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 297
    .line 298
    const-string v1, "Cannot build without prime factors"

    .line 299
    .line 300
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 305
    .line 306
    const-string v1, "Cannot build without a RSA SSA PKCS1 public key"

    .line 307
    .line 308
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0
.end method

.method public o()Lk24;
    .locals 11

    .line 1
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll24;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iget-object v1, p0, Luk1;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lx34;

    .line 10
    .line 11
    if-eqz v1, :cond_a

    .line 12
    .line 13
    iget-object v2, p0, Luk1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lx34;

    .line 16
    .line 17
    if-eqz v2, :cond_a

    .line 18
    .line 19
    iget-object v3, p0, Luk1;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lx34;

    .line 22
    .line 23
    if-eqz v3, :cond_9

    .line 24
    .line 25
    iget-object v4, p0, Luk1;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lx34;

    .line 28
    .line 29
    if-eqz v4, :cond_8

    .line 30
    .line 31
    iget-object v5, p0, Luk1;->k:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, Lx34;

    .line 34
    .line 35
    if-eqz v5, :cond_8

    .line 36
    .line 37
    iget-object v6, p0, Luk1;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, Lx34;

    .line 40
    .line 41
    if-eqz v6, :cond_7

    .line 42
    .line 43
    iget-object v7, v0, Ll24;->j:Lj24;

    .line 44
    .line 45
    iget-object v7, v7, Lj24;->b:Ljava/math/BigInteger;

    .line 46
    .line 47
    iget-object v0, v0, Ll24;->k:Ljava/math/BigInteger;

    .line 48
    .line 49
    iget-object v1, v1, Lx34;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/math/BigInteger;

    .line 52
    .line 53
    iget-object v2, v2, Lx34;->f:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/math/BigInteger;

    .line 56
    .line 57
    iget-object v3, v3, Lx34;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Ljava/math/BigInteger;

    .line 60
    .line 61
    iget-object v4, v4, Lx34;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Ljava/math/BigInteger;

    .line 64
    .line 65
    iget-object v5, v5, Lx34;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v5, Ljava/math/BigInteger;

    .line 68
    .line 69
    iget-object v6, v6, Lx34;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Ljava/math/BigInteger;

    .line 72
    .line 73
    const/16 v8, 0xa

    .line 74
    .line 75
    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_6

    .line 80
    .line 81
    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_5

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-virtual {v8, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3, v10}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_3

    .line 132
    .line 133
    invoke-virtual {v7, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_2

    .line 146
    .line 147
    invoke-virtual {v7, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_1

    .line 160
    .line 161
    invoke-virtual {v2, v6}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_0

    .line 174
    .line 175
    new-instance v1, Lk24;

    .line 176
    .line 177
    iget-object v0, p0, Luk1;->f:Ljava/lang/Object;

    .line 178
    .line 179
    move-object v2, v0

    .line 180
    check-cast v2, Ll24;

    .line 181
    .line 182
    iget-object v0, p0, Luk1;->h:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v3, v0

    .line 185
    check-cast v3, Lx34;

    .line 186
    .line 187
    iget-object v0, p0, Luk1;->i:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v4, v0

    .line 190
    check-cast v4, Lx34;

    .line 191
    .line 192
    iget-object v0, p0, Luk1;->g:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v5, v0

    .line 195
    check-cast v5, Lx34;

    .line 196
    .line 197
    iget-object v0, p0, Luk1;->j:Ljava/lang/Object;

    .line 198
    .line 199
    move-object v6, v0

    .line 200
    check-cast v6, Lx34;

    .line 201
    .line 202
    iget-object v0, p0, Luk1;->k:Ljava/lang/Object;

    .line 203
    .line 204
    move-object v7, v0

    .line 205
    check-cast v7, Lx34;

    .line 206
    .line 207
    iget-object v0, p0, Luk1;->l:Ljava/lang/Object;

    .line 208
    .line 209
    move-object v8, v0

    .line 210
    check-cast v8, Lx34;

    .line 211
    .line 212
    invoke-direct/range {v1 .. v8}, Lk24;-><init>(Ll24;Lx34;Lx34;Lx34;Lx34;Lx34;Lx34;)V

    .line 213
    .line 214
    .line 215
    return-object v1

    .line 216
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 217
    .line 218
    const-string v1, "qInv is invalid."

    .line 219
    .line 220
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 225
    .line 226
    const-string v1, "dQ is invalid."

    .line 227
    .line 228
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 233
    .line 234
    const-string v1, "dP is invalid."

    .line 235
    .line 236
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v0

    .line 240
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 241
    .line 242
    const-string v1, "D is invalid."

    .line 243
    .line 244
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 249
    .line 250
    const-string v1, "Prime p times prime q is not equal to the public key\'s modulus"

    .line 251
    .line 252
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 257
    .line 258
    const-string v1, "q is not a prime"

    .line 259
    .line 260
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0

    .line 264
    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 265
    .line 266
    const-string v1, "p is not a prime"

    .line 267
    .line 268
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 273
    .line 274
    const-string v1, "Cannot build without CRT coefficient"

    .line 275
    .line 276
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 281
    .line 282
    const-string v1, "Cannot build without prime exponents"

    .line 283
    .line 284
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 289
    .line 290
    const-string v1, "Cannot build without private exponent"

    .line 291
    .line 292
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 297
    .line 298
    const-string v1, "Cannot build without prime factors"

    .line 299
    .line 300
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 305
    .line 306
    const-string v1, "Cannot build without a RSA SSA PKCS1 public key"

    .line 307
    .line 308
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v0
.end method
