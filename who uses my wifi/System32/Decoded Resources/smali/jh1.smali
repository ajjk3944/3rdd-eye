.class public final Ljh1;
.super Lb92;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final D:I


# instance fields
.field public A:Landroid/widget/Toolbar;

.field public B:I

.field public final synthetic C:I

.field public final g:Landroid/app/Activity;

.field public h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

.field public i:Lag2;

.field public j:Lr2;

.field public k:Ltg4;

.field public l:Z

.field public m:Landroid/widget/FrameLayout;

.field public n:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field public o:Z

.field public p:Z

.field public q:Lm74;

.field public r:Z

.field public final s:Ljava/lang/Object;

.field public final t:Lm1;

.field public u:Lbs2;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    sput v0, Ljh1;->D:I

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 3

    .line 1
    iput p2, p0, Ljh1;->C:I

    .line 2
    .line 3
    invoke-direct {p0}, Lb92;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iput-boolean p2, p0, Ljh1;->l:Z

    .line 8
    .line 9
    iput-boolean p2, p0, Ljh1;->o:Z

    .line 10
    .line 11
    iput-boolean p2, p0, Ljh1;->p:Z

    .line 12
    .line 13
    iput-boolean p2, p0, Ljh1;->r:Z

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput v0, p0, Ljh1;->B:I

    .line 17
    .line 18
    new-instance v1, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Ljh1;->s:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, Lm1;

    .line 26
    .line 27
    const/4 v2, 0x7

    .line 28
    invoke-direct {v1, v2, p0}, Lm1;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Ljh1;->t:Lm1;

    .line 32
    .line 33
    iput-boolean p2, p0, Ljh1;->x:Z

    .line 34
    .line 35
    iput-boolean p2, p0, Ljh1;->y:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Ljh1;->z:Z

    .line 38
    .line 39
    iput-object p1, p0, Ljh1;->g:Landroid/app/Activity;

    .line 40
    .line 41
    return-void
.end method

.method public static final F3(Landroid/view/View;Lxz2;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lmz1;->I5:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p1, Lxz2;->b:Luk1;

    .line 25
    .line 26
    iget-object v0, v0, Luk1;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lwb3;

    .line 29
    .line 30
    sget-object v1, Lwb3;->g:Lwb3;

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 36
    .line 37
    iget-object v0, v0, Lhg4;->x:Lsu2;

    .line 38
    .line 39
    iget-object p1, p1, Lxz2;->a:Lxb3;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p0}, Lsu2;->k(Lxb3;Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final B3()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-boolean v0, p0, Ljh1;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Ljh1;->x:Z

    .line 16
    .line 17
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget v1, p0, Ljh1;->B:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    invoke-interface {v0, v1}, Lag2;->h0(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Ljh1;->s:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-boolean v1, p0, Ljh1;->v:Z

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Ljh1;->i:Lag2;

    .line 36
    .line 37
    invoke-interface {v1}, Lag2;->B0()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    sget-object v1, Lmz1;->u5:Liz1;

    .line 44
    .line 45
    sget-object v2, Ltw1;->e:Ltw1;

    .line 46
    .line 47
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-boolean v1, p0, Ljh1;->y:Z

    .line 62
    .line 63
    if-nez v1, :cond_1

    .line 64
    .line 65
    iget-object v1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    invoke-interface {v1}, Lye4;->M1()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v1

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    :goto_0
    new-instance v1, Lbs2;

    .line 80
    .line 81
    const/16 v3, 0xe

    .line 82
    .line 83
    invoke-direct {v1, v3, p0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Ljh1;->u:Lbs2;

    .line 87
    .line 88
    sget-object v3, Llf4;->l:Li63;

    .line 89
    .line 90
    sget-object v4, Lmz1;->g1:Liz1;

    .line 91
    .line 92
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    invoke-virtual {v3, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 105
    .line 106
    .line 107
    monitor-exit v0

    .line 108
    return-void

    .line 109
    :cond_2
    monitor-exit v0

    .line 110
    goto :goto_2

    .line 111
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    throw v1

    .line 113
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ljh1;->C3()V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_3
    return-void
.end method

.method public final C3()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ljh1;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ljh1;->y:Z

    .line 9
    .line 10
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-object v1, p0, Ljh1;->q:Lm74;

    .line 15
    .line 16
    invoke-interface {v0}, Lag2;->p0()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ljh1;->j:Lr2;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v2, p0, Ljh1;->i:Lag2;

    .line 29
    .line 30
    iget-object v0, v0, Lr2;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroid/content/Context;

    .line 33
    .line 34
    invoke-interface {v2, v0}, Lag2;->M0(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-interface {v0, v2}, Lag2;->P0(Z)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lmz1;->wd:Liz1;

    .line 44
    .line 45
    sget-object v2, Ltw1;->e:Ltw1;

    .line 46
    .line 47
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 62
    .line 63
    invoke-interface {v0}, Lag2;->getParent()Landroid/view/ViewParent;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 70
    .line 71
    invoke-interface {v0}, Lag2;->getParent()Landroid/view/ViewParent;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Landroid/view/ViewGroup;

    .line 76
    .line 77
    iget-object v2, p0, Ljh1;->i:Lag2;

    .line 78
    .line 79
    invoke-interface {v2}, Lag2;->p0()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-object v0, p0, Ljh1;->j:Lr2;

    .line 87
    .line 88
    iget-object v0, v0, Lr2;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/view/ViewGroup;

    .line 91
    .line 92
    iget-object v2, p0, Ljh1;->i:Lag2;

    .line 93
    .line 94
    invoke-interface {v2}, Lag2;->p0()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iget-object v3, p0, Ljh1;->j:Lr2;

    .line 99
    .line 100
    iget v4, v3, Lr2;->g:I

    .line 101
    .line 102
    iget-object v3, v3, Lr2;->h:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v3, Landroid/view/ViewGroup$LayoutParams;

    .line 105
    .line 106
    invoke-virtual {v0, v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    iput-object v1, p0, Ljh1;->j:Lr2;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    iget-object v2, p0, Ljh1;->i:Lag2;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v2, v0}, Lag2;->M0(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    :goto_0
    iput-object v1, p0, Ljh1;->i:Lag2;

    .line 130
    .line 131
    :cond_4
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    iget v1, p0, Ljh1;->B:I

    .line 140
    .line 141
    invoke-interface {v0, v1}, Lye4;->G1(I)V

    .line 142
    .line 143
    .line 144
    :cond_5
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 145
    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    invoke-interface {v0}, Lag2;->k0()Lxz2;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 157
    .line 158
    iget-object v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 159
    .line 160
    invoke-interface {v1}, Lag2;->p0()Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1, v0}, Ljh1;->F3(Landroid/view/View;Lxz2;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    :goto_1
    return-void
.end method

.method public final D(Lu10;)V
    .locals 0

    .line 1
    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/res/Configuration;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljh1;->D3(Landroid/content/res/Configuration;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final D3(Landroid/content/res/Configuration;)V
    .locals 14

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, v0, Lzb4;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    sget-object v3, Lhg4;->C:Lhg4;

    .line 19
    .line 20
    iget-object v3, v3, Lhg4;->f:Lnh4;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v3, Lmz1;->v5:Liz1;

    .line 26
    .line 27
    sget-object v4, Ltw1;->e:Ltw1;

    .line 28
    .line 29
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 30
    .line 31
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 32
    .line 33
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v6, p0, Ljh1;->g:Landroid/app/Activity;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    :goto_1
    move p1, v2

    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    sget-object v3, Lmz1;->x5:Liz1;

    .line 51
    .line 52
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-virtual {v6}, Landroid/app/Activity;->isInMultiWindowMode()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_2
    sget-object v3, Lsv1;->f:Lsv1;

    .line 71
    .line 72
    iget-object v3, v3, Lsv1;->a:Lj63;

    .line 73
    .line 74
    iget v3, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 75
    .line 76
    invoke-static {v6, v3}, Lj63;->b(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    iget p1, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 81
    .line 82
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v7, p1}, Lj63;->m(Landroid/util/DisplayMetrics;I)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    const-string v8, "window"

    .line 99
    .line 100
    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, Landroid/view/WindowManager;

    .line 105
    .line 106
    new-instance v8, Landroid/util/DisplayMetrics;

    .line 107
    .line 108
    invoke-direct {v8}, Landroid/util/DisplayMetrics;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7, v8}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 116
    .line 117
    .line 118
    iget v7, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 119
    .line 120
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 121
    .line 122
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    const-string v10, "dimen"

    .line 127
    .line 128
    const-string v11, "android"

    .line 129
    .line 130
    const-string v12, "status_bar_height"

    .line 131
    .line 132
    invoke-virtual {v9, v12, v10, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-lez v9, :cond_3

    .line 137
    .line 138
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    move v9, v2

    .line 148
    :goto_2
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 157
    .line 158
    float-to-double v10, v10

    .line 159
    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    .line 160
    .line 161
    add-double/2addr v10, v12

    .line 162
    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    .line 163
    .line 164
    .line 165
    move-result-wide v10

    .line 166
    long-to-int v10, v10

    .line 167
    sget-object v11, Lmz1;->t5:Liz1;

    .line 168
    .line 169
    invoke-virtual {v5, v11}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Ljava/lang/Integer;

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    mul-int/2addr v5, v10

    .line 180
    add-int/2addr v3, v9

    .line 181
    sub-int/2addr v7, v3

    .line 182
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-gt v3, v5, :cond_4

    .line 187
    .line 188
    sub-int/2addr v8, p1

    .line 189
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-gt p1, v5, :cond_4

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_4
    move p1, v1

    .line 198
    :goto_3
    iget-boolean v3, p0, Ljh1;->p:Z

    .line 199
    .line 200
    if-eqz v3, :cond_6

    .line 201
    .line 202
    if-nez v0, :cond_6

    .line 203
    .line 204
    sget-object v0, Lmz1;->O0:Liz1;

    .line 205
    .line 206
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_5

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_5
    move p1, v2

    .line 220
    :goto_4
    move v0, p1

    .line 221
    goto :goto_6

    .line 222
    :cond_6
    :goto_5
    if-eqz p1, :cond_7

    .line 223
    .line 224
    sget-object p1, Lmz1;->N0:Liz1;

    .line 225
    .line 226
    invoke-virtual {v4, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    check-cast p1, Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-eqz p1, :cond_5

    .line 237
    .line 238
    :cond_7
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 239
    .line 240
    if-eqz p1, :cond_8

    .line 241
    .line 242
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 243
    .line 244
    if-eqz p1, :cond_8

    .line 245
    .line 246
    iget-boolean p1, p1, Lzb4;->l:Z

    .line 247
    .line 248
    if-eqz p1, :cond_8

    .line 249
    .line 250
    move p1, v1

    .line 251
    goto :goto_4

    .line 252
    :cond_8
    move p1, v1

    .line 253
    move v0, v2

    .line 254
    :goto_6
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    sget-object v5, Lmz1;->n1:Liz1;

    .line 259
    .line 260
    invoke-virtual {v4, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    check-cast v5, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-eqz v5, :cond_b

    .line 271
    .line 272
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    if-eqz p1, :cond_a

    .line 277
    .line 278
    if-eqz v0, :cond_9

    .line 279
    .line 280
    const/16 p1, 0x1706

    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_9
    const/16 p1, 0x1504

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_a
    const/16 p1, 0x100

    .line 287
    .line 288
    move v1, v2

    .line 289
    :goto_7
    invoke-virtual {v5, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 290
    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_b
    const/16 v5, 0x800

    .line 294
    .line 295
    const/16 v6, 0x400

    .line 296
    .line 297
    if-eqz p1, :cond_c

    .line 298
    .line 299
    invoke-virtual {v3, v6}, Landroid/view/Window;->addFlags(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3, v5}, Landroid/view/Window;->clearFlags(I)V

    .line 303
    .line 304
    .line 305
    if-eqz v0, :cond_d

    .line 306
    .line 307
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    const/16 v0, 0x1002

    .line 312
    .line 313
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_c
    invoke-virtual {v3, v5}, Landroid/view/Window;->addFlags(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v6}, Landroid/view/Window;->clearFlags(I)V

    .line 321
    .line 322
    .line 323
    move v1, v2

    .line 324
    :cond_d
    :goto_8
    sget-object p1, Lmz1;->ee:Liz1;

    .line 325
    .line 326
    invoke-virtual {v4, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    check-cast p1, Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    if-eqz p1, :cond_e

    .line 337
    .line 338
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 339
    .line 340
    const/16 v0, 0x22

    .line 341
    .line 342
    if-gt p1, v0, :cond_e

    .line 343
    .line 344
    const/16 v0, 0x1c

    .line 345
    .line 346
    if-lt p1, v0, :cond_e

    .line 347
    .line 348
    if-eqz v1, :cond_e

    .line 349
    .line 350
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {p1}, Loc4;->f(Landroid/view/WindowManager$LayoutParams;)V

    .line 355
    .line 356
    .line 357
    invoke-static {v3, v2}, Lpu1;->n(Landroid/view/Window;Z)V

    .line 358
    .line 359
    .line 360
    :cond_e
    return-void
.end method

.method public final E3(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget-object v1, Lmz1;->J5:Liz1;

    .line 7
    .line 8
    sget-object v2, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Lag2;->W0()Lwz2;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v0, v1, Lwz2;->f:Lcc3;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object v2, Lhg4;->C:Lhg4;

    .line 37
    .line 38
    iget-object v2, v2, Lhg4;->x:Lsu2;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v2, Lsz2;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v2, v0, p1, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lsu2;->t(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :cond_2
    monitor-exit v1

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p1

    .line 59
    :cond_3
    :goto_0
    sget-object v1, Lmz1;->I5:Liz1;

    .line 60
    .line 61
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-interface {v0}, Lag2;->k0()Lxz2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    iget-object v1, v0, Lxz2;->b:Luk1;

    .line 82
    .line 83
    iget-object v1, v1, Luk1;->l:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Lwb3;

    .line 86
    .line 87
    sget-object v2, Lwb3;->g:Lwb3;

    .line 88
    .line 89
    if-ne v1, v2, :cond_4

    .line 90
    .line 91
    sget-object v1, Lhg4;->C:Lhg4;

    .line 92
    .line 93
    iget-object v1, v1, Lhg4;->x:Lsu2;

    .line 94
    .line 95
    iget-object v0, v0, Lxz2;->a:Lxb3;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v1, Lrz2;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-direct {v1, v0, p1, v2}, Lrz2;-><init>(Lxb3;Landroid/view/View;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, Lsu2;->t(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_1
    return-void
.end method

.method public final G3(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->B:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Lmz1;->z5:Liz1;

    .line 9
    .line 10
    sget-object v1, Ltw1;->e:Ltw1;

    .line 11
    .line 12
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget-object v2, Lmz1;->j1:Liz1;

    .line 25
    .line 26
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :cond_1
    move v1, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v1, v2

    .line 47
    :goto_0
    new-instance v4, Le71;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput v2, v4, Le71;->a:I

    .line 53
    .line 54
    iput v2, v4, Le71;->b:I

    .line 55
    .line 56
    iput v2, v4, Le71;->c:I

    .line 57
    .line 58
    const/16 v5, 0x32

    .line 59
    .line 60
    iput v5, v4, Le71;->d:I

    .line 61
    .line 62
    if-eq v3, v1, :cond_3

    .line 63
    .line 64
    move v5, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move v5, v0

    .line 67
    :goto_1
    iput v5, v4, Le71;->a:I

    .line 68
    .line 69
    if-eq v3, v1, :cond_4

    .line 70
    .line 71
    move v2, v0

    .line 72
    :cond_4
    iput v2, v4, Le71;->b:I

    .line 73
    .line 74
    iput v0, v4, Le71;->c:I

    .line 75
    .line 76
    new-instance v0, Ltg4;

    .line 77
    .line 78
    iget-object v2, p0, Ljh1;->g:Landroid/app/Activity;

    .line 79
    .line 80
    invoke-direct {v0, v2, v4, p0}, Ltg4;-><init>(Landroid/content/Context;Le71;Ljh1;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Ljh1;->k:Ltg4;

    .line 84
    .line 85
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 86
    .line 87
    const/4 v2, -0x2

    .line 88
    invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 89
    .line 90
    .line 91
    const/16 v2, 0xa

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 94
    .line 95
    .line 96
    if-eq v3, v1, :cond_5

    .line 97
    .line 98
    const/16 v1, 0x9

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    const/16 v1, 0xb

    .line 102
    .line 103
    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 107
    .line 108
    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->l:Z

    .line 109
    .line 110
    invoke-virtual {p0, p1, v1}, Ljh1;->H3(ZZ)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Ljh1;->q:Lm74;

    .line 114
    .line 115
    iget-object v1, p0, Ljh1;->k:Ltg4;

    .line 116
    .line 117
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Ljh1;->k:Ltg4;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Ljh1;->E3(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final H3(ZZ)V
    .locals 9

    .line 1
    sget-object v0, Lmz1;->h1:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-boolean v0, v0, Lzb4;->m:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v0, v3

    .line 38
    :goto_0
    sget-object v4, Lmz1;->i1:Liz1;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    iget-object v4, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    iget-object v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    iget-boolean v4, v4, Lzb4;->n:Z

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v4, v3

    .line 67
    :goto_1
    if-eqz p1, :cond_2

    .line 68
    .line 69
    if-eqz p2, :cond_2

    .line 70
    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    iget-object p1, p0, Ljh1;->i:Lag2;

    .line 76
    .line 77
    const-string v5, "useCustomClose"

    .line 78
    .line 79
    const-string v6, "Custom close has been disabled for interstitial ads in this ad slot."

    .line 80
    .line 81
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 82
    .line 83
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v8, "message"

    .line 87
    .line 88
    invoke-virtual {v7, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const-string v7, "action"

    .line 93
    .line 94
    invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz p1, :cond_2

    .line 99
    .line 100
    const-string v6, "onError"

    .line 101
    .line 102
    invoke-interface {p1, v6, v5}, Ll52;->c(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catch_0
    move-exception p1

    .line 107
    const-string v5, "Error occurred while dispatching error event."

    .line 108
    .line 109
    invoke-static {v5, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    :goto_2
    iget-object p1, p0, Ljh1;->k:Ltg4;

    .line 113
    .line 114
    if-eqz p1, :cond_6

    .line 115
    .line 116
    if-nez v4, :cond_4

    .line 117
    .line 118
    if-eqz p2, :cond_3

    .line 119
    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    move v2, v3

    .line 124
    :cond_4
    :goto_3
    iget-object p1, p1, Ltg4;->f:Landroid/widget/ImageButton;

    .line 125
    .line 126
    if-eqz v2, :cond_5

    .line 127
    .line 128
    const/16 p2, 0x8

    .line 129
    .line 130
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    sget-object p2, Lmz1;->l1:Liz1;

    .line 134
    .line 135
    invoke-virtual {v1, p2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    check-cast p2, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    const-wide/16 v2, 0x0

    .line 146
    .line 147
    cmp-long p2, v0, v2

    .line 148
    .line 149
    if-lez p2, :cond_6

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_5
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    :cond_6
    return-void
.end method

.method public final I3(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 8
    .line 9
    sget-object v2, Lmz1;->r6:Liz1;

    .line 10
    .line 11
    sget-object v3, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 16
    .line 17
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lt v1, v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 34
    .line 35
    sget-object v2, Lmz1;->s6:Liz1;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-gt v1, v2, :cond_1

    .line 48
    .line 49
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    sget-object v2, Lmz1;->t6:Liz1;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-lt v1, v2, :cond_1

    .line 64
    .line 65
    sget-object v2, Lmz1;->u6:Liz1;

    .line 66
    .line 67
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-le v1, v2, :cond_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    return-void

    .line 81
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    sget-object v0, Lhg4;->C:Lhg4;

    .line 87
    .line 88
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 89
    .line 90
    const-string v1, "AdOverlay.setRequestedOrientation"

    .line 91
    .line 92
    invoke-virtual {v0, v1, p1}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final J3(Z)V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Ljh1;->g:Landroid/app/Activity;

    .line 4
    .line 5
    iget-boolean v0, v1, Ljh1;->w:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2, v3}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1b

    .line 18
    .line 19
    iget-object v4, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 20
    .line 21
    iget-object v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    invoke-interface {v4}, Lag2;->e0()Lsg2;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v4, v5

    .line 32
    :goto_0
    const/4 v6, 0x0

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    iget-object v7, v4, Lsg2;->i:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v7

    .line 38
    :try_start_0
    iget-boolean v4, v4, Lsg2;->v:Z

    .line 39
    .line 40
    monitor-exit v7

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    move v4, v3

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v4, v6

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw v0

    .line 50
    :goto_1
    iput-boolean v6, v1, Ljh1;->r:Z

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    .line 54
    iget-object v7, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 55
    .line 56
    iget v7, v7, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:I

    .line 57
    .line 58
    const/4 v8, 0x6

    .line 59
    if-ne v7, v8, :cond_4

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    iget v7, v7, Landroid/content/res/Configuration;->orientation:I

    .line 70
    .line 71
    if-ne v7, v3, :cond_3

    .line 72
    .line 73
    move v7, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move v7, v6

    .line 76
    :goto_2
    iput-boolean v7, v1, Ljh1;->r:Z

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    const/4 v8, 0x7

    .line 80
    if-ne v7, v8, :cond_6

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    iget v7, v7, Landroid/content/res/Configuration;->orientation:I

    .line 91
    .line 92
    const/4 v8, 0x2

    .line 93
    if-ne v7, v8, :cond_5

    .line 94
    .line 95
    move v7, v3

    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move v7, v6

    .line 98
    :goto_3
    iput-boolean v7, v1, Ljh1;->r:Z

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    move v7, v6

    .line 102
    :goto_4
    invoke-static {v7}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    new-instance v9, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    add-int/lit8 v8, v8, 0x29

    .line 113
    .line 114
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 115
    .line 116
    .line 117
    const-string v8, "Delay onShow to next orientation change: "

    .line 118
    .line 119
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-static {v7}, Lgi2;->U(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v7, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 133
    .line 134
    iget v7, v7, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:I

    .line 135
    .line 136
    invoke-virtual {v1, v7}, Ljh1;->I3(I)V

    .line 137
    .line 138
    .line 139
    const/high16 v7, 0x1000000

    .line 140
    .line 141
    invoke-virtual {v0, v7, v7}, Landroid/view/Window;->setFlags(II)V

    .line 142
    .line 143
    .line 144
    const-string v0, "Hardware acceleration on the AdActivity window enabled."

    .line 145
    .line 146
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-boolean v0, v1, Ljh1;->p:Z

    .line 150
    .line 151
    if-nez v0, :cond_7

    .line 152
    .line 153
    iget-object v0, v1, Ljh1;->q:Lm74;

    .line 154
    .line 155
    const/high16 v7, -0x1000000

    .line 156
    .line 157
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    iget-object v0, v1, Ljh1;->q:Lm74;

    .line 162
    .line 163
    sget v7, Ljh1;->D:I

    .line 164
    .line 165
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 166
    .line 167
    .line 168
    :goto_5
    iget-object v0, v1, Ljh1;->q:Lm74;

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 171
    .line 172
    .line 173
    iput-boolean v3, v1, Ljh1;->w:Z

    .line 174
    .line 175
    if-eqz p1, :cond_e

    .line 176
    .line 177
    :try_start_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 178
    .line 179
    iget-object v0, v0, Lhg4;->d:Lsd2;

    .line 180
    .line 181
    iget-object v0, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 182
    .line 183
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 184
    .line 185
    if-eqz v0, :cond_8

    .line 186
    .line 187
    invoke-interface {v0}, Lag2;->x()Lzq;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    goto :goto_6

    .line 192
    :catch_0
    move-exception v0

    .line 193
    goto/16 :goto_b

    .line 194
    .line 195
    :cond_8
    move-object v0, v5

    .line 196
    :goto_6
    iget-object v7, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 197
    .line 198
    iget-object v7, v7, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 199
    .line 200
    if-eqz v7, :cond_9

    .line 201
    .line 202
    invoke-interface {v7}, Lag2;->V()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    goto :goto_7

    .line 207
    :cond_9
    move-object v7, v5

    .line 208
    :goto_7
    iget-object v8, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 209
    .line 210
    iget-object v9, v8, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->r:Le51;

    .line 211
    .line 212
    iget-object v8, v8, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 213
    .line 214
    if-eqz v8, :cond_a

    .line 215
    .line 216
    invoke-interface {v8}, Lag2;->k()Ll92;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    move-object v11, v8

    .line 221
    goto :goto_8

    .line 222
    :cond_a
    move-object v11, v5

    .line 223
    :goto_8
    new-instance v12, Lcx1;

    .line 224
    .line 225
    invoke-direct {v12}, Lcx1;-><init>()V

    .line 226
    .line 227
    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    move-object v8, v5

    .line 233
    const/4 v5, 0x1

    .line 234
    move v10, v6

    .line 235
    move v6, v4

    .line 236
    move-object v4, v7

    .line 237
    const/4 v7, 0x0

    .line 238
    move-object v13, v8

    .line 239
    const/4 v8, 0x0

    .line 240
    move v14, v10

    .line 241
    const/4 v10, 0x0

    .line 242
    move-object v15, v13

    .line 243
    const/4 v13, 0x0

    .line 244
    move/from16 v18, v14

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    move-object/from16 v19, v15

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    move-object v3, v0

    .line 251
    move/from16 v0, v18

    .line 252
    .line 253
    invoke-static/range {v2 .. v17}, Lsd2;->b(Landroid/content/Context;Lzq;Ljava/lang/String;ZZLvs1;Lf02;Le51;Lkf3;Ll92;Lcx1;La83;Lc83;Lpz2;Lm83;Lmv2;)Lag2;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    iput-object v3, v1, Ljh1;->i:Lag2;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 258
    .line 259
    invoke-interface {v3}, Lag2;->e0()Lsg2;

    .line 260
    .line 261
    .line 262
    move-result-object v20

    .line 263
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 264
    .line 265
    iget-object v4, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->u:Ll32;

    .line 266
    .line 267
    iget-object v5, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->j:Lm32;

    .line 268
    .line 269
    iget-object v7, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->n:Lkf1;

    .line 270
    .line 271
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 272
    .line 273
    if-eqz v3, :cond_b

    .line 274
    .line 275
    invoke-interface {v3}, Lag2;->e0()Lsg2;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    iget-object v3, v3, Lsg2;->B:Lsu1;

    .line 280
    .line 281
    move-object/from16 v28, v3

    .line 282
    .line 283
    goto :goto_9

    .line 284
    :cond_b
    const/16 v28, 0x0

    .line 285
    .line 286
    :goto_9
    const/16 v40, 0x0

    .line 287
    .line 288
    const/16 v41, 0x0

    .line 289
    .line 290
    const/16 v21, 0x0

    .line 291
    .line 292
    const/16 v23, 0x0

    .line 293
    .line 294
    const/16 v26, 0x1

    .line 295
    .line 296
    const/16 v27, 0x0

    .line 297
    .line 298
    const/16 v29, 0x0

    .line 299
    .line 300
    const/16 v30, 0x0

    .line 301
    .line 302
    const/16 v31, 0x0

    .line 303
    .line 304
    const/16 v32, 0x0

    .line 305
    .line 306
    const/16 v33, 0x0

    .line 307
    .line 308
    const/16 v34, 0x0

    .line 309
    .line 310
    const/16 v35, 0x0

    .line 311
    .line 312
    const/16 v36, 0x0

    .line 313
    .line 314
    const/16 v37, 0x0

    .line 315
    .line 316
    const/16 v38, 0x0

    .line 317
    .line 318
    const/16 v39, 0x0

    .line 319
    .line 320
    move-object/from16 v22, v4

    .line 321
    .line 322
    move-object/from16 v24, v5

    .line 323
    .line 324
    move-object/from16 v25, v7

    .line 325
    .line 326
    invoke-virtual/range {v20 .. v41}, Lsg2;->p(Lfd1;Ll32;Lye4;Lm32;Lkf1;ZLe42;Lsu1;Lof3;Lsb2;Ljz2;Leb3;Lmv2;Lz32;Lxp2;Lk32;Lk32;Lz32;Lgj2;Lxv2;Lim2;)V

    .line 327
    .line 328
    .line 329
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 330
    .line 331
    invoke-interface {v3}, Lag2;->e0()Lsg2;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    new-instance v4, Lf23;

    .line 336
    .line 337
    const/16 v5, 0x1d

    .line 338
    .line 339
    invoke-direct {v4, v5, v1}, Lf23;-><init>(ILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    iput-object v4, v3, Lsg2;->l:Lug2;

    .line 343
    .line 344
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 345
    .line 346
    iget-object v4, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->q:Ljava/lang/String;

    .line 347
    .line 348
    if-eqz v4, :cond_c

    .line 349
    .line 350
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 351
    .line 352
    invoke-interface {v3, v4}, Lag2;->loadUrl(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    goto :goto_a

    .line 356
    :cond_c
    iget-object v9, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->m:Ljava/lang/String;

    .line 357
    .line 358
    if-eqz v9, :cond_d

    .line 359
    .line 360
    iget-object v7, v1, Ljh1;->i:Lag2;

    .line 361
    .line 362
    iget-object v8, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->k:Ljava/lang/String;

    .line 363
    .line 364
    const-string v10, "text/html"

    .line 365
    .line 366
    const-string v11, "UTF-8"

    .line 367
    .line 368
    const/4 v12, 0x0

    .line 369
    invoke-interface/range {v7 .. v12}, Lag2;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :goto_a
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 373
    .line 374
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 375
    .line 376
    if-eqz v3, :cond_f

    .line 377
    .line 378
    invoke-interface {v3, v1}, Lag2;->c0(Ljh1;)V

    .line 379
    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_d
    new-instance v0, Lht3;

    .line 383
    .line 384
    const-string v2, "No URL or HTML to display in ad overlay."

    .line 385
    .line 386
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0

    .line 390
    :goto_b
    const-string v2, "Error obtaining webview."

    .line 391
    .line 392
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    new-instance v2, Lht3;

    .line 396
    .line 397
    const-string v3, "Could not obtain webview for the overlay."

    .line 398
    .line 399
    invoke-direct {v2, v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    throw v2

    .line 403
    :cond_e
    move v0, v6

    .line 404
    move v6, v4

    .line 405
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 406
    .line 407
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 408
    .line 409
    iput-object v3, v1, Ljh1;->i:Lag2;

    .line 410
    .line 411
    invoke-interface {v3, v2}, Lag2;->M0(Landroid/content/Context;)V

    .line 412
    .line 413
    .line 414
    :cond_f
    :goto_c
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 415
    .line 416
    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->B:Z

    .line 417
    .line 418
    if-eqz v3, :cond_11

    .line 419
    .line 420
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    iget-object v4, v1, Ljh1;->i:Lag2;

    .line 425
    .line 426
    invoke-interface {v4}, Lag2;->t()Landroid/webkit/WebView;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-virtual {v3, v4, v0}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 431
    .line 432
    .line 433
    sget-object v3, Lmz1;->Y0:Liz1;

    .line 434
    .line 435
    sget-object v4, Ltw1;->e:Ltw1;

    .line 436
    .line 437
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 438
    .line 439
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    check-cast v3, Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    if-eqz v3, :cond_10

    .line 450
    .line 451
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 452
    .line 453
    const/16 v5, 0x1b

    .line 454
    .line 455
    if-lt v3, v5, :cond_10

    .line 456
    .line 457
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 458
    .line 459
    invoke-interface {v3}, Lag2;->t()Landroid/webkit/WebView;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-static {v3}, Lwq;->d(Landroid/webkit/WebView;)V

    .line 464
    .line 465
    .line 466
    :cond_10
    sget-object v3, Lmz1;->Z0:Liz1;

    .line 467
    .line 468
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 469
    .line 470
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    if-eqz v3, :cond_11

    .line 481
    .line 482
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 483
    .line 484
    invoke-interface {v3}, Lag2;->t()Landroid/webkit/WebView;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    sget-object v4, Lox2;->f:Lox2;

    .line 489
    .line 490
    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 491
    .line 492
    .line 493
    :cond_11
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 494
    .line 495
    invoke-interface {v3, v1}, Lag2;->q0(Ljh1;)V

    .line 496
    .line 497
    .line 498
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 499
    .line 500
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 501
    .line 502
    if-eqz v3, :cond_12

    .line 503
    .line 504
    invoke-interface {v3}, Lag2;->k0()Lxz2;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    iget-object v4, v1, Ljh1;->q:Lm74;

    .line 509
    .line 510
    invoke-static {v4, v3}, Ljh1;->F3(Landroid/view/View;Lxz2;)V

    .line 511
    .line 512
    .line 513
    :cond_12
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 514
    .line 515
    iget v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 516
    .line 517
    const/4 v4, 0x5

    .line 518
    if-eq v3, v4, :cond_16

    .line 519
    .line 520
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 521
    .line 522
    invoke-interface {v3}, Lag2;->getParent()Landroid/view/ViewParent;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    instance-of v5, v3, Landroid/view/ViewGroup;

    .line 527
    .line 528
    if-eqz v5, :cond_13

    .line 529
    .line 530
    check-cast v3, Landroid/view/ViewGroup;

    .line 531
    .line 532
    iget-object v5, v1, Ljh1;->i:Lag2;

    .line 533
    .line 534
    invoke-interface {v5}, Lag2;->p0()Landroid/view/View;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 539
    .line 540
    .line 541
    :cond_13
    iget-boolean v3, v1, Ljh1;->p:Z

    .line 542
    .line 543
    if-eqz v3, :cond_14

    .line 544
    .line 545
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 546
    .line 547
    invoke-interface {v3}, Lag2;->L()V

    .line 548
    .line 549
    .line 550
    :cond_14
    iget-object v3, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 551
    .line 552
    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->B:Z

    .line 553
    .line 554
    const/4 v5, -0x1

    .line 555
    if-eqz v3, :cond_15

    .line 556
    .line 557
    new-instance v3, Landroid/widget/Toolbar;

    .line 558
    .line 559
    invoke-direct {v3, v2}, Landroid/widget/Toolbar;-><init>(Landroid/content/Context;)V

    .line 560
    .line 561
    .line 562
    iput-object v3, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 563
    .line 564
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V

    .line 569
    .line 570
    .line 571
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 572
    .line 573
    invoke-interface {v3}, Lag2;->p0()Landroid/view/View;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 578
    .line 579
    .line 580
    move-result v7

    .line 581
    invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V

    .line 582
    .line 583
    .line 584
    iget-object v3, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 585
    .line 586
    const v7, -0xbbbbbc

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 590
    .line 591
    .line 592
    iget-object v3, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 593
    .line 594
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 595
    .line 596
    .line 597
    :try_start_2
    sget-object v3, Lhg4;->C:Lhg4;

    .line 598
    .line 599
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 600
    .line 601
    invoke-virtual {v3}, Lgd2;->c()Landroid/content/res/Resources;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    const v7, 0x7f080079

    .line 606
    .line 607
    .line 608
    const/4 v15, 0x0

    .line 609
    invoke-virtual {v3, v7, v15}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    iget-object v7, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 614
    .line 615
    invoke-virtual {v7, v3}, Landroid/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 616
    .line 617
    .line 618
    goto :goto_d

    .line 619
    :catch_1
    invoke-static {}, Lgi2;->R()Z

    .line 620
    .line 621
    .line 622
    :goto_d
    iget-object v3, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 623
    .line 624
    iget-object v7, v1, Ljh1;->t:Lm1;

    .line 625
    .line 626
    invoke-virtual {v3, v7}, Landroid/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 627
    .line 628
    .line 629
    iget-object v3, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 630
    .line 631
    invoke-virtual {v3, v0}, Landroid/widget/Toolbar;->setTitleMarginStart(I)V

    .line 632
    .line 633
    .line 634
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 635
    .line 636
    const/4 v3, -0x2

    .line 637
    invoke-direct {v0, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 638
    .line 639
    .line 640
    const/16 v7, 0xa

    .line 641
    .line 642
    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 643
    .line 644
    .line 645
    iget-object v7, v1, Ljh1;->q:Lm74;

    .line 646
    .line 647
    iget-object v8, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 648
    .line 649
    invoke-virtual {v7, v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 650
    .line 651
    .line 652
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 653
    .line 654
    invoke-direct {v0, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 655
    .line 656
    .line 657
    iget-object v3, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 658
    .line 659
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    const/4 v5, 0x3

    .line 664
    invoke-virtual {v0, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 665
    .line 666
    .line 667
    const/16 v3, 0xc

    .line 668
    .line 669
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 670
    .line 671
    .line 672
    iget-object v3, v1, Ljh1;->q:Lm74;

    .line 673
    .line 674
    iget-object v5, v1, Ljh1;->i:Lag2;

    .line 675
    .line 676
    invoke-interface {v5}, Lag2;->p0()Landroid/view/View;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    invoke-virtual {v3, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 681
    .line 682
    .line 683
    iget-object v0, v1, Ljh1;->A:Landroid/widget/Toolbar;

    .line 684
    .line 685
    invoke-virtual {v1, v0}, Ljh1;->E3(Landroid/view/View;)V

    .line 686
    .line 687
    .line 688
    goto :goto_e

    .line 689
    :cond_15
    iget-object v0, v1, Ljh1;->q:Lm74;

    .line 690
    .line 691
    iget-object v3, v1, Ljh1;->i:Lag2;

    .line 692
    .line 693
    invoke-interface {v3}, Lag2;->p0()Landroid/view/View;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v0, v3, v5, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 698
    .line 699
    .line 700
    :cond_16
    :goto_e
    if-nez p1, :cond_17

    .line 701
    .line 702
    iget-boolean v0, v1, Ljh1;->r:Z

    .line 703
    .line 704
    if-nez v0, :cond_17

    .line 705
    .line 706
    iget-object v0, v1, Ljh1;->i:Lag2;

    .line 707
    .line 708
    invoke-interface {v0}, Lag2;->P()V

    .line 709
    .line 710
    .line 711
    :cond_17
    iget-object v0, v1, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 712
    .line 713
    iget v3, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 714
    .line 715
    if-eq v3, v4, :cond_18

    .line 716
    .line 717
    invoke-virtual {v1, v6}, Ljh1;->G3(Z)V

    .line 718
    .line 719
    .line 720
    iget-object v0, v1, Ljh1;->i:Lag2;

    .line 721
    .line 722
    invoke-interface {v0}, Lag2;->a1()Z

    .line 723
    .line 724
    .line 725
    move-result v0

    .line 726
    if-eqz v0, :cond_19

    .line 727
    .line 728
    const/4 v0, 0x1

    .line 729
    invoke-virtual {v1, v6, v0}, Ljh1;->H3(ZZ)V

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :cond_18
    iget-object v3, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->v:Ljava/lang/String;

    .line 734
    .line 735
    iget-object v4, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->w:Ljava/lang/String;

    .line 736
    .line 737
    new-instance v5, Liz2;

    .line 738
    .line 739
    invoke-direct {v5, v2, v1, v3, v4}, Liz2;-><init>(Landroid/app/Activity;Ljh1;Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    if-eqz v0, :cond_1a

    .line 743
    .line 744
    :try_start_3
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->A:Lw82;

    .line 745
    .line 746
    if-eqz v0, :cond_1a

    .line 747
    .line 748
    new-instance v2, Loi0;

    .line 749
    .line 750
    invoke-direct {v2, v5}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    invoke-interface {v0, v2}, Lw82;->R(Lu10;)V

    .line 754
    .line 755
    .line 756
    :cond_19
    return-void

    .line 757
    :cond_1a
    new-instance v0, Lht3;

    .line 758
    .line 759
    const-string v2, "noioou"

    .line 760
    .line 761
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    throw v0
    :try_end_3
    .catch Lht3; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2

    .line 765
    :catch_2
    move-exception v0

    .line 766
    goto :goto_f

    .line 767
    :catch_3
    move-exception v0

    .line 768
    :goto_f
    new-instance v2, Lht3;

    .line 769
    .line 770
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    invoke-direct {v2, v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 775
    .line 776
    .line 777
    throw v2

    .line 778
    :cond_1b
    new-instance v0, Lht3;

    .line 779
    .line 780
    const-string v2, "Invalid activity, no window available."

    .line 781
    .line 782
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    throw v0
.end method

.method public final O1(I[Ljava/lang/String;[I)V
    .locals 4

    .line 1
    const/16 v0, 0x3039

    .line 2
    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    iget-object p1, p0, Ljh1;->g:Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 10
    .line 11
    iget v1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v3

    .line 20
    :goto_0
    new-instance v2, Liz2;

    .line 21
    .line 22
    invoke-direct {v2, p1, v1, v3, v3}, Liz2;-><init>(Landroid/app/Activity;Ljh1;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object p1, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->A:Lw82;

    .line 26
    .line 27
    new-instance v0, Loi0;

    .line 28
    .line 29
    invoke-direct {v0, v2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, p2, p3, v0}, Lw82;->U2([Ljava/lang/String;[ILu10;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 37
    .line 38
    const-string p2, "Null activity"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :catch_0
    :cond_2
    return-void
.end method

.method public final S()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lye4;->m2()V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, Lmz1;->w5:Liz1;

    .line 13
    .line 14
    sget-object v1, Ltw1;->e:Ltw1;

    .line 15
    .line 16
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Ljh1;->j:Lr2;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 47
    .line 48
    invoke-interface {v0}, Lag2;->onPause()V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Ljh1;->B3()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final V1(IILandroid/content/Intent;)V
    .locals 3

    .line 1
    const/16 v0, 0xec

    .line 2
    .line 3
    if-ne p1, v0, :cond_4

    .line 4
    .line 5
    sget-object p1, Lmz1;->Ud:Liz1;

    .line 6
    .line 7
    sget-object v0, Ltw1;->e:Ltw1;

    .line 8
    .line 9
    iget-object v1, v0, Ltw1;->c:Lkz1;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x42

    .line 34
    .line 35
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const-string v1, "Callback from intent launch with requestCode: 236 and resultCode: "

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Lgi2;->G(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Ljh1;->i:Lag2;

    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-interface {v1}, Lag2;->e0()Lsg2;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-interface {v1}, Lag2;->e0()Lsg2;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v1, v1, Lsg2;->E:Lmv2;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    iget-object v2, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 73
    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

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
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-virtual {v1}, Lmv2;->a()Llv2;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "action"

    .line 95
    .line 96
    const-string v1, "hilca"

    .line 97
    .line 98
    invoke-virtual {p1, v0, v1}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->v:Ljava/lang/String;

    .line 102
    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    const-string v0, ""

    .line 106
    .line 107
    :cond_1
    const-string v1, "gqi"

    .line 108
    .line 109
    invoke-virtual {p1, v1, v0}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    new-instance v1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "hilr"

    .line 133
    .line 134
    invoke-virtual {p1, v1, v0}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 v0, -0x1

    .line 138
    if-ne p2, v0, :cond_3

    .line 139
    .line 140
    if-eqz p3, :cond_3

    .line 141
    .line 142
    const-string p2, "callerPackage"

    .line 143
    .line 144
    invoke-virtual {p3, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    const-string v0, "loadingStage"

    .line 149
    .line 150
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    if-eqz p2, :cond_2

    .line 155
    .line 156
    const-string v0, "hilcp"

    .line 157
    .line 158
    invoke-virtual {p1, v0, p2}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_2
    if-eqz p3, :cond_3

    .line 162
    .line 163
    const-string p2, "hills"

    .line 164
    .line 165
    invoke-virtual {p1, p2, p3}, Llv2;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    invoke-virtual {p1}, Llv2;->o()V

    .line 169
    .line 170
    .line 171
    :cond_4
    :goto_0
    return-void
.end method

.method public X2(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget v0, p0, Ljh1;->C:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ljh1;->w:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-string v2, "com.google.android.gms.ads.internal.overlay.hasResumed"

    .line 20
    .line 21
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move v2, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v0

    .line 30
    :goto_0
    iput-boolean v2, p0, Ljh1;->o:Z

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    :try_start_0
    iget-object v3, p0, Ljh1;->g:Landroid/app/Activity;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->a(Landroid/content/Intent;)Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iput-object v4, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 44
    .line 45
    if-eqz v4, :cond_13

    .line 46
    .line 47
    iget-boolean v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->B:Z

    .line 48
    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v5, 0x1c

    .line 54
    .line 55
    if-lt v4, v5, :cond_2

    .line 56
    .line 57
    invoke-static {v3}, Lwq;->c(Landroid/app/Activity;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_2
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const/high16 v5, 0x80000

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Landroid/view/Window;->addFlags(I)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_1
    iget-object v4, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 74
    .line 75
    iget-object v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->r:Le51;

    .line 76
    .line 77
    iget v4, v4, Le51;->h:I

    .line 78
    .line 79
    const v5, 0x7270e0

    .line 80
    .line 81
    .line 82
    if-le v4, v5, :cond_4

    .line 83
    .line 84
    iput v2, p0, Ljh1;->B:I

    .line 85
    .line 86
    :cond_4
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-string v5, "shouldCallOnOverlayOpened"

    .line 97
    .line 98
    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iput-boolean v4, p0, Ljh1;->z:Z

    .line 103
    .line 104
    :cond_5
    iget-object v4, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 105
    .line 106
    iget-object v5, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->t:Lzb4;

    .line 107
    .line 108
    const/4 v6, 0x5

    .line 109
    if-eqz v5, :cond_6

    .line 110
    .line 111
    iget-boolean v7, v5, Lzb4;->f:Z

    .line 112
    .line 113
    iput-boolean v7, p0, Ljh1;->p:Z

    .line 114
    .line 115
    if-eqz v7, :cond_8

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    iget v7, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 119
    .line 120
    if-ne v7, v6, :cond_7

    .line 121
    .line 122
    iput-boolean v1, p0, Ljh1;->p:Z

    .line 123
    .line 124
    :goto_2
    iget v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 125
    .line 126
    if-eq v4, v6, :cond_8

    .line 127
    .line 128
    iget v4, v5, Lzb4;->k:I

    .line 129
    .line 130
    const/4 v5, -0x1

    .line 131
    if-eq v4, v5, :cond_8

    .line 132
    .line 133
    new-instance v4, Lgc2;

    .line 134
    .line 135
    invoke-direct {v4, p0}, Lgc2;-><init>(Ljh1;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Lf74;->r1()Ln70;

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    iput-boolean v0, p0, Ljh1;->p:Z

    .line 143
    .line 144
    :cond_8
    :goto_3
    if-nez p1, :cond_d

    .line 145
    .line 146
    iget-boolean p1, p0, Ljh1;->z:Z

    .line 147
    .line 148
    if-eqz p1, :cond_b

    .line 149
    .line 150
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->y:Lan2;

    .line 153
    .line 154
    if-eqz p1, :cond_a

    .line 155
    .line 156
    monitor-enter p1
    :try_end_0
    .catch Lht3; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :try_start_1
    iget-object v4, p1, Lan2;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 158
    .line 159
    if-eqz v4, :cond_9

    .line 160
    .line 161
    invoke-interface {v4, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    goto :goto_5

    .line 167
    :cond_9
    :goto_4
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catch Lht3; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    goto :goto_6

    .line 169
    :goto_5
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    :try_start_4
    throw v0

    .line 171
    :cond_a
    :goto_6
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 172
    .line 173
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 174
    .line 175
    if-eqz p1, :cond_b

    .line 176
    .line 177
    invoke-interface {p1}, Lye4;->f()V

    .line 178
    .line 179
    .line 180
    :cond_b
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 181
    .line 182
    iget v4, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 183
    .line 184
    if-eq v4, v1, :cond_d

    .line 185
    .line 186
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->g:Lfd1;

    .line 187
    .line 188
    if-eqz p1, :cond_c

    .line 189
    .line 190
    invoke-interface {p1}, Lfd1;->C()V

    .line 191
    .line 192
    .line 193
    :cond_c
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 194
    .line 195
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->z:Lxp2;

    .line 196
    .line 197
    if-eqz p1, :cond_d

    .line 198
    .line 199
    invoke-interface {p1}, Lxp2;->s0()V

    .line 200
    .line 201
    .line 202
    :cond_d
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 203
    .line 204
    if-eqz p1, :cond_e

    .line 205
    .line 206
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 207
    .line 208
    if-eqz p1, :cond_e

    .line 209
    .line 210
    invoke-interface {p1}, Lye4;->f3()V

    .line 211
    .line 212
    .line 213
    :cond_e
    new-instance p1, Lm74;

    .line 214
    .line 215
    iget-object v4, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 216
    .line 217
    iget-object v5, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->s:Ljava/lang/String;

    .line 218
    .line 219
    iget-object v7, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->r:Le51;

    .line 220
    .line 221
    iget-object v7, v7, Le51;->f:Ljava/lang/String;

    .line 222
    .line 223
    iget-object v4, v4, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->x:Ljava/lang/String;

    .line 224
    .line 225
    invoke-direct {p1, v3, v5, v7, v4}, Lm74;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iput-object p1, p0, Ljh1;->q:Lm74;

    .line 229
    .line 230
    const/16 v4, 0x3e8

    .line 231
    .line 232
    invoke-virtual {p1, v4}, Landroid/view/View;->setId(I)V

    .line 233
    .line 234
    .line 235
    sget-object p1, Lhg4;->C:Lhg4;

    .line 236
    .line 237
    iget-object p1, p1, Lhg4;->f:Lnh4;

    .line 238
    .line 239
    invoke-virtual {p1, v3}, Lbd2;->V(Landroid/app/Activity;)V

    .line 240
    .line 241
    .line 242
    iget-object p1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 243
    .line 244
    iget v3, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 245
    .line 246
    if-eq v3, v1, :cond_12

    .line 247
    .line 248
    const/4 v4, 0x2

    .line 249
    if-eq v3, v4, :cond_11

    .line 250
    .line 251
    const/4 p1, 0x3

    .line 252
    if-eq v3, p1, :cond_10

    .line 253
    .line 254
    if-ne v3, v6, :cond_f

    .line 255
    .line 256
    invoke-virtual {p0, v0}, Ljh1;->J3(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_f
    new-instance p1, Lht3;

    .line 261
    .line 262
    const-string v0, "Could not determine ad overlay type."

    .line 263
    .line 264
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :cond_10
    invoke-virtual {p0, v1}, Ljh1;->J3(Z)V

    .line 269
    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_11
    new-instance v1, Lr2;

    .line 273
    .line 274
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->i:Lag2;

    .line 275
    .line 276
    invoke-direct {v1, p1}, Lr2;-><init>(Lag2;)V

    .line 277
    .line 278
    .line 279
    iput-object v1, p0, Ljh1;->j:Lr2;

    .line 280
    .line 281
    invoke-virtual {p0, v0}, Ljh1;->J3(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_12
    invoke-virtual {p0, v0}, Ljh1;->J3(Z)V

    .line 286
    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_13
    new-instance p1, Lht3;

    .line 290
    .line 291
    const-string v0, "Could not get info for ad overlay."

    .line 292
    .line 293
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p1
    :try_end_4
    .catch Lht3; {:try_start_4 .. :try_end_4} :catch_0

    .line 297
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    iput v2, p0, Ljh1;->B:I

    .line 305
    .line 306
    iget-object p1, p0, Ljh1;->g:Landroid/app/Activity;

    .line 307
    .line 308
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 309
    .line 310
    .line 311
    :goto_8
    return-void

    .line 312
    :pswitch_0
    const-string p1, "AdOverlayParcel is null or does not contain valid overlay type."

    .line 313
    .line 314
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const/4 p1, 0x4

    .line 318
    iput p1, p0, Ljh1;->B:I

    .line 319
    .line 320
    iget-object p1, p0, Ljh1;->g:Landroid/app/Activity;

    .line 321
    .line 322
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ljh1;->B:I

    .line 3
    .line 4
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lye4;->R2()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final c0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    .line 2
    .line 3
    iget-boolean v1, p0, Ljh1;->o:Z

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e()Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ljh1;->B:I

    .line 3
    .line 4
    iget-object v1, p0, Ljh1;->i:Lag2;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    sget-object v0, Lmz1;->I9:Liz1;

    .line 10
    .line 11
    sget-object v1, Ltw1;->e:Ltw1;

    .line 12
    .line 13
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 28
    .line 29
    invoke-interface {v0}, Lag2;->canGoBack()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 37
    .line 38
    invoke-interface {v0}, Lag2;->goBack()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    return v0

    .line 43
    :cond_2
    :goto_0
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 44
    .line 45
    invoke-interface {v0}, Lag2;->R0()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-object v1, p0, Ljh1;->i:Lag2;

    .line 52
    .line 53
    const-string v2, "onbackblocked"

    .line 54
    .line 55
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v1, v2, v3}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    return v0
.end method

.method public final g()V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->w5:Liz1;

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
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Lag2;->o0()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 30
    .line 31
    invoke-interface {v0}, Lag2;->onResume()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v0, "The webview does not exist. Ignoring action."

    .line 36
    .line 37
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Lye4;->Y()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljh1;->r()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lye4;->U()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lmz1;->w5:Liz1;

    .line 16
    .line 17
    sget-object v1, Ltw1;->e:Ltw1;

    .line 18
    .line 19
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Ljh1;->j:Lr2;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 50
    .line 51
    invoke-interface {v0}, Lag2;->onPause()V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p0}, Ljh1;->B3()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lye4;->E1()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lye4;->B1()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0, v0}, Ljh1;->D3(Landroid/content/res/Configuration;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lmz1;->w5:Liz1;

    .line 26
    .line 27
    sget-object v1, Ltw1;->e:Ltw1;

    .line 28
    .line 29
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Lag2;->o0()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 54
    .line 55
    invoke-interface {v0}, Lag2;->onResume()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const-string v0, "The webview does not exist. Ignoring action."

    .line 60
    .line 61
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Ljh1;->l:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljh1;->I3(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Ljh1;->m:Landroid/widget/FrameLayout;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 20
    .line 21
    iget-object v2, p0, Ljh1;->q:Lm74;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Ljh1;->w:Z

    .line 28
    .line 29
    iget-object v0, p0, Ljh1;->m:Landroid/widget/FrameLayout;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Ljh1;->m:Landroid/widget/FrameLayout;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Ljh1;->n:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Ljh1;->n:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 44
    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Ljh1;->l:Z

    .line 47
    .line 48
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ljh1;->w:Z

    .line 3
    .line 4
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->h:Lye4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lye4;->h3()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object v1, p0, Ljh1;->q:Lm74;

    .line 17
    .line 18
    invoke-interface {v0}, Lag2;->p0()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :catch_0
    :cond_1
    invoke-virtual {p0}, Ljh1;->B3()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final y()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ljh1;->B:I

    .line 3
    .line 4
    iget-object v0, p0, Ljh1;->g:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ljh1;->h:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v1, v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->p:I

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ljh1;->i:Lag2;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-interface {v0, v1}, Lag2;->q0(Ljh1;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method
