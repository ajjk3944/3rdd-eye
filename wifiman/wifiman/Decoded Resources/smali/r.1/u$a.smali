.class public final Lr/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/u$a$a;
    }
.end annotation


# static fields
.field public static final s:Lr/u$a$a;

.field public static final t:I

.field private static u:[F


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private g:F

.field private h:F

.field private i:F

.field private final j:[F

.field private final k:F

.field private final l:F

.field private final m:F

.field private final n:F

.field private final o:F

.field private final p:F

.field private final q:Z

.field private final r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/u$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/u$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr/u$a;->s:Lr/u$a$a;

    const/16 v0, 0x8

    sput v0, Lr/u$a;->t:I

    return-void
.end method

.method public constructor <init>(IFFFFFF)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lr/u$a;->a:F

    iput p3, p0, Lr/u$a;->b:F

    iput p4, p0, Lr/u$a;->c:F

    iput p5, p0, Lr/u$a;->d:F

    iput p6, p0, Lr/u$a;->e:F

    iput p7, p0, Lr/u$a;->f:F

    sub-float v0, p6, p4

    sub-float v1, p7, p5

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_2

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-eq p1, v4, :cond_3

    const/4 v4, 0x5

    if-eq p1, v4, :cond_1

    :cond_0
    move v4, v2

    goto :goto_1

    :cond_1
    cmpg-float v4, v1, v5

    if-gez v4, :cond_0

    :cond_2
    :goto_0
    move v4, v3

    goto :goto_1

    :cond_3
    cmpl-float v4, v1, v5

    if-lez v4, :cond_0

    goto :goto_0

    :goto_1
    iput-boolean v4, p0, Lr/u$a;->q:Z

    int-to-float v5, v3

    sub-float v6, p3, p2

    div-float/2addr v5, v6

    iput v5, p0, Lr/u$a;->k:F

    const/4 v6, 0x3

    if-ne v6, p1, :cond_4

    move v2, v3

    :cond_4
    const/16 p1, 0x65

    if-nez v2, :cond_a

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const v7, 0x3a83126f    # 0.001f

    cmpg-float v6, v6, v7

    if-ltz v6, :cond_a

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v7

    if-gez v6, :cond_5

    goto :goto_6

    :cond_5
    new-array p1, p1, [F

    iput-object p1, p0, Lr/u$a;->j:[F

    const/4 p1, -0x1

    if-eqz v4, :cond_6

    move p2, p1

    goto :goto_2

    :cond_6
    move p2, v3

    :goto_2
    int-to-float p2, p2

    mul-float/2addr v0, p2

    iput v0, p0, Lr/u$a;->l:F

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    move v3, p1

    :goto_3
    int-to-float p1, v3

    mul-float/2addr v1, p1

    iput v1, p0, Lr/u$a;->m:F

    if-eqz v4, :cond_8

    move p1, p6

    goto :goto_4

    :cond_8
    move p1, p4

    :goto_4
    iput p1, p0, Lr/u$a;->n:F

    if-eqz v4, :cond_9

    move p1, p5

    goto :goto_5

    :cond_9
    move p1, p7

    :goto_5
    iput p1, p0, Lr/u$a;->o:F

    invoke-direct {p0, p4, p5, p6, p7}, Lr/u$a;->c(FFFF)V

    iget p1, p0, Lr/u$a;->g:F

    mul-float/2addr p1, v5

    iput p1, p0, Lr/u$a;->p:F

    move v3, v2

    goto :goto_7

    :cond_a
    :goto_6
    float-to-double p4, v1

    float-to-double p6, v0

    invoke-static {p4, p5, p6, p7}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p4

    double-to-float p4, p4

    iput p4, p0, Lr/u$a;->g:F

    mul-float/2addr p4, v5

    iput p4, p0, Lr/u$a;->p:F

    sub-float p4, p3, p2

    div-float/2addr v0, p4

    iput v0, p0, Lr/u$a;->n:F

    sub-float/2addr p3, p2

    div-float/2addr v1, p3

    iput v1, p0, Lr/u$a;->o:F

    new-array p1, p1, [F

    iput-object p1, p0, Lr/u$a;->j:[F

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lr/u$a;->l:F

    iput p1, p0, Lr/u$a;->m:F

    :goto_7
    iput-boolean v3, p0, Lr/u$a;->r:Z

    return-void
.end method

.method public static final synthetic a()[F
    .locals 1

    sget-object v0, Lr/u$a;->u:[F

    return-object v0
.end method

.method public static final synthetic b([F)V
    .locals 0

    sput-object p0, Lr/u$a;->u:[F

    return-void
.end method

.method private final c(FFFF)V
    .locals 11

    sub-float/2addr p3, p1

    sub-float/2addr p2, p4

    sget-object p1, Lr/u$a;->s:Lr/u$a$a;

    invoke-static {p1}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object p1

    array-length p1, p1

    const/4 p4, 0x0

    const/4 v0, 0x0

    move v2, p4

    move v3, v2

    move v4, v3

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_1

    const-wide v5, 0x4056800000000000L    # 90.0

    int-to-double v7, v1

    mul-double/2addr v7, v5

    sget-object v5, Lr/u$a;->s:Lr/u$a$a;

    invoke-static {v5}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object v6

    array-length v6, v6

    add-int/lit8 v6, v6, -0x1

    int-to-double v9, v6

    div-double/2addr v7, v9

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    double-to-float v8, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    double-to-float v6, v6

    mul-float/2addr v8, p3

    mul-float/2addr v6, p2

    if-lez v1, :cond_0

    sub-float v3, v8, v3

    float-to-double v9, v3

    sub-float v3, v6, v4

    float-to-double v3, v3

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v3, v3

    add-float/2addr v2, v3

    invoke-static {v5}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object v3

    aput v2, v3, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move v4, v6

    move v3, v8

    goto :goto_0

    :cond_1
    iput v2, p0, Lr/u$a;->g:F

    sget-object p1, Lr/u$a;->s:Lr/u$a$a;

    invoke-static {p1}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object p1

    array-length p1, p1

    move p2, v0

    :goto_1
    if-ge p2, p1, :cond_2

    sget-object p3, Lr/u$a;->s:Lr/u$a$a;

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object p3

    aget v1, p3, p2

    div-float/2addr v1, v2

    aput v1, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lr/u$a;->j:[F

    array-length p1, p1

    :goto_2
    if-ge v0, p1, :cond_5

    int-to-float p2, v0

    iget-object p3, p0, Lr/u$a;->j:[F

    array-length p3, p3

    add-int/lit8 p3, p3, -0x1

    int-to-float p3, p3

    div-float/2addr p2, p3

    sget-object p3, Lr/u$a;->s:Lr/u$a$a;

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v2, p2

    invoke-static/range {v1 .. v6}, LZg/n;->g([FFIIILjava/lang/Object;)I

    move-result v1

    if-ltz v1, :cond_3

    iget-object p2, p0, Lr/u$a;->j:[F

    int-to-float v1, v1

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object p3

    array-length p3, p3

    add-int/lit8 p3, p3, -0x1

    int-to-float p3, p3

    div-float/2addr v1, p3

    aput v1, p2, v0

    goto :goto_3

    :cond_3
    const/4 v2, -0x1

    if-ne v1, v2, :cond_4

    iget-object p2, p0, Lr/u$a;->j:[F

    aput p4, p2, v0

    goto :goto_3

    :cond_4
    neg-int v1, v1

    add-int/lit8 v2, v1, -0x2

    add-int/lit8 v1, v1, -0x1

    int-to-float v3, v2

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object v4

    aget v4, v4, v2

    sub-float/2addr p2, v4

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object v4

    aget v1, v4, v1

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object v4

    aget v2, v4, v2

    sub-float/2addr v1, v2

    div-float/2addr p2, v1

    add-float/2addr v3, p2

    invoke-static {p3}, Lr/u$a$a;->a(Lr/u$a$a;)[F

    move-result-object p2

    array-length p2, p2

    add-int/lit8 p2, p2, -0x1

    int-to-float p2, p2

    div-float/2addr v3, p2

    iget-object p2, p0, Lr/u$a;->j:[F

    aput v3, p2, v0

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method private final o(F)F
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    return v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_1

    return v0

    :cond_1
    iget-object v0, p0, Lr/u$a;->j:[F

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    mul-float/2addr p1, v1

    float-to-int v1, p1

    int-to-float v2, v1

    sub-float/2addr p1, v2

    aget v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    aget v0, v0, v1

    sub-float/2addr v0, v2

    mul-float/2addr p1, v0

    add-float/2addr v2, p1

    return v2
.end method


# virtual methods
.method public final d()F
    .locals 7

    iget v0, p0, Lr/u$a;->l:F

    iget v1, p0, Lr/u$a;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lr/u$a;->m:F

    neg-float v1, v1

    iget v2, p0, Lr/u$a;->h:F

    mul-float/2addr v1, v2

    iget v2, p0, Lr/u$a;->p:F

    float-to-double v3, v0

    float-to-double v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v1, v3

    div-float/2addr v2, v1

    iget-boolean v1, p0, Lr/u$a;->q:Z

    if-eqz v1, :cond_0

    neg-float v0, v0

    :cond_0
    mul-float/2addr v0, v2

    return v0
.end method

.method public final e()F
    .locals 7

    iget v0, p0, Lr/u$a;->l:F

    iget v1, p0, Lr/u$a;->i:F

    mul-float/2addr v0, v1

    iget v1, p0, Lr/u$a;->m:F

    neg-float v1, v1

    iget v2, p0, Lr/u$a;->h:F

    mul-float/2addr v1, v2

    iget v2, p0, Lr/u$a;->p:F

    float-to-double v3, v0

    float-to-double v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v0, v3

    div-float/2addr v2, v0

    iget-boolean v0, p0, Lr/u$a;->q:Z

    if-eqz v0, :cond_0

    neg-float v0, v1

    mul-float/2addr v0, v2

    goto :goto_0

    :cond_0
    mul-float v0, v1, v2

    :goto_0
    return v0
.end method

.method public final f()F
    .locals 3

    iget v0, p0, Lr/u$a;->n:F

    iget v1, p0, Lr/u$a;->l:F

    iget v2, p0, Lr/u$a;->h:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method public final g()F
    .locals 3

    iget v0, p0, Lr/u$a;->o:F

    iget v1, p0, Lr/u$a;->m:F

    iget v2, p0, Lr/u$a;->i:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    return v0
.end method

.method public final h()F
    .locals 1

    iget v0, p0, Lr/u$a;->n:F

    return v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lr/u$a;->o:F

    return v0
.end method

.method public final j(F)F
    .locals 2

    iget v0, p0, Lr/u$a;->a:F

    sub-float/2addr p1, v0

    iget v0, p0, Lr/u$a;->k:F

    mul-float/2addr p1, v0

    iget v0, p0, Lr/u$a;->c:F

    iget v1, p0, Lr/u$a;->e:F

    sub-float/2addr v1, v0

    mul-float/2addr p1, v1

    add-float/2addr v0, p1

    return v0
.end method

.method public final k(F)F
    .locals 2

    iget v0, p0, Lr/u$a;->a:F

    sub-float/2addr p1, v0

    iget v0, p0, Lr/u$a;->k:F

    mul-float/2addr p1, v0

    iget v0, p0, Lr/u$a;->d:F

    iget v1, p0, Lr/u$a;->f:F

    sub-float/2addr v1, v0

    mul-float/2addr p1, v1

    add-float/2addr v0, p1

    return v0
.end method

.method public final l()F
    .locals 1

    iget v0, p0, Lr/u$a;->a:F

    return v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lr/u$a;->b:F

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lr/u$a;->r:Z

    return v0
.end method

.method public final p(F)V
    .locals 4

    iget-boolean v0, p0, Lr/u$a;->q:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lr/u$a;->b:F

    sub-float/2addr v0, p1

    goto :goto_0

    :cond_0
    iget v0, p0, Lr/u$a;->a:F

    sub-float v0, p1, v0

    :goto_0
    iget p1, p0, Lr/u$a;->k:F

    mul-float/2addr v0, p1

    const p1, 0x3fc90fdb

    invoke-direct {p0, v0}, Lr/u$a;->o(F)F

    move-result v0

    mul-float/2addr v0, p1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float p1, v2

    iput p1, p0, Lr/u$a;->h:F

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lr/u$a;->i:F

    return-void
.end method
