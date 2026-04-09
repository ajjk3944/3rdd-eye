.class public abstract Li5;
.super Lch;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ll5;


# instance fields
.field public A:Z

.field public B:Lh6;

.field public final w:Lof3;

.field public final x:Ld60;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lch;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkw;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lkw;-><init>(Li5;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lof3;

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    invoke-direct {v1, v2, v0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Li5;->w:Lof3;

    .line 16
    .line 17
    new-instance v0, Ld60;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ld60;-><init>(Lb60;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Li5;->x:Ld60;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Li5;->A:Z

    .line 26
    .line 27
    iget-object v0, p0, Lch;->i:Lgw3;

    .line 28
    .line 29
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lvq2;

    .line 32
    .line 33
    new-instance v1, Lwg;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, Lwg;-><init>(Li5;I)V

    .line 37
    .line 38
    .line 39
    const-string v2, "android:support:lifecycle"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lvq2;->q(Ljava/lang/String;Lys0;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ljw;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, v1}, Ljw;-><init>(Li5;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lch;->g(Lui;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Ljw;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, v1}, Ljw;-><init>(Li5;I)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lch;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance v0, Lxg;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {v0, p0, v1}, Lxg;-><init>(Li5;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lch;->h(Lej0;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lch;->i:Lgw3;

    .line 74
    .line 75
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lvq2;

    .line 78
    .line 79
    new-instance v1, Lg5;

    .line 80
    .line 81
    invoke-direct {v1, p0}, Lg5;-><init>(Li5;)V

    .line 82
    .line 83
    .line 84
    const-string v2, "androidx:appcompat"

    .line 85
    .line 86
    invoke-virtual {v0, v2, v1}, Lvq2;->q(Ljava/lang/String;Lys0;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lh5;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lh5;-><init>(Li5;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lch;->h(Lej0;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static p(Lxw;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Lxw;->c:Lp21;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp21;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Liw;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Liw;->x:Lkw;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, Lkw;->A:Li5;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Liw;->h()Lxw;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Li5;->p(Lxw;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Liw;->T:Ljx;

    .line 47
    .line 48
    sget-object v3, Lu50;->i:Lu50;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Ljx;->e()Ld60;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v2, v2, Ld60;->c:Lu50;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-ltz v2, :cond_4

    .line 64
    .line 65
    iget-object v0, v1, Liw;->T:Ljx;

    .line 66
    .line 67
    iget-object v0, v0, Ljx;->h:Ld60;

    .line 68
    .line 69
    invoke-virtual {v0}, Ld60;->g()V

    .line 70
    .line 71
    .line 72
    move v0, v4

    .line 73
    :cond_4
    iget-object v2, v1, Liw;->S:Ld60;

    .line 74
    .line 75
    iget-object v2, v2, Ld60;->c:Lu50;

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ltz v2, :cond_0

    .line 82
    .line 83
    iget-object v0, v1, Liw;->S:Ld60;

    .line 84
    .line 85
    invoke-virtual {v0}, Ld60;->g()V

    .line 86
    .line 87
    .line 88
    move v0, v4

    .line 89
    goto :goto_0

    .line 90
    :cond_5
    return v0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lch;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh6;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh6;->w()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lh6;->F:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lh6;->r:Lb6;

    .line 28
    .line 29
    iget-object p2, v0, Lh6;->q:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lb6;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh6;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lh6;->T:Z

    .line 9
    .line 10
    iget v2, v0, Lh6;->X:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lu5;->g:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lh6;->C(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lu5;->b(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_7

    .line 29
    .line 30
    invoke-static {p1}, Lu5;->b(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v2, v4, :cond_2

    .line 42
    .line 43
    sget-boolean v2, Lu5;->k:Z

    .line 44
    .line 45
    if-nez v2, :cond_7

    .line 46
    .line 47
    sget-object v2, Lu5;->f:Ls5;

    .line 48
    .line 49
    new-instance v4, Lo5;

    .line 50
    .line 51
    invoke-direct {v4, p1, v3}, Lo5;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Ls5;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Lu5;->n:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v4, Lu5;->h:Ly70;

    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    sget-object v4, Lu5;->i:Ly70;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lum;->v(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Ly70;->a(Ljava/lang/String;)Ly70;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sput-object v4, Lu5;->i:Ly70;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v4, Lu5;->i:Ly70;

    .line 83
    .line 84
    iget-object v4, v4, Ly70;->a:Lz70;

    .line 85
    .line 86
    iget-object v4, v4, Lz70;->a:Landroid/os/LocaleList;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    monitor-exit v2

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    sget-object v4, Lu5;->i:Ly70;

    .line 97
    .line 98
    sput-object v4, Lu5;->h:Ly70;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    sget-object v5, Lu5;->i:Ly70;

    .line 102
    .line 103
    invoke-virtual {v4, v5}, Ly70;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    sget-object v4, Lu5;->h:Ly70;

    .line 110
    .line 111
    sput-object v4, Lu5;->i:Ly70;

    .line 112
    .line 113
    iget-object v4, v4, Ly70;->a:Lz70;

    .line 114
    .line 115
    iget-object v4, v4, Lz70;->a:Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {p1, v4}, Lum;->t(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_2
    monitor-exit v2

    .line 125
    goto :goto_4

    .line 126
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    throw p1

    .line 128
    :cond_7
    :goto_4
    invoke-static {p1}, Lh6;->p(Landroid/content/Context;)Ly70;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    if-eqz v4, :cond_8

    .line 136
    .line 137
    invoke-static {p1, v0, v2, v5, v3}, Lh6;->t(Landroid/content/Context;ILy70;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    :try_start_1
    move-object v6, p1

    .line 142
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 143
    .line 144
    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 145
    .line 146
    .line 147
    goto/16 :goto_a

    .line 148
    .line 149
    :catch_0
    :cond_8
    instance-of v4, p1, Lnj;

    .line 150
    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    invoke-static {p1, v0, v2, v5, v3}, Lh6;->t(Landroid/content/Context;ILy70;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    :try_start_2
    move-object v4, p1

    .line 158
    check-cast v4, Lnj;

    .line 159
    .line 160
    invoke-virtual {v4, v3}, Lnj;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 161
    .line 162
    .line 163
    goto/16 :goto_a

    .line 164
    .line 165
    :catch_1
    :cond_9
    sget-boolean v3, Lh6;->o0:Z

    .line 166
    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 172
    .line 173
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 174
    .line 175
    .line 176
    const/4 v4, -0x1

    .line 177
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 181
    .line 182
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 205
    .line 206
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-nez v7, :cond_20

    .line 211
    .line 212
    new-instance v7, Landroid/content/res/Configuration;

    .line 213
    .line 214
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 215
    .line 216
    .line 217
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 218
    .line 219
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_b

    .line 224
    .line 225
    goto/16 :goto_5

    .line 226
    .line 227
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 228
    .line 229
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 230
    .line 231
    cmpl-float v4, v4, v8

    .line 232
    .line 233
    if-eqz v4, :cond_c

    .line 234
    .line 235
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 236
    .line 237
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 238
    .line 239
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 240
    .line 241
    if-eq v4, v8, :cond_d

    .line 242
    .line 243
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 244
    .line 245
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 246
    .line 247
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 248
    .line 249
    if-eq v4, v8, :cond_e

    .line 250
    .line 251
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 252
    .line 253
    :cond_e
    invoke-static {v3, v6, v7}, Ly5;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 254
    .line 255
    .line 256
    iget v4, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 257
    .line 258
    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 259
    .line 260
    if-eq v4, v8, :cond_f

    .line 261
    .line 262
    iput v8, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 263
    .line 264
    :cond_f
    iget v4, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 265
    .line 266
    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 267
    .line 268
    if-eq v4, v8, :cond_10

    .line 269
    .line 270
    iput v8, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 271
    .line 272
    :cond_10
    iget v4, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 273
    .line 274
    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 275
    .line 276
    if-eq v4, v8, :cond_11

    .line 277
    .line 278
    iput v8, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 279
    .line 280
    :cond_11
    iget v4, v3, Landroid/content/res/Configuration;->navigation:I

    .line 281
    .line 282
    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    .line 283
    .line 284
    if-eq v4, v8, :cond_12

    .line 285
    .line 286
    iput v8, v7, Landroid/content/res/Configuration;->navigation:I

    .line 287
    .line 288
    :cond_12
    iget v4, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 289
    .line 290
    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 291
    .line 292
    if-eq v4, v8, :cond_13

    .line 293
    .line 294
    iput v8, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 295
    .line 296
    :cond_13
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    .line 297
    .line 298
    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    .line 299
    .line 300
    if-eq v4, v8, :cond_14

    .line 301
    .line 302
    iput v8, v7, Landroid/content/res/Configuration;->orientation:I

    .line 303
    .line 304
    :cond_14
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 305
    .line 306
    and-int/lit8 v4, v4, 0xf

    .line 307
    .line 308
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 309
    .line 310
    and-int/lit8 v8, v8, 0xf

    .line 311
    .line 312
    if-eq v4, v8, :cond_15

    .line 313
    .line 314
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 315
    .line 316
    or-int/2addr v4, v8

    .line 317
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 318
    .line 319
    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 320
    .line 321
    and-int/lit16 v4, v4, 0xc0

    .line 322
    .line 323
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 324
    .line 325
    and-int/lit16 v8, v8, 0xc0

    .line 326
    .line 327
    if-eq v4, v8, :cond_16

    .line 328
    .line 329
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 330
    .line 331
    or-int/2addr v4, v8

    .line 332
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 333
    .line 334
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 335
    .line 336
    and-int/lit8 v4, v4, 0x30

    .line 337
    .line 338
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 339
    .line 340
    and-int/lit8 v8, v8, 0x30

    .line 341
    .line 342
    if-eq v4, v8, :cond_17

    .line 343
    .line 344
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 345
    .line 346
    or-int/2addr v4, v8

    .line 347
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 348
    .line 349
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 350
    .line 351
    and-int/lit16 v4, v4, 0x300

    .line 352
    .line 353
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 354
    .line 355
    and-int/lit16 v8, v8, 0x300

    .line 356
    .line 357
    if-eq v4, v8, :cond_18

    .line 358
    .line 359
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 360
    .line 361
    or-int/2addr v4, v8

    .line 362
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 363
    .line 364
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->colorMode:I

    .line 365
    .line 366
    and-int/lit8 v4, v4, 0x3

    .line 367
    .line 368
    iget v8, v6, Landroid/content/res/Configuration;->colorMode:I

    .line 369
    .line 370
    and-int/lit8 v8, v8, 0x3

    .line 371
    .line 372
    if-eq v4, v8, :cond_19

    .line 373
    .line 374
    iget v4, v7, Landroid/content/res/Configuration;->colorMode:I

    .line 375
    .line 376
    or-int/2addr v4, v8

    .line 377
    iput v4, v7, Landroid/content/res/Configuration;->colorMode:I

    .line 378
    .line 379
    :cond_19
    iget v4, v3, Landroid/content/res/Configuration;->colorMode:I

    .line 380
    .line 381
    and-int/lit8 v4, v4, 0xc

    .line 382
    .line 383
    iget v8, v6, Landroid/content/res/Configuration;->colorMode:I

    .line 384
    .line 385
    and-int/lit8 v8, v8, 0xc

    .line 386
    .line 387
    if-eq v4, v8, :cond_1a

    .line 388
    .line 389
    iget v4, v7, Landroid/content/res/Configuration;->colorMode:I

    .line 390
    .line 391
    or-int/2addr v4, v8

    .line 392
    iput v4, v7, Landroid/content/res/Configuration;->colorMode:I

    .line 393
    .line 394
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 395
    .line 396
    and-int/lit8 v4, v4, 0xf

    .line 397
    .line 398
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 399
    .line 400
    and-int/lit8 v8, v8, 0xf

    .line 401
    .line 402
    if-eq v4, v8, :cond_1b

    .line 403
    .line 404
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 405
    .line 406
    or-int/2addr v4, v8

    .line 407
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 408
    .line 409
    :cond_1b
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 410
    .line 411
    and-int/lit8 v4, v4, 0x30

    .line 412
    .line 413
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 414
    .line 415
    and-int/lit8 v8, v8, 0x30

    .line 416
    .line 417
    if-eq v4, v8, :cond_1c

    .line 418
    .line 419
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 420
    .line 421
    or-int/2addr v4, v8

    .line 422
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 423
    .line 424
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 425
    .line 426
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 427
    .line 428
    if-eq v4, v8, :cond_1d

    .line 429
    .line 430
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 431
    .line 432
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 433
    .line 434
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 435
    .line 436
    if-eq v4, v8, :cond_1e

    .line 437
    .line 438
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 439
    .line 440
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 441
    .line 442
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 443
    .line 444
    if-eq v4, v8, :cond_1f

    .line 445
    .line 446
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 447
    .line 448
    :cond_1f
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 449
    .line 450
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 451
    .line 452
    if-eq v3, v4, :cond_21

    .line 453
    .line 454
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_20
    move-object v7, v5

    .line 458
    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v7, v1}, Lh6;->t(Landroid/content/Context;ILy70;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    new-instance v2, Lnj;

    .line 463
    .line 464
    const v3, 0x7f130290

    .line 465
    .line 466
    .line 467
    invoke-direct {v2, p1, v3}, Lnj;-><init>(Landroid/content/Context;I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2, v0}, Lnj;->a(Landroid/content/res/Configuration;)V

    .line 471
    .line 472
    .line 473
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 474
    .line 475
    .line 476
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_4

    .line 477
    if-eqz p1, :cond_25

    .line 478
    .line 479
    invoke-virtual {v2}, Lnj;->getTheme()Landroid/content/res/Resources$Theme;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 484
    .line 485
    const/16 v3, 0x1d

    .line 486
    .line 487
    if-lt v0, v3, :cond_22

    .line 488
    .line 489
    invoke-static {p1}, Leq0;->a(Landroid/content/res/Resources$Theme;)V

    .line 490
    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_22
    sget-object v0, Lou1;->i:Ljava/lang/Object;

    .line 494
    .line 495
    monitor-enter v0

    .line 496
    :try_start_4
    sget-boolean v3, Lou1;->k:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 497
    .line 498
    if-nez v3, :cond_23

    .line 499
    .line 500
    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 501
    .line 502
    const-string v4, "rebase"

    .line 503
    .line 504
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    sput-object v3, Lou1;->j:Ljava/lang/reflect/Method;

    .line 509
    .line 510
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 511
    .line 512
    .line 513
    goto :goto_6

    .line 514
    :catchall_1
    move-exception p1

    .line 515
    goto :goto_8

    .line 516
    :catch_2
    :goto_6
    :try_start_6
    sput-boolean v1, Lou1;->k:Z

    .line 517
    .line 518
    :cond_23
    sget-object v1, Lou1;->j:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 519
    .line 520
    if-eqz v1, :cond_24

    .line 521
    .line 522
    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 523
    .line 524
    .line 525
    goto :goto_7

    .line 526
    :catch_3
    :try_start_8
    sput-object v5, Lou1;->j:Ljava/lang/reflect/Method;

    .line 527
    .line 528
    :cond_24
    :goto_7
    monitor-exit v0

    .line 529
    goto :goto_9

    .line 530
    :goto_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 531
    throw p1

    .line 532
    :catch_4
    :cond_25
    :goto_9
    move-object p1, v2

    .line 533
    :goto_a
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 534
    .line 535
    .line 536
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li5;->n()Lm54;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lm54;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Li5;->n()Lm54;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x52

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lm54;->v(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lch;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p4, :cond_5

    .line 6
    .line 7
    array-length v1, p4

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    aget-object v1, p4, v0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v2, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :sswitch_1
    const-string v2, "--contentcapture"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v2, 0x1d

    .line 42
    .line 43
    if-lt v1, v2, :cond_5

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v2, "--list-dumpables"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :sswitch_3
    const-string v2, "--dump-dumpable"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v2, 0x21

    .line 67
    .line 68
    if-lt v1, v2, :cond_5

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :sswitch_4
    const-string v2, "--translation"

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v2, 0x1f

    .line 83
    .line 84
    if-lt v1, v2, :cond_5

    .line 85
    .line 86
    :cond_4
    :goto_0
    return-void

    .line 87
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v1, "Local FragmentActivity "

    .line 91
    .line 92
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v1, " State:"

    .line 107
    .line 108
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v2, "  "

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v2, "mCreated="

    .line 132
    .line 133
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-boolean v2, p0, Li5;->y:Z

    .line 137
    .line 138
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 139
    .line 140
    .line 141
    const-string v2, " mResumed="

    .line 142
    .line 143
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-boolean v2, p0, Li5;->z:Z

    .line 147
    .line 148
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 149
    .line 150
    .line 151
    const-string v2, " mStopped="

    .line 152
    .line 153
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-boolean v2, p0, Li5;->A:Z

    .line 157
    .line 158
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_8

    .line 166
    .line 167
    invoke-interface {p0}, Lr61;->d()Lq61;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    new-instance v3, Lug0;

    .line 172
    .line 173
    sget-object v4, Lv70;->c:Lzw;

    .line 174
    .line 175
    invoke-direct {v3, v2, v4}, Lug0;-><init>(Lq61;Lp61;)V

    .line 176
    .line 177
    .line 178
    const-class v2, Lv70;

    .line 179
    .line 180
    invoke-virtual {v3, v2}, Lug0;->t(Ljava/lang/Class;)Lm61;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Lv70;

    .line 185
    .line 186
    iget-object v2, v2, Lv70;->b:Ljx0;

    .line 187
    .line 188
    iget v3, v2, Ljx0;->h:I

    .line 189
    .line 190
    if-lez v3, :cond_8

    .line 191
    .line 192
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string v3, "Loaders:"

    .line 196
    .line 197
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget v3, v2, Ljx0;->h:I

    .line 201
    .line 202
    if-gtz v3, :cond_6

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_6
    iget-object p1, v2, Ljx0;->g:[Ljava/lang/Object;

    .line 206
    .line 207
    aget-object p1, p1, v0

    .line 208
    .line 209
    if-nez p1, :cond_7

    .line 210
    .line 211
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const-string p1, "  #"

    .line 215
    .line 216
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget-object p1, v2, Ljx0;->f:[I

    .line 220
    .line 221
    aget p1, p1, v0

    .line 222
    .line 223
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 224
    .line 225
    .line 226
    const-string p1, ": "

    .line 227
    .line 228
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const/4 p1, 0x0

    .line 232
    throw p1

    .line 233
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 234
    .line 235
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 236
    .line 237
    .line 238
    throw p1

    .line 239
    :cond_8
    :goto_2
    iget-object v0, p0, Li5;->w:Lof3;

    .line 240
    .line 241
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lkw;

    .line 244
    .line 245
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 246
    .line 247
    invoke-virtual {v0, p1, p2, p3, p4}, Lxw;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh6;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh6;->w()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh6;->q:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh6;

    .line 6
    .line 7
    iget-object v1, v0, Lh6;->u:Lhz0;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lh6;->A()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lhz0;

    .line 15
    .line 16
    iget-object v2, v0, Lh6;->t:Lm54;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lm54;->p()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lh6;->p:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lhz0;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lh6;->u:Lhz0;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lh6;->u:Lhz0;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Lz41;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lu5;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m()Lu5;
    .locals 2

    .line 1
    iget-object v0, p0, Li5;->B:Lh6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lu5;->f:Ls5;

    .line 6
    .line 7
    new-instance v0, Lh6;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lh6;-><init>(Landroid/content/Context;Landroid/view/Window;Ll5;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Li5;->B:Lh6;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Li5;->B:Lh6;

    .line 16
    .line 17
    return-object v0
.end method

.method public final n()Lm54;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh6;

    .line 6
    .line 7
    invoke-virtual {v0}, Lh6;->A()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lh6;->t:Lm54;

    .line 11
    .line 12
    return-object v0
.end method

.method public final o()Lxw;
    .locals 1

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    .line 3
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkw;

    .line 6
    .line 7
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 8
    .line 9
    return-object v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lof3;->e()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lch;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lch;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh6;

    .line 9
    .line 10
    iget-boolean v0, p1, Lh6;->K:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lh6;->E:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lh6;->A()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lh6;->t:Lm54;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lm54;->s()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Ll6;->a()Ll6;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p1, Lh6;->p:Landroid/content/Context;

    .line 33
    .line 34
    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v2, v0, Ll6;->a:Lzp0;

    .line 36
    .line 37
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iget-object v3, v2, Lzp0;->b:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ll80;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Ll80;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    monitor-exit v0

    .line 56
    new-instance v0, Landroid/content/res/Configuration;

    .line 57
    .line 58
    iget-object v1, p1, Lh6;->p:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p1, Lh6;->W:Landroid/content/res/Configuration;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-virtual {p1, v0, v0}, Lh6;->m(ZZ)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :try_start_4
    throw p1

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 82
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lch;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Li5;->x:Ld60;

    .line 5
    .line 6
    sget-object v0, Lt50;->ON_CREATE:Lt50;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ld60;->d(Lt50;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Li5;->w:Lof3;

    .line 12
    .line 13
    iget-object p1, p1, Lof3;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lkw;

    .line 16
    .line 17
    iget-object p1, p1, Lkw;->z:Lxw;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Lxw;->E:Z

    .line 21
    .line 22
    iput-boolean v0, p1, Lxw;->F:Z

    .line 23
    .line 24
    iget-object v1, p1, Lxw;->L:Lax;

    .line 25
    .line 26
    iput-boolean v0, v1, Lax;->g:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Lxw;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    check-cast v0, Lkw;

    .line 3
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 4
    iget-object v0, v0, Lxw;->f:Lnw;

    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lnw;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 7
    iget-object v0, p0, Li5;->w:Lof3;

    .line 8
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    check-cast v0, Lkw;

    .line 9
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 10
    iget-object v0, v0, Lxw;->f:Lnw;

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1, p2, p3}, Lnw;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 12
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li5;->q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lu5;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Li5;->r(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Li5;->n()Lm54;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v0, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lm54;->g()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Li5;->v()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Li5;->z:Z

    .line 6
    .line 7
    iget-object v0, p0, Li5;->w:Lof3;

    .line 8
    .line 9
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lkw;

    .line 12
    .line 13
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, Lxw;->t(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Li5;->x:Ld60;

    .line 20
    .line 21
    sget-object v1, Lt50;->ON_PAUSE:Lt50;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lh6;

    .line 9
    .line 10
    invoke-virtual {p1}, Lh6;->w()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li5;->s()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh6;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh6;->A()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh6;->t:Lm54;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lm54;->z(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lof3;->e()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lch;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lof3;->e()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Li5;->z:Z

    .line 11
    .line 12
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkw;

    .line 15
    .line 16
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lxw;->y(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li5;->t()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh6;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lh6;->m(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lof3;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li5;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh6;

    .line 9
    .line 10
    invoke-virtual {v0}, Lh6;->A()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh6;->t:Lm54;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Lm54;->z(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Lu5;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li5;->n()Lm54;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lm54;->w()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li5;->w:Lof3;

    .line 5
    .line 6
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkw;

    .line 9
    .line 10
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 11
    .line 12
    invoke-virtual {v0}, Lxw;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Li5;->x:Ld60;

    .line 16
    .line 17
    sget-object v1, Lt50;->ON_DESTROY:Lt50;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final r(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lch;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Li5;->w:Lof3;

    .line 13
    .line 14
    iget-object p1, p1, Lof3;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lkw;

    .line 17
    .line 18
    iget-object p1, p1, Lkw;->z:Lxw;

    .line 19
    .line 20
    invoke-virtual {p1}, Lxw;->i()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final s()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li5;->x:Ld60;

    .line 5
    .line 6
    sget-object v1, Lt50;->ON_RESUME:Lt50;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li5;->w:Lof3;

    .line 12
    .line 13
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lkw;

    .line 16
    .line 17
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Lxw;->E:Z

    .line 21
    .line 22
    iput-boolean v1, v0, Lxw;->F:Z

    .line 23
    .line 24
    iget-object v2, v0, Lxw;->L:Lax;

    .line 25
    .line 26
    iput-boolean v1, v2, Lax;->g:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, Lxw;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lch;->j()V

    .line 2
    invoke-virtual {p0}, Li5;->m()Lu5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu5;->h(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lch;->j()V

    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu5;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lch;->j()V

    .line 6
    invoke-virtual {p0}, Li5;->m()Lu5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lu5;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lh6;

    .line 9
    .line 10
    iput p1, v0, Lh6;->Y:I

    .line 11
    .line 12
    return-void
.end method

.method public final t()V
    .locals 5

    .line 1
    iget-object v0, p0, Li5;->w:Lof3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lof3;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lof3;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkw;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Li5;->A:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Li5;->y:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Li5;->y:Z

    .line 22
    .line 23
    iget-object v2, v0, Lkw;->z:Lxw;

    .line 24
    .line 25
    iput-boolean v1, v2, Lxw;->E:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Lxw;->F:Z

    .line 28
    .line 29
    iget-object v4, v2, Lxw;->L:Lax;

    .line 30
    .line 31
    iput-boolean v1, v4, Lax;->g:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Lxw;->t(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, Lkw;->z:Lxw;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lxw;->y(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Li5;->x:Ld60;

    .line 43
    .line 44
    sget-object v3, Lt50;->ON_START:Lt50;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ld60;->d(Lt50;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lkw;->z:Lxw;

    .line 50
    .line 51
    iput-boolean v1, v0, Lxw;->E:Z

    .line 52
    .line 53
    iput-boolean v1, v0, Lxw;->F:Z

    .line 54
    .line 55
    iget-object v2, v0, Lxw;->L:Lax;

    .line 56
    .line 57
    iput-boolean v1, v2, Lax;->g:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, Lxw;->t(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final u()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Li5;->A:Z

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Li5;->o()Lxw;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Li5;->p(Lxw;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Li5;->w:Lof3;

    .line 18
    .line 19
    iget-object v1, v1, Lof3;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lkw;

    .line 22
    .line 23
    iget-object v1, v1, Lkw;->z:Lxw;

    .line 24
    .line 25
    iput-boolean v0, v1, Lxw;->F:Z

    .line 26
    .line 27
    iget-object v2, v1, Lxw;->L:Lax;

    .line 28
    .line 29
    iput-boolean v0, v2, Lax;->g:Z

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    invoke-virtual {v1, v0}, Lxw;->t(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Li5;->x:Ld60;

    .line 36
    .line 37
    sget-object v1, Lt50;->ON_STOP:Lt50;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public v()Z
    .locals 5

    .line 1
    invoke-static {p0}, Lm54;->k(Li5;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_5

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lm54;->k(Li5;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-static {p0}, Lm54;->k(Li5;)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_0
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    :try_start_0
    invoke-static {p0, v3}, Lm54;->l(Li5;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_0
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v4, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {p0, v3}, Lm54;->l(Li5;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :goto_1
    const-string v1, "TaskStackBuilder"

    .line 74
    .line 75
    const-string v2, "Bad ComponentName while traversing activity parent metadata"

    .line 76
    .line 77
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    new-array v2, v1, [Landroid/content/Intent;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, [Landroid/content/Intent;

    .line 99
    .line 100
    new-instance v2, Landroid/content/Intent;

    .line 101
    .line 102
    aget-object v3, v0, v1

    .line 103
    .line 104
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 105
    .line 106
    .line 107
    const v3, 0x1000c000

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    aput-object v2, v0, v1

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 118
    .line 119
    .line 120
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    const-string v1, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 131
    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 137
    .line 138
    .line 139
    :goto_3
    const/4 v0, 0x1

    .line 140
    return v0

    .line 141
    :cond_6
    return v1
.end method

.method public final w(Landroidx/appcompat/widget/Toolbar;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li5;->m()Lu5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lh6;

    .line 6
    .line 7
    iget-object v1, v0, Lh6;->o:Ljava/lang/Object;

    .line 8
    .line 9
    instance-of v1, v1, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Lh6;->A()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lh6;->t:Lm54;

    .line 18
    .line 19
    instance-of v2, v1, Lt81;

    .line 20
    .line 21
    if-nez v2, :cond_3

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput-object v2, v0, Lh6;->u:Lhz0;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Lm54;->t()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v2, v0, Lh6;->t:Lm54;

    .line 32
    .line 33
    new-instance v1, Lf21;

    .line 34
    .line 35
    iget-object v2, v0, Lh6;->o:Ljava/lang/Object;

    .line 36
    .line 37
    instance-of v3, v2, Landroid/app/Activity;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    check-cast v2, Landroid/app/Activity;

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v2, v0, Lh6;->v:Ljava/lang/CharSequence;

    .line 49
    .line 50
    :goto_0
    iget-object v3, v0, Lh6;->r:Lb6;

    .line 51
    .line 52
    invoke-direct {v1, p1, v2, v3}, Lf21;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Lb6;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Lh6;->t:Lm54;

    .line 56
    .line 57
    iget-object v2, v0, Lh6;->r:Lb6;

    .line 58
    .line 59
    iget-object v1, v1, Lf21;->i:Lzs1;

    .line 60
    .line 61
    iput-object v1, v2, Lb6;->g:Lzs1;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lh6;->a()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method
