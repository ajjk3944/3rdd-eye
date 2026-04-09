.class public final LFi/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final a:LFi/p;


# direct methods
.method public constructor <init>(LFi/c;)V
    .locals 2

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LFi/p;

    invoke-virtual {p1}, LFi/c;->r()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, LFi/c;->s()LEi/d;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LFi/p;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    iput-object v0, p0, LFi/r;->a:LFi/p;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LFi/r;->a:LFi/p;

    invoke-virtual {v0}, LFi/p;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/r;->a:LFi/p;

    invoke-virtual {v0}, LFi/p;->e()LFi/a;

    move-result-object v0

    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
