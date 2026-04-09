.class public final Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final synthetic L:I


# instance fields
.field public C:F

.field public D:Lg2;

.field public E:Le3;

.field public F:Z

.field public G:Lvy2;

.field public H:Lc10;

.field public I:Ljava/util/ArrayList;

.field public final J:Ljava/text/DecimalFormat;

.field public K:Lo9;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Li5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/text/DecimalFormat;

    .line 5
    .line 6
    const-string v1, "#,##0"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->J:Ljava/text/DecimalFormat;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final doShare(Landroid/view/View;)V
    .locals 10

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const-string v1, "dataList"

    .line 10
    .line 11
    if-eqz p1, :cond_4

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    move v5, v4

    .line 35
    :goto_0
    if-ge v5, v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    add-int/lit8 v5, v5, 0x1

    .line 42
    .line 43
    check-cast v6, Lzk0;

    .line 44
    .line 45
    iget-object v7, v6, Lzk0;->b:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v8, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v9, "- "

    .line 50
    .line 51
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v7, "\n"

    .line 58
    .line 59
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v6, v6, Lzk0;->c:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v8, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 91
    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    invoke-static {v2}, Lyf;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lzk0;

    .line 99
    .line 100
    iget-object v0, v0, Lzk0;->b:Ljava/lang/String;

    .line 101
    .line 102
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 103
    .line 104
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v2, "android.intent.action.SEND"

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    const-string v2, "android.intent.extra.SUBJECT"

    .line 113
    .line 114
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    const-string v0, "android.intent.extra.TEXT"

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    const-string p1, "text/plain"

    .line 127
    .line 128
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :catch_0
    move-exception p1

    .line 136
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {v0, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_2
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_3
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_4
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Li5;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f0c001e

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const v2, 0x7f090053

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    move-object v8, v5

    .line 27
    check-cast v8, Landroid/widget/FrameLayout;

    .line 28
    .line 29
    if-eqz v8, :cond_a

    .line 30
    .line 31
    const v2, 0x7f090054

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    move-object v9, v5

    .line 39
    check-cast v9, Landroid/widget/FrameLayout;

    .line 40
    .line 41
    if-eqz v9, :cond_a

    .line 42
    .line 43
    const v2, 0x7f09009d

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    move-object v10, v5

    .line 51
    check-cast v10, Landroid/widget/Button;

    .line 52
    .line 53
    if-eqz v10, :cond_a

    .line 54
    .line 55
    const v2, 0x7f090118

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    move-object v11, v5

    .line 63
    check-cast v11, Landroidx/constraintlayout/widget/Group;

    .line 64
    .line 65
    if-eqz v11, :cond_a

    .line 66
    .line 67
    const v2, 0x7f090144

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Landroid/widget/ImageView;

    .line 75
    .line 76
    if-eqz v5, :cond_a

    .line 77
    .line 78
    const v2, 0x7f090145

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Landroid/widget/ImageView;

    .line 86
    .line 87
    if-eqz v5, :cond_a

    .line 88
    .line 89
    const v2, 0x7f09014a

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz v5, :cond_a

    .line 99
    .line 100
    const v2, 0x7f09014b

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v5, :cond_a

    .line 110
    .line 111
    const v2, 0x7f09014c

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Landroid/widget/TextView;

    .line 119
    .line 120
    if-eqz v5, :cond_a

    .line 121
    .line 122
    const v2, 0x7f09014d

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Landroid/widget/TextView;

    .line 130
    .line 131
    if-eqz v5, :cond_a

    .line 132
    .line 133
    const v2, 0x7f09014e

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    check-cast v5, Landroid/widget/TextView;

    .line 141
    .line 142
    if-eqz v5, :cond_a

    .line 143
    .line 144
    const v2, 0x7f0901d8

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    move-object v12, v5

    .line 152
    check-cast v12, Lcom/github/mikephil/charting/charts/LineChart;

    .line 153
    .line 154
    if-eqz v12, :cond_a

    .line 155
    .line 156
    const v2, 0x7f0901df

    .line 157
    .line 158
    .line 159
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    move-object v13, v5

    .line 164
    check-cast v13, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 165
    .line 166
    if-eqz v13, :cond_a

    .line 167
    .line 168
    const v2, 0x7f0901f7

    .line 169
    .line 170
    .line 171
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    move-object v14, v5

    .line 176
    check-cast v14, Landroidx/recyclerview/widget/RecyclerView;

    .line 177
    .line 178
    if-eqz v14, :cond_a

    .line 179
    .line 180
    const v2, 0x7f090264

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    if-eqz v5, :cond_a

    .line 188
    .line 189
    invoke-static {v5}, Lp21;->h(Landroid/view/View;)Lp21;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    const v2, 0x7f090276

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    move-object/from16 v16, v5

    .line 201
    .line 202
    check-cast v16, Landroid/widget/TextView;

    .line 203
    .line 204
    if-eqz v16, :cond_a

    .line 205
    .line 206
    const v2, 0x7f090285

    .line 207
    .line 208
    .line 209
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    move-object/from16 v17, v5

    .line 214
    .line 215
    check-cast v17, Landroid/widget/TextView;

    .line 216
    .line 217
    if-eqz v17, :cond_a

    .line 218
    .line 219
    const v2, 0x7f090286

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    move-object/from16 v18, v5

    .line 227
    .line 228
    check-cast v18, Landroid/widget/TextView;

    .line 229
    .line 230
    if-eqz v18, :cond_a

    .line 231
    .line 232
    const v2, 0x7f09028a

    .line 233
    .line 234
    .line 235
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    move-object/from16 v19, v5

    .line 240
    .line 241
    check-cast v19, Landroid/widget/TextView;

    .line 242
    .line 243
    if-eqz v19, :cond_a

    .line 244
    .line 245
    const v2, 0x7f09028c

    .line 246
    .line 247
    .line 248
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    check-cast v5, Landroid/widget/TextView;

    .line 253
    .line 254
    if-eqz v5, :cond_a

    .line 255
    .line 256
    const v2, 0x7f090295

    .line 257
    .line 258
    .line 259
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    move-object/from16 v20, v5

    .line 264
    .line 265
    check-cast v20, Landroid/widget/TextView;

    .line 266
    .line 267
    if-eqz v20, :cond_a

    .line 268
    .line 269
    const v2, 0x7f0902a5

    .line 270
    .line 271
    .line 272
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v21

    .line 276
    if-eqz v21, :cond_a

    .line 277
    .line 278
    const v2, 0x7f0902a6

    .line 279
    .line 280
    .line 281
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 282
    .line 283
    .line 284
    move-result-object v22

    .line 285
    if-eqz v22, :cond_a

    .line 286
    .line 287
    const v2, 0x7f0902a7

    .line 288
    .line 289
    .line 290
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 291
    .line 292
    .line 293
    move-result-object v23

    .line 294
    if-eqz v23, :cond_a

    .line 295
    .line 296
    const v2, 0x7f0902a8

    .line 297
    .line 298
    .line 299
    invoke-static {v1, v2}, La30;->e(Landroid/view/View;I)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v24

    .line 303
    if-eqz v24, :cond_a

    .line 304
    .line 305
    new-instance v6, Lg2;

    .line 306
    .line 307
    move-object v7, v1

    .line 308
    check-cast v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 309
    .line 310
    invoke-direct/range {v6 .. v24}, Lg2;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/Button;Landroidx/constraintlayout/widget/Group;Lcom/github/mikephil/charting/charts/LineChart;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroidx/recyclerview/widget/RecyclerView;Lp21;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 311
    .line 312
    .line 313
    iput-object v6, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 314
    .line 315
    const-string v1, "getRoot(...)"

    .line 316
    .line 317
    invoke-static {v7, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v7}, Li5;->setContentView(Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    new-instance v1, Le3;

    .line 324
    .line 325
    invoke-direct {v1, v0}, Le3;-><init>(Landroid/content/Context;)V

    .line 326
    .line 327
    .line 328
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 329
    .line 330
    iget-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 331
    .line 332
    const-string v5, "binding"

    .line 333
    .line 334
    if-eqz v2, :cond_9

    .line 335
    .line 336
    iget-object v2, v2, Lg2;->b:Landroid/widget/FrameLayout;

    .line 337
    .line 338
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 339
    .line 340
    .line 341
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 342
    .line 343
    if-eqz v1, :cond_8

    .line 344
    .line 345
    iget-object v1, v1, Lg2;->b:Landroid/widget/FrameLayout;

    .line 346
    .line 347
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    new-instance v2, Lo00;

    .line 352
    .line 353
    const/4 v6, 0x1

    .line 354
    invoke-direct {v2, v0, v6}, Lo00;-><init>(Li5;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 358
    .line 359
    .line 360
    new-instance v1, Landroid/os/Handler;

    .line 361
    .line 362
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 367
    .line 368
    .line 369
    new-instance v2, Lxk0;

    .line 370
    .line 371
    invoke-direct {v2, v0, v6}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 372
    .line 373
    .line 374
    const-wide/16 v6, 0x1388

    .line 375
    .line 376
    invoke-virtual {v1, v2, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    const-string v2, "ping_ip_arg"

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iget-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 390
    .line 391
    if-eqz v2, :cond_7

    .line 392
    .line 393
    iget-object v2, v2, Lg2;->h:Lp21;

    .line 394
    .line 395
    iget-object v6, v2, Lp21;->g:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v6, Lcom/google/android/material/button/MaterialButton;

    .line 398
    .line 399
    iget-object v7, v2, Lp21;->h:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v7, Lcom/google/android/material/button/MaterialButton;

    .line 402
    .line 403
    iget-object v8, v2, Lp21;->i:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v8, Lcom/google/android/material/textfield/TextInputEditText;

    .line 406
    .line 407
    const/16 v9, 0x8

    .line 408
    .line 409
    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    .line 410
    .line 411
    .line 412
    if-eqz v1, :cond_1

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-nez v6, :cond_0

    .line 419
    .line 420
    goto :goto_0

    .line 421
    :cond_0
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 422
    .line 423
    .line 424
    :try_start_0
    invoke-virtual {v7}, Lcom/google/android/material/button/MaterialButton;->performClick()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 425
    .line 426
    .line 427
    goto :goto_1

    .line 428
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    const-string v6, "wifi"

    .line 433
    .line 434
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    const-string v6, "null cannot be cast to non-null type android.net.wifi.WifiManager"

    .line 439
    .line 440
    invoke-static {v1, v6}, Li30;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 444
    .line 445
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    iget v1, v1, Landroid/net/DhcpInfo;->gateway:I

    .line 450
    .line 451
    invoke-static {v1}, Landroid/text/format/Formatter;->formatIpAddress(I)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    const-string v6, "formatIpAddress(...)"

    .line 456
    .line 457
    invoke-static {v1, v6}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 461
    .line 462
    .line 463
    :catch_0
    :goto_1
    iget-object v1, v2, Lp21;->f:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 466
    .line 467
    new-instance v2, Ltk0;

    .line 468
    .line 469
    const/4 v6, 0x0

    .line 470
    invoke-direct {v2, v0, v6}, Ltk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 474
    .line 475
    .line 476
    new-instance v1, Ltk0;

    .line 477
    .line 478
    const/4 v2, 0x1

    .line 479
    invoke-direct {v1, v0, v2}, Ltk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 483
    .line 484
    .line 485
    new-instance v1, Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 488
    .line 489
    .line 490
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 491
    .line 492
    new-instance v2, Lc10;

    .line 493
    .line 494
    new-instance v6, Lwk0;

    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    invoke-direct {v6, v7}, Lwk0;-><init>(I)V

    .line 498
    .line 499
    .line 500
    const/4 v7, 0x1

    .line 501
    invoke-direct {v2, v1, v6, v7}, Lc10;-><init>(Ljava/util/ArrayList;Lpy;I)V

    .line 502
    .line 503
    .line 504
    iput-object v2, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->H:Lc10;

    .line 505
    .line 506
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 507
    .line 508
    if-eqz v1, :cond_6

    .line 509
    .line 510
    iget-object v1, v1, Lg2;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 511
    .line 512
    const/4 v2, 0x1

    .line 513
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 514
    .line 515
    .line 516
    iget-object v6, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->H:Lc10;

    .line 517
    .line 518
    if-eqz v6, :cond_5

    .line 519
    .line 520
    invoke-virtual {v1, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0}, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->x()V

    .line 524
    .line 525
    .line 526
    new-instance v1, Lo9;

    .line 527
    .line 528
    iget-object v6, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 529
    .line 530
    if-eqz v6, :cond_4

    .line 531
    .line 532
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 533
    .line 534
    .line 535
    iput-object v6, v1, Lo9;->d:Ljava/lang/Object;

    .line 536
    .line 537
    const v5, 0x7f040125

    .line 538
    .line 539
    .line 540
    const/high16 v7, -0x1000000

    .line 541
    .line 542
    invoke-static {v0, v5, v7}, Li41;->h(Landroid/content/Context;II)I

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    const v7, 0x7f060035

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v7}, Landroid/content/Context;->getColor(I)I

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    iput v8, v1, Lo9;->a:I

    .line 554
    .line 555
    const v9, 0x7f060036

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v9}, Landroid/content/Context;->getColor(I)I

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    iput v9, v1, Lo9;->b:I

    .line 563
    .line 564
    invoke-virtual {v0, v7}, Landroid/content/Context;->getColor(I)I

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    iput v7, v1, Lo9;->c:I

    .line 569
    .line 570
    iget-object v6, v6, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 571
    .line 572
    invoke-virtual {v6, v4}, Lje;->setTouchEnabled(Z)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v6}, Lje;->getXAxis()Lcb1;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    iput-boolean v4, v7, Ldh;->a:Z

    .line 580
    .line 581
    invoke-virtual {v6}, Lk9;->getAxisLeft()Leb1;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    iput-boolean v2, v7, Ldh;->a:Z

    .line 586
    .line 587
    invoke-virtual {v6}, Lk9;->getAxisLeft()Leb1;

    .line 588
    .line 589
    .line 590
    move-result-object v7

    .line 591
    const/4 v9, 0x0

    .line 592
    iput v9, v7, Leb1;->B:F

    .line 593
    .line 594
    invoke-virtual {v6}, Lk9;->getAxisLeft()Leb1;

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    iput v9, v7, Leb1;->A:F

    .line 599
    .line 600
    invoke-virtual {v6}, Lk9;->getAxisLeft()Leb1;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    invoke-virtual {v7}, Ld9;->d()V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v6}, Lk9;->getAxisLeft()Leb1;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    const-string v9, "getAxisLeft(...)"

    .line 612
    .line 613
    invoke-static {v7, v9}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    const/4 v9, 0x6

    .line 617
    iput v9, v7, Ld9;->n:I

    .line 618
    .line 619
    iput-boolean v2, v7, Ld9;->o:Z

    .line 620
    .line 621
    iput v5, v7, Ldh;->e:I

    .line 622
    .line 623
    iput v2, v7, Leb1;->C:I

    .line 624
    .line 625
    iput-boolean v2, v7, Ld9;->p:Z

    .line 626
    .line 627
    iput v8, v7, Ld9;->i:I

    .line 628
    .line 629
    invoke-virtual {v6}, Lk9;->getAxisRight()Leb1;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    iput-boolean v4, v7, Ldh;->a:Z

    .line 634
    .line 635
    invoke-virtual {v6, v4}, Lje;->setLogEnabled(Z)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v6, v3}, Lje;->setDescription(Llo;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6, v4}, Lk9;->setDragEnabled(Z)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v6, v4}, Lk9;->setScaleEnabled(Z)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v6, v4}, Lk9;->setDrawBorders(Z)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v6, v4}, Lk9;->setPinchZoom(Z)V

    .line 651
    .line 652
    .line 653
    const/high16 v3, 0x43960000    # 300.0f

    .line 654
    .line 655
    invoke-virtual {v6, v3}, Lje;->setMaxHighlightDistance(F)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v6, v4}, Lk9;->setDrawGridBackground(Z)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v6, v2}, Lk9;->setAutoScaleMinMaxEnabled(Z)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v6}, Lk9;->getAxisRight()Leb1;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-virtual {v2}, Ld9;->d()V

    .line 669
    .line 670
    .line 671
    const/16 v2, 0xc

    .line 672
    .line 673
    invoke-virtual {v6, v2}, Lk9;->setMaxVisibleValueCount(I)V

    .line 674
    .line 675
    .line 676
    new-instance v2, Lj60;

    .line 677
    .line 678
    invoke-direct {v2}, Lj60;-><init>()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v1}, Lo9;->b()Ll60;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    invoke-virtual {v2, v3}, Lle;->a(Ll60;)V

    .line 686
    .line 687
    .line 688
    iget-object v3, v2, Lle;->i:Ljava/util/ArrayList;

    .line 689
    .line 690
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 691
    .line 692
    .line 693
    move-result v7

    .line 694
    move v8, v4

    .line 695
    :goto_2
    if-ge v8, v7, :cond_2

    .line 696
    .line 697
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v9

    .line 701
    add-int/lit8 v8, v8, 0x1

    .line 702
    .line 703
    check-cast v9, Lq10;

    .line 704
    .line 705
    check-cast v9, Ll60;

    .line 706
    .line 707
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    const/high16 v10, 0x40e00000    # 7.0f

    .line 711
    .line 712
    invoke-static {v10}, Lk41;->c(F)F

    .line 713
    .line 714
    .line 715
    move-result v10

    .line 716
    iput v10, v9, Ll60;->m:F

    .line 717
    .line 718
    goto :goto_2

    .line 719
    :cond_2
    iget-object v3, v2, Lle;->i:Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 722
    .line 723
    .line 724
    move-result v7

    .line 725
    move v8, v4

    .line 726
    :goto_3
    if-ge v8, v7, :cond_3

    .line 727
    .line 728
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v9

    .line 732
    add-int/lit8 v8, v8, 0x1

    .line 733
    .line 734
    check-cast v9, Lq10;

    .line 735
    .line 736
    check-cast v9, Ll60;

    .line 737
    .line 738
    iget-object v9, v9, Ll60;->b:Ljava/util/ArrayList;

    .line 739
    .line 740
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 741
    .line 742
    .line 743
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 744
    .line 745
    .line 746
    move-result-object v10

    .line 747
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_3

    .line 751
    :cond_3
    invoke-virtual {v6, v2}, Lje;->setData(Lle;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v6}, Lje;->getLegend()Lk50;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    iput-boolean v4, v2, Ldh;->a:Z

    .line 759
    .line 760
    iget-object v2, v1, Lo9;->d:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v2, Lg2;

    .line 763
    .line 764
    iget-object v3, v2, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 765
    .line 766
    invoke-virtual {v3}, Lje;->getData()Lle;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    check-cast v3, Lj60;

    .line 771
    .line 772
    iget-object v3, v3, Lle;->i:Ljava/util/ArrayList;

    .line 773
    .line 774
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 775
    .line 776
    .line 777
    iget-object v2, v2, Lg2;->e:Lcom/github/mikephil/charting/charts/LineChart;

    .line 778
    .line 779
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 780
    .line 781
    .line 782
    iput-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->K:Lo9;

    .line 783
    .line 784
    return-void

    .line 785
    :cond_4
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    throw v3

    .line 789
    :cond_5
    const-string v1, "pingAdapter"

    .line 790
    .line 791
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    throw v3

    .line 795
    :cond_6
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v3

    .line 799
    :cond_7
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    throw v3

    .line 803
    :cond_8
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    throw v3

    .line 807
    :cond_9
    invoke-static {v5}, Li30;->S(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    throw v3

    .line 811
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    new-instance v2, Ljava/lang/NullPointerException;

    .line 820
    .line 821
    const-string v3, "Missing required view with ID: "

    .line 822
    .line 823
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    throw v2
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr9;->a()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Li5;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "adView"

    .line 13
    .line 14
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method

.method public final onPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lr9;->c()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->G:Lvy2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, v0, Lvy2;->b:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "ping"

    .line 18
    .line 19
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :catch_0
    :goto_0
    invoke-super {p0}, Li5;->onPause()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string v0, "adView"

    .line 28
    .line 29
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Li5;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->E:Le3;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lr9;->d()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v0, "adView"

    .line 13
    .line 14
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lg2;->m:Landroid/widget/TextView;

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lg2;->i:Landroid/widget/TextView;

    .line 13
    .line 14
    const-string v2, "- ms"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lg2;->j:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lg2;->k:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lg2;->l:Landroid/widget/TextView;

    .line 30
    .line 31
    const-string v1, "- %"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string v0, "binding"

    .line 38
    .line 39
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    throw v0
.end method

.method public final y()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    iget-object v0, v0, Lg2;->h:Lp21;

    .line 7
    .line 8
    iget-object v0, v0, Lp21;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Ln6;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lsy0;->J(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v2, Landroid/util/Patterns;->IP_ADDRESS:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    sget-object v2, Landroid/util/Patterns;->WEB_URL:Ljava/util/regex/Pattern;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v0, Lxk0;

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-direct {v0, p0, v1}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    :goto_0
    new-instance v2, Lxk0;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v2, p0, v3}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 73
    .line 74
    const-string v3, "dataList"

    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_5

    .line 83
    .line 84
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->H:Lc10;

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    iget-object v4, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 89
    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    iget-object v2, v2, Lao0;->f:Lbo0;

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-virtual {v2, v5, v4}, Lbo0;->e(II)V

    .line 100
    .line 101
    .line 102
    iget-object v2, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 103
    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :cond_3
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_4
    const-string v0, "pingAdapter"

    .line 119
    .line 120
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v1

    .line 124
    :cond_5
    :goto_1
    const/4 v1, 0x0

    .line 125
    iput v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->C:F

    .line 126
    .line 127
    new-instance v1, Lvy2;

    .line 128
    .line 129
    invoke-direct {v1}, Lvy2;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object v0, v1, Lvy2;->c:Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v0, v1, Lvy2;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lh80;

    .line 137
    .line 138
    const/16 v2, 0x3e8

    .line 139
    .line 140
    invoke-static {v2, v2}, Ljava/lang/Math;->max(II)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    iput v2, v0, Lh80;->g:I

    .line 145
    .line 146
    const/16 v0, 0xc

    .line 147
    .line 148
    iput v0, v1, Lvy2;->a:I

    .line 149
    .line 150
    new-instance v0, Lf23;

    .line 151
    .line 152
    const/4 v2, 0x6

    .line 153
    invoke-direct {v0, v2, p0}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    new-instance v2, Ljava/lang/Thread;

    .line 157
    .line 158
    new-instance v3, Ljq3;

    .line 159
    .line 160
    const/16 v4, 0xc

    .line 161
    .line 162
    const/4 v5, 0x0

    .line 163
    invoke-direct {v3, v1, v0, v4, v5}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 164
    .line 165
    .line 166
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 170
    .line 171
    .line 172
    iput-object v1, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->G:Lvy2;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_6
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v1

    .line 179
    :cond_7
    const-string v0, "binding"

    .line 180
    .line 181
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v1
.end method

.method public final z(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->D:Lg2;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lg2;->c:Landroid/widget/Button;

    .line 6
    .line 7
    iget-object v2, v0, Lg2;->d:Landroidx/constraintlayout/widget/Group;

    .line 8
    .line 9
    iget-object v3, v0, Lg2;->h:Lp21;

    .line 10
    .line 11
    iget-object v4, v3, Lp21;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 14
    .line 15
    iget-object v3, v3, Lp21;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 18
    .line 19
    iget-object v0, v0, Lg2;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x4

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/16 p1, 0x8

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-ne p1, v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    const p1, 0x7f0800f2

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Ljj;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v3, p1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Ltk0;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {p1, p0, v0}, Ltk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x6

    .line 65
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->onEditorAction(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    const p1, 0x7f0800c6

    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1}, Ljj;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v3, p1}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Ltk0;

    .line 86
    .line 87
    const/4 v2, 0x3

    .line 88
    invoke-direct {p1, p0, v2}, Ltk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x1

    .line 98
    invoke-virtual {v4, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    const-string p1, "binding"

    .line 106
    .line 107
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    throw p1
.end method
