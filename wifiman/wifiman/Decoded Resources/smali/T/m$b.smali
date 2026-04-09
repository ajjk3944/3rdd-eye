.class final LT/m$b;
.super LT/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Z

.field private final d:LT/z;

.field private e:Ljava/util/Set;

.field private final f:Ljava/util/Set;

.field private final g:LT/q0;

.field final synthetic h:LT/m;


# direct methods
.method public constructor <init>(LT/m;IZZLT/z;)V
    .locals 0

    iput-object p1, p0, LT/m$b;->h:LT/m;

    invoke-direct {p0}, LT/q;-><init>()V

    iput p2, p0, LT/m$b;->a:I

    iput-boolean p3, p0, LT/m$b;->b:Z

    iput-boolean p4, p0, LT/m$b;->c:Z

    iput-object p5, p0, LT/m$b;->d:LT/z;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LT/m$b;->f:Ljava/util/Set;

    invoke-static {}, Lb0/f;->a()Lb0/e;

    move-result-object p1

    invoke-static {}, LT/o1;->m()LT/n1;

    move-result-object p2

    invoke-static {p1, p2}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LT/m$b;->g:LT/q0;

    return-void
.end method

.method private final u()LT/A0;
    .locals 1

    iget-object v0, p0, LT/m$b;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/A0;

    return-object v0
.end method

.method private final v(LT/A0;)V
    .locals 1

    iget-object v0, p0, LT/m$b;->g:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LT/E;Lmh/p;)V
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LT/q;->a(LT/E;Lmh/p;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->Z(LT/m;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, LT/m;->f0(LT/m;I)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0}, LT/q;->c()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LT/m$b;->b:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LT/m$b;->c:Z

    return v0
.end method

.method public f()LT/A0;
    .locals 1

    invoke-direct {p0}, LT/m$b;->u()LT/A0;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LT/m$b;->a:I

    return v0
.end method

.method public h()Ldh/i;
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0}, LT/q;->h()Ldh/i;

    move-result-object v0

    return-object v0
.end method

.method public i()LT/z;
    .locals 1

    iget-object v0, p0, LT/m$b;->d:LT/z;

    return-object v0
.end method

.method public j(LT/l0;)V
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0, p1}, LT/q;->j(LT/l0;)V

    return-void
.end method

.method public k(LT/E;)V
    .locals 2

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    iget-object v1, p0, LT/m$b;->h:LT/m;

    invoke-virtual {v1}, LT/m;->F0()LT/E;

    move-result-object v1

    invoke-virtual {v0, v1}, LT/q;->k(LT/E;)V

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0, p1}, LT/q;->k(LT/E;)V

    return-void
.end method

.method public l(LT/l0;)LT/k0;
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0, p1}, LT/q;->l(LT/l0;)LT/k0;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/util/Set;)V
    .locals 1

    iget-object v0, p0, LT/m$b;->e:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LT/m$b;->e:Ljava/util/Set;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n(LT/l;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LT/m;

    invoke-super {p0, v0}, LT/q;->n(LT/l;)V

    iget-object v0, p0, LT/m$b;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public o(LT/E;)V
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0, p1}, LT/q;->o(LT/E;)V

    return-void
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->Z(LT/m;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, LT/m;->f0(LT/m;I)V

    return-void
.end method

.method public q(LT/l;)V
    .locals 3

    iget-object v0, p0, LT/m$b;->e:Ljava/util/Set;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, LT/m;

    invoke-static {v2}, LT/m;->d0(LT/m;)LT/b1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LT/m$b;->f:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/jvm/internal/V;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(LT/E;)V
    .locals 1

    iget-object v0, p0, LT/m$b;->h:LT/m;

    invoke-static {v0}, LT/m;->b0(LT/m;)LT/q;

    move-result-object v0

    invoke-virtual {v0, p1}, LT/q;->r(LT/E;)V

    return-void
.end method

.method public final s()V
    .locals 6

    iget-object v0, p0, LT/m$b;->f:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LT/m$b;->e:Ljava/util/Set;

    if-eqz v0, :cond_1

    iget-object v1, p0, LT/m$b;->f:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LT/m;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-static {v2}, LT/m;->d0(LT/m;)LT/b1;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, LT/m$b;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_2
    return-void
.end method

.method public final t()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LT/m$b;->f:Ljava/util/Set;

    return-object v0
.end method

.method public final w(LT/A0;)V
    .locals 0

    invoke-direct {p0, p1}, LT/m$b;->v(LT/A0;)V

    return-void
.end method
