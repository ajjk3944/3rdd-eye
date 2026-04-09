.class final LM8/A$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;->k1(LS8/c;)Lgg/i;
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

    iput-object p1, p0, LM8/A$A;->a:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lie/d;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Ljava/util/HashSet;

    invoke-virtual {p0, p1, p2, p3}, LM8/A$A;->b(Lie/d;Ljava/util/Set;Ljava/util/HashSet;)LM8/A$b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lie/d;Ljava/util/Set;Ljava/util/HashSet;)LM8/A$b;
    .locals 6

    const-string/jumbo v0, "quality"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "supportedBands"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "currentNetworkChannels"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/A$A;->a:LS8/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LS8/c;->getChannels()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS8/c;

    invoke-virtual {v1}, LS8/c;->getChannels()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, p0, LM8/A$A;->a:LS8/c;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS8/e;

    invoke-virtual {v2}, LS8/e;->b()LS8/d;

    move-result-object v3

    sget-object v4, LS8/d;->MHZ_20:LS8/d;

    const/4 v5, 0x0

    if-ne v3, v4, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v5

    :goto_3
    if-eqz v2, :cond_4

    invoke-interface {p1, v2}, Lie/d;->a(LS8/e;)Lie/c;

    move-result-object v5

    :cond_4
    if-eqz v5, :cond_2

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p1, LM8/A$b$c$b;

    invoke-direct {p1, p2, p3, v1}, LM8/A$b$c$b;-><init>(LS8/c;Ljava/util/HashSet;Ljava/util/List;)V

    return-object p1
.end method
