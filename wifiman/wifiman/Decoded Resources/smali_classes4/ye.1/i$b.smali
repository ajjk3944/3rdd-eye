.class public final Lye/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/i;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/e;

.field final synthetic b:Landroidx/appcompat/app/c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/e;Landroidx/appcompat/app/c;)V
    .locals 0

    iput-object p1, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    iput-object p2, p0, Lye/i$b;->b:Landroidx/appcompat/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->g(Landroidx/lifecycle/o;)V

    iget-object v0, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->g(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public h(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/o;)V

    iget-object v0, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onDestroy(Landroidx/lifecycle/o;)V

    iget-object v0, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onDestroy(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStart(Landroidx/lifecycle/o;)V

    iget-object v0, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onStart(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/o;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/o;)V

    iget-object v0, p0, Lye/i$b;->b:Landroidx/appcompat/app/c;

    invoke-virtual {v0}, Lc/j;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->RESUMED:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/o;)V

    :cond_0
    return-void
.end method

.method public p(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->p(Landroidx/lifecycle/o;)V

    iget-object v0, p0, Lye/i$b;->a:Landroidx/lifecycle/e;

    invoke-interface {v0, p1}, Landroidx/lifecycle/e;->p(Landroidx/lifecycle/o;)V

    return-void
.end method
