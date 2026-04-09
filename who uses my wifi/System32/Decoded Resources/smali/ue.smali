.class public final Lue;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lpl0;
.implements Lmf1;
.implements Lnf1;
.implements Lo93;


# instance fields
.field public final synthetic f:I

.field public g:J

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lue;->f:I

    packed-switch p1, :pswitch_data_0

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lue;->g:J

    return-void

    .line 8
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lue;->h:Ljava/lang/Object;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lue;->g:J

    return-void

    .line 9
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 10
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lue;->h:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lue;->f:I

    iput-wide p1, p0, Lue;->g:J

    iput-object p3, p0, Lue;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    iput p4, p0, Lue;->f:I

    iput-object p1, p0, Lue;->h:Ljava/lang/Object;

    iput-wide p2, p0, Lue;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmf1;J)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lue;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lue;->h:Ljava/lang/Object;

    .line 4
    invoke-interface {p1}, Lmf1;->o()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    invoke-static {p1}, Lzt0;->D(Z)V

    iput-wide p2, p0, Lue;->g:J

    return-void
.end method

.method public static final G(Lmv2;Ljava/lang/String;J)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lmz1;->vd:Liz1;

    .line 4
    .line 5
    sget-object v1, Ltw1;->e:Ltw1;

    .line 6
    .line 7
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lmv2;->a()Llv2;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "action"

    .line 26
    .line 27
    const-string v1, "lat_init"

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, p1, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Llv2;->m()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lmf1;->A(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public B([BIIZ)Z
    .locals 1

    .line 1
    iget-object p2, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lmf1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p2, p1, v0, p3, p4}, Lmf1;->B([BIIZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public C(I)Z
    .locals 10

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lue;->m()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lue;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lue;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1}, Lue;->C(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const-wide/16 v0, 0x1

    .line 19
    .line 20
    shl-long v2, v0, p1

    .line 21
    .line 22
    iget-wide v4, p0, Lue;->g:J

    .line 23
    .line 24
    and-long v6, v4, v2

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    cmp-long p1, v6, v8

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    move p1, v6

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p1, v7

    .line 37
    :goto_0
    not-long v8, v2

    .line 38
    and-long/2addr v4, v8

    .line 39
    iput-wide v4, p0, Lue;->g:J

    .line 40
    .line 41
    sub-long/2addr v2, v0

    .line 42
    and-long v0, v4, v2

    .line 43
    .line 44
    not-long v2, v2

    .line 45
    and-long/2addr v2, v4

    .line 46
    invoke-static {v2, v3, v6}, Ljava/lang/Long;->rotateRight(JI)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    or-long/2addr v0, v2

    .line 51
    iput-wide v0, p0, Lue;->g:J

    .line 52
    .line 53
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lue;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v7}, Lue;->q(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/16 v0, 0x3f

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lue;->E(I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lue;

    .line 73
    .line 74
    invoke-virtual {v0, v7}, Lue;->C(I)Z

    .line 75
    .line 76
    .line 77
    :cond_3
    return p1
.end method

.method public D()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lue;->g:J

    .line 4
    .line 5
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lue;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lue;->D()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public E(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lue;->m()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lue;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lue;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1}, Lue;->E(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, Lue;->g:J

    .line 18
    .line 19
    const-wide/16 v2, 0x1

    .line 20
    .line 21
    shl-long/2addr v2, p1

    .line 22
    or-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lue;->g:J

    .line 24
    .line 25
    return-void
.end method

.method public F(Landroid/content/Context;Le51;ZLed2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Lea3;Lmv2;Ljava/lang/Long;Z)V
    .locals 10

    .line 1
    move-object/from16 v1, p7

    .line 2
    .line 3
    move-object/from16 v2, p8

    .line 4
    .line 5
    sget-object v3, Lhg4;->C:Lhg4;

    .line 6
    .line 7
    iget-object v4, v3, Lhg4;->k:Lym;

    .line 8
    .line 9
    iget-object v5, v3, Lhg4;->k:Lym;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v6

    .line 18
    iget-wide v8, p0, Lue;->g:J

    .line 19
    .line 20
    sub-long/2addr v6, v8

    .line 21
    const-wide/16 v8, 0x1388

    .line 22
    .line 23
    cmp-long v4, v6, v8

    .line 24
    .line 25
    if-gez v4, :cond_0

    .line 26
    .line 27
    const-string p1, "Not retrying to fetch app settings"

    .line 28
    .line 29
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    iput-wide v6, p0, Lue;->g:J

    .line 41
    .line 42
    if-eqz p4, :cond_2

    .line 43
    .line 44
    iget-object v4, p4, Led2;->e:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-wide v6, p4, Led2;->f:J

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    sub-long/2addr v4, v6

    .line 63
    sget-object v6, Lmz1;->A4:Liz1;

    .line 64
    .line 65
    sget-object v7, Ltw1;->e:Ltw1;

    .line 66
    .line 67
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 68
    .line 69
    invoke-virtual {v7, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    cmp-long v4, v4, v6

    .line 80
    .line 81
    if-gtz v4, :cond_2

    .line 82
    .line 83
    iget-boolean v0, p4, Led2;->h:Z

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 90
    .line 91
    const-string p1, "Context not provided to fetch application settings"

    .line 92
    .line 93
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const-string p1, "App settings could not be fetched. Required parameters missing"

    .line 111
    .line 112
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v0, :cond_6

    .line 121
    .line 122
    move-object v0, p1

    .line 123
    :cond_6
    iput-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 124
    .line 125
    const/4 v0, 0x4

    .line 126
    invoke-static {p1, v0}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-interface {v4}, Laa3;->a()Laa3;

    .line 131
    .line 132
    .line 133
    iget-object v0, v3, Lhg4;->r:Lp21;

    .line 134
    .line 135
    iget-object v3, p0, Lue;->h:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v3, Landroid/content/Context;

    .line 138
    .line 139
    invoke-virtual {v0, v3, p2, v2}, Lp21;->C(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v3, "google.afma.config.fetchAppSettings"

    .line 144
    .line 145
    sget-object v5, Lh62;->b:Lus0;

    .line 146
    .line 147
    invoke-virtual {v0, v3, v5, v5}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const/4 v3, 0x0

    .line 152
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 153
    .line 154
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 161
    if-nez v6, :cond_7

    .line 162
    .line 163
    :try_start_1
    const-string v6, "app_id"

    .line 164
    .line 165
    invoke-virtual {v5, v6, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catch_0
    move-exception v0

    .line 170
    move-object p1, v0

    .line 171
    move-object p2, p1

    .line 172
    move-object p1, v4

    .line 173
    goto/16 :goto_7

    .line 174
    .line 175
    :cond_7
    :try_start_2
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 179
    if-nez v6, :cond_8

    .line 180
    .line 181
    :try_start_3
    const-string v6, "ad_unit_id"

    .line 182
    .line 183
    move-object/from16 v7, p6

    .line 184
    .line 185
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_2
    :try_start_4
    const-string v6, "is_init"

    .line 189
    .line 190
    invoke-virtual {v5, v6, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    const-string p3, "pn"

    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-virtual {v5, p3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    const-string p3, "experiment_ids"

    .line 203
    .line 204
    const-string v6, ","

    .line 205
    .line 206
    sget-object v7, Lmz1;->a:Liz1;

    .line 207
    .line 208
    sget-object v7, Ltw1;->e:Ltw1;

    .line 209
    .line 210
    iget-object v8, v7, Ltw1;->a:Lxb4;

    .line 211
    .line 212
    invoke-virtual {v8}, Lxb4;->H()Ljava/util/ArrayList;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-static {v6, v8}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v5, p3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    .line 222
    .line 223
    const-string p3, "js"

    .line 224
    .line 225
    iget-object p2, p2, Le51;->f:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v5, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 228
    .line 229
    .line 230
    sget-object p2, Lmz1;->oa:Liz1;

    .line 231
    .line 232
    iget-object p3, v7, Ltw1;->c:Lkz1;

    .line 233
    .line 234
    invoke-virtual {p3, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    check-cast p2, Ljava/lang/Boolean;

    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 241
    .line 242
    .line 243
    move-result p2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 244
    if-eqz p2, :cond_9

    .line 245
    .line 246
    :try_start_5
    const-string p2, "inspector_enabled"

    .line 247
    .line 248
    move/from16 p3, p11

    .line 249
    .line 250
    invoke-virtual {v5, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 251
    .line 252
    .line 253
    :cond_9
    :try_start_6
    iget-object p2, p0, Lue;->h:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast p2, Landroid/content/Context;

    .line 256
    .line 257
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    if-eqz p2, :cond_a

    .line 262
    .line 263
    invoke-static {p1}, Lza1;->a(Landroid/content/Context;)Lzj0;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 268
    .line 269
    invoke-virtual {p1, p2, v3}, Lzj0;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    if-eqz p1, :cond_a

    .line 274
    .line 275
    const-string p2, "version"

    .line 276
    .line 277
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 278
    .line 279
    invoke-virtual {v5, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :catch_1
    :try_start_7
    const-string p1, "Error fetching PackageInfo."

    .line 284
    .line 285
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    :cond_a
    :goto_3
    invoke-virtual {v0, v5}, Lk62;->a(Ljava/lang/Object;)Ln70;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    new-instance p1, Lk62;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 293
    .line 294
    const/4 p2, 0x2

    .line 295
    move/from16 p6, p2

    .line 296
    .line 297
    move-object/from16 p3, p9

    .line 298
    .line 299
    move-object/from16 p2, p10

    .line 300
    .line 301
    move-object p5, v2

    .line 302
    move-object p4, v4

    .line 303
    :try_start_8
    invoke-direct/range {p1 .. p6}, Lk62;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 304
    .line 305
    .line 306
    move-object p3, p1

    .line 307
    move-object p1, p4

    .line 308
    :try_start_9
    sget-object v4, Lmd2;->g:Lld2;

    .line 309
    .line 310
    invoke-static {v0, p3, v4}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 311
    .line 312
    .line 313
    move-result-object p3

    .line 314
    if-eqz v1, :cond_b

    .line 315
    .line 316
    move-object v5, v0

    .line 317
    check-cast v5, Lpd2;

    .line 318
    .line 319
    iget-object v5, v5, Lpd2;->f:Lwq3;

    .line 320
    .line 321
    invoke-virtual {v5, v1, v4}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 322
    .line 323
    .line 324
    :cond_b
    if-eqz p2, :cond_c

    .line 325
    .line 326
    new-instance v1, Ln62;

    .line 327
    .line 328
    const/16 v5, 0x1b

    .line 329
    .line 330
    move-object/from16 v6, p9

    .line 331
    .line 332
    invoke-direct {v1, v6, p2, v5}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 333
    .line 334
    .line 335
    check-cast v0, Lpd2;

    .line 336
    .line 337
    iget-object p2, v0, Lpd2;->f:Lwq3;

    .line 338
    .line 339
    invoke-virtual {p2, v1, v4}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :catch_2
    move-exception v0

    .line 344
    :goto_4
    move-object p2, v0

    .line 345
    goto :goto_7

    .line 346
    :cond_c
    :goto_5
    sget-object p2, Lmz1;->h8:Liz1;

    .line 347
    .line 348
    sget-object v0, Ltw1;->e:Ltw1;

    .line 349
    .line 350
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 351
    .line 352
    invoke-virtual {v0, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    check-cast p2, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    .line 362
    const-string v0, "ConfigLoader.maybeFetchNewAppSettings"

    .line 363
    .line 364
    if-eqz p2, :cond_d

    .line 365
    .line 366
    :try_start_a
    new-instance p2, Lbs3;

    .line 367
    .line 368
    const/4 v1, 0x2

    .line 369
    invoke-direct {p2, v0, v1}, Lbs3;-><init>(Ljava/lang/String;I)V

    .line 370
    .line 371
    .line 372
    new-instance v0, Ljq3;

    .line 373
    .line 374
    invoke-direct {v0, p3, p2, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p3, v0, v4}, Lgp3;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 378
    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_d
    invoke-static {p3, v0}, Lum;->F(Ln70;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 382
    .line 383
    .line 384
    :goto_6
    return-void

    .line 385
    :catch_3
    move-exception v0

    .line 386
    move-object p1, p4

    .line 387
    move-object v2, p5

    .line 388
    goto :goto_4

    .line 389
    :catch_4
    move-exception v0

    .line 390
    move-object p1, v4

    .line 391
    goto :goto_4

    .line 392
    :goto_7
    const-string p3, "Error requesting application settings"

    .line 393
    .line 394
    invoke-static {p3, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    invoke-interface {p1, p2}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 398
    .line 399
    .line 400
    invoke-interface {p1, v3}, Laa3;->b(Z)Laa3;

    .line 401
    .line 402
    .line 403
    invoke-interface {p1}, Laa3;->n()Lca3;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-virtual {v2, p1}, Lea3;->b(Lca3;)V

    .line 408
    .line 409
    .line 410
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lfz2;

    .line 6
    .line 7
    iget-object v0, v0, Le6;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lra4;

    .line 10
    .line 11
    invoke-virtual {v0}, Lra4;->s()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, Lue;->g:J

    .line 18
    .line 19
    invoke-static {}, Lkx1;->Q()Ljx1;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ln54;->b()V

    .line 24
    .line 25
    .line 26
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 27
    .line 28
    check-cast v3, Lkx1;

    .line 29
    .line 30
    invoke-virtual {v3, v0, v1}, Lkx1;->M(J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ln54;->d()Lp54;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lkx1;

    .line 38
    .line 39
    invoke-virtual {v2}, Ls44;->b()[B

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'total_requests\'"

    .line 44
    .line 45
    invoke-virtual {p1, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0, v1, v2}, Lwl2;->R(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    .line 49
    .line 50
    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method public d([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lua4;->d([BII)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public e(I)V
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lue;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lue;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sub-int/2addr p1, v0

    .line 12
    invoke-virtual {v1, p1}, Lue;->e(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    iget-wide v0, p0, Lue;->g:J

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    shl-long/2addr v2, p1

    .line 21
    not-long v2, v2

    .line 22
    and-long/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lue;->g:J

    .line 24
    .line 25
    return-void
.end method

.method public f(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lue;

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    if-lt p1, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lue;->g:J

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    iget-wide v0, p0, Lue;->g:J

    .line 21
    .line 22
    shl-long v4, v2, p1

    .line 23
    .line 24
    sub-long/2addr v4, v2

    .line 25
    and-long/2addr v0, v4

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    if-ge p1, v1, :cond_2

    .line 32
    .line 33
    iget-wide v0, p0, Lue;->g:J

    .line 34
    .line 35
    shl-long v4, v2, p1

    .line 36
    .line 37
    sub-long/2addr v4, v2

    .line 38
    and-long/2addr v0, v4

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_2
    sub-int/2addr p1, v1

    .line 45
    invoke-virtual {v0, p1}, Lue;->f(I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-wide v0, p0, Lue;->g:J

    .line 50
    .line 51
    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, p1

    .line 56
    return v0
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lmf1;->i()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    const-string v0, "openPorts"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 9
    .line 10
    new-instance v1, Lll0;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v1, v0, v2}, Lll0;-><init>(Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    iget-wide v3, p0, Lue;->g:J

    .line 28
    .line 29
    sub-long/2addr v1, v3

    .line 30
    long-to-float v1, v1

    .line 31
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 32
    .line 33
    div-float/2addr v1, v2

    .line 34
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance v2, Ljava/text/DecimalFormat;

    .line 42
    .line 43
    const-string v3, "#,##0"

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lol0;

    .line 49
    .line 50
    invoke-direct {v3}, Lol0;-><init>()V

    .line 51
    .line 52
    .line 53
    const v4, 0x7f0800bb

    .line 54
    .line 55
    .line 56
    iput v4, v3, Lol0;->a:I

    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v2, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v4, "Open Ports: "

    .line 69
    .line 70
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, "\nTime taken: "

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, "s"

    .line 85
    .line 86
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string v1, "<set-?>"

    .line 94
    .line 95
    invoke-static {p1, v1}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-object p1, v3, Lol0;->b:Ljava/lang/String;

    .line 99
    .line 100
    const/4 p1, -0x1

    .line 101
    iput p1, v3, Lol0;->d:I

    .line 102
    .line 103
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    const-string v2, "dataList"

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :try_start_0
    iget-object p1, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->F:Lc10;

    .line 114
    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 118
    .line 119
    if-eqz v0, :cond_1

    .line 120
    .line 121
    invoke-static {v0}, Lzf;->i0(Ljava/util/List;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iget-object p1, p1, Lao0;->f:Lbo0;

    .line 126
    .line 127
    const/4 v1, 0x1

    .line 128
    invoke-virtual {p1, v0, v1}, Lbo0;->d(II)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catch_0
    move-exception p1

    .line 133
    goto :goto_0

    .line 134
    :cond_1
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    :cond_2
    const-string p1, "portAdapter"

    .line 139
    .line 140
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    invoke-static {v2}, Li30;->S(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1
.end method

.method public k(IZ)V
    .locals 7

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    iget-object p2, p0, Lue;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;

    .line 6
    .line 7
    sget v0, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->K:I

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    new-instance v0, Lol0;

    .line 17
    .line 18
    invoke-direct {v0}, Lol0;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p2, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->C:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :cond_1
    const/4 v4, 0x0

    .line 29
    if-ge v3, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    move-object v6, v5

    .line 38
    check-cast v6, Lnl0;

    .line 39
    .line 40
    iget v6, v6, Lnl0;->a:I

    .line 41
    .line 42
    if-ne v6, p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v5, v4

    .line 46
    :goto_0
    check-cast v5, Lnl0;

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    iget-object v1, v5, Lnl0;->b:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v1, v0, Lol0;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, v5, Lnl0;->c:Ljava/lang/String;

    .line 55
    .line 56
    iput-object v1, v0, Lol0;->c:Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const v1, 0x7f120130

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "getString(...)"

    .line 67
    .line 68
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v0, Lol0;->b:Ljava/lang/String;

    .line 72
    .line 73
    const-string v1, ""

    .line 74
    .line 75
    iput-object v1, v0, Lol0;->c:Ljava/lang/String;

    .line 76
    .line 77
    :goto_1
    iput p1, v0, Lol0;->d:I

    .line 78
    .line 79
    iget-object p1, p2, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 80
    .line 81
    const-string v1, "dataList"

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :try_start_0
    iget-object p1, p2, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->F:Lc10;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    iget-object p2, p2, Lcom/phuongpn/whousemywifi/networkscanner/PortActivity;->G:Ljava/util/ArrayList;

    .line 93
    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-static {p2}, Lzf;->i0(Ljava/util/List;)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    iget-object p1, p1, Lao0;->f:Lbo0;

    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    invoke-virtual {p1, p2, v0}, Lbo0;->d(II)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :catch_0
    move-exception p1

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v4

    .line 113
    :cond_5
    const-string p1, "portAdapter"

    .line 114
    .line 115
    invoke-static {p1}, Li30;->S(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    :goto_3
    const-wide/16 p1, 0x14

    .line 123
    .line 124
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_6
    invoke-static {v1}, Li30;->S(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v4

    .line 132
    :cond_7
    return-void
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lmf1;->l()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lue;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lue;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Lue;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public n()J
    .locals 4

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lmf1;->n()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lue;->g:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public o()J
    .locals 4

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lmf1;->o()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lue;->g:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public p()J
    .locals 4

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lmf1;->p()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lue;->g:J

    .line 10
    .line 11
    sub-long/2addr v0, v2

    .line 12
    return-wide v0
.end method

.method public q(I)Z
    .locals 4

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lue;->m()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lue;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lue;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1}, Lue;->q(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    iget-wide v0, p0, Lue;->g:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    shl-long/2addr v2, p1

    .line 23
    and-long/2addr v0, v2

    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    cmp-long p1, v0, v2

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public r(IZ)V
    .locals 9

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lue;->m()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lue;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lue;

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    invoke-virtual {v1, p1, p2}, Lue;->r(IZ)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-wide v0, p0, Lue;->g:J

    .line 18
    .line 19
    const-wide/high16 v2, -0x8000000000000000L

    .line 20
    .line 21
    and-long/2addr v2, v0

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    move v2, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v3

    .line 33
    :goto_0
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    shl-long v7, v5, p1

    .line 36
    .line 37
    sub-long/2addr v7, v5

    .line 38
    and-long v5, v0, v7

    .line 39
    .line 40
    not-long v7, v7

    .line 41
    and-long/2addr v0, v7

    .line 42
    shl-long/2addr v0, v4

    .line 43
    or-long/2addr v0, v5

    .line 44
    iput-wide v0, p0, Lue;->g:J

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lue;->E(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p1}, Lue;->e(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-nez v2, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, Lue;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lue;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    return-void

    .line 65
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lue;->m()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lue;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lue;

    .line 71
    .line 72
    invoke-virtual {p1, v3, v2}, Lue;->r(IZ)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnf1;

    .line 4
    .line 5
    invoke-interface {v0}, Lnf1;->s()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lmf1;->t(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lue;->f:I

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
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lue;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, Lue;->g:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lue;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lue;

    .line 32
    .line 33
    invoke-virtual {v1}, Lue;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "xx"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Lue;->g:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public u([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lmf1;->u([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v(Lcg1;)V
    .locals 1

    .line 1
    new-instance v0, Lhg1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p1}, Lhg1;-><init>(Lue;Lcg1;Lcg1;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lue;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lnf1;

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lnf1;->v(Lcg1;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public w([BIIZ)Z
    .locals 1

    .line 1
    iget-object p2, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lmf1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p2, p1, v0, p3, p4}, Lmf1;->w([BIIZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public x([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lmf1;->x([BII)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public y([BII)I
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmf1;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lmf1;->y([BII)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public z(II)Ljg1;
    .locals 1

    .line 1
    iget-object v0, p0, Lue;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnf1;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lnf1;->z(II)Ljg1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
