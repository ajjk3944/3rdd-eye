.class public final synthetic Lnr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lpr2;


# direct methods
.method public synthetic constructor <init>(Lpr2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnr2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lnr2;->g:Lpr2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lnr2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnr2;->g:Lpr2;

    .line 7
    .line 8
    const-string v1, "Google"

    .line 9
    .line 10
    iget-object v2, v0, Lpr2;->q:Lyr2;

    .line 11
    .line 12
    :try_start_0
    iget-object v3, v0, Lpr2;->m:Ltr2;

    .line 13
    .line 14
    invoke-virtual {v3}, Ltr2;->q()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v4, v5, :cond_6

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    if-eq v4, v6, :cond_5

    .line 23
    .line 24
    const/4 v6, 0x3

    .line 25
    if-eq v4, v6, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    if-eq v4, v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    if-eq v4, v1, :cond_0

    .line 32
    .line 33
    const-string v0, "Wrong native template id!"

    .line 34
    .line 35
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :catch_0
    move-exception v0

    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_0
    iget-object v1, v2, Lyr2;->e:Lj52;

    .line 44
    .line 45
    if-eqz v1, :cond_7

    .line 46
    .line 47
    iget-object v0, v0, Lpr2;->u:Lz94;

    .line 48
    .line 49
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lg52;

    .line 54
    .line 55
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2, v5}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_1
    iget-object v1, v2, Lyr2;->c:Lz22;

    .line 68
    .line 69
    if-eqz v1, :cond_7

    .line 70
    .line 71
    invoke-virtual {v0}, Lpr2;->l()V

    .line 72
    .line 73
    .line 74
    iget-object v0, v0, Lpr2;->t:Lz94;

    .line 75
    .line 76
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lf32;

    .line 81
    .line 82
    invoke-interface {v1, v0}, Lz22;->a2(Lf32;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-virtual {v3}, Ltr2;->g()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    iget-object v2, v2, Lyr2;->f:Lbw0;

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Lv22;

    .line 101
    .line 102
    :goto_0
    if-eqz v2, :cond_7

    .line 103
    .line 104
    invoke-virtual {v3}, Ltr2;->h()Lag2;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0, v1, v5}, Lpr2;->e(Ljava/lang/String;Z)Lxz2;

    .line 111
    .line 112
    .line 113
    :cond_4
    iget-object v0, v0, Lpr2;->v:Lz94;

    .line 114
    .line 115
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lp22;

    .line 120
    .line 121
    invoke-interface {v2, v0}, Lv22;->g3(Lp22;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    iget-object v1, v2, Lyr2;->b:Lq22;

    .line 126
    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    invoke-virtual {v0}, Lpr2;->l()V

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, Lpr2;->s:Lz94;

    .line 133
    .line 134
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Lj22;

    .line 139
    .line 140
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2, v5}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    iget-object v1, v2, Lyr2;->a:Lr22;

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    invoke-virtual {v0}, Lpr2;->l()V

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, Lpr2;->r:Lz94;

    .line 159
    .line 160
    invoke-interface {v0}, Lz94;->d()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lk22;

    .line 165
    .line 166
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v2, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2, v5}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :goto_1
    const-string v1, "RemoteException when notifyAdLoad is called"

    .line 178
    .line 179
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    :cond_7
    :goto_2
    return-void

    .line 183
    :pswitch_0
    iget-object v0, p0, Lnr2;->g:Lpr2;

    .line 184
    .line 185
    iget-object v1, v0, Lpr2;->n:Lwr2;

    .line 186
    .line 187
    invoke-interface {v1}, Lwr2;->L()V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, Lpr2;->m:Ltr2;

    .line 191
    .line 192
    monitor-enter v0

    .line 193
    :try_start_1
    iget-object v1, v0, Ltr2;->i:Lag2;

    .line 194
    .line 195
    const/4 v2, 0x0

    .line 196
    if-eqz v1, :cond_8

    .line 197
    .line 198
    invoke-interface {v1}, Lag2;->destroy()V

    .line 199
    .line 200
    .line 201
    iput-object v2, v0, Ltr2;->i:Lag2;

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :catchall_0
    move-exception v1

    .line 205
    goto :goto_4

    .line 206
    :cond_8
    :goto_3
    iget-object v1, v0, Ltr2;->j:Lag2;

    .line 207
    .line 208
    if-eqz v1, :cond_9

    .line 209
    .line 210
    invoke-interface {v1}, Lag2;->destroy()V

    .line 211
    .line 212
    .line 213
    iput-object v2, v0, Ltr2;->j:Lag2;

    .line 214
    .line 215
    :cond_9
    iget-object v1, v0, Ltr2;->k:Lag2;

    .line 216
    .line 217
    if-eqz v1, :cond_a

    .line 218
    .line 219
    invoke-interface {v1}, Lag2;->destroy()V

    .line 220
    .line 221
    .line 222
    iput-object v2, v0, Ltr2;->k:Lag2;

    .line 223
    .line 224
    :cond_a
    iget-object v1, v0, Ltr2;->m:Ln70;

    .line 225
    .line 226
    const/4 v3, 0x0

    .line 227
    if-eqz v1, :cond_b

    .line 228
    .line 229
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 230
    .line 231
    .line 232
    iput-object v2, v0, Ltr2;->m:Ln70;

    .line 233
    .line 234
    :cond_b
    iget-object v1, v0, Ltr2;->n:Lpd2;

    .line 235
    .line 236
    if-eqz v1, :cond_c

    .line 237
    .line 238
    invoke-virtual {v1, v3}, Lpd2;->cancel(Z)Z

    .line 239
    .line 240
    .line 241
    iput-object v2, v0, Ltr2;->n:Lpd2;

    .line 242
    .line 243
    :cond_c
    iput-object v2, v0, Ltr2;->l:Lxz2;

    .line 244
    .line 245
    iget-object v1, v0, Ltr2;->v:Lbw0;

    .line 246
    .line 247
    invoke-virtual {v1}, Lbw0;->clear()V

    .line 248
    .line 249
    .line 250
    iget-object v1, v0, Ltr2;->w:Lbw0;

    .line 251
    .line 252
    invoke-virtual {v1}, Lbw0;->clear()V

    .line 253
    .line 254
    .line 255
    iput-object v2, v0, Ltr2;->b:Lpy2;

    .line 256
    .line 257
    iput-object v2, v0, Ltr2;->c:Lx12;

    .line 258
    .line 259
    iput-object v2, v0, Ltr2;->d:Landroid/view/View;

    .line 260
    .line 261
    iput-object v2, v0, Ltr2;->e:Ljava/util/List;

    .line 262
    .line 263
    iput-object v2, v0, Ltr2;->h:Landroid/os/Bundle;

    .line 264
    .line 265
    iput-object v2, v0, Ltr2;->o:Landroid/view/View;

    .line 266
    .line 267
    iput-object v2, v0, Ltr2;->p:Landroid/view/View;

    .line 268
    .line 269
    iput-object v2, v0, Ltr2;->q:Lu10;

    .line 270
    .line 271
    iput-object v2, v0, Ltr2;->s:Lb22;

    .line 272
    .line 273
    iput-object v2, v0, Ltr2;->t:Lb22;

    .line 274
    .line 275
    iput-object v2, v0, Ltr2;->u:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 276
    .line 277
    monitor-exit v0

    .line 278
    return-void

    .line 279
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 280
    throw v1

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
