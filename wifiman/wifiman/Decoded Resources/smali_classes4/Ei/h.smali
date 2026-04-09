.class public final LEi/h;
.super LEi/a;
.source "SourceFile"


# instance fields
.field private final a:LEi/f;


# direct methods
.method public constructor <init>(LEi/f;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEi/a;-><init>()V

    iput-object p1, p0, LEi/h;->a:LEi/f;

    return-void
.end method


# virtual methods
.method public C(Ljava/util/Map$Entry;)Z
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LEi/h;->C(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LEi/h;->a:LEi/f;

    invoke-virtual {v0}, LEi/f;->clear()V

    return-void
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, LEi/h;->a:LEi/f;

    invoke-virtual {v0}, LZg/i;->size()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LEi/i;

    iget-object v1, p0, LEi/h;->a:LEi/f;

    invoke-direct {v0, v1}, LEi/i;-><init>(LEi/f;)V

    return-object v0
.end method

.method public s(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LHi/e;->a:LHi/e;

    iget-object v1, p0, LEi/h;->a:LEi/f;

    invoke-virtual {v0, v1, p1}, LHi/e;->a(Ljava/util/Map;Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public y(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LEi/h;->a:LEi/f;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LEi/f;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
