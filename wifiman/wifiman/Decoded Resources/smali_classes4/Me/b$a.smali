.class final LMe/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe/b;->b(Landroidx/compose/ui/e;FLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, LMe/b$a;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 26

    move-object/from16 v13, p1

    move/from16 v0, p2

    const/4 v1, 0x3

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.discovery.component.DiscoveryProgressContainer.<anonymous> (DiscoveryProgressContainer.kt:41)"

    const v4, 0x4f82b092

    invoke-static {v4, v0, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v2, 0x34

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/4 v3, 0x0

    const/4 v8, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v8, v4}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/16 v5, 0x10

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v2, v5, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v4, v4, v1, v4}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    sget-object v3, Lz/c;->a:Lz/c;

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v3, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    move-object/from16 v14, p0

    iget v4, v14, LMe/b$a;->a:F

    const/16 v5, 0x36

    invoke-static {v3, v2, v13, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v11, 0x0

    invoke-static {v13, v11}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v13, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v7, v2, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v7, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v7, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, v4, v1

    const/16 v2, 0x18

    if-gez v1, :cond_7

    const v1, -0x53a79c1a

    invoke-interface {v13, v1}, LT/l;->U(I)V

    int-to-float v1, v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    const/16 v6, 0xc00

    const/16 v7, 0x16

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "discovery progress"

    const/4 v5, 0x0

    move v0, v4

    move-object v4, v5

    move-object/from16 v5, p1

    invoke-static/range {v0 .. v7}, Lr/c;->d(FLr/i;FLjava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    int-to-float v1, v8

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v4

    const/16 v10, 0xc30

    const/16 v12, 0x34

    const-wide/16 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v9

    move-object/from16 v8, p1

    move v9, v10

    move v10, v12

    invoke-static/range {v0 .. v10}, LN/t0;->a(FLandroidx/compose/ui/e;JFJILT/l;II)V

    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->x0:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-static {v0, v13, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v13, v2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v21

    invoke-virtual {v1, v13, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->c()J

    move-result-wide v2

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v15

    const/16 v24, 0xc30

    const v25, 0x1d7fa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p1

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto/16 :goto_2

    :cond_7
    const v1, -0x539e2eb4

    move-object/from16 v13, p1

    invoke-interface {v13, v1}, LT/l;->U(I)V

    int-to-float v1, v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->o()Ls9/b;

    move-result-object v0

    invoke-static {v0, v13, v11}, Lta/c;->i(Ls9/a$b;LT/l;I)Lr0/d;

    move-result-object v0

    new-instance v1, Ls9/d$b;

    sget v8, Lm8/c;->w0:I

    invoke-direct {v1, v8}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v13, v11}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    sget-object v9, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v9, v13, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->d()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v3

    const/16 v6, 0x180

    const/4 v7, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v0 .. v7}, LN/a0;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V

    new-instance v0, Ls9/d$b;

    invoke-direct {v0, v8}, Ls9/d$b;-><init>(I)V

    invoke-static {v0, v13, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    invoke-virtual {v9, v13, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->f()LL0/U;

    move-result-object v21

    invoke-virtual {v9, v13, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->c()J

    move-result-wide v2

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v15

    const/16 v24, 0xc30

    const v25, 0x1d7fa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p1

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_2
    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LMe/b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
