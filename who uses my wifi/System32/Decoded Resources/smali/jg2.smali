.class public final Ljg2;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lag2;


# instance fields
.field public final f:Log2;

.field public final g:Lg4;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Log2;Lmv2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ljg2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    iput-object p1, p0, Ljg2;->f:Log2;

    .line 16
    .line 17
    new-instance v0, Lg4;

    .line 18
    .line 19
    iget-object v1, p1, Log2;->f:Lyg2;

    .line 20
    .line 21
    iget-object v1, v1, Lyg2;->c:Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {v0, v1, p0, p0, p2}, Lg4;-><init>(Landroid/content/Context;Ljg2;Ljg2;Lmv2;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ljg2;->g:Lg4;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final A()Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, p0, Ljg2;->f:Log2;

    .line 18
    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v0
.end method

.method public final B0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->B0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Log2;->C()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final C0()Lq12;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->C0()Lq12;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->D(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final E(Ljava/lang/String;Lvg0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->E(Ljava/lang/String;Lvg0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final E0(La83;Lc83;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iput-object p1, v0, Log2;->o:La83;

    .line 4
    .line 5
    iput-object p2, v0, Log2;->p:Lc83;

    .line 6
    .line 7
    return-void
.end method

.method public final F()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->o:La83;

    .line 4
    .line 5
    return-object v0
.end method

.method public final F0()Lc83;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->p:Lc83;

    .line 4
    .line 5
    return-object v0
.end method

.method public final G(Lwz2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->G(Lwz2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final H0()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    new-instance v1, Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lhg4;->C:Lhg4;

    .line 13
    .line 14
    iget-object v3, v2, Lhg4;->c:Llf4;

    .line 15
    .line 16
    iget-object v3, v2, Lhg4;->h:Lgd2;

    .line 17
    .line 18
    invoke-virtual {v3}, Lgd2;->c()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const v4, 0x7f120106

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v3, "Test Ad"

    .line 33
    .line 34
    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    const/high16 v3, 0x41700000    # 15.0f

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 40
    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x5

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-virtual {v1, v3, v4, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 57
    .line 58
    .line 59
    const v4, -0xbbbbbc

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 63
    .line 64
    .line 65
    const/high16 v4, 0x41000000    # 8.0f

    .line 66
    .line 67
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 74
    .line 75
    const/4 v4, -0x2

    .line 76
    const/16 v5, 0x31

    .line 77
    .line 78
    invoke-direct {v3, v4, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->bringChildToFront(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    sget-object v3, Lmz1;->J5:Liz1;

    .line 88
    .line 89
    sget-object v4, Ltw1;->e:Ltw1;

    .line 90
    .line 91
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 92
    .line 93
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Log2;->W0()Lwz2;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-nez v3, :cond_1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    monitor-enter v3

    .line 113
    :try_start_0
    iget-object v0, v3, Lwz2;->f:Lcc3;

    .line 114
    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    iget-object v2, v2, Lhg4;->x:Lsu2;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v2, Lsz2;

    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    invoke-direct {v2, v0, v1, v4}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v2}, Lsu2;->t(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    monitor-exit v3

    .line 132
    return-void

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    monitor-exit v3

    .line 136
    return-void

    .line 137
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    throw v0

    .line 139
    :cond_3
    :goto_2
    sget-object v3, Lmz1;->I5:Liz1;

    .line 140
    .line 141
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 142
    .line 143
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_4

    .line 154
    .line 155
    invoke-virtual {v0}, Log2;->k0()Lxz2;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    iget-object v3, v0, Lxz2;->b:Luk1;

    .line 162
    .line 163
    iget-object v3, v3, Luk1;->l:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v3, Lwb3;

    .line 166
    .line 167
    sget-object v4, Lwb3;->g:Lwb3;

    .line 168
    .line 169
    if-ne v3, v4, :cond_4

    .line 170
    .line 171
    iget-object v2, v2, Lhg4;->x:Lsu2;

    .line 172
    .line 173
    iget-object v0, v0, Lxz2;->a:Lxb3;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v2, Lrz2;

    .line 179
    .line 180
    const/4 v3, 0x0

    .line 181
    invoke-direct {v2, v0, v1, v3}, Lrz2;-><init>(Lxb3;Landroid/view/View;I)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2}, Lsu2;->t(Ljava/lang/Runnable;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    return-void
.end method

.method public final I(ZILjava/lang/String;ZZ)V
    .locals 6

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Log2;->I(ZILjava/lang/String;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final J0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->J0(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K()I
    .locals 2

    .line 1
    sget-object v0, Lmz1;->k4:Liz1;

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
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0
.end method

.method public final K0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Log2;->g0:Z

    .line 5
    .line 6
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Ljg2;->f:Log2;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final L0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->L0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final M(Lfc2;ZZLjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Log2;->M(Lfc2;ZZLjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final M0(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->M0(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final N(Lq12;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->N(Lq12;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final N0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->N0(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final O()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->O()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final O0()Ljh1;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->O0()Ljh1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final P()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->P()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final P0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->P0(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Q(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ljg2;->g:Lg4;

    .line 2
    .line 3
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lee2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lmz1;->R:Liz1;

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
    iget-object v1, v0, Lee2;->g:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lee2;->h:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final R0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->R0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final S0(Lnv1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->S0(Lnv1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final T0(Lpt2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->T0(Lpt2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final U0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Log2;->U0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final V()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->V()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final V0(Lqg2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->V0(Lqg2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final W()Lvs1;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->g:Lvs1;

    .line 4
    .line 5
    return-object v0
.end method

.method public final W0()Lwz2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->W0()Lwz2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final X()Lfw1;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->X()Lfw1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final X0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->X0(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Y0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->Y0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final Z(Lzq;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->Z(Lzq;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z0(IZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Log2;->Z0(IZZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a0()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->f:Lyg2;

    .line 4
    .line 5
    iget-object v0, v0, Lyg2;->c:Landroid/content/Context;

    .line 6
    .line 7
    return-object v0
.end method

.method public final a1()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->a1()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p1, p2}, Log2;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->b0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b1(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->b1(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c0(Ljh1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->c0(Ljh1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final canGoBack()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d()I
    .locals 2

    .line 1
    sget-object v0, Lmz1;->k4:Liz1;

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
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0
.end method

.method public final d1(Ljava/lang/String;Lff2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->d1(Ljava/lang/String;Lff2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final destroy()V
    .locals 5

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->k0()Lxz2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v2, Llf4;->l:Li63;

    .line 10
    .line 11
    new-instance v3, Lfu1;

    .line 12
    .line 13
    const/16 v4, 0x12

    .line 14
    .line 15
    invoke-direct {v3, v4, v1}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    new-instance v1, Lig2;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v1, v0, v3}, Lig2;-><init>(Lag2;I)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lmz1;->H5:Liz1;

    .line 28
    .line 29
    sget-object v3, Ltw1;->e:Ltw1;

    .line 30
    .line 31
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v3, v0

    .line 44
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    sget-object v1, Lmz1;->J5:Liz1;

    .line 49
    .line 50
    sget-object v2, Ltw1;->e:Ltw1;

    .line 51
    .line 52
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0}, Log2;->W0()Lwz2;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    sget-object v0, Llf4;->l:Li63;

    .line 73
    .line 74
    new-instance v2, Ln62;

    .line 75
    .line 76
    const/16 v3, 0xa

    .line 77
    .line 78
    invoke-direct {v2, p0, v1, v3}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    invoke-virtual {v0}, Log2;->destroy()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e0()Lsg2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->s:Lsg2;

    .line 4
    .line 5
    return-object v0
.end method

.method public final e1(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->e1(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()Lqg2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->f()Lqg2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f0()Lg4;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->g:Lg4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f1(Ljava/lang/String;Ly32;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->f1(Ljava/lang/String;Ly32;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->f:Lyg2;

    .line 4
    .line 5
    iget-object v0, v0, Lyg2;->a:Landroid/app/Activity;

    .line 6
    .line 7
    return-object v0
.end method

.method public final goBack()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->h0(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j()Lrz1;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->O:Lrz1;

    .line 4
    .line 5
    return-object v0
.end method

.method public final j0(Lfw1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->j0(Lfw1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()Ll92;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->l:Ll92;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k0()Lxz2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->k0()Lxz2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->B(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->l0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p2, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    const-string v0, "text/html"

    .line 4
    .line 5
    invoke-virtual {p2, p1, v0, p3}, Log2;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const-string v3, "text/html"

    .line 5
    .line 6
    const-string v4, "UTF-8"

    .line 7
    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Log2;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final loadUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->loadUrl(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m()Lvq2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->Q:Lvq2;

    .line 4
    .line 5
    return-object v0
.end method

.method public final m0(Lxz2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->m0(Lxz2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->o()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final o0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->o0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Ljg2;->g:Lg4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "onPause must be called from the UI thread."

    .line 7
    .line 8
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lee2;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lee2;->l:Lae2;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lae2;->i()V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 26
    .line 27
    invoke-virtual {v0}, Log2;->onPause()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->onResume()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p0()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final q()I
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->q()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final q0(Ljh1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->q0(Ljh1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljg2;->g:Lg4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "onDestroy must be called from the UI thread."

    .line 7
    .line 8
    invoke-static {v1}, Lou1;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lg4;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lee2;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v2, v1, Lee2;->j:Lde2;

    .line 18
    .line 19
    invoke-virtual {v2}, Lde2;->a()V

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, Lee2;->l:Lae2;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Lae2;->g()V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v1}, Lee2;->d()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lg4;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljg2;

    .line 35
    .line 36
    iget-object v2, v0, Lg4;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lee2;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iput-object v1, v0, Lg4;->k:Ljava/lang/Object;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 47
    .line 48
    invoke-virtual {v0}, Log2;->r()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    const-string v0, "window.inspectorInfo"

    .line 4
    .line 5
    invoke-virtual {p1, v0, p2}, Log2;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Log2;->s0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t()Landroid/webkit/WebView;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t0()Ln70;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->t0()Ln70;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final u()Le51;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->j:Le51;

    .line 4
    .line 5
    return-object v0
.end method

.method public final u0()Lm83;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->h:Lm83;

    .line 4
    .line 5
    return-object v0
.end method

.method public final v(ZILjava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Log2;->v(ZILjava/lang/String;Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final v0(Ljava/lang/String;Ly32;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Log2;->v0(Ljava/lang/String;Ly32;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final w0(Ljava/lang/String;)Lff2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->w0(Ljava/lang/String;)Lff2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final x()Lzq;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->x()Lzq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final x0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    iget-object v0, v0, Log2;->s:Lsg2;

    .line 4
    .line 5
    iput-boolean p1, v0, Lsg2;->I:Z

    .line 6
    .line 7
    return-void
.end method

.method public final y(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->y(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final y0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Log2;->y0(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z(JZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Log2;->z(JZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z0()Ljh1;
    .locals 1

    .line 1
    iget-object v0, p0, Ljg2;->f:Log2;

    .line 2
    .line 3
    invoke-virtual {v0}, Log2;->z0()Ljh1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
