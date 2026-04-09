.class public final Liu2;
.super Lel2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final l:Landroid/content/Context;

.field public final m:Ljava/lang/ref/WeakReference;

.field public final n:Lqq2;

.field public final o:Lt93;

.field public final p:Lan2;

.field public final q:Lun2;

.field public final r:Lml2;

.field public final s:Lnb2;

.field public final t:Lmd3;

.field public final u:Lj83;

.field public final v:Lmv2;

.field public w:Z


# direct methods
.method public constructor <init>(Lko1;Landroid/content/Context;Lag2;Lqq2;Lt93;Lan2;Lun2;Lml2;La83;Lmd3;Lj83;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lel2;-><init>(Lko1;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Liu2;->w:Z

    .line 6
    .line 7
    iput-object p2, p0, Liu2;->l:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Liu2;->n:Lqq2;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Liu2;->m:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    iput-object p5, p0, Liu2;->o:Lt93;

    .line 19
    .line 20
    iput-object p6, p0, Liu2;->p:Lan2;

    .line 21
    .line 22
    iput-object p7, p0, Liu2;->q:Lun2;

    .line 23
    .line 24
    iput-object p8, p0, Liu2;->r:Lml2;

    .line 25
    .line 26
    iput-object p10, p0, Liu2;->t:Lmd3;

    .line 27
    .line 28
    new-instance p1, Lnb2;

    .line 29
    .line 30
    iget-object p2, p9, La83;->l:Lta2;

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    iget-object p3, p2, Lta2;->f:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p3, ""

    .line 38
    .line 39
    :goto_0
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget p2, p2, Lta2;->g:I

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 p2, 0x1

    .line 45
    :goto_1
    invoke-direct {p1, p3, p2}, Lnb2;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Liu2;->s:Lnb2;

    .line 49
    .line 50
    iput-object p11, p0, Liu2;->u:Lj83;

    .line 51
    .line 52
    iput-object p12, p0, Liu2;->v:Lmv2;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final c(Landroid/app/Activity;Z)V
    .locals 6

    .line 1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 2
    .line 3
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 4
    .line 5
    iget-object v0, p0, Liu2;->n:Lqq2;

    .line 6
    .line 7
    invoke-interface {v0}, Lqq2;->d()La83;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Llf4;->m(La83;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Liu2;->l:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v3, p0, Liu2;->p:Lan2;

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    sget-object v1, Lmz1;->le:Liz1;

    .line 22
    .line 23
    sget-object v4, Ltw1;->e:Ltw1;

    .line 24
    .line 25
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 26
    .line 27
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 28
    .line 29
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iget-object v1, p0, Lel2;->b:La83;

    .line 42
    .line 43
    iget-object v5, p0, Liu2;->v:Lmv2;

    .line 44
    .line 45
    invoke-static {v2, v1, v5}, Llf4;->l(Landroid/content/Context;La83;Lmv2;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object v1, Lmz1;->K0:Liz1;

    .line 49
    .line 50
    invoke-virtual {v4, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-static {v2}, Llf4;->g(Landroid/content/Context;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    const-string p1, "Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies"

    .line 69
    .line 70
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Lan2;->b()V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lmz1;->L0:Liz1;

    .line 77
    .line 78
    invoke-virtual {v4, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    iget-object p1, p0, Lel2;->a:Lh83;

    .line 91
    .line 92
    iget-object p1, p1, Lh83;->b:Lp21;

    .line 93
    .line 94
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lc83;

    .line 97
    .line 98
    iget-object p1, p1, Lc83;->b:Ljava/lang/String;

    .line 99
    .line 100
    iget-object p2, p0, Liu2;->t:Lmd3;

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lmd3;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void

    .line 106
    :cond_2
    iget-boolean v1, p0, Liu2;->w:Z

    .line 107
    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    const-string p1, "The rewarded ad have been showed."

    .line 111
    .line 112
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const/16 p1, 0xa

    .line 116
    .line 117
    const/4 p2, 0x0

    .line 118
    invoke-static {p1, p2, p2}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v3, p1}, Lan2;->O(Lnx2;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    const/4 v1, 0x1

    .line 127
    iput-boolean v1, p0, Liu2;->w:Z

    .line 128
    .line 129
    sget-object v1, Lsd2;->x:Lsd2;

    .line 130
    .line 131
    iget-object v4, p0, Liu2;->o:Lt93;

    .line 132
    .line 133
    invoke-virtual {v4, v1}, Lf74;->P1(Ldp2;)V

    .line 134
    .line 135
    .line 136
    if-nez p1, :cond_4

    .line 137
    .line 138
    move-object p1, v2

    .line 139
    :cond_4
    :try_start_0
    invoke-interface {v0, p2, p1, v3}, Lqq2;->q(ZLandroid/content/Context;Lan2;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Lt93;->U1()V
    :try_end_0
    .catch Lpq2; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :catch_0
    move-exception p1

    .line 147
    invoke-virtual {v3, p1}, Lan2;->R(Lpq2;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final finalize()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Liu2;->m:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lag2;

    .line 8
    .line 9
    sget-object v1, Lmz1;->b7:Liz1;

    .line 10
    .line 11
    sget-object v2, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-boolean v1, p0, Liu2;->w:Z

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v1, Lmd2;->f:Lld2;

    .line 34
    .line 35
    new-instance v2, Lig2;

    .line 36
    .line 37
    const/4 v3, 0x6

    .line 38
    invoke-direct {v2, v0, v3}, Lig2;-><init>(Lag2;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {v0}, Lag2;->destroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :goto_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 57
    .line 58
    .line 59
    throw v0
.end method
