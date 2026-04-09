.class public Lt90;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lt90;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [Lbk4;

    iput-object v0, p0, Lt90;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt90;->f:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lt90;->b:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lt90;->a:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, Lt90;->b:I

    if-lez p1, :cond_0

    .line 49
    new-instance p1, Lf23;

    invoke-direct {p1}, Lf23;-><init>()V

    iput-object p1, p0, Lt90;->f:Ljava/lang/Object;

    .line 50
    new-instance p1, Lpz;

    const/16 v0, 0x18

    .line 51
    invoke-direct {p1, v0}, Lpz;-><init>(I)V

    .line 52
    iput-object p1, p0, Lt90;->g:Ljava/lang/Object;

    return-void

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxSize <= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lt90;->a:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt90;->g:Ljava/lang/Object;

    .line 55
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lt90;->f:Ljava/lang/Object;

    const/high16 p1, -0x80000000

    .line 56
    iput p1, p0, Lt90;->b:I

    .line 57
    iput p1, p0, Lt90;->c:I

    const/4 p1, 0x0

    .line 58
    iput p1, p0, Lt90;->d:I

    .line 59
    iput p2, p0, Lt90;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lf2;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lt90;->a:I

    const-string v0, "binding"

    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lt90;->f:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lt90;->g:Ljava/lang/Object;

    const v0, 0x7f040125

    const/high16 v1, -0x1000000

    .line 5
    invoke-static {p1, v0, v1}, Li41;->h(Landroid/content/Context;II)I

    move-result v0

    const v1, 0x7f060035

    .line 6
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, p0, Lt90;->b:I

    const v1, 0x7f060036

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, p0, Lt90;->c:I

    const v1, 0x7f060037

    .line 8
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    iput v1, p0, Lt90;->d:I

    const v1, 0x7f060038

    .line 9
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result p1

    iput p1, p0, Lt90;->e:I

    .line 10
    iget-object p1, p2, Lf2;->h:Ljava/lang/Object;

    check-cast p1, Lcom/github/mikephil/charting/charts/LineChart;

    const/4 p2, 0x0

    .line 11
    invoke-virtual {p1, p2}, Lje;->setTouchEnabled(Z)V

    .line 12
    invoke-virtual {p1}, Lje;->getXAxis()Lcb1;

    move-result-object v1

    .line 13
    iput-boolean p2, v1, Ldh;->a:Z

    .line 14
    invoke-virtual {p1}, Lk9;->getAxisLeft()Leb1;

    move-result-object v1

    .line 15
    iput-boolean p2, v1, Ldh;->a:Z

    .line 16
    invoke-virtual {p1}, Lk9;->getAxisRight()Leb1;

    move-result-object v1

    .line 17
    iput-boolean p2, v1, Ldh;->a:Z

    .line 18
    invoke-virtual {p1, p2}, Lje;->setLogEnabled(Z)V

    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v1}, Lje;->setDescription(Llo;)V

    .line 20
    invoke-virtual {p1, p2}, Lk9;->setDragEnabled(Z)V

    .line 21
    invoke-virtual {p1, p2}, Lk9;->setScaleEnabled(Z)V

    .line 22
    invoke-virtual {p1, p2}, Lk9;->setDrawBorders(Z)V

    .line 23
    invoke-virtual {p1, p2}, Lk9;->setPinchZoom(Z)V

    .line 24
    invoke-virtual {p1, p2}, Lk9;->setDrawGridBackground(Z)V

    const/4 p2, 0x1

    .line 25
    invoke-virtual {p1, p2}, Lk9;->setAutoScaleMinMaxEnabled(Z)V

    .line 26
    invoke-virtual {p1}, Lk9;->getAxisLeft()Leb1;

    move-result-object v1

    const/4 v2, 0x0

    .line 27
    iput v2, v1, Leb1;->B:F

    .line 28
    invoke-virtual {p1}, Lk9;->getAxisLeft()Leb1;

    move-result-object v1

    .line 29
    iput v2, v1, Leb1;->A:F

    .line 30
    invoke-virtual {p1}, Lk9;->getAxisLeft()Leb1;

    move-result-object v1

    invoke-virtual {v1}, Ld9;->d()V

    .line 31
    invoke-virtual {p1}, Lk9;->getAxisRight()Leb1;

    move-result-object v1

    invoke-virtual {v1}, Ld9;->d()V

    .line 32
    invoke-virtual {p1}, Lk9;->getAxisRight()Leb1;

    move-result-object v1

    .line 33
    iput v2, v1, Leb1;->A:F

    .line 34
    invoke-virtual {p1}, Lk9;->getAxisRight()Leb1;

    move-result-object v1

    .line 35
    iput v2, v1, Leb1;->B:F

    .line 36
    new-instance v1, Lj60;

    invoke-direct {v1}, Lj60;-><init>()V

    .line 37
    invoke-virtual {p0, p2}, Lt90;->d(I)Ll60;

    move-result-object v2

    invoke-virtual {v1, v2}, Lle;->a(Ll60;)V

    const/4 v2, 0x2

    .line 38
    invoke-virtual {p0, v2}, Lt90;->d(I)Ll60;

    move-result-object v3

    invoke-virtual {v1, v3}, Lle;->a(Ll60;)V

    .line 39
    invoke-virtual {p1, v1}, Lje;->setData(Lle;)V

    .line 40
    invoke-virtual {p1}, Lje;->getLegend()Lk50;

    move-result-object p1

    const/4 v1, 0x6

    .line 41
    iput v1, p1, Lk50;->k:I

    const/high16 v1, 0x41400000    # 12.0f

    .line 42
    invoke-static {v1}, Lk41;->c(F)F

    move-result v1

    iput v1, p1, Ldh;->d:F

    .line 43
    iput v0, p1, Ldh;->e:I

    const/4 v0, 0x3

    .line 44
    iput v0, p1, Lk50;->h:I

    .line 45
    iput v2, p1, Lk50;->g:I

    :goto_0
    const/16 p1, 0xc

    if-ge p2, p1, :cond_0

    const-wide/16 v0, 0x0

    .line 46
    invoke-virtual {p0, v0, v1, v0, v1}, Lt90;->a(DD)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static i(D)Ljava/lang/String;
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "0.0 Bps"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "GBps"

    .line 11
    .line 12
    const-string v1, "TBps"

    .line 13
    .line 14
    const-string v2, "Bps"

    .line 15
    .line 16
    const-string v3, "KBps"

    .line 17
    .line 18
    const-string v4, "MBps"

    .line 19
    .line 20
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p0, p1}, Ljava/lang/Math;->log10(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    const-wide v3, 0x408f400000000000L    # 1000.0

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, Ljava/lang/Math;->log10(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v5

    .line 37
    div-double/2addr v1, v5

    .line 38
    double-to-int v1, v1

    .line 39
    new-instance v2, Ljava/text/DecimalFormat;

    .line 40
    .line 41
    const-string v5, "#,##0.#"

    .line 42
    .line 43
    invoke-direct {v2, v5}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    int-to-double v5, v1

    .line 47
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    div-double/2addr p0, v3

    .line 52
    invoke-virtual {v2, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    aget-object p1, v0, v1

    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p0, " "

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method


# virtual methods
.method public a(DD)V
    .locals 14

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    const v1, 0x7f12012b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static/range {p1 .. p2}, Lt90;->i(D)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ": "

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const v3, 0x7f120153

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static/range {p3 .. p4}, Lt90;->i(D)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Lt90;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lf2;

    .line 68
    .line 69
    iget-object v3, v1, Lf2;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Lcom/github/mikephil/charting/charts/LineChart;

    .line 72
    .line 73
    invoke-virtual {v3}, Lje;->getData()Lle;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Lj60;

    .line 78
    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    iget-object v4, v3, Lle;->i:Ljava/util/ArrayList;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    invoke-virtual {v3, v5}, Lle;->d(I)Lq10;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Ll60;

    .line 89
    .line 90
    const/4 v7, 0x1

    .line 91
    if-nez v6, :cond_0

    .line 92
    .line 93
    invoke-virtual {p0, v7}, Lt90;->d(I)Ll60;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v3, v6}, Lle;->a(Ll60;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    invoke-virtual {v3, v7}, Lle;->d(I)Lq10;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    check-cast v8, Ll60;

    .line 105
    .line 106
    if-nez v8, :cond_1

    .line 107
    .line 108
    const/4 v8, 0x2

    .line 109
    invoke-virtual {p0, v8}, Lt90;->d(I)Ll60;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v3, v8}, Lle;->a(Ll60;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    const/16 v9, 0x1f40

    .line 117
    .line 118
    int-to-double v9, v9

    .line 119
    cmpg-double v11, p1, v9

    .line 120
    .line 121
    if-gez v11, :cond_2

    .line 122
    .line 123
    const-wide/16 v12, 0x0

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    move-wide v12, p1

    .line 127
    :goto_0
    cmpg-double v9, p3, v9

    .line 128
    .line 129
    if-gez v9, :cond_3

    .line 130
    .line 131
    const-wide/16 v9, 0x0

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move-wide/from16 v9, p3

    .line 135
    .line 136
    :goto_1
    new-instance v11, Lxs;

    .line 137
    .line 138
    iget-object v6, v6, Ll60;->o:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    int-to-float v6, v6

    .line 145
    double-to-float v12, v12

    .line 146
    invoke-direct {v11, v6, v12}, Lxs;-><init>(FF)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v11, v5}, Lle;->b(Lxs;I)V

    .line 150
    .line 151
    .line 152
    new-instance v6, Lxs;

    .line 153
    .line 154
    iget-object v8, v8, Ll60;->o:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    int-to-float v8, v8

    .line 161
    double-to-float v9, v9

    .line 162
    invoke-direct {v6, v8, v9}, Lxs;-><init>(FF)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v6, v7}, Lle;->b(Lxs;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    move v8, v5

    .line 173
    :goto_2
    if-ge v8, v6, :cond_4

    .line 174
    .line 175
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    add-int/lit8 v8, v8, 0x1

    .line 180
    .line 181
    check-cast v9, Lq10;

    .line 182
    .line 183
    check-cast v9, Ll60;

    .line 184
    .line 185
    iput-boolean v5, v9, Ll60;->j:Z

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    iget-object v1, v1, Lf2;->h:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, Lcom/github/mikephil/charting/charts/LineChart;

    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, Ll60;

    .line 197
    .line 198
    iput-object v2, v5, Ll60;->c:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ll60;

    .line 205
    .line 206
    iput-object v0, v2, Ll60;->c:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v1}, Lk9;->d()V

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41200000    # 10.0f

    .line 212
    .line 213
    invoke-virtual {v1, v0}, Lk9;->setVisibleXRangeMaximum(F)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Lle;->e()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    int-to-float v0, v0

    .line 221
    iget-object v2, v1, Lje;->w:Lu61;

    .line 222
    .line 223
    iget-object v3, v1, Lk9;->e0:Luk1;

    .line 224
    .line 225
    sget-object v4, Lbf0;->l:Lni0;

    .line 226
    .line 227
    invoke-virtual {v4}, Lni0;->b()Lmi0;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Lbf0;

    .line 232
    .line 233
    iput-object v2, v4, Lv61;->h:Lu61;

    .line 234
    .line 235
    iput v0, v4, Lv61;->i:F

    .line 236
    .line 237
    iput-object v3, v4, Lv61;->j:Luk1;

    .line 238
    .line 239
    iput-object v1, v4, Lv61;->k:Landroid/view/View;

    .line 240
    .line 241
    iget v0, v2, Lu61;->d:F

    .line 242
    .line 243
    const/4 v3, 0x0

    .line 244
    cmpl-float v0, v0, v3

    .line 245
    .line 246
    if-lez v0, :cond_5

    .line 247
    .line 248
    iget v0, v2, Lu61;->c:F

    .line 249
    .line 250
    cmpl-float v0, v0, v3

    .line 251
    .line 252
    if-lez v0, :cond_5

    .line 253
    .line 254
    invoke-virtual {v1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_5
    iget-object v0, v1, Lje;->F:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    :goto_3
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 264
    .line 265
    .line 266
    :cond_6
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lrx0;

    .line 22
    .line 23
    iget-object v2, p0, Lt90;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Lnr;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Lnr;->b(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Lt90;->c:I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    const/high16 v0, -0x80000000

    .line 9
    .line 10
    iput v0, p0, Lt90;->b:I

    .line 11
    .line 12
    iput v0, p0, Lt90;->c:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lt90;->d:I

    .line 16
    .line 17
    return-void
.end method

.method public d(I)Ll60;
    .locals 4

    .line 1
    new-instance v0, Ll60;

    .line 2
    .line 3
    invoke-direct {v0}, Ll60;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    iput v1, v0, Ll60;->B:I

    .line 8
    .line 9
    const v1, 0x3d4ccccd    # 0.05f

    .line 10
    .line 11
    .line 12
    iput v1, v0, Ll60;->G:F

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Ll60;->A:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, v0, Ll60;->J:Z

    .line 19
    .line 20
    const/high16 v3, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-static {v3}, Lk41;->c(F)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iput v3, v0, Ll60;->z:F

    .line 27
    .line 28
    const/16 v3, 0x64

    .line 29
    .line 30
    iput v3, v0, Ll60;->y:I

    .line 31
    .line 32
    iput-boolean v2, v0, Ll60;->v:Z

    .line 33
    .line 34
    if-ne p1, v1, :cond_0

    .line 35
    .line 36
    iget p1, p0, Lt90;->b:I

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ll60;->e(I)V

    .line 39
    .line 40
    .line 41
    iget p1, p0, Lt90;->c:I

    .line 42
    .line 43
    iput p1, v0, Ll60;->x:I

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    new-instance p1, Landroid/graphics/DashPathEffect;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    new-array v1, v1, [F

    .line 50
    .line 51
    fill-array-data v1, :array_0

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct {p1, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 56
    .line 57
    .line 58
    iput-object p1, v0, Ll60;->H:Landroid/graphics/DashPathEffect;

    .line 59
    .line 60
    iget p1, p0, Lt90;->d:I

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ll60;->e(I)V

    .line 63
    .line 64
    .line 65
    iget p1, p0, Lt90;->e:I

    .line 66
    .line 67
    iput p1, v0, Ll60;->x:I

    .line 68
    .line 69
    return-object v0

    .line 70
    nop

    .line 71
    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method public e()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lt90;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 8
    .line 9
    iget-boolean v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {p0, v0, v1}, Lt90;->g(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v1, v0}, Lt90;->g(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0
.end method

.method public f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lt90;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 8
    .line 9
    iget-boolean v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v1, v0}, Lt90;->g(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    invoke-virtual {p0, v0, v1}, Lt90;->g(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0
.end method

.method public g(II)I
    .locals 11

    .line 1
    iget-object v0, p0, Lt90;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Lnr;

    .line 6
    .line 7
    invoke-virtual {v1}, Lnr;->k()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Lnr;

    .line 12
    .line 13
    invoke-virtual {v2}, Lnr;->g()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x1

    .line 19
    if-le p2, p1, :cond_0

    .line 20
    .line 21
    move v5, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v5, v3

    .line 24
    :goto_0
    if-eq p1, p2, :cond_5

    .line 25
    .line 26
    iget-object v6, p0, Lt90;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, Landroid/view/View;

    .line 35
    .line 36
    iget-object v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Lnr;

    .line 37
    .line 38
    invoke-virtual {v7, v6}, Lnr;->e(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-object v8, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Lnr;

    .line 43
    .line 44
    invoke-virtual {v8, v6}, Lnr;->b(Landroid/view/View;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x0

    .line 49
    if-gt v7, v2, :cond_1

    .line 50
    .line 51
    move v10, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v10, v9

    .line 54
    :goto_1
    if-lt v8, v1, :cond_2

    .line 55
    .line 56
    move v9, v4

    .line 57
    :cond_2
    if-eqz v10, :cond_4

    .line 58
    .line 59
    if-eqz v9, :cond_4

    .line 60
    .line 61
    if-lt v7, v1, :cond_3

    .line 62
    .line 63
    if-le v8, v2, :cond_4

    .line 64
    .line 65
    :cond_3
    invoke-static {v6}, Lho0;->H(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_4
    add-int/2addr p1, v5

    .line 71
    goto :goto_0

    .line 72
    :cond_5
    return v3
.end method

.method public h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt90;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lpz;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lf23;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lf23;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget v1, p0, Lt90;->d:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    iput v1, p0, Lt90;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object p1

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    :try_start_1
    iget p1, p0, Lt90;->e:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    iput p1, p0, Lt90;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :goto_0
    monitor-exit v0

    .line 48
    throw p1
.end method

.method public j(I)I
    .locals 2

    .line 1
    iget v0, p0, Lt90;->c:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    invoke-virtual {p0}, Lt90;->b()V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lt90;->c:I

    .line 23
    .line 24
    return p1
.end method

.method public k(II)Landroid/view/View;
    .locals 6

    .line 1
    iget-object v0, p0, Lt90;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne p2, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, p2, :cond_2

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Landroid/view/View;

    .line 25
    .line 26
    iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-static {v4}, Lho0;->H(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-le v5, p1, :cond_2

    .line 35
    .line 36
    :cond_0
    iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 37
    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    invoke-static {v4}, Lho0;->H(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-lt v5, p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->hasFocusable()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    move-object v3, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-object v3

    .line 58
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    add-int/lit8 p2, p2, -0x1

    .line 63
    .line 64
    :goto_2
    if-ltz p2, :cond_6

    .line 65
    .line 66
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/view/View;

    .line 71
    .line 72
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-static {v2}, Lho0;->H(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-ge v4, p1, :cond_6

    .line 81
    .line 82
    :cond_4
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 83
    .line 84
    if-nez v4, :cond_5

    .line 85
    .line 86
    invoke-static {v2}, Lho0;->H(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-gt v4, p1, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_6

    .line 98
    .line 99
    add-int/lit8 p2, p2, -0x1

    .line 100
    .line 101
    move-object v3, v2

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    :goto_3
    return-object v3
.end method

.method public l(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget v1, p0, Lt90;->b:I

    .line 6
    .line 7
    const/high16 v2, -0x80000000

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lrx0;

    .line 31
    .line 32
    iget-object v1, p0, Lt90;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 35
    .line 36
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Lnr;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Lnr;->e(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Lt90;->b:I

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget p1, p0, Lt90;->b:I

    .line 48
    .line 49
    return p1
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt90;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lpz;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget v1, p0, Lt90;->c:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    iput v1, p0, Lt90;->c:I

    .line 21
    .line 22
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lf23;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, v1, Lf23;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget p2, p0, Lt90;->c:I

    .line 40
    .line 41
    add-int/lit8 p2, p2, -0x1

    .line 42
    .line 43
    iput p2, p0, Lt90;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_0
    :goto_0
    monitor-exit v0

    .line 50
    iget p2, p0, Lt90;->b:I

    .line 51
    .line 52
    :goto_1
    iget-object v0, p0, Lt90;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lpz;

    .line 55
    .line 56
    monitor-enter v0

    .line 57
    :try_start_1
    iget v1, p0, Lt90;->c:I

    .line 58
    .line 59
    if-ltz v1, :cond_8

    .line 60
    .line 61
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lf23;

    .line 64
    .line 65
    iget-object v1, v1, Lf23;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    iget v1, p0, Lt90;->c:I

    .line 76
    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    goto/16 :goto_5

    .line 82
    .line 83
    :cond_1
    :goto_2
    iget v1, p0, Lt90;->c:I

    .line 84
    .line 85
    if-le v1, p2, :cond_7

    .line 86
    .line 87
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Lf23;

    .line 90
    .line 91
    iget-object v1, v1, Lf23;->g:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_2

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_2
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lf23;

    .line 105
    .line 106
    iget-object v1, v1, Lf23;->g:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v2, "map.entries"

    .line 115
    .line 116
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    instance-of v2, v1, Ljava/util/List;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    if-eqz v2, :cond_4

    .line 123
    .line 124
    check-cast v1, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_3

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    const/4 v2, 0x0

    .line 134
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    goto :goto_3

    .line 139
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_5

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    :goto_3
    check-cast v3, Ljava/util/Map$Entry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 155
    .line 156
    if-nez v3, :cond_6

    .line 157
    .line 158
    monitor-exit v0

    .line 159
    return-object p1

    .line 160
    :cond_6
    :try_start_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iget-object v3, p0, Lt90;->f:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, Lf23;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const-string v4, "key"

    .line 176
    .line 177
    invoke-static {v1, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-object v3, v3, Lf23;->g:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    invoke-virtual {v3, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    iget v1, p0, Lt90;->c:I

    .line 188
    .line 189
    const-string v3, "value"

    .line 190
    .line 191
    invoke-static {v2, v3}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v1, v1, -0x1

    .line 195
    .line 196
    iput v1, p0, Lt90;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 197
    .line 198
    monitor-exit v0

    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_7
    :goto_4
    monitor-exit v0

    .line 202
    return-object p1

    .line 203
    :cond_8
    :try_start_3
    const-string p1, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 204
    .line 205
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 206
    .line 207
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 211
    :goto_5
    monitor-exit v0

    .line 212
    throw p1

    .line 213
    :goto_6
    monitor-exit v0

    .line 214
    throw p1
.end method

.method public n(IF)V
    .locals 5

    .line 1
    iget-object v0, p0, Lt90;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lbk4;

    .line 4
    .line 5
    iget-object v1, p0, Lt90;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget v2, p0, Lt90;->b:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    sget-object v2, Lbk;->v:Lbk;

    .line 15
    .line 16
    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 17
    .line 18
    .line 19
    iput v3, p0, Lt90;->b:I

    .line 20
    .line 21
    :cond_0
    iget v2, p0, Lt90;->e:I

    .line 22
    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    iput v2, p0, Lt90;->e:I

    .line 28
    .line 29
    aget-object v2, v0, v2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance v2, Lbk4;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget v3, p0, Lt90;->c:I

    .line 38
    .line 39
    add-int/lit8 v4, v3, 0x1

    .line 40
    .line 41
    iput v4, p0, Lt90;->c:I

    .line 42
    .line 43
    iput v3, v2, Lbk4;->a:I

    .line 44
    .line 45
    iput p1, v2, Lbk4;->b:I

    .line 46
    .line 47
    iput p2, v2, Lbk4;->c:F

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget p2, p0, Lt90;->d:I

    .line 53
    .line 54
    add-int/2addr p2, p1

    .line 55
    iput p2, p0, Lt90;->d:I

    .line 56
    .line 57
    :cond_2
    :goto_1
    iget p1, p0, Lt90;->d:I

    .line 58
    .line 59
    const/16 p2, 0x7d0

    .line 60
    .line 61
    if-le p1, p2, :cond_4

    .line 62
    .line 63
    add-int/lit16 p1, p1, -0x7d0

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lbk4;

    .line 71
    .line 72
    iget v3, v2, Lbk4;->b:I

    .line 73
    .line 74
    if-gt v3, p1, :cond_3

    .line 75
    .line 76
    iget p1, p0, Lt90;->d:I

    .line 77
    .line 78
    sub-int/2addr p1, v3

    .line 79
    iput p1, p0, Lt90;->d:I

    .line 80
    .line 81
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    iget p1, p0, Lt90;->e:I

    .line 85
    .line 86
    const/4 p2, 0x5

    .line 87
    if-ge p1, p2, :cond_2

    .line 88
    .line 89
    add-int/lit8 p2, p1, 0x1

    .line 90
    .line 91
    iput p2, p0, Lt90;->e:I

    .line 92
    .line 93
    aput-object v2, v0, p1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    sub-int/2addr v3, p1

    .line 97
    iput v3, v2, Lbk4;->b:I

    .line 98
    .line 99
    iget p2, p0, Lt90;->d:I

    .line 100
    .line 101
    sub-int/2addr p2, p1

    .line 102
    iput p2, p0, Lt90;->d:I

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    return-void
.end method

.method public o()F
    .locals 7

    .line 1
    iget-object v0, p0, Lt90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget v1, p0, Lt90;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lbk;->u:Lbk;

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 13
    .line 14
    .line 15
    iput v2, p0, Lt90;->b:I

    .line 16
    .line 17
    :cond_0
    iget v1, p0, Lt90;->d:I

    .line 18
    .line 19
    int-to-float v1, v1

    .line 20
    move v3, v2

    .line 21
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ge v2, v4, :cond_2

    .line 26
    .line 27
    const/high16 v4, 0x3f000000    # 0.5f

    .line 28
    .line 29
    mul-float/2addr v4, v1

    .line 30
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lbk4;

    .line 35
    .line 36
    iget v6, v5, Lbk4;->b:I

    .line 37
    .line 38
    add-int/2addr v3, v6

    .line 39
    int-to-float v6, v3

    .line 40
    cmpl-float v4, v6, v4

    .line 41
    .line 42
    if-ltz v4, :cond_1

    .line 43
    .line 44
    iget v0, v5, Lbk4;->c:F

    .line 45
    .line 46
    return v0

    .line 47
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 57
    .line 58
    return v0

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    add-int/lit8 v1, v1, -0x1

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lbk4;

    .line 70
    .line 71
    iget v0, v0, Lbk4;->c:F

    .line 72
    .line 73
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lt90;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "LruCache[maxSize="

    .line 12
    .line 13
    iget-object v1, p0, Lt90;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lpz;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget v2, p0, Lt90;->d:I

    .line 19
    .line 20
    iget v3, p0, Lt90;->e:I

    .line 21
    .line 22
    add-int/2addr v3, v2

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v2, v2, 0x64

    .line 26
    .line 27
    div-int/2addr v2, v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lt90;->b:I

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ",hits="

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v0, p0, Lt90;->d:I

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ",misses="

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget v0, p0, Lt90;->e:I

    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, ",hitRate="

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, "%]"

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v1

    .line 80
    return-object v0

    .line 81
    :goto_1
    monitor-exit v1

    .line 82
    throw v0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
