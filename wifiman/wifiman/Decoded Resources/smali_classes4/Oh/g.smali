.class public final LOh/g;
.super Lpi/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOh/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpi/F;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/l0;Lpi/G;Lpi/A0;Lpi/S;)Lpi/B0;
    .locals 1

    const-string v0, "parameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterUpperBoundEraser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "erasedUpperBound"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LOh/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Lpi/F;->a(LBh/l0;Lpi/G;Lpi/A0;Lpi/S;)Lpi/B0;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast p2, LOh/a;

    invoke-virtual {p2}, LOh/a;->i()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    sget-object p3, LOh/c;->INFLEXIBLE:LOh/c;

    invoke-virtual {p2, p3}, LOh/a;->l(LOh/c;)LOh/a;

    move-result-object p2

    :goto_0
    invoke-virtual {p2}, LOh/a;->g()LOh/c;

    move-result-object p3

    sget-object v0, LOh/g$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_6

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    const/4 v0, 0x3

    if-ne p3, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    invoke-interface {p1}, LBh/l0;->p()Lpi/N0;

    move-result-object p3

    invoke-virtual {p3}, Lpi/N0;->getAllowsOutPosition()Z

    move-result p3

    if-nez p3, :cond_4

    new-instance p2, Lpi/D0;

    sget-object p3, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-static {p1}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->H()Lpi/d0;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p4}, Lpi/S;->N0()Lpi/v0;

    move-result-object p3

    invoke-interface {p3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object p3

    const-string v0, "getParameters(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_5

    new-instance p2, Lpi/D0;

    sget-object p1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-direct {p2, p1, p4}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    goto :goto_2

    :cond_5
    invoke-static {p1, p2}, Lpi/J0;->t(LBh/l0;Lpi/G;)Lpi/B0;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    new-instance p2, Lpi/D0;

    sget-object p1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-direct {p2, p1, p4}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    :goto_2
    return-object p2
.end method
