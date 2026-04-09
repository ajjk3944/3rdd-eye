.class public final Lh8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh8/f;-><init>(Landroidx/lifecycle/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh8/f;


# direct methods
.method constructor <init>(Lh8/f;)V
    .locals 0

    iput-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->g(Landroidx/lifecycle/o;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    sget-object v0, Lh8/d;->RESUME:Lh8/d;

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public h(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->h(Landroidx/lifecycle/o;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    sget-object v0, Lh8/d;->CREATE:Lh8/d;

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onDestroy(Landroidx/lifecycle/o;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    sget-object v0, Lh8/d;->DESTROY:Lh8/d;

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    sget-object v0, Lh8/c;->VIEW_DESTROYED:Lh8/c;

    invoke-virtual {p1, v0}, Lh8/f;->a(Lh8/c;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    sget-object v0, Lh8/c;->DESTROYED:Lh8/c;

    invoke-virtual {p1, v0}, Lh8/f;->a(Lh8/c;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    invoke-virtual {p1}, LFg/c;->a()V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStart(Landroidx/lifecycle/o;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    sget-object v0, Lh8/d;->START:Lh8/d;

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/o;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    sget-object v0, Lh8/d;->STOP:Lh8/d;

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    sget-object v0, Lh8/c;->STOPPED:Lh8/c;

    invoke-virtual {p1, v0}, Lh8/f;->a(Lh8/c;)V

    return-void
.end method

.method public p(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->p(Landroidx/lifecycle/o;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    invoke-virtual {p1}, Lh8/f;->b()LFg/c;

    move-result-object p1

    sget-object v0, Lh8/d;->PAUSE:Lh8/d;

    invoke-virtual {p1, v0}, LFg/c;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lh8/f$a;->a:Lh8/f;

    sget-object v0, Lh8/c;->PAUSED:Lh8/c;

    invoke-virtual {p1, v0}, Lh8/f;->a(Lh8/c;)V

    return-void
.end method
