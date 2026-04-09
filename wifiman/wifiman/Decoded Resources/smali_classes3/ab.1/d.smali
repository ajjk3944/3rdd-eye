.class public final Lab/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lua/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lab/d$a;,
        Lab/d$b;,
        Lab/d$c;,
        Lab/d$d;,
        Lab/d$e;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lua/b;

.field private final g:Ljava/util/Set;

.field private final h:Ljava/util/Set;

.field private final i:Ljava/util/Set;

.field private final j:Lab/d$c;

.field private final k:Lab/d$d;

.field private final l:Ljava/util/Map;

.field private final m:LCa/a;

.field private final n:Lab/d$b;

.field private final o:Ljava/util/Map;

.field private final p:Lab/d$a;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lua/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lab/d$c;Lab/d$d;Ljava/util/Map;LCa/a;Lab/d$b;)V
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "guid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "nameAbbrev"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "line"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "systemID"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "images"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "videos"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "lookup"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lab/d;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lab/d;->b:Ljava/util/Set;

    .line 5
    iput-object p3, p0, Lab/d;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lab/d;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lab/d;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lab/d;->f:Lua/b;

    .line 9
    iput-object p7, p0, Lab/d;->g:Ljava/util/Set;

    .line 10
    iput-object p8, p0, Lab/d;->h:Ljava/util/Set;

    .line 11
    iput-object p9, p0, Lab/d;->i:Ljava/util/Set;

    .line 12
    iput-object p10, p0, Lab/d;->j:Lab/d$c;

    .line 13
    iput-object p11, p0, Lab/d;->k:Lab/d$d;

    .line 14
    iput-object p12, p0, Lab/d;->l:Ljava/util/Map;

    .line 15
    iput-object p13, p0, Lab/d;->m:LCa/a;

    .line 16
    iput-object p14, p0, Lab/d;->n:Lab/d$b;

    .line 17
    invoke-virtual {p0}, Lab/d;->Q0()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 p2, 0xa

    .line 18
    invoke-static {p1, p2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, LZg/U;->d(I)I

    move-result p2

    const/16 p3, 0x10

    invoke-static {p2, p3}, Lsh/m;->d(II)I

    move-result p2

    .line 19
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 21
    move-object p4, p2

    check-cast p4, Lab/d$a;

    .line 22
    invoke-virtual {p4}, Lab/d$a;->g()Lab/d$a$b;

    move-result-object p4

    .line 23
    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 24
    :cond_0
    iput-object p3, p0, Lab/d;->o:Ljava/util/Map;

    .line 25
    sget-object p1, Lab/d$a$b$b;->b:Lab/d$a$b$b;

    invoke-virtual {p0, p1}, Lab/d;->c(Lab/d$a$b;)Lab/d$a;

    move-result-object p1

    iput-object p1, p0, Lab/d;->p:Lab/d$a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lua/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lab/d$c;Lab/d$d;Ljava/util/Map;LCa/a;Lab/d$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p14}, Lab/d;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lua/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lab/d$c;Lab/d$d;Ljava/util/Map;LCa/a;Lab/d$b;)V

    return-void
.end method


# virtual methods
.method public D()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lab/d;->l:Ljava/util/Map;

    return-object v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lab/d;->e:Ljava/lang/String;

    return-object v0
.end method

.method public Q0()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lab/d;->h:Ljava/util/Set;

    return-object v0
.end method

.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lab/d;->b:Ljava/util/Set;

    return-object v0
.end method

.method public final c(Lab/d$a$b;)Lab/d$a;
    .locals 1

    const-string/jumbo v0, "variant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lab/d;->o:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lab/d$a;

    return-object p1
.end method

.method public final d()Lab/d$b;
    .locals 1

    iget-object v0, p0, Lab/d;->n:Lab/d$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lab/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lab/d;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Lab/d;

    invoke-virtual {p1}, Lab/d;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lua/a$a;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lab/d;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lab/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lab/d;->h0()Lua/b;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->h0()Lua/b;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lab/d;->h()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->h()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    invoke-virtual {p0}, Lab/d;->Q0()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->Q0()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    invoke-virtual {p0}, Lab/d;->m()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->m()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lab/d;->j()Lab/d$c;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->j()Lab/d$c;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    invoke-virtual {p0}, Lab/d;->l()Lab/d$d;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->l()Lab/d$d;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lab/d;->n:Lab/d$b;

    iget-object v3, p1, Lab/d;->n:Lab/d$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    invoke-virtual {p0}, Lab/d;->a()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lab/d;->a()Ljava/util/Set;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lab/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getId-2jxHnRY()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lab/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lab/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lab/d;->g:Ljava/util/Set;

    return-object v0
.end method

.method public h0()Lua/b;
    .locals 1

    iget-object v0, p0, Lab/d;->f:Lua/b;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lab/d;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lua/a$a;->h(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public j()Lab/d$c;
    .locals 1

    iget-object v0, p0, Lab/d;->j:Lab/d$c;

    return-object v0
.end method

.method public l()Lab/d$d;
    .locals 1

    iget-object v0, p0, Lab/d;->k:Lab/d$d;

    return-object v0
.end method

.method public m()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lab/d;->i:Ljava/util/Set;

    return-object v0
.end method

.method public z()LCa/a;
    .locals 1

    iget-object v0, p0, Lab/d;->m:LCa/a;

    return-object v0
.end method
