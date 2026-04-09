.class final Lda/f$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/f$a$b$a;->b(LT/l;I)V
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

.field final synthetic g:Lf2/w;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V
    .locals 0

    iput-object p1, p0, Lda/f$a$b$a$a;->a:Landroidx/fragment/app/Fragment;

    iput-boolean p2, p0, Lda/f$a$b$a$a;->b:Z

    iput-object p3, p0, Lda/f$a$b$a$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lda/f$a$b$a$a;->d:Lmh/a;

    iput-boolean p5, p0, Lda/f$a$b$a$a;->e:Z

    iput-object p6, p0, Lda/f$a$b$a$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p7, p0, Lda/f$a$b$a$a;->g:Lf2/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1}, Lda/f$a$b$a$a;->c(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lda/f$a$b$a$a$c;

    invoke-direct {p1, p0}, Lda/f$a$b$a$a$c;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    return-object p1
.end method


# virtual methods
.method public final b(Lq/b;Lf2/k;LT/l;I)V
    .locals 8

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "entry"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiRegister.kt:66)"

    const v1, -0xb013a68

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lda/f$a$b$a$a;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->O()Landroidx/lifecycle/k;

    move-result-object v2

    const-string p1, "<get-lifecycle>(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x2

    const-class v0, Lda/u;

    const/4 v1, 0x0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, LQ9/h;->m(Ljava/lang/Class;Landroid/os/Bundle;Landroidx/lifecycle/k;LT/l;II)LR9/a;

    move-result-object p1

    check-cast p1, Lda/u;

    const-string/jumbo p4, "editEmail"

    invoke-static {p2, p4}, LQ9/i;->a(Lf2/k;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lda/u;->t0()V

    :cond_1
    iget-boolean v1, p0, Lda/f$a$b$a$a;->b:Z

    iget-object v2, p0, Lda/f$a$b$a$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lda/f$a$b$a$a;->d:Lmh/a;

    iget-boolean v4, p0, Lda/f$a$b$a$a;->e:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lda/s;->n(Lda/u;ZLjava/lang/String;Lmh/a;ZLT/l;II)V

    const p2, -0x68050aed

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object p2, p0, Lda/f$a$b$a$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p2

    iget-object p4, p0, Lda/f$a$b$a$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p2, :cond_2

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_3

    :cond_2
    new-instance v0, Lda/f$a$b$a$a$a;

    invoke-direct {v0, p4, v1}, Lda/f$a$b$a$a$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Ldh/e;)V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    const-string/jumbo p2, "register"

    const/4 p4, 0x6

    invoke-static {p2, v0, p3, p4}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const v0, -0x6804f524

    invoke-interface {p3, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lda/f$a$b$a$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lda/f$a$b$a$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_4

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_5

    :cond_4
    new-instance v3, Lda/h;

    invoke-direct {v3, v2}, Lda/h;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V

    invoke-interface {p3, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {p2, v3, p3, p4}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    iget-object p2, p0, Lda/f$a$b$a$a;->g:Lf2/w;

    const p4, -0x6804d5c1

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, Lda/f$a$b$a$a;->a:Landroidx/fragment/app/Fragment;

    invoke-interface {p3, p4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lda/f$a$b$a$a;->g:Lf2/w;

    invoke-interface {p3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    iget-object v0, p0, Lda/f$a$b$a$a;->a:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lda/f$a$b$a$a;->g:Lf2/w;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p4, :cond_6

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v3, p4, :cond_7

    :cond_6
    new-instance v3, Lda/f$a$b$a$a$b;

    invoke-direct {v3, v0, p1, v2, v1}, Lda/f$a$b$a$a$b;-><init>(Landroidx/fragment/app/Fragment;Lda/u;Lf2/w;Ldh/e;)V

    invoke-interface {p3, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    const/4 p1, 0x0

    invoke-static {p2, v3, p3, p1}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lf2/k;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lda/f$a$b$a$a;->b(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
