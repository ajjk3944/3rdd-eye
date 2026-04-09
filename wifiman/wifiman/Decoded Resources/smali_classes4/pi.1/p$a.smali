.class final Lpi/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

.field private final b:LYg/m;

.field final synthetic c:Lpi/p;


# direct methods
.method public constructor <init>(Lpi/p;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpi/p$a;->c:Lpi/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpi/p$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    sget-object p2, LYg/q;->PUBLICATION:LYg/q;

    new-instance v0, Lpi/o;

    invoke-direct {v0, p0, p1}, Lpi/o;-><init>(Lpi/p$a;Lpi/p;)V

    invoke-static {p2, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lpi/p$a;->b:LYg/m;

    return-void
.end method

.method static synthetic f(Lpi/p$a;Lpi/p;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lpi/p$a;->i(Lpi/p$a;Lpi/p;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lpi/p$a;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final i(Lpi/p$a;Lpi/p;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lpi/p$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-virtual {p1}, Lpi/p;->w()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/h;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lpi/p$a;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-virtual {v0, p1}, Lpi/p;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/v0;

    move-result-object p1

    return-object p1
.end method

.method public c()LBh/h;
    .locals 1

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-virtual {v0}, Lpi/v;->c()LBh/h;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-interface {v0}, Lpi/v0;->d()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-virtual {v0, p1}, Lpi/v;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getParameters()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lpi/p$a;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-virtual {v0}, Lpi/v;->hashCode()I

    move-result v0

    return v0
.end method

.method public q()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 2

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-interface {v0}, Lpi/v0;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpi/p$a;->c:Lpi/p;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
