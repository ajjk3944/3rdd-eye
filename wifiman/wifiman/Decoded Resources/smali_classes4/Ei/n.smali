.class public final LEi/n;
.super LZg/k;
.source "SourceFile"

# interfaces
.implements LCi/e;


# instance fields
.field private final b:LEi/d;


# direct methods
.method public constructor <init>(LEi/d;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/k;-><init>()V

    iput-object p1, p0, LEi/n;->b:LEi/d;

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LEi/n;->v(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LEi/o;

    iget-object v1, p0, LEi/n;->b:LEi/d;

    invoke-virtual {v1}, LEi/d;->t()LEi/t;

    move-result-object v1

    invoke-direct {v0, v1}, LEi/o;-><init>(LEi/t;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LEi/n;->b:LEi/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method

.method public v(Ljava/util/Map$Entry;)Z
    .locals 2

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LHi/e;->a:LHi/e;

    iget-object v1, p0, LEi/n;->b:LEi/d;

    invoke-virtual {v0, v1, p1}, LHi/e;->a(Ljava/util/Map;Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
