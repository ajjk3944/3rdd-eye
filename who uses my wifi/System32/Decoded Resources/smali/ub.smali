.class public final Lub;
.super Lpb;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/Boolean;

.field public final b:Lo91;

.field public c:Landroid/view/Window;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Lo91;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lub;->b:Lo91;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iget-object p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:Lnc0;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object p2, p2, Lnc0;->g:Llc0;

    .line 15
    .line 16
    iget-object p2, p2, Llc0;->d:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Li41;->m(I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lub;->a:Ljava/lang/Boolean;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lqb1;->j(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 p2, 0x0

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object p1, p2

    .line 61
    :goto_1
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p1}, Li41;->m(I)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lub;->a:Ljava/lang/Boolean;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iput-object p2, p0, Lub;->a:Ljava/lang/Boolean;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lub;->d(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lub;->d(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final c(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lub;->d(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lub;->b:Lo91;

    .line 6
    .line 7
    invoke-virtual {v1}, Lo91;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x1e

    .line 12
    .line 13
    if-ge v0, v2, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lub;->c:Landroid/view/Window;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lub;->a:Ljava/lang/Boolean;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-boolean v2, p0, Lub;->d:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v5, Lts0;

    .line 35
    .line 36
    invoke-direct {v5, v4}, Lts0;-><init>(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    if-lt v4, v3, :cond_1

    .line 42
    .line 43
    new-instance v3, Lq91;

    .line 44
    .line 45
    invoke-static {v0}, Lm91;->h(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-direct {v3, v4, v5}, Lq91;-><init>(Landroid/view/WindowInsetsController;Lts0;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, v3, Lq91;->r:Landroid/view/Window;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v3, Lp91;

    .line 56
    .line 57
    invoke-direct {v3, v0, v5}, Lp91;-><init>(Landroid/view/Window;Lts0;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-virtual {v3, v2}, Lbd2;->v(Z)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {v1}, Lo91;->d()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    sub-int/2addr v1, v2

    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    iget-object v0, p0, Lub;->c:Landroid/view/Window;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    iget-boolean v1, p0, Lub;->d:Z

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v4, Lts0;

    .line 105
    .line 106
    invoke-direct {v4, v2}, Lts0;-><init>(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    if-lt v2, v3, :cond_4

    .line 112
    .line 113
    new-instance v2, Lq91;

    .line 114
    .line 115
    invoke-static {v0}, Lm91;->h(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-direct {v2, v3, v4}, Lq91;-><init>(Landroid/view/WindowInsetsController;Lts0;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, v2, Lq91;->r:Landroid/view/Window;

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    new-instance v2, Lp91;

    .line 126
    .line 127
    invoke-direct {v2, v0, v4}, Lp91;-><init>(Landroid/view/Window;Lts0;)V

    .line 128
    .line 129
    .line 130
    :goto_2
    invoke-virtual {v2, v1}, Lbd2;->v(Z)V

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const/4 v3, 0x0

    .line 146
    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 147
    .line 148
    .line 149
    :cond_6
    return-void
.end method

.method public final e(Landroid/view/Window;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lub;->c:Landroid/view/Window;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput-object p1, p0, Lub;->c:Landroid/view/Window;

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lts0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lts0;-><init>(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v2, 0x1e

    .line 22
    .line 23
    if-lt v0, v2, :cond_1

    .line 24
    .line 25
    new-instance v0, Lq91;

    .line 26
    .line 27
    invoke-static {p1}, Lm91;->h(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v0, v2, v1}, Lq91;-><init>(Landroid/view/WindowInsetsController;Lts0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, Lq91;->r:Landroid/view/Window;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance v0, Lp91;

    .line 38
    .line 39
    invoke-direct {v0, p1, v1}, Lp91;-><init>(Landroid/view/Window;Lts0;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0}, Lbd2;->n()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput-boolean p1, p0, Lub;->d:Z

    .line 47
    .line 48
    :cond_2
    :goto_1
    return-void
.end method
