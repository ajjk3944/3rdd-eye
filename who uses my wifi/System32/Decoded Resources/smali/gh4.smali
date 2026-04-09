.class public final Lgh4;
.super Lxg4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final k:Lpg4;

.field public final l:Z

.field public final m:Lez1;

.field public final n:Lsw1;

.field public o:Leh4;

.field public p:Ldh4;

.field public q:Z

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lpg4;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxg4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgh4;->k:Lpg4;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lpg4;->e()V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    :goto_0
    iput-boolean p2, p0, Lgh4;->l:Z

    .line 15
    .line 16
    new-instance p2, Lez1;

    .line 17
    .line 18
    invoke-direct {p2}, Lez1;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lgh4;->m:Lez1;

    .line 22
    .line 23
    new-instance p2, Lsw1;

    .line 24
    .line 25
    invoke-direct {p2}, Lsw1;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lgh4;->n:Lsw1;

    .line 29
    .line 30
    invoke-virtual {p1}, Lpg4;->d()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lpg4;->f()Lfk1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p2, Leh4;

    .line 38
    .line 39
    new-instance v0, Lfh4;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lfh4;-><init>(Lfk1;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lez1;->m:Ljava/lang/Object;

    .line 45
    .line 46
    sget-object v1, Leh4;->e:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {p2, v0, p1, v1}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lgh4;->o:Leh4;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(Lfk1;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lgh4;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lgh4;->o:Leh4;

    .line 6
    .line 7
    new-instance v1, Lhc4;

    .line 8
    .line 9
    iget-object v2, p0, Lgh4;->o:Leh4;

    .line 10
    .line 11
    iget-object v2, v2, Lah4;->b:Loz1;

    .line 12
    .line 13
    invoke-direct {v1, v2, p1}, Lhc4;-><init>(Loz1;Lfk1;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Leh4;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v0, v0, Leh4;->d:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v3, Leh4;

    .line 21
    .line 22
    invoke-direct {v3, v1, v2, v0}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lgh4;->o:Leh4;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Leh4;

    .line 29
    .line 30
    new-instance v1, Lfh4;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lfh4;-><init>(Lfk1;)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Lez1;->m:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v3, Leh4;->e:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v0, v1, v2, v3}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lgh4;->o:Leh4;

    .line 43
    .line 44
    :goto_0
    iget-object v0, p0, Lgh4;->k:Lpg4;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lpg4;->a(Lfk1;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final b(Ljh4;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ldh4;

    .line 3
    .line 4
    iget-object v1, v0, Ldh4;->j:Ljh4;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Ldh4;->i:Lpg4;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lpg4;->b(Ljh4;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lgh4;->p:Ldh4;

    .line 17
    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lgh4;->p:Ldh4;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final bridge synthetic c(Lkh4;Lrj4;J)Ljh4;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lgh4;->x(Lkh4;Lrj4;J)Ldh4;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgh4;->k:Lpg4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpg4;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgh4;->k:Lpg4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpg4;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()Lfk1;
    .locals 1

    .line 1
    iget-object v0, p0, Lgh4;->k:Lpg4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpg4;->f()Lfk1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h(Lws3;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lxg4;->j:Lws3;

    .line 2
    .line 3
    sget-object p1, Lv23;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lxg4;->i:Landroid/os/Handler;

    .line 19
    .line 20
    iget-boolean p1, p0, Lgh4;->l:Z

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lgh4;->q:Z

    .line 26
    .line 27
    iget-object p1, p0, Lgh4;->k:Lpg4;

    .line 28
    .line 29
    invoke-virtual {p0, v1, p1}, Lxg4;->t(Ljava/lang/Integer;Lpg4;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lgh4;->r:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lgh4;->q:Z

    .line 5
    .line 6
    invoke-super {p0}, Lxg4;->j()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s(Ljava/lang/Object;Lpg4;Loz1;)V
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-boolean p1, p0, Lgh4;->r:Z

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lgh4;->o:Leh4;

    .line 9
    .line 10
    iget-object v0, p1, Leh4;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p1, p1, Leh4;->d:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v1, Leh4;

    .line 15
    .line 16
    invoke-direct {v1, p3, v0, p1}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lgh4;->o:Leh4;

    .line 20
    .line 21
    iget-object p1, p0, Lgh4;->p:Ldh4;

    .line 22
    .line 23
    if-eqz p1, :cond_6

    .line 24
    .line 25
    iget-wide v0, p1, Ldh4;->l:J

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1}, Lgh4;->y(J)Z

    .line 28
    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p3}, Loz1;->g()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-boolean p1, p0, Lgh4;->s:Z

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lgh4;->o:Leh4;

    .line 43
    .line 44
    iget-object v0, p1, Leh4;->c:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object p1, p1, Leh4;->d:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance v1, Leh4;

    .line 49
    .line 50
    invoke-direct {v1, p3, v0, p1}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget-object p1, Lez1;->m:Ljava/lang/Object;

    .line 55
    .line 56
    sget-object v0, Leh4;->e:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance v1, Leh4;

    .line 59
    .line 60
    invoke-direct {v1, p3, p1, v0}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iput-object v1, p0, Lgh4;->o:Leh4;

    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :cond_2
    const/4 p1, 0x0

    .line 68
    iget-object v1, p0, Lgh4;->m:Lez1;

    .line 69
    .line 70
    const-wide/16 v2, 0x0

    .line 71
    .line 72
    invoke-virtual {p3, p1, v1, v2, v3}, Loz1;->b(ILez1;J)Lez1;

    .line 73
    .line 74
    .line 75
    iget-object v6, v1, Lez1;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v0, p0, Lgh4;->p:Ldh4;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    iget-wide v4, v0, Ldh4;->g:J

    .line 82
    .line 83
    iget-object v7, p0, Lgh4;->o:Leh4;

    .line 84
    .line 85
    iget-object v0, v0, Ldh4;->f:Lkh4;

    .line 86
    .line 87
    iget-object v0, v0, Lkh4;->a:Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v8, p0, Lgh4;->n:Lsw1;

    .line 90
    .line 91
    invoke-virtual {v7, v0, v8}, Loz1;->o(Ljava/lang/Object;Lsw1;)Lsw1;

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lgh4;->o:Leh4;

    .line 95
    .line 96
    invoke-virtual {v0, p1, v1, v2, v3}, Leh4;->b(ILez1;J)Lez1;

    .line 97
    .line 98
    .line 99
    cmp-long p1, v4, v2

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move-wide v4, v2

    .line 105
    :goto_1
    iget-object v2, p0, Lgh4;->n:Lsw1;

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    move-object v0, p3

    .line 109
    invoke-virtual/range {v0 .. v5}, Loz1;->m(Lez1;Lsw1;IJ)Landroid/util/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p3, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 114
    .line 115
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    iget-boolean p1, p0, Lgh4;->s:Z

    .line 124
    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    iget-object p1, p0, Lgh4;->o:Leh4;

    .line 128
    .line 129
    iget-object p3, p1, Leh4;->c:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object p1, p1, Leh4;->d:Ljava/lang/Object;

    .line 132
    .line 133
    new-instance v3, Leh4;

    .line 134
    .line 135
    invoke-direct {v3, v0, p3, p1}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    new-instance v3, Leh4;

    .line 140
    .line 141
    invoke-direct {v3, v0, v6, p3}, Leh4;-><init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    iput-object v3, p0, Lgh4;->o:Leh4;

    .line 145
    .line 146
    iget-object p1, p0, Lgh4;->p:Ldh4;

    .line 147
    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    invoke-virtual {p0, v1, v2}, Lgh4;->y(J)Z

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    if-eqz p3, :cond_6

    .line 155
    .line 156
    iget-object p1, p1, Ldh4;->f:Lkh4;

    .line 157
    .line 158
    iget-object p2, p1, Lkh4;->a:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object p3, p0, Lgh4;->o:Leh4;

    .line 161
    .line 162
    iget-object p3, p3, Leh4;->d:Ljava/lang/Object;

    .line 163
    .line 164
    if-eqz p3, :cond_5

    .line 165
    .line 166
    sget-object p3, Leh4;->e:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_5

    .line 173
    .line 174
    iget-object p2, p0, Lgh4;->o:Leh4;

    .line 175
    .line 176
    iget-object p2, p2, Leh4;->d:Ljava/lang/Object;

    .line 177
    .line 178
    :cond_5
    invoke-virtual {p1, p2}, Lkh4;->a(Ljava/lang/Object;)Lkh4;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    :cond_6
    :goto_3
    const/4 p1, 0x1

    .line 183
    iput-boolean p1, p0, Lgh4;->s:Z

    .line 184
    .line 185
    iput-boolean p1, p0, Lgh4;->r:Z

    .line 186
    .line 187
    iget-object p1, p0, Lgh4;->o:Leh4;

    .line 188
    .line 189
    invoke-virtual {p0, p1}, Lpg4;->k(Loz1;)V

    .line 190
    .line 191
    .line 192
    if-eqz p2, :cond_7

    .line 193
    .line 194
    iget-object p1, p0, Lgh4;->p:Ldh4;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, p2}, Ldh4;->n(Lkh4;)V

    .line 200
    .line 201
    .line 202
    :cond_7
    return-void
.end method

.method public final bridge synthetic u(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    return-void
.end method

.method public final v(Ljava/lang/Object;Lkh4;)Lkh4;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, Lgh4;->o:Leh4;

    .line 4
    .line 5
    iget-object p1, p1, Leh4;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v0, p2, Lkh4;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object v0, Leh4;->e:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p2, v0}, Lkh4;->a(Ljava/lang/Object;)Lkh4;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public final synthetic w(JLjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Ljava/lang/Void;

    .line 2
    .line 3
    return-void
.end method

.method public final x(Lkh4;Lrj4;J)Ldh4;
    .locals 1

    .line 1
    new-instance v0, Ldh4;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Ldh4;-><init>(Lkh4;Lrj4;J)V

    .line 4
    .line 5
    .line 6
    iget-object p2, v0, Ldh4;->i:Lpg4;

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    move p2, p3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    :goto_0
    invoke-static {p2}, Lzt0;->b0(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lgh4;->k:Lpg4;

    .line 18
    .line 19
    iput-object p2, v0, Ldh4;->i:Lpg4;

    .line 20
    .line 21
    iget-boolean p4, p0, Lgh4;->r:Z

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    iget-object p2, p1, Lkh4;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object p3, p0, Lgh4;->o:Leh4;

    .line 28
    .line 29
    iget-object p3, p3, Leh4;->d:Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    sget-object p3, Leh4;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lgh4;->o:Leh4;

    .line 42
    .line 43
    iget-object p2, p2, Leh4;->d:Ljava/lang/Object;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1, p2}, Lkh4;->a(Ljava/lang/Object;)Lkh4;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Ldh4;->n(Lkh4;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    iput-object v0, p0, Lgh4;->p:Ldh4;

    .line 54
    .line 55
    iget-boolean p1, p0, Lgh4;->q:Z

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iput-boolean p3, p0, Lgh4;->q:Z

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-virtual {p0, p1, p2}, Lxg4;->t(Ljava/lang/Integer;Lpg4;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-object v0
.end method

.method public final y(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lgh4;->p:Ldh4;

    .line 2
    .line 3
    iget-object v1, p0, Lgh4;->o:Leh4;

    .line 4
    .line 5
    iget-object v2, v0, Ldh4;->f:Lkh4;

    .line 6
    .line 7
    iget-object v2, v2, Lkh4;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Leh4;->e(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    return v3

    .line 18
    :cond_0
    iget-object v2, p0, Lgh4;->o:Leh4;

    .line 19
    .line 20
    iget-object v4, p0, Lgh4;->n:Lsw1;

    .line 21
    .line 22
    invoke-virtual {v2, v1, v4, v3}, Leh4;->d(ILsw1;Z)Lsw1;

    .line 23
    .line 24
    .line 25
    iget-wide v1, v4, Lsw1;->d:J

    .line 26
    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v3, v1, v3

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    cmp-long v3, p1, v1

    .line 37
    .line 38
    if-ltz v3, :cond_1

    .line 39
    .line 40
    const-wide/16 p1, -0x1

    .line 41
    .line 42
    add-long/2addr v1, p1

    .line 43
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    :cond_1
    iput-wide p1, v0, Ldh4;->l:J

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1
.end method
