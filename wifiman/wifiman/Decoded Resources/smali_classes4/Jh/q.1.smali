.class public final LJh/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbi/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/q$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic c(LBh/s0;)Lpi/S;
    .locals 0

    invoke-static {p0}, LJh/q;->d(LBh/s0;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LBh/s0;)Lpi/S;
    .locals 0

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lbi/j$a;
    .locals 1

    sget-object v0, Lbi/j$a;->SUCCESS_ONLY:Lbi/j$a;

    return-object v0
.end method

.method public b(LBh/a;LBh/a;LBh/e;)Lbi/j$b;
    .locals 4

    const-string p3, "superDescriptor"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "subDescriptor"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, LLh/e;

    if-eqz p3, :cond_9

    move-object p3, p2

    check-cast p3, LLh/e;

    invoke-virtual {p3}, LDh/s;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {p1, p2}, Lbi/o;->w(LBh/a;LBh/a;)Lbi/o$i;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lbi/o$i;->c()Lbi/o$i$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1

    :cond_2
    invoke-virtual {p3}, LDh/s;->i()Ljava/util/List;

    move-result-object v0

    const-string v3, "getValueParameters(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v0

    sget-object v3, LJh/p;->a:LJh/p;

    invoke-static {v0, v3}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-virtual {p3}, LDh/s;->getReturnType()Lpi/S;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0, v3}, Lzi/m;->R(Lzi/j;Ljava/lang/Object;)Lzi/j;

    move-result-object v0

    invoke-virtual {p3}, LDh/s;->k0()LBh/b0;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-interface {p3}, LBh/r0;->getType()Lpi/S;

    move-result-object p3

    goto :goto_1

    :cond_3
    move-object p3, v2

    :goto_1
    invoke-static {p3}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {v0, p3}, Lzi/m;->Q(Lzi/j;Ljava/lang/Iterable;)Lzi/j;

    move-result-object p3

    invoke-interface {p3}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    invoke-virtual {v0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v0

    instance-of v0, v0, LOh/k;

    if-nez v0, :cond_4

    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1

    :cond_5
    new-instance p3, LOh/i;

    const/4 v0, 0x1

    invoke-direct {p3, v2, v0, v2}, LOh/i;-><init>(Lpi/A0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3}, Lpi/E0;->c()Lpi/G0;

    move-result-object p3

    invoke-interface {p1, p3}, LBh/i0;->c(Lpi/G0;)LBh/n;

    move-result-object p1

    check-cast p1, LBh/a;

    if-nez p1, :cond_6

    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1

    :cond_6
    instance-of p3, p1, LBh/f0;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, LBh/f0;

    invoke-interface {p3}, LBh/a;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-interface {p3}, LBh/f0;->v()LBh/z$a;

    move-result-object p1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p3

    invoke-interface {p1, p3}, LBh/z$a;->o(Ljava/util/List;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_7
    sget-object p3, Lbi/o;->f:Lbi/o;

    const/4 v1, 0x0

    invoke-virtual {p3, p1, p2, v1}, Lbi/o;->F(LBh/a;LBh/a;Z)Lbi/o$i;

    move-result-object p1

    invoke-virtual {p1}, Lbi/o$i;->c()Lbi/o$i$a;

    move-result-object p1

    const-string p2, "getResult(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LJh/q$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-ne p1, v0, :cond_8

    sget-object p1, Lbi/j$b;->OVERRIDABLE:Lbi/j$b;

    goto :goto_2

    :cond_8
    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    :goto_2
    return-object p1

    :cond_9
    :goto_3
    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1
.end method
