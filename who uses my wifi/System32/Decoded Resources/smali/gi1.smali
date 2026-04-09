.class public final Lgi1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lln2;
.implements Lxp3;


# static fields
.field public static n:Lgi1;


# instance fields
.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p0, p0, Lgi1;->f:Ljava/lang/Object;

    .line 3
    new-instance v0, Lax0;

    invoke-direct {v0, p1}, Lax0;-><init>(Ljava/lang/Object;)V

    .line 4
    iput-object v0, p0, Lgi1;->g:Ljava/lang/Object;

    new-instance p1, Lvg0;

    const/16 v1, 0xb

    invoke-direct {p1, v1, v0}, Lvg0;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, Lls2;->b(Lws2;)Lls2;

    move-result-object p1

    iput-object p1, p0, Lgi1;->h:Ljava/lang/Object;

    sget-object v1, Lob1;->k:Lus0;

    invoke-static {v1}, Lls2;->b(Lws2;)Lls2;

    move-result-object v1

    iput-object v1, p0, Lgi1;->i:Ljava/lang/Object;

    new-instance v2, Lzs1;

    const/16 v3, 0x9

    invoke-direct {v2, v3, p0}, Lzs1;-><init>(ILjava/lang/Object;)V

    new-instance v3, Lug0;

    const/16 v4, 0xf

    invoke-direct {v3, v4, v2}, Lug0;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lls2;->b(Lws2;)Lls2;

    move-result-object v2

    iput-object v2, p0, Lgi1;->j:Ljava/lang/Object;

    new-instance v3, Llv2;

    const/16 v4, 0x11

    invoke-direct {v3, v0, p1, v4}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v4, Lsu2;

    const/4 v5, 0x6

    .line 5
    invoke-direct {v4, v5}, Lsu2;-><init>(I)V

    .line 6
    invoke-static {v4}, Lls2;->b(Lws2;)Lls2;

    move-result-object v4

    iput-object v4, p0, Lgi1;->k:Ljava/lang/Object;

    new-instance v5, Lf23;

    const/16 v6, 0xc

    invoke-direct {v5, v6, v0}, Lf23;-><init>(ILjava/lang/Object;)V

    invoke-static {v5}, Lls2;->b(Lws2;)Lls2;

    move-result-object v5

    new-instance v6, Lwt2;

    const/16 v7, 0x9

    const/4 v8, 0x0

    invoke-direct {v6, v0, v5, v7, v8}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-static {v6}, Lls2;->b(Lws2;)Lls2;

    move-result-object v5

    new-instance v6, Lxn1;

    invoke-direct {v6, v0, p1, v5}, Lxn1;-><init>(Lax0;Lls2;Lls2;)V

    iput-object v6, p0, Lgi1;->m:Ljava/lang/Object;

    new-instance v5, Lxb4;

    const/16 v7, 0xc

    invoke-direct {v5, v4, v6, p1, v7}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v6, Luk1;

    .line 7
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v0, v6, Luk1;->f:Ljava/lang/Object;

    iput-object v1, v6, Luk1;->g:Ljava/lang/Object;

    iput-object p1, v6, Luk1;->h:Ljava/lang/Object;

    iput-object v2, v6, Luk1;->i:Ljava/lang/Object;

    iput-object v3, v6, Luk1;->j:Ljava/lang/Object;

    iput-object v5, v6, Luk1;->k:Ljava/lang/Object;

    iput-object v4, v6, Luk1;->l:Ljava/lang/Object;

    .line 8
    new-instance v0, Lpb3;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v6, v2, v1}, Lpb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0}, Lls2;->b(Lws2;)Lls2;

    move-result-object p1

    iput-object p1, p0, Lgi1;->l:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 9
    iput-object p1, p0, Lgi1;->f:Ljava/lang/Object;

    iput-object p2, p0, Lgi1;->g:Ljava/lang/Object;

    iput-object p3, p0, Lgi1;->h:Ljava/lang/Object;

    iput-object p4, p0, Lgi1;->i:Ljava/lang/Object;

    iput-object p5, p0, Lgi1;->j:Ljava/lang/Object;

    iput-object p6, p0, Lgi1;->k:Ljava/lang/Object;

    iput-object p7, p0, Lgi1;->l:Ljava/lang/Object;

    iput-object p8, p0, Lgi1;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lgi1;
    .locals 2

    .line 1
    const-class v0, Lgi1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lgi1;->n:Lgi1;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/app/Application;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lgi1;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lgi1;-><init>(Landroid/app/Application;)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lgi1;->n:Lgi1;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    sget-object p0, Lgi1;->n:Lgi1;

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object p0

    .line 31
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p0
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 3

    .line 13
    iget-object v0, p0, Lgi1;->h:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lvb1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lvb1;-><init>(Landroid/os/Handler;I)V

    return-object v1
.end method

.method public a()Ln70;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    sget-object v1, Lhg4;->C:Lhg4;

    iget-object v1, v1, Lhg4;->d:Lsd2;

    .line 2
    iget-object v1, v0, Lgi1;->f:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    .line 3
    new-instance v3, Lzq;

    const/4 v1, 0x0

    invoke-direct {v3, v1, v1, v1}, Lzq;-><init>(III)V

    .line 4
    iget-object v1, v0, Lgi1;->i:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ll92;

    .line 5
    new-instance v12, Lcx1;

    invoke-direct {v12}, Lcx1;-><init>()V

    .line 6
    iget-object v1, v0, Lgi1;->j:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, Lpz2;

    iget-object v1, v0, Lgi1;->k:Ljava/lang/Object;

    move-object/from16 v16, v1

    check-cast v16, Lm83;

    iget-object v1, v0, Lgi1;->l:Ljava/lang/Object;

    move-object/from16 v17, v1

    check-cast v17, Lmv2;

    iget-object v1, v0, Lgi1;->h:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Le51;

    iget-object v1, v0, Lgi1;->g:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lvs1;

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 7
    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v17}, Lsd2;->b(Landroid/content/Context;Lzq;Ljava/lang/String;ZZLvs1;Lf02;Le51;Lkf3;Ll92;Lcx1;La83;Lc83;Lpz2;Lm83;Lmv2;)Lag2;

    move-result-object v1

    .line 8
    new-instance v2, Lyw1;

    invoke-direct {v2, v1}, Lyw1;-><init>(Ljava/lang/Object;)V

    .line 9
    invoke-interface {v1}, Lag2;->e0()Lsg2;

    move-result-object v3

    new-instance v4, Lzs1;

    const/16 v5, 0x11

    invoke-direct {v4, v5, v2}, Lzs1;-><init>(ILjava/lang/Object;)V

    .line 10
    iput-object v4, v3, Lsg2;->l:Lug2;

    .line 11
    iget-object v3, v0, Lgi1;->m:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 12
    invoke-interface {v1, v3}, Lag2;->loadUrl(Ljava/lang/String;)V

    return-object v2
.end method

.method public b(Ljava/lang/String;Lorg/json/JSONObject;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lgi1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbw1;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    sparse-switch v1, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :sswitch_0
    const-string v1, "dismiss"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_9

    .line 23
    .line 24
    const-string p1, "status"

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    sparse-switch p2, :sswitch_data_1

    .line 35
    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :sswitch_1
    const-string p2, "CONSENT_SIGNAL_NOT_REQUIRED"

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    move p1, v3

    .line 48
    goto :goto_1

    .line 49
    :sswitch_2
    const-string p2, "non_personalized"

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :sswitch_3
    const-string p2, "CONSENT_SIGNAL_PERSONALIZED_ADS"

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :sswitch_4
    const-string p2, "CONSENT_SIGNAL_SUFFICIENT"

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :sswitch_5
    const-string p2, "personalized"

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :sswitch_6
    const-string p2, "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    :goto_0
    const/4 p1, 0x3

    .line 94
    :goto_1
    iget-object p2, v0, Lbw1;->f:Landroid/app/Dialog;

    .line 95
    .line 96
    if-eqz p2, :cond_0

    .line 97
    .line 98
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 99
    .line 100
    .line 101
    iput-object v2, v0, Lbw1;->f:Landroid/app/Dialog;

    .line 102
    .line 103
    :cond_0
    iget-object p2, v0, Lbw1;->b:Laa2;

    .line 104
    .line 105
    iput-object v2, p2, Laa2;->a:Landroid/app/Activity;

    .line 106
    .line 107
    iget-object p2, v0, Lbw1;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 108
    .line 109
    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, Lau1;

    .line 114
    .line 115
    if-eqz p2, :cond_1

    .line 116
    .line 117
    iget-object v1, p2, Lau1;->g:Lbw1;

    .line 118
    .line 119
    iget-object v1, v1, Lbw1;->a:Landroid/app/Application;

    .line 120
    .line 121
    invoke-virtual {v1, p2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    iget-object p2, v0, Lbw1;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 125
    .line 126
    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, Llz;

    .line 131
    .line 132
    if-nez p2, :cond_2

    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_2
    iget-object v0, v0, Lbw1;->c:Lmo1;

    .line 137
    .line 138
    iget-object v0, v0, Lmo1;->b:Landroid/content/SharedPreferences;

    .line 139
    .line 140
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "consent_status"

    .line 145
    .line 146
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v2}, Llz;->a(Lbw;)V

    .line 154
    .line 155
    .line 156
    return v3

    .line 157
    :cond_3
    :goto_2
    new-instance p1, Lah3;

    .line 158
    .line 159
    const-string p2, "We are getting something wrong with the webview."

    .line 160
    .line 161
    invoke-direct {p1, p2, v3}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 162
    .line 163
    .line 164
    iget-object p2, v0, Lbw1;->f:Landroid/app/Dialog;

    .line 165
    .line 166
    if-eqz p2, :cond_4

    .line 167
    .line 168
    invoke-virtual {p2}, Landroid/app/Dialog;->dismiss()V

    .line 169
    .line 170
    .line 171
    iput-object v2, v0, Lbw1;->f:Landroid/app/Dialog;

    .line 172
    .line 173
    :cond_4
    iget-object p2, v0, Lbw1;->b:Laa2;

    .line 174
    .line 175
    iput-object v2, p2, Laa2;->a:Landroid/app/Activity;

    .line 176
    .line 177
    iget-object p2, v0, Lbw1;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    check-cast p2, Lau1;

    .line 184
    .line 185
    if-eqz p2, :cond_5

    .line 186
    .line 187
    iget-object v1, p2, Lau1;->g:Lbw1;

    .line 188
    .line 189
    iget-object v1, v1, Lbw1;->a:Landroid/app/Application;

    .line 190
    .line 191
    invoke-virtual {v1, p2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 192
    .line 193
    .line 194
    :cond_5
    iget-object p2, v0, Lbw1;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 195
    .line 196
    invoke-virtual {p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    check-cast p2, Llz;

    .line 201
    .line 202
    if-nez p2, :cond_6

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    invoke-virtual {p1}, Lah3;->a()Lbw;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p2, p1}, Llz;->a(Lbw;)V

    .line 210
    .line 211
    .line 212
    return v3

    .line 213
    :sswitch_7
    const-string v0, "browser"

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_9

    .line 220
    .line 221
    const-string p1, "url"

    .line 222
    .line 223
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-nez v0, :cond_7

    .line 239
    .line 240
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const-string v1, "Action[browser]: empty scheme: "

    .line 245
    .line 246
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    :cond_7
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 250
    .line 251
    const-string v1, "android.intent.action.VIEW"

    .line 252
    .line 253
    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 254
    .line 255
    .line 256
    iget-object p2, p0, Lgi1;->g:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast p2, Laa2;

    .line 259
    .line 260
    invoke-virtual {p2, v0}, Laa2;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    .line 262
    .line 263
    return v3

    .line 264
    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    const-string p2, "Action[browser]: can not open url: "

    .line 269
    .line 270
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    return v3

    .line 274
    :sswitch_8
    const-string p2, "configure_app_assets"

    .line 275
    .line 276
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-eqz p1, :cond_9

    .line 281
    .line 282
    new-instance p1, Lg72;

    .line 283
    .line 284
    const/4 p2, 0x1

    .line 285
    invoke-direct {p1, p0, p2}, Lg72;-><init>(Lgi1;I)V

    .line 286
    .line 287
    .line 288
    iget-object p2, p0, Lgi1;->i:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast p2, Ljava/util/concurrent/Executor;

    .line 291
    .line 292
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    return v3

    .line 296
    :sswitch_9
    const-string p2, "load_complete"

    .line 297
    .line 298
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-eqz p1, :cond_9

    .line 303
    .line 304
    iget-object p1, v0, Lbw1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 305
    .line 306
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    check-cast p1, Lyu1;

    .line 311
    .line 312
    if-nez p1, :cond_8

    .line 313
    .line 314
    :goto_3
    return v3

    .line 315
    :cond_8
    invoke-virtual {p1, v0}, Lyu1;->k(Lbw1;)V

    .line 316
    .line 317
    .line 318
    return v3

    .line 319
    :cond_9
    :goto_4
    const/4 p1, 0x0

    .line 320
    return p1

    .line 321
    :sswitch_data_0
    .sparse-switch
        -0x51b03f8e -> :sswitch_9
        -0x109d39a6 -> :sswitch_8
        0x8ff2b28 -> :sswitch_7
        0x63a3b28a -> :sswitch_0
    .end sparse-switch

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    :sswitch_data_1
    .sparse-switch
        -0x38e1da9b -> :sswitch_6
        -0xf616830 -> :sswitch_5
        0x19984e10 -> :sswitch_4
        0x1be36b13 -> :sswitch_3
        0x635b0c02 -> :sswitch_2
        0x66d8a81d -> :sswitch_1
    .end sparse-switch
.end method

.method public d(Lh2;)Lvh2;
    .locals 8

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 4
    .line 5
    const-string v2, "https://fundingchoicesmessages.google.com/a/consent"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    const-string v2, "User-Agent"

    .line 17
    .line 18
    iget-object v3, p0, Lgi1;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroid/app/Application;

    .line 21
    .line 22
    invoke-static {v3}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x2710

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 32
    .line 33
    .line 34
    const/16 v2, 0x7530

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 41
    .line 42
    .line 43
    const-string v3, "POST"

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v3, "Content-Type"

    .line 49
    .line 50
    const-string v4, "application/json"

    .line 51
    .line 52
    invoke-virtual {v1, v3, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-direct {v3, v4, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    :try_start_1
    new-instance v4, Landroid/util/JsonWriter;

    .line 65
    .line 66
    invoke-direct {v4, v3}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 67
    .line 68
    .line 69
    :try_start_2
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 70
    .line 71
    .line 72
    iget-object v5, p1, Lh2;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    const-string v6, "admob_app_id"

    .line 79
    .line 80
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto/16 :goto_8

    .line 89
    .line 90
    :cond_0
    :goto_0
    iget-object v5, p1, Lh2;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Lso1;

    .line 93
    .line 94
    if-eqz v5, :cond_6

    .line 95
    .line 96
    const-string v6, "device_info"

    .line 97
    .line 98
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 102
    .line 103
    .line 104
    iget v6, v5, Lso1;->f:I

    .line 105
    .line 106
    if-eq v6, v2, :cond_3

    .line 107
    .line 108
    const-string v7, "os_type"

    .line 109
    .line 110
    invoke-virtual {v4, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 111
    .line 112
    .line 113
    add-int/lit8 v6, v6, -0x1

    .line 114
    .line 115
    if-eqz v6, :cond_2

    .line 116
    .line 117
    if-eq v6, v2, :cond_1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const-string v2, "ANDROID"

    .line 121
    .line 122
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    const-string v2, "UNKNOWN"

    .line 127
    .line 128
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_1
    iget-object v2, v5, Lso1;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    const-string v6, "model"

    .line 138
    .line 139
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 143
    .line 144
    .line 145
    :cond_4
    iget-object v2, v5, Lso1;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Ljava/lang/Integer;

    .line 148
    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    const-string v5, "android_api_level"

    .line 152
    .line 153
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 157
    .line 158
    .line 159
    :cond_5
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 160
    .line 161
    .line 162
    :cond_6
    iget-object v2, p1, Lh2;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Ljava/lang/String;

    .line 165
    .line 166
    if-eqz v2, :cond_7

    .line 167
    .line 168
    const-string v5, "language_code"

    .line 169
    .line 170
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 174
    .line 175
    .line 176
    :cond_7
    iget-object v2, p1, Lh2;->d:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Ljava/lang/Boolean;

    .line 179
    .line 180
    if-eqz v2, :cond_8

    .line 181
    .line 182
    const-string v5, "tag_for_under_age_of_consent"

    .line 183
    .line 184
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 192
    .line 193
    .line 194
    :cond_8
    iget-object v2, p1, Lh2;->e:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v2, Ljava/util/Map;

    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-nez v5, :cond_a

    .line 203
    .line 204
    const-string v5, "stored_infos_map"

    .line 205
    .line 206
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 210
    .line 211
    .line 212
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_9

    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    check-cast v5, Ljava/util/Map$Entry;

    .line 231
    .line 232
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 239
    .line 240
    .line 241
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    check-cast v5, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_9
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 252
    .line 253
    .line 254
    :cond_a
    iget-object v2, p1, Lh2;->f:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v2, Lp21;

    .line 257
    .line 258
    if-eqz v2, :cond_14

    .line 259
    .line 260
    const-string v5, "screen_info"

    .line 261
    .line 262
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 266
    .line 267
    .line 268
    iget-object v5, v2, Lp21;->f:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v5, Ljava/lang/Integer;

    .line 271
    .line 272
    if-eqz v5, :cond_b

    .line 273
    .line 274
    const-string v6, "width"

    .line 275
    .line 276
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 280
    .line 281
    .line 282
    :cond_b
    iget-object v5, v2, Lp21;->g:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v5, Ljava/lang/Integer;

    .line 285
    .line 286
    if-eqz v5, :cond_c

    .line 287
    .line 288
    const-string v6, "height"

    .line 289
    .line 290
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 294
    .line 295
    .line 296
    :cond_c
    iget-object v5, v2, Lp21;->h:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v5, Ljava/lang/Double;

    .line 299
    .line 300
    if-eqz v5, :cond_d

    .line 301
    .line 302
    const-string v6, "density"

    .line 303
    .line 304
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 308
    .line 309
    .line 310
    :cond_d
    iget-object v2, v2, Lp21;->i:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v2, Ljava/util/List;

    .line 313
    .line 314
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-nez v5, :cond_13

    .line 319
    .line 320
    const-string v5, "screen_insets"

    .line 321
    .line 322
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 326
    .line 327
    .line 328
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_12

    .line 337
    .line 338
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Lrf2;

    .line 343
    .line 344
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 345
    .line 346
    .line 347
    iget-object v6, v5, Lrf2;->a:Ljava/lang/Integer;

    .line 348
    .line 349
    if-eqz v6, :cond_e

    .line 350
    .line 351
    const-string v7, "top"

    .line 352
    .line 353
    invoke-virtual {v4, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 357
    .line 358
    .line 359
    :cond_e
    iget-object v6, v5, Lrf2;->b:Ljava/lang/Integer;

    .line 360
    .line 361
    if-eqz v6, :cond_f

    .line 362
    .line 363
    const-string v7, "left"

    .line 364
    .line 365
    invoke-virtual {v4, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 369
    .line 370
    .line 371
    :cond_f
    iget-object v6, v5, Lrf2;->c:Ljava/lang/Integer;

    .line 372
    .line 373
    if-eqz v6, :cond_10

    .line 374
    .line 375
    const-string v7, "right"

    .line 376
    .line 377
    invoke-virtual {v4, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 381
    .line 382
    .line 383
    :cond_10
    iget-object v5, v5, Lrf2;->d:Ljava/lang/Integer;

    .line 384
    .line 385
    if-eqz v5, :cond_11

    .line 386
    .line 387
    const-string v6, "bottom"

    .line 388
    .line 389
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->value(Ljava/lang/Number;)Landroid/util/JsonWriter;

    .line 393
    .line 394
    .line 395
    :cond_11
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 396
    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_12
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 400
    .line 401
    .line 402
    :cond_13
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 403
    .line 404
    .line 405
    :cond_14
    iget-object v2, p1, Lh2;->g:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v2, Lt83;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 408
    .line 409
    const-string v5, "version"

    .line 410
    .line 411
    if-eqz v2, :cond_18

    .line 412
    .line 413
    :try_start_3
    const-string v6, "app_info"

    .line 414
    .line 415
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 419
    .line 420
    .line 421
    iget-object v6, v2, Lt83;->g:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v6, Ljava/lang/String;

    .line 424
    .line 425
    if-eqz v6, :cond_15

    .line 426
    .line 427
    const-string v7, "package_name"

    .line 428
    .line 429
    invoke-virtual {v4, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 433
    .line 434
    .line 435
    :cond_15
    iget-object v6, v2, Lt83;->h:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v6, Ljava/lang/String;

    .line 438
    .line 439
    if-eqz v6, :cond_16

    .line 440
    .line 441
    const-string v7, "publisher_display_name"

    .line 442
    .line 443
    invoke-virtual {v4, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 447
    .line 448
    .line 449
    :cond_16
    iget-object v2, v2, Lt83;->i:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v2, Ljava/lang/String;

    .line 452
    .line 453
    if-eqz v2, :cond_17

    .line 454
    .line 455
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 459
    .line 460
    .line 461
    :cond_17
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 462
    .line 463
    .line 464
    :cond_18
    iget-object v2, p1, Lh2;->h:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v2, Lqd2;

    .line 467
    .line 468
    if-eqz v2, :cond_19

    .line 469
    .line 470
    const-string v2, "sdk_info"

    .line 471
    .line 472
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 476
    .line 477
    .line 478
    const-string v2, "3.2.0"

    .line 479
    .line 480
    invoke-virtual {v4, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 487
    .line 488
    .line 489
    :cond_19
    iget-object p1, p1, Lh2;->i:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast p1, Ljava/util/List;

    .line 492
    .line 493
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-nez v2, :cond_1b

    .line 498
    .line 499
    const-string v2, "debug_params"

    .line 500
    .line 501
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 505
    .line 506
    .line 507
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    if-eqz v2, :cond_1a

    .line 516
    .line 517
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    check-cast v2, Lqe2;

    .line 522
    .line 523
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    packed-switch v2, :pswitch_data_0

    .line 528
    .line 529
    .line 530
    goto :goto_4

    .line 531
    :pswitch_0
    const-string v2, "PREVIEWING_DEBUG_MESSAGES"

    .line 532
    .line 533
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 534
    .line 535
    .line 536
    goto :goto_4

    .line 537
    :pswitch_1
    const-string v2, "GEO_OVERRIDE_NON_EEA"

    .line 538
    .line 539
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 540
    .line 541
    .line 542
    goto :goto_4

    .line 543
    :pswitch_2
    const-string v2, "GEO_OVERRIDE_OTHER"

    .line 544
    .line 545
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 546
    .line 547
    .line 548
    goto :goto_4

    .line 549
    :pswitch_3
    const-string v2, "GEO_OVERRIDE_REGULATED_US_STATE"

    .line 550
    .line 551
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 552
    .line 553
    .line 554
    goto :goto_4

    .line 555
    :pswitch_4
    const-string v2, "GEO_OVERRIDE_EEA"

    .line 556
    .line 557
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 558
    .line 559
    .line 560
    goto :goto_4

    .line 561
    :pswitch_5
    const-string v2, "ALWAYS_SHOW"

    .line 562
    .line 563
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 564
    .line 565
    .line 566
    goto :goto_4

    .line 567
    :pswitch_6
    const-string v2, "DEBUG_PARAM_UNKNOWN"

    .line 568
    .line 569
    invoke-virtual {v4, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 570
    .line 571
    .line 572
    goto :goto_4

    .line 573
    :cond_1a
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 574
    .line 575
    .line 576
    :cond_1b
    invoke-virtual {v4}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 577
    .line 578
    .line 579
    :try_start_4
    invoke-virtual {v4}, Landroid/util/JsonWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 580
    .line 581
    .line 582
    :try_start_5
    invoke-virtual {v3}, Ljava/io/Writer;->close()V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 586
    .line 587
    .line 588
    move-result p1
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 589
    const/16 v2, 0xc8

    .line 590
    .line 591
    const-string v3, "\\A"

    .line 592
    .line 593
    if-ne p1, v2, :cond_1d

    .line 594
    .line 595
    :try_start_6
    const-string p1, "x-ump-using-header"

    .line 596
    .line 597
    invoke-virtual {v1, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object p1

    .line 601
    if-eqz p1, :cond_1c

    .line 602
    .line 603
    new-instance v0, Landroid/util/JsonReader;

    .line 604
    .line 605
    new-instance v2, Ljava/io/StringReader;

    .line 606
    .line 607
    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    invoke-direct {v0, v2}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 611
    .line 612
    .line 613
    invoke-static {v0}, Lvh2;->b(Landroid/util/JsonReader;)Lvh2;

    .line 614
    .line 615
    .line 616
    move-result-object p1

    .line 617
    new-instance v0, Ljava/util/Scanner;

    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-direct {v0, v1}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v3}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    iput-object v0, p1, Lvh2;->f:Ljava/lang/String;

    .line 635
    .line 636
    return-object p1

    .line 637
    :catch_0
    move-exception p1

    .line 638
    goto/16 :goto_c

    .line 639
    .line 640
    :catch_1
    move-exception p1

    .line 641
    goto/16 :goto_d

    .line 642
    .line 643
    :cond_1c
    new-instance p1, Ljava/io/BufferedReader;

    .line 644
    .line 645
    new-instance v2, Ljava/io/InputStreamReader;

    .line 646
    .line 647
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    invoke-direct {v2, v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-direct {p1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 655
    .line 656
    .line 657
    :try_start_7
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    new-instance v0, Landroid/util/JsonReader;

    .line 661
    .line 662
    invoke-direct {v0, p1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 663
    .line 664
    .line 665
    :try_start_8
    invoke-static {v0}, Lvh2;->b(Landroid/util/JsonReader;)Lvh2;

    .line 666
    .line 667
    .line 668
    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 669
    :try_start_9
    invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 670
    .line 671
    .line 672
    :try_start_a
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catch Ljava/net/SocketTimeoutException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 673
    .line 674
    .line 675
    return-object v1

    .line 676
    :catchall_1
    move-exception v0

    .line 677
    goto :goto_6

    .line 678
    :catchall_2
    move-exception v1

    .line 679
    :try_start_b
    invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 680
    .line 681
    .line 682
    goto :goto_5

    .line 683
    :catchall_3
    move-exception v0

    .line 684
    :try_start_c
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 685
    .line 686
    .line 687
    :goto_5
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 688
    :goto_6
    :try_start_d
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 689
    .line 690
    .line 691
    goto :goto_7

    .line 692
    :catchall_4
    move-exception p1

    .line 693
    :try_start_e
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 694
    .line 695
    .line 696
    :goto_7
    throw v0

    .line 697
    :cond_1d
    new-instance v0, Ljava/util/Scanner;

    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-direct {v0, v1}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v3}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    new-instance v1, Ljava/io/IOException;

    .line 715
    .line 716
    new-instance v2, Ljava/lang/StringBuilder;

    .line 717
    .line 718
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    const-string v3, "Http error code - "

    .line 722
    .line 723
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    const-string p1, ".\n"

    .line 730
    .line 731
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object p1

    .line 741
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v1
    :try_end_e
    .catch Ljava/net/SocketTimeoutException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 745
    :catchall_5
    move-exception p1

    .line 746
    goto :goto_a

    .line 747
    :goto_8
    :try_start_f
    invoke-virtual {v4}, Landroid/util/JsonWriter;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 748
    .line 749
    .line 750
    goto :goto_9

    .line 751
    :catchall_6
    move-exception v0

    .line 752
    :try_start_10
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 753
    .line 754
    .line 755
    :goto_9
    throw p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 756
    :goto_a
    :try_start_11
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 757
    .line 758
    .line 759
    goto :goto_b

    .line 760
    :catchall_7
    move-exception v0

    .line 761
    :try_start_12
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 762
    .line 763
    .line 764
    :goto_b
    throw p1
    :try_end_12
    .catch Ljava/net/SocketTimeoutException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_0

    .line 765
    :goto_c
    new-instance v0, Lah3;

    .line 766
    .line 767
    const/4 v1, 0x2

    .line 768
    const-string v2, "Error making request."

    .line 769
    .line 770
    invoke-direct {v0, v1, v2, p1}, Lah3;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 771
    .line 772
    .line 773
    throw v0

    .line 774
    :goto_d
    new-instance v0, Lah3;

    .line 775
    .line 776
    const/4 v1, 0x4

    .line 777
    const-string v2, "The server timed out."

    .line 778
    .line 779
    invoke-direct {v0, v1, v2, p1}, Lah3;-><init>(ILjava/lang/String;Ljava/io/IOException;)V

    .line 780
    .line 781
    .line 782
    throw v0

    .line 783
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Receive consent action: "

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "action"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "args"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v1, p0, Lgi1;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lp21;

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [Lln2;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    aput-object p0, v2, v3

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    aput-object v1, v2, v3

    .line 38
    .line 39
    iget-object v1, p0, Lgi1;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Llx2;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v3, Lgi;

    .line 47
    .line 48
    const/16 v4, 0xe

    .line 49
    .line 50
    invoke-direct {v3, v0, p1, v2, v4}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, v1, Llx2;->a:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
