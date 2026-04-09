.class public final Lt81;
.super Lm54;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lp1;


# static fields
.field public static final E:Landroid/view/animation/AccelerateInterpolator;

.field public static final F:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field public A:Z

.field public final B:Lr81;

.field public final C:Lr81;

.field public final D:Lf20;

.field public g:Landroid/content/Context;

.field public h:Landroid/content/Context;

.field public i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public j:Landroidx/appcompat/widget/ActionBarContainer;

.field public k:Lwm;

.field public l:Landroidx/appcompat/widget/ActionBarContextView;

.field public final m:Landroid/view/View;

.field public n:Z

.field public o:Ls81;

.field public p:Ls81;

.field public q:Lvq2;

.field public r:Z

.field public final s:Ljava/util/ArrayList;

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Lx61;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt81;->E:Landroid/view/animation/AccelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lt81;->F:Landroid/view/animation/DecelerateInterpolator;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt81;->s:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lt81;->t:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lt81;->u:Z

    .line 6
    iput-boolean v0, p0, Lt81;->x:Z

    .line 7
    new-instance v0, Lr81;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr81;-><init>(Lt81;I)V

    iput-object v0, p0, Lt81;->B:Lr81;

    .line 8
    new-instance v0, Lr81;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lr81;-><init>(Lt81;I)V

    iput-object v0, p0, Lt81;->C:Lr81;

    .line 9
    new-instance v0, Lf20;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0}, Lf20;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lt81;->D:Lf20;

    .line 10
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lt81;->j0(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lt81;->m:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt81;->s:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lt81;->t:I

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lt81;->u:Z

    .line 19
    iput-boolean v0, p0, Lt81;->x:Z

    .line 20
    new-instance v0, Lr81;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr81;-><init>(Lt81;I)V

    iput-object v0, p0, Lt81;->B:Lr81;

    .line 21
    new-instance v0, Lr81;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lr81;-><init>(Lt81;I)V

    iput-object v0, p0, Lt81;->C:Lr81;

    .line 22
    new-instance v0, Lf20;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0}, Lf20;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lt81;->D:Lf20;

    .line 23
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt81;->j0(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt81;->k:Lwm;

    .line 2
    .line 3
    check-cast v0, Lh21;

    .line 4
    .line 5
    iget-boolean v1, v0, Lh21;->g:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 10
    .line 11
    iput-object p1, v0, Lh21;->h:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iget v2, v0, Lh21;->b:I

    .line 14
    .line 15
    and-int/lit8 v2, v2, 0x8

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v0, v0, Lh21;->g:Z

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0, p1}, Le61;->m(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final B(Lvq2;)Lc2;
    .locals 2

    .line 1
    iget-object v0, p0, Lt81;->o:Ls81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ls81;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ls81;

    .line 20
    .line 21
    iget-object v1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, p0, v1, p1}, Ls81;-><init>(Lt81;Landroid/content/Context;Lvq2;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, Ls81;->i:Lod0;

    .line 31
    .line 32
    invoke-virtual {p1}, Lod0;->w()V

    .line 33
    .line 34
    .line 35
    :try_start_0
    iget-object v1, v0, Ls81;->j:Lvq2;

    .line 36
    .line 37
    iget-object v1, v1, Lvq2;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lp21;

    .line 40
    .line 41
    invoke-virtual {v1, v0, p1}, Lp21;->w(Lc2;Landroid/view/Menu;)Z

    .line 42
    .line 43
    .line 44
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-virtual {p1}, Lod0;->v()V

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iput-object v0, p0, Lt81;->o:Ls81;

    .line 51
    .line 52
    invoke-virtual {v0}, Ls81;->h()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lc2;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    invoke-virtual {p0, p1}, Lt81;->i0(Z)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    return-object p1

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    invoke-virtual {p1}, Lod0;->v()V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt81;->k:Lwm;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Lh21;

    .line 7
    .line 8
    iget-object v1, v1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->R:Lb21;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v1, v1, Lb21;->g:Lsd0;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    check-cast v0, Lh21;

    .line 19
    .line 20
    iget-object v0, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->R:Lb21;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, v0, Lb21;->g:Lsd0;

    .line 29
    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lsd0;->collapseActionView()Z

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public final d(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt81;->r:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lt81;->r:Z

    .line 7
    .line 8
    iget-object p1, p0, Lt81;->s:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/lang/ClassCastException;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public final g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lt81;->k:Lwm;

    .line 2
    .line 3
    check-cast v0, Lh21;

    .line 4
    .line 5
    iget v0, v0, Lh21;->b:I

    .line 6
    .line 7
    return v0
.end method

.method public final i0(Z)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-boolean v1, p0, Lt81;->w:Z

    .line 5
    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lt81;->w:Z

    .line 10
    .line 11
    iget-object v2, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Lt81;->l0(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-boolean v1, p0, Lt81;->w:Z

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iput-boolean v0, p0, Lt81;->w:Z

    .line 27
    .line 28
    iget-object v1, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0, v0}, Lt81;->l0(Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    :goto_0
    iget-object v1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x8

    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    if-eqz v1, :cond_7

    .line 48
    .line 49
    const-wide/16 v4, 0xc8

    .line 50
    .line 51
    const-wide/16 v6, 0x64

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 56
    .line 57
    check-cast p1, Lh21;

    .line 58
    .line 59
    iget-object v1, p1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 60
    .line 61
    invoke-static {v1}, Le61;->a(Landroid/view/View;)Lw61;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {v1, v2}, Lw61;->a(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v6, v7}, Lw61;->c(J)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lg21;

    .line 73
    .line 74
    invoke-direct {v2, p1, v3}, Lg21;-><init>(Lh21;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lw61;->d(Ly61;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 81
    .line 82
    invoke-virtual {p1, v0, v4, v5}, Landroidx/appcompat/widget/ActionBarContextView;->i(IJ)Lw61;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 88
    .line 89
    check-cast p1, Lh21;

    .line 90
    .line 91
    iget-object v1, p1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 92
    .line 93
    invoke-static {v1}, Le61;->a(Landroid/view/View;)Lw61;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/high16 v3, 0x3f800000    # 1.0f

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Lw61;->a(F)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v4, v5}, Lw61;->c(J)V

    .line 103
    .line 104
    .line 105
    new-instance v3, Lg21;

    .line 106
    .line 107
    invoke-direct {v3, p1, v0}, Lg21;-><init>(Lh21;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3}, Lw61;->d(Ly61;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 114
    .line 115
    invoke-virtual {p1, v2, v6, v7}, Landroidx/appcompat/widget/ActionBarContextView;->i(IJ)Lw61;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    move-object v8, v1

    .line 120
    move-object v1, p1

    .line 121
    move-object p1, v8

    .line 122
    :goto_1
    new-instance v0, Lx61;

    .line 123
    .line 124
    invoke-direct {v0}, Lx61;-><init>()V

    .line 125
    .line 126
    .line 127
    iget-object v2, v0, Lx61;->a:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget-object v1, v1, Lw61;->a:Ljava/lang/ref/WeakReference;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Landroid/view/View;

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    .line 147
    .line 148
    .line 149
    move-result-wide v3

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    const-wide/16 v3, 0x0

    .line 152
    .line 153
    :goto_2
    iget-object v1, p1, Lw61;->a:Ljava/lang/ref/WeakReference;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Landroid/view/View;

    .line 160
    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 168
    .line 169
    .line 170
    :cond_6
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lx61;->b()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_7
    if-eqz p1, :cond_8

    .line 178
    .line 179
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 180
    .line 181
    check-cast p1, Lh21;

    .line 182
    .line 183
    iget-object p1, p1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 184
    .line 185
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 189
    .line 190
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_8
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 195
    .line 196
    check-cast p1, Lh21;

    .line 197
    .line 198
    iget-object p1, p1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 199
    .line 200
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    iget-object p1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 204
    .line 205
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public final j0(Landroid/view/View;)V
    .locals 6

    .line 1
    const v0, 0x7f0900cf

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 9
    .line 10
    iput-object v0, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Lp1;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const v0, 0x7f090035

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Lwm;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Lwm;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    .line 32
    .line 33
    if-eqz v1, :cond_8

    .line 34
    .line 35
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lwm;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    iput-object v0, p0, Lt81;->k:Lwm;

    .line 42
    .line 43
    const v0, 0x7f09003d

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 51
    .line 52
    iput-object v0, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 53
    .line 54
    const v0, 0x7f090037

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    .line 62
    .line 63
    iput-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 64
    .line 65
    iget-object v0, p0, Lt81;->k:Lwm;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    iget-object v1, p0, Lt81;->l:Landroidx/appcompat/widget/ActionBarContextView;

    .line 70
    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    if-eqz p1, :cond_7

    .line 74
    .line 75
    check-cast v0, Lh21;

    .line 76
    .line 77
    iget-object p1, v0, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lt81;->g:Landroid/content/Context;

    .line 84
    .line 85
    iget-object v0, p0, Lt81;->k:Lwm;

    .line 86
    .line 87
    check-cast v0, Lh21;

    .line 88
    .line 89
    iget v0, v0, Lh21;->b:I

    .line 90
    .line 91
    and-int/lit8 v0, v0, 0x4

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    const/4 v2, 0x0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    move v0, v1

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move v0, v2

    .line 100
    :goto_1
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iput-boolean v1, p0, Lt81;->n:Z

    .line 103
    .line 104
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 109
    .line 110
    const/16 v4, 0xe

    .line 111
    .line 112
    iget-object v0, p0, Lt81;->k:Lwm;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const/high16 v0, 0x7f050000

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {p0, p1}, Lt81;->k0(Z)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lt81;->g:Landroid/content/Context;

    .line 131
    .line 132
    sget-object v0, Lhn0;->a:[I

    .line 133
    .line 134
    const v3, 0x7f040007

    .line 135
    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-virtual {p1, v5, v0, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    iget-object v0, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 149
    .line 150
    iget-boolean v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Z

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    iput-boolean v1, p0, Lt81;->A:Z

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    .line 163
    .line 164
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_5
    :goto_2
    const/16 v0, 0xc

    .line 169
    .line 170
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    int-to-float v0, v0

    .line 177
    iget-object v1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 178
    .line 179
    sget-object v2, Le61;->a:Ljava/util/WeakHashMap;

    .line 180
    .line 181
    invoke-static {v1, v0}, Lt51;->s(Landroid/view/View;F)V

    .line 182
    .line 183
    .line 184
    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-class v0, Lt81;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v1, " can only be used with a compatible window decor layout"

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 207
    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_3

    .line 219
    :cond_9
    const-string v0, "null"

    .line 220
    .line 221
    :goto_3
    const-string v1, "Can\'t make a decor toolbar out of "

    .line 222
    .line 223
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p1
.end method

.method public final k0(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 5
    .line 6
    check-cast p1, Lh21;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lit0;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lit0;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 23
    .line 24
    check-cast p1, Lh21;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lt81;->k:Lwm;

    .line 35
    .line 36
    check-cast p1, Lh21;

    .line 37
    .line 38
    iget-object p1, p1, Lh21;->a:Landroidx/appcompat/widget/Toolbar;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final l0(Z)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lt81;->v:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lt81;->w:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-wide/16 v3, 0xfa

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/high16 v6, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iget-object v7, p0, Lt81;->D:Lf20;

    .line 12
    .line 13
    iget-object v8, p0, Lt81;->m:Landroid/view/View;

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    if-eqz v0, :cond_c

    .line 22
    .line 23
    iget-boolean v0, p0, Lt81;->x:Z

    .line 24
    .line 25
    if-eqz v0, :cond_19

    .line 26
    .line 27
    iput-boolean v10, p0, Lt81;->x:Z

    .line 28
    .line 29
    iget-object v0, p0, Lt81;->y:Lx61;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lx61;->a()V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget v0, p0, Lt81;->t:I

    .line 37
    .line 38
    iget-object v1, p0, Lt81;->B:Lr81;

    .line 39
    .line 40
    if-nez v0, :cond_b

    .line 41
    .line 42
    iget-boolean v0, p0, Lt81;->z:Z

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    if-eqz p1, :cond_b

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Landroid/view/View;->setAlpha(F)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 54
    .line 55
    invoke-virtual {v0, v9}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lx61;

    .line 59
    .line 60
    invoke-direct {v0}, Lx61;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object v6, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 64
    .line 65
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    neg-int v6, v6

    .line 70
    int-to-float v6, v6

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    filled-new-array {v10, v10}, [I

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v10, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 78
    .line 79
    invoke-virtual {v10, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 80
    .line 81
    .line 82
    aget p1, p1, v9

    .line 83
    .line 84
    int-to-float p1, p1

    .line 85
    sub-float/2addr v6, p1

    .line 86
    :cond_3
    iget-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 87
    .line 88
    invoke-static {p1}, Le61;->a(Landroid/view/View;)Lw61;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v6}, Lw61;->e(F)V

    .line 93
    .line 94
    .line 95
    iget-object v9, p1, Lw61;->a:Ljava/lang/ref/WeakReference;

    .line 96
    .line 97
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    check-cast v9, Landroid/view/View;

    .line 102
    .line 103
    if-eqz v9, :cond_5

    .line 104
    .line 105
    if-eqz v7, :cond_4

    .line 106
    .line 107
    new-instance v5, Le5;

    .line 108
    .line 109
    invoke-direct {v5, v7, v9, v2}, Le5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    :cond_4
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2, v5}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 117
    .line 118
    .line 119
    :cond_5
    iget-boolean v2, v0, Lx61;->e:Z

    .line 120
    .line 121
    iget-object v5, v0, Lx61;->a:Ljava/util/ArrayList;

    .line 122
    .line 123
    if-nez v2, :cond_6

    .line 124
    .line 125
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_6
    iget-boolean p1, p0, Lt81;->u:Z

    .line 129
    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    if-eqz v8, :cond_7

    .line 133
    .line 134
    invoke-static {v8}, Le61;->a(Landroid/view/View;)Lw61;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1, v6}, Lw61;->e(F)V

    .line 139
    .line 140
    .line 141
    iget-boolean v2, v0, Lx61;->e:Z

    .line 142
    .line 143
    if-nez v2, :cond_7

    .line 144
    .line 145
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_7
    iget-boolean p1, v0, Lx61;->e:Z

    .line 149
    .line 150
    if-nez p1, :cond_8

    .line 151
    .line 152
    sget-object v2, Lt81;->E:Landroid/view/animation/AccelerateInterpolator;

    .line 153
    .line 154
    iput-object v2, v0, Lx61;->c:Landroid/view/animation/Interpolator;

    .line 155
    .line 156
    :cond_8
    if-nez p1, :cond_9

    .line 157
    .line 158
    iput-wide v3, v0, Lx61;->b:J

    .line 159
    .line 160
    :cond_9
    if-nez p1, :cond_a

    .line 161
    .line 162
    iput-object v1, v0, Lx61;->d:Ly61;

    .line 163
    .line 164
    :cond_a
    iput-object v0, p0, Lt81;->y:Lx61;

    .line 165
    .line 166
    invoke-virtual {v0}, Lx61;->b()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_b
    invoke-virtual {v1}, Lr81;->b()V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_c
    :goto_0
    iget-boolean v0, p0, Lt81;->x:Z

    .line 175
    .line 176
    if-nez v0, :cond_19

    .line 177
    .line 178
    iput-boolean v9, p0, Lt81;->x:Z

    .line 179
    .line 180
    iget-object v0, p0, Lt81;->y:Lx61;

    .line 181
    .line 182
    if-eqz v0, :cond_d

    .line 183
    .line 184
    invoke-virtual {v0}, Lx61;->a()V

    .line 185
    .line 186
    .line 187
    :cond_d
    iget-object v0, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 188
    .line 189
    invoke-virtual {v0, v10}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lt81;->t:I

    .line 193
    .line 194
    iget-object v1, p0, Lt81;->C:Lr81;

    .line 195
    .line 196
    const/4 v11, 0x0

    .line 197
    if-nez v0, :cond_17

    .line 198
    .line 199
    iget-boolean v0, p0, Lt81;->z:Z

    .line 200
    .line 201
    if-nez v0, :cond_e

    .line 202
    .line 203
    if-eqz p1, :cond_17

    .line 204
    .line 205
    :cond_e
    iget-object v0, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 206
    .line 207
    invoke-virtual {v0, v11}, Landroid/view/View;->setTranslationY(F)V

    .line 208
    .line 209
    .line 210
    iget-object v0, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    neg-int v0, v0

    .line 217
    int-to-float v0, v0

    .line 218
    if-eqz p1, :cond_f

    .line 219
    .line 220
    filled-new-array {v10, v10}, [I

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iget-object v6, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 225
    .line 226
    invoke-virtual {v6, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 227
    .line 228
    .line 229
    aget p1, p1, v9

    .line 230
    .line 231
    int-to-float p1, p1

    .line 232
    sub-float/2addr v0, p1

    .line 233
    :cond_f
    iget-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 234
    .line 235
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 236
    .line 237
    .line 238
    new-instance p1, Lx61;

    .line 239
    .line 240
    invoke-direct {p1}, Lx61;-><init>()V

    .line 241
    .line 242
    .line 243
    iget-object v6, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 244
    .line 245
    invoke-static {v6}, Le61;->a(Landroid/view/View;)Lw61;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v6, v11}, Lw61;->e(F)V

    .line 250
    .line 251
    .line 252
    iget-object v9, v6, Lw61;->a:Ljava/lang/ref/WeakReference;

    .line 253
    .line 254
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    check-cast v9, Landroid/view/View;

    .line 259
    .line 260
    if-eqz v9, :cond_11

    .line 261
    .line 262
    if-eqz v7, :cond_10

    .line 263
    .line 264
    new-instance v5, Le5;

    .line 265
    .line 266
    invoke-direct {v5, v7, v9, v2}, Le5;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 267
    .line 268
    .line 269
    :cond_10
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v2, v5}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 274
    .line 275
    .line 276
    :cond_11
    iget-boolean v2, p1, Lx61;->e:Z

    .line 277
    .line 278
    iget-object v5, p1, Lx61;->a:Ljava/util/ArrayList;

    .line 279
    .line 280
    if-nez v2, :cond_12

    .line 281
    .line 282
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    :cond_12
    iget-boolean v2, p0, Lt81;->u:Z

    .line 286
    .line 287
    if-eqz v2, :cond_13

    .line 288
    .line 289
    if-eqz v8, :cond_13

    .line 290
    .line 291
    invoke-virtual {v8, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 292
    .line 293
    .line 294
    invoke-static {v8}, Le61;->a(Landroid/view/View;)Lw61;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0, v11}, Lw61;->e(F)V

    .line 299
    .line 300
    .line 301
    iget-boolean v2, p1, Lx61;->e:Z

    .line 302
    .line 303
    if-nez v2, :cond_13

    .line 304
    .line 305
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :cond_13
    iget-boolean v0, p1, Lx61;->e:Z

    .line 309
    .line 310
    if-nez v0, :cond_14

    .line 311
    .line 312
    sget-object v2, Lt81;->F:Landroid/view/animation/DecelerateInterpolator;

    .line 313
    .line 314
    iput-object v2, p1, Lx61;->c:Landroid/view/animation/Interpolator;

    .line 315
    .line 316
    :cond_14
    if-nez v0, :cond_15

    .line 317
    .line 318
    iput-wide v3, p1, Lx61;->b:J

    .line 319
    .line 320
    :cond_15
    if-nez v0, :cond_16

    .line 321
    .line 322
    iput-object v1, p1, Lx61;->d:Ly61;

    .line 323
    .line 324
    :cond_16
    iput-object p1, p0, Lt81;->y:Lx61;

    .line 325
    .line 326
    invoke-virtual {p1}, Lx61;->b()V

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_17
    iget-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 331
    .line 332
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    .line 333
    .line 334
    .line 335
    iget-object p1, p0, Lt81;->j:Landroidx/appcompat/widget/ActionBarContainer;

    .line 336
    .line 337
    invoke-virtual {p1, v11}, Landroid/view/View;->setTranslationY(F)V

    .line 338
    .line 339
    .line 340
    iget-boolean p1, p0, Lt81;->u:Z

    .line 341
    .line 342
    if-eqz p1, :cond_18

    .line 343
    .line 344
    if-eqz v8, :cond_18

    .line 345
    .line 346
    invoke-virtual {v8, v11}, Landroid/view/View;->setTranslationY(F)V

    .line 347
    .line 348
    .line 349
    :cond_18
    invoke-virtual {v1}, Lr81;->b()V

    .line 350
    .line 351
    .line 352
    :goto_1
    iget-object p1, p0, Lt81;->i:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 353
    .line 354
    if-eqz p1, :cond_19

    .line 355
    .line 356
    sget-object v0, Le61;->a:Ljava/util/WeakHashMap;

    .line 357
    .line 358
    invoke-static {p1}, Lr51;->c(Landroid/view/View;)V

    .line 359
    .line 360
    .line 361
    :cond_19
    return-void
.end method

.method public final p()Landroid/content/Context;
    .locals 4

    .line 1
    iget-object v0, p0, Lt81;->h:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lt81;->g:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f04000c

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 28
    .line 29
    iget-object v2, p0, Lt81;->g:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lt81;->h:Landroid/content/Context;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lt81;->g:Landroid/content/Context;

    .line 38
    .line 39
    iput-object v0, p0, Lt81;->h:Landroid/content/Context;

    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object v0, p0, Lt81;->h:Landroid/content/Context;

    .line 42
    .line 43
    return-object v0
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt81;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/high16 v1, 0x7f050000

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lt81;->k0(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final u(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lt81;->o:Ls81;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, v0, Ls81;->i:Lod0;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v3, v1

    .line 28
    :goto_0
    invoke-virtual {v0, v3}, Lod0;->setQwertyMode(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1, p2, v1}, Lod0;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    :goto_1
    return v1
.end method

.method public final x(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt81;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lt81;->y(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final y(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, Lt81;->k:Lwm;

    .line 8
    .line 9
    check-cast v1, Lh21;

    .line 10
    .line 11
    iget v2, v1, Lh21;->b:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    iput-boolean v3, p0, Lt81;->n:Z

    .line 15
    .line 16
    and-int/2addr p1, v0

    .line 17
    and-int/lit8 v0, v2, -0x5

    .line 18
    .line 19
    or-int/2addr p1, v0

    .line 20
    invoke-virtual {v1, p1}, Lh21;->a(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final z(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lt81;->z:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lt81;->y:Lx61;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lx61;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
