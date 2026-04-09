.class public final Lae4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final c:Lae4;

.field public static final d:Lsn3;

.field public static final e:Lxn3;


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lae4;

    .line 2
    .line 3
    sget-object v1, Lyd4;->d:Lyd4;

    .line 4
    .line 5
    invoke-static {v1}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lae4;-><init>(Lsn3;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lae4;->c:Lae4;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x6

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v3, 0x3

    .line 34
    invoke-static {v0, v3}, Lwl2;->G([Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lae4;->d:Lsn3;

    .line 42
    .line 43
    new-instance v0, Lso1;

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    invoke-direct {v0, v3}, Lso1;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x11

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1, v2}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x7

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1, v2}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/16 v1, 0x1e

    .line 70
    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/16 v3, 0xa

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v0, v1, v3}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0x12

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1, v2}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/16 v1, 0x8

    .line 94
    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, v2, v1}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1, v1}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const/16 v2, 0xe

    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v0, v2, v1}, Lso1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lso1;->u()Lxn3;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, Lae4;->e:Lxn3;

    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>(Lsn3;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    iget v2, p1, Lsn3;->i:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lsn3;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lyd4;

    .line 22
    .line 23
    iget-object v3, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 24
    .line 25
    iget v4, v2, Lyd4;->a:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v0

    .line 34
    :goto_1
    iget-object v1, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge v0, v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lyd4;

    .line 49
    .line 50
    iget v1, v1, Lyd4;->b:I

    .line 51
    .line 52
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iput p1, p0, Lae4;->b:I

    .line 60
    .line 61
    return-void
.end method

.method public static a(Landroid/content/Context;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0, p1, p2}, Lae4;->b(Landroid/content/Context;Landroid/content/Intent;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-static/range {p0 .. p0}, Lbd2;->B(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/16 v4, 0x21

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    move-object/from16 v7, p3

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-lt v6, v4, :cond_2

    .line 24
    .line 25
    invoke-virtual/range {p2 .. p2}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v3, v6}, Lt0;->p(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Landroid/media/AudioDeviceInfo;

    .line 45
    .line 46
    move-object v7, v6

    .line 47
    :cond_2
    :goto_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    sget-object v8, Lae4;->e:Lxn3;

    .line 50
    .line 51
    const/16 v9, 0xc

    .line 52
    .line 53
    const-string v10, "android.hardware.type.automotive"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    const/4 v12, 0x1

    .line 57
    if-lt v6, v4, :cond_b

    .line 58
    .line 59
    invoke-static/range {p0 .. p0}, Lv23;->h(Landroid/content/Context;)Z

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-nez v13, :cond_3

    .line 64
    .line 65
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    invoke-virtual {v13, v10}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-eqz v13, :cond_b

    .line 74
    .line 75
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v3, v0}, Lt0;->k(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lae4;

    .line 84
    .line 85
    new-instance v3, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v4, Ljava/util/HashSet;

    .line 91
    .line 92
    filled-new-array {v9}, [I

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v6}, Lzt0;->Z([I)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move v2, v5

    .line 107
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-ge v2, v4, :cond_8

    .line 112
    .line 113
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v4}, Lqd4;->c(Ljava/lang/Object;)Landroid/media/AudioProfile;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-static {v4}, Lqd4;->a(Landroid/media/AudioProfile;)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-ne v6, v12, :cond_4

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-static {v4}, Lqd4;->A(Landroid/media/AudioProfile;)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    invoke-static {v6}, Lv23;->a(I)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-nez v7, :cond_5

    .line 137
    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v8, v7}, Lxn3;->containsKey(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_7

    .line 147
    .line 148
    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_6

    .line 157
    .line 158
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    check-cast v6, Ljava/util/Set;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v4}, Lzd4;->d(Landroid/media/AudioProfile;)[I

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v4}, Lzt0;->Z([I)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-interface {v6, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    new-instance v7, Ljava/util/HashSet;

    .line 180
    .line 181
    invoke-static {v4}, Lzd4;->d(Landroid/media/AudioProfile;)[I

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-static {v4}, Lzt0;->Z([I)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-direct {v7, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_8
    sget-object v0, Lxm3;->g:Lvm3;

    .line 199
    .line 200
    const-string v0, "initialCapacity"

    .line 201
    .line 202
    invoke-static {v0, v11}, Lob1;->z(Ljava/lang/String;I)V

    .line 203
    .line 204
    .line 205
    new-array v0, v11, [Ljava/lang/Object;

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_a

    .line 220
    .line 221
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Ljava/util/Map$Entry;

    .line 226
    .line 227
    new-instance v4, Lyd4;

    .line 228
    .line 229
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    check-cast v6, Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, Ljava/util/Set;

    .line 244
    .line 245
    invoke-direct {v4, v6, v3}, Lyd4;-><init>(ILjava/util/Set;)V

    .line 246
    .line 247
    .line 248
    array-length v3, v0

    .line 249
    add-int/lit8 v6, v5, 0x1

    .line 250
    .line 251
    invoke-static {v3, v6}, Lrm3;->d(II)I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-gt v7, v3, :cond_9

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :cond_9
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    :goto_4
    aput-object v4, v0, v5

    .line 263
    .line 264
    move v5, v6

    .line 265
    goto :goto_3

    .line 266
    :cond_a
    invoke-static {v0, v5}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-direct {v1, v0}, Lae4;-><init>(Lsn3;)V

    .line 271
    .line 272
    .line 273
    return-object v1

    .line 274
    :cond_b
    if-nez v7, :cond_c

    .line 275
    .line 276
    invoke-virtual {v3, v1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    goto :goto_5

    .line 281
    :cond_c
    new-array v3, v12, [Landroid/media/AudioDeviceInfo;

    .line 282
    .line 283
    aput-object v7, v3, v5

    .line 284
    .line 285
    :goto_5
    new-instance v7, Lcn3;

    .line 286
    .line 287
    invoke-direct {v7, v11}, Lrm3;-><init>(I)V

    .line 288
    .line 289
    .line 290
    const/16 v13, 0x8

    .line 291
    .line 292
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    const/4 v14, 0x7

    .line 297
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v14

    .line 301
    filled-new-array {v13, v14}, [Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    iget-object v14, v7, Lcn3;->d:[Ljava/lang/Object;

    .line 306
    .line 307
    if-eqz v14, :cond_d

    .line 308
    .line 309
    move v14, v5

    .line 310
    :goto_6
    if-ge v14, v1, :cond_e

    .line 311
    .line 312
    aget-object v15, v13, v14

    .line 313
    .line 314
    invoke-virtual {v7, v15}, Lcn3;->f(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    add-int/lit8 v14, v14, 0x1

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_d
    invoke-static {v13, v1}, Lwl2;->G([Ljava/lang/Object;I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7, v1}, Lrm3;->e(I)V

    .line 324
    .line 325
    .line 326
    iget-object v14, v7, Lrm3;->a:[Ljava/lang/Object;

    .line 327
    .line 328
    iget v15, v7, Lrm3;->b:I

    .line 329
    .line 330
    invoke-static {v13, v5, v14, v15, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 331
    .line 332
    .line 333
    iget v13, v7, Lrm3;->b:I

    .line 334
    .line 335
    add-int/2addr v13, v1

    .line 336
    iput v13, v7, Lrm3;->b:I

    .line 337
    .line 338
    :cond_e
    const/16 v13, 0x1f

    .line 339
    .line 340
    if-lt v6, v13, :cond_10

    .line 341
    .line 342
    const/16 v13, 0x1a

    .line 343
    .line 344
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    const/16 v14, 0x1b

    .line 349
    .line 350
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    filled-new-array {v13, v14}, [Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v13

    .line 358
    iget-object v14, v7, Lcn3;->d:[Ljava/lang/Object;

    .line 359
    .line 360
    if-eqz v14, :cond_f

    .line 361
    .line 362
    move v14, v5

    .line 363
    :goto_7
    if-ge v14, v1, :cond_10

    .line 364
    .line 365
    aget-object v15, v13, v14

    .line 366
    .line 367
    invoke-virtual {v7, v15}, Lcn3;->f(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    add-int/lit8 v14, v14, 0x1

    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_f
    invoke-static {v13, v1}, Lwl2;->G([Ljava/lang/Object;I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v7, v1}, Lrm3;->e(I)V

    .line 377
    .line 378
    .line 379
    iget-object v14, v7, Lrm3;->a:[Ljava/lang/Object;

    .line 380
    .line 381
    iget v15, v7, Lrm3;->b:I

    .line 382
    .line 383
    invoke-static {v13, v5, v14, v15, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 384
    .line 385
    .line 386
    iget v13, v7, Lrm3;->b:I

    .line 387
    .line 388
    add-int/2addr v13, v1

    .line 389
    iput v13, v7, Lrm3;->b:I

    .line 390
    .line 391
    :cond_10
    if-lt v6, v4, :cond_11

    .line 392
    .line 393
    const/16 v1, 0x1e

    .line 394
    .line 395
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v7, v1}, Lcn3;->f(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_11
    invoke-virtual {v7}, Lcn3;->h()Ldn3;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    array-length v4, v3

    .line 407
    move v6, v5

    .line 408
    :goto_8
    if-ge v6, v4, :cond_13

    .line 409
    .line 410
    aget-object v7, v3, v6

    .line 411
    .line 412
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-virtual {v1, v7}, Ltm3;->contains(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-eqz v7, :cond_12

    .line 425
    .line 426
    sget-object v0, Lae4;->c:Lae4;

    .line 427
    .line 428
    return-object v0

    .line 429
    :cond_12
    add-int/lit8 v6, v6, 0x1

    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_13
    new-instance v1, Lcn3;

    .line 433
    .line 434
    invoke-direct {v1, v11}, Lrm3;-><init>(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, v2}, Lcn3;->f(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 441
    .line 442
    const/16 v4, 0x1d

    .line 443
    .line 444
    const/16 v6, 0xa

    .line 445
    .line 446
    if-lt v3, v4, :cond_18

    .line 447
    .line 448
    invoke-static/range {p0 .. p0}, Lv23;->h(Landroid/content/Context;)Z

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    if-nez v3, :cond_14

    .line 453
    .line 454
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    invoke-virtual {v3, v10}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    if-eqz v3, :cond_18

    .line 463
    .line 464
    :cond_14
    sget-object v0, Lxm3;->g:Lvm3;

    .line 465
    .line 466
    new-instance v0, Lum3;

    .line 467
    .line 468
    invoke-direct {v0, v11}, Lrm3;-><init>(I)V

    .line 469
    .line 470
    .line 471
    iget-object v3, v8, Lxn3;->g:Lvn3;

    .line 472
    .line 473
    if-nez v3, :cond_15

    .line 474
    .line 475
    iget v3, v8, Lxn3;->k:I

    .line 476
    .line 477
    new-instance v4, Lwn3;

    .line 478
    .line 479
    iget-object v7, v8, Lxn3;->j:[Ljava/lang/Object;

    .line 480
    .line 481
    invoke-direct {v4, v7, v5, v3}, Lwn3;-><init>([Ljava/lang/Object;II)V

    .line 482
    .line 483
    .line 484
    new-instance v3, Lvn3;

    .line 485
    .line 486
    invoke-direct {v3, v8, v4}, Lvn3;-><init>(Lxn3;Lwn3;)V

    .line 487
    .line 488
    .line 489
    iput-object v3, v8, Lxn3;->g:Lvn3;

    .line 490
    .line 491
    :cond_15
    invoke-virtual {v3}, Lvn3;->a()Lyq2;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    :cond_16
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    if-eqz v4, :cond_17

    .line 500
    .line 501
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    check-cast v4, Ljava/lang/Integer;

    .line 506
    .line 507
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    invoke-static {v5}, Lv23;->c(I)I

    .line 512
    .line 513
    .line 514
    move-result v7

    .line 515
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 516
    .line 517
    if-lt v8, v7, :cond_16

    .line 518
    .line 519
    new-instance v7, Landroid/media/AudioFormat$Builder;

    .line 520
    .line 521
    invoke-direct {v7}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v7, v9}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    invoke-virtual {v7, v5}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    const v7, 0xbb80

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v7}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    invoke-virtual {v5}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    invoke-virtual/range {p2 .. p2}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    invoke-static {v5, v7}, Li71;->s(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    if-eqz v5, :cond_16

    .line 552
    .line 553
    invoke-virtual {v0, v4}, Lrm3;->a(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    goto :goto_9

    .line 557
    :cond_17
    invoke-virtual {v0, v2}, Lrm3;->a(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Lum3;->f()Lsn3;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v1, v0}, Lcn3;->g(Ljava/lang/Iterable;)V

    .line 565
    .line 566
    .line 567
    new-instance v0, Lae4;

    .line 568
    .line 569
    invoke-virtual {v1}, Lcn3;->h()Ldn3;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-static {v1}, Lzt0;->Y(Ldn3;)[I

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-static {v1, v6}, Lae4;->d([II)Lsn3;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-direct {v0, v1}, Lae4;-><init>(Lsn3;)V

    .line 582
    .line 583
    .line 584
    return-object v0

    .line 585
    :cond_18
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const-string v3, "use_external_surround_sound_flag"

    .line 590
    .line 591
    invoke-static {v2, v3, v5}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    if-ne v3, v12, :cond_19

    .line 596
    .line 597
    move v3, v12

    .line 598
    goto :goto_a

    .line 599
    :cond_19
    move v3, v5

    .line 600
    :goto_a
    if-nez v3, :cond_1a

    .line 601
    .line 602
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 603
    .line 604
    const-string v7, "Amazon"

    .line 605
    .line 606
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    if-nez v7, :cond_1a

    .line 611
    .line 612
    const-string v7, "Xiaomi"

    .line 613
    .line 614
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    if-eqz v4, :cond_1b

    .line 619
    .line 620
    :cond_1a
    const-string v4, "external_surround_sound_enabled"

    .line 621
    .line 622
    invoke-static {v2, v4, v5}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    if-ne v2, v12, :cond_1b

    .line 627
    .line 628
    sget-object v2, Lae4;->d:Lsn3;

    .line 629
    .line 630
    invoke-virtual {v1, v2}, Lcn3;->g(Ljava/lang/Iterable;)V

    .line 631
    .line 632
    .line 633
    :cond_1b
    if-eqz v0, :cond_1d

    .line 634
    .line 635
    if-nez v3, :cond_1d

    .line 636
    .line 637
    const-string v2, "android.media.extra.AUDIO_PLUG_STATE"

    .line 638
    .line 639
    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    if-ne v2, v12, :cond_1d

    .line 644
    .line 645
    const-string v2, "android.media.extra.ENCODINGS"

    .line 646
    .line 647
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    if-eqz v2, :cond_1c

    .line 652
    .line 653
    invoke-static {v2}, Lzt0;->Z([I)Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-virtual {v1, v2}, Lcn3;->g(Ljava/lang/Iterable;)V

    .line 658
    .line 659
    .line 660
    :cond_1c
    new-instance v2, Lae4;

    .line 661
    .line 662
    invoke-virtual {v1}, Lcn3;->h()Ldn3;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-static {v1}, Lzt0;->Y(Ldn3;)[I

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    const-string v3, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 671
    .line 672
    invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    invoke-static {v1, v0}, Lae4;->d([II)Lsn3;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-direct {v2, v0}, Lae4;-><init>(Lsn3;)V

    .line 681
    .line 682
    .line 683
    return-object v2

    .line 684
    :cond_1d
    new-instance v0, Lae4;

    .line 685
    .line 686
    invoke-virtual {v1}, Lcn3;->h()Ldn3;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    invoke-static {v1}, Lzt0;->Y(Ldn3;)[I

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-static {v1, v6}, Lae4;->d([II)Lsn3;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    invoke-direct {v0, v1}, Lae4;-><init>(Lsn3;)V

    .line 699
    .line 700
    .line 701
    return-object v0
.end method

.method public static d([II)Lsn3;
    .locals 7

    .line 1
    sget-object v0, Lxm3;->g:Lvm3;

    .line 2
    .line 3
    const-string v0, "initialCapacity"

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-static {v0, v1}, Lob1;->z(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-array v0, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    array-length v3, p0

    .line 14
    if-ge v1, v3, :cond_1

    .line 15
    .line 16
    aget v3, p0, v1

    .line 17
    .line 18
    new-instance v4, Lyd4;

    .line 19
    .line 20
    invoke-direct {v4, v3, p1}, Lyd4;-><init>(II)V

    .line 21
    .line 22
    .line 23
    array-length v3, v0

    .line 24
    add-int/lit8 v5, v2, 0x1

    .line 25
    .line 26
    invoke-static {v3, v5}, Lrm3;->d(II)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-gt v6, v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_1
    aput-object v4, v0, v2

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    move v2, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v0, v2}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method


# virtual methods
.method public final c(Lph4;Lin2;)Landroid/util/Pair;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Lph4;->m:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lph4;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lpp1;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v4, Lae4;->e:Lxn3;

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Lxn3;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    move-object/from16 v7, p0

    .line 27
    .line 28
    goto/16 :goto_9

    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x7

    .line 31
    const/16 v5, 0x8

    .line 32
    .line 33
    const/4 v6, 0x6

    .line 34
    move-object/from16 v7, p0

    .line 35
    .line 36
    iget-object v8, v7, Lae4;->a:Landroid/util/SparseArray;

    .line 37
    .line 38
    const/16 v9, 0x12

    .line 39
    .line 40
    if-ne v2, v9, :cond_2

    .line 41
    .line 42
    invoke-virtual {v8, v9}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ltz v2, :cond_1

    .line 47
    .line 48
    move v2, v9

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_0
    if-ne v2, v5, :cond_4

    .line 53
    .line 54
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-ltz v2, :cond_3

    .line 59
    .line 60
    move v2, v5

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v2, v3

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    :goto_1
    const/16 v10, 0x1e

    .line 65
    .line 66
    if-ne v2, v10, :cond_5

    .line 67
    .line 68
    invoke-virtual {v8, v10}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    if-ltz v10, :cond_3

    .line 73
    .line 74
    :cond_5
    :goto_2
    invoke-virtual {v8, v2}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-ltz v10, :cond_18

    .line 79
    .line 80
    invoke-virtual {v8, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Lyd4;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget v10, v8, Lyd4;->b:I

    .line 90
    .line 91
    iget-object v11, v8, Lyd4;->c:Ldn3;

    .line 92
    .line 93
    iget v12, v0, Lph4;->E:I

    .line 94
    .line 95
    const/4 v13, 0x1

    .line 96
    const/4 v14, 0x0

    .line 97
    const/16 v15, 0xa

    .line 98
    .line 99
    const/4 v5, -0x1

    .line 100
    if-eq v12, v5, :cond_b

    .line 101
    .line 102
    if-ne v2, v9, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    const-string v0, "audio/vnd.dts.uhd;profile=p2"

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    const/16 v1, 0x21

    .line 116
    .line 117
    if-ge v0, v1, :cond_7

    .line 118
    .line 119
    if-le v12, v15, :cond_13

    .line 120
    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_7
    if-nez v11, :cond_8

    .line 124
    .line 125
    if-gt v12, v10, :cond_a

    .line 126
    .line 127
    move v14, v13

    .line 128
    goto :goto_3

    .line 129
    :cond_8
    invoke-static {v12}, Lv23;->b(I)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_9

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v11, v0}, Ltm3;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    :cond_a
    :goto_3
    if-nez v14, :cond_13

    .line 145
    .line 146
    goto/16 :goto_9

    .line 147
    .line 148
    :cond_b
    :goto_4
    iget v0, v0, Lph4;->F:I

    .line 149
    .line 150
    if-ne v0, v5, :cond_c

    .line 151
    .line 152
    const v0, 0xbb80

    .line 153
    .line 154
    .line 155
    :cond_c
    iget v1, v8, Lyd4;->a:I

    .line 156
    .line 157
    if-eqz v11, :cond_d

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_d
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 161
    .line 162
    const/16 v8, 0x1d

    .line 163
    .line 164
    if-lt v5, v8, :cond_11

    .line 165
    .line 166
    move v10, v15

    .line 167
    :goto_5
    if-lez v10, :cond_10

    .line 168
    .line 169
    invoke-static {v10}, Lv23;->b(I)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_e

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_e
    new-instance v5, Landroid/media/AudioFormat$Builder;

    .line 177
    .line 178
    invoke-direct {v5}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, v1}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v5, v0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5, v4}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v4}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual/range {p2 .. p2}, Lin2;->a()Landroid/media/AudioAttributes;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {v4, v5}, Li71;->s(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_f

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_f
    :goto_6
    add-int/lit8 v10, v10, -0x1

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_10
    move v10, v14

    .line 212
    goto :goto_7

    .line 213
    :cond_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {v4, v0}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-eqz v0, :cond_12

    .line 226
    .line 227
    move-object v1, v0

    .line 228
    :cond_12
    check-cast v1, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    :goto_7
    move v12, v10

    .line 235
    :cond_13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 236
    .line 237
    const/16 v1, 0x1c

    .line 238
    .line 239
    if-gt v0, v1, :cond_16

    .line 240
    .line 241
    if-ne v12, v3, :cond_14

    .line 242
    .line 243
    const/16 v5, 0x8

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_14
    const/4 v1, 0x3

    .line 247
    if-eq v12, v1, :cond_15

    .line 248
    .line 249
    const/4 v1, 0x4

    .line 250
    if-eq v12, v1, :cond_15

    .line 251
    .line 252
    const/4 v1, 0x5

    .line 253
    if-ne v12, v1, :cond_16

    .line 254
    .line 255
    :cond_15
    move v5, v6

    .line 256
    goto :goto_8

    .line 257
    :cond_16
    move v5, v12

    .line 258
    :goto_8
    const/16 v1, 0x1a

    .line 259
    .line 260
    if-gt v0, v1, :cond_17

    .line 261
    .line 262
    const-string v0, "fugu"

    .line 263
    .line 264
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_17

    .line 271
    .line 272
    if-ne v5, v13, :cond_17

    .line 273
    .line 274
    const/4 v5, 0x2

    .line 275
    :cond_17
    invoke-static {v5}, Lv23;->b(I)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_18

    .line 280
    .line 281
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :cond_18
    :goto_9
    const/4 v0, 0x0

    .line 295
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Lae4;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_1
    check-cast p1, Lae4;

    .line 11
    .line 12
    iget-object v0, p1, Lae4;->a:Landroid/util/SparseArray;

    .line 13
    .line 14
    sget-object v2, Lv23;->a:Ljava/lang/String;

    .line 15
    .line 16
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v3, 0x1f

    .line 19
    .line 20
    iget-object v4, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 21
    .line 22
    if-lt v2, v3, :cond_2

    .line 23
    .line 24
    invoke-static {v4, v0}, Lqd4;->z(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ne v2, v3, :cond_4

    .line 40
    .line 41
    move v3, v1

    .line 42
    :goto_0
    if-ge v3, v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    iget v0, p0, Lae4;->b:I

    .line 66
    .line 67
    iget p1, p1, Lae4;->b:I

    .line 68
    .line 69
    if-ne v0, p1, :cond_4

    .line 70
    .line 71
    :goto_2
    const/4 p1, 0x1

    .line 72
    return p1

    .line 73
    :cond_4
    :goto_3
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    iget-object v1, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 6
    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    if-lt v0, v2, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lqd4;->b(Landroid/util/SparseArray;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    const/16 v3, 0x11

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge v0, v4, :cond_1

    .line 24
    .line 25
    mul-int/lit8 v3, v3, 0x1f

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    add-int/2addr v4, v3

    .line 32
    mul-int/2addr v4, v2

    .line 33
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/2addr v3, v4

    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v0, v3

    .line 46
    :goto_1
    iget v1, p0, Lae4;->b:I

    .line 47
    .line 48
    mul-int/2addr v0, v2

    .line 49
    add-int/2addr v0, v1

    .line 50
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lae4;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lae4;->b:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-int/lit8 v2, v2, 0x32

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const-string v2, "AudioCapabilities[maxChannelCount="

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", audioProfiles="

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "]"

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method
