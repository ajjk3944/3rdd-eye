.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static u:Ltv0;


# instance fields
.field public final f:Landroid/util/SparseArray;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lqi;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:Z

.field public n:I

.field public o:Lni;

.field public p:Lgw3;

.field public q:I

.field public r:Ljava/util/HashMap;

.field public final s:Landroid/util/SparseArray;

.field public final t:Ldi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lqi;

    invoke-direct {p1}, Lqi;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    const/16 v0, 0x101

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgw3;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 15
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Landroid/util/SparseArray;

    .line 16
    new-instance v0, Ldi;

    invoke-direct {v0, p0, p0}, Ldi;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldi;

    .line 17
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 21
    new-instance p1, Lqi;

    invoke-direct {p1}, Lqi;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    const p1, 0x7fffffff

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    const/16 p1, 0x101

    .line 27
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 29
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgw3;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 32
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Landroid/util/SparseArray;

    .line 33
    new-instance p1, Ldi;

    invoke-direct {p1, p0, p0}, Ldi;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldi;

    .line 34
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static g()Lci;
    .locals 8

    .line 1
    new-instance v0, Lci;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, v0, Lci;->a:I

    .line 9
    .line 10
    iput v1, v0, Lci;->b:I

    .line 11
    .line 12
    const/high16 v2, -0x40800000    # -1.0f

    .line 13
    .line 14
    iput v2, v0, Lci;->c:F

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    iput-boolean v3, v0, Lci;->d:Z

    .line 18
    .line 19
    iput v1, v0, Lci;->e:I

    .line 20
    .line 21
    iput v1, v0, Lci;->f:I

    .line 22
    .line 23
    iput v1, v0, Lci;->g:I

    .line 24
    .line 25
    iput v1, v0, Lci;->h:I

    .line 26
    .line 27
    iput v1, v0, Lci;->i:I

    .line 28
    .line 29
    iput v1, v0, Lci;->j:I

    .line 30
    .line 31
    iput v1, v0, Lci;->k:I

    .line 32
    .line 33
    iput v1, v0, Lci;->l:I

    .line 34
    .line 35
    iput v1, v0, Lci;->m:I

    .line 36
    .line 37
    iput v1, v0, Lci;->n:I

    .line 38
    .line 39
    iput v1, v0, Lci;->o:I

    .line 40
    .line 41
    iput v1, v0, Lci;->p:I

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    iput v4, v0, Lci;->q:I

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    iput v5, v0, Lci;->r:F

    .line 48
    .line 49
    iput v1, v0, Lci;->s:I

    .line 50
    .line 51
    iput v1, v0, Lci;->t:I

    .line 52
    .line 53
    iput v1, v0, Lci;->u:I

    .line 54
    .line 55
    iput v1, v0, Lci;->v:I

    .line 56
    .line 57
    const/high16 v5, -0x80000000

    .line 58
    .line 59
    iput v5, v0, Lci;->w:I

    .line 60
    .line 61
    iput v5, v0, Lci;->x:I

    .line 62
    .line 63
    iput v5, v0, Lci;->y:I

    .line 64
    .line 65
    iput v5, v0, Lci;->z:I

    .line 66
    .line 67
    iput v5, v0, Lci;->A:I

    .line 68
    .line 69
    iput v5, v0, Lci;->B:I

    .line 70
    .line 71
    iput v5, v0, Lci;->C:I

    .line 72
    .line 73
    iput v4, v0, Lci;->D:I

    .line 74
    .line 75
    const/high16 v6, 0x3f000000    # 0.5f

    .line 76
    .line 77
    iput v6, v0, Lci;->E:F

    .line 78
    .line 79
    iput v6, v0, Lci;->F:F

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    iput-object v7, v0, Lci;->G:Ljava/lang/String;

    .line 83
    .line 84
    iput v2, v0, Lci;->H:F

    .line 85
    .line 86
    iput v2, v0, Lci;->I:F

    .line 87
    .line 88
    iput v4, v0, Lci;->J:I

    .line 89
    .line 90
    iput v4, v0, Lci;->K:I

    .line 91
    .line 92
    iput v4, v0, Lci;->L:I

    .line 93
    .line 94
    iput v4, v0, Lci;->M:I

    .line 95
    .line 96
    iput v4, v0, Lci;->N:I

    .line 97
    .line 98
    iput v4, v0, Lci;->O:I

    .line 99
    .line 100
    iput v4, v0, Lci;->P:I

    .line 101
    .line 102
    iput v4, v0, Lci;->Q:I

    .line 103
    .line 104
    const/high16 v2, 0x3f800000    # 1.0f

    .line 105
    .line 106
    iput v2, v0, Lci;->R:F

    .line 107
    .line 108
    iput v2, v0, Lci;->S:F

    .line 109
    .line 110
    iput v1, v0, Lci;->T:I

    .line 111
    .line 112
    iput v1, v0, Lci;->U:I

    .line 113
    .line 114
    iput v1, v0, Lci;->V:I

    .line 115
    .line 116
    iput-boolean v4, v0, Lci;->W:Z

    .line 117
    .line 118
    iput-boolean v4, v0, Lci;->X:Z

    .line 119
    .line 120
    iput-object v7, v0, Lci;->Y:Ljava/lang/String;

    .line 121
    .line 122
    iput v4, v0, Lci;->Z:I

    .line 123
    .line 124
    iput-boolean v3, v0, Lci;->a0:Z

    .line 125
    .line 126
    iput-boolean v3, v0, Lci;->b0:Z

    .line 127
    .line 128
    iput-boolean v4, v0, Lci;->c0:Z

    .line 129
    .line 130
    iput-boolean v4, v0, Lci;->d0:Z

    .line 131
    .line 132
    iput-boolean v4, v0, Lci;->e0:Z

    .line 133
    .line 134
    iput v1, v0, Lci;->f0:I

    .line 135
    .line 136
    iput v1, v0, Lci;->g0:I

    .line 137
    .line 138
    iput v1, v0, Lci;->h0:I

    .line 139
    .line 140
    iput v1, v0, Lci;->i0:I

    .line 141
    .line 142
    iput v5, v0, Lci;->j0:I

    .line 143
    .line 144
    iput v5, v0, Lci;->k0:I

    .line 145
    .line 146
    iput v6, v0, Lci;->l0:F

    .line 147
    .line 148
    new-instance v1, Lpi;

    .line 149
    .line 150
    invoke-direct {v1}, Lpi;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v1, v0, Lci;->p0:Lpi;

    .line 154
    .line 155
    return-object v0
.end method

.method private getPaddingWidth()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    return v1

    .line 39
    :cond_0
    return v2
.end method

.method public static getSharedValues()Ltv0;
    .locals 2

    .line 1
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ltv0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ltv0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseIntArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ltv0;

    .line 21
    .line 22
    :cond_0
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Ltv0;

    .line 23
    .line 24
    return-object v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lci;

    .line 2
    .line 3
    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-lez v3, :cond_0

    .line 13
    .line 14
    move v4, v1

    .line 15
    :goto_0
    if-ge v4, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lai;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-float v3, v3

    .line 48
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    move v5, v1

    .line 53
    :goto_1
    if-ge v5, v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    const/16 v8, 0x8

    .line 64
    .line 65
    if-ne v7, v8, :cond_1

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    instance-of v7, v6, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    check-cast v6, Ljava/lang/String;

    .line 80
    .line 81
    const-string v7, ","

    .line 82
    .line 83
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    array-length v7, v6

    .line 88
    const/4 v8, 0x4

    .line 89
    if-ne v7, v8, :cond_2

    .line 90
    .line 91
    aget-object v7, v6, v1

    .line 92
    .line 93
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    const/4 v8, 0x1

    .line 98
    aget-object v8, v6, v8

    .line 99
    .line 100
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    const/4 v9, 0x2

    .line 105
    aget-object v9, v6, v9

    .line 106
    .line 107
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    const/4 v10, 0x3

    .line 112
    aget-object v6, v6, v10

    .line 113
    .line 114
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    int-to-float v7, v7

    .line 119
    const/high16 v10, 0x44870000    # 1080.0f

    .line 120
    .line 121
    div-float/2addr v7, v10

    .line 122
    mul-float/2addr v7, v2

    .line 123
    float-to-int v7, v7

    .line 124
    int-to-float v8, v8

    .line 125
    const/high16 v11, 0x44f00000    # 1920.0f

    .line 126
    .line 127
    div-float/2addr v8, v11

    .line 128
    mul-float/2addr v8, v3

    .line 129
    float-to-int v8, v8

    .line 130
    int-to-float v9, v9

    .line 131
    div-float/2addr v9, v10

    .line 132
    mul-float/2addr v9, v2

    .line 133
    float-to-int v9, v9

    .line 134
    int-to-float v6, v6

    .line 135
    div-float/2addr v6, v11

    .line 136
    mul-float/2addr v6, v3

    .line 137
    float-to-int v6, v6

    .line 138
    new-instance v15, Landroid/graphics/Paint;

    .line 139
    .line 140
    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    .line 141
    .line 142
    .line 143
    const/high16 v10, -0x10000

    .line 144
    .line 145
    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 146
    .line 147
    .line 148
    int-to-float v11, v7

    .line 149
    int-to-float v12, v8

    .line 150
    add-int/2addr v7, v9

    .line 151
    int-to-float v13, v7

    .line 152
    move v14, v12

    .line 153
    move-object/from16 v10, p1

    .line 154
    .line 155
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 156
    .line 157
    .line 158
    move v7, v11

    .line 159
    add-int/2addr v8, v6

    .line 160
    int-to-float v14, v8

    .line 161
    move v11, v13

    .line 162
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    move v6, v12

    .line 166
    move v12, v14

    .line 167
    move v13, v7

    .line 168
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    move v7, v11

    .line 172
    move v11, v13

    .line 173
    move v14, v6

    .line 174
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 175
    .line 176
    .line 177
    move/from16 v16, v14

    .line 178
    .line 179
    move v14, v12

    .line 180
    move/from16 v12, v16

    .line 181
    .line 182
    const v6, -0xff0100

    .line 183
    .line 184
    .line 185
    invoke-virtual {v15, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 186
    .line 187
    .line 188
    move v13, v7

    .line 189
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 190
    .line 191
    .line 192
    move/from16 v16, v14

    .line 193
    .line 194
    move v14, v12

    .line 195
    move/from16 v12, v16

    .line 196
    .line 197
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 198
    .line 199
    .line 200
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_3
    return-void
.end method

.method public final forceLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->g()Lci;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 12

    .line 1
    new-instance v0, Lci;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v2, -0x1

    .line 3
    iput v2, v0, Lci;->a:I

    .line 4
    iput v2, v0, Lci;->b:I

    const/high16 v3, -0x40800000    # -1.0f

    .line 5
    iput v3, v0, Lci;->c:F

    const/4 v4, 0x1

    .line 6
    iput-boolean v4, v0, Lci;->d:Z

    .line 7
    iput v2, v0, Lci;->e:I

    .line 8
    iput v2, v0, Lci;->f:I

    .line 9
    iput v2, v0, Lci;->g:I

    .line 10
    iput v2, v0, Lci;->h:I

    .line 11
    iput v2, v0, Lci;->i:I

    .line 12
    iput v2, v0, Lci;->j:I

    .line 13
    iput v2, v0, Lci;->k:I

    .line 14
    iput v2, v0, Lci;->l:I

    .line 15
    iput v2, v0, Lci;->m:I

    .line 16
    iput v2, v0, Lci;->n:I

    .line 17
    iput v2, v0, Lci;->o:I

    .line 18
    iput v2, v0, Lci;->p:I

    const/4 v5, 0x0

    .line 19
    iput v5, v0, Lci;->q:I

    const/4 v6, 0x0

    .line 20
    iput v6, v0, Lci;->r:F

    .line 21
    iput v2, v0, Lci;->s:I

    .line 22
    iput v2, v0, Lci;->t:I

    .line 23
    iput v2, v0, Lci;->u:I

    .line 24
    iput v2, v0, Lci;->v:I

    const/high16 v7, -0x80000000

    .line 25
    iput v7, v0, Lci;->w:I

    .line 26
    iput v7, v0, Lci;->x:I

    .line 27
    iput v7, v0, Lci;->y:I

    .line 28
    iput v7, v0, Lci;->z:I

    .line 29
    iput v7, v0, Lci;->A:I

    .line 30
    iput v7, v0, Lci;->B:I

    .line 31
    iput v7, v0, Lci;->C:I

    .line 32
    iput v5, v0, Lci;->D:I

    const/high16 v8, 0x3f000000    # 0.5f

    .line 33
    iput v8, v0, Lci;->E:F

    .line 34
    iput v8, v0, Lci;->F:F

    const/4 v9, 0x0

    .line 35
    iput-object v9, v0, Lci;->G:Ljava/lang/String;

    .line 36
    iput v3, v0, Lci;->H:F

    .line 37
    iput v3, v0, Lci;->I:F

    .line 38
    iput v5, v0, Lci;->J:I

    .line 39
    iput v5, v0, Lci;->K:I

    .line 40
    iput v5, v0, Lci;->L:I

    .line 41
    iput v5, v0, Lci;->M:I

    .line 42
    iput v5, v0, Lci;->N:I

    .line 43
    iput v5, v0, Lci;->O:I

    .line 44
    iput v5, v0, Lci;->P:I

    .line 45
    iput v5, v0, Lci;->Q:I

    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    iput v3, v0, Lci;->R:F

    .line 47
    iput v3, v0, Lci;->S:F

    .line 48
    iput v2, v0, Lci;->T:I

    .line 49
    iput v2, v0, Lci;->U:I

    .line 50
    iput v2, v0, Lci;->V:I

    .line 51
    iput-boolean v5, v0, Lci;->W:Z

    .line 52
    iput-boolean v5, v0, Lci;->X:Z

    .line 53
    iput-object v9, v0, Lci;->Y:Ljava/lang/String;

    .line 54
    iput v5, v0, Lci;->Z:I

    .line 55
    iput-boolean v4, v0, Lci;->a0:Z

    .line 56
    iput-boolean v4, v0, Lci;->b0:Z

    .line 57
    iput-boolean v5, v0, Lci;->c0:Z

    .line 58
    iput-boolean v5, v0, Lci;->d0:Z

    .line 59
    iput-boolean v5, v0, Lci;->e0:Z

    .line 60
    iput v2, v0, Lci;->f0:I

    .line 61
    iput v2, v0, Lci;->g0:I

    .line 62
    iput v2, v0, Lci;->h0:I

    .line 63
    iput v2, v0, Lci;->i0:I

    .line 64
    iput v7, v0, Lci;->j0:I

    .line 65
    iput v7, v0, Lci;->k0:I

    .line 66
    iput v8, v0, Lci;->l0:F

    .line 67
    new-instance v3, Lpi;

    invoke-direct {v3}, Lpi;-><init>()V

    iput-object v3, v0, Lci;->p0:Lpi;

    .line 68
    sget-object v3, Lzm0;->b:[I

    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v3, v5

    :goto_0
    if-ge v3, v1, :cond_1

    .line 70
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v7

    .line 71
    sget-object v8, Lbi;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseIntArray;->get(I)I

    move-result v8

    .line 72
    const-string v9, "ConstraintLayout"

    const/4 v10, 0x2

    const/4 v11, -0x2

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    packed-switch v8, :pswitch_data_2

    goto/16 :goto_1

    .line 73
    :pswitch_0
    iget-boolean v8, v0, Lci;->d:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lci;->d:Z

    goto/16 :goto_1

    .line 74
    :pswitch_1
    iget v8, v0, Lci;->Z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->Z:I

    goto/16 :goto_1

    .line 75
    :pswitch_2
    invoke-static {v0, p1, v7, v4}, Lni;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 76
    :pswitch_3
    invoke-static {v0, p1, v7, v5}, Lni;->g(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 77
    :pswitch_4
    iget v8, v0, Lci;->C:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->C:I

    goto/16 :goto_1

    .line 78
    :pswitch_5
    iget v8, v0, Lci;->D:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->D:I

    goto/16 :goto_1

    .line 79
    :pswitch_6
    iget v8, v0, Lci;->o:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->o:I

    if-ne v8, v2, :cond_0

    .line 80
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->o:I

    goto/16 :goto_1

    .line 81
    :pswitch_7
    iget v8, v0, Lci;->n:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->n:I

    if-ne v8, v2, :cond_0

    .line 82
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->n:I

    goto/16 :goto_1

    .line 83
    :pswitch_8
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lci;->Y:Ljava/lang/String;

    goto/16 :goto_1

    .line 84
    :pswitch_9
    iget v8, v0, Lci;->U:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lci;->U:I

    goto/16 :goto_1

    .line 85
    :pswitch_a
    iget v8, v0, Lci;->T:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lci;->T:I

    goto/16 :goto_1

    .line 86
    :pswitch_b
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->K:I

    goto/16 :goto_1

    .line 87
    :pswitch_c
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->J:I

    goto/16 :goto_1

    .line 88
    :pswitch_d
    iget v8, v0, Lci;->I:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lci;->I:F

    goto/16 :goto_1

    .line 89
    :pswitch_e
    iget v8, v0, Lci;->H:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lci;->H:F

    goto/16 :goto_1

    .line 90
    :pswitch_f
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lni;->h(Lci;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 91
    :pswitch_10
    iget v8, v0, Lci;->S:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Lci;->S:F

    .line 92
    iput v10, v0, Lci;->M:I

    goto/16 :goto_1

    .line 93
    :pswitch_11
    :try_start_0
    iget v8, v0, Lci;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lci;->Q:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 94
    :catch_0
    iget v8, v0, Lci;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 95
    iput v11, v0, Lci;->Q:I

    goto/16 :goto_1

    .line 96
    :pswitch_12
    :try_start_1
    iget v8, v0, Lci;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lci;->O:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    .line 97
    :catch_1
    iget v8, v0, Lci;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 98
    iput v11, v0, Lci;->O:I

    goto/16 :goto_1

    .line 99
    :pswitch_13
    iget v8, v0, Lci;->R:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Lci;->R:F

    .line 100
    iput v10, v0, Lci;->L:I

    goto/16 :goto_1

    .line 101
    :pswitch_14
    :try_start_2
    iget v8, v0, Lci;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lci;->P:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 102
    :catch_2
    iget v8, v0, Lci;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 103
    iput v11, v0, Lci;->P:I

    goto/16 :goto_1

    .line 104
    :pswitch_15
    :try_start_3
    iget v8, v0, Lci;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Lci;->N:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_1

    .line 105
    :catch_3
    iget v8, v0, Lci;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 106
    iput v11, v0, Lci;->N:I

    goto/16 :goto_1

    .line 107
    :pswitch_16
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->M:I

    if-ne v7, v4, :cond_0

    .line 108
    const-string v7, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."

    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 109
    :pswitch_17
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->L:I

    if-ne v7, v4, :cond_0

    .line 110
    const-string v7, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."

    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 111
    :pswitch_18
    iget v8, v0, Lci;->F:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lci;->F:F

    goto/16 :goto_1

    .line 112
    :pswitch_19
    iget v8, v0, Lci;->E:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lci;->E:F

    goto/16 :goto_1

    .line 113
    :pswitch_1a
    iget-boolean v8, v0, Lci;->X:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lci;->X:Z

    goto/16 :goto_1

    .line 114
    :pswitch_1b
    iget-boolean v8, v0, Lci;->W:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Lci;->W:Z

    goto/16 :goto_1

    .line 115
    :pswitch_1c
    iget v8, v0, Lci;->B:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->B:I

    goto/16 :goto_1

    .line 116
    :pswitch_1d
    iget v8, v0, Lci;->A:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->A:I

    goto/16 :goto_1

    .line 117
    :pswitch_1e
    iget v8, v0, Lci;->z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->z:I

    goto/16 :goto_1

    .line 118
    :pswitch_1f
    iget v8, v0, Lci;->y:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->y:I

    goto/16 :goto_1

    .line 119
    :pswitch_20
    iget v8, v0, Lci;->x:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->x:I

    goto/16 :goto_1

    .line 120
    :pswitch_21
    iget v8, v0, Lci;->w:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->w:I

    goto/16 :goto_1

    .line 121
    :pswitch_22
    iget v8, v0, Lci;->v:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->v:I

    if-ne v8, v2, :cond_0

    .line 122
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->v:I

    goto/16 :goto_1

    .line 123
    :pswitch_23
    iget v8, v0, Lci;->u:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->u:I

    if-ne v8, v2, :cond_0

    .line 124
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->u:I

    goto/16 :goto_1

    .line 125
    :pswitch_24
    iget v8, v0, Lci;->t:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->t:I

    if-ne v8, v2, :cond_0

    .line 126
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->t:I

    goto/16 :goto_1

    .line 127
    :pswitch_25
    iget v8, v0, Lci;->s:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->s:I

    if-ne v8, v2, :cond_0

    .line 128
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->s:I

    goto/16 :goto_1

    .line 129
    :pswitch_26
    iget v8, v0, Lci;->m:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->m:I

    if-ne v8, v2, :cond_0

    .line 130
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->m:I

    goto/16 :goto_1

    .line 131
    :pswitch_27
    iget v8, v0, Lci;->l:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->l:I

    if-ne v8, v2, :cond_0

    .line 132
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->l:I

    goto/16 :goto_1

    .line 133
    :pswitch_28
    iget v8, v0, Lci;->k:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->k:I

    if-ne v8, v2, :cond_0

    .line 134
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->k:I

    goto/16 :goto_1

    .line 135
    :pswitch_29
    iget v8, v0, Lci;->j:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->j:I

    if-ne v8, v2, :cond_0

    .line 136
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->j:I

    goto/16 :goto_1

    .line 137
    :pswitch_2a
    iget v8, v0, Lci;->i:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->i:I

    if-ne v8, v2, :cond_0

    .line 138
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->i:I

    goto/16 :goto_1

    .line 139
    :pswitch_2b
    iget v8, v0, Lci;->h:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->h:I

    if-ne v8, v2, :cond_0

    .line 140
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->h:I

    goto/16 :goto_1

    .line 141
    :pswitch_2c
    iget v8, v0, Lci;->g:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->g:I

    if-ne v8, v2, :cond_0

    .line 142
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->g:I

    goto/16 :goto_1

    .line 143
    :pswitch_2d
    iget v8, v0, Lci;->f:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->f:I

    if-ne v8, v2, :cond_0

    .line 144
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->f:I

    goto :goto_1

    .line 145
    :pswitch_2e
    iget v8, v0, Lci;->e:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->e:I

    if-ne v8, v2, :cond_0

    .line 146
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->e:I

    goto :goto_1

    .line 147
    :pswitch_2f
    iget v8, v0, Lci;->c:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Lci;->c:F

    goto :goto_1

    .line 148
    :pswitch_30
    iget v8, v0, Lci;->b:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lci;->b:I

    goto :goto_1

    .line 149
    :pswitch_31
    iget v8, v0, Lci;->a:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Lci;->a:I

    goto :goto_1

    .line 150
    :pswitch_32
    iget v8, v0, Lci;->r:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    const/high16 v8, 0x43b40000    # 360.0f

    rem-float/2addr v7, v8

    iput v7, v0, Lci;->r:F

    cmpg-float v9, v7, v6

    if-gez v9, :cond_0

    sub-float v7, v8, v7

    rem-float/2addr v7, v8

    .line 151
    iput v7, v0, Lci;->r:F

    goto :goto_1

    .line 152
    :pswitch_33
    iget v8, v0, Lci;->q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Lci;->q:I

    goto :goto_1

    .line 153
    :pswitch_34
    iget v8, v0, Lci;->p:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Lci;->p:I

    if-ne v8, v2, :cond_0

    .line 154
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->p:I

    goto :goto_1

    .line 155
    :pswitch_35
    iget v8, v0, Lci;->V:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Lci;->V:I

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 156
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 157
    invoke-virtual {v0}, Lci;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x40
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 8

    .line 158
    new-instance v0, Lci;

    .line 159
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, -0x1

    .line 160
    iput v1, v0, Lci;->a:I

    .line 161
    iput v1, v0, Lci;->b:I

    const/high16 v2, -0x40800000    # -1.0f

    .line 162
    iput v2, v0, Lci;->c:F

    const/4 v3, 0x1

    .line 163
    iput-boolean v3, v0, Lci;->d:Z

    .line 164
    iput v1, v0, Lci;->e:I

    .line 165
    iput v1, v0, Lci;->f:I

    .line 166
    iput v1, v0, Lci;->g:I

    .line 167
    iput v1, v0, Lci;->h:I

    .line 168
    iput v1, v0, Lci;->i:I

    .line 169
    iput v1, v0, Lci;->j:I

    .line 170
    iput v1, v0, Lci;->k:I

    .line 171
    iput v1, v0, Lci;->l:I

    .line 172
    iput v1, v0, Lci;->m:I

    .line 173
    iput v1, v0, Lci;->n:I

    .line 174
    iput v1, v0, Lci;->o:I

    .line 175
    iput v1, v0, Lci;->p:I

    const/4 v4, 0x0

    .line 176
    iput v4, v0, Lci;->q:I

    const/4 v5, 0x0

    .line 177
    iput v5, v0, Lci;->r:F

    .line 178
    iput v1, v0, Lci;->s:I

    .line 179
    iput v1, v0, Lci;->t:I

    .line 180
    iput v1, v0, Lci;->u:I

    .line 181
    iput v1, v0, Lci;->v:I

    const/high16 v5, -0x80000000

    .line 182
    iput v5, v0, Lci;->w:I

    .line 183
    iput v5, v0, Lci;->x:I

    .line 184
    iput v5, v0, Lci;->y:I

    .line 185
    iput v5, v0, Lci;->z:I

    .line 186
    iput v5, v0, Lci;->A:I

    .line 187
    iput v5, v0, Lci;->B:I

    .line 188
    iput v5, v0, Lci;->C:I

    .line 189
    iput v4, v0, Lci;->D:I

    const/high16 v6, 0x3f000000    # 0.5f

    .line 190
    iput v6, v0, Lci;->E:F

    .line 191
    iput v6, v0, Lci;->F:F

    const/4 v7, 0x0

    .line 192
    iput-object v7, v0, Lci;->G:Ljava/lang/String;

    .line 193
    iput v2, v0, Lci;->H:F

    .line 194
    iput v2, v0, Lci;->I:F

    .line 195
    iput v4, v0, Lci;->J:I

    .line 196
    iput v4, v0, Lci;->K:I

    .line 197
    iput v4, v0, Lci;->L:I

    .line 198
    iput v4, v0, Lci;->M:I

    .line 199
    iput v4, v0, Lci;->N:I

    .line 200
    iput v4, v0, Lci;->O:I

    .line 201
    iput v4, v0, Lci;->P:I

    .line 202
    iput v4, v0, Lci;->Q:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 203
    iput v2, v0, Lci;->R:F

    .line 204
    iput v2, v0, Lci;->S:F

    .line 205
    iput v1, v0, Lci;->T:I

    .line 206
    iput v1, v0, Lci;->U:I

    .line 207
    iput v1, v0, Lci;->V:I

    .line 208
    iput-boolean v4, v0, Lci;->W:Z

    .line 209
    iput-boolean v4, v0, Lci;->X:Z

    .line 210
    iput-object v7, v0, Lci;->Y:Ljava/lang/String;

    .line 211
    iput v4, v0, Lci;->Z:I

    .line 212
    iput-boolean v3, v0, Lci;->a0:Z

    .line 213
    iput-boolean v3, v0, Lci;->b0:Z

    .line 214
    iput-boolean v4, v0, Lci;->c0:Z

    .line 215
    iput-boolean v4, v0, Lci;->d0:Z

    .line 216
    iput-boolean v4, v0, Lci;->e0:Z

    .line 217
    iput v1, v0, Lci;->f0:I

    .line 218
    iput v1, v0, Lci;->g0:I

    .line 219
    iput v1, v0, Lci;->h0:I

    .line 220
    iput v1, v0, Lci;->i0:I

    .line 221
    iput v5, v0, Lci;->j0:I

    .line 222
    iput v5, v0, Lci;->k0:I

    .line 223
    iput v6, v0, Lci;->l0:F

    .line 224
    new-instance v1, Lpi;

    invoke-direct {v1}, Lpi;-><init>()V

    iput-object v1, v0, Lci;->p0:Lpi;

    .line 225
    instance-of v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_0

    .line 226
    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 227
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 228
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 229
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 230
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 231
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 232
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 233
    :cond_0
    instance-of v1, p1, Lci;

    if-nez v1, :cond_1

    return-object v0

    .line 234
    :cond_1
    check-cast p1, Lci;

    .line 235
    iget v1, p1, Lci;->a:I

    iput v1, v0, Lci;->a:I

    .line 236
    iget v1, p1, Lci;->b:I

    iput v1, v0, Lci;->b:I

    .line 237
    iget v1, p1, Lci;->c:F

    iput v1, v0, Lci;->c:F

    .line 238
    iget-boolean v1, p1, Lci;->d:Z

    iput-boolean v1, v0, Lci;->d:Z

    .line 239
    iget v1, p1, Lci;->e:I

    iput v1, v0, Lci;->e:I

    .line 240
    iget v1, p1, Lci;->f:I

    iput v1, v0, Lci;->f:I

    .line 241
    iget v1, p1, Lci;->g:I

    iput v1, v0, Lci;->g:I

    .line 242
    iget v1, p1, Lci;->h:I

    iput v1, v0, Lci;->h:I

    .line 243
    iget v1, p1, Lci;->i:I

    iput v1, v0, Lci;->i:I

    .line 244
    iget v1, p1, Lci;->j:I

    iput v1, v0, Lci;->j:I

    .line 245
    iget v1, p1, Lci;->k:I

    iput v1, v0, Lci;->k:I

    .line 246
    iget v1, p1, Lci;->l:I

    iput v1, v0, Lci;->l:I

    .line 247
    iget v1, p1, Lci;->m:I

    iput v1, v0, Lci;->m:I

    .line 248
    iget v1, p1, Lci;->n:I

    iput v1, v0, Lci;->n:I

    .line 249
    iget v1, p1, Lci;->o:I

    iput v1, v0, Lci;->o:I

    .line 250
    iget v1, p1, Lci;->p:I

    iput v1, v0, Lci;->p:I

    .line 251
    iget v1, p1, Lci;->q:I

    iput v1, v0, Lci;->q:I

    .line 252
    iget v1, p1, Lci;->r:F

    iput v1, v0, Lci;->r:F

    .line 253
    iget v1, p1, Lci;->s:I

    iput v1, v0, Lci;->s:I

    .line 254
    iget v1, p1, Lci;->t:I

    iput v1, v0, Lci;->t:I

    .line 255
    iget v1, p1, Lci;->u:I

    iput v1, v0, Lci;->u:I

    .line 256
    iget v1, p1, Lci;->v:I

    iput v1, v0, Lci;->v:I

    .line 257
    iget v1, p1, Lci;->w:I

    iput v1, v0, Lci;->w:I

    .line 258
    iget v1, p1, Lci;->x:I

    iput v1, v0, Lci;->x:I

    .line 259
    iget v1, p1, Lci;->y:I

    iput v1, v0, Lci;->y:I

    .line 260
    iget v1, p1, Lci;->z:I

    iput v1, v0, Lci;->z:I

    .line 261
    iget v1, p1, Lci;->A:I

    iput v1, v0, Lci;->A:I

    .line 262
    iget v1, p1, Lci;->B:I

    iput v1, v0, Lci;->B:I

    .line 263
    iget v1, p1, Lci;->C:I

    iput v1, v0, Lci;->C:I

    .line 264
    iget v1, p1, Lci;->D:I

    iput v1, v0, Lci;->D:I

    .line 265
    iget v1, p1, Lci;->E:F

    iput v1, v0, Lci;->E:F

    .line 266
    iget v1, p1, Lci;->F:F

    iput v1, v0, Lci;->F:F

    .line 267
    iget-object v1, p1, Lci;->G:Ljava/lang/String;

    iput-object v1, v0, Lci;->G:Ljava/lang/String;

    .line 268
    iget v1, p1, Lci;->H:F

    iput v1, v0, Lci;->H:F

    .line 269
    iget v1, p1, Lci;->I:F

    iput v1, v0, Lci;->I:F

    .line 270
    iget v1, p1, Lci;->J:I

    iput v1, v0, Lci;->J:I

    .line 271
    iget v1, p1, Lci;->K:I

    iput v1, v0, Lci;->K:I

    .line 272
    iget-boolean v1, p1, Lci;->W:Z

    iput-boolean v1, v0, Lci;->W:Z

    .line 273
    iget-boolean v1, p1, Lci;->X:Z

    iput-boolean v1, v0, Lci;->X:Z

    .line 274
    iget v1, p1, Lci;->L:I

    iput v1, v0, Lci;->L:I

    .line 275
    iget v1, p1, Lci;->M:I

    iput v1, v0, Lci;->M:I

    .line 276
    iget v1, p1, Lci;->N:I

    iput v1, v0, Lci;->N:I

    .line 277
    iget v1, p1, Lci;->P:I

    iput v1, v0, Lci;->P:I

    .line 278
    iget v1, p1, Lci;->O:I

    iput v1, v0, Lci;->O:I

    .line 279
    iget v1, p1, Lci;->Q:I

    iput v1, v0, Lci;->Q:I

    .line 280
    iget v1, p1, Lci;->R:F

    iput v1, v0, Lci;->R:F

    .line 281
    iget v1, p1, Lci;->S:F

    iput v1, v0, Lci;->S:F

    .line 282
    iget v1, p1, Lci;->T:I

    iput v1, v0, Lci;->T:I

    .line 283
    iget v1, p1, Lci;->U:I

    iput v1, v0, Lci;->U:I

    .line 284
    iget v1, p1, Lci;->V:I

    iput v1, v0, Lci;->V:I

    .line 285
    iget-boolean v1, p1, Lci;->a0:Z

    iput-boolean v1, v0, Lci;->a0:Z

    .line 286
    iget-boolean v1, p1, Lci;->b0:Z

    iput-boolean v1, v0, Lci;->b0:Z

    .line 287
    iget-boolean v1, p1, Lci;->c0:Z

    iput-boolean v1, v0, Lci;->c0:Z

    .line 288
    iget-boolean v1, p1, Lci;->d0:Z

    iput-boolean v1, v0, Lci;->d0:Z

    .line 289
    iget v1, p1, Lci;->f0:I

    iput v1, v0, Lci;->f0:I

    .line 290
    iget v1, p1, Lci;->g0:I

    iput v1, v0, Lci;->g0:I

    .line 291
    iget v1, p1, Lci;->h0:I

    iput v1, v0, Lci;->h0:I

    .line 292
    iget v1, p1, Lci;->i0:I

    iput v1, v0, Lci;->i0:I

    .line 293
    iget v1, p1, Lci;->j0:I

    iput v1, v0, Lci;->j0:I

    .line 294
    iget v1, p1, Lci;->k0:I

    iput v1, v0, Lci;->k0:I

    .line 295
    iget v1, p1, Lci;->l0:F

    iput v1, v0, Lci;->l0:F

    .line 296
    iget-object v1, p1, Lci;->Y:Ljava/lang/String;

    iput-object v1, v0, Lci;->Y:Ljava/lang/String;

    .line 297
    iget v1, p1, Lci;->Z:I

    iput v1, v0, Lci;->Z:I

    .line 298
    iget-object p1, p1, Lci;->p0:Lpi;

    iput-object p1, v0, Lci;->p0:Lpi;

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 2
    .line 3
    iget v0, v0, Lqi;->D0:I

    .line 4
    .line 5
    return v0
.end method

.method public getSceneString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 7
    .line 8
    iget-object v2, v1, Lpi;->j:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, v1, Lpi;->j:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v2, "parent"

    .line 35
    .line 36
    iput-object v2, v1, Lpi;->j:Ljava/lang/String;

    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object v2, v1, Lpi;->h0:Ljava/lang/String;

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-object v2, v1, Lpi;->j:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v2, v1, Lpi;->h0:Ljava/lang/String;

    .line 45
    .line 46
    :cond_2
    iget-object v2, v1, Lqi;->q0:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x0

    .line 53
    :cond_3
    :goto_1
    if-ge v5, v4, :cond_5

    .line 54
    .line 55
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    check-cast v6, Lpi;

    .line 62
    .line 63
    iget-object v7, v6, Lpi;->f0:Landroid/view/View;

    .line 64
    .line 65
    if-eqz v7, :cond_3

    .line 66
    .line 67
    iget-object v8, v6, Lpi;->j:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v8, :cond_4

    .line 70
    .line 71
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eq v7, v3, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-virtual {v8, v7}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iput-object v7, v6, Lpi;->j:Ljava/lang/String;

    .line 90
    .line 91
    :cond_4
    iget-object v7, v6, Lpi;->h0:Ljava/lang/String;

    .line 92
    .line 93
    if-nez v7, :cond_3

    .line 94
    .line 95
    iget-object v7, v6, Lpi;->j:Ljava/lang/String;

    .line 96
    .line 97
    iput-object v7, v6, Lpi;->h0:Ljava/lang/String;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    invoke-virtual {v1, v0}, Lqi;->n(Ljava/lang/StringBuilder;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0
.end method

.method public final h(Landroid/view/View;)Lpi;
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v0, v0, Lci;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lci;

    .line 21
    .line 22
    iget-object p1, p1, Lci;->p0:Lpi;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v0, v0, Lci;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lci;

    .line 49
    .line 50
    iget-object p1, p1, Lci;->p0:Lpi;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    const/4 p1, 0x0

    .line 54
    return-object p1
.end method

.method public final i(Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 2
    .line 3
    iput-object p0, v0, Lpi;->f0:Landroid/view/View;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldi;

    .line 6
    .line 7
    iput-object v1, v0, Lqi;->u0:Ldi;

    .line 8
    .line 9
    iget-object v2, v0, Lqi;->s0:Lqm;

    .line 10
    .line 11
    iput-object v1, v2, Lqm;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 24
    .line 25
    if-eqz p1, :cond_8

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lzm0;->b:[I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {v2, p1, v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    move v2, v4

    .line 43
    :goto_0
    if-ge v2, p2, :cond_7

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/16 v5, 0x10

    .line 50
    .line 51
    if-ne v3, v5, :cond_0

    .line 52
    .line 53
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 54
    .line 55
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_0
    const/16 v5, 0x11

    .line 63
    .line 64
    if-ne v3, v5, :cond_1

    .line 65
    .line 66
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 67
    .line 68
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    const/16 v5, 0xe

    .line 76
    .line 77
    if-ne v3, v5, :cond_2

    .line 78
    .line 79
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 80
    .line 81
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/16 v5, 0xf

    .line 89
    .line 90
    if-ne v3, v5, :cond_3

    .line 91
    .line 92
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 93
    .line 94
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    const/16 v5, 0x71

    .line 102
    .line 103
    if-ne v3, v5, :cond_4

    .line 104
    .line 105
    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 106
    .line 107
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    const/16 v5, 0x38

    .line 115
    .line 116
    if-ne v3, v5, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    :try_start_0
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->j(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgw3;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    const/16 v5, 0x22

    .line 132
    .line 133
    if-ne v3, v5, :cond_6

    .line 134
    .line 135
    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    :try_start_1
    new-instance v5, Lni;

    .line 140
    .line 141
    invoke-direct {v5}, Lni;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v5, v6, v3}, Lni;->e(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 155
    .line 156
    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 157
    .line 158
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 162
    .line 163
    .line 164
    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 165
    .line 166
    iput p1, v0, Lqi;->D0:I

    .line 167
    .line 168
    const/16 p1, 0x200

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Lqi;->W(I)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    sput-boolean p1, Lx60;->q:Z

    .line 175
    .line 176
    return-void
.end method

.method public final j(I)V
    .locals 8

    .line 1
    new-instance v0, Lgw3;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x5

    .line 8
    invoke-direct {v0, v2}, Lgw3;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, v0, Lgw3;->g:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v2, Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, v0, Lgw3;->h:Ljava/lang/Object;

    .line 24
    .line 25
    const-string v2, "Error parsing resource: "

    .line 26
    .line 27
    const-string v3, "ConstraintLayoutStates"

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    :try_start_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    :goto_0
    const/4 v7, 0x1

    .line 43
    if-eq v5, v7, :cond_2

    .line 44
    .line 45
    const/4 v7, 0x2

    .line 46
    if-eq v5, v7, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    sparse-switch v7, :sswitch_data_0

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :sswitch_0
    const-string v7, "Variant"

    .line 62
    .line 63
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    new-instance v5, Lei;

    .line 70
    .line 71
    invoke-direct {v5, v1, v4}, Lei;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 72
    .line 73
    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    iget-object v7, v6, Lpi1;->h:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catch_0
    move-exception v1

    .line 85
    goto :goto_3

    .line 86
    :catch_1
    move-exception v1

    .line 87
    goto :goto_4

    .line 88
    :sswitch_1
    const-string v7, "layoutDescription"

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :sswitch_2
    const-string v7, "StateSet"

    .line 92
    .line 93
    :goto_1
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :sswitch_3
    const-string v7, "State"

    .line 98
    .line 99
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_1

    .line 104
    .line 105
    new-instance v5, Lpi1;

    .line 106
    .line 107
    invoke-direct {v5, v1, v4}, Lpi1;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 108
    .line 109
    .line 110
    iget-object v6, v0, Lgw3;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, Landroid/util/SparseArray;

    .line 113
    .line 114
    iget v7, v5, Lpi1;->f:I

    .line 115
    .line 116
    invoke-virtual {v6, v7, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v6, v5

    .line 120
    goto :goto_2

    .line 121
    :sswitch_4
    const-string v7, "ConstraintSet"

    .line 122
    .line 123
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_1

    .line 128
    .line 129
    invoke-virtual {v0, v1, v4}, Lgw3;->w(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    :goto_2
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 133
    .line 134
    .line 135
    move-result v5
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    goto :goto_0

    .line 137
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {v3, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {v3, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 166
    .line 167
    .line 168
    :cond_2
    :goto_5
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgw3;

    .line 169
    .line 170
    return-void

    .line 171
    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final k(Lqi;III)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/4 v8, 0x0

    .line 28
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    add-int v10, v7, v9

    .line 41
    .line 42
    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldi;

    .line 47
    .line 48
    iput v7, v12, Ldi;->b:I

    .line 49
    .line 50
    iput v9, v12, Ldi;->c:I

    .line 51
    .line 52
    iput v11, v12, Ldi;->d:I

    .line 53
    .line 54
    iput v10, v12, Ldi;->e:I

    .line 55
    .line 56
    move/from16 v9, p3

    .line 57
    .line 58
    iput v9, v12, Ldi;->f:I

    .line 59
    .line 60
    move/from16 v9, p4

    .line 61
    .line 62
    iput v9, v12, Ldi;->g:I

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 73
    .line 74
    .line 75
    move-result v13

    .line 76
    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    const/4 v14, 0x1

    .line 81
    if-gtz v9, :cond_1

    .line 82
    .line 83
    if-lez v13, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 100
    .line 101
    .line 102
    move-result-object v15

    .line 103
    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 104
    .line 105
    const/high16 v16, 0x400000

    .line 106
    .line 107
    and-int v15, v15, v16

    .line 108
    .line 109
    if-eqz v15, :cond_2

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-ne v14, v15, :cond_2

    .line 116
    .line 117
    move v9, v13

    .line 118
    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    .line 119
    sub-int/2addr v6, v10

    .line 120
    iget v10, v12, Ldi;->e:I

    .line 121
    .line 122
    iget v11, v12, Ldi;->d:I

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    const/high16 v15, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/high16 v13, -0x80000000

    .line 131
    .line 132
    if-eq v3, v13, :cond_6

    .line 133
    .line 134
    if-eqz v3, :cond_4

    .line 135
    .line 136
    if-eq v3, v15, :cond_3

    .line 137
    .line 138
    move/from16 v17, v8

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 142
    .line 143
    sub-int/2addr v14, v11

    .line 144
    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    move/from16 v17, v14

    .line 149
    .line 150
    const/4 v14, 0x1

    .line 151
    goto :goto_4

    .line 152
    :cond_4
    if-nez v12, :cond_5

    .line 153
    .line 154
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 155
    .line 156
    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    :goto_2
    move/from16 v17, v14

    .line 161
    .line 162
    :goto_3
    const/4 v14, 0x2

    .line 163
    goto :goto_4

    .line 164
    :cond_5
    move/from16 v17, v8

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    if-nez v12, :cond_7

    .line 168
    .line 169
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 170
    .line 171
    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    goto :goto_2

    .line 176
    :cond_7
    move/from16 v17, v4

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :goto_4
    if-eq v5, v13, :cond_b

    .line 180
    .line 181
    if-eqz v5, :cond_9

    .line 182
    .line 183
    if-eq v5, v15, :cond_8

    .line 184
    .line 185
    move v13, v8

    .line 186
    :goto_5
    const/4 v12, 0x1

    .line 187
    goto :goto_8

    .line 188
    :cond_8
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 189
    .line 190
    sub-int/2addr v12, v10

    .line 191
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    move v13, v12

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    if-nez v12, :cond_a

    .line 198
    .line 199
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 200
    .line 201
    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    :goto_6
    move v13, v12

    .line 206
    :goto_7
    const/4 v12, 0x2

    .line 207
    goto :goto_8

    .line 208
    :cond_a
    move v13, v8

    .line 209
    goto :goto_7

    .line 210
    :cond_b
    if-nez v12, :cond_c

    .line 211
    .line 212
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 213
    .line 214
    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    goto :goto_6

    .line 219
    :cond_c
    move v13, v6

    .line 220
    goto :goto_7

    .line 221
    :goto_8
    invoke-virtual {v1}, Lpi;->q()I

    .line 222
    .line 223
    .line 224
    move-result v15

    .line 225
    iget-object v8, v1, Lqi;->s0:Lqm;

    .line 226
    .line 227
    move/from16 v19, v10

    .line 228
    .line 229
    iget-object v10, v1, Lpi;->C:[I

    .line 230
    .line 231
    move-object/from16 v20, v10

    .line 232
    .line 233
    move/from16 v10, v17

    .line 234
    .line 235
    if-ne v10, v15, :cond_d

    .line 236
    .line 237
    invoke-virtual {v1}, Lpi;->k()I

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    if-eq v13, v15, :cond_e

    .line 242
    .line 243
    :cond_d
    const/4 v15, 0x1

    .line 244
    goto :goto_a

    .line 245
    :cond_e
    const/16 p4, 0x1

    .line 246
    .line 247
    :goto_9
    const/4 v15, 0x0

    .line 248
    goto :goto_b

    .line 249
    :goto_a
    iput-boolean v15, v8, Lqm;->b:Z

    .line 250
    .line 251
    move/from16 p4, v15

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :goto_b
    iput v15, v1, Lpi;->Y:I

    .line 255
    .line 256
    iput v15, v1, Lpi;->Z:I

    .line 257
    .line 258
    move/from16 v18, v15

    .line 259
    .line 260
    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 261
    .line 262
    sub-int/2addr v15, v11

    .line 263
    aput v15, v20, v18

    .line 264
    .line 265
    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 266
    .line 267
    sub-int v15, v15, v19

    .line 268
    .line 269
    aput v15, v20, p4

    .line 270
    .line 271
    move/from16 v15, v18

    .line 272
    .line 273
    iput v15, v1, Lpi;->b0:I

    .line 274
    .line 275
    iput v15, v1, Lpi;->c0:I

    .line 276
    .line 277
    invoke-virtual {v1, v14}, Lpi;->M(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v10}, Lpi;->O(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v12}, Lpi;->N(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v13}, Lpi;->L(I)V

    .line 287
    .line 288
    .line 289
    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 290
    .line 291
    sub-int/2addr v10, v11

    .line 292
    if-gez v10, :cond_f

    .line 293
    .line 294
    iput v15, v1, Lpi;->b0:I

    .line 295
    .line 296
    goto :goto_c

    .line 297
    :cond_f
    iput v10, v1, Lpi;->b0:I

    .line 298
    .line 299
    :goto_c
    iget v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 300
    .line 301
    sub-int v10, v10, v19

    .line 302
    .line 303
    if-gez v10, :cond_10

    .line 304
    .line 305
    iput v15, v1, Lpi;->c0:I

    .line 306
    .line 307
    goto :goto_d

    .line 308
    :cond_10
    iput v10, v1, Lpi;->c0:I

    .line 309
    .line 310
    :goto_d
    iput v9, v1, Lqi;->x0:I

    .line 311
    .line 312
    iput v7, v1, Lqi;->y0:I

    .line 313
    .line 314
    iget-object v7, v1, Lqi;->r0:Lt83;

    .line 315
    .line 316
    iget-object v9, v7, Lt83;->i:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v9, Lqi;

    .line 319
    .line 320
    iget-object v10, v7, Lt83;->g:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v10, Ljava/util/ArrayList;

    .line 323
    .line 324
    iget-object v11, v1, Lqi;->u0:Ldi;

    .line 325
    .line 326
    iget-object v12, v1, Lqi;->q0:Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    invoke-virtual {v1}, Lpi;->q()I

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    invoke-virtual {v1}, Lpi;->k()I

    .line 337
    .line 338
    .line 339
    move-result v14

    .line 340
    const/16 v15, 0x80

    .line 341
    .line 342
    invoke-static {v2, v15}, Lzt0;->m(II)Z

    .line 343
    .line 344
    .line 345
    move-result v15

    .line 346
    const/16 v0, 0x40

    .line 347
    .line 348
    if-nez v15, :cond_12

    .line 349
    .line 350
    invoke-static {v2, v0}, Lzt0;->m(II)Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    if-eqz v2, :cond_11

    .line 355
    .line 356
    goto :goto_e

    .line 357
    :cond_11
    const/4 v2, 0x0

    .line 358
    goto :goto_f

    .line 359
    :cond_12
    :goto_e
    const/4 v2, 0x1

    .line 360
    :goto_f
    const/16 v17, 0x0

    .line 361
    .line 362
    if-eqz v2, :cond_1b

    .line 363
    .line 364
    const/4 v0, 0x0

    .line 365
    :goto_10
    if-ge v0, v12, :cond_1b

    .line 366
    .line 367
    move/from16 v21, v2

    .line 368
    .line 369
    iget-object v2, v1, Lqi;->q0:Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    check-cast v2, Lpi;

    .line 376
    .line 377
    move/from16 v22, v0

    .line 378
    .line 379
    iget-object v0, v2, Lpi;->p0:[I

    .line 380
    .line 381
    move-object/from16 v23, v0

    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    aget v0, v23, v18

    .line 386
    .line 387
    move/from16 v24, v12

    .line 388
    .line 389
    const/4 v12, 0x3

    .line 390
    if-ne v0, v12, :cond_13

    .line 391
    .line 392
    const/16 v26, 0x1

    .line 393
    .line 394
    :goto_11
    const/16 v25, 0x1

    .line 395
    .line 396
    goto :goto_12

    .line 397
    :cond_13
    const/16 v26, 0x0

    .line 398
    .line 399
    goto :goto_11

    .line 400
    :goto_12
    aget v0, v23, v25

    .line 401
    .line 402
    if-ne v0, v12, :cond_14

    .line 403
    .line 404
    const/4 v0, 0x1

    .line 405
    goto :goto_13

    .line 406
    :cond_14
    const/4 v0, 0x0

    .line 407
    :goto_13
    if-eqz v26, :cond_15

    .line 408
    .line 409
    if-eqz v0, :cond_15

    .line 410
    .line 411
    iget v0, v2, Lpi;->W:F

    .line 412
    .line 413
    cmpl-float v0, v0, v17

    .line 414
    .line 415
    if-lez v0, :cond_15

    .line 416
    .line 417
    const/4 v0, 0x1

    .line 418
    goto :goto_14

    .line 419
    :cond_15
    const/4 v0, 0x0

    .line 420
    :goto_14
    invoke-virtual {v2}, Lpi;->x()Z

    .line 421
    .line 422
    .line 423
    move-result v12

    .line 424
    if-eqz v12, :cond_17

    .line 425
    .line 426
    if-eqz v0, :cond_17

    .line 427
    .line 428
    :cond_16
    :goto_15
    const/high16 v0, 0x40000000    # 2.0f

    .line 429
    .line 430
    const/16 v21, 0x0

    .line 431
    .line 432
    goto :goto_16

    .line 433
    :cond_17
    invoke-virtual {v2}, Lpi;->y()Z

    .line 434
    .line 435
    .line 436
    move-result v12

    .line 437
    if-eqz v12, :cond_18

    .line 438
    .line 439
    if-eqz v0, :cond_18

    .line 440
    .line 441
    goto :goto_15

    .line 442
    :cond_18
    instance-of v0, v2, Lzu;

    .line 443
    .line 444
    if-eqz v0, :cond_19

    .line 445
    .line 446
    goto :goto_15

    .line 447
    :cond_19
    invoke-virtual {v2}, Lpi;->x()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-nez v0, :cond_16

    .line 452
    .line 453
    invoke-virtual {v2}, Lpi;->y()Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-eqz v0, :cond_1a

    .line 458
    .line 459
    goto :goto_15

    .line 460
    :cond_1a
    add-int/lit8 v0, v22, 0x1

    .line 461
    .line 462
    move/from16 v2, v21

    .line 463
    .line 464
    move/from16 v12, v24

    .line 465
    .line 466
    goto :goto_10

    .line 467
    :cond_1b
    move/from16 v21, v2

    .line 468
    .line 469
    move/from16 v24, v12

    .line 470
    .line 471
    const/high16 v0, 0x40000000    # 2.0f

    .line 472
    .line 473
    :goto_16
    if-ne v3, v0, :cond_1c

    .line 474
    .line 475
    if-eq v5, v0, :cond_1d

    .line 476
    .line 477
    :cond_1c
    if-eqz v15, :cond_1e

    .line 478
    .line 479
    :cond_1d
    const/4 v0, 0x1

    .line 480
    goto :goto_17

    .line 481
    :cond_1e
    const/4 v0, 0x0

    .line 482
    :goto_17
    and-int v0, v21, v0

    .line 483
    .line 484
    if-eqz v0, :cond_3f

    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    aget v12, v20, v18

    .line 489
    .line 490
    invoke-static {v12, v4}, Ljava/lang/Math;->min(II)I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    const/4 v12, 0x1

    .line 495
    aget v2, v20, v12

    .line 496
    .line 497
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    const/high16 v6, 0x40000000    # 2.0f

    .line 502
    .line 503
    if-ne v3, v6, :cond_20

    .line 504
    .line 505
    invoke-virtual {v1}, Lpi;->q()I

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    if-eq v6, v4, :cond_1f

    .line 510
    .line 511
    invoke-virtual {v1, v4}, Lpi;->O(I)V

    .line 512
    .line 513
    .line 514
    iput-boolean v12, v8, Lqm;->a:Z

    .line 515
    .line 516
    :cond_1f
    const/high16 v6, 0x40000000    # 2.0f

    .line 517
    .line 518
    :cond_20
    if-ne v5, v6, :cond_21

    .line 519
    .line 520
    invoke-virtual {v1}, Lpi;->k()I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    if-eq v4, v2, :cond_21

    .line 525
    .line 526
    invoke-virtual {v1, v2}, Lpi;->L(I)V

    .line 527
    .line 528
    .line 529
    iput-boolean v12, v8, Lqm;->a:Z

    .line 530
    .line 531
    :cond_21
    if-ne v3, v6, :cond_38

    .line 532
    .line 533
    if-ne v5, v6, :cond_38

    .line 534
    .line 535
    iget-object v2, v8, Lqm;->e:Ljava/io/Serializable;

    .line 536
    .line 537
    check-cast v2, Ljava/util/ArrayList;

    .line 538
    .line 539
    iget-object v4, v8, Lqm;->c:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v4, Lqi;

    .line 542
    .line 543
    iget-boolean v6, v8, Lqm;->a:Z

    .line 544
    .line 545
    if-nez v6, :cond_23

    .line 546
    .line 547
    iget-boolean v6, v8, Lqm;->b:Z

    .line 548
    .line 549
    if-eqz v6, :cond_22

    .line 550
    .line 551
    goto :goto_18

    .line 552
    :cond_22
    move/from16 v20, v0

    .line 553
    .line 554
    const/4 v6, 0x0

    .line 555
    goto :goto_1a

    .line 556
    :cond_23
    :goto_18
    iget-object v6, v4, Lqi;->q0:Ljava/util/ArrayList;

    .line 557
    .line 558
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 559
    .line 560
    .line 561
    move-result v12

    .line 562
    move/from16 v20, v0

    .line 563
    .line 564
    const/4 v0, 0x0

    .line 565
    :goto_19
    if-ge v0, v12, :cond_24

    .line 566
    .line 567
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v22

    .line 571
    add-int/lit8 v0, v0, 0x1

    .line 572
    .line 573
    move/from16 v23, v0

    .line 574
    .line 575
    move-object/from16 v0, v22

    .line 576
    .line 577
    check-cast v0, Lpi;

    .line 578
    .line 579
    invoke-virtual {v0}, Lpi;->h()V

    .line 580
    .line 581
    .line 582
    move-object/from16 v22, v6

    .line 583
    .line 584
    const/4 v6, 0x0

    .line 585
    iput-boolean v6, v0, Lpi;->a:Z

    .line 586
    .line 587
    iget-object v6, v0, Lpi;->d:Lz00;

    .line 588
    .line 589
    invoke-virtual {v6}, Lz00;->n()V

    .line 590
    .line 591
    .line 592
    iget-object v0, v0, Lpi;->e:Li51;

    .line 593
    .line 594
    invoke-virtual {v0}, Li51;->m()V

    .line 595
    .line 596
    .line 597
    move-object/from16 v6, v22

    .line 598
    .line 599
    move/from16 v0, v23

    .line 600
    .line 601
    goto :goto_19

    .line 602
    :cond_24
    invoke-virtual {v4}, Lpi;->h()V

    .line 603
    .line 604
    .line 605
    const/4 v6, 0x0

    .line 606
    iput-boolean v6, v4, Lpi;->a:Z

    .line 607
    .line 608
    iget-object v0, v4, Lpi;->d:Lz00;

    .line 609
    .line 610
    invoke-virtual {v0}, Lz00;->n()V

    .line 611
    .line 612
    .line 613
    iget-object v0, v4, Lpi;->e:Li51;

    .line 614
    .line 615
    invoke-virtual {v0}, Li51;->m()V

    .line 616
    .line 617
    .line 618
    iput-boolean v6, v8, Lqm;->b:Z

    .line 619
    .line 620
    :goto_1a
    iget-object v0, v8, Lqm;->d:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v0, Lqi;

    .line 623
    .line 624
    invoke-virtual {v8, v0}, Lqm;->b(Lqi;)V

    .line 625
    .line 626
    .line 627
    iput v6, v4, Lpi;->Y:I

    .line 628
    .line 629
    iget-object v0, v4, Lpi;->p0:[I

    .line 630
    .line 631
    iput v6, v4, Lpi;->Z:I

    .line 632
    .line 633
    invoke-virtual {v4, v6}, Lpi;->j(I)I

    .line 634
    .line 635
    .line 636
    move-result v12

    .line 637
    move-object/from16 v22, v0

    .line 638
    .line 639
    const/4 v6, 0x1

    .line 640
    invoke-virtual {v4, v6}, Lpi;->j(I)I

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    iget-boolean v6, v8, Lqm;->a:Z

    .line 645
    .line 646
    if-eqz v6, :cond_25

    .line 647
    .line 648
    invoke-virtual {v8}, Lqm;->c()V

    .line 649
    .line 650
    .line 651
    :cond_25
    invoke-virtual {v4}, Lpi;->r()I

    .line 652
    .line 653
    .line 654
    move-result v6

    .line 655
    move-object/from16 v23, v11

    .line 656
    .line 657
    invoke-virtual {v4}, Lpi;->s()I

    .line 658
    .line 659
    .line 660
    move-result v11

    .line 661
    move-object/from16 v25, v10

    .line 662
    .line 663
    iget-object v10, v4, Lpi;->d:Lz00;

    .line 664
    .line 665
    iget-object v10, v10, Lm81;->h:Ljo;

    .line 666
    .line 667
    invoke-virtual {v10, v6}, Ljo;->d(I)V

    .line 668
    .line 669
    .line 670
    iget-object v10, v4, Lpi;->e:Li51;

    .line 671
    .line 672
    iget-object v10, v10, Lm81;->h:Ljo;

    .line 673
    .line 674
    invoke-virtual {v10, v11}, Ljo;->d(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v8}, Lqm;->g()V

    .line 678
    .line 679
    .line 680
    const/4 v10, 0x2

    .line 681
    if-eq v12, v10, :cond_28

    .line 682
    .line 683
    if-ne v0, v10, :cond_26

    .line 684
    .line 685
    goto :goto_1c

    .line 686
    :cond_26
    move/from16 v26, v6

    .line 687
    .line 688
    :cond_27
    const/4 v6, 0x1

    .line 689
    :goto_1b
    const/16 v18, 0x0

    .line 690
    .line 691
    goto :goto_1e

    .line 692
    :cond_28
    :goto_1c
    if-eqz v15, :cond_2a

    .line 693
    .line 694
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 695
    .line 696
    .line 697
    move-result v10

    .line 698
    move/from16 v26, v6

    .line 699
    .line 700
    const/4 v6, 0x0

    .line 701
    :cond_29
    if-ge v6, v10, :cond_2b

    .line 702
    .line 703
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v27

    .line 707
    add-int/lit8 v6, v6, 0x1

    .line 708
    .line 709
    check-cast v27, Lm81;

    .line 710
    .line 711
    invoke-virtual/range {v27 .. v27}, Lm81;->k()Z

    .line 712
    .line 713
    .line 714
    move-result v27

    .line 715
    if-nez v27, :cond_29

    .line 716
    .line 717
    const/4 v15, 0x0

    .line 718
    goto :goto_1d

    .line 719
    :cond_2a
    move/from16 v26, v6

    .line 720
    .line 721
    :cond_2b
    :goto_1d
    if-eqz v15, :cond_2c

    .line 722
    .line 723
    const/4 v10, 0x2

    .line 724
    if-ne v12, v10, :cond_2c

    .line 725
    .line 726
    const/4 v6, 0x1

    .line 727
    invoke-virtual {v4, v6}, Lpi;->M(I)V

    .line 728
    .line 729
    .line 730
    const/4 v6, 0x0

    .line 731
    invoke-virtual {v8, v4, v6}, Lqm;->d(Lqi;I)I

    .line 732
    .line 733
    .line 734
    move-result v10

    .line 735
    invoke-virtual {v4, v10}, Lpi;->O(I)V

    .line 736
    .line 737
    .line 738
    iget-object v6, v4, Lpi;->d:Lz00;

    .line 739
    .line 740
    iget-object v6, v6, Lm81;->e:Lap;

    .line 741
    .line 742
    invoke-virtual {v4}, Lpi;->q()I

    .line 743
    .line 744
    .line 745
    move-result v10

    .line 746
    invoke-virtual {v6, v10}, Lap;->d(I)V

    .line 747
    .line 748
    .line 749
    :cond_2c
    if-eqz v15, :cond_27

    .line 750
    .line 751
    const/4 v10, 0x2

    .line 752
    if-ne v0, v10, :cond_27

    .line 753
    .line 754
    const/4 v6, 0x1

    .line 755
    invoke-virtual {v4, v6}, Lpi;->N(I)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v8, v4, v6}, Lqm;->d(Lqi;I)I

    .line 759
    .line 760
    .line 761
    move-result v10

    .line 762
    invoke-virtual {v4, v10}, Lpi;->L(I)V

    .line 763
    .line 764
    .line 765
    iget-object v10, v4, Lpi;->e:Li51;

    .line 766
    .line 767
    iget-object v10, v10, Lm81;->e:Lap;

    .line 768
    .line 769
    invoke-virtual {v4}, Lpi;->k()I

    .line 770
    .line 771
    .line 772
    move-result v15

    .line 773
    invoke-virtual {v10, v15}, Lap;->d(I)V

    .line 774
    .line 775
    .line 776
    goto :goto_1b

    .line 777
    :goto_1e
    aget v10, v22, v18

    .line 778
    .line 779
    if-eq v10, v6, :cond_2e

    .line 780
    .line 781
    const/4 v6, 0x4

    .line 782
    if-ne v10, v6, :cond_2d

    .line 783
    .line 784
    goto :goto_1f

    .line 785
    :cond_2d
    const/4 v6, 0x0

    .line 786
    goto :goto_20

    .line 787
    :cond_2e
    :goto_1f
    invoke-virtual {v4}, Lpi;->q()I

    .line 788
    .line 789
    .line 790
    move-result v6

    .line 791
    add-int v6, v6, v26

    .line 792
    .line 793
    iget-object v10, v4, Lpi;->d:Lz00;

    .line 794
    .line 795
    iget-object v10, v10, Lm81;->i:Ljo;

    .line 796
    .line 797
    invoke-virtual {v10, v6}, Ljo;->d(I)V

    .line 798
    .line 799
    .line 800
    iget-object v10, v4, Lpi;->d:Lz00;

    .line 801
    .line 802
    iget-object v10, v10, Lm81;->e:Lap;

    .line 803
    .line 804
    sub-int v6, v6, v26

    .line 805
    .line 806
    invoke-virtual {v10, v6}, Lap;->d(I)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v8}, Lqm;->g()V

    .line 810
    .line 811
    .line 812
    const/4 v6, 0x1

    .line 813
    aget v10, v22, v6

    .line 814
    .line 815
    if-eq v10, v6, :cond_2f

    .line 816
    .line 817
    const/4 v6, 0x4

    .line 818
    if-ne v10, v6, :cond_30

    .line 819
    .line 820
    :cond_2f
    invoke-virtual {v4}, Lpi;->k()I

    .line 821
    .line 822
    .line 823
    move-result v6

    .line 824
    add-int/2addr v6, v11

    .line 825
    iget-object v10, v4, Lpi;->e:Li51;

    .line 826
    .line 827
    iget-object v10, v10, Lm81;->i:Ljo;

    .line 828
    .line 829
    invoke-virtual {v10, v6}, Ljo;->d(I)V

    .line 830
    .line 831
    .line 832
    iget-object v10, v4, Lpi;->e:Li51;

    .line 833
    .line 834
    iget-object v10, v10, Lm81;->e:Lap;

    .line 835
    .line 836
    sub-int/2addr v6, v11

    .line 837
    invoke-virtual {v10, v6}, Lap;->d(I)V

    .line 838
    .line 839
    .line 840
    :cond_30
    invoke-virtual {v8}, Lqm;->g()V

    .line 841
    .line 842
    .line 843
    const/4 v6, 0x1

    .line 844
    :goto_20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 845
    .line 846
    .line 847
    move-result v8

    .line 848
    const/4 v10, 0x0

    .line 849
    :goto_21
    if-ge v10, v8, :cond_32

    .line 850
    .line 851
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v11

    .line 855
    add-int/lit8 v10, v10, 0x1

    .line 856
    .line 857
    check-cast v11, Lm81;

    .line 858
    .line 859
    iget-object v15, v11, Lm81;->b:Lpi;

    .line 860
    .line 861
    if-ne v15, v4, :cond_31

    .line 862
    .line 863
    iget-boolean v15, v11, Lm81;->g:Z

    .line 864
    .line 865
    if-nez v15, :cond_31

    .line 866
    .line 867
    goto :goto_21

    .line 868
    :cond_31
    invoke-virtual {v11}, Lm81;->e()V

    .line 869
    .line 870
    .line 871
    goto :goto_21

    .line 872
    :cond_32
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 873
    .line 874
    .line 875
    move-result v8

    .line 876
    const/4 v10, 0x0

    .line 877
    :cond_33
    :goto_22
    if-ge v10, v8, :cond_37

    .line 878
    .line 879
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v11

    .line 883
    add-int/lit8 v10, v10, 0x1

    .line 884
    .line 885
    check-cast v11, Lm81;

    .line 886
    .line 887
    if-nez v6, :cond_34

    .line 888
    .line 889
    iget-object v15, v11, Lm81;->b:Lpi;

    .line 890
    .line 891
    if-ne v15, v4, :cond_34

    .line 892
    .line 893
    goto :goto_22

    .line 894
    :cond_34
    iget-object v15, v11, Lm81;->h:Ljo;

    .line 895
    .line 896
    iget-boolean v15, v15, Ljo;->j:Z

    .line 897
    .line 898
    if-nez v15, :cond_35

    .line 899
    .line 900
    :goto_23
    const/4 v2, 0x0

    .line 901
    goto :goto_24

    .line 902
    :cond_35
    iget-object v15, v11, Lm81;->i:Ljo;

    .line 903
    .line 904
    iget-boolean v15, v15, Ljo;->j:Z

    .line 905
    .line 906
    if-nez v15, :cond_36

    .line 907
    .line 908
    instance-of v15, v11, Lc00;

    .line 909
    .line 910
    if-nez v15, :cond_36

    .line 911
    .line 912
    goto :goto_23

    .line 913
    :cond_36
    iget-object v15, v11, Lm81;->e:Lap;

    .line 914
    .line 915
    iget-boolean v15, v15, Ljo;->j:Z

    .line 916
    .line 917
    if-nez v15, :cond_33

    .line 918
    .line 919
    instance-of v15, v11, Lzd;

    .line 920
    .line 921
    if-nez v15, :cond_33

    .line 922
    .line 923
    instance-of v11, v11, Lc00;

    .line 924
    .line 925
    if-nez v11, :cond_33

    .line 926
    .line 927
    goto :goto_23

    .line 928
    :cond_37
    const/4 v2, 0x1

    .line 929
    :goto_24
    invoke-virtual {v4, v12}, Lpi;->M(I)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v4, v0}, Lpi;->N(I)V

    .line 933
    .line 934
    .line 935
    const/4 v0, 0x2

    .line 936
    const/high16 v6, 0x40000000    # 2.0f

    .line 937
    .line 938
    goto/16 :goto_28

    .line 939
    .line 940
    :cond_38
    move/from16 v20, v0

    .line 941
    .line 942
    move-object/from16 v25, v10

    .line 943
    .line 944
    move-object/from16 v23, v11

    .line 945
    .line 946
    iget-object v0, v8, Lqm;->c:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v0, Lqi;

    .line 949
    .line 950
    iget-boolean v2, v8, Lqm;->a:Z

    .line 951
    .line 952
    if-eqz v2, :cond_3a

    .line 953
    .line 954
    iget-object v2, v0, Lqi;->q0:Ljava/util/ArrayList;

    .line 955
    .line 956
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 957
    .line 958
    .line 959
    move-result v4

    .line 960
    const/4 v6, 0x0

    .line 961
    :goto_25
    if-ge v6, v4, :cond_39

    .line 962
    .line 963
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v10

    .line 967
    add-int/lit8 v6, v6, 0x1

    .line 968
    .line 969
    check-cast v10, Lpi;

    .line 970
    .line 971
    invoke-virtual {v10}, Lpi;->h()V

    .line 972
    .line 973
    .line 974
    const/4 v11, 0x0

    .line 975
    iput-boolean v11, v10, Lpi;->a:Z

    .line 976
    .line 977
    iget-object v12, v10, Lpi;->d:Lz00;

    .line 978
    .line 979
    move-object/from16 v18, v2

    .line 980
    .line 981
    iget-object v2, v12, Lm81;->e:Lap;

    .line 982
    .line 983
    iput-boolean v11, v2, Ljo;->j:Z

    .line 984
    .line 985
    iput-boolean v11, v12, Lm81;->g:Z

    .line 986
    .line 987
    invoke-virtual {v12}, Lz00;->n()V

    .line 988
    .line 989
    .line 990
    iget-object v2, v10, Lpi;->e:Li51;

    .line 991
    .line 992
    iget-object v10, v2, Lm81;->e:Lap;

    .line 993
    .line 994
    iput-boolean v11, v10, Ljo;->j:Z

    .line 995
    .line 996
    iput-boolean v11, v2, Lm81;->g:Z

    .line 997
    .line 998
    invoke-virtual {v2}, Li51;->m()V

    .line 999
    .line 1000
    .line 1001
    move-object/from16 v2, v18

    .line 1002
    .line 1003
    goto :goto_25

    .line 1004
    :cond_39
    const/4 v11, 0x0

    .line 1005
    invoke-virtual {v0}, Lpi;->h()V

    .line 1006
    .line 1007
    .line 1008
    iput-boolean v11, v0, Lpi;->a:Z

    .line 1009
    .line 1010
    iget-object v2, v0, Lpi;->d:Lz00;

    .line 1011
    .line 1012
    iget-object v4, v2, Lm81;->e:Lap;

    .line 1013
    .line 1014
    iput-boolean v11, v4, Ljo;->j:Z

    .line 1015
    .line 1016
    iput-boolean v11, v2, Lm81;->g:Z

    .line 1017
    .line 1018
    invoke-virtual {v2}, Lz00;->n()V

    .line 1019
    .line 1020
    .line 1021
    iget-object v2, v0, Lpi;->e:Li51;

    .line 1022
    .line 1023
    iget-object v4, v2, Lm81;->e:Lap;

    .line 1024
    .line 1025
    iput-boolean v11, v4, Ljo;->j:Z

    .line 1026
    .line 1027
    iput-boolean v11, v2, Lm81;->g:Z

    .line 1028
    .line 1029
    invoke-virtual {v2}, Li51;->m()V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v8}, Lqm;->c()V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_26

    .line 1036
    :cond_3a
    const/4 v11, 0x0

    .line 1037
    :goto_26
    iget-object v2, v8, Lqm;->d:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v2, Lqi;

    .line 1040
    .line 1041
    invoke-virtual {v8, v2}, Lqm;->b(Lqi;)V

    .line 1042
    .line 1043
    .line 1044
    iput v11, v0, Lpi;->Y:I

    .line 1045
    .line 1046
    iput v11, v0, Lpi;->Z:I

    .line 1047
    .line 1048
    iget-object v2, v0, Lpi;->d:Lz00;

    .line 1049
    .line 1050
    iget-object v2, v2, Lm81;->h:Ljo;

    .line 1051
    .line 1052
    invoke-virtual {v2, v11}, Ljo;->d(I)V

    .line 1053
    .line 1054
    .line 1055
    iget-object v0, v0, Lpi;->e:Li51;

    .line 1056
    .line 1057
    iget-object v0, v0, Lm81;->h:Ljo;

    .line 1058
    .line 1059
    invoke-virtual {v0, v11}, Ljo;->d(I)V

    .line 1060
    .line 1061
    .line 1062
    const/high16 v6, 0x40000000    # 2.0f

    .line 1063
    .line 1064
    if-ne v3, v6, :cond_3b

    .line 1065
    .line 1066
    invoke-virtual {v1, v11, v15}, Lqi;->T(IZ)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    move v2, v0

    .line 1071
    const/4 v0, 0x1

    .line 1072
    goto :goto_27

    .line 1073
    :cond_3b
    const/4 v0, 0x0

    .line 1074
    const/4 v2, 0x1

    .line 1075
    :goto_27
    if-ne v5, v6, :cond_3c

    .line 1076
    .line 1077
    const/4 v12, 0x1

    .line 1078
    invoke-virtual {v1, v12, v15}, Lqi;->T(IZ)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v4

    .line 1082
    and-int/2addr v2, v4

    .line 1083
    add-int/lit8 v0, v0, 0x1

    .line 1084
    .line 1085
    :cond_3c
    :goto_28
    if-eqz v2, :cond_40

    .line 1086
    .line 1087
    if-ne v3, v6, :cond_3d

    .line 1088
    .line 1089
    const/4 v3, 0x1

    .line 1090
    goto :goto_29

    .line 1091
    :cond_3d
    const/4 v3, 0x0

    .line 1092
    :goto_29
    if-ne v5, v6, :cond_3e

    .line 1093
    .line 1094
    const/4 v4, 0x1

    .line 1095
    goto :goto_2a

    .line 1096
    :cond_3e
    const/4 v4, 0x0

    .line 1097
    :goto_2a
    invoke-virtual {v1, v3, v4}, Lqi;->P(ZZ)V

    .line 1098
    .line 1099
    .line 1100
    goto :goto_2b

    .line 1101
    :cond_3f
    move/from16 v20, v0

    .line 1102
    .line 1103
    move-object/from16 v25, v10

    .line 1104
    .line 1105
    move-object/from16 v23, v11

    .line 1106
    .line 1107
    const/4 v0, 0x0

    .line 1108
    const/4 v2, 0x0

    .line 1109
    :cond_40
    :goto_2b
    if-eqz v2, :cond_42

    .line 1110
    .line 1111
    const/4 v10, 0x2

    .line 1112
    if-eq v0, v10, :cond_41

    .line 1113
    .line 1114
    goto :goto_2c

    .line 1115
    :cond_41
    return-void

    .line 1116
    :cond_42
    :goto_2c
    iget v0, v1, Lqi;->D0:I

    .line 1117
    .line 1118
    if-lez v24, :cond_50

    .line 1119
    .line 1120
    iget-object v2, v1, Lqi;->q0:Ljava/util/ArrayList;

    .line 1121
    .line 1122
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    const/16 v3, 0x40

    .line 1127
    .line 1128
    invoke-virtual {v1, v3}, Lqi;->W(I)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v3

    .line 1132
    iget-object v4, v1, Lqi;->u0:Ldi;

    .line 1133
    .line 1134
    const/4 v15, 0x0

    .line 1135
    :goto_2d
    if-ge v15, v2, :cond_4e

    .line 1136
    .line 1137
    iget-object v5, v1, Lqi;->q0:Ljava/util/ArrayList;

    .line 1138
    .line 1139
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v5

    .line 1143
    check-cast v5, Lpi;

    .line 1144
    .line 1145
    instance-of v6, v5, Lb00;

    .line 1146
    .line 1147
    if-eqz v6, :cond_43

    .line 1148
    .line 1149
    :goto_2e
    const/4 v12, 0x3

    .line 1150
    goto/16 :goto_31

    .line 1151
    .line 1152
    :cond_43
    instance-of v6, v5, Lq9;

    .line 1153
    .line 1154
    if-eqz v6, :cond_44

    .line 1155
    .line 1156
    goto :goto_2e

    .line 1157
    :cond_44
    iget-boolean v6, v5, Lpi;->F:Z

    .line 1158
    .line 1159
    if-eqz v6, :cond_45

    .line 1160
    .line 1161
    goto :goto_2e

    .line 1162
    :cond_45
    if-eqz v3, :cond_46

    .line 1163
    .line 1164
    iget-object v6, v5, Lpi;->d:Lz00;

    .line 1165
    .line 1166
    if-eqz v6, :cond_46

    .line 1167
    .line 1168
    iget-object v8, v5, Lpi;->e:Li51;

    .line 1169
    .line 1170
    if-eqz v8, :cond_46

    .line 1171
    .line 1172
    iget-object v6, v6, Lm81;->e:Lap;

    .line 1173
    .line 1174
    iget-boolean v6, v6, Ljo;->j:Z

    .line 1175
    .line 1176
    if-eqz v6, :cond_46

    .line 1177
    .line 1178
    iget-object v6, v8, Lm81;->e:Lap;

    .line 1179
    .line 1180
    iget-boolean v6, v6, Ljo;->j:Z

    .line 1181
    .line 1182
    if-eqz v6, :cond_46

    .line 1183
    .line 1184
    goto :goto_2e

    .line 1185
    :cond_46
    const/4 v6, 0x0

    .line 1186
    invoke-virtual {v5, v6}, Lpi;->j(I)I

    .line 1187
    .line 1188
    .line 1189
    move-result v8

    .line 1190
    const/4 v6, 0x1

    .line 1191
    invoke-virtual {v5, v6}, Lpi;->j(I)I

    .line 1192
    .line 1193
    .line 1194
    move-result v10

    .line 1195
    const/4 v12, 0x3

    .line 1196
    if-ne v8, v12, :cond_47

    .line 1197
    .line 1198
    iget v11, v5, Lpi;->r:I

    .line 1199
    .line 1200
    if-eq v11, v6, :cond_47

    .line 1201
    .line 1202
    if-ne v10, v12, :cond_47

    .line 1203
    .line 1204
    iget v11, v5, Lpi;->s:I

    .line 1205
    .line 1206
    if-eq v11, v6, :cond_47

    .line 1207
    .line 1208
    move v11, v6

    .line 1209
    goto :goto_2f

    .line 1210
    :cond_47
    const/4 v11, 0x0

    .line 1211
    :goto_2f
    if-nez v11, :cond_4b

    .line 1212
    .line 1213
    invoke-virtual {v1, v6}, Lqi;->W(I)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v12

    .line 1217
    if-eqz v12, :cond_4b

    .line 1218
    .line 1219
    instance-of v6, v5, Lzu;

    .line 1220
    .line 1221
    if-nez v6, :cond_4b

    .line 1222
    .line 1223
    const/4 v12, 0x3

    .line 1224
    if-ne v8, v12, :cond_48

    .line 1225
    .line 1226
    iget v6, v5, Lpi;->r:I

    .line 1227
    .line 1228
    if-nez v6, :cond_48

    .line 1229
    .line 1230
    if-eq v10, v12, :cond_48

    .line 1231
    .line 1232
    invoke-virtual {v5}, Lpi;->x()Z

    .line 1233
    .line 1234
    .line 1235
    move-result v6

    .line 1236
    if-nez v6, :cond_48

    .line 1237
    .line 1238
    const/4 v11, 0x1

    .line 1239
    :cond_48
    if-ne v10, v12, :cond_49

    .line 1240
    .line 1241
    iget v6, v5, Lpi;->s:I

    .line 1242
    .line 1243
    if-nez v6, :cond_49

    .line 1244
    .line 1245
    if-eq v8, v12, :cond_49

    .line 1246
    .line 1247
    invoke-virtual {v5}, Lpi;->x()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v6

    .line 1251
    if-nez v6, :cond_49

    .line 1252
    .line 1253
    const/4 v11, 0x1

    .line 1254
    :cond_49
    if-eq v8, v12, :cond_4a

    .line 1255
    .line 1256
    if-ne v10, v12, :cond_4c

    .line 1257
    .line 1258
    :cond_4a
    iget v6, v5, Lpi;->W:F

    .line 1259
    .line 1260
    cmpl-float v6, v6, v17

    .line 1261
    .line 1262
    if-lez v6, :cond_4c

    .line 1263
    .line 1264
    const/4 v11, 0x1

    .line 1265
    goto :goto_30

    .line 1266
    :cond_4b
    const/4 v12, 0x3

    .line 1267
    :cond_4c
    :goto_30
    if-eqz v11, :cond_4d

    .line 1268
    .line 1269
    goto :goto_31

    .line 1270
    :cond_4d
    const/4 v6, 0x0

    .line 1271
    invoke-virtual {v7, v6, v4, v5}, Lt83;->K(ILdi;Lpi;)Z

    .line 1272
    .line 1273
    .line 1274
    :goto_31
    add-int/lit8 v15, v15, 0x1

    .line 1275
    .line 1276
    goto/16 :goto_2d

    .line 1277
    .line 1278
    :cond_4e
    iget-object v2, v4, Ldi;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1279
    .line 1280
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    iget-object v4, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 1285
    .line 1286
    const/4 v15, 0x0

    .line 1287
    :goto_32
    if-ge v15, v3, :cond_4f

    .line 1288
    .line 1289
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1290
    .line 1291
    .line 1292
    add-int/lit8 v15, v15, 0x1

    .line 1293
    .line 1294
    goto :goto_32

    .line 1295
    :cond_4f
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    if-lez v2, :cond_50

    .line 1300
    .line 1301
    const/4 v15, 0x0

    .line 1302
    :goto_33
    if-ge v15, v2, :cond_50

    .line 1303
    .line 1304
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v3

    .line 1308
    check-cast v3, Lai;

    .line 1309
    .line 1310
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    add-int/lit8 v15, v15, 0x1

    .line 1314
    .line 1315
    goto :goto_33

    .line 1316
    :cond_50
    invoke-virtual {v7, v1}, Lt83;->R(Lqi;)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    .line 1320
    .line 1321
    .line 1322
    move-result v2

    .line 1323
    const/4 v6, 0x0

    .line 1324
    if-lez v24, :cond_51

    .line 1325
    .line 1326
    invoke-virtual {v7, v1, v6, v13, v14}, Lt83;->P(Lqi;III)V

    .line 1327
    .line 1328
    .line 1329
    :cond_51
    if-lez v2, :cond_67

    .line 1330
    .line 1331
    iget-object v3, v1, Lpi;->p0:[I

    .line 1332
    .line 1333
    aget v4, v3, v6

    .line 1334
    .line 1335
    const/4 v10, 0x2

    .line 1336
    if-ne v4, v10, :cond_52

    .line 1337
    .line 1338
    const/4 v15, 0x1

    .line 1339
    :goto_34
    const/4 v12, 0x1

    .line 1340
    goto :goto_35

    .line 1341
    :cond_52
    move v15, v6

    .line 1342
    goto :goto_34

    .line 1343
    :goto_35
    aget v3, v3, v12

    .line 1344
    .line 1345
    if-ne v3, v10, :cond_53

    .line 1346
    .line 1347
    const/4 v3, 0x1

    .line 1348
    goto :goto_36

    .line 1349
    :cond_53
    move v3, v6

    .line 1350
    :goto_36
    invoke-virtual {v1}, Lpi;->q()I

    .line 1351
    .line 1352
    .line 1353
    move-result v4

    .line 1354
    iget v5, v9, Lpi;->b0:I

    .line 1355
    .line 1356
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 1357
    .line 1358
    .line 1359
    move-result v4

    .line 1360
    invoke-virtual {v1}, Lpi;->k()I

    .line 1361
    .line 1362
    .line 1363
    move-result v5

    .line 1364
    iget v8, v9, Lpi;->c0:I

    .line 1365
    .line 1366
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    move v8, v6

    .line 1371
    move v9, v8

    .line 1372
    :goto_37
    if-ge v8, v2, :cond_59

    .line 1373
    .line 1374
    move-object/from16 v11, v25

    .line 1375
    .line 1376
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v12

    .line 1380
    check-cast v12, Lpi;

    .line 1381
    .line 1382
    instance-of v6, v12, Lzu;

    .line 1383
    .line 1384
    if-nez v6, :cond_54

    .line 1385
    .line 1386
    move/from16 v16, v3

    .line 1387
    .line 1388
    move/from16 v17, v8

    .line 1389
    .line 1390
    move-object/from16 v3, v23

    .line 1391
    .line 1392
    goto/16 :goto_38

    .line 1393
    .line 1394
    :cond_54
    invoke-virtual {v12}, Lpi;->q()I

    .line 1395
    .line 1396
    .line 1397
    move-result v6

    .line 1398
    invoke-virtual {v12}, Lpi;->k()I

    .line 1399
    .line 1400
    .line 1401
    move-result v10

    .line 1402
    move/from16 v16, v3

    .line 1403
    .line 1404
    move/from16 v17, v8

    .line 1405
    .line 1406
    move-object/from16 v3, v23

    .line 1407
    .line 1408
    const/4 v8, 0x1

    .line 1409
    invoke-virtual {v7, v8, v3, v12}, Lt83;->K(ILdi;Lpi;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v19

    .line 1413
    or-int v8, v9, v19

    .line 1414
    .line 1415
    invoke-virtual {v12}, Lpi;->q()I

    .line 1416
    .line 1417
    .line 1418
    move-result v9

    .line 1419
    move/from16 v19, v8

    .line 1420
    .line 1421
    invoke-virtual {v12}, Lpi;->k()I

    .line 1422
    .line 1423
    .line 1424
    move-result v8

    .line 1425
    if-eq v9, v6, :cond_56

    .line 1426
    .line 1427
    invoke-virtual {v12, v9}, Lpi;->O(I)V

    .line 1428
    .line 1429
    .line 1430
    if-eqz v15, :cond_55

    .line 1431
    .line 1432
    invoke-virtual {v12}, Lpi;->r()I

    .line 1433
    .line 1434
    .line 1435
    move-result v6

    .line 1436
    iget v9, v12, Lpi;->U:I

    .line 1437
    .line 1438
    add-int/2addr v6, v9

    .line 1439
    if-le v6, v4, :cond_55

    .line 1440
    .line 1441
    invoke-virtual {v12}, Lpi;->r()I

    .line 1442
    .line 1443
    .line 1444
    move-result v6

    .line 1445
    iget v9, v12, Lpi;->U:I

    .line 1446
    .line 1447
    add-int/2addr v6, v9

    .line 1448
    const/4 v9, 0x4

    .line 1449
    invoke-virtual {v12, v9}, Lpi;->i(I)Lwh;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v19

    .line 1453
    invoke-virtual/range {v19 .. v19}, Lwh;->e()I

    .line 1454
    .line 1455
    .line 1456
    move-result v9

    .line 1457
    add-int/2addr v9, v6

    .line 1458
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 1459
    .line 1460
    .line 1461
    move-result v4

    .line 1462
    :cond_55
    const/16 v19, 0x1

    .line 1463
    .line 1464
    :cond_56
    if-eq v8, v10, :cond_58

    .line 1465
    .line 1466
    invoke-virtual {v12, v8}, Lpi;->L(I)V

    .line 1467
    .line 1468
    .line 1469
    if-eqz v16, :cond_57

    .line 1470
    .line 1471
    invoke-virtual {v12}, Lpi;->s()I

    .line 1472
    .line 1473
    .line 1474
    move-result v6

    .line 1475
    iget v8, v12, Lpi;->V:I

    .line 1476
    .line 1477
    add-int/2addr v6, v8

    .line 1478
    if-le v6, v5, :cond_57

    .line 1479
    .line 1480
    invoke-virtual {v12}, Lpi;->s()I

    .line 1481
    .line 1482
    .line 1483
    move-result v6

    .line 1484
    iget v8, v12, Lpi;->V:I

    .line 1485
    .line 1486
    add-int/2addr v6, v8

    .line 1487
    const/4 v8, 0x5

    .line 1488
    invoke-virtual {v12, v8}, Lpi;->i(I)Lwh;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v8

    .line 1492
    invoke-virtual {v8}, Lwh;->e()I

    .line 1493
    .line 1494
    .line 1495
    move-result v8

    .line 1496
    add-int/2addr v8, v6

    .line 1497
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 1498
    .line 1499
    .line 1500
    move-result v5

    .line 1501
    :cond_57
    const/16 v19, 0x1

    .line 1502
    .line 1503
    :cond_58
    check-cast v12, Lzu;

    .line 1504
    .line 1505
    iget-boolean v6, v12, Lzu;->y0:Z

    .line 1506
    .line 1507
    or-int v6, v19, v6

    .line 1508
    .line 1509
    move v9, v6

    .line 1510
    :goto_38
    add-int/lit8 v8, v17, 0x1

    .line 1511
    .line 1512
    move-object/from16 v23, v3

    .line 1513
    .line 1514
    move-object/from16 v25, v11

    .line 1515
    .line 1516
    move/from16 v3, v16

    .line 1517
    .line 1518
    const/4 v6, 0x0

    .line 1519
    goto/16 :goto_37

    .line 1520
    .line 1521
    :cond_59
    move/from16 v16, v3

    .line 1522
    .line 1523
    move-object/from16 v11, v25

    .line 1524
    .line 1525
    const/4 v6, 0x0

    .line 1526
    :goto_39
    move-object/from16 v3, v23

    .line 1527
    .line 1528
    const/4 v10, 0x2

    .line 1529
    if-ge v6, v10, :cond_67

    .line 1530
    .line 1531
    const/4 v8, 0x0

    .line 1532
    :goto_3a
    if-ge v8, v2, :cond_66

    .line 1533
    .line 1534
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v12

    .line 1538
    check-cast v12, Lpi;

    .line 1539
    .line 1540
    instance-of v10, v12, Ls00;

    .line 1541
    .line 1542
    if-eqz v10, :cond_5b

    .line 1543
    .line 1544
    instance-of v10, v12, Lzu;

    .line 1545
    .line 1546
    if-eqz v10, :cond_5a

    .line 1547
    .line 1548
    goto :goto_3c

    .line 1549
    :cond_5a
    :goto_3b
    move/from16 v17, v2

    .line 1550
    .line 1551
    goto :goto_3d

    .line 1552
    :cond_5b
    :goto_3c
    instance-of v10, v12, Lb00;

    .line 1553
    .line 1554
    if-eqz v10, :cond_5c

    .line 1555
    .line 1556
    goto :goto_3b

    .line 1557
    :cond_5c
    iget v10, v12, Lpi;->g0:I

    .line 1558
    .line 1559
    move/from16 v17, v2

    .line 1560
    .line 1561
    const/16 v2, 0x8

    .line 1562
    .line 1563
    if-ne v10, v2, :cond_5d

    .line 1564
    .line 1565
    goto :goto_3d

    .line 1566
    :cond_5d
    if-eqz v20, :cond_5e

    .line 1567
    .line 1568
    iget-object v2, v12, Lpi;->d:Lz00;

    .line 1569
    .line 1570
    iget-object v2, v2, Lm81;->e:Lap;

    .line 1571
    .line 1572
    iget-boolean v2, v2, Ljo;->j:Z

    .line 1573
    .line 1574
    if-eqz v2, :cond_5e

    .line 1575
    .line 1576
    iget-object v2, v12, Lpi;->e:Li51;

    .line 1577
    .line 1578
    iget-object v2, v2, Lm81;->e:Lap;

    .line 1579
    .line 1580
    iget-boolean v2, v2, Ljo;->j:Z

    .line 1581
    .line 1582
    if-eqz v2, :cond_5e

    .line 1583
    .line 1584
    goto :goto_3d

    .line 1585
    :cond_5e
    instance-of v2, v12, Lzu;

    .line 1586
    .line 1587
    if-eqz v2, :cond_5f

    .line 1588
    .line 1589
    :goto_3d
    move-object/from16 v23, v3

    .line 1590
    .line 1591
    move/from16 v24, v6

    .line 1592
    .line 1593
    move/from16 v19, v8

    .line 1594
    .line 1595
    const/4 v3, 0x4

    .line 1596
    const/4 v6, 0x5

    .line 1597
    goto/16 :goto_42

    .line 1598
    .line 1599
    :cond_5f
    invoke-virtual {v12}, Lpi;->q()I

    .line 1600
    .line 1601
    .line 1602
    move-result v2

    .line 1603
    invoke-virtual {v12}, Lpi;->k()I

    .line 1604
    .line 1605
    .line 1606
    move-result v10

    .line 1607
    move/from16 v19, v8

    .line 1608
    .line 1609
    iget v8, v12, Lpi;->a0:I

    .line 1610
    .line 1611
    move/from16 v22, v9

    .line 1612
    .line 1613
    const/4 v9, 0x1

    .line 1614
    if-ne v6, v9, :cond_60

    .line 1615
    .line 1616
    const/4 v9, 0x2

    .line 1617
    :cond_60
    invoke-virtual {v7, v9, v3, v12}, Lt83;->K(ILdi;Lpi;)Z

    .line 1618
    .line 1619
    .line 1620
    move-result v9

    .line 1621
    or-int v9, v22, v9

    .line 1622
    .line 1623
    move-object/from16 v23, v3

    .line 1624
    .line 1625
    invoke-virtual {v12}, Lpi;->q()I

    .line 1626
    .line 1627
    .line 1628
    move-result v3

    .line 1629
    move/from16 v24, v6

    .line 1630
    .line 1631
    invoke-virtual {v12}, Lpi;->k()I

    .line 1632
    .line 1633
    .line 1634
    move-result v6

    .line 1635
    if-eq v3, v2, :cond_62

    .line 1636
    .line 1637
    invoke-virtual {v12, v3}, Lpi;->O(I)V

    .line 1638
    .line 1639
    .line 1640
    if-eqz v15, :cond_61

    .line 1641
    .line 1642
    invoke-virtual {v12}, Lpi;->r()I

    .line 1643
    .line 1644
    .line 1645
    move-result v2

    .line 1646
    iget v3, v12, Lpi;->U:I

    .line 1647
    .line 1648
    add-int/2addr v2, v3

    .line 1649
    if-le v2, v4, :cond_61

    .line 1650
    .line 1651
    invoke-virtual {v12}, Lpi;->r()I

    .line 1652
    .line 1653
    .line 1654
    move-result v2

    .line 1655
    iget v3, v12, Lpi;->U:I

    .line 1656
    .line 1657
    add-int/2addr v2, v3

    .line 1658
    const/4 v3, 0x4

    .line 1659
    invoke-virtual {v12, v3}, Lpi;->i(I)Lwh;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v9

    .line 1663
    invoke-virtual {v9}, Lwh;->e()I

    .line 1664
    .line 1665
    .line 1666
    move-result v9

    .line 1667
    add-int/2addr v9, v2

    .line 1668
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 1669
    .line 1670
    .line 1671
    move-result v4

    .line 1672
    goto :goto_3e

    .line 1673
    :cond_61
    const/4 v3, 0x4

    .line 1674
    :goto_3e
    const/4 v9, 0x1

    .line 1675
    goto :goto_3f

    .line 1676
    :cond_62
    const/4 v3, 0x4

    .line 1677
    :goto_3f
    if-eq v6, v10, :cond_64

    .line 1678
    .line 1679
    invoke-virtual {v12, v6}, Lpi;->L(I)V

    .line 1680
    .line 1681
    .line 1682
    if-eqz v16, :cond_63

    .line 1683
    .line 1684
    invoke-virtual {v12}, Lpi;->s()I

    .line 1685
    .line 1686
    .line 1687
    move-result v2

    .line 1688
    iget v6, v12, Lpi;->V:I

    .line 1689
    .line 1690
    add-int/2addr v2, v6

    .line 1691
    if-le v2, v5, :cond_63

    .line 1692
    .line 1693
    invoke-virtual {v12}, Lpi;->s()I

    .line 1694
    .line 1695
    .line 1696
    move-result v2

    .line 1697
    iget v6, v12, Lpi;->V:I

    .line 1698
    .line 1699
    add-int/2addr v2, v6

    .line 1700
    const/4 v6, 0x5

    .line 1701
    invoke-virtual {v12, v6}, Lpi;->i(I)Lwh;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v9

    .line 1705
    invoke-virtual {v9}, Lwh;->e()I

    .line 1706
    .line 1707
    .line 1708
    move-result v9

    .line 1709
    add-int/2addr v9, v2

    .line 1710
    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    .line 1711
    .line 1712
    .line 1713
    move-result v5

    .line 1714
    goto :goto_40

    .line 1715
    :cond_63
    const/4 v6, 0x5

    .line 1716
    :goto_40
    const/4 v9, 0x1

    .line 1717
    goto :goto_41

    .line 1718
    :cond_64
    const/4 v6, 0x5

    .line 1719
    :goto_41
    iget-boolean v2, v12, Lpi;->E:Z

    .line 1720
    .line 1721
    if-eqz v2, :cond_65

    .line 1722
    .line 1723
    iget v2, v12, Lpi;->a0:I

    .line 1724
    .line 1725
    if-eq v8, v2, :cond_65

    .line 1726
    .line 1727
    const/4 v9, 0x1

    .line 1728
    :cond_65
    :goto_42
    add-int/lit8 v8, v19, 0x1

    .line 1729
    .line 1730
    move/from16 v2, v17

    .line 1731
    .line 1732
    move-object/from16 v3, v23

    .line 1733
    .line 1734
    move/from16 v6, v24

    .line 1735
    .line 1736
    const/4 v10, 0x2

    .line 1737
    goto/16 :goto_3a

    .line 1738
    .line 1739
    :cond_66
    move/from16 v17, v2

    .line 1740
    .line 1741
    move-object/from16 v23, v3

    .line 1742
    .line 1743
    move/from16 v24, v6

    .line 1744
    .line 1745
    move/from16 v22, v9

    .line 1746
    .line 1747
    const/4 v3, 0x4

    .line 1748
    const/4 v6, 0x5

    .line 1749
    if-eqz v22, :cond_67

    .line 1750
    .line 1751
    add-int/lit8 v2, v24, 0x1

    .line 1752
    .line 1753
    invoke-virtual {v7, v1, v2, v13, v14}, Lt83;->P(Lqi;III)V

    .line 1754
    .line 1755
    .line 1756
    move v6, v2

    .line 1757
    move/from16 v2, v17

    .line 1758
    .line 1759
    const/4 v9, 0x0

    .line 1760
    goto/16 :goto_39

    .line 1761
    .line 1762
    :cond_67
    iput v0, v1, Lqi;->D0:I

    .line 1763
    .line 1764
    const/16 v0, 0x200

    .line 1765
    .line 1766
    invoke-virtual {v1, v0}, Lqi;->W(I)Z

    .line 1767
    .line 1768
    .line 1769
    move-result v0

    .line 1770
    sput-boolean v0, Lx60;->q:Z

    .line 1771
    .line 1772
    return-void
.end method

.method public final l(Lpi;Lci;Landroid/util/SparseArray;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p3, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, Lpi;

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    instance-of p4, p4, Lci;

    .line 24
    .line 25
    if-eqz p4, :cond_1

    .line 26
    .line 27
    const/4 p4, 0x1

    .line 28
    iput-boolean p4, p2, Lci;->c0:Z

    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    if-ne p5, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lci;

    .line 38
    .line 39
    iput-boolean p4, v0, Lci;->c0:Z

    .line 40
    .line 41
    iget-object v0, v0, Lci;->p0:Lpi;

    .line 42
    .line 43
    iput-boolean p4, v0, Lpi;->E:Z

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p1, v1}, Lpi;->i(I)Lwh;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p3, p5}, Lpi;->i(I)Lwh;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    iget p5, p2, Lci;->D:I

    .line 54
    .line 55
    iget p2, p2, Lci;->C:I

    .line 56
    .line 57
    invoke-virtual {v0, p3, p5, p2, p4}, Lwh;->b(Lwh;IIZ)Z

    .line 58
    .line 59
    .line 60
    iput-boolean p4, p1, Lpi;->E:Z

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    invoke-virtual {p1, p2}, Lpi;->i(I)Lwh;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Lwh;->j()V

    .line 68
    .line 69
    .line 70
    const/4 p2, 0x5

    .line 71
    invoke-virtual {p1, p2}, Lpi;->i(I)Lwh;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Lwh;->j()V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x0

    .line 10
    move p4, p3

    .line 11
    :goto_0
    if-ge p4, p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lci;

    .line 22
    .line 23
    iget-object v1, v0, Lci;->p0:Lpi;

    .line 24
    .line 25
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iget-boolean v2, v0, Lci;->d0:Z

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    iget-boolean v0, v0, Lci;->e0:Z

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {v1}, Lpi;->r()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {v1}, Lpi;->s()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1}, Lpi;->q()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    add-int/2addr v3, v0

    .line 57
    invoke-virtual {v1}, Lpi;->k()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v1, v2

    .line 62
    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    .line 63
    .line 64
    .line 65
    :goto_1
    add-int/lit8 p4, p4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-lez p2, :cond_2

    .line 75
    .line 76
    :goto_2
    if-ge p3, p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    check-cast p4, Lai;

    .line 83
    .line 84
    invoke-virtual {p4}, Lai;->j()V

    .line 85
    .line 86
    .line 87
    add-int/lit8 p3, p3, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v6, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    iget-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    move v2, v9

    .line 20
    :goto_0
    if-ge v2, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iput-boolean v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 47
    .line 48
    const/high16 v2, 0x400000

    .line 49
    .line 50
    and-int/2addr v1, v2

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-ne v8, v1, :cond_2

    .line 58
    .line 59
    move v1, v8

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v1, v9

    .line 62
    :goto_2
    iget-object v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 63
    .line 64
    iput-boolean v1, v10, Lqi;->v0:Z

    .line 65
    .line 66
    iget-boolean v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 67
    .line 68
    if-eqz v1, :cond_50

    .line 69
    .line 70
    iput-boolean v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    move v2, v9

    .line 77
    :goto_3
    if-ge v2, v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    move v11, v8

    .line 90
    goto :goto_4

    .line 91
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move v11, v9

    .line 95
    :goto_4
    if-eqz v11, :cond_4f

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    move v1, v9

    .line 106
    :goto_5
    if-ge v1, v13, :cond_6

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lpi;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_5
    invoke-virtual {v2}, Lpi;->C()V

    .line 120
    .line 121
    .line 122
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_6
    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 126
    .line 127
    const/4 v14, -0x1

    .line 128
    if-eqz v12, :cond_f

    .line 129
    .line 130
    move v3, v9

    .line 131
    :goto_7
    if-ge v3, v13, :cond_f

    .line 132
    .line 133
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    invoke-virtual {v5, v15}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v15
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    if-eqz v5, :cond_9

    .line 158
    .line 159
    move/from16 v16, v8

    .line 160
    .line 161
    :try_start_1
    iget-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 162
    .line 163
    if-nez v8, :cond_7

    .line 164
    .line 165
    new-instance v8, Ljava/util/HashMap;

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 171
    .line 172
    :cond_7
    const-string v8, "/"

    .line 173
    .line 174
    invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eq v8, v14, :cond_8

    .line 179
    .line 180
    add-int/lit8 v8, v8, 0x1

    .line 181
    .line 182
    invoke-virtual {v5, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    goto :goto_8

    .line 187
    :cond_8
    move-object v8, v5

    .line 188
    :goto_8
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:Ljava/util/HashMap;

    .line 189
    .line 190
    invoke-virtual {v2, v8, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_9
    move/from16 v16, v8

    .line 195
    .line 196
    :goto_9
    const/16 v2, 0x2f

    .line 197
    .line 198
    invoke-virtual {v5, v2}, Ljava/lang/String;->indexOf(I)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eq v2, v14, :cond_a

    .line 203
    .line 204
    add-int/lit8 v2, v2, 0x1

    .line 205
    .line 206
    invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-nez v2, :cond_b

    .line 215
    .line 216
    :goto_a
    move-object v2, v10

    .line 217
    goto :goto_b

    .line 218
    :cond_b
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    check-cast v4, Landroid/view/View;

    .line 223
    .line 224
    if-nez v4, :cond_c

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    if-eqz v4, :cond_c

    .line 231
    .line 232
    if-eq v4, v0, :cond_c

    .line 233
    .line 234
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    if-ne v2, v0, :cond_c

    .line 239
    .line 240
    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    :cond_c
    if-ne v4, v0, :cond_d

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_d
    if-nez v4, :cond_e

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    goto :goto_b

    .line 250
    :cond_e
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Lci;

    .line 255
    .line 256
    iget-object v2, v2, Lci;->p0:Lpi;

    .line 257
    .line 258
    :goto_b
    iput-object v5, v2, Lpi;->h0:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 259
    .line 260
    goto :goto_c

    .line 261
    :catch_0
    move/from16 v16, v8

    .line 262
    .line 263
    :catch_1
    :goto_c
    add-int/lit8 v3, v3, 0x1

    .line 264
    .line 265
    move/from16 v8, v16

    .line 266
    .line 267
    goto/16 :goto_7

    .line 268
    .line 269
    :cond_f
    move/from16 v16, v8

    .line 270
    .line 271
    iget v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 272
    .line 273
    if-eq v2, v14, :cond_10

    .line 274
    .line 275
    move v2, v9

    .line 276
    :goto_d
    if-ge v2, v13, :cond_10

    .line 277
    .line 278
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 283
    .line 284
    .line 285
    add-int/lit8 v2, v2, 0x1

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_10
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 289
    .line 290
    if-eqz v2, :cond_11

    .line 291
    .line 292
    invoke-virtual {v2, v0}, Lni;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 293
    .line 294
    .line 295
    :cond_11
    iget-object v2, v10, Lqi;->q0:Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 298
    .line 299
    .line 300
    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-lez v3, :cond_19

    .line 307
    .line 308
    move v4, v9

    .line 309
    :goto_e
    if-ge v4, v3, :cond_19

    .line 310
    .line 311
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    check-cast v5, Lai;

    .line 316
    .line 317
    iget-object v15, v5, Lai;->l:Ljava/util/HashMap;

    .line 318
    .line 319
    invoke-virtual {v5}, Landroid/view/View;->isInEditMode()Z

    .line 320
    .line 321
    .line 322
    move-result v18

    .line 323
    if-eqz v18, :cond_12

    .line 324
    .line 325
    const/16 v18, 0x2

    .line 326
    .line 327
    iget-object v8, v5, Lai;->j:Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v5, v8}, Lai;->setIds(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    goto :goto_f

    .line 333
    :cond_12
    const/16 v18, 0x2

    .line 334
    .line 335
    :goto_f
    iget-object v8, v5, Lai;->i:Ls00;

    .line 336
    .line 337
    if-nez v8, :cond_13

    .line 338
    .line 339
    move-object/from16 v19, v1

    .line 340
    .line 341
    move-object/from16 v21, v2

    .line 342
    .line 343
    goto/16 :goto_15

    .line 344
    .line 345
    :cond_13
    iput v9, v8, Ls00;->r0:I

    .line 346
    .line 347
    iget-object v8, v8, Ls00;->q0:[Lpi;

    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    invoke-static {v8, v14}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    move v8, v9

    .line 354
    :goto_10
    iget v14, v5, Lai;->g:I

    .line 355
    .line 356
    if-ge v8, v14, :cond_18

    .line 357
    .line 358
    iget-object v14, v5, Lai;->f:[I

    .line 359
    .line 360
    aget v14, v14, v8

    .line 361
    .line 362
    invoke-virtual {v1, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v19

    .line 366
    check-cast v19, Landroid/view/View;

    .line 367
    .line 368
    if-nez v19, :cond_14

    .line 369
    .line 370
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v14

    .line 374
    invoke-virtual {v15, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v14

    .line 378
    check-cast v14, Ljava/lang/String;

    .line 379
    .line 380
    invoke-virtual {v5, v0, v14}, Lai;->g(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    .line 381
    .line 382
    .line 383
    move-result v9

    .line 384
    if-eqz v9, :cond_14

    .line 385
    .line 386
    move-object/from16 v21, v2

    .line 387
    .line 388
    iget-object v2, v5, Lai;->f:[I

    .line 389
    .line 390
    aput v9, v2, v8

    .line 391
    .line 392
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-virtual {v15, v2, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    move-object/from16 v19, v2

    .line 404
    .line 405
    check-cast v19, Landroid/view/View;

    .line 406
    .line 407
    :goto_11
    move-object/from16 v2, v19

    .line 408
    .line 409
    goto :goto_12

    .line 410
    :cond_14
    move-object/from16 v21, v2

    .line 411
    .line 412
    goto :goto_11

    .line 413
    :goto_12
    if-eqz v2, :cond_17

    .line 414
    .line 415
    iget-object v9, v5, Lai;->i:Ls00;

    .line 416
    .line 417
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lpi;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    if-eq v2, v9, :cond_17

    .line 425
    .line 426
    if-nez v2, :cond_15

    .line 427
    .line 428
    goto :goto_13

    .line 429
    :cond_15
    iget v14, v9, Ls00;->r0:I

    .line 430
    .line 431
    add-int/lit8 v14, v14, 0x1

    .line 432
    .line 433
    move-object/from16 v19, v1

    .line 434
    .line 435
    iget-object v1, v9, Ls00;->q0:[Lpi;

    .line 436
    .line 437
    move-object/from16 v22, v2

    .line 438
    .line 439
    array-length v2, v1

    .line 440
    if-le v14, v2, :cond_16

    .line 441
    .line 442
    array-length v2, v1

    .line 443
    mul-int/lit8 v2, v2, 0x2

    .line 444
    .line 445
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    check-cast v1, [Lpi;

    .line 450
    .line 451
    iput-object v1, v9, Ls00;->q0:[Lpi;

    .line 452
    .line 453
    :cond_16
    iget-object v1, v9, Ls00;->q0:[Lpi;

    .line 454
    .line 455
    iget v2, v9, Ls00;->r0:I

    .line 456
    .line 457
    aput-object v22, v1, v2

    .line 458
    .line 459
    add-int/lit8 v2, v2, 0x1

    .line 460
    .line 461
    iput v2, v9, Ls00;->r0:I

    .line 462
    .line 463
    goto :goto_14

    .line 464
    :cond_17
    :goto_13
    move-object/from16 v19, v1

    .line 465
    .line 466
    :goto_14
    add-int/lit8 v8, v8, 0x1

    .line 467
    .line 468
    move-object/from16 v1, v19

    .line 469
    .line 470
    move-object/from16 v2, v21

    .line 471
    .line 472
    const/4 v9, 0x0

    .line 473
    goto :goto_10

    .line 474
    :cond_18
    move-object/from16 v19, v1

    .line 475
    .line 476
    move-object/from16 v21, v2

    .line 477
    .line 478
    iget-object v1, v5, Lai;->i:Ls00;

    .line 479
    .line 480
    invoke-virtual {v1}, Ls00;->S()V

    .line 481
    .line 482
    .line 483
    :goto_15
    add-int/lit8 v4, v4, 0x1

    .line 484
    .line 485
    move-object/from16 v1, v19

    .line 486
    .line 487
    move-object/from16 v2, v21

    .line 488
    .line 489
    const/4 v9, 0x0

    .line 490
    const/4 v14, -0x1

    .line 491
    goto/16 :goto_e

    .line 492
    .line 493
    :cond_19
    const/16 v18, 0x2

    .line 494
    .line 495
    const/4 v1, 0x0

    .line 496
    :goto_16
    if-ge v1, v13, :cond_1a

    .line 497
    .line 498
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 499
    .line 500
    .line 501
    add-int/lit8 v1, v1, 0x1

    .line 502
    .line 503
    goto :goto_16

    .line 504
    :cond_1a
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:Landroid/util/SparseArray;

    .line 505
    .line 506
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 507
    .line 508
    .line 509
    const/4 v1, 0x0

    .line 510
    invoke-virtual {v3, v1, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-virtual {v3, v1, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    const/4 v1, 0x0

    .line 521
    :goto_17
    if-ge v1, v13, :cond_1b

    .line 522
    .line 523
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lpi;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    invoke-virtual {v3, v2, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    add-int/lit8 v1, v1, 0x1

    .line 539
    .line 540
    goto :goto_17

    .line 541
    :cond_1b
    const/4 v8, 0x0

    .line 542
    :goto_18
    if-ge v8, v13, :cond_4f

    .line 543
    .line 544
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lpi;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    if-nez v2, :cond_1d

    .line 553
    .line 554
    :cond_1c
    :goto_19
    move/from16 v17, v8

    .line 555
    .line 556
    move/from16 v29, v11

    .line 557
    .line 558
    move/from16 v4, v18

    .line 559
    .line 560
    const/4 v15, -0x1

    .line 561
    goto/16 :goto_30

    .line 562
    .line 563
    :cond_1d
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    check-cast v4, Lci;

    .line 568
    .line 569
    iget-object v5, v10, Lqi;->q0:Ljava/util/ArrayList;

    .line 570
    .line 571
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    iget-object v5, v2, Lpi;->T:Lpi;

    .line 575
    .line 576
    if-eqz v5, :cond_1e

    .line 577
    .line 578
    check-cast v5, Lqi;

    .line 579
    .line 580
    iget-object v5, v5, Lqi;->q0:Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Lpi;->C()V

    .line 586
    .line 587
    .line 588
    :cond_1e
    iput-object v10, v2, Lpi;->T:Lpi;

    .line 589
    .line 590
    invoke-virtual {v4}, Lci;->a()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    iput v5, v2, Lpi;->g0:I

    .line 598
    .line 599
    iput-object v1, v2, Lpi;->f0:Landroid/view/View;

    .line 600
    .line 601
    instance-of v5, v1, Lai;

    .line 602
    .line 603
    if-eqz v5, :cond_1f

    .line 604
    .line 605
    check-cast v1, Lai;

    .line 606
    .line 607
    iget-boolean v5, v10, Lqi;->v0:Z

    .line 608
    .line 609
    invoke-virtual {v1, v2, v5}, Lai;->i(Lpi;Z)V

    .line 610
    .line 611
    .line 612
    :cond_1f
    iget-boolean v1, v4, Lci;->d0:Z

    .line 613
    .line 614
    if-eqz v1, :cond_23

    .line 615
    .line 616
    check-cast v2, Lb00;

    .line 617
    .line 618
    iget v1, v4, Lci;->m0:I

    .line 619
    .line 620
    iget v5, v4, Lci;->n0:I

    .line 621
    .line 622
    iget v4, v4, Lci;->o0:F

    .line 623
    .line 624
    const/high16 v9, -0x40800000    # -1.0f

    .line 625
    .line 626
    cmpl-float v14, v4, v9

    .line 627
    .line 628
    if-eqz v14, :cond_20

    .line 629
    .line 630
    if-lez v14, :cond_1c

    .line 631
    .line 632
    iput v4, v2, Lb00;->q0:F

    .line 633
    .line 634
    const/4 v4, -0x1

    .line 635
    iput v4, v2, Lb00;->r0:I

    .line 636
    .line 637
    iput v4, v2, Lb00;->s0:I

    .line 638
    .line 639
    goto :goto_1a

    .line 640
    :cond_20
    const/4 v4, -0x1

    .line 641
    if-eq v1, v4, :cond_22

    .line 642
    .line 643
    if-le v1, v4, :cond_21

    .line 644
    .line 645
    iput v9, v2, Lb00;->q0:F

    .line 646
    .line 647
    iput v1, v2, Lb00;->r0:I

    .line 648
    .line 649
    iput v4, v2, Lb00;->s0:I

    .line 650
    .line 651
    :cond_21
    :goto_1a
    move v15, v4

    .line 652
    move/from16 v17, v8

    .line 653
    .line 654
    move/from16 v29, v11

    .line 655
    .line 656
    move/from16 v4, v18

    .line 657
    .line 658
    goto/16 :goto_30

    .line 659
    .line 660
    :cond_22
    if-eq v5, v4, :cond_21

    .line 661
    .line 662
    if-le v5, v4, :cond_21

    .line 663
    .line 664
    iput v9, v2, Lb00;->q0:F

    .line 665
    .line 666
    iput v4, v2, Lb00;->r0:I

    .line 667
    .line 668
    iput v5, v2, Lb00;->s0:I

    .line 669
    .line 670
    goto :goto_19

    .line 671
    :cond_23
    iget v1, v4, Lci;->f0:I

    .line 672
    .line 673
    iget v5, v4, Lci;->g0:I

    .line 674
    .line 675
    iget v9, v4, Lci;->h0:I

    .line 676
    .line 677
    iget v14, v4, Lci;->i0:I

    .line 678
    .line 679
    iget v15, v4, Lci;->j0:I

    .line 680
    .line 681
    iget v0, v4, Lci;->k0:I

    .line 682
    .line 683
    move/from16 v17, v8

    .line 684
    .line 685
    iget v8, v4, Lci;->l0:F

    .line 686
    .line 687
    move/from16 v19, v0

    .line 688
    .line 689
    iget v0, v4, Lci;->p:I

    .line 690
    .line 691
    const/16 v27, 0x4

    .line 692
    .line 693
    const/16 v28, 0x2

    .line 694
    .line 695
    move/from16 v29, v11

    .line 696
    .line 697
    const/16 v30, 0x5

    .line 698
    .line 699
    const/16 v31, 0x3

    .line 700
    .line 701
    const/4 v11, -0x1

    .line 702
    const/16 v32, 0x0

    .line 703
    .line 704
    if-eq v0, v11, :cond_25

    .line 705
    .line 706
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    move-object/from16 v26, v0

    .line 711
    .line 712
    check-cast v26, Lpi;

    .line 713
    .line 714
    if-eqz v26, :cond_24

    .line 715
    .line 716
    iget v0, v4, Lci;->r:F

    .line 717
    .line 718
    iget v1, v4, Lci;->q:I

    .line 719
    .line 720
    const/16 v22, 0x7

    .line 721
    .line 722
    const/16 v25, 0x0

    .line 723
    .line 724
    move/from16 v23, v22

    .line 725
    .line 726
    move/from16 v24, v1

    .line 727
    .line 728
    move-object/from16 v21, v2

    .line 729
    .line 730
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 731
    .line 732
    .line 733
    iput v0, v2, Lpi;->D:F

    .line 734
    .line 735
    :cond_24
    move-object/from16 v0, p0

    .line 736
    .line 737
    move-object v1, v2

    .line 738
    move-object v2, v4

    .line 739
    move/from16 v14, v27

    .line 740
    .line 741
    move/from16 v9, v28

    .line 742
    .line 743
    move/from16 v5, v30

    .line 744
    .line 745
    move/from16 v15, v31

    .line 746
    .line 747
    goto/16 :goto_25

    .line 748
    .line 749
    :cond_25
    if-eq v1, v11, :cond_28

    .line 750
    .line 751
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    move-object/from16 v26, v0

    .line 756
    .line 757
    check-cast v26, Lpi;

    .line 758
    .line 759
    if-eqz v26, :cond_26

    .line 760
    .line 761
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 762
    .line 763
    move/from16 v23, v28

    .line 764
    .line 765
    move/from16 v24, v0

    .line 766
    .line 767
    move-object/from16 v21, v2

    .line 768
    .line 769
    move/from16 v25, v15

    .line 770
    .line 771
    move/from16 v22, v28

    .line 772
    .line 773
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 774
    .line 775
    .line 776
    goto :goto_1b

    .line 777
    :cond_26
    move-object/from16 v21, v2

    .line 778
    .line 779
    move/from16 v22, v28

    .line 780
    .line 781
    :cond_27
    :goto_1b
    move/from16 v23, v22

    .line 782
    .line 783
    move/from16 v22, v27

    .line 784
    .line 785
    goto :goto_1c

    .line 786
    :cond_28
    move-object/from16 v21, v2

    .line 787
    .line 788
    move/from16 v25, v15

    .line 789
    .line 790
    move/from16 v22, v28

    .line 791
    .line 792
    if-eq v5, v11, :cond_27

    .line 793
    .line 794
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    move-object/from16 v26, v0

    .line 799
    .line 800
    check-cast v26, Lpi;

    .line 801
    .line 802
    if-eqz v26, :cond_27

    .line 803
    .line 804
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 805
    .line 806
    move/from16 v24, v0

    .line 807
    .line 808
    move/from16 v23, v27

    .line 809
    .line 810
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 811
    .line 812
    .line 813
    move/from16 v33, v23

    .line 814
    .line 815
    move/from16 v23, v22

    .line 816
    .line 817
    move/from16 v22, v33

    .line 818
    .line 819
    :goto_1c
    if-eq v9, v11, :cond_2b

    .line 820
    .line 821
    invoke-virtual {v3, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    move-object/from16 v26, v0

    .line 826
    .line 827
    check-cast v26, Lpi;

    .line 828
    .line 829
    if-eqz v26, :cond_29

    .line 830
    .line 831
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 832
    .line 833
    move/from16 v24, v0

    .line 834
    .line 835
    move/from16 v25, v19

    .line 836
    .line 837
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 838
    .line 839
    .line 840
    :cond_29
    move/from16 v9, v23

    .line 841
    .line 842
    :cond_2a
    :goto_1d
    move/from16 v14, v22

    .line 843
    .line 844
    goto :goto_1e

    .line 845
    :cond_2b
    move/from16 v25, v19

    .line 846
    .line 847
    move/from16 v9, v23

    .line 848
    .line 849
    if-eq v14, v11, :cond_2a

    .line 850
    .line 851
    invoke-virtual {v3, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    move-object/from16 v26, v0

    .line 856
    .line 857
    check-cast v26, Lpi;

    .line 858
    .line 859
    if-eqz v26, :cond_2a

    .line 860
    .line 861
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 862
    .line 863
    move/from16 v23, v22

    .line 864
    .line 865
    move/from16 v24, v0

    .line 866
    .line 867
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 868
    .line 869
    .line 870
    goto :goto_1d

    .line 871
    :goto_1e
    iget v0, v4, Lci;->i:I

    .line 872
    .line 873
    if-eq v0, v11, :cond_2d

    .line 874
    .line 875
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    move-object/from16 v26, v0

    .line 880
    .line 881
    check-cast v26, Lpi;

    .line 882
    .line 883
    if-eqz v26, :cond_2c

    .line 884
    .line 885
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 886
    .line 887
    iget v1, v4, Lci;->x:I

    .line 888
    .line 889
    move/from16 v23, v31

    .line 890
    .line 891
    move/from16 v24, v0

    .line 892
    .line 893
    move/from16 v25, v1

    .line 894
    .line 895
    move/from16 v22, v31

    .line 896
    .line 897
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 898
    .line 899
    .line 900
    goto :goto_1f

    .line 901
    :cond_2c
    move/from16 v22, v31

    .line 902
    .line 903
    :goto_1f
    move/from16 v5, v22

    .line 904
    .line 905
    move/from16 v22, v30

    .line 906
    .line 907
    const/4 v11, -0x1

    .line 908
    goto :goto_20

    .line 909
    :cond_2d
    move/from16 v22, v31

    .line 910
    .line 911
    iget v0, v4, Lci;->j:I

    .line 912
    .line 913
    const/4 v11, -0x1

    .line 914
    if-eq v0, v11, :cond_2e

    .line 915
    .line 916
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    move-object/from16 v26, v0

    .line 921
    .line 922
    check-cast v26, Lpi;

    .line 923
    .line 924
    if-eqz v26, :cond_2e

    .line 925
    .line 926
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 927
    .line 928
    iget v1, v4, Lci;->x:I

    .line 929
    .line 930
    move/from16 v24, v0

    .line 931
    .line 932
    move/from16 v25, v1

    .line 933
    .line 934
    move/from16 v23, v30

    .line 935
    .line 936
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 937
    .line 938
    .line 939
    move/from16 v5, v22

    .line 940
    .line 941
    move/from16 v22, v23

    .line 942
    .line 943
    goto :goto_20

    .line 944
    :cond_2e
    move/from16 v5, v22

    .line 945
    .line 946
    move/from16 v22, v30

    .line 947
    .line 948
    :goto_20
    iget v0, v4, Lci;->k:I

    .line 949
    .line 950
    if-eq v0, v11, :cond_31

    .line 951
    .line 952
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    move-object/from16 v26, v0

    .line 957
    .line 958
    check-cast v26, Lpi;

    .line 959
    .line 960
    if-eqz v26, :cond_2f

    .line 961
    .line 962
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 963
    .line 964
    iget v1, v4, Lci;->z:I

    .line 965
    .line 966
    move/from16 v24, v0

    .line 967
    .line 968
    move/from16 v25, v1

    .line 969
    .line 970
    move/from16 v23, v5

    .line 971
    .line 972
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 973
    .line 974
    .line 975
    move/from16 v15, v23

    .line 976
    .line 977
    goto :goto_21

    .line 978
    :cond_2f
    move v15, v5

    .line 979
    :cond_30
    :goto_21
    move-object v2, v4

    .line 980
    goto :goto_22

    .line 981
    :cond_31
    move v15, v5

    .line 982
    iget v0, v4, Lci;->l:I

    .line 983
    .line 984
    if-eq v0, v11, :cond_30

    .line 985
    .line 986
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    move-object/from16 v26, v0

    .line 991
    .line 992
    check-cast v26, Lpi;

    .line 993
    .line 994
    if-eqz v26, :cond_30

    .line 995
    .line 996
    iget v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 997
    .line 998
    iget v1, v4, Lci;->z:I

    .line 999
    .line 1000
    move/from16 v23, v22

    .line 1001
    .line 1002
    move/from16 v24, v0

    .line 1003
    .line 1004
    move/from16 v25, v1

    .line 1005
    .line 1006
    invoke-virtual/range {v21 .. v26}, Lpi;->v(IIIILpi;)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_21

    .line 1010
    :goto_22
    iget v4, v2, Lci;->m:I

    .line 1011
    .line 1012
    const/4 v11, -0x1

    .line 1013
    if-eq v4, v11, :cond_32

    .line 1014
    .line 1015
    const/4 v5, 0x6

    .line 1016
    move-object/from16 v0, p0

    .line 1017
    .line 1018
    move-object/from16 v1, v21

    .line 1019
    .line 1020
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lpi;Lci;Landroid/util/SparseArray;II)V

    .line 1021
    .line 1022
    .line 1023
    :goto_23
    move/from16 v5, v22

    .line 1024
    .line 1025
    goto :goto_24

    .line 1026
    :cond_32
    iget v4, v2, Lci;->n:I

    .line 1027
    .line 1028
    if-eq v4, v11, :cond_33

    .line 1029
    .line 1030
    move-object/from16 v0, p0

    .line 1031
    .line 1032
    move v5, v15

    .line 1033
    move-object/from16 v1, v21

    .line 1034
    .line 1035
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lpi;Lci;Landroid/util/SparseArray;II)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_23

    .line 1039
    :cond_33
    iget v4, v2, Lci;->o:I

    .line 1040
    .line 1041
    move-object/from16 v0, p0

    .line 1042
    .line 1043
    move-object/from16 v1, v21

    .line 1044
    .line 1045
    move/from16 v5, v22

    .line 1046
    .line 1047
    if-eq v4, v11, :cond_34

    .line 1048
    .line 1049
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(Lpi;Lci;Landroid/util/SparseArray;II)V

    .line 1050
    .line 1051
    .line 1052
    :cond_34
    :goto_24
    cmpl-float v4, v8, v32

    .line 1053
    .line 1054
    if-ltz v4, :cond_35

    .line 1055
    .line 1056
    iput v8, v1, Lpi;->d0:F

    .line 1057
    .line 1058
    :cond_35
    iget v4, v2, Lci;->F:F

    .line 1059
    .line 1060
    cmpl-float v8, v4, v32

    .line 1061
    .line 1062
    if-ltz v8, :cond_36

    .line 1063
    .line 1064
    iput v4, v1, Lpi;->e0:F

    .line 1065
    .line 1066
    :cond_36
    :goto_25
    if-eqz v12, :cond_38

    .line 1067
    .line 1068
    iget v4, v2, Lci;->T:I

    .line 1069
    .line 1070
    const/4 v11, -0x1

    .line 1071
    if-ne v4, v11, :cond_37

    .line 1072
    .line 1073
    iget v8, v2, Lci;->U:I

    .line 1074
    .line 1075
    if-eq v8, v11, :cond_38

    .line 1076
    .line 1077
    :cond_37
    iget v8, v2, Lci;->U:I

    .line 1078
    .line 1079
    iput v4, v1, Lpi;->Y:I

    .line 1080
    .line 1081
    iput v8, v1, Lpi;->Z:I

    .line 1082
    .line 1083
    :cond_38
    iget-boolean v4, v2, Lci;->a0:Z

    .line 1084
    .line 1085
    const/4 v8, 0x3

    .line 1086
    const/4 v11, -0x2

    .line 1087
    const/4 v5, 0x4

    .line 1088
    if-nez v4, :cond_3b

    .line 1089
    .line 1090
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1091
    .line 1092
    const/4 v15, -0x1

    .line 1093
    if-ne v4, v15, :cond_3a

    .line 1094
    .line 1095
    iget-boolean v4, v2, Lci;->W:Z

    .line 1096
    .line 1097
    if-eqz v4, :cond_39

    .line 1098
    .line 1099
    invoke-virtual {v1, v8}, Lpi;->M(I)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_26

    .line 1103
    :cond_39
    invoke-virtual {v1, v5}, Lpi;->M(I)V

    .line 1104
    .line 1105
    .line 1106
    :goto_26
    invoke-virtual {v1, v9}, Lpi;->i(I)Lwh;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v4

    .line 1110
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1111
    .line 1112
    iput v9, v4, Lwh;->g:I

    .line 1113
    .line 1114
    invoke-virtual {v1, v14}, Lpi;->i(I)Lwh;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v4

    .line 1118
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1119
    .line 1120
    iput v9, v4, Lwh;->g:I

    .line 1121
    .line 1122
    goto :goto_27

    .line 1123
    :cond_3a
    invoke-virtual {v1, v8}, Lpi;->M(I)V

    .line 1124
    .line 1125
    .line 1126
    const/4 v4, 0x0

    .line 1127
    invoke-virtual {v1, v4}, Lpi;->O(I)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_27

    .line 1131
    :cond_3b
    move/from16 v4, v16

    .line 1132
    .line 1133
    invoke-virtual {v1, v4}, Lpi;->M(I)V

    .line 1134
    .line 1135
    .line 1136
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1137
    .line 1138
    invoke-virtual {v1, v4}, Lpi;->O(I)V

    .line 1139
    .line 1140
    .line 1141
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1142
    .line 1143
    if-ne v4, v11, :cond_3c

    .line 1144
    .line 1145
    move/from16 v4, v18

    .line 1146
    .line 1147
    invoke-virtual {v1, v4}, Lpi;->M(I)V

    .line 1148
    .line 1149
    .line 1150
    :cond_3c
    :goto_27
    iget-boolean v4, v2, Lci;->b0:Z

    .line 1151
    .line 1152
    if-nez v4, :cond_3f

    .line 1153
    .line 1154
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1155
    .line 1156
    const/4 v15, -0x1

    .line 1157
    if-ne v4, v15, :cond_3e

    .line 1158
    .line 1159
    iget-boolean v4, v2, Lci;->X:Z

    .line 1160
    .line 1161
    if-eqz v4, :cond_3d

    .line 1162
    .line 1163
    invoke-virtual {v1, v8}, Lpi;->N(I)V

    .line 1164
    .line 1165
    .line 1166
    :goto_28
    const/4 v5, 0x3

    .line 1167
    goto :goto_29

    .line 1168
    :cond_3d
    invoke-virtual {v1, v5}, Lpi;->N(I)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_28

    .line 1172
    :goto_29
    invoke-virtual {v1, v5}, Lpi;->i(I)Lwh;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v4

    .line 1176
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1177
    .line 1178
    iput v5, v4, Lwh;->g:I

    .line 1179
    .line 1180
    const/4 v5, 0x5

    .line 1181
    invoke-virtual {v1, v5}, Lpi;->i(I)Lwh;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v4

    .line 1185
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1186
    .line 1187
    iput v5, v4, Lwh;->g:I

    .line 1188
    .line 1189
    goto :goto_2a

    .line 1190
    :cond_3e
    invoke-virtual {v1, v8}, Lpi;->N(I)V

    .line 1191
    .line 1192
    .line 1193
    const/4 v4, 0x0

    .line 1194
    invoke-virtual {v1, v4}, Lpi;->L(I)V

    .line 1195
    .line 1196
    .line 1197
    goto :goto_2a

    .line 1198
    :cond_3f
    const/4 v4, 0x1

    .line 1199
    const/4 v15, -0x1

    .line 1200
    invoke-virtual {v1, v4}, Lpi;->N(I)V

    .line 1201
    .line 1202
    .line 1203
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1204
    .line 1205
    invoke-virtual {v1, v4}, Lpi;->L(I)V

    .line 1206
    .line 1207
    .line 1208
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1209
    .line 1210
    if-ne v4, v11, :cond_40

    .line 1211
    .line 1212
    const/4 v4, 0x2

    .line 1213
    invoke-virtual {v1, v4}, Lpi;->N(I)V

    .line 1214
    .line 1215
    .line 1216
    :cond_40
    :goto_2a
    iget-object v4, v2, Lci;->G:Ljava/lang/String;

    .line 1217
    .line 1218
    if-eqz v4, :cond_41

    .line 1219
    .line 1220
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1221
    .line 1222
    .line 1223
    move-result v5

    .line 1224
    if-nez v5, :cond_42

    .line 1225
    .line 1226
    :cond_41
    move/from16 v4, v32

    .line 1227
    .line 1228
    goto/16 :goto_2e

    .line 1229
    .line 1230
    :cond_42
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1231
    .line 1232
    .line 1233
    move-result v5

    .line 1234
    const/16 v9, 0x2c

    .line 1235
    .line 1236
    invoke-virtual {v4, v9}, Ljava/lang/String;->indexOf(I)I

    .line 1237
    .line 1238
    .line 1239
    move-result v9

    .line 1240
    if-lez v9, :cond_45

    .line 1241
    .line 1242
    add-int/lit8 v11, v5, -0x1

    .line 1243
    .line 1244
    if-ge v9, v11, :cond_45

    .line 1245
    .line 1246
    const/4 v11, 0x0

    .line 1247
    invoke-virtual {v4, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v14

    .line 1251
    const-string v11, "W"

    .line 1252
    .line 1253
    invoke-virtual {v14, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v11

    .line 1257
    if-eqz v11, :cond_43

    .line 1258
    .line 1259
    const/4 v11, 0x0

    .line 1260
    goto :goto_2b

    .line 1261
    :cond_43
    const-string v11, "H"

    .line 1262
    .line 1263
    invoke-virtual {v14, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v11

    .line 1267
    if-eqz v11, :cond_44

    .line 1268
    .line 1269
    const/4 v11, 0x1

    .line 1270
    goto :goto_2b

    .line 1271
    :cond_44
    move v11, v15

    .line 1272
    :goto_2b
    add-int/lit8 v9, v9, 0x1

    .line 1273
    .line 1274
    goto :goto_2c

    .line 1275
    :cond_45
    move v11, v15

    .line 1276
    const/4 v9, 0x0

    .line 1277
    :goto_2c
    const/16 v14, 0x3a

    .line 1278
    .line 1279
    invoke-virtual {v4, v14}, Ljava/lang/String;->indexOf(I)I

    .line 1280
    .line 1281
    .line 1282
    move-result v14

    .line 1283
    if-ltz v14, :cond_47

    .line 1284
    .line 1285
    add-int/lit8 v5, v5, -0x1

    .line 1286
    .line 1287
    if-ge v14, v5, :cond_47

    .line 1288
    .line 1289
    invoke-virtual {v4, v9, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    add-int/lit8 v14, v14, 0x1

    .line 1294
    .line 1295
    invoke-virtual {v4, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1300
    .line 1301
    .line 1302
    move-result v9

    .line 1303
    if-lez v9, :cond_48

    .line 1304
    .line 1305
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1306
    .line 1307
    .line 1308
    move-result v9

    .line 1309
    if-lez v9, :cond_48

    .line 1310
    .line 1311
    :try_start_2
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1312
    .line 1313
    .line 1314
    move-result v5

    .line 1315
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1316
    .line 1317
    .line 1318
    move-result v4

    .line 1319
    cmpl-float v9, v5, v32

    .line 1320
    .line 1321
    if-lez v9, :cond_48

    .line 1322
    .line 1323
    cmpl-float v9, v4, v32

    .line 1324
    .line 1325
    if-lez v9, :cond_48

    .line 1326
    .line 1327
    const/4 v9, 0x1

    .line 1328
    if-ne v11, v9, :cond_46

    .line 1329
    .line 1330
    div-float/2addr v4, v5

    .line 1331
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1332
    .line 1333
    .line 1334
    move-result v4

    .line 1335
    goto :goto_2d

    .line 1336
    :cond_46
    div-float/2addr v5, v4

    .line 1337
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 1338
    .line 1339
    .line 1340
    move-result v4
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1341
    goto :goto_2d

    .line 1342
    :cond_47
    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v4

    .line 1346
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1347
    .line 1348
    .line 1349
    move-result v5

    .line 1350
    if-lez v5, :cond_48

    .line 1351
    .line 1352
    :try_start_3
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1353
    .line 1354
    .line 1355
    move-result v4
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1356
    goto :goto_2d

    .line 1357
    :catch_2
    :cond_48
    move/from16 v4, v32

    .line 1358
    .line 1359
    :goto_2d
    cmpl-float v5, v4, v32

    .line 1360
    .line 1361
    if-lez v5, :cond_49

    .line 1362
    .line 1363
    iput v4, v1, Lpi;->W:F

    .line 1364
    .line 1365
    iput v11, v1, Lpi;->X:I

    .line 1366
    .line 1367
    goto :goto_2f

    .line 1368
    :goto_2e
    iput v4, v1, Lpi;->W:F

    .line 1369
    .line 1370
    :cond_49
    :goto_2f
    iget v4, v2, Lci;->H:F

    .line 1371
    .line 1372
    iget-object v5, v1, Lpi;->k0:[F

    .line 1373
    .line 1374
    const/16 v20, 0x0

    .line 1375
    .line 1376
    aput v4, v5, v20

    .line 1377
    .line 1378
    iget v4, v2, Lci;->I:F

    .line 1379
    .line 1380
    const/16 v16, 0x1

    .line 1381
    .line 1382
    aput v4, v5, v16

    .line 1383
    .line 1384
    iget v4, v2, Lci;->J:I

    .line 1385
    .line 1386
    iput v4, v1, Lpi;->i0:I

    .line 1387
    .line 1388
    iget v4, v2, Lci;->K:I

    .line 1389
    .line 1390
    iput v4, v1, Lpi;->j0:I

    .line 1391
    .line 1392
    iget v4, v2, Lci;->Z:I

    .line 1393
    .line 1394
    if-ltz v4, :cond_4a

    .line 1395
    .line 1396
    if-gt v4, v8, :cond_4a

    .line 1397
    .line 1398
    iput v4, v1, Lpi;->q:I

    .line 1399
    .line 1400
    :cond_4a
    iget v4, v2, Lci;->L:I

    .line 1401
    .line 1402
    iget v5, v2, Lci;->N:I

    .line 1403
    .line 1404
    iget v8, v2, Lci;->P:I

    .line 1405
    .line 1406
    iget v9, v2, Lci;->R:F

    .line 1407
    .line 1408
    iput v4, v1, Lpi;->r:I

    .line 1409
    .line 1410
    iput v5, v1, Lpi;->u:I

    .line 1411
    .line 1412
    const v5, 0x7fffffff

    .line 1413
    .line 1414
    .line 1415
    if-ne v8, v5, :cond_4b

    .line 1416
    .line 1417
    const/4 v8, 0x0

    .line 1418
    :cond_4b
    iput v8, v1, Lpi;->v:I

    .line 1419
    .line 1420
    iput v9, v1, Lpi;->w:F

    .line 1421
    .line 1422
    const/16 v32, 0x0

    .line 1423
    .line 1424
    cmpl-float v8, v9, v32

    .line 1425
    .line 1426
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1427
    .line 1428
    if-lez v8, :cond_4c

    .line 1429
    .line 1430
    cmpg-float v8, v9, v11

    .line 1431
    .line 1432
    if-gez v8, :cond_4c

    .line 1433
    .line 1434
    if-nez v4, :cond_4c

    .line 1435
    .line 1436
    const/4 v4, 0x2

    .line 1437
    iput v4, v1, Lpi;->r:I

    .line 1438
    .line 1439
    :cond_4c
    iget v4, v2, Lci;->M:I

    .line 1440
    .line 1441
    iget v8, v2, Lci;->O:I

    .line 1442
    .line 1443
    iget v9, v2, Lci;->Q:I

    .line 1444
    .line 1445
    iget v2, v2, Lci;->S:F

    .line 1446
    .line 1447
    iput v4, v1, Lpi;->s:I

    .line 1448
    .line 1449
    iput v8, v1, Lpi;->x:I

    .line 1450
    .line 1451
    if-ne v9, v5, :cond_4d

    .line 1452
    .line 1453
    const/4 v9, 0x0

    .line 1454
    :cond_4d
    iput v9, v1, Lpi;->y:I

    .line 1455
    .line 1456
    iput v2, v1, Lpi;->z:F

    .line 1457
    .line 1458
    const/16 v32, 0x0

    .line 1459
    .line 1460
    cmpl-float v5, v2, v32

    .line 1461
    .line 1462
    if-lez v5, :cond_4e

    .line 1463
    .line 1464
    cmpg-float v2, v2, v11

    .line 1465
    .line 1466
    if-gez v2, :cond_4e

    .line 1467
    .line 1468
    if-nez v4, :cond_4e

    .line 1469
    .line 1470
    const/4 v4, 0x2

    .line 1471
    iput v4, v1, Lpi;->s:I

    .line 1472
    .line 1473
    goto :goto_30

    .line 1474
    :cond_4e
    const/4 v4, 0x2

    .line 1475
    :goto_30
    add-int/lit8 v8, v17, 0x1

    .line 1476
    .line 1477
    move/from16 v18, v4

    .line 1478
    .line 1479
    move/from16 v11, v29

    .line 1480
    .line 1481
    goto/16 :goto_18

    .line 1482
    .line 1483
    :cond_4f
    move/from16 v29, v11

    .line 1484
    .line 1485
    if-eqz v29, :cond_50

    .line 1486
    .line 1487
    iget-object v1, v10, Lqi;->r0:Lt83;

    .line 1488
    .line 1489
    invoke-virtual {v1, v10}, Lt83;->R(Lqi;)V

    .line 1490
    .line 1491
    .line 1492
    :cond_50
    iget-object v1, v10, Lqi;->w0:Lx60;

    .line 1493
    .line 1494
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 1498
    .line 1499
    invoke-virtual {v0, v10, v1, v6, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lqi;III)V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v10}, Lpi;->q()I

    .line 1503
    .line 1504
    .line 1505
    move-result v1

    .line 1506
    invoke-virtual {v10}, Lpi;->k()I

    .line 1507
    .line 1508
    .line 1509
    move-result v2

    .line 1510
    iget-boolean v3, v10, Lqi;->E0:Z

    .line 1511
    .line 1512
    iget-boolean v4, v10, Lqi;->F0:Z

    .line 1513
    .line 1514
    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldi;

    .line 1515
    .line 1516
    iget v8, v5, Ldi;->e:I

    .line 1517
    .line 1518
    iget v5, v5, Ldi;->d:I

    .line 1519
    .line 1520
    add-int/2addr v1, v5

    .line 1521
    add-int/2addr v2, v8

    .line 1522
    const/4 v11, 0x0

    .line 1523
    invoke-static {v1, v6, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1524
    .line 1525
    .line 1526
    move-result v1

    .line 1527
    invoke-static {v2, v7, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1528
    .line 1529
    .line 1530
    move-result v2

    .line 1531
    const v5, 0xffffff

    .line 1532
    .line 1533
    .line 1534
    and-int/2addr v1, v5

    .line 1535
    and-int/2addr v2, v5

    .line 1536
    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 1537
    .line 1538
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 1539
    .line 1540
    .line 1541
    move-result v1

    .line 1542
    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 1543
    .line 1544
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    .line 1545
    .line 1546
    .line 1547
    move-result v2

    .line 1548
    const/high16 v5, 0x1000000

    .line 1549
    .line 1550
    if-eqz v3, :cond_51

    .line 1551
    .line 1552
    or-int/2addr v1, v5

    .line 1553
    :cond_51
    if-eqz v4, :cond_52

    .line 1554
    .line 1555
    or-int/2addr v2, v5

    .line 1556
    :cond_52
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1557
    .line 1558
    .line 1559
    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lpi;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, p1, Landroidx/constraintlayout/widget/Guideline;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    instance-of v0, v0, Lb00;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lci;

    .line 22
    .line 23
    new-instance v1, Lb00;

    .line 24
    .line 25
    invoke-direct {v1}, Lb00;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lci;->p0:Lpi;

    .line 29
    .line 30
    iput-boolean v2, v0, Lci;->d0:Z

    .line 31
    .line 32
    iget v0, v0, Lci;->V:I

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lb00;->S(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    instance-of v0, p1, Lai;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    move-object v0, p1

    .line 42
    check-cast v0, Lai;

    .line 43
    .line 44
    invoke-virtual {v0}, Lai;->k()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lci;

    .line 52
    .line 53
    iput-boolean v2, v1, Lci;->e0:Z

    .line 54
    .line 55
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 76
    .line 77
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/view/View;)Lpi;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 18
    .line 19
    iget-object v1, v1, Lqi;->q0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lpi;->C()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 34
    .line 35
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setConstraintSet(Lni;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lni;

    .line 2
    .line 3
    return-void
.end method

.method public setId(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setOnConstraintsChanged(Lsi;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lgw3;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Lqi;

    .line 4
    .line 5
    iput p1, v0, Lqi;->D0:I

    .line 6
    .line 7
    const/16 p1, 0x200

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lqi;->W(I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    sput-boolean p1, Lx60;->q:Z

    .line 14
    .line 15
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
