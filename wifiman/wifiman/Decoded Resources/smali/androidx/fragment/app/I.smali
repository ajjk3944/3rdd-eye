.class Landroidx/fragment/app/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;
.implements Lq2/f;
.implements Landroidx/lifecycle/S;


# instance fields
.field private final a:Landroidx/fragment/app/Fragment;

.field private final b:Landroidx/lifecycle/Q;

.field private c:Landroidx/lifecycle/P$c;

.field private d:Landroidx/lifecycle/p;

.field private e:Lq2/e;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    iput-object v0, p0, Landroidx/fragment/app/I;->e:Lq2/e;

    iput-object p1, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/I;->b:Landroidx/lifecycle/Q;

    return-void
.end method


# virtual methods
.method public O()Landroidx/lifecycle/k;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/I;->c()V

    iget-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    return-object v0
.end method

.method a(Landroidx/lifecycle/k$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p;->h(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method c()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/p;

    invoke-direct {v0, p0}, Landroidx/lifecycle/p;-><init>(Landroidx/lifecycle/o;)V

    iput-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    invoke-static {p0}, Lq2/e;->a(Lq2/f;)Lq2/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/I;->e:Lq2/e;

    invoke-virtual {v0}, Lq2/e;->c()V

    invoke-static {p0}, Landroidx/lifecycle/H;->c(Lq2/f;)V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/I;->e:Lq2/e;

    invoke-virtual {v0, p1}, Lq2/e;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method f(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/I;->e:Lq2/e;

    invoke-virtual {v0, p1}, Lq2/e;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public g()Landroidx/lifecycle/P$c;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->g()Landroidx/lifecycle/P$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->m1:Landroidx/lifecycle/P$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, Landroidx/fragment/app/I;->c:Landroidx/lifecycle/P$c;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/I;->c:Landroidx/lifecycle/P$c;

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Landroidx/lifecycle/K;

    iget-object v2, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v0, p0, v2}, Landroidx/lifecycle/K;-><init>(Landroid/app/Application;Lq2/f;Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/I;->c:Landroidx/lifecycle/P$c;

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/I;->c:Landroidx/lifecycle/P$c;

    return-object v0
.end method

.method public h()Lb2/a;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Lb2/b;

    invoke-direct {v1}, Lb2/b;-><init>()V

    if-eqz v0, :cond_2

    sget-object v2, Landroidx/lifecycle/P$a;->h:Lb2/a$b;

    invoke-virtual {v1, v2, v0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Landroidx/lifecycle/H;->a:Lb2/a$b;

    invoke-virtual {v1, v0, p0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    sget-object v0, Landroidx/lifecycle/H;->b:Lb2/a$b;

    invoke-virtual {v1, v0, p0}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/lifecycle/H;->c:Lb2/a$b;

    iget-object v2, p0, Landroidx/fragment/app/I;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->q()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lb2/b;->c(Lb2/a$b;Ljava/lang/Object;)V

    :cond_3
    return-object v1
.end method

.method i(Landroidx/lifecycle/k$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/I;->d:Landroidx/lifecycle/p;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p;->m(Landroidx/lifecycle/k$b;)V

    return-void
.end method

.method public o()Landroidx/lifecycle/Q;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/I;->c()V

    iget-object v0, p0, Landroidx/fragment/app/I;->b:Landroidx/lifecycle/Q;

    return-object v0
.end method

.method public t()Lq2/d;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/I;->c()V

    iget-object v0, p0, Landroidx/fragment/app/I;->e:Lq2/e;

    invoke-virtual {v0}, Lq2/e;->b()Lq2/d;

    move-result-object v0

    return-object v0
.end method
