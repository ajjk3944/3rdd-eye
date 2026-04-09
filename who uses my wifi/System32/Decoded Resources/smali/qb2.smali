.class public final Lqb2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lsb2;


# static fields
.field public static final l:Ljava/util/List;


# instance fields
.field public final a:Ly74;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Landroid/content/Context;

.field public f:Z

.field public final g:Lrb2;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/util/HashSet;

.field public j:Z

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lqb2;->l:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le51;Lrb2;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lqb2;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lqb2;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lqb2;->h:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v0, Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lqb2;->i:Ljava/util/HashSet;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lqb2;->j:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Lqb2;->k:Z

    .line 36
    .line 37
    const-string v0, "SafeBrowsing config is not present."

    .line 38
    .line 39
    invoke-static {p3, v0}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_0
    iput-object p1, p0, Lqb2;->e:Landroid/content/Context;

    .line 53
    .line 54
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lqb2;->b:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    iput-object p3, p0, Lqb2;->g:Lrb2;

    .line 62
    .line 63
    iget-object p1, p3, Lrb2;->j:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    if-eqz p3, :cond_1

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    check-cast p3, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v0, p0, Lqb2;->i:Ljava/util/HashSet;

    .line 82
    .line 83
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 84
    .line 85
    invoke-virtual {p3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {v0, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object p1, p0, Lqb2;->i:Ljava/util/HashSet;

    .line 94
    .line 95
    const-string p3, "cookie"

    .line 96
    .line 97
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 98
    .line 99
    invoke-virtual {p3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lc94;->D()Ly74;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ln54;->b()V

    .line 111
    .line 112
    .line 113
    iget-object p3, p1, Ln54;->g:Lp54;

    .line 114
    .line 115
    check-cast p3, Lc94;

    .line 116
    .line 117
    const/16 v0, 0x9

    .line 118
    .line 119
    invoke-virtual {p3, v0}, Lc94;->O(I)V

    .line 120
    .line 121
    .line 122
    if-eqz p4, :cond_2

    .line 123
    .line 124
    invoke-virtual {p1}, Ln54;->b()V

    .line 125
    .line 126
    .line 127
    iget-object p3, p1, Ln54;->g:Lp54;

    .line 128
    .line 129
    check-cast p3, Lc94;

    .line 130
    .line 131
    invoke-virtual {p3, p4}, Lc94;->E(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ln54;->b()V

    .line 135
    .line 136
    .line 137
    iget-object p3, p1, Ln54;->g:Lp54;

    .line 138
    .line 139
    check-cast p3, Lc94;

    .line 140
    .line 141
    invoke-virtual {p3, p4}, Lc94;->F(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_2
    invoke-static {}, La84;->A()Lz74;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    iget-object p4, p0, Lqb2;->g:Lrb2;

    .line 149
    .line 150
    iget-object p4, p4, Lrb2;->f:Ljava/lang/String;

    .line 151
    .line 152
    if-eqz p4, :cond_3

    .line 153
    .line 154
    invoke-virtual {p3}, Ln54;->b()V

    .line 155
    .line 156
    .line 157
    iget-object v0, p3, Ln54;->g:Lp54;

    .line 158
    .line 159
    check-cast v0, La84;

    .line 160
    .line 161
    invoke-virtual {v0, p4}, La84;->B(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    invoke-virtual {p3}, Ln54;->d()Lp54;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    check-cast p3, La84;

    .line 169
    .line 170
    invoke-virtual {p1}, Ln54;->b()V

    .line 171
    .line 172
    .line 173
    iget-object p4, p1, Ln54;->g:Lp54;

    .line 174
    .line 175
    check-cast p4, Lc94;

    .line 176
    .line 177
    invoke-virtual {p4, p3}, Lc94;->G(La84;)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lx84;->A()Lw84;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    iget-object p4, p0, Lqb2;->e:Landroid/content/Context;

    .line 185
    .line 186
    invoke-static {p4}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 187
    .line 188
    .line 189
    move-result-object p4

    .line 190
    invoke-virtual {p4}, Lzj0;->d()Z

    .line 191
    .line 192
    .line 193
    move-result p4

    .line 194
    invoke-virtual {p3}, Ln54;->b()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p3, Ln54;->g:Lp54;

    .line 198
    .line 199
    check-cast v0, Lx84;

    .line 200
    .line 201
    invoke-virtual {v0, p4}, Lx84;->D(Z)V

    .line 202
    .line 203
    .line 204
    iget-object p2, p2, Le51;->f:Ljava/lang/String;

    .line 205
    .line 206
    if-eqz p2, :cond_4

    .line 207
    .line 208
    invoke-virtual {p3}, Ln54;->b()V

    .line 209
    .line 210
    .line 211
    iget-object p4, p3, Ln54;->g:Lp54;

    .line 212
    .line 213
    check-cast p4, Lx84;

    .line 214
    .line 215
    invoke-virtual {p4, p2}, Lx84;->B(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :cond_4
    sget-object p2, Lgz;->b:Lgz;

    .line 219
    .line 220
    iget-object p4, p0, Lqb2;->e:Landroid/content/Context;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {p4}, Lgz;->a(Landroid/content/Context;)I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    int-to-long v0, p2

    .line 230
    const-wide/16 v2, 0x0

    .line 231
    .line 232
    cmp-long p2, v0, v2

    .line 233
    .line 234
    if-lez p2, :cond_5

    .line 235
    .line 236
    invoke-virtual {p3}, Ln54;->b()V

    .line 237
    .line 238
    .line 239
    iget-object p2, p3, Ln54;->g:Lp54;

    .line 240
    .line 241
    check-cast p2, Lx84;

    .line 242
    .line 243
    invoke-virtual {p2, v0, v1}, Lx84;->C(J)V

    .line 244
    .line 245
    .line 246
    :cond_5
    invoke-virtual {p3}, Ln54;->d()Lp54;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    check-cast p2, Lx84;

    .line 251
    .line 252
    invoke-virtual {p1}, Ln54;->b()V

    .line 253
    .line 254
    .line 255
    iget-object p3, p1, Ln54;->g:Lp54;

    .line 256
    .line 257
    check-cast p3, Lc94;

    .line 258
    .line 259
    invoke-virtual {p3, p2}, Lc94;->L(Lx84;)V

    .line 260
    .line 261
    .line 262
    iput-object p1, p0, Lqb2;->a:Ly74;

    .line 263
    .line 264
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lqb2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lqb2;->a:Ly74;

    .line 7
    .line 8
    invoke-virtual {p1}, Ln54;->b()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 12
    .line 13
    check-cast p1, Lc94;

    .line 14
    .line 15
    invoke-virtual {p1}, Lc94;->J()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v1, p0, Lqb2;->a:Ly74;

    .line 22
    .line 23
    invoke-virtual {v1}, Ln54;->b()V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Ln54;->g:Lp54;

    .line 27
    .line 28
    check-cast v1, Lc94;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lc94;->I(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1
.end method

.method public final b(Ljava/lang/String;Ljava/util/Map;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lqb2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x3

    .line 6
    if-ne p3, v2, :cond_0

    .line 7
    .line 8
    :try_start_0
    iput-boolean v1, p0, Lqb2;->k:Z

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    :goto_0
    iget-object v3, p0, Lqb2;->b:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v3, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x4

    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    if-ne p3, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lu84;

    .line 30
    .line 31
    invoke-virtual {p1}, Ln54;->b()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 35
    .line 36
    check-cast p1, Lv84;

    .line 37
    .line 38
    invoke-virtual {p1, v5}, Lv84;->H(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :cond_2
    invoke-static {}, Lv84;->C()Lu84;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz p3, :cond_6

    .line 48
    .line 49
    const/4 v6, 0x2

    .line 50
    if-eq p3, v1, :cond_5

    .line 51
    .line 52
    if-eq p3, v6, :cond_4

    .line 53
    .line 54
    if-eq p3, v2, :cond_3

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move v1, v5

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move v1, v2

    .line 61
    goto :goto_1

    .line 62
    :cond_5
    move v1, v6

    .line 63
    :cond_6
    :goto_1
    if-eqz v1, :cond_7

    .line 64
    .line 65
    invoke-virtual {v4}, Ln54;->b()V

    .line 66
    .line 67
    .line 68
    iget-object p3, v4, Ln54;->g:Lp54;

    .line 69
    .line 70
    check-cast p3, Lv84;

    .line 71
    .line 72
    invoke-virtual {p3, v1}, Lv84;->H(I)V

    .line 73
    .line 74
    .line 75
    :cond_7
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-virtual {v4}, Ln54;->b()V

    .line 80
    .line 81
    .line 82
    iget-object v1, v4, Ln54;->g:Lp54;

    .line 83
    .line 84
    check-cast v1, Lv84;

    .line 85
    .line 86
    invoke-virtual {v1, p3}, Lv84;->D(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ln54;->b()V

    .line 90
    .line 91
    .line 92
    iget-object p3, v4, Ln54;->g:Lp54;

    .line 93
    .line 94
    check-cast p3, Lv84;

    .line 95
    .line 96
    invoke-virtual {p3, p1}, Lv84;->E(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lk84;->A()Li84;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    iget-object v1, p0, Lqb2;->i:Ljava/util/HashSet;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_b

    .line 110
    .line 111
    if-eqz p2, :cond_b

    .line 112
    .line 113
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    :cond_8
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_b

    .line 126
    .line 127
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Ljava/lang/String;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    const-string v2, ""

    .line 147
    .line 148
    :goto_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    if-eqz v5, :cond_a

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/lang/String;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    const-string v1, ""

    .line 162
    .line 163
    :goto_4
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 164
    .line 165
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget-object v6, p0, Lqb2;->i:Ljava/util/HashSet;

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_8

    .line 176
    .line 177
    invoke-static {}, Lh84;->A()Lg84;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    new-instance v6, Ly44;

    .line 182
    .line 183
    sget-object v7, Ly54;->a:Ljava/nio/charset/Charset;

    .line 184
    .line 185
    invoke-virtual {v2, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-direct {v6, v2}, Ly44;-><init>([B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Ln54;->b()V

    .line 193
    .line 194
    .line 195
    iget-object v2, v5, Ln54;->g:Lp54;

    .line 196
    .line 197
    check-cast v2, Lh84;

    .line 198
    .line 199
    invoke-virtual {v2, v6}, Lh84;->B(Ly44;)V

    .line 200
    .line 201
    .line 202
    new-instance v2, Ly44;

    .line 203
    .line 204
    invoke-virtual {v1, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-direct {v2, v1}, Ly44;-><init>([B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5}, Ln54;->b()V

    .line 212
    .line 213
    .line 214
    iget-object v1, v5, Ln54;->g:Lp54;

    .line 215
    .line 216
    check-cast v1, Lh84;

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Lh84;->C(La54;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Ln54;->d()Lp54;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Lh84;

    .line 226
    .line 227
    invoke-virtual {p3}, Ln54;->b()V

    .line 228
    .line 229
    .line 230
    iget-object v2, p3, Ln54;->g:Lp54;

    .line 231
    .line 232
    check-cast v2, Lk84;

    .line 233
    .line 234
    invoke-virtual {v2, v1}, Lk84;->B(Lh84;)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_b
    invoke-virtual {p3}, Ln54;->d()Lp54;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    check-cast p2, Lk84;

    .line 243
    .line 244
    invoke-virtual {v4}, Ln54;->b()V

    .line 245
    .line 246
    .line 247
    iget-object p3, v4, Ln54;->g:Lp54;

    .line 248
    .line 249
    check-cast p3, Lv84;

    .line 250
    .line 251
    invoke-virtual {p3, p2}, Lv84;->F(Lk84;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, p1, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    monitor-exit v0

    .line 258
    return-void

    .line 259
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    throw p1
.end method
