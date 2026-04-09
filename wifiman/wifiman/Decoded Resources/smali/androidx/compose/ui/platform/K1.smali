.class final Landroidx/compose/ui/platform/K1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/p;
.implements Landroidx/lifecycle/m;


# instance fields
.field private final a:Landroidx/compose/ui/platform/r;

.field private final b:LT/p;

.field private c:Z

.field private d:Landroidx/lifecycle/k;

.field private e:Lmh/p;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/r;LT/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/K1;->a:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Landroidx/compose/ui/platform/K1;->b:LT/p;

    sget-object p1, Landroidx/compose/ui/platform/i0;->a:Landroidx/compose/ui/platform/i0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/i0;->a()Lmh/p;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/K1;->e:Lmh/p;

    return-void
.end method

.method public static final synthetic A(Landroidx/compose/ui/platform/K1;Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/K1;->e:Lmh/p;

    return-void
.end method

.method public static final synthetic x(Landroidx/compose/ui/platform/K1;)Landroidx/lifecycle/k;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/K1;->d:Landroidx/lifecycle/k;

    return-object p0
.end method

.method public static final synthetic y(Landroidx/compose/ui/platform/K1;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/platform/K1;->c:Z

    return p0
.end method

.method public static final synthetic z(Landroidx/compose/ui/platform/K1;Landroidx/lifecycle/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/K1;->d:Landroidx/lifecycle/k;

    return-void
.end method


# virtual methods
.method public final B()LT/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->b:LT/p;

    return-object v0
.end method

.method public final C()Landroidx/compose/ui/platform/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->a:Landroidx/compose/ui/platform/r;

    return-object v0
.end method

.method public dispose()V
    .locals 3

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K1;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K1;->c:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lf0/h;->L:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->d:Landroidx/lifecycle/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->b:LT/p;

    invoke-interface {v0}, LT/p;->dispose()V

    return-void
.end method

.method public e(Lmh/p;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/K1;->a:Landroidx/compose/ui/platform/r;

    new-instance v1, Landroidx/compose/ui/platform/K1$a;

    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/platform/K1$a;-><init>(Landroidx/compose/ui/platform/K1;Lmh/p;)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/r;->setOnViewTreeOwnersAvailable(Lmh/l;)V

    return-void
.end method

.method public j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 0

    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/K1;->dispose()V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_1

    iget-boolean p1, p0, Landroidx/compose/ui/platform/K1;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/platform/K1;->e:Lmh/p;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/K1;->e(Lmh/p;)V

    :cond_1
    :goto_0
    return-void
.end method
