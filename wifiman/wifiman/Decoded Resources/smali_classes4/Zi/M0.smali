.class public abstract LZi/M0;
.super LZi/w;
.source "SourceFile"


# instance fields
.field private final b:LXi/f;


# direct methods
.method public constructor <init>(LVi/b;)V
    .locals 1

    const-string v0, "primitiveSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LZi/w;-><init>(LVi/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LZi/L0;

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object p1

    invoke-direct {v0, p1}, LZi/L0;-><init>(LXi/f;)V

    iput-object v0, p0, LZi/M0;->b:LXi/f;

    return-void
.end method


# virtual methods
.method protected abstract A(LYi/d;Ljava/lang/Object;I)V
.end method

.method public final a()LXi/f;
    .locals 1

    iget-object v0, p0, LZi/M0;->b:LXi/f;

    return-object v0
.end method

.method public final c(LYi/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LZi/a;->l(LYi/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(LYi/f;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LZi/a;->k(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZi/M0;->b:LXi/f;

    invoke-interface {p1, v1, v0}, LYi/f;->x(LXi/f;I)LYi/d;

    move-result-object p1

    invoke-virtual {p0, p1, p2, v0}, LZi/M0;->A(LYi/d;Ljava/lang/Object;I)V

    invoke-interface {p1, v1}, LYi/d;->b(LXi/f;)V

    return-void
.end method

.method public bridge synthetic g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/M0;->u()LZi/K0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LZi/K0;

    invoke-virtual {p0, p1}, LZi/M0;->v(LZi/K0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, LZi/K0;

    invoke-virtual {p0, p1, p2}, LZi/M0;->w(LZi/K0;I)V

    return-void
.end method

.method protected final j(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method lead to boxing and must not be used, use writeContents instead"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZi/K0;

    invoke-virtual {p0, p1}, LZi/M0;->z(LZi/K0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic t(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, LZi/K0;

    invoke-virtual {p0, p1, p2, p3}, LZi/M0;->y(LZi/K0;ILjava/lang/Object;)V

    return-void
.end method

.method protected final u()LZi/K0;
    .locals 1

    invoke-virtual {p0}, LZi/M0;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/a;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZi/K0;

    return-object v0
.end method

.method protected final v(LZi/K0;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZi/K0;->d()I

    move-result p1

    return p1
.end method

.method protected final w(LZi/K0;I)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LZi/K0;->b(I)V

    return-void
.end method

.method protected abstract x()Ljava/lang/Object;
.end method

.method protected final y(LZi/K0;ILjava/lang/Object;)V
    .locals 0

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method lead to boxing and must not be used, use Builder.append instead"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final z(LZi/K0;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZi/K0;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
