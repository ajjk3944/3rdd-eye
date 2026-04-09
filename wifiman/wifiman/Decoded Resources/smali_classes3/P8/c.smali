.class public LP8/c;
.super LIf/U;
.source "SourceFile"


# static fields
.field static final synthetic j:[Lth/l;

.field public static final k:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-string/jumbo v1, "getProductCatalog()Lcom/ui/product/catalog/uidb/UiDBProductCatalogRx3;"

    const/4 v2, 0x0

    const-class v3, LP8/c;

    const-string/jumbo v4, "productCatalog"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, LP8/c;->j:[Lth/l;

    const/16 v0, 0x8

    sput v0, LP8/c;->k:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 10

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LIf/U;-><init>()V

    iput-object p1, p0, LP8/c;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, LP8/c$c;

    invoke-direct {v0}, LP8/c$c;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lxa/o;

    invoke-direct {p1, v0, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v0, LP8/c;->j:[Lth/l;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LP8/c;->h:LYg/m;

    new-instance p1, LP8/c$d;

    invoke-direct {p1, p0}, LP8/c$d;-><init>(LP8/c;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP8/c$a;

    invoke-direct {v0, p0}, LP8/c$a;-><init>(LP8/c;)V

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, LP8/c$b;

    invoke-direct {v0, p0}, LP8/c$b;-><init>(LP8/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    const-string/jumbo p1, "distinctUntilChanged(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LCe/a;

    new-instance v3, LCe/a$d;

    const-string v0, ""

    const-string/jumbo v2, "https://www.ui.com/compliance/"

    invoke-direct {v3, v0, v2}, LCe/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, LCe/a;-><init>(LCe/a$d;LCe/a$e;LCe/a$c;LCe/a$a;LCe/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lye/g;->d0(Lye/g;Lgg/i;Ljava/lang/Object;ZLandroidx/lifecycle/k$b;ILjava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, LP8/c;->i:LLi/N;

    return-void
.end method

.method public static final synthetic n0(LP8/c;Lua/a;)LCe/a;
    .locals 0

    invoke-direct {p0, p1}, LP8/c;->q0(Lua/a;)LCe/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o0(LP8/c;)Lxa/o;
    .locals 0

    invoke-direct {p0}, LP8/c;->r0()Lxa/o;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p0(LP8/c;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LP8/c;->s0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final q0(Lua/a;)LCe/a;
    .locals 8

    new-instance v1, LCe/a$d;

    invoke-interface {p1}, Lua/a;->z()LCa/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LCa/a;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p1}, Lua/a;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    const-string/jumbo v2, "https://www.ui.com/compliance/"

    invoke-direct {v1, v0, v2}, LCe/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Lua/a;->z()LCa/a;

    move-result-object v0

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LCa/a;->h()LCa/a$g;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, LCa/a$g;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LCa/a$g;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LCa/a$g$a;

    invoke-virtual {v6}, LCa/a$g$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v5}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v0

    :cond_5
    new-instance v5, LCe/a$e;

    invoke-direct {v5, v4, v0}, LCe/a$e;-><init>(Ljava/lang/String;LCi/c;)V

    goto :goto_2

    :cond_6
    :goto_1
    move-object v5, v3

    :goto_2
    invoke-interface {p1}, Lua/a;->z()LCa/a;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, LCa/a;->d()LCa/a$c;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, LCa/a$c;->c()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    :goto_3
    move-object v2, v3

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, LCa/a$c;->a()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v0}, LCa/a$c;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_a

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCa/a$c$a;

    invoke-virtual {v2}, LCa/a$c$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-static {v7}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v0

    if-nez v0, :cond_b

    :cond_a
    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v0

    :cond_b
    new-instance v2, LCe/a$c;

    invoke-direct {v2, v6, v4, v0}, LCe/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;LCi/c;)V

    :goto_5
    move-object v4, v2

    goto :goto_6

    :cond_c
    move-object v4, v3

    :goto_6
    invoke-interface {p1}, Lua/a;->z()LCa/a;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, LCa/a;->a()LCa/a$a;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, LCa/a$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v2, LCe/a$a;

    invoke-direct {v2, v0}, LCe/a$a;-><init>(Z)V

    goto :goto_7

    :cond_d
    move-object v2, v3

    :goto_7
    move-object v6, v2

    goto :goto_8

    :cond_e
    move-object v6, v3

    :goto_8
    invoke-interface {p1}, Lua/a;->z()LCa/a;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p1}, LCa/a;->c()LCa/a$b;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p1}, LCa/a$b;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_f

    goto :goto_9

    :cond_f
    new-instance v3, LCe/a$b;

    invoke-direct {v3, p1}, LCe/a$b;-><init>(Ljava/lang/String;)V

    :cond_10
    :goto_9
    move-object p1, v3

    new-instance v7, LCe/a;

    move-object v0, v7

    move-object v2, v5

    move-object v3, v4

    move-object v4, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, LCe/a;-><init>(LCe/a$d;LCe/a$e;LCe/a$c;LCe/a$a;LCe/a$b;)V

    return-object v7
.end method

.method private final r0()Lxa/o;
    .locals 1

    iget-object v0, p0, LP8/c;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa/o;

    return-object v0
.end method

.method private final s0()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/product/l;->WM_W_d64:Lcom/ubnt/usurvey/product/l;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/product/l;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, LP8/c;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public z()LLi/N;
    .locals 1

    iget-object v0, p0, LP8/c;->i:LLi/N;

    return-object v0
.end method
