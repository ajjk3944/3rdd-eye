.class final Landroidx/compose/ui/platform/K1$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/K1;->e(Lmh/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/K1;

.field final synthetic b:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/K1;Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    iput-object p2, p0, Landroidx/compose/ui/platform/K1$a;->b:Lmh/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/r$b;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    invoke-static {v0}, Landroidx/compose/ui/platform/K1;->y(Landroidx/compose/ui/platform/K1;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    iget-object v1, p0, Landroidx/compose/ui/platform/K1$a;->b:Lmh/p;

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/K1;->A(Landroidx/compose/ui/platform/K1;Lmh/p;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    invoke-static {v0}, Landroidx/compose/ui/platform/K1;->x(Landroidx/compose/ui/platform/K1;)Landroidx/lifecycle/k;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    invoke-static {v0, p1}, Landroidx/compose/ui/platform/K1;->z(Landroidx/compose/ui/platform/K1;Landroidx/lifecycle/k;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k$b;->isAtLeast(Landroidx/lifecycle/k$b;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/K1;->B()LT/p;

    move-result-object p1

    new-instance v0, Landroidx/compose/ui/platform/K1$a$a;

    iget-object v1, p0, Landroidx/compose/ui/platform/K1$a;->a:Landroidx/compose/ui/platform/K1;

    iget-object v2, p0, Landroidx/compose/ui/platform/K1$a;->b:Lmh/p;

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/K1$a$a;-><init>(Landroidx/compose/ui/platform/K1;Lmh/p;)V

    const v1, -0x773f589e

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    invoke-interface {p1, v0}, LT/p;->e(Lmh/p;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/r$b;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/K1$a;->a(Landroidx/compose/ui/platform/r$b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
