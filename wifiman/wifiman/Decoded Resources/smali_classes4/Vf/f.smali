.class public abstract LVf/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/valentinilk/shimmer/a;LVf/h;LT/l;II)LVf/b;
    .locals 2

    const-string v0, "shimmerBounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1bcbe87f

    invoke-interface {p2, v0}, LT/l;->U(I)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, LVf/j;->d()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVf/h;

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v1, "com.valentinilk.shimmer.rememberShimmer (Shimmer.kt:11)"

    invoke-static {v0, p3, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    shr-int/lit8 p4, p3, 0x3

    and-int/lit8 p4, p4, 0xe

    invoke-static {p1, p2, p4}, LVf/e;->a(LVf/h;LT/l;I)LVf/d;

    move-result-object p4

    and-int/lit8 p3, p3, 0xe

    invoke-static {p0, p2, p3}, Lcom/valentinilk/shimmer/b;->a(Lcom/valentinilk/shimmer/a;LT/l;I)Ll0/i;

    move-result-object p0

    const p3, 0x7862eeab

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_2

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_3

    :cond_2
    new-instance v0, LVf/b;

    invoke-direct {v0, p1, p4, p0}, LVf/b;-><init>(LVf/h;LVf/d;Ll0/i;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, LVf/b;

    invoke-interface {p2}, LT/l;->J()V

    invoke-virtual {v0, p0}, LVf/b;->d(Ll0/i;)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p2}, LT/l;->J()V

    return-object v0
.end method
