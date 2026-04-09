.class public final Lcc0;
.super Lrk0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lrk0;"
    }
.end annotation


# instance fields
.field public a0:I

.field public b0:Lvc;

.field public c0:Lwe0;

.field public d0:I

.field public e0:Lvq2;

.field public f0:Landroidx/recyclerview/widget/RecyclerView;

.field public g0:Landroidx/recyclerview/widget/RecyclerView;

.field public h0:Landroid/view/View;

.field public i0:Landroid/view/View;

.field public j0:Landroid/view/View;

.field public k0:Landroid/view/View;

.field public l0:Lcom/google/android/material/button/MaterialButton;

.field public m0:Landroid/view/accessibility/AccessibilityManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrk0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final N(Lwe0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lao0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/c;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/material/datepicker/c;->i:Lvc;

    .line 10
    .line 11
    iget-object v1, v1, Lvc;->f:Lwe0;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lwe0;->d(Lwe0;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lcc0;->m0:Landroid/view/accessibility/AccessibilityManager;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iput-object p1, p0, Lcc0;->c0:Lwe0;

    .line 28
    .line 29
    iget-object p1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object v2, p0, Lcc0;->c0:Lwe0;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->i:Lvc;

    .line 38
    .line 39
    iget-object v0, v0, Lvc;->f:Lwe0;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lwe0;->d(Lwe0;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    sub-int v0, v1, v0

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x1

    .line 53
    const/4 v5, 0x3

    .line 54
    if-le v2, v5, :cond_1

    .line 55
    .line 56
    move v2, v4

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v2, v3

    .line 59
    :goto_0
    if-lez v0, :cond_2

    .line 60
    .line 61
    move v3, v4

    .line 62
    :cond_2
    iput-object p1, p0, Lcc0;->c0:Lwe0;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    iget-object p1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    add-int/lit8 v0, v1, -0x3

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    new-instance v0, Lcd;

    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    invoke-direct {v0, p0, v1, v2}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    if-eqz v2, :cond_4

    .line 88
    .line 89
    iget-object p1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    add-int/lit8 v0, v1, 0x3

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    new-instance v0, Lcd;

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    invoke-direct {v0, p0, v1, v2}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    iget-object p1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 109
    .line 110
    new-instance v0, Lcd;

    .line 111
    .line 112
    const/4 v2, 0x2

    .line 113
    invoke-direct {v0, p0, v1, v2}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 117
    .line 118
    .line 119
    :goto_1
    invoke-virtual {p0, v1}, Lcc0;->P(I)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final O(I)V
    .locals 4

    .line 1
    iput p1, p0, Lcc0;->d0:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lho0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lao0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lhb1;

    .line 22
    .line 23
    iget-object v3, p0, Lcc0;->c0:Lwe0;

    .line 24
    .line 25
    iget v3, v3, Lwe0;->h:I

    .line 26
    .line 27
    iget-object v0, v0, Lhb1;->i:Lcc0;

    .line 28
    .line 29
    iget-object v0, v0, Lcc0;->b0:Lvc;

    .line 30
    .line 31
    iget-object v0, v0, Lvc;->f:Lwe0;

    .line 32
    .line 33
    iget v0, v0, Lwe0;->h:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Lho0;->o0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcc0;->j0:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcc0;->k0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcc0;->h0:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcc0;->i0:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lcc0;->j0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcc0;->k0:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcc0;->h0:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcc0;->i0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcc0;->c0:Lwe0;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcc0;->N(Lwe0;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final P(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcc0;->i0:Landroid/view/View;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lao0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lao0;->a()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    move v1, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v3

    .line 22
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcc0;->h0:Landroid/view/View;

    .line 26
    .line 27
    sub-int/2addr p1, v4

    .line 28
    if-ltz p1, :cond_1

    .line 29
    .line 30
    move v3, v4

    .line 31
    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final u(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Liw;->u(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Liw;->k:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcc0;->a0:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lvc;

    .line 31
    .line 32
    iput-object v0, p0, Lcc0;->b0:Lvc;

    .line 33
    .line 34
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string v0, "CURRENT_MONTH_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lwe0;

    .line 49
    .line 50
    iput-object p1, p0, Lcc0;->c0:Lwe0;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public final v(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Liw;->i()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcc0;->a0:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lvq2;

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    invoke-direct {v1, v0, v2}, Lvq2;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcc0;->e0:Lvq2;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, Liw;->G()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "accessibility"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 35
    .line 36
    iput-object v1, p0, Lcc0;->m0:Landroid/view/accessibility/AccessibilityManager;

    .line 37
    .line 38
    iget-object v1, p0, Lcc0;->b0:Lvc;

    .line 39
    .line 40
    iget-object v1, v1, Lvc;->f:Lwe0;

    .line 41
    .line 42
    const v2, 0x101020d

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2}, Ljc0;->T(Landroid/content/Context;I)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x1

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    const v3, 0x7f0c006e

    .line 54
    .line 55
    .line 56
    move v6, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const v3, 0x7f0c0069

    .line 59
    .line 60
    .line 61
    move v6, v4

    .line 62
    :goto_0
    invoke-virtual {p1, v3, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Liw;->G()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const v3, 0x7f070389

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    const v7, 0x7f07038a

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    add-int/2addr v7, v3

    .line 89
    const v3, 0x7f070388

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    add-int/2addr v3, v7

    .line 97
    const v7, 0x7f070379

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    sget v8, Lxe0;->i:I

    .line 105
    .line 106
    const v9, 0x7f070374

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    mul-int/2addr v9, v8

    .line 114
    sub-int/2addr v8, v5

    .line 115
    const v10, 0x7f070387

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    mul-int/2addr v10, v8

    .line 123
    add-int/2addr v10, v9

    .line 124
    const v8, 0x7f070371

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    add-int/2addr v3, v7

    .line 132
    add-int/2addr v3, v10

    .line 133
    add-int/2addr v3, p2

    .line 134
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 135
    .line 136
    .line 137
    const p2, 0x7f090185

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, Landroid/widget/GridView;

    .line 145
    .line 146
    new-instance v3, Lyb0;

    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-direct {v3, v7}, Lyb0;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p2, v3}, Le61;->l(Landroid/view/View;Lp0;)V

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lcc0;->b0:Lvc;

    .line 156
    .line 157
    iget v3, v3, Lvc;->j:I

    .line 158
    .line 159
    new-instance v7, Lsm;

    .line 160
    .line 161
    if-lez v3, :cond_1

    .line 162
    .line 163
    invoke-direct {v7, v3}, Lsm;-><init>(I)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_1
    invoke-direct {v7}, Lsm;-><init>()V

    .line 168
    .line 169
    .line 170
    :goto_1
    invoke-virtual {p2, v7}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 171
    .line 172
    .line 173
    iget v1, v1, Lwe0;->i:I

    .line 174
    .line 175
    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 179
    .line 180
    .line 181
    const p2, 0x7f090188

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 189
    .line 190
    iput-object p2, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 191
    .line 192
    new-instance p2, Lzb0;

    .line 193
    .line 194
    invoke-direct {p2, p0, v6, v6}, Lzb0;-><init>(Lcc0;II)V

    .line 195
    .line 196
    .line 197
    iget-object v1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 198
    .line 199
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lho0;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 203
    .line 204
    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    .line 205
    .line 206
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    new-instance p2, Lcom/google/android/material/datepicker/c;

    .line 210
    .line 211
    iget-object v1, p0, Lcc0;->b0:Lvc;

    .line 212
    .line 213
    new-instance v3, Lof3;

    .line 214
    .line 215
    const/4 v4, 0x4

    .line 216
    invoke-direct {v3, v4, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p2, v0, v1, v3}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/view/ContextThemeWrapper;Lvc;Lof3;)V

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 223
    .line 224
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    const v3, 0x7f0a0036

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    const v3, 0x7f09018b

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 246
    .line 247
    iput-object v4, p0, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 248
    .line 249
    if-eqz v4, :cond_2

    .line 250
    .line 251
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 252
    .line 253
    .line 254
    iget-object v4, p0, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 255
    .line 256
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 257
    .line 258
    invoke-direct {v6, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lho0;)V

    .line 262
    .line 263
    .line 264
    iget-object v1, p0, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 265
    .line 266
    new-instance v4, Lhb1;

    .line 267
    .line 268
    invoke-direct {v4, p0}, Lhb1;-><init>(Lcc0;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lao0;)V

    .line 272
    .line 273
    .line 274
    iget-object v1, p0, Lcc0;->f0:Landroidx/recyclerview/widget/RecyclerView;

    .line 275
    .line 276
    new-instance v4, Lac0;

    .line 277
    .line 278
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    const/4 v6, 0x0

    .line 282
    invoke-static {v6}, Lg41;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 283
    .line 284
    .line 285
    invoke-static {v6}, Lg41;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->g(Lfo0;)V

    .line 289
    .line 290
    .line 291
    :cond_2
    const v1, 0x7f09017f

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    iget-object v6, p2, Lcom/google/android/material/datepicker/c;->i:Lvc;

    .line 299
    .line 300
    if-eqz v4, :cond_3

    .line 301
    .line 302
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 307
    .line 308
    iput-object v1, p0, Lcc0;->l0:Lcom/google/android/material/button/MaterialButton;

    .line 309
    .line 310
    const-string v4, "SELECTOR_TOGGLE_TAG"

    .line 311
    .line 312
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iget-object v1, p0, Lcc0;->l0:Lcom/google/android/material/button/MaterialButton;

    .line 316
    .line 317
    new-instance v4, Lsb;

    .line 318
    .line 319
    const/4 v7, 0x3

    .line 320
    invoke-direct {v4, v7, p0}, Lsb;-><init>(ILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v1, v4}, Le61;->l(Landroid/view/View;Lp0;)V

    .line 324
    .line 325
    .line 326
    const v1, 0x7f090181

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iput-object v1, p0, Lcc0;->h0:Landroid/view/View;

    .line 334
    .line 335
    const-string v4, "NAVIGATION_PREV_TAG"

    .line 336
    .line 337
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    const v1, 0x7f090180

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iput-object v1, p0, Lcc0;->i0:Landroid/view/View;

    .line 348
    .line 349
    const-string v4, "NAVIGATION_NEXT_TAG"

    .line 350
    .line 351
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iput-object v1, p0, Lcc0;->j0:Landroid/view/View;

    .line 359
    .line 360
    const v1, 0x7f090184

    .line 361
    .line 362
    .line 363
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    iput-object v1, p0, Lcc0;->k0:Landroid/view/View;

    .line 368
    .line 369
    invoke-virtual {p0, v5}, Lcc0;->O(I)V

    .line 370
    .line 371
    .line 372
    iget-object v1, p0, Lcc0;->l0:Lcom/google/android/material/button/MaterialButton;

    .line 373
    .line 374
    iget-object v3, p0, Lcc0;->c0:Lwe0;

    .line 375
    .line 376
    invoke-virtual {v3}, Lwe0;->c()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 381
    .line 382
    .line 383
    iget-object v1, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 384
    .line 385
    new-instance v3, Lbc0;

    .line 386
    .line 387
    invoke-direct {v3, p0, p2}, Lbc0;-><init>(Lcc0;Lcom/google/android/material/datepicker/c;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->h(Lko0;)V

    .line 391
    .line 392
    .line 393
    iget-object v1, p0, Lcc0;->l0:Lcom/google/android/material/button/MaterialButton;

    .line 394
    .line 395
    new-instance v3, Lm1;

    .line 396
    .line 397
    const/4 v4, 0x3

    .line 398
    invoke-direct {v3, v4, p0}, Lm1;-><init>(ILjava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 402
    .line 403
    .line 404
    iget-object v1, p0, Lcc0;->i0:Landroid/view/View;

    .line 405
    .line 406
    new-instance v3, Lxb0;

    .line 407
    .line 408
    const/4 v4, 0x1

    .line 409
    invoke-direct {v3, p0, p2, v4}, Lxb0;-><init>(Lcc0;Lcom/google/android/material/datepicker/c;I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 413
    .line 414
    .line 415
    iget-object v1, p0, Lcc0;->h0:Landroid/view/View;

    .line 416
    .line 417
    new-instance v3, Lxb0;

    .line 418
    .line 419
    const/4 v4, 0x0

    .line 420
    invoke-direct {v3, p0, p2, v4}, Lxb0;-><init>(Lcc0;Lcom/google/android/material/datepicker/c;I)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 424
    .line 425
    .line 426
    iget-object p2, p0, Lcc0;->c0:Lwe0;

    .line 427
    .line 428
    iget-object v1, v6, Lvc;->f:Lwe0;

    .line 429
    .line 430
    invoke-virtual {v1, p2}, Lwe0;->d(Lwe0;)I

    .line 431
    .line 432
    .line 433
    move-result p2

    .line 434
    invoke-virtual {p0, p2}, Lcc0;->P(I)V

    .line 435
    .line 436
    .line 437
    :cond_3
    invoke-static {v0, v2}, Ljc0;->T(Landroid/content/Context;I)Z

    .line 438
    .line 439
    .line 440
    move-result p2

    .line 441
    if-nez p2, :cond_8

    .line 442
    .line 443
    new-instance p2, Lck0;

    .line 444
    .line 445
    invoke-direct {p2}, Lck0;-><init>()V

    .line 446
    .line 447
    .line 448
    iget-object v0, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 449
    .line 450
    iget-object v1, p2, Lck0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 451
    .line 452
    if-ne v1, v0, :cond_4

    .line 453
    .line 454
    goto :goto_2

    .line 455
    :cond_4
    iget-object v2, p2, Lck0;->b:Lbx0;

    .line 456
    .line 457
    if-eqz v1, :cond_6

    .line 458
    .line 459
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->m0:Ljava/util/ArrayList;

    .line 460
    .line 461
    if-eqz v1, :cond_5

    .line 462
    .line 463
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    :cond_5
    iget-object v1, p2, Lck0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 467
    .line 468
    const/4 v3, 0x0

    .line 469
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Ljo0;)V

    .line 470
    .line 471
    .line 472
    :cond_6
    iput-object v0, p2, Lck0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 473
    .line 474
    if-eqz v0, :cond_8

    .line 475
    .line 476
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Ljo0;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    if-nez v0, :cond_7

    .line 481
    .line 482
    iget-object v0, p2, Lck0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 483
    .line 484
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->h(Lko0;)V

    .line 485
    .line 486
    .line 487
    iget-object v0, p2, Lck0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 488
    .line 489
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Ljo0;)V

    .line 490
    .line 491
    .line 492
    new-instance v0, Landroid/widget/Scroller;

    .line 493
    .line 494
    iget-object v1, p2, Lck0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 495
    .line 496
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 501
    .line 502
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-direct {v0, v1, v2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {p2}, Lck0;->f()V

    .line 509
    .line 510
    .line 511
    goto :goto_2

    .line 512
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 513
    .line 514
    const-string p2, "An instance of OnFlingListener already set."

    .line 515
    .line 516
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw p1

    .line 520
    :cond_8
    :goto_2
    iget-object p2, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 521
    .line 522
    iget-object v0, p0, Lcc0;->c0:Lwe0;

    .line 523
    .line 524
    iget-object v1, v6, Lvc;->f:Lwe0;

    .line 525
    .line 526
    invoke-virtual {v1, v0}, Lwe0;->d(Lwe0;)I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 531
    .line 532
    .line 533
    iget-object p2, p0, Lcc0;->g0:Landroidx/recyclerview/widget/RecyclerView;

    .line 534
    .line 535
    new-instance v0, Lyb0;

    .line 536
    .line 537
    const/4 v1, 0x1

    .line 538
    invoke-direct {v0, v1}, Lyb0;-><init>(I)V

    .line 539
    .line 540
    .line 541
    invoke-static {p2, v0}, Le61;->l(Landroid/view/View;Lp0;)V

    .line 542
    .line 543
    .line 544
    return-object p1
.end method

.method public final z(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lcc0;->a0:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 15
    .line 16
    iget-object v2, p0, Lcc0;->b0:Lvc;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CURRENT_MONTH_KEY"

    .line 27
    .line 28
    iget-object v1, p0, Lcc0;->c0:Lwe0;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
