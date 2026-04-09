.class public abstract Log4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Log4;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 5

    .line 1
    const-class v0, Log4;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Llg4;

    .line 5
    .line 6
    invoke-direct {v1, p0, p1, p2}, Llg4;-><init>(Ljava/lang/String;ZZ)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Log4;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-object v3

    .line 21
    :cond_0
    :try_start_1
    const-string v3, "video/mv-hevc"

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, Lt3;

    .line 28
    .line 29
    invoke-direct {v4, p1, p2, v3}, Lt3;-><init>(ZZZ)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v4}, Log4;->d(Llg4;Lt3;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const-string p1, "audio/raw"

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    sget-object p0, Lid4;->h:Lid4;

    .line 53
    .line 54
    new-instance p1, Lsb3;

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-direct {p1, v3, p0}, Lsb3;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 p1, 0x20

    .line 66
    .line 67
    if-ge p0, p1, :cond_3

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    const/4 p1, 0x1

    .line 74
    if-le p0, p1, :cond_3

    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lbg4;

    .line 82
    .line 83
    iget-object p1, p1, Lbg4;->a:Ljava/lang/String;

    .line 84
    .line 85
    const-string v3, "OMX.qti.audio.decoder.flac"

    .line 86
    .line 87
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lbg4;

    .line 98
    .line 99
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-static {p2}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    monitor-exit v0

    .line 110
    return-object p0

    .line 111
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    throw p0
.end method

.method public static b(Lhd4;Lph4;ZZ)Lsn3;
    .locals 1

    .line 1
    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p2, p3}, Log4;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p1}, Log4;->c(Lph4;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    sget-object p0, Lsn3;->j:Lsn3;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2, p3}, Log4;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    sget-object p1, Lxm3;->g:Lvm3;

    .line 27
    .line 28
    new-instance p1, Lum3;

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    invoke-direct {p1, p2}, Lrm3;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lrm3;->b(Ljava/lang/Iterable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lrm3;->b(Ljava/lang/Iterable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lum3;->f()Lsn3;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static c(Lph4;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lph4;->m:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string p0, "audio/eac3"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v1, "video/dolby-vision"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    invoke-static {p0}, Lmo2;->b(Lph4;)Landroid/util/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/16 v1, 0x10

    .line 37
    .line 38
    if-eq p0, v1, :cond_5

    .line 39
    .line 40
    const/16 v1, 0x100

    .line 41
    .line 42
    if-ne p0, v1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v1, 0x200

    .line 46
    .line 47
    if-ne p0, v1, :cond_2

    .line 48
    .line 49
    const-string p0, "video/avc"

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    const/16 v1, 0x400

    .line 53
    .line 54
    if-eq p0, v1, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-string p0, "video/av01"

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_4
    :goto_0
    const-string p0, "video/mv-hevc"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_5

    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0

    .line 70
    :cond_5
    :goto_1
    const-string p0, "video/hevc"

    .line 71
    .line 72
    return-object p0
.end method

.method public static d(Llg4;Lt3;)Ljava/util/ArrayList;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lt3;->g:I

    .line 6
    .line 7
    const-string v3, "secure-playback"

    .line 8
    .line 9
    const-string v4, "tunneled-playback"

    .line 10
    .line 11
    const-string v5, ")"

    .line 12
    .line 13
    const-string v6, " ("

    .line 14
    .line 15
    const-string v7, "Failed to query codec "

    .line 16
    .line 17
    :try_start_0
    new-instance v8, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v10, v0, Llg4;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v9, v1, Lt3;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v9, [Landroid/media/MediaCodecInfo;

    .line 27
    .line 28
    if-nez v9, :cond_0

    .line 29
    .line 30
    new-instance v9, Landroid/media/MediaCodecList;

    .line 31
    .line 32
    invoke-direct {v9, v2}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v9}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    iput-object v9, v1, Lt3;->h:Ljava/lang/Object;

    .line 40
    .line 41
    :cond_0
    iget-object v9, v1, Lt3;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v9, [Landroid/media/MediaCodecInfo;

    .line 44
    .line 45
    array-length v15, v9

    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    move/from16 v9, v16

    .line 49
    .line 50
    :goto_0
    if-ge v9, v15, :cond_18

    .line 51
    .line 52
    iget-object v11, v1, Lt3;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v11, [Landroid/media/MediaCodecInfo;

    .line 55
    .line 56
    if-nez v11, :cond_1

    .line 57
    .line 58
    new-instance v11, Landroid/media/MediaCodecList;

    .line 59
    .line 60
    invoke-direct {v11, v2}, Landroid/media/MediaCodecList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v11}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    iput-object v11, v1, Lt3;->h:Ljava/lang/Object;

    .line 68
    .line 69
    :cond_1
    iget-object v11, v1, Lt3;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v11, [Landroid/media/MediaCodecInfo;

    .line 72
    .line 73
    aget-object v11, v11, v9

    .line 74
    .line 75
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v13, 0x1d

    .line 78
    .line 79
    if-lt v12, v13, :cond_2

    .line 80
    .line 81
    invoke-static {v11}, Lcg4;->b(Landroid/media/MediaCodecInfo;)Z

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    if-eqz v12, :cond_2

    .line 86
    .line 87
    move/from16 v18, v2

    .line 88
    .line 89
    move v0, v9

    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :cond_2
    move v12, v9

    .line 93
    invoke-virtual {v11}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v11}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-nez v14, :cond_17

    .line 102
    .line 103
    invoke-virtual {v11}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    array-length v13, v14

    .line 108
    move/from16 v1, v16

    .line 109
    .line 110
    :goto_1
    if-ge v1, v13, :cond_4

    .line 111
    .line 112
    move/from16 v17, v1

    .line 113
    .line 114
    aget-object v1, v14, v17

    .line 115
    .line 116
    invoke-virtual {v1, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v18

    .line 120
    if-eqz v18, :cond_3

    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :cond_3
    add-int/lit8 v1, v17, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const-string v1, "video/dolby-vision"

    .line 128
    .line 129
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    const/4 v13, 0x0

    .line 134
    if-eqz v1, :cond_8

    .line 135
    .line 136
    const-string v1, "OMX.MS.HEVCDV.Decoder"

    .line 137
    .line 138
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    const-string v1, "video/hevcdv"

    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :cond_5
    const-string v1, "OMX.RTK.video.decoder"

    .line 149
    .line 150
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_7

    .line 155
    .line 156
    const-string v1, "OMX.realtek.video.decoder.tunneled"

    .line 157
    .line 158
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_6

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    move-object v1, v13

    .line 166
    goto :goto_3

    .line 167
    :cond_7
    :goto_2
    const-string v1, "video/dv_hevc"

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    const-string v1, "video/mv-hevc"

    .line 171
    .line 172
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_a

    .line 177
    .line 178
    const-string v1, "c2.qti.mvhevc.decoder"

    .line 179
    .line 180
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_9

    .line 185
    .line 186
    const-string v1, "c2.qti.mvhevc.decoder.secure"

    .line 187
    .line 188
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_6

    .line 193
    .line 194
    :cond_9
    const-string v1, "video/x-mvhevc"

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_a
    const-string v1, "audio/alac"

    .line 198
    .line 199
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_b

    .line 204
    .line 205
    const-string v1, "OMX.lge.alac.decoder"

    .line 206
    .line 207
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_b

    .line 212
    .line 213
    const-string v1, "audio/x-lg-alac"

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_b
    const-string v1, "audio/flac"

    .line 217
    .line 218
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_c

    .line 223
    .line 224
    const-string v1, "OMX.lge.flac.decoder"

    .line 225
    .line 226
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_c

    .line 231
    .line 232
    const-string v1, "audio/x-lg-flac"

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_c
    const-string v1, "audio/ac3"

    .line 236
    .line 237
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_6

    .line 242
    .line 243
    const-string v1, "OMX.lge.ac3.decoder"

    .line 244
    .line 245
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_6

    .line 250
    .line 251
    const-string v1, "audio/lg-ac3"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 252
    .line 253
    :goto_3
    if-eqz v1, :cond_17

    .line 254
    .line 255
    const/16 v17, 0x1

    .line 256
    .line 257
    move v13, v12

    .line 258
    :try_start_1
    invoke-virtual {v11, v1}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    invoke-virtual {v12, v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    invoke-virtual {v12, v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureRequired(Ljava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    move-result v18
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 270
    move-object/from16 v19, v1

    .line 271
    .line 272
    :try_start_2
    iget-boolean v1, v0, Llg4;->c:Z

    .line 273
    .line 274
    if-nez v1, :cond_e

    .line 275
    .line 276
    if-nez v18, :cond_d

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_d
    :goto_4
    move/from16 v18, v2

    .line 280
    .line 281
    :goto_5
    move v0, v13

    .line 282
    goto/16 :goto_b

    .line 283
    .line 284
    :cond_e
    if-nez v14, :cond_f

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_f
    :goto_6
    invoke-virtual {v12, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    invoke-virtual {v12, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureRequired(Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v14

    .line 295
    move/from16 v18, v1

    .line 296
    .line 297
    iget-boolean v1, v0, Llg4;->b:Z

    .line 298
    .line 299
    if-nez v1, :cond_10

    .line 300
    .line 301
    if-nez v14, :cond_d

    .line 302
    .line 303
    :cond_10
    if-eqz v1, :cond_11

    .line 304
    .line 305
    if-eqz v18, :cond_d

    .line 306
    .line 307
    move/from16 v14, v17

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_11
    move/from16 v14, v18

    .line 311
    .line 312
    :goto_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 313
    .line 314
    move/from16 v18, v2

    .line 315
    .line 316
    const/16 v2, 0x1d

    .line 317
    .line 318
    if-lt v0, v2, :cond_12

    .line 319
    .line 320
    invoke-static {v11}, Lcg4;->c(Landroid/media/MediaCodecInfo;)Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    goto :goto_8

    .line 325
    :catch_0
    move-exception v0

    .line 326
    move-object/from16 v11, v19

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_12
    invoke-static {v11, v10}, Log4;->e(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-nez v2, :cond_13

    .line 334
    .line 335
    move/from16 v2, v17

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_13
    move/from16 v2, v16

    .line 339
    .line 340
    :goto_8
    invoke-static {v11, v10}, Log4;->e(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 341
    .line 342
    .line 343
    move/from16 v20, v2

    .line 344
    .line 345
    const/16 v2, 0x1d

    .line 346
    .line 347
    if-lt v0, v2, :cond_14

    .line 348
    .line 349
    invoke-static {v11}, Lcg4;->d(Landroid/media/MediaCodecInfo;)Z

    .line 350
    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_14
    invoke-virtual {v11}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    const-string v2, "omx.google."

    .line 362
    .line 363
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-nez v2, :cond_15

    .line 368
    .line 369
    const-string v2, "c2.android."

    .line 370
    .line 371
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-nez v2, :cond_15

    .line 376
    .line 377
    const-string v2, "c2.google."

    .line 378
    .line 379
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 380
    .line 381
    .line 382
    :cond_15
    :goto_9
    if-eq v1, v14, :cond_16

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_16
    const/4 v14, 0x0

    .line 386
    move v0, v13

    .line 387
    move-object/from16 v11, v19

    .line 388
    .line 389
    move/from16 v13, v20

    .line 390
    .line 391
    :try_start_3
    invoke-static/range {v9 .. v14}, Lbg4;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Lbg4;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 396
    .line 397
    .line 398
    goto :goto_b

    .line 399
    :catch_1
    move-exception v0

    .line 400
    goto :goto_a

    .line 401
    :catch_2
    move-exception v0

    .line 402
    move-object v11, v1

    .line 403
    :goto_a
    :try_start_4
    const-string v1, "MediaCodecUtil"

    .line 404
    .line 405
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    add-int/lit8 v2, v2, 0x18

    .line 414
    .line 415
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    add-int/2addr v2, v3

    .line 420
    add-int/lit8 v2, v2, 0x1

    .line 421
    .line 422
    new-instance v3, Ljava/lang/StringBuilder;

    .line 423
    .line 424
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    invoke-static {v1, v2}, La30;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 450
    :cond_17
    move/from16 v18, v2

    .line 451
    .line 452
    move v0, v12

    .line 453
    :goto_b
    add-int/lit8 v9, v0, 0x1

    .line 454
    .line 455
    move-object/from16 v0, p0

    .line 456
    .line 457
    move-object/from16 v1, p1

    .line 458
    .line 459
    move/from16 v2, v18

    .line 460
    .line 461
    goto/16 :goto_0

    .line 462
    .line 463
    :cond_18
    return-object v8

    .line 464
    :catch_3
    move-exception v0

    .line 465
    new-instance v1, Lmg4;

    .line 466
    .line 467
    const-string v2, "Failed to query underlying media codecs"

    .line 468
    .line 469
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 470
    .line 471
    .line 472
    throw v1
.end method

.method public static e(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcg4;->e(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, Lpp1;->a(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "arc."

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p1, "omx.google."

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    const-string p1, "omx.ffmpeg."

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    const-string p1, "omx.sec."

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const-string p1, ".sw."

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    const-string p1, "c2.android."

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    const-string p1, "c2.google."

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    const-string p1, "omx."

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    const-string p1, "c2."

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 110
    return p0

    .line 111
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 112
    return p0
.end method
