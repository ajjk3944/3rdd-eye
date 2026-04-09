.class final LQe/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/q;->k(Landroidx/compose/ui/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/j;

.field final synthetic b:Lf2/w;

.field final synthetic c:LQe/d;


# direct methods
.method constructor <init>(Lz/j;Lf2/w;LQe/d;)V
    .locals 0

    iput-object p1, p0, LQe/q$a;->a:Lz/j;

    iput-object p2, p0, LQe/q$a;->b:Lf2/w;

    iput-object p3, p0, LQe/q$a;->c:LQe/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0}, LQe/q$a;->c(Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lf2/u;)LYg/J;
    .locals 15

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LQe/a;->a:LQe/a;

    invoke-virtual {v0}, LQe/a;->b()Lmh/q;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v2, "SPEED"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LQe/a;->c()Lmh/q;

    move-result-object v12

    const/4 v13, 0x6

    const/4 v14, 0x0

    const-string v9, "SIGNAL"

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, p0

    invoke-static/range {v8 .. v14}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LQe/a;->d()Lmh/q;

    move-result-object v5

    const-string v2, "SCAN"

    invoke-static/range {v1 .. v7}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LQe/a;->e()Lmh/q;

    move-result-object v12

    const-string v9, "DISCOVERY"

    invoke-static/range {v8 .. v14}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    invoke-virtual {v0}, LQe/a;->f()Lmh/q;

    move-result-object v5

    const-string v2, "TELEPORT"

    invoke-static/range {v1 .. v7}, LAe/a;->c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.root.WiFimanRootNavigation.<anonymous>.<anonymous> (WifimanRootUi.kt:74)"

    const v4, -0x2438e4dd

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LQe/q$a;->a:Lz/j;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v14, 0x1

    invoke-interface {v1, v2, v3, v14}, Lz/j;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v13, v0, LQe/q$a;->b:Lf2/w;

    iget-object v12, v0, LQe/q$a;->c:LQe/d;

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v3

    const/4 v11, 0x0

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v3

    invoke-static {v15, v11}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v1, 0x0

    const/4 v10, 0x0

    invoke-static {v2, v1, v14, v10}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v1, LQe/c;->a:LQe/c;

    invoke-virtual {v1}, LQe/c;->a()LQe/c$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const v1, 0x23869fc4

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v16, LT/l;->a:LT/l$a;

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_7

    new-instance v1, LQe/p;

    invoke-direct {v1}, LQe/p;-><init>()V

    invoke-interface {v15, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v17, v1

    check-cast v17, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v18, 0x6

    const/16 v19, 0x3f8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x180

    move-object v1, v13

    move-object/from16 v10, v20

    move-object/from16 v11, v17

    move-object/from16 v17, v12

    move-object/from16 v12, p1

    move-object/from16 v22, v13

    move/from16 v13, v21

    move/from16 v14, v18

    move-object v0, v15

    move/from16 v15, v19

    invoke-static/range {v1 .. v15}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    const v1, 0x2386ea80

    invoke-interface {v0, v1}, LT/l;->U(I)V

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    goto :goto_2

    :cond_8
    const/4 v2, 0x0

    goto :goto_3

    :cond_9
    :goto_2
    new-instance v3, LQe/q$a$a;

    const/4 v2, 0x0

    invoke-direct {v3, v1, v2}, LQe/q$a$a;-><init>(Lf2/w;Ldh/e;)V

    invoke-interface {v0, v3}, LT/l;->K(Ljava/lang/Object;)V

    :goto_3
    check-cast v3, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v4, 0x0

    invoke-static {v1, v3, v0, v4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface/range {v17 .. v17}, LQe/d;->c()LLi/N;

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v3, v2, v0, v4, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LQe/c$a;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    const v5, 0x2387051b

    invoke-interface {v0, v5}, LT/l;->U(I)V

    invoke-interface {v0, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_a

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_b

    :cond_a
    new-instance v6, LQe/q$a$b;

    invoke-direct {v6, v1, v3, v2}, LQe/q$a$b;-><init>(Lf2/w;Ljava/lang/String;Ldh/e;)V

    invoke-interface {v0, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v3, v6, v0, v4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, Lxe/t0;->d()LT/H0;

    move-result-object v3

    invoke-interface {v0, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxe/r0;

    const v5, 0x23877925

    invoke-interface {v0, v5}, LT/l;->U(I)V

    invoke-interface {v0, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v0, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_d

    :cond_c
    new-instance v6, LQe/q$a$c;

    invoke-direct {v6, v1, v3, v2}, LQe/q$a$c;-><init>(Lf2/w;Lxe/r0;Ldh/e;)V

    invoke-interface {v0, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v1, v6, v0, v4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LQe/q$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
