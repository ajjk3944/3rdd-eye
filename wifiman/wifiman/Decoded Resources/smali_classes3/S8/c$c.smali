.class final LS8/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS8/c;-><init>(Ljava/lang/String;ILjava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LS8/c;


# direct methods
.method constructor <init>(LS8/c;)V
    .locals 0

    iput-object p1, p0, LS8/c$c;->a:LS8/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 7

    iget-object v0, p0, LS8/c$c;->a:LS8/c;

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0}, LS8/c;->getChannels()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS8/e;

    new-instance v3, LS8/c$a;

    invoke-virtual {v2}, LS8/e;->a()LS8/c;

    move-result-object v4

    invoke-virtual {v2}, LS8/e;->d()I

    move-result v5

    invoke-virtual {v2}, LS8/e;->b()LS8/d;

    move-result-object v6

    invoke-direct {v3, v4, v5, v6}, LS8/c$a;-><init>(LS8/c;ILS8/d;)V

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v1}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS8/c$c;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
