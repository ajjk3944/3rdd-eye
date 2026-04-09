.class public final Lwk1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkk1;


# static fields
.field public static final l:Ljava/util/regex/Pattern;


# instance fields
.field public final f:Z

.field public final g:Lok1;

.field public final h:Lkz2;

.field public i:Ljava/util/LinkedHashMap;

.field public j:F

.field public k:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lwk1;->l:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x800001

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lwk1;->j:F

    .line 8
    .line 9
    iput v0, p0, Lwk1;->k:F

    .line 10
    .line 11
    new-instance v0, Lkz2;

    .line 12
    .line 13
    invoke-direct {v0}, Lkz2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lwk1;->h:Lkz2;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p0, Lwk1;->f:Z

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [B

    .line 35
    .line 36
    new-instance v2, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "Format:"

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, Lok1;->a(Ljava/lang/String;)Lok1;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lwk1;->g:Lok1;

    .line 60
    .line 61
    new-instance v0, Lkz2;

    .line 62
    .line 63
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, [B

    .line 68
    .line 69
    invoke-direct {v0, p1}, Lkz2;-><init>([B)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0, v3}, Lwk1;->a(Lkz2;Ljava/nio/charset/Charset;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    iput-boolean v0, p0, Lwk1;->f:Z

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    iput-object p1, p0, Lwk1;->g:Lok1;

    .line 80
    .line 81
    return-void
.end method

.method public static b(Ljava/lang/String;)J
    .locals 10

    .line 1
    sget-object v0, Lwk1;->l:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0xd693a400L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-long/2addr v0, v2

    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    const-wide/32 v4, 0x3938700

    .line 50
    .line 51
    .line 52
    mul-long/2addr v2, v4

    .line 53
    const/4 v4, 0x3

    .line 54
    invoke-virtual {p0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/32 v6, 0xf4240

    .line 63
    .line 64
    .line 65
    mul-long/2addr v4, v6

    .line 66
    const/4 v6, 0x4

    .line 67
    invoke-virtual {p0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    const-wide/16 v8, 0x2710

    .line 76
    .line 77
    mul-long/2addr v6, v8

    .line 78
    add-long/2addr v0, v2

    .line 79
    add-long/2addr v0, v4

    .line 80
    add-long/2addr v0, v6

    .line 81
    return-wide v0
.end method

.method public static c(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    if-ltz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    cmp-long v1, v1, p0

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    cmp-long v1, v1, p0

    .line 35
    .line 36
    if-gez v1, :cond_0

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p2, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    new-instance p0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    add-int/lit8 p0, v0, -0x1

    .line 58
    .line 59
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/util/Collection;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 68
    .line 69
    .line 70
    move-object p0, p1

    .line 71
    :goto_1
    invoke-virtual {p3, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return v0
.end method


# virtual methods
.method public final a(Lkz2;Ljava/nio/charset/Charset;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p2}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1b

    .line 8
    .line 9
    const-string v2, "[Script Info]"

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v4, 0x5b

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x1

    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    :catch_0
    :cond_1
    :goto_1
    invoke-virtual/range {p1 .. p2}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual/range {p1 .. p1}, Lkz2;->B()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-virtual/range {p1 .. p2}, Lkz2;->t(Ljava/nio/charset/Charset;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    ushr-int/lit8 v2, v2, 0x8

    .line 40
    .line 41
    int-to-long v7, v2

    .line 42
    invoke-static {v7, v8}, Lzt0;->y(J)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/high16 v2, 0x110000

    .line 48
    .line 49
    :goto_2
    if-eq v2, v4, :cond_0

    .line 50
    .line 51
    :cond_3
    const-string v2, ":"

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    array-length v2, v0

    .line 58
    const/4 v7, 0x2

    .line 59
    if-ne v2, v7, :cond_1

    .line 60
    .line 61
    aget-object v2, v0, v5

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    packed-switch v7, :pswitch_data_0

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_0
    const-string v7, "playresy"

    .line 80
    .line 81
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    :try_start_0
    aget-object v0, v0, v6

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iput v0, v1, Lwk1;->k:F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :pswitch_1
    const-string v7, "playresx"

    .line 101
    .line 102
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    :try_start_1
    aget-object v0, v0, v6

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iput v0, v1, Lwk1;->j:F
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    const-string v2, "[V4+ Styles]"

    .line 122
    .line 123
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_19

    .line 128
    .line 129
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 130
    .line 131
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 132
    .line 133
    .line 134
    :cond_5
    const/4 v8, 0x0

    .line 135
    :goto_3
    invoke-virtual/range {p1 .. p2}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    if-eqz v9, :cond_18

    .line 140
    .line 141
    invoke-virtual/range {p1 .. p1}, Lkz2;->B()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    invoke-virtual/range {p1 .. p2}, Lkz2;->t(Ljava/nio/charset/Charset;)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    ushr-int/lit8 v0, v0, 0x8

    .line 154
    .line 155
    int-to-long v10, v0

    .line 156
    invoke-static {v10, v11}, Lzt0;->y(J)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    goto :goto_4

    .line 161
    :cond_6
    const/high16 v0, 0x110000

    .line 162
    .line 163
    :goto_4
    if-eq v0, v4, :cond_18

    .line 164
    .line 165
    :cond_7
    const-string v0, "Format:"

    .line 166
    .line 167
    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const/4 v10, -0x1

    .line 172
    const-string v11, ","

    .line 173
    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    const/4 v0, 0x7

    .line 177
    invoke-virtual {v9, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0, v11}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    move v8, v5

    .line 186
    move v12, v10

    .line 187
    move v13, v12

    .line 188
    move v14, v13

    .line 189
    move v15, v14

    .line 190
    move/from16 v16, v15

    .line 191
    .line 192
    move/from16 v17, v16

    .line 193
    .line 194
    move/from16 v18, v17

    .line 195
    .line 196
    move/from16 v19, v18

    .line 197
    .line 198
    move/from16 v20, v19

    .line 199
    .line 200
    move/from16 v21, v20

    .line 201
    .line 202
    :goto_5
    array-length v9, v0

    .line 203
    if-ge v8, v9, :cond_9

    .line 204
    .line 205
    aget-object v9, v0, v8

    .line 206
    .line 207
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-static {v9}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    sparse-switch v11, :sswitch_data_0

    .line 220
    .line 221
    .line 222
    goto/16 :goto_6

    .line 223
    .line 224
    :sswitch_0
    const-string v11, "outlinecolour"

    .line 225
    .line 226
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    if-eqz v9, :cond_8

    .line 231
    .line 232
    move v15, v8

    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :sswitch_1
    const-string v11, "alignment"

    .line 236
    .line 237
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-eqz v9, :cond_8

    .line 242
    .line 243
    move v13, v8

    .line 244
    goto :goto_6

    .line 245
    :sswitch_2
    const-string v11, "borderstyle"

    .line 246
    .line 247
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-eqz v9, :cond_8

    .line 252
    .line 253
    move/from16 v21, v8

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :sswitch_3
    const-string v11, "fontsize"

    .line 257
    .line 258
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    if-eqz v9, :cond_8

    .line 263
    .line 264
    move/from16 v16, v8

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :sswitch_4
    const-string v11, "name"

    .line 268
    .line 269
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    if-eqz v9, :cond_8

    .line 274
    .line 275
    move v12, v8

    .line 276
    goto :goto_6

    .line 277
    :sswitch_5
    const-string v11, "bold"

    .line 278
    .line 279
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    if-eqz v9, :cond_8

    .line 284
    .line 285
    move/from16 v17, v8

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :sswitch_6
    const-string v11, "primarycolour"

    .line 289
    .line 290
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_8

    .line 295
    .line 296
    move v14, v8

    .line 297
    goto :goto_6

    .line 298
    :sswitch_7
    const-string v11, "strikeout"

    .line 299
    .line 300
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    if-eqz v9, :cond_8

    .line 305
    .line 306
    move/from16 v20, v8

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :sswitch_8
    const-string v11, "underline"

    .line 310
    .line 311
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-eqz v9, :cond_8

    .line 316
    .line 317
    move/from16 v19, v8

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :sswitch_9
    const-string v11, "italic"

    .line 321
    .line 322
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    if-eqz v9, :cond_8

    .line 327
    .line 328
    move/from16 v18, v8

    .line 329
    .line 330
    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 331
    .line 332
    goto/16 :goto_5

    .line 333
    .line 334
    :cond_9
    if-eq v12, v10, :cond_5

    .line 335
    .line 336
    new-instance v11, Lxk1;

    .line 337
    .line 338
    move/from16 v22, v9

    .line 339
    .line 340
    invoke-direct/range {v11 .. v22}, Lxk1;-><init>(IIIIIIIIIII)V

    .line 341
    .line 342
    .line 343
    move-object v8, v11

    .line 344
    goto/16 :goto_3

    .line 345
    .line 346
    :cond_a
    const-string v0, "Style:"

    .line 347
    .line 348
    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 349
    .line 350
    .line 351
    move-result v12

    .line 352
    if-eqz v12, :cond_17

    .line 353
    .line 354
    if-nez v8, :cond_b

    .line 355
    .line 356
    const-string v0, "Skipping \'Style:\' line before \'Format:\' line: "

    .line 357
    .line 358
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_15

    .line 366
    .line 367
    :cond_b
    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    invoke-static {v0}, Lzt0;->D(Z)V

    .line 372
    .line 373
    .line 374
    const/4 v0, 0x6

    .line 375
    invoke-virtual {v9, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0, v11}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v11

    .line 383
    array-length v0, v11

    .line 384
    iget v12, v8, Lxk1;->k:I

    .line 385
    .line 386
    const-string v13, "\'"

    .line 387
    .line 388
    if-eq v0, v12, :cond_c

    .line 389
    .line 390
    sget-object v10, Lv23;->a:Ljava/lang/String;

    .line 391
    .line 392
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 393
    .line 394
    new-instance v10, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    const-string v11, "Skipping malformed \'Style:\' line (expected "

    .line 397
    .line 398
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    const-string v11, " values, found "

    .line 405
    .line 406
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    const-string v0, "): \'"

    .line 413
    .line 414
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    :goto_7
    const/4 v14, 0x0

    .line 431
    goto/16 :goto_14

    .line 432
    .line 433
    :cond_c
    :try_start_2
    new-instance v14, Lcl1;

    .line 434
    .line 435
    iget v0, v8, Lxk1;->a:I

    .line 436
    .line 437
    aget-object v0, v11, v0

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v15

    .line 443
    iget v0, v8, Lxk1;->b:I

    .line 444
    .line 445
    if-eq v0, v10, :cond_d

    .line 446
    .line 447
    aget-object v0, v11, v0

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 453
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 458
    .line 459
    .line 460
    move-result v12
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 461
    packed-switch v12, :pswitch_data_1

    .line 462
    .line 463
    .line 464
    :catch_1
    :try_start_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    const-string v12, "Ignoring unknown alignment: "

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    move v12, v10

    .line 478
    :pswitch_2
    move/from16 v16, v12

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :catch_2
    move-exception v0

    .line 482
    goto/16 :goto_13

    .line 483
    .line 484
    :cond_d
    move/from16 v16, v10

    .line 485
    .line 486
    :goto_8
    iget v0, v8, Lxk1;->c:I

    .line 487
    .line 488
    if-eq v0, v10, :cond_e

    .line 489
    .line 490
    aget-object v0, v11, v0

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, Lcl1;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    move-object/from16 v17, v0

    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_e
    const/16 v17, 0x0

    .line 504
    .line 505
    :goto_9
    iget v0, v8, Lxk1;->d:I

    .line 506
    .line 507
    if-eq v0, v10, :cond_f

    .line 508
    .line 509
    aget-object v0, v11, v0

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-static {v0}, Lcl1;->a(Ljava/lang/String;)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    move-object/from16 v18, v0

    .line 520
    .line 521
    goto :goto_a

    .line 522
    :cond_f
    const/16 v18, 0x0

    .line 523
    .line 524
    :goto_a
    iget v0, v8, Lxk1;->e:I

    .line 525
    .line 526
    const v12, -0x800001

    .line 527
    .line 528
    .line 529
    if-eq v0, v10, :cond_10

    .line 530
    .line 531
    aget-object v0, v11, v0

    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    const-string v4, "Failed to parse font size: \'"
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 538
    .line 539
    :try_start_5
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 540
    .line 541
    .line 542
    move-result v12
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2

    .line 543
    :cond_10
    :goto_b
    move/from16 v19, v12

    .line 544
    .line 545
    goto :goto_c

    .line 546
    :catch_3
    move-exception v0

    .line 547
    :try_start_6
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v19

    .line 551
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 552
    .line 553
    .line 554
    move-result v19

    .line 555
    add-int/lit8 v5, v19, 0x1d

    .line 556
    .line 557
    new-instance v7, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    invoke-static {v3, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 576
    .line 577
    .line 578
    goto :goto_b

    .line 579
    :goto_c
    iget v0, v8, Lxk1;->f:I

    .line 580
    .line 581
    if-eq v0, v10, :cond_11

    .line 582
    .line 583
    aget-object v0, v11, v0

    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-static {v0}, Lcl1;->b(Ljava/lang/String;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_11

    .line 594
    .line 595
    move/from16 v20, v6

    .line 596
    .line 597
    goto :goto_d

    .line 598
    :cond_11
    const/16 v20, 0x0

    .line 599
    .line 600
    :goto_d
    iget v0, v8, Lxk1;->g:I

    .line 601
    .line 602
    if-eq v0, v10, :cond_12

    .line 603
    .line 604
    aget-object v0, v11, v0

    .line 605
    .line 606
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {v0}, Lcl1;->b(Ljava/lang/String;)Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    if-eqz v0, :cond_12

    .line 615
    .line 616
    move/from16 v21, v6

    .line 617
    .line 618
    goto :goto_e

    .line 619
    :cond_12
    const/16 v21, 0x0

    .line 620
    .line 621
    :goto_e
    iget v0, v8, Lxk1;->h:I

    .line 622
    .line 623
    if-eq v0, v10, :cond_13

    .line 624
    .line 625
    aget-object v0, v11, v0

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-static {v0}, Lcl1;->b(Ljava/lang/String;)Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-eqz v0, :cond_13

    .line 636
    .line 637
    move/from16 v22, v6

    .line 638
    .line 639
    goto :goto_f

    .line 640
    :cond_13
    const/16 v22, 0x0

    .line 641
    .line 642
    :goto_f
    iget v0, v8, Lxk1;->i:I

    .line 643
    .line 644
    if-eq v0, v10, :cond_14

    .line 645
    .line 646
    aget-object v0, v11, v0

    .line 647
    .line 648
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static {v0}, Lcl1;->b(Ljava/lang/String;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-eqz v0, :cond_14

    .line 657
    .line 658
    move/from16 v23, v6

    .line 659
    .line 660
    goto :goto_10

    .line 661
    :cond_14
    const/16 v23, 0x0

    .line 662
    .line 663
    :goto_10
    iget v0, v8, Lxk1;->j:I

    .line 664
    .line 665
    if-eq v0, v10, :cond_16

    .line 666
    .line 667
    aget-object v0, v11, v0

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    const-string v3, "Ignoring unknown BorderStyle: "
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2

    .line 674
    .line 675
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 680
    .line 681
    .line 682
    move-result v4
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    .line 683
    if-eq v4, v6, :cond_15

    .line 684
    .line 685
    const/4 v5, 0x3

    .line 686
    if-eq v4, v5, :cond_15

    .line 687
    .line 688
    goto :goto_11

    .line 689
    :cond_15
    move/from16 v24, v4

    .line 690
    .line 691
    goto :goto_12

    .line 692
    :catch_4
    :goto_11
    :try_start_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    :cond_16
    move/from16 v24, v10

    .line 704
    .line 705
    :goto_12
    invoke-direct/range {v14 .. v24}, Lcl1;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_2

    .line 706
    .line 707
    .line 708
    goto :goto_14

    .line 709
    :goto_13
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    new-instance v4, Ljava/lang/StringBuilder;

    .line 714
    .line 715
    add-int/lit8 v3, v3, 0x24

    .line 716
    .line 717
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 718
    .line 719
    .line 720
    const-string v3, "Skipping malformed \'Style:\' line: \'"

    .line 721
    .line 722
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    invoke-static {v3, v0}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 736
    .line 737
    .line 738
    goto/16 :goto_7

    .line 739
    .line 740
    :goto_14
    if-eqz v14, :cond_17

    .line 741
    .line 742
    iget-object v0, v14, Lcl1;->a:Ljava/lang/String;

    .line 743
    .line 744
    invoke-interface {v2, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    :cond_17
    :goto_15
    const/16 v4, 0x5b

    .line 748
    .line 749
    const/4 v5, 0x0

    .line 750
    goto/16 :goto_3

    .line 751
    .line 752
    :cond_18
    iput-object v2, v1, Lwk1;->i:Ljava/util/LinkedHashMap;

    .line 753
    .line 754
    goto/16 :goto_0

    .line 755
    .line 756
    :cond_19
    const-string v2, "[V4 Styles]"

    .line 757
    .line 758
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    if-eqz v2, :cond_1a

    .line 763
    .line 764
    const-string v0, "[V4 Styles] are not supported"

    .line 765
    .line 766
    invoke-static {v0}, La30;->u(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    goto/16 :goto_0

    .line 770
    .line 771
    :cond_1a
    const-string v2, "[Events]"

    .line 772
    .line 773
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    if-eqz v0, :cond_0

    .line 778
    .line 779
    :cond_1b
    return-void

    .line 780
    nop

    .line 781
    :pswitch_data_0
    .packed-switch 0x70092d0c
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    :sswitch_data_0
    .sparse-switch
        -0x4642c5d0 -> :sswitch_9
        -0x3d363934 -> :sswitch_8
        -0xb7325a4 -> :sswitch_7
        -0x43a3db2 -> :sswitch_6
        0x2e3a85 -> :sswitch_5
        0x337a8b -> :sswitch_4
        0x15d92cd0 -> :sswitch_3
        0x2dbc6505 -> :sswitch_2
        0x695fa1e3 -> :sswitch_1
        0x76840c8e -> :sswitch_0
    .end sparse-switch

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final g([BIILlk1;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    add-int v4, v1, p3

    .line 16
    .line 17
    iget-object v5, v0, Lwk1;->h:Lkz2;

    .line 18
    .line 19
    move-object/from16 v6, p1

    .line 20
    .line 21
    invoke-virtual {v5, v4, v6}, Lkz2;->z(I[B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v1}, Lkz2;->E(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Lkz2;->q()Ljava/nio/charset/Charset;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    :cond_0
    iget-boolean v4, v0, Lwk1;->f:Z

    .line 36
    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v5, v1}, Lwk1;->a(Lkz2;Ljava/nio/charset/Charset;)V

    .line 40
    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v4, v0, Lwk1;->g:Lok1;

    .line 45
    .line 46
    :goto_0
    invoke-virtual {v5, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const/4 v8, -0x1

    .line 51
    const/4 v9, 0x1

    .line 52
    if-eqz v7, :cond_28

    .line 53
    .line 54
    const-string v11, "Format:"

    .line 55
    .line 56
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_2

    .line 61
    .line 62
    invoke-static {v7}, Lok1;->a(Ljava/lang/String;)Lok1;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const-string v11, "Dialogue:"

    .line 68
    .line 69
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-eqz v12, :cond_3

    .line 74
    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    const-string v8, "Skipping dialogue line before complete format: "

    .line 78
    .line 79
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_1
    move-object/from16 v29, v1

    .line 87
    .line 88
    move-object/from16 v30, v4

    .line 89
    .line 90
    move-object/from16 v31, v5

    .line 91
    .line 92
    const/16 p1, 0x0

    .line 93
    .line 94
    goto/16 :goto_1e

    .line 95
    .line 96
    :cond_4
    iget v12, v4, Lok1;->a:I

    .line 97
    .line 98
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    invoke-static {v11}, Lzt0;->D(Z)V

    .line 103
    .line 104
    .line 105
    const/16 v11, 0x9

    .line 106
    .line 107
    invoke-virtual {v7, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    iget v13, v4, Lok1;->f:I

    .line 112
    .line 113
    const-string v14, ","

    .line 114
    .line 115
    invoke-virtual {v11, v14, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    array-length v14, v11

    .line 120
    if-eq v14, v13, :cond_5

    .line 121
    .line 122
    const-string v8, "Skipping dialogue line with fewer columns than format: "

    .line 123
    .line 124
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    if-eq v12, v8, :cond_6

    .line 133
    .line 134
    :try_start_0
    aget-object v13, v11, v12

    .line 135
    .line 136
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v12
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    move/from16 v26, v12

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catch_0
    aget-object v12, v11, v12

    .line 148
    .line 149
    const-string v13, "Fail to parse layer: "

    .line 150
    .line 151
    invoke-static {v12, v13}, Lga1;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    const/16 v26, 0x0

    .line 155
    .line 156
    :goto_2
    iget v12, v4, Lok1;->b:I

    .line 157
    .line 158
    aget-object v12, v11, v12

    .line 159
    .line 160
    invoke-static {v12}, Lwk1;->b(Ljava/lang/String;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v12

    .line 164
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    cmp-long v16, v12, v14

    .line 170
    .line 171
    const/16 p1, 0x0

    .line 172
    .line 173
    const-string v6, "Skipping invalid timing: "

    .line 174
    .line 175
    if-nez v16, :cond_7

    .line 176
    .line 177
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-static {v6}, La30;->x(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    move-object/from16 v29, v1

    .line 185
    .line 186
    move-object/from16 v30, v4

    .line 187
    .line 188
    move-object/from16 v31, v5

    .line 189
    .line 190
    goto/16 :goto_1e

    .line 191
    .line 192
    :cond_7
    move-wide/from16 p2, v14

    .line 193
    .line 194
    iget v14, v4, Lok1;->c:I

    .line 195
    .line 196
    aget-object v14, v11, v14

    .line 197
    .line 198
    invoke-static {v14}, Lwk1;->b(Ljava/lang/String;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v14

    .line 202
    cmp-long v16, v14, p2

    .line 203
    .line 204
    if-eqz v16, :cond_8

    .line 205
    .line 206
    cmp-long v16, v14, v12

    .line 207
    .line 208
    if-gtz v16, :cond_9

    .line 209
    .line 210
    :cond_8
    move-object/from16 v29, v1

    .line 211
    .line 212
    move-object/from16 v30, v4

    .line 213
    .line 214
    move-object/from16 v31, v5

    .line 215
    .line 216
    goto/16 :goto_1d

    .line 217
    .line 218
    :cond_9
    iget-object v6, v0, Lwk1;->i:Ljava/util/LinkedHashMap;

    .line 219
    .line 220
    if-eqz v6, :cond_a

    .line 221
    .line 222
    iget v7, v4, Lok1;->d:I

    .line 223
    .line 224
    if-eq v7, v8, :cond_a

    .line 225
    .line 226
    aget-object v7, v11, v7

    .line 227
    .line 228
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v6, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Lcl1;

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_a
    move-object/from16 v6, p1

    .line 240
    .line 241
    :goto_3
    iget v7, v4, Lok1;->e:I

    .line 242
    .line 243
    aget-object v7, v11, v7

    .line 244
    .line 245
    sget-object v11, Lbl1;->a:Ljava/util/regex/Pattern;

    .line 246
    .line 247
    invoke-virtual {v11, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    move-object/from16 v28, p1

    .line 252
    .line 253
    move/from16 v27, v8

    .line 254
    .line 255
    :goto_4
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 256
    .line 257
    .line 258
    move-result v16

    .line 259
    if-eqz v16, :cond_14

    .line 260
    .line 261
    invoke-virtual {v11, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    :try_start_1
    const-string v10, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override=\'"

    .line 269
    .line 270
    const-string v9, "\'"
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3

    .line 271
    .line 272
    move-object/from16 v29, v1

    .line 273
    .line 274
    :try_start_2
    sget-object v1, Lbl1;->b:Ljava/util/regex/Pattern;

    .line 275
    .line 276
    invoke-virtual {v1, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 277
    .line 278
    .line 279
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 280
    move-object/from16 v30, v4

    .line 281
    .line 282
    :try_start_3
    sget-object v4, Lbl1;->c:Ljava/util/regex/Pattern;

    .line 283
    .line 284
    invoke-virtual {v4, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 289
    .line 290
    .line 291
    move-result v18

    .line 292
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 293
    .line 294
    .line 295
    move-result v19

    .line 296
    if-eqz v18, :cond_c

    .line 297
    .line 298
    if-eqz v19, :cond_b

    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 301
    .line 302
    .line 303
    move-result v4
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 304
    add-int/lit8 v4, v4, 0x52

    .line 305
    .line 306
    move-object/from16 v31, v5

    .line 307
    .line 308
    :try_start_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-static {v4}, La30;->u(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :goto_5
    const/4 v5, 0x1

    .line 330
    goto :goto_7

    .line 331
    :catch_1
    :goto_6
    move-object/from16 v31, v5

    .line 332
    .line 333
    goto :goto_b

    .line 334
    :cond_b
    move-object/from16 v31, v5

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :goto_7
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    const/4 v9, 0x2

    .line 342
    invoke-virtual {v1, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    goto :goto_8

    .line 347
    :cond_c
    move-object/from16 v31, v5

    .line 348
    .line 349
    const/4 v5, 0x1

    .line 350
    const/4 v9, 0x2

    .line 351
    if-eqz v19, :cond_f

    .line 352
    .line 353
    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    move-object/from16 v32, v4

    .line 362
    .line 363
    move-object v4, v1

    .line 364
    move-object/from16 v1, v32

    .line 365
    .line 366
    :goto_8
    new-instance v5, Landroid/graphics/PointF;

    .line 367
    .line 368
    if-eqz v4, :cond_e

    .line 369
    .line 370
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-eqz v1, :cond_d

    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-direct {v5, v4, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 389
    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_d
    throw p1

    .line 393
    :cond_e
    throw p1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    .line 394
    :cond_f
    move-object/from16 v5, p1

    .line 395
    .line 396
    :goto_9
    if-eqz v5, :cond_10

    .line 397
    .line 398
    move-object/from16 v28, v5

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :catch_2
    :goto_a
    move-object/from16 v30, v4

    .line 402
    .line 403
    goto :goto_6

    .line 404
    :catch_3
    move-object/from16 v29, v1

    .line 405
    .line 406
    goto :goto_a

    .line 407
    :catch_4
    :cond_10
    :goto_b
    :try_start_5
    sget-object v1, Lbl1;->d:Ljava/util/regex/Pattern;

    .line 408
    .line 409
    invoke-virtual {v1, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-eqz v4, :cond_12

    .line 418
    .line 419
    const/4 v5, 0x1

    .line 420
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_6

    .line 424
    if-eqz v1, :cond_11

    .line 425
    .line 426
    :try_start_6
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 431
    .line 432
    .line 433
    move-result v4
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6

    .line 434
    packed-switch v4, :pswitch_data_0

    .line 435
    .line 436
    .line 437
    :catch_5
    :try_start_7
    const-string v4, "Ignoring unknown alignment: "

    .line 438
    .line 439
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    goto :goto_d

    .line 447
    :goto_c
    :pswitch_0
    const/4 v1, -0x1

    .line 448
    goto :goto_e

    .line 449
    :cond_11
    throw p1
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_6

    .line 450
    :cond_12
    :goto_d
    const/4 v4, -0x1

    .line 451
    goto :goto_c

    .line 452
    :goto_e
    if-eq v4, v1, :cond_13

    .line 453
    .line 454
    move v8, v1

    .line 455
    move/from16 v27, v4

    .line 456
    .line 457
    move-object/from16 v1, v29

    .line 458
    .line 459
    move-object/from16 v4, v30

    .line 460
    .line 461
    move-object/from16 v5, v31

    .line 462
    .line 463
    :goto_f
    const/4 v9, 0x1

    .line 464
    goto/16 :goto_4

    .line 465
    .line 466
    :catch_6
    :cond_13
    move-object/from16 v1, v29

    .line 467
    .line 468
    move-object/from16 v4, v30

    .line 469
    .line 470
    move-object/from16 v5, v31

    .line 471
    .line 472
    const/4 v8, -0x1

    .line 473
    goto :goto_f

    .line 474
    :cond_14
    move-object/from16 v29, v1

    .line 475
    .line 476
    move-object/from16 v30, v4

    .line 477
    .line 478
    move-object/from16 v31, v5

    .line 479
    .line 480
    new-instance v1, Lbl1;

    .line 481
    .line 482
    sget-object v1, Lbl1;->a:Ljava/util/regex/Pattern;

    .line 483
    .line 484
    invoke-virtual {v1, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    const-string v4, ""

    .line 489
    .line 490
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    const-string v4, "\\N"

    .line 495
    .line 496
    const-string v5, "\n"

    .line 497
    .line 498
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    const-string v4, "\\n"

    .line 503
    .line 504
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    const-string v4, "\\h"

    .line 509
    .line 510
    const-string v5, "\u00a0"

    .line 511
    .line 512
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    iget v4, v0, Lwk1;->j:F

    .line 517
    .line 518
    iget v5, v0, Lwk1;->k:F

    .line 519
    .line 520
    new-instance v11, Landroid/text/SpannableString;

    .line 521
    .line 522
    invoke-direct {v11, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 523
    .line 524
    .line 525
    const v22, -0x800001

    .line 526
    .line 527
    .line 528
    const/high16 v24, -0x80000000

    .line 529
    .line 530
    if-eqz v6, :cond_1d

    .line 531
    .line 532
    iget-boolean v7, v6, Lcl1;->g:Z

    .line 533
    .line 534
    iget-object v8, v6, Lcl1;->c:Ljava/lang/Integer;

    .line 535
    .line 536
    const/16 v9, 0x21

    .line 537
    .line 538
    if-eqz v8, :cond_15

    .line 539
    .line 540
    new-instance v10, Landroid/text/style/ForegroundColorSpan;

    .line 541
    .line 542
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 543
    .line 544
    .line 545
    move-result v8

    .line 546
    invoke-direct {v10, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    const/4 v1, 0x0

    .line 554
    const v18, -0x800001

    .line 555
    .line 556
    .line 557
    invoke-virtual {v11, v10, v1, v8, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 558
    .line 559
    .line 560
    goto :goto_10

    .line 561
    :cond_15
    const v18, -0x800001

    .line 562
    .line 563
    .line 564
    :goto_10
    iget v1, v6, Lcl1;->j:I

    .line 565
    .line 566
    const/4 v8, 0x3

    .line 567
    if-ne v1, v8, :cond_16

    .line 568
    .line 569
    iget-object v1, v6, Lcl1;->d:Ljava/lang/Integer;

    .line 570
    .line 571
    if-eqz v1, :cond_16

    .line 572
    .line 573
    new-instance v10, Landroid/text/style/BackgroundColorSpan;

    .line 574
    .line 575
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    invoke-direct {v10, v1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    const/4 v8, 0x0

    .line 587
    invoke-virtual {v11, v10, v8, v1, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 588
    .line 589
    .line 590
    :cond_16
    iget v1, v6, Lcl1;->e:F

    .line 591
    .line 592
    cmpl-float v8, v1, v18

    .line 593
    .line 594
    if-eqz v8, :cond_17

    .line 595
    .line 596
    cmpl-float v8, v5, v18

    .line 597
    .line 598
    if-eqz v8, :cond_17

    .line 599
    .line 600
    div-float/2addr v1, v5

    .line 601
    const/4 v8, 0x1

    .line 602
    goto :goto_11

    .line 603
    :cond_17
    move/from16 v1, v22

    .line 604
    .line 605
    move/from16 v8, v24

    .line 606
    .line 607
    :goto_11
    iget-boolean v10, v6, Lcl1;->f:Z

    .line 608
    .line 609
    if-eqz v10, :cond_19

    .line 610
    .line 611
    if-eqz v7, :cond_18

    .line 612
    .line 613
    new-instance v7, Landroid/text/style/StyleSpan;

    .line 614
    .line 615
    const/4 v10, 0x3

    .line 616
    invoke-direct {v7, v10}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 620
    .line 621
    .line 622
    move-result v10

    .line 623
    const/4 v0, 0x0

    .line 624
    invoke-virtual {v11, v7, v0, v10, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 625
    .line 626
    .line 627
    goto :goto_12

    .line 628
    :cond_18
    const/4 v0, 0x0

    .line 629
    new-instance v7, Landroid/text/style/StyleSpan;

    .line 630
    .line 631
    const/4 v10, 0x1

    .line 632
    invoke-direct {v7, v10}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 636
    .line 637
    .line 638
    move-result v10

    .line 639
    invoke-virtual {v11, v7, v0, v10, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 640
    .line 641
    .line 642
    goto :goto_12

    .line 643
    :cond_19
    const/4 v0, 0x0

    .line 644
    if-eqz v7, :cond_1a

    .line 645
    .line 646
    new-instance v7, Landroid/text/style/StyleSpan;

    .line 647
    .line 648
    const/4 v10, 0x2

    .line 649
    invoke-direct {v7, v10}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 653
    .line 654
    .line 655
    move-result v10

    .line 656
    invoke-virtual {v11, v7, v0, v10, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 657
    .line 658
    .line 659
    :cond_1a
    :goto_12
    iget-boolean v7, v6, Lcl1;->h:Z

    .line 660
    .line 661
    if-eqz v7, :cond_1b

    .line 662
    .line 663
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 664
    .line 665
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 669
    .line 670
    .line 671
    move-result v10

    .line 672
    invoke-virtual {v11, v7, v0, v10, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 673
    .line 674
    .line 675
    :cond_1b
    iget-boolean v7, v6, Lcl1;->i:Z

    .line 676
    .line 677
    if-eqz v7, :cond_1c

    .line 678
    .line 679
    new-instance v7, Landroid/text/style/StrikethroughSpan;

    .line 680
    .line 681
    invoke-direct {v7}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 685
    .line 686
    .line 687
    move-result v10

    .line 688
    invoke-virtual {v11, v7, v0, v10, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 689
    .line 690
    .line 691
    :cond_1c
    move/from16 v21, v1

    .line 692
    .line 693
    move/from16 v20, v8

    .line 694
    .line 695
    :goto_13
    move/from16 v8, v27

    .line 696
    .line 697
    const/4 v1, -0x1

    .line 698
    goto :goto_14

    .line 699
    :cond_1d
    const/4 v0, 0x0

    .line 700
    const v18, -0x800001

    .line 701
    .line 702
    .line 703
    move/from16 v21, v22

    .line 704
    .line 705
    move/from16 v20, v24

    .line 706
    .line 707
    goto :goto_13

    .line 708
    :goto_14
    if-eq v8, v1, :cond_1e

    .line 709
    .line 710
    goto :goto_15

    .line 711
    :cond_1e
    if-eqz v6, :cond_1f

    .line 712
    .line 713
    iget v8, v6, Lcl1;->b:I

    .line 714
    .line 715
    goto :goto_15

    .line 716
    :cond_1f
    const/4 v8, -0x1

    .line 717
    :goto_15
    const-string v1, "Unknown alignment: "

    .line 718
    .line 719
    const/16 v6, 0x13

    .line 720
    .line 721
    packed-switch v8, :pswitch_data_1

    .line 722
    .line 723
    .line 724
    :pswitch_1
    invoke-static {v8, v6}, Lga1;->f(II)I

    .line 725
    .line 726
    .line 727
    move-result v7

    .line 728
    new-instance v9, Ljava/lang/StringBuilder;

    .line 729
    .line 730
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v7

    .line 743
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    :pswitch_2
    move-object/from16 v7, p1

    .line 747
    .line 748
    goto :goto_16

    .line 749
    :pswitch_3
    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 750
    .line 751
    goto :goto_16

    .line 752
    :pswitch_4
    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 753
    .line 754
    goto :goto_16

    .line 755
    :pswitch_5
    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 756
    .line 757
    :goto_16
    const/high16 v9, -0x80000000

    .line 758
    .line 759
    packed-switch v8, :pswitch_data_2

    .line 760
    .line 761
    .line 762
    :pswitch_6
    invoke-static {v8, v6}, Lga1;->f(II)I

    .line 763
    .line 764
    .line 765
    move-result v10

    .line 766
    new-instance v0, Ljava/lang/StringBuilder;

    .line 767
    .line 768
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    :pswitch_7
    move v0, v9

    .line 785
    goto :goto_17

    .line 786
    :pswitch_8
    const/4 v0, 0x2

    .line 787
    goto :goto_17

    .line 788
    :pswitch_9
    const/4 v0, 0x1

    .line 789
    goto :goto_17

    .line 790
    :pswitch_a
    const/4 v0, 0x0

    .line 791
    :goto_17
    packed-switch v8, :pswitch_data_3

    .line 792
    .line 793
    .line 794
    :pswitch_b
    invoke-static {v8, v6}, Lga1;->f(II)I

    .line 795
    .line 796
    .line 797
    move-result v6

    .line 798
    new-instance v10, Ljava/lang/StringBuilder;

    .line 799
    .line 800
    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    :pswitch_c
    move-object/from16 v1, v28

    .line 817
    .line 818
    goto :goto_18

    .line 819
    :pswitch_d
    move-object/from16 v1, v28

    .line 820
    .line 821
    const/4 v9, 0x0

    .line 822
    goto :goto_18

    .line 823
    :pswitch_e
    move-object/from16 v1, v28

    .line 824
    .line 825
    const/4 v9, 0x1

    .line 826
    goto :goto_18

    .line 827
    :pswitch_f
    move-object/from16 v1, v28

    .line 828
    .line 829
    const/4 v9, 0x2

    .line 830
    :goto_18
    if-eqz v1, :cond_20

    .line 831
    .line 832
    cmpl-float v6, v5, v18

    .line 833
    .line 834
    if-eqz v6, :cond_20

    .line 835
    .line 836
    cmpl-float v6, v4, v18

    .line 837
    .line 838
    if-eqz v6, :cond_20

    .line 839
    .line 840
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 841
    .line 842
    div-float/2addr v6, v4

    .line 843
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 844
    .line 845
    div-float/2addr v1, v5

    .line 846
    move/from16 v18, v6

    .line 847
    .line 848
    goto :goto_1b

    .line 849
    :cond_20
    const v1, 0x3d4ccccd    # 0.05f

    .line 850
    .line 851
    .line 852
    const/high16 v4, 0x3f000000    # 0.5f

    .line 853
    .line 854
    const v5, 0x3f733333    # 0.95f

    .line 855
    .line 856
    .line 857
    if-eqz v0, :cond_23

    .line 858
    .line 859
    const/4 v10, 0x1

    .line 860
    const/4 v6, 0x2

    .line 861
    if-eq v0, v10, :cond_22

    .line 862
    .line 863
    if-eq v0, v6, :cond_21

    .line 864
    .line 865
    move/from16 v8, v18

    .line 866
    .line 867
    goto :goto_19

    .line 868
    :cond_21
    move v8, v5

    .line 869
    goto :goto_19

    .line 870
    :cond_22
    move v8, v4

    .line 871
    goto :goto_19

    .line 872
    :cond_23
    const/4 v6, 0x2

    .line 873
    const/4 v10, 0x1

    .line 874
    move v8, v1

    .line 875
    :goto_19
    if-eqz v9, :cond_26

    .line 876
    .line 877
    if-eq v9, v10, :cond_25

    .line 878
    .line 879
    if-eq v9, v6, :cond_24

    .line 880
    .line 881
    move/from16 v1, v18

    .line 882
    .line 883
    goto :goto_1a

    .line 884
    :cond_24
    move v1, v5

    .line 885
    goto :goto_1a

    .line 886
    :cond_25
    move v1, v4

    .line 887
    :cond_26
    :goto_1a
    move/from16 v18, v8

    .line 888
    .line 889
    :goto_1b
    new-instance v10, Lfi2;

    .line 890
    .line 891
    move-wide v4, v12

    .line 892
    const/4 v13, 0x0

    .line 893
    move-wide v15, v14

    .line 894
    const/4 v14, 0x0

    .line 895
    const/16 v25, 0x0

    .line 896
    .line 897
    move/from16 v23, v22

    .line 898
    .line 899
    move/from16 v19, v0

    .line 900
    .line 901
    move-object v12, v7

    .line 902
    move/from16 v17, v9

    .line 903
    .line 904
    move-wide/from16 v32, v15

    .line 905
    .line 906
    move v15, v1

    .line 907
    move-wide/from16 v0, v32

    .line 908
    .line 909
    const/16 v16, 0x0

    .line 910
    .line 911
    invoke-direct/range {v10 .. v26}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 912
    .line 913
    .line 914
    invoke-static {v4, v5, v3, v2}, Lwk1;->c(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    invoke-static {v0, v1, v3, v2}, Lwk1;->c(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 919
    .line 920
    .line 921
    move-result v0

    .line 922
    :goto_1c
    if-ge v4, v0, :cond_27

    .line 923
    .line 924
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    check-cast v1, Ljava/util/List;

    .line 929
    .line 930
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    add-int/lit8 v4, v4, 0x1

    .line 934
    .line 935
    goto :goto_1c

    .line 936
    :goto_1d
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    invoke-static {v0}, La30;->x(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    :cond_27
    :goto_1e
    move-object/from16 v0, p0

    .line 944
    .line 945
    move-object/from16 v1, v29

    .line 946
    .line 947
    move-object/from16 v4, v30

    .line 948
    .line 949
    move-object/from16 v5, v31

    .line 950
    .line 951
    goto/16 :goto_0

    .line 952
    .line 953
    :cond_28
    const/4 v0, 0x0

    .line 954
    move v10, v0

    .line 955
    :goto_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 956
    .line 957
    .line 958
    move-result v1

    .line 959
    if-ge v10, v1, :cond_2c

    .line 960
    .line 961
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    move-object v5, v1

    .line 966
    check-cast v5, Ljava/util/List;

    .line 967
    .line 968
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    if-eqz v1, :cond_2a

    .line 973
    .line 974
    if-eqz v10, :cond_29

    .line 975
    .line 976
    move-object/from16 v1, p4

    .line 977
    .line 978
    const/4 v11, -0x1

    .line 979
    :goto_20
    const/16 v17, 0x1

    .line 980
    .line 981
    goto :goto_21

    .line 982
    :cond_29
    move v10, v0

    .line 983
    :cond_2a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 984
    .line 985
    .line 986
    move-result v1

    .line 987
    const/4 v11, -0x1

    .line 988
    add-int/2addr v1, v11

    .line 989
    if-eq v10, v1, :cond_2b

    .line 990
    .line 991
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    check-cast v1, Ljava/lang/Long;

    .line 996
    .line 997
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 998
    .line 999
    .line 1000
    move-result-wide v6

    .line 1001
    add-int/lit8 v1, v10, 0x1

    .line 1002
    .line 1003
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    check-cast v1, Ljava/lang/Long;

    .line 1008
    .line 1009
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v8

    .line 1013
    sub-long/2addr v8, v6

    .line 1014
    new-instance v4, Lgk1;

    .line 1015
    .line 1016
    invoke-direct/range {v4 .. v9}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 1017
    .line 1018
    .line 1019
    move-object/from16 v1, p4

    .line 1020
    .line 1021
    invoke-virtual {v1, v4}, Llk1;->c(Ljava/lang/Object;)V

    .line 1022
    .line 1023
    .line 1024
    goto :goto_20

    .line 1025
    :goto_21
    add-int/lit8 v10, v10, 0x1

    .line 1026
    .line 1027
    goto :goto_1f

    .line 1028
    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1029
    .line 1030
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 1031
    .line 1032
    .line 1033
    throw v0

    .line 1034
    :cond_2c
    return-void

    .line 1035
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    :pswitch_data_3
    .packed-switch -0x1
        :pswitch_c
        :pswitch_b
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_d
    .end packed-switch
.end method
