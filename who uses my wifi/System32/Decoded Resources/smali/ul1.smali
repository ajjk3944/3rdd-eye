.class public abstract Lul1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/Map;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lul1;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "(\\S+?):(\\S+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lul1;->b:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0xff

    .line 23
    .line 24
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "white"

    .line 33
    .line 34
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v2, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, "lime"

    .line 47
    .line 48
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "cyan"

    .line 60
    .line 61
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const-string v4, "red"

    .line 73
    .line 74
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "yellow"

    .line 86
    .line 87
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-string v4, "magenta"

    .line 99
    .line 100
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    const-string v4, "blue"

    .line 112
    .line 113
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v4, "black"

    .line 125
    .line 126
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sput-object v0, Lul1;->c:Ljava/util/Map;

    .line 134
    .line 135
    new-instance v0, Ljava/util/HashMap;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    const-string v4, "bg_white"

    .line 149
    .line 150
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-static {v2, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const-string v4, "bg_lime"

    .line 162
    .line 163
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    invoke-static {v2, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const-string v4, "bg_cyan"

    .line 175
    .line 176
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    const-string v4, "bg_red"

    .line 188
    .line 189
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    const-string v4, "bg_yellow"

    .line 201
    .line 202
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    const-string v4, "bg_magenta"

    .line 214
    .line 215
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-static {v2, v2, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    const-string v3, "bg_blue"

    .line 227
    .line 228
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const-string v2, "bg_black"

    .line 240
    .line 241
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    sput-object v0, Lul1;->d:Ljava/util/Map;

    .line 249
    .line 250
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 8
    .line 9
    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v5, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    move v7, v6

    .line 24
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    const-string v9, ""

    .line 29
    .line 30
    if-lt v7, v8, :cond_1

    .line 31
    .line 32
    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lrl1;

    .line 43
    .line 44
    invoke-static {v0, v1, v5, v3, v2}, Lul1;->d(Ljava/lang/String;Lrl1;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance v1, Lrl1;

    .line 49
    .line 50
    sget-object v4, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 51
    .line 52
    invoke-direct {v1, v9, v6, v9, v4}, Lrl1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V

    .line 53
    .line 54
    .line 55
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v0, v1, v4, v3, v2}, Lul1;->d(Ljava/lang/String;Lrl1;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :cond_1
    add-int/lit8 v8, v7, 0x1

    .line 66
    .line 67
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    const-string v11, " "

    .line 72
    .line 73
    const/16 v12, 0x3e

    .line 74
    .line 75
    const/16 v13, 0x3c

    .line 76
    .line 77
    const/16 v14, 0x26

    .line 78
    .line 79
    const/4 v15, -0x1

    .line 80
    if-eq v10, v14, :cond_18

    .line 81
    .line 82
    if-eq v10, v13, :cond_2

    .line 83
    .line 84
    invoke-virtual {v3, v10}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 85
    .line 86
    .line 87
    goto/16 :goto_10

    .line 88
    .line 89
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-lt v8, v10, :cond_3

    .line 94
    .line 95
    goto/16 :goto_10

    .line 96
    .line 97
    :cond_3
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    invoke-virtual {v1, v12, v8}, Ljava/lang/String;->indexOf(II)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-ne v8, v15, :cond_4

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    :goto_2
    add-int/lit8 v12, v8, -0x2

    .line 115
    .line 116
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    const/16 v14, 0x2f

    .line 121
    .line 122
    const/16 v16, 0x1

    .line 123
    .line 124
    if-ne v13, v14, :cond_5

    .line 125
    .line 126
    move/from16 v17, v6

    .line 127
    .line 128
    move/from16 v13, v16

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    move v13, v6

    .line 132
    move/from16 v17, v13

    .line 133
    .line 134
    :goto_3
    const/4 v6, 0x2

    .line 135
    if-ne v10, v14, :cond_6

    .line 136
    .line 137
    move/from16 v18, v6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    move/from16 v18, v16

    .line 141
    .line 142
    :goto_4
    add-int v7, v7, v18

    .line 143
    .line 144
    if-eqz v13, :cond_7

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_7
    add-int/lit8 v12, v8, -0x1

    .line 148
    .line 149
    :goto_5
    invoke-virtual {v1, v7, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-eqz v12, :cond_9

    .line 162
    .line 163
    :cond_8
    :goto_6
    move/from16 v15, v17

    .line 164
    .line 165
    goto/16 :goto_b

    .line 166
    .line 167
    :cond_9
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v18

    .line 175
    xor-int/lit8 v18, v18, 0x1

    .line 176
    .line 177
    invoke-static/range {v18 .. v18}, Lzt0;->D(Z)V

    .line 178
    .line 179
    .line 180
    sget-object v18, Lv23;->a:Ljava/lang/String;

    .line 181
    .line 182
    const-string v15, "[ \\.]"

    .line 183
    .line 184
    invoke-virtual {v12, v15, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    aget-object v6, v6, v17

    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    const/16 v15, 0x62

    .line 195
    .line 196
    if-eq v12, v15, :cond_11

    .line 197
    .line 198
    const/16 v15, 0x63

    .line 199
    .line 200
    if-eq v12, v15, :cond_10

    .line 201
    .line 202
    const/16 v15, 0x69

    .line 203
    .line 204
    if-eq v12, v15, :cond_f

    .line 205
    .line 206
    const/16 v15, 0xe42

    .line 207
    .line 208
    if-eq v12, v15, :cond_e

    .line 209
    .line 210
    const v15, 0x3291ee

    .line 211
    .line 212
    .line 213
    if-eq v12, v15, :cond_d

    .line 214
    .line 215
    const v15, 0x3595da

    .line 216
    .line 217
    .line 218
    if-eq v12, v15, :cond_c

    .line 219
    .line 220
    const/16 v15, 0x75

    .line 221
    .line 222
    if-eq v12, v15, :cond_b

    .line 223
    .line 224
    const/16 v15, 0x76

    .line 225
    .line 226
    if-eq v12, v15, :cond_a

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_a
    const-string v12, "v"

    .line 230
    .line 231
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v12

    .line 235
    if-eqz v12, :cond_8

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_b
    const-string v12, "u"

    .line 239
    .line 240
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    if-eqz v12, :cond_8

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_c
    const-string v12, "ruby"

    .line 248
    .line 249
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v12

    .line 253
    if-eqz v12, :cond_8

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_d
    const-string v12, "lang"

    .line 257
    .line 258
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    if-eqz v12, :cond_8

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_e
    const-string v12, "rt"

    .line 266
    .line 267
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v12

    .line 271
    if-eqz v12, :cond_8

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_f
    const-string v12, "i"

    .line 275
    .line 276
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-eqz v12, :cond_8

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_10
    const-string v12, "c"

    .line 284
    .line 285
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v12

    .line 289
    if-eqz v12, :cond_8

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_11
    const-string v12, "b"

    .line 293
    .line 294
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    if-eqz v12, :cond_8

    .line 299
    .line 300
    :goto_7
    if-ne v10, v14, :cond_15

    .line 301
    .line 302
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    if-eqz v7, :cond_13

    .line 307
    .line 308
    goto/16 :goto_6

    .line 309
    .line 310
    :cond_13
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    check-cast v7, Lrl1;

    .line 315
    .line 316
    invoke-static {v0, v7, v5, v3, v2}, Lul1;->d(Ljava/lang/String;Lrl1;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    if-nez v9, :cond_14

    .line 324
    .line 325
    new-instance v9, Lql1;

    .line 326
    .line 327
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    invoke-direct {v9, v7, v10}, Lql1;-><init>(Lrl1;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 339
    .line 340
    .line 341
    :goto_8
    iget-object v7, v7, Lrl1;->a:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-eqz v7, :cond_12

    .line 348
    .line 349
    goto/16 :goto_6

    .line 350
    .line 351
    :cond_15
    if-nez v13, :cond_8

    .line 352
    .line 353
    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->length()I

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v7

    .line 361
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    xor-int/lit8 v10, v10, 0x1

    .line 366
    .line 367
    invoke-static {v10}, Lzt0;->D(Z)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    const/4 v11, -0x1

    .line 375
    if-ne v10, v11, :cond_16

    .line 376
    .line 377
    move/from16 v15, v17

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_16
    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    move/from16 v15, v17

    .line 389
    .line 390
    invoke-virtual {v7, v15, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    :goto_9
    const-string v10, "\\."

    .line 395
    .line 396
    invoke-virtual {v7, v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    aget-object v10, v7, v15

    .line 401
    .line 402
    new-instance v11, Ljava/util/HashSet;

    .line 403
    .line 404
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 405
    .line 406
    .line 407
    move/from16 v12, v16

    .line 408
    .line 409
    :goto_a
    array-length v13, v7

    .line 410
    if-ge v12, v13, :cond_17

    .line 411
    .line 412
    aget-object v13, v7, v12

    .line 413
    .line 414
    invoke-virtual {v11, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    add-int/lit8 v12, v12, 0x1

    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_17
    new-instance v7, Lrl1;

    .line 421
    .line 422
    invoke-direct {v7, v10, v6, v9, v11}, Lrl1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4, v7}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :goto_b
    move v7, v8

    .line 429
    move v6, v15

    .line 430
    goto/16 :goto_0

    .line 431
    .line 432
    :cond_18
    move v15, v6

    .line 433
    const/16 v6, 0x3b

    .line 434
    .line 435
    invoke-virtual {v1, v6, v8}, Ljava/lang/String;->indexOf(II)I

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    const/16 v7, 0x20

    .line 440
    .line 441
    invoke-virtual {v1, v7, v8}, Ljava/lang/String;->indexOf(II)I

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    const/4 v15, -0x1

    .line 446
    if-ne v6, v15, :cond_19

    .line 447
    .line 448
    move v6, v9

    .line 449
    goto :goto_c

    .line 450
    :cond_19
    if-eq v9, v15, :cond_1a

    .line 451
    .line 452
    invoke-static {v6, v9}, Ljava/lang/Math;->min(II)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    :cond_1a
    :goto_c
    if-eq v6, v15, :cond_21

    .line 457
    .line 458
    invoke-virtual {v1, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 463
    .line 464
    .line 465
    move-result v10

    .line 466
    const/16 v15, 0xced

    .line 467
    .line 468
    if-eq v10, v15, :cond_1e

    .line 469
    .line 470
    const/16 v12, 0xd88

    .line 471
    .line 472
    if-eq v10, v12, :cond_1d

    .line 473
    .line 474
    const v12, 0x179c4

    .line 475
    .line 476
    .line 477
    if-eq v10, v12, :cond_1c

    .line 478
    .line 479
    const v12, 0x337f11

    .line 480
    .line 481
    .line 482
    if-eq v10, v12, :cond_1b

    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_1b
    const-string v10, "nbsp"

    .line 486
    .line 487
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-eqz v10, :cond_1f

    .line 492
    .line 493
    invoke-virtual {v3, v7}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 494
    .line 495
    .line 496
    goto :goto_e

    .line 497
    :cond_1c
    const-string v7, "amp"

    .line 498
    .line 499
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    if-eqz v7, :cond_1f

    .line 504
    .line 505
    invoke-virtual {v3, v14}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 506
    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_1d
    const-string v7, "lt"

    .line 510
    .line 511
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v7

    .line 515
    if-eqz v7, :cond_1f

    .line 516
    .line 517
    invoke-virtual {v3, v13}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 518
    .line 519
    .line 520
    goto :goto_e

    .line 521
    :cond_1e
    const-string v7, "gt"

    .line 522
    .line 523
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v7

    .line 527
    if-eqz v7, :cond_1f

    .line 528
    .line 529
    invoke-virtual {v3, v12}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 530
    .line 531
    .line 532
    goto :goto_e

    .line 533
    :cond_1f
    :goto_d
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    new-instance v10, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    add-int/lit8 v7, v7, 0x21

    .line 540
    .line 541
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 542
    .line 543
    .line 544
    const-string v7, "ignoring unsupported entity: \'&"

    .line 545
    .line 546
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    const-string v7, ";\'"

    .line 553
    .line 554
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v7

    .line 561
    invoke-static {v7}, La30;->x(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    :goto_e
    if-ne v6, v9, :cond_20

    .line 565
    .line 566
    invoke-virtual {v3, v11}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 567
    .line 568
    .line 569
    :cond_20
    add-int/lit8 v7, v6, 0x1

    .line 570
    .line 571
    :goto_f
    const/4 v6, 0x0

    .line 572
    goto/16 :goto_0

    .line 573
    .line 574
    :cond_21
    invoke-virtual {v3, v10}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 575
    .line 576
    .line 577
    :goto_10
    move v7, v8

    .line 578
    goto :goto_f
.end method

.method public static b(Ljava/lang/String;Ljava/util/regex/Matcher;Lkz2;Ljava/util/ArrayList;)Lpl1;
    .locals 7

    .line 1
    new-instance v0, Ltl1;

    .line 2
    .line 3
    invoke-direct {v0}, Ltl1;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    invoke-static {v1}, Lyc0;->m(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v0, Ltl1;->a:J

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Lyc0;->m(Ljava/lang/String;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    iput-wide v3, v0, Ltl1;->b:J
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0}, Lul1;->c(Ljava/lang/String;Ltl1;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 50
    .line 51
    invoke-virtual {p2, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-lez v2, :cond_0

    .line 66
    .line 67
    const-string v2, "\n"

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    invoke-virtual {p2, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p0, p1, p3}, Lul1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iput-object p0, v0, Ltl1;->c:Ljava/lang/CharSequence;

    .line 95
    .line 96
    new-instance v1, Lpl1;

    .line 97
    .line 98
    invoke-virtual {v0}, Ltl1;->a()Luh2;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Luh2;->a()Lfi2;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-wide v3, v0, Ltl1;->a:J

    .line 107
    .line 108
    iget-wide v5, v0, Ltl1;->b:J

    .line 109
    .line 110
    invoke-direct/range {v1 .. v6}, Lpl1;-><init>(Lfi2;JJ)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_2
    :try_start_1
    throw v2

    .line 115
    :cond_3
    throw v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    :catch_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const-string p1, "Skipping cue with bad header: "

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, La30;->x(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v2
.end method

.method public static c(Ljava/lang/String;Ltl1;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Lul1;->b:Ljava/util/regex/Pattern;

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, ":"

    .line 12
    .line 13
    const-string v3, "Unknown cue setting "

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_e

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    :try_start_0
    const-string v8, "line"

    .line 38
    .line 39
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    const-string v9, "Invalid anchor value: "

    .line 44
    .line 45
    const/4 v10, -0x1

    .line 46
    const/16 v11, 0x2c

    .line 47
    .line 48
    const-string v13, "center"

    .line 49
    .line 50
    const-string v14, "middle"

    .line 51
    .line 52
    const-string v15, "end"

    .line 53
    .line 54
    const-string v6, "start"

    .line 55
    .line 56
    const/4 v12, 0x0

    .line 57
    if-nez v8, :cond_a

    .line 58
    .line 59
    :try_start_1
    const-string v8, "align"

    .line 60
    .line 61
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-eqz v8, :cond_1

    .line 66
    .line 67
    const-string v5, "Invalid alignment value: "

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v8
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    sparse-switch v8, :sswitch_data_0

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :sswitch_0
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_0

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :sswitch_1
    const-string v4, "right"

    .line 85
    .line 86
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_0

    .line 91
    .line 92
    const/4 v4, 0x5

    .line 93
    goto :goto_3

    .line 94
    :sswitch_2
    const-string v4, "left"

    .line 95
    .line 96
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_0

    .line 101
    .line 102
    const/4 v4, 0x4

    .line 103
    goto :goto_3

    .line 104
    :sswitch_3
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_0

    .line 109
    .line 110
    const/4 v4, 0x3

    .line 111
    goto :goto_3

    .line 112
    :sswitch_4
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_0

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :sswitch_5
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_0

    .line 124
    .line 125
    :goto_1
    const/4 v4, 0x2

    .line 126
    goto :goto_3

    .line 127
    :cond_0
    :goto_2
    :try_start_2
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4}, La30;->x(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_3
    iput v4, v0, Ltl1;->d:I

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    const-string v8, "position"

    .line 139
    .line 140
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-nez v8, :cond_7

    .line 145
    .line 146
    const-string v6, "size"

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_2

    .line 153
    .line 154
    invoke-static {v7}, Lyc0;->t(Ljava/lang/String;)F

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    iput v4, v0, Ltl1;->j:F

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_2
    const-string v6, "vertical"

    .line 163
    .line 164
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_6

    .line 169
    .line 170
    const-string v5, "Invalid \'vertical\' value: "

    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v6
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 176
    const/16 v8, 0xd86

    .line 177
    .line 178
    if-eq v6, v8, :cond_4

    .line 179
    .line 180
    const/16 v8, 0xe3a

    .line 181
    .line 182
    if-eq v6, v8, :cond_3

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_3
    const-string v6, "rl"

    .line 186
    .line 187
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_5

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_4
    const-string v4, "lr"

    .line 195
    .line 196
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_5

    .line 201
    .line 202
    const/4 v4, 0x2

    .line 203
    goto :goto_5

    .line 204
    :cond_5
    :goto_4
    :try_start_3
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v4}, La30;->x(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const/high16 v4, -0x80000000

    .line 212
    .line 213
    :goto_5
    iput v4, v0, Ltl1;->k:I

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_6
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    add-int/lit8 v4, v4, 0x15

    .line 222
    .line 223
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    add-int/2addr v4, v6

    .line 228
    new-instance v6, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-static {v4}, La30;->x(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :cond_7
    invoke-virtual {v7, v11}, Ljava/lang/String;->indexOf(I)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eq v5, v10, :cond_9

    .line 259
    .line 260
    add-int/lit8 v8, v5, 0x1

    .line 261
    .line 262
    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 267
    .line 268
    .line 269
    move-result v10
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 270
    sparse-switch v10, :sswitch_data_1

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :sswitch_6
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_8

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :sswitch_7
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_8

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :sswitch_8
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-eqz v6, :cond_8

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :sswitch_9
    const-string v4, "line-right"

    .line 296
    .line 297
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    if-eqz v4, :cond_8

    .line 302
    .line 303
    :goto_6
    const/4 v4, 0x2

    .line 304
    goto :goto_9

    .line 305
    :sswitch_a
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-eqz v6, :cond_8

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :sswitch_b
    const-string v4, "line-left"

    .line 313
    .line 314
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_8

    .line 319
    .line 320
    :goto_7
    move v4, v12

    .line 321
    goto :goto_9

    .line 322
    :cond_8
    :goto_8
    :try_start_4
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-static {v4}, La30;->x(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    const/high16 v4, -0x80000000

    .line 330
    .line 331
    :goto_9
    iput v4, v0, Ltl1;->i:I

    .line 332
    .line 333
    invoke-virtual {v7, v12, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    :cond_9
    invoke-static {v7}, Lyc0;->t(Ljava/lang/String;)F

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    iput v4, v0, Ltl1;->h:F

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_a
    invoke-virtual {v7, v11}, Ljava/lang/String;->indexOf(I)I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eq v5, v10, :cond_c

    .line 350
    .line 351
    add-int/lit8 v8, v5, 0x1

    .line 352
    .line 353
    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 358
    .line 359
    .line 360
    move-result v10
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 361
    sparse-switch v10, :sswitch_data_2

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :sswitch_c
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    if-eqz v6, :cond_b

    .line 370
    .line 371
    move v6, v12

    .line 372
    goto :goto_c

    .line 373
    :sswitch_d
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    if-eqz v6, :cond_b

    .line 378
    .line 379
    const/4 v6, 0x2

    .line 380
    goto :goto_c

    .line 381
    :sswitch_e
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_b

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :sswitch_f
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-eqz v6, :cond_b

    .line 393
    .line 394
    :goto_a
    move v6, v4

    .line 395
    goto :goto_c

    .line 396
    :cond_b
    :goto_b
    :try_start_5
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    invoke-static {v6}, La30;->x(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const/high16 v6, -0x80000000

    .line 404
    .line 405
    :goto_c
    iput v6, v0, Ltl1;->g:I

    .line 406
    .line 407
    invoke-virtual {v7, v12, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    :cond_c
    const-string v5, "%"

    .line 412
    .line 413
    invoke-virtual {v7, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-eqz v5, :cond_d

    .line 418
    .line 419
    invoke-static {v7}, Lyc0;->t(Ljava/lang/String;)F

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    iput v4, v0, Ltl1;->e:F

    .line 424
    .line 425
    iput v12, v0, Ltl1;->f:I

    .line 426
    .line 427
    goto/16 :goto_0

    .line 428
    .line 429
    :cond_d
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    int-to-float v5, v5

    .line 434
    iput v5, v0, Ltl1;->e:F

    .line 435
    .line 436
    iput v4, v0, Ltl1;->f:I
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0

    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :catch_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    const-string v5, "Skipping bad cue setting: "

    .line 449
    .line 450
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-static {v4}, La30;->x(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :cond_e
    return-void

    .line 460
    nop

    .line 461
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x4009266b -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    :sswitch_data_1
    .sparse-switch
        -0x6dd215c0 -> :sswitch_b
        -0x514d33ab -> :sswitch_a
        -0x4c1a40fd -> :sswitch_9
        -0x4009266b -> :sswitch_8
        0x188db -> :sswitch_7
        0x68ac462 -> :sswitch_6
    .end sparse-switch

    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    :sswitch_data_2
    .sparse-switch
        -0x514d33ab -> :sswitch_f
        -0x4009266b -> :sswitch_e
        0x188db -> :sswitch_d
        0x68ac462 -> :sswitch_c
    .end sparse-switch
.end method

.method public static d(Ljava/lang/String;Lrl1;Ljava/util/List;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget v4, v1, Lrl1;->b:I

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v6, v1, Lrl1;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const/4 v9, -0x1

    .line 22
    const/4 v11, 0x1

    .line 23
    const/16 v12, 0x21

    .line 24
    .line 25
    if-eqz v7, :cond_c

    .line 26
    .line 27
    const/16 v13, 0x69

    .line 28
    .line 29
    if-eq v7, v13, :cond_b

    .line 30
    .line 31
    const v13, 0x3291ee

    .line 32
    .line 33
    .line 34
    if-eq v7, v13, :cond_a

    .line 35
    .line 36
    const v13, 0x3595da

    .line 37
    .line 38
    .line 39
    if-eq v7, v13, :cond_6

    .line 40
    .line 41
    const/16 v13, 0x62

    .line 42
    .line 43
    if-eq v7, v13, :cond_5

    .line 44
    .line 45
    const/16 v13, 0x63

    .line 46
    .line 47
    if-eq v7, v13, :cond_2

    .line 48
    .line 49
    const/16 v13, 0x75

    .line 50
    .line 51
    if-eq v7, v13, :cond_1

    .line 52
    .line 53
    const/16 v13, 0x76

    .line 54
    .line 55
    if-eq v7, v13, :cond_0

    .line 56
    .line 57
    goto/16 :goto_13

    .line 58
    .line 59
    :cond_0
    const-string v7, "v"

    .line 60
    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_21

    .line 66
    .line 67
    iget-object v6, v1, Lrl1;->c:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v7, Lil2;

    .line 70
    .line 71
    invoke-direct {v7, v6}, Lil2;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v7, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_1
    const-string v7, "u"

    .line 80
    .line 81
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_21

    .line 86
    .line 87
    new-instance v6, Landroid/text/style/UnderlineSpan;

    .line 88
    .line 89
    invoke-direct {v6}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v6, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_2
    const-string v7, "c"

    .line 98
    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_21

    .line 104
    .line 105
    iget-object v6, v1, Lrl1;->d:Ljava/util/Set;

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    :cond_3
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_d

    .line 116
    .line 117
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, Ljava/lang/String;

    .line 122
    .line 123
    sget-object v13, Lul1;->c:Ljava/util/Map;

    .line 124
    .line 125
    invoke-interface {v13, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    if-eqz v14, :cond_4

    .line 130
    .line 131
    invoke-interface {v13, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    new-instance v13, Landroid/text/style/ForegroundColorSpan;

    .line 142
    .line 143
    invoke-direct {v13, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v13, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_4
    sget-object v13, Lul1;->d:Ljava/util/Map;

    .line 151
    .line 152
    invoke-interface {v13, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    if-eqz v14, :cond_3

    .line 157
    .line 158
    invoke-interface {v13, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    new-instance v13, Landroid/text/style/BackgroundColorSpan;

    .line 169
    .line 170
    invoke-direct {v13, v7}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v13, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_5
    const-string v7, "b"

    .line 178
    .line 179
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_21

    .line 184
    .line 185
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 186
    .line 187
    invoke-direct {v6, v11}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v6, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :cond_6
    const-string v7, "ruby"

    .line 196
    .line 197
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_21

    .line 202
    .line 203
    invoke-static {v3, v0, v1}, Lul1;->e(Ljava/util/List;Ljava/lang/String;Lrl1;)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    new-instance v7, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    .line 215
    .line 216
    move-object/from16 v13, p2

    .line 217
    .line 218
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 219
    .line 220
    .line 221
    sget-object v13, Lbk;->g:Lbk;

    .line 222
    .line 223
    invoke-static {v7, v13}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 224
    .line 225
    .line 226
    move v15, v4

    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-ge v13, v10, :cond_d

    .line 234
    .line 235
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    check-cast v10, Lql1;

    .line 240
    .line 241
    iget-object v10, v10, Lql1;->a:Lrl1;

    .line 242
    .line 243
    iget-object v10, v10, Lrl1;->a:Ljava/lang/String;

    .line 244
    .line 245
    const-string v11, "rt"

    .line 246
    .line 247
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    if-eqz v10, :cond_9

    .line 252
    .line 253
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    check-cast v10, Lql1;

    .line 258
    .line 259
    iget-object v11, v10, Lql1;->a:Lrl1;

    .line 260
    .line 261
    invoke-static {v3, v0, v11}, Lul1;->e(Ljava/util/List;Ljava/lang/String;Lrl1;)I

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    if-eq v11, v9, :cond_7

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_7
    if-eq v6, v9, :cond_8

    .line 269
    .line 270
    move v11, v6

    .line 271
    goto :goto_2

    .line 272
    :cond_8
    const/4 v11, 0x1

    .line 273
    :goto_2
    iget-object v9, v10, Lql1;->a:Lrl1;

    .line 274
    .line 275
    iget v9, v9, Lrl1;->b:I

    .line 276
    .line 277
    sub-int/2addr v9, v14

    .line 278
    iget v10, v10, Lql1;->b:I

    .line 279
    .line 280
    sub-int/2addr v10, v14

    .line 281
    invoke-virtual {v2, v9, v10}, Landroid/text/SpannableStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    .line 282
    .line 283
    .line 284
    move-result-object v17

    .line 285
    invoke-virtual {v2, v9, v10}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 286
    .line 287
    .line 288
    new-instance v10, Lck2;

    .line 289
    .line 290
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-direct {v10, v8, v11}, Lck2;-><init>(Ljava/lang/String;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v10, v15, v9, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 298
    .line 299
    .line 300
    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    add-int/2addr v14, v8

    .line 305
    move v15, v9

    .line 306
    :cond_9
    add-int/lit8 v13, v13, 0x1

    .line 307
    .line 308
    const/4 v9, -0x1

    .line 309
    const/4 v11, 0x1

    .line 310
    goto :goto_1

    .line 311
    :cond_a
    const-string v7, "lang"

    .line 312
    .line 313
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-eqz v6, :cond_21

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_b
    const-string v7, "i"

    .line 321
    .line 322
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_21

    .line 327
    .line 328
    new-instance v6, Landroid/text/style/StyleSpan;

    .line 329
    .line 330
    const/4 v7, 0x2

    .line 331
    invoke-direct {v6, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v6, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_c
    const-string v7, ""

    .line 339
    .line 340
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    if-eqz v6, :cond_21

    .line 345
    .line 346
    :cond_d
    :goto_3
    invoke-static {v3, v0, v1}, Lul1;->f(Ljava/util/List;Ljava/lang/String;Lrl1;)Ljava/util/ArrayList;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const/4 v1, 0x0

    .line 351
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    if-ge v1, v3, :cond_21

    .line 356
    .line 357
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    check-cast v3, Lsl1;

    .line 362
    .line 363
    iget-object v3, v3, Lsl1;->g:Lol1;

    .line 364
    .line 365
    iget v6, v3, Lol1;->k:I

    .line 366
    .line 367
    const/4 v7, -0x1

    .line 368
    if-ne v6, v7, :cond_e

    .line 369
    .line 370
    iget v8, v3, Lol1;->l:I

    .line 371
    .line 372
    if-eq v8, v7, :cond_f

    .line 373
    .line 374
    :cond_e
    const/4 v7, 0x1

    .line 375
    goto :goto_6

    .line 376
    :cond_f
    const/4 v7, -0x1

    .line 377
    :goto_5
    const/4 v6, -0x1

    .line 378
    goto :goto_9

    .line 379
    :goto_6
    if-ne v6, v7, :cond_10

    .line 380
    .line 381
    move v6, v7

    .line 382
    goto :goto_7

    .line 383
    :cond_10
    const/4 v6, 0x0

    .line 384
    :goto_7
    iget v8, v3, Lol1;->l:I

    .line 385
    .line 386
    if-ne v8, v7, :cond_11

    .line 387
    .line 388
    const/4 v7, 0x2

    .line 389
    goto :goto_8

    .line 390
    :cond_11
    const/4 v7, 0x0

    .line 391
    :goto_8
    or-int/2addr v7, v6

    .line 392
    goto :goto_5

    .line 393
    :goto_9
    if-eq v7, v6, :cond_16

    .line 394
    .line 395
    new-instance v7, Landroid/text/style/StyleSpan;

    .line 396
    .line 397
    iget v8, v3, Lol1;->k:I

    .line 398
    .line 399
    if-ne v8, v6, :cond_12

    .line 400
    .line 401
    iget v9, v3, Lol1;->l:I

    .line 402
    .line 403
    if-eq v9, v6, :cond_13

    .line 404
    .line 405
    :cond_12
    const/4 v9, 0x1

    .line 406
    goto :goto_a

    .line 407
    :cond_13
    move v8, v6

    .line 408
    const/4 v9, 0x1

    .line 409
    goto :goto_d

    .line 410
    :goto_a
    if-ne v8, v9, :cond_14

    .line 411
    .line 412
    move/from16 v16, v9

    .line 413
    .line 414
    goto :goto_b

    .line 415
    :cond_14
    const/16 v16, 0x0

    .line 416
    .line 417
    :goto_b
    iget v8, v3, Lol1;->l:I

    .line 418
    .line 419
    if-ne v8, v9, :cond_15

    .line 420
    .line 421
    const/4 v8, 0x2

    .line 422
    goto :goto_c

    .line 423
    :cond_15
    const/4 v8, 0x0

    .line 424
    :goto_c
    or-int v8, v16, v8

    .line 425
    .line 426
    :goto_d
    invoke-direct {v7, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 427
    .line 428
    .line 429
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 430
    .line 431
    .line 432
    goto :goto_e

    .line 433
    :cond_16
    const/4 v9, 0x1

    .line 434
    :goto_e
    iget v7, v3, Lol1;->j:I

    .line 435
    .line 436
    if-ne v7, v9, :cond_17

    .line 437
    .line 438
    new-instance v7, Landroid/text/style/UnderlineSpan;

    .line 439
    .line 440
    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v7, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 444
    .line 445
    .line 446
    :cond_17
    iget-boolean v7, v3, Lol1;->g:Z

    .line 447
    .line 448
    if-eqz v7, :cond_19

    .line 449
    .line 450
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    .line 451
    .line 452
    iget-boolean v8, v3, Lol1;->g:Z

    .line 453
    .line 454
    if-eqz v8, :cond_18

    .line 455
    .line 456
    iget v8, v3, Lol1;->f:I

    .line 457
    .line 458
    invoke-direct {v7, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 459
    .line 460
    .line 461
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 462
    .line 463
    .line 464
    goto :goto_f

    .line 465
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 466
    .line 467
    const-string v1, "Font color not defined"

    .line 468
    .line 469
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    throw v0

    .line 473
    :cond_19
    :goto_f
    iget-boolean v7, v3, Lol1;->i:Z

    .line 474
    .line 475
    if-eqz v7, :cond_1b

    .line 476
    .line 477
    new-instance v7, Landroid/text/style/BackgroundColorSpan;

    .line 478
    .line 479
    iget-boolean v8, v3, Lol1;->i:Z

    .line 480
    .line 481
    if-eqz v8, :cond_1a

    .line 482
    .line 483
    iget v8, v3, Lol1;->h:I

    .line 484
    .line 485
    invoke-direct {v7, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 486
    .line 487
    .line 488
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 489
    .line 490
    .line 491
    goto :goto_10

    .line 492
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 493
    .line 494
    const-string v1, "Background color not defined."

    .line 495
    .line 496
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    throw v0

    .line 500
    :cond_1b
    :goto_10
    iget-object v7, v3, Lol1;->e:Ljava/lang/String;

    .line 501
    .line 502
    if-eqz v7, :cond_1c

    .line 503
    .line 504
    new-instance v7, Landroid/text/style/TypefaceSpan;

    .line 505
    .line 506
    iget-object v8, v3, Lol1;->e:Ljava/lang/String;

    .line 507
    .line 508
    invoke-direct {v7, v8}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 512
    .line 513
    .line 514
    :cond_1c
    iget v7, v3, Lol1;->m:I

    .line 515
    .line 516
    const/4 v9, 0x1

    .line 517
    if-eq v7, v9, :cond_1f

    .line 518
    .line 519
    const/4 v8, 0x2

    .line 520
    if-eq v7, v8, :cond_1e

    .line 521
    .line 522
    const/4 v9, 0x3

    .line 523
    if-eq v7, v9, :cond_1d

    .line 524
    .line 525
    :goto_11
    const/4 v10, 0x1

    .line 526
    goto :goto_12

    .line 527
    :cond_1d
    new-instance v7, Landroid/text/style/RelativeSizeSpan;

    .line 528
    .line 529
    iget v9, v3, Lol1;->n:F

    .line 530
    .line 531
    const/high16 v10, 0x42c80000    # 100.0f

    .line 532
    .line 533
    div-float/2addr v9, v10

    .line 534
    invoke-direct {v7, v9}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 535
    .line 536
    .line 537
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 538
    .line 539
    .line 540
    goto :goto_11

    .line 541
    :cond_1e
    new-instance v7, Landroid/text/style/RelativeSizeSpan;

    .line 542
    .line 543
    iget v9, v3, Lol1;->n:F

    .line 544
    .line 545
    invoke-direct {v7, v9}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 546
    .line 547
    .line 548
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 549
    .line 550
    .line 551
    goto :goto_11

    .line 552
    :cond_1f
    const/4 v8, 0x2

    .line 553
    new-instance v7, Landroid/text/style/AbsoluteSizeSpan;

    .line 554
    .line 555
    iget v9, v3, Lol1;->n:F

    .line 556
    .line 557
    float-to-int v9, v9

    .line 558
    const/4 v10, 0x1

    .line 559
    invoke-direct {v7, v9, v10}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 560
    .line 561
    .line 562
    invoke-static {v2, v7, v4, v5}, Li30;->b0(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;II)V

    .line 563
    .line 564
    .line 565
    :goto_12
    iget-boolean v3, v3, Lol1;->p:Z

    .line 566
    .line 567
    if-eqz v3, :cond_20

    .line 568
    .line 569
    new-instance v3, Lvj2;

    .line 570
    .line 571
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v3, v4, v5, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 575
    .line 576
    .line 577
    :cond_20
    add-int/lit8 v1, v1, 0x1

    .line 578
    .line 579
    goto/16 :goto_4

    .line 580
    .line 581
    :cond_21
    :goto_13
    return-void
.end method

.method public static e(Ljava/util/List;Ljava/lang/String;Lrl1;)I
    .locals 1

    .line 1
    invoke-static {p0, p1, p2}, Lul1;->f(Ljava/util/List;Ljava/lang/String;Lrl1;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v0, -0x1

    .line 11
    if-ge p1, p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lsl1;

    .line 18
    .line 19
    iget-object p2, p2, Lsl1;->g:Lol1;

    .line 20
    .line 21
    iget p2, p2, Lol1;->o:I

    .line 22
    .line 23
    if-eq p2, v0, :cond_0

    .line 24
    .line 25
    return p2

    .line 26
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return v0
.end method

.method public static f(Ljava/util/List;Ljava/lang/String;Lrl1;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_4

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lol1;

    .line 19
    .line 20
    iget-object v4, p2, Lrl1;->a:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v5, p2, Lrl1;->d:Ljava/util/Set;

    .line 23
    .line 24
    iget-object v6, p2, Lrl1;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v7, v3, Lol1;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    iget-object v7, v3, Lol1;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    iget-object v7, v3, Lol1;->c:Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    iget-object v7, v3, Lol1;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_1

    .line 57
    .line 58
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    :goto_1
    move v4, v1

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    iget-object v7, v3, Lol1;->a:Ljava/lang/String;

    .line 69
    .line 70
    const/high16 v8, 0x40000000    # 2.0f

    .line 71
    .line 72
    invoke-static {v1, v8, v7, p1}, Lol1;->a(IILjava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    iget-object v8, v3, Lol1;->b:Ljava/lang/String;

    .line 77
    .line 78
    const/4 v9, 0x2

    .line 79
    invoke-static {v7, v9, v8, v4}, Lol1;->a(IILjava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    iget-object v7, v3, Lol1;->d:Ljava/lang/String;

    .line 84
    .line 85
    const/4 v8, 0x4

    .line 86
    invoke-static {v4, v8, v7, v6}, Lol1;->a(IILjava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/4 v6, -0x1

    .line 91
    if-eq v4, v6, :cond_0

    .line 92
    .line 93
    iget-object v6, v3, Lol1;->c:Ljava/util/Set;

    .line 94
    .line 95
    invoke-interface {v5, v6}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    iget-object v5, v3, Lol1;->c:Ljava/util/Set;

    .line 103
    .line 104
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    mul-int/2addr v5, v8

    .line 109
    add-int/2addr v4, v5

    .line 110
    :goto_2
    if-lez v4, :cond_3

    .line 111
    .line 112
    new-instance v5, Lsl1;

    .line 113
    .line 114
    invoke-direct {v5, v4, v3}, Lsl1;-><init>(ILol1;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    return-object v0
.end method
