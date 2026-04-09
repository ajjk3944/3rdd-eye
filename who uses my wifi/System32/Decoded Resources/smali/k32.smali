.class public final Lk32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk32;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lk32;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "request_origin"

    .line 7
    .line 8
    const-string v2, "inspector_ooct"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "networkExtras"

    .line 14
    .line 15
    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_6

    .line 20
    .line 21
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/String;

    .line 26
    .line 27
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_6

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    instance-of v4, v3, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    instance-of v4, v3, Ljava/lang/Integer;

    .line 65
    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    check-cast v3, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    instance-of v4, v3, Ljava/lang/Float;

    .line 93
    .line 94
    if-eqz v4, :cond_4

    .line 95
    .line 96
    check-cast v3, Ljava/lang/Float;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    instance-of v4, v3, Ljava/lang/Double;

    .line 107
    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    check-cast v3, Ljava/lang/Double;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v3

    .line 116
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    instance-of v4, v3, Ljava/lang/Long;

    .line 121
    .line 122
    if-eqz v4, :cond_0

    .line 123
    .line 124
    check-cast v3, Ljava/lang/Long;

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :goto_1
    sget-object v1, Lhg4;->C:Lhg4;

    .line 135
    .line 136
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 137
    .line 138
    const-string v2, "OutOfContextTestingGmsgHandler.generateNetworkExtras"

    .line 139
    .line 140
    invoke-virtual {v1, v2, p0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    return-object v0
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    return-object p0

    .line 31
    :goto_1
    const-string v0, "OutOfContextTestingGmsgHandler.stringArrayToList."

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lhg4;->C:Lhg4;

    .line 38
    .line 39
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 40
    .line 41
    invoke-virtual {v0, p1, p0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 11

    .line 1
    iget v0, p0, Lk32;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk32;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lqs2;

    .line 9
    .line 10
    check-cast p1, Lag2;

    .line 11
    .line 12
    iget-object p1, v0, Lqs2;->b:Lau2;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lau2;->d(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Lag2;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    const-string p1, "height"

    .line 23
    .line 24
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object p2, p0, Lk32;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Log2;

    .line 43
    .line 44
    monitor-enter p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :try_start_1
    iget v0, p2, Log2;->M:I

    .line 46
    .line 47
    if-eq v0, p1, :cond_0

    .line 48
    .line 49
    iput p1, p2, Log2;->M:I

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :goto_0
    monitor-exit p2

    .line 59
    goto :goto_2

    .line 60
    :goto_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 62
    :catch_0
    const/4 p1, 0x5

    .line 63
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_2
    return-void

    .line 67
    :pswitch_1
    const-string v0, "src"

    .line 68
    .line 69
    check-cast p1, Lag2;

    .line 70
    .line 71
    const-string p1, "action"

    .line 72
    .line 73
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Ljava/lang/String;

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    const-string p1, "Action missing from video GMSG."

    .line 82
    .line 83
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ljava/lang/String;

    .line 98
    .line 99
    if-nez p1, :cond_3

    .line 100
    .line 101
    const-string p1, "src missing from video GMSG."

    .line 102
    .line 103
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    iget-object p2, p0, Lk32;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p2, Lof3;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v0, Landroid/os/Bundle;

    .line 115
    .line 116
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v1, "mediaUrl"

    .line 120
    .line 121
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p2, Lof3;->g:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, Lpd2;

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_3
    return-void

    .line 132
    :pswitch_2
    const-string p1, "title"

    .line 133
    .line 134
    const-string v0, "text"

    .line 135
    .line 136
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_7

    .line 141
    .line 142
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/CharSequence;

    .line 147
    .line 148
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v2, "Opening Share Sheet with text: "

    .line 166
    .line 167
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v1, Landroid/content/Intent;

    .line 175
    .line 176
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v2, "android.intent.action.SEND"

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    .line 183
    .line 184
    const-string v2, "text/plain"

    .line 185
    .line 186
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 187
    .line 188
    .line 189
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Ljava/lang/String;

    .line 194
    .line 195
    const-string v2, "android.intent.extra.TEXT"

    .line 196
    .line 197
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 198
    .line 199
    .line 200
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_6

    .line 205
    .line 206
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    check-cast p1, Ljava/lang/String;

    .line 211
    .line 212
    const-string p2, "android.intent.extra.TITLE"

    .line 213
    .line 214
    invoke-virtual {v1, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 215
    .line 216
    .line 217
    :cond_6
    :try_start_3
    sget-object p1, Lhg4;->C:Lhg4;

    .line 218
    .line 219
    iget-object p1, p1, Lhg4;->c:Llf4;

    .line 220
    .line 221
    iget-object p1, p0, Lk32;->g:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, Landroid/content/Context;

    .line 224
    .line 225
    invoke-static {p1, v1}, Llf4;->s(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :catch_1
    move-exception v0

    .line 230
    move-object p1, v0

    .line 231
    const/4 p2, 0x5

    .line 232
    invoke-static {p2}, Lgi2;->q0(I)Z

    .line 233
    .line 234
    .line 235
    const-string p2, "ShareSheetGmsgHandler.onGmsg"

    .line 236
    .line 237
    sget-object v0, Lhg4;->C:Lhg4;

    .line 238
    .line 239
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 240
    .line 241
    invoke-virtual {v0, p2, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    :cond_7
    :goto_4
    return-void

    .line 245
    :pswitch_3
    iget-object p1, p0, Lk32;->g:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast p1, Ll42;

    .line 248
    .line 249
    const-string v0, "action"

    .line 250
    .line 251
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Ljava/lang/String;

    .line 256
    .line 257
    const-string v1, "grant"

    .line 258
    .line 259
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_9

    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    :try_start_4
    const-string v1, "amount"

    .line 267
    .line 268
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Ljava/lang/String;

    .line 273
    .line 274
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    const-string v2, "type"

    .line 279
    .line 280
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    check-cast p2, Ljava/lang/String;

    .line 285
    .line 286
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-nez v2, :cond_8

    .line 291
    .line 292
    new-instance v2, Lta2;

    .line 293
    .line 294
    invoke-direct {v2, p2, v1}, Lta2;-><init>(Ljava/lang/String;I)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2

    .line 295
    .line 296
    .line 297
    move-object v0, v2

    .line 298
    goto :goto_5

    .line 299
    :catch_2
    const/4 p2, 0x5

    .line 300
    invoke-static {p2}, Lgi2;->q0(I)Z

    .line 301
    .line 302
    .line 303
    :cond_8
    :goto_5
    invoke-interface {p1, v0}, Ll42;->T(Lta2;)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_9
    const-string p2, "video_start"

    .line 308
    .line 309
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p2

    .line 313
    if-eqz p2, :cond_a

    .line 314
    .line 315
    invoke-interface {p1}, Ll42;->a()V

    .line 316
    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_a
    const-string p2, "video_complete"

    .line 320
    .line 321
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p2

    .line 325
    if-eqz p2, :cond_b

    .line 326
    .line 327
    invoke-interface {p1}, Ll42;->r()V

    .line 328
    .line 329
    .line 330
    :cond_b
    :goto_6
    return-void

    .line 331
    :pswitch_4
    sget-object p1, Lmz1;->ga:Liz1;

    .line 332
    .line 333
    sget-object v0, Ltw1;->e:Ltw1;

    .line 334
    .line 335
    iget-object v1, v0, Ltw1;->c:Lkz1;

    .line 336
    .line 337
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, Ljava/lang/Boolean;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-nez p1, :cond_c

    .line 348
    .line 349
    goto/16 :goto_25

    .line 350
    .line 351
    :cond_c
    sget-object p1, Ld3;->i:Ld3;

    .line 352
    .line 353
    const-string v1, ""

    .line 354
    .line 355
    new-instance v2, Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 358
    .line 359
    .line 360
    const-string v3, "request_origin"

    .line 361
    .line 362
    const-string v4, "inspector_ooct"

    .line 363
    .line 364
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    new-instance v3, La3;

    .line 368
    .line 369
    const/4 v4, 0x1

    .line 370
    invoke-direct {v3, v4}, Lf74;-><init>(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v3, v2}, Lf74;->i1(Landroid/os/Bundle;)Lf74;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    check-cast v2, La3;

    .line 378
    .line 379
    new-instance v3, Lb3;

    .line 380
    .line 381
    invoke-direct {v3, v2}, Lb3;-><init>(Lf74;)V

    .line 382
    .line 383
    .line 384
    const-string v2, "adUnitId"

    .line 385
    .line 386
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Ljava/lang/String;

    .line 391
    .line 392
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-nez v4, :cond_d

    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_d
    move-object v2, v1

    .line 400
    :goto_7
    const-string v4, "format"

    .line 401
    .line 402
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    check-cast v4, Ljava/lang/String;

    .line 407
    .line 408
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-nez v5, :cond_e

    .line 413
    .line 414
    move-object v1, v4

    .line 415
    :cond_e
    sget-object v4, Lmz1;->ia:Liz1;

    .line 416
    .line 417
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 418
    .line 419
    invoke-virtual {v0, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    const/4 v4, 0x0

    .line 430
    const/4 v5, 0x0

    .line 431
    if-eqz v0, :cond_2c

    .line 432
    .line 433
    const-string p1, "isGamRequest"

    .line 434
    .line 435
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result p1

    .line 439
    if-eqz p1, :cond_f

    .line 440
    .line 441
    const-string p1, "isGamRequest"

    .line 442
    .line 443
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    check-cast p1, Ljava/lang/String;

    .line 448
    .line 449
    const-string v0, "1"

    .line 450
    .line 451
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    if-eqz p1, :cond_f

    .line 456
    .line 457
    const/4 p1, 0x1

    .line 458
    goto :goto_8

    .line 459
    :cond_f
    move p1, v5

    .line 460
    :goto_8
    if-eqz p1, :cond_17

    .line 461
    .line 462
    new-instance v3, Lw2;

    .line 463
    .line 464
    const/4 v0, 0x1

    .line 465
    invoke-direct {v3, v0}, Lf74;-><init>(I)V

    .line 466
    .line 467
    .line 468
    const-string v0, "keywords"

    .line 469
    .line 470
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_10

    .line 475
    .line 476
    const-string v0, "keywords"

    .line 477
    .line 478
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    check-cast v0, Ljava/lang/String;

    .line 483
    .line 484
    const-string v6, "keywords"

    .line 485
    .line 486
    invoke-static {v0, v6}, Lk32;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    move v7, v5

    .line 495
    :goto_9
    if-ge v7, v6, :cond_10

    .line 496
    .line 497
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    add-int/lit8 v7, v7, 0x1

    .line 502
    .line 503
    check-cast v8, Ljava/lang/String;

    .line 504
    .line 505
    iget-object v9, v3, Lf74;->g:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v9, Lo7;

    .line 508
    .line 509
    iget-object v9, v9, Lo7;->d:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v9, Ljava/util/HashSet;

    .line 512
    .line 513
    invoke-virtual {v9, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    goto :goto_9

    .line 517
    :cond_10
    invoke-static {p2}, Lk32;->a(Ljava/util/Map;)Landroid/os/Bundle;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {v3, v0}, Lf74;->i1(Landroid/os/Bundle;)Lf74;

    .line 522
    .line 523
    .line 524
    const-string v0, "customTargeting"

    .line 525
    .line 526
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_11

    .line 531
    .line 532
    const-string v0, "customTargeting"

    .line 533
    .line 534
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Ljava/lang/String;

    .line 539
    .line 540
    :try_start_5
    new-instance v6, Lorg/json/JSONObject;

    .line 541
    .line 542
    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v6}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    if-eqz v7, :cond_11

    .line 554
    .line 555
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    check-cast v7, Ljava/lang/String;

    .line 560
    .line 561
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    invoke-virtual {v3, v7, v8}, Lf74;->h1(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 566
    .line 567
    .line 568
    goto :goto_a

    .line 569
    :catch_3
    move-exception v0

    .line 570
    const-string v6, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest"

    .line 571
    .line 572
    sget-object v7, Lhg4;->C:Lhg4;

    .line 573
    .line 574
    iget-object v7, v7, Lhg4;->h:Lgd2;

    .line 575
    .line 576
    invoke-virtual {v7, v6, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 577
    .line 578
    .line 579
    :cond_11
    const-string v0, "contentUrl"

    .line 580
    .line 581
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_12

    .line 586
    .line 587
    const-string v0, "contentUrl"

    .line 588
    .line 589
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    check-cast v0, Ljava/lang/String;

    .line 594
    .line 595
    invoke-virtual {v3, v0}, Lf74;->m1(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    :cond_12
    const-string v0, "neighboringContentUrlStrings"

    .line 599
    .line 600
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    if-eqz v0, :cond_13

    .line 605
    .line 606
    const-string v0, "neighboringContentUrlStrings"

    .line 607
    .line 608
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, Ljava/lang/String;

    .line 613
    .line 614
    const-string v6, "neighboringContentUrlStrings"

    .line 615
    .line 616
    invoke-static {v0, v6}, Lk32;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v3, v0}, Lf74;->n1(Ljava/util/ArrayList;)V

    .line 621
    .line 622
    .line 623
    :cond_13
    const-string v0, "requestAgent"

    .line 624
    .line 625
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_14

    .line 630
    .line 631
    const-string v0, "requestAgent"

    .line 632
    .line 633
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    check-cast v0, Ljava/lang/String;

    .line 638
    .line 639
    iget-object v6, v3, Lf74;->g:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v6, Lo7;

    .line 642
    .line 643
    iput-object v0, v6, Lo7;->m:Ljava/lang/Object;

    .line 644
    .line 645
    :cond_14
    const-string v0, "publisherProvidedId"

    .line 646
    .line 647
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-eqz v0, :cond_15

    .line 652
    .line 653
    const-string v0, "publisherProvidedId"

    .line 654
    .line 655
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    check-cast v0, Ljava/lang/String;

    .line 660
    .line 661
    iget-object v6, v3, Lf74;->g:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v6, Lo7;

    .line 664
    .line 665
    iput-object v0, v6, Lo7;->l:Ljava/lang/Object;

    .line 666
    .line 667
    :cond_15
    const-string v0, "categoryExclusions"

    .line 668
    .line 669
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-eqz v0, :cond_16

    .line 674
    .line 675
    const-string v0, "categoryExclusions"

    .line 676
    .line 677
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    check-cast v0, Ljava/lang/String;

    .line 682
    .line 683
    const-string v6, "categoryExclusions"

    .line 684
    .line 685
    invoke-static {v0, v6}, Lk32;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 690
    .line 691
    .line 692
    move-result v6

    .line 693
    :goto_b
    if-ge v5, v6, :cond_16

    .line 694
    .line 695
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v7

    .line 699
    add-int/lit8 v5, v5, 0x1

    .line 700
    .line 701
    check-cast v7, Ljava/lang/String;

    .line 702
    .line 703
    iget-object v8, v3, Lf74;->g:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v8, Lo7;

    .line 706
    .line 707
    iget-object v8, v8, Lo7;->i:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v8, Ljava/util/HashSet;

    .line 710
    .line 711
    invoke-virtual {v8, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    goto :goto_b

    .line 715
    :cond_16
    new-instance v0, Lx2;

    .line 716
    .line 717
    invoke-direct {v0, v3}, Lb3;-><init>(Lf74;)V

    .line 718
    .line 719
    .line 720
    :goto_c
    move-object v3, v0

    .line 721
    goto/16 :goto_f

    .line 722
    .line 723
    :cond_17
    new-instance v3, La3;

    .line 724
    .line 725
    const/4 v0, 0x1

    .line 726
    invoke-direct {v3, v0}, Lf74;-><init>(I)V

    .line 727
    .line 728
    .line 729
    const-string v0, "keywords"

    .line 730
    .line 731
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    if-eqz v0, :cond_18

    .line 736
    .line 737
    const-string v0, "keywords"

    .line 738
    .line 739
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    check-cast v0, Ljava/lang/String;

    .line 744
    .line 745
    const-string v6, "keywords"

    .line 746
    .line 747
    invoke-static {v0, v6}, Lk32;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 752
    .line 753
    .line 754
    move-result v6

    .line 755
    :goto_d
    if-ge v5, v6, :cond_18

    .line 756
    .line 757
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v7

    .line 761
    add-int/lit8 v5, v5, 0x1

    .line 762
    .line 763
    check-cast v7, Ljava/lang/String;

    .line 764
    .line 765
    iget-object v8, v3, Lf74;->g:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v8, Lo7;

    .line 768
    .line 769
    iget-object v8, v8, Lo7;->d:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v8, Ljava/util/HashSet;

    .line 772
    .line 773
    invoke-virtual {v8, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    goto :goto_d

    .line 777
    :cond_18
    invoke-static {p2}, Lk32;->a(Ljava/util/Map;)Landroid/os/Bundle;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v3, v0}, Lf74;->i1(Landroid/os/Bundle;)Lf74;

    .line 782
    .line 783
    .line 784
    const-string v0, "customTargeting"

    .line 785
    .line 786
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    if-eqz v0, :cond_19

    .line 791
    .line 792
    const-string v0, "customTargeting"

    .line 793
    .line 794
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    check-cast v0, Ljava/lang/String;

    .line 799
    .line 800
    :try_start_6
    new-instance v5, Lorg/json/JSONObject;

    .line 801
    .line 802
    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 810
    .line 811
    .line 812
    move-result v6

    .line 813
    if-eqz v6, :cond_19

    .line 814
    .line 815
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v6

    .line 819
    check-cast v6, Ljava/lang/String;

    .line 820
    .line 821
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v7

    .line 825
    invoke-virtual {v3, v6, v7}, Lf74;->h1(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_4

    .line 826
    .line 827
    .line 828
    goto :goto_e

    .line 829
    :catch_4
    move-exception v0

    .line 830
    const-string v5, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest"

    .line 831
    .line 832
    sget-object v6, Lhg4;->C:Lhg4;

    .line 833
    .line 834
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 835
    .line 836
    invoke-virtual {v6, v5, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 837
    .line 838
    .line 839
    :cond_19
    const-string v0, "contentUrl"

    .line 840
    .line 841
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-eqz v0, :cond_1a

    .line 846
    .line 847
    const-string v0, "contentUrl"

    .line 848
    .line 849
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    check-cast v0, Ljava/lang/String;

    .line 854
    .line 855
    invoke-virtual {v3, v0}, Lf74;->m1(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    :cond_1a
    const-string v0, "neighboringContentUrlStrings"

    .line 859
    .line 860
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    if-eqz v0, :cond_1b

    .line 865
    .line 866
    const-string v0, "neighboringContentUrlStrings"

    .line 867
    .line 868
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    check-cast v0, Ljava/lang/String;

    .line 873
    .line 874
    const-string v5, "neighboringContentUrlStrings"

    .line 875
    .line 876
    invoke-static {v0, v5}, Lk32;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    invoke-virtual {v3, v0}, Lf74;->n1(Ljava/util/ArrayList;)V

    .line 881
    .line 882
    .line 883
    :cond_1b
    const-string v0, "requestAgent"

    .line 884
    .line 885
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v0

    .line 889
    if-eqz v0, :cond_1c

    .line 890
    .line 891
    const-string v0, "requestAgent"

    .line 892
    .line 893
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    check-cast v0, Ljava/lang/String;

    .line 898
    .line 899
    iget-object v5, v3, Lf74;->g:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v5, Lo7;

    .line 902
    .line 903
    iput-object v0, v5, Lo7;->m:Ljava/lang/Object;

    .line 904
    .line 905
    :cond_1c
    new-instance v0, Lb3;

    .line 906
    .line 907
    invoke-direct {v0, v3}, Lb3;-><init>(Lf74;)V

    .line 908
    .line 909
    .line 910
    goto/16 :goto_c

    .line 911
    .line 912
    :goto_f
    const-string v0, "width"

    .line 913
    .line 914
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    check-cast v0, Ljava/lang/String;

    .line 919
    .line 920
    const-string v5, "height"

    .line 921
    .line 922
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v5

    .line 926
    check-cast v5, Ljava/lang/String;

    .line 927
    .line 928
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 929
    .line 930
    .line 931
    move-result v6

    .line 932
    if-nez v6, :cond_1e

    .line 933
    .line 934
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 935
    .line 936
    .line 937
    move-result v6

    .line 938
    if-eqz v6, :cond_1d

    .line 939
    .line 940
    goto :goto_11

    .line 941
    :cond_1d
    :try_start_7
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 942
    .line 943
    .line 944
    move-result v0

    .line 945
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 946
    .line 947
    .line 948
    move-result v5

    .line 949
    new-instance v6, Ld3;

    .line 950
    .line 951
    invoke-direct {v6, v0, v5}, Ld3;-><init>(II)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_5

    .line 952
    .line 953
    .line 954
    goto :goto_12

    .line 955
    :catch_5
    move-exception v0

    .line 956
    const-string v5, "OutOfContextTestingGmsgHandler.generateAdSize"

    .line 957
    .line 958
    sget-object v6, Lhg4;->C:Lhg4;

    .line 959
    .line 960
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 961
    .line 962
    invoke-virtual {v6, v5, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 963
    .line 964
    .line 965
    sget-object v0, Ld3;->i:Ld3;

    .line 966
    .line 967
    :goto_10
    move-object v6, v0

    .line 968
    goto :goto_12

    .line 969
    :cond_1e
    :goto_11
    sget-object v0, Ld3;->i:Ld3;

    .line 970
    .line 971
    goto :goto_10

    .line 972
    :goto_12
    const-string v0, "clickToExpandRequested"

    .line 973
    .line 974
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    if-nez v0, :cond_20

    .line 979
    .line 980
    const-string v0, "customControlsRequested"

    .line 981
    .line 982
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v0

    .line 986
    if-nez v0, :cond_20

    .line 987
    .line 988
    const-string v0, "startMuted"

    .line 989
    .line 990
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-eqz v0, :cond_1f

    .line 995
    .line 996
    goto :goto_13

    .line 997
    :cond_1f
    move-object v5, v4

    .line 998
    goto :goto_14

    .line 999
    :cond_20
    :goto_13
    new-instance v0, Lk51;

    .line 1000
    .line 1001
    invoke-direct {v0}, Lk51;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    const-string v5, "startMuted"

    .line 1005
    .line 1006
    invoke-interface {p2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    if-eqz v5, :cond_21

    .line 1011
    .line 1012
    const-string v5, "startMuted"

    .line 1013
    .line 1014
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v5

    .line 1018
    check-cast v5, Ljava/lang/String;

    .line 1019
    .line 1020
    const-string v7, "1"

    .line 1021
    .line 1022
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v5

    .line 1026
    iput-boolean v5, v0, Lk51;->a:Z

    .line 1027
    .line 1028
    :cond_21
    const-string v5, "customControlsRequested"

    .line 1029
    .line 1030
    invoke-interface {p2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v5

    .line 1034
    if-eqz v5, :cond_22

    .line 1035
    .line 1036
    const-string v5, "customControlsRequested"

    .line 1037
    .line 1038
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v5

    .line 1042
    check-cast v5, Ljava/lang/String;

    .line 1043
    .line 1044
    const-string v7, "1"

    .line 1045
    .line 1046
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v5

    .line 1050
    iput-boolean v5, v0, Lk51;->b:Z

    .line 1051
    .line 1052
    :cond_22
    const-string v5, "clickToExpandRequested"

    .line 1053
    .line 1054
    invoke-interface {p2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v5

    .line 1058
    if-eqz v5, :cond_23

    .line 1059
    .line 1060
    const-string v5, "clickToExpandRequested"

    .line 1061
    .line 1062
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v5

    .line 1066
    check-cast v5, Ljava/lang/String;

    .line 1067
    .line 1068
    const-string v7, "1"

    .line 1069
    .line 1070
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v5

    .line 1074
    iput-boolean v5, v0, Lk51;->c:Z

    .line 1075
    .line 1076
    :cond_23
    new-instance v5, Ll51;

    .line 1077
    .line 1078
    invoke-direct {v5, v0}, Ll51;-><init>(Lk51;)V

    .line 1079
    .line 1080
    .line 1081
    :goto_14
    const-string v0, "customMuteThisAdRequested"

    .line 1082
    .line 1083
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    if-nez v0, :cond_25

    .line 1088
    .line 1089
    const-string v0, "disableImageLoading"

    .line 1090
    .line 1091
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v0

    .line 1095
    if-nez v0, :cond_25

    .line 1096
    .line 1097
    const-string v0, "mediaAspectRatio"

    .line 1098
    .line 1099
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v0

    .line 1103
    if-nez v0, :cond_25

    .line 1104
    .line 1105
    const-string v0, "preferredAdChoicesPosition"

    .line 1106
    .line 1107
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    if-nez v0, :cond_25

    .line 1112
    .line 1113
    const-string v0, "shouldRequestMultipleImages"

    .line 1114
    .line 1115
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v0

    .line 1119
    if-nez v0, :cond_25

    .line 1120
    .line 1121
    if-eqz v5, :cond_24

    .line 1122
    .line 1123
    const-string v0, "NATIVE"

    .line 1124
    .line 1125
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v0

    .line 1129
    if-eqz v0, :cond_24

    .line 1130
    .line 1131
    goto :goto_15

    .line 1132
    :cond_24
    move-object v0, v5

    .line 1133
    move v5, p1

    .line 1134
    move-object p1, v6

    .line 1135
    move-object v6, v0

    .line 1136
    move-object v0, v4

    .line 1137
    goto/16 :goto_18

    .line 1138
    .line 1139
    :cond_25
    :goto_15
    new-instance v7, Ljg0;

    .line 1140
    .line 1141
    invoke-direct {v7}, Ljg0;-><init>()V

    .line 1142
    .line 1143
    .line 1144
    const-string v0, "disableImageLoading"

    .line 1145
    .line 1146
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v0

    .line 1150
    if-eqz v0, :cond_26

    .line 1151
    .line 1152
    const-string v0, "disableImageLoading"

    .line 1153
    .line 1154
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    check-cast v0, Ljava/lang/String;

    .line 1159
    .line 1160
    const-string v8, "1"

    .line 1161
    .line 1162
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v0

    .line 1166
    iput-boolean v0, v7, Ljg0;->a:Z

    .line 1167
    .line 1168
    :cond_26
    const-string v0, "mediaAspectRatio"

    .line 1169
    .line 1170
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    if-eqz v0, :cond_27

    .line 1175
    .line 1176
    const-string v0, "mediaAspectRatio"

    .line 1177
    .line 1178
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    check-cast v0, Ljava/lang/String;

    .line 1183
    .line 1184
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v8

    .line 1188
    if-nez v8, :cond_27

    .line 1189
    .line 1190
    :try_start_8
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1191
    .line 1192
    .line 1193
    move-result v0

    .line 1194
    iput v0, v7, Ljg0;->b:I
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_6

    .line 1195
    .line 1196
    goto :goto_16

    .line 1197
    :catch_6
    move-exception v0

    .line 1198
    const-string v8, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio"

    .line 1199
    .line 1200
    sget-object v9, Lhg4;->C:Lhg4;

    .line 1201
    .line 1202
    iget-object v9, v9, Lhg4;->h:Lgd2;

    .line 1203
    .line 1204
    invoke-virtual {v9, v8, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1205
    .line 1206
    .line 1207
    :cond_27
    :goto_16
    const-string v0, "shouldRequestMultipleImages"

    .line 1208
    .line 1209
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    move-result v0

    .line 1213
    if-eqz v0, :cond_28

    .line 1214
    .line 1215
    const-string v0, "shouldRequestMultipleImages"

    .line 1216
    .line 1217
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    check-cast v0, Ljava/lang/String;

    .line 1222
    .line 1223
    const-string v8, "1"

    .line 1224
    .line 1225
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v0

    .line 1229
    iput-boolean v0, v7, Ljg0;->c:Z

    .line 1230
    .line 1231
    :cond_28
    const-string v0, "preferredAdChoicesPosition"

    .line 1232
    .line 1233
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    if-eqz v0, :cond_29

    .line 1238
    .line 1239
    const-string v0, "preferredAdChoicesPosition"

    .line 1240
    .line 1241
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    check-cast v0, Ljava/lang/String;

    .line 1246
    .line 1247
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v8

    .line 1251
    if-nez v8, :cond_29

    .line 1252
    .line 1253
    :try_start_9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    iput v0, v7, Ljg0;->d:I
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_7

    .line 1258
    .line 1259
    goto :goto_17

    .line 1260
    :catch_7
    move-exception v0

    .line 1261
    const-string v8, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition"

    .line 1262
    .line 1263
    sget-object v9, Lhg4;->C:Lhg4;

    .line 1264
    .line 1265
    iget-object v9, v9, Lhg4;->h:Lgd2;

    .line 1266
    .line 1267
    invoke-virtual {v9, v8, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1268
    .line 1269
    .line 1270
    :cond_29
    :goto_17
    const-string v0, "customMuteThisAdRequested"

    .line 1271
    .line 1272
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v0

    .line 1276
    if-eqz v0, :cond_2a

    .line 1277
    .line 1278
    const-string v0, "customMuteThisAdRequested"

    .line 1279
    .line 1280
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    check-cast v0, Ljava/lang/String;

    .line 1285
    .line 1286
    const-string v8, "1"

    .line 1287
    .line 1288
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v0

    .line 1292
    iput-boolean v0, v7, Ljg0;->f:Z

    .line 1293
    .line 1294
    :cond_2a
    if-eqz v5, :cond_2b

    .line 1295
    .line 1296
    iput-object v5, v7, Ljg0;->e:Ll51;

    .line 1297
    .line 1298
    :cond_2b
    new-instance v0, Ljg0;

    .line 1299
    .line 1300
    invoke-direct {v0, v7}, Ljg0;-><init>(Ljg0;)V

    .line 1301
    .line 1302
    .line 1303
    move-object v10, v5

    .line 1304
    move v5, p1

    .line 1305
    move-object p1, v6

    .line 1306
    move-object v6, v10

    .line 1307
    goto :goto_18

    .line 1308
    :cond_2c
    move-object v0, v4

    .line 1309
    move-object v6, v0

    .line 1310
    :goto_18
    const-string v7, "action"

    .line 1311
    .line 1312
    invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    move-result-object p2

    .line 1316
    check-cast p2, Ljava/lang/String;

    .line 1317
    .line 1318
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v7

    .line 1322
    if-nez v7, :cond_40

    .line 1323
    .line 1324
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v7

    .line 1328
    if-nez v7, :cond_40

    .line 1329
    .line 1330
    const-string v7, "load"

    .line 1331
    .line 1332
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v7

    .line 1336
    if-eqz v7, :cond_32

    .line 1337
    .line 1338
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v7

    .line 1342
    if-eqz v7, :cond_2d

    .line 1343
    .line 1344
    goto/16 :goto_1d

    .line 1345
    .line 1346
    :cond_2d
    iget-object p2, p0, Lk32;->g:Ljava/lang/Object;

    .line 1347
    .line 1348
    move-object v7, p2

    .line 1349
    check-cast v7, Lex2;

    .line 1350
    .line 1351
    monitor-enter v7

    .line 1352
    :try_start_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 1353
    .line 1354
    .line 1355
    move-result p2

    .line 1356
    sparse-switch p2, :sswitch_data_0

    .line 1357
    .line 1358
    .line 1359
    goto/16 :goto_1a

    .line 1360
    .line 1361
    :sswitch_0
    const-string p2, "BANNER"

    .line 1362
    .line 1363
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result p2

    .line 1367
    if-eqz p2, :cond_30

    .line 1368
    .line 1369
    sget-object p2, Lmz1;->ia:Liz1;

    .line 1370
    .line 1371
    sget-object v0, Ltw1;->e:Ltw1;

    .line 1372
    .line 1373
    iget-object v1, v0, Ltw1;->c:Lkz1;

    .line 1374
    .line 1375
    invoke-virtual {v1, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v1

    .line 1379
    check-cast v1, Ljava/lang/Boolean;

    .line 1380
    .line 1381
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1382
    .line 1383
    .line 1384
    move-result v1

    .line 1385
    if-eqz v1, :cond_2e

    .line 1386
    .line 1387
    if-eqz v5, :cond_2e

    .line 1388
    .line 1389
    new-instance v1, Ly2;

    .line 1390
    .line 1391
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v4

    .line 1395
    invoke-direct {v1, v4}, Lr9;-><init>(Landroid/content/Context;)V

    .line 1396
    .line 1397
    .line 1398
    const-string v8, "Context cannot be null"

    .line 1399
    .line 1400
    invoke-static {v4, v8}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_19

    .line 1404
    :catchall_1
    move-exception v0

    .line 1405
    move-object p1, v0

    .line 1406
    goto/16 :goto_1c

    .line 1407
    .line 1408
    :cond_2e
    new-instance v1, Le3;

    .line 1409
    .line 1410
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v4

    .line 1414
    invoke-direct {v1, v4}, Le3;-><init>(Landroid/content/Context;)V

    .line 1415
    .line 1416
    .line 1417
    :goto_19
    invoke-virtual {v1, p1}, Lr9;->setAdSize(Ld3;)V

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v1, v2}, Lr9;->setAdUnitId(Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    new-instance p1, Lcx2;

    .line 1424
    .line 1425
    invoke-direct {p1, v7, v2, v1}, Lcx2;-><init>(Lex2;Ljava/lang/String;Lr9;)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v1, p1}, Lr9;->setAdListener(Lt2;)V

    .line 1429
    .line 1430
    .line 1431
    iget-object p1, v0, Ltw1;->c:Lkz1;

    .line 1432
    .line 1433
    invoke-virtual {p1, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object p1

    .line 1437
    check-cast p1, Ljava/lang/Boolean;

    .line 1438
    .line 1439
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1440
    .line 1441
    .line 1442
    move-result p1

    .line 1443
    if-eqz p1, :cond_2f

    .line 1444
    .line 1445
    if-eqz v5, :cond_2f

    .line 1446
    .line 1447
    if-eqz v6, :cond_2f

    .line 1448
    .line 1449
    move-object p1, v1

    .line 1450
    check-cast p1, Ly2;

    .line 1451
    .line 1452
    invoke-virtual {p1, v6}, Ly2;->setVideoOptions(Ll51;)V

    .line 1453
    .line 1454
    .line 1455
    :cond_2f
    invoke-virtual {v1, v3}, Lr9;->b(Lb3;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 1456
    .line 1457
    .line 1458
    monitor-exit v7

    .line 1459
    goto/16 :goto_25

    .line 1460
    .line 1461
    :sswitch_1
    :try_start_b
    const-string p1, "REWARDED_INTERSTITIAL"

    .line 1462
    .line 1463
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1464
    .line 1465
    .line 1466
    move-result p1

    .line 1467
    if-eqz p1, :cond_30

    .line 1468
    .line 1469
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1470
    .line 1471
    .line 1472
    move-result-object p1

    .line 1473
    new-instance p2, Lbx2;

    .line 1474
    .line 1475
    const/4 v0, 0x2

    .line 1476
    invoke-direct {p2, v7, v2, v0}, Lbx2;-><init>(Lex2;Ljava/lang/String;I)V

    .line 1477
    .line 1478
    .line 1479
    invoke-static {p1, v2, v3, p2}, Lpb2;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lbx2;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 1480
    .line 1481
    .line 1482
    monitor-exit v7

    .line 1483
    goto/16 :goto_25

    .line 1484
    .line 1485
    :sswitch_2
    :try_start_c
    const-string p1, "REWARDED"

    .line 1486
    .line 1487
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result p1

    .line 1491
    if-eqz p1, :cond_30

    .line 1492
    .line 1493
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1494
    .line 1495
    .line 1496
    move-result-object p1

    .line 1497
    new-instance p2, Lbx2;

    .line 1498
    .line 1499
    const/4 v0, 0x1

    .line 1500
    invoke-direct {p2, v7, v2, v0}, Lbx2;-><init>(Lex2;Ljava/lang/String;I)V

    .line 1501
    .line 1502
    .line 1503
    invoke-static {p1, v2, v3, p2}, Lhb2;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lbx2;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 1504
    .line 1505
    .line 1506
    monitor-exit v7

    .line 1507
    goto/16 :goto_25

    .line 1508
    .line 1509
    :sswitch_3
    :try_start_d
    const-string p1, "APP_OPEN_AD"

    .line 1510
    .line 1511
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    move-result p1

    .line 1515
    if-eqz p1, :cond_30

    .line 1516
    .line 1517
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1518
    .line 1519
    .line 1520
    move-result-object p1

    .line 1521
    new-instance p2, Lbx2;

    .line 1522
    .line 1523
    const/4 v0, 0x0

    .line 1524
    invoke-direct {p2, v7, v2, v0}, Lbx2;-><init>(Lex2;Ljava/lang/String;I)V

    .line 1525
    .line 1526
    .line 1527
    invoke-static {p1, v2, v3, p2}, Lhw1;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lbx2;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 1528
    .line 1529
    .line 1530
    monitor-exit v7

    .line 1531
    goto/16 :goto_25

    .line 1532
    .line 1533
    :sswitch_4
    :try_start_e
    const-string p1, "INTERSTITIAL"

    .line 1534
    .line 1535
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result p1

    .line 1539
    if-eqz p1, :cond_30

    .line 1540
    .line 1541
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1542
    .line 1543
    .line 1544
    move-result-object p1

    .line 1545
    new-instance p2, Ldx2;

    .line 1546
    .line 1547
    invoke-direct {p2, v7, v2}, Ldx2;-><init>(Lex2;Ljava/lang/String;)V

    .line 1548
    .line 1549
    .line 1550
    invoke-static {p1, v2, v3, p2}, Lg30;->a(Landroid/content/Context;Ljava/lang/String;Lb3;Lh30;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 1551
    .line 1552
    .line 1553
    :cond_30
    :goto_1a
    monitor-exit v7

    .line 1554
    goto/16 :goto_25

    .line 1555
    .line 1556
    :sswitch_5
    :try_start_f
    const-string p1, "NATIVE"

    .line 1557
    .line 1558
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1559
    .line 1560
    .line 1561
    move-result p1

    .line 1562
    if-eqz p1, :cond_30

    .line 1563
    .line 1564
    new-instance p1, Lu2;

    .line 1565
    .line 1566
    invoke-virtual {v7}, Lex2;->E3()Landroid/content/Context;

    .line 1567
    .line 1568
    .line 1569
    move-result-object p2

    .line 1570
    invoke-direct {p1, p2, v2}, Lu2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 1571
    .line 1572
    .line 1573
    new-instance p2, Lwt2;

    .line 1574
    .line 1575
    const/4 v1, 0x1

    .line 1576
    invoke-direct {p2, v7, v2, v1}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 1577
    .line 1578
    .line 1579
    :try_start_10
    iget-object v1, p1, Lu2;->b:Lx72;

    .line 1580
    .line 1581
    new-instance v2, Lj32;

    .line 1582
    .line 1583
    const/4 v4, 0x1

    .line 1584
    invoke-direct {v2, v4, p2}, Lj32;-><init>(ILjava/lang/Object;)V

    .line 1585
    .line 1586
    .line 1587
    invoke-interface {v1, v2}, Lx72;->q1(Lz22;)V
    :try_end_10
    .catch Landroid/os/RemoteException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 1588
    .line 1589
    .line 1590
    goto :goto_1b

    .line 1591
    :catch_8
    const/4 p2, 0x5

    .line 1592
    :try_start_11
    invoke-static {p2}, Lgi2;->q0(I)Z

    .line 1593
    .line 1594
    .line 1595
    :goto_1b
    new-instance p2, Lq00;

    .line 1596
    .line 1597
    invoke-direct {p2, v7}, Lq00;-><init>(Lex2;)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {p1, p2}, Lu2;->b(Lt2;)V

    .line 1601
    .line 1602
    .line 1603
    sget-object p2, Lmz1;->ia:Liz1;

    .line 1604
    .line 1605
    sget-object v1, Ltw1;->e:Ltw1;

    .line 1606
    .line 1607
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 1608
    .line 1609
    invoke-virtual {v1, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1610
    .line 1611
    .line 1612
    move-result-object p2

    .line 1613
    check-cast p2, Ljava/lang/Boolean;

    .line 1614
    .line 1615
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1616
    .line 1617
    .line 1618
    move-result p2

    .line 1619
    if-eqz p2, :cond_31

    .line 1620
    .line 1621
    if-eqz v0, :cond_31

    .line 1622
    .line 1623
    invoke-virtual {p1, v0}, Lu2;->c(Ljg0;)V

    .line 1624
    .line 1625
    .line 1626
    :cond_31
    invoke-virtual {p1}, Lu2;->a()Lv2;

    .line 1627
    .line 1628
    .line 1629
    move-result-object p1

    .line 1630
    invoke-virtual {p1, v3}, Lv2;->a(Lb3;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 1631
    .line 1632
    .line 1633
    monitor-exit v7

    .line 1634
    goto/16 :goto_25

    .line 1635
    .line 1636
    :goto_1c
    :try_start_12
    monitor-exit v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 1637
    throw p1

    .line 1638
    :cond_32
    :goto_1d
    const-string p1, "show"

    .line 1639
    .line 1640
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1641
    .line 1642
    .line 1643
    move-result p1

    .line 1644
    if-eqz p1, :cond_40

    .line 1645
    .line 1646
    iget-object p1, p0, Lk32;->g:Ljava/lang/Object;

    .line 1647
    .line 1648
    check-cast p1, Lex2;

    .line 1649
    .line 1650
    monitor-enter p1

    .line 1651
    :try_start_13
    iget-object p2, p1, Lex2;->i:Lax2;

    .line 1652
    .line 1653
    iget-object v0, p2, Lax2;->i:Lag2;

    .line 1654
    .line 1655
    if-eqz v0, :cond_34

    .line 1656
    .line 1657
    invoke-interface {v0}, Lag2;->o0()Z

    .line 1658
    .line 1659
    .line 1660
    move-result v0

    .line 1661
    if-eqz v0, :cond_33

    .line 1662
    .line 1663
    goto :goto_1e

    .line 1664
    :cond_33
    iget-object p2, p2, Lax2;->i:Lag2;

    .line 1665
    .line 1666
    invoke-interface {p2}, Lag2;->g()Landroid/app/Activity;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v4

    .line 1670
    :cond_34
    :goto_1e
    if-nez v4, :cond_35

    .line 1671
    .line 1672
    goto/16 :goto_23

    .line 1673
    .line 1674
    :cond_35
    iget-object p2, p1, Lex2;->f:Ljava/util/HashMap;

    .line 1675
    .line 1676
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    if-eqz v0, :cond_3f

    .line 1681
    .line 1682
    sget-object v1, Lmz1;->ha:Liz1;

    .line 1683
    .line 1684
    sget-object v3, Ltw1;->e:Ltw1;

    .line 1685
    .line 1686
    iget-object v5, v3, Ltw1;->c:Lkz1;

    .line 1687
    .line 1688
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v5

    .line 1692
    check-cast v5, Ljava/lang/Boolean;

    .line 1693
    .line 1694
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1695
    .line 1696
    .line 1697
    move-result v5

    .line 1698
    if-eqz v5, :cond_36

    .line 1699
    .line 1700
    instance-of v5, v0, Lhw1;

    .line 1701
    .line 1702
    if-nez v5, :cond_36

    .line 1703
    .line 1704
    instance-of v5, v0, Lg30;

    .line 1705
    .line 1706
    if-nez v5, :cond_36

    .line 1707
    .line 1708
    instance-of v5, v0, Lhb2;

    .line 1709
    .line 1710
    if-nez v5, :cond_36

    .line 1711
    .line 1712
    instance-of v5, v0, Lpb2;

    .line 1713
    .line 1714
    if-eqz v5, :cond_37

    .line 1715
    .line 1716
    goto :goto_1f

    .line 1717
    :catchall_2
    move-exception v0

    .line 1718
    move-object p2, v0

    .line 1719
    goto/16 :goto_24

    .line 1720
    .line 1721
    :cond_36
    :goto_1f
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    :cond_37
    invoke-static {v0}, Lex2;->F3(Ljava/lang/Object;)Ljava/lang/String;

    .line 1725
    .line 1726
    .line 1727
    move-result-object p2

    .line 1728
    invoke-virtual {p1, p2}, Lex2;->D3(Ljava/lang/String;)V

    .line 1729
    .line 1730
    .line 1731
    instance-of p2, v0, Lhw1;

    .line 1732
    .line 1733
    if-eqz p2, :cond_38

    .line 1734
    .line 1735
    check-cast v0, Lhw1;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 1736
    .line 1737
    :try_start_14
    iget-object p2, v0, Lhw1;->a:Lkw1;

    .line 1738
    .line 1739
    new-instance v1, Loi0;

    .line 1740
    .line 1741
    invoke-direct {v1, v4}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 1742
    .line 1743
    .line 1744
    iget-object v0, v0, Lhw1;->b:Liw1;

    .line 1745
    .line 1746
    invoke-interface {p2, v1, v0}, Lkw1;->H1(Lu10;Lpw1;)V
    :try_end_14
    .catch Landroid/os/RemoteException; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 1747
    .line 1748
    .line 1749
    goto :goto_20

    .line 1750
    :catch_9
    move-exception v0

    .line 1751
    move-object p2, v0

    .line 1752
    :try_start_15
    const-string v0, "#007 Could not call remote method."

    .line 1753
    .line 1754
    invoke-static {v0, p2}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 1755
    .line 1756
    .line 1757
    :goto_20
    monitor-exit p1

    .line 1758
    goto/16 :goto_25

    .line 1759
    .line 1760
    :cond_38
    :try_start_16
    instance-of p2, v0, Lg30;

    .line 1761
    .line 1762
    if-eqz p2, :cond_39

    .line 1763
    .line 1764
    check-cast v0, Lg30;

    .line 1765
    .line 1766
    invoke-virtual {v0, v4}, Lg30;->c(Landroid/app/Activity;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 1767
    .line 1768
    .line 1769
    monitor-exit p1

    .line 1770
    goto/16 :goto_25

    .line 1771
    .line 1772
    :cond_39
    :try_start_17
    instance-of p2, v0, Lhb2;

    .line 1773
    .line 1774
    if-eqz p2, :cond_3b

    .line 1775
    .line 1776
    check-cast v0, Lhb2;

    .line 1777
    .line 1778
    iget-object p2, v0, Lhb2;->c:Lob2;

    .line 1779
    .line 1780
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 1781
    .line 1782
    .line 1783
    :try_start_18
    iget-object v0, v0, Lhb2;->a:Lya2;

    .line 1784
    .line 1785
    if-eqz v0, :cond_3a

    .line 1786
    .line 1787
    invoke-interface {v0, p2}, Lya2;->c1(Lbb2;)V

    .line 1788
    .line 1789
    .line 1790
    new-instance p2, Loi0;

    .line 1791
    .line 1792
    invoke-direct {p2, v4}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 1793
    .line 1794
    .line 1795
    invoke-interface {v0, p2}, Lya2;->w2(Lu10;)V
    :try_end_18
    .catch Landroid/os/RemoteException; {:try_start_18 .. :try_end_18} :catch_a
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 1796
    .line 1797
    .line 1798
    goto :goto_21

    .line 1799
    :catch_a
    move-exception v0

    .line 1800
    move-object p2, v0

    .line 1801
    :try_start_19
    const-string v0, "#007 Could not call remote method."

    .line 1802
    .line 1803
    invoke-static {v0, p2}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 1804
    .line 1805
    .line 1806
    :cond_3a
    :goto_21
    monitor-exit p1

    .line 1807
    goto :goto_25

    .line 1808
    :cond_3b
    :try_start_1a
    instance-of p2, v0, Lpb2;

    .line 1809
    .line 1810
    if-eqz p2, :cond_3d

    .line 1811
    .line 1812
    check-cast v0, Lpb2;

    .line 1813
    .line 1814
    iget-object p2, v0, Lpb2;->c:Lob2;

    .line 1815
    .line 1816
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 1817
    .line 1818
    .line 1819
    :try_start_1b
    iget-object v0, v0, Lpb2;->a:Lya2;

    .line 1820
    .line 1821
    if-eqz v0, :cond_3c

    .line 1822
    .line 1823
    invoke-interface {v0, p2}, Lya2;->c1(Lbb2;)V

    .line 1824
    .line 1825
    .line 1826
    new-instance p2, Loi0;

    .line 1827
    .line 1828
    invoke-direct {p2, v4}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 1829
    .line 1830
    .line 1831
    invoke-interface {v0, p2}, Lya2;->w2(Lu10;)V
    :try_end_1b
    .catch Landroid/os/RemoteException; {:try_start_1b .. :try_end_1b} :catch_b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    .line 1832
    .line 1833
    .line 1834
    goto :goto_22

    .line 1835
    :catch_b
    move-exception v0

    .line 1836
    move-object p2, v0

    .line 1837
    :try_start_1c
    const-string v0, "#007 Could not call remote method."

    .line 1838
    .line 1839
    invoke-static {v0, p2}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    .line 1840
    .line 1841
    .line 1842
    :cond_3c
    :goto_22
    monitor-exit p1

    .line 1843
    goto :goto_25

    .line 1844
    :cond_3d
    :try_start_1d
    iget-object p2, v3, Ltw1;->c:Lkz1;

    .line 1845
    .line 1846
    invoke-virtual {p2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1847
    .line 1848
    .line 1849
    move-result-object p2

    .line 1850
    check-cast p2, Ljava/lang/Boolean;

    .line 1851
    .line 1852
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1853
    .line 1854
    .line 1855
    move-result p2

    .line 1856
    if-eqz p2, :cond_3f

    .line 1857
    .line 1858
    instance-of p2, v0, Le3;

    .line 1859
    .line 1860
    if-nez p2, :cond_3e

    .line 1861
    .line 1862
    instance-of p2, v0, Lcom/google/android/gms/ads/nativead/NativeAd;

    .line 1863
    .line 1864
    if-eqz p2, :cond_3f

    .line 1865
    .line 1866
    :cond_3e
    new-instance p2, Landroid/content/Intent;

    .line 1867
    .line 1868
    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual {p1}, Lex2;->E3()Landroid/content/Context;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    const-string v1, "com.google.android.gms.ads.OutOfContextTestingActivity"

    .line 1876
    .line 1877
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1878
    .line 1879
    .line 1880
    const-string v1, "adUnit"

    .line 1881
    .line 1882
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1883
    .line 1884
    .line 1885
    sget-object v1, Lhg4;->C:Lhg4;

    .line 1886
    .line 1887
    iget-object v1, v1, Lhg4;->c:Llf4;

    .line 1888
    .line 1889
    invoke-static {v0, p2}, Llf4;->s(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    .line 1890
    .line 1891
    .line 1892
    monitor-exit p1

    .line 1893
    goto :goto_25

    .line 1894
    :cond_3f
    :goto_23
    monitor-exit p1

    .line 1895
    goto :goto_25

    .line 1896
    :goto_24
    :try_start_1e
    monitor-exit p1
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    .line 1897
    throw p2

    .line 1898
    :cond_40
    :goto_25
    return-void

    .line 1899
    :pswitch_5
    const-string p1, "event_type"

    .line 1900
    .line 1901
    const-string v0, "id"

    .line 1902
    .line 1903
    if-eqz p2, :cond_42

    .line 1904
    .line 1905
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1906
    .line 1907
    .line 1908
    move-result v1

    .line 1909
    if-eqz v1, :cond_42

    .line 1910
    .line 1911
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v1

    .line 1915
    check-cast v1, Ljava/lang/CharSequence;

    .line 1916
    .line 1917
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1918
    .line 1919
    .line 1920
    move-result v1

    .line 1921
    if-nez v1, :cond_42

    .line 1922
    .line 1923
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1924
    .line 1925
    .line 1926
    move-result v1

    .line 1927
    if-eqz v1, :cond_42

    .line 1928
    .line 1929
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v1

    .line 1933
    check-cast v1, Ljava/lang/CharSequence;

    .line 1934
    .line 1935
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v1

    .line 1939
    if-eqz v1, :cond_41

    .line 1940
    .line 1941
    goto :goto_26

    .line 1942
    :cond_41
    :try_start_1f
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v0

    .line 1946
    check-cast v0, Ljava/lang/String;

    .line 1947
    .line 1948
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1949
    .line 1950
    .line 1951
    move-result-wide v3

    .line 1952
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1953
    .line 1954
    .line 1955
    move-result-object p1

    .line 1956
    check-cast p1, Ljava/lang/String;

    .line 1957
    .line 1958
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1959
    .line 1960
    .line 1961
    move-result v2

    .line 1962
    sget-object p1, Lhg4;->C:Lhg4;

    .line 1963
    .line 1964
    iget-object p1, p1, Lhg4;->k:Lym;

    .line 1965
    .line 1966
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1967
    .line 1968
    .line 1969
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1970
    .line 1971
    .line 1972
    move-result-wide v5

    .line 1973
    iget-object p1, p0, Lk32;->g:Ljava/lang/Object;

    .line 1974
    .line 1975
    move-object v1, p1

    .line 1976
    check-cast v1, Lxv2;

    .line 1977
    .line 1978
    invoke-virtual/range {v1 .. v6}, Lxv2;->a(IJJ)V
    :try_end_1f
    .catch Ljava/lang/NumberFormatException; {:try_start_1f .. :try_end_1f} :catch_c

    .line 1979
    .line 1980
    .line 1981
    goto :goto_27

    .line 1982
    :catch_c
    invoke-static {}, Lgi2;->R()Z

    .line 1983
    .line 1984
    .line 1985
    goto :goto_27

    .line 1986
    :cond_42
    :goto_26
    const-string p1, "Ignoring onDeviceStorageEvent GMSG: missing required parameters."

    .line 1987
    .line 1988
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 1989
    .line 1990
    .line 1991
    :goto_27
    return-void

    .line 1992
    :pswitch_6
    const-string v0, "transparentBackground"

    .line 1993
    .line 1994
    check-cast p1, Lag2;

    .line 1995
    .line 1996
    const-string v1, "1"

    .line 1997
    .line 1998
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2003
    .line 2004
    .line 2005
    move-result v1

    .line 2006
    const-string v0, "blur"

    .line 2007
    .line 2008
    const-string v2, "1"

    .line 2009
    .line 2010
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v0

    .line 2014
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2015
    .line 2016
    .line 2017
    move-result v2

    .line 2018
    const/4 v3, 0x0

    .line 2019
    :try_start_20
    const-string v0, "blurRadius"

    .line 2020
    .line 2021
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v0

    .line 2025
    if-eqz v0, :cond_43

    .line 2026
    .line 2027
    const-string v0, "blurRadius"

    .line 2028
    .line 2029
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2030
    .line 2031
    .line 2032
    move-result-object p2

    .line 2033
    check-cast p2, Ljava/lang/String;

    .line 2034
    .line 2035
    invoke-static {p2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 2036
    .line 2037
    .line 2038
    move-result v3
    :try_end_20
    .catch Ljava/lang/NumberFormatException; {:try_start_20 .. :try_end_20} :catch_d

    .line 2039
    goto :goto_28

    .line 2040
    :catch_d
    move-exception v0

    .line 2041
    move-object p2, v0

    .line 2042
    const-string v0, "Fail to parse float"

    .line 2043
    .line 2044
    invoke-static {v0, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2045
    .line 2046
    .line 2047
    :cond_43
    :goto_28
    iget-object p2, p0, Lk32;->g:Ljava/lang/Object;

    .line 2048
    .line 2049
    move-object v4, p2

    .line 2050
    check-cast v4, Le42;

    .line 2051
    .line 2052
    monitor-enter v4

    .line 2053
    :try_start_21
    iput-boolean v1, v4, Le42;->a:Z

    .line 2054
    .line 2055
    iget-object p2, v4, Le42;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2056
    .line 2057
    const/4 v0, 0x1

    .line 2058
    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_4

    .line 2059
    .line 2060
    .line 2061
    monitor-exit v4

    .line 2062
    monitor-enter v4

    .line 2063
    :try_start_22
    iput-boolean v2, v4, Le42;->b:Z

    .line 2064
    .line 2065
    iput v3, v4, Le42;->c:F
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_3

    .line 2066
    .line 2067
    monitor-exit v4

    .line 2068
    invoke-interface {p1, v1}, Lag2;->N0(Z)V

    .line 2069
    .line 2070
    .line 2071
    return-void

    .line 2072
    :catchall_3
    move-exception v0

    .line 2073
    move-object p1, v0

    .line 2074
    :try_start_23
    monitor-exit v4
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_3

    .line 2075
    throw p1

    .line 2076
    :catchall_4
    move-exception v0

    .line 2077
    move-object p1, v0

    .line 2078
    :try_start_24
    monitor-exit v4
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_4

    .line 2079
    throw p1

    .line 2080
    :pswitch_7
    const-string p1, "name"

    .line 2081
    .line 2082
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2083
    .line 2084
    .line 2085
    move-result-object p1

    .line 2086
    check-cast p1, Ljava/lang/String;

    .line 2087
    .line 2088
    if-nez p1, :cond_44

    .line 2089
    .line 2090
    const-string p1, "App event with no name parameter."

    .line 2091
    .line 2092
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 2093
    .line 2094
    .line 2095
    goto :goto_29

    .line 2096
    :cond_44
    iget-object v0, p0, Lk32;->g:Ljava/lang/Object;

    .line 2097
    .line 2098
    check-cast v0, Lm32;

    .line 2099
    .line 2100
    const-string v1, "info"

    .line 2101
    .line 2102
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object p2

    .line 2106
    check-cast p2, Ljava/lang/String;

    .line 2107
    .line 2108
    invoke-interface {v0, p1, p2}, Lm32;->n0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2109
    .line 2110
    .line 2111
    :goto_29
    return-void

    .line 2112
    :pswitch_8
    const-string p1, "info"

    .line 2113
    .line 2114
    iget-object v0, p0, Lk32;->g:Ljava/lang/Object;

    .line 2115
    .line 2116
    move-object v1, v0

    .line 2117
    check-cast v1, Ll32;

    .line 2118
    .line 2119
    if-nez v1, :cond_45

    .line 2120
    .line 2121
    goto :goto_2b

    .line 2122
    :cond_45
    const-string v0, "name"

    .line 2123
    .line 2124
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v0

    .line 2128
    check-cast v0, Ljava/lang/String;

    .line 2129
    .line 2130
    if-nez v0, :cond_46

    .line 2131
    .line 2132
    const-string v0, "Ad metadata with no name parameter."

    .line 2133
    .line 2134
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 2135
    .line 2136
    .line 2137
    const-string v0, ""

    .line 2138
    .line 2139
    :cond_46
    move-object v2, v0

    .line 2140
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2141
    .line 2142
    .line 2143
    move-result v0

    .line 2144
    const/4 v3, 0x0

    .line 2145
    if-eqz v0, :cond_47

    .line 2146
    .line 2147
    :try_start_25
    new-instance v0, Lorg/json/JSONObject;

    .line 2148
    .line 2149
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2150
    .line 2151
    .line 2152
    move-result-object p1

    .line 2153
    check-cast p1, Ljava/lang/String;

    .line 2154
    .line 2155
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2156
    .line 2157
    .line 2158
    invoke-static {v0}, Lbd2;->X(Lorg/json/JSONObject;)Landroid/os/Bundle;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v3
    :try_end_25
    .catch Lorg/json/JSONException; {:try_start_25 .. :try_end_25} :catch_e

    .line 2162
    goto :goto_2a

    .line 2163
    :catch_e
    move-exception v0

    .line 2164
    move-object p1, v0

    .line 2165
    const-string p2, "Failed to convert ad metadata to JSON."

    .line 2166
    .line 2167
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2168
    .line 2169
    .line 2170
    :cond_47
    :goto_2a
    if-nez v3, :cond_48

    .line 2171
    .line 2172
    const-string p1, "Failed to convert ad metadata to Bundle."

    .line 2173
    .line 2174
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 2175
    .line 2176
    .line 2177
    goto :goto_2b

    .line 2178
    :cond_48
    invoke-interface {v1, v3, v2}, Ll32;->h(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 2179
    .line 2180
    .line 2181
    :goto_2b
    return-void

    .line 2182
    nop

    .line 2183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    :sswitch_data_0
    .sparse-switch
        -0x772abbe9 -> :sswitch_5
        -0x51d5b0d4 -> :sswitch_4
        -0x1987ba06 -> :sswitch_3
        0x205e3c0e -> :sswitch_2
        0x6e8e03bd -> :sswitch_1
        0x7458732c -> :sswitch_0
    .end sparse-switch
.end method
