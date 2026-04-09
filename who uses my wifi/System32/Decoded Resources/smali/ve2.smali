.class public final Lve2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public f:Z


# direct methods
.method public static a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lsv1;->f:Lsv1;

    .line 10
    .line 11
    iget-object v0, v0, Lsv1;->a:Lj63;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p0, v0}, Lj63;->b(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result p3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/lit8 p0, p0, 0x22

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    add-int/2addr p0, v0

    .line 35
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const-string p0, "Could not parse "

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, " in a video GMSG: "

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    :goto_0
    invoke-static {}, Lgi2;->R()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    add-int/lit8 p0, p0, 0x1e

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    add-int/2addr p0, v0

    .line 86
    add-int/lit8 p0, p0, 0x6

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/2addr v0, p0

    .line 93
    new-instance p0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 98
    .line 99
    .line 100
    const-string v0, "Parse pixels for "

    .line 101
    .line 102
    const-string v1, ", got string "

    .line 103
    .line 104
    invoke-static {p0, v0, p2, v1, p1}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const-string p1, ", int "

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p1, "."

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Lgi2;->G(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_1
    return p3
.end method

.method public static b(Lee2;Ljava/util/Map;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lee2;->l:Lae2;

    .line 2
    .line 3
    const-string v0, "minBufferMs"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "maxBufferMs"

    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "bufferForPlaybackMs"

    .line 20
    .line 21
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    const-string v3, "bufferForPlaybackAfterRebufferMs"

    .line 28
    .line 29
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "socketReceiveBufferSize"

    .line 36
    .line 37
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez p0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0, v4}, Lae2;->B(I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {p0, v4}, Lae2;->C(I)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    if-eqz v2, :cond_5

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez p0, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {p0, v2}, Lae2;->a(I)V

    .line 77
    .line 78
    .line 79
    :cond_5
    :goto_2
    if-eqz v3, :cond_7

    .line 80
    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez p0, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    invoke-virtual {p0, v2}, Lae2;->b(I)V

    .line 89
    .line 90
    .line 91
    :cond_7
    :goto_3
    if-eqz p1, :cond_9

    .line 92
    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p0, :cond_8

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_8
    invoke-virtual {p0, p1}, Lae2;->c(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string p1, "Could not parse buffer parameters in loadControl video GMSG: ("

    .line 107
    .line 108
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p1, ", "

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string p1, ")"

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_9
    :goto_4
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "action"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    check-cast v3, Lag2;

    .line 10
    .line 11
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "All demuxed URLs are empty for playback: "

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v0, "Action missing from video GMSG."

    .line 22
    .line 23
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string v5, "playerId"

    .line 28
    .line 29
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x0

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    const-string v5, "playerId"

    .line 37
    .line 38
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v5, v6

    .line 54
    :goto_0
    invoke-interface {v3}, Lag2;->f0()Lg4;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    invoke-interface {v3}, Lag2;->f0()Lg4;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    iget-object v7, v7, Lg4;->k:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v7, Lee2;

    .line 67
    .line 68
    if-eqz v7, :cond_2

    .line 69
    .line 70
    iget-object v7, v7, Lee2;->l:Lae2;

    .line 71
    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    invoke-virtual {v7}, Lae2;->z()Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-object v7, v6

    .line 80
    :goto_1
    if-eqz v5, :cond_3

    .line 81
    .line 82
    if-eqz v7, :cond_3

    .line 83
    .line 84
    invoke-virtual {v5, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-nez v8, :cond_3

    .line 89
    .line 90
    const-string v8, "load"

    .line 91
    .line 92
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_4

    .line 97
    .line 98
    :cond_3
    move-object v7, v5

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "Event intended for player "

    .line 105
    .line 106
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v2, ", but sent to player "

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v2, " - event ignored"

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :goto_2
    const/4 v5, 0x3

    .line 134
    invoke-static {v5}, Lgi2;->q0(I)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_5

    .line 139
    .line 140
    new-instance v8, Lorg/json/JSONObject;

    .line 141
    .line 142
    invoke-direct {v8, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    const-string v9, "google.afma.Notify_dt"

    .line 146
    .line 147
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    add-int/lit8 v9, v9, 0xd

    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    new-instance v11, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    add-int/2addr v9, v10

    .line 171
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 172
    .line 173
    .line 174
    const-string v9, "Video GMSG: "

    .line 175
    .line 176
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v9, " "

    .line 183
    .line 184
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-static {v8}, Lgi2;->U(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_5
    const-string v8, "background"

    .line 198
    .line 199
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eqz v8, :cond_7

    .line 204
    .line 205
    const-string v2, "color"

    .line 206
    .line 207
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_6

    .line 218
    .line 219
    const-string v0, "Color parameter missing from background video GMSG."

    .line 220
    .line 221
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_6
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-interface {v3, v0}, Lag2;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :catch_0
    const-string v0, "Invalid color parameter in background video GMSG."

    .line 234
    .line 235
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_7
    const-string v8, "playerBackground"

    .line 240
    .line 241
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-eqz v8, :cond_9

    .line 246
    .line 247
    const-string v2, "color"

    .line 248
    .line 249
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_8

    .line 260
    .line 261
    const-string v0, "Color parameter missing from playerBackground video GMSG."

    .line 262
    .line 263
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_8
    :try_start_1
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-interface {v3, v0}, Lag2;->Q(I)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :catch_1
    const-string v0, "Invalid color parameter in playerBackground video GMSG."

    .line 276
    .line 277
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :cond_9
    const-string v8, "decoderProps"

    .line 282
    .line 283
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    const/4 v9, 0x0

    .line 288
    if-eqz v8, :cond_c

    .line 289
    .line 290
    const-string v2, "mimeTypes"

    .line 291
    .line 292
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Ljava/lang/String;

    .line 297
    .line 298
    if-nez v0, :cond_a

    .line 299
    .line 300
    const-string v0, "No MIME types specified for decoder properties inspection."

    .line 301
    .line 302
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    new-instance v0, Ljava/util/HashMap;

    .line 306
    .line 307
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 308
    .line 309
    .line 310
    const-string v2, "event"

    .line 311
    .line 312
    const-string v4, "decoderProps"

    .line 313
    .line 314
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    const-string v2, "error"

    .line 318
    .line 319
    const-string v4, "missingMimeTypes"

    .line 320
    .line 321
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    const-string v2, "onVideoEvent"

    .line 325
    .line 326
    invoke-interface {v3, v2, v0}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_a
    new-instance v2, Ljava/util/HashMap;

    .line 331
    .line 332
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v4, ","

    .line 336
    .line 337
    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    array-length v4, v0

    .line 342
    :goto_3
    if-ge v9, v4, :cond_b

    .line 343
    .line 344
    aget-object v5, v0, v9

    .line 345
    .line 346
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    invoke-static {v6}, Lcg2;->a(Ljava/lang/String;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    add-int/lit8 v9, v9, 0x1

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_b
    new-instance v0, Ljava/util/HashMap;

    .line 361
    .line 362
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 363
    .line 364
    .line 365
    const-string v4, "event"

    .line 366
    .line 367
    const-string v5, "decoderProps"

    .line 368
    .line 369
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    const-string v4, "mimeTypes"

    .line 373
    .line 374
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    const-string v2, "onVideoEvent"

    .line 378
    .line 379
    invoke-interface {v3, v2, v0}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :cond_c
    invoke-interface {v3}, Lag2;->f0()Lg4;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    if-nez v8, :cond_d

    .line 388
    .line 389
    const-string v0, "Could not get underlay container for a video GMSG."

    .line 390
    .line 391
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :cond_d
    const-string v10, "new"

    .line 396
    .line 397
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    const-string v11, "position"

    .line 402
    .line 403
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    const/4 v12, 0x4

    .line 408
    const/4 v13, 0x1

    .line 409
    if-nez v10, :cond_e

    .line 410
    .line 411
    if-eqz v11, :cond_f

    .line 412
    .line 413
    :cond_e
    move-object v11, v3

    .line 414
    goto/16 :goto_a

    .line 415
    .line 416
    :cond_f
    move-object v11, v3

    .line 417
    invoke-interface {v11}, Lag2;->f()Lqg2;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    if-eqz v3, :cond_13

    .line 422
    .line 423
    const-string v10, "timeupdate"

    .line 424
    .line 425
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    if-eqz v10, :cond_11

    .line 430
    .line 431
    const-string v2, "currentTime"

    .line 432
    .line 433
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    move-object v2, v0

    .line 438
    check-cast v2, Ljava/lang/String;

    .line 439
    .line 440
    if-nez v2, :cond_10

    .line 441
    .line 442
    const-string v0, "currentTime parameter missing from timeupdate video GMSG."

    .line 443
    .line 444
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    return-void

    .line 448
    :cond_10
    :try_start_2
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    iget-object v4, v3, Lqg2;->g:Ljava/lang/Object;

    .line 453
    .line 454
    monitor-enter v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 455
    :try_start_3
    iput v0, v3, Lqg2;->o:F

    .line 456
    .line 457
    monitor-exit v4

    .line 458
    return-void

    .line 459
    :catchall_0
    move-exception v0

    .line 460
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 461
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2

    .line 462
    :catch_2
    const-string v0, "Could not parse currentTime parameter from timeupdate video GMSG: "

    .line 463
    .line 464
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :cond_11
    const-string v10, "skip"

    .line 473
    .line 474
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v10

    .line 478
    if-nez v10, :cond_12

    .line 479
    .line 480
    goto :goto_4

    .line 481
    :cond_12
    iget-object v10, v3, Lqg2;->g:Ljava/lang/Object;

    .line 482
    .line 483
    monitor-enter v10

    .line 484
    :try_start_5
    iget-boolean v6, v3, Lqg2;->m:Z

    .line 485
    .line 486
    iget v4, v3, Lqg2;->j:I

    .line 487
    .line 488
    iput v5, v3, Lqg2;->j:I

    .line 489
    .line 490
    monitor-exit v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 491
    sget-object v0, Lmd2;->f:Lld2;

    .line 492
    .line 493
    new-instance v2, Lpg2;

    .line 494
    .line 495
    move v7, v6

    .line 496
    invoke-direct/range {v2 .. v7}, Lpg2;-><init>(Lqg2;IIZZ)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0, v2}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :catchall_1
    move-exception v0

    .line 504
    :try_start_6
    monitor-exit v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 505
    throw v0

    .line 506
    :cond_13
    :goto_4
    iget-object v3, v8, Lg4;->k:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v3, Lee2;

    .line 509
    .line 510
    if-nez v3, :cond_14

    .line 511
    .line 512
    new-instance v0, Ljava/util/HashMap;

    .line 513
    .line 514
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 515
    .line 516
    .line 517
    const-string v2, "event"

    .line 518
    .line 519
    const-string v3, "no_video_view"

    .line 520
    .line 521
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    const-string v2, "onVideoEvent"

    .line 525
    .line 526
    invoke-interface {v11, v2, v0}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 527
    .line 528
    .line 529
    return-void

    .line 530
    :cond_14
    const-string v5, "click"

    .line 531
    .line 532
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    if-eqz v5, :cond_16

    .line 537
    .line 538
    invoke-interface {v11}, Lag2;->getContext()Landroid/content/Context;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    const-string v4, "x"

    .line 543
    .line 544
    invoke-static {v2, v0, v4, v9}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    const-string v5, "y"

    .line 549
    .line 550
    invoke-static {v2, v0, v5, v9}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    int-to-float v10, v4

    .line 555
    int-to-float v11, v0

    .line 556
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 557
    .line 558
    .line 559
    move-result-wide v5

    .line 560
    const/4 v9, 0x0

    .line 561
    const/4 v12, 0x0

    .line 562
    move-wide v7, v5

    .line 563
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    iget-object v2, v3, Lee2;->l:Lae2;

    .line 568
    .line 569
    if-nez v2, :cond_15

    .line 570
    .line 571
    goto :goto_5

    .line 572
    :cond_15
    invoke-virtual {v2, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 573
    .line 574
    .line 575
    :goto_5
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 576
    .line 577
    .line 578
    return-void

    .line 579
    :cond_16
    const-string v5, "currentTime"

    .line 580
    .line 581
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    if-eqz v5, :cond_19

    .line 586
    .line 587
    const-string v2, "time"

    .line 588
    .line 589
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    check-cast v0, Ljava/lang/String;

    .line 594
    .line 595
    if-nez v0, :cond_17

    .line 596
    .line 597
    const-string v0, "Time parameter missing from currentTime video GMSG."

    .line 598
    .line 599
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    return-void

    .line 603
    :cond_17
    :try_start_7
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 608
    .line 609
    mul-float/2addr v2, v4

    .line 610
    float-to-int v2, v2

    .line 611
    iget-object v3, v3, Lee2;->l:Lae2;

    .line 612
    .line 613
    if-nez v3, :cond_18

    .line 614
    .line 615
    goto/16 :goto_11

    .line 616
    .line 617
    :cond_18
    invoke-virtual {v3, v2}, Lae2;->l(I)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_3

    .line 618
    .line 619
    .line 620
    return-void

    .line 621
    :catch_3
    const-string v2, "Could not parse time parameter from currentTime video GMSG: "

    .line 622
    .line 623
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :cond_19
    const-string v5, "hide"

    .line 632
    .line 633
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    if-eqz v5, :cond_1a

    .line 638
    .line 639
    invoke-virtual {v3, v12}, Landroid/view/View;->setVisibility(I)V

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :cond_1a
    const-string v5, "remove"

    .line 644
    .line 645
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v5

    .line 649
    if-eqz v5, :cond_1b

    .line 650
    .line 651
    const/16 v0, 0x8

    .line 652
    .line 653
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :cond_1b
    const-string v5, "load"

    .line 658
    .line 659
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    if-eqz v5, :cond_1e

    .line 664
    .line 665
    iget-object v0, v3, Lee2;->l:Lae2;

    .line 666
    .line 667
    if-nez v0, :cond_1c

    .line 668
    .line 669
    goto/16 :goto_11

    .line 670
    .line 671
    :cond_1c
    iget-object v2, v3, Lee2;->s:Ljava/lang/String;

    .line 672
    .line 673
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    if-nez v2, :cond_1d

    .line 678
    .line 679
    iget-object v2, v3, Lee2;->s:Ljava/lang/String;

    .line 680
    .line 681
    iget-object v3, v3, Lee2;->t:[Ljava/lang/String;

    .line 682
    .line 683
    invoke-virtual {v0, v2, v3, v7}, Lae2;->A(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :cond_1d
    const-string v0, "no_src"

    .line 688
    .line 689
    new-array v2, v9, [Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v3, v0, v2}, Lee2;->c(Ljava/lang/String;[Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :cond_1e
    const-string v5, "loadControl"

    .line 696
    .line 697
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v5

    .line 701
    if-eqz v5, :cond_1f

    .line 702
    .line 703
    invoke-static {v3, v0}, Lve2;->b(Lee2;Ljava/util/Map;)V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :cond_1f
    const-string v5, "muted"

    .line 708
    .line 709
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v5

    .line 713
    if-eqz v5, :cond_23

    .line 714
    .line 715
    const-string v2, "muted"

    .line 716
    .line 717
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    check-cast v0, Ljava/lang/String;

    .line 722
    .line 723
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-eqz v0, :cond_21

    .line 728
    .line 729
    iget-object v0, v3, Lee2;->l:Lae2;

    .line 730
    .line 731
    if-nez v0, :cond_20

    .line 732
    .line 733
    goto/16 :goto_11

    .line 734
    .line 735
    :cond_20
    iget-object v2, v0, Lae2;->g:Lme2;

    .line 736
    .line 737
    iput-boolean v13, v2, Lme2;->e:Z

    .line 738
    .line 739
    invoke-virtual {v2}, Lme2;->a()V

    .line 740
    .line 741
    .line 742
    invoke-interface {v0}, Lle2;->m()V

    .line 743
    .line 744
    .line 745
    return-void

    .line 746
    :cond_21
    iget-object v0, v3, Lee2;->l:Lae2;

    .line 747
    .line 748
    if-nez v0, :cond_22

    .line 749
    .line 750
    goto/16 :goto_11

    .line 751
    .line 752
    :cond_22
    iget-object v2, v0, Lae2;->g:Lme2;

    .line 753
    .line 754
    iput-boolean v9, v2, Lme2;->e:Z

    .line 755
    .line 756
    invoke-virtual {v2}, Lme2;->a()V

    .line 757
    .line 758
    .line 759
    invoke-interface {v0}, Lle2;->m()V

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :cond_23
    const-string v5, "pause"

    .line 764
    .line 765
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v5

    .line 769
    if-eqz v5, :cond_25

    .line 770
    .line 771
    iget-object v0, v3, Lee2;->l:Lae2;

    .line 772
    .line 773
    if-nez v0, :cond_24

    .line 774
    .line 775
    goto/16 :goto_11

    .line 776
    .line 777
    :cond_24
    invoke-virtual {v0}, Lae2;->i()V

    .line 778
    .line 779
    .line 780
    return-void

    .line 781
    :cond_25
    const-string v5, "play"

    .line 782
    .line 783
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v5

    .line 787
    if-eqz v5, :cond_27

    .line 788
    .line 789
    iget-object v0, v3, Lee2;->l:Lae2;

    .line 790
    .line 791
    if-nez v0, :cond_26

    .line 792
    .line 793
    goto/16 :goto_11

    .line 794
    .line 795
    :cond_26
    invoke-virtual {v0}, Lae2;->h()V

    .line 796
    .line 797
    .line 798
    return-void

    .line 799
    :cond_27
    const-string v5, "show"

    .line 800
    .line 801
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    if-eqz v5, :cond_28

    .line 806
    .line 807
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 808
    .line 809
    .line 810
    return-void

    .line 811
    :cond_28
    const-string v5, "src"

    .line 812
    .line 813
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v5

    .line 817
    if-eqz v5, :cond_32

    .line 818
    .line 819
    const-string v2, "src"

    .line 820
    .line 821
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    check-cast v2, Ljava/lang/String;

    .line 826
    .line 827
    sget-object v5, Lmz1;->j2:Liz1;

    .line 828
    .line 829
    sget-object v7, Ltw1;->e:Ltw1;

    .line 830
    .line 831
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 832
    .line 833
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    check-cast v5, Ljava/lang/Boolean;

    .line 838
    .line 839
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 840
    .line 841
    .line 842
    move-result v5

    .line 843
    if-eqz v5, :cond_2a

    .line 844
    .line 845
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    if-nez v5, :cond_29

    .line 850
    .line 851
    goto :goto_6

    .line 852
    :cond_29
    const-string v0, "Src parameter missing from src video GMSG."

    .line 853
    .line 854
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :cond_2a
    :goto_6
    const-string v5, "periodicReportIntervalMs"

    .line 859
    .line 860
    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result v7

    .line 864
    if-nez v7, :cond_2b

    .line 865
    .line 866
    goto :goto_7

    .line 867
    :cond_2b
    :try_start_8
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    check-cast v7, Ljava/lang/String;

    .line 872
    .line 873
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v6
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_4

    .line 881
    goto :goto_7

    .line 882
    :catch_4
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v5

    .line 886
    check-cast v5, Ljava/lang/String;

    .line 887
    .line 888
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v5

    .line 892
    const-string v7, "Video gmsg invalid numeric parameter \'periodicReportIntervalMs\': "

    .line 893
    .line 894
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v5

    .line 898
    invoke-static {v5}, Lgi2;->i0(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    :goto_7
    new-array v5, v13, [Ljava/lang/String;

    .line 902
    .line 903
    aput-object v2, v5, v9

    .line 904
    .line 905
    const-string v7, "demuxed"

    .line 906
    .line 907
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    check-cast v0, Ljava/lang/String;

    .line 912
    .line 913
    if-eqz v0, :cond_30

    .line 914
    .line 915
    :try_start_9
    new-instance v5, Lorg/json/JSONArray;

    .line 916
    .line 917
    invoke-direct {v5, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    new-instance v7, Ljava/util/ArrayList;

    .line 921
    .line 922
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 923
    .line 924
    .line 925
    move v8, v9

    .line 926
    :goto_8
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 927
    .line 928
    .line 929
    move-result v10

    .line 930
    if-ge v8, v10, :cond_2e

    .line 931
    .line 932
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v10

    .line 936
    sget-object v12, Lmz1;->j2:Liz1;

    .line 937
    .line 938
    sget-object v14, Ltw1;->e:Ltw1;

    .line 939
    .line 940
    iget-object v14, v14, Ltw1;->c:Lkz1;

    .line 941
    .line 942
    invoke-virtual {v14, v12}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v12

    .line 946
    check-cast v12, Ljava/lang/Boolean;

    .line 947
    .line 948
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 949
    .line 950
    .line 951
    move-result v12

    .line 952
    if-eqz v12, :cond_2c

    .line 953
    .line 954
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 955
    .line 956
    .line 957
    move-result v12

    .line 958
    if-nez v12, :cond_2d

    .line 959
    .line 960
    :cond_2c
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    :cond_2d
    add-int/lit8 v8, v8, 0x1

    .line 964
    .line 965
    goto :goto_8

    .line 966
    :cond_2e
    sget-object v5, Lmz1;->j2:Liz1;

    .line 967
    .line 968
    sget-object v8, Ltw1;->e:Ltw1;

    .line 969
    .line 970
    iget-object v8, v8, Ltw1;->c:Lkz1;

    .line 971
    .line 972
    invoke-virtual {v8, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v5

    .line 976
    check-cast v5, Ljava/lang/Boolean;

    .line 977
    .line 978
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 979
    .line 980
    .line 981
    move-result v5

    .line 982
    if-eqz v5, :cond_2f

    .line 983
    .line 984
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 985
    .line 986
    .line 987
    move-result v5

    .line 988
    if-eqz v5, :cond_2f

    .line 989
    .line 990
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 991
    .line 992
    .line 993
    move-result v5

    .line 994
    add-int/lit8 v5, v5, 0x29

    .line 995
    .line 996
    new-instance v7, Ljava/lang/StringBuilder;

    .line 997
    .line 998
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    invoke-static {v4}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    goto/16 :goto_11

    .line 1015
    .line 1016
    :cond_2f
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    new-array v4, v4, [Ljava/lang/String;

    .line 1021
    .line 1022
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v4

    .line 1026
    move-object v5, v4

    .line 1027
    check-cast v5, [Ljava/lang/String;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_5

    .line 1028
    .line 1029
    goto :goto_9

    .line 1030
    :catch_5
    const-string v4, "Malformed demuxed URL list for playback: "

    .line 1031
    .line 1032
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    new-array v5, v13, [Ljava/lang/String;

    .line 1040
    .line 1041
    aput-object v2, v5, v9

    .line 1042
    .line 1043
    :cond_30
    :goto_9
    if-eqz v6, :cond_31

    .line 1044
    .line 1045
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1046
    .line 1047
    .line 1048
    move-result v0

    .line 1049
    invoke-interface {v11, v0}, Lag2;->b1(I)V

    .line 1050
    .line 1051
    .line 1052
    :cond_31
    iput-object v2, v3, Lee2;->s:Ljava/lang/String;

    .line 1053
    .line 1054
    iput-object v5, v3, Lee2;->t:[Ljava/lang/String;

    .line 1055
    .line 1056
    return-void

    .line 1057
    :cond_32
    const-string v4, "touchMove"

    .line 1058
    .line 1059
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v4

    .line 1063
    if-eqz v4, :cond_34

    .line 1064
    .line 1065
    invoke-interface {v11}, Lag2;->getContext()Landroid/content/Context;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    const-string v4, "dx"

    .line 1070
    .line 1071
    invoke-static {v2, v0, v4, v9}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1072
    .line 1073
    .line 1074
    move-result v4

    .line 1075
    const-string v5, "dy"

    .line 1076
    .line 1077
    invoke-static {v2, v0, v5, v9}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    int-to-float v2, v4

    .line 1082
    int-to-float v0, v0

    .line 1083
    iget-object v3, v3, Lee2;->l:Lae2;

    .line 1084
    .line 1085
    if-eqz v3, :cond_33

    .line 1086
    .line 1087
    invoke-virtual {v3, v2, v0}, Lae2;->n(FF)V

    .line 1088
    .line 1089
    .line 1090
    :cond_33
    iget-boolean v0, v1, Lve2;->f:Z

    .line 1091
    .line 1092
    if-nez v0, :cond_41

    .line 1093
    .line 1094
    invoke-interface {v11}, Lag2;->i()V

    .line 1095
    .line 1096
    .line 1097
    iput-boolean v13, v1, Lve2;->f:Z

    .line 1098
    .line 1099
    return-void

    .line 1100
    :cond_34
    const-string v4, "volume"

    .line 1101
    .line 1102
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v4

    .line 1106
    if-eqz v4, :cond_37

    .line 1107
    .line 1108
    const-string v2, "volume"

    .line 1109
    .line 1110
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    check-cast v0, Ljava/lang/String;

    .line 1115
    .line 1116
    if-nez v0, :cond_35

    .line 1117
    .line 1118
    const-string v0, "Level parameter missing from volume video GMSG."

    .line 1119
    .line 1120
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    return-void

    .line 1124
    :cond_35
    :try_start_a
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    iget-object v3, v3, Lee2;->l:Lae2;

    .line 1129
    .line 1130
    if-nez v3, :cond_36

    .line 1131
    .line 1132
    goto/16 :goto_11

    .line 1133
    .line 1134
    :cond_36
    iget-object v4, v3, Lae2;->g:Lme2;

    .line 1135
    .line 1136
    iput v2, v4, Lme2;->f:F

    .line 1137
    .line 1138
    invoke-virtual {v4}, Lme2;->a()V

    .line 1139
    .line 1140
    .line 1141
    invoke-interface {v3}, Lle2;->m()V
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_6

    .line 1142
    .line 1143
    .line 1144
    return-void

    .line 1145
    :catch_6
    const-string v2, "Could not parse volume parameter from volume video GMSG: "

    .line 1146
    .line 1147
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1152
    .line 1153
    .line 1154
    return-void

    .line 1155
    :cond_37
    const-string v0, "watermark"

    .line 1156
    .line 1157
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v0

    .line 1161
    if-eqz v0, :cond_38

    .line 1162
    .line 1163
    invoke-virtual {v3}, Lee2;->a()V

    .line 1164
    .line 1165
    .line 1166
    return-void

    .line 1167
    :cond_38
    const-string v0, "Unknown video action: "

    .line 1168
    .line 1169
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    return-void

    .line 1177
    :goto_a
    invoke-interface {v11}, Lag2;->getContext()Landroid/content/Context;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    const-string v3, "x"

    .line 1182
    .line 1183
    invoke-static {v2, v0, v3, v9}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1184
    .line 1185
    .line 1186
    move-result v3

    .line 1187
    const-string v4, "y"

    .line 1188
    .line 1189
    invoke-static {v2, v0, v4, v9}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1190
    .line 1191
    .line 1192
    move-result v4

    .line 1193
    const-string v5, "w"

    .line 1194
    .line 1195
    const/4 v6, -0x1

    .line 1196
    invoke-static {v2, v0, v5, v6}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1197
    .line 1198
    .line 1199
    move-result v5

    .line 1200
    sget-object v7, Lmz1;->k4:Liz1;

    .line 1201
    .line 1202
    sget-object v14, Ltw1;->e:Ltw1;

    .line 1203
    .line 1204
    iget-object v15, v14, Ltw1;->c:Lkz1;

    .line 1205
    .line 1206
    invoke-virtual {v15, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v15

    .line 1210
    check-cast v15, Ljava/lang/Boolean;

    .line 1211
    .line 1212
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v15

    .line 1216
    if-eqz v15, :cond_3a

    .line 1217
    .line 1218
    if-ne v5, v6, :cond_39

    .line 1219
    .line 1220
    invoke-interface {v11}, Lag2;->d()I

    .line 1221
    .line 1222
    .line 1223
    move-result v5

    .line 1224
    :goto_b
    move/from16 p1, v13

    .line 1225
    .line 1226
    goto :goto_d

    .line 1227
    :cond_39
    invoke-interface {v11}, Lag2;->d()I

    .line 1228
    .line 1229
    .line 1230
    move-result v15

    .line 1231
    invoke-static {v5, v15}, Ljava/lang/Math;->min(II)I

    .line 1232
    .line 1233
    .line 1234
    move-result v5

    .line 1235
    goto :goto_b

    .line 1236
    :cond_3a
    invoke-static {}, Lgi2;->R()Z

    .line 1237
    .line 1238
    .line 1239
    move-result v15

    .line 1240
    if-eqz v15, :cond_3b

    .line 1241
    .line 1242
    invoke-interface {v11}, Lag2;->d()I

    .line 1243
    .line 1244
    .line 1245
    move-result v15

    .line 1246
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v16

    .line 1250
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 1251
    .line 1252
    .line 1253
    move-result v16

    .line 1254
    move/from16 p1, v13

    .line 1255
    .line 1256
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v13

    .line 1260
    add-int/lit8 v9, v16, 0x48

    .line 1261
    .line 1262
    invoke-static {v13, v9, v12}, Lga1;->i(Ljava/lang/String;II)I

    .line 1263
    .line 1264
    .line 1265
    move-result v9

    .line 1266
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v13

    .line 1270
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1271
    .line 1272
    .line 1273
    move-result v13

    .line 1274
    add-int/2addr v13, v9

    .line 1275
    add-int/lit8 v13, v13, 0x1

    .line 1276
    .line 1277
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1278
    .line 1279
    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1280
    .line 1281
    .line 1282
    const-string v13, "Calculate width with original width "

    .line 1283
    .line 1284
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1288
    .line 1289
    .line 1290
    const-string v13, ", videoHost.getVideoBoundingWidth() "

    .line 1291
    .line 1292
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1296
    .line 1297
    .line 1298
    const-string v13, ", x "

    .line 1299
    .line 1300
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    .line 1306
    const-string v13, "."

    .line 1307
    .line 1308
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v9

    .line 1315
    invoke-static {v9}, Lgi2;->G(Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    goto :goto_c

    .line 1319
    :cond_3b
    move/from16 p1, v13

    .line 1320
    .line 1321
    :goto_c
    invoke-interface {v11}, Lag2;->d()I

    .line 1322
    .line 1323
    .line 1324
    move-result v9

    .line 1325
    sub-int/2addr v9, v3

    .line 1326
    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    .line 1327
    .line 1328
    .line 1329
    move-result v5

    .line 1330
    :goto_d
    const-string v9, "h"

    .line 1331
    .line 1332
    invoke-static {v2, v0, v9, v6}, Lve2;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1333
    .line 1334
    .line 1335
    move-result v2

    .line 1336
    iget-object v9, v14, Ltw1;->c:Lkz1;

    .line 1337
    .line 1338
    invoke-virtual {v9, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v7

    .line 1342
    check-cast v7, Ljava/lang/Boolean;

    .line 1343
    .line 1344
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v7

    .line 1348
    if-eqz v7, :cond_3d

    .line 1349
    .line 1350
    if-ne v2, v6, :cond_3c

    .line 1351
    .line 1352
    invoke-interface {v11}, Lag2;->K()I

    .line 1353
    .line 1354
    .line 1355
    move-result v2

    .line 1356
    goto :goto_e

    .line 1357
    :cond_3c
    invoke-interface {v11}, Lag2;->K()I

    .line 1358
    .line 1359
    .line 1360
    move-result v7

    .line 1361
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    .line 1362
    .line 1363
    .line 1364
    move-result v2

    .line 1365
    goto :goto_e

    .line 1366
    :cond_3d
    invoke-static {}, Lgi2;->R()Z

    .line 1367
    .line 1368
    .line 1369
    move-result v7

    .line 1370
    if-eqz v7, :cond_3e

    .line 1371
    .line 1372
    invoke-interface {v11}, Lag2;->K()I

    .line 1373
    .line 1374
    .line 1375
    move-result v7

    .line 1376
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v9

    .line 1380
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1381
    .line 1382
    .line 1383
    move-result v9

    .line 1384
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v13

    .line 1388
    add-int/lit8 v9, v9, 0x4b

    .line 1389
    .line 1390
    invoke-static {v13, v9, v12}, Lga1;->i(Ljava/lang/String;II)I

    .line 1391
    .line 1392
    .line 1393
    move-result v9

    .line 1394
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v12

    .line 1398
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1399
    .line 1400
    .line 1401
    move-result v12

    .line 1402
    add-int/2addr v12, v9

    .line 1403
    add-int/lit8 v12, v12, 0x1

    .line 1404
    .line 1405
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1406
    .line 1407
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1408
    .line 1409
    .line 1410
    const-string v12, "Calculate height with original height "

    .line 1411
    .line 1412
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    const-string v12, ", videoHost.getVideoBoundingHeight() "

    .line 1419
    .line 1420
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1424
    .line 1425
    .line 1426
    const-string v7, ", y "

    .line 1427
    .line 1428
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1432
    .line 1433
    .line 1434
    const-string v7, "."

    .line 1435
    .line 1436
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v7

    .line 1443
    invoke-static {v7}, Lgi2;->G(Ljava/lang/String;)V

    .line 1444
    .line 1445
    .line 1446
    :cond_3e
    invoke-interface {v11}, Lag2;->K()I

    .line 1447
    .line 1448
    .line 1449
    move-result v7

    .line 1450
    sub-int/2addr v7, v4

    .line 1451
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    .line 1452
    .line 1453
    .line 1454
    move-result v2

    .line 1455
    :goto_e
    :try_start_b
    const-string v7, "player"

    .line 1456
    .line 1457
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v7

    .line 1461
    check-cast v7, Ljava/lang/String;

    .line 1462
    .line 1463
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1464
    .line 1465
    .line 1466
    move-result v7
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_7

    .line 1467
    move/from16 v20, v7

    .line 1468
    .line 1469
    goto :goto_f

    .line 1470
    :catch_7
    const/16 v20, 0x0

    .line 1471
    .line 1472
    :goto_f
    const-string v7, "spherical"

    .line 1473
    .line 1474
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v7

    .line 1478
    check-cast v7, Ljava/lang/String;

    .line 1479
    .line 1480
    invoke-static {v7}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1481
    .line 1482
    .line 1483
    move-result v21

    .line 1484
    if-eqz v10, :cond_40

    .line 1485
    .line 1486
    iget-object v7, v8, Lg4;->k:Ljava/lang/Object;

    .line 1487
    .line 1488
    check-cast v7, Lee2;

    .line 1489
    .line 1490
    if-nez v7, :cond_40

    .line 1491
    .line 1492
    const-string v7, "flags"

    .line 1493
    .line 1494
    new-instance v9, Lje2;

    .line 1495
    .line 1496
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v7

    .line 1500
    check-cast v7, Ljava/lang/String;

    .line 1501
    .line 1502
    invoke-direct {v9, v7}, Lje2;-><init>(Ljava/lang/String;)V

    .line 1503
    .line 1504
    .line 1505
    iget-object v7, v8, Lg4;->k:Ljava/lang/Object;

    .line 1506
    .line 1507
    check-cast v7, Lee2;

    .line 1508
    .line 1509
    if-eqz v7, :cond_3f

    .line 1510
    .line 1511
    goto :goto_10

    .line 1512
    :cond_3f
    iget-object v7, v8, Lg4;->j:Ljava/lang/Object;

    .line 1513
    .line 1514
    check-cast v7, Ljg2;

    .line 1515
    .line 1516
    iget-object v10, v7, Ljg2;->f:Log2;

    .line 1517
    .line 1518
    iget-object v11, v10, Log2;->Q:Lvq2;

    .line 1519
    .line 1520
    iget-object v11, v11, Lvq2;->h:Ljava/lang/Object;

    .line 1521
    .line 1522
    check-cast v11, Ltz1;

    .line 1523
    .line 1524
    const-string v12, "vpr2"

    .line 1525
    .line 1526
    iget-object v10, v10, Log2;->O:Lrz1;

    .line 1527
    .line 1528
    filled-new-array {v12}, [Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v12

    .line 1532
    invoke-static {v11, v10, v12}, Lpu1;->t(Ltz1;Lrz1;[Ljava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    iget-object v10, v8, Lg4;->g:Ljava/lang/Object;

    .line 1536
    .line 1537
    move-object/from16 v18, v10

    .line 1538
    .line 1539
    check-cast v18, Landroid/content/Context;

    .line 1540
    .line 1541
    new-instance v17, Lee2;

    .line 1542
    .line 1543
    iget-object v10, v7, Ljg2;->f:Log2;

    .line 1544
    .line 1545
    iget-object v10, v10, Log2;->Q:Lvq2;

    .line 1546
    .line 1547
    iget-object v10, v10, Lvq2;->h:Ljava/lang/Object;

    .line 1548
    .line 1549
    move-object/from16 v22, v10

    .line 1550
    .line 1551
    check-cast v22, Ltz1;

    .line 1552
    .line 1553
    iget-object v10, v8, Lg4;->i:Ljava/lang/Object;

    .line 1554
    .line 1555
    move-object/from16 v24, v10

    .line 1556
    .line 1557
    check-cast v24, Lmv2;

    .line 1558
    .line 1559
    move-object/from16 v19, v7

    .line 1560
    .line 1561
    move-object/from16 v23, v9

    .line 1562
    .line 1563
    invoke-direct/range {v17 .. v24}, Lee2;-><init>(Landroid/content/Context;Lag2;IZLtz1;Lje2;Lmv2;)V

    .line 1564
    .line 1565
    .line 1566
    move-object/from16 v9, v17

    .line 1567
    .line 1568
    iput-object v9, v8, Lg4;->k:Ljava/lang/Object;

    .line 1569
    .line 1570
    iget-object v10, v8, Lg4;->h:Ljava/lang/Object;

    .line 1571
    .line 1572
    check-cast v10, Ljg2;

    .line 1573
    .line 1574
    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    .line 1575
    .line 1576
    invoke-direct {v11, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1577
    .line 1578
    .line 1579
    const/4 v6, 0x0

    .line 1580
    invoke-virtual {v10, v9, v6, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1581
    .line 1582
    .line 1583
    iget-object v6, v8, Lg4;->k:Ljava/lang/Object;

    .line 1584
    .line 1585
    check-cast v6, Lee2;

    .line 1586
    .line 1587
    invoke-virtual {v6, v3, v4, v5, v2}, Lee2;->l(IIII)V

    .line 1588
    .line 1589
    .line 1590
    iget-object v2, v7, Ljg2;->f:Log2;

    .line 1591
    .line 1592
    iget-object v2, v2, Log2;->s:Lsg2;

    .line 1593
    .line 1594
    const/4 v3, 0x0

    .line 1595
    iput-boolean v3, v2, Lsg2;->q:Z

    .line 1596
    .line 1597
    :goto_10
    iget-object v2, v8, Lg4;->k:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v2, Lee2;

    .line 1600
    .line 1601
    if-eqz v2, :cond_41

    .line 1602
    .line 1603
    invoke-static {v2, v0}, Lve2;->b(Lee2;Ljava/util/Map;)V

    .line 1604
    .line 1605
    .line 1606
    return-void

    .line 1607
    :cond_40
    const-string v0, "The underlay may only be modified from the UI thread."

    .line 1608
    .line 1609
    invoke-static {v0}, Lou1;->h(Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    iget-object v0, v8, Lg4;->k:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v0, Lee2;

    .line 1615
    .line 1616
    if-eqz v0, :cond_41

    .line 1617
    .line 1618
    invoke-virtual {v0, v3, v4, v5, v2}, Lee2;->l(IIII)V

    .line 1619
    .line 1620
    .line 1621
    :cond_41
    :goto_11
    return-void
.end method
