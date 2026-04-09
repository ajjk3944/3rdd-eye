.class public final Lyw0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lpm;


# static fields
.field public static final h:Ljava/util/LinkedHashSet;

.field public static final i:Ljava/lang/Object;


# instance fields
.field public final a:Lve3;

.field public final b:Lf20;

.field public final c:Ljava/lang/String;

.field public final d:Loz0;

.field public final e:Lay0;

.field public f:Ljava/util/List;

.field public final g:Lmc2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyw0;->h:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyw0;->i:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lve3;Ljava/util/List;Lpz;Lqk;)V
    .locals 3

    .line 1
    sget-object p3, Lue3;->a:Lte3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lyw0;->a:Lve3;

    .line 7
    .line 8
    new-instance p1, Llw0;

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p1, p0, p3, v0}, Llw0;-><init>(Lyw0;Loj;I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lf20;

    .line 16
    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    invoke-direct {v1, v2, p1}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lyw0;->b:Lf20;

    .line 23
    .line 24
    const-string p1, ".tmp"

    .line 25
    .line 26
    iput-object p1, p0, Lyw0;->c:Ljava/lang/String;

    .line 27
    .line 28
    new-instance p1, Lnw0;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lnw0;-><init>(Lyw0;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Loz0;

    .line 34
    .line 35
    invoke-direct {v1, p1}, Loz0;-><init>(Lrx;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lyw0;->d:Loz0;

    .line 39
    .line 40
    new-instance p1, Lay0;

    .line 41
    .line 42
    sget-object v1, Lv31;->a:Lv31;

    .line 43
    .line 44
    invoke-direct {p1, v1}, Lay0;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lyw0;->e:Lay0;

    .line 48
    .line 49
    invoke-static {p2}, Lyf;->o0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lyw0;->f:Ljava/util/List;

    .line 54
    .line 55
    new-instance p1, Lmc2;

    .line 56
    .line 57
    new-instance p2, Lcu0;

    .line 58
    .line 59
    invoke-direct {p2, v0, p0}, Lcu0;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Llw0;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, p3, v1}, Llw0;-><init>(Lyw0;Loj;I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p4, p2, v0}, Lmc2;-><init>(Lqk;Lcu0;Llw0;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lyw0;->g:Lmc2;

    .line 72
    .line 73
    return-void
.end method

.method public static final a(Lyw0;Liw0;Lqj;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lwl2;->d:Lgs3;

    .line 2
    .line 3
    sget-object v1, Lwl2;->c:Lgs3;

    .line 4
    .line 5
    sget-object v2, Lwl2;->b:Lgs3;

    .line 6
    .line 7
    instance-of v3, p2, Low0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, p2

    .line 12
    check-cast v3, Low0;

    .line 13
    .line 14
    iget v4, v3, Low0;->n:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Low0;->n:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Low0;

    .line 27
    .line 28
    invoke-direct {v3, p0, p2}, Low0;-><init>(Lyw0;Lqj;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v3, Low0;->l:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, Low0;->n:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    sget-object v8, Lrk;->f:Lrk;

    .line 39
    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v7, :cond_1

    .line 43
    .line 44
    if-eq v4, v6, :cond_3

    .line 45
    .line 46
    if-ne v4, v5, :cond_2

    .line 47
    .line 48
    :cond_1
    iget-object p0, v3, Low0;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Llg;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_3
    iget-object p0, v3, Low0;->k:Lmg;

    .line 69
    .line 70
    iget-object p1, v3, Low0;->j:Lyw0;

    .line 71
    .line 72
    iget-object v4, v3, Low0;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Liw0;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    move-object p2, p0

    .line 80
    move-object p0, p1

    .line 81
    move-object p1, v4

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p1, Liw0;->b:Lmg;

    .line 87
    .line 88
    :try_start_2
    iget-object v4, p0, Lyw0;->e:Lay0;

    .line 89
    .line 90
    invoke-virtual {v4}, Lay0;->E()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Lyx0;

    .line 95
    .line 96
    instance-of v9, v4, Ljm;

    .line 97
    .line 98
    if-eqz v9, :cond_6

    .line 99
    .line 100
    iget-object v4, p1, Liw0;->a:Lmz0;

    .line 101
    .line 102
    iget-object p1, p1, Liw0;->d:Lhk;

    .line 103
    .line 104
    iput-object p2, v3, Low0;->i:Ljava/lang/Object;

    .line 105
    .line 106
    iput v7, v3, Low0;->n:I

    .line 107
    .line 108
    invoke-virtual {p0, v3, p1, v4}, Lyw0;->h(Lqj;Lhk;Lhy;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-ne p0, v8, :cond_5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move-object v10, p2

    .line 116
    move-object p2, p0

    .line 117
    move-object p0, v10

    .line 118
    goto :goto_5

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    move-object p0, p2

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    instance-of v9, v4, Lqn0;

    .line 123
    .line 124
    if-eqz v9, :cond_7

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    instance-of v7, v4, Lv31;

    .line 128
    .line 129
    :goto_1
    if-eqz v7, :cond_a

    .line 130
    .line 131
    iget-object v7, p1, Liw0;->c:Lyx0;

    .line 132
    .line 133
    if-ne v4, v7, :cond_9

    .line 134
    .line 135
    iput-object p1, v3, Low0;->i:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object p0, v3, Low0;->j:Lyw0;

    .line 138
    .line 139
    iput-object p2, v3, Low0;->k:Lmg;

    .line 140
    .line 141
    iput v6, v3, Low0;->n:I

    .line 142
    .line 143
    invoke-virtual {p0, v3}, Lyw0;->d(Lqj;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    if-ne v4, v8, :cond_8

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_8
    :goto_2
    iget-object v4, p1, Liw0;->a:Lmz0;

    .line 151
    .line 152
    iget-object p1, p1, Liw0;->d:Lhk;

    .line 153
    .line 154
    iput-object p2, v3, Low0;->i:Ljava/lang/Object;

    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    iput-object v6, v3, Low0;->j:Lyw0;

    .line 158
    .line 159
    iput-object v6, v3, Low0;->k:Lmg;

    .line 160
    .line 161
    iput v5, v3, Low0;->n:I

    .line 162
    .line 163
    invoke-virtual {p0, v3, p1, v4}, Lyw0;->h(Lqj;Lhk;Lhy;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    if-ne p0, v8, :cond_5

    .line 168
    .line 169
    :goto_3
    return-object v8

    .line 170
    :cond_9
    check-cast v4, Lqn0;

    .line 171
    .line 172
    iget-object p0, v4, Lqn0;->a:Ljava/lang/Throwable;

    .line 173
    .line 174
    throw p0

    .line 175
    :cond_a
    instance-of p0, v4, Lmu;

    .line 176
    .line 177
    if-eqz p0, :cond_b

    .line 178
    .line 179
    check-cast v4, Lmu;

    .line 180
    .line 181
    iget-object p0, v4, Lmu;->a:Ljava/lang/Throwable;

    .line 182
    .line 183
    throw p0

    .line 184
    :cond_b
    new-instance p0, Lrg;

    .line 185
    .line 186
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 187
    .line 188
    .line 189
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 190
    :goto_4
    invoke-static {p1}, Lbd2;->k(Ljava/lang/Throwable;)Liq0;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    :goto_5
    invoke-static {p2}, Ljq0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-nez p1, :cond_f

    .line 199
    .line 200
    move-object v3, p0

    .line 201
    check-cast v3, Lmg;

    .line 202
    .line 203
    :cond_c
    invoke-virtual {v3}, Lg40;->A()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {v3, p0, p2}, Lg40;->P(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    if-ne p0, v2, :cond_d

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_d
    if-ne p0, v1, :cond_e

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_e
    if-eq p0, v0, :cond_c

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_f
    check-cast p0, Lmg;

    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance p2, Lpg;

    .line 226
    .line 227
    const/4 v3, 0x0

    .line 228
    invoke-direct {p2, p1, v3}, Lpg;-><init>(Ljava/lang/Throwable;Z)V

    .line 229
    .line 230
    .line 231
    :cond_10
    invoke-virtual {p0}, Lg40;->A()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p0, p1, p2}, Lg40;->P(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-ne p1, v2, :cond_11

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_11
    if-ne p1, v1, :cond_12

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_12
    if-eq p1, v0, :cond_10

    .line 246
    .line 247
    :goto_6
    sget-object p0, Lz31;->a:Lz31;

    .line 248
    .line 249
    return-object p0
.end method


# virtual methods
.method public final b()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lyw0;->d:Loz0;

    .line 2
    .line 3
    invoke-virtual {v0}, Loz0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Lqj;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Lpw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lpw0;

    .line 7
    .line 8
    iget v1, v0, Lpw0;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpw0;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lpw0;-><init>(Lyw0;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lpw0;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpw0;->q:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lrk;->f:Lrk;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Lpw0;->l:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lqf0;

    .line 45
    .line 46
    iget-object v2, v0, Lpw0;->k:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast v2, Lzo0;

    .line 49
    .line 50
    iget-object v3, v0, Lpw0;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lcp0;

    .line 53
    .line 54
    iget-object v0, v0, Lpw0;->i:Lyw0;

    .line 55
    .line 56
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object v1, v0, Lpw0;->n:Ljava/util/Iterator;

    .line 70
    .line 71
    iget-object v6, v0, Lpw0;->m:Lrw0;

    .line 72
    .line 73
    iget-object v7, v0, Lpw0;->l:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v7, Lzo0;

    .line 76
    .line 77
    iget-object v8, v0, Lpw0;->k:Ljava/io/Serializable;

    .line 78
    .line 79
    check-cast v8, Lcp0;

    .line 80
    .line 81
    iget-object v9, v0, Lpw0;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v9, Lqf0;

    .line 84
    .line 85
    iget-object v10, v0, Lpw0;->i:Lyw0;

    .line 86
    .line 87
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_3
    iget-object v1, v0, Lpw0;->l:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lcp0;

    .line 95
    .line 96
    iget-object v6, v0, Lpw0;->k:Ljava/io/Serializable;

    .line 97
    .line 98
    check-cast v6, Lcp0;

    .line 99
    .line 100
    iget-object v7, v0, Lpw0;->j:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v7, Lqf0;

    .line 103
    .line 104
    iget-object v8, v0, Lpw0;->i:Lyw0;

    .line 105
    .line 106
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lyw0;->e:Lay0;

    .line 114
    .line 115
    invoke-virtual {p1}, Lay0;->E()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sget-object v6, Lv31;->a:Lv31;

    .line 120
    .line 121
    invoke-static {v1, v6}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_6

    .line 126
    .line 127
    invoke-virtual {p1}, Lay0;->E()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    instance-of p1, p1, Lqn0;

    .line 132
    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string v0, "Check failed."

    .line 139
    .line 140
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_6
    :goto_1
    new-instance v7, Ltf0;

    .line 145
    .line 146
    invoke-direct {v7}, Ltf0;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v1, Lcp0;

    .line 150
    .line 151
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object p0, v0, Lpw0;->i:Lyw0;

    .line 155
    .line 156
    iput-object v7, v0, Lpw0;->j:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v1, v0, Lpw0;->k:Ljava/io/Serializable;

    .line 159
    .line 160
    iput-object v1, v0, Lpw0;->l:Ljava/lang/Object;

    .line 161
    .line 162
    iput v4, v0, Lpw0;->q:I

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lyw0;->g(Lqj;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p1, v5, :cond_7

    .line 169
    .line 170
    goto/16 :goto_5

    .line 171
    .line 172
    :cond_7
    move-object v8, p0

    .line 173
    move-object v6, v1

    .line 174
    :goto_2
    iput-object p1, v1, Lcp0;->f:Ljava/lang/Object;

    .line 175
    .line 176
    new-instance p1, Lzo0;

    .line 177
    .line 178
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v1, Lrw0;

    .line 182
    .line 183
    invoke-direct {v1, v7, p1, v6, v8}, Lrw0;-><init>(Lqf0;Lzo0;Lcp0;Lyw0;)V

    .line 184
    .line 185
    .line 186
    iget-object v9, v8, Lyw0;->f:Ljava/util/List;

    .line 187
    .line 188
    if-nez v9, :cond_8

    .line 189
    .line 190
    move-object v3, v6

    .line 191
    move-object v9, v7

    .line 192
    move-object v7, p1

    .line 193
    move-object p1, v0

    .line 194
    move-object v0, v8

    .line 195
    goto :goto_4

    .line 196
    :cond_8
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    move-object v10, v8

    .line 201
    move-object v8, v6

    .line 202
    move-object v6, v1

    .line 203
    move-object v1, v9

    .line 204
    move-object v9, v7

    .line 205
    move-object v7, p1

    .line 206
    :cond_9
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_a

    .line 211
    .line 212
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Lhy;

    .line 217
    .line 218
    iput-object v10, v0, Lpw0;->i:Lyw0;

    .line 219
    .line 220
    iput-object v9, v0, Lpw0;->j:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v8, v0, Lpw0;->k:Ljava/io/Serializable;

    .line 223
    .line 224
    iput-object v7, v0, Lpw0;->l:Ljava/lang/Object;

    .line 225
    .line 226
    iput-object v6, v0, Lpw0;->m:Lrw0;

    .line 227
    .line 228
    iput-object v1, v0, Lpw0;->n:Ljava/util/Iterator;

    .line 229
    .line 230
    iput v3, v0, Lpw0;->q:I

    .line 231
    .line 232
    invoke-interface {p1, v6, v0}, Lhy;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-ne p1, v5, :cond_9

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_a
    move-object p1, v0

    .line 240
    move-object v3, v8

    .line 241
    move-object v0, v10

    .line 242
    :goto_4
    const/4 v1, 0x0

    .line 243
    iput-object v1, v0, Lyw0;->f:Ljava/util/List;

    .line 244
    .line 245
    iput-object v0, p1, Lpw0;->i:Lyw0;

    .line 246
    .line 247
    iput-object v3, p1, Lpw0;->j:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v7, p1, Lpw0;->k:Ljava/io/Serializable;

    .line 250
    .line 251
    iput-object v9, p1, Lpw0;->l:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v1, p1, Lpw0;->m:Lrw0;

    .line 254
    .line 255
    iput-object v1, p1, Lpw0;->n:Ljava/util/Iterator;

    .line 256
    .line 257
    iput v2, p1, Lpw0;->q:I

    .line 258
    .line 259
    move-object v1, v9

    .line 260
    check-cast v1, Ltf0;

    .line 261
    .line 262
    invoke-virtual {v1, p1}, Ltf0;->c(Lqj;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-ne p1, v5, :cond_b

    .line 267
    .line 268
    :goto_5
    return-object v5

    .line 269
    :cond_b
    move-object v2, v7

    .line 270
    :goto_6
    :try_start_0
    iput-boolean v4, v2, Lzo0;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    .line 272
    check-cast v1, Ltf0;

    .line 273
    .line 274
    invoke-virtual {v1}, Ltf0;->d()V

    .line 275
    .line 276
    .line 277
    iget-object p1, v0, Lyw0;->e:Lay0;

    .line 278
    .line 279
    new-instance v0, Ljm;

    .line 280
    .line 281
    iget-object v1, v3, Lcp0;->f:Ljava/lang/Object;

    .line 282
    .line 283
    if-eqz v1, :cond_c

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    goto :goto_7

    .line 290
    :cond_c
    const/4 v2, 0x0

    .line 291
    :goto_7
    invoke-direct {v0, v2, v1}, Ljm;-><init>(ILjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, v0}, Lay0;->F(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    sget-object p1, Lz31;->a:Lz31;

    .line 298
    .line 299
    return-object p1

    .line 300
    :catchall_0
    move-exception p1

    .line 301
    check-cast v1, Ltf0;

    .line 302
    .line 303
    invoke-virtual {v1}, Ltf0;->d()V

    .line 304
    .line 305
    .line 306
    throw p1
.end method

.method public final d(Lqj;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lsw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lsw0;

    .line 7
    .line 8
    iget v1, v0, Lsw0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsw0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lsw0;-><init>(Lyw0;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lsw0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsw0;->l:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lsw0;->i:Lyw0;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iput-object p0, v0, Lsw0;->i:Lyw0;

    .line 54
    .line 55
    iput v2, v0, Lsw0;->l:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lyw0;->c(Lqj;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    sget-object v0, Lrk;->f:Lrk;

    .line 62
    .line 63
    if-ne p1, v0, :cond_3

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_3
    :goto_1
    sget-object p1, Lz31;->a:Lz31;

    .line 67
    .line 68
    return-object p1

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    move-object v0, p0

    .line 71
    :goto_2
    iget-object v0, v0, Lyw0;->e:Lay0;

    .line 72
    .line 73
    new-instance v1, Lqn0;

    .line 74
    .line 75
    invoke-direct {v1, p1}, Lqn0;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lay0;->F(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public final e(Lqj;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Ltw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ltw0;

    .line 7
    .line 8
    iget v1, v0, Ltw0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ltw0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ltw0;-><init>(Lyw0;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ltw0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ltw0;->l:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Ltw0;->i:Lyw0;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iput-object p0, v0, Ltw0;->i:Lyw0;

    .line 54
    .line 55
    iput v2, v0, Ltw0;->l:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lyw0;->c(Lqj;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    sget-object v0, Lrk;->f:Lrk;

    .line 62
    .line 63
    if-ne p1, v0, :cond_3

    .line 64
    .line 65
    return-object v0

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    move-object v0, p0

    .line 68
    :goto_1
    iget-object v0, v0, Lyw0;->e:Lay0;

    .line 69
    .line 70
    new-instance v1, Lqn0;

    .line 71
    .line 72
    invoke-direct {v1, p1}, Lqn0;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lay0;->F(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_2
    sget-object p1, Lz31;->a:Lz31;

    .line 79
    .line 80
    return-object p1
.end method

.method public final f(Lqj;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Luw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Luw0;

    .line 7
    .line 8
    iget v1, v0, Luw0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luw0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Luw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Luw0;-><init>(Lyw0;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Luw0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Luw0;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object v1, v0, Luw0;->j:Ljava/io/FileInputStream;

    .line 35
    .line 36
    iget-object v0, v0, Luw0;->i:Lyw0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_4

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    new-instance v1, Ljava/io/FileInputStream;

    .line 56
    .line 57
    invoke-virtual {p0}, Lyw0;->b()Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 62
    .line 63
    .line 64
    :try_start_2
    sget-object p1, Lue3;->a:Lte3;

    .line 65
    .line 66
    iput-object p0, v0, Luw0;->i:Lyw0;

    .line 67
    .line 68
    iput-object v1, v0, Luw0;->j:Ljava/io/FileInputStream;

    .line 69
    .line 70
    iput v2, v0, Luw0;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    :try_start_3
    invoke-static {v1}, Lte3;->C(Ljava/io/FileInputStream;)Lte3;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 76
    goto :goto_1

    .line 77
    :catch_0
    :try_start_4
    sget-object p1, Lue3;->a:Lte3;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 78
    .line 79
    :goto_1
    sget-object v0, Lrk;->f:Lrk;

    .line 80
    .line 81
    if-ne p1, v0, :cond_3

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_3
    move-object v0, p0

    .line 85
    :goto_2
    const/4 v2, 0x0

    .line 86
    :try_start_5
    invoke-static {v1, v2}, Lyc0;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :catch_1
    move-exception p1

    .line 91
    goto :goto_5

    .line 92
    :goto_3
    move-object v0, p0

    .line 93
    goto :goto_4

    .line 94
    :catchall_1
    move-exception p1

    .line 95
    goto :goto_3

    .line 96
    :goto_4
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 97
    :catchall_2
    move-exception v2

    .line 98
    :try_start_7
    invoke-static {v1, p1}, Lyc0;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw v2
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1

    .line 102
    :catch_2
    move-exception p1

    .line 103
    move-object v0, p0

    .line 104
    :goto_5
    invoke-virtual {v0}, Lyw0;->b()Ljava/io/File;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    sget-object p1, Lue3;->a:Lte3;

    .line 115
    .line 116
    sget-object p1, Lue3;->a:Lte3;

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_4
    throw p1
.end method

.method public final g(Lqj;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lvw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lvw0;

    .line 7
    .line 8
    iget v1, v0, Lvw0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvw0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lvw0;-><init>(Lyw0;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lvw0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvw0;->m:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    sget-object v3, Lrk;->f:Lrk;

    .line 31
    .line 32
    if-eqz v1, :cond_7

    .line 33
    .line 34
    if-eq v1, v2, :cond_6

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    const/4 v4, 0x3

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eq v1, v2, :cond_3

    .line 40
    .line 41
    if-ne v1, v4, :cond_2

    .line 42
    .line 43
    iget-object v1, v0, Lvw0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, v0, Lvw0;->i:Lyw0;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    iget-object v1, v0, Lvw0;->j:Ljava/lang/Object;

    .line 70
    .line 71
    if-nez v1, :cond_5

    .line 72
    .line 73
    iget-object v1, v0, Lvw0;->i:Lyw0;

    .line 74
    .line 75
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :try_start_1
    iput-object v5, v0, Lvw0;->i:Lyw0;

    .line 79
    .line 80
    iput-object p1, v0, Lvw0;->j:Ljava/lang/Object;

    .line 81
    .line 82
    iput v4, v0, Lvw0;->m:I

    .line 83
    .line 84
    invoke-virtual {v1, v0, p1}, Lyw0;->j(Lqj;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    if-ne v0, v3, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    return-object p1

    .line 92
    :goto_1
    invoke-static {v5, p1}, Lgi2;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw v5

    .line 96
    :cond_5
    new-instance p1, Ljava/lang/ClassCastException;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_6
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_7
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iput-object p0, v0, Lvw0;->i:Lyw0;

    .line 110
    .line 111
    iput v2, v0, Lvw0;->m:I

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Lyw0;->f(Lqj;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v3, :cond_8

    .line 118
    .line 119
    :goto_2
    return-object v3

    .line 120
    :cond_8
    return-object p1
.end method

.method public final h(Lqj;Lhk;Lhy;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lww0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lww0;

    .line 7
    .line 8
    iget v1, v0, Lww0;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lww0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lww0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lww0;-><init>(Lyw0;Lqj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lww0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lww0;->n:I

    .line 28
    .line 29
    const-string v2, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    sget-object v7, Lrk;->f:Lrk;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v6, :cond_2

    .line 40
    .line 41
    if-ne v1, v5, :cond_1

    .line 42
    .line 43
    iget-object p2, v0, Lww0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p3, v0, Lww0;->i:Lyw0;

    .line 46
    .line 47
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p2, v0, Lww0;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p3, v0, Lww0;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p3, Ljm;

    .line 65
    .line 66
    iget-object v1, v0, Lww0;->i:Lyw0;

    .line 67
    .line 68
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lyw0;->e:Lay0;

    .line 76
    .line 77
    invoke-virtual {p1}, Lay0;->E()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljm;

    .line 82
    .line 83
    iget-object v1, p1, Ljm;->a:Ljava/lang/Object;

    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move v1, v3

    .line 93
    :goto_1
    iget v8, p1, Ljm;->b:I

    .line 94
    .line 95
    if-ne v1, v8, :cond_b

    .line 96
    .line 97
    iget-object v1, p1, Ljm;->a:Ljava/lang/Object;

    .line 98
    .line 99
    new-instance v8, Lkm;

    .line 100
    .line 101
    invoke-direct {v8, p3, v1, v4}, Lkm;-><init>(Lhy;Ljava/lang/Object;Loj;)V

    .line 102
    .line 103
    .line 104
    iput-object p0, v0, Lww0;->i:Lyw0;

    .line 105
    .line 106
    iput-object p1, v0, Lww0;->j:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v1, v0, Lww0;->k:Ljava/lang/Object;

    .line 109
    .line 110
    iput v6, v0, Lww0;->n:I

    .line 111
    .line 112
    invoke-static {v0, p2, v8}, Lgi2;->A(Lqj;Lhk;Lhy;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-ne p2, v7, :cond_5

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    move-object p3, p1

    .line 120
    move-object p1, p2

    .line 121
    move-object p2, v1

    .line 122
    move-object v1, p0

    .line 123
    :goto_2
    iget-object v6, p3, Ljm;->a:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move v6, v3

    .line 133
    :goto_3
    iget p3, p3, Ljm;->b:I

    .line 134
    .line 135
    if-ne v6, p3, :cond_a

    .line 136
    .line 137
    invoke-static {p2, p1}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    if-eqz p3, :cond_7

    .line 142
    .line 143
    return-object p2

    .line 144
    :cond_7
    iput-object v1, v0, Lww0;->i:Lyw0;

    .line 145
    .line 146
    iput-object p1, v0, Lww0;->j:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v4, v0, Lww0;->k:Ljava/lang/Object;

    .line 149
    .line 150
    iput v5, v0, Lww0;->n:I

    .line 151
    .line 152
    invoke-virtual {v1, v0, p1}, Lyw0;->j(Lqj;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    if-ne p2, v7, :cond_8

    .line 157
    .line 158
    :goto_4
    return-object v7

    .line 159
    :cond_8
    move-object p2, p1

    .line 160
    move-object p3, v1

    .line 161
    :goto_5
    iget-object p1, p3, Lyw0;->e:Lay0;

    .line 162
    .line 163
    new-instance p3, Ljm;

    .line 164
    .line 165
    if-eqz p2, :cond_9

    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    :cond_9
    invoke-direct {p3, v3, p2}, Ljm;-><init>(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p3}, Lay0;->F(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-object p2

    .line 178
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 185
    .line 186
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
.end method

.method public final i(Lhy;Lqj;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lmg;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lg40;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lg40;->D(Lw30;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lyw0;->e:Lay0;

    .line 12
    .line 13
    invoke-virtual {v1}, Lay0;->E()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lyx0;

    .line 18
    .line 19
    new-instance v2, Liw0;

    .line 20
    .line 21
    invoke-interface {p2}, Loj;->getContext()Lhk;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-direct {v2, p1, v0, v1, v3}, Liw0;-><init>(Lhy;Lmg;Lyx0;Lhk;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lyw0;->g:Lmc2;

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Lmc2;->f(Ljw0;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0}, Lg40;->A()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    instance-of v1, p1, Ll20;

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    instance-of p2, p1, Lpg;

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    invoke-static {p1}, Lwl2;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    check-cast p1, Lpg;

    .line 51
    .line 52
    iget-object p1, p1, Lpg;->a:Ljava/lang/Throwable;

    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-virtual {v0, p1}, Lg40;->N(Ljava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-ltz p1, :cond_0

    .line 60
    .line 61
    new-instance p1, Lc40;

    .line 62
    .line 63
    invoke-static {p2}, Luk2;->r(Loj;)Loj;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-direct {p1, p2, v0}, Lc40;-><init>(Loj;Lmg;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lkd;->u()V

    .line 71
    .line 72
    .line 73
    new-instance p2, Llp;

    .line 74
    .line 75
    const/4 v1, 0x2

    .line 76
    invoke-direct {p2, v1, p1}, Llp;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x3

    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-static {v0, v2, p2, v1}, Lwl2;->o(Lw30;ZLb40;I)Ljp;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    new-instance v0, Lkp;

    .line 86
    .line 87
    invoke-direct {v0, p2}, Lkp;-><init>(Ljp;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Lkd;->w(Lrh0;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lkd;->t()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_0
    return-object p1
.end method

.method public final j(Lqj;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "Unable to rename "

    .line 2
    .line 3
    instance-of v1, p1, Lxw0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lxw0;

    .line 9
    .line 10
    iget v2, v1, Lxw0;->o:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lxw0;->o:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lxw0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lxw0;-><init>(Lyw0;Lqj;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lxw0;->m:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Lxw0;->o:I

    .line 30
    .line 31
    sget-object v3, Lz31;->a:Lz31;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget-object p2, v1, Lxw0;->l:Ljava/io/FileOutputStream;

    .line 39
    .line 40
    iget-object v2, v1, Lxw0;->k:Ljava/io/FileOutputStream;

    .line 41
    .line 42
    iget-object v4, v1, Lxw0;->j:Ljava/io/File;

    .line 43
    .line 44
    iget-object v1, v1, Lxw0;->i:Lyw0;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lyw0;->b()Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_7

    .line 87
    .line 88
    :goto_1
    new-instance p1, Ljava/io/File;

    .line 89
    .line 90
    invoke-virtual {p0}, Lyw0;->b()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-instance v5, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Lyw0;->c:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    .line 119
    .line 120
    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    .line 122
    .line 123
    :try_start_2
    sget-object v5, Lue3;->a:Lte3;

    .line 124
    .line 125
    new-instance v5, Lkw0;

    .line 126
    .line 127
    invoke-direct {v5, v2}, Lkw0;-><init>(Ljava/io/FileOutputStream;)V

    .line 128
    .line 129
    .line 130
    iput-object p0, v1, Lxw0;->i:Lyw0;

    .line 131
    .line 132
    iput-object p1, v1, Lxw0;->j:Ljava/io/File;

    .line 133
    .line 134
    iput-object v2, v1, Lxw0;->k:Ljava/io/FileOutputStream;

    .line 135
    .line 136
    iput-object v2, v1, Lxw0;->l:Ljava/io/FileOutputStream;

    .line 137
    .line 138
    iput v4, v1, Lxw0;->o:I

    .line 139
    .line 140
    check-cast p2, Lte3;

    .line 141
    .line 142
    invoke-virtual {p2, v5}, Ls44;->c(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 143
    .line 144
    .line 145
    sget-object p2, Lrk;->f:Lrk;

    .line 146
    .line 147
    if-ne v3, p2, :cond_4

    .line 148
    .line 149
    return-object p2

    .line 150
    :cond_4
    move-object v1, p0

    .line 151
    move-object v4, p1

    .line 152
    move-object p2, v2

    .line 153
    :goto_2
    :try_start_3
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    .line 159
    .line 160
    const/4 p1, 0x0

    .line 161
    :try_start_4
    invoke-static {v2, p1}, Lyc0;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Lyw0;->b()Ljava/io/File;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {v4, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_5

    .line 173
    .line 174
    return-object v3

    .line 175
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 176
    .line 177
    new-instance p2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    .line 186
    .line 187
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 198
    :catch_0
    move-exception p1

    .line 199
    goto :goto_5

    .line 200
    :goto_3
    move-object v4, p1

    .line 201
    move-object p1, p2

    .line 202
    goto :goto_4

    .line 203
    :catchall_1
    move-exception p2

    .line 204
    goto :goto_3

    .line 205
    :goto_4
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 206
    :catchall_2
    move-exception p2

    .line 207
    :try_start_6
    invoke-static {v2, p1}, Lyc0;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw p2
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 211
    :catch_1
    move-exception p2

    .line 212
    move-object v4, p1

    .line 213
    move-object p1, p2

    .line 214
    :goto_5
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_6

    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 221
    .line 222
    .line 223
    :cond_6
    throw p1

    .line 224
    :cond_7
    new-instance p2, Ljava/io/IOException;

    .line 225
    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v1, "Unable to create parent directories of "

    .line 229
    .line 230
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw p2
.end method
