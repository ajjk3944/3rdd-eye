.class final Lfa/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfa/i;->c(Lfa/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/d;


# direct methods
.method constructor <init>(Lz/d;)V
    .locals 0

    iput-object p1, p0, Lfa/i$b;->a:Lz/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lfa/e;LT/l;I)V
    .locals 29

    move-object/from16 v15, p3

    const-string v0, "$this$AnimatedContent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.sso.trusted.UiTrustedDeviceLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiTrustedDeviceLayout.kt:104)"

    const v2, -0x446b0edf

    move/from16 v3, p4

    invoke-static {v2, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_9

    const v0, -0x7839498f

    invoke-interface {v15, v0}, LT/l;->U(I)V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static {v10, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v14, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v14, v15, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->c()F

    move-result v1

    const/4 v2, 0x2

    invoke-static {v0, v1, v11, v2, v13}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    sget-object v8, Lz/c;->a:Lz/c;

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v8, v2}, Lz/c;->n(F)Lz/c$f;

    move-result-object v2

    const/16 v3, 0x36

    invoke-static {v2, v1, v15, v3}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v15, v7}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_0
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget v0, LP9/a;->e:I

    invoke-static {v0, v15, v7}, LH0/c;->c(ILT/l;I)Lr0/d;

    move-result-object v0

    const/16 v18, 0x30

    const/16 v19, 0x7c

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p3

    move-object/from16 v25, v8

    move/from16 v8, v18

    move/from16 v26, v9

    move/from16 v9, v19

    invoke-static/range {v0 .. v9}, Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {v10, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v2, v25

    invoke-virtual {v2, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v1, v2, v15, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v13, 0x0

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v4

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v5

    if-nez v5, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v15, v4}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_6
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_1
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v4

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v4, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v4, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v4}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v4, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    invoke-virtual/range {p2 .. p2}, Lfa/e;->b()Ljava/lang/String;

    move-result-object v0

    move/from16 v12, v26

    invoke-virtual {v14, v15, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->a()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->c()LL0/U;

    move-result-object v20

    invoke-virtual {v14, v15, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

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

    move/from16 v27, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v28, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, p3

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    sget v0, LP9/b;->V0:I

    move-object/from16 v15, p3

    const/4 v1, 0x0

    invoke-static {v0, v15, v1}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v0

    move/from16 v2, v27

    move-object/from16 v1, v28

    invoke-virtual {v1, v15, v2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v20

    invoke-virtual {v1, v15, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->b()J

    move-result-wide v2

    const/4 v1, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move/from16 v15, v16

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    move-object/from16 v11, p0

    goto :goto_2

    :cond_9
    const v0, -0x78230f9b

    move-object/from16 v10, p3

    invoke-interface {v10, v0}, LT/l;->U(I)V

    move-object/from16 v11, p0

    iget-object v0, v11, Lfa/i$b;->a:Lz/d;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->e()Lf0/c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v0 .. v9}, LN/t0;->b(Landroidx/compose/ui/e;JFJILT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lfa/e;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lfa/i$b;->a(Lq/b;Lfa/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
