.class public abstract LM8/K$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lle/f;)Ljava/lang/Iterable;
    .locals 0

    invoke-static {p0}, LM8/K$a;->k(Lle/f;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LS8/c;Lmh/l;Lle/i;)LBf/c;
    .locals 0

    invoke-static {p0, p1, p2}, LM8/K$a;->h(LS8/c;Lmh/l;Lle/i;)LBf/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LS8/c;Lle/i;)Z
    .locals 0

    invoke-static {p0, p1}, LM8/K$a;->g(LS8/c;Lle/i;)Z

    move-result p0

    return p0
.end method

.method public static d(LM8/K;LS8/c;)Lic/e;
    .locals 1

    const/4 p0, -0x1

    if-nez p1, :cond_0

    move p1, p0

    goto :goto_0

    :cond_0
    sget-object v0, LM8/K$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    if-eq p1, p0, :cond_4

    const/4 p0, 0x1

    if-eq p1, p0, :cond_3

    const/4 p0, 0x2

    if-eq p1, p0, :cond_2

    const/4 p0, 0x3

    if-ne p1, p0, :cond_1

    sget-object p0, Lic/e;->GHZ_6:Lic/e;

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lic/e;->GHZ_5:Lic/e;

    goto :goto_1

    :cond_3
    sget-object p0, Lic/e;->GHZ_2:Lic/e;

    goto :goto_1

    :cond_4
    sget-object p0, Lic/e;->ALL:Lic/e;

    :goto_1
    return-object p0
.end method

.method public static e(LM8/K;Lic/e;)LS8/c;
    .locals 0

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LM8/K$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    const/4 p1, 0x3

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-ne p0, p1, :cond_0

    sget-object p0, LS8/c;->GHZ_6:LS8/c;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LS8/c;->GHZ_5:LS8/c;

    goto :goto_0

    :cond_2
    sget-object p0, LS8/c;->GHZ_2_4:LS8/c;

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static f(LM8/K;LS8/c;Lzi/j;Lmh/l;)LBf/b;
    .locals 0

    const-string/jumbo p0, "band"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "signals"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LM8/I;

    invoke-direct {p0, p1}, LM8/I;-><init>(LS8/c;)V

    invoke-static {p2, p0}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    new-instance p2, LM8/J;

    invoke-direct {p2, p1, p3}, LM8/J;-><init>(LS8/c;Lmh/l;)V

    invoke-static {p0, p2}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p0

    new-instance p2, LBf/b;

    invoke-static {p0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p2, p1, p0}, LBf/b;-><init>(LS8/c;Ljava/util/List;)V

    return-object p2
.end method

.method private static g(LS8/c;Lle/i;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lle/i;->f()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->a()LS8/c;

    move-result-object p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static h(LS8/c;Lmh/l;Lle/i;)LBf/c;
    .locals 10

    const-string/jumbo v0, "signal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->a()LS8/c;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, p0, :cond_0

    move-object p0, p2

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lle/i;->k()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, LM8/r;->o(Lle/i;)J

    move-result-wide v6

    invoke-virtual {p2}, Lle/i;->q()LS8/l;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LS8/l;->b()I

    move-result p0

    int-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    move-object v5, p0

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    :cond_2
    move-object v8, v1

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->e()LS8/e$b;

    move-result-object p0

    instance-of p1, p0, LS8/e$b$b;

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->b()LS8/d;

    move-result-object p0

    invoke-virtual {p0}, LS8/d;->getWidth()I

    move-result p0

    int-to-float p0, p0

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p1

    invoke-virtual {p1}, LS8/e$b;->a()I

    move-result p1

    int-to-float p1, p1

    new-instance p2, LBf/c$a;

    invoke-direct {p2, p1, p0}, LBf/c$a;-><init>(FF)V

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_2
    move-object v4, p0

    goto/16 :goto_4

    :cond_3
    instance-of p0, p0, LS8/e$b$a;

    if-eqz p0, :cond_8

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->a()LS8/c;

    move-result-object p0

    sget-object p1, LS8/c;->GHZ_2_4:LS8/c;

    if-ne p0, p1, :cond_7

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->b()LS8/d;

    move-result-object p0

    sget-object p1, LS8/d;->MHZ_40:LS8/d;

    if-ne p0, p1, :cond_7

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->b()LS8/d;

    move-result-object p0

    invoke-virtual {p0}, LS8/d;->getWidth()I

    move-result p0

    int-to-float p0, p0

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p1

    invoke-virtual {p1}, LS8/e$b;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsh/i;

    invoke-virtual {p2}, Lsh/g;->i()I

    move-result p2

    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v0

    if-le p2, v0, :cond_4

    move p2, v0

    goto :goto_3

    :cond_5
    add-int/lit8 p2, p2, 0x14

    int-to-float p1, p2

    new-instance p2, LBf/c$a;

    invoke-direct {p2, p1, p0}, LBf/c$a;-><init>(FF)V

    invoke-static {p2}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :cond_6
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    :cond_7
    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->b()LS8/d;

    move-result-object p0

    invoke-virtual {p0}, LS8/d;->getWidth()I

    move-result p0

    int-to-float p0, p0

    const/high16 p1, 0x40800000    # 4.0f

    div-float/2addr p0, p1

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->e()LS8/e$b;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type com.ubnt.usurvey.wifi.WifiChannel.FrequencyRange.Combined"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LS8/e$b$a;

    invoke-virtual {v0}, LS8/e$b$a;->d()I

    move-result v0

    int-to-float v0, v0

    new-instance v2, LBf/c$a;

    invoke-direct {v2, v0, p0}, LBf/c$a;-><init>(FF)V

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->b()LS8/d;

    move-result-object p0

    invoke-virtual {p0}, LS8/d;->getWidth()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr p0, p1

    invoke-virtual {p2}, Lle/i;->f()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LS8/e$b$a;

    invoke-virtual {p1}, LS8/e$b$a;->e()I

    move-result p1

    int-to-float p1, p1

    new-instance p2, LBf/c$a;

    invoke-direct {p2, p1, p0}, LBf/c$a;-><init>(FF)V

    filled-new-array {v2, p2}, [LBf/c$a;

    move-result-object p0

    invoke-static {p0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto/16 :goto_2

    :goto_4
    new-instance v1, LBf/c;

    const/4 v9, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, LBf/c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Float;JLjava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    :goto_5
    return-object v1
.end method

.method public static i(LM8/K;LS8/c;Lzi/j;Lmh/l;)LBf/b;
    .locals 1

    const-string/jumbo v0, "band"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM8/H;

    invoke-direct {v0}, LM8/H;-><init>()V

    invoke-static {p2, v0}, Lzi/m;->I(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p2

    invoke-interface {p0, p1, p2, p3}, LM8/K;->J(LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(LM8/K;LS8/c;Lzi/j;Lmh/l;ILjava/lang/Object;)LBf/b;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, LM8/K;->q(LS8/c;Lzi/j;Lmh/l;)LBf/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: getChartModelByNetworks"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static k(Lle/f;)Ljava/lang/Iterable;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/f;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method
