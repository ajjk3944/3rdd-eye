.class public abstract Lcom/valentinilk/shimmer/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/valentinilk/shimmer/a;LT/l;I)Ll0/i;
    .locals 3

    const-string v0, "shimmerBounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4991c596

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.valentinilk.shimmer.rememberShimmerBounds (ShimmerBounds.kt:8)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lcom/valentinilk/shimmer/a$a;->a:Lcom/valentinilk/shimmer/a$a;

    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p0}, Ll0/i$a;->a()Ll0/i;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object p2, Lcom/valentinilk/shimmer/a$b;->a:Lcom/valentinilk/shimmer/a$b;

    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p0, 0x0

    goto :goto_0

    :cond_2
    sget-object p2, Lcom/valentinilk/shimmer/a$c;->a:Lcom/valentinilk/shimmer/a$c;

    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x0

    invoke-static {p1, p0}, LVf/a;->a(LT/l;I)Ll0/i;

    move-result-object p0

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
