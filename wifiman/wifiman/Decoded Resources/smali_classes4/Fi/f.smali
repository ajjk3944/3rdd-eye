.class public final LFi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final a:LFi/i;


# direct methods
.method public constructor <init>(LFi/d;)V
    .locals 2

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LFi/i;

    invoke-virtual {p1}, LFi/d;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LFi/i;-><init>(Ljava/lang/Object;LFi/d;)V

    iput-object v0, p0, LFi/f;->a:LFi/i;

    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 4

    iget-object v0, p0, LFi/f;->a:LFi/i;

    invoke-virtual {v0}, LFi/i;->i()LFi/a;

    move-result-object v0

    new-instance v1, LFi/b;

    iget-object v2, p0, LFi/f;->a:LFi/i;

    invoke-virtual {v2}, LFi/i;->g()LFi/d;

    move-result-object v2

    invoke-virtual {v2}, LFi/d;->h()LEi/f;

    move-result-object v2

    iget-object v3, p0, LFi/f;->a:LFi/i;

    invoke-virtual {v3}, LFi/i;->h()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v2, v3, v0}, LFi/b;-><init>(Ljava/util/Map;Ljava/lang/Object;LFi/a;)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LFi/f;->a:LFi/i;

    invoke-virtual {v0}, LFi/i;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFi/f;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LFi/f;->a:LFi/i;

    invoke-virtual {v0}, LFi/i;->remove()V

    return-void
.end method
