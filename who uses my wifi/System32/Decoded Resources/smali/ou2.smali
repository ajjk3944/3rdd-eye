.class public final Lou2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lsm2;

.field public final b:Lwp2;

.field public final c:Lgn2;

.field public final d:Lun2;

.field public final e:Lxn2;

.field public final f:Lvo2;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Lvp2;

.field public final i:Lxj2;

.field public final j:Lsu1;

.field public final k:Lsb2;

.field public final l:Lvs1;

.field public final m:Lqo2;

.field public final n:Ljz2;

.field public final o:Leb3;

.field public final p:Lmv2;

.field public final q:Lgj2;

.field public final r:Ltu2;

.field public final s:Lxv2;

.field public final t:Lim2;


# direct methods
.method public constructor <init>(Lsm2;Lgn2;Lun2;Lxn2;Lvo2;Ljava/util/concurrent/Executor;Lvp2;Lxj2;Lsu1;Lsb2;Lvs1;Lqo2;Ljz2;Leb3;Lmv2;Lwp2;Lgj2;Ltu2;Lxv2;Lim2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lou2;->a:Lsm2;

    iput-object p2, p0, Lou2;->c:Lgn2;

    iput-object p3, p0, Lou2;->d:Lun2;

    iput-object p4, p0, Lou2;->e:Lxn2;

    iput-object p5, p0, Lou2;->f:Lvo2;

    iput-object p6, p0, Lou2;->g:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lou2;->h:Lvp2;

    iput-object p8, p0, Lou2;->i:Lxj2;

    iput-object p9, p0, Lou2;->j:Lsu1;

    iput-object p10, p0, Lou2;->k:Lsb2;

    iput-object p11, p0, Lou2;->l:Lvs1;

    iput-object p12, p0, Lou2;->m:Lqo2;

    iput-object p13, p0, Lou2;->n:Ljz2;

    iput-object p14, p0, Lou2;->o:Leb3;

    iput-object p15, p0, Lou2;->p:Lmv2;

    move-object/from16 p1, p16

    iput-object p1, p0, Lou2;->b:Lwp2;

    move-object/from16 p1, p17

    iput-object p1, p0, Lou2;->q:Lgj2;

    move-object/from16 p1, p18

    iput-object p1, p0, Lou2;->r:Ltu2;

    move-object/from16 p1, p19

    iput-object p1, p0, Lou2;->s:Lxv2;

    move-object/from16 p1, p20

    iput-object p1, p0, Lou2;->t:Lim2;

    return-void
.end method

.method public static final b(Lag2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lda3;)Lpd2;
    .locals 4

    .line 1
    sget-object v0, Lmz1;->p2:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lhg4;->C:Lhg4;

    .line 20
    .line 21
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 22
    .line 23
    const-string v2, "rendering-webview-load-html-start"

    .line 24
    .line 25
    invoke-static {v0, p3, v2}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance v0, Lpd2;

    .line 29
    .line 30
    invoke-direct {v0}, Lpd2;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lmz1;->E9:Liz1;

    .line 34
    .line 35
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-interface {p0}, Lag2;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/16 v2, 0x70

    .line 54
    .line 55
    invoke-static {v1, v2}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Laa3;->a()Laa3;

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-static {v0, p4, v1, v2}, Lqb1;->P(Ln70;Lda3;Laa3;Z)V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {p0}, Lag2;->e0()Lsg2;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    new-instance v1, Lmr2;

    .line 71
    .line 72
    const/4 v2, 0x2

    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v1, p3, v0, v2, v3}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p4, Lsg2;->l:Lug2;

    .line 78
    .line 79
    invoke-interface {p0, p1, p2}, Lag2;->J0(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method


# virtual methods
.method public final a(Lag2;ZLe42;Landroid/os/Bundle;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    sget-object v3, Lmz1;->p2:Liz1;

    .line 8
    .line 9
    sget-object v4, Ltw1;->e:Ltw1;

    .line 10
    .line 11
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 12
    .line 13
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    sget-object v5, Lhg4;->C:Lhg4;

    .line 28
    .line 29
    iget-object v5, v5, Lhg4;->k:Lym;

    .line 30
    .line 31
    const-string v6, "rendering-configure-webview-start"

    .line 32
    .line 33
    invoke-static {v5, v2, v6}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lag2;->e0()Lsg2;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    new-instance v8, Lnu2;

    .line 41
    .line 42
    invoke-direct {v8, v0}, Lnu2;-><init>(Lou2;)V

    .line 43
    .line 44
    .line 45
    new-instance v11, Llu2;

    .line 46
    .line 47
    invoke-direct {v11, v0}, Llu2;-><init>(Lou2;)V

    .line 48
    .line 49
    .line 50
    new-instance v12, Lxt2;

    .line 51
    .line 52
    const/4 v5, 0x2

    .line 53
    invoke-direct {v12, v5, v0}, Lxt2;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lof3;

    .line 57
    .line 58
    const/16 v6, 0x14

    .line 59
    .line 60
    invoke-direct {v5, v6, v0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v6, v0, Lou2;->s:Lxv2;

    .line 64
    .line 65
    iget-object v9, v0, Lou2;->t:Lim2;

    .line 66
    .line 67
    move-object/from16 v28, v9

    .line 68
    .line 69
    iget-object v9, v0, Lou2;->d:Lun2;

    .line 70
    .line 71
    iget-object v10, v0, Lou2;->e:Lxn2;

    .line 72
    .line 73
    iget-object v15, v0, Lou2;->j:Lsu1;

    .line 74
    .line 75
    iget-object v13, v0, Lou2;->k:Lsb2;

    .line 76
    .line 77
    iget-object v14, v0, Lou2;->n:Ljz2;

    .line 78
    .line 79
    move-object/from16 v16, v5

    .line 80
    .line 81
    iget-object v5, v0, Lou2;->o:Leb3;

    .line 82
    .line 83
    move-object/from16 v19, v5

    .line 84
    .line 85
    iget-object v5, v0, Lou2;->p:Lmv2;

    .line 86
    .line 87
    const/16 v21, 0x0

    .line 88
    .line 89
    move-object/from16 v20, v5

    .line 90
    .line 91
    iget-object v5, v0, Lou2;->b:Lwp2;

    .line 92
    .line 93
    const/16 v23, 0x0

    .line 94
    .line 95
    const/16 v24, 0x0

    .line 96
    .line 97
    const/16 v25, 0x0

    .line 98
    .line 99
    move-object/from16 v22, v5

    .line 100
    .line 101
    iget-object v5, v0, Lou2;->q:Lgj2;

    .line 102
    .line 103
    move-object/from16 v26, v5

    .line 104
    .line 105
    move-object/from16 v27, v6

    .line 106
    .line 107
    move-object/from16 v17, v13

    .line 108
    .line 109
    move-object/from16 v18, v14

    .line 110
    .line 111
    move/from16 v13, p2

    .line 112
    .line 113
    move-object/from16 v14, p3

    .line 114
    .line 115
    invoke-virtual/range {v7 .. v28}, Lsg2;->p(Lfd1;Ll32;Lye4;Lm32;Lkf1;ZLe42;Lsu1;Lof3;Lsb2;Ljz2;Leb3;Lmv2;Lz32;Lxp2;Lk32;Lk32;Lz32;Lgj2;Lxv2;Lim2;)V

    .line 116
    .line 117
    .line 118
    new-instance v5, Lh70;

    .line 119
    .line 120
    const/4 v6, 0x2

    .line 121
    invoke-direct {v5, v6, v0}, Lh70;-><init>(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v1, v5}, Lag2;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 125
    .line 126
    .line 127
    new-instance v5, Lm1;

    .line 128
    .line 129
    const/16 v6, 0x8

    .line 130
    .line 131
    invoke-direct {v5, v6, v0}, Lm1;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1, v5}, Lag2;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    .line 136
    .line 137
    sget-object v5, Lmz1;->Q2:Liz1;

    .line 138
    .line 139
    invoke-virtual {v4, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_1

    .line 150
    .line 151
    iget-object v5, v0, Lou2;->l:Lvs1;

    .line 152
    .line 153
    iget-object v5, v5, Lvs1;->b:Lrs1;

    .line 154
    .line 155
    if-eqz v5, :cond_1

    .line 156
    .line 157
    invoke-interface {v1}, Lag2;->p0()Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-interface {v5, v6}, Lrs1;->e(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    :cond_1
    iget-object v5, v0, Lou2;->h:Lvp2;

    .line 165
    .line 166
    iget-object v6, v0, Lou2;->g:Ljava/util/concurrent/Executor;

    .line 167
    .line 168
    invoke-virtual {v5, v1, v6}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 169
    .line 170
    .line 171
    new-instance v7, Ljt2;

    .line 172
    .line 173
    const/4 v8, 0x2

    .line 174
    invoke-direct {v7, v1, v8}, Ljt2;-><init>(Lag2;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v7, v6}, Lf74;->L1(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1}, Lag2;->p0()Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v5, v6}, Lvp2;->U1(Landroid/view/View;)V

    .line 185
    .line 186
    .line 187
    new-instance v5, Lv32;

    .line 188
    .line 189
    const/4 v6, 0x5

    .line 190
    invoke-direct {v5, v0, v1, v6}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 191
    .line 192
    .line 193
    const-string v6, "/trackActiveViewUnit"

    .line 194
    .line 195
    invoke-interface {v1, v6, v5}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 196
    .line 197
    .line 198
    iget-object v5, v0, Lou2;->i:Lxj2;

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 204
    .line 205
    invoke-direct {v6, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iput-object v6, v5, Lxj2;->o:Ljava/lang/ref/WeakReference;

    .line 209
    .line 210
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_2

    .line 221
    .line 222
    sget-object v1, Lhg4;->C:Lhg4;

    .line 223
    .line 224
    iget-object v1, v1, Lhg4;->k:Lym;

    .line 225
    .line 226
    const-string v3, "rendering-configure-webview-end"

    .line 227
    .line 228
    invoke-static {v1, v2, v3}, Lga1;->n(Lym;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_2
    return-void
.end method
