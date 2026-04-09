.class public final Lcom/ubnt/usurvey/product/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa/a$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(Lcom/ubnt/usurvey/product/l;)LYg/s;
    .locals 0

    invoke-static {p0}, Lcom/ubnt/usurvey/product/i;->f(Lcom/ubnt/usurvey/product/l;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/ubnt/usurvey/product/l;)LYg/s;
    .locals 1

    const-string/jumbo v0, "localProduct"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/l;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object v0

    invoke-static {v0, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lxa/a$b;
    .locals 6

    sget-object v0, Lcom/ubnt/usurvey/product/j;->a:Lcom/ubnt/usurvey/product/j;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/product/j;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v3, LYa/a;->a:LYa/a$a;

    invoke-virtual {v3, v1}, LYa/a$a;->a(Ljava/lang/String;)LYa/a;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Lcom/ubnt/usurvey/product/j;->b()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0x0

    :goto_1
    new-instance v5, Lbb/a$a;

    invoke-direct {v5, v3, v4, v1}, Lbb/a$a;-><init>(JLYa/a;)V

    invoke-virtual {v0}, Lcom/ubnt/usurvey/product/j;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string/jumbo v0, "no_version"

    :cond_2
    invoke-static {v0}, Lbb/a$b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/ubnt/usurvey/product/l;->getEntries()Lfh/a;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ubnt/usurvey/product/l;

    invoke-static {v4}, Lcom/ubnt/usurvey/product/u;->a(Lcom/ubnt/usurvey/product/l;)Lab/d;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v1, Lbb/a;

    invoke-direct {v1, v0, v3, v2}, Lbb/a;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lxa/a$b;

    invoke-direct {v0, v5, v1}, Lxa/a$b;-><init>(Lbb/a$a;Lbb/a;)V

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 2

    invoke-static {}, Lcom/ubnt/usurvey/product/l;->getEntries()Lfh/a;

    move-result-object v0

    invoke-static {v0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v0

    new-instance v1, Lcom/ubnt/usurvey/product/h;

    invoke-direct {v1}, Lcom/ubnt/usurvey/product/h;-><init>()V

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, LZg/U;->u(Lzi/j;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/product/l;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/product/i;->e(Lcom/ubnt/usurvey/product/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/ubnt/usurvey/product/l;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lxa/a$c$a;->a(Lxa/a$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
