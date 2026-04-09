.class final Lcom/ui/wifiman/ui/settings/preferences/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/q;->b(Lcom/ui/wifiman/ui/settings/preferences/o;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/o;

.field final synthetic b:Lxe/f$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/o;Lxe/f$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/q$b;->a:Lcom/ui/wifiman/ui/settings/preferences/o;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/preferences/q$b;->b:Lxe/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v13, 0x10

    if-ne v2, v13, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.preferences.TeleportQuickActionExplanationAddUi.<anonymous> (TeleportQuickActionExplanationAddUi.kt:54)"

    const v4, -0x6ac17131

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v12, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    invoke-static {v15, v12, v11, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v2

    iget-object v9, v0, Lcom/ui/wifiman/ui/settings/preferences/q$b;->a:Lcom/ui/wifiman/ui/settings/preferences/o;

    iget-object v8, v0, Lcom/ui/wifiman/ui/settings/preferences/q$b;->b:Lxe/f$b;

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, v2, v14, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v14, v7}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v7, 0x6

    invoke-static {v1, v14, v7}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v1, LPe/b;->a:LPe/b;

    invoke-virtual {v1}, LPe/b;->f()Ls9/c$a;

    move-result-object v1

    const/16 v16, 0x36

    const/16 v17, 0xfe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v2, v15

    move-object/from16 v7, v18

    move-object/from16 v26, v8

    move/from16 v8, v19

    move-object/from16 v27, v9

    move-object/from16 v9, v20

    move-object/from16 v10, p2

    move/from16 v11, v16

    move/from16 v12, v17

    invoke-static/range {v1 .. v12}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    int-to-float v1, v13

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v12, 0x6

    invoke-static {v1, v14, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    invoke-static {v15, v10, v11, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v8, v14, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    const/4 v5, 0x2

    invoke-static {v1, v2, v10, v5, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget v1, Lm8/c;->b4:I

    const/4 v6, 0x0

    invoke-static {v1, v14, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v14, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v3

    sget-object v13, LW0/j;->b:LW0/j$a;

    invoke-virtual {v13}, LW0/j$a;->d()I

    move-result v13

    invoke-virtual {v8, v14, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lpa/c;->b()Lpa/b;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lpa/b;->a()LL0/U;

    move-result-object v21

    invoke-static {v13}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const/16 v24, 0x0

    const v25, 0xfdf8

    const-wide/16 v16, 0x0

    move-wide/from16 v5, v16

    const/16 v16, 0x0

    move/from16 v28, v7

    move-object/from16 v7, v16

    move-object/from16 v29, v8

    move-object/from16 v8, v16

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v30, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v12, p2

    const/4 v2, 0x6

    invoke-static {v1, v12, v2}, LM9/k;->a(FLT/l;I)V

    move-object/from16 v13, v30

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v13, v14, v15, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move/from16 v9, v28

    move-object/from16 v10, v29

    invoke-virtual {v10, v12, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    const/4 v8, 0x2

    invoke-static {v1, v2, v14, v8, v11}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->Y3:I

    const/4 v7, 0x0

    invoke-static {v2, v12, v7}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v16

    const v2, -0x1df7e037

    invoke-interface {v12, v2}, LT/l;->U(I)V

    move-object/from16 v2, v27

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/q$b$a;

    invoke-direct {v4, v2}, Lcom/ui/wifiman/ui/settings/preferences/q$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v2, v4

    check-cast v2, Lmh/a;

    const/16 v17, 0x0

    const/16 v18, 0xbc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, v16

    move-object/from16 v8, v19

    move/from16 v31, v9

    move-object/from16 v9, p2

    move-object/from16 v32, v10

    move/from16 v10, v17

    move-object v0, v11

    move/from16 v11, v18

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-static {v13, v14, v15, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move/from16 v3, v31

    move-object/from16 v2, v32

    invoke-virtual {v2, v12, v3}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    const/4 v3, 0x2

    invoke-static {v1, v2, v14, v3, v0}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0x1df7c2d0

    invoke-interface {v12, v2}, LT/l;->U(I)V

    move-object/from16 v2, v26

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/q$b$b;

    invoke-direct {v4, v2}, Lcom/ui/wifiman/ui/settings/preferences/q$b$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v2, v4

    check-cast v2, Lmh/a;

    sget v3, Lm8/c;->a:I

    const/4 v10, 0x0

    invoke-static {v3, v12, v10}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v9, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-static {v0, v12, v10, v15}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/q$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
