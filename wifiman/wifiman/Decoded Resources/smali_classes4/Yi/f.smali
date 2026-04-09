.class public interface abstract LYi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract A(I)V
.end method

.method public abstract B(LXi/f;)LYi/f;
.end method

.method public abstract D(LXi/f;I)V
.end method

.method public abstract E(J)V
.end method

.method public abstract G(Ljava/lang/String;)V
.end method

.method public abstract a()Lcj/e;
.end method

.method public abstract c(LXi/f;)LYi/d;
.end method

.method public abstract f()V
.end method

.method public g(LVi/o;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LVi/o;->a()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-interface {p0}, LYi/f;->f()V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LYi/f;->v()V

    invoke-interface {p0, p1, p2}, LYi/f;->z(LVi/o;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public abstract j(D)V
.end method

.method public abstract k(S)V
.end method

.method public abstract l(B)V
.end method

.method public abstract m(Z)V
.end method

.method public abstract r(F)V
.end method

.method public abstract u(C)V
.end method

.method public v()V
    .locals 0

    return-void
.end method

.method public x(LXi/f;I)LYi/d;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    return-object p1
.end method

.method public z(LVi/o;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LVi/o;->e(LYi/f;Ljava/lang/Object;)V

    return-void
.end method
