.class public abstract Lcom/google/common/collect/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/p$a;
    }
.end annotation


# static fields
.field static final d:[Ljava/util/Map$Entry;


# instance fields
.field private transient a:Lcom/google/common/collect/r;

.field private transient b:Lcom/google/common/collect/r;

.field private transient c:Lcom/google/common/collect/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Map$Entry;

    sput-object v0, Lcom/google/common/collect/p;->d:[Ljava/util/Map$Entry;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lcom/google/common/collect/p$a;
    .locals 1

    new-instance v0, Lcom/google/common/collect/p$a;

    invoke-direct {v0}, Lcom/google/common/collect/p$a;-><init>()V

    return-object v0
.end method

.method public static g(Ljava/lang/Iterable;)Lcom/google/common/collect/p;
    .locals 2

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    new-instance v1, Lcom/google/common/collect/p$a;

    invoke-direct {v1, v0}, Lcom/google/common/collect/p$a;-><init>(I)V

    invoke-virtual {v1, p0}, Lcom/google/common/collect/p$a;->h(Ljava/lang/Iterable;)Lcom/google/common/collect/p$a;

    invoke-virtual {v1}, Lcom/google/common/collect/p$a;->a()Lcom/google/common/collect/p;

    move-result-object p0

    return-object p0
.end method

.method public static r()Lcom/google/common/collect/p;
    .locals 1

    sget-object v0, Lcom/google/common/collect/J;->h:Lcom/google/common/collect/p;

    return-object v0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, p3}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4, p5}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p6, p7}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x4

    filled-new-array/range {p0 .. p7}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/common/collect/J;->B(I[Ljava/lang/Object;)Lcom/google/common/collect/J;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/p;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, p3}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4, p5}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p6, p7}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p8, p9}, Lcom/google/common/collect/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x5

    filled-new-array/range {p0 .. p9}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/google/common/collect/J;->B(I[Ljava/lang/Object;)Lcom/google/common/collect/J;

    move-result-object p0

    return-object p0
.end method

.method public static varargs v([Ljava/util/Map$Entry;)Lcom/google/common/collect/p;
    .locals 0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/p;->g(Ljava/lang/Iterable;)Lcom/google/common/collect/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final clear()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/p;->y()Lcom/google/common/collect/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/collect/n;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/p;->n()Lcom/google/common/collect/r;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/common/collect/z;->a(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/common/collect/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method abstract h()Lcom/google/common/collect/r;
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/p;->n()Lcom/google/common/collect/r;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/collect/M;->b(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method abstract j()Lcom/google/common/collect/r;
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/p;->p()Lcom/google/common/collect/r;

    move-result-object v0

    return-object v0
.end method

.method abstract l()Lcom/google/common/collect/n;
.end method

.method public n()Lcom/google/common/collect/r;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/p;->a:Lcom/google/common/collect/r;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/p;->h()Lcom/google/common/collect/r;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/p;->a:Lcom/google/common/collect/r;

    :cond_0
    return-object v0
.end method

.method public p()Lcom/google/common/collect/r;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/p;->b:Lcom/google/common/collect/r;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/p;->j()Lcom/google/common/collect/r;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/p;->b:Lcom/google/common/collect/r;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/common/collect/z;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/p;->y()Lcom/google/common/collect/n;

    move-result-object v0

    return-object v0
.end method

.method public y()Lcom/google/common/collect/n;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/p;->c:Lcom/google/common/collect/n;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/collect/p;->l()Lcom/google/common/collect/n;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/p;->c:Lcom/google/common/collect/n;

    :cond_0
    return-object v0
.end method
