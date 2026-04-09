.class public final Lde1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lsd1;

.field public final b:Lhe1;

.field public c:Z

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Z

.field public j:F

.field public k:Lpz;

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsd1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lde1;->a:Lsd1;

    .line 5
    .line 6
    new-instance p2, Lhe1;

    .line 7
    .line 8
    invoke-direct {p2, p1}, Lhe1;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lde1;->b:Lhe1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lde1;->d:I

    .line 15
    .line 16
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide p1, p0, Lde1;->e:J

    .line 22
    .line 23
    iput-wide p1, p0, Lde1;->g:J

    .line 24
    .line 25
    iput-wide p1, p0, Lde1;->h:J

    .line 26
    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p1, p0, Lde1;->j:F

    .line 30
    .line 31
    sget-object p1, Lpz;->o:Lpz;

    .line 32
    .line 33
    iput-object p1, p0, Lde1;->k:Lpz;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    iget v0, p0, Lde1;->d:I

    .line 8
    .line 9
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lde1;->d:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lde1;->d:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iput v0, p0, Lde1;->d:I

    .line 21
    .line 22
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lde1;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, Lde1;->k:Lpz;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Lv23;->r(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, p0, Lde1;->f:J

    .line 18
    .line 19
    iget-object v1, p0, Lde1;->b:Lhe1;

    .line 20
    .line 21
    iput-boolean v0, v1, Lhe1;->d:Z

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    iput-wide v2, v1, Lhe1;->m:J

    .line 26
    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    iput-wide v2, v1, Lhe1;->p:J

    .line 30
    .line 31
    iput-wide v2, v1, Lhe1;->n:J

    .line 32
    .line 33
    iget-object v0, v1, Lhe1;->b:Lfe1;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v3, v0, Lfe1;->a:Landroid/hardware/display/DisplayManager;

    .line 39
    .line 40
    iget-object v4, v1, Lhe1;->c:Lge1;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v4, v4, Lge1;->g:Landroid/os/Handler;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-virtual {v4, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v5, Landroid/os/Handler;

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-direct {v5, v4, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v0, v5}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, Lfe1;->b:Lhe1;

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v0, v3}, Lhe1;->a(Landroid/view/Display;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {v1, v2}, Lhe1;->c(Z)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lde1;->c:Z

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lde1;->h:J

    .line 10
    .line 11
    iget-object v1, p0, Lde1;->b:Lhe1;

    .line 12
    .line 13
    iput-boolean v0, v1, Lhe1;->d:Z

    .line 14
    .line 15
    iget-object v0, v1, Lhe1;->b:Lfe1;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, Lfe1;->a:Landroid/hardware/display/DisplayManager;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, Lhe1;->c:Lge1;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lge1;->g:Landroid/os/Handler;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, Lhe1;->d()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final d(Landroid/view/Surface;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    iput-boolean v2, p0, Lde1;->l:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lde1;->m:Z

    .line 11
    .line 12
    iget-object v0, p0, Lde1;->b:Lhe1;

    .line 13
    .line 14
    iget-object v2, v0, Lhe1;->e:Landroid/view/Surface;

    .line 15
    .line 16
    if-ne v2, p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v0}, Lhe1;->d()V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, Lhe1;->e:Landroid/view/Surface;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lhe1;->c(Z)V

    .line 25
    .line 26
    .line 27
    :goto_1
    iget p1, p0, Lde1;->d:I

    .line 28
    .line 29
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lde1;->d:I

    .line 34
    .line 35
    return-void
.end method

.method public final e(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lde1;->b:Lhe1;

    .line 2
    .line 3
    iput p1, v0, Lhe1;->f:F

    .line 4
    .line 5
    iget-object p1, v0, Lhe1;->a:Lod1;

    .line 6
    .line 7
    iget-object v1, p1, Lod1;->a:Lnd1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lnd1;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, Lod1;->b:Lnd1;

    .line 13
    .line 14
    invoke-virtual {v1}, Lnd1;->a()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, p1, Lod1;->c:Z

    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v2, p1, Lod1;->d:J

    .line 26
    .line 27
    iput v1, p1, Lod1;->e:I

    .line 28
    .line 29
    invoke-virtual {v0}, Lhe1;->b()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final f(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Lde1;->d:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq p1, v3, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lde1;->l:Z

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    iget-boolean p1, p0, Lde1;->m:Z

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-wide v1, p0, Lde1;->h:J

    .line 24
    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    iget-wide v3, p0, Lde1;->h:J

    .line 27
    .line 28
    cmp-long p1, v3, v1

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    return v3

    .line 34
    :cond_2
    iget-object p1, p0, Lde1;->k:Lpz;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    iget-wide v6, p0, Lde1;->h:J

    .line 44
    .line 45
    cmp-long p1, v4, v6

    .line 46
    .line 47
    if-gez p1, :cond_3

    .line 48
    .line 49
    return v0

    .line 50
    :cond_3
    iput-wide v1, p0, Lde1;->h:J

    .line 51
    .line 52
    return v3
.end method

.method public final g(JJJJZZLib1;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v8, p11

    .line 8
    .line 9
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v6, v8, Lib1;->a:J

    .line 15
    .line 16
    iput-wide v6, v8, Lib1;->b:J

    .line 17
    .line 18
    iget-boolean v3, v0, Lde1;->c:Z

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-wide v9, v0, Lde1;->e:J

    .line 23
    .line 24
    cmp-long v3, v9, v6

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    iput-wide v4, v0, Lde1;->e:J

    .line 29
    .line 30
    :cond_0
    iget-wide v9, v0, Lde1;->g:J

    .line 31
    .line 32
    cmp-long v3, v9, v1

    .line 33
    .line 34
    const-wide/16 v11, -0x1

    .line 35
    .line 36
    const/4 v15, 0x0

    .line 37
    const-wide/16 v16, 0x3e8

    .line 38
    .line 39
    const/4 v13, 0x1

    .line 40
    if-eqz v3, :cond_9

    .line 41
    .line 42
    iget-object v3, v0, Lde1;->b:Lhe1;

    .line 43
    .line 44
    move-wide/from16 v18, v6

    .line 45
    .line 46
    iget-wide v6, v3, Lhe1;->n:J

    .line 47
    .line 48
    cmp-long v14, v6, v11

    .line 49
    .line 50
    if-eqz v14, :cond_1

    .line 51
    .line 52
    iput-wide v6, v3, Lhe1;->p:J

    .line 53
    .line 54
    iget-wide v6, v3, Lhe1;->o:J

    .line 55
    .line 56
    iput-wide v6, v3, Lhe1;->q:J

    .line 57
    .line 58
    :cond_1
    iget-wide v6, v3, Lhe1;->m:J

    .line 59
    .line 60
    const-wide/16 v20, 0x1

    .line 61
    .line 62
    add-long v6, v6, v20

    .line 63
    .line 64
    iput-wide v6, v3, Lhe1;->m:J

    .line 65
    .line 66
    iget-object v6, v3, Lhe1;->a:Lod1;

    .line 67
    .line 68
    move-wide/from16 v20, v11

    .line 69
    .line 70
    mul-long v11, v1, v16

    .line 71
    .line 72
    iget-object v7, v6, Lod1;->a:Lnd1;

    .line 73
    .line 74
    invoke-virtual {v7, v11, v12}, Lnd1;->c(J)V

    .line 75
    .line 76
    .line 77
    iget-object v7, v6, Lod1;->a:Lnd1;

    .line 78
    .line 79
    invoke-virtual {v7}, Lnd1;->b()Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_2

    .line 84
    .line 85
    iput-boolean v15, v6, Lod1;->c:Z

    .line 86
    .line 87
    const-wide/16 v22, 0x0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const-wide/16 v22, 0x0

    .line 91
    .line 92
    iget-wide v9, v6, Lod1;->d:J

    .line 93
    .line 94
    cmp-long v7, v9, v18

    .line 95
    .line 96
    if-eqz v7, :cond_6

    .line 97
    .line 98
    iget-boolean v7, v6, Lod1;->c:Z

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    iget-object v7, v6, Lod1;->b:Lnd1;

    .line 103
    .line 104
    iget-wide v9, v7, Lnd1;->d:J

    .line 105
    .line 106
    cmp-long v14, v9, v22

    .line 107
    .line 108
    if-nez v14, :cond_3

    .line 109
    .line 110
    move v7, v15

    .line 111
    goto :goto_0

    .line 112
    :cond_3
    iget-object v7, v7, Lnd1;->g:[Z

    .line 113
    .line 114
    add-long v9, v9, v20

    .line 115
    .line 116
    const-wide/16 v24, 0xf

    .line 117
    .line 118
    rem-long v9, v9, v24

    .line 119
    .line 120
    long-to-int v9, v9

    .line 121
    aget-boolean v7, v7, v9

    .line 122
    .line 123
    :goto_0
    if-eqz v7, :cond_5

    .line 124
    .line 125
    :cond_4
    iget-object v7, v6, Lod1;->b:Lnd1;

    .line 126
    .line 127
    invoke-virtual {v7}, Lnd1;->a()V

    .line 128
    .line 129
    .line 130
    iget-object v7, v6, Lod1;->b:Lnd1;

    .line 131
    .line 132
    iget-wide v9, v6, Lod1;->d:J

    .line 133
    .line 134
    invoke-virtual {v7, v9, v10}, Lnd1;->c(J)V

    .line 135
    .line 136
    .line 137
    :cond_5
    iput-boolean v13, v6, Lod1;->c:Z

    .line 138
    .line 139
    iget-object v7, v6, Lod1;->b:Lnd1;

    .line 140
    .line 141
    invoke-virtual {v7, v11, v12}, Lnd1;->c(J)V

    .line 142
    .line 143
    .line 144
    :cond_6
    :goto_1
    iget-boolean v7, v6, Lod1;->c:Z

    .line 145
    .line 146
    if-eqz v7, :cond_7

    .line 147
    .line 148
    iget-object v7, v6, Lod1;->b:Lnd1;

    .line 149
    .line 150
    invoke-virtual {v7}, Lnd1;->b()Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_7

    .line 155
    .line 156
    iget-object v7, v6, Lod1;->a:Lnd1;

    .line 157
    .line 158
    iget-object v9, v6, Lod1;->b:Lnd1;

    .line 159
    .line 160
    iput-object v9, v6, Lod1;->a:Lnd1;

    .line 161
    .line 162
    iput-object v7, v6, Lod1;->b:Lnd1;

    .line 163
    .line 164
    iput-boolean v15, v6, Lod1;->c:Z

    .line 165
    .line 166
    :cond_7
    iput-wide v11, v6, Lod1;->d:J

    .line 167
    .line 168
    iget-object v7, v6, Lod1;->a:Lnd1;

    .line 169
    .line 170
    invoke-virtual {v7}, Lnd1;->b()Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_8

    .line 175
    .line 176
    move v7, v15

    .line 177
    goto :goto_2

    .line 178
    :cond_8
    iget v7, v6, Lod1;->e:I

    .line 179
    .line 180
    add-int/2addr v7, v13

    .line 181
    :goto_2
    iput v7, v6, Lod1;->e:I

    .line 182
    .line 183
    invoke-virtual {v3}, Lhe1;->b()V

    .line 184
    .line 185
    .line 186
    iput-wide v1, v0, Lde1;->g:J

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_9
    move-wide/from16 v18, v6

    .line 190
    .line 191
    move-wide/from16 v20, v11

    .line 192
    .line 193
    const-wide/16 v22, 0x0

    .line 194
    .line 195
    :goto_3
    sub-long/2addr v1, v4

    .line 196
    iget v3, v0, Lde1;->j:F

    .line 197
    .line 198
    float-to-double v6, v3

    .line 199
    iget-boolean v3, v0, Lde1;->c:Z

    .line 200
    .line 201
    long-to-double v1, v1

    .line 202
    div-double/2addr v1, v6

    .line 203
    double-to-long v1, v1

    .line 204
    if-eqz v3, :cond_a

    .line 205
    .line 206
    iget-object v3, v0, Lde1;->k:Lpz;

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    invoke-static {v6, v7}, Lv23;->r(J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    sub-long v6, v6, p5

    .line 220
    .line 221
    sub-long/2addr v1, v6

    .line 222
    :cond_a
    move-wide v2, v1

    .line 223
    iput-wide v2, v8, Lib1;->a:J

    .line 224
    .line 225
    const/4 v9, 0x3

    .line 226
    if-eqz p9, :cond_c

    .line 227
    .line 228
    if-eqz p10, :cond_b

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_b
    :goto_4
    move/from16 p1, v9

    .line 232
    .line 233
    goto/16 :goto_f

    .line 234
    .line 235
    :cond_c
    :goto_5
    iget-boolean v1, v0, Lde1;->l:Z

    .line 236
    .line 237
    if-nez v1, :cond_e

    .line 238
    .line 239
    iput-boolean v13, v0, Lde1;->m:Z

    .line 240
    .line 241
    iget-object v1, v0, Lde1;->a:Lsd1;

    .line 242
    .line 243
    const/4 v7, 0x1

    .line 244
    move/from16 v6, p10

    .line 245
    .line 246
    invoke-virtual/range {v1 .. v7}, Lsd1;->r0(JJZZ)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_d

    .line 251
    .line 252
    goto/16 :goto_e

    .line 253
    .line 254
    :cond_d
    iget-boolean v1, v0, Lde1;->c:Z

    .line 255
    .line 256
    if-eqz v1, :cond_23

    .line 257
    .line 258
    iget-wide v1, v8, Lib1;->a:J

    .line 259
    .line 260
    const-wide/16 v3, 0x7530

    .line 261
    .line 262
    cmp-long v1, v1, v3

    .line 263
    .line 264
    if-gez v1, :cond_23

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_e
    iget-wide v4, v0, Lde1;->h:J

    .line 268
    .line 269
    cmp-long v1, v4, v18

    .line 270
    .line 271
    const-wide/16 v10, -0x7530

    .line 272
    .line 273
    const/4 v12, 0x2

    .line 274
    if-eqz v1, :cond_f

    .line 275
    .line 276
    iget-boolean v1, v0, Lde1;->i:Z

    .line 277
    .line 278
    if-nez v1, :cond_f

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_f
    iget v1, v0, Lde1;->d:I

    .line 282
    .line 283
    if-eqz v1, :cond_12

    .line 284
    .line 285
    if-eq v1, v13, :cond_13

    .line 286
    .line 287
    if-eq v1, v12, :cond_11

    .line 288
    .line 289
    if-ne v1, v9, :cond_10

    .line 290
    .line 291
    iget-object v1, v0, Lde1;->k:Lpz;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 297
    .line 298
    .line 299
    move-result-wide v4

    .line 300
    invoke-static {v4, v5}, Lv23;->r(J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v4

    .line 304
    iget-wide v6, v0, Lde1;->f:J

    .line 305
    .line 306
    sub-long/2addr v4, v6

    .line 307
    iget-boolean v1, v0, Lde1;->c:Z

    .line 308
    .line 309
    if-eqz v1, :cond_14

    .line 310
    .line 311
    iget-wide v6, v0, Lde1;->e:J

    .line 312
    .line 313
    cmp-long v1, v6, v18

    .line 314
    .line 315
    if-eqz v1, :cond_14

    .line 316
    .line 317
    cmp-long v1, v6, p3

    .line 318
    .line 319
    if-eqz v1, :cond_14

    .line 320
    .line 321
    cmp-long v1, v2, v10

    .line 322
    .line 323
    if-gez v1, :cond_14

    .line 324
    .line 325
    const-wide/32 v1, 0x186a0

    .line 326
    .line 327
    .line 328
    cmp-long v1, v4, v1

    .line 329
    .line 330
    if-lez v1, :cond_14

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 334
    .line 335
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 336
    .line 337
    .line 338
    throw v1

    .line 339
    :cond_11
    cmp-long v1, p3, p7

    .line 340
    .line 341
    if-ltz v1, :cond_14

    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_12
    iget-boolean v1, v0, Lde1;->c:Z

    .line 345
    .line 346
    if-eqz v1, :cond_14

    .line 347
    .line 348
    :cond_13
    :goto_6
    return v15

    .line 349
    :cond_14
    :goto_7
    iget-boolean v1, v0, Lde1;->c:Z

    .line 350
    .line 351
    if-eqz v1, :cond_23

    .line 352
    .line 353
    iget-wide v1, v0, Lde1;->e:J

    .line 354
    .line 355
    cmp-long v1, p3, v1

    .line 356
    .line 357
    if-nez v1, :cond_15

    .line 358
    .line 359
    goto/16 :goto_10

    .line 360
    .line 361
    :cond_15
    iget-object v1, v0, Lde1;->k:Lpz;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 367
    .line 368
    .line 369
    move-result-wide v1

    .line 370
    iget-object v3, v0, Lde1;->b:Lhe1;

    .line 371
    .line 372
    iget-wide v4, v8, Lib1;->a:J

    .line 373
    .line 374
    mul-long v4, v4, v16

    .line 375
    .line 376
    add-long/2addr v4, v1

    .line 377
    iget-wide v6, v3, Lhe1;->p:J

    .line 378
    .line 379
    cmp-long v6, v6, v20

    .line 380
    .line 381
    if-eqz v6, :cond_19

    .line 382
    .line 383
    iget-object v6, v3, Lhe1;->a:Lod1;

    .line 384
    .line 385
    iget-object v7, v6, Lod1;->a:Lnd1;

    .line 386
    .line 387
    invoke-virtual {v7}, Lnd1;->b()Z

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    if-eqz v7, :cond_19

    .line 392
    .line 393
    iget-object v7, v6, Lod1;->a:Lnd1;

    .line 394
    .line 395
    invoke-virtual {v7}, Lnd1;->b()Z

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    if-eqz v7, :cond_17

    .line 400
    .line 401
    iget-object v6, v6, Lod1;->a:Lnd1;

    .line 402
    .line 403
    move/from16 p1, v9

    .line 404
    .line 405
    move-wide/from16 p5, v10

    .line 406
    .line 407
    iget-wide v9, v6, Lnd1;->e:J

    .line 408
    .line 409
    cmp-long v7, v9, v22

    .line 410
    .line 411
    if-nez v7, :cond_16

    .line 412
    .line 413
    move-wide/from16 v6, v22

    .line 414
    .line 415
    goto :goto_8

    .line 416
    :cond_16
    iget-wide v6, v6, Lnd1;->f:J

    .line 417
    .line 418
    div-long/2addr v6, v9

    .line 419
    goto :goto_8

    .line 420
    :cond_17
    move/from16 p1, v9

    .line 421
    .line 422
    move-wide/from16 p5, v10

    .line 423
    .line 424
    move-wide/from16 v6, v18

    .line 425
    .line 426
    :goto_8
    iget-wide v9, v3, Lhe1;->q:J

    .line 427
    .line 428
    move/from16 p2, v12

    .line 429
    .line 430
    move v11, v13

    .line 431
    iget-wide v12, v3, Lhe1;->m:J

    .line 432
    .line 433
    move/from16 p7, v11

    .line 434
    .line 435
    move-wide/from16 v24, v12

    .line 436
    .line 437
    iget-wide v11, v3, Lhe1;->p:J

    .line 438
    .line 439
    sub-long v12, v24, v11

    .line 440
    .line 441
    mul-long/2addr v12, v6

    .line 442
    iget v6, v3, Lhe1;->i:F

    .line 443
    .line 444
    long-to-float v7, v12

    .line 445
    div-float/2addr v7, v6

    .line 446
    float-to-long v6, v7

    .line 447
    add-long/2addr v9, v6

    .line 448
    sub-long v6, v4, v9

    .line 449
    .line 450
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 451
    .line 452
    .line 453
    move-result-wide v6

    .line 454
    const-wide/32 v11, 0x1312d00

    .line 455
    .line 456
    .line 457
    cmp-long v6, v6, v11

    .line 458
    .line 459
    if-lez v6, :cond_18

    .line 460
    .line 461
    move-wide/from16 v6, v22

    .line 462
    .line 463
    iput-wide v6, v3, Lhe1;->m:J

    .line 464
    .line 465
    move-wide/from16 v6, v20

    .line 466
    .line 467
    iput-wide v6, v3, Lhe1;->p:J

    .line 468
    .line 469
    iput-wide v6, v3, Lhe1;->n:J

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_18
    move-wide v4, v9

    .line 473
    goto :goto_9

    .line 474
    :cond_19
    move/from16 p1, v9

    .line 475
    .line 476
    move-wide/from16 p5, v10

    .line 477
    .line 478
    move/from16 p2, v12

    .line 479
    .line 480
    move/from16 p7, v13

    .line 481
    .line 482
    :goto_9
    iget-wide v6, v3, Lhe1;->m:J

    .line 483
    .line 484
    iput-wide v6, v3, Lhe1;->n:J

    .line 485
    .line 486
    iput-wide v4, v3, Lhe1;->o:J

    .line 487
    .line 488
    iget-object v6, v3, Lhe1;->c:Lge1;

    .line 489
    .line 490
    if-eqz v6, :cond_1d

    .line 491
    .line 492
    iget-wide v9, v3, Lhe1;->k:J

    .line 493
    .line 494
    cmp-long v7, v9, v18

    .line 495
    .line 496
    if-nez v7, :cond_1a

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_1a
    iget-wide v6, v6, Lge1;->f:J

    .line 500
    .line 501
    cmp-long v9, v6, v18

    .line 502
    .line 503
    if-eqz v9, :cond_1d

    .line 504
    .line 505
    iget-wide v9, v3, Lhe1;->k:J

    .line 506
    .line 507
    sub-long v11, v4, v6

    .line 508
    .line 509
    div-long/2addr v11, v9

    .line 510
    mul-long/2addr v11, v9

    .line 511
    add-long/2addr v11, v6

    .line 512
    cmp-long v6, v4, v11

    .line 513
    .line 514
    if-gtz v6, :cond_1b

    .line 515
    .line 516
    sub-long v6, v11, v9

    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_1b
    add-long/2addr v9, v11

    .line 520
    move-wide v6, v11

    .line 521
    move-wide v11, v9

    .line 522
    :goto_a
    iget-wide v9, v3, Lhe1;->l:J

    .line 523
    .line 524
    sub-long v13, v11, v4

    .line 525
    .line 526
    sub-long/2addr v4, v6

    .line 527
    cmp-long v3, v13, v4

    .line 528
    .line 529
    if-gez v3, :cond_1c

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_1c
    move-wide v11, v6

    .line 533
    :goto_b
    sub-long v4, v11, v9

    .line 534
    .line 535
    :cond_1d
    :goto_c
    iput-wide v4, v8, Lib1;->b:J

    .line 536
    .line 537
    sub-long/2addr v4, v1

    .line 538
    div-long v2, v4, v16

    .line 539
    .line 540
    iput-wide v2, v8, Lib1;->a:J

    .line 541
    .line 542
    iget-wide v4, v0, Lde1;->h:J

    .line 543
    .line 544
    cmp-long v1, v4, v18

    .line 545
    .line 546
    if-eqz v1, :cond_1e

    .line 547
    .line 548
    iget-boolean v1, v0, Lde1;->i:Z

    .line 549
    .line 550
    if-nez v1, :cond_1e

    .line 551
    .line 552
    move/from16 v7, p7

    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_1e
    move v7, v15

    .line 556
    :goto_d
    iget-object v1, v0, Lde1;->a:Lsd1;

    .line 557
    .line 558
    move-wide/from16 v4, p3

    .line 559
    .line 560
    move/from16 v6, p10

    .line 561
    .line 562
    invoke-virtual/range {v1 .. v7}, Lsd1;->r0(JJZZ)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_1f

    .line 567
    .line 568
    :goto_e
    const/4 v1, 0x4

    .line 569
    return v1

    .line 570
    :cond_1f
    iget-wide v1, v8, Lib1;->a:J

    .line 571
    .line 572
    cmp-long v3, v1, p5

    .line 573
    .line 574
    if-gez v3, :cond_21

    .line 575
    .line 576
    if-nez p10, :cond_21

    .line 577
    .line 578
    if-eqz v7, :cond_20

    .line 579
    .line 580
    :goto_f
    return p1

    .line 581
    :cond_20
    return p2

    .line 582
    :cond_21
    const-wide/32 v3, 0xc350

    .line 583
    .line 584
    .line 585
    cmp-long v1, v1, v3

    .line 586
    .line 587
    if-lez v1, :cond_22

    .line 588
    .line 589
    goto :goto_10

    .line 590
    :cond_22
    return p7

    .line 591
    :cond_23
    :goto_10
    const/4 v1, 0x5

    .line 592
    return v1
.end method

.method public final h(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lde1;->j:F

    .line 14
    .line 15
    cmpl-float v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iput p1, p0, Lde1;->j:F

    .line 21
    .line 22
    iget-object v0, p0, Lde1;->b:Lhe1;

    .line 23
    .line 24
    iput p1, v0, Lhe1;->i:F

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    iput-wide v2, v0, Lhe1;->m:J

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    iput-wide v2, v0, Lhe1;->p:J

    .line 33
    .line 34
    iput-wide v2, v0, Lhe1;->n:J

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lhe1;->c(Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
