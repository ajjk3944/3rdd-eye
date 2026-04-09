.class public final Lm72;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lw62;


# instance fields
.field public final f:Ljava/lang/Object;

.field public g:Lxb4;

.field public h:Lsa2;

.field public i:Lu10;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"

    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcd0;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lm72;-><init>()V

    iput-object p1, p0, Lm72;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf3;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lm72;-><init>()V

    iput-object p1, p0, Lm72;->f:Ljava/lang/Object;

    return-void
.end method

.method public static final D3(Lpc4;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lpc4;->k:Z

    .line 2
    .line 3
    if-nez p0, :cond_1

    .line 4
    .line 5
    sget-object p0, Lsv1;->f:Lsv1;

    .line 6
    .line 7
    iget-object p0, p0, Lsv1;->a:Lj63;

    .line 8
    .line 9
    invoke-static {}, Lj63;->n()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static final E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p1, p1, Lpc4;->z:Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "max_ad_content_rating"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    return-object p1
.end method


# virtual methods
.method public final A0(Lu10;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    instance-of v2, v0, Lf3;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class p1, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-class p2, Lf3;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p5

    .line 44
    add-int/lit8 p4, p4, 0x4

    .line 45
    .line 46
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result p5

    .line 50
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    add-int/2addr p4, p5

    .line 55
    add-int/lit8 p4, p4, 0x16

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result p5

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    add-int/2addr p4, p5

    .line 64
    invoke-direct {v0, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const-string p4, " or "

    .line 68
    .line 69
    const-string p5, " #009 Class mismatch: "

    .line 70
    .line 71
    invoke-static {v0, p1, p4, p2, p5}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Landroid/os/RemoteException;

    .line 85
    .line 86
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_1
    :goto_0
    const-string v2, "Requesting interstitial ad from adapter."

    .line 91
    .line 92
    invoke-static {v2}, Lgi2;->U(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v2, ""

    .line 96
    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    :try_start_0
    move-object v3, v0

    .line 100
    check-cast v3, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 101
    .line 102
    iget-object v0, p2, Lpc4;->j:Ljava/util/List;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    new-instance v4, Ljava/util/HashSet;

    .line 108
    .line 109
    invoke-direct {v4, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    move-object p2, v0

    .line 115
    goto :goto_3

    .line 116
    :cond_2
    move-object v4, v1

    .line 117
    :goto_1
    new-instance v7, Li72;

    .line 118
    .line 119
    iget-wide v5, p2, Lpc4;->g:J

    .line 120
    .line 121
    const-wide/16 v8, -0x1

    .line 122
    .line 123
    cmp-long v0, v5, v8

    .line 124
    .line 125
    if-nez v0, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    new-instance v0, Ljava/util/Date;

    .line 129
    .line 130
    invoke-direct {v0, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 131
    .line 132
    .line 133
    :goto_2
    invoke-static {p2}, Lm72;->D3(Lpc4;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget v5, p2, Lpc4;->l:I

    .line 138
    .line 139
    iget-boolean v6, p2, Lpc4;->w:Z

    .line 140
    .line 141
    invoke-static {p3, p2}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    invoke-direct {v7, v4, v0, v5, v6}, Li72;-><init>(Ljava/util/HashSet;ZIZ)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p2, Lpc4;->r:Landroid/os/Bundle;

    .line 148
    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    :cond_4
    move-object v8, v1

    .line 164
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move-object v4, v0

    .line 169
    check-cast v4, Landroid/content/Context;

    .line 170
    .line 171
    new-instance v5, Lxb4;

    .line 172
    .line 173
    invoke-direct {v5, p5}, Lxb4;-><init>(Lz62;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p3, p2, p4}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;->requestInterstitialAd(Landroid/content/Context;Lhd0;Landroid/os/Bundle;Lbd0;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :goto_3
    invoke-static {v2, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    const-string p3, "adapter.requestInterstitialAd"

    .line 188
    .line 189
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance p1, Landroid/os/RemoteException;

    .line 193
    .line 194
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_5
    instance-of v1, v0, Lf3;

    .line 199
    .line 200
    if-eqz v1, :cond_6

    .line 201
    .line 202
    :try_start_1
    check-cast v0, Lf3;

    .line 203
    .line 204
    new-instance v1, Lk72;

    .line 205
    .line 206
    const/4 v3, 0x0

    .line 207
    invoke-direct {v1, p0, p5, v3}, Lk72;-><init>(Lm72;Lz62;I)V

    .line 208
    .line 209
    .line 210
    new-instance p5, Lgd0;

    .line 211
    .line 212
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    check-cast v3, Landroid/content/Context;

    .line 217
    .line 218
    invoke-virtual {p0, p3, p2, p4}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, p2}, Lm72;->C3(Lpc4;)V

    .line 222
    .line 223
    .line 224
    invoke-static {p2}, Lm72;->D3(Lpc4;)Z

    .line 225
    .line 226
    .line 227
    invoke-static {p3, p2}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p5, v1}, Lf3;->loadInterstitialAd(Lgd0;Lad0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    move-object p2, v0

    .line 239
    invoke-static {v2, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 240
    .line 241
    .line 242
    const-string p3, "adapter.loadInterstitialAd"

    .line 243
    .line 244
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    new-instance p1, Landroid/os/RemoteException;

    .line 248
    .line 249
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 250
    .line 251
    .line 252
    throw p1

    .line 253
    :cond_6
    return-void
.end method

.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 11

    .line 1
    const/4 v2, 0x2

    .line 2
    const-string v3, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener"

    .line 3
    .line 4
    const/4 v4, 0x0

    .line 5
    const-string v5, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    return v4

    .line 12
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lm72;->e3(Lu10;)V

    .line 24
    .line 25
    .line 26
    throw v6

    .line 27
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    sget-object v3, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 36
    .line 37
    invoke-static {p2, v3}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lpc4;

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    if-nez v7, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v7, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    instance-of v6, v5, Lz62;

    .line 59
    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    move-object v6, v5

    .line 63
    check-cast v6, Lz62;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v6, Lx62;

    .line 67
    .line 68
    invoke-direct {v6, v7}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2, v3, v4, v6}, Lm72;->S0(Lu10;Lpc4;Ljava/lang/String;Lz62;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_f

    .line 81
    .line 82
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v2}, Lm72;->e1(Lu10;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_f

    .line 100
    .line 101
    :pswitch_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 102
    .line 103
    .line 104
    sget-object v1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 105
    .line 106
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_f

    .line 110
    .line 111
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    sget-object v3, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 120
    .line 121
    invoke-static {p2, v3}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Lxe4;

    .line 126
    .line 127
    sget-object v4, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 128
    .line 129
    invoke-static {p2, v4}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Lpc4;

    .line 134
    .line 135
    move-object v1, v2

    .line 136
    move-object v2, v3

    .line 137
    move-object v3, v4

    .line 138
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    if-nez v10, :cond_2

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    invoke-interface {v10, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    instance-of v6, v5, Lz62;

    .line 158
    .line 159
    if-eqz v6, :cond_3

    .line 160
    .line 161
    move-object v6, v5

    .line 162
    check-cast v6, Lz62;

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    new-instance v6, Lx62;

    .line 166
    .line 167
    invoke-direct {v6, v10}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 168
    .line 169
    .line 170
    :goto_1
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 171
    .line 172
    .line 173
    move-object v0, p0

    .line 174
    move-object v5, v9

    .line 175
    invoke-virtual/range {v0 .. v6}, Lm72;->r2(Lu10;Lxe4;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_f

    .line 182
    .line 183
    :pswitch_6
    invoke-virtual {p0}, Lm72;->Z2()Li82;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 187
    .line 188
    .line 189
    sget-object v1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 190
    .line 191
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_f

    .line 195
    .line 196
    :pswitch_7
    invoke-virtual {p0}, Lm72;->H()Li82;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 200
    .line 201
    .line 202
    sget-object v1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 203
    .line 204
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_f

    .line 208
    .line 209
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    sget-object v2, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 218
    .line 219
    invoke-static {p2, v2}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, Lpc4;

    .line 224
    .line 225
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    if-nez v4, :cond_4

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_4
    invoke-interface {v4, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    instance-of v6, v5, Lz62;

    .line 241
    .line 242
    if-eqz v6, :cond_5

    .line 243
    .line 244
    move-object v6, v5

    .line 245
    check-cast v6, Lz62;

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_5
    new-instance v6, Lx62;

    .line 249
    .line 250
    invoke-direct {v6, v4}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 251
    .line 252
    .line 253
    :goto_2
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v1, v2, v3, v6}, Lm72;->b3(Lu10;Lpc4;Ljava/lang/String;Lz62;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_f

    .line 263
    .line 264
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    if-nez v3, :cond_6

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_6
    const-string v4, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback"

    .line 280
    .line 281
    invoke-interface {v3, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    instance-of v6, v5, Lb52;

    .line 286
    .line 287
    if-eqz v6, :cond_7

    .line 288
    .line 289
    move-object v6, v5

    .line 290
    check-cast v6, Lb52;

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_7
    new-instance v6, Lx42;

    .line 294
    .line 295
    invoke-direct {v6, v3, v4, v2}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 296
    .line 297
    .line 298
    :goto_3
    sget-object v2, Le52;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 299
    .line 300
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v1, v6, v2}, Lm72;->J0(Lu10;Lb52;Ljava/util/ArrayList;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_f

    .line 314
    .line 315
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0, v1}, Lm72;->z3(Lu10;)V

    .line 327
    .line 328
    .line 329
    throw v6

    .line 330
    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    sget-object v2, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 339
    .line 340
    invoke-static {p2, v2}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    check-cast v2, Lpc4;

    .line 345
    .line 346
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    if-nez v4, :cond_8

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_8
    invoke-interface {v4, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    instance-of v6, v5, Lz62;

    .line 362
    .line 363
    if-eqz v6, :cond_9

    .line 364
    .line 365
    move-object v6, v5

    .line 366
    check-cast v6, Lz62;

    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_9
    new-instance v6, Lx62;

    .line 370
    .line 371
    invoke-direct {v6, v4}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 372
    .line 373
    .line 374
    :goto_4
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p0, v1, v2, v3, v6}, Lm72;->y0(Lu10;Lpc4;Ljava/lang/String;Lz62;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 381
    .line 382
    .line 383
    goto/16 :goto_f

    .line 384
    .line 385
    :pswitch_c
    invoke-virtual {p0}, Lm72;->F()Le72;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 390
    .line 391
    .line 392
    invoke-static {p3, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_f

    .line 396
    .line 397
    :pswitch_d
    invoke-virtual {p0}, Lm72;->C()Lpy2;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 402
    .line 403
    .line 404
    invoke-static {p3, v1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_f

    .line 408
    .line 409
    :pswitch_e
    invoke-static {p2}, Liv1;->a(Landroid/os/Parcel;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {p0, v1}, Lm72;->i3(Z)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_f

    .line 423
    .line 424
    :pswitch_f
    iget-object v1, p0, Lm72;->g:Lxb4;

    .line 425
    .line 426
    if-eqz v1, :cond_a

    .line 427
    .line 428
    iget-object v1, v1, Lxb4;->i:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, Lf23;

    .line 431
    .line 432
    if-eqz v1, :cond_a

    .line 433
    .line 434
    iget-object v1, v1, Lf23;->g:Ljava/lang/Object;

    .line 435
    .line 436
    move-object v6, v1

    .line 437
    check-cast v6, Lp22;

    .line 438
    .line 439
    :cond_a
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 440
    .line 441
    .line 442
    invoke-static {p3, v6}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_f

    .line 446
    .line 447
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    if-eqz v4, :cond_c

    .line 460
    .line 461
    invoke-interface {v4, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    instance-of v8, v5, Lsa2;

    .line 466
    .line 467
    if-eqz v8, :cond_b

    .line 468
    .line 469
    check-cast v5, Lsa2;

    .line 470
    .line 471
    goto :goto_5

    .line 472
    :cond_b
    new-instance v5, Lqa2;

    .line 473
    .line 474
    invoke-direct {v5, v4, v3, v2}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 475
    .line 476
    .line 477
    goto :goto_5

    .line 478
    :cond_c
    move-object v5, v6

    .line 479
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {p0, v1, v5, v2}, Lm72;->V2(Lu10;Lsa2;Ljava/util/List;)V

    .line 487
    .line 488
    .line 489
    throw v6

    .line 490
    :pswitch_11
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 491
    .line 492
    .line 493
    sget-object v1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 494
    .line 495
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_f

    .line 499
    .line 500
    :pswitch_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {p0, v1}, Lm72;->l0(Lu10;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_f

    .line 518
    .line 519
    :pswitch_13
    sget-object v1, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 520
    .line 521
    invoke-static {p2, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Lpc4;

    .line 526
    .line 527
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {p0, v2, v1}, Lm72;->F3(Ljava/lang/String;Lpc4;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_f

    .line 544
    .line 545
    :pswitch_14
    new-instance v1, Landroid/os/Bundle;

    .line 546
    .line 547
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 551
    .line 552
    .line 553
    invoke-static {p3, v1}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_f

    .line 557
    .line 558
    :pswitch_15
    new-instance v1, Landroid/os/Bundle;

    .line 559
    .line 560
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 564
    .line 565
    .line 566
    invoke-static {p3, v1}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_f

    .line 570
    .line 571
    :pswitch_16
    new-instance v1, Landroid/os/Bundle;

    .line 572
    .line 573
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 574
    .line 575
    .line 576
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 577
    .line 578
    .line 579
    invoke-static {p3, v1}, Liv1;->d(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_f

    .line 583
    .line 584
    :pswitch_17
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 585
    .line 586
    .line 587
    sget-object v1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 588
    .line 589
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 590
    .line 591
    .line 592
    goto/16 :goto_f

    .line 593
    .line 594
    :pswitch_18
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 595
    .line 596
    .line 597
    sget-object v1, Liv1;->a:Ljava/lang/ClassLoader;

    .line 598
    .line 599
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 600
    .line 601
    .line 602
    goto/16 :goto_f

    .line 603
    .line 604
    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    sget-object v2, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 613
    .line 614
    invoke-static {p2, v2}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    check-cast v2, Lpc4;

    .line 619
    .line 620
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 629
    .line 630
    .line 631
    move-result-object v9

    .line 632
    if-nez v9, :cond_d

    .line 633
    .line 634
    :goto_6
    move-object v5, v6

    .line 635
    goto :goto_7

    .line 636
    :cond_d
    invoke-interface {v9, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 637
    .line 638
    .line 639
    move-result-object v5

    .line 640
    instance-of v6, v5, Lz62;

    .line 641
    .line 642
    if-eqz v6, :cond_e

    .line 643
    .line 644
    move-object v6, v5

    .line 645
    check-cast v6, Lz62;

    .line 646
    .line 647
    goto :goto_6

    .line 648
    :cond_e
    new-instance v6, Lx62;

    .line 649
    .line 650
    invoke-direct {v6, v9}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 651
    .line 652
    .line 653
    goto :goto_6

    .line 654
    :goto_7
    sget-object v6, Lr12;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 655
    .line 656
    invoke-static {p2, v6}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    check-cast v6, Lr12;

    .line 661
    .line 662
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 663
    .line 664
    .line 665
    move-result-object v7

    .line 666
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 667
    .line 668
    .line 669
    move-object v0, p0

    .line 670
    invoke-virtual/range {v0 .. v7}, Lm72;->l3(Lu10;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;Lr12;Ljava/util/ArrayList;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 674
    .line 675
    .line 676
    goto/16 :goto_f

    .line 677
    .line 678
    :pswitch_1a
    invoke-virtual {p0}, Lm72;->m()Z

    .line 679
    .line 680
    .line 681
    move-result v1

    .line 682
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 683
    .line 684
    .line 685
    sget-object v2, Liv1;->a:Ljava/lang/ClassLoader;

    .line 686
    .line 687
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_f

    .line 691
    .line 692
    :pswitch_1b
    invoke-virtual {p0}, Lm72;->S()V

    .line 693
    .line 694
    .line 695
    throw v6

    .line 696
    :pswitch_1c
    sget-object v1, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 697
    .line 698
    invoke-static {p2, v1}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    check-cast v1, Lpc4;

    .line 703
    .line 704
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {p0, v2, v1}, Lm72;->F3(Ljava/lang/String;Lpc4;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_f

    .line 718
    .line 719
    :pswitch_1d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    sget-object v4, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 728
    .line 729
    invoke-static {p2, v4}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    check-cast v4, Lpc4;

    .line 734
    .line 735
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    if-nez v5, :cond_f

    .line 743
    .line 744
    goto :goto_8

    .line 745
    :cond_f
    invoke-interface {v5, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    instance-of v7, v6, Lsa2;

    .line 750
    .line 751
    if-eqz v7, :cond_10

    .line 752
    .line 753
    check-cast v6, Lsa2;

    .line 754
    .line 755
    goto :goto_8

    .line 756
    :cond_10
    new-instance v6, Lqa2;

    .line 757
    .line 758
    invoke-direct {v6, v5, v3, v2}, Lsb1;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 759
    .line 760
    .line 761
    :goto_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {p0, v1, v4, v6, v2}, Lm72;->u1(Lu10;Lpc4;Lsa2;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 772
    .line 773
    .line 774
    goto/16 :goto_f

    .line 775
    .line 776
    :pswitch_1e
    invoke-virtual {p0}, Lm72;->n()V

    .line 777
    .line 778
    .line 779
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 780
    .line 781
    .line 782
    goto/16 :goto_f

    .line 783
    .line 784
    :pswitch_1f
    invoke-virtual {p0}, Lm72;->i()V

    .line 785
    .line 786
    .line 787
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 788
    .line 789
    .line 790
    goto/16 :goto_f

    .line 791
    .line 792
    :pswitch_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    invoke-static {v1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    sget-object v2, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 801
    .line 802
    invoke-static {p2, v2}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    check-cast v2, Lpc4;

    .line 807
    .line 808
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 817
    .line 818
    .line 819
    move-result-object v7

    .line 820
    if-nez v7, :cond_11

    .line 821
    .line 822
    :goto_9
    move-object v5, v6

    .line 823
    goto :goto_a

    .line 824
    :cond_11
    invoke-interface {v7, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    instance-of v6, v5, Lz62;

    .line 829
    .line 830
    if-eqz v6, :cond_12

    .line 831
    .line 832
    move-object v6, v5

    .line 833
    check-cast v6, Lz62;

    .line 834
    .line 835
    goto :goto_9

    .line 836
    :cond_12
    new-instance v6, Lx62;

    .line 837
    .line 838
    invoke-direct {v6, v7}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 839
    .line 840
    .line 841
    goto :goto_9

    .line 842
    :goto_a
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 843
    .line 844
    .line 845
    move-object v0, p0

    .line 846
    invoke-virtual/range {v0 .. v5}, Lm72;->A0(Lu10;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 850
    .line 851
    .line 852
    goto/16 :goto_f

    .line 853
    .line 854
    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 863
    .line 864
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    move-object v2, v0

    .line 869
    check-cast v2, Lxe4;

    .line 870
    .line 871
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 872
    .line 873
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    move-object v3, v0

    .line 878
    check-cast v3, Lpc4;

    .line 879
    .line 880
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    if-nez v7, :cond_13

    .line 893
    .line 894
    goto :goto_b

    .line 895
    :cond_13
    invoke-interface {v7, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 896
    .line 897
    .line 898
    move-result-object v5

    .line 899
    instance-of v6, v5, Lz62;

    .line 900
    .line 901
    if-eqz v6, :cond_14

    .line 902
    .line 903
    move-object v6, v5

    .line 904
    check-cast v6, Lz62;

    .line 905
    .line 906
    goto :goto_b

    .line 907
    :cond_14
    new-instance v6, Lx62;

    .line 908
    .line 909
    invoke-direct {v6, v7}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 910
    .line 911
    .line 912
    :goto_b
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 913
    .line 914
    .line 915
    move-object v5, v0

    .line 916
    move-object v0, p0

    .line 917
    invoke-virtual/range {v0 .. v6}, Lm72;->P0(Lu10;Lxe4;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 921
    .line 922
    .line 923
    goto/16 :goto_f

    .line 924
    .line 925
    :pswitch_22
    invoke-virtual {p0}, Lm72;->j()V

    .line 926
    .line 927
    .line 928
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 929
    .line 930
    .line 931
    goto/16 :goto_f

    .line 932
    .line 933
    :pswitch_23
    invoke-virtual {p0}, Lm72;->f()V

    .line 934
    .line 935
    .line 936
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 937
    .line 938
    .line 939
    goto/16 :goto_f

    .line 940
    .line 941
    :pswitch_24
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 950
    .line 951
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    move-object v2, v0

    .line 956
    check-cast v2, Lpc4;

    .line 957
    .line 958
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v3

    .line 962
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    if-nez v0, :cond_15

    .line 967
    .line 968
    :goto_c
    move-object v5, v6

    .line 969
    goto :goto_d

    .line 970
    :cond_15
    invoke-interface {v0, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    instance-of v5, v4, Lz62;

    .line 975
    .line 976
    if-eqz v5, :cond_16

    .line 977
    .line 978
    move-object v6, v4

    .line 979
    check-cast v6, Lz62;

    .line 980
    .line 981
    goto :goto_c

    .line 982
    :cond_16
    new-instance v6, Lx62;

    .line 983
    .line 984
    invoke-direct {v6, v0}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 985
    .line 986
    .line 987
    goto :goto_c

    .line 988
    :goto_d
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 989
    .line 990
    .line 991
    const/4 v4, 0x0

    .line 992
    move-object v0, p0

    .line 993
    invoke-virtual/range {v0 .. v5}, Lm72;->A0(Lu10;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 997
    .line 998
    .line 999
    goto :goto_f

    .line 1000
    :pswitch_25
    invoke-virtual {p0}, Lm72;->c()Lu10;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1005
    .line 1006
    .line 1007
    invoke-static {p3, v0}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 1008
    .line 1009
    .line 1010
    goto :goto_f

    .line 1011
    :pswitch_26
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    sget-object v0, Lxe4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1020
    .line 1021
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    move-object v2, v0

    .line 1026
    check-cast v2, Lxe4;

    .line 1027
    .line 1028
    sget-object v0, Lpc4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1029
    .line 1030
    invoke-static {p2, v0}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    move-object v3, v0

    .line 1035
    check-cast v3, Lpc4;

    .line 1036
    .line 1037
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    if-nez v0, :cond_17

    .line 1046
    .line 1047
    goto :goto_e

    .line 1048
    :cond_17
    invoke-interface {v0, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v5

    .line 1052
    instance-of v6, v5, Lz62;

    .line 1053
    .line 1054
    if-eqz v6, :cond_18

    .line 1055
    .line 1056
    move-object v6, v5

    .line 1057
    check-cast v6, Lz62;

    .line 1058
    .line 1059
    goto :goto_e

    .line 1060
    :cond_18
    new-instance v6, Lx62;

    .line 1061
    .line 1062
    invoke-direct {v6, v0}, Lx62;-><init>(Landroid/os/IBinder;)V

    .line 1063
    .line 1064
    .line 1065
    :goto_e
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 1066
    .line 1067
    .line 1068
    const/4 v5, 0x0

    .line 1069
    move-object v0, p0

    .line 1070
    invoke-virtual/range {v0 .. v6}, Lm72;->P0(Lu10;Lxe4;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 1074
    .line 1075
    .line 1076
    :goto_f
    const/4 v0, 0x1

    .line 1077
    return v0

    .line 1078
    nop

    .line 1079
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_0
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
    .end packed-switch
.end method

.method public final B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .line 1
    const-string v0, "Server parameters: "

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
    move-result-object v0

    .line 11
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    new-instance v0, Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move-object v0, p1

    .line 58
    :cond_1
    iget-object p1, p0, Lm72;->f:Ljava/lang/Object;

    .line 59
    .line 60
    instance-of p1, p1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    const-string p1, "adJson"

    .line 65
    .line 66
    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    if-eqz p2, :cond_2

    .line 70
    .line 71
    const-string p1, "tagForChildDirectedTreatment"

    .line 72
    .line 73
    iget p2, p2, Lpc4;->l:I

    .line 74
    .line 75
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    :cond_2
    const-string p1, "max_ad_content_rating"

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :goto_1
    const-string p2, ""

    .line 85
    .line 86
    invoke-static {p2, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Landroid/os/RemoteException;

    .line 90
    .line 91
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public final C()Lpy2;
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    :try_start_0
    check-cast v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->getVideoController()Lpy2;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v2
.end method

.method public final C3(Lpc4;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lpc4;->r:Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final F()Le72;
    .locals 2

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lm72;->g:Lxb4;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lxb4;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lhd1;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, Lp72;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lp72;-><init>(Lhd1;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public final F3(Ljava/lang/String;Lpc4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lm72;->i:Lu10;

    .line 8
    .line 9
    new-instance v2, Ln72;

    .line 10
    .line 11
    check-cast v0, Lf3;

    .line 12
    .line 13
    iget-object v3, p0, Lm72;->h:Lsa2;

    .line 14
    .line 15
    invoke-direct {v2, v0, v3}, Ln72;-><init>(Lf3;Lsa2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1, p2, p1, v2}, Lm72;->y0(Lu10;Lpc4;Ljava/lang/String;Lz62;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-class p1, Lf3;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    add-int/lit8 v0, v0, 0x16

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    add-int/2addr v0, v1

    .line 57
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, " #009 Class mismatch: "

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Landroid/os/RemoteException;

    .line 79
    .line 80
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method public final H()Li82;
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    check-cast v0, Lf3;

    .line 10
    .line 11
    invoke-virtual {v0}, Lf3;->getVersionInfo()Ld51;

    .line 12
    .line 13
    .line 14
    throw v2
.end method

.method public final J0(Lu10;Lb52;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    iget-object p2, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p2, Lf3;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    new-instance v0, Lts0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    check-cast v4, Le52;

    .line 31
    .line 32
    iget-object v4, v4, Le52;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v6, 0x0

    .line 39
    sget-object v7, Ls2;->l:Ls2;

    .line 40
    .line 41
    sparse-switch v5, :sswitch_data_0

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :sswitch_0
    const-string v5, "rewarded_interstitial"

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    sget-object v6, Ls2;->j:Ls2;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :sswitch_1
    const-string v5, "app_open_ad"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    sget-object v4, Lmz1;->Ec:Liz1;

    .line 65
    .line 66
    sget-object v5, Ltw1;->e:Ltw1;

    .line 67
    .line 68
    iget-object v5, v5, Ltw1;->c:Lkz1;

    .line 69
    .line 70
    invoke-virtual {v5, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_1

    .line 81
    .line 82
    :goto_1
    move-object v6, v7

    .line 83
    goto :goto_2

    .line 84
    :sswitch_2
    const-string v5, "app_open"

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :sswitch_3
    const-string v5, "interstitial"

    .line 94
    .line 95
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_1

    .line 100
    .line 101
    sget-object v6, Ls2;->h:Ls2;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :sswitch_4
    const-string v5, "rewarded"

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    sget-object v6, Ls2;->i:Ls2;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :sswitch_5
    const-string v5, "native"

    .line 116
    .line 117
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_1

    .line 122
    .line 123
    sget-object v6, Ls2;->k:Ls2;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :sswitch_6
    const-string v5, "banner"

    .line 127
    .line 128
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_1

    .line 133
    .line 134
    sget-object v6, Ls2;->g:Ls2;

    .line 135
    .line 136
    :cond_1
    :goto_2
    if-eqz v6, :cond_0

    .line 137
    .line 138
    new-instance v4, Lpz;

    .line 139
    .line 140
    const/16 v5, 0x19

    .line 141
    .line 142
    invoke-direct {v4, v5}, Lpz;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_2
    check-cast p2, Lf3;

    .line 150
    .line 151
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Landroid/content/Context;

    .line 156
    .line 157
    invoke-virtual {p2, p1, v0, v1}, Lf3;->initialize(Landroid/content/Context;Lr20;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_3
    new-instance p1, Landroid/os/RemoteException;

    .line 162
    .line 163
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :sswitch_data_0
    .sparse-switch
        -0x533a80d4 -> :sswitch_6
        -0x3ebdafe9 -> :sswitch_5
        -0xe47b3f2 -> :sswitch_4
        0x240b672c -> :sswitch_3
        0x459991a8 -> :sswitch_2
        0x69fe9e1a -> :sswitch_1
        0x71ef0bbd -> :sswitch_0
    .end sparse-switch
.end method

.method public final K()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final P0(Lu10;Lxe4;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    iget-object v7, v1, Lm72;->f:Ljava/lang/Object;

    .line 16
    .line 17
    instance-of v8, v7, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    .line 18
    .line 19
    if-nez v8, :cond_1

    .line 20
    .line 21
    instance-of v9, v7, Lf3;

    .line 22
    .line 23
    if-eqz v9, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v2, Lf3;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    add-int/lit8 v4, v4, 0x4

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    add-int/2addr v4, v5

    .line 69
    add-int/lit8 v4, v4, 0x16

    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    new-instance v6, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    add-int/2addr v4, v5

    .line 78
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 79
    .line 80
    .line 81
    const-string v4, " or "

    .line 82
    .line 83
    const-string v5, " #009 Class mismatch: "

    .line 84
    .line 85
    invoke-static {v6, v0, v4, v2, v5}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Landroid/os/RemoteException;

    .line 99
    .line 100
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_1
    :goto_0
    const-string v9, "Requesting banner ad from adapter."

    .line 105
    .line 106
    invoke-static {v9}, Lgi2;->U(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-boolean v9, v0, Lxe4;->s:Z

    .line 110
    .line 111
    iget v10, v0, Lxe4;->g:I

    .line 112
    .line 113
    iget v11, v0, Lxe4;->j:I

    .line 114
    .line 115
    if-eqz v9, :cond_2

    .line 116
    .line 117
    new-instance v0, Ld3;

    .line 118
    .line 119
    invoke-direct {v0, v11, v10}, Ld3;-><init>(II)V

    .line 120
    .line 121
    .line 122
    const/4 v9, 0x1

    .line 123
    iput-boolean v9, v0, Ld3;->e:Z

    .line 124
    .line 125
    iput v10, v0, Ld3;->f:I

    .line 126
    .line 127
    move-object/from16 v16, v0

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    iget-object v0, v0, Lxe4;->f:Ljava/lang/String;

    .line 131
    .line 132
    new-instance v9, Ld3;

    .line 133
    .line 134
    invoke-direct {v9, v0, v11, v10}, Ld3;-><init>(Ljava/lang/String;II)V

    .line 135
    .line 136
    .line 137
    move-object/from16 v16, v9

    .line 138
    .line 139
    :goto_1
    const-string v9, ""

    .line 140
    .line 141
    if-eqz v8, :cond_6

    .line 142
    .line 143
    :try_start_0
    move-object v12, v7

    .line 144
    check-cast v12, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    .line 145
    .line 146
    iget-object v0, v3, Lpc4;->j:Ljava/util/List;

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    new-instance v8, Ljava/util/HashSet;

    .line 152
    .line 153
    invoke-direct {v8, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    goto :goto_4

    .line 159
    :cond_3
    move-object v8, v7

    .line 160
    :goto_2
    new-instance v0, Li72;

    .line 161
    .line 162
    iget-wide v10, v3, Lpc4;->g:J

    .line 163
    .line 164
    const-wide/16 v13, -0x1

    .line 165
    .line 166
    cmp-long v13, v10, v13

    .line 167
    .line 168
    if-nez v13, :cond_4

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    new-instance v13, Ljava/util/Date;

    .line 172
    .line 173
    invoke-direct {v13, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 174
    .line 175
    .line 176
    :goto_3
    invoke-static {v3}, Lm72;->D3(Lpc4;)Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    iget v11, v3, Lpc4;->l:I

    .line 181
    .line 182
    iget-boolean v13, v3, Lpc4;->w:Z

    .line 183
    .line 184
    invoke-static {v4, v3}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    invoke-direct {v0, v8, v10, v11, v13}, Li72;-><init>(Ljava/util/HashSet;ZIZ)V

    .line 188
    .line 189
    .line 190
    iget-object v8, v3, Lpc4;->r:Landroid/os/Bundle;

    .line 191
    .line 192
    if-eqz v8, :cond_5

    .line 193
    .line 194
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-virtual {v8, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    :cond_5
    move-object/from16 v18, v7

    .line 207
    .line 208
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    move-object v13, v7

    .line 213
    check-cast v13, Landroid/content/Context;

    .line 214
    .line 215
    new-instance v14, Lxb4;

    .line 216
    .line 217
    invoke-direct {v14, v6}, Lxb4;-><init>(Lz62;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v4, v3, v5}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    move-object/from16 v17, v0

    .line 225
    .line 226
    invoke-interface/range {v12 .. v18}, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;->requestBannerAd(Landroid/content/Context;Lfd0;Landroid/os/Bundle;Ld3;Lbd0;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :goto_4
    invoke-static {v9, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    const-string v3, "adapter.requestBannerAd"

    .line 234
    .line 235
    invoke-static {v2, v0, v3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance v0, Landroid/os/RemoteException;

    .line 239
    .line 240
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_6
    instance-of v0, v7, Lf3;

    .line 245
    .line 246
    if-eqz v0, :cond_7

    .line 247
    .line 248
    :try_start_1
    check-cast v7, Lf3;

    .line 249
    .line 250
    new-instance v0, Lj72;

    .line 251
    .line 252
    const/4 v8, 0x0

    .line 253
    invoke-direct {v0, v1, v6, v8}, Lj72;-><init>(Lm72;Lz62;I)V

    .line 254
    .line 255
    .line 256
    new-instance v6, Led0;

    .line 257
    .line 258
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    check-cast v8, Landroid/content/Context;

    .line 263
    .line 264
    invoke-virtual {v1, v4, v3, v5}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v3}, Lm72;->C3(Lpc4;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v3}, Lm72;->D3(Lpc4;)Z

    .line 271
    .line 272
    .line 273
    invoke-static {v4, v3}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v7, v6, v0}, Lf3;->loadBannerAd(Led0;Lad0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :catchall_1
    move-exception v0

    .line 284
    invoke-static {v9, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    const-string v3, "adapter.loadBannerAd"

    .line 288
    .line 289
    invoke-static {v2, v0, v3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    new-instance v0, Landroid/os/RemoteException;

    .line 293
    .line 294
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 295
    .line 296
    .line 297
    throw v0

    .line 298
    :cond_7
    return-void
.end method

.method public final S()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v0, "Can not show null mediated rewarded ad."

    .line 8
    .line 9
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroid/os/RemoteException;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :cond_0
    const-class v1, Lf3;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    add-int/lit8 v2, v2, 0x16

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    add-int/2addr v2, v3

    .line 53
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, " #009 Class mismatch: "

    .line 60
    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/os/RemoteException;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 77
    .line 78
    .line 79
    throw v0
.end method

.method public final S0(Lu10;Lpc4;Ljava/lang/String;Lz62;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "Requesting app open ad from adapter."

    .line 8
    .line 9
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    check-cast v0, Lf3;

    .line 13
    .line 14
    new-instance v1, Ll72;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, p4, v2}, Ll72;-><init>(Lm72;Lz62;I)V

    .line 18
    .line 19
    .line 20
    new-instance p4, Ldd0;

    .line 21
    .line 22
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/content/Context;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p0, p3, p2, v2}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lm72;->C3(Lpc4;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, Lm72;->D3(Lpc4;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {p3, p2}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p4, v1}, Lf3;->loadAppOpenAd(Ldd0;Lad0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p2

    .line 49
    const-string p3, ""

    .line 50
    .line 51
    invoke-static {p3, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    const-string p3, "adapter.loadAppOpenAd"

    .line 55
    .line 56
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Landroid/os/RemoteException;

    .line 60
    .line 61
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_0
    const-class p1, Lf3;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    add-int/lit8 p3, p3, 0x16

    .line 92
    .line 93
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    add-int/2addr p3, p4

    .line 100
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p1, " #009 Class mismatch: "

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, Landroid/os/RemoteException;

    .line 122
    .line 123
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method public final U1(Ljava/lang/String;Lpc4;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lm72;->F3(Ljava/lang/String;Lpc4;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final V()Lb72;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final V2(Lu10;Lsa2;Ljava/util/List;)V
    .locals 0

    .line 1
    const-string p1, "Could not initialize rewarded video adapter."

    .line 2
    .line 3
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/os/RemoteException;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public final Z2()Li82;
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    check-cast v0, Lf3;

    .line 10
    .line 11
    invoke-virtual {v0}, Lf3;->getSDKVersionInfo()Ld51;

    .line 12
    .line 13
    .line 14
    throw v2
.end method

.method public final a0()La72;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final b3(Lu10;Lpc4;Ljava/lang/String;Lz62;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "Requesting rewarded interstitial ad from adapter."

    .line 8
    .line 9
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    check-cast v0, Lf3;

    .line 13
    .line 14
    new-instance v1, Lk72;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, p4, v2}, Lk72;-><init>(Lm72;Lz62;I)V

    .line 18
    .line 19
    .line 20
    new-instance p4, Lkd0;

    .line 21
    .line 22
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/content/Context;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p0, p3, p2, v2}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lm72;->C3(Lpc4;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, Lm72;->D3(Lpc4;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {p3, p2}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p4, v1}, Lf3;->loadRewardedInterstitialAd(Lkd0;Lad0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p2

    .line 49
    const-string p3, "adapter.loadRewardedInterstitialAd"

    .line 50
    .line 51
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Landroid/os/RemoteException;

    .line 55
    .line 56
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_0
    const-class p1, Lf3;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    add-int/lit8 p3, p3, 0x16

    .line 87
    .line 88
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    add-int/2addr p3, p4

    .line 95
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p1, " #009 Class mismatch: "

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Landroid/os/RemoteException;

    .line 117
    .line 118
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public final c()Lu10;
    .locals 6

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;->getBannerView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Loi0;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Loi0;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    const-string v1, ""

    .line 21
    .line 22
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/os/RemoteException;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_0
    instance-of v1, v0, Lf3;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    new-instance v0, Loi0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    const-class v1, Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-class v2, Lf3;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    add-int/lit8 v3, v3, 0x4

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    add-int/2addr v3, v4

    .line 85
    add-int/lit8 v3, v3, 0x16

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    new-instance v5, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    add-int/2addr v3, v4

    .line 94
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 95
    .line 96
    .line 97
    const-string v3, " or "

    .line 98
    .line 99
    const-string v4, " #009 Class mismatch: "

    .line 100
    .line 101
    invoke-static {v5, v1, v3, v2, v4}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Landroid/os/RemoteException;

    .line 115
    .line 116
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 117
    .line 118
    .line 119
    throw v0
.end method

.method public final e0()Lc72;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final e1(Lu10;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p1, Lf3;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v1, Lf3;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    add-int/lit8 v2, v2, 0x4

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    add-int/2addr v2, v3

    .line 55
    add-int/lit8 v2, v2, 0x16

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    add-int/2addr v2, v3

    .line 64
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const-string v2, " or "

    .line 68
    .line 69
    const-string v3, " #009 Class mismatch: "

    .line 70
    .line 71
    invoke-static {v4, v0, v2, v1, v3}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Landroid/os/RemoteException;

    .line 85
    .line 86
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_1
    :goto_0
    instance-of p1, p1, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, Lm72;->f()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    const-string p1, "Show interstitial ad from adapter."

    .line 99
    .line 100
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string p1, "Can not show null mediation interstitial ad."

    .line 104
    .line 105
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Landroid/os/RemoteException;

    .line 109
    .line 110
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 111
    .line 112
    .line 113
    throw p1
.end method

.method public final e3(Lu10;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p1, Lf3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Show app open ad from adapter."

    .line 8
    .line 9
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string p1, "Can not show null mediation app open ad."

    .line 13
    .line 14
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroid/os/RemoteException;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_0
    const-class v0, Lf3;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    add-int/lit8 v1, v1, 0x16

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    add-int/2addr v1, v2

    .line 58
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, " #009 Class mismatch: "

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance p1, Landroid/os/RemoteException;

    .line 80
    .line 81
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "Showing interstitial from adapter."

    .line 8
    .line 9
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    check-cast v0, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;->showInterstitial()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    const-string v1, ""

    .line 20
    .line 21
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroid/os/RemoteException;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_0
    const-class v1, Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    add-int/lit8 v2, v2, 0x16

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    add-int/2addr v2, v3

    .line 65
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, " #009 Class mismatch: "

    .line 72
    .line 73
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Landroid/os/RemoteException;

    .line 87
    .line 88
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 89
    .line 90
    .line 91
    throw v0
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcd0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    check-cast v0, Lcd0;

    .line 9
    .line 10
    invoke-interface {v0}, Lcd0;->onPause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    const-string v1, ""

    .line 16
    .line 17
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/os/RemoteException;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final i3(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    check-cast v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->onImmersiveModeUpdated(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    const-string v0, ""

    .line 15
    .line 16
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-class p1, Lcom/google/ads/mediation/AbstractAdViewAdapter;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    add-int/lit8 v1, v1, 0x16

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    add-int/2addr v1, v2

    .line 55
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p1, " #009 Class mismatch: "

    .line 62
    .line 63
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcd0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    check-cast v0, Lcd0;

    .line 9
    .line 10
    invoke-interface {v0}, Lcd0;->onDestroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    const-string v1, ""

    .line 16
    .line 17
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/os/RemoteException;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final l0(Lu10;)V
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    return-void
.end method

.method public final l3(Lu10;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;Lr12;Ljava/util/ArrayList;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    iget-object v7, v1, Lm72;->f:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v0, v7, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    instance-of v8, v7, Lf3;

    .line 20
    .line 21
    if-eqz v8, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-class v0, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-class v2, Lf3;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    add-int/lit8 v4, v4, 0x4

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    add-int/2addr v4, v5

    .line 67
    add-int/lit8 v4, v4, 0x16

    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    new-instance v6, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    add-int/2addr v4, v5

    .line 76
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const-string v4, " or "

    .line 80
    .line 81
    const-string v5, " #009 Class mismatch: "

    .line 82
    .line 83
    invoke-static {v6, v0, v4, v2, v5}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Landroid/os/RemoteException;

    .line 97
    .line 98
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :cond_1
    :goto_0
    const-string v8, "Requesting native ad from adapter."

    .line 103
    .line 104
    invoke-static {v8}, Lgi2;->U(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const-string v8, ""

    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    :try_start_0
    check-cast v7, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;

    .line 112
    .line 113
    iget-object v0, v3, Lpc4;->j:Ljava/util/List;

    .line 114
    .line 115
    const/4 v9, 0x0

    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    new-instance v10, Ljava/util/HashSet;

    .line 119
    .line 120
    invoke-direct {v10, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 121
    .line 122
    .line 123
    move-object v11, v10

    .line 124
    goto :goto_1

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    goto :goto_3

    .line 127
    :cond_2
    move-object v11, v9

    .line 128
    :goto_1
    new-instance v10, Lo72;

    .line 129
    .line 130
    iget-wide v12, v3, Lpc4;->g:J

    .line 131
    .line 132
    const-wide/16 v14, -0x1

    .line 133
    .line 134
    cmp-long v0, v12, v14

    .line 135
    .line 136
    if-nez v0, :cond_3

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_3
    new-instance v0, Ljava/util/Date;

    .line 140
    .line 141
    invoke-direct {v0, v12, v13}, Ljava/util/Date;-><init>(J)V

    .line 142
    .line 143
    .line 144
    :goto_2
    invoke-static {v3}, Lm72;->D3(Lpc4;)Z

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    iget v13, v3, Lpc4;->l:I

    .line 149
    .line 150
    iget-boolean v0, v3, Lpc4;->w:Z

    .line 151
    .line 152
    invoke-static {v4, v3}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-object/from16 v14, p6

    .line 156
    .line 157
    move-object/from16 v15, p7

    .line 158
    .line 159
    move/from16 v16, v0

    .line 160
    .line 161
    invoke-direct/range {v10 .. v16}, Lo72;-><init>(Ljava/util/HashSet;ZILr12;Ljava/util/List;Z)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v3, Lpc4;->r:Landroid/os/Bundle;

    .line 165
    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    :cond_4
    new-instance v0, Lxb4;

    .line 181
    .line 182
    invoke-direct {v0, v6}, Lxb4;-><init>(Lz62;)V

    .line 183
    .line 184
    .line 185
    iput-object v0, v1, Lm72;->g:Lxb4;

    .line 186
    .line 187
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Landroid/content/Context;

    .line 192
    .line 193
    iget-object v6, v1, Lm72;->g:Lxb4;

    .line 194
    .line 195
    invoke-virtual {v1, v4, v3, v5}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    move-object/from16 p3, v0

    .line 200
    .line 201
    move-object/from16 p5, v3

    .line 202
    .line 203
    move-object/from16 p4, v6

    .line 204
    .line 205
    move-object/from16 p2, v7

    .line 206
    .line 207
    move-object/from16 p7, v9

    .line 208
    .line 209
    move-object/from16 p6, v10

    .line 210
    .line 211
    invoke-interface/range {p2 .. p7}, Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;->requestNativeAd(Landroid/content/Context;Ljd0;Landroid/os/Bundle;Llg0;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :goto_3
    invoke-static {v8, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    const-string v3, "adapter.requestNativeAd"

    .line 219
    .line 220
    invoke-static {v2, v0, v3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Landroid/os/RemoteException;

    .line 224
    .line 225
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :cond_5
    instance-of v0, v7, Lf3;

    .line 230
    .line 231
    if-eqz v0, :cond_7

    .line 232
    .line 233
    :try_start_1
    move-object v0, v7

    .line 234
    check-cast v0, Lf3;

    .line 235
    .line 236
    new-instance v9, Lj72;

    .line 237
    .line 238
    const/4 v10, 0x1

    .line 239
    invoke-direct {v9, v1, v6, v10}, Lj72;-><init>(Lm72;Lz62;I)V

    .line 240
    .line 241
    .line 242
    new-instance v10, Lid0;

    .line 243
    .line 244
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    check-cast v11, Landroid/content/Context;

    .line 249
    .line 250
    invoke-virtual {v1, v4, v3, v5}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v3}, Lm72;->C3(Lpc4;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v3}, Lm72;->D3(Lpc4;)Z

    .line 257
    .line 258
    .line 259
    invoke-static {v4, v3}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v10, v9}, Lf3;->loadNativeAdMapper(Lid0;Lad0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    invoke-static {v8, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    const-string v9, "adapter.loadNativeAdMapper"

    .line 274
    .line 275
    invoke-static {v2, v0, v9}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-nez v9, :cond_6

    .line 287
    .line 288
    const-string v9, "Method is not found"

    .line 289
    .line 290
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_6

    .line 295
    .line 296
    :try_start_2
    check-cast v7, Lf3;

    .line 297
    .line 298
    new-instance v0, Ll72;

    .line 299
    .line 300
    const/4 v9, 0x0

    .line 301
    invoke-direct {v0, v1, v6, v9}, Ll72;-><init>(Lm72;Lz62;I)V

    .line 302
    .line 303
    .line 304
    new-instance v6, Lid0;

    .line 305
    .line 306
    invoke-static {v2}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    check-cast v9, Landroid/content/Context;

    .line 311
    .line 312
    invoke-virtual {v1, v4, v3, v5}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v3}, Lm72;->C3(Lpc4;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v3}, Lm72;->D3(Lpc4;)Z

    .line 319
    .line 320
    .line 321
    invoke-static {v4, v3}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7, v6, v0}, Lf3;->loadNativeAd(Lid0;Lad0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :catchall_2
    move-exception v0

    .line 332
    invoke-static {v8, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    const-string v3, "adapter.loadNativeAd"

    .line 336
    .line 337
    invoke-static {v2, v0, v3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    new-instance v0, Landroid/os/RemoteException;

    .line 341
    .line 342
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 343
    .line 344
    .line 345
    throw v0

    .line 346
    :cond_6
    new-instance v0, Landroid/os/RemoteException;

    .line 347
    .line 348
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 349
    .line 350
    .line 351
    throw v0

    .line 352
    :cond_7
    :goto_4
    return-void
.end method

.method public final m()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-class v1, Lf3;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    add-int/lit8 v2, v2, 0x16

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    new-instance v4, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    add-int/2addr v2, v3

    .line 59
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, " #009 Class mismatch: "

    .line 66
    .line 67
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Landroid/os/RemoteException;

    .line 81
    .line 82
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_1
    :goto_0
    iget-object v0, p0, Lm72;->h:Lsa2;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    return v0

    .line 92
    :cond_2
    const/4 v0, 0x0

    .line 93
    return v0
.end method

.method public final n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcd0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    check-cast v0, Lcd0;

    .line 9
    .line 10
    invoke-interface {v0}, Lcd0;->onResume()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    const-string v1, ""

    .line 16
    .line 17
    invoke-static {v1, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/os/RemoteException;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final r2(Lu10;Lxe4;Lpc4;Ljava/lang/String;Ljava/lang/String;Lz62;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "Requesting interscroller ad from adapter."

    .line 8
    .line 9
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    check-cast v0, Lf3;

    .line 13
    .line 14
    new-instance v1, Lvq2;

    .line 15
    .line 16
    const/16 v2, 0x18

    .line 17
    .line 18
    invoke-direct {v1, p0, p6, v0, v2}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p6

    .line 25
    check-cast p6, Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {p0, p4, p3, p5}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p3}, Lm72;->C3(Lpc4;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p3}, Lm72;->D3(Lpc4;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {p4, p3}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    iget p3, p2, Lxe4;->j:I

    .line 40
    .line 41
    iget p2, p2, Lxe4;->g:I

    .line 42
    .line 43
    new-instance p4, Ld3;

    .line 44
    .line 45
    invoke-direct {p4, p3, p2}, Ld3;-><init>(II)V

    .line 46
    .line 47
    .line 48
    const/4 p3, 0x1

    .line 49
    iput-boolean p3, p4, Ld3;->g:Z

    .line 50
    .line 51
    iput p2, p4, Ld3;->h:I

    .line 52
    .line 53
    const-string p2, " does not support interscroller ads."

    .line 54
    .line 55
    new-instance p3, Lr2;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    invoke-virtual {p4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const-string p4, "com.google.android.gms.ads"

    .line 70
    .line 71
    const/4 p5, 0x0

    .line 72
    const/4 p6, 0x7

    .line 73
    invoke-direct {p3, p6, p2, p4, p5}, Lr2;-><init>(ILjava/lang/String;Ljava/lang/String;Lr2;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p3}, Lvq2;->C(Lr2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catch_0
    move-exception p2

    .line 81
    const-string p3, ""

    .line 82
    .line 83
    invoke-static {p3, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    const-string p3, "adapter.loadInterscrollerAd"

    .line 87
    .line 88
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Landroid/os/RemoteException;

    .line 92
    .line 93
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_0
    const-class p1, Lf3;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    add-int/lit8 p3, p3, 0x16

    .line 124
    .line 125
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result p4

    .line 129
    new-instance p5, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    add-int/2addr p3, p4

    .line 132
    invoke-direct {p5, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p1, " #009 Class mismatch: "

    .line 139
    .line 140
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance p1, Landroid/os/RemoteException;

    .line 154
    .line 155
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 156
    .line 157
    .line 158
    throw p1
.end method

.method public final u1(Lu10;Lpc4;Lsa2;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of p4, p2, Lf3;

    .line 4
    .line 5
    if-nez p4, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    const-string v0, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 16
    .line 17
    invoke-static {p4, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-eqz p4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-class p1, Lf3;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    add-int/lit8 p3, p3, 0x16

    .line 51
    .line 52
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    add-int/2addr p3, p4

    .line 59
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, " #009 Class mismatch: "

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Landroid/os/RemoteException;

    .line 81
    .line 82
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_1
    :goto_0
    iput-object p1, p0, Lm72;->i:Lu10;

    .line 87
    .line 88
    iput-object p3, p0, Lm72;->h:Lsa2;

    .line 89
    .line 90
    new-instance p1, Loi0;

    .line 91
    .line 92
    invoke-direct {p1, p2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p3, p1}, Lsa2;->W1(Lu10;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final y0(Lu10;Lpc4;Ljava/lang/String;Lz62;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "Requesting rewarded ad from adapter."

    .line 8
    .line 9
    invoke-static {v1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    check-cast v0, Lf3;

    .line 13
    .line 14
    new-instance v1, Lk72;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, p0, p4, v2}, Lk72;-><init>(Lm72;Lz62;I)V

    .line 18
    .line 19
    .line 20
    new-instance p4, Lkd0;

    .line 21
    .line 22
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/content/Context;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p0, p3, p2, v2}, Lm72;->B3(Ljava/lang/String;Lpc4;Ljava/lang/String;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lm72;->C3(Lpc4;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, Lm72;->D3(Lpc4;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {p3, p2}, Lm72;->E3(Ljava/lang/String;Lpc4;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p4, v1}, Lf3;->loadRewardedAd(Lkd0;Lad0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p2

    .line 49
    const-string p3, ""

    .line 50
    .line 51
    invoke-static {p3, p2}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    const-string p3, "adapter.loadRewardedAd"

    .line 55
    .line 56
    invoke-static {p1, p2, p3}, Lgi2;->E(Lu10;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Landroid/os/RemoteException;

    .line 60
    .line 61
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_0
    const-class p1, Lf3;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    add-int/lit8 p3, p3, 0x16

    .line 92
    .line 93
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    add-int/2addr p3, p4

    .line 100
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p1, " #009 Class mismatch: "

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, Landroid/os/RemoteException;

    .line 122
    .line 123
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 124
    .line 125
    .line 126
    throw p1
.end method

.method public final z3(Lu10;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lm72;->f:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p1, Lf3;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Show rewarded ad from adapter."

    .line 8
    .line 9
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string p1, "Can not show null mediation rewarded ad."

    .line 13
    .line 14
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroid/os/RemoteException;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_0
    const-class v0, Lf3;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    add-int/lit8 v1, v1, 0x16

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    add-int/2addr v1, v2

    .line 58
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, " #009 Class mismatch: "

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance p1, Landroid/os/RemoteException;

    .line 80
    .line 81
    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw p1
.end method
