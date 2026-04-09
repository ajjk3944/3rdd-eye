.class public abstract Lf2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf2/D;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/CharSequence;

.field private e:Ljava/util/Map;

.field private f:Ljava/util/List;

.field private g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lf2/D;ILjava/lang/String;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf2/s;->a:Lf2/D;

    .line 3
    iput p2, p0, Lf2/s;->b:I

    .line 4
    iput-object p3, p0, Lf2/s;->c:Ljava/lang/String;

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/s;->e:Ljava/util/Map;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf2/s;->f:Ljava/util/List;

    .line 7
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lf2/s;->g:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lf2/D;Ljava/lang/String;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 8
    invoke-direct {p0, p1, v0, p2}, Lf2/s;-><init>(Lf2/D;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lf2/h;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argument"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/s;->e:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b()Lf2/r;
    .locals 4

    invoke-virtual {p0}, Lf2/s;->e()Lf2/r;

    move-result-object v0

    iget-object v1, p0, Lf2/s;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lf2/r;->G(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lf2/s;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/h;

    invoke-virtual {v0, v3, v2}, Lf2/r;->e(Ljava/lang/String;Lf2/h;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf2/s;->f:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/p;

    invoke-virtual {v0, v2}, Lf2/r;->f(Lf2/p;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lf2/s;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2}, Lf2/r;->C(ILf2/g;)V

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lf2/s;->c:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lf2/r;->I(Ljava/lang/String;)V

    :cond_3
    iget v1, p0, Lf2/s;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    invoke-virtual {v0, v1}, Lf2/r;->D(I)V

    :cond_4
    return-object v0
.end method

.method public final c(Lf2/p;)V
    .locals 1

    const-string v0, "navDeepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/s;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf2/s;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected e()Lf2/r;
    .locals 1

    iget-object v0, p0, Lf2/s;->a:Lf2/D;

    invoke-virtual {v0}, Lf2/D;->a()Lf2/r;

    move-result-object v0

    return-object v0
.end method
