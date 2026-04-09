.class public final Lq82;
.super Lgw3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final i:Ljg2;

.field public final j:Landroid/content/Context;

.field public final k:Landroid/view/WindowManager;

.field public final l:Lsq0;

.field public m:Landroid/util/DisplayMetrics;

.field public n:F

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I


# direct methods
.method public constructor <init>(Ljg2;Landroid/content/Context;Lsq0;)V
    .locals 3

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, ""

    .line 5
    .line 6
    invoke-direct {p0, p1, v2, v0, v1}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 7
    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lq82;->o:I

    .line 11
    .line 12
    iput v0, p0, Lq82;->p:I

    .line 13
    .line 14
    iput v0, p0, Lq82;->r:I

    .line 15
    .line 16
    iput v0, p0, Lq82;->s:I

    .line 17
    .line 18
    iput v0, p0, Lq82;->t:I

    .line 19
    .line 20
    iput v0, p0, Lq82;->u:I

    .line 21
    .line 22
    iput-object p1, p0, Lq82;->i:Ljg2;

    .line 23
    .line 24
    iput-object p2, p0, Lq82;->j:Landroid/content/Context;

    .line 25
    .line 26
    iput-object p3, p0, Lq82;->l:Lsq0;

    .line 27
    .line 28
    const-string p1, "window"

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroid/view/WindowManager;

    .line 35
    .line 36
    iput-object p1, p0, Lq82;->k:Landroid/view/WindowManager;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final K(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq82;->j:Landroid/content/Context;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/app/Activity;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lhg4;->C:Lhg4;

    .line 9
    .line 10
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-static {v1}, Llf4;->q(Landroid/app/Activity;)[I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    aget v1, v1, v2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    iget-object v3, p0, Lq82;->i:Ljg2;

    .line 24
    .line 25
    iget-object v4, v3, Ljg2;->f:Log2;

    .line 26
    .line 27
    invoke-virtual {v4}, Log2;->x()Lzq;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    invoke-virtual {v4}, Log2;->x()Lzq;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Lzq;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_6

    .line 42
    .line 43
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    sget-object v6, Lmz1;->c0:Liz1;

    .line 52
    .line 53
    sget-object v7, Ltw1;->e:Ltw1;

    .line 54
    .line 55
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 56
    .line 57
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    invoke-virtual {v4}, Log2;->x()Lzq;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {v4}, Log2;->x()Lzq;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iget v5, v5, Lzq;->c:I

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move v5, v2

    .line 85
    :cond_3
    :goto_1
    if-nez v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v4}, Log2;->x()Lzq;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_5

    .line 92
    .line 93
    invoke-virtual {v4}, Log2;->x()Lzq;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget v2, v2, Lzq;->b:I

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move v2, v3

    .line 101
    :cond_5
    :goto_2
    sget-object v3, Lsv1;->f:Lsv1;

    .line 102
    .line 103
    iget-object v6, v3, Lsv1;->a:Lj63;

    .line 104
    .line 105
    invoke-virtual {v6, v0, v5}, Lj63;->h(Landroid/content/Context;I)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iput v5, p0, Lq82;->t:I

    .line 110
    .line 111
    iget-object v3, v3, Lsv1;->a:Lj63;

    .line 112
    .line 113
    invoke-virtual {v3, v0, v2}, Lj63;->h(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iput v0, p0, Lq82;->u:I

    .line 118
    .line 119
    :cond_6
    sub-int v0, p2, v1

    .line 120
    .line 121
    iget v1, p0, Lq82;->t:I

    .line 122
    .line 123
    iget v2, p0, Lq82;->u:I

    .line 124
    .line 125
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 126
    .line 127
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v5, "x"

    .line 131
    .line 132
    invoke-virtual {v3, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const-string v5, "y"

    .line 137
    .line 138
    invoke-virtual {v3, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const-string v3, "width"

    .line 143
    .line 144
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v1, "height"

    .line 149
    .line 150
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v1, p0, Lgw3;->g:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Lag2;

    .line 157
    .line 158
    const-string v2, "onDefaultPositionReceived"

    .line 159
    .line 160
    invoke-interface {v1, v2, v0}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catch_0
    move-exception v0

    .line 165
    const-string v1, "Error occurred while dispatching default position."

    .line 166
    .line 167
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    :goto_3
    iget-object v0, v4, Log2;->s:Lsg2;

    .line 171
    .line 172
    iget-object v0, v0, Lsg2;->C:Lo82;

    .line 173
    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    iput p1, v0, Lo82;->k:I

    .line 177
    .line 178
    iput p2, v0, Lo82;->l:I

    .line 179
    .line 180
    :cond_7
    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 10

    .line 1
    check-cast p1, Lag2;

    .line 2
    .line 3
    new-instance p1, Landroid/util/DisplayMetrics;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    iget-object p1, p0, Lq82;->k:Landroid/view/WindowManager;

    .line 11
    .line 12
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 24
    .line 25
    iput p2, p0, Lq82;->n:F

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lq82;->q:I

    .line 32
    .line 33
    sget-object p1, Lsv1;->f:Lsv1;

    .line 34
    .line 35
    iget-object p1, p1, Lsv1;->a:Lj63;

    .line 36
    .line 37
    iget-object p1, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 38
    .line 39
    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 40
    .line 41
    int-to-float p2, p2

    .line 42
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 43
    .line 44
    div-float/2addr p2, p1

    .line 45
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Lq82;->o:I

    .line 50
    .line 51
    iget-object p1, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 52
    .line 53
    iget p2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 54
    .line 55
    int-to-float p2, p2

    .line 56
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 57
    .line 58
    div-float/2addr p2, p1

    .line 59
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lq82;->p:I

    .line 64
    .line 65
    iget-object p1, p0, Lq82;->i:Ljg2;

    .line 66
    .line 67
    iget-object p2, p1, Ljg2;->f:Log2;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljg2;->g()Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/4 v1, 0x1

    .line 74
    const/4 v2, 0x0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-nez v3, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sget-object v3, Lhg4;->C:Lhg4;

    .line 85
    .line 86
    iget-object v3, v3, Lhg4;->c:Llf4;

    .line 87
    .line 88
    invoke-static {v0}, Llf4;->p(Landroid/app/Activity;)[I

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v3, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 93
    .line 94
    aget v4, v0, v2

    .line 95
    .line 96
    int-to-float v4, v4

    .line 97
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 98
    .line 99
    div-float/2addr v4, v3

    .line 100
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    iput v3, p0, Lq82;->r:I

    .line 105
    .line 106
    iget-object v3, p0, Lq82;->m:Landroid/util/DisplayMetrics;

    .line 107
    .line 108
    aget v0, v0, v1

    .line 109
    .line 110
    int-to-float v0, v0

    .line 111
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 112
    .line 113
    div-float/2addr v0, v3

    .line 114
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iput v0, p0, Lq82;->s:I

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    :goto_0
    iget v0, p0, Lq82;->o:I

    .line 122
    .line 123
    iput v0, p0, Lq82;->r:I

    .line 124
    .line 125
    iget v0, p0, Lq82;->p:I

    .line 126
    .line 127
    iput v0, p0, Lq82;->s:I

    .line 128
    .line 129
    :goto_1
    invoke-virtual {p2}, Log2;->x()Lzq;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lzq;->b()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_2

    .line 138
    .line 139
    iget v0, p0, Lq82;->o:I

    .line 140
    .line 141
    iput v0, p0, Lq82;->t:I

    .line 142
    .line 143
    iget v0, p0, Lq82;->p:I

    .line 144
    .line 145
    iput v0, p0, Lq82;->u:I

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_2
    invoke-virtual {p1, v2, v2}, Landroid/view/View;->measure(II)V

    .line 149
    .line 150
    .line 151
    :goto_2
    iget v4, p0, Lq82;->o:I

    .line 152
    .line 153
    iget v5, p0, Lq82;->p:I

    .line 154
    .line 155
    iget v6, p0, Lq82;->r:I

    .line 156
    .line 157
    iget v7, p0, Lq82;->s:I

    .line 158
    .line 159
    iget v8, p0, Lq82;->n:F

    .line 160
    .line 161
    iget v9, p0, Lq82;->q:I

    .line 162
    .line 163
    move-object v3, p0

    .line 164
    invoke-virtual/range {v3 .. v9}, Lgw3;->J(IIIIFI)V

    .line 165
    .line 166
    .line 167
    new-instance v0, Landroid/content/Intent;

    .line 168
    .line 169
    const-string v4, "android.intent.action.DIAL"

    .line 170
    .line 171
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v4, "tel:"

    .line 175
    .line 176
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 181
    .line 182
    .line 183
    iget-object v4, v3, Lq82;->l:Lsq0;

    .line 184
    .line 185
    invoke-virtual {v4, v0}, Lsq0;->t(Landroid/content/Intent;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    new-instance v5, Landroid/content/Intent;

    .line 190
    .line 191
    const-string v6, "android.intent.action.VIEW"

    .line 192
    .line 193
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const-string v6, "sms:"

    .line 197
    .line 198
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v5}, Lsq0;->t(Landroid/content/Intent;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    new-instance v6, Landroid/content/Intent;

    .line 210
    .line 211
    const-string v7, "android.intent.action.INSERT"

    .line 212
    .line 213
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v7, "vnd.android.cursor.dir/event"

    .line 217
    .line 218
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v4, v6}, Lsq0;->t(Landroid/content/Intent;)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    iget-object v4, v4, Lsq0;->g:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v4, Landroid/content/Context;

    .line 229
    .line 230
    sget-object v7, Lgz1;->b:Lgz1;

    .line 231
    .line 232
    invoke-static {v4, v7}, Lyb;->u(Landroid/content/Context;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    check-cast v7, Ljava/lang/Boolean;

    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eqz v7, :cond_3

    .line 243
    .line 244
    invoke-static {v4}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    const-string v7, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 249
    .line 250
    iget-object v4, v4, Lzj0;->f:Landroid/content/Context;

    .line 251
    .line 252
    invoke-virtual {v4, v7}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-nez v4, :cond_3

    .line 257
    .line 258
    move v4, v1

    .line 259
    goto :goto_3

    .line 260
    :cond_3
    move v4, v2

    .line 261
    :goto_3
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 262
    .line 263
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v8, "sms"

    .line 267
    .line 268
    invoke-virtual {v7, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    const-string v7, "tel"

    .line 273
    .line 274
    invoke-virtual {v5, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-string v5, "calendar"

    .line 279
    .line 280
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const-string v5, "storePicture"

    .line 285
    .line 286
    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    const-string v4, "inlineVideo"

    .line 291
    .line 292
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 296
    goto :goto_4

    .line 297
    :catch_0
    move-exception v0

    .line 298
    const-string v4, "Error occurred while obtaining the MRAID capabilities."

    .line 299
    .line 300
    invoke-static {v4, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    const/4 v0, 0x0

    .line 304
    :goto_4
    const-string v4, "onDeviceFeaturesReceived"

    .line 305
    .line 306
    invoke-virtual {p1, v4, v0}, Ljg2;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 307
    .line 308
    .line 309
    const/4 v0, 0x2

    .line 310
    new-array v4, v0, [I

    .line 311
    .line 312
    invoke-virtual {p1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 313
    .line 314
    .line 315
    sget-object p1, Lsv1;->f:Lsv1;

    .line 316
    .line 317
    iget-object v5, p1, Lsv1;->a:Lj63;

    .line 318
    .line 319
    aget v2, v4, v2

    .line 320
    .line 321
    iget-object v6, v3, Lq82;->j:Landroid/content/Context;

    .line 322
    .line 323
    invoke-virtual {v5, v6, v2}, Lj63;->h(Landroid/content/Context;I)I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    iget-object p1, p1, Lsv1;->a:Lj63;

    .line 328
    .line 329
    aget v1, v4, v1

    .line 330
    .line 331
    invoke-virtual {p1, v6, v1}, Lj63;->h(Landroid/content/Context;I)I

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    invoke-virtual {p0, v2, p1}, Lq82;->K(II)V

    .line 336
    .line 337
    .line 338
    invoke-static {v0}, Lgi2;->q0(I)Z

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    if-eqz p1, :cond_4

    .line 343
    .line 344
    const-string p1, "Dispatching Ready Event."

    .line 345
    .line 346
    invoke-static {p1}, Lgi2;->f0(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    :cond_4
    iget-object p1, p2, Log2;->j:Le51;

    .line 350
    .line 351
    iget-object p1, p1, Le51;->f:Ljava/lang/String;

    .line 352
    .line 353
    :try_start_1
    new-instance p2, Lorg/json/JSONObject;

    .line 354
    .line 355
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v0, "js"

    .line 359
    .line 360
    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    iget-object p2, v3, Lgw3;->g:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast p2, Lag2;

    .line 367
    .line 368
    const-string v0, "onReadyEventReceived"

    .line 369
    .line 370
    invoke-interface {p2, v0, p1}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 371
    .line 372
    .line 373
    goto :goto_5

    .line 374
    :catch_1
    move-exception v0

    .line 375
    move-object p1, v0

    .line 376
    const-string p2, "Error occurred while dispatching ready Event."

    .line 377
    .line 378
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    :goto_5
    return-void
.end method
