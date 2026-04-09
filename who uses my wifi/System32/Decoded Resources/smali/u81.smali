.class public final Lu81;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:La91;

.field public final synthetic b:Lo91;

.field public final synthetic c:Lo91;

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(La91;Lo91;Lo91;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu81;->a:La91;

    .line 5
    .line 6
    iput-object p2, p0, Lu81;->b:Lo91;

    .line 7
    .line 8
    iput-object p3, p0, Lu81;->c:Lo91;

    .line 9
    .line 10
    iput p4, p0, Lu81;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lu81;->e:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lu81;->a:La91;

    .line 6
    .line 7
    iget-object v1, v0, La91;->a:Lz81;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lz81;->d(F)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lu81;->b:Lo91;

    .line 13
    .line 14
    iget-object v2, p1, Lo91;->a:Ll91;

    .line 15
    .line 16
    invoke-virtual {v1}, Lz81;->b()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget-object v3, Lw81;->e:Landroid/view/animation/PathInterpolator;

    .line 21
    .line 22
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v4, 0x1e

    .line 25
    .line 26
    if-lt v3, v4, :cond_0

    .line 27
    .line 28
    new-instance v3, Le91;

    .line 29
    .line 30
    invoke-direct {v3, p1}, Le91;-><init>(Lo91;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v4, 0x1d

    .line 35
    .line 36
    if-lt v3, v4, :cond_1

    .line 37
    .line 38
    new-instance v3, Ld91;

    .line 39
    .line 40
    invoke-direct {v3, p1}, Ld91;-><init>(Lo91;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v3, Lc91;

    .line 45
    .line 46
    invoke-direct {v3, p1}, Lc91;-><init>(Lo91;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    const/4 p1, 0x1

    .line 50
    :goto_1
    const/16 v4, 0x100

    .line 51
    .line 52
    if-gt p1, v4, :cond_3

    .line 53
    .line 54
    iget v4, p0, Lu81;->d:I

    .line 55
    .line 56
    and-int/2addr v4, p1

    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ll91;->f(I)Ly20;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v3, p1, v4}, Lf91;->c(ILy20;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v2, p1}, Ll91;->f(I)Ly20;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object v5, p0, Lu81;->c:Lo91;

    .line 72
    .line 73
    iget-object v5, v5, Lo91;->a:Ll91;

    .line 74
    .line 75
    invoke-virtual {v5, p1}, Ll91;->f(I)Ly20;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget v6, v4, Ly20;->a:I

    .line 80
    .line 81
    iget v7, v5, Ly20;->a:I

    .line 82
    .line 83
    sub-int/2addr v6, v7

    .line 84
    int-to-float v6, v6

    .line 85
    const/high16 v7, 0x3f800000    # 1.0f

    .line 86
    .line 87
    sub-float/2addr v7, v1

    .line 88
    mul-float/2addr v6, v7

    .line 89
    float-to-double v8, v6

    .line 90
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    .line 91
    .line 92
    add-double/2addr v8, v10

    .line 93
    double-to-int v6, v8

    .line 94
    iget v8, v4, Ly20;->b:I

    .line 95
    .line 96
    iget v9, v5, Ly20;->b:I

    .line 97
    .line 98
    sub-int/2addr v8, v9

    .line 99
    int-to-float v8, v8

    .line 100
    mul-float/2addr v8, v7

    .line 101
    float-to-double v8, v8

    .line 102
    add-double/2addr v8, v10

    .line 103
    double-to-int v8, v8

    .line 104
    iget v9, v4, Ly20;->c:I

    .line 105
    .line 106
    iget v12, v5, Ly20;->c:I

    .line 107
    .line 108
    sub-int/2addr v9, v12

    .line 109
    int-to-float v9, v9

    .line 110
    mul-float/2addr v9, v7

    .line 111
    float-to-double v12, v9

    .line 112
    add-double/2addr v12, v10

    .line 113
    double-to-int v9, v12

    .line 114
    iget v12, v4, Ly20;->d:I

    .line 115
    .line 116
    iget v5, v5, Ly20;->d:I

    .line 117
    .line 118
    sub-int/2addr v12, v5

    .line 119
    int-to-float v5, v12

    .line 120
    mul-float/2addr v5, v7

    .line 121
    float-to-double v12, v5

    .line 122
    add-double/2addr v12, v10

    .line 123
    double-to-int v5, v12

    .line 124
    invoke-static {v4, v6, v8, v9, v5}, Lo91;->e(Ly20;IIII)Ly20;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v3, p1, v4}, Lf91;->c(ILy20;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    shl-int/lit8 p1, p1, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-virtual {v3}, Lf91;->b()Lo91;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-object v1, p0, Lu81;->e:Landroid/view/View;

    .line 143
    .line 144
    invoke-static {v1, p1, v0}, Lw81;->g(Landroid/view/View;Lo91;Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method
