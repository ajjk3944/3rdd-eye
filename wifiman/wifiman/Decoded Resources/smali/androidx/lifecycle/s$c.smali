.class Landroidx/lifecycle/s$c;
.super Landroidx/lifecycle/s$d;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final e:Landroidx/lifecycle/o;

.field final synthetic f:Landroidx/lifecycle/s;


# direct methods
.method constructor <init>(Landroidx/lifecycle/s;Landroidx/lifecycle/o;Landroidx/lifecycle/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/s$c;->f:Landroidx/lifecycle/s;

    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/s$d;-><init>(Landroidx/lifecycle/s;Landroidx/lifecycle/v;)V

    iput-object p2, p0, Landroidx/lifecycle/s$c;->e:Landroidx/lifecycle/o;

    return-void
.end method


# virtual methods
.method b()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/s$c;->e:Landroidx/lifecycle/o;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    return-void
.end method

.method c(Landroidx/lifecycle/o;)Z
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/s$c;->e:Landroidx/lifecycle/o;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method d()Z
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/s$c;->e:Landroidx/lifecycle/o;

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->STARTED:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result v0

    return v0
.end method

.method public j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 1

    iget-object p1, p0, Landroidx/lifecycle/s$c;->e:Landroidx/lifecycle/o;

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object p2, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/s$c;->f:Landroidx/lifecycle/s;

    iget-object p2, p0, Landroidx/lifecycle/s$d;->a:Landroidx/lifecycle/v;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/s;->m(Landroidx/lifecycle/v;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eq p2, p1, :cond_1

    invoke-virtual {p0}, Landroidx/lifecycle/s$c;->d()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/lifecycle/s$d;->a(Z)V

    iget-object p2, p0, Landroidx/lifecycle/s$c;->e:Landroidx/lifecycle/o;

    invoke-interface {p2}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method
