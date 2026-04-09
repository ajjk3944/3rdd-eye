.class public final LFi/j;
.super LZg/g;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements Lnh/b;


# instance fields
.field private final a:LFi/d;


# direct methods
.method public constructor <init>(LFi/d;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/g;-><init>()V

    iput-object p1, p0, LFi/j;->a:LFi/d;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LFi/j;->a:LFi/d;

    invoke-virtual {v0}, LZg/i;->size()I

    move-result v0

    return v0
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LFi/j;->a:LFi/d;

    invoke-virtual {v0}, LFi/d;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LFi/j;->a:LFi/d;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LFi/k;

    iget-object v1, p0, LFi/j;->a:LFi/d;

    invoke-direct {v0, v1}, LFi/k;-><init>(LFi/d;)V

    return-object v0
.end method
