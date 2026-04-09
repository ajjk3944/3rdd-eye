.class public final Ljq3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/16 p3, 0x10

    iput p3, p0, Ljq3;->f:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq3;->h:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Ljq3;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ljq3;->f:I

    iput-object p1, p0, Ljq3;->g:Ljava/lang/Object;

    iput-object p2, p0, Ljq3;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Ljq3;->f:I

    iput-object p1, p0, Ljq3;->h:Ljava/lang/Object;

    iput-object p2, p0, Ljq3;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ltn;Ljava/util/ArrayList;Llx0;)V
    .locals 0

    const/16 p1, 0x9

    iput p1, p0, Ljq3;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljq3;->g:Ljava/lang/Object;

    iput-object p3, p0, Ljq3;->h:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 11

    .line 1
    iget-object v0, p0, Ljq3;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyv1;

    .line 4
    .line 5
    iget-object v1, p0, Ljq3;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :try_start_0
    new-instance v2, Luv1;

    .line 13
    .line 14
    iget v3, v0, Lyv1;->k:I

    .line 15
    .line 16
    iget v4, v0, Lyv1;->l:I

    .line 17
    .line 18
    iget v5, v0, Lyv1;->m:I

    .line 19
    .line 20
    iget v6, v0, Lyv1;->n:I

    .line 21
    .line 22
    iget v7, v0, Lyv1;->o:I

    .line 23
    .line 24
    iget v8, v0, Lyv1;->p:I

    .line 25
    .line 26
    iget v9, v0, Lyv1;->q:I

    .line 27
    .line 28
    iget-boolean v10, v0, Lyv1;->t:Z

    .line 29
    .line 30
    invoke-direct/range {v2 .. v10}, Luv1;-><init>(IIIIIIIZ)V

    .line 31
    .line 32
    .line 33
    sget-object v3, Lhg4;->C:Lhg4;

    .line 34
    .line 35
    iget-object v3, v3, Lhg4;->g:Lwy0;

    .line 36
    .line 37
    iget-object v4, v3, Lwy0;->g:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :try_start_1
    iget-object v3, v3, Lwy0;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lvv1;

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    iget-object v3, v3, Lvv1;->g:Landroid/app/Application;

    .line 47
    .line 48
    monitor-exit v4

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    const/4 v3, 0x0

    .line 55
    :goto_0
    if-eqz v3, :cond_1

    .line 56
    .line 57
    :try_start_2
    iget-object v4, v0, Lyv1;->r:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget-object v6, Lmz1;->h0:Liz1;

    .line 70
    .line 71
    sget-object v7, Ltw1;->e:Ltw1;

    .line 72
    .line 73
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 74
    .line 75
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Ljava/lang/String;

    .line 80
    .line 81
    const-string v7, "id"

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v5, v6, v7, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v3, :cond_1

    .line 98
    .line 99
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catch_0
    move-exception v0

    .line 107
    goto :goto_6

    .line 108
    :cond_1
    :goto_1
    invoke-virtual {v0, v1, v2}, Lyv1;->a(Landroid/view/View;Luv1;)Ltg0;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v2}, Luv1;->b()V

    .line 113
    .line 114
    .line 115
    iget v3, v1, Ltg0;->a:I

    .line 116
    .line 117
    if-nez v3, :cond_2

    .line 118
    .line 119
    iget v3, v1, Ltg0;->b:I

    .line 120
    .line 121
    if-eqz v3, :cond_3

    .line 122
    .line 123
    :cond_2
    iget v1, v1, Ltg0;->b:I

    .line 124
    .line 125
    if-nez v1, :cond_4

    .line 126
    .line 127
    iget v1, v2, Luv1;->k:I

    .line 128
    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    return-void

    .line 133
    :cond_4
    if-nez v1, :cond_6

    .line 134
    .line 135
    :goto_2
    iget-object v1, v0, Lyv1;->i:Lso1;

    .line 136
    .line 137
    iget-object v3, v1, Lso1;->g:Ljava/lang/Object;

    .line 138
    .line 139
    monitor-enter v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 140
    :try_start_3
    iget-object v1, v1, Lso1;->h:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/util/LinkedList;

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_5

    .line 149
    .line 150
    monitor-exit v3

    .line 151
    return-void

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    monitor-exit v3

    .line 155
    goto :goto_4

    .line 156
    :goto_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    :try_start_4
    throw v0

    .line 158
    :cond_6
    :goto_4
    iget-object v0, v0, Lyv1;->i:Lso1;

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Lso1;->v(Luv1;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :goto_5
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 165
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 166
    :goto_6
    const-string v1, "Exception in fetchContentOnUIThread"

    .line 167
    .line 168
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    const-string v1, "ContentFetchTask.fetchContent"

    .line 172
    .line 173
    sget-object v2, Lhg4;->C:Lhg4;

    .line 174
    .line 175
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 176
    .line 177
    invoke-virtual {v2, v1, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method private final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Ljq3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq32;

    .line 4
    .line 5
    iget-object v1, p0, Ljq3;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ll22;

    .line 8
    .line 9
    iget-object v2, v0, Lq32;->f:Llu1;

    .line 10
    .line 11
    iget-object v0, v0, Lq32;->h:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {v2}, Llu1;->a()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    new-instance v3, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 33
    .line 34
    .line 35
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 36
    .line 37
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v5, "params"

    .line 41
    .line 42
    iget-object v6, v1, Ll22;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    const-string v5, "signal_dictionary"

    .line 48
    .line 49
    sget-object v6, Lsv1;->f:Lsv1;

    .line 50
    .line 51
    iget-object v6, v6, Lsv1;->a:Lj63;

    .line 52
    .line 53
    iget-object v7, v1, Ll22;->f:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-virtual {v6, v7}, Lj63;->j(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v5, "sr"

    .line 63
    .line 64
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    iget-object v1, v1, Ll22;->c:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    const-string v1, ""

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catch_0
    move-exception v1

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    if-nez v1, :cond_2

    .line 81
    .line 82
    const-string v1, ""

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const-string v4, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2"

    .line 86
    .line 87
    invoke-static {v1, v4}, Llf4;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :goto_0
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 92
    .line 93
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/16 v4, 0xa

    .line 98
    .line 99
    invoke-static {v1, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v4, "rs"

    .line 104
    .line 105
    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    const-string v1, "ts_ms"

    .line 109
    .line 110
    sget-object v4, Lhg4;->C:Lhg4;

    .line 111
    .line 112
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    invoke-virtual {v3, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :goto_1
    const-string v4, "DiskCachingManager.createStringToWrite"

    .line 126
    .line 127
    sget-object v5, Lhg4;->C:Lhg4;

    .line 128
    .line 129
    iget-object v5, v5, Lhg4;->h:Lgd2;

    .line 130
    .line 131
    invoke-virtual {v5, v4, v1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :goto_2
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    :goto_3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-nez v3, :cond_3

    .line 143
    .line 144
    iget-object v2, v2, Llu1;->b:Lnn2;

    .line 145
    .line 146
    invoke-virtual {v2}, Lnn2;->e()V

    .line 147
    .line 148
    .line 149
    iget-object v3, v2, Lnn2;->d:Ljava/lang/Object;

    .line 150
    .line 151
    monitor-enter v3

    .line 152
    :try_start_1
    iget-object v2, v2, Lnn2;->b:Landroid/content/SharedPreferences$Editor;

    .line 153
    .line 154
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 159
    .line 160
    .line 161
    monitor-exit v3

    .line 162
    goto :goto_4

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    throw v0

    .line 166
    :cond_3
    :goto_4
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ljq3;->f:I

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    const/16 v4, 0x10

    .line 8
    .line 9
    const/16 v5, 0xe

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x1

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v15, v0

    .line 22
    check-cast v15, Lb62;

    .line 23
    .line 24
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v12, v0

    .line 27
    check-cast v12, Lmm2;

    .line 28
    .line 29
    const-string v2, "SdkJavascriptFactory.loadJavascriptEngine"

    .line 30
    .line 31
    sget-object v0, Lhg4;->C:Lhg4;

    .line 32
    .line 33
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v16

    .line 42
    new-instance v13, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    :try_start_0
    const-string v0, "loadJavascriptEngine > Before createJavascriptEngine"

    .line 48
    .line 49
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v12, Lmm2;->a:Landroid/content/Context;

    .line 53
    .line 54
    iget-object v3, v12, Lmm2;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Le51;

    .line 57
    .line 58
    new-instance v14, Lq52;

    .line 59
    .line 60
    invoke-direct {v14, v0, v3}, Lq52;-><init>(Landroid/content/Context;Le51;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "loadJavascriptEngine > After createJavascriptEngine"

    .line 64
    .line 65
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    const-string v0, "loadJavascriptEngine > Before setting new engine loaded listener"

    .line 69
    .line 70
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v11, Lw52;

    .line 74
    .line 75
    move-wide/from16 v40, v16

    .line 76
    .line 77
    move-object/from16 v17, v14

    .line 78
    .line 79
    move-object/from16 v16, v15

    .line 80
    .line 81
    move-wide/from16 v14, v40

    .line 82
    .line 83
    invoke-direct/range {v11 .. v17}, Lw52;-><init>(Lmm2;Ljava/util/ArrayList;JLb62;Lq52;)V

    .line 84
    .line 85
    .line 86
    move-object v0, v13

    .line 87
    move-object/from16 v15, v16

    .line 88
    .line 89
    move-object/from16 v14, v17

    .line 90
    .line 91
    move-wide/from16 v16, v40

    .line 92
    .line 93
    iget-object v2, v14, Lq52;->f:Lag2;

    .line 94
    .line 95
    invoke-interface {v2}, Lag2;->e0()Lsg2;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v3, Lf20;

    .line 100
    .line 101
    invoke-direct {v3, v5, v11}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iput-object v3, v2, Lsg2;->m:Lvg2;

    .line 105
    .line 106
    const-string v2, "loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded"

    .line 107
    .line 108
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v11, Ls52;

    .line 112
    .line 113
    move-object/from16 v16, v14

    .line 114
    .line 115
    move-wide/from16 v13, v40

    .line 116
    .line 117
    invoke-direct/range {v11 .. v16}, Ls52;-><init>(Lmm2;JLb62;Lq52;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v14, v16

    .line 121
    .line 122
    move-wide/from16 v16, v40

    .line 123
    .line 124
    const-string v2, "/jsLoaded"

    .line 125
    .line 126
    invoke-virtual {v14, v2, v11}, Lq52;->p(Ljava/lang/String;Ly32;)V

    .line 127
    .line 128
    .line 129
    new-instance v2, Lf20;

    .line 130
    .line 131
    invoke-direct {v2, v4, v10}, Lf20;-><init>(IZ)V

    .line 132
    .line 133
    .line 134
    new-instance v3, Lt52;

    .line 135
    .line 136
    invoke-direct {v3, v12, v14, v2}, Lt52;-><init>(Lmm2;Lq52;Lf20;)V

    .line 137
    .line 138
    .line 139
    iput-object v3, v2, Lf20;->g:Ljava/lang/Object;

    .line 140
    .line 141
    const-string v2, "loadJavascriptEngine > Before registering GmsgHandler for /requestReload"

    .line 142
    .line 143
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-string v2, "/requestReload"

    .line 147
    .line 148
    invoke-virtual {v14, v2, v3}, Lq52;->p(Ljava/lang/String;Ly32;)V

    .line 149
    .line 150
    .line 151
    iget-object v2, v12, Lmm2;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, Ljava/lang/String;

    .line 154
    .line 155
    const-string v3, "loadJavascriptEngine > javascriptPath: "

    .line 156
    .line 157
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const-string v3, ".js"

    .line 169
    .line 170
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_0

    .line 175
    .line 176
    const-string v3, "loadJavascriptEngine > Before newEngine.loadJavascript"

    .line 177
    .line 178
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v3, "loadJavascript on adWebView from path: "

    .line 182
    .line 183
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v3, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v4, "<!DOCTYPE html><html><head><script src=\""

    .line 193
    .line 194
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v2, "\"></script></head><body></body></html>"

    .line 201
    .line 202
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    new-instance v3, Lo52;

    .line 210
    .line 211
    invoke-direct {v3, v14, v2, v10}, Lo52;-><init>(Lq52;Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v3}, Lq52;->e(Ljava/lang/Runnable;)V

    .line 215
    .line 216
    .line 217
    const-string v2, "loadJavascriptEngine > After newEngine.loadJavascript"

    .line 218
    .line 219
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_0
    const-string v3, "<html>"

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-eqz v3, :cond_1

    .line 230
    .line 231
    const-string v3, "loadJavascriptEngine > Before newEngine.loadHtml"

    .line 232
    .line 233
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    const-string v3, "loadHtml on adWebView from html"

    .line 237
    .line 238
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    new-instance v3, Lo52;

    .line 242
    .line 243
    invoke-direct {v3, v14, v2, v9}, Lo52;-><init>(Lq52;Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    invoke-static {v3}, Lq52;->e(Ljava/lang/Runnable;)V

    .line 247
    .line 248
    .line 249
    const-string v2, "loadJavascriptEngine > After newEngine.loadHtml"

    .line 250
    .line 251
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_0

    .line 255
    :cond_1
    const-string v3, "loadJavascriptEngine > Before newEngine.loadHtmlWrapper"

    .line 256
    .line 257
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    const-string v3, "loadHtmlWrapper on adWebView from path: "

    .line 261
    .line 262
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-static {v3}, Lgi2;->G(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    new-instance v3, Lo52;

    .line 270
    .line 271
    invoke-direct {v3, v14, v2, v8}, Lo52;-><init>(Lq52;Ljava/lang/String;I)V

    .line 272
    .line 273
    .line 274
    invoke-static {v3}, Lq52;->e(Ljava/lang/Runnable;)V

    .line 275
    .line 276
    .line 277
    const-string v2, "loadJavascriptEngine > After newEngine.loadHtmlWrapper"

    .line 278
    .line 279
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :goto_0
    const-string v2, "loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed"

    .line 283
    .line 284
    invoke-static {v2}, Lgi2;->G(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    sget-object v2, Llf4;->l:Li63;

    .line 288
    .line 289
    new-instance v11, Lv52;

    .line 290
    .line 291
    const/16 v18, 0x0

    .line 292
    .line 293
    move-object v13, v15

    .line 294
    move-object v15, v0

    .line 295
    invoke-direct/range {v11 .. v18}, Lv52;-><init>(Lmm2;Lb62;Lq52;Ljava/util/ArrayList;JI)V

    .line 296
    .line 297
    .line 298
    sget-object v0, Lmz1;->d:Liz1;

    .line 299
    .line 300
    sget-object v3, Ltw1;->e:Ltw1;

    .line 301
    .line 302
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 303
    .line 304
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Ljava/lang/Integer;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    int-to-long v3, v0

    .line 315
    invoke-virtual {v2, v11, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 316
    .line 317
    .line 318
    goto :goto_1

    .line 319
    :catchall_0
    move-exception v0

    .line 320
    const-string v3, "Error creating webview."

    .line 321
    .line 322
    invoke-static {v3, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    sget-object v3, Lmz1;->g8:Liz1;

    .line 326
    .line 327
    sget-object v4, Ltw1;->e:Ltw1;

    .line 328
    .line 329
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 330
    .line 331
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    check-cast v3, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_2

    .line 342
    .line 343
    const-string v2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine"

    .line 344
    .line 345
    invoke-virtual {v15, v2, v0}, Le6;->v(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 346
    .line 347
    .line 348
    goto :goto_1

    .line 349
    :cond_2
    sget-object v3, Lmz1;->i8:Liz1;

    .line 350
    .line 351
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 352
    .line 353
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    check-cast v3, Ljava/lang/Boolean;

    .line 358
    .line 359
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_3

    .line 364
    .line 365
    sget-object v3, Lhg4;->C:Lhg4;

    .line 366
    .line 367
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 368
    .line 369
    invoke-virtual {v3, v2, v0}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v15}, Le6;->u()V

    .line 373
    .line 374
    .line 375
    goto :goto_1

    .line 376
    :cond_3
    sget-object v3, Lhg4;->C:Lhg4;

    .line 377
    .line 378
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 379
    .line 380
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v15}, Le6;->u()V

    .line 384
    .line 385
    .line 386
    :goto_1
    return-void

    .line 387
    :pswitch_0
    invoke-direct {v1}, Ljq3;->b()V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :pswitch_1
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Lz42;

    .line 394
    .line 395
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v2, Lbw1;

    .line 398
    .line 399
    iget-object v0, v0, Lz42;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 400
    .line 401
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    new-instance v3, Lug0;

    .line 405
    .line 406
    invoke-direct {v3, v5, v0}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    new-instance v0, Lus0;

    .line 410
    .line 411
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v3, v0}, Lbw1;->b(Lf41;Le41;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :pswitch_2
    sget-object v0, Lmz1;->A5:Liz1;

    .line 419
    .line 420
    sget-object v2, Ltw1;->e:Ltw1;

    .line 421
    .line 422
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 423
    .line 424
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, Ljava/lang/Boolean;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v2, Landroid/content/Context;

    .line 437
    .line 438
    iget-object v3, v1, Ljq3;->g:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v3, Lwy0;

    .line 441
    .line 442
    if-eqz v0, :cond_6

    .line 443
    .line 444
    :try_start_1
    const-string v0, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"
    :try_end_1
    .catch Lze4; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 445
    .line 446
    :try_start_2
    invoke-static {v2}, Lpu1;->z(Landroid/content/Context;)Lar;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-virtual {v4, v0}, Lar;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Landroid/os/IBinder;

    .line 455
    .line 456
    sget v4, Lkv1;->f:I

    .line 457
    .line 458
    const-string v4, "com.google.android.gms.ads.clearcut.IClearcut"

    .line 459
    .line 460
    if-nez v0, :cond_4

    .line 461
    .line 462
    goto :goto_2

    .line 463
    :cond_4
    invoke-interface {v0, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    instance-of v6, v5, Llv1;

    .line 468
    .line 469
    if-eqz v6, :cond_5

    .line 470
    .line 471
    move-object v7, v5

    .line 472
    check-cast v7, Llv1;

    .line 473
    .line 474
    goto :goto_2

    .line 475
    :cond_5
    new-instance v7, Ljv1;

    .line 476
    .line 477
    invoke-direct {v7, v0, v4, v8}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 478
    .line 479
    .line 480
    :goto_2
    :try_start_3
    iput-object v7, v3, Lwy0;->g:Ljava/lang/Object;

    .line 481
    .line 482
    new-instance v0, Loi0;

    .line 483
    .line 484
    invoke-direct {v0, v2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    iget-object v2, v3, Lwy0;->g:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v2, Llv1;

    .line 490
    .line 491
    check-cast v2, Ljv1;

    .line 492
    .line 493
    invoke-virtual {v2, v0}, Ljv1;->l1(Loi0;)V

    .line 494
    .line 495
    .line 496
    iput-boolean v9, v3, Lwy0;->f:Z

    .line 497
    .line 498
    goto :goto_3

    .line 499
    :catch_0
    move-exception v0

    .line 500
    new-instance v2, Lze4;

    .line 501
    .line 502
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 503
    .line 504
    .line 505
    throw v2
    :try_end_3
    .catch Lze4; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    .line 506
    :catch_1
    const-string v0, "Cannot dynamite load clearcut"

    .line 507
    .line 508
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :cond_6
    :goto_3
    return-void

    .line 512
    :pswitch_3
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v0, Lyw1;

    .line 515
    .line 516
    invoke-virtual {v0}, Lpd2;->isCancelled()Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_7

    .line 521
    .line 522
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Ljava/util/concurrent/Future;

    .line 525
    .line 526
    invoke-interface {v0, v9}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 527
    .line 528
    .line 529
    :cond_7
    return-void

    .line 530
    :pswitch_4
    invoke-direct {v1}, Ljq3;->a()V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_5
    :try_start_4
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, Lbo1;

    .line 537
    .line 538
    iget-object v0, v0, Lbo1;->g:Ljava/util/concurrent/BlockingQueue;

    .line 539
    .line 540
    iget-object v2, v1, Ljq3;->g:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v2, Ljo1;

    .line 543
    .line 544
    invoke-interface {v0, v2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2

    .line 545
    .line 546
    .line 547
    goto :goto_4

    .line 548
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 553
    .line 554
    .line 555
    :goto_4
    return-void

    .line 556
    :pswitch_6
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, Lcr1;

    .line 559
    .line 560
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v2, [Lau2;

    .line 563
    .line 564
    aget-object v2, v2, v10

    .line 565
    .line 566
    if-eqz v2, :cond_8

    .line 567
    .line 568
    iget-object v3, v0, Lcr1;->k:Lv83;

    .line 569
    .line 570
    invoke-static {v2}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    monitor-enter v3

    .line 575
    :try_start_5
    iget-object v2, v3, Lv83;->a:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 576
    .line 577
    invoke-virtual {v2, v0}, Ljava/util/concurrent/LinkedBlockingDeque;->addFirst(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 578
    .line 579
    .line 580
    monitor-exit v3

    .line 581
    goto :goto_5

    .line 582
    :catchall_1
    move-exception v0

    .line 583
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 584
    throw v0

    .line 585
    :cond_8
    :goto_5
    return-void

    .line 586
    :pswitch_7
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v0, Lgw3;

    .line 589
    .line 590
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v2, Ln34;

    .line 593
    .line 594
    monitor-enter v2

    .line 595
    monitor-exit v2

    .line 596
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 597
    .line 598
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v0, Loa4;

    .line 601
    .line 602
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 603
    .line 604
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 605
    .line 606
    iget-object v3, v0, Lmd4;->i:Lbu1;

    .line 607
    .line 608
    iget-object v3, v3, Lbu1;->k:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v3, Lkh4;

    .line 611
    .line 612
    invoke-virtual {v0, v3}, Lmd4;->x(Lkh4;)Lad4;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    new-instance v4, Lrc3;

    .line 617
    .line 618
    invoke-direct {v4, v3, v2}, Lrc3;-><init>(Lad4;Ln34;)V

    .line 619
    .line 620
    .line 621
    const/16 v2, 0x3fc

    .line 622
    .line 623
    invoke-virtual {v0, v3, v2, v4}, Lmd4;->s(Lad4;ILks2;)V

    .line 624
    .line 625
    .line 626
    return-void

    .line 627
    :pswitch_8
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v0, Lgw3;

    .line 630
    .line 631
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v2, Lt82;

    .line 634
    .line 635
    sget-object v3, Lv23;->a:Ljava/lang/String;

    .line 636
    .line 637
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v0, Loa4;

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    new-instance v3, Lbi3;

    .line 645
    .line 646
    invoke-direct {v3, v8, v2}, Lbi3;-><init>(ILjava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 650
    .line 651
    iget-object v0, v0, Lya4;->t:Lmu2;

    .line 652
    .line 653
    const/16 v2, 0x19

    .line 654
    .line 655
    invoke-virtual {v0, v2, v3}, Lmu2;->c(ILks2;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0}, Lmu2;->d()V

    .line 659
    .line 660
    .line 661
    return-void

    .line 662
    :pswitch_9
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Lv2;

    .line 665
    .line 666
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Le13;

    .line 669
    .line 670
    :try_start_7
    iget-object v3, v0, Lv2;->b:La62;

    .line 671
    .line 672
    iget-object v0, v0, Lv2;->a:Landroid/content/Context;

    .line 673
    .line 674
    invoke-static {v0, v2}, Lfr;->o(Landroid/content/Context;Le13;)Lpc4;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-interface {v3, v0}, La62;->Z(Lpc4;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_3

    .line 679
    .line 680
    .line 681
    goto :goto_6

    .line 682
    :catch_3
    move-exception v0

    .line 683
    const-string v2, "Failed to load ad."

    .line 684
    .line 685
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 686
    .line 687
    .line 688
    :goto_6
    return-void

    .line 689
    :pswitch_a
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Lkc1;

    .line 692
    .line 693
    iget-object v2, v1, Ljq3;->g:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v2, Lsc1;

    .line 696
    .line 697
    iget-object v3, v2, Lsc1;->g:Lrh;

    .line 698
    .line 699
    iget v4, v3, Lrh;->g:I

    .line 700
    .line 701
    if-nez v4, :cond_e

    .line 702
    .line 703
    iget-object v2, v2, Lsc1;->h:Lyc1;

    .line 704
    .line 705
    invoke-static {v2}, Lou1;->j(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    iget-object v3, v2, Lyc1;->h:Lrh;

    .line 709
    .line 710
    iget v4, v3, Lrh;->g:I

    .line 711
    .line 712
    if-nez v4, :cond_d

    .line 713
    .line 714
    iget-object v3, v0, Lkc1;->m:Lzb1;

    .line 715
    .line 716
    iget-object v2, v2, Lyc1;->g:Landroid/os/IBinder;

    .line 717
    .line 718
    if-nez v2, :cond_9

    .line 719
    .line 720
    goto :goto_7

    .line 721
    :cond_9
    sget v4, Lk1;->g:I

    .line 722
    .line 723
    const-string v4, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 724
    .line 725
    invoke-interface {v2, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 726
    .line 727
    .line 728
    move-result-object v5

    .line 729
    instance-of v7, v5, Lk10;

    .line 730
    .line 731
    if-eqz v7, :cond_a

    .line 732
    .line 733
    move-object v7, v5

    .line 734
    check-cast v7, Lk10;

    .line 735
    .line 736
    goto :goto_7

    .line 737
    :cond_a
    new-instance v7, Lfi4;

    .line 738
    .line 739
    invoke-direct {v7, v2, v4, v9}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 740
    .line 741
    .line 742
    :goto_7
    iget-object v2, v0, Lkc1;->j:Ljava/util/Set;

    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    if-eqz v7, :cond_c

    .line 748
    .line 749
    if-nez v2, :cond_b

    .line 750
    .line 751
    goto :goto_8

    .line 752
    :cond_b
    iput-object v7, v3, Lzb1;->i:Ljava/lang/Object;

    .line 753
    .line 754
    iput-object v2, v3, Lzb1;->j:Ljava/lang/Object;

    .line 755
    .line 756
    iget-boolean v4, v3, Lzb1;->f:Z

    .line 757
    .line 758
    if-eqz v4, :cond_f

    .line 759
    .line 760
    iget-object v3, v3, Lzb1;->g:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v3, Lv4;

    .line 763
    .line 764
    invoke-interface {v3, v7, v2}, Lv4;->m(Lk10;Ljava/util/Set;)V

    .line 765
    .line 766
    .line 767
    goto :goto_9

    .line 768
    :cond_c
    :goto_8
    new-instance v2, Ljava/lang/Exception;

    .line 769
    .line 770
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 771
    .line 772
    .line 773
    const-string v4, "GoogleApiManager"

    .line 774
    .line 775
    const-string v5, "Received null response from onSignInSuccess"

    .line 776
    .line 777
    invoke-static {v4, v5, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 778
    .line 779
    .line 780
    new-instance v2, Lrh;

    .line 781
    .line 782
    invoke-direct {v2, v6}, Lrh;-><init>(I)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v3, v2}, Lzb1;->a(Lrh;)V

    .line 786
    .line 787
    .line 788
    goto :goto_9

    .line 789
    :cond_d
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    new-instance v4, Ljava/lang/Exception;

    .line 794
    .line 795
    invoke-direct {v4}, Ljava/lang/Exception;-><init>()V

    .line 796
    .line 797
    .line 798
    const-string v5, "SignInCoordinator"

    .line 799
    .line 800
    const-string v6, "Sign-in succeeded with resolve account failure: "

    .line 801
    .line 802
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    invoke-static {v5, v2, v4}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 807
    .line 808
    .line 809
    iget-object v2, v0, Lkc1;->m:Lzb1;

    .line 810
    .line 811
    invoke-virtual {v2, v3}, Lzb1;->a(Lrh;)V

    .line 812
    .line 813
    .line 814
    iget-object v0, v0, Lkc1;->l:Lyv0;

    .line 815
    .line 816
    invoke-interface {v0}, Lv4;->k()V

    .line 817
    .line 818
    .line 819
    goto :goto_a

    .line 820
    :cond_e
    iget-object v2, v0, Lkc1;->m:Lzb1;

    .line 821
    .line 822
    invoke-virtual {v2, v3}, Lzb1;->a(Lrh;)V

    .line 823
    .line 824
    .line 825
    :cond_f
    :goto_9
    iget-object v0, v0, Lkc1;->l:Lyv0;

    .line 826
    .line 827
    invoke-interface {v0}, Lv4;->k()V

    .line 828
    .line 829
    .line 830
    :goto_a
    return-void

    .line 831
    :pswitch_b
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v0, Lrh;

    .line 834
    .line 835
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v2, Lzb1;

    .line 838
    .line 839
    iget-object v3, v2, Lzb1;->g:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v3, Lv4;

    .line 842
    .line 843
    iget-object v4, v2, Lzb1;->k:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v4, Ljz;

    .line 846
    .line 847
    iget-object v4, v4, Ljz;->o:Ljava/util/concurrent/ConcurrentHashMap;

    .line 848
    .line 849
    iget-object v5, v2, Lzb1;->h:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v5, Lc5;

    .line 852
    .line 853
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    check-cast v4, Lxb1;

    .line 858
    .line 859
    if-nez v4, :cond_10

    .line 860
    .line 861
    goto :goto_b

    .line 862
    :cond_10
    iget v5, v0, Lrh;->g:I

    .line 863
    .line 864
    if-nez v5, :cond_12

    .line 865
    .line 866
    iput-boolean v9, v2, Lzb1;->f:Z

    .line 867
    .line 868
    invoke-interface {v3}, Lv4;->l()Z

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    if-eqz v0, :cond_11

    .line 873
    .line 874
    iget-boolean v0, v2, Lzb1;->f:Z

    .line 875
    .line 876
    if-eqz v0, :cond_13

    .line 877
    .line 878
    iget-object v0, v2, Lzb1;->i:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v0, Lk10;

    .line 881
    .line 882
    if-eqz v0, :cond_13

    .line 883
    .line 884
    iget-object v2, v2, Lzb1;->j:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v2, Ljava/util/Set;

    .line 887
    .line 888
    invoke-interface {v3, v0, v2}, Lv4;->m(Lk10;Ljava/util/Set;)V

    .line 889
    .line 890
    .line 891
    goto :goto_b

    .line 892
    :cond_11
    :try_start_8
    invoke-interface {v3}, Lv4;->c()Ljava/util/Set;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-interface {v3, v7, v0}, Lv4;->m(Lk10;Ljava/util/Set;)V
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_4

    .line 897
    .line 898
    .line 899
    goto :goto_b

    .line 900
    :catch_4
    move-exception v0

    .line 901
    const-string v2, "GoogleApiManager"

    .line 902
    .line 903
    const-string v5, "Failed to get service from broker. "

    .line 904
    .line 905
    invoke-static {v2, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 906
    .line 907
    .line 908
    const-string v0, "Failed to get service from broker."

    .line 909
    .line 910
    invoke-interface {v3, v0}, Lv4;->d(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    new-instance v0, Lrh;

    .line 914
    .line 915
    const/16 v2, 0xa

    .line 916
    .line 917
    invoke-direct {v0, v2}, Lrh;-><init>(I)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v4, v0, v7}, Lxb1;->l(Lrh;Ljava/lang/RuntimeException;)V

    .line 921
    .line 922
    .line 923
    goto :goto_b

    .line 924
    :cond_12
    invoke-virtual {v4, v0, v7}, Lxb1;->l(Lrh;Ljava/lang/RuntimeException;)V

    .line 925
    .line 926
    .line 927
    :cond_13
    :goto_b
    return-void

    .line 928
    :pswitch_c
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 931
    .line 932
    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Li61;

    .line 933
    .line 934
    if-eqz v0, :cond_14

    .line 935
    .line 936
    invoke-virtual {v0}, Li61;->f()Z

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    if-eqz v0, :cond_14

    .line 941
    .line 942
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v0, Landroid/view/View;

    .line 945
    .line 946
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 947
    .line 948
    .line 949
    :cond_14
    return-void

    .line 950
    :pswitch_d
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 951
    .line 952
    move-object v2, v0

    .line 953
    check-cast v2, Llu0;

    .line 954
    .line 955
    :try_start_9
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v0, Ljava/lang/Runnable;

    .line 958
    .line 959
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 960
    .line 961
    .line 962
    invoke-virtual {v2}, Llu0;->a()V

    .line 963
    .line 964
    .line 965
    return-void

    .line 966
    :catchall_2
    move-exception v0

    .line 967
    invoke-virtual {v2}, Llu0;->a()V

    .line 968
    .line 969
    .line 970
    throw v0

    .line 971
    :pswitch_e
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 972
    .line 973
    check-cast v0, Lov;

    .line 974
    .line 975
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 976
    .line 977
    invoke-virtual {v0, v2}, Lov;->accept(Ljava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    return-void

    .line 981
    :pswitch_f
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 982
    .line 983
    move-object v4, v0

    .line 984
    check-cast v4, Lpl0;

    .line 985
    .line 986
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v0, Lql0;

    .line 989
    .line 990
    iget-object v5, v0, Lql0;->f:Ljava/util/ArrayList;

    .line 991
    .line 992
    iget v6, v0, Lql0;->a:I

    .line 993
    .line 994
    invoke-static {v6}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 995
    .line 996
    .line 997
    move-result-object v6

    .line 998
    iget-object v7, v0, Lql0;->e:Ljava/util/ArrayList;

    .line 999
    .line 1000
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1001
    .line 1002
    .line 1003
    move-result v8

    .line 1004
    :goto_c
    if-ge v10, v8, :cond_15

    .line 1005
    .line 1006
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v9

    .line 1010
    add-int/lit8 v10, v10, 0x1

    .line 1011
    .line 1012
    check-cast v9, Ljava/lang/Integer;

    .line 1013
    .line 1014
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1015
    .line 1016
    .line 1017
    move-result v9

    .line 1018
    new-instance v11, Lml;

    .line 1019
    .line 1020
    iget-object v12, v0, Lql0;->b:Ljava/net/InetAddress;

    .line 1021
    .line 1022
    iget v13, v0, Lql0;->c:I

    .line 1023
    .line 1024
    invoke-direct {v11, v0, v12, v9, v13}, Lml;-><init>(Lql0;Ljava/net/InetAddress;II)V

    .line 1025
    .line 1026
    .line 1027
    invoke-interface {v6, v11}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1028
    .line 1029
    .line 1030
    goto :goto_c

    .line 1031
    :cond_15
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1032
    .line 1033
    .line 1034
    :try_start_a
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 1035
    .line 1036
    invoke-interface {v6, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_5

    .line 1037
    .line 1038
    .line 1039
    goto :goto_d

    .line 1040
    :catch_5
    move-exception v0

    .line 1041
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1042
    .line 1043
    .line 1044
    :goto_d
    invoke-static {v5}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-interface {v4, v5}, Lpl0;->j(Ljava/util/ArrayList;)V

    .line 1048
    .line 1049
    .line 1050
    return-void

    .line 1051
    :pswitch_10
    const-string v4, "<set-?>"

    .line 1052
    .line 1053
    const-string v5, "pingAdapter"

    .line 1054
    .line 1055
    const-string v11, "dataList"

    .line 1056
    .line 1057
    const-string v12, " "

    .line 1058
    .line 1059
    const-string v13, "toUpperCase(...)"

    .line 1060
    .line 1061
    const-string v14, "getString(...)"

    .line 1062
    .line 1063
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 1064
    .line 1065
    check-cast v0, Lf23;

    .line 1066
    .line 1067
    iget-object v0, v0, Lf23;->g:Ljava/lang/Object;

    .line 1068
    .line 1069
    move-object v15, v0

    .line 1070
    check-cast v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;

    .line 1071
    .line 1072
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 1073
    .line 1074
    move-wide/from16 v16, v2

    .line 1075
    .line 1076
    move-object v2, v0

    .line 1077
    check-cast v2, Lvy2;

    .line 1078
    .line 1079
    :try_start_b
    iget-object v0, v2, Lvy2;->d:Ljava/io/Serializable;

    .line 1080
    .line 1081
    check-cast v0, Ljava/net/InetAddress;

    .line 1082
    .line 1083
    if-nez v0, :cond_16

    .line 1084
    .line 1085
    iget-object v0, v2, Lvy2;->c:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast v0, Ljava/lang/String;

    .line 1088
    .line 1089
    if-eqz v0, :cond_16

    .line 1090
    .line 1091
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    iput-object v0, v2, Lvy2;->d:Ljava/io/Serializable;
    :try_end_b
    .catch Ljava/net/UnknownHostException; {:try_start_b .. :try_end_b} :catch_f

    .line 1096
    .line 1097
    :cond_16
    iget-object v0, v2, Lvy2;->d:Ljava/io/Serializable;

    .line 1098
    .line 1099
    check-cast v0, Ljava/net/InetAddress;

    .line 1100
    .line 1101
    if-nez v0, :cond_17

    .line 1102
    .line 1103
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 1104
    .line 1105
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1106
    .line 1107
    .line 1108
    new-instance v0, Lxk0;

    .line 1109
    .line 1110
    invoke-direct {v0, v15, v8}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v15, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1114
    .line 1115
    .line 1116
    goto/16 :goto_21

    .line 1117
    .line 1118
    :cond_17
    iput-boolean v10, v2, Lvy2;->b:Z

    .line 1119
    .line 1120
    iget v0, v2, Lvy2;->a:I

    .line 1121
    .line 1122
    const-wide/16 v18, 0x0

    .line 1123
    .line 1124
    const/4 v8, 0x0

    .line 1125
    move-wide/from16 v21, v18

    .line 1126
    .line 1127
    const/high16 v23, -0x40800000    # -1.0f

    .line 1128
    .line 1129
    const/high16 v24, -0x40800000    # -1.0f

    .line 1130
    .line 1131
    const/high16 v25, -0x40800000    # -1.0f

    .line 1132
    .line 1133
    move/from16 v18, v8

    .line 1134
    .line 1135
    move-wide/from16 v19, v21

    .line 1136
    .line 1137
    move v8, v0

    .line 1138
    :goto_e
    if-gtz v8, :cond_19

    .line 1139
    .line 1140
    iget v0, v2, Lvy2;->a:I

    .line 1141
    .line 1142
    if-nez v0, :cond_18

    .line 1143
    .line 1144
    goto :goto_10

    .line 1145
    :cond_18
    move-object/from16 v30, v5

    .line 1146
    .line 1147
    move-object/from16 v28, v7

    .line 1148
    .line 1149
    :goto_f
    move/from16 v37, v18

    .line 1150
    .line 1151
    move-wide/from16 v33, v19

    .line 1152
    .line 1153
    move-wide/from16 v35, v21

    .line 1154
    .line 1155
    move/from16 v39, v23

    .line 1156
    .line 1157
    move/from16 v38, v24

    .line 1158
    .line 1159
    goto/16 :goto_1c

    .line 1160
    .line 1161
    :cond_19
    :goto_10
    iget-object v0, v2, Lvy2;->d:Ljava/io/Serializable;

    .line 1162
    .line 1163
    check-cast v0, Ljava/net/InetAddress;

    .line 1164
    .line 1165
    iget-object v6, v2, Lvy2;->e:Ljava/lang/Object;

    .line 1166
    .line 1167
    check-cast v6, Lh80;

    .line 1168
    .line 1169
    :try_start_c
    invoke-static {v0, v6}, Li41;->e(Ljava/net/InetAddress;Lh80;)Lal0;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6

    .line 1173
    move-object v3, v7

    .line 1174
    move v6, v8

    .line 1175
    const v8, 0x7f12001d

    .line 1176
    .line 1177
    .line 1178
    move-object v7, v0

    .line 1179
    goto :goto_14

    .line 1180
    :catch_6
    new-instance v9, Lal0;

    .line 1181
    .line 1182
    invoke-direct {v9, v0}, Lal0;-><init>(Ljava/net/InetAddress;)V

    .line 1183
    .line 1184
    .line 1185
    if-nez v0, :cond_1a

    .line 1186
    .line 1187
    iput-boolean v10, v9, Lal0;->c:Z

    .line 1188
    .line 1189
    move-object v3, v7

    .line 1190
    move v6, v8

    .line 1191
    goto :goto_12

    .line 1192
    :cond_1a
    :try_start_d
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1193
    .line 1194
    .line 1195
    move-result-wide v28

    .line 1196
    iget v6, v6, Lh80;->g:I

    .line 1197
    .line 1198
    const/16 v3, 0x80

    .line 1199
    .line 1200
    invoke-virtual {v0, v7, v3, v6}, Ljava/net/InetAddress;->isReachable(Ljava/net/NetworkInterface;II)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v0

    .line 1204
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 1205
    .line 1206
    .line 1207
    move-result-wide v30
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8

    .line 1208
    move-object v3, v7

    .line 1209
    move v6, v8

    .line 1210
    sub-long v7, v30, v28

    .line 1211
    .line 1212
    long-to-float v7, v7

    .line 1213
    const v8, 0x49742400    # 1000000.0f

    .line 1214
    .line 1215
    .line 1216
    div-float/2addr v7, v8

    .line 1217
    :try_start_e
    iput v7, v9, Lal0;->b:F

    .line 1218
    .line 1219
    iput-boolean v0, v9, Lal0;->c:Z

    .line 1220
    .line 1221
    if-nez v0, :cond_1b

    .line 1222
    .line 1223
    const-string v0, "Timed Out"

    .line 1224
    .line 1225
    iput-object v0, v9, Lal0;->e:Ljava/lang/Object;
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7

    .line 1226
    .line 1227
    goto :goto_12

    .line 1228
    :catch_7
    move-exception v0

    .line 1229
    goto :goto_11

    .line 1230
    :catch_8
    move-exception v0

    .line 1231
    move-object v3, v7

    .line 1232
    move v6, v8

    .line 1233
    :goto_11
    iput-boolean v10, v9, Lal0;->c:Z

    .line 1234
    .line 1235
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1236
    .line 1237
    const-string v8, "IOException: "

    .line 1238
    .line 1239
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    iput-object v0, v9, Lal0;->e:Ljava/lang/Object;

    .line 1254
    .line 1255
    :cond_1b
    :goto_12
    move-object v7, v9

    .line 1256
    :goto_13
    const v8, 0x7f12001d

    .line 1257
    .line 1258
    .line 1259
    goto :goto_14

    .line 1260
    :catch_9
    move-object v3, v7

    .line 1261
    move v6, v8

    .line 1262
    new-instance v7, Lal0;

    .line 1263
    .line 1264
    invoke-direct {v7, v0}, Lal0;-><init>(Ljava/net/InetAddress;)V

    .line 1265
    .line 1266
    .line 1267
    iput-boolean v10, v7, Lal0;->c:Z

    .line 1268
    .line 1269
    const-string v0, "Interrupted"

    .line 1270
    .line 1271
    iput-object v0, v7, Lal0;->e:Ljava/lang/Object;

    .line 1272
    .line 1273
    goto :goto_13

    .line 1274
    :goto_14
    invoke-virtual {v15, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    invoke-static {v0, v14}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1279
    .line 1280
    .line 1281
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1282
    .line 1283
    invoke-virtual {v0, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    invoke-static {v0, v13}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1288
    .line 1289
    .line 1290
    iget-object v8, v7, Lal0;->d:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast v8, Ljava/net/InetAddress;

    .line 1293
    .line 1294
    invoke-virtual {v8}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v8

    .line 1298
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    iget v8, v7, Lal0;->b:F

    .line 1317
    .line 1318
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v9

    .line 1322
    move-object/from16 v28, v3

    .line 1323
    .line 1324
    iget-object v3, v7, Lal0;->f:Ljava/lang/Object;

    .line 1325
    .line 1326
    check-cast v3, Ljava/lang/String;

    .line 1327
    .line 1328
    invoke-virtual {v15}, Landroid/app/Activity;->isFinishing()Z

    .line 1329
    .line 1330
    .line 1331
    move-result v29

    .line 1332
    if-eqz v29, :cond_1c

    .line 1333
    .line 1334
    move-object/from16 v30, v5

    .line 1335
    .line 1336
    goto/16 :goto_1a

    .line 1337
    .line 1338
    :cond_1c
    :try_start_f
    new-instance v10, Lzk0;

    .line 1339
    .line 1340
    invoke-direct {v10}, Lzk0;-><init>()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_c

    .line 1341
    .line 1342
    .line 1343
    move-object/from16 v30, v5

    .line 1344
    .line 1345
    const v5, 0x7f0800ba

    .line 1346
    .line 1347
    .line 1348
    :try_start_10
    iput v5, v10, Lzk0;->a:I

    .line 1349
    .line 1350
    invoke-static {v0, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    iput-object v0, v10, Lzk0;->b:Ljava/lang/String;

    .line 1354
    .line 1355
    iget-object v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->J:Ljava/text/DecimalFormat;

    .line 1356
    .line 1357
    invoke-virtual {v0, v9}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1362
    .line 1363
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1367
    .line 1368
    .line 1369
    const-string v0, " ms"

    .line 1370
    .line 1371
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    invoke-static {v0, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1379
    .line 1380
    .line 1381
    iput-object v0, v10, Lzk0;->d:Ljava/lang/String;

    .line 1382
    .line 1383
    iget v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->C:F

    .line 1384
    .line 1385
    add-float/2addr v0, v8

    .line 1386
    iput v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->C:F
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_b

    .line 1387
    .line 1388
    if-eqz v3, :cond_20

    .line 1389
    .line 1390
    :try_start_11
    const-string v0, "\n"

    .line 1391
    .line 1392
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    invoke-static {v3, v0}, Lsy0;->I(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    const/4 v5, 0x1

    .line 1401
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    check-cast v0, Ljava/lang/String;

    .line 1406
    .line 1407
    invoke-static {v0, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1408
    .line 1409
    .line 1410
    iput-object v0, v10, Lzk0;->c:Ljava/lang/String;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_a

    .line 1411
    .line 1412
    goto :goto_18

    .line 1413
    :catch_a
    :try_start_12
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1414
    .line 1415
    .line 1416
    move-result v0

    .line 1417
    add-int/lit8 v0, v0, -0x1

    .line 1418
    .line 1419
    if-ltz v0, :cond_1f

    .line 1420
    .line 1421
    :goto_15
    add-int/lit8 v5, v0, -0x1

    .line 1422
    .line 1423
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 1424
    .line 1425
    .line 1426
    move-result v8

    .line 1427
    invoke-static {v8}, La30;->g(C)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v8

    .line 1431
    if-nez v8, :cond_1d

    .line 1432
    .line 1433
    add-int/lit8 v0, v0, 0x1

    .line 1434
    .line 1435
    const/4 v5, 0x0

    .line 1436
    invoke-virtual {v3, v5, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    goto :goto_17

    .line 1441
    :cond_1d
    if-gez v5, :cond_1e

    .line 1442
    .line 1443
    goto :goto_16

    .line 1444
    :cond_1e
    move v0, v5

    .line 1445
    goto :goto_15

    .line 1446
    :cond_1f
    :goto_16
    const-string v0, ""

    .line 1447
    .line 1448
    :goto_17
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v0

    .line 1452
    invoke-static {v0, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1453
    .line 1454
    .line 1455
    iput-object v0, v10, Lzk0;->c:Ljava/lang/String;

    .line 1456
    .line 1457
    goto :goto_18

    .line 1458
    :catch_b
    move-exception v0

    .line 1459
    goto :goto_19

    .line 1460
    :cond_20
    :goto_18
    iget-object v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 1461
    .line 1462
    if-eqz v0, :cond_23

    .line 1463
    .line 1464
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    iget-object v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->H:Lc10;

    .line 1468
    .line 1469
    if-eqz v0, :cond_22

    .line 1470
    .line 1471
    iget-object v3, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 1472
    .line 1473
    if-eqz v3, :cond_21

    .line 1474
    .line 1475
    invoke-static {v3}, Lzf;->i0(Ljava/util/List;)I

    .line 1476
    .line 1477
    .line 1478
    move-result v3

    .line 1479
    iget-object v0, v0, Lao0;->f:Lbo0;

    .line 1480
    .line 1481
    const/4 v5, 0x1

    .line 1482
    invoke-virtual {v0, v3, v5}, Lbo0;->d(II)V

    .line 1483
    .line 1484
    .line 1485
    goto :goto_1a

    .line 1486
    :cond_21
    invoke-static {v11}, Li30;->S(Ljava/lang/String;)V

    .line 1487
    .line 1488
    .line 1489
    throw v28

    .line 1490
    :cond_22
    invoke-static/range {v30 .. v30}, Li30;->S(Ljava/lang/String;)V

    .line 1491
    .line 1492
    .line 1493
    throw v28

    .line 1494
    :cond_23
    invoke-static {v11}, Li30;->S(Ljava/lang/String;)V

    .line 1495
    .line 1496
    .line 1497
    throw v28
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b

    .line 1498
    :catch_c
    move-exception v0

    .line 1499
    move-object/from16 v30, v5

    .line 1500
    .line 1501
    :goto_19
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1502
    .line 1503
    .line 1504
    :goto_1a
    new-instance v0, Lr5;

    .line 1505
    .line 1506
    const/4 v3, 0x4

    .line 1507
    invoke-direct {v0, v15, v7, v3}, Lr5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v15, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1511
    .line 1512
    .line 1513
    const-wide/16 v8, 0x2bc

    .line 1514
    .line 1515
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V

    .line 1516
    .line 1517
    .line 1518
    add-long v19, v19, v16

    .line 1519
    .line 1520
    iget-object v0, v7, Lal0;->e:Ljava/lang/Object;

    .line 1521
    .line 1522
    check-cast v0, Ljava/lang/String;

    .line 1523
    .line 1524
    if-eqz v0, :cond_24

    .line 1525
    .line 1526
    add-long v21, v21, v16

    .line 1527
    .line 1528
    goto :goto_1b

    .line 1529
    :cond_24
    iget v0, v7, Lal0;->b:F

    .line 1530
    .line 1531
    add-float v18, v18, v0

    .line 1532
    .line 1533
    cmpl-float v3, v23, v25

    .line 1534
    .line 1535
    if-eqz v3, :cond_25

    .line 1536
    .line 1537
    cmpl-float v3, v0, v23

    .line 1538
    .line 1539
    if-lez v3, :cond_26

    .line 1540
    .line 1541
    :cond_25
    move/from16 v23, v0

    .line 1542
    .line 1543
    :cond_26
    cmpl-float v3, v24, v25

    .line 1544
    .line 1545
    if-eqz v3, :cond_27

    .line 1546
    .line 1547
    cmpg-float v3, v0, v24

    .line 1548
    .line 1549
    if-gez v3, :cond_28

    .line 1550
    .line 1551
    :cond_27
    move/from16 v24, v0

    .line 1552
    .line 1553
    :cond_28
    :goto_1b
    add-int/lit8 v8, v6, -0x1

    .line 1554
    .line 1555
    iget-boolean v0, v2, Lvy2;->b:Z

    .line 1556
    .line 1557
    if-eqz v0, :cond_2f

    .line 1558
    .line 1559
    goto/16 :goto_f

    .line 1560
    .line 1561
    :goto_1c
    new-instance v31, Lbl0;

    .line 1562
    .line 1563
    iget-object v0, v2, Lvy2;->d:Ljava/io/Serializable;

    .line 1564
    .line 1565
    move-object/from16 v32, v0

    .line 1566
    .line 1567
    check-cast v32, Ljava/net/InetAddress;

    .line 1568
    .line 1569
    invoke-direct/range {v31 .. v39}, Lbl0;-><init>(Ljava/net/InetAddress;JJFFF)V

    .line 1570
    .line 1571
    .line 1572
    move-object/from16 v0, v31

    .line 1573
    .line 1574
    move-wide/from16 v2, v33

    .line 1575
    .line 1576
    move-wide/from16 v5, v35

    .line 1577
    .line 1578
    new-instance v7, Lxk0;

    .line 1579
    .line 1580
    const/4 v9, 0x4

    .line 1581
    invoke-direct {v7, v15, v9}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v15, v7}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1585
    .line 1586
    .line 1587
    const-string v7, "ms/"

    .line 1588
    .line 1589
    iget-object v8, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->J:Ljava/text/DecimalFormat;

    .line 1590
    .line 1591
    invoke-virtual {v15}, Landroid/app/Activity;->isFinishing()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v9

    .line 1595
    if-eqz v9, :cond_29

    .line 1596
    .line 1597
    goto/16 :goto_21

    .line 1598
    .line 1599
    :cond_29
    invoke-virtual/range {v32 .. v32}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v9

    .line 1603
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1604
    .line 1605
    move-object/from16 v26, v11

    .line 1606
    .line 1607
    const-string v11, "Ping Stats: "

    .line 1608
    .line 1609
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1613
    .line 1614
    .line 1615
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v9

    .line 1619
    const-string v10, "msg"

    .line 1620
    .line 1621
    invoke-static {v9, v10}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual/range {v32 .. v32}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v9

    .line 1628
    if-eqz v9, :cond_2b

    .line 1629
    .line 1630
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1631
    .line 1632
    .line 1633
    move-result v9

    .line 1634
    if-nez v9, :cond_2a

    .line 1635
    .line 1636
    goto :goto_1d

    .line 1637
    :cond_2a
    invoke-virtual/range {v32 .. v32}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v9

    .line 1641
    invoke-virtual/range {v32 .. v32}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v10

    .line 1645
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1646
    .line 1647
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1651
    .line 1652
    .line 1653
    const-string v9, "/"

    .line 1654
    .line 1655
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v9

    .line 1665
    goto :goto_1e

    .line 1666
    :cond_2b
    :goto_1d
    invoke-virtual/range {v32 .. v32}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v9

    .line 1670
    :goto_1e
    new-instance v10, Lzk0;

    .line 1671
    .line 1672
    invoke-direct {v10}, Lzk0;-><init>()V

    .line 1673
    .line 1674
    .line 1675
    const v11, 0x7f0800bb

    .line 1676
    .line 1677
    .line 1678
    iput v11, v10, Lzk0;->a:I

    .line 1679
    .line 1680
    const v11, 0x7f12001d

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v15, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v11

    .line 1687
    invoke-static {v11, v14}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1691
    .line 1692
    invoke-virtual {v11, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v11

    .line 1696
    invoke-static {v11, v13}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1697
    .line 1698
    .line 1699
    move-object/from16 v16, v7

    .line 1700
    .line 1701
    const v7, 0x7f12014f

    .line 1702
    .line 1703
    .line 1704
    invoke-virtual {v15, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v7

    .line 1708
    invoke-static {v7, v14}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1709
    .line 1710
    .line 1711
    invoke-virtual {v7, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v1

    .line 1715
    invoke-static {v1, v13}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1719
    .line 1720
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    .line 1735
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v1

    .line 1742
    invoke-static {v1, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    iput-object v1, v10, Lzk0;->b:Ljava/lang/String;

    .line 1746
    .line 1747
    div-long v35, v5, v2

    .line 1748
    .line 1749
    const/16 v1, 0x64

    .line 1750
    .line 1751
    int-to-long v11, v1

    .line 1752
    mul-long v11, v11, v35

    .line 1753
    .line 1754
    invoke-virtual {v8, v11, v12}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v1

    .line 1758
    iget v7, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->C:F

    .line 1759
    .line 1760
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v7

    .line 1764
    invoke-virtual {v8, v7}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v7

    .line 1768
    invoke-static/range {v38 .. v38}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v9

    .line 1772
    invoke-virtual {v8, v9}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v9

    .line 1776
    iget v11, v0, Lbl0;->d:F

    .line 1777
    .line 1778
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v11

    .line 1782
    invoke-virtual {v8, v11}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v11

    .line 1786
    invoke-static/range {v39 .. v39}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v12

    .line 1790
    invoke-virtual {v8, v12}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v8

    .line 1794
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1795
    .line 1796
    const-string v13, "Pings: "

    .line 1797
    .line 1798
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v12, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1802
    .line 1803
    .line 1804
    const-string v2, "\nPackets lost: "

    .line 1805
    .line 1806
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1810
    .line 1811
    .line 1812
    const-string v2, " ("

    .line 1813
    .line 1814
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1815
    .line 1816
    .line 1817
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1818
    .line 1819
    .line 1820
    const-string v1, "%)\nTimes: "

    .line 1821
    .line 1822
    const-string v2, "ms\nMin/Avg/Max Time:   "

    .line 1823
    .line 1824
    invoke-static {v12, v1, v7, v2, v9}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1825
    .line 1826
    .line 1827
    move-object/from16 v1, v16

    .line 1828
    .line 1829
    invoke-static {v12, v1, v11, v1, v8}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1830
    .line 1831
    .line 1832
    const-string v1, "ms"

    .line 1833
    .line 1834
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1835
    .line 1836
    .line 1837
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v1

    .line 1841
    invoke-static {v1, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1842
    .line 1843
    .line 1844
    iput-object v1, v10, Lzk0;->c:Ljava/lang/String;

    .line 1845
    .line 1846
    new-instance v1, Lr5;

    .line 1847
    .line 1848
    const/4 v2, 0x3

    .line 1849
    invoke-direct {v1, v15, v0, v2}, Lr5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v15, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1853
    .line 1854
    .line 1855
    iget-object v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 1856
    .line 1857
    if-eqz v0, :cond_2e

    .line 1858
    .line 1859
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    :try_start_13
    iget-object v0, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->H:Lc10;

    .line 1863
    .line 1864
    if-eqz v0, :cond_2d

    .line 1865
    .line 1866
    iget-object v1, v15, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->I:Ljava/util/ArrayList;

    .line 1867
    .line 1868
    if-eqz v1, :cond_2c

    .line 1869
    .line 1870
    invoke-static {v1}, Lzf;->i0(Ljava/util/List;)I

    .line 1871
    .line 1872
    .line 1873
    move-result v1

    .line 1874
    iget-object v0, v0, Lao0;->f:Lbo0;

    .line 1875
    .line 1876
    const/4 v5, 0x1

    .line 1877
    invoke-virtual {v0, v1, v5}, Lbo0;->d(II)V

    .line 1878
    .line 1879
    .line 1880
    goto :goto_21

    .line 1881
    :catch_d
    move-exception v0

    .line 1882
    goto :goto_1f

    .line 1883
    :cond_2c
    invoke-static/range {v26 .. v26}, Li30;->S(Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    throw v28

    .line 1887
    :cond_2d
    invoke-static/range {v30 .. v30}, Li30;->S(Ljava/lang/String;)V

    .line 1888
    .line 1889
    .line 1890
    throw v28
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_d

    .line 1891
    :goto_1f
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1892
    .line 1893
    .line 1894
    goto :goto_21

    .line 1895
    :cond_2e
    invoke-static/range {v26 .. v26}, Li30;->S(Ljava/lang/String;)V

    .line 1896
    .line 1897
    .line 1898
    throw v28

    .line 1899
    :cond_2f
    move-object/from16 v26, v11

    .line 1900
    .line 1901
    const/4 v5, 0x0

    .line 1902
    const/4 v9, 0x4

    .line 1903
    int-to-long v0, v5

    .line 1904
    :try_start_14
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_14
    .catch Ljava/lang/InterruptedException; {:try_start_14 .. :try_end_14} :catch_e

    .line 1905
    .line 1906
    .line 1907
    goto :goto_20

    .line 1908
    :catch_e
    move-exception v0

    .line 1909
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1910
    .line 1911
    .line 1912
    :goto_20
    move-object/from16 v1, p0

    .line 1913
    .line 1914
    move v6, v9

    .line 1915
    move-object/from16 v11, v26

    .line 1916
    .line 1917
    move-object/from16 v7, v28

    .line 1918
    .line 1919
    move-object/from16 v5, v30

    .line 1920
    .line 1921
    const/4 v9, 0x1

    .line 1922
    const/4 v10, 0x0

    .line 1923
    goto/16 :goto_e

    .line 1924
    .line 1925
    :catch_f
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;->L:I

    .line 1926
    .line 1927
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1928
    .line 1929
    .line 1930
    new-instance v0, Lxk0;

    .line 1931
    .line 1932
    invoke-direct {v0, v15, v8}, Lxk0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PingActivity;I)V

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v15, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1936
    .line 1937
    .line 1938
    :goto_21
    return-void

    .line 1939
    :pswitch_11
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 1940
    .line 1941
    move-object v2, v0

    .line 1942
    check-cast v2, Lg60;

    .line 1943
    .line 1944
    iget-object v3, v2, Lg60;->h:Llk;

    .line 1945
    .line 1946
    const/4 v10, 0x0

    .line 1947
    :cond_30
    :try_start_15
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 1948
    .line 1949
    check-cast v0, Ljava/lang/Runnable;

    .line 1950
    .line 1951
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    .line 1952
    .line 1953
    .line 1954
    goto :goto_22

    .line 1955
    :catchall_3
    move-exception v0

    .line 1956
    sget-object v5, Lls;->f:Lls;

    .line 1957
    .line 1958
    invoke-static {v5, v0}, Luk2;->q(Lhk;Ljava/lang/Throwable;)V

    .line 1959
    .line 1960
    .line 1961
    :goto_22
    invoke-virtual {v2}, Lg60;->m()Ljava/lang/Runnable;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v0

    .line 1965
    if-nez v0, :cond_31

    .line 1966
    .line 1967
    goto :goto_23

    .line 1968
    :cond_31
    iput-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 1969
    .line 1970
    const/16 v27, 0x1

    .line 1971
    .line 1972
    add-int/lit8 v10, v10, 0x1

    .line 1973
    .line 1974
    if-lt v10, v4, :cond_30

    .line 1975
    .line 1976
    invoke-virtual {v3}, Llk;->l()Z

    .line 1977
    .line 1978
    .line 1979
    move-result v0

    .line 1980
    if-eqz v0, :cond_30

    .line 1981
    .line 1982
    invoke-virtual {v3, v2, v1}, Llk;->k(Lhk;Ljava/lang/Runnable;)V

    .line 1983
    .line 1984
    .line 1985
    :goto_23
    return-void

    .line 1986
    :pswitch_12
    invoke-static {}, Lh80;->d()Lh80;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v0

    .line 1990
    sget v2, Lbo;->d:I

    .line 1991
    .line 1992
    iget-object v2, v1, Ljq3;->g:Ljava/lang/Object;

    .line 1993
    .line 1994
    check-cast v2, Loa1;

    .line 1995
    .line 1996
    const/4 v5, 0x0

    .line 1997
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 1998
    .line 1999
    invoke-virtual {v0, v3}, Lh80;->a([Ljava/lang/Throwable;)V

    .line 2000
    .line 2001
    .line 2002
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2003
    .line 2004
    check-cast v0, Lbo;

    .line 2005
    .line 2006
    iget-object v0, v0, Lbo;->a:Lzz;

    .line 2007
    .line 2008
    filled-new-array {v2}, [Loa1;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v2

    .line 2012
    invoke-virtual {v0, v2}, Lzz;->d([Loa1;)V

    .line 2013
    .line 2014
    .line 2015
    return-void

    .line 2016
    :pswitch_13
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2017
    .line 2018
    check-cast v0, Ljava/util/ArrayList;

    .line 2019
    .line 2020
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2021
    .line 2022
    check-cast v2, Llx0;

    .line 2023
    .line 2024
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2025
    .line 2026
    .line 2027
    move-result v3

    .line 2028
    if-eqz v3, :cond_32

    .line 2029
    .line 2030
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 2031
    .line 2032
    .line 2033
    iget-object v0, v2, Llx0;->c:Liw;

    .line 2034
    .line 2035
    iget-object v0, v0, Liw;->J:Landroid/view/View;

    .line 2036
    .line 2037
    iget v2, v2, Llx0;->a:I

    .line 2038
    .line 2039
    invoke-static {v0, v2}, Lex0;->a(Landroid/view/View;I)V

    .line 2040
    .line 2041
    .line 2042
    :cond_32
    return-void

    .line 2043
    :pswitch_14
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2044
    .line 2045
    check-cast v0, Lnl;

    .line 2046
    .line 2047
    iget-object v0, v0, Lnl;->g:Lil;

    .line 2048
    .line 2049
    iget-object v2, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2050
    .line 2051
    check-cast v2, Landroid/os/Bundle;

    .line 2052
    .line 2053
    invoke-virtual {v0, v2}, Lil;->d(Landroid/os/Bundle;)V

    .line 2054
    .line 2055
    .line 2056
    return-void

    .line 2057
    :pswitch_15
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2058
    .line 2059
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 2060
    .line 2061
    iget-object v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/Object;

    .line 2062
    .line 2063
    monitor-enter v2

    .line 2064
    :try_start_16
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2065
    .line 2066
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 2067
    .line 2068
    iget-boolean v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Z

    .line 2069
    .line 2070
    if-eqz v0, :cond_33

    .line 2071
    .line 2072
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2073
    .line 2074
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 2075
    .line 2076
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 2077
    .line 2078
    new-instance v3, Lp70;

    .line 2079
    .line 2080
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2081
    .line 2082
    .line 2083
    invoke-virtual {v0, v3}, Lou0;->i(Ljava/lang/Object;)Z

    .line 2084
    .line 2085
    .line 2086
    goto :goto_24

    .line 2087
    :cond_33
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2088
    .line 2089
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 2090
    .line 2091
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->n:Lou0;

    .line 2092
    .line 2093
    iget-object v3, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2094
    .line 2095
    check-cast v3, Ln70;

    .line 2096
    .line 2097
    invoke-virtual {v0, v3}, Lou0;->k(Ln70;)Z

    .line 2098
    .line 2099
    .line 2100
    :goto_24
    monitor-exit v2

    .line 2101
    return-void

    .line 2102
    :catchall_4
    move-exception v0

    .line 2103
    monitor-exit v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 2104
    throw v0

    .line 2105
    :pswitch_16
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2106
    .line 2107
    check-cast v0, Ljava/util/ArrayList;

    .line 2108
    .line 2109
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 2110
    .line 2111
    .line 2112
    move-result v2

    .line 2113
    const/4 v10, 0x0

    .line 2114
    :goto_25
    if-ge v10, v2, :cond_34

    .line 2115
    .line 2116
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v3

    .line 2120
    add-int/lit8 v10, v10, 0x1

    .line 2121
    .line 2122
    check-cast v3, Lzh;

    .line 2123
    .line 2124
    iget-object v4, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2125
    .line 2126
    check-cast v4, Loi;

    .line 2127
    .line 2128
    iget-object v4, v4, Loi;->e:Ljava/lang/Object;

    .line 2129
    .line 2130
    iput-object v4, v3, Lzh;->b:Ljava/lang/Object;

    .line 2131
    .line 2132
    iget-object v5, v3, Lzh;->d:Lyh;

    .line 2133
    .line 2134
    invoke-virtual {v3, v5, v4}, Lzh;->d(Lyh;Ljava/lang/Object;)V

    .line 2135
    .line 2136
    .line 2137
    goto :goto_25

    .line 2138
    :cond_34
    return-void

    .line 2139
    :pswitch_17
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2140
    .line 2141
    check-cast v0, Lf23;

    .line 2142
    .line 2143
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2144
    .line 2145
    check-cast v2, Landroid/graphics/Typeface;

    .line 2146
    .line 2147
    iget-object v0, v0, Lf23;->g:Ljava/lang/Object;

    .line 2148
    .line 2149
    check-cast v0, Lg82;

    .line 2150
    .line 2151
    if-eqz v0, :cond_35

    .line 2152
    .line 2153
    invoke-virtual {v0, v2}, Lg82;->p(Landroid/graphics/Typeface;)V

    .line 2154
    .line 2155
    .line 2156
    :cond_35
    return-void

    .line 2157
    :pswitch_18
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2158
    .line 2159
    iget-object v2, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2160
    .line 2161
    :try_start_17
    sget-object v3, Lj2;->d:Ljava/lang/reflect/Method;

    .line 2162
    .line 2163
    if-eqz v3, :cond_36

    .line 2164
    .line 2165
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2166
    .line 2167
    const-string v5, "AppCompat recreation"

    .line 2168
    .line 2169
    filled-new-array {v0, v4, v5}, [Ljava/lang/Object;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    invoke-virtual {v3, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2174
    .line 2175
    .line 2176
    goto :goto_28

    .line 2177
    :catchall_5
    move-exception v0

    .line 2178
    goto :goto_26

    .line 2179
    :catch_10
    move-exception v0

    .line 2180
    goto :goto_27

    .line 2181
    :cond_36
    sget-object v3, Lj2;->e:Ljava/lang/reflect/Method;

    .line 2182
    .line 2183
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2184
    .line 2185
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v0

    .line 2189
    invoke-virtual {v3, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_17
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_10
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    .line 2190
    .line 2191
    .line 2192
    goto :goto_28

    .line 2193
    :goto_26
    const-string v2, "ActivityRecreator"

    .line 2194
    .line 2195
    const-string v3, "Exception while invoking performStopActivity"

    .line 2196
    .line 2197
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 2198
    .line 2199
    .line 2200
    goto :goto_28

    .line 2201
    :goto_27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v2

    .line 2205
    const-class v3, Ljava/lang/RuntimeException;

    .line 2206
    .line 2207
    if-ne v2, v3, :cond_38

    .line 2208
    .line 2209
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v2

    .line 2213
    if-eqz v2, :cond_38

    .line 2214
    .line 2215
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v2

    .line 2219
    const-string v3, "Unable to stop"

    .line 2220
    .line 2221
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2222
    .line 2223
    .line 2224
    move-result v2

    .line 2225
    if-nez v2, :cond_37

    .line 2226
    .line 2227
    goto :goto_28

    .line 2228
    :cond_37
    throw v0

    .line 2229
    :cond_38
    :goto_28
    return-void

    .line 2230
    :pswitch_19
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2231
    .line 2232
    check-cast v0, Landroid/app/Application;

    .line 2233
    .line 2234
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2235
    .line 2236
    check-cast v2, Li2;

    .line 2237
    .line 2238
    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 2239
    .line 2240
    .line 2241
    return-void

    .line 2242
    :pswitch_1a
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2243
    .line 2244
    check-cast v0, Li2;

    .line 2245
    .line 2246
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2247
    .line 2248
    iput-object v2, v0, Li2;->f:Ljava/lang/Object;

    .line 2249
    .line 2250
    return-void

    .line 2251
    :pswitch_1b
    move-object/from16 v28, v7

    .line 2252
    .line 2253
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2254
    .line 2255
    check-cast v0, Lv1;

    .line 2256
    .line 2257
    iget-object v2, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2258
    .line 2259
    check-cast v2, Ly1;

    .line 2260
    .line 2261
    iget-object v3, v2, Ly1;->h:Lod0;

    .line 2262
    .line 2263
    if-eqz v3, :cond_39

    .line 2264
    .line 2265
    iget-object v4, v3, Lod0;->e:Lmd0;

    .line 2266
    .line 2267
    if-eqz v4, :cond_39

    .line 2268
    .line 2269
    invoke-interface {v4, v3}, Lmd0;->n(Lod0;)V

    .line 2270
    .line 2271
    .line 2272
    :cond_39
    iget-object v3, v2, Ly1;->m:Lhe0;

    .line 2273
    .line 2274
    check-cast v3, Landroid/view/View;

    .line 2275
    .line 2276
    if-eqz v3, :cond_3b

    .line 2277
    .line 2278
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v3

    .line 2282
    if-eqz v3, :cond_3b

    .line 2283
    .line 2284
    invoke-virtual {v0}, Lzd0;->b()Z

    .line 2285
    .line 2286
    .line 2287
    move-result v3

    .line 2288
    if-eqz v3, :cond_3a

    .line 2289
    .line 2290
    goto :goto_2a

    .line 2291
    :cond_3a
    iget-object v3, v0, Lzd0;->e:Landroid/view/View;

    .line 2292
    .line 2293
    if-nez v3, :cond_3c

    .line 2294
    .line 2295
    :cond_3b
    :goto_29
    move-object/from16 v3, v28

    .line 2296
    .line 2297
    goto :goto_2b

    .line 2298
    :cond_3c
    const/4 v5, 0x0

    .line 2299
    invoke-virtual {v0, v5, v5, v5, v5}, Lzd0;->d(IIZZ)V

    .line 2300
    .line 2301
    .line 2302
    :goto_2a
    iput-object v0, v2, Ly1;->x:Lv1;

    .line 2303
    .line 2304
    goto :goto_29

    .line 2305
    :goto_2b
    iput-object v3, v2, Ly1;->z:Ljq3;

    .line 2306
    .line 2307
    return-void

    .line 2308
    :pswitch_1c
    iget-object v0, v1, Ljq3;->h:Ljava/lang/Object;

    .line 2309
    .line 2310
    move-object v2, v0

    .line 2311
    check-cast v2, Liq3;

    .line 2312
    .line 2313
    iget-object v0, v1, Ljq3;->g:Ljava/lang/Object;

    .line 2314
    .line 2315
    check-cast v0, Ljava/util/concurrent/Future;

    .line 2316
    .line 2317
    instance-of v3, v0, Lbr3;

    .line 2318
    .line 2319
    if-eqz v3, :cond_3e

    .line 2320
    .line 2321
    move-object v3, v0

    .line 2322
    check-cast v3, Lbr3;

    .line 2323
    .line 2324
    invoke-virtual {v3}, Lbr3;->a()Ljava/lang/Throwable;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v3

    .line 2328
    if-nez v3, :cond_3d

    .line 2329
    .line 2330
    goto :goto_2c

    .line 2331
    :cond_3d
    invoke-interface {v2, v3}, Liq3;->s(Ljava/lang/Throwable;)V

    .line 2332
    .line 2333
    .line 2334
    goto :goto_2d

    .line 2335
    :cond_3e
    :goto_2c
    :try_start_18
    invoke-static {v0}, Lpu1;->R(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v0
    :try_end_18
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_18 .. :try_end_18} :catch_11
    .catchall {:try_start_18 .. :try_end_18} :catchall_6

    .line 2339
    invoke-interface {v2, v0}, Liq3;->p(Ljava/lang/Object;)V

    .line 2340
    .line 2341
    .line 2342
    goto :goto_2d

    .line 2343
    :catchall_6
    move-exception v0

    .line 2344
    invoke-interface {v2, v0}, Liq3;->s(Ljava/lang/Throwable;)V

    .line 2345
    .line 2346
    .line 2347
    goto :goto_2d

    .line 2348
    :catch_11
    move-exception v0

    .line 2349
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v0

    .line 2353
    invoke-interface {v2, v0}, Liq3;->s(Ljava/lang/Throwable;)V

    .line 2354
    .line 2355
    .line 2356
    :goto_2d
    return-void

    .line 2357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ljq3;->f:I

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
    new-instance v0, Lpb3;

    .line 12
    .line 13
    const-class v1, Ljq3;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Lpb3;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ljq3;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Liq3;

    .line 25
    .line 26
    new-instance v2, Lwt2;

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    invoke-direct {v2, v3}, Lwt2;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v0, Lpb3;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Lwt2;

    .line 35
    .line 36
    iput-object v2, v3, Lwt2;->h:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v2, v0, Lpb3;->i:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, v2, Lwt2;->g:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v0}, Lpb3;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
