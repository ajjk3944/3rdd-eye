.class public final Lc/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/G$f;,
        Lc/G$g;,
        Lc/G$h;,
        Lc/G$i;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private final b:LE1/a;

.field private final c:LZg/m;

.field private d:Lc/F;

.field private e:Landroid/window/OnBackInvokedCallback;

.field private f:Landroid/window/OnBackInvokedDispatcher;

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0}, Lc/G;-><init>(Ljava/lang/Runnable;LE1/a;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;LE1/a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/G;->a:Ljava/lang/Runnable;

    .line 3
    iput-object p2, p0, Lc/G;->b:LE1/a;

    .line 4
    new-instance p1, LZg/m;

    invoke-direct {p1}, LZg/m;-><init>()V

    iput-object p1, p0, Lc/G;->c:LZg/m;

    .line 5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_1

    const/16 p2, 0x22

    if-lt p1, p2, :cond_0

    .line 6
    sget-object p1, Lc/G$g;->a:Lc/G$g;

    new-instance p2, Lc/G$a;

    invoke-direct {p2, p0}, Lc/G$a;-><init>(Lc/G;)V

    new-instance v0, Lc/G$b;

    invoke-direct {v0, p0}, Lc/G$b;-><init>(Lc/G;)V

    new-instance v1, Lc/G$c;

    invoke-direct {v1, p0}, Lc/G$c;-><init>(Lc/G;)V

    new-instance v2, Lc/G$d;

    invoke-direct {v2, p0}, Lc/G$d;-><init>(Lc/G;)V

    invoke-virtual {p1, p2, v0, v1, v2}, Lc/G$g;->a(Lmh/l;Lmh/l;Lmh/a;Lmh/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lc/G$f;->a:Lc/G$f;

    new-instance p2, Lc/G$e;

    invoke-direct {p2, p0}, Lc/G$e;-><init>(Lc/G;)V

    invoke-virtual {p1, p2}, Lc/G$f;->b(Lmh/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    .line 8
    :goto_0
    iput-object p1, p0, Lc/G;->e:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method

.method public static final synthetic a(Lc/G;)Lc/F;
    .locals 0

    iget-object p0, p0, Lc/G;->d:Lc/F;

    return-object p0
.end method

.method public static final synthetic b(Lc/G;)LZg/m;
    .locals 0

    iget-object p0, p0, Lc/G;->c:LZg/m;

    return-object p0
.end method

.method public static final synthetic c(Lc/G;)V
    .locals 0

    invoke-direct {p0}, Lc/G;->k()V

    return-void
.end method

.method public static final synthetic d(Lc/G;Lc/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/G;->m(Lc/b;)V

    return-void
.end method

.method public static final synthetic e(Lc/G;Lc/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/G;->n(Lc/b;)V

    return-void
.end method

.method public static final synthetic f(Lc/G;Lc/F;)V
    .locals 0

    iput-object p1, p0, Lc/G;->d:Lc/F;

    return-void
.end method

.method public static final synthetic g(Lc/G;)V
    .locals 0

    invoke-direct {p0}, Lc/G;->q()V

    return-void
.end method

.method private final k()V
    .locals 4

    iget-object v0, p0, Lc/G;->d:Lc/F;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/G;->c:LZg/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lc/F;

    invoke-virtual {v3}, Lc/F;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Lc/F;

    :cond_2
    iput-object v1, p0, Lc/G;->d:Lc/F;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lc/F;->c()V

    :cond_3
    return-void
.end method

.method private final m(Lc/b;)V
    .locals 3

    iget-object v0, p0, Lc/G;->d:Lc/F;

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/G;->c:LZg/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lc/F;

    invoke-virtual {v2}, Lc/F;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v0, v1

    check-cast v0, Lc/F;

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lc/F;->e(Lc/b;)V

    :cond_3
    return-void
.end method

.method private final n(Lc/b;)V
    .locals 3

    iget-object v0, p0, Lc/G;->c:LZg/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lc/F;

    invoke-virtual {v2}, Lc/F;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lc/F;

    iget-object v0, p0, Lc/G;->d:Lc/F;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lc/G;->k()V

    :cond_2
    iput-object v1, p0, Lc/G;->d:Lc/F;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Lc/F;->f(Lc/b;)V

    :cond_3
    return-void
.end method

.method private final p(Z)V
    .locals 4

    iget-object v0, p0, Lc/G;->f:Landroid/window/OnBackInvokedDispatcher;

    iget-object v1, p0, Lc/G;->e:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-boolean v3, p0, Lc/G;->g:Z

    if-nez v3, :cond_0

    sget-object p1, Lc/G$f;->a:Lc/G$f;

    invoke-virtual {p1, v0, v2, v1}, Lc/G$f;->d(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc/G;->g:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lc/G;->g:Z

    if-eqz p1, :cond_1

    sget-object p1, Lc/G$f;->a:Lc/G$f;

    invoke-virtual {p1, v0, v1}, Lc/G$f;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Lc/G;->g:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private final q()V
    .locals 4

    iget-boolean v0, p0, Lc/G;->h:Z

    iget-object v1, p0, Lc/G;->c:LZg/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/F;

    invoke-virtual {v3}, Lc/F;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    :cond_2
    :goto_0
    iput-boolean v2, p0, Lc/G;->h:Z

    if-eq v2, v0, :cond_4

    iget-object v0, p0, Lc/G;->b:LE1/a;

    if-eqz v0, :cond_3

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LE1/a;->accept(Ljava/lang/Object;)V

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    invoke-direct {p0, v2}, Lc/G;->p(Z)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/o;Lc/F;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lc/G$h;

    invoke-direct {v0, p0, p1, p2}, Lc/G$h;-><init>(Lc/G;Landroidx/lifecycle/k;Lc/F;)V

    invoke-virtual {p2, v0}, Lc/F;->a(Lc/c;)V

    invoke-direct {p0}, Lc/G;->q()V

    new-instance p1, Lc/G$j;

    invoke-direct {p1, p0}, Lc/G$j;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Lc/F;->k(Lmh/a;)V

    return-void
.end method

.method public final i(Lc/F;)V
    .locals 1

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lc/G;->j(Lc/F;)Lc/c;

    return-void
.end method

.method public final j(Lc/F;)Lc/c;
    .locals 2

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc/G;->c:LZg/m;

    invoke-virtual {v0, p1}, LZg/m;->add(Ljava/lang/Object;)Z

    new-instance v0, Lc/G$i;

    invoke-direct {v0, p0, p1}, Lc/G$i;-><init>(Lc/G;Lc/F;)V

    invoke-virtual {p1, v0}, Lc/F;->a(Lc/c;)V

    invoke-direct {p0}, Lc/G;->q()V

    new-instance v1, Lc/G$k;

    invoke-direct {v1, p0}, Lc/G$k;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lc/F;->k(Lmh/a;)V

    return-object v0
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lc/G;->d:Lc/F;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/G;->c:LZg/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lc/F;

    invoke-virtual {v3}, Lc/F;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Lc/F;

    :cond_2
    iput-object v1, p0, Lc/G;->d:Lc/F;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lc/F;->d()V

    return-void

    :cond_3
    iget-object v0, p0, Lc/G;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_4
    return-void
.end method

.method public final o(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 1

    const-string v0, "invoker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lc/G;->f:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, p0, Lc/G;->h:Z

    invoke-direct {p0, p1}, Lc/G;->p(Z)V

    return-void
.end method
