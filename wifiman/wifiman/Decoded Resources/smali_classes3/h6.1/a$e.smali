.class final Lh6/a$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh6/a;->B(Le6/a;Lh6/a$a;Ljava/util/List;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/a$e$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lh6/a$a;

.field final synthetic b:Le6/a;

.field final synthetic c:Lh6/a;


# direct methods
.method constructor <init>(Lh6/a$a;Le6/a;Lh6/a;)V
    .locals 0

    iput-object p1, p0, Lh6/a$e;->a:Lh6/a$a;

    iput-object p2, p0, Lh6/a$e;->b:Le6/a;

    iput-object p3, p0, Lh6/a$e;->c:Lh6/a;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILx6/a;FF)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p4

    const-string/jumbo v2, "chartEntry"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lh6/a$e;->a:Lh6/a$a;

    invoke-virtual {v2}, Lh6/a$a;->k()Lm6/a;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lh6/a$e;->a:Lh6/a$a;

    iget-object v4, v0, Lh6/a$e;->b:Le6/a;

    move/from16 v8, p3

    invoke-virtual {v2, v4, v8, v1}, Lh6/a$a;->c(Lu6/b;FF)V

    goto :goto_0

    :cond_0
    move/from16 v8, p3

    :goto_0
    iget-object v2, v0, Lh6/a$e;->a:Lh6/a$a;

    invoke-virtual {v2}, Lh6/a$a;->d()Lt6/b;

    move-result-object v2

    iget-object v4, v0, Lh6/a$e;->c:Lh6/a;

    invoke-virtual {v4}, Lh6/a;->I()Lh6/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lh6/a$b;->getDataLabelsToSkip$core_release()I

    move-result v4

    move/from16 v5, p1

    if-gt v4, v5, :cond_1

    :goto_1
    move-object v5, v2

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    if-eqz v5, :cond_6

    iget-object v6, v0, Lh6/a$e;->b:Le6/a;

    iget-object v2, v0, Lh6/a$e;->a:Lh6/a$a;

    iget-object v4, v0, Lh6/a$e;->c:Lh6/a;

    invoke-virtual {v2}, Lh6/a$a;->j()F

    move-result v7

    invoke-virtual {v2}, Lh6/a$a;->k()Lm6/a;

    move-result-object v9

    const/16 v17, 0x0

    if-eqz v9, :cond_2

    invoke-virtual {v2}, Lh6/a$a;->m()F

    move-result v9

    goto :goto_3

    :cond_2
    move/from16 v9, v17

    :goto_3
    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/4 v15, 0x2

    int-to-float v9, v15

    div-float/2addr v7, v9

    invoke-interface {v6, v7}, Lu6/e;->g(F)F

    move-result v7

    invoke-virtual {v2}, Lh6/a$a;->f()Lz6/c;

    move-result-object v9

    invoke-interface/range {p2 .. p2}, Lx6/a;->b()F

    move-result v3

    invoke-interface {v6}, Lu6/e;->c()Lk6/c;

    move-result-object v10

    invoke-virtual {v4}, Lh6/a;->K()LY5/c$b;

    move-result-object v11

    invoke-virtual {v10, v11}, Lk6/c;->a(LY5/c$b;)Lk6/d;

    move-result-object v10

    invoke-interface {v9, v3, v10}, Lz6/c;->a(FLk6/b;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2}, Lh6/a$a;->g()Lt6/c;

    move-result-object v14

    invoke-virtual {v4}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v4

    invoke-interface {v6}, Le6/a;->i()Lj6/b;

    move-result-object v9

    invoke-interface {v9}, Lj6/b;->a()F

    move-result v9

    invoke-interface {v6, v9}, Lu6/e;->g(F)F

    move-result v9

    float-to-int v12, v9

    invoke-virtual {v2}, Lh6/a$a;->e()F

    move-result v16

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-object v9, v5

    move-object v10, v6

    move-object v11, v3

    move-object/from16 v20, v14

    move/from16 v14, v16

    move/from16 v15, v18

    move-object/from16 v16, v19

    invoke-static/range {v9 .. v16}, Lt6/b;->g(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IIFILjava/lang/Object;)F

    move-result v9

    move-object/from16 v10, v20

    invoke-static {v10, v4, v7, v9, v1}, Lt6/d;->a(Lt6/c;Landroid/graphics/RectF;FFF)Lt6/c;

    move-result-object v11

    sget-object v4, Lh6/a$e$a;->a:[I

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v4, v4, v9

    const/4 v9, 0x1

    if-eq v4, v9, :cond_4

    const/4 v9, 0x2

    if-eq v4, v9, :cond_5

    const/4 v9, 0x3

    if-ne v4, v9, :cond_3

    move/from16 v17, v7

    goto :goto_4

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_4
    neg-float v4, v7

    move/from16 v17, v4

    :cond_5
    :goto_4
    add-float v9, v1, v17

    invoke-interface {v6}, Le6/a;->i()Lj6/b;

    move-result-object v1

    invoke-interface {v1}, Lj6/b;->a()F

    move-result v1

    invoke-interface {v6, v1}, Lu6/e;->g(F)F

    move-result v1

    float-to-int v12, v1

    invoke-virtual {v2}, Lh6/a$a;->e()F

    move-result v14

    const/16 v15, 0x90

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object v7, v3

    move/from16 v8, p3

    invoke-static/range {v5 .. v16}, Lt6/b;->d(Lt6/b;Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIFILjava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lx6/a;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lh6/a$e;->a(ILx6/a;FF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
