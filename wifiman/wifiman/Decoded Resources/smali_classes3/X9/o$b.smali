.class final LX9/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/o;->b(LX9/p;Lu9/d;ZLCi/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/o$b$p;
    }
.end annotation


# instance fields
.field final synthetic a:LX9/p;

.field final synthetic b:Lk0/e;

.field final synthetic c:Landroidx/compose/ui/platform/n1;

.field final synthetic d:LIi/N;

.field final synthetic e:Lu9/d;

.field final synthetic f:LT/q0;

.field final synthetic g:Landroidx/compose/ui/focus/o;

.field final synthetic h:LCi/e;


# direct methods
.method constructor <init>(LX9/p;Lk0/e;Landroidx/compose/ui/platform/n1;LIi/N;Lu9/d;LT/q0;Landroidx/compose/ui/focus/o;LCi/e;)V
    .locals 0

    iput-object p1, p0, LX9/o$b;->a:LX9/p;

    iput-object p2, p0, LX9/o$b;->b:Lk0/e;

    iput-object p3, p0, LX9/o$b;->c:Landroidx/compose/ui/platform/n1;

    iput-object p4, p0, LX9/o$b;->d:LIi/N;

    iput-object p5, p0, LX9/o$b;->e:Lu9/d;

    iput-object p6, p0, LX9/o$b;->f:LT/q0;

    iput-object p7, p0, LX9/o$b;->g:Landroidx/compose/ui/focus/o;

    iput-object p8, p0, LX9/o$b;->h:LCi/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    const-string/jumbo v2, "scaffoldPadding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.sso.mfa.auth.code.UiMFAAuthCodeLayout.<anonymous> (UiMFAAuthCodeLayout.kt:105)"

    const v6, 0x670ef424

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v2, v7, v8, v9}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2}, LM9/e;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v15, v0, LX9/o$b;->a:LX9/p;

    iget-object v2, v0, LX9/o$b;->d:LIi/N;

    iget-object v4, v0, LX9/o$b;->e:Lu9/d;

    iget-object v5, v0, LX9/o$b;->f:LT/q0;

    iget-object v6, v0, LX9/o$b;->g:Landroidx/compose/ui/focus/o;

    iget-object v14, v0, LX9/o$b;->h:LCi/e;

    const v11, -0x3bced2e6

    invoke-interface {v10, v11}, LT/l;->U(I)V

    const v11, 0xca3d8b5

    invoke-interface {v10, v11}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v11

    invoke-interface {v10, v11}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LY0/d;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    sget-object v21, LT/l;->a:LT/l$a;

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v12, v13, :cond_5

    new-instance v12, Lb1/z;

    invoke-direct {v12, v11}, Lb1/z;-><init>(LY0/d;)V

    invoke-interface {v10, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v12, Lb1/z;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_6

    new-instance v11, Lb1/l;

    invoke-direct {v11}, Lb1/l;-><init>()V

    invoke-interface {v10, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v13, v11

    check-cast v13, Lb1/l;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v11, v7, :cond_7

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7, v9, v3, v9}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v11

    invoke-interface {v10, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v3, v7, :cond_8

    new-instance v3, Lb1/o;

    invoke-direct {v3, v13}, Lb1/o;-><init>(Lb1/l;)V

    invoke-interface {v10, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lb1/o;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_9

    sget-object v7, LYg/J;->a:LYg/J;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v8

    invoke-static {v7, v8}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v7

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, LT/q0;

    invoke-interface {v10, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    const/16 v9, 0x101

    invoke-interface {v10, v9}, LT/l;->i(I)Z

    move-result v16

    or-int v8, v8, v16

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_a

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_b

    :cond_a
    new-instance v9, LX9/o$b$q;

    move-object/from16 v22, v9

    move-object/from16 v23, v7

    move-object/from16 v24, v12

    move-object/from16 v25, v3

    const/16 v8, 0x101

    move/from16 v26, v8

    move-object/from16 v27, v11

    invoke-direct/range {v22 .. v27}, LX9/o$b$q;-><init>(LT/q0;Lb1/z;Lb1/o;ILT/q0;)V

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v8, v9

    check-cast v8, LC0/C;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v16, v14

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v9, v14, :cond_c

    new-instance v9, LX9/o$b$r;

    invoke-direct {v9, v11, v3}, LX9/o$b$r;-><init>(LT/q0;Lb1/o;)V

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v14, v9

    check-cast v14, Lmh/a;

    invoke-interface {v10, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_d

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_e

    :cond_d
    new-instance v9, LX9/o$b$s;

    invoke-direct {v9, v12}, LX9/o$b$s;-><init>(Lb1/z;)V

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lmh/l;

    const/4 v3, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v1, v12, v9, v3, v11}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, LX9/o$b$t;

    move-object v11, v3

    move-object v12, v7

    move-object/from16 v7, v16

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    invoke-direct/range {v11 .. v20}, LX9/o$b$t;-><init>(LT/q0;Lb1/l;Lmh/a;LX9/p;LIi/N;Lu9/d;LT/q0;Landroidx/compose/ui/focus/o;LCi/e;)V

    const/16 v2, 0x36

    const v4, 0x478ef317

    const/4 v5, 0x1

    invoke-static {v4, v5, v3, v10, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    const/16 v5, 0x30

    const/4 v6, 0x0

    move-object v3, v8

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LC0/w;->a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    iget-object v1, v0, LX9/o$b;->a:LX9/p;

    invoke-interface {v1}, LW9/f;->F()LLi/N;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v9, 0x0

    invoke-static {v1, v3, v10, v9, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x3

    const/4 v4, 0x0

    invoke-static {v3, v4, v2, v3}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v5

    invoke-static {v3, v4, v2, v3}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v4

    sget-object v2, LX9/e;->a:LX9/e;

    invoke-virtual {v2}, LX9/e;->a()Lmh/q;

    move-result-object v6

    const v8, 0x30d80

    const/16 v11, 0x12

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v3, v5

    move-object v5, v7

    move-object/from16 v7, p2

    move v12, v9

    move v9, v11

    invoke-static/range {v1 .. v9}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    iget-object v1, v0, LX9/o$b;->a:LX9/p;

    const v2, 0x186dd7b5

    invoke-interface {v10, v2}, LT/l;->U(I)V

    iget-object v2, v0, LX9/o$b;->a:LX9/p;

    invoke-interface {v10, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, LX9/o$b;->b:Lk0/e;

    invoke-interface {v10, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, LX9/o$b;->c:Landroidx/compose/ui/platform/n1;

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v4, v0, LX9/o$b;->a:LX9/p;

    iget-object v5, v0, LX9/o$b;->f:LT/q0;

    iget-object v6, v0, LX9/o$b;->b:Lk0/e;

    iget-object v7, v0, LX9/o$b;->c:Landroidx/compose/ui/platform/n1;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_f

    invoke-virtual/range {v21 .. v21}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_10

    :cond_f
    new-instance v2, LX9/o$b$o;

    const/4 v8, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, LX9/o$b$o;-><init>(LX9/p;LT/q0;Lk0/e;Landroidx/compose/ui/platform/n1;Ldh/e;)V

    invoke-interface {v10, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v1, v3, v10, v12}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LX9/o$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
