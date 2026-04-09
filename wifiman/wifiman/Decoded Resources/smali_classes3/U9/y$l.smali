.class final LU9/y$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y;->C(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/Fragment;

.field final synthetic b:LU9/f;

.field final synthetic c:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic d:LU9/h;

.field final synthetic e:Lmh/l;

.field final synthetic f:LU9/f;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;LU9/f;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/l;LU9/f;)V
    .locals 0

    iput-object p1, p0, LU9/y$l;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, LU9/y$l;->b:LU9/f;

    iput-object p3, p0, LU9/y$l;->c:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p4, p0, LU9/y$l;->d:LU9/h;

    iput-object p5, p0, LU9/y$l;->e:Lmh/l;

    iput-object p6, p0, LU9/y$l;->f:LU9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LQ9/j;
    .locals 1

    invoke-static {}, LU9/y$l;->c()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LQ9/j;
    .locals 1

    new-instance v0, LU9/y$l$a;

    invoke-direct {v0}, LU9/y$l$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous> (UiMFA.kt:90)"

    const v2, 0x54cac2e1

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LU9/y$l;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->o1()Landroidx/fragment/app/j;

    move-result-object v0

    const-string/jumbo p2, "requireActivity(...)"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    new-array v1, p2, [Lf2/D;

    invoke-static {v1, p1, p2}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v4

    iget-object p2, p0, LU9/y$l;->b:LU9/f;

    invoke-interface {p2}, LQ9/j$b;->a()Ljava/lang/String;

    move-result-object v2

    const p2, -0x5f0cbbaa

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_3

    new-instance p2, LU9/F;

    invoke-direct {p2}, LU9/F;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v1, p2

    check-cast v1, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    new-instance p2, LU9/y$l$b;

    iget-object v6, p0, LU9/y$l;->c:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v7, p0, LU9/y$l;->d:LU9/h;

    iget-object v8, p0, LU9/y$l;->b:LU9/f;

    iget-object v9, p0, LU9/y$l;->e:Lmh/l;

    iget-object v10, p0, LU9/y$l;->a:Landroidx/fragment/app/Fragment;

    iget-object v11, p0, LU9/y$l;->f:LU9/f;

    move-object v5, p2

    invoke-direct/range {v5 .. v11}, LU9/y$l$b;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;LU9/f;Lmh/l;Landroidx/fragment/app/Fragment;LU9/f;)V

    const/16 v3, 0x36

    const v5, 0x402cffec

    const/4 v6, 0x1

    invoke-static {v5, v6, p2, p1, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const v7, 0x30030

    const/16 v8, 0x8

    const/4 v3, 0x0

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LU9/y$l;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
