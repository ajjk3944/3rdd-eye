.class final Lbf/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q;->b(Lbf/k;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbf/k;


# direct methods
.method constructor <init>(Lbf/k;)V
    .locals 0

    iput-object p1, p0, Lbf/q$b;->a:Lbf/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/snapshots/k;Lbf/k;II)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbf/q$b;->k(Landroidx/compose/runtime/snapshots/k;Lbf/k;II)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/runtime/snapshots/k;Ljj/d;Ljj/d;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lbf/q$b;->j(Landroidx/compose/runtime/snapshots/k;Ljj/d;Ljj/d;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbf/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lbf/q$b;->i(Lbf/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/runtime/snapshots/k;Ljj/g;Ljava/util/Map;Lbf/j;Lbf/k;LA/y;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbf/q$b;->h(Landroidx/compose/runtime/snapshots/k;Ljj/g;Ljava/util/Map;Lbf/j;Lbf/k;LA/y;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Landroidx/compose/runtime/snapshots/k;Ljj/g;Ljava/util/Map;Lbf/j;Lbf/k;LA/y;)LYg/J;
    .locals 12

    move-object v3, p0

    move-object/from16 v7, p5

    const-string v0, "$this$LazyColumn"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbf/u;

    invoke-direct {v0}, Lbf/u;-><init>()V

    sget-object v1, Lbf/q$b$c;->a:Lbf/q$b$c;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v8

    new-instance v9, Lbf/q$b$d;

    invoke-direct {v9, v0, p0}, Lbf/q$b$d;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v10, Lbf/q$b$e;

    invoke-direct {v10, v1, p0}, Lbf/q$b$e;-><init>(Lmh/l;Ljava/util/List;)V

    new-instance v11, Lbf/q$b$f;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p0

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lbf/q$b$f;-><init>(Ljava/util/List;Ljj/g;Landroidx/compose/runtime/snapshots/k;Ljava/util/Map;Lbf/j;Lbf/k;)V

    const v0, -0x25b7f321

    const/4 v1, 0x1

    invoke-static {v0, v1, v11}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    invoke-interface {v7, v8, v9, v10, v0}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final i(Lbf/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbf/e;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Landroidx/compose/runtime/snapshots/k;Ljj/d;Ljj/d;)LYg/J;
    .locals 1

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Ljj/d;->a()I

    move-result p2

    invoke-virtual {p1}, Ljj/d;->a()I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    check-cast v0, Ljava/util/Collection;

    invoke-static {p0, v0}, Ly6/a;->b(Ljava/util/List;Ljava/util/Collection;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Landroidx/compose/runtime/snapshots/k;Lbf/k;II)LYg/J;
    .locals 3

    invoke-static {p0, p3}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbf/e;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbf/e;->b()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NetworkHostsUi - Item "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " moved from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x2

    invoke-static {p2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    if-eqz p0, :cond_1

    invoke-virtual {p1, p0, p3}, Lbf/k;->s0(Ljava/lang/String;I)V

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f(Lz/N;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p2

    const-string v2, "scaffoldPadding"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.speed.hosts.NetworkHostsUi.<anonymous> (NetworkHostsUi.kt:116)"

    const v5, -0x42897f1b

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const v2, 0x398daa74

    invoke-interface {v13, v2}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_5

    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v14, v2

    check-cast v14, Landroidx/compose/runtime/snapshots/k;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    iget-object v2, v0, Lbf/q$b;->a:Lbf/k;

    invoke-virtual {v2}, Lbf/k;->n0()LLi/N;

    move-result-object v2

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x1

    invoke-static {v2, v15, v13, v12, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lbf/k$a;

    invoke-virtual {v10}, Lbf/k$a;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    const/16 v3, 0xa

    invoke-static {v2, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lbf/e;

    invoke-virtual {v4}, Lbf/e;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v9, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    const v2, 0x398dcdaa

    invoke-interface {v13, v2}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v16, LT/l;->a:LT/l$a;

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_7

    new-instance v2, Lbf/r;

    invoke-direct {v2, v14}, Lbf/r;-><init>(Landroidx/compose/runtime/snapshots/k;)V

    invoke-interface {v13, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v3, 0x398deab7

    invoke-interface {v13, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lbf/q$b;->a:Lbf/k;

    invoke-interface {v13, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lbf/q$b;->a:Lbf/k;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_8

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_9

    :cond_8
    new-instance v5, Lbf/s;

    invoke-direct {v5, v14, v4}, Lbf/s;-><init>(Landroidx/compose/runtime/snapshots/k;Lbf/k;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x6

    const/16 v18, 0x36

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p2

    move-object/from16 v19, v9

    move/from16 v9, v17

    move-object/from16 p3, v10

    move/from16 v10, v18

    invoke-static/range {v2 .. v10}, Ljj/h;->a(Lmh/p;LA/B;Lmh/p;Lmh/p;FLjj/b;LT/l;II)Ljj/g;

    move-result-object v5

    iget-object v2, v0, Lbf/q$b;->a:Lbf/k;

    invoke-virtual {v2}, Lbf/k;->C()LLi/N;

    move-result-object v2

    invoke-static {v2, v15, v13, v12, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lbf/j;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    invoke-static {v2, v3, v11, v15}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v5}, Ljj/f;->b(Landroidx/compose/ui/e;Ljj/i;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v5}, Ljj/a;->a(Landroidx/compose/ui/e;Ljj/i;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v5}, Ljj/g;->Y()LA/B;

    move-result-object v2

    const v3, 0x398e3b03

    invoke-interface {v13, v3}, LT/l;->U(I)V

    invoke-interface {v13, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v6, v19

    invoke-interface {v13, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v13, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lbf/q$b;->a:Lbf/k;

    invoke-interface {v13, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v8, v0, Lbf/q$b;->a:Lbf/k;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_b

    :cond_a
    new-instance v9, Lbf/t;

    move-object v3, v9

    move-object v4, v14

    invoke-direct/range {v3 .. v8}, Lbf/t;-><init>(Landroidx/compose/runtime/snapshots/k;Ljj/g;Ljava/util/Map;Lbf/j;Lbf/k;)V

    invoke-interface {v13, v9}, LT/l;->K(Ljava/lang/Object;)V

    move-object v4, v9

    :cond_b
    move-object v9, v4

    check-cast v9, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v11, 0x0

    const/16 v17, 0xfc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p2

    move/from16 v12, v17

    invoke-static/range {v1 .. v12}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    invoke-virtual/range {p3 .. p3}, Lbf/k$a;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x398efbbb

    invoke-interface {v13, v2}, LT/l;->U(I)V

    move-object/from16 v2, p3

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_d

    :cond_c
    new-instance v4, Lbf/q$b$b;

    invoke-direct {v4, v14, v2, v15}, Lbf/q$b$b;-><init>(Landroidx/compose/runtime/snapshots/k;Lbf/k$a;Ldh/e;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v2, 0x0

    invoke-static {v1, v4, v13, v2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lbf/q$b;->f(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
