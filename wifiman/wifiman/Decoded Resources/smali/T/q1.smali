.class abstract synthetic LT/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)LT/z1;
    .locals 4

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.produceState (ProduceState.kt:146)"

    const v2, -0x65844c3d

    invoke-static {v2, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x2

    invoke-static {p0, v3, v0, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p4, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, LT/q0;

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez p0, :cond_2

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne v2, p0, :cond_3

    :cond_2
    new-instance v2, LT/q1$b;

    invoke-direct {v2, p3, v0, v3}, LT/q1$b;-><init>(Lmh/p;LT/q0;Ldh/e;)V

    invoke-interface {p4, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lmh/p;

    shr-int/lit8 p0, p5, 0x3

    and-int/lit8 p0, p0, 0x7e

    invoke-static {p1, p2, v2, p4, p0}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object v0
.end method

.method public static final b(Ljava/lang/Object;Lmh/p;LT/l;I)LT/z1;
    .locals 4

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.runtime.produceState (ProduceState.kt:79)"

    const v2, 0x9f8503

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne p3, v1, :cond_1

    const/4 p3, 0x2

    invoke-static {p0, v2, p3, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p3, LT/q0;

    sget-object p0, LYg/J;->a:LYg/J;

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_3

    :cond_2
    new-instance v3, LT/q1$a;

    invoke-direct {v3, p1, p3, v2}, LT/q1$a;-><init>(Lmh/p;LT/q0;Ldh/e;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lmh/p;

    const/4 p1, 0x6

    invoke-static {p0, v3, p2, p1}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object p3
.end method
