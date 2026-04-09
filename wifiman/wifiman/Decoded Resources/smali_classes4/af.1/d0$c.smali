.class final Laf/d0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/d0;->u(Landroidx/compose/ui/e;Laf/O$a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;)V
    .locals 0

    iput-object p1, p0, Laf/d0$c;->a:Landroidx/compose/ui/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Laf/O$a;LT/l;I)V
    .locals 27

    move-object/from16 v0, p2

    move-object/from16 v15, p3

    const-string v1, "$this$AnimatedContent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "targetState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speed.component.Rating.<anonymous> (SpeedTabSpeedFactorCardUi.kt:247)"

    const v3, 0x7261c05d

    move/from16 v4, p4

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of v1, v0, Laf/O$a$a;

    if-eqz v1, :cond_1

    const v0, -0x6a2f9c9e

    invoke-interface {v15, v0}, LT/l;->U(I)V

    sget-object v0, LPe/a;->a:LPe/a;

    invoke-virtual {v0}, LPe/a;->h()Ls9/b;

    move-result-object v0

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v15, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->c()Lma/a$c;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$c;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v6}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    goto/16 :goto_1

    :cond_1
    instance-of v1, v0, Laf/O$a$b;

    if-eqz v1, :cond_7

    const v1, -0x6a2c5152

    invoke-interface {v15, v1}, LT/l;->U(I)V

    move-object/from16 v13, p0

    iget-object v1, v13, Laf/d0$c;->a:Landroidx/compose/ui/e;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->f()Lz/c$e;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v2, v15, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v15, v3}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_2

    invoke-static {}, LT/j;->c()V

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_3
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_0
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v2, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v7, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_5
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v7, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->D1:I

    check-cast v0, Laf/O$a$b;

    invoke-virtual {v0}, Laf/O$a$b;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    invoke-static {v1, v15, v3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v0

    sget-object v14, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v14, v15, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->a()LL0/U;

    move-result-object v20

    invoke-virtual {v14, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->b()J

    move-result-wide v2

    const/16 v23, 0x0

    const v24, 0xfffa

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    move/from16 v25, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v26, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, p3

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    move-object/from16 v7, p3

    invoke-static {v1, v7, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->v()Ls9/b;

    move-result-object v1

    const/16 v2, 0x14

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    move/from16 v3, v25

    move-object/from16 v0, v26

    invoke-virtual {v0, v7, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->c()Lma/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$c;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/16 v5, 0x30

    const/4 v6, 0x4

    const/4 v4, 0x0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object/from16 v4, p3

    invoke-static/range {v0 .. v6}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-void

    :cond_7
    move-object v7, v15

    const v0, 0x46e5a9b8

    invoke-interface {v7, v0}, LT/l;->U(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Laf/O$a;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Laf/d0$c;->a(Lq/b;Laf/O$a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
