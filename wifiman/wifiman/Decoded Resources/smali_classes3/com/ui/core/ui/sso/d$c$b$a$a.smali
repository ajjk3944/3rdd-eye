.class final Lcom/ui/core/ui/sso/d$c$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c$b$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/w;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/ui/core/ui/sso/d;

.field final synthetic d:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic e:LU9/h;


# direct methods
.method constructor <init>(Lf2/w;Ljava/lang/String;Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a;->a:Lf2/w;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/core/ui/sso/d$c$b$a$a;->c:Lcom/ui/core/ui/sso/d;

    iput-object p4, p0, Lcom/ui/core/ui/sso/d$c$b$a$a;->d:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p5, p0, Lcom/ui/core/ui/sso/d$c$b$a$a;->e:LU9/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d$c$b$a$a;->h(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/d$c$b$a$a;->i(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;LU9/h;Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/core/ui/sso/d$c$b$a$a;->f(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;LU9/h;Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;LU9/h;Lf2/u;)LYg/J;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "$this$NavHost"

    move-object/from16 v15, p4

    invoke-static {v15, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/ui/core/ui/sso/h;

    invoke-direct {v3}, Lcom/ui/core/ui/sso/h;-><init>()V

    new-instance v16, Lcom/ui/core/ui/sso/i;

    invoke-direct/range {v16 .. v16}, Lcom/ui/core/ui/sso/i;-><init>()V

    sget-object v4, Lcom/ui/core/ui/sso/a$a;->a:Lcom/ui/core/ui/sso/a$a;

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/a$a;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v4, Lcom/ui/core/ui/sso/d$c$b$a$a$a;

    invoke-direct {v4, v0, v1, v2}, Lcom/ui/core/ui/sso/d$c$b$a$a$a;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V

    const v6, -0x1fa72bf9

    const/4 v14, 0x1

    invoke-static {v6, v14, v4}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v13

    const/16 v17, 0xfe

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v4, p4

    move/from16 v14, v17

    move-object/from16 v15, v18

    invoke-static/range {v4 .. v15}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v4, Lcom/ui/core/ui/sso/a$d;->a:Lcom/ui/core/ui/sso/a$d;

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/a$d;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v4, Lcom/ui/core/ui/sso/d$c$b$a$a$b;

    invoke-direct {v4, v0, v1}, Lcom/ui/core/ui/sso/d$c$b$a$a$b;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;)V

    const v6, 0x10a68c30

    const/4 v15, 0x1

    invoke-static {v6, v15, v4}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v13

    const/16 v14, 0xe6

    const/16 v17, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p4

    move-object v8, v3

    move-object/from16 v9, v16

    move-object/from16 v18, v3

    move v3, v15

    move-object/from16 v15, v17

    invoke-static/range {v4 .. v15}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v4, Lcom/ui/core/ui/sso/a$b;->a:Lcom/ui/core/ui/sso/a$b;

    invoke-virtual {v4}, Lcom/ui/core/ui/sso/a$b;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v4, Lcom/ui/core/ui/sso/d$c$b$a$a$c;

    move-object/from16 v6, p3

    invoke-direct {v4, v0, v1, v6, v2}, Lcom/ui/core/ui/sso/d$c$b$a$a$c;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lf2/w;)V

    const v2, 0x82b878f

    invoke-static {v2, v3, v4}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v13

    const/16 v14, 0xfe

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p4

    invoke-static/range {v4 .. v15}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v2, Lcom/ui/core/ui/sso/a$c;->a:Lcom/ui/core/ui/sso/a$c;

    invoke-virtual {v2}, Lcom/ui/core/ui/sso/a$c;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v2, Lcom/ui/core/ui/sso/d$c$b$a$a$d;

    invoke-direct {v2, v0, v1}, Lcom/ui/core/ui/sso/d$c$b$a$a$d;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;)V

    const v4, -0x4f7d12

    invoke-static {v4, v3, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v13

    const/16 v14, 0xe6

    move-object/from16 v4, p4

    move-object/from16 v8, v18

    move-object/from16 v9, v16

    invoke-static/range {v4 .. v15}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v2, Lcom/ui/core/ui/sso/a$e;->a:Lcom/ui/core/ui/sso/a$e;

    invoke-virtual {v2}, Lcom/ui/core/ui/sso/a$e;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v2, Lcom/ui/core/ui/sso/d$c$b$a$a$e;

    invoke-direct {v2, v0, v1}, Lcom/ui/core/ui/sso/d$c$b$a$a$e;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;)V

    const v0, -0x8ca81b3

    invoke-static {v0, v3, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v13

    invoke-static/range {v4 .. v15}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
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
.method public final e(LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:125)"

    const v4, -0x604736f6

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->a:Lf2/w;

    iget-object v2, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->b:Ljava/lang/String;

    const v3, 0x2e182619

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->c:Lcom/ui/core/ui/sso/d;

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->d:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->a:Lf2/w;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->e:LU9/h;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->c:Lcom/ui/core/ui/sso/d;

    iget-object v5, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->d:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v6, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->a:Lf2/w;

    iget-object v7, v0, Lcom/ui/core/ui/sso/d$c$b$a$a;->e:LU9/h;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_4

    :cond_3
    new-instance v8, Lcom/ui/core/ui/sso/g;

    invoke-direct {v8, v4, v5, v6, v7}, Lcom/ui/core/ui/sso/g;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;LU9/h;)V

    invoke-interface {v12, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v8

    check-cast v11, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v14, 0x0

    const/16 v15, 0x3fc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v15}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a$a;->e(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
