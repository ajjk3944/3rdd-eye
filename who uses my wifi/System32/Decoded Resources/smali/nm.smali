.class public final Lnm;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public final synthetic j:I

.field public k:I

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lga0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lya0;Lha0;Lm;Loj;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lnm;->j:I

    .line 1
    iput-object p1, p0, Lnm;->l:Ljava/lang/Object;

    iput-object p2, p0, Lnm;->m:Ljava/lang/Object;

    iput-object p3, p0, Lnm;->n:Ljava/lang/Object;

    iput-object p4, p0, Lnm;->o:Ljava/lang/Object;

    iput-object p5, p0, Lnm;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lmz0;-><init>(ILoj;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Loj;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lnm;->j:I

    .line 2
    iput-object p1, p0, Lnm;->o:Ljava/lang/Object;

    iput-object p2, p0, Lnm;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lmz0;-><init>(ILoj;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lnm;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqk;

    .line 7
    .line 8
    check-cast p2, Loj;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Lnm;->h(Loj;Ljava/lang/Object;)Loj;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lnm;

    .line 15
    .line 16
    sget-object p2, Lz31;->a:Lz31;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lnm;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p2, Loj;

    .line 24
    .line 25
    invoke-virtual {p0, p2, p1}, Lnm;->h(Loj;Ljava/lang/Object;)Loj;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lnm;

    .line 30
    .line 31
    sget-object p2, Lz31;->a:Lz31;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lnm;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 8

    .line 1
    iget v0, p0, Lnm;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lnm;

    .line 7
    .line 8
    iget-object p2, p0, Lnm;->l:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p2

    .line 11
    check-cast v2, Lga0;

    .line 12
    .line 13
    iget-object p2, p0, Lnm;->m:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p2

    .line 16
    check-cast v3, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 17
    .line 18
    iget-object p2, p0, Lnm;->n:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p2

    .line 21
    check-cast v4, Lya0;

    .line 22
    .line 23
    iget-object p2, p0, Lnm;->o:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p2

    .line 26
    check-cast v5, Lha0;

    .line 27
    .line 28
    iget-object p2, p0, Lnm;->p:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, p2

    .line 31
    check-cast v6, Lm;

    .line 32
    .line 33
    move-object v7, p1

    .line 34
    invoke-direct/range {v1 .. v7}, Lnm;-><init>(Lga0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lya0;Lha0;Lm;Loj;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_0
    move-object v7, p1

    .line 39
    new-instance p1, Lnm;

    .line 40
    .line 41
    iget-object v0, p0, Lnm;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    iget-object v1, p0, Lnm;->p:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1, v0, v1, v7}, Lnm;-><init>(Ljava/util/List;Ljava/util/ArrayList;Loj;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p1, Lnm;->n:Ljava/lang/Object;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lnm;->j:I

    .line 2
    .line 3
    iget-object v1, p0, Lnm;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lnm;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lnm;->m:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 18
    .line 19
    iget v7, p0, Lnm;->k:I

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    sget-object v9, Lrk;->f:Lrk;

    .line 23
    .line 24
    if-eqz v7, :cond_2

    .line 25
    .line 26
    if-eq v7, v5, :cond_1

    .line 27
    .line 28
    if-ne v7, v6, :cond_0

    .line 29
    .line 30
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_5

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    :try_start_1
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :try_start_2
    iget-object p1, p0, Lnm;->l:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lga0;

    .line 54
    .line 55
    invoke-virtual {p1}, Lga0;->a()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object p1, Lfp;->b:Len;

    .line 59
    .line 60
    new-instance v3, Lkm;

    .line 61
    .line 62
    iget-object v7, p0, Lnm;->n:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v7, Lya0;

    .line 65
    .line 66
    check-cast v2, Lha0;

    .line 67
    .line 68
    invoke-direct {v3, v7, v2, v4, v6}, Lkm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Loj;I)V

    .line 69
    .line 70
    .line 71
    iput v5, p0, Lnm;->k:I

    .line 72
    .line 73
    invoke-static {p0, p1, v3}, Lgi2;->A(Lqj;Lhk;Lhy;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v9, :cond_3

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_3
    :goto_0
    sget-object v2, Lfp;->a:Lon;

    .line 81
    .line 82
    sget-object v2, Lza0;->a:Li00;

    .line 83
    .line 84
    new-instance v3, Lpa0;

    .line 85
    .line 86
    check-cast v1, Lm;

    .line 87
    .line 88
    invoke-direct {v3, v1, p1, v4, v8}, Lpa0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Loj;I)V

    .line 89
    .line 90
    .line 91
    iput v6, p0, Lnm;->k:I

    .line 92
    .line 93
    invoke-static {p0, v2, v3}, Lgi2;->A(Lqj;Lhk;Lhy;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    if-ne p1, v9, :cond_4

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    :goto_1
    iput-boolean v8, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :goto_3
    sget-object v9, Lz31;->a:Lz31;

    .line 108
    .line 109
    :goto_4
    return-object v9

    .line 110
    :goto_5
    iput-boolean v8, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->a0:Z

    .line 111
    .line 112
    throw p1

    .line 113
    :pswitch_0
    iget v0, p0, Lnm;->k:I

    .line 114
    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    if-eq v0, v5, :cond_6

    .line 118
    .line 119
    if-ne v0, v6, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Lnm;->l:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Ljava/util/Iterator;

    .line 124
    .line 125
    iget-object v1, p0, Lnm;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_6
    iget-object v0, p0, Lnm;->m:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v1, p0, Lnm;->l:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Ljava/util/Iterator;

    .line 144
    .line 145
    iget-object v2, p0, Lnm;->n:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Ljava/util/List;

    .line 148
    .line 149
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    check-cast p1, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_7

    .line 159
    .line 160
    move-object p1, v0

    .line 161
    move-object v0, v1

    .line 162
    move-object v1, v2

    .line 163
    goto :goto_6

    .line 164
    :cond_7
    new-instance p1, Lmm;

    .line 165
    .line 166
    invoke-direct {p1, v5, v4}, Lmz0;-><init>(ILoj;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    iput-object v2, p0, Lnm;->n:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v1, p0, Lnm;->l:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v4, p0, Lnm;->m:Ljava/lang/Object;

    .line 177
    .line 178
    iput v6, p0, Lnm;->k:I

    .line 179
    .line 180
    throw v4

    .line 181
    :cond_8
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lnm;->n:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Ljava/util/List;

    .line 187
    .line 188
    check-cast v1, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_9

    .line 199
    .line 200
    return-object p1

    .line 201
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-nez v2, :cond_a

    .line 206
    .line 207
    iput-object v1, p0, Lnm;->n:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object v0, p0, Lnm;->l:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object p1, p0, Lnm;->m:Ljava/lang/Object;

    .line 212
    .line 213
    iput v5, p0, Lnm;->k:I

    .line 214
    .line 215
    throw v4

    .line 216
    :cond_a
    new-instance p1, Ljava/lang/ClassCastException;

    .line 217
    .line 218
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 219
    .line 220
    .line 221
    throw p1

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
