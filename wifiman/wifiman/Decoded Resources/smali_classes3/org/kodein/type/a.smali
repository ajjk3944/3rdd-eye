.class public abstract Lorg/kodein/type/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/type/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/kodein/type/a$a;
    }
.end annotation


# static fields
.field public static final b:Lorg/kodein/type/a$a;

.field private static final c:Lorg/kodein/type/q;

.field private static final d:Lorg/kodein/type/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/kodein/type/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/kodein/type/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/kodein/type/a;->b:Lorg/kodein/type/a$a;

    const-class v0, LYg/J;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->b(Lth/d;)Lorg/kodein/type/q;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/a;->c:Lorg/kodein/type/q;

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->b(Lth/d;)Lorg/kodein/type/q;

    move-result-object v0

    sput-object v0, Lorg/kodein/type/a;->d:Lorg/kodein/type/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lorg/kodein/type/q;)Z
    .locals 8

    const-string/jumbo v0, "typeToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_8

    sget-object v0, Lorg/kodein/type/a;->d:Lorg/kodein/type/q;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v0

    invoke-interface {p1}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Lorg/kodein/type/q;->b()[Lorg/kodein/type/q;

    move-result-object v0

    array-length v3, v0

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, Lorg/kodein/type/q;->b()[Lorg/kodein/type/q;

    move-result-object p1

    array-length v3, v0

    move v4, v2

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v6, v0, v4

    add-int/lit8 v7, v5, 0x1

    aget-object v5, p1, v5

    invoke-interface {v6, v5}, Lorg/kodein/type/q;->d(Lorg/kodein/type/q;)Z

    move-result v5

    if-nez v5, :cond_2

    return v2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    move v5, v7

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    invoke-interface {p1}, Lorg/kodein/type/q;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    move v1, v2

    goto :goto_1

    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/kodein/type/q;

    invoke-virtual {p0, v0}, Lorg/kodein/type/a;->d(Lorg/kodein/type/q;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_8
    :goto_1
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/kodein/type/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v1, v3, :cond_2

    check-cast p1, Lorg/kodein/type/q;

    invoke-virtual {p0, p1}, Lorg/kodein/type/a;->j(Lorg/kodein/type/q;)Z

    move-result p1

    return p1

    :cond_2
    invoke-interface {p0}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v1

    check-cast p1, Lorg/kodein/type/q;

    invoke-interface {p1}, Lorg/kodein/type/q;->c()Lorg/kodein/type/q;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-interface {p0}, Lorg/kodein/type/q;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Lorg/kodein/type/q;->f()Z

    move-result v1

    if-nez v1, :cond_7

    :cond_4
    invoke-interface {p0}, Lorg/kodein/type/q;->b()[Lorg/kodein/type/q;

    move-result-object v1

    invoke-interface {p1}, Lorg/kodein/type/q;->b()[Lorg/kodein/type/q;

    move-result-object p1

    array-length v3, v1

    array-length v4, p1

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    array-length v3, v1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_7

    aget-object v5, v1, v4

    aget-object v6, p1, v4

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    return v2

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lorg/kodein/type/a;->k()I

    move-result v0

    return v0
.end method

.method public abstract j(Lorg/kodein/type/q;)Z
.end method

.method public abstract k()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lorg/kodein/type/q;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
