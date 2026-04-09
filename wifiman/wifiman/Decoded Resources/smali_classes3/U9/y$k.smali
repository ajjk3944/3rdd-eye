.class final LU9/y$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y;->y(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LU9/y$k;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, LU9/y$k;->i(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, LU9/y$k;->h(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0}, LU9/y$k;->f(Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lf2/u;)LYg/J;
    .locals 15

    const-string v0, "$this$NavHost"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LU9/D;

    invoke-direct {v0}, LU9/D;-><init>()V

    new-instance v13, LU9/E;

    invoke-direct {v13}, LU9/E;-><init>()V

    sget-object v1, LU9/f$c;->a:LU9/f$c;

    invoke-virtual {v1}, LU9/f$c;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v14, LU9/a;->a:LU9/a;

    invoke-virtual {v14}, LU9/a;->n()Lmh/r;

    move-result-object v10

    const/16 v11, 0xe6

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v6, v13

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v1, LU9/f$b;->a:LU9/f$b;

    invoke-virtual {v1}, LU9/f$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, LU9/a;->o()Lmh/r;

    move-result-object v10

    move-object v1, p0

    move-object v5, v0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v1, LU9/f$f;->a:LU9/f$f;

    invoke-virtual {v1}, LU9/f$f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, LU9/a;->b()Lmh/r;

    move-result-object v10

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v1, LU9/f$a;->a:LU9/f$a;

    invoke-virtual {v1}, LU9/f$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, LU9/a;->c()Lmh/r;

    move-result-object v10

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v1, LU9/f$d;->a:LU9/f$d;

    invoke-virtual {v1}, LU9/f$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, LU9/a;->d()Lmh/r;

    move-result-object v10

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v1, LU9/f$g;->a:LU9/f$g;

    invoke-virtual {v1}, LU9/f$g;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, LU9/a;->e()Lmh/r;

    move-result-object v10

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v1, LU9/f$e;->a:LU9/f$e;

    invoke-virtual {v1}, LU9/f$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, LU9/a;->f()Lmh/r;

    move-result-object v10

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->c()I

    move-result v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->c(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->d()I

    move-result v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/animation/d;->a(Landroidx/compose/animation/d;ILr/H;Lmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(Lf2/w;LT/l;I)V
    .locals 17

    move-object/from16 v11, p2

    move/from16 v0, p3

    const-string/jumbo v1, "navController"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.mfa.ModalSheetContent.<anonymous> (UiMFA.kt:359)"

    const v4, 0x4dd044a6    # 4.3677E8f

    invoke-static {v4, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1}, Lz/j0;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lz/j0;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    move-object/from16 v15, p0

    iget-object v1, v15, LU9/y$k;->a:Ljava/lang/String;

    const v4, 0x1ac08dd

    invoke-interface {v11, v4}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_1

    new-instance v4, LU9/C;

    invoke-direct {v4}, LU9/C;-><init>()V

    invoke-interface {v11, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v10, v4

    check-cast v10, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    and-int/lit8 v12, v0, 0xe

    const/4 v13, 0x6

    const/16 v14, 0x3f8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object/from16 v9, v16

    move-object/from16 v11, p2

    invoke-static/range {v0 .. v14}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/w;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LU9/y$k;->e(Lf2/w;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
