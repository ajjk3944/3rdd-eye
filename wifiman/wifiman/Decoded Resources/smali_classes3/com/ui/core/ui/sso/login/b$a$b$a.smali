.class final Lcom/ui/core/ui/sso/login/b$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/b$a$b;->a(Lf2/w;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/w;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lmh/a;

.field final synthetic f:Z

.field final synthetic g:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic h:Landroidx/fragment/app/Fragment;

.field final synthetic i:Lmh/l;


# direct methods
.method constructor <init>(Lf2/w;Ljava/lang/String;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->a:Lf2/w;

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->c:Z

    iput-object p4, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->e:Lmh/a;

    iput-boolean p6, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->f:Z

    iput-object p7, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->g:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p8, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->h:Landroidx/fragment/app/Fragment;

    iput-object p9, p0, Lcom/ui/core/ui/sso/login/b$a$b$a;->i:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;Lf2/u;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/ui/core/ui/sso/login/b$a$b$a;->c(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;Lf2/u;)LYg/J;
    .locals 13

    const-string v0, "$this$NavHost"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/core/ui/sso/login/f$a;->a:Lcom/ui/core/ui/sso/login/f$a;

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/login/f$a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lcom/ui/core/ui/sso/login/b$a$b$a$a;

    move-object v3, v0

    move v4, p0

    move-object v5, p1

    move-object v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    invoke-direct/range {v3 .. v11}, Lcom/ui/core/ui/sso/login/b$a$b$a$a;-><init>(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;)V

    const v3, 0x2623720f

    const/4 v4, 0x1

    invoke-static {v3, v4, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v10

    const/16 v11, 0xfe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 22

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.login.UiLogin.<anonymous>.<anonymous>.<anonymous> (UiLogin.kt:58)"

    const v4, -0xcabbcd4

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->a:Lf2/w;

    iget-object v2, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->b:Ljava/lang/String;

    const v3, -0x277a08e7

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-boolean v3, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->c:Z

    invoke-interface {v12, v3}, LT/l;->c(Z)Z

    move-result v3

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->d:Ljava/lang/String;

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->e:Lmh/a;

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-boolean v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->f:Z

    invoke-interface {v12, v4}, LT/l;->c(Z)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->g:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->a:Lf2/w;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->h:Landroidx/fragment/app/Fragment;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->i:Lmh/l;

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-boolean v14, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->c:Z

    iget-object v15, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->d:Ljava/lang/String;

    iget-object v4, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->e:Lmh/a;

    iget-boolean v5, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->f:Z

    iget-object v6, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->g:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v7, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->a:Lf2/w;

    iget-object v8, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->h:Landroidx/fragment/app/Fragment;

    iget-object v9, v0, Lcom/ui/core/ui/sso/login/b$a$b$a;->i:Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v10, v3, :cond_4

    :cond_3
    new-instance v10, Lcom/ui/core/ui/sso/login/c;

    move-object v13, v10

    move-object/from16 v16, v4

    move/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    invoke-direct/range {v13 .. v21}, Lcom/ui/core/ui/sso/login/c;-><init>(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;)V

    invoke-interface {v12, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v10

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

    const/16 v13, 0x30

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/login/b$a$b$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
