.class public final Lah/h;
.super LZg/j;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Lnh/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah/h$a;
    }
.end annotation


# static fields
.field private static final b:Lah/h$a;

.field private static final c:Lah/h;


# instance fields
.field private final a:Lah/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lah/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lah/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lah/h;->b:Lah/h$a;

    new-instance v0, Lah/h;

    sget-object v1, Lah/d;->n:Lah/d$a;

    invoke-virtual {v1}, Lah/d$a;->e()Lah/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lah/h;-><init>(Lah/d;)V

    sput-object v0, Lah/h;->c:Lah/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, Lah/d;

    invoke-direct {v0}, Lah/d;-><init>()V

    invoke-direct {p0, v0}, Lah/h;-><init>(Lah/d;)V

    return-void
.end method

.method public constructor <init>(Lah/d;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, LZg/j;-><init>()V

    .line 2
    iput-object p1, p0, Lah/h;->a:Lah/d;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0, p1}, Lah/d;->t(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->B()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0, p1}, Lah/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->size()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->U0()Lah/d$e;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->y()Ljava/util/Map;

    invoke-virtual {p0}, LZg/j;->size()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, Lah/h;->c:Lah/h;

    :goto_0
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0, p1}, Lah/d;->d1(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->B()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lah/h;->a:Lah/d;

    invoke-virtual {v0}, Lah/d;->B()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
