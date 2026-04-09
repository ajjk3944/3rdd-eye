.class public final Lst2;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lk22;


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Lpr2;

.field public final h:Ltr2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpr2;Ltr2;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeContentAd"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lst2;->f:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p2, p0, Lst2;->g:Lpr2;

    .line 9
    .line 10
    iput-object p3, p0, Lst2;->h:Ltr2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :pswitch_0
    iget-object p1, p0, Lst2;->f:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :pswitch_1
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    iget-object p2, p1, Ltr2;->q:Lu10;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit p1

    .line 22
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 23
    .line 24
    .line 25
    invoke-static {p3, p2}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :catchall_0
    move-exception p2

    .line 31
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p2

    .line 33
    :pswitch_2
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 34
    .line 35
    invoke-virtual {p1}, Ltr2;->s()Lx12;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 40
    .line 41
    .line 42
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :pswitch_3
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 48
    .line 49
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lst2;->g:Lpr2;

    .line 59
    .line 60
    monitor-enter v0

    .line 61
    :try_start_2
    iget-object p2, v0, Lpr2;->n:Lwr2;

    .line 62
    .line 63
    invoke-interface {p2, p1}, Lwr2;->k(Landroid/os/Bundle;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    .line 66
    monitor-exit v0

    .line 67
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :catchall_1
    move-exception p1

    .line 73
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 74
    throw p1

    .line 75
    :pswitch_4
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 76
    .line 77
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Lst2;->g:Lpr2;

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Lpr2;->p(Landroid/os/Bundle;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :pswitch_5
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 101
    .line 102
    invoke-static {p2, p1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Landroid/os/Bundle;

    .line 107
    .line 108
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 109
    .line 110
    .line 111
    iget-object p2, p0, Lst2;->g:Lpr2;

    .line 112
    .line 113
    monitor-enter p2

    .line 114
    :try_start_4
    iget-object v0, p2, Lpr2;->n:Lwr2;

    .line 115
    .line 116
    invoke-interface {v0, p1}, Lwr2;->n(Landroid/os/Bundle;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 117
    .line 118
    .line 119
    monitor-exit p2

    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :catchall_2
    move-exception p1

    .line 126
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 127
    throw p1

    .line 128
    :pswitch_6
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 129
    .line 130
    invoke-virtual {p1}, Ltr2;->r()Lpy2;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 135
    .line 136
    .line 137
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :pswitch_7
    iget-object p1, p0, Lst2;->g:Lpr2;

    .line 143
    .line 144
    invoke-virtual {p1}, Lpr2;->o()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :pswitch_8
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 152
    .line 153
    invoke-virtual {p1}, Ltr2;->d()Landroid/os/Bundle;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 158
    .line 159
    .line 160
    invoke-static {p3, p1}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :pswitch_9
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 165
    .line 166
    invoke-virtual {p1}, Ltr2;->f()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :pswitch_a
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 178
    .line 179
    invoke-virtual {p1}, Ltr2;->e()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :pswitch_b
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 191
    .line 192
    monitor-enter p1

    .line 193
    :try_start_6
    iget-object p2, p1, Ltr2;->t:Lb22;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 194
    .line 195
    monitor-exit p1

    .line 196
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 197
    .line 198
    .line 199
    invoke-static {p3, p2}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :catchall_3
    move-exception p2

    .line 204
    :try_start_7
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 205
    throw p2

    .line 206
    :pswitch_c
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 207
    .line 208
    invoke-virtual {p1}, Ltr2;->c()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    goto :goto_0

    .line 219
    :pswitch_d
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 220
    .line 221
    monitor-enter p1

    .line 222
    :try_start_8
    iget-object p2, p1, Ltr2;->e:Ljava/util/List;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 223
    .line 224
    monitor-exit p1

    .line 225
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    goto :goto_0

    .line 232
    :catchall_4
    move-exception p2

    .line 233
    :try_start_9
    monitor-exit p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 234
    throw p2

    .line 235
    :pswitch_e
    iget-object p1, p0, Lst2;->h:Ltr2;

    .line 236
    .line 237
    invoke-virtual {p1}, Ltr2;->a()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto :goto_0

    .line 248
    :pswitch_f
    iget-object p1, p0, Lst2;->g:Lpr2;

    .line 249
    .line 250
    new-instance p2, Loi0;

    .line 251
    .line 252
    invoke-direct {p2, p1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 256
    .line 257
    .line 258
    invoke-static {p3, p2}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 259
    .line 260
    .line 261
    :goto_0
    const/4 p1, 0x1

    .line 262
    return p1

    .line 263
    :pswitch_data_0
    .packed-switch 0x2
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
