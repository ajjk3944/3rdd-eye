.class public final Lk90;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk90;->f:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lk90;->g:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/high16 v1, 0x43870000    # 270.0f

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1, v0}, Lk90;->e(FFF)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public a(FFFFFF)V
    .locals 4

    .line 1
    new-instance v0, Lhv0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lhv0;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    iput p5, v0, Lhv0;->f:F

    .line 7
    .line 8
    iput p6, v0, Lhv0;->g:F

    .line 9
    .line 10
    iget-object v1, p0, Lk90;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Lfv0;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lfv0;-><init>(Lhv0;)V

    .line 20
    .line 21
    .line 22
    add-float v0, p5, p6

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    cmpg-float p6, p6, v2

    .line 26
    .line 27
    if-gez p6, :cond_0

    .line 28
    .line 29
    const/4 p6, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p6, 0x0

    .line 32
    :goto_0
    const/high16 v2, 0x43b40000    # 360.0f

    .line 33
    .line 34
    const/high16 v3, 0x43340000    # 180.0f

    .line 35
    .line 36
    if-eqz p6, :cond_1

    .line 37
    .line 38
    add-float/2addr p5, v3

    .line 39
    rem-float/2addr p5, v2

    .line 40
    :cond_1
    if-eqz p6, :cond_2

    .line 41
    .line 42
    add-float/2addr v3, v0

    .line 43
    rem-float/2addr v3, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v3, v0

    .line 46
    :goto_1
    invoke-virtual {p0, p5}, Lk90;->b(F)V

    .line 47
    .line 48
    .line 49
    iget-object p5, p0, Lk90;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p5, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iput v3, p0, Lk90;->d:F

    .line 57
    .line 58
    add-float p5, p1, p3

    .line 59
    .line 60
    const/high16 p6, 0x3f000000    # 0.5f

    .line 61
    .line 62
    mul-float/2addr p5, p6

    .line 63
    sub-float/2addr p3, p1

    .line 64
    const/high16 p1, 0x40000000    # 2.0f

    .line 65
    .line 66
    div-float/2addr p3, p1

    .line 67
    float-to-double v0, v0

    .line 68
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    double-to-float v2, v2

    .line 77
    mul-float/2addr p3, v2

    .line 78
    add-float/2addr p3, p5

    .line 79
    iput p3, p0, Lk90;->b:F

    .line 80
    .line 81
    add-float p3, p2, p4

    .line 82
    .line 83
    mul-float/2addr p3, p6

    .line 84
    sub-float/2addr p4, p2

    .line 85
    div-float/2addr p4, p1

    .line 86
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide p1

    .line 90
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide p1

    .line 94
    double-to-float p1, p1

    .line 95
    mul-float/2addr p4, p1

    .line 96
    add-float/2addr p4, p3

    .line 97
    iput p4, p0, Lk90;->c:F

    .line 98
    .line 99
    return-void
.end method

.method public b(F)V
    .locals 4

    .line 1
    iget v0, p0, Lk90;->d:F

    .line 2
    .line 3
    cmpl-float v1, v0, p1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sub-float v0, p1, v0

    .line 9
    .line 10
    const/high16 v1, 0x43b40000    # 360.0f

    .line 11
    .line 12
    add-float/2addr v0, v1

    .line 13
    rem-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x43340000    # 180.0f

    .line 15
    .line 16
    cmpl-float v1, v0, v1

    .line 17
    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    new-instance v1, Lhv0;

    .line 22
    .line 23
    iget v2, p0, Lk90;->b:F

    .line 24
    .line 25
    iget v3, p0, Lk90;->c:F

    .line 26
    .line 27
    invoke-direct {v1, v2, v3, v2, v3}, Lhv0;-><init>(FFFF)V

    .line 28
    .line 29
    .line 30
    iget v2, p0, Lk90;->d:F

    .line 31
    .line 32
    iput v2, v1, Lhv0;->f:F

    .line 33
    .line 34
    iput v0, v1, Lhv0;->g:F

    .line 35
    .line 36
    iget-object v0, p0, Lk90;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    new-instance v2, Lfv0;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lfv0;-><init>(Lhv0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iput p1, p0, Lk90;->d:F

    .line 49
    .line 50
    return-void
.end method

.method public c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk90;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ljv0;

    .line 17
    .line 18
    invoke-virtual {v3, p1, p2}, Ljv0;->a(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public d(FF)V
    .locals 4

    .line 1
    new-instance v0, Liv0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljv0;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, v0, Liv0;->b:F

    .line 7
    .line 8
    iput p2, v0, Liv0;->c:F

    .line 9
    .line 10
    iget-object v1, p0, Lk90;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Lgv0;

    .line 18
    .line 19
    iget v2, p0, Lk90;->b:F

    .line 20
    .line 21
    iget v3, p0, Lk90;->c:F

    .line 22
    .line 23
    invoke-direct {v1, v0, v2, v3}, Lgv0;-><init>(Liv0;FF)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lgv0;->b()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/high16 v2, 0x43870000    # 270.0f

    .line 31
    .line 32
    add-float/2addr v0, v2

    .line 33
    invoke-virtual {v1}, Lgv0;->b()F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    add-float/2addr v3, v2

    .line 38
    invoke-virtual {p0, v0}, Lk90;->b(F)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lk90;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iput v3, p0, Lk90;->d:F

    .line 49
    .line 50
    iput p1, p0, Lk90;->b:F

    .line 51
    .line 52
    iput p2, p0, Lk90;->c:F

    .line 53
    .line 54
    return-void
.end method

.method public e(FFF)V
    .locals 1

    .line 1
    iput p1, p0, Lk90;->a:F

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lk90;->b:F

    .line 5
    .line 6
    iput p1, p0, Lk90;->c:F

    .line 7
    .line 8
    iput p2, p0, Lk90;->d:F

    .line 9
    .line 10
    add-float/2addr p2, p3

    .line 11
    const/high16 p1, 0x43b40000    # 360.0f

    .line 12
    .line 13
    rem-float/2addr p2, p1

    .line 14
    iput p2, p0, Lk90;->e:F

    .line 15
    .line 16
    iget-object p1, p0, Lk90;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lk90;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
