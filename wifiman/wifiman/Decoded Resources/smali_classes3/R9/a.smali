.class public abstract LR9/a;
.super Landroidx/lifecycle/N;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# instance fields
.field public b:LQ9/j;

.field private final c:Lhg/b;

.field private final d:Lhg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/N;-><init>()V

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    iput-object v0, p0, LR9/a;->c:Lhg/b;

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    iput-object v0, p0, LR9/a;->d:Lhg/b;

    return-void
.end method


# virtual methods
.method protected W()V
    .locals 1

    invoke-super {p0}, Landroidx/lifecycle/N;->W()V

    iget-object v0, p0, LR9/a;->d:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->d()V

    return-void
.end method

.method public X()LQ9/j;
    .locals 1

    iget-object v0, p0, LR9/a;->b:LQ9/j;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "viewRouter"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Y()V
    .locals 0

    return-void
.end method

.method public Z()V
    .locals 0

    return-void
.end method

.method public a0()V
    .locals 0

    return-void
.end method

.method public b0(LQ9/j;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LR9/a;->b:LQ9/j;

    return-void
.end method

.method protected final c0(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "disposable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LR9/a;->d:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->a(Lhg/c;)Z

    return-void
.end method

.method protected final d0(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "disposable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LR9/a;->c:Lhg/b;

    invoke-virtual {v0, p1}, Lhg/b;->a(Lhg/c;)Z

    return-void
.end method

.method public onStop(Landroidx/lifecycle/o;)V
    .locals 1

    const-string/jumbo v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/e;->onStop(Landroidx/lifecycle/o;)V

    invoke-virtual {p0}, LR9/a;->a0()V

    iget-object p1, p0, LR9/a;->c:Lhg/b;

    invoke-virtual {p1}, Lhg/b;->d()V

    return-void
.end method
