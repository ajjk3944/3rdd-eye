.class public final LY/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final a:LY/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY/f;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v1, v0, [LY/u;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, LY/y;

    invoke-direct {v3, p0}, LY/y;-><init>(LY/i;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, LY/g;

    invoke-direct {v0, p1, v1}, LY/g;-><init>(LY/f;[LY/u;)V

    iput-object v0, p0, LY/i;->a:LY/g;

    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 1

    iget-object v0, p0, LY/i;->a:LY/g;

    invoke-virtual {v0}, LY/g;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LY/i;->a:LY/g;

    invoke-virtual {v0, p1, p2}, LY/g;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LY/i;->a:LY/g;

    invoke-virtual {v0}, LY/e;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY/i;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LY/i;->a:LY/g;

    invoke-virtual {v0}, LY/g;->remove()V

    return-void
.end method
