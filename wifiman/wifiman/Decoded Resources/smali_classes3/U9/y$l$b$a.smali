.class final LU9/y$l$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y$l$b;->a(Lf2/w;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic b:LU9/h;

.field final synthetic c:Lf2/w;

.field final synthetic d:LU9/f;

.field final synthetic e:Lmh/l;

.field final synthetic f:Landroidx/fragment/app/Fragment;

.field final synthetic g:LU9/f;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lf2/w;LU9/f;Lmh/l;Landroidx/fragment/app/Fragment;LU9/f;)V
    .locals 0

    iput-object p1, p0, LU9/y$l$b$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, LU9/y$l$b$a;->b:LU9/h;

    iput-object p3, p0, LU9/y$l$b$a;->c:Lf2/w;

    iput-object p4, p0, LU9/y$l$b$a;->d:LU9/f;

    iput-object p5, p0, LU9/y$l$b$a;->e:Lmh/l;

    iput-object p6, p0, LU9/y$l$b$a;->f:Landroidx/fragment/app/Fragment;

    iput-object p7, p0, LU9/y$l$b$a;->g:LU9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LN/o0;)Z
    .locals 0

    invoke-static {p0}, LU9/y$l$b$a;->f(LN/o0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1}, LU9/y$l$b$a;->h(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LIi/N;LN/n0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LU9/y$l$b$a;->i(LIi/N;LN/n0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LN/o0;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final h(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LU9/y$l$b$a$f;

    invoke-direct {p1, p0}, LU9/y$l$b$a$f;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    return-object p1
.end method

.method private static final i(LIi/N;LN/n0;)LYg/J;
    .locals 6

    new-instance v3, LU9/y$l$b$a$e;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LU9/y$l$b$a$e;-><init>(LN/n0;Ldh/e;)V

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
.method public final e(LT/l;I)V
    .locals 27

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous>.<anonymous>.<anonymous> (UiMFA.kt:100)"

    const v4, -0x3004e9d8

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v17, LT/l;->a:LT/l$a;

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    sget-object v1, Ldh/j;->a:Ldh/j;

    invoke-static {v1, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v1

    new-instance v2, LT/A;

    invoke-direct {v2, v1}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_3
    check-cast v1, LT/A;

    invoke-virtual {v1}, LT/A;->a()LIi/N;

    move-result-object v14

    const/4 v13, 0x0

    new-array v1, v13, [Lf2/D;

    invoke-static {v1, v15, v13}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v8

    sget-object v1, LN/o0;->Hidden:LN/o0;

    sget-object v2, LN/P0;->a:LN/P0;

    invoke-virtual {v2}, LN/P0;->a()Lr/h0;

    move-result-object v2

    const v3, 0x5cdc555c

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_4

    new-instance v3, LU9/G;

    invoke-direct {v3}, LU9/G;-><init>()V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v6, 0xd86

    const/4 v7, 0x0

    const/4 v4, 0x1

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;

    move-result-object v11

    const v1, 0x5cdc5ecb

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-object v1, v0, LU9/y$l$b$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {v15, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LU9/y$l$b$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_5

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_6

    :cond_5
    new-instance v3, LU9/y$l$b$a$a;

    const/4 v1, 0x0

    invoke-direct {v3, v2, v1}, LU9/y$l$b$a$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const-string/jumbo v1, "mfa"

    const/4 v9, 0x6

    invoke-static {v1, v3, v15, v9}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const v2, 0x5cdc7004

    invoke-interface {v15, v2}, LT/l;->U(I)V

    iget-object v2, v0, LU9/y$l$b$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, LU9/y$l$b$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_7

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_8

    :cond_7
    new-instance v4, LU9/H;

    invoke-direct {v4, v3}, LU9/H;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v1, v4, v15, v9}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object v1, v0, LU9/y$l$b$a;->b:LU9/h;

    const v2, 0x5cdc8bc8

    invoke-interface {v15, v2}, LT/l;->U(I)V

    iget-object v2, v0, LU9/y$l$b$a;->b:LU9/h;

    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, LU9/y$l$b$a;->c:Lf2/w;

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, LU9/y$l$b$a;->d:LU9/f;

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v15, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, LU9/y$l$b$a;->e:Lmh/l;

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, LU9/y$l$b$a;->b:LU9/h;

    iget-object v4, v0, LU9/y$l$b$a;->c:Lf2/w;

    iget-object v5, v0, LU9/y$l$b$a;->d:LU9/f;

    iget-object v6, v0, LU9/y$l$b$a;->e:Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_9

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_a

    :cond_9
    new-instance v7, LU9/y$l$b$a$b;

    const/16 v24, 0x0

    move-object/from16 v18, v7

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v11

    move-object/from16 v23, v6

    invoke-direct/range {v18 .. v24}, LU9/y$l$b$a$b;-><init>(LU9/h;Lf2/w;LU9/f;LN/n0;Lmh/l;Ldh/e;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v1, v7, v15, v13}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    int-to-float v3, v13

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v1, v4, v3}, LE/h;->e(FFFF)LE/g;

    move-result-object v10

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v15, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->a()J

    move-result-wide v18

    new-instance v1, LU9/y$l$b$a$c;

    iget-object v3, v0, LU9/y$l$b$a;->f:Landroidx/fragment/app/Fragment;

    iget-object v4, v0, LU9/y$l$b$a;->g:LU9/f;

    iget-object v7, v0, LU9/y$l$b$a;->b:LU9/h;

    move-object v2, v1

    move-object v5, v8

    move-object v6, v11

    invoke-direct/range {v2 .. v7}, LU9/y$l$b$a$c;-><init>(Landroidx/fragment/app/Fragment;LU9/f;Lf2/w;LN/n0;LU9/h;)V

    const v2, -0xb94b8c6

    const/4 v3, 0x1

    const/16 v4, 0x36

    invoke-static {v2, v3, v1, v15, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    new-instance v2, LU9/y$l$b$a$d;

    iget-object v5, v0, LU9/y$l$b$a;->f:Landroidx/fragment/app/Fragment;

    iget-object v6, v0, LU9/y$l$b$a;->d:LU9/f;

    invoke-direct {v2, v5, v6}, LU9/y$l$b$a$d;-><init>(Landroidx/fragment/app/Fragment;LU9/f;)V

    const v5, 0x39fe9521

    invoke-static {v5, v3, v2, v15, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    sget v2, LN/n0;->e:I

    shl-int/2addr v2, v9

    const v3, 0x30000006

    or-int v20, v2, v3

    const/16 v21, 0x1aa

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    move-object v3, v11

    move-object v5, v10

    move-wide/from16 v7, v18

    move-wide/from16 v9, v22

    move-object/from16 p2, v11

    move-wide/from16 v11, v24

    move-object/from16 v13, v16

    move-object/from16 v26, v14

    move-object/from16 v14, p1

    move/from16 v15, v20

    move/from16 v16, v21

    invoke-static/range {v1 .. v16}, LN/m0;->b(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;LT/l;II)V

    invoke-virtual/range {p2 .. p2}, LN/n0;->k()Z

    move-result v1

    const v2, 0x5cdd9a99

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->U(I)V

    move-object/from16 v2, v26

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    move-object/from16 v5, p2

    invoke-interface {v3, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_b

    invoke-virtual/range {v17 .. v17}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_c

    :cond_b
    new-instance v6, LU9/I;

    invoke-direct {v6, v2, v5}, LU9/I;-><init>(LIi/N;LN/n0;)V

    invoke-interface {v3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v2, 0x0

    invoke-static {v1, v6, v3, v2, v2}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LU9/y$l$b$a;->e(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
