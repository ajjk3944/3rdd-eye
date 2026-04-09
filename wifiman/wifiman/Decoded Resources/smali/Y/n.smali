.class public final LY/n;
.super LZg/k;
.source "SourceFile"

# interfaces
.implements LW/d;


# instance fields
.field private final b:LY/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY/d;)V
    .locals 0

    invoke-direct {p0}, LZg/k;-><init>()V

    iput-object p1, p0, LY/n;->b:LY/d;

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

    invoke-virtual {p0, p1}, LY/n;->v(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LY/o;

    iget-object v1, p0, LY/n;->b:LY/d;

    invoke-virtual {v1}, LY/d;->s()LY/t;

    move-result-object v1

    invoke-direct {v0, v1}, LY/o;-><init>(LY/t;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LY/n;->b:LY/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method

.method public v(Ljava/util/Map$Entry;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LY/n;->b:LY/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, LY/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, LY/n;->b:LY/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, LY/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0
.end method
