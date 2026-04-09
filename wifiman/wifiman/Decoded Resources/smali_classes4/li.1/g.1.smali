.class public final Lli/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lli/g$a;
    }
.end annotation


# instance fields
.field private final a:LBh/G;

.field private final b:LBh/L;


# direct methods
.method public constructor <init>(LBh/G;LBh/L;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/g;->a:LBh/G;

    iput-object p2, p0, Lli/g;->b:LBh/L;

    return-void
.end method

.method private final b(Ldi/g;Lpi/S;LUh/b$b$c;)Z
    .locals 6

    invoke-virtual {p3}, LUh/b$b$c;->c1()LUh/b$b$c$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lli/g$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/16 v1, 0xa

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_6

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    iget-object p3, p0, Lli/g;->a:LBh/G;

    invoke-virtual {p1, p3}, Ldi/g;->a(LBh/G;)Lpi/S;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto/16 :goto_3

    :cond_1
    instance-of v0, p1, Ldi/b;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ldi/b;

    invoke-virtual {v0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p3}, LUh/b$b$c;->T0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_5

    invoke-direct {p0}, Lli/g;->c()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k(Lpi/S;)Lpi/S;

    move-result-object p2

    const-string v0, "getArrayElementType(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ldi/b;

    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, LZg/v;->m(Ljava/util/Collection;)Lsh/i;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    :goto_1
    move v2, v3

    goto :goto_3

    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LZg/Q;

    invoke-virtual {v1}, LZg/Q;->d()I

    move-result v1

    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldi/g;

    invoke-virtual {p3, v1}, LUh/b$b$c;->N0(I)LUh/b$b$c;

    move-result-object v1

    const-string v5, "getArrayElement(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v4, p2, v1}, Lli/g;->b(Ldi/g;Lpi/S;LUh/b$b$c;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Deserialized ArrayValue should have the same number of elements as the original array value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    invoke-virtual {p2}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    instance-of p2, p1, LBh/e;

    if-eqz p2, :cond_7

    check-cast p1, LBh/e;

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_2

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->l0(LBh/e;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    :goto_3
    return v2
.end method

.method private final c()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    iget-object v0, p0, Lli/g;->a:LBh/G;

    invoke-interface {v0}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    return-object v0
.end method

.method private final d(LUh/b$b;Ljava/util/Map;LWh/c;)LYg/s;
    .locals 3

    invoke-virtual {p1}, LUh/b$b;->P()I

    move-result v0

    invoke-static {p3, v0}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBh/s0;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, LYg/s;

    invoke-virtual {p1}, LUh/b$b;->P()I

    move-result v1

    invoke-static {p3, v1}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object v1

    invoke-interface {p2}, LBh/r0;->getType()Lpi/S;

    move-result-object p2

    const-string v2, "getType(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LUh/b$b;->S()LUh/b$b$c;

    move-result-object p1

    const-string v2, "getValue(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1, p3}, Lli/g;->g(Lpi/S;LUh/b$b$c;LWh/c;)Ldi/g;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final e(LZh/b;)LBh/e;
    .locals 2

    iget-object v0, p0, Lli/g;->a:LBh/G;

    iget-object v1, p0, Lli/g;->b:LBh/L;

    invoke-static {v0, p1, v1}, LBh/y;->d(LBh/G;LZh/b;LBh/L;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method private final g(Lpi/S;LUh/b$b$c;LWh/c;)Ldi/g;
    .locals 2

    invoke-virtual {p0, p1, p2, p3}, Lli/g;->f(Lpi/S;LUh/b$b$c;LWh/c;)Ldi/g;

    move-result-object p3

    invoke-direct {p0, p3, p1, p2}, Lli/g;->b(Ldi/g;Lpi/S;LUh/b$b$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-nez p3, :cond_1

    sget-object p3, Ldi/l;->b:Ldi/l$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected argument value: actual type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LUh/b$b$c;->c1()LUh/b$b$c$c;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " != expected type "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ldi/l$a;->a(Ljava/lang/String;)Ldi/l;

    move-result-object p3

    :cond_1
    return-object p3
.end method


# virtual methods
.method public final a(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 5

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LUh/b;->f0()I

    move-result v0

    invoke-static {p2, v0}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lli/g;->e(LZh/b;)LBh/e;

    move-result-object v0

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, LUh/b;->S()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v0}, Lbi/i;->t(LBh/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, LBh/e;->m()Ljava/util/Collection;

    move-result-object v2

    const-string v3, "getConstructors(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->S0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/d;

    if-eqz v2, :cond_3

    invoke-interface {v2}, LBh/a;->i()Ljava/util/List;

    move-result-object v1

    const-string v2, "getValueParameters(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lsh/m;->d(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LBh/s0;

    invoke-interface {v4}, LBh/I;->getName()LZh/f;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LUh/b;->T()Ljava/util/List;

    move-result-object p1

    const-string v1, "getArgumentList(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/b$b;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, v2, v3, p2}, Lli/g;->d(LUh/b$b;Ljava/util/Map;LWh/c;)LYg/s;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, LZg/U;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    :cond_3
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/d;

    invoke-interface {v0}, LBh/e;->u()Lpi/d0;

    move-result-object p2

    sget-object v0, LBh/g0;->a:LBh/g0;

    invoke-direct {p1, p2, v1, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/d;-><init>(Lpi/S;Ljava/util/Map;LBh/g0;)V

    return-object p1
.end method

.method public final f(Lpi/S;LUh/b$b$c;LWh/c;)Ldi/g;
    .locals 5

    const-string v0, "expectedType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LWh/b;->P:LWh/b$b;

    invoke-virtual {p2}, LUh/b$b$c;->Y0()I

    move-result v1

    invoke-virtual {v0, v1}, LWh/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2}, LUh/b$b$c;->c1()LUh/b$b$c$c;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lli/g$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported annotation argument type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, LUh/b$b$c;->c1()LUh/b$b$c$c;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " (expected "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :pswitch_0
    sget-object v0, Ldi/i;->a:Ldi/i;

    invoke-virtual {p2}, LUh/b$b$c;->T0()Ljava/util/List;

    move-result-object p2

    const-string v1, "getArrayElementList(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUh/b$b$c;

    invoke-direct {p0}, Lli/g;->c()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->i()Lpi/d0;

    move-result-object v3

    const-string v4, "getAnyType(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v3, v2, p3}, Lli/g;->f(Lpi/S;LUh/b$b$c;LWh/c;)Ldi/g;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p1}, Ldi/i;->c(Ljava/util/List;Lpi/S;)Ldi/b;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_1
    new-instance p1, Ldi/a;

    invoke-virtual {p2}, LUh/b$b$c;->K0()LUh/b;

    move-result-object p2

    const-string v0, "getAnnotation(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, Lli/g;->a(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p2

    invoke-direct {p1, p2}, Ldi/a;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)V

    goto/16 :goto_5

    :pswitch_2
    new-instance p1, Ldi/k;

    invoke-virtual {p2}, LUh/b$b$c;->U0()I

    move-result v0

    invoke-static {p3, v0}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object v0

    invoke-virtual {p2}, LUh/b$b$c;->X0()I

    move-result p2

    invoke-static {p3, p2}, Lli/L;->b(LWh/c;I)LZh/f;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    goto/16 :goto_5

    :pswitch_3
    new-instance p1, Ldi/s;

    invoke-virtual {p2}, LUh/b$b$c;->U0()I

    move-result v0

    invoke-static {p3, v0}, Lli/L;->a(LWh/c;I)LZh/b;

    move-result-object p3

    invoke-virtual {p2}, LUh/b$b$c;->M0()I

    move-result p2

    invoke-direct {p1, p3, p2}, Ldi/s;-><init>(LZh/b;I)V

    goto/16 :goto_5

    :pswitch_4
    new-instance p1, Ldi/x;

    invoke-virtual {p2}, LUh/b$b$c;->b1()I

    move-result p2

    invoke-interface {p3, p2}, LWh/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ldi/x;-><init>(Ljava/lang/String;)V

    goto/16 :goto_5

    :pswitch_5
    new-instance p1, Ldi/c;

    invoke-virtual {p2}, LUh/b$b$c;->a1()J

    move-result-wide p2

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    invoke-direct {p1, p2}, Ldi/c;-><init>(Z)V

    goto/16 :goto_5

    :pswitch_6
    new-instance p1, Ldi/j;

    invoke-virtual {p2}, LUh/b$b$c;->W0()D

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ldi/j;-><init>(D)V

    goto/16 :goto_5

    :pswitch_7
    new-instance p1, Ldi/m;

    invoke-virtual {p2}, LUh/b$b$c;->Z0()F

    move-result p2

    invoke-direct {p1, p2}, Ldi/m;-><init>(F)V

    goto :goto_5

    :pswitch_8
    invoke-virtual {p2}, LUh/b$b$c;->a1()J

    move-result-wide p1

    if-eqz v0, :cond_3

    new-instance p3, Ldi/C;

    invoke-direct {p3, p1, p2}, Ldi/C;-><init>(J)V

    :goto_3
    move-object p1, p3

    goto :goto_5

    :cond_3
    new-instance p3, Ldi/t;

    invoke-direct {p3, p1, p2}, Ldi/t;-><init>(J)V

    goto :goto_3

    :pswitch_9
    invoke-virtual {p2}, LUh/b$b$c;->a1()J

    move-result-wide p1

    long-to-int p1, p1

    if-eqz v0, :cond_4

    new-instance p2, Ldi/B;

    invoke-direct {p2, p1}, Ldi/B;-><init>(I)V

    :goto_4
    move-object p1, p2

    goto :goto_5

    :cond_4
    new-instance p2, Ldi/n;

    invoke-direct {p2, p1}, Ldi/n;-><init>(I)V

    goto :goto_4

    :pswitch_a
    invoke-virtual {p2}, LUh/b$b$c;->a1()J

    move-result-wide p1

    long-to-int p1, p1

    int-to-short p1, p1

    if-eqz v0, :cond_5

    new-instance p2, Ldi/D;

    invoke-direct {p2, p1}, Ldi/D;-><init>(S)V

    goto :goto_4

    :cond_5
    new-instance p2, Ldi/w;

    invoke-direct {p2, p1}, Ldi/w;-><init>(S)V

    goto :goto_4

    :pswitch_b
    new-instance p1, Ldi/e;

    invoke-virtual {p2}, LUh/b$b$c;->a1()J

    move-result-wide p2

    long-to-int p2, p2

    int-to-char p2, p2

    invoke-direct {p1, p2}, Ldi/e;-><init>(C)V

    goto :goto_5

    :pswitch_c
    invoke-virtual {p2}, LUh/b$b$c;->a1()J

    move-result-wide p1

    long-to-int p1, p1

    int-to-byte p1, p1

    if-eqz v0, :cond_6

    new-instance p2, Ldi/A;

    invoke-direct {p2, p1}, Ldi/A;-><init>(B)V

    goto :goto_4

    :cond_6
    new-instance p2, Ldi/d;

    invoke-direct {p2, p1}, Ldi/d;-><init>(B)V

    goto :goto_4

    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
