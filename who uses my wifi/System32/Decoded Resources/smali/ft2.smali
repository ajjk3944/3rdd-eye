.class public final Lft2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lzs2;

.field public final c:Lvs1;

.field public final d:Le51;

.field public final e:Ll92;

.field public final f:Lcx1;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lr12;

.field public final i:Lmt2;

.field public final j:Lpu2;

.field public final k:Ljava/util/concurrent/ScheduledExecutorService;

.field public final l:Ldu2;

.field public final m:Lmv2;

.field public final n:Leb3;

.field public final o:Ljz2;

.field public final p:Lpz2;

.field public final q:Lm83;

.field public final r:Ljv2;

.field public final s:Lxv2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lzs2;Lvs1;Le51;Ll92;Lcx1;Lld2;Ll83;Lmt2;Lpu2;Ljava/util/concurrent/ScheduledExecutorService;Lmv2;Leb3;Ljz2;Ldu2;Lpz2;Lm83;Ljv2;Lxv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lft2;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lft2;->b:Lzs2;

    .line 7
    .line 8
    iput-object p3, p0, Lft2;->c:Lvs1;

    .line 9
    .line 10
    iput-object p4, p0, Lft2;->d:Le51;

    .line 11
    .line 12
    iput-object p5, p0, Lft2;->e:Ll92;

    .line 13
    .line 14
    iput-object p6, p0, Lft2;->f:Lcx1;

    .line 15
    .line 16
    iput-object p7, p0, Lft2;->g:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iget-object p1, p8, Ll83;->j:Lr12;

    .line 19
    .line 20
    iput-object p1, p0, Lft2;->h:Lr12;

    .line 21
    .line 22
    iput-object p9, p0, Lft2;->i:Lmt2;

    .line 23
    .line 24
    iput-object p10, p0, Lft2;->j:Lpu2;

    .line 25
    .line 26
    iput-object p11, p0, Lft2;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    iput-object p12, p0, Lft2;->m:Lmv2;

    .line 29
    .line 30
    iput-object p13, p0, Lft2;->n:Leb3;

    .line 31
    .line 32
    iput-object p14, p0, Lft2;->o:Ljz2;

    .line 33
    .line 34
    iput-object p15, p0, Lft2;->l:Ldu2;

    .line 35
    .line 36
    move-object/from16 p1, p16

    .line 37
    .line 38
    iput-object p1, p0, Lft2;->p:Lpz2;

    .line 39
    .line 40
    move-object/from16 p1, p17

    .line 41
    .line 42
    iput-object p1, p0, Lft2;->q:Lm83;

    .line 43
    .line 44
    move-object/from16 p1, p18

    .line 45
    .line 46
    iput-object p1, p0, Lft2;->r:Ljv2;

    .line 47
    .line 48
    move-object/from16 p1, p19

    .line 49
    .line 50
    iput-object p1, p0, Lft2;->s:Lxv2;

    .line 51
    .line 52
    return-void
.end method

.method public static c(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "r"

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const-string v0, "g"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-string v1, "b"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p1, v0, p0}, Landroid/graphics/Color;->rgb(III)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-object p0

    .line 32
    :catch_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static final e(Lorg/json/JSONObject;)Lc63;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "reason"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ping_url"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    new-instance v1, Lc63;

    .line 29
    .line 30
    invoke-direct {v1, v0, p0}, Lc63;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method


# virtual methods
.method public final a(Lorg/json/JSONArray;ZZI)Ln70;
    .locals 5

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move p3, v1

    .line 24
    :goto_0
    sget-object v2, Lmz1;->t2:Liz1;

    .line 25
    .line 26
    sget-object v3, Ltw1;->e:Ltw1;

    .line 27
    .line 28
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, Lft2;->r:Ljv2;

    .line 44
    .line 45
    iget-object v2, v2, Ljv2;->e:Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-static {p4}, Lga1;->b(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    sget-object v4, Lhg4;->C:Lhg4;

    .line 52
    .line 53
    iget-object v4, v4, Lhg4;->k:Lym;

    .line 54
    .line 55
    invoke-static {v4, v2, p4}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    move p4, v3

    .line 59
    :goto_1
    if-ge p4, p3, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1, p4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p0, v2, p2, v3}, Lft2;->b(Lorg/json/JSONObject;ZI)Ln70;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 p4, p4, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    new-instance p1, Lzp3;

    .line 76
    .line 77
    invoke-static {v0}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-direct {p1, p2, v1}, Lzp3;-><init>(Lxm3;Z)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, Lft2;->g:Ljava/util/concurrent/Executor;

    .line 85
    .line 86
    sget-object p3, Lgj1;->k:Lgj1;

    .line 87
    .line 88
    invoke-static {p1, p3, p2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_4
    :goto_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method public final b(Lorg/json/JSONObject;ZI)Ln70;
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Llq3;->g:Llq3;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    sget-object v0, Lmz1;->o4:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    sget-object v0, Lmz1;->p4:Liz1;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    new-instance v2, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lmz1;->q4:Liz1;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    const-string v1, ","

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    array-length v1, v0

    .line 61
    const/4 v3, 0x0

    .line 62
    :goto_0
    if-ge v3, v1, :cond_1

    .line 63
    .line 64
    aget-object v4, v0, v3

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    :catch_0
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move-object v11, v2

    .line 77
    const-string v0, "url"

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    if-eqz v11, :cond_2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    sget-object p1, Llq3;->g:Llq3;

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_3
    :goto_1
    sget-object v0, Lmz1;->t2:Liz1;

    .line 96
    .line 97
    sget-object v1, Ltw1;->e:Ltw1;

    .line 98
    .line 99
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    if-eqz p3, :cond_4

    .line 114
    .line 115
    iget-object v0, p0, Lft2;->r:Ljv2;

    .line 116
    .line 117
    iget-object v0, v0, Ljv2;->e:Landroid/os/Bundle;

    .line 118
    .line 119
    invoke-static {p3}, Lga1;->b(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    sget-object v1, Lhg4;->C:Lhg4;

    .line 124
    .line 125
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 126
    .line 127
    invoke-static {v1, v0, p3}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    const-string p3, "scale"

    .line 131
    .line 132
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 133
    .line 134
    invoke-virtual {p1, p3, v0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    const-string p3, "is_transparent"

    .line 139
    .line 140
    const/4 v0, 0x1

    .line 141
    invoke-virtual {p1, p3, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    const-string v0, "width"

    .line 146
    .line 147
    const/4 v1, -0x1

    .line 148
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    const-string v0, "height"

    .line 153
    .line 154
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-nez p2, :cond_5

    .line 159
    .line 160
    if-eqz v11, :cond_6

    .line 161
    .line 162
    :cond_5
    move-wide v7, v3

    .line 163
    goto :goto_3

    .line 164
    :cond_6
    iget-object p2, p0, Lft2;->b:Lzs2;

    .line 165
    .line 166
    iget-object v0, p2, Lzs2;->a:Lp32;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    new-instance v0, Lpd2;

    .line 172
    .line 173
    invoke-direct {v0}, Lpd2;-><init>()V

    .line 174
    .line 175
    .line 176
    sget-object v1, Lp32;->a:Lko1;

    .line 177
    .line 178
    new-instance v7, Lb32;

    .line 179
    .line 180
    invoke-direct {v7, v2, v0}, Lb32;-><init>(Ljava/lang/String;Lpd2;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v7}, Lko1;->b(Ljo1;)V

    .line 184
    .line 185
    .line 186
    new-instance v1, Lys2;

    .line 187
    .line 188
    invoke-direct {v1, p2, v3, v4, p3}, Lys2;-><init>(Lzs2;DZ)V

    .line 189
    .line 190
    .line 191
    iget-object p2, p2, Lzs2;->c:Ljava/util/concurrent/Executor;

    .line 192
    .line 193
    invoke-static {v0, v1, p2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    new-instance v1, Lct2;

    .line 198
    .line 199
    invoke-direct/range {v1 .. v6}, Lct2;-><init>(Ljava/lang/String;DII)V

    .line 200
    .line 201
    .line 202
    iget-object p3, p0, Lft2;->g:Ljava/util/concurrent/Executor;

    .line 203
    .line 204
    invoke-static {p2, v1, p3}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    const-string p3, "require"

    .line 209
    .line 210
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_7

    .line 215
    .line 216
    new-instance p1, Lu42;

    .line 217
    .line 218
    const/4 p3, 0x5

    .line 219
    invoke-direct {p1, p3, p2}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    sget-object p3, Lmd2;->g:Lld2;

    .line 223
    .line 224
    invoke-static {p2, p1, p3}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    goto :goto_2

    .line 229
    :cond_7
    new-instance p1, Lfi1;

    .line 230
    .line 231
    const/4 p3, 0x2

    .line 232
    invoke-direct {p1, p3}, Lfi1;-><init>(I)V

    .line 233
    .line 234
    .line 235
    sget-object p3, Lmd2;->g:Lld2;

    .line 236
    .line 237
    const-class v0, Ljava/lang/Exception;

    .line 238
    .line 239
    invoke-static {p2, v0, p1, p3}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    :goto_2
    return-object p1

    .line 244
    :goto_3
    new-instance v4, Lp12;

    .line 245
    .line 246
    move v9, v5

    .line 247
    const/4 v5, 0x0

    .line 248
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    move v10, v6

    .line 253
    move-object v6, p1

    .line 254
    invoke-direct/range {v4 .. v11}, Lp12;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DIILjava/util/HashMap;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v4}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    return-object p1
.end method

.method public final d(Lorg/json/JSONObject;La83;Lc83;Lsu1;Lqb2;)Lqp3;
    .locals 11

    .line 1
    const-string v0, "base_url"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v8

    .line 7
    const-string v0, "html"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    const-string v0, "width"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v2, "height"

    .line 21
    .line 22
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, Lxe4;->a()Lxe4;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    move-object v3, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v1, v0

    .line 38
    :goto_0
    new-instance v0, Lxe4;

    .line 39
    .line 40
    new-instance v2, Ld3;

    .line 41
    .line 42
    invoke-direct {v2, v1, p1}, Ld3;-><init>(II)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lft2;->a:Landroid/content/Context;

    .line 46
    .line 47
    invoke-direct {v0, p1, v2}, Lxe4;-><init>(Landroid/content/Context;Ld3;)V

    .line 48
    .line 49
    .line 50
    move-object v3, v0

    .line 51
    :goto_1
    iget-object v2, p0, Lft2;->i:Lmt2;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object p1, Lmz1;->t2:Liz1;

    .line 57
    .line 58
    sget-object v0, Ltw1;->e:Ltw1;

    .line 59
    .line 60
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    iget-object p1, v2, Lmt2;->i:Ljv2;

    .line 75
    .line 76
    iget-object p1, p1, Ljv2;->e:Landroid/os/Bundle;

    .line 77
    .line 78
    sget-object v0, Lhg4;->C:Lhg4;

    .line 79
    .line 80
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 81
    .line 82
    const-string v1, "native-assets-loading-video-composition-start"

    .line 83
    .line 84
    invoke-static {v0, p1, v1}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    sget-object p1, Llq3;->g:Llq3;

    .line 88
    .line 89
    new-instance v1, Ldt2;

    .line 90
    .line 91
    const/4 v10, 0x1

    .line 92
    move-object v4, p2

    .line 93
    move-object v5, p3

    .line 94
    move-object v6, p4

    .line 95
    move-object/from16 v7, p5

    .line 96
    .line 97
    invoke-direct/range {v1 .. v10}, Ldt2;-><init>(Ljava/lang/Object;Lxe4;La83;Lc83;Lsu1;Lsb2;Ljava/lang/String;Ljava/lang/String;I)V

    .line 98
    .line 99
    .line 100
    iget-object p2, v2, Lmt2;->b:Ljava/util/concurrent/Executor;

    .line 101
    .line 102
    invoke-static {p1, v1, p2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance p2, Let2;

    .line 107
    .line 108
    const/4 p3, 0x1

    .line 109
    invoke-direct {p2, p1, p3}, Let2;-><init>(Lqp3;I)V

    .line 110
    .line 111
    .line 112
    sget-object p3, Lmd2;->g:Lld2;

    .line 113
    .line 114
    invoke-static {p1, p2, p3}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1
.end method
