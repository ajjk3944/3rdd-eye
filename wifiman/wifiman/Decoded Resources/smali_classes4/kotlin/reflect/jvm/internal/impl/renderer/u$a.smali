.class final Lkotlin/reflect/jvm/internal/impl/renderer/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/renderer/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/renderer/u$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlin/reflect/jvm/internal/impl/renderer/u;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/renderer/u;)V
    .locals 0

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final t(LBh/X;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->P0()Lkotlin/reflect/jvm/internal/impl/renderer/E;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/u$a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 p3, 0x2

    if-eq v0, p3, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->p(LBh/z;Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->X(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/X;Ljava/lang/StringBuilder;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " for "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-interface {p1}, LBh/X;->C0()LBh/Y;

    move-result-object p1

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->e0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/Y;Ljava/lang/StringBuilder;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A(LBh/s0;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, p2, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->h0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/s0;ZLjava/lang/StringBuilder;Z)V

    return-void
.end method

.method public bridge synthetic a(LBh/z;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->p(LBh/z;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic b(LBh/U;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->s(LBh/U;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic c(LBh/l0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->z(LBh/l0;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic d(LBh/s0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->A(LBh/s0;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic e(LBh/Y;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->u(LBh/Y;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic f(LBh/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->o(LBh/l;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic g(LBh/k0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->y(LBh/k0;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic h(LBh/G;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->q(LBh/G;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic i(LBh/b0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->x(LBh/b0;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic j(LBh/a0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->w(LBh/a0;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic k(LBh/M;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->r(LBh/M;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic l(LBh/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->n(LBh/e;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic m(LBh/Z;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->v(LBh/Z;Ljava/lang/StringBuilder;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public n(LBh/e;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->Y(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/e;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public o(LBh/l;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "constructorDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->Z(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/l;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public p(LBh/z;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->a0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/z;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public q(LBh/G;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->b0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/m;Ljava/lang/StringBuilder;Z)V

    return-void
.end method

.method public r(LBh/M;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->c0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/M;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public s(LBh/U;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->d0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/U;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public u(LBh/Y;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->e0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/Y;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public v(LBh/Z;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getter"

    invoke-direct {p0, p1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->t(LBh/X;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public w(LBh/a0;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setter"

    invoke-direct {p0, p1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->t(LBh/X;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public x(LBh/b0;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public y(LBh/k0;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    invoke-static {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->f0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/k0;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public z(LBh/l0;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/renderer/u$a;->a:Lkotlin/reflect/jvm/internal/impl/renderer/u;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/u;->g0(Lkotlin/reflect/jvm/internal/impl/renderer/u;LBh/l0;Ljava/lang/StringBuilder;Z)V

    return-void
.end method
