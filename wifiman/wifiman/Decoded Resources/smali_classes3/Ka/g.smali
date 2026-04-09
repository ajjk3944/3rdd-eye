.class public final LKa/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKa/f$a;


# instance fields
.field private final a:Lspeedtest/SpeedtestApplicationInfo;

.field private final b:LYg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;LLa/c;)V
    .locals 1

    const-string/jumbo v0, "clientApp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, LLa/d;->a(LLa/c;)Lspeedtest/SpeedtestApplicationInfo;

    move-result-object p2

    iput-object p2, p0, LKa/g;->a:Lspeedtest/SpeedtestApplicationInfo;

    new-instance p2, LKa/g$b;

    invoke-direct {p2, p1, p0}, LKa/g$b;-><init>(Ljava/lang/String;LKa/g;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LKa/g;->b:LYg/m;

    return-void
.end method

.method public static final synthetic e(LKa/g;LKa/f$c;)Lspeedtest/SpeedtestParams;
    .locals 0

    invoke-direct {p0, p1}, LKa/g;->h(LKa/f$c;)Lspeedtest/SpeedtestParams;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LKa/g;)Lspeedtest/SpeedtestApplicationInfo;
    .locals 0

    iget-object p0, p0, LKa/g;->a:Lspeedtest/SpeedtestApplicationInfo;

    return-object p0
.end method

.method public static final synthetic g(LKa/g;)Lspeedtest/HttpSpeedtestServerApi;
    .locals 0

    invoke-direct {p0}, LKa/g;->i()Lspeedtest/HttpSpeedtestServerApi;

    move-result-object p0

    return-object p0
.end method

.method private final h(LKa/f$c;)Lspeedtest/SpeedtestParams;
    .locals 8

    instance-of v0, p1, LKa/f$c$a;

    if-eqz v0, :cond_0

    new-instance v0, Lspeedtest/HttpSpeedtestParamsInternet;

    invoke-direct {v0}, Lspeedtest/HttpSpeedtestParamsInternet;-><init>()V

    check-cast p1, LKa/f$c$a;

    invoke-virtual {p1}, LKa/f$c$a;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKa/f$c$a$a;

    invoke-virtual {v1}, LKa/f$c$a$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LKa/f$c$a$a;->a()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v1}, LKa/f$c$a$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v4, v1}, Lspeedtest/HttpSpeedtestParamsInternet;->addServer(Ljava/lang/String;JLjava/lang/String;)Lspeedtest/SpeedtestError;

    goto :goto_0

    :cond_0
    instance-of v0, p1, LKa/f$c$b;

    if-eqz v0, :cond_2

    new-instance v0, Lspeedtest/HttpSpeedtestParamsLocal;

    invoke-direct {v0}, Lspeedtest/HttpSpeedtestParamsLocal;-><init>()V

    check-cast p1, LKa/f$c$b;

    invoke-virtual {p1}, LKa/f$c$b;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lspeedtest/HttpSpeedtestParamsLocal;->setInfinite(Z)V

    invoke-virtual {p1}, LKa/f$c$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LKa/f$c$b;->d()I

    move-result v1

    int-to-long v3, v1

    invoke-virtual {p1}, LKa/f$c$b;->c()I

    move-result v1

    int-to-long v5, v1

    invoke-virtual {p1}, LKa/f$c$b;->e()Ljava/lang/String;

    move-result-object v7

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lspeedtest/HttpSpeedtestParamsLocal;->addServer(Ljava/lang/String;JJLjava/lang/String;)V

    :cond_1
    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final i()Lspeedtest/HttpSpeedtestServerApi;
    .locals 2

    iget-object v0, p0, LKa/g;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-goApi>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lspeedtest/HttpSpeedtestServerApi;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LLi/g;
    .locals 0

    check-cast p1, LKa/f$c;

    invoke-virtual {p0, p1}, LKa/g;->j(LKa/f$c;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, LKa/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LKa/g$a;-><init>(LKa/g;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, LKa/g$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LKa/g$c;-><init>(LKa/g;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;)LLi/g;
    .locals 0

    check-cast p1, LKa/f$c;

    invoke-virtual {p0, p1}, LKa/g;->k(LKa/f$c;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public j(LKa/f$c;)LLi/g;
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/g$d;

    invoke-direct {v0, p0, p1}, LKa/g$d;-><init>(LKa/g;LKa/f$c;)V

    invoke-static {v0}, LKa/e;->a(Lmh/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method public k(LKa/f$c;)LLi/g;
    .locals 1

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/g$e;

    invoke-direct {v0, p0, p1}, LKa/g$e;-><init>(LKa/g;LKa/f$c;)V

    invoke-static {v0}, LKa/e;->a(Lmh/a;)LLi/g;

    move-result-object p1

    return-object p1
.end method
