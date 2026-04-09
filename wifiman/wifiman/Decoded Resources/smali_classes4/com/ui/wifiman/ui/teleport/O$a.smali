.class final Lcom/ui/wifiman/ui/teleport/O$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/O;->b(Lcom/ui/wifiman/ui/teleport/M;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/o;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/M;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/o;Lcom/ui/wifiman/ui/teleport/M;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/O$a;->a:Landroidx/compose/foundation/o;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/O$a;->b:Lcom/ui/wifiman/ui/teleport/M;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v4, "com.ui.wifiman.ui.teleport.TeleportVPNProfileUi.<anonymous> (TeleportVPNProfileUi.kt:35)"

    const v5, -0x1845ad91

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v2, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    iget-object v6, v0, Lcom/ui/wifiman/ui/teleport/O$a;->a:Landroidx/compose/foundation/o;

    iget-object v11, v0, Lcom/ui/wifiman/ui/teleport/O$a;->b:Lcom/ui/wifiman/ui/teleport/M;

    sget-object v22, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v22 .. v22}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v13

    const/4 v15, 0x6

    invoke-static {v5, v13, v12, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v14, 0x0

    invoke-static {v12, v14}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v12, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v23, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v12, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v3, v5, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v3, v15, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v3}, LT/l;->o()Z

    move-result v14

    if-nez v14, :cond_5

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    :cond_5
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v3, v14}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v3, v13, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v23 .. v23}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v3, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v5, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v5, v12, v15}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v13

    invoke-virtual {v13}, Lra/a;->a()Lra/b;

    move-result-object v13

    invoke-virtual {v13}, Lra/b;->a()Lra/b$a$a;

    move-result-object v13

    invoke-virtual {v13}, Lra/b$a$a;->c()F

    move-result v13

    const/4 v14, 0x2

    invoke-static {v3, v13, v8, v14, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v13, Ls9/d$b;

    sget v14, Lm8/c;->o4:I

    invoke-direct {v13, v14}, Ls9/d$b;-><init>(I)V

    const/4 v14, 0x0

    invoke-static {v3, v13, v12, v14, v14}, Lrf/z;->e(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v24

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v26

    invoke-virtual {v5, v12, v15}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v25

    invoke-virtual {v5, v12, v15}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v27

    const/16 v29, 0x8

    const/16 v30, 0x0

    const/16 v28, 0x0

    invoke-static/range {v24 .. v30}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v4, Ls9/d$b;

    sget v13, Lm8/c;->n4:I

    invoke-direct {v4, v13}, Ls9/d$b;-><init>(I)V

    const/4 v14, 0x0

    invoke-static {v3, v4, v12, v14, v14}, Lrf/z;->c(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    invoke-static {v7, v8, v9, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v1, v3, v4, v14}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-virtual {v5, v12, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->a()J

    move-result-wide v3

    const/16 v20, 0x1c

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v1, v14

    move-object v14, v6

    move/from16 v31, v15

    const/4 v8, 0x6

    move-wide v15, v3

    invoke-static/range {v13 .. v21}, LBe/q;->c(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;JFZZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    invoke-virtual/range {v22 .. v22}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    invoke-static {v2, v4, v12, v1}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v12, v1}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v12, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v12, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_2
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v2, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v13, v6, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v23 .. v23}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v13}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v6, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v13, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v23 .. v23}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v13, v3, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v12, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v2, 0x0

    invoke-static {v7, v2, v9, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    move/from16 v13, v31

    invoke-virtual {v5, v12, v13}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v6, 0x2

    invoke-static {v3, v4, v2, v6, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v2, Ls9/d$b;

    sget v4, Lm8/c;->c4:I

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    invoke-static {v2, v12, v1}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v12, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->a()J

    move-result-wide v14

    const/4 v6, 0x0

    move v4, v1

    move-object v1, v3

    move-wide v3, v14

    move-object v14, v5

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, LBe/u;->d(Landroidx/compose/ui/e;Ljava/lang/String;JLT/l;I)V

    const/16 v1, 0x28

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v12, v8}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const/4 v1, 0x0

    invoke-static {v7, v1, v9, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v14, v12, v13}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    invoke-virtual {v14, v12, v13}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->b()Lra/b$a$b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$b;->c()F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->m4:I

    const/4 v3, 0x0

    invoke-static {v2, v12, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    const v2, 0x200bd9e3

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface {v12, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, Lcom/ui/wifiman/ui/teleport/O$a$a;

    invoke-direct {v3, v11}, Lcom/ui/wifiman/ui/teleport/O$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v2, v3

    check-cast v2, Lmh/a;

    const/4 v10, 0x0

    const/16 v11, 0xbc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/O$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
