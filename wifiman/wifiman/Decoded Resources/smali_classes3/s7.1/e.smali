.class public final Ls7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/d;


# instance fields
.field private final a:Lij/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lij/c;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Lij/c;-><init>(I)V

    iput-object v0, p0, Ls7/e;->a:Lij/c;

    return-void
.end method


# virtual methods
.method public a(Ls7/c;)Ljava/lang/String;
    .locals 4

    const-string/jumbo v0, "identification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/e;->a:Lij/c;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/UUID;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls7/c;

    invoke-virtual {v1, p1}, Ls7/c;->e(Ls7/c;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v0, p0, Ls7/e;->a:Lij/c;

    invoke-virtual {v0, v2}, Lij/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ls7/c;->f(Ls7/c;)V

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "key.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iget-object v1, p0, Ls7/e;->a:Lij/c;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "newUuid.toString()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
