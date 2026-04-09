.class public final Lqt1;
.super Lhu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljt1;Lfr1;ILandroid/content/Context;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lqt1;->h:I

    .line 1
    const-string v4, "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24="

    const/16 v7, 0x1f

    const-string v3, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O"

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v7}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    const/4 p1, 0x0

    iput-object p1, v1, Lqt1;->i:Ljava/lang/Object;

    iput-object p4, v1, Lqt1;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljt1;Lfr1;ILandroid/view/View;Landroid/app/Activity;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lqt1;->h:I

    .line 2
    const-string v4, "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs="

    const/16 v7, 0x3e

    const-string v3, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW"

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v7}, Lhu1;-><init>(Ljt1;Ljava/lang/String;Ljava/lang/String;Lfr1;II)V

    iput-object p4, v1, Lqt1;->j:Ljava/lang/Object;

    iput-object p5, v1, Lqt1;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget v0, p0, Lqt1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhu1;->d:Lfr1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln54;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 12
    .line 13
    check-cast v1, Lqr1;

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Lqr1;->B(J)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ln54;->b()V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 24
    .line 25
    check-cast v1, Lqr1;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Lqr1;->C(J)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lqt1;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Landroid/content/Context;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v1, p0, Lhu1;->a:Ljt1;

    .line 37
    .line 38
    iget-object v1, v1, Ljt1;->a:Landroid/content/Context;

    .line 39
    .line 40
    :cond_0
    iget-object v2, p0, Lqt1;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/util/List;

    .line 43
    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/util/List;

    .line 58
    .line 59
    iput-object v1, p0, Lqt1;->i:Ljava/lang/Object;

    .line 60
    .line 61
    :cond_1
    iget-object v1, p0, Lqt1;->i:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/List;

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x2

    .line 72
    if-ne v1, v2, :cond_2

    .line 73
    .line 74
    monitor-enter v0

    .line 75
    :try_start_0
    iget-object v1, p0, Lqt1;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/util/List;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    invoke-virtual {v0}, Ln54;->b()V

    .line 91
    .line 92
    .line 93
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 94
    .line 95
    check-cast v3, Lqr1;

    .line 96
    .line 97
    invoke-virtual {v3, v1, v2}, Lqr1;->B(J)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lqt1;->i:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Ljava/util/List;

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v1

    .line 115
    invoke-virtual {v0}, Ln54;->b()V

    .line 116
    .line 117
    .line 118
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 119
    .line 120
    check-cast v3, Lqr1;

    .line 121
    .line 122
    invoke-virtual {v3, v1, v2}, Lqr1;->C(J)V

    .line 123
    .line 124
    .line 125
    monitor-exit v0

    .line 126
    goto :goto_0

    .line 127
    :catchall_0
    move-exception v1

    .line 128
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    throw v1

    .line 130
    :cond_2
    :goto_0
    return-void

    .line 131
    :pswitch_0
    iget-object v0, p0, Lqt1;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Landroid/view/View;

    .line 134
    .line 135
    if-nez v0, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    sget-object v1, Lmz1;->P2:Liz1;

    .line 139
    .line 140
    sget-object v2, Ltw1;->e:Ltw1;

    .line 141
    .line 142
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 143
    .line 144
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iget-object v3, p0, Lhu1;->e:Ljava/lang/reflect/Method;

    .line 155
    .line 156
    iget-object v4, p0, Lqt1;->i:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Landroid/app/Activity;

    .line 159
    .line 160
    filled-new-array {v0, v4, v1}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const/4 v1, 0x0

    .line 165
    invoke-virtual {v3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, [Ljava/lang/Object;

    .line 170
    .line 171
    iget-object v1, p0, Lhu1;->d:Lfr1;

    .line 172
    .line 173
    monitor-enter v1

    .line 174
    const/4 v3, 0x0

    .line 175
    :try_start_1
    aget-object v3, v0, v3

    .line 176
    .line 177
    check-cast v3, Ljava/lang/Long;

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    invoke-virtual {v1}, Ln54;->b()V

    .line 184
    .line 185
    .line 186
    iget-object v5, v1, Ln54;->g:Lp54;

    .line 187
    .line 188
    check-cast v5, Lqr1;

    .line 189
    .line 190
    invoke-virtual {v5, v3, v4}, Lqr1;->d0(J)V

    .line 191
    .line 192
    .line 193
    const/4 v3, 0x1

    .line 194
    aget-object v3, v0, v3

    .line 195
    .line 196
    check-cast v3, Ljava/lang/Long;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 199
    .line 200
    .line 201
    move-result-wide v3

    .line 202
    invoke-virtual {v1}, Ln54;->b()V

    .line 203
    .line 204
    .line 205
    iget-object v5, v1, Ln54;->g:Lp54;

    .line 206
    .line 207
    check-cast v5, Lqr1;

    .line 208
    .line 209
    invoke-virtual {v5, v3, v4}, Lqr1;->e0(J)V

    .line 210
    .line 211
    .line 212
    if-eqz v2, :cond_4

    .line 213
    .line 214
    const/4 v2, 0x2

    .line 215
    aget-object v0, v0, v2

    .line 216
    .line 217
    check-cast v0, Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v1}, Ln54;->b()V

    .line 220
    .line 221
    .line 222
    iget-object v2, v1, Ln54;->g:Lp54;

    .line 223
    .line 224
    check-cast v2, Lqr1;

    .line 225
    .line 226
    invoke-virtual {v2, v0}, Lqr1;->f0(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    goto :goto_3

    .line 232
    :cond_4
    :goto_1
    monitor-exit v1

    .line 233
    :goto_2
    return-void

    .line 234
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 235
    throw v0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
