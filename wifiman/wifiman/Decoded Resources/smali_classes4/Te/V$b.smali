.class public final LTe/V$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTe/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:F

.field private final b:F

.field private final c:Ljava/lang/String;

.field private final d:LTe/V$a;

.field public e:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFLjava/lang/String;LTe/V$a;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LTe/V$b;->a:F

    iput p2, p0, LTe/V$b;->b:F

    iput-object p3, p0, LTe/V$b;->c:Ljava/lang/String;

    iput-object p4, p0, LTe/V$b;->d:LTe/V$a;

    return-void
.end method


# virtual methods
.method public a(Le6/a;Landroid/graphics/RectF;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld6/a$a;->a(Ld6/a;Le6/a;Landroid/graphics/RectF;)V

    return-void
.end method

.method public b(Le6/a;Landroid/graphics/RectF;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v11, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "bounds"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lu6/e;->c()Lk6/c;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, Lk6/c;->b(Lk6/c;LY5/c$b;ILjava/lang/Object;)Lk6/d;

    move-result-object v2

    iget v3, v0, LTe/V$b;->a:F

    invoke-virtual {v2}, Lk6/d;->e()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {v2}, Lk6/d;->b()F

    move-result v4

    invoke-virtual {v2}, Lk6/d;->e()F

    move-result v5

    sub-float/2addr v4, v5

    div-float/2addr v3, v4

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v4

    mul-float v12, v3, v4

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v3

    iget v4, v0, LTe/V$b;->b:F

    invoke-virtual {v2}, Lk6/d;->c()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-virtual {v2}, Lk6/d;->a()F

    move-result v5

    invoke-virtual {v2}, Lk6/d;->c()F

    move-result v2

    sub-float/2addr v5, v2

    div-float/2addr v4, v5

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v2

    mul-float/2addr v4, v2

    sub-float/2addr v3, v4

    const/high16 v2, 0x41100000    # 9.0f

    invoke-interface {v11, v2}, Lu6/e;->m(F)F

    move-result v2

    add-float v13, v3, v2

    iget-object v2, v0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v2}, LTe/V$a;->e()Lo6/d;

    move-result-object v2

    const/high16 v14, 0x3f000000    # 0.5f

    invoke-interface {v11, v14}, Lu6/e;->b(F)F

    move-result v3

    sub-float v3, v12, v3

    invoke-interface {v11, v14}, Lu6/e;->b(F)F

    move-result v4

    add-float v5, v12, v4

    iget v4, v1, Landroid/graphics/RectF;->top:F

    iget v6, v1, Landroid/graphics/RectF;->bottom:F

    move-object v1, v2

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lo6/d;->b(Lu6/b;FFFF)V

    iget-object v1, v0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v1}, LTe/V$a;->a()Lo6/d;

    move-result-object v1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-interface {v11, v2}, Lu6/e;->b(F)F

    move-result v3

    sub-float v3, v12, v3

    invoke-interface {v11, v2}, Lu6/e;->b(F)F

    move-result v4

    add-float v5, v12, v4

    invoke-interface {v11, v2}, Lu6/e;->b(F)F

    move-result v4

    sub-float v4, v13, v4

    invoke-interface {v11, v2}, Lu6/e;->b(F)F

    move-result v2

    add-float v6, v13, v2

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lo6/d;->b(Lu6/b;FFFF)V

    iget-object v1, v0, LTe/V$b;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, v0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v1}, LTe/V$a;->b()Lt6/b;

    move-result-object v1

    iget-object v3, v0, LTe/V$b;->c:Ljava/lang/String;

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v10}, Lt6/b;->m(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IILandroid/graphics/RectF;ZFILjava/lang/Object;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {p0, v1}, LTe/V$b;->d(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    mul-float/2addr v1, v14

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v1, v7

    float-to-double v1, v1

    const/4 v3, 0x2

    int-to-double v4, v3

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    int-to-float v2, v3

    mul-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v8, v1

    iget-object v1, v0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v1}, LTe/V$a;->d()Lo6/d;

    move-result-object v1

    const/high16 v9, 0x40e00000    # 7.0f

    invoke-interface {v11, v9}, Lu6/e;->b(F)F

    move-result v2

    add-float v3, v12, v2

    invoke-interface {v11, v9}, Lu6/e;->b(F)F

    move-result v2

    add-float/2addr v2, v12

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    mul-float/2addr v4, v14

    add-float v5, v2, v4

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v7

    mul-float/2addr v2, v14

    sub-float v4, v13, v2

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v7

    mul-float/2addr v2, v14

    add-float v6, v13, v2

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lo6/d;->b(Lu6/b;FFFF)V

    iget-object v1, v0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v1}, LTe/V$a;->c()Lo6/d;

    move-result-object v1

    invoke-interface {v11, v9}, Lu6/e;->b(F)F

    move-result v2

    add-float/2addr v2, v12

    div-float/2addr v8, v7

    add-float v3, v2, v8

    invoke-interface {v11, v9}, Lu6/e;->b(F)F

    move-result v2

    add-float/2addr v2, v12

    add-float/2addr v2, v8

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    add-float/2addr v2, v4

    const/high16 v4, 0x41000000    # 8.0f

    invoke-interface {v11, v4}, Lu6/e;->b(F)F

    move-result v4

    add-float v5, v2, v4

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v7

    sub-float v2, v13, v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v11, v4}, Lu6/e;->b(F)F

    move-result v6

    sub-float v6, v2, v6

    invoke-virtual {p0}, LTe/V$b;->c()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    div-float/2addr v2, v7

    add-float/2addr v2, v13

    invoke-interface {v11, v4}, Lu6/e;->b(F)F

    move-result v4

    add-float v7, v2, v4

    move-object/from16 v2, p1

    move v4, v6

    move v6, v7

    invoke-virtual/range {v1 .. v6}, Lo6/d;->b(Lu6/b;FFFF)V

    iget-object v1, v0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v1}, LTe/V$a;->b()Lt6/b;

    move-result-object v1

    iget-object v3, v0, LTe/V$b;->c:Ljava/lang/String;

    sget-object v6, Lt6/a;->End:Lt6/a;

    sget-object v7, Lt6/c;->Center:Lt6/c;

    const/high16 v2, 0x41300000    # 11.0f

    invoke-interface {v11, v2}, Lu6/e;->b(F)F

    move-result v2

    add-float/2addr v12, v2

    add-float v4, v12, v8

    const/16 v12, 0x1c0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p1

    move v5, v13

    move v11, v12

    move-object v12, v14

    invoke-static/range {v1 .. v12}, Lt6/b;->d(Lt6/b;Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIFILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, LTe/V$b;->e:Landroid/graphics/RectF;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "textBounds"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Landroid/graphics/RectF;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LTe/V$b;->e:Landroid/graphics/RectF;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LTe/V$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LTe/V$b;

    iget v1, p0, LTe/V$b;->a:F

    iget v3, p1, LTe/V$b;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LTe/V$b;->b:F

    iget v3, p1, LTe/V$b;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LTe/V$b;->c:Ljava/lang/String;

    iget-object v3, p1, LTe/V$b;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LTe/V$b;->d:LTe/V$a;

    iget-object p1, p1, LTe/V$b;->d:LTe/V$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LTe/V$b;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LTe/V$b;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/V$b;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTe/V$b;->d:LTe/V$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, LTe/V$b;->a:F

    iget v1, p0, LTe/V$b;->b:F

    iget-object v2, p0, LTe/V$b;->c:Ljava/lang/String;

    iget-object v3, p0, LTe/V$b;->d:LTe/V$a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Marker(x="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", y="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", components="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
