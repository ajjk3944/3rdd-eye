.class public final Lvj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvj/d$b;
    }
.end annotation


# instance fields
.field private final a:Lorg/kodein/di/h;

.field private final b:Lvj/d$b;

.field private final c:Z

.field private final d:Z

.field private volatile e:Lmh/a;


# direct methods
.method private constructor <init>(Lorg/kodein/di/h;Lvj/d$b;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvj/d;->a:Lorg/kodein/di/h;

    .line 3
    iput-object p2, p0, Lvj/d;->b:Lvj/d$b;

    .line 4
    iput-boolean p3, p0, Lvj/d;->c:Z

    .line 5
    iput-boolean p4, p0, Lvj/d;->d:Z

    return-void
.end method

.method public constructor <init>(Lvj/c;Ljava/util/List;ZZZ)V
    .locals 3

    const-string/jumbo v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "externalSources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lvj/g;

    invoke-virtual {p1}, Lvj/c;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lvj/c;->f()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, p2, v2}, Lvj/g;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V

    const/4 p2, 0x0

    invoke-direct {p0, v0, p2, p3, p4}, Lvj/d;-><init>(Lorg/kodein/di/h;Lvj/d$b;ZZ)V

    .line 7
    new-instance p2, Lvj/d$g;

    invoke-direct {p2, p0, p1}, Lvj/d$g;-><init>(Lvj/d;Lvj/c;)V

    if-eqz p5, :cond_0

    .line 8
    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p3, Lvj/d$a;

    invoke-direct {p3, p1, p0, p2}, Lvj/d$a;-><init>(Ljava/lang/Object;Lvj/d;Lmh/a;)V

    iput-object p3, p0, Lvj/d;->e:Lmh/a;

    :goto_0
    return-void
.end method

.method public static final synthetic c(Lvj/d;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lvj/d;->e:Lmh/a;

    return-void
.end method

.method private final d(Lorg/kodein/di/DI$e;Lorg/kodein/di/f;Lorg/kodein/di/h;I)Luj/b;
    .locals 4

    new-instance v0, Lvj/d;

    new-instance v1, Lvj/d$b;

    iget-object v2, p0, Lvj/d;->b:Lvj/d$b;

    iget-boolean v3, p0, Lvj/d;->c:Z

    invoke-direct {v1, p1, p4, v2, v3}, Lvj/d$b;-><init>(Lorg/kodein/di/DI$e;ILvj/d$b;Z)V

    iget-boolean v2, p0, Lvj/d;->c:Z

    iget-boolean v3, p0, Lvj/d;->d:Z

    invoke-direct {v0, p3, v1, v2, v3}, Lvj/d;-><init>(Lorg/kodein/di/h;Lvj/d$b;ZZ)V

    new-instance p3, Lvj/a;

    new-instance v1, Lvj/i;

    invoke-direct {v1, v0, p2}, Lvj/i;-><init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V

    invoke-direct {p3, v1, p1, p4}, Lvj/a;-><init>(Lrj/m2;Lorg/kodein/di/DI$e;I)V

    return-object p3
.end method


# virtual methods
.method public a(Lorg/kodein/di/DI$e;Ljava/lang/Object;I)Lmh/a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lorg/kodein/di/e$b;->b(Lorg/kodein/di/e;Lorg/kodein/di/DI$e;Ljava/lang/Object;I)Lmh/a;

    move-result-object p1

    return-object p1
.end method

.method public b(Lorg/kodein/di/DI$e;Ljava/lang/Object;I)Lmh/l;
    .locals 12

    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move v3, p3

    invoke-static/range {v1 .. v6}, Lorg/kodein/di/h$a;->a(Lorg/kodein/di/h;Lorg/kodein/di/DI$e;IZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYg/y;

    invoke-virtual {v0}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrj/k2;

    invoke-virtual {v0}, LYg/y;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luj/d;

    iget-object v2, p0, Lvj/d;->b:Lvj/d$b;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1, p3}, Lvj/d$b;->a(Lorg/kodein/di/DI$e;I)V

    :cond_0
    sget-object v2, Lorg/kodein/di/f;->a:Lorg/kodein/di/f$a;

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object v3

    invoke-virtual {v2, v3, p2}, Lorg/kodein/di/f$a;->a(Lorg/kodein/type/q;Ljava/lang/Object;)Lorg/kodein/di/f;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.di.DIContext<kotlin.Any>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    new-instance v3, Lvj/i;

    invoke-direct {v3, p0, v2}, Lvj/i;-><init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V

    invoke-static {v0, v3, p2}, Luj/t;->a(Luj/d;Lrj/m2;Ljava/lang/Object;)Lorg/kodein/di/f;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p2

    :cond_2
    :goto_0
    invoke-virtual {v1}, Lrj/k2;->c()Lorg/kodein/di/h;

    move-result-object p2

    invoke-direct {p0, p1, v2, p2, p3}, Lvj/d;->d(Lorg/kodein/di/DI$e;Lorg/kodein/di/f;Lorg/kodein/di/h;I)Luj/b;

    move-result-object p2

    invoke-virtual {v1}, Lrj/j2;->a()Luj/e;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Luj/a;->i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object v1, Lorg/kodein/di/f;->a:Lorg/kodein/di/f$a;

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->g()Lorg/kodein/type/q;

    move-result-object v4

    invoke-virtual {v1, v4, p2}, Lorg/kodein/di/f$a;->a(Lorg/kodein/type/q;Ljava/lang/Object;)Lorg/kodein/di/f;

    move-result-object p2

    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object v1

    invoke-direct {p0, p1, p2, v1, p3}, Lvj/d;->d(Lorg/kodein/di/DI$e;Lorg/kodein/di/f;Lorg/kodein/di/h;I)Luj/b;

    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object p2

    invoke-interface {p2}, Lorg/kodein/di/h;->c()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_e

    if-eqz p3, :cond_4

    move v2, v3

    :cond_4
    iget-boolean p2, p0, Lvj/d;->c:Z

    if-eqz p2, :cond_5

    new-instance p2, Lvj/d$e;

    invoke-direct {p2, p1}, Lvj/d$e;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    new-instance p2, Lvj/d$f;

    invoke-direct {p2, p1}, Lvj/d$f;-><init>(Ljava/lang/Object;)V

    :goto_1
    iget-boolean p3, p0, Lvj/d;->c:Z

    if-eqz p3, :cond_6

    sget-object p3, Lvj/d$c;->a:Lvj/d$c;

    goto :goto_2

    :cond_6
    sget-object p3, Lvj/d$d;->a:Lvj/d$d;

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v3, 0x10

    const/16 v4, 0xa

    if-eqz v1, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "No binding found for "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lth/m;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p2, p0, Lvj/d;->d:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "append(\'\\n\')"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object p2

    new-instance v1, Lrj/N5;

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->l()Lorg/kodein/type/q;

    move-result-object v8

    const/16 v10, 0xb

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, Lrj/N5;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, Lorg/kodein/di/h;->e(Lrj/N5;)Ljava/util/List;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Available bindings for this type:\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, LZg/U;->d(I)I

    move-result v4

    invoke-static {v4, v3}, Lsh/m;->d(II)I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYg/y;

    invoke-virtual {v3}, LYg/y;->j()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LYg/y;->l()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    invoke-virtual {v3}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p3, v4, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Registered in this DI container:\n"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object v1

    invoke-interface {v1}, Lorg/kodein/di/h;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo p3, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lorg/kodein/di/DI$NotFoundException;

    invoke-direct {p3, p1, p2}, Lorg/kodein/di/DI$NotFoundException;-><init>(Lorg/kodein/di/DI$e;Ljava/lang/String;)V

    throw p3

    :cond_a
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, LZg/U;->d(I)I

    move-result p2

    invoke-static {p2, v3}, Lsh/m;->d(II)I

    move-result p2

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYg/y;

    invoke-virtual {v0}, LYg/y;->j()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object v4

    invoke-virtual {v0}, LYg/y;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/kodein/di/DI$e;

    invoke-interface {v4, v0}, Lorg/kodein/di/h;->b(Lorg/kodein/di/DI$e;)LYg/y;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYg/y;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-virtual {v0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Lvj/d;->f()Lorg/kodein/di/h;

    move-result-object p2

    invoke-interface {p2}, Lorg/kodein/di/h;->a()Ljava/util/Map;

    move-result-object p2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_c
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/kodein/di/DI$e;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_d
    new-instance p2, Lorg/kodein/di/DI$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " bindings found that match "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ":\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {p3, v1, v4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "Other bindings registered in DI:\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lorg/kodein/di/DI$NotFoundException;-><init>(Lorg/kodein/di/DI$e;Ljava/lang/String;)V

    throw p2

    :cond_e
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final e()Lmh/a;
    .locals 1

    iget-object v0, p0, Lvj/d;->e:Lmh/a;

    return-object v0
.end method

.method public f()Lorg/kodein/di/h;
    .locals 1

    iget-object v0, p0, Lvj/d;->a:Lorg/kodein/di/h;

    return-object v0
.end method
