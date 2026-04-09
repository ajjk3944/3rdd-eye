.class public final LEi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final a:LEi/g;


# direct methods
.method public constructor <init>(LEi/f;)V
    .locals 4

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v1, v0, [LEi/u;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, LEi/y;

    invoke-direct {v3, p0}, LEi/y;-><init>(LEi/i;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LEi/g;

    invoke-direct {v0, p1, v1}, LEi/g;-><init>(LEi/f;[LEi/u;)V

    iput-object v0, p0, LEi/i;->a:LEi/g;

    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 1

    iget-object v0, p0, LEi/i;->a:LEi/g;

    invoke-virtual {v0}, LEi/g;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LEi/i;->a:LEi/g;

    invoke-virtual {v0, p1, p2}, LEi/g;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LEi/i;->a:LEi/g;

    invoke-virtual {v0}, LEi/e;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LEi/i;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LEi/i;->a:LEi/g;

    invoke-virtual {v0}, LEi/g;->remove()V

    return-void
.end method
