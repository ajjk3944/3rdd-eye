.class public final Le33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lq53;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpq3;Ll83;Le51;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Le33;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le33;->c:Ljava/lang/Object;

    iput-object p2, p0, Le33;->d:Ljava/lang/Object;

    iput-object p3, p0, Le33;->b:Ljava/lang/Object;

    iput-object p4, p0, Le33;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ll83;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Le33;->a:I

    iput-object p1, p0, Le33;->d:Ljava/lang/Object;

    iput-object p2, p0, Le33;->b:Ljava/lang/Object;

    iput-object p3, p0, Le33;->c:Ljava/lang/Object;

    iput-object p4, p0, Le33;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lpq3;Landroid/view/ViewGroup;Landroid/content/Context;Ljava/util/Set;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Le33;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le33;->d:Ljava/lang/Object;

    iput-object p4, p0, Le33;->b:Ljava/lang/Object;

    iput-object p2, p0, Le33;->e:Ljava/lang/Object;

    iput-object p3, p0, Le33;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lpq3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p5, p0, Le33;->a:I

    iput-object p1, p0, Le33;->d:Ljava/lang/Object;

    iput-object p2, p0, Le33;->c:Ljava/lang/Object;

    iput-object p3, p0, Le33;->b:Ljava/lang/Object;

    iput-object p4, p0, Le33;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln70;
    .locals 4

    .line 1
    iget v0, p0, Le33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxs1;

    .line 7
    .line 8
    const/16 v1, 0x1a

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Le33;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lpq3;

    .line 16
    .line 17
    check-cast v1, Lld2;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Lxs1;

    .line 25
    .line 26
    const/16 v1, 0x18

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Le33;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lpq3;

    .line 34
    .line 35
    check-cast v1, Lld2;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_1
    new-instance v0, Lxs1;

    .line 43
    .line 44
    const/16 v1, 0x16

    .line 45
    .line 46
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Le33;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lpq3;

    .line 52
    .line 53
    check-cast v1, Lld2;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :pswitch_2
    new-instance v0, Lxs1;

    .line 61
    .line 62
    const/16 v1, 0x14

    .line 63
    .line 64
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Le33;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lpq3;

    .line 70
    .line 71
    check-cast v1, Lld2;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_3
    new-instance v0, Lxs1;

    .line 79
    .line 80
    const/16 v1, 0x10

    .line 81
    .line 82
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Le33;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lpq3;

    .line 88
    .line 89
    check-cast v1, Lld2;

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0

    .line 96
    :pswitch_4
    iget-object v0, p0, Le33;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ln33;

    .line 99
    .line 100
    sget-object v1, Lmz1;->tc:Liz1;

    .line 101
    .line 102
    sget-object v2, Ltw1;->e:Ltw1;

    .line 103
    .line 104
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 105
    .line 106
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 107
    .line 108
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_0

    .line 119
    .line 120
    iget-object v3, v0, Ln33;->b:Lm33;

    .line 121
    .line 122
    if-eqz v3, :cond_0

    .line 123
    .line 124
    invoke-static {v3}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    goto :goto_1

    .line 129
    :cond_0
    sget-object v3, Lmz1;->z1:Liz1;

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v3}, Lyc0;->s(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_2

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_1

    .line 154
    .line 155
    iget-object v1, v0, Ln33;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_2

    .line 162
    .line 163
    iget-object v1, p0, Le33;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Lmw2;

    .line 166
    .line 167
    iget-boolean v1, v1, Lmw2;->b:Z

    .line 168
    .line 169
    if-nez v1, :cond_1

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_1
    iget-object v0, v0, Ln33;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 173
    .line 174
    const/4 v1, 0x1

    .line 175
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Le33;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lpq3;

    .line 181
    .line 182
    new-instance v1, Lxs1;

    .line 183
    .line 184
    const/16 v2, 0xa

    .line 185
    .line 186
    invoke-direct {v1, v2, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    check-cast v0, Lld2;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_1

    .line 196
    :cond_2
    :goto_0
    new-instance v0, Lm33;

    .line 197
    .line 198
    new-instance v1, Landroid/os/Bundle;

    .line 199
    .line 200
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 201
    .line 202
    .line 203
    const/4 v2, 0x0

    .line 204
    invoke-direct {v0, v2, v1}, Lm33;-><init>(ILandroid/os/Bundle;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_1
    return-object v0

    .line 212
    :pswitch_5
    iget-object v0, p0, Le33;->d:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, Lf43;

    .line 215
    .line 216
    invoke-virtual {v0}, Lf43;->a()Ln70;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    new-instance v1, Lvn1;

    .line 221
    .line 222
    const/4 v2, 0x4

    .line 223
    invoke-direct {v1, v2, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    sget-object v2, Lmd2;->g:Lld2;

    .line 227
    .line 228
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    return-object v0

    .line 233
    :pswitch_6
    iget-object v0, p0, Le33;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Landroid/content/Context;

    .line 236
    .line 237
    invoke-static {v0}, Lmz1;->a(Landroid/content/Context;)V

    .line 238
    .line 239
    .line 240
    new-instance v0, Lxs1;

    .line 241
    .line 242
    const/16 v1, 0x8

    .line 243
    .line 244
    invoke-direct {v0, v1, p0}, Lxs1;-><init>(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object v1, p0, Le33;->d:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, Lpq3;

    .line 250
    .line 251
    check-cast v1, Lld2;

    .line 252
    .line 253
    invoke-virtual {v1, v0}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(F)Ly20;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    sget-object v1, Ly20;->e:Ly20;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1e

    .line 12
    .line 13
    if-lt v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Le33;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/content/Context;

    .line 18
    .line 19
    const-string v2, "window"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/WindowManager;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Lm91;->i(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lm91;->g(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {}, Lu0;->v()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {}, Lm91;->a()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v1, v2

    .line 46
    invoke-static {}, Lu0;->y()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    or-int/2addr v1, v2

    .line 51
    invoke-static {}, Lu0;->z()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    or-int/2addr v1, v2

    .line 56
    invoke-static {v0, v1}, Lu0;->h(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Ly20;->c(Landroid/graphics/Insets;)Ly20;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 66
    .line 67
    iget-object v0, v0, Lhg4;->g:Lwy0;

    .line 68
    .line 69
    invoke-virtual {v0}, Lwy0;->i()Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 88
    .line 89
    invoke-static {v0}, Lu51;->a(Landroid/view/View;)Lo91;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    const/16 v1, 0x87

    .line 96
    .line 97
    iget-object v0, v0, Lo91;->a:Ll91;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ll91;->f(I)Ly20;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_2
    :goto_0
    iget v0, v1, Ly20;->a:I

    .line 104
    .line 105
    int-to-float v0, v0

    .line 106
    div-float/2addr v0, p1

    .line 107
    float-to-double v2, v0

    .line 108
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    double-to-int v0, v2

    .line 113
    iget v2, v1, Ly20;->b:I

    .line 114
    .line 115
    int-to-float v2, v2

    .line 116
    div-float/2addr v2, p1

    .line 117
    float-to-double v2, v2

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    double-to-int v2, v2

    .line 123
    iget v3, v1, Ly20;->c:I

    .line 124
    .line 125
    int-to-float v3, v3

    .line 126
    div-float/2addr v3, p1

    .line 127
    float-to-double v3, v3

    .line 128
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    double-to-int v3, v3

    .line 133
    iget v1, v1, Ly20;->d:I

    .line 134
    .line 135
    int-to-float v1, v1

    .line 136
    div-float/2addr v1, p1

    .line 137
    float-to-double v4, v1

    .line 138
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 139
    .line 140
    .line 141
    move-result-wide v4

    .line 142
    double-to-int p1, v4

    .line 143
    invoke-static {v0, v2, v3, p1}, Ly20;->b(IIII)Ly20;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Le33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x23

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    const/16 v0, 0x35

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    const/16 v0, 0x1a

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    const/16 v0, 0x16

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_3
    const/16 v0, 0x11

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_4
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :pswitch_5
    const/4 v0, 0x7

    .line 24
    return v0

    .line 25
    :pswitch_6
    const/4 v0, 0x3

    .line 26
    return v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
