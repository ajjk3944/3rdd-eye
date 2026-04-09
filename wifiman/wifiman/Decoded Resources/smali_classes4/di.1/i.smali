.class public final Ldi/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ldi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldi/i;

    invoke-direct {v0}, Ldi/i;-><init>()V

    sput-object v0, Ldi/i;->a:Ldi/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lkotlin/reflect/jvm/internal/impl/builtins/l;LBh/G;)Lpi/S;
    .locals 0

    invoke-static {p0, p1}, Ldi/i;->d(Lkotlin/reflect/jvm/internal/impl/builtins/l;LBh/G;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;
    .locals 4

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v1, v3, v2, v3}, Ldi/i;->f(Ldi/i;Ljava/lang/Object;LBh/G;ILjava/lang/Object;)Ldi/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    new-instance p1, Ldi/z;

    invoke-interface {p2}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p2

    invoke-virtual {p2, p3}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->O(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object p2

    const-string p3, "getPrimitiveArrayKotlinType(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, p2}, Ldi/z;-><init>(Ljava/util/List;Lpi/S;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ldi/b;

    new-instance p2, Ldi/h;

    invoke-direct {p2, p3}, Ldi/h;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/l;)V

    invoke-direct {p1, v0, p2}, Ldi/b;-><init>(Ljava/util/List;Lmh/l;)V

    :goto_1
    return-object p1
.end method

.method private static final d(Lkotlin/reflect/jvm/internal/impl/builtins/l;LBh/G;)Lpi/S;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->O(Lkotlin/reflect/jvm/internal/impl/builtins/l;)Lpi/d0;

    move-result-object p0

    const-string p1, "getPrimitiveArrayKotlinType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic f(Ldi/i;Ljava/lang/Object;LBh/G;ILjava/lang/Object;)Ldi/g;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Ldi/i;->e(Ljava/lang/Object;LBh/G;)Ldi/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/util/List;Lpi/S;)Ldi/b;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldi/z;

    invoke-direct {v0, p1, p2}, Ldi/z;-><init>(Ljava/util/List;Lpi/S;)V

    return-object v0
.end method

.method public final e(Ljava/lang/Object;LBh/G;)Ldi/g;
    .locals 2

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    new-instance p2, Ldi/d;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-direct {p2, p1}, Ldi/d;-><init>(B)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_1

    new-instance p2, Ldi/w;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-direct {p2, p1}, Ldi/w;-><init>(S)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance p2, Ldi/n;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p2, p1}, Ldi/n;-><init>(I)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_3

    new-instance p2, Ldi/t;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Ldi/t;-><init>(J)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_4

    new-instance p2, Ldi/e;

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-direct {p2, p1}, Ldi/e;-><init>(C)V

    goto/16 :goto_0

    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance p2, Ldi/m;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-direct {p2, p1}, Ldi/m;-><init>(F)V

    goto/16 :goto_0

    :cond_5
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_6

    new-instance p2, Ldi/j;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Ldi/j;-><init>(D)V

    goto/16 :goto_0

    :cond_6
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_7

    new-instance p2, Ldi/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p2, p1}, Ldi/c;-><init>(Z)V

    goto/16 :goto_0

    :cond_7
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_8

    new-instance p2, Ldi/x;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p2, p1}, Ldi/x;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    instance-of v0, p1, [B

    if-eqz v0, :cond_9

    check-cast p1, [B

    invoke-static {p1}, LZg/n;->X0([B)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BYTE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto/16 :goto_0

    :cond_9
    instance-of v0, p1, [S

    if-eqz v0, :cond_a

    check-cast p1, [S

    invoke-static {p1}, LZg/n;->e1([S)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->SHORT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto/16 :goto_0

    :cond_a
    instance-of v0, p1, [I

    if-eqz v0, :cond_b

    check-cast p1, [I

    invoke-static {p1}, LZg/n;->b1([I)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->INT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto :goto_0

    :cond_b
    instance-of v0, p1, [J

    if-eqz v0, :cond_c

    check-cast p1, [J

    invoke-static {p1}, LZg/n;->c1([J)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->LONG:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto :goto_0

    :cond_c
    instance-of v0, p1, [C

    if-eqz v0, :cond_d

    check-cast p1, [C

    invoke-static {p1}, LZg/n;->Y0([C)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->CHAR:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto :goto_0

    :cond_d
    instance-of v0, p1, [F

    if-eqz v0, :cond_e

    check-cast p1, [F

    invoke-static {p1}, LZg/n;->a1([F)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->FLOAT:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto :goto_0

    :cond_e
    instance-of v0, p1, [D

    if-eqz v0, :cond_f

    check-cast p1, [D

    invoke-static {p1}, LZg/n;->Z0([D)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->DOUBLE:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto :goto_0

    :cond_f
    instance-of v0, p1, [Z

    if-eqz v0, :cond_10

    check-cast p1, [Z

    invoke-static {p1}, LZg/n;->f1([Z)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/l;->BOOLEAN:Lkotlin/reflect/jvm/internal/impl/builtins/l;

    invoke-direct {p0, p1, p2, v0}, Ldi/i;->b(Ljava/util/List;LBh/G;Lkotlin/reflect/jvm/internal/impl/builtins/l;)Ldi/b;

    move-result-object p2

    goto :goto_0

    :cond_10
    if-nez p1, :cond_11

    new-instance p2, Ldi/u;

    invoke-direct {p2}, Ldi/u;-><init>()V

    goto :goto_0

    :cond_11
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method
