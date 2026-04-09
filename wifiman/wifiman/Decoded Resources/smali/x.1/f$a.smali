.class public final Lx/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/f;->a(LC/C;LC/A;Lmh/q;)Lx/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;

.field final synthetic b:Lmh/q;

.field final synthetic c:LC/A;


# direct methods
.method constructor <init>(LC/C;Lmh/q;LC/A;)V
    .locals 0

    iput-object p1, p0, Lx/f$a;->a:LC/C;

    iput-object p2, p0, Lx/f$a;->b:Lmh/q;

    iput-object p3, p0, Lx/f$a;->c:LC/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final e(Lx/j;)LYg/s;
    .locals 21

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lx/f$a;->c()LC/n;

    move-result-object v1

    invoke-interface {v1}, LC/n;->h()Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, Lx/f$a;->a:LC/C;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/high16 v4, -0x800000    # Float.NEGATIVE_INFINITY

    const/high16 v5, 0x7f800000    # Float.POSITIVE_INFINITY

    const/4 v6, 0x0

    move v8, v4

    move v9, v5

    move v7, v6

    :goto_0
    const/4 v10, 0x0

    if-ge v7, v3, :cond_2

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LC/f;

    invoke-virtual/range {p0 .. p0}, Lx/f$a;->c()LC/n;

    move-result-object v12

    invoke-static {v12}, LC/o;->a(LC/n;)I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lx/f$a;->c()LC/n;

    move-result-object v12

    invoke-interface {v12}, LC/n;->f()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lx/f$a;->c()LC/n;

    move-result-object v12

    invoke-interface {v12}, LC/n;->c()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lx/f$a;->c()LC/n;

    move-result-object v12

    invoke-interface {v12}, LC/n;->i()I

    move-result v16

    invoke-interface {v11}, LC/f;->b()I

    move-result v17

    invoke-interface {v11}, LC/f;->getIndex()I

    move-result v18

    invoke-virtual {v2}, LC/C;->F()I

    move-result v20

    move-object/from16 v19, p1

    invoke-static/range {v13 .. v20}, Lx/k;->a(IIIIIILx/j;I)F

    move-result v11

    cmpg-float v12, v11, v10

    if-gtz v12, :cond_0

    cmpl-float v12, v11, v8

    if-lez v12, :cond_0

    move v8, v11

    :cond_0
    cmpl-float v10, v11, v10

    if-ltz v10, :cond_1

    cmpg-float v10, v11, v9

    if-gez v10, :cond_1

    move v9, v11

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    cmpg-float v1, v8, v4

    if-nez v1, :cond_3

    move v8, v9

    :cond_3
    cmpg-float v1, v9, v5

    if-nez v1, :cond_4

    move v9, v8

    :cond_4
    iget-object v1, v0, Lx/f$a;->a:LC/C;

    invoke-static {v1}, Lx/f;->b(LC/C;)F

    move-result v1

    cmpg-float v1, v1, v10

    if-nez v1, :cond_5

    const/4 v6, 0x1

    :cond_5
    iget-object v1, v0, Lx/f$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->e()Z

    move-result v1

    if-nez v1, :cond_7

    if-nez v6, :cond_6

    iget-object v1, v0, Lx/f$a;->a:LC/C;

    invoke-static {v1}, Lx/f;->c(LC/C;)Z

    move-result v1

    if-eqz v1, :cond_6

    move v8, v10

    move v9, v8

    goto :goto_1

    :cond_6
    move v9, v10

    :cond_7
    :goto_1
    iget-object v1, v0, Lx/f$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->d()Z

    move-result v1

    if-nez v1, :cond_8

    if-nez v6, :cond_9

    iget-object v1, v0, Lx/f$a;->a:LC/C;

    invoke-static {v1}, Lx/f;->c(LC/C;)Z

    move-result v1

    if-nez v1, :cond_9

    move v9, v10

    goto :goto_2

    :cond_8
    move v10, v8

    :cond_9
    :goto_2
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public a(FF)F
    .locals 9

    iget-object v0, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->G()I

    move-result v0

    iget-object v1, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->I()I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    cmpg-float v1, p1, v1

    if-gez v1, :cond_1

    iget-object v1, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->y()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v1}, LC/C;->y()I

    move-result v1

    :goto_0
    int-to-float v2, v0

    div-float/2addr p2, v2

    float-to-int p2, p2

    add-int/2addr p2, v1

    iget-object v2, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->F()I

    move-result v2

    const/4 v8, 0x0

    invoke-static {p2, v8, v2}, Lsh/m;->k(III)I

    move-result v4

    iget-object v2, p0, Lx/f$a;->c:LC/A;

    iget-object p2, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {p2}, LC/C;->G()I

    move-result v6

    iget-object p2, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {p2}, LC/C;->I()I

    move-result v7

    move v3, v1

    move v5, p1

    invoke-interface/range {v2 .. v7}, LC/A;->a(IIFII)I

    move-result p2

    iget-object v2, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v2}, LC/C;->F()I

    move-result v2

    invoke-static {p2, v8, v2}, Lsh/m;->k(III)I

    move-result p2

    sub-int/2addr p2, v1

    mul-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    sub-int/2addr p2, v0

    invoke-static {p2, v8}, Lsh/m;->d(II)I

    move-result p2

    if-nez p2, :cond_2

    int-to-float p1, p2

    goto :goto_1

    :cond_2
    int-to-float p2, p2

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    mul-float/2addr p1, p2

    :goto_1
    return p1
.end method

.method public b(F)F
    .locals 5

    iget-object v0, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->l()Lx/j;

    move-result-object v0

    invoke-direct {p0, v0}, Lx/f$a;->e(Lx/j;)LYg/s;

    move-result-object v0

    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v2, p0, Lx/f$a;->b:Lmh/q;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v2, p1, v3, v4}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    cmpg-float v2, p1, v1

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v2, p1, v0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float v2, p1, v3

    if-nez v2, :cond_3

    :goto_0
    invoke-virtual {p0, p1}, Lx/f$a;->d(F)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move p1, v3

    :goto_1
    return p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Final Snapping Offset Should Be one of "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " or 0.0"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()LC/n;
    .locals 1

    iget-object v0, p0, Lx/f$a;->a:LC/C;

    invoke-virtual {v0}, LC/C;->C()LC/n;

    move-result-object v0

    return-object v0
.end method

.method public final d(F)Z
    .locals 1

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
