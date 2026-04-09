.class public final Llw0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public final synthetic j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lyw0;


# direct methods
.method public synthetic constructor <init>(Lyw0;Loj;I)V
    .locals 0

    .line 1
    iput p3, p0, Llw0;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Llw0;->m:Lyw0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lmz0;-><init>(ILoj;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Llw0;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lav;

    .line 7
    .line 8
    check-cast p2, Loj;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Llw0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Llw0;

    .line 15
    .line 16
    sget-object p2, Lz31;->a:Lz31;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Llw0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ljw0;

    .line 24
    .line 25
    check-cast p2, Loj;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Llw0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Llw0;

    .line 32
    .line 33
    sget-object p2, Lz31;->a:Lz31;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Llw0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 3

    .line 1
    iget v0, p0, Llw0;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Llw0;

    .line 7
    .line 8
    iget-object v1, p0, Llw0;->m:Lyw0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, p1, v2}, Llw0;-><init>(Lyw0;Loj;I)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Llw0;->l:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Llw0;

    .line 18
    .line 19
    iget-object v1, p0, Llw0;->m:Lyw0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, v1, p1, v2}, Llw0;-><init>(Lyw0;Loj;I)V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Llw0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Llw0;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llw0;->m:Lyw0;

    .line 7
    .line 8
    iget-object v1, v0, Lyw0;->e:Lay0;

    .line 9
    .line 10
    iget v2, p0, Llw0;->k:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lz31;->a:Lz31;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Llw0;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lav;

    .line 37
    .line 38
    invoke-virtual {v1}, Lay0;->E()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lyx0;

    .line 43
    .line 44
    instance-of v4, v2, Ljm;

    .line 45
    .line 46
    if-nez v4, :cond_2

    .line 47
    .line 48
    iget-object v0, v0, Lyw0;->g:Lmc2;

    .line 49
    .line 50
    new-instance v4, Lhw0;

    .line 51
    .line 52
    invoke-direct {v4, v2}, Lhw0;-><init>(Lyx0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v4}, Lmc2;->f(Ljw0;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    new-instance v0, Lpa0;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x3

    .line 62
    invoke-direct {v0, v2, v4, v5}, Lpa0;-><init>(Ljava/lang/Object;Loj;I)V

    .line 63
    .line 64
    .line 65
    iput v3, p0, Llw0;->k:I

    .line 66
    .line 67
    new-instance v2, Ldv;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, v3, p1}, Ldv;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance p1, Lzo0;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v3, Lcv;

    .line 79
    .line 80
    invoke-direct {v3, p1, v2, v0}, Lcv;-><init>(Lzo0;Lav;Lpa0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3, p0}, Lay0;->b(Lav;Loj;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    sget-object p1, Lrk;->f:Lrk;

    .line 87
    .line 88
    :goto_0
    return-object p1

    .line 89
    :pswitch_0
    iget v0, p0, Llw0;->k:I

    .line 90
    .line 91
    sget-object v1, Lz31;->a:Lz31;

    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    const/4 v3, 0x1

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    if-eq v0, v3, :cond_3

    .line 98
    .line 99
    if-ne v0, v2, :cond_4

    .line 100
    .line 101
    :cond_3
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 108
    .line 109
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_5
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Llw0;->l:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Ljw0;

    .line 119
    .line 120
    instance-of v0, p1, Lhw0;

    .line 121
    .line 122
    iget-object v4, p0, Llw0;->m:Lyw0;

    .line 123
    .line 124
    sget-object v5, Lrk;->f:Lrk;

    .line 125
    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    check-cast p1, Lhw0;

    .line 129
    .line 130
    iput v3, p0, Llw0;->k:I

    .line 131
    .line 132
    iget-object v0, v4, Lyw0;->e:Lay0;

    .line 133
    .line 134
    invoke-virtual {v0}, Lay0;->E()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Lyx0;

    .line 139
    .line 140
    instance-of v2, v0, Ljm;

    .line 141
    .line 142
    if-eqz v2, :cond_6

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    instance-of v2, v0, Lqn0;

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    iget-object p1, p1, Lhw0;->a:Lyx0;

    .line 150
    .line 151
    if-ne v0, p1, :cond_9

    .line 152
    .line 153
    invoke-virtual {v4, p0}, Lyw0;->e(Lqj;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v5, :cond_9

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    sget-object p1, Lv31;->a:Lv31;

    .line 161
    .line 162
    invoke-static {v0, p1}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_8

    .line 167
    .line 168
    invoke-virtual {v4, p0}, Lyw0;->e(Lqj;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-ne p1, v5, :cond_9

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    instance-of p1, v0, Lmu;

    .line 176
    .line 177
    if-nez p1, :cond_a

    .line 178
    .line 179
    :cond_9
    :goto_1
    move-object p1, v1

    .line 180
    :goto_2
    if-ne p1, v5, :cond_c

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    const-string v0, "Can\'t read in final state."

    .line 186
    .line 187
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_b
    instance-of v0, p1, Liw0;

    .line 192
    .line 193
    if-eqz v0, :cond_c

    .line 194
    .line 195
    check-cast p1, Liw0;

    .line 196
    .line 197
    iput v2, p0, Llw0;->k:I

    .line 198
    .line 199
    invoke-static {v4, p1, p0}, Lyw0;->a(Lyw0;Liw0;Lqj;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-ne p1, v5, :cond_c

    .line 204
    .line 205
    :goto_3
    move-object v1, v5

    .line 206
    :cond_c
    :goto_4
    return-object v1

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
