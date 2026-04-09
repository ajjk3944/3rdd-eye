.class public abstract LT6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/q;LT/l;I)LT6/f;
    .locals 3

    const-string/jumbo v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xca56fee

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.skydoves.landscapist.components.rememberImageComponent (RememberImageComponent.kt:30)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    const v0, 0x5738905

    invoke-interface {p1, v0}, LT/l;->U(I)V

    new-instance v0, LT6/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, LT6/f;-><init>(Ljava/util/List;)V

    new-instance v1, LT6/f;

    invoke-virtual {v0}, LT6/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, LT6/f;-><init>(Ljava/util/List;)V

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, v1, p1, p2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->J()V

    const p0, -0x2d7288f5

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p0, p2, :cond_1

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    check-cast v1, LT6/f;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->J()V

    return-object v1
.end method
