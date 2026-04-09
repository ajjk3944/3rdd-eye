.class public final Lxa/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwa/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/f$a;,
        Lxa/f$b;
    }
.end annotation


# static fields
.field public static final h:Lxa/f$a;


# instance fields
.field private final a:Ljava/util/HashMap;

.field private final b:Ljava/util/HashMap;

.field private final c:Ljava/util/HashMap;

.field private final d:Ljava/util/HashMap;

.field private final e:Ljava/util/HashMap;

.field private final f:Ljava/util/HashMap;

.field private final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxa/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxa/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxa/f;->h:Lxa/f$a;

    return-void
.end method

.method public constructor <init>(Lxa/a$b;Lxa/a$b;Lxa/a$c;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/f;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/f;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/f;->c:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/f;->d:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/f;->e:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/f;->f:Ljava/util/HashMap;

    new-instance v0, Lxa/b;

    invoke-direct {v0}, Lxa/b;-><init>()V

    invoke-static {v0}, LBa/a;->b(Lmh/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lxa/a$b;->a()Lbb/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lbb/a$a;->a()J

    move-result-wide v3

    invoke-virtual {p2}, Lxa/a$b;->a()Lbb/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lbb/a$a;->a()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-ltz v3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lxa/a$b;->a()Lbb/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lbb/a$a;->a()J

    move-result-wide v3

    invoke-virtual {p1}, Lxa/a$b;->a()Lbb/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lbb/a$a;->a()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-ltz p1, :cond_2

    :cond_1
    move-object p1, p2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :cond_3
    :goto_0
    if-eqz p3, :cond_4

    invoke-interface {p3}, Lxa/a$c;->b()Ljava/util/Map;

    move-result-object p2

    goto :goto_1

    :cond_4
    move-object p2, v2

    :goto_1
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lxa/a$b;->b()Lbb/a;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lbb/a;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_8

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lab/d;

    if-eqz p2, :cond_5

    invoke-virtual {v4}, Lab/d;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object v5

    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_3

    :cond_5
    move-object v5, v2

    :goto_3
    if-eqz p2, :cond_6

    invoke-virtual {v4}, Lab/d;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object v6

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_4

    :cond_6
    move-object v6, v2

    :goto_4
    if-eqz v5, :cond_7

    if-eqz p3, :cond_7

    invoke-interface {p3, v5}, Lxa/a$c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_5

    :cond_7
    move-object v5, v2

    :goto_5
    new-instance v7, Lxa/n;

    invoke-direct {v7, v4, v6, v5}, Lxa/n;-><init>(Lab/d;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    iput-object v3, p0, Lxa/f;->g:Ljava/util/Set;

    new-instance p1, Lxa/c;

    invoke-direct {p1, p0}, Lxa/c;-><init>(Lxa/f;)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    new-instance p1, Lxa/d;

    invoke-direct {p1}, Lxa/d;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    invoke-virtual {p0}, Lxa/f;->b()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxa/n;

    iget-object p3, p0, Lxa/f;->a:Ljava/util/HashMap;

    invoke-virtual {p2}, Lxa/n;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object v2

    invoke-interface {p3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lxa/n;->g()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_7
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lua/a$d;

    invoke-virtual {v2}, Lua/a$d;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lua/a$d;->a(Ljava/lang/String;)Lua/a$d;

    move-result-object v2

    iget-object v3, p0, Lxa/f;->b:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_a
    invoke-virtual {p2}, Lxa/n;->a()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_8
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/UUID;

    iget-object v3, p0, Lxa/f;->c:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_b
    invoke-virtual {p2}, Lxa/n;->D()Ljava/util/Map;

    move-result-object p3

    if-eqz p3, :cond_c

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_9
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva/b;

    invoke-virtual {v2}, Lva/b;->l()Ljava/util/UUID;

    move-result-object v2

    iget-object v3, p0, Lxa/f;->c:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_c
    invoke-virtual {p2}, Lxa/n;->p0()LEa/c;

    move-result-object p3

    if-eqz p3, :cond_d

    invoke-interface {p3}, LEa/c;->D()Ljava/util/Map;

    move-result-object p3

    if-eqz p3, :cond_d

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_a
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva/b;

    invoke-virtual {v2}, Lva/b;->l()Ljava/util/UUID;

    move-result-object v2

    iget-object v3, p0, Lxa/f;->c:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_d
    invoke-virtual {p2}, Lxa/n;->j0()LFa/b;

    move-result-object p3

    if-eqz p3, :cond_e

    invoke-interface {p3}, LFa/b;->D()Ljava/util/Map;

    move-result-object p3

    if-eqz p3, :cond_e

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_b
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva/b;

    invoke-virtual {v2}, Lva/b;->l()Ljava/util/UUID;

    move-result-object v2

    iget-object v3, p0, Lxa/f;->c:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_e
    invoke-virtual {p2}, Lxa/n;->c()Lab/d;

    move-result-object p3

    invoke-virtual {p3}, Lab/d;->d()Lab/d$b;

    move-result-object p3

    invoke-virtual {p3}, Lab/d$b;->c()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_c
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lab/d$b$a;

    sget-object v3, Lxa/f$b;->c:Lxa/f$b$a;

    invoke-virtual {v2}, Lab/d$b$a;->c()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    invoke-virtual {v2}, Lab/d$b$a;->a()Ljava/lang/String;

    move-result-object v4

    :cond_f
    invoke-virtual {v2}, Lab/d$b$a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lxa/f$b$a;->a(Ljava/lang/String;Ljava/lang/String;)Lxa/f$b;

    move-result-object v2

    if-nez v2, :cond_10

    goto :goto_c

    :cond_10
    iget-object v3, p0, Lxa/f;->f:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_11
    invoke-virtual {p2}, Lxa/n;->j0()LFa/b;

    move-result-object p3

    if-eqz p3, :cond_9

    invoke-interface {p3}, LFa/b;->e()LFa/b$a;

    move-result-object p3

    if-eqz p3, :cond_9

    invoke-interface {p3}, LFa/b$a;->b()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_9

    iget-object v2, p0, Lxa/f;->e:Ljava/util/HashMap;

    invoke-static {p3}, Lua/a$c;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lua/a$c;->a(Ljava/lang/String;)Lua/a$c;

    move-result-object p3

    invoke-interface {v2, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    :cond_12
    invoke-virtual {p0}, Lxa/f;->b()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxa/n;

    invoke-virtual {p2}, Lxa/n;->c()Lab/d;

    move-result-object p3

    invoke-virtual {p3}, Lab/d;->d()Lab/d$b;

    move-result-object p3

    invoke-virtual {p3}, Lab/d$b;->a()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_d
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_14
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Lxa/f;->b()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_15
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_17

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lxa/n;

    invoke-virtual {p3}, Lxa/n;->c()Lab/d;

    move-result-object v2

    invoke-virtual {v2}, Lab/d;->d()Lab/d$b;

    move-result-object v2

    invoke-virtual {v2}, Lab/d$b;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_16

    invoke-static {}, LZg/v;->v()V

    :cond_16
    check-cast v4, Lab/d$b$a;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3}, Lxa/n;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object v4

    invoke-static {v3, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_e

    :cond_17
    new-instance p2, Lxa/f$c;

    invoke-direct {p2}, Lxa/f$c;-><init>()V

    new-instance p3, Lxa/f$d;

    invoke-direct {p3, p2}, Lxa/f$d;-><init>(Ljava/util/Comparator;)V

    invoke-static {p1, p3}, LZg/v;->Z(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/SortedSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_18
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LYg/s;

    invoke-virtual {p2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lua/a$a;

    invoke-virtual {p2}, Lua/a$a;->l()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lxa/f;->a:Ljava/util/HashMap;

    invoke-static {p2}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxa/n;

    if-eqz p2, :cond_18

    invoke-virtual {p2}, Lxa/n;->c()Lab/d;

    move-result-object v2

    invoke-virtual {v2}, Lab/d;->d()Lab/d$b;

    move-result-object v2

    invoke-virtual {v2}, Lab/d$b;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lab/d$b$a;

    invoke-virtual {p3}, Lab/d$b$a;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_19

    iget-object v3, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    invoke-virtual {p3}, Lab/d$b$a;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1a

    iget-object v3, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1a
    invoke-virtual {p3}, Lab/d$b$a;->d()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_18

    iget-object v2, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-interface {v2, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_1b
    invoke-virtual {p0}, Lxa/f;->b()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxa/n;

    iget-object p3, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-virtual {p2}, Lxa/n;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    :cond_1c
    invoke-virtual {p0}, Lxa/f;->b()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxa/n;

    iget-object p3, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-virtual {p2}, Lxa/n;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :cond_1d
    new-instance p1, Lxa/e;

    invoke-direct {p1, v0, v1}, Lxa/e;-><init>(J)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    return-void
.end method

.method public static synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lxa/f;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lxa/f;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lxa/f;->l(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxa/f;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lxa/f;->m(Lxa/f;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final k()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UIDB Catalog Browser - initialization started ..."

    return-object v0
.end method

.method private static final l(J)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p1, "UIDB Catalog Browser - initialization finished in "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ms"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lxa/f;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lxa/f;->b()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "UIDB Catalog Browser - latest products set LOADED. Contains "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " products"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final n()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UIDB Catalog Browser - preparing lookup maps ..."

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)Lua/a;
    .locals 0

    invoke-virtual {p0, p1}, Lxa/f;->s(Ljava/lang/String;)Lxa/n;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lxa/f;->g:Ljava/util/Set;

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/String;)Lua/a;
    .locals 0

    invoke-virtual {p0, p1}, Lxa/f;->r(Ljava/lang/String;)Lxa/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/String;)Lua/a;
    .locals 0

    invoke-virtual {p0, p1}, Lxa/f;->o(Ljava/lang/String;)Lxa/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/String;Ljava/lang/String;)Lua/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxa/f;->p(Ljava/lang/String;Ljava/lang/String;)Lxa/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/util/UUID;)Lua/a;
    .locals 0

    invoke-virtual {p0, p1}, Lxa/f;->q(Ljava/util/UUID;)Lxa/n;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/String;)Lxa/n;
    .locals 1

    const-string/jumbo v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxa/f;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/n;

    return-object p1
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;)Lxa/n;
    .locals 1

    sget-object v0, Lxa/f$b;->c:Lxa/f$b$a;

    invoke-virtual {v0, p1, p2}, Lxa/f$b$a;->a(Ljava/lang/String;Ljava/lang/String;)Lxa/f$b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lxa/f;->f:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/n;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public q(Ljava/util/UUID;)Lxa/n;
    .locals 1

    const-string/jumbo v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxa/f;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/n;

    return-object p1
.end method

.method public r(Ljava/lang/String;)Lxa/n;
    .locals 1

    const-string/jumbo v0, "productID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxa/f;->a:Ljava/util/HashMap;

    invoke-static {p1}, Lua/a$a;->a(Ljava/lang/String;)Lua/a$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/n;

    return-object p1
.end method

.method public s(Ljava/lang/String;)Lxa/n;
    .locals 1

    const-string/jumbo v0, "systemID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxa/f;->b:Ljava/util/HashMap;

    invoke-static {p1}, Lua/a$d;->a(Ljava/lang/String;)Lua/a$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/n;

    return-object p1
.end method
