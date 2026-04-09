.class public final Lzf1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lj92;

.field public final synthetic h:Z

.field public final synthetic i:Lcr1;


# direct methods
.method public synthetic constructor <init>(Lcr1;Lj92;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lzf1;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lzf1;->g:Lj92;

    .line 4
    .line 5
    iput-boolean p3, p0, Lzf1;->h:Z

    .line 6
    .line 7
    iput-object p1, p0, Lzf1;->i:Lcr1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lzf1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lzf1;->i:Lcr1;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcr1;->D:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v2, v0, Lcr1;->C:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v3, v0, Lcr1;->r:Leb3;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Landroid/net/Uri;

    .line 34
    .line 35
    invoke-static {v5, v2, v1}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    iget-object v4, v0, Lcr1;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v4, p0, Lzf1;->g:Lj92;

    .line 47
    .line 48
    check-cast v4, Lh92;

    .line 49
    .line 50
    invoke-virtual {v4}, Lsb1;->U()Landroid/os/Parcel;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    invoke-virtual {v4, v5, v6}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 59
    .line 60
    .line 61
    iget-boolean v4, v0, Lcr1;->t:Z

    .line 62
    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    iget-boolean v4, p0, Lzf1;->h:Z

    .line 66
    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_5

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Landroid/net/Uri;

    .line 87
    .line 88
    invoke-static {v4, v2, v1}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/4 v6, 0x0

    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    iget-object v5, v0, Lcr1;->B:Ljava/lang/String;

    .line 96
    .line 97
    const-string v7, "1"

    .line 98
    .line 99
    invoke-static {v4, v5, v7}, Lcr1;->I3(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v3, v4, v6, v6, v6}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    sget-object v5, Lmz1;->Q7:Liz1;

    .line 112
    .line 113
    sget-object v7, Ltw1;->e:Ltw1;

    .line 114
    .line 115
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 116
    .line 117
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v3, v4, v6, v6, v6}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :goto_2
    const-string v0, ""

    .line 138
    .line 139
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    return-void

    .line 143
    :pswitch_0
    check-cast p1, Ljava/util/ArrayList;

    .line 144
    .line 145
    :try_start_1
    iget-object v0, p0, Lzf1;->g:Lj92;

    .line 146
    .line 147
    check-cast v0, Lh92;

    .line 148
    .line 149
    invoke-virtual {v0}, Lsb1;->U()Landroid/os/Parcel;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 154
    .line 155
    .line 156
    const/4 v2, 0x1

    .line 157
    invoke-virtual {v0, v1, v2}, Lsb1;->M0(Landroid/os/Parcel;I)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lzf1;->i:Lcr1;

    .line 161
    .line 162
    iget-boolean v1, v0, Lcr1;->s:Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 163
    .line 164
    iget-object v2, v0, Lcr1;->r:Leb3;

    .line 165
    .line 166
    if-nez v1, :cond_6

    .line 167
    .line 168
    :try_start_2
    iget-boolean v1, p0, Lzf1;->h:Z

    .line 169
    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :catch_1
    move-exception p1

    .line 174
    goto :goto_5

    .line 175
    :cond_6
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    const/4 v3, 0x0

    .line 180
    :cond_7
    :goto_4
    if-ge v3, v1, :cond_9

    .line 181
    .line 182
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    add-int/lit8 v3, v3, 0x1

    .line 187
    .line 188
    check-cast v4, Landroid/net/Uri;

    .line 189
    .line 190
    iget-object v5, v0, Lcr1;->E:Ljava/util/ArrayList;

    .line 191
    .line 192
    iget-object v6, v0, Lcr1;->F:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-static {v4, v5, v6}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    const/4 v6, 0x0

    .line 199
    if-eqz v5, :cond_8

    .line 200
    .line 201
    iget-object v5, v0, Lcr1;->B:Ljava/lang/String;

    .line 202
    .line 203
    const-string v7, "1"

    .line 204
    .line 205
    invoke-static {v4, v5, v7}, Lcr1;->I3(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v2, v4, v6, v6, v6}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_8
    sget-object v5, Lmz1;->Q7:Liz1;

    .line 218
    .line 219
    sget-object v7, Ltw1;->e:Ltw1;

    .line 220
    .line 221
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 222
    .line 223
    invoke-virtual {v7, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    check-cast v5, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_7

    .line 234
    .line 235
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v2, v4, v6, v6, v6}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :goto_5
    const-string v0, ""

    .line 244
    .line 245
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    return-void

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget v0, p0, Lzf1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "Internal error: "

    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Lzf1;->g:Lj92;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/lit8 v2, v2, 0x10

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast v1, Lh92;

    .line 40
    .line 41
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x2

    .line 49
    invoke-virtual {v1, v0, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception p1

    .line 54
    const-string v0, ""

    .line 55
    .line 56
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_0
    const-string v0, "Internal error: "

    .line 61
    .line 62
    :try_start_1
    iget-object v1, p0, Lzf1;->g:Lj92;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/lit8 v2, v2, 0x10

    .line 77
    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast v1, Lh92;

    .line 94
    .line 95
    invoke-virtual {v1}, Lsb1;->U()Landroid/os/Parcel;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x2

    .line 103
    invoke-virtual {v1, v0, p1}, Lsb1;->M0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catch_1
    move-exception p1

    .line 108
    const-string v0, ""

    .line 109
    .line 110
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :goto_1
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
