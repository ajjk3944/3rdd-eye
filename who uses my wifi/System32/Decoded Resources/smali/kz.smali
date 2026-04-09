.class public final synthetic Lkz;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Luh;


# instance fields
.field public final synthetic f:Li5;

.field public final synthetic g:Lmz;


# direct methods
.method public synthetic constructor <init>(Li5;Lmz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkz;->f:Li5;

    .line 5
    .line 6
    iput-object p2, p0, Lkz;->g:Lmz;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 15

    .line 1
    new-instance v0, Llz;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lkz;->g:Lmz;

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Llz;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lkz;->f:Li5;

    .line 10
    .line 11
    invoke-static {v1}, Lgi1;->c(Landroid/content/Context;)Lgi1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v2, v2, Lgi1;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lls2;

    .line 18
    .line 19
    invoke-virtual {v2}, Lls2;->a()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lva4;

    .line 24
    .line 25
    invoke-virtual {v2}, Lva4;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Llz;->a(Lbw;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-static {v1}, Lgi1;->c(Landroid/content/Context;)Lgi1;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v2, v2, Lgi1;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lls2;

    .line 43
    .line 44
    invoke-virtual {v2}, Lls2;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lz42;

    .line 49
    .line 50
    invoke-static {}, Lok2;->a()V

    .line 51
    .line 52
    .line 53
    new-instance v3, Lvq2;

    .line 54
    .line 55
    const/16 v4, 0x17

    .line 56
    .line 57
    invoke-direct {v3, v1, v0, v4}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lof3;

    .line 61
    .line 62
    const/16 v4, 0xc

    .line 63
    .line 64
    invoke-direct {v1, v4, v0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lok2;->a()V

    .line 71
    .line 72
    .line 73
    iget-object v0, v2, Lz42;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lz52;

    .line 80
    .line 81
    if-nez v0, :cond_1

    .line 82
    .line 83
    new-instance v0, Lah3;

    .line 84
    .line 85
    const/4 v2, 0x3

    .line 86
    const-string v3, "No available form can be built."

    .line 87
    .line 88
    invoke-direct {v0, v3, v2}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lah3;->a()Lbw;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v1, v0}, Lof3;->j(Lbw;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    iget-object v2, v2, Lz42;->a:Lzs1;

    .line 100
    .line 101
    invoke-virtual {v2}, Lzs1;->a()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lf20;

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v2, v2, Lf20;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Lgi1;

    .line 113
    .line 114
    iget-object v4, v2, Lgi1;->g:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, Lax0;

    .line 117
    .line 118
    new-instance v5, Lvg0;

    .line 119
    .line 120
    const/16 v6, 0x10

    .line 121
    .line 122
    invoke-direct {v5, v6, v4}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v5}, Lls2;->b(Lws2;)Lls2;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    new-instance v4, Lax0;

    .line 130
    .line 131
    invoke-direct {v4, v0}, Lax0;-><init>(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v12, Lzs1;

    .line 135
    .line 136
    const/16 v0, 0x14

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-direct {v12, v0, v5}, Lzs1;-><init>(IZ)V

    .line 140
    .line 141
    .line 142
    iget-object v0, v2, Lgi1;->g:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v8, v0

    .line 145
    check-cast v8, Lax0;

    .line 146
    .line 147
    iget-object v0, v2, Lgi1;->k:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v10, v0

    .line 150
    check-cast v10, Lls2;

    .line 151
    .line 152
    iget-object v0, v2, Lgi1;->m:Ljava/lang/Object;

    .line 153
    .line 154
    move-object v11, v0

    .line 155
    check-cast v11, Lxn1;

    .line 156
    .line 157
    iget-object v0, v2, Lgi1;->h:Ljava/lang/Object;

    .line 158
    .line 159
    move-object v13, v0

    .line 160
    check-cast v13, Lls2;

    .line 161
    .line 162
    new-instance v7, Lbu1;

    .line 163
    .line 164
    const/4 v14, 0x5

    .line 165
    invoke-direct/range {v7 .. v14}, Lbu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    move-object v0, v12

    .line 169
    move-object v11, v13

    .line 170
    new-instance v13, Lvq2;

    .line 171
    .line 172
    const/16 v5, 0x19

    .line 173
    .line 174
    invoke-direct {v13, v9, v7, v5}, Lvq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 175
    .line 176
    .line 177
    iget-object v2, v2, Lgi1;->i:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Lls2;

    .line 180
    .line 181
    new-instance v7, Lbu1;

    .line 182
    .line 183
    const/4 v14, 0x3

    .line 184
    move-object v12, v4

    .line 185
    move-object v10, v9

    .line 186
    move-object v9, v2

    .line 187
    invoke-direct/range {v7 .. v14}, Lbu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v7}, Lls2;->b(Lws2;)Lls2;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    iget-object v4, v0, Lzs1;->g:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v4, Lls2;

    .line 197
    .line 198
    if-nez v4, :cond_2

    .line 199
    .line 200
    iput-object v2, v0, Lzs1;->g:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-virtual {v0}, Lzs1;->a()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Lbw1;

    .line 207
    .line 208
    invoke-virtual {v0, v3, v1}, Lbw1;->b(Lf41;Le41;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 215
    .line 216
    .line 217
    throw v0
.end method
