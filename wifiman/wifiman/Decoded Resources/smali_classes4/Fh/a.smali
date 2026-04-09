.class public final LFh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LSh/n;

.field private final b:LFh/g;

.field private final c:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(LSh/n;LFh/g;)V
    .locals 1

    const-string v0, "resolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFh/a;->a:LSh/n;

    iput-object p2, p0, LFh/a;->b:LFh/g;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LFh/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public final a(LFh/f;)Lii/k;
    .locals 8

    const-string v0, "fileClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFh/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, LFh/f;->b()LZh/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, LFh/f;->b()LZh/b;

    move-result-object v2

    invoke-virtual {v2}, LZh/b;->f()LZh/c;

    move-result-object v2

    invoke-virtual {p1}, LFh/f;->a()LTh/a;

    move-result-object v3

    invoke-virtual {v3}, LTh/a;->c()LTh/a$a;

    move-result-object v3

    sget-object v4, LTh/a$a;->MULTIFILE_CLASS:LTh/a$a;

    if-ne v3, v4, :cond_1

    invoke-virtual {p1}, LFh/f;->a()LTh/a;

    move-result-object v3

    invoke-virtual {v3}, LTh/a;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v6, LZh/b;->d:LZh/b$a;

    invoke-static {v5}, Lgi/d;->d(Ljava/lang/String;)Lgi/d;

    move-result-object v5

    invoke-virtual {v5}, Lgi/d;->e()LZh/c;

    move-result-object v5

    const-string v7, "getFqNameForTopLevelClassMaybeWithDollars(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v5

    iget-object v6, p0, LFh/a;->b:LFh/g;

    iget-object v7, p0, LFh/a;->a:LSh/n;

    invoke-virtual {v7}, LSh/n;->f()Lli/n;

    move-result-object v7

    invoke-virtual {v7}, Lli/n;->g()Lli/o;

    move-result-object v7

    invoke-static {v7}, Lxi/c;->a(Lli/o;)LYh/e;

    move-result-object v7

    invoke-static {v6, v5, v7}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_2
    new-instance v3, LDh/p;

    iget-object v5, p0, LFh/a;->a:LSh/n;

    invoke-virtual {v5}, LSh/n;->f()Lli/n;

    move-result-object v5

    invoke-virtual {v5}, Lli/n;->q()LBh/G;

    move-result-object v5

    invoke-direct {v3, v5, v2}, LDh/p;-><init>(LBh/G;LZh/c;)V

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LSh/x;

    iget-object v7, p0, LFh/a;->a:LSh/n;

    invoke-virtual {v7, v3, v6}, LSh/n;->c(LBh/M;LSh/x;)Lii/k;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v5}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Lii/b;->d:Lii/b$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "package "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {v4, p1, v3}, Lii/b$a;->a(Ljava/lang/String;Ljava/lang/Iterable;)Lii/k;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v2, p1

    goto :goto_2

    :cond_5
    move-object v2, v0

    :cond_6
    :goto_2
    const-string p1, "getOrPut(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lii/k;

    return-object v2
.end method
