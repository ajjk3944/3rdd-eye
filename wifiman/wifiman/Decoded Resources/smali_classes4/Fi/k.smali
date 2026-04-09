.class public final LFi/k;
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

    iput-object v0, p0, LFi/k;->a:LFi/i;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LFi/k;->a:LFi/i;

    invoke-virtual {v0}, LFi/i;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/k;->a:LFi/i;

    invoke-virtual {v0}, LFi/i;->i()LFi/a;

    move-result-object v0

    invoke-virtual {v0}, LFi/a;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LFi/k;->a:LFi/i;

    invoke-virtual {v0}, LFi/i;->remove()V

    return-void
.end method
