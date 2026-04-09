.class final LBe/M$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/M$a;->c(FFLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:LQ/z;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:F

.field final synthetic f:Lmh/p;

.field final synthetic g:Lmh/q;


# direct methods
.method constructor <init>(Lmh/q;LQ/z;ZZFLmh/p;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LBe/M$a$a;->a:Lmh/q;

    iput-object p2, p0, LBe/M$a$a;->b:LQ/z;

    iput-boolean p3, p0, LBe/M$a$a;->c:Z

    iput-boolean p4, p0, LBe/M$a$a;->d:Z

    iput p5, p0, LBe/M$a$a;->e:F

    iput-object p6, p0, LBe/M$a$a;->f:Lmh/p;

    iput-object p7, p0, LBe/M$a$a;->g:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    const-string v1, "$this$UiContentCard"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {v12, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.UiCardCollapsible.<anonymous>.<anonymous>.<anonymous> (TopScrollCollapsibleContainer.kt:90)"

    const v4, -0x227aaff

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LBe/M$a$a;->a:Lmh/q;

    and-int/lit8 v13, v1, 0xe

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v11, v12, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LBe/M$a$a;->e:F

    iget-object v3, v0, LBe/M$a$a;->b:LQ/z;

    check-cast v1, LY0/d;

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    invoke-interface {v3}, LQ/z;->getState()LQ/A;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LQ/A;->d()F

    move-result v3

    goto :goto_3

    :cond_5
    move v3, v4

    :goto_3
    add-float/2addr v2, v3

    invoke-interface {v1, v2}, LY0/d;->N0(F)F

    move-result v1

    const/4 v14, 0x1

    int-to-float v2, v14

    iget-object v3, v0, LBe/M$a$a;->b:LQ/z;

    if-eqz v3, :cond_6

    invoke-interface {v3}, LQ/z;->getState()LQ/A;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, LQ/A;->b()F

    move-result v3

    goto :goto_4

    :cond_6
    const/high16 v3, 0x3f800000    # 1.0f

    :goto_4
    sub-float/2addr v2, v3

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v1, 0x0

    const/4 v5, 0x3

    invoke-static {v1, v4, v5, v1}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v6

    invoke-static {v1, v4, v5, v1}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    iget-boolean v4, v0, LBe/M$a$a;->c:Z

    new-instance v1, LBe/M$a$a$a;

    iget-object v7, v0, LBe/M$a$a;->f:Lmh/p;

    invoke-direct {v1, v2, v7}, LBe/M$a$a$a;-><init>(FLmh/p;)V

    const v2, 0x4cfbbfd9    # 1.3198919E8f

    const/16 v15, 0x36

    invoke-static {v2, v14, v1, v12, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v1, 0x186c00

    or-int v9, v13, v1

    const/16 v10, 0x10

    const/4 v8, 0x0

    move-object/from16 v1, p1

    move v2, v4

    move-object v4, v6

    move-object v6, v8

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    iget-boolean v2, v0, LBe/M$a$a;->d:Z

    new-instance v1, LBe/M$a$a$b;

    iget-object v3, v0, LBe/M$a$a;->g:Lmh/q;

    invoke-direct {v1, v3, v11}, LBe/M$a$a$b;-><init>(Lmh/q;Lz/j;)V

    const v3, 0x8f56f50

    invoke-static {v3, v14, v1, v12, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/high16 v1, 0x180000

    or-int v9, v13, v1

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LBe/M$a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
