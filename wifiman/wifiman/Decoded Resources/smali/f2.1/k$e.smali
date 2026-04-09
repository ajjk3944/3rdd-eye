.class final Lf2/k$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/k;-><init>(Landroid/content/Context;Lf2/r;Landroid/os/Bundle;Landroidx/lifecycle/k$b;Lf2/C;Ljava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/k;


# direct methods
.method constructor <init>(Lf2/k;)V
    .locals 0

    iput-object p1, p0, Lf2/k$e;->a:Lf2/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/E;
    .locals 4

    iget-object v0, p0, Lf2/k$e;->a:Lf2/k;

    invoke-static {v0}, Lf2/k;->c(Lf2/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf2/k$e;->a:Lf2/k;

    invoke-virtual {v0}, Lf2/k;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_0

    new-instance v0, Landroidx/lifecycle/P;

    iget-object v1, p0, Lf2/k$e;->a:Lf2/k;

    new-instance v2, Lf2/k$b;

    iget-object v3, p0, Lf2/k$e;->a:Lf2/k;

    invoke-direct {v2, v3}, Lf2/k$b;-><init>(Lq2/f;)V

    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;)V

    const-class v1, Lf2/k$c;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/P;->a(Ljava/lang/Class;)Landroidx/lifecycle/N;

    move-result-object v0

    check-cast v0, Lf2/k$c;

    invoke-virtual {v0}, Lf2/k$c;->X()Landroidx/lifecycle/E;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle after the NavBackStackEntry is destroyed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s SavedStateHandle until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf2/k$e;->a()Landroidx/lifecycle/E;

    move-result-object v0

    return-object v0
.end method
