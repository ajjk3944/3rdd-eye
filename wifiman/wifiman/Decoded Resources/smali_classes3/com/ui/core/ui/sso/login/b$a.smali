.class final Lcom/ui/core/ui/sso/login/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/b;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/Fragment;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lmh/a;

.field final synthetic e:Z

.field final synthetic f:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic g:Lmh/l;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/b$a;->a:Landroidx/fragment/app/Fragment;

    iput-boolean p2, p0, Lcom/ui/core/ui/sso/login/b$a;->b:Z

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/b$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/core/ui/sso/login/b$a;->d:Lmh/a;

    iput-boolean p5, p0, Lcom/ui/core/ui/sso/login/b$a;->e:Z

    iput-object p6, p0, Lcom/ui/core/ui/sso/login/b$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p7, p0, Lcom/ui/core/ui/sso/login/b$a;->g:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LQ9/j;
    .locals 1

    invoke-static {}, Lcom/ui/core/ui/sso/login/b$a;->c()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LQ9/j;
    .locals 1

    new-instance v0, Lcom/ui/core/ui/sso/login/b$a$a;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/login/b$a$a;-><init>()V

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

    const-string/jumbo v1, "com.ui.core.ui.sso.login.UiLogin.<anonymous> (UiLogin.kt:48)"

    const v2, 0x33a2cb13

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Lcom/ui/core/ui/sso/login/f$a;->a:Lcom/ui/core/ui/sso/login/f$a;

    invoke-virtual {p2}, Lcom/ui/core/ui/sso/login/f$a;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/b$a;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o1()Landroidx/fragment/app/j;

    move-result-object v9

    const-string/jumbo v0, "requireActivity(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5c4617a8

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    new-instance v0, Lcom/ui/core/ui/sso/login/a;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/login/a;-><init>()V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v0

    check-cast v10, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    new-instance v11, Lcom/ui/core/ui/sso/login/b$a$b;

    iget-boolean v2, p0, Lcom/ui/core/ui/sso/login/b$a;->b:Z

    iget-object v3, p0, Lcom/ui/core/ui/sso/login/b$a;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/core/ui/sso/login/b$a;->d:Lmh/a;

    iget-boolean v5, p0, Lcom/ui/core/ui/sso/login/b$a;->e:Z

    iget-object v6, p0, Lcom/ui/core/ui/sso/login/b$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v7, p0, Lcom/ui/core/ui/sso/login/b$a;->a:Landroidx/fragment/app/Fragment;

    iget-object v8, p0, Lcom/ui/core/ui/sso/login/b$a;->g:Lmh/l;

    move-object v0, v11

    move-object v1, p2

    invoke-direct/range {v0 .. v8}, Lcom/ui/core/ui/sso/login/b$a$b;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;Lmh/l;)V

    const/16 v0, 0x36

    const v1, -0x1aeca818

    const/4 v2, 0x1

    invoke-static {v1, v2, v11, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const v7, 0x301b0

    const/16 v8, 0x18

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object v1, v10

    move-object v2, p2

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/core/ui/sso/login/b$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
