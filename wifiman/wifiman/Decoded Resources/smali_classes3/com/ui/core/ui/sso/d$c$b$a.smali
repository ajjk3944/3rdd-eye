.class final Lcom/ui/core/ui/sso/d$c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c$b;->b(Lf2/w;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/d;

.field final synthetic b:Lf2/w;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;Lf2/w;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a;->b:Lf2/w;

    iput-object p3, p0, Lcom/ui/core/ui/sso/d$c$b$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p1

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:115)"

    const v4, -0x3a9de29e

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object v2

    iget-object v1, v0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->O()Landroidx/lifecycle/k;

    move-result-object v3

    const-string v1, "<get-lifecycle>(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-class v1, Lcom/ui/core/ui/sso/SSOAccountVM;

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v6}, LQ9/h;->m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/ui/core/ui/sso/SSOAccountVM;

    const v1, -0x2a54b2b1

    invoke-interface {v7, v1}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v15, LT/l;->a:LT/l$a;

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_3

    new-instance v1, LU9/h;

    invoke-direct {v1}, LU9/h;-><init>()V

    invoke-interface {v7, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v13, v1

    check-cast v13, LU9/h;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-object v1, v0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-static {v1}, Lcom/ui/core/ui/sso/d;->H1(Lcom/ui/core/ui/sso/d;)Lcom/ui/core/ui/sso/UiSSO$g;

    move-result-object v1

    const v2, -0x2a54a8d1

    invoke-interface {v7, v2}, LT/l;->U(I)V

    sget-object v2, Lcom/ui/core/ui/sso/UiSSO$g;->FOLLOW_SYSTEM:Lcom/ui/core/ui/sso/UiSSO$g;

    const/4 v3, 0x1

    const/4 v6, 0x0

    if-ne v1, v2, :cond_4

    invoke-static {v7, v6}, Ls/m;->a(LT/l;I)Z

    move-result v1

    goto :goto_1

    :cond_4
    sget-object v2, Lcom/ui/core/ui/sso/UiSSO$g;->LIGHT:Lcom/ui/core/ui/sso/UiSSO$g;

    if-ne v1, v2, :cond_5

    move v1, v6

    goto :goto_1

    :cond_5
    sget-object v2, Lcom/ui/core/ui/sso/UiSSO$g;->DARK:Lcom/ui/core/ui/sso/UiSSO$g;

    if-ne v1, v2, :cond_9

    move v1, v3

    :goto_1
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v2, Lcom/ui/core/ui/sso/d$c$b$a$a;

    iget-object v9, v0, Lcom/ui/core/ui/sso/d$c$b$a;->b:Lf2/w;

    iget-object v10, v0, Lcom/ui/core/ui/sso/d$c$b$a;->c:Ljava/lang/String;

    iget-object v11, v0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    move-object v8, v2

    move-object v12, v14

    invoke-direct/range {v8 .. v13}, Lcom/ui/core/ui/sso/d$c$b$a$a;-><init>(Lf2/w;Ljava/lang/String;Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;)V

    const/16 v4, 0x36

    const v5, -0x604736f6

    invoke-static {v5, v3, v2, v7, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v8, 0x2

    const/4 v2, 0x0

    move-object/from16 v4, p1

    move v9, v6

    move v6, v8

    invoke-static/range {v1 .. v6}, Lla/g;->j(ZLra/d;Lmh/p;LT/l;II)V

    iget-object v1, v0, Lcom/ui/core/ui/sso/d$c$b$a;->b:Lf2/w;

    const v2, -0x2a526c73

    invoke-interface {v7, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v7, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lcom/ui/core/ui/sso/d$c$b$a;->a:Lcom/ui/core/ui/sso/d;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_6

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_7

    :cond_6
    new-instance v4, Lcom/ui/core/ui/sso/d$c$b$a$b;

    const/4 v2, 0x0

    invoke-direct {v4, v3, v14, v2}, Lcom/ui/core/ui/sso/d$c$b$a$b;-><init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v1, v4, v7, v9}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_2
    return-void

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/d$c$b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
