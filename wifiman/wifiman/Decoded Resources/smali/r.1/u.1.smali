.class public final Lr/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/u$a;,
        Lr/u$b;
    }
.end annotation


# static fields
.field public static final c:Lr/u$b;

.field public static final d:I


# instance fields
.field private final a:[[Lr/u$a;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/u$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/u$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr/u;->c:Lr/u$b;

    const/16 v0, 0x8

    sput v0, Lr/u;->d:I

    return-void
.end method

.method public constructor <init>([I[F[[F)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lr/u;->b:Z

    array-length v3, v1

    sub-int/2addr v3, v2

    new-array v4, v3, [[Lr/u$a;

    const/4 v5, 0x0

    move v7, v2

    move v8, v7

    move v6, v5

    :goto_0
    if-ge v6, v3, :cond_5

    aget v9, p1, v6

    const/4 v10, 0x3

    const/4 v11, 0x2

    if-eqz v9, :cond_0

    if-eq v9, v2, :cond_3

    if-eq v9, v11, :cond_2

    if-eq v9, v10, :cond_1

    const/4 v10, 0x4

    if-eq v9, v10, :cond_0

    const/4 v10, 0x5

    if-eq v9, v10, :cond_0

    goto :goto_3

    :cond_0
    move v8, v10

    goto :goto_3

    :cond_1
    if-ne v7, v2, :cond_3

    goto :goto_2

    :goto_1
    move v8, v7

    goto :goto_3

    :cond_2
    :goto_2
    move v7, v11

    goto :goto_1

    :cond_3
    move v7, v2

    goto :goto_1

    :goto_3
    aget-object v9, p3, v6

    array-length v10, v9

    div-int/2addr v10, v11

    array-length v9, v9

    rem-int/2addr v9, v11

    add-int/2addr v10, v9

    new-array v9, v10, [Lr/u$a;

    move v11, v5

    :goto_4
    if-ge v11, v10, :cond_4

    mul-int/lit8 v12, v11, 0x2

    new-instance v20, Lr/u$a;

    aget v14, v1, v6

    add-int/lit8 v13, v6, 0x1

    aget v15, v1, v13

    aget-object v16, p3, v6

    aget v17, v16, v12

    add-int/lit8 v18, v12, 0x1

    aget v19, v16, v18

    aget-object v13, p3, v13

    aget v21, v13, v12

    aget v22, v13, v18

    move-object/from16 v12, v20

    move v13, v8

    move/from16 v16, v17

    move/from16 v17, v19

    move/from16 v18, v21

    move/from16 v19, v22

    invoke-direct/range {v12 .. v19}, Lr/u$a;-><init>(IFFFFFF)V

    aput-object v20, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_4
    aput-object v9, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    iput-object v4, v0, Lr/u;->a:[[Lr/u$a;

    return-void
.end method


# virtual methods
.method public final a(F[F)V
    .locals 8

    iget-boolean v0, p0, Lr/u;->b:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v0, v0, v2

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->l()F

    move-result v0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v3, v0

    sub-int/2addr v3, v1

    aget-object v0, v0, v3

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->m()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_6

    :cond_0
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v3, v0

    sub-int/2addr v3, v1

    aget-object v0, v0, v3

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->m()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v3, v0

    sub-int/2addr v3, v1

    array-length v4, v0

    sub-int/2addr v4, v1

    aget-object v0, v0, v4

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->m()F

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v0, v0, v2

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->l()F

    move-result v0

    move v3, v2

    :goto_0
    sub-float/2addr p1, v0

    move v1, v2

    :goto_1
    array-length v4, p2

    if-ge v2, v4, :cond_3

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v1

    invoke-virtual {v4}, Lr/u$a;->n()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v1

    invoke-virtual {v4, v0}, Lr/u$a;->j(F)F

    move-result v4

    iget-object v5, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v5, v5, v3

    aget-object v5, v5, v1

    invoke-virtual {v5}, Lr/u$a;->h()F

    move-result v5

    mul-float/2addr v5, p1

    add-float/2addr v4, v5

    aput v4, p2, v2

    add-int/lit8 v4, v2, 0x1

    iget-object v5, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v5, v5, v3

    aget-object v5, v5, v1

    invoke-virtual {v5, v0}, Lr/u$a;->k(F)F

    move-result v5

    iget-object v6, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v6, v6, v3

    aget-object v6, v6, v1

    invoke-virtual {v6}, Lr/u$a;->i()F

    move-result v6

    mul-float/2addr v6, p1

    add-float/2addr v5, v6

    aput v5, p2, v4

    goto :goto_2

    :cond_2
    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v1

    invoke-virtual {v4, v0}, Lr/u$a;->p(F)V

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v1

    invoke-virtual {v4}, Lr/u$a;->f()F

    move-result v4

    iget-object v5, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v5, v5, v3

    aget-object v5, v5, v1

    invoke-virtual {v5}, Lr/u$a;->d()F

    move-result v5

    mul-float/2addr v5, p1

    add-float/2addr v4, v5

    aput v4, p2, v2

    add-int/lit8 v4, v2, 0x1

    iget-object v5, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v5, v5, v3

    aget-object v5, v5, v1

    invoke-virtual {v5}, Lr/u$a;->g()F

    move-result v5

    iget-object v6, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v6, v6, v3

    aget-object v6, v6, v1

    invoke-virtual {v6}, Lr/u$a;->e()F

    move-result v6

    mul-float/2addr v6, p1

    add-float/2addr v5, v6

    aput v5, p2, v4

    :goto_2
    add-int/lit8 v2, v2, 0x2

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v0, v0, v2

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->l()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_5

    iget-object p1, p0, Lr/u;->a:[[Lr/u$a;

    aget-object p1, p1, v2

    aget-object p1, p1, v2

    invoke-virtual {p1}, Lr/u$a;->l()F

    move-result p1

    :cond_5
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v3, v0

    sub-int/2addr v3, v1

    aget-object v0, v0, v3

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lr/u$a;->m()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_6

    iget-object p1, p0, Lr/u;->a:[[Lr/u$a;

    array-length v0, p1

    sub-int/2addr v0, v1

    aget-object p1, p1, v0

    aget-object p1, p1, v2

    invoke-virtual {p1}, Lr/u$a;->m()F

    move-result p1

    :cond_6
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v0, v0

    move v3, v2

    move v4, v3

    :goto_3
    if-ge v3, v0, :cond_b

    move v5, v2

    move v6, v5

    :goto_4
    array-length v7, p2

    if-ge v5, v7, :cond_9

    iget-object v7, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-virtual {v7}, Lr/u$a;->m()F

    move-result v7

    cmpg-float v7, p1, v7

    if-gtz v7, :cond_8

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4}, Lr/u$a;->n()Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4, p1}, Lr/u$a;->j(F)F

    move-result v4

    aput v4, p2, v5

    add-int/lit8 v4, v5, 0x1

    iget-object v7, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-virtual {v7, p1}, Lr/u$a;->k(F)F

    move-result v7

    aput v7, p2, v4

    :goto_5
    move v4, v1

    goto :goto_6

    :cond_7
    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4, p1}, Lr/u$a;->p(F)V

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4}, Lr/u$a;->f()F

    move-result v4

    aput v4, p2, v5

    add-int/lit8 v4, v5, 0x1

    iget-object v7, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-virtual {v7}, Lr/u$a;->g()F

    move-result v7

    aput v7, p2, v4

    goto :goto_5

    :cond_8
    :goto_6
    add-int/lit8 v5, v5, 0x2

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_9
    if-eqz v4, :cond_a

    return-void

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_b
    return-void
.end method

.method public final b(F[F)V
    .locals 8

    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lr/u$a;->l()F

    move-result v0

    cmpg-float v0, p1, v0

    const/4 v2, 0x1

    if-gez v0, :cond_0

    iget-object p1, p0, Lr/u;->a:[[Lr/u$a;

    aget-object p1, p1, v1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lr/u$a;->l()F

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v3, v0

    sub-int/2addr v3, v2

    aget-object v0, v0, v3

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lr/u$a;->m()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    iget-object p1, p0, Lr/u;->a:[[Lr/u$a;

    array-length v0, p1

    sub-int/2addr v0, v2

    aget-object p1, p1, v0

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lr/u$a;->m()F

    move-result p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lr/u;->a:[[Lr/u$a;

    array-length v0, v0

    move v3, v1

    move v4, v3

    :goto_1
    if-ge v3, v0, :cond_6

    move v5, v1

    move v6, v5

    :goto_2
    array-length v7, p2

    if-ge v5, v7, :cond_4

    iget-object v7, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-virtual {v7}, Lr/u$a;->m()F

    move-result v7

    cmpg-float v7, p1, v7

    if-gtz v7, :cond_3

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4}, Lr/u$a;->n()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4}, Lr/u$a;->h()F

    move-result v4

    aput v4, p2, v5

    add-int/lit8 v4, v5, 0x1

    iget-object v7, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-virtual {v7}, Lr/u$a;->i()F

    move-result v7

    aput v7, p2, v4

    :goto_3
    move v4, v2

    goto :goto_4

    :cond_2
    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4, p1}, Lr/u$a;->p(F)V

    iget-object v4, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v4, v4, v3

    aget-object v4, v4, v6

    invoke-virtual {v4}, Lr/u$a;->d()F

    move-result v4

    aput v4, p2, v5

    add-int/lit8 v4, v5, 0x1

    iget-object v7, p0, Lr/u;->a:[[Lr/u$a;

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-virtual {v7}, Lr/u$a;->e()F

    move-result v7

    aput v7, p2, v4

    goto :goto_3

    :cond_3
    :goto_4
    add-int/lit8 v5, v5, 0x2

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_5

    return-void

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    return-void
.end method
