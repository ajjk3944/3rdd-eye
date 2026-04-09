.class final Laa/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c;->b(Laa/d;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laa/d;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(Laa/d;LIi/N;)V
    .locals 0

    iput-object p1, p0, Laa/c$b;->a:Laa/d;

    iput-object p2, p0, Laa/c$b;->b:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    const-string/jumbo v2, "scaffoldPadding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

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

    const-string/jumbo v5, "com.ui.core.ui.sso.mfa.methods.UiMFAMethodPickerLayout.<anonymous> (UiMFAMethodPickerLayout.kt:55)"

    const v6, 0x1b560e93

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2}, LM9/e;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v12, v0, Laa/c$b;->a:Laa/d;

    iget-object v13, v0, Laa/c$b;->b:LIi/N;

    const v2, -0x3bced2e6

    invoke-interface {v7, v2}, LT/l;->U(I)V

    const v2, 0xca3d8b5

    invoke-interface {v7, v2}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v4, v9, :cond_5

    new-instance v4, Lb1/z;

    invoke-direct {v4, v2}, Lb1/z;-><init>(LY0/d;)V

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lb1/z;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v2, v9, :cond_6

    new-instance v2, Lb1/l;

    invoke-direct {v2}, Lb1/l;-><init>()V

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v10, v2

    check-cast v10, Lb1/l;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v2, v9, :cond_7

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v6, v3, v6}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v3, v9, :cond_8

    new-instance v3, Lb1/o;

    invoke-direct {v3, v10}, Lb1/o;-><init>(Lb1/l;)V

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lb1/o;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v9, v11, :cond_9

    sget-object v9, LYg/J;->a:LYg/J;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v11

    invoke-static {v9, v11}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v9

    invoke-interface {v7, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, LT/q0;

    invoke-interface {v7, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    const/16 v15, 0x101

    invoke-interface {v7, v15}, LT/l;->i(I)Z

    move-result v14

    const/4 v5, 0x0

    or-int/2addr v11, v14

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_a

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v14, v11, :cond_b

    :cond_a
    new-instance v11, Laa/c$b$h;

    move-object v14, v11

    move/from16 v18, v15

    move-object v15, v9

    move-object/from16 v16, v4

    move-object/from16 v17, v3

    move-object/from16 v19, v2

    invoke-direct/range {v14 .. v19}, Laa/c$b$h;-><init>(LT/q0;Lb1/z;Lb1/o;ILT/q0;)V

    invoke-interface {v7, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, LC0/C;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v11, v15, :cond_c

    new-instance v11, Laa/c$b$i;

    invoke-direct {v11, v2, v3}, Laa/c$b$i;-><init>(LT/q0;Lb1/o;)V

    invoke-interface {v7, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v11, Lmh/a;

    invoke-interface {v7, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_e

    :cond_d
    new-instance v3, Laa/c$b$j;

    invoke-direct {v3, v4}, Laa/c$b$j;-><init>(Lb1/z;)V

    invoke-interface {v7, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lmh/l;

    const/4 v2, 0x1

    invoke-static {v1, v5, v3, v2, v6}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v3, Laa/c$b$k;

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, Laa/c$b$k;-><init>(LT/q0;Lb1/l;Lmh/a;Laa/d;LIi/N;)V

    const/16 v4, 0x36

    const v5, 0x478ef317

    invoke-static {v5, v2, v3, v7, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    const/16 v5, 0x30

    const/4 v6, 0x0

    move-object v3, v14

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LC0/w;->a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
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

    invoke-virtual {p0, p1, p2, p3}, Laa/c$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
