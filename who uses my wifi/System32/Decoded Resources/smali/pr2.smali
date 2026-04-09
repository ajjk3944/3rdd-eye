.class public final Lpr2;
.super Lel2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final J:Lsn3;


# instance fields
.field public A:Z

.field public final B:Lnc2;

.field public final C:Lvs1;

.field public final D:Le51;

.field public final E:Landroid/content/Context;

.field public final F:Lrr2;

.field public final G:Lt23;

.field public final H:Ljava/util/HashMap;

.field public final I:Ljava/util/ArrayList;

.field public final l:Ljava/util/concurrent/Executor;

.field public final m:Ltr2;

.field public final n:Lwr2;

.field public final o:Lds2;

.field public final p:Lvr2;

.field public final q:Lyr2;

.field public final r:Lz94;

.field public final s:Lz94;

.field public final t:Lz94;

.field public final u:Lz94;

.field public final v:Lz94;

.field public w:Lhv1;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lxm3;->g:Lvm3;

    .line 2
    .line 3
    const-string v1, "3010"

    .line 4
    .line 5
    const-string v2, "3008"

    .line 6
    .line 7
    const-string v3, "1005"

    .line 8
    .line 9
    const-string v4, "1009"

    .line 10
    .line 11
    const-string v5, "2011"

    .line 12
    .line 13
    const-string v6, "2007"

    .line 14
    .line 15
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-static {v0, v1}, Lwl2;->G([Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lpr2;->J:Lsn3;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lko1;Ljava/util/concurrent/Executor;Ltr2;Lwr2;Lds2;Lvr2;Lyr2;Lz94;Lz94;Lz94;Lz94;Lz94;Lnc2;Lvs1;Le51;Landroid/content/Context;Lrr2;Lt23;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p1}, Lel2;-><init>(Lko1;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lpr2;->l:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p3, p0, Lpr2;->m:Ltr2;

    .line 7
    .line 8
    iput-object p4, p0, Lpr2;->n:Lwr2;

    .line 9
    .line 10
    iput-object p5, p0, Lpr2;->o:Lds2;

    .line 11
    .line 12
    iput-object p6, p0, Lpr2;->p:Lvr2;

    .line 13
    .line 14
    iput-object p7, p0, Lpr2;->q:Lyr2;

    .line 15
    .line 16
    iput-object p8, p0, Lpr2;->r:Lz94;

    .line 17
    .line 18
    iput-object p9, p0, Lpr2;->s:Lz94;

    .line 19
    .line 20
    iput-object p10, p0, Lpr2;->t:Lz94;

    .line 21
    .line 22
    iput-object p11, p0, Lpr2;->u:Lz94;

    .line 23
    .line 24
    iput-object p12, p0, Lpr2;->v:Lz94;

    .line 25
    .line 26
    iput-object p13, p0, Lpr2;->B:Lnc2;

    .line 27
    .line 28
    iput-object p14, p0, Lpr2;->C:Lvs1;

    .line 29
    .line 30
    iput-object p15, p0, Lpr2;->D:Le51;

    .line 31
    .line 32
    move-object/from16 p1, p16

    .line 33
    .line 34
    iput-object p1, p0, Lpr2;->E:Landroid/content/Context;

    .line 35
    .line 36
    move-object/from16 p1, p17

    .line 37
    .line 38
    iput-object p1, p0, Lpr2;->F:Lrr2;

    .line 39
    .line 40
    move-object/from16 p1, p18

    .line 41
    .line 42
    iput-object p1, p0, Lpr2;->G:Lt23;

    .line 43
    .line 44
    new-instance p1, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lpr2;->H:Ljava/util/HashMap;

    .line 50
    .line 51
    new-instance p1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lpr2;->I:Ljava/util/ArrayList;

    .line 57
    .line 58
    return-void
.end method

.method public static d(Landroid/view/View;)Z
    .locals 5

    .line 1
    sget-object v0, Lmz1;->sb:Liz1;

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
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 22
    .line 23
    invoke-static {p0}, Llf4;->a(Landroid/view/View;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v4, Landroid/graphics/Point;

    .line 39
    .line 40
    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0, v4}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    sget-object p0, Lmz1;->tb:Liz1;

    .line 50
    .line 51
    iget-object v0, v1, Ltw1;->c:Lkz1;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    int-to-long v0, p0

    .line 64
    cmp-long p0, v2, v0

    .line 65
    .line 66
    if-ltz p0, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    new-instance v0, Landroid/graphics/Rect;

    .line 76
    .line 77
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 78
    .line 79
    .line 80
    new-instance v1, Landroid/graphics/Point;

    .line 81
    .line 82
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    :goto_0
    const/4 p0, 0x1

    .line 92
    return p0

    .line 93
    :cond_1
    const/4 p0, 0x0

    .line 94
    return p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    new-instance v0, Lnr2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lnr2;-><init>(Lpr2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lpr2;->l:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lpr2;->m:Ltr2;

    .line 13
    .line 14
    invoke-virtual {v0}, Ltr2;->q()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x7

    .line 19
    if-eq v0, v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lpr2;->n:Lwr2;

    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v2, Lfu1;

    .line 27
    .line 28
    const/16 v3, 0x1d

    .line 29
    .line 30
    invoke-direct {v2, v3, v0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-super {p0}, Lel2;->a()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final declared-synchronized c(Landroid/view/View;I)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lmz1;->oc:Liz1;

    .line 3
    .line 4
    sget-object v1, Ltw1;->e:Ltw1;

    .line 5
    .line 6
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_1
    iget-object v0, p0, Lpr2;->w:Lhv1;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string p1, "Ad should be associated with an ad view before calling performClickForCustomGesture()"

    .line 27
    .line 28
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :try_start_2
    iget-object v1, p0, Lpr2;->l:Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    instance-of v0, v0, Las2;

    .line 38
    .line 39
    new-instance v2, Lib;

    .line 40
    .line 41
    invoke-direct {v2, p0, p1, v0, p2}, Lib;-><init>(Lpr2;Landroid/view/View;ZI)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    throw p1
.end method

.method public final e(Ljava/lang/String;Z)Lxz2;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lpr2;->p:Lvr2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lvr2;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object/from16 v16, v3

    .line 19
    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_1
    iget-object v2, v1, Lpr2;->m:Ltr2;

    .line 23
    .line 24
    invoke-virtual {v2}, Ltr2;->j()Lag2;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2}, Ltr2;->h()Lag2;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-nez v4, :cond_3

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const-string v0, "Omid display and video webview are null. Skipping initialization."

    .line 38
    .line 39
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lvr2;->f()Lug0;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lvr2;->f()Lug0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lug0;->A()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/lit8 v6, v0, -0x1

    .line 55
    .line 56
    const/4 v7, 0x2

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x1

    .line 59
    if-eqz v6, :cond_8

    .line 60
    .line 61
    if-eq v6, v9, :cond_6

    .line 62
    .line 63
    if-eq v0, v9, :cond_5

    .line 64
    .line 65
    if-eq v0, v7, :cond_4

    .line 66
    .line 67
    const-string v0, "UNKNOWN"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    const-string v0, "DISPLAY"

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_5
    const-string v0, "VIDEO"

    .line 74
    .line 75
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    new-instance v4, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x31

    .line 82
    .line 83
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 84
    .line 85
    .line 86
    const-string v2, "Unknown omid media type: "

    .line 87
    .line 88
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, ". Not initializing Omid."

    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v3

    .line 107
    :cond_6
    if-eqz v4, :cond_7

    .line 108
    .line 109
    move v6, v8

    .line 110
    move v0, v9

    .line 111
    goto :goto_2

    .line 112
    :cond_7
    const-string v0, "Omid media type was display but there was no display webview."

    .line 113
    .line 114
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v3

    .line 118
    :cond_8
    if-eqz v5, :cond_14

    .line 119
    .line 120
    move v0, v8

    .line 121
    move v6, v9

    .line 122
    :goto_2
    if-eqz v0, :cond_9

    .line 123
    .line 124
    move-object v0, v3

    .line 125
    goto :goto_3

    .line 126
    :cond_9
    const-string v0, "javascript"

    .line 127
    .line 128
    move-object v4, v5

    .line 129
    :goto_3
    if-eqz v4, :cond_13

    .line 130
    .line 131
    iget-object v10, v1, Lpr2;->E:Landroid/content/Context;

    .line 132
    .line 133
    sget-object v11, Lhg4;->C:Lhg4;

    .line 134
    .line 135
    iget-object v12, v11, Lhg4;->x:Lsu2;

    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v10}, Lsu2;->d(Landroid/content/Context;)Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    if-nez v10, :cond_a

    .line 145
    .line 146
    const-string v0, "Failed to initialize omid in InternalNativeAd"

    .line 147
    .line 148
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v3

    .line 152
    :cond_a
    iget-object v10, v1, Lpr2;->D:Le51;

    .line 153
    .line 154
    iget v12, v10, Le51;->g:I

    .line 155
    .line 156
    iget v10, v10, Le51;->h:I

    .line 157
    .line 158
    invoke-static {v12, v9}, Lga1;->f(II)I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    new-instance v15, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    add-int/2addr v13, v14

    .line 173
    invoke-direct {v15, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v12, "."

    .line 180
    .line 181
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    const/4 v12, 0x3

    .line 192
    if-eqz v6, :cond_b

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_b
    invoke-virtual {v2}, Ltr2;->q()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    if-ne v13, v12, :cond_c

    .line 200
    .line 201
    const/4 v12, 0x4

    .line 202
    :cond_c
    move/from16 v17, v12

    .line 203
    .line 204
    move v12, v7

    .line 205
    move/from16 v7, v17

    .line 206
    .line 207
    :goto_4
    iget-object v13, v11, Lhg4;->x:Lsu2;

    .line 208
    .line 209
    invoke-interface {v4}, Lag2;->t()Landroid/webkit/WebView;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    iget-object v15, v1, Lel2;->b:La83;

    .line 214
    .line 215
    iget-object v15, v15, La83;->l0:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    sget-object v13, Lmz1;->G5:Liz1;

    .line 221
    .line 222
    move-object/from16 v16, v3

    .line 223
    .line 224
    sget-object v3, Ltw1;->e:Ltw1;

    .line 225
    .line 226
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 227
    .line 228
    invoke-virtual {v3, v13}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    check-cast v3, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_e

    .line 239
    .line 240
    sget-object v3, Lm54;->f:Lkj1;

    .line 241
    .line 242
    iget-boolean v3, v3, Lkj1;->g:Z

    .line 243
    .line 244
    if-nez v3, :cond_d

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_d
    new-instance v3, Lvh2;

    .line 248
    .line 249
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    move-object/from16 v13, p1

    .line 253
    .line 254
    iput-object v13, v3, Lvh2;->f:Ljava/lang/String;

    .line 255
    .line 256
    iput-object v10, v3, Lvh2;->g:Ljava/lang/String;

    .line 257
    .line 258
    iput-object v0, v3, Lvh2;->h:Ljava/lang/String;

    .line 259
    .line 260
    iput v12, v3, Lvh2;->i:I

    .line 261
    .line 262
    iput-object v14, v3, Lvh2;->k:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v15, v3, Lvh2;->l:Ljava/lang/Object;

    .line 265
    .line 266
    iput v7, v3, Lvh2;->j:I

    .line 267
    .line 268
    invoke-static {v3}, Lsu2;->r(Ltz2;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, Lxz2;

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_e
    :goto_5
    move-object/from16 v0, v16

    .line 276
    .line 277
    :goto_6
    if-nez v0, :cond_f

    .line 278
    .line 279
    const-string v0, "Failed to create omid session in InternalNativeAd"

    .line 280
    .line 281
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object v16

    .line 285
    :cond_f
    monitor-enter v2

    .line 286
    :try_start_0
    iput-object v0, v2, Ltr2;->l:Lxz2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    .line 288
    monitor-exit v2

    .line 289
    invoke-interface {v4, v0}, Lag2;->m0(Lxz2;)V

    .line 290
    .line 291
    .line 292
    if-eqz v6, :cond_11

    .line 293
    .line 294
    iget-object v2, v0, Lxz2;->a:Lxb3;

    .line 295
    .line 296
    if-eqz v5, :cond_10

    .line 297
    .line 298
    invoke-interface {v5}, Lag2;->p0()Landroid/view/View;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    iget-object v5, v11, Lhg4;->x:Lsu2;

    .line 303
    .line 304
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-static {v2, v3}, Lsu2;->k(Lxb3;Landroid/view/View;)V

    .line 308
    .line 309
    .line 310
    :cond_10
    iput-boolean v9, v1, Lpr2;->A:Z

    .line 311
    .line 312
    :cond_11
    if-eqz p2, :cond_12

    .line 313
    .line 314
    iget-object v2, v11, Lhg4;->x:Lsu2;

    .line 315
    .line 316
    iget-object v3, v0, Lxz2;->a:Lxb3;

    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v3}, Lsu2;->j(Lxb3;)V

    .line 322
    .line 323
    .line 324
    new-instance v2, Ls8;

    .line 325
    .line 326
    invoke-direct {v2, v8}, Lbw0;-><init>(I)V

    .line 327
    .line 328
    .line 329
    const-string v3, "onSdkLoaded"

    .line 330
    .line 331
    invoke-interface {v4, v3, v2}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 332
    .line 333
    .line 334
    :cond_12
    return-object v0

    .line 335
    :catchall_0
    move-exception v0

    .line 336
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 337
    throw v0

    .line 338
    :cond_13
    move-object/from16 v16, v3

    .line 339
    .line 340
    const-string v0, "Webview is null in InternalNativeAd"

    .line 341
    .line 342
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    return-object v16

    .line 346
    :cond_14
    move-object/from16 v16, v3

    .line 347
    .line 348
    const-string v0, "Omid media type was video but there was no video webview."

    .line 349
    .line 350
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :goto_7
    return-object v16
.end method

.method public final f(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpr2;->m:Ltr2;

    .line 2
    .line 3
    sget-object v1, Lmz1;->N5:Liz1;

    .line 4
    .line 5
    sget-object v2, Ltw1;->e:Ltw1;

    .line 6
    .line 7
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ltr2;->q()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x3

    .line 26
    if-eq v1, v2, :cond_1

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    iget-object v1, v0, Ltr2;->n:Lpd2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance v0, Lmr2;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v0, p0, p1, v2}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lpr2;->l:Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    new-instance v2, Ljq3;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v2, v1, v0, v3}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2, p1}, Lpd2;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1

    .line 56
    :cond_1
    invoke-virtual {v0}, Ltr2;->k()Lxz2;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, p1, v0}, Lpr2;->m(Landroid/view/View;Lxz2;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final declared-synchronized g(Lrs2;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lpr2;->x:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    move-object v0, p1

    .line 9
    check-cast v0, Lhv1;

    .line 10
    .line 11
    iput-object v0, p0, Lpr2;->w:Lhv1;

    .line 12
    .line 13
    iget-object v0, p0, Lpr2;->o:Lds2;

    .line 14
    .line 15
    new-instance v1, Ln62;

    .line 16
    .line 17
    invoke-direct {v1, v0, p1}, Ln62;-><init>(Lds2;Lrs2;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lds2;->g:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lpr2;->n:Lwr2;

    .line 26
    .line 27
    invoke-interface {p1}, Lrs2;->X0()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {p1}, Lrs2;->k()Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {p1}, Lrs2;->i()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    move-object v7, p1

    .line 40
    move-object v6, p1

    .line 41
    invoke-interface/range {v2 .. v7}, Lwr2;->a(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lmz1;->Q2:Liz1;

    .line 45
    .line 46
    sget-object v0, Ltw1;->e:Ltw1;

    .line 47
    .line 48
    iget-object v1, v0, Ltw1;->c:Lkz1;

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lpr2;->C:Lvs1;

    .line 63
    .line 64
    iget-object p1, p1, Lvs1;->b:Lrs1;

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    invoke-interface {v6}, Lrs2;->X0()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {p1, v1}, Lrs1;->e(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_1
    :goto_0
    sget-object p1, Lmz1;->S1:Liz1;

    .line 81
    .line 82
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    const/4 v0, 0x3

    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    iget-object p1, p0, Lel2;->b:La83;

    .line 98
    .line 99
    iget-boolean v1, p1, La83;->k0:Z

    .line 100
    .line 101
    if-nez v1, :cond_2

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_2
    iget-object p1, p1, La83;->j0:Lorg/json/JSONObject;

    .line 105
    .line 106
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_5

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, Ljava/lang/String;

    .line 123
    .line 124
    iget-object v2, p0, Lpr2;->w:Lhv1;

    .line 125
    .line 126
    if-nez v2, :cond_4

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    invoke-interface {v2}, Lrs2;->g()Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 139
    .line 140
    :goto_2
    iget-object v3, p0, Lpr2;->H:Ljava/util/HashMap;

    .line 141
    .line 142
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {v3, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    if-eqz v2, :cond_3

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, Landroid/view/View;

    .line 154
    .line 155
    if-eqz v2, :cond_3

    .line 156
    .line 157
    iget-object v3, p0, Lpr2;->E:Landroid/content/Context;

    .line 158
    .line 159
    new-instance v4, Lpv1;

    .line 160
    .line 161
    invoke-direct {v4, v3, v2}, Lpv1;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    iget-object v2, p0, Lpr2;->I:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    new-instance v2, Llr2;

    .line 170
    .line 171
    invoke-direct {v2, p0, v1}, Llr2;-><init>(Lpr2;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v1, v4, Lpv1;->q:Ljava/util/HashSet;

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v0}, Lpv1;->d(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_5
    :goto_3
    invoke-interface {v6}, Lrs2;->f()Lpv1;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p1, :cond_6

    .line 188
    .line 189
    invoke-interface {v6}, Lrs2;->f()Lpv1;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget-object v1, p0, Lpr2;->B:Lnc2;

    .line 194
    .line 195
    iget-object v2, p1, Lpv1;->q:Ljava/util/HashSet;

    .line 196
    .line 197
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v0}, Lpv1;->d(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    .line 203
    monitor-exit p0

    .line 204
    return-void

    .line 205
    :cond_6
    :goto_4
    monitor-exit p0

    .line 206
    return-void

    .line 207
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    throw p1
.end method

.method public final h(Lrs2;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lrs2;->X0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lrs2;->g()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lpr2;->n:Lwr2;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Lwr2;->c(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lrs2;->M0()Landroid/widget/FrameLayout;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lrs2;->M0()Landroid/widget/FrameLayout;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Lrs2;->M0()Landroid/widget/FrameLayout;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-interface {p1}, Lrs2;->f()Lpv1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, Lrs2;->f()Lpv1;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lpr2;->B:Lnc2;

    .line 45
    .line 46
    iget-object p1, p1, Lpv1;->q:Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Lpr2;->w:Lhv1;

    .line 53
    .line 54
    return-void
.end method

.method public final declared-synchronized i(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lpr2;->o:Lds2;

    .line 3
    .line 4
    iget-object v1, p0, Lpr2;->w:Lhv1;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lds2;->a(Lrs2;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lpr2;->n:Lwr2;

    .line 14
    .line 15
    invoke-interface {v1, p1, p2, p3, v0}, Lwr2;->r(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lpr2;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
.end method

.method public final declared-synchronized j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lpr2;->z:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    :try_start_1
    sget-object v0, Lpr2;->J:Lsn3;

    .line 13
    .line 14
    iget v1, v0, Lsn3;->i:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :cond_2
    if-ge v2, v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lsn3;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/view/View;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    :try_start_2
    monitor-exit p0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_3
    :goto_0
    monitor-exit p0

    .line 47
    const/4 v0, 0x0

    .line 48
    :goto_1
    if-eqz v0, :cond_6

    .line 49
    .line 50
    sget-object v1, Lmz1;->me:Liz1;

    .line 51
    .line 52
    sget-object v2, Ltw1;->e:Ltw1;

    .line 53
    .line 54
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v3, 0x1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    new-instance v1, Landroid/graphics/Rect;

    .line 70
    .line 71
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v2, Landroid/graphics/Point;

    .line 75
    .line 76
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-ne v2, v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-ne v0, v1, :cond_6

    .line 104
    .line 105
    iget-object v0, p0, Lpr2;->n:Lwr2;

    .line 106
    .line 107
    invoke-virtual {p0}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v0, p1, p2, p3, v1}, Lwr2;->o(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V

    .line 112
    .line 113
    .line 114
    iput-boolean v3, p0, Lpr2;->z:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    .line 116
    monitor-exit p0

    .line 117
    return-void

    .line 118
    :catchall_1
    move-exception p1

    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_4
    :try_start_3
    sget-object v1, Lmz1;->ne:Liz1;

    .line 122
    .line 123
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 124
    .line 125
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    invoke-static {v0}, Lpr2;->d(Landroid/view/View;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    iget-object v0, p0, Lpr2;->n:Lwr2;

    .line 144
    .line 145
    invoke-virtual {p0}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-interface {v0, p1, p2, p3, v1}, Lwr2;->o(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V

    .line 150
    .line 151
    .line 152
    iput-boolean v3, p0, Lpr2;->z:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 153
    .line 154
    monitor-exit p0

    .line 155
    return-void

    .line 156
    :cond_5
    :try_start_4
    sget-object v1, Lmz1;->oe:Liz1;

    .line 157
    .line 158
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 159
    .line 160
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Ljava/lang/Float;

    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    float-to-double v4, v4

    .line 171
    const-wide/16 v6, 0x0

    .line 172
    .line 173
    cmpl-double v4, v4, v6

    .line 174
    .line 175
    if-lez v4, :cond_6

    .line 176
    .line 177
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 178
    .line 179
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljava/lang/Float;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    float-to-double v1, v1

    .line 190
    new-instance v4, Landroid/graphics/Rect;

    .line 191
    .line 192
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 193
    .line 194
    .line 195
    new-instance v5, Landroid/graphics/Point;

    .line 196
    .line 197
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v4, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_6

    .line 205
    .line 206
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    mul-int/2addr v5, v4

    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    mul-int/2addr v4, v0

    .line 224
    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    .line 225
    .line 226
    div-double/2addr v1, v6

    .line 227
    int-to-double v6, v4

    .line 228
    int-to-double v4, v5

    .line 229
    mul-double/2addr v6, v1

    .line 230
    cmpl-double v0, v4, v6

    .line 231
    .line 232
    if-ltz v0, :cond_6

    .line 233
    .line 234
    iget-object v0, p0, Lpr2;->n:Lwr2;

    .line 235
    .line 236
    invoke-virtual {p0}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-interface {v0, p1, p2, p3, v1}, Lwr2;->o(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/widget/ImageView$ScaleType;)V

    .line 241
    .line 242
    .line 243
    iput-boolean v3, p0, Lpr2;->z:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 244
    .line 245
    monitor-exit p0

    .line 246
    return-void

    .line 247
    :cond_6
    :goto_2
    monitor-exit p0

    .line 248
    return-void

    .line 249
    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 250
    :try_start_6
    throw p1

    .line 251
    :goto_4
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 252
    throw p1
.end method

.method public final declared-synchronized k()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lpr2;->w:Lhv1;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "Ad should be associated with an ad view before calling getMediaviewScaleType()"

    .line 7
    .line 8
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    invoke-interface {v0}, Lrs2;->p()Lu10;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/ImageView$ScaleType;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :cond_1
    :try_start_2
    sget-object v0, Lds2;->k:Landroid/widget/ImageView$ScaleType;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-object v0

    .line 34
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    throw v0
.end method

.method public final l()V
    .locals 5

    .line 1
    sget-object v0, Lmz1;->N5:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    const-string v1, "Google"

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lpr2;->m:Ltr2;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v1, v0, Ltr2;->m:Ln70;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit v0

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance v0, Lz71;

    .line 31
    .line 32
    const/16 v2, 0x16

    .line 33
    .line 34
    invoke-direct {v0, v2, p0}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lpr2;->l:Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    new-instance v3, Ljq3;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v3, v1, v0, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v3, v2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v1

    .line 52
    :cond_1
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v1, v0}, Lpr2;->e(Ljava/lang/String;Z)Lxz2;

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final m(Landroid/view/View;Lxz2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpr2;->m:Ltr2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltr2;->j()Lag2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lpr2;->p:Lvr2;

    .line 8
    .line 9
    invoke-virtual {v1}, Lvr2;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object v0, Lhg4;->C:Lhg4;

    .line 22
    .line 23
    iget-object v0, v0, Lhg4;->x:Lsu2;

    .line 24
    .line 25
    iget-object p2, p2, Lxz2;->a:Lxb3;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p2, p1}, Lsu2;->k(Lxb3;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final declared-synchronized o()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lpr2;->x:Z

    .line 4
    .line 5
    new-instance v0, Lnr2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lnr2;-><init>(Lpr2;I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lpr2;->l:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lel2;->c:Lfn2;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v1, Lz71;

    .line 22
    .line 23
    const/16 v2, 0x14

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v1, v2, v3}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v0
.end method

.method public final declared-synchronized p(Landroid/os/Bundle;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lpr2;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lpr2;->n:Lwr2;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lwr2;->t(Landroid/os/Bundle;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput-boolean p1, p0, Lpr2;->y:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 21
    throw p1
.end method

.method public final declared-synchronized q(Lrs2;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lmz1;->Q1:Liz1;

    .line 3
    .line 4
    sget-object v1, Ltw1;->e:Ltw1;

    .line 5
    .line 6
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Llf4;->l:Li63;

    .line 21
    .line 22
    new-instance v1, Lor2;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, p1, v2}, Lor2;-><init>(Lpr2;Lrs2;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lpr2;->g(Lrs2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    throw p1
.end method

.method public final declared-synchronized r(Lrs2;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lmz1;->Q1:Liz1;

    .line 3
    .line 4
    sget-object v1, Ltw1;->e:Ltw1;

    .line 5
    .line 6
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Llf4;->l:Li63;

    .line 21
    .line 22
    new-instance v1, Lor2;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, p1, v2}, Lor2;-><init>(Lpr2;Lrs2;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lpr2;->h(Lrs2;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return-void

    .line 40
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    throw p1
.end method

.method public final declared-synchronized s(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lpr2;->o:Lds2;

    .line 3
    .line 4
    iget-object v1, p0, Lpr2;->w:Lhv1;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v2, v0, Lds2;->e:Lns2;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    invoke-interface {v1}, Lrs2;->M0()Landroid/widget/FrameLayout;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v0, Lds2;->c:Lvr2;

    .line 20
    .line 21
    invoke-virtual {v0}, Lvr2;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :try_start_1
    invoke-interface {v1}, Lrs2;->M0()Landroid/widget/FrameLayout;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v2}, Lns2;->a()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_1
    .catch Lhg2; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    :try_start_2
    invoke-static {}, Lgi2;->R()Z

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    iget-object v0, p0, Lpr2;->n:Lwr2;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    move-object v2, p2

    .line 50
    move-object v3, p3

    .line 51
    move-object v4, p4

    .line 52
    move v5, p5

    .line 53
    invoke-interface/range {v0 .. v6}, Lwr2;->q(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;)V

    .line 54
    .line 55
    .line 56
    iget-boolean p1, p0, Lpr2;->A:Z

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lpr2;->m:Ltr2;

    .line 61
    .line 62
    invoke-virtual {p1}, Ltr2;->h()Lag2;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-nez p2, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {p1}, Ltr2;->h()Lag2;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    new-instance p2, Ls8;

    .line 76
    .line 77
    const/4 p3, 0x0

    .line 78
    invoke-direct {p2, p3}, Lbw0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    const-string p3, "onSdkAdUserInteractionClick"

    .line 82
    .line 83
    invoke-interface {p1, p3, p2}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    .line 85
    .line 86
    monitor-exit p0

    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    :goto_1
    monitor-exit p0

    .line 92
    return-void

    .line 93
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    throw p1
.end method

.method public final declared-synchronized t(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Z)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lpr2;->y:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lpr2;->j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    :try_start_1
    sget-object v0, Lmz1;->S1:Liz1;

    .line 15
    .line 16
    sget-object v1, Ltw1;->e:Ltw1;

    .line 17
    .line 18
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lel2;->b:La83;

    .line 33
    .line 34
    iget-boolean v0, v0, La83;->k0:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lpr2;->H:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    if-nez p4, :cond_5

    .line 74
    .line 75
    sget-object p4, Lmz1;->l4:Liz1;

    .line 76
    .line 77
    sget-object v0, Ltw1;->e:Ltw1;

    .line 78
    .line 79
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 80
    .line 81
    invoke-virtual {v0, p4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    check-cast p4, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    if-eqz p4, :cond_4

    .line 92
    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    :cond_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Ljava/util/Map$Entry;

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Landroid/view/View;

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-static {v0}, Lpr2;->d(Landroid/view/View;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    invoke-virtual {p0, p1, p2, p3}, Lpr2;->i(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    .line 138
    monitor-exit p0

    .line 139
    return-void

    .line 140
    :cond_4
    :goto_0
    monitor-exit p0

    .line 141
    return-void

    .line 142
    :cond_5
    :try_start_2
    invoke-virtual {p0, p1, p2, p3}, Lpr2;->i(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, p1, p2, p3}, Lpr2;->j(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    .line 147
    .line 148
    monitor-exit p0

    .line 149
    return-void

    .line 150
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 151
    throw p1
.end method
