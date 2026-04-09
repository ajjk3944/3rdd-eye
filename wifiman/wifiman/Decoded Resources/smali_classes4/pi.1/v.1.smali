.class public abstract Lpi/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi/v0;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final g(LBh/h;)Z
    .locals 1

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lbi/i;->E(LBh/m;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public abstract c()LBh/h;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lpi/v0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Lpi/v;->hashCode()I

    move-result v2

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lpi/v0;

    invoke-interface {p1}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lpi/v;->c()LBh/h;

    move-result-object v0

    invoke-interface {p1}, Lpi/v0;->c()LBh/h;

    move-result-object p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    invoke-direct {p0, v0}, Lpi/v;->g(LBh/h;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1}, Lpi/v;->g(LBh/h;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Lpi/v;->h(LBh/h;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v1
.end method

.method protected final f(LBh/h;LBh/h;)Z
    .locals 3

    const-string v0, "first"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "second"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object p1

    invoke-interface {p2}, LBh/n;->b()LBh/m;

    move-result-object p2

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_7

    if-eqz p2, :cond_7

    instance-of v2, p1, LBh/G;

    if-eqz v2, :cond_1

    instance-of p1, p2, LBh/G;

    return p1

    :cond_1
    instance-of v2, p2, LBh/G;

    if-eqz v2, :cond_2

    return v1

    :cond_2
    instance-of v2, p1, LBh/M;

    if-eqz v2, :cond_4

    instance-of v2, p2, LBh/M;

    if-eqz v2, :cond_3

    check-cast p1, LBh/M;

    invoke-interface {p1}, LBh/M;->e()LZh/c;

    move-result-object p1

    check-cast p2, LBh/M;

    invoke-interface {p2}, LBh/M;->e()LZh/c;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move v1, v0

    :cond_3
    return v1

    :cond_4
    instance-of v0, p2, LBh/M;

    if-eqz v0, :cond_5

    return v1

    :cond_5
    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-interface {p1}, LBh/m;->b()LBh/m;

    move-result-object p1

    invoke-interface {p2}, LBh/m;->b()LBh/m;

    move-result-object p2

    goto :goto_0

    :cond_7
    return v0
.end method

.method protected abstract h(LBh/h;)Z
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lpi/v;->a:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lpi/v;->c()LBh/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lpi/v;->g(LBh/h;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object v0

    invoke-virtual {v0}, LZh/d;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    iput v0, p0, Lpi/v;->a:I

    return v0
.end method
