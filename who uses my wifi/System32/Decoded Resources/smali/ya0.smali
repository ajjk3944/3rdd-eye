.class public final Lya0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lbp0;

.field public final synthetic m:Lbp0;

.field public final synthetic n:Lbp0;

.field public final synthetic o:Lbp0;

.field public final synthetic p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

.field public final synthetic q:Lso1;


# direct methods
.method public constructor <init>(Lbp0;Lbp0;Lbp0;Lbp0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lso1;Loj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lya0;->l:Lbp0;

    .line 2
    .line 3
    iput-object p2, p0, Lya0;->m:Lbp0;

    .line 4
    .line 5
    iput-object p3, p0, Lya0;->n:Lbp0;

    .line 6
    .line 7
    iput-object p4, p0, Lya0;->o:Lbp0;

    .line 8
    .line 9
    iput-object p5, p0, Lya0;->p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 10
    .line 11
    iput-object p6, p0, Lya0;->q:Lso1;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lmz0;-><init>(ILoj;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lhy;

    .line 2
    .line 3
    check-cast p2, Loj;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lya0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lya0;

    .line 10
    .line 11
    sget-object p2, Lz31;->a:Lz31;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lya0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 8

    .line 1
    new-instance v0, Lya0;

    .line 2
    .line 3
    iget-object v5, p0, Lya0;->p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 4
    .line 5
    iget-object v6, p0, Lya0;->q:Lso1;

    .line 6
    .line 7
    iget-object v1, p0, Lya0;->l:Lbp0;

    .line 8
    .line 9
    iget-object v2, p0, Lya0;->m:Lbp0;

    .line 10
    .line 11
    iget-object v3, p0, Lya0;->n:Lbp0;

    .line 12
    .line 13
    iget-object v4, p0, Lya0;->o:Lbp0;

    .line 14
    .line 15
    move-object v7, p1

    .line 16
    invoke-direct/range {v0 .. v7}, Lya0;-><init>(Lbp0;Lbp0;Lbp0;Lbp0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lso1;Loj;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, v0, Lya0;->k:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lya0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v6, v1

    .line 6
    check-cast v6, Lhy;

    .line 7
    .line 8
    iget v1, v0, Lya0;->j:I

    .line 9
    .line 10
    const/4 v9, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v9, :cond_0

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget v1, Lfu0;->a:I

    .line 32
    .line 33
    new-instance v4, Leu0;

    .line 34
    .line 35
    const/16 v1, 0xc

    .line 36
    .line 37
    invoke-direct {v4, v1}, Leu0;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lcp0;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v1, v3, Lcp0;->f:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v2, v0, Lya0;->l:Lbp0;

    .line 53
    .line 54
    iget-wide v7, v2, Lbp0;->f:J

    .line 55
    .line 56
    iget-object v5, v0, Lya0;->m:Lbp0;

    .line 57
    .line 58
    iget-wide v10, v5, Lbp0;->f:J

    .line 59
    .line 60
    cmp-long v12, v7, v10

    .line 61
    .line 62
    iget-object v13, v0, Lya0;->n:Lbp0;

    .line 63
    .line 64
    const-wide/16 v16, 0x1

    .line 65
    .line 66
    if-gtz v12, :cond_6

    .line 67
    .line 68
    iget-wide v14, v13, Lbp0;->f:J

    .line 69
    .line 70
    cmp-long v10, v10, v14

    .line 71
    .line 72
    if-gtz v10, :cond_6

    .line 73
    .line 74
    new-instance v10, Ljava/lang/Long;

    .line 75
    .line 76
    invoke-direct {v10, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    iget-wide v7, v5, Lbp0;->f:J

    .line 83
    .line 84
    add-long v14, v7, v16

    .line 85
    .line 86
    iget-object v1, v0, Lya0;->o:Lbp0;

    .line 87
    .line 88
    iget-wide v10, v1, Lbp0;->f:J

    .line 89
    .line 90
    sub-long v10, v10, v16

    .line 91
    .line 92
    const-wide/16 v18, 0x0

    .line 93
    .line 94
    :goto_0
    cmp-long v1, v18, v10

    .line 95
    .line 96
    if-gez v1, :cond_7

    .line 97
    .line 98
    move v1, v9

    .line 99
    move-wide/from16 v20, v10

    .line 100
    .line 101
    iget-wide v9, v2, Lbp0;->f:J

    .line 102
    .line 103
    cmp-long v5, v7, v9

    .line 104
    .line 105
    const/4 v9, 0x2

    .line 106
    if-gtz v5, :cond_2

    .line 107
    .line 108
    sput v9, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->e0:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    iget-wide v10, v13, Lbp0;->f:J

    .line 112
    .line 113
    cmp-long v5, v14, v10

    .line 114
    .line 115
    if-lez v5, :cond_3

    .line 116
    .line 117
    sput v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->e0:I

    .line 118
    .line 119
    :cond_3
    :goto_1
    sget v5, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->e0:I

    .line 120
    .line 121
    if-ne v5, v1, :cond_4

    .line 122
    .line 123
    iget-object v5, v3, Lcp0;->f:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v5, Ljava/util/ArrayList;

    .line 126
    .line 127
    new-instance v10, Ljava/lang/Long;

    .line 128
    .line 129
    invoke-direct {v10, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    const-wide/16 v10, -0x1

    .line 136
    .line 137
    add-long/2addr v7, v10

    .line 138
    sput v9, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->e0:I

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    if-ne v5, v9, :cond_5

    .line 142
    .line 143
    iget-object v5, v3, Lcp0;->f:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v5, Ljava/util/ArrayList;

    .line 146
    .line 147
    new-instance v9, Ljava/lang/Long;

    .line 148
    .line 149
    invoke-direct {v9, v14, v15}, Ljava/lang/Long;-><init>(J)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    add-long v14, v14, v16

    .line 156
    .line 157
    const/4 v1, 0x1

    .line 158
    sput v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->e0:I

    .line 159
    .line 160
    :cond_5
    :goto_2
    add-long v18, v18, v16

    .line 161
    .line 162
    move-wide/from16 v10, v20

    .line 163
    .line 164
    const/4 v9, 0x1

    .line 165
    goto :goto_0

    .line 166
    :cond_6
    iget-wide v9, v13, Lbp0;->f:J

    .line 167
    .line 168
    cmp-long v2, v7, v9

    .line 169
    .line 170
    if-gtz v2, :cond_7

    .line 171
    .line 172
    :goto_3
    iget-object v2, v3, Lcp0;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Ljava/util/ArrayList;

    .line 175
    .line 176
    new-instance v5, Ljava/lang/Long;

    .line 177
    .line 178
    invoke-direct {v5, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    cmp-long v2, v7, v9

    .line 185
    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    add-long v7, v7, v16

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_7
    new-instance v2, Lxa0;

    .line 192
    .line 193
    iget-object v7, v0, Lya0;->q:Lso1;

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    iget-object v5, v0, Lya0;->p:Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 197
    .line 198
    invoke-direct/range {v2 .. v8}, Lxa0;-><init>(Lcp0;Leu0;Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;Lhy;Lso1;Loj;)V

    .line 199
    .line 200
    .line 201
    const/4 v3, 0x0

    .line 202
    iput-object v3, v0, Lya0;->k:Ljava/lang/Object;

    .line 203
    .line 204
    const/4 v1, 0x1

    .line 205
    iput v1, v0, Lya0;->j:I

    .line 206
    .line 207
    new-instance v1, Lht0;

    .line 208
    .line 209
    invoke-interface {v0}, Loj;->getContext()Lhk;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-direct {v1, v3, v0}, Lht0;-><init>(Lhk;Lqj;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v1, v2}, Lyb;->r(Lht0;Lht0;Lhy;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    sget-object v2, Lrk;->f:Lrk;

    .line 221
    .line 222
    if-ne v1, v2, :cond_8

    .line 223
    .line 224
    return-object v2

    .line 225
    :cond_8
    :goto_4
    sget-object v1, Lz31;->a:Lz31;

    .line 226
    .line 227
    return-object v1
.end method
