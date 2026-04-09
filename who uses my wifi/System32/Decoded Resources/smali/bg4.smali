.class public final Lbg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/media/MediaCodecInfo$CodecCapabilities;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public j:I

.field public k:I

.field public l:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbg4;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lbg4;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lbg4;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lbg4;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 14
    .line 15
    iput-boolean p5, p0, Lbg4;->g:Z

    .line 16
    .line 17
    iput-boolean p6, p0, Lbg4;->e:Z

    .line 18
    .line 19
    iput-boolean p7, p0, Lbg4;->f:Z

    .line 20
    .line 21
    iput-boolean p8, p0, Lbg4;->h:Z

    .line 22
    .line 23
    invoke-static {p2}, Lpp1;->b(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, Lbg4;->i:Z

    .line 28
    .line 29
    const p1, -0x800001

    .line 30
    .line 31
    .line 32
    iput p1, p0, Lbg4;->l:F

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    iput p1, p0, Lbg4;->j:I

    .line 36
    .line 37
    iput p1, p0, Lbg4;->k:I

    .line 38
    .line 39
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Lbg4;
    .locals 9

    .line 1
    new-instance v0, Lbg4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const-string v3, "adaptive-playback"

    .line 8
    .line 9
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    move v6, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v6, v2

    .line 18
    :goto_0
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const-string v3, "tunneled-playback"

    .line 21
    .line 22
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    if-nez p5, :cond_2

    .line 26
    .line 27
    if-eqz p3, :cond_3

    .line 28
    .line 29
    const-string p5, "secure-playback"

    .line 30
    .line 31
    invoke-virtual {p3, p5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p5

    .line 35
    if-eqz p5, :cond_3

    .line 36
    .line 37
    :cond_2
    move v7, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    move v7, v2

    .line 40
    :goto_1
    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v3, 0x23

    .line 43
    .line 44
    if-lt p5, v3, :cond_4

    .line 45
    .line 46
    if-eqz p3, :cond_4

    .line 47
    .line 48
    const-string p5, "detached-surface"

    .line 49
    .line 50
    invoke-virtual {p3, p5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p5

    .line 54
    if-eqz p5, :cond_4

    .line 55
    .line 56
    sget-object p5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "Xiaomi"

    .line 59
    .line 60
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    const-string v3, "OPPO"

    .line 67
    .line 68
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    const-string v3, "realme"

    .line 75
    .line 76
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_4

    .line 81
    .line 82
    const-string v3, "motorola"

    .line 83
    .line 84
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_4

    .line 89
    .line 90
    const-string v3, "LENOVO"

    .line 91
    .line 92
    invoke-virtual {p5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p5

    .line 96
    if-eqz p5, :cond_5

    .line 97
    .line 98
    :cond_4
    move-object v1, p0

    .line 99
    move-object v3, p2

    .line 100
    move-object v4, p3

    .line 101
    move v5, p4

    .line 102
    move v8, v2

    .line 103
    move-object v2, p1

    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move-object v2, p1

    .line 106
    move-object v3, p2

    .line 107
    move-object v4, p3

    .line 108
    move v5, p4

    .line 109
    move v8, v1

    .line 110
    move-object v1, p0

    .line 111
    :goto_2
    invoke-direct/range {v0 .. v8}, Lbg4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)V

    .line 112
    .line 113
    .line 114
    return-object v0
.end method

.method public static i(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z
    .locals 2

    .line 1
    invoke-static {p0, p1, p2}, Lbg4;->j(Landroid/media/MediaCodecInfo$VideoCapabilities;II)Landroid/graphics/Point;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p2, p1, Landroid/graphics/Point;->x:I

    .line 6
    .line 7
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 8
    .line 9
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 10
    .line 11
    cmpl-double v0, p3, v0

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 16
    .line 17
    cmpg-double v0, p3, v0

    .line 18
    .line 19
    if-gez v0, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p3

    .line 26
    invoke-virtual {p0, p2, p1, p3, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities;->areSizeAndRateSupported(IID)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0, p2, p1}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getAchievableFrameRatesFor(II)Landroid/util/Range;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/Double;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 47
    .line 48
    .line 49
    move-result-wide p0

    .line 50
    cmpg-double p0, p3, p0

    .line 51
    .line 52
    if-gtz p0, :cond_3

    .line 53
    .line 54
    :goto_0
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_2
    invoke-virtual {p0, p2, p1}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public static j(Landroid/media/MediaCodecInfo$VideoCapabilities;II)Landroid/graphics/Point;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    new-instance v1, Landroid/graphics/Point;

    .line 10
    .line 11
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    div-int/2addr p1, v0

    .line 17
    mul-int/2addr p1, v0

    .line 18
    add-int/2addr p2, p0

    .line 19
    add-int/lit8 p2, p2, -0x1

    .line 20
    .line 21
    div-int/2addr p2, p0

    .line 22
    mul-int/2addr p2, p0

    .line 23
    invoke-direct {v1, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method


# virtual methods
.method public final b(Lph4;)Z
    .locals 7

    .line 1
    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lbg4;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Log4;->c(Lph4;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return v2

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, p1, v0}, Lbg4;->f(Lph4;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0, p1}, Lbg4;->g(Lph4;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    :goto_1
    return v2

    .line 39
    :cond_3
    iget-boolean v3, p0, Lbg4;->i:Z

    .line 40
    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    iget v1, p1, Lph4;->t:I

    .line 44
    .line 45
    if-lez v1, :cond_10

    .line 46
    .line 47
    iget v2, p1, Lph4;->u:I

    .line 48
    .line 49
    if-gtz v2, :cond_4

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_4
    iget p1, p1, Lph4;->x:F

    .line 54
    .line 55
    float-to-double v3, p1

    .line 56
    invoke-virtual {p0, v1, v2, v3, v4}, Lbg4;->e(IID)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :cond_5
    iget v3, p1, Lph4;->F:I

    .line 62
    .line 63
    iget-object v4, p0, Lbg4;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 64
    .line 65
    const/4 v5, -0x1

    .line 66
    if-eq v3, v5, :cond_8

    .line 67
    .line 68
    if-nez v4, :cond_6

    .line 69
    .line 70
    const-string p1, "sampleRate.caps"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v2

    .line 76
    :cond_6
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    if-nez v6, :cond_7

    .line 81
    .line 82
    const-string p1, "sampleRate.aCaps"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return v2

    .line 88
    :cond_7
    invoke-virtual {v6, v3}, Landroid/media/MediaCodecInfo$AudioCapabilities;->isSampleRateSupported(I)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_8

    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    add-int/lit8 p1, p1, 0x14

    .line 105
    .line 106
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 107
    .line 108
    .line 109
    const-string p1, "sampleRate.support, "

    .line 110
    .line 111
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return v2

    .line 125
    :cond_8
    iget p1, p1, Lph4;->E:I

    .line 126
    .line 127
    if-eq p1, v5, :cond_10

    .line 128
    .line 129
    if-nez v4, :cond_9

    .line 130
    .line 131
    const-string p1, "channelCount.caps"

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return v2

    .line 137
    :cond_9
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v3, :cond_a

    .line 142
    .line 143
    const-string p1, "channelCount.aCaps"

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v2

    .line 149
    :cond_a
    invoke-virtual {v3}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-gt v3, v0, :cond_f

    .line 154
    .line 155
    if-lez v3, :cond_b

    .line 156
    .line 157
    goto/16 :goto_3

    .line 158
    .line 159
    :cond_b
    const-string v4, "audio/mpeg"

    .line 160
    .line 161
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_f

    .line 166
    .line 167
    const-string v4, "audio/3gpp"

    .line 168
    .line 169
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_f

    .line 174
    .line 175
    const-string v4, "audio/amr-wb"

    .line 176
    .line 177
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-nez v4, :cond_f

    .line 182
    .line 183
    const-string v4, "audio/mp4a-latm"

    .line 184
    .line 185
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-nez v4, :cond_f

    .line 190
    .line 191
    const-string v4, "audio/vorbis"

    .line 192
    .line 193
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_f

    .line 198
    .line 199
    const-string v4, "audio/opus"

    .line 200
    .line 201
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-nez v4, :cond_f

    .line 206
    .line 207
    const-string v4, "audio/raw"

    .line 208
    .line 209
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-nez v4, :cond_f

    .line 214
    .line 215
    const-string v4, "audio/flac"

    .line 216
    .line 217
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-nez v4, :cond_f

    .line 222
    .line 223
    const-string v4, "audio/g711-alaw"

    .line 224
    .line 225
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-nez v4, :cond_f

    .line 230
    .line 231
    const-string v4, "audio/g711-mlaw"

    .line 232
    .line 233
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-nez v4, :cond_f

    .line 238
    .line 239
    const-string v4, "audio/gsm"

    .line 240
    .line 241
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_c
    const-string v4, "audio/ac3"

    .line 249
    .line 250
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_d

    .line 255
    .line 256
    const/4 v1, 0x6

    .line 257
    goto :goto_2

    .line 258
    :cond_d
    const-string v4, "audio/eac3"

    .line 259
    .line 260
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_e

    .line 265
    .line 266
    const/16 v1, 0x10

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_e
    const/16 v1, 0x1e

    .line 270
    .line 271
    :goto_2
    iget-object v4, p0, Lbg4;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    add-int/lit8 v5, v5, 0x20

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    add-int/2addr v6, v5

    .line 288
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    add-int/lit8 v6, v6, 0x4

    .line 293
    .line 294
    invoke-static {v5, v6, v0}, Lga1;->i(Ljava/lang/String;II)I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    new-instance v6, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 301
    .line 302
    .line 303
    const-string v5, "AssumedMaxChannelAdjustment: "

    .line 304
    .line 305
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string v4, ", ["

    .line 312
    .line 313
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v3, " to "

    .line 320
    .line 321
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const-string v3, "]"

    .line 328
    .line 329
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-static {v3}, La30;->x(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    move v3, v1

    .line 340
    :cond_f
    :goto_3
    if-ge v3, p1, :cond_10

    .line 341
    .line 342
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    add-int/lit8 v0, v0, 0x16

    .line 353
    .line 354
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 355
    .line 356
    .line 357
    const-string v0, "channelCount.support, "

    .line 358
    .line 359
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return v2

    .line 373
    :cond_10
    :goto_4
    return v0
.end method

.method public final c(Lph4;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbg4;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lbg4;->e:Z

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    sget-object v0, Log4;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-static {p1}, Lmo2;->b(Lph4;)Landroid/util/Pair;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/16 v0, 0x2a

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public final d(Lph4;Lph4;)Lw34;
    .locals 11

    .line 1
    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p2, Lph4;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p2, Lph4;->C:Ln74;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eq v3, v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    iget-boolean v4, p0, Lbg4;->i:Z

    .line 20
    .line 21
    if-eqz v4, :cond_c

    .line 22
    .line 23
    iget v4, p1, Lph4;->y:I

    .line 24
    .line 25
    iget v5, p2, Lph4;->y:I

    .line 26
    .line 27
    if-eq v4, v5, :cond_1

    .line 28
    .line 29
    or-int/lit16 v0, v0, 0x400

    .line 30
    .line 31
    :cond_1
    iget v4, p1, Lph4;->t:I

    .line 32
    .line 33
    iget v5, p2, Lph4;->t:I

    .line 34
    .line 35
    if-ne v4, v5, :cond_2

    .line 36
    .line 37
    iget v4, p1, Lph4;->u:I

    .line 38
    .line 39
    iget v5, p2, Lph4;->u:I

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    :cond_2
    move v1, v3

    .line 44
    :cond_3
    iget-boolean v4, p0, Lbg4;->e:Z

    .line 45
    .line 46
    if-nez v4, :cond_4

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    or-int/lit16 v0, v0, 0x200

    .line 51
    .line 52
    :cond_4
    iget-object v4, p1, Lph4;->C:Ln74;

    .line 53
    .line 54
    invoke-static {v4}, Ln74;->a(Ln74;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    invoke-static {v2}, Ln74;->a(Ln74;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-nez v5, :cond_6

    .line 65
    .line 66
    :cond_5
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_6

    .line 71
    .line 72
    or-int/lit16 v0, v0, 0x800

    .line 73
    .line 74
    :cond_6
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 75
    .line 76
    const-string v4, "SM-T230"

    .line 77
    .line 78
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget-object v5, p0, Lbg4;->a:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    const-string v2, "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"

    .line 87
    .line 88
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Lph4;->b(Lph4;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_7

    .line 99
    .line 100
    or-int/lit8 v0, v0, 0x2

    .line 101
    .line 102
    :cond_7
    iget v2, p1, Lph4;->v:I

    .line 103
    .line 104
    const/4 v4, -0x1

    .line 105
    if-eq v2, v4, :cond_8

    .line 106
    .line 107
    iget v6, p1, Lph4;->w:I

    .line 108
    .line 109
    if-eq v6, v4, :cond_8

    .line 110
    .line 111
    iget v4, p2, Lph4;->v:I

    .line 112
    .line 113
    if-ne v2, v4, :cond_8

    .line 114
    .line 115
    iget v2, p2, Lph4;->w:I

    .line 116
    .line 117
    if-ne v6, v2, :cond_8

    .line 118
    .line 119
    if-eqz v1, :cond_8

    .line 120
    .line 121
    or-int/lit8 v0, v0, 0x2

    .line 122
    .line 123
    :cond_8
    if-nez v0, :cond_a

    .line 124
    .line 125
    new-instance v4, Lw34;

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Lph4;->b(Lph4;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eq v3, v0, :cond_9

    .line 132
    .line 133
    const/4 v0, 0x2

    .line 134
    :goto_1
    move v8, v0

    .line 135
    goto :goto_2

    .line 136
    :cond_9
    const/4 v0, 0x3

    .line 137
    goto :goto_1

    .line 138
    :goto_2
    const/4 v9, 0x0

    .line 139
    move-object v6, p1

    .line 140
    move-object v7, p2

    .line 141
    invoke-direct/range {v4 .. v9}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 142
    .line 143
    .line 144
    return-object v4

    .line 145
    :cond_a
    move-object v7, p1

    .line 146
    move-object v8, p2

    .line 147
    :cond_b
    move v10, v0

    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_c
    move-object v7, p1

    .line 151
    move-object v8, p2

    .line 152
    iget p1, v7, Lph4;->E:I

    .line 153
    .line 154
    iget p2, v8, Lph4;->E:I

    .line 155
    .line 156
    if-eq p1, p2, :cond_d

    .line 157
    .line 158
    or-int/lit16 v0, v0, 0x1000

    .line 159
    .line 160
    :cond_d
    iget p1, v7, Lph4;->F:I

    .line 161
    .line 162
    iget p2, v8, Lph4;->F:I

    .line 163
    .line 164
    if-eq p1, p2, :cond_e

    .line 165
    .line 166
    or-int/lit16 v0, v0, 0x2000

    .line 167
    .line 168
    :cond_e
    iget p1, v7, Lph4;->G:I

    .line 169
    .line 170
    iget p2, v8, Lph4;->G:I

    .line 171
    .line 172
    if-eq p1, p2, :cond_f

    .line 173
    .line 174
    or-int/lit16 v0, v0, 0x4000

    .line 175
    .line 176
    :cond_f
    iget-object p1, p0, Lbg4;->b:Ljava/lang/String;

    .line 177
    .line 178
    if-nez v0, :cond_14

    .line 179
    .line 180
    const-string p2, "audio/mp4a-latm"

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    const-string v1, "audio/ac4"

    .line 187
    .line 188
    if-nez p2, :cond_10

    .line 189
    .line 190
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-eqz p2, :cond_14

    .line 195
    .line 196
    :cond_10
    sget-object p2, Log4;->a:Ljava/util/HashMap;

    .line 197
    .line 198
    invoke-static {v7}, Lmo2;->b(Lph4;)Landroid/util/Pair;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-static {v8}, Lmo2;->b(Lph4;)Landroid/util/Pair;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-eqz p2, :cond_14

    .line 207
    .line 208
    if-eqz v2, :cond_14

    .line 209
    .line 210
    iget-object v3, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v4, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    const/16 v5, 0x2a

    .line 227
    .line 228
    if-ne v3, v5, :cond_12

    .line 229
    .line 230
    if-eq v4, v5, :cond_11

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_11
    new-instance v5, Lw34;

    .line 234
    .line 235
    const/4 v9, 0x3

    .line 236
    const/4 v10, 0x0

    .line 237
    iget-object v6, p0, Lbg4;->a:Ljava/lang/String;

    .line 238
    .line 239
    invoke-direct/range {v5 .. v10}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 240
    .line 241
    .line 242
    return-object v5

    .line 243
    :cond_12
    :goto_3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_14

    .line 248
    .line 249
    invoke-virtual {p2, v2}, Landroid/util/Pair;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    if-nez p2, :cond_13

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_13
    new-instance v5, Lw34;

    .line 257
    .line 258
    const/4 v9, 0x3

    .line 259
    const/4 v10, 0x0

    .line 260
    iget-object v6, p0, Lbg4;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-direct/range {v5 .. v10}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 263
    .line 264
    .line 265
    return-object v5

    .line 266
    :cond_14
    :goto_4
    if-nez v0, :cond_16

    .line 267
    .line 268
    const-string p2, "audio/eac3-joc"

    .line 269
    .line 270
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-nez p2, :cond_15

    .line 275
    .line 276
    const-string p2, "audio/eac3"

    .line 277
    .line 278
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    if-nez p2, :cond_15

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_15
    new-instance v5, Lw34;

    .line 286
    .line 287
    const/4 v9, 0x3

    .line 288
    const/4 v10, 0x0

    .line 289
    iget-object v6, p0, Lbg4;->a:Ljava/lang/String;

    .line 290
    .line 291
    invoke-direct/range {v5 .. v10}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 292
    .line 293
    .line 294
    return-object v5

    .line 295
    :cond_16
    :goto_5
    invoke-virtual {v7, v8}, Lph4;->b(Lph4;)Z

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    if-nez p2, :cond_17

    .line 300
    .line 301
    or-int/lit8 v0, v0, 0x20

    .line 302
    .line 303
    :cond_17
    const-string p2, "audio/opus"

    .line 304
    .line 305
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    if-eqz p1, :cond_18

    .line 310
    .line 311
    or-int/lit8 p1, v0, 0x2

    .line 312
    .line 313
    move v0, p1

    .line 314
    :cond_18
    if-nez v0, :cond_b

    .line 315
    .line 316
    new-instance v5, Lw34;

    .line 317
    .line 318
    const/4 v9, 0x1

    .line 319
    const/4 v10, 0x0

    .line 320
    iget-object v6, p0, Lbg4;->a:Ljava/lang/String;

    .line 321
    .line 322
    invoke-direct/range {v5 .. v10}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 323
    .line 324
    .line 325
    return-object v5

    .line 326
    :goto_6
    new-instance v5, Lw34;

    .line 327
    .line 328
    const/4 v9, 0x0

    .line 329
    iget-object v6, p0, Lbg4;->a:Ljava/lang/String;

    .line 330
    .line 331
    invoke-direct/range {v5 .. v10}, Lw34;-><init>(Ljava/lang/String;Lph4;Lph4;II)V

    .line 332
    .line 333
    .line 334
    return-object v5
.end method

.method public final e(IID)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lbg4;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-string p1, "sizeAndRate.caps"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string p1, "sizeAndRate.vCaps"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v3, 0x1d

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    const/4 v5, 0x1

    .line 30
    const-string v6, "x"

    .line 31
    .line 32
    const-string v7, "@"

    .line 33
    .line 34
    if-lt v2, v3, :cond_f

    .line 35
    .line 36
    if-lt v2, v3, :cond_b

    .line 37
    .line 38
    sget-object v3, Lgi2;->i:Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_2
    invoke-static {v1}, Li71;->i(Landroid/media/MediaCodecInfo$VideoCapabilities;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_b

    .line 54
    .line 55
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_3

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_3
    double-to-int v8, p3

    .line 63
    invoke-static {p1, p2, v8}, Lcg4;->a(III)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    move v9, v0

    .line 68
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-ge v9, v10, :cond_5

    .line 73
    .line 74
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-static {v10}, Li71;->d(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-static {v10, v8}, Li71;->u(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    move v3, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    move v3, v5

    .line 94
    :goto_1
    if-ne v3, v5, :cond_c

    .line 95
    .line 96
    sget-object v8, Lgi2;->i:Ljava/lang/Boolean;

    .line 97
    .line 98
    if-nez v8, :cond_c

    .line 99
    .line 100
    const/16 v8, 0x23

    .line 101
    .line 102
    if-lt v2, v8, :cond_7

    .line 103
    .line 104
    :cond_6
    move v2, v0

    .line 105
    goto :goto_3

    .line 106
    :cond_7
    invoke-static {v0}, Lg82;->y(Z)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-static {v5}, Lg82;->y(Z)I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v2, :cond_9

    .line 115
    .line 116
    :cond_8
    :goto_2
    move v2, v5

    .line 117
    goto :goto_3

    .line 118
    :cond_9
    if-nez v8, :cond_a

    .line 119
    .line 120
    if-eq v2, v4, :cond_6

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_a
    if-ne v2, v4, :cond_8

    .line 124
    .line 125
    if-eq v8, v4, :cond_6

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    sput-object v8, Lgi2;->i:Ljava/lang/Boolean;

    .line 133
    .line 134
    if-eqz v2, :cond_c

    .line 135
    .line 136
    :cond_b
    :goto_4
    move v3, v0

    .line 137
    :cond_c
    if-ne v3, v4, :cond_d

    .line 138
    .line 139
    goto/16 :goto_7

    .line 140
    .line 141
    :cond_d
    if-eq v3, v5, :cond_e

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_e
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    add-int/lit8 v1, v1, 0x14

    .line 157
    .line 158
    invoke-static {v2, v1, v5}, Lga1;->i(Ljava/lang/String;II)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    new-instance v3, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    add-int/2addr v1, v2

    .line 173
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 174
    .line 175
    .line 176
    const-string v1, "sizeAndRate.cover, "

    .line 177
    .line 178
    invoke-static {v3, v1, p1, v6, p2}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return v0

    .line 195
    :cond_f
    :goto_5
    invoke-static {v1, p1, p2, p3, p4}, Lbg4;->i(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-nez v2, :cond_13

    .line 200
    .line 201
    const/16 v2, 0x16

    .line 202
    .line 203
    if-ge p1, p2, :cond_12

    .line 204
    .line 205
    const-string v3, "OMX.MTK.VIDEO.DECODER.HEVC"

    .line 206
    .line 207
    iget-object v8, p0, Lbg4;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_10

    .line 214
    .line 215
    const-string v3, "mcv5a"

    .line 216
    .line 217
    sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v3, :cond_12

    .line 224
    .line 225
    :cond_10
    invoke-static {v1, p2, p1, p3, p4}, Lbg4;->i(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_11

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_11
    invoke-static {p1, v2}, Lga1;->f(II)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    add-int/2addr v1, v0

    .line 245
    add-int/2addr v1, v5

    .line 246
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    add-int/2addr v1, v0

    .line 257
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 258
    .line 259
    .line 260
    const-string v0, "sizeAndRate.rotated, "

    .line 261
    .line 262
    invoke-static {v2, v0, p1, v6, p2}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    sget-object p3, Lv23;->a:Ljava/lang/String;

    .line 280
    .line 281
    iget-object p4, p0, Lbg4;->b:Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    add-int/lit8 v2, v2, 0x13

    .line 304
    .line 305
    add-int/2addr v2, p2

    .line 306
    add-int/2addr v2, v4

    .line 307
    add-int/2addr v2, v0

    .line 308
    add-int/lit8 v2, v2, 0x3

    .line 309
    .line 310
    add-int/2addr v2, v1

    .line 311
    add-int/2addr v2, v5

    .line 312
    new-instance p2, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 315
    .line 316
    .line 317
    const-string v0, "AssumedSupport ["

    .line 318
    .line 319
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string p1, "] ["

    .line 326
    .line 327
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v0, ", "

    .line 334
    .line 335
    invoke-static {p2, v0, p4, p1, p3}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    const-string p1, "]"

    .line 339
    .line 340
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-static {p1}, La30;->o(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    return v5

    .line 351
    :cond_12
    :goto_6
    invoke-static {p1, v2}, Lga1;->f(II)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    add-int/2addr v2, v1

    .line 364
    add-int/2addr v2, v5

    .line 365
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    new-instance v3, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    add-int/2addr v2, v1

    .line 376
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 377
    .line 378
    .line 379
    const-string v1, "sizeAndRate.support, "

    .line 380
    .line 381
    invoke-static {v3, v1, p1, v6, p2}, Lex0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return v0

    .line 398
    :cond_13
    :goto_7
    return v5
.end method

.method public final f(Lph4;Z)Z
    .locals 13

    .line 1
    sget-object v0, Log4;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Lmo2;->b(Lph4;)Landroid/util/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lph4;->m:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lbg4;->c:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const-string v4, "video/hevc"

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    const-string v5, "video/mv-hevc"

    .line 17
    .line 18
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-eqz v6, :cond_2

    .line 23
    .line 24
    invoke-static {v2}, Lpp1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    iget-object v0, p1, Lph4;->p:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v0}, Lwl2;->a0(Ljava/util/List;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    sget-object v6, Lv23;->a:Ljava/lang/String;

    .line 57
    .line 58
    const-string v6, "\\."

    .line 59
    .line 60
    const/4 v7, -0x1

    .line 61
    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v6, p1, Lph4;->C:Ln74;

    .line 66
    .line 67
    invoke-static {v0, v5, v6}, Lmo2;->c(Ljava/lang/String;[Ljava/lang/String;Ln74;)Landroid/util/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :cond_2
    :goto_0
    if-eqz v0, :cond_f

    .line 72
    .line 73
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const-string v6, "video/dolby-vision"

    .line 90
    .line 91
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    iget-object v6, p0, Lbg4;->b:Ljava/lang/String;

    .line 96
    .line 97
    const/4 v7, 0x2

    .line 98
    const/16 v8, 0x8

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const v10, -0x631b55f6

    .line 108
    .line 109
    .line 110
    if-eq v1, v10, :cond_5

    .line 111
    .line 112
    const v10, -0x63185e82

    .line 113
    .line 114
    .line 115
    if-eq v1, v10, :cond_4

    .line 116
    .line 117
    const v10, 0x4f62373a

    .line 118
    .line 119
    .line 120
    if-eq v1, v10, :cond_3

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    const-string v1, "video/avc"

    .line 124
    .line 125
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    move v5, v8

    .line 132
    :goto_1
    move v0, v9

    .line 133
    goto :goto_3

    .line 134
    :cond_4
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_6

    .line 139
    .line 140
    :goto_2
    move v5, v7

    .line 141
    goto :goto_1

    .line 142
    :cond_5
    const-string v1, "video/av01"

    .line 143
    .line 144
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    :goto_3
    iget-boolean v1, p0, Lbg4;->i:Z

    .line 152
    .line 153
    const-string v10, "audio/ac4"

    .line 154
    .line 155
    if-nez v1, :cond_7

    .line 156
    .line 157
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_7

    .line 162
    .line 163
    const/16 v1, 0x2a

    .line 164
    .line 165
    if-ne v5, v1, :cond_f

    .line 166
    .line 167
    move v5, v1

    .line 168
    :cond_7
    iget-object v1, p0, Lbg4;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 169
    .line 170
    if-eqz v1, :cond_8

    .line 171
    .line 172
    iget-object v11, v1, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 173
    .line 174
    if-nez v11, :cond_9

    .line 175
    .line 176
    :cond_8
    new-array v11, v9, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 177
    .line 178
    :cond_9
    invoke-virtual {v6, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-eqz v10, :cond_b

    .line 183
    .line 184
    array-length v10, v11

    .line 185
    if-nez v10, :cond_b

    .line 186
    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    if-eqz v1, :cond_a

    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    const/16 v10, 0x12

    .line 200
    .line 201
    if-le v1, v10, :cond_a

    .line 202
    .line 203
    const/16 v8, 0x10

    .line 204
    .line 205
    :cond_a
    const/4 v1, 0x5

    .line 206
    new-array v11, v1, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 207
    .line 208
    new-instance v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 209
    .line 210
    invoke-direct {v1}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 211
    .line 212
    .line 213
    const/16 v10, 0x101

    .line 214
    .line 215
    iput v10, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 216
    .line 217
    iput v8, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 218
    .line 219
    aput-object v1, v11, v9

    .line 220
    .line 221
    new-instance v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 222
    .line 223
    invoke-direct {v1}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 224
    .line 225
    .line 226
    const/16 v10, 0x201

    .line 227
    .line 228
    iput v10, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 229
    .line 230
    iput v8, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 231
    .line 232
    aput-object v1, v11, v3

    .line 233
    .line 234
    new-instance v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 235
    .line 236
    invoke-direct {v1}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 237
    .line 238
    .line 239
    const/16 v10, 0x202

    .line 240
    .line 241
    iput v10, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 242
    .line 243
    iput v8, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 244
    .line 245
    aput-object v1, v11, v7

    .line 246
    .line 247
    new-instance v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 248
    .line 249
    invoke-direct {v1}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 250
    .line 251
    .line 252
    const/16 v10, 0x402

    .line 253
    .line 254
    iput v10, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 255
    .line 256
    iput v8, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 257
    .line 258
    const/4 v10, 0x3

    .line 259
    aput-object v1, v11, v10

    .line 260
    .line 261
    new-instance v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 262
    .line 263
    invoke-direct {v1}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 264
    .line 265
    .line 266
    const/16 v10, 0x404

    .line 267
    .line 268
    iput v10, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 269
    .line 270
    iput v8, v1, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 271
    .line 272
    const/4 v8, 0x4

    .line 273
    aput-object v1, v11, v8

    .line 274
    .line 275
    :cond_b
    array-length v1, v11

    .line 276
    move v8, v9

    .line 277
    :goto_4
    if-ge v8, v1, :cond_e

    .line 278
    .line 279
    aget-object v10, v11, v8

    .line 280
    .line 281
    iget v12, v10, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 282
    .line 283
    if-ne v12, v5, :cond_d

    .line 284
    .line 285
    iget v10, v10, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 286
    .line 287
    if-ge v10, v0, :cond_c

    .line 288
    .line 289
    if-nez p2, :cond_d

    .line 290
    .line 291
    :cond_c
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    if-eqz v10, :cond_f

    .line 296
    .line 297
    if-ne v5, v7, :cond_f

    .line 298
    .line 299
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 300
    .line 301
    const-string v12, "sailfish"

    .line 302
    .line 303
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v12

    .line 307
    if-nez v12, :cond_d

    .line 308
    .line 309
    const-string v12, "marlin"

    .line 310
    .line 311
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    if-eqz v10, :cond_f

    .line 316
    .line 317
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_e
    iget-object p1, p1, Lph4;->j:Ljava/lang/String;

    .line 321
    .line 322
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    add-int/lit8 p2, p2, 0x16

    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    add-int/2addr v1, p2

    .line 339
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 340
    .line 341
    .line 342
    const-string p2, "codec.profileLevel, "

    .line 343
    .line 344
    const-string v1, ", "

    .line 345
    .line 346
    invoke-static {v0, p2, p1, v1, v2}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {p0, p1}, Lbg4;->h(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return v9

    .line 354
    :cond_f
    :goto_5
    return v3
.end method

.method public final g(Lph4;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/flac"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget p1, p1, Lph4;->G:I

    .line 12
    .line 13
    const/16 v0, 0x16

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    if-ge p1, v0, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lbg4;->a:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "c2.android.flac.decoder"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method public final h(Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lbg4;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    add-int/lit8 v5, v5, 0xe

    .line 28
    .line 29
    iget-object v6, p0, Lbg4;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    add-int/2addr v7, v5

    .line 36
    add-int/lit8 v7, v7, 0x2

    .line 37
    .line 38
    add-int/2addr v7, v2

    .line 39
    add-int/lit8 v7, v7, 0x3

    .line 40
    .line 41
    add-int/2addr v7, v3

    .line 42
    add-int/lit8 v7, v7, 0x1

    .line 43
    .line 44
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const-string v2, "NoSupport ["

    .line 48
    .line 49
    const-string v3, "] ["

    .line 50
    .line 51
    invoke-static {v4, v2, p1, v3, v6}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string p1, ", "

    .line 55
    .line 56
    invoke-static {v4, p1, v1, v3, v0}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string p1, "]"

    .line 60
    .line 61
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, La30;->o(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbg4;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
