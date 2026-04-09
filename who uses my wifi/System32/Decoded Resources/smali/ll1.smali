.class public final Lll1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkk1;


# instance fields
.field public final f:Lkz2;

.field public final g:Z

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:F

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkz2;

    .line 5
    .line 6
    invoke-direct {v0}, Lkz2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lll1;->f:Lkz2;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v1, 0x3f59999a    # 0.85f

    .line 16
    .line 17
    .line 18
    const-string v2, "sans-serif"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-ne v0, v4, :cond_4

    .line 23
    .line 24
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, [B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    const/16 v5, 0x30

    .line 32
    .line 33
    if-eq v0, v5, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [B

    .line 40
    .line 41
    array-length v0, v0

    .line 42
    const/16 v5, 0x35

    .line 43
    .line 44
    if-ne v0, v5, :cond_4

    .line 45
    .line 46
    :cond_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [B

    .line 51
    .line 52
    const/16 v0, 0x18

    .line 53
    .line 54
    aget-byte v5, p1, v0

    .line 55
    .line 56
    iput v5, p0, Lll1;->h:I

    .line 57
    .line 58
    const/16 v5, 0x1a

    .line 59
    .line 60
    aget-byte v5, p1, v5

    .line 61
    .line 62
    and-int/lit16 v5, v5, 0xff

    .line 63
    .line 64
    const/16 v6, 0x1b

    .line 65
    .line 66
    aget-byte v6, p1, v6

    .line 67
    .line 68
    and-int/lit16 v6, v6, 0xff

    .line 69
    .line 70
    const/16 v7, 0x1c

    .line 71
    .line 72
    aget-byte v7, p1, v7

    .line 73
    .line 74
    and-int/lit16 v7, v7, 0xff

    .line 75
    .line 76
    const/16 v8, 0x1d

    .line 77
    .line 78
    aget-byte v8, p1, v8

    .line 79
    .line 80
    and-int/lit16 v8, v8, 0xff

    .line 81
    .line 82
    shl-int/lit8 v0, v5, 0x18

    .line 83
    .line 84
    shl-int/lit8 v5, v6, 0x10

    .line 85
    .line 86
    or-int/2addr v0, v5

    .line 87
    shl-int/lit8 v5, v7, 0x8

    .line 88
    .line 89
    or-int/2addr v0, v5

    .line 90
    or-int/2addr v0, v8

    .line 91
    iput v0, p0, Lll1;->i:I

    .line 92
    .line 93
    array-length v0, p1

    .line 94
    add-int/lit8 v0, v0, -0x2b

    .line 95
    .line 96
    new-instance v5, Ljava/lang/String;

    .line 97
    .line 98
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 99
    .line 100
    const/16 v7, 0x2b

    .line 101
    .line 102
    invoke-direct {v5, p1, v7, v0, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "Serif"

    .line 106
    .line 107
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eq v4, v0, :cond_1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    const-string v2, "serif"

    .line 115
    .line 116
    :goto_0
    iput-object v2, p0, Lll1;->j:Ljava/lang/String;

    .line 117
    .line 118
    const/16 v0, 0x19

    .line 119
    .line 120
    aget-byte v0, p1, v0

    .line 121
    .line 122
    mul-int/lit8 v0, v0, 0x14

    .line 123
    .line 124
    iput v0, p0, Lll1;->l:I

    .line 125
    .line 126
    aget-byte v2, p1, v3

    .line 127
    .line 128
    and-int/lit8 v2, v2, 0x20

    .line 129
    .line 130
    if-eqz v2, :cond_2

    .line 131
    .line 132
    move v3, v4

    .line 133
    :cond_2
    iput-boolean v3, p0, Lll1;->g:Z

    .line 134
    .line 135
    if-eqz v3, :cond_3

    .line 136
    .line 137
    const/16 v1, 0xa

    .line 138
    .line 139
    aget-byte v1, p1, v1

    .line 140
    .line 141
    and-int/lit16 v1, v1, 0xff

    .line 142
    .line 143
    shl-int/lit8 v1, v1, 0x8

    .line 144
    .line 145
    const/16 v2, 0xb

    .line 146
    .line 147
    aget-byte p1, p1, v2

    .line 148
    .line 149
    and-int/lit16 p1, p1, 0xff

    .line 150
    .line 151
    int-to-float v0, v0

    .line 152
    or-int/2addr p1, v1

    .line 153
    int-to-float p1, p1

    .line 154
    div-float/2addr p1, v0

    .line 155
    const v0, 0x3f733333    # 0.95f

    .line 156
    .line 157
    .line 158
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    const/4 v0, 0x0

    .line 163
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    iput p1, p0, Lll1;->k:F

    .line 168
    .line 169
    return-void

    .line 170
    :cond_3
    iput v1, p0, Lll1;->k:F

    .line 171
    .line 172
    return-void

    .line 173
    :cond_4
    iput v3, p0, Lll1;->h:I

    .line 174
    .line 175
    const/4 p1, -0x1

    .line 176
    iput p1, p0, Lll1;->i:I

    .line 177
    .line 178
    iput-object v2, p0, Lll1;->j:Ljava/lang/String;

    .line 179
    .line 180
    iput-boolean v3, p0, Lll1;->g:Z

    .line 181
    .line 182
    iput v1, p0, Lll1;->k:F

    .line 183
    .line 184
    iput p1, p0, Lll1;->l:I

    .line 185
    .line 186
    return-void
.end method

.method public static a(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 4

    .line 1
    if-eq p1, p2, :cond_4

    .line 2
    .line 3
    or-int/lit8 p2, p5, 0x21

    .line 4
    .line 5
    and-int/lit8 p5, p1, 0x1

    .line 6
    .line 7
    and-int/lit8 v0, p1, 0x2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz p5, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 31
    .line 32
    .line 33
    :cond_1
    move v2, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 44
    .line 45
    .line 46
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    if-nez p5, :cond_4

    .line 51
    .line 52
    if-nez v2, :cond_4

    .line 53
    .line 54
    new-instance p1, Landroid/text/style/StyleSpan;

    .line 55
    .line 56
    invoke-direct {p1, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    new-instance p1, Landroid/text/style/UnderlineSpan;

    .line 64
    .line 65
    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 69
    .line 70
    .line 71
    :cond_4
    return-void
.end method

.method public static b(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 1

    .line 1
    if-eq p1, p2, :cond_0

    .line 2
    .line 3
    and-int/lit16 p2, p1, 0xff

    .line 4
    .line 5
    shl-int/lit8 p2, p2, 0x18

    .line 6
    .line 7
    ushr-int/lit8 p1, p1, 0x8

    .line 8
    .line 9
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 10
    .line 11
    or-int/2addr p1, p2

    .line 12
    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 13
    .line 14
    .line 15
    or-int/lit8 p1, p5, 0x21

    .line 16
    .line 17
    invoke-virtual {p0, v0, p3, p4, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final g([BIILlk1;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    add-int v3, v1, p3

    .line 8
    .line 9
    iget-object v4, v0, Lll1;->f:Lkz2;

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    invoke-virtual {v4, v3, v5}, Lkz2;->z(I[B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v1}, Lkz2;->E(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Lkz2;->B()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    const/4 v6, 0x2

    .line 26
    if-lt v1, v6, :cond_0

    .line 27
    .line 28
    move v1, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v3

    .line 31
    :goto_0
    invoke-static {v1}, Lzt0;->D(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Lkz2;->L()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const-string v1, ""

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    iget v7, v4, Lkz2;->b:I

    .line 44
    .line 45
    invoke-virtual {v4}, Lkz2;->q()Ljava/nio/charset/Charset;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    iget v9, v4, Lkz2;->b:I

    .line 50
    .line 51
    sub-int/2addr v9, v7

    .line 52
    if-eqz v8, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    :goto_1
    sub-int/2addr v1, v9

    .line 58
    invoke-virtual {v4, v1, v8}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_3

    .line 67
    .line 68
    new-instance v8, Lgk1;

    .line 69
    .line 70
    sget-object v1, Lxm3;->g:Lvm3;

    .line 71
    .line 72
    sget-object v9, Lsn3;->j:Lsn3;

    .line 73
    .line 74
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    move-wide v12, v10

    .line 80
    invoke-direct/range {v8 .. v13}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v8}, Llk1;->c(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    new-instance v9, Landroid/text/SpannableStringBuilder;

    .line 88
    .line 89
    invoke-direct {v9, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    const/high16 v14, 0xff0000

    .line 97
    .line 98
    iget v11, v0, Lll1;->h:I

    .line 99
    .line 100
    move v10, v11

    .line 101
    const/4 v11, 0x0

    .line 102
    const/4 v12, 0x0

    .line 103
    invoke-static/range {v9 .. v14}, Lll1;->a(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 104
    .line 105
    .line 106
    move v1, v10

    .line 107
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    iget v11, v0, Lll1;->i:I

    .line 112
    .line 113
    move v10, v11

    .line 114
    const/4 v11, -0x1

    .line 115
    invoke-static/range {v9 .. v14}, Lll1;->b(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 116
    .line 117
    .line 118
    move v7, v10

    .line 119
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    const-string v10, "sans-serif"

    .line 124
    .line 125
    iget-object v11, v0, Lll1;->j:Ljava/lang/String;

    .line 126
    .line 127
    if-eq v11, v10, :cond_4

    .line 128
    .line 129
    new-instance v10, Landroid/text/style/TypefaceSpan;

    .line 130
    .line 131
    invoke-direct {v10, v11}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const v11, 0xff0021

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v10, v3, v8, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 138
    .line 139
    .line 140
    :cond_4
    iget v8, v0, Lll1;->k:F

    .line 141
    .line 142
    :goto_3
    invoke-virtual {v4}, Lkz2;->B()I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    const/16 v11, 0x8

    .line 147
    .line 148
    if-lt v10, v11, :cond_d

    .line 149
    .line 150
    iget v15, v4, Lkz2;->b:I

    .line 151
    .line 152
    invoke-virtual {v4}, Lkz2;->b()I

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    invoke-virtual {v4}, Lkz2;->b()I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    const v11, 0x7374796c

    .line 161
    .line 162
    .line 163
    if-ne v10, v11, :cond_a

    .line 164
    .line 165
    invoke-virtual {v4}, Lkz2;->B()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-lt v10, v6, :cond_5

    .line 170
    .line 171
    move v10, v5

    .line 172
    goto :goto_4

    .line 173
    :cond_5
    move v10, v3

    .line 174
    :goto_4
    invoke-static {v10}, Lzt0;->D(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Lkz2;->L()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    move v11, v3

    .line 182
    :goto_5
    if-ge v11, v10, :cond_9

    .line 183
    .line 184
    invoke-virtual {v4}, Lkz2;->B()I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    const/16 v13, 0xc

    .line 189
    .line 190
    if-lt v12, v13, :cond_6

    .line 191
    .line 192
    move v12, v5

    .line 193
    goto :goto_6

    .line 194
    :cond_6
    move v12, v3

    .line 195
    :goto_6
    invoke-static {v12}, Lzt0;->D(Z)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Lkz2;->L()I

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    invoke-virtual {v4}, Lkz2;->L()I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    invoke-virtual {v4, v6}, Lkz2;->G(I)V

    .line 207
    .line 208
    .line 209
    move v14, v10

    .line 210
    invoke-virtual {v4}, Lkz2;->K()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual {v4, v5}, Lkz2;->G(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Lkz2;->b()I

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    const-string v5, ")."

    .line 226
    .line 227
    if-le v13, v3, :cond_7

    .line 228
    .line 229
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v18

    .line 237
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v18

    .line 241
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    move/from16 v19, v1

    .line 246
    .line 247
    add-int/lit8 v1, v18, 0x2c

    .line 248
    .line 249
    move/from16 v18, v7

    .line 250
    .line 251
    const/4 v7, 0x2

    .line 252
    invoke-static {v6, v1, v7}, Lga1;->i(Ljava/lang/String;II)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    new-instance v6, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 259
    .line 260
    .line 261
    const-string v1, "Truncating styl end ("

    .line 262
    .line 263
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v1, ") to cueText.length() ("

    .line 270
    .line 271
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    goto :goto_7

    .line 292
    :cond_7
    move/from16 v19, v1

    .line 293
    .line 294
    move/from16 v18, v7

    .line 295
    .line 296
    :goto_7
    if-lt v12, v13, :cond_8

    .line 297
    .line 298
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    add-int/lit8 v1, v1, 0x24

    .line 311
    .line 312
    const/4 v7, 0x2

    .line 313
    invoke-static {v3, v1, v7}, Lga1;->i(Ljava/lang/String;II)I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    new-instance v3, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 320
    .line 321
    .line 322
    const-string v1, "Ignoring styl with start ("

    .line 323
    .line 324
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v1, ") >= end ("

    .line 331
    .line 332
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    move v3, v11

    .line 349
    move v1, v14

    .line 350
    move/from16 v11, v18

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_8
    move v1, v14

    .line 354
    const/4 v14, 0x0

    .line 355
    move v3, v11

    .line 356
    move/from16 v11, v19

    .line 357
    .line 358
    invoke-static/range {v9 .. v14}, Lll1;->a(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 359
    .line 360
    .line 361
    move/from16 v10, v17

    .line 362
    .line 363
    move/from16 v11, v18

    .line 364
    .line 365
    invoke-static/range {v9 .. v14}, Lll1;->b(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 366
    .line 367
    .line 368
    :goto_8
    add-int/lit8 v3, v3, 0x1

    .line 369
    .line 370
    move v10, v1

    .line 371
    move v7, v11

    .line 372
    move/from16 v1, v19

    .line 373
    .line 374
    const/4 v5, 0x1

    .line 375
    const/4 v6, 0x2

    .line 376
    move v11, v3

    .line 377
    const/4 v3, 0x0

    .line 378
    goto/16 :goto_5

    .line 379
    .line 380
    :cond_9
    move/from16 v19, v1

    .line 381
    .line 382
    move v11, v7

    .line 383
    move v7, v6

    .line 384
    goto :goto_a

    .line 385
    :cond_a
    move/from16 v19, v1

    .line 386
    .line 387
    move v11, v7

    .line 388
    const v1, 0x74626f78

    .line 389
    .line 390
    .line 391
    if-ne v10, v1, :cond_c

    .line 392
    .line 393
    iget-boolean v1, v0, Lll1;->g:Z

    .line 394
    .line 395
    if-eqz v1, :cond_c

    .line 396
    .line 397
    invoke-virtual {v4}, Lkz2;->B()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    const/4 v7, 0x2

    .line 402
    if-lt v1, v7, :cond_b

    .line 403
    .line 404
    const/4 v1, 0x1

    .line 405
    goto :goto_9

    .line 406
    :cond_b
    const/4 v1, 0x0

    .line 407
    :goto_9
    invoke-static {v1}, Lzt0;->D(Z)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4}, Lkz2;->L()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    int-to-float v1, v1

    .line 415
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 416
    .line 417
    iget v3, v0, Lll1;->l:I

    .line 418
    .line 419
    int-to-float v3, v3

    .line 420
    div-float/2addr v1, v3

    .line 421
    const v3, 0x3f733333    # 0.95f

    .line 422
    .line 423
    .line 424
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    const/4 v3, 0x0

    .line 429
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    move v8, v1

    .line 434
    goto :goto_a

    .line 435
    :cond_c
    const/4 v7, 0x2

    .line 436
    :goto_a
    add-int v15, v15, v16

    .line 437
    .line 438
    invoke-virtual {v4, v15}, Lkz2;->E(I)V

    .line 439
    .line 440
    .line 441
    move v6, v7

    .line 442
    move v7, v11

    .line 443
    move/from16 v1, v19

    .line 444
    .line 445
    const/4 v3, 0x0

    .line 446
    const/4 v5, 0x1

    .line 447
    goto/16 :goto_3

    .line 448
    .line 449
    :cond_d
    new-instance v1, Lfi2;

    .line 450
    .line 451
    const/4 v11, 0x0

    .line 452
    const/4 v13, 0x0

    .line 453
    const/4 v15, 0x0

    .line 454
    const/16 v16, 0x0

    .line 455
    .line 456
    const v17, -0x800001

    .line 457
    .line 458
    .line 459
    const/high16 v18, -0x80000000

    .line 460
    .line 461
    const/16 v24, 0x0

    .line 462
    .line 463
    const/16 v25, 0x0

    .line 464
    .line 465
    move-object v12, v11

    .line 466
    move/from16 v19, v18

    .line 467
    .line 468
    move/from16 v20, v17

    .line 469
    .line 470
    move/from16 v21, v17

    .line 471
    .line 472
    move/from16 v22, v17

    .line 473
    .line 474
    move/from16 v23, v18

    .line 475
    .line 476
    move v14, v8

    .line 477
    move-object v10, v9

    .line 478
    move-object v9, v1

    .line 479
    invoke-direct/range {v9 .. v25}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 480
    .line 481
    .line 482
    new-instance v3, Lgk1;

    .line 483
    .line 484
    invoke-static {v9}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    move-wide v7, v5

    .line 494
    invoke-direct/range {v3 .. v8}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v3}, Llk1;->c(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    return-void
.end method
