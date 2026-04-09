.class final Lq9/o$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/o;->f(Lq9/i;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lq9/h;

.field final synthetic c:LIi/N;

.field final synthetic d:Lq9/i;


# direct methods
.method constructor <init>(Ljava/util/List;Lq9/h;LIi/N;Lq9/i;)V
    .locals 0

    iput-object p1, p0, Lq9/o$d;->a:Ljava/util/List;

    iput-object p2, p0, Lq9/o$d;->b:Lq9/h;

    iput-object p3, p0, Lq9/o$d;->c:LIi/N;

    iput-object p4, p0, Lq9/o$d;->d:Lq9/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;Lq9/i;Lq9/g;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lq9/o$d;->c(LIi/N;Lq9/i;Lq9/g;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;Lq9/i;Lq9/g;)LYg/J;
    .locals 6

    new-instance v3, Lq9/o$d$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, v0}, Lq9/o$d$a;-><init>(Lq9/i;Lq9/g;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(ILT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v10, p2

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v10, v1}, LT/l;->i(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

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

    goto/16 :goto_8

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.account.UiAccountPickerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiAccountPickerScreen.kt:153)"

    const v6, -0x1011d4f7

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, Lq9/o$d;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq9/g;

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v11, v12, v13, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v4, v0, Lq9/o$d;->b:Lq9/h;

    iget-object v5, v0, Lq9/o$d;->c:LIi/N;

    iget-object v6, v0, Lq9/o$d;->d:Lq9/i;

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v7

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v7, v8, v10, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v7

    invoke-static {v10, v9}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v10, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-interface {v10, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v15, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v2, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    invoke-static {v11, v12, v13, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v18

    sget-object v2, Lq9/h;->EDIT:Lq9/h;

    if-eq v4, v2, :cond_9

    move/from16 v19, v13

    goto :goto_4

    :cond_9
    const/16 v19, 0x0

    :goto_4
    const v2, 0x26454f10

    invoke-interface {v10, v2}, LT/l;->U(I)V

    invoke-interface {v10, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v10, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_a

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_b

    :cond_a
    new-instance v3, Lq9/r;

    invoke-direct {v3, v5, v6, v1}, Lq9/r;-><init>(LIi/N;Lq9/i;Lq9/g;)V

    invoke-interface {v10, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v22, v3

    check-cast v22, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v23, 0x6

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v15, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v15, v10, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v3

    const/4 v4, 0x2

    invoke-static {v2, v3, v12, v4, v14}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v1}, Lq9/g;->d()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "ui_account_picker_account_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lq9/g;->f()Ls9/b;

    move-result-object v4

    if-eqz v4, :cond_c

    move v4, v13

    goto :goto_5

    :cond_c
    const/4 v4, 0x0

    :goto_5
    invoke-static {v2, v3, v4}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v1}, Lq9/g;->a()Ls9/c;

    move-result-object v3

    invoke-virtual {v1}, Lq9/g;->b()Ls9/a$b;

    move-result-object v4

    invoke-virtual {v1}, Lq9/g;->e()Ls9/d;

    move-result-object v5

    const v6, 0x264595e2

    invoke-interface {v10, v6}, LT/l;->U(I)V

    if-nez v5, :cond_d

    move-object v5, v14

    const/4 v6, 0x0

    goto :goto_6

    :cond_d
    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v1}, Lq9/g;->c()Ls9/d;

    move-result-object v7

    const v8, 0x26459da2

    invoke-interface {v10, v8}, LT/l;->U(I)V

    if-nez v7, :cond_e

    move-object v6, v14

    goto :goto_7

    :cond_e
    invoke-static {v7, v10, v6}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v6

    :goto_7
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v1}, Lq9/g;->f()Ls9/b;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v16, 0x0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, p2

    move/from16 v25, v9

    move/from16 v9, v16

    invoke-static/range {v1 .. v9}, Lq9/t;->b(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;LT/l;II)V

    invoke-static {v11, v12, v13, v14}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    move/from16 v1, v25

    invoke-virtual {v15, v10, v1}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->c()F

    move-result v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v9, 0x1e

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lq9/o$d;->b(ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
