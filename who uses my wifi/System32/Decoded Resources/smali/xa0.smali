.class public final Lxa0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public j:Ljava/util/Iterator;

.field public k:I

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lcp0;

.field public final synthetic o:Leu0;

.field public final synthetic p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

.field public final synthetic q:Lhy;

.field public final synthetic r:Lso1;


# direct methods
.method public constructor <init>(Lcp0;Leu0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lhy;Lso1;Loj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxa0;->n:Lcp0;

    .line 2
    .line 3
    iput-object p2, p0, Lxa0;->o:Leu0;

    .line 4
    .line 5
    iput-object p3, p0, Lxa0;->p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 6
    .line 7
    iput-object p4, p0, Lxa0;->q:Lhy;

    .line 8
    .line 9
    iput-object p5, p0, Lxa0;->r:Lso1;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lmz0;-><init>(ILoj;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqk;

    .line 2
    .line 3
    check-cast p2, Loj;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lxa0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lxa0;

    .line 10
    .line 11
    sget-object p2, Lz31;->a:Lz31;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lxa0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 7

    .line 1
    new-instance v0, Lxa0;

    .line 2
    .line 3
    iget-object v4, p0, Lxa0;->q:Lhy;

    .line 4
    .line 5
    iget-object v5, p0, Lxa0;->r:Lso1;

    .line 6
    .line 7
    iget-object v1, p0, Lxa0;->n:Lcp0;

    .line 8
    .line 9
    iget-object v2, p0, Lxa0;->o:Leu0;

    .line 10
    .line 11
    iget-object v3, p0, Lxa0;->p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lxa0;-><init>(Lcp0;Leu0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lhy;Lso1;Loj;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, v0, Lxa0;->m:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lxa0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqk;

    .line 4
    .line 5
    iget v1, p0, Lxa0;->l:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lxa0;->k:I

    .line 14
    .line 15
    iget-object v1, p0, Lxa0;->j:Ljava/util/Iterator;

    .line 16
    .line 17
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lxa0;->n:Lcp0;

    .line 33
    .line 34
    iget-object p1, p1, Lcp0;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ljava/lang/Iterable;

    .line 37
    .line 38
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-static {p1}, Lag;->k0(Ljava/lang/Iterable;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    sget-object v4, Lfp;->b:Len;

    .line 68
    .line 69
    new-instance v5, Lwa0;

    .line 70
    .line 71
    const/4 v12, 0x0

    .line 72
    iget-object v6, p0, Lxa0;->o:Leu0;

    .line 73
    .line 74
    iget-object v7, p0, Lxa0;->p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 75
    .line 76
    iget-object v8, p0, Lxa0;->q:Lhy;

    .line 77
    .line 78
    iget-object v11, p0, Lxa0;->r:Lso1;

    .line 79
    .line 80
    invoke-direct/range {v5 .. v12}, Lwa0;-><init>(Leu0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lhy;JLso1;Loj;)V

    .line 81
    .line 82
    .line 83
    const/4 v6, 0x2

    .line 84
    invoke-static {v0, v4, v5, v6}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    move-object v1, p1

    .line 97
    move v0, v2

    .line 98
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    sget-object v4, Lz31;->a:Lz31;

    .line 103
    .line 104
    if-eqz p1, :cond_8

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Lw30;

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    iput-object v5, p0, Lxa0;->m:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v1, p0, Lxa0;->j:Ljava/util/Iterator;

    .line 116
    .line 117
    iput v0, p0, Lxa0;->k:I

    .line 118
    .line 119
    iput v3, p0, Lxa0;->l:I

    .line 120
    .line 121
    check-cast p1, Lg40;

    .line 122
    .line 123
    :cond_4
    invoke-virtual {p1}, Lg40;->A()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    instance-of v6, v5, Ll20;

    .line 128
    .line 129
    sget-object v7, Lrk;->f:Lrk;

    .line 130
    .line 131
    if-nez v6, :cond_5

    .line 132
    .line 133
    iget-object p1, p0, Lqj;->g:Lhk;

    .line 134
    .line 135
    invoke-static {p1}, Li30;->j(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Lwl2;->g(Lhk;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    invoke-virtual {p1, v5}, Lg40;->N(Ljava/lang/Object;)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-ltz v5, :cond_4

    .line 147
    .line 148
    new-instance v5, Lkd;

    .line 149
    .line 150
    invoke-static {p0}, Luk2;->r(Loj;)Loj;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-direct {v5, v3, v6}, Lkd;-><init>(ILoj;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Lkd;->u()V

    .line 158
    .line 159
    .line 160
    new-instance v6, Llp;

    .line 161
    .line 162
    const/4 v8, 0x3

    .line 163
    invoke-direct {v6, v8, v5}, Llp;-><init>(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v2, v6, v8}, Lwl2;->o(Lw30;ZLb40;I)Ljp;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v6, Lkp;

    .line 171
    .line 172
    invoke-direct {v6, p1}, Lkp;-><init>(Ljp;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v6}, Lkd;->w(Lrh0;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Lkd;->t()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v7, :cond_6

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    move-object p1, v4

    .line 186
    :goto_2
    if-ne p1, v7, :cond_7

    .line 187
    .line 188
    move-object v4, p1

    .line 189
    :cond_7
    :goto_3
    if-ne v4, v7, :cond_3

    .line 190
    .line 191
    return-object v7

    .line 192
    :cond_8
    return-object v4
.end method
