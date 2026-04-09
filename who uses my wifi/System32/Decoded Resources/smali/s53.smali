.class public final Ls53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/Set;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Lda3;

.field public final e:Lmv2;

.field public f:J

.field public g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lld2;Ljava/util/Set;Lda3;Lmv2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Ls53;->f:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Ls53;->g:I

    .line 10
    .line 11
    iput-object p1, p0, Ls53;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Ls53;->c:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    iput-object p3, p0, Ls53;->b:Ljava/util/Set;

    .line 16
    .line 17
    iput-object p4, p0, Ls53;->d:Lda3;

    .line 18
    .line 19
    iput-object p5, p0, Ls53;->e:Lmv2;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Landroid/os/Bundle;Z)Lcq3;
    .locals 13

    .line 1
    move-object v6, p2

    .line 2
    iget-object v0, p0, Ls53;->a:Landroid/content/Context;

    .line 3
    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    invoke-static {v0, v2}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    invoke-interface {v7}, Laa3;->a()Laa3;

    .line 11
    .line 12
    .line 13
    new-instance v8, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v0, p0, Ls53;->b:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v3, Lmz1;->yc:Liz1;

    .line 30
    .line 31
    sget-object v4, Ltw1;->e:Ltw1;

    .line 32
    .line 33
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 34
    .line 35
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 36
    .line 37
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    const-string v3, ","

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_0
    move-object v9, v2

    .line 66
    sget-object v2, Lhg4;->C:Lhg4;

    .line 67
    .line 68
    iget-object v3, v2, Lhg4;->k:Lym;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v10

    .line 77
    iput-wide v10, p0, Ls53;->f:J

    .line 78
    .line 79
    new-instance v5, Landroid/os/Bundle;

    .line 80
    .line 81
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object v3, Lmz1;->m2:Liz1;

    .line 85
    .line 86
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    if-eqz v6, :cond_2

    .line 99
    .line 100
    iget-object v2, v2, Lhg4;->k:Lym;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    instance-of v4, p1, Ljm2;

    .line 110
    .line 111
    if-eqz v4, :cond_1

    .line 112
    .line 113
    const-string v4, "client-signals-start"

    .line 114
    .line 115
    invoke-virtual {p2, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const-string v4, "gms-signals-start"

    .line 120
    .line 121
    invoke-virtual {p2, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 122
    .line 123
    .line 124
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    :cond_3
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v4, v0

    .line 139
    check-cast v4, Lq53;

    .line 140
    .line 141
    invoke-interface {v4}, Lq53;->d()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v9, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_3

    .line 154
    .line 155
    sget-object v0, Lhg4;->C:Lhg4;

    .line 156
    .line 157
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    invoke-interface {v4}, Lq53;->a()Ln70;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    new-instance v0, Lef2;

    .line 171
    .line 172
    move-object v1, p0

    .line 173
    invoke-direct/range {v0 .. v5}, Lef2;-><init>(Ls53;JLq53;Landroid/os/Bundle;)V

    .line 174
    .line 175
    .line 176
    sget-object v1, Lmd2;->g:Lld2;

    .line 177
    .line 178
    invoke-interface {v12, v0, v1}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_4
    invoke-static {v8}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    new-instance v0, Lr53;

    .line 190
    .line 191
    move-object v2, p1

    .line 192
    move/from16 v3, p3

    .line 193
    .line 194
    move-object v4, v6

    .line 195
    move-object v1, v8

    .line 196
    invoke-direct/range {v0 .. v5}, Lr53;-><init>(Ljava/util/ArrayList;Ljava/lang/Object;ZLandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 197
    .line 198
    .line 199
    new-instance v1, Lcq3;

    .line 200
    .line 201
    const/4 v2, 0x1

    .line 202
    const/4 v3, 0x0

    .line 203
    invoke-direct {v1, v9, v2, v3}, Ltp3;-><init>(Ltm3;ZZ)V

    .line 204
    .line 205
    .line 206
    new-instance v2, Lbq3;

    .line 207
    .line 208
    iget-object v4, p0, Ls53;->c:Ljava/util/concurrent/Executor;

    .line 209
    .line 210
    invoke-direct {v2, v1, v0, v4}, Lbq3;-><init>(Lcq3;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 211
    .line 212
    .line 213
    iput-object v2, v1, Lcq3;->u:Lbq3;

    .line 214
    .line 215
    invoke-virtual {v1}, Ltp3;->v()V

    .line 216
    .line 217
    .line 218
    invoke-static {}, Lea3;->a()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_5

    .line 223
    .line 224
    iget-object v0, p0, Ls53;->d:Lda3;

    .line 225
    .line 226
    invoke-static {v1, v0, v7, v3}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 227
    .line 228
    .line 229
    :cond_5
    return-object v1
.end method
