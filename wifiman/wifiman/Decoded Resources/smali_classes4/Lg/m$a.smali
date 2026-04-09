.class public LLg/m$a;
.super LLg/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static d:LEj/b;


# instance fields
.field private final c:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/m$a;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/m$a;->d:LEj/b;

    return-void
.end method

.method public constructor <init>(LKg/e;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLg/m;-><init>(Ljava/util/EventListener;Z)V

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 p2, 0x20

    invoke-direct {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object p1, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method private static final c(LKg/d;LKg/d;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, LKg/d;->z()[B

    move-result-object v1

    invoke-virtual {p1}, LKg/d;->z()[B

    move-result-object v2

    array-length v3, v1

    array-length v4, v2

    if-eq v3, v4, :cond_3

    return v0

    :cond_3
    move v3, v0

    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_5

    aget-byte v4, v1, v3

    aget-byte v5, v2, v3

    if-eq v4, v5, :cond_4

    return v0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, LKg/d;->E(LKg/d;)Z

    move-result p0

    if-nez p0, :cond_6

    return v0

    :cond_6
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method d(LKg/c;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LKg/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object v2

    invoke-virtual {v2}, LKg/d;->c()LKg/d;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    check-cast v0, LKg/e;

    invoke-interface {v0, p1}, LKg/e;->c(LKg/c;)V

    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LKg/d;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    check-cast v0, LKg/e;

    invoke-interface {v0, p1}, LKg/e;->e(LKg/c;)V

    goto :goto_0

    :cond_0
    sget-object v0, LLg/m$a;->d:LEj/b;

    const-string v1, "Service Added called for a service already added: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method e(LKg/c;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LKg/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    check-cast v0, LKg/e;

    invoke-interface {v0, p1}, LKg/e;->b(LKg/c;)V

    goto :goto_0

    :cond_0
    sget-object v0, LLg/m$a;->d:LEj/b;

    const-string v1, "Service Removed called for a service already removed: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method declared-synchronized f(LKg/c;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, LKg/c;->d()LKg/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LKg/d;->D()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LKg/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKg/d;

    invoke-static {v0, v2}, LLg/m$a;->c(LKg/d;LKg/d;)Z

    move-result v3

    if-nez v3, :cond_1

    if-nez v2, :cond_0

    iget-object v2, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0}, LKg/d;->c()LKg/d;

    move-result-object v0

    invoke-interface {v2, v1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    check-cast v0, LKg/e;

    invoke-interface {v0, p1}, LKg/e;->e(LKg/c;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v3, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0}, LKg/d;->c()LKg/d;

    move-result-object v0

    invoke-interface {v3, v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v0

    check-cast v0, LKg/e;

    invoke-interface {v0, p1}, LKg/e;->e(LKg/c;)V

    goto :goto_0

    :cond_1
    sget-object v0, LLg/m$a;->d:LEj/b;

    const-string v1, "Service Resolved called for a service already resolved: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object v0, LLg/m$a;->d:LEj/b;

    const-string v1, "Service Resolved called for an unresolved event: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x800

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "[Status for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/m;->a()Ljava/util/EventListener;

    move-result-object v1

    check-cast v1, LKg/e;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, " no type event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLg/m$a;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, ") "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
