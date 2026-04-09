.class public final Lxa/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa/a$d;


# instance fields
.field private final a:Lab/d;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lab/d;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string/jumbo v0, "latestRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/n;->a:Lab/d;

    iput-object p2, p0, Lxa/n;->b:Ljava/lang/Object;

    iput-object p3, p0, Lxa/n;->c:Ljava/lang/Object;

    invoke-virtual {p1}, Lab/d;->a()Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lxa/n;->d:Ljava/util/Set;

    invoke-virtual {p1}, Lab/d;->D()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lxa/n;->p0()LEa/c;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, LEa/c;->D()Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-nez p1, :cond_2

    invoke-virtual {p0}, Lxa/n;->j0()LFa/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, LFa/b;->D()Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, p2

    :cond_2
    :goto_1
    iput-object p1, p0, Lxa/n;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public D()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lxa/n;->e:Ljava/util/Map;

    return-object v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->I()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public N()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxa/n;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public Q0()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->Q0()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lxa/n;->d:Ljava/util/Set;

    return-object v0
.end method

.method public final c()Lab/d;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->h()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getId-2jxHnRY()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h0()Lua/b;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->h0()Lua/b;

    move-result-object v0

    return-object v0
.end method

.method public j0()LFa/b;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->l()Lab/d$d;

    move-result-object v0

    return-object v0
.end method

.method public p0()LEa/c;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->j()Lab/d$c;

    move-result-object v0

    return-object v0
.end method

.method public z()LCa/a;
    .locals 1

    iget-object v0, p0, Lxa/n;->a:Lab/d;

    invoke-virtual {v0}, Lab/d;->z()LCa/a;

    move-result-object v0

    return-object v0
.end method
