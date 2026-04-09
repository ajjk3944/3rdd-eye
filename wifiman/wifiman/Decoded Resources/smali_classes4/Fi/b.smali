.class final LFi/b;
.super LEi/b;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Lnh/a;


# instance fields
.field private final c:Ljava/util/Map;

.field private d:LFi/a;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/lang/Object;LFi/a;)V
    .locals 1

    const-string v0, "mutableMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "links"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p2, v0}, LEi/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, LFi/b;->c:Ljava/util/Map;

    iput-object p3, p0, LFi/b;->d:LFi/a;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/b;->d:LFi/a;

    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LFi/b;->d:LFi/a;

    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LFi/b;->d:LFi/a;

    invoke-virtual {v1, p1}, LFi/a;->h(Ljava/lang/Object;)LFi/a;

    move-result-object p1

    iput-object p1, p0, LFi/b;->d:LFi/a;

    iget-object p1, p0, LFi/b;->c:Ljava/util/Map;

    invoke-virtual {p0}, LEi/b;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LFi/b;->d:LFi/a;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
