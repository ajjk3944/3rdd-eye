.class final Ly8/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/q;-><init>(Lje/C;Ly8/a$b;Ljd/b;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/q;


# direct methods
.method constructor <init>(Ly8/q;)V
    .locals 0

    iput-object p1, p0, Ly8/q$c;->a:Ly8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;)LTe/J;
    .locals 8

    const-string/jumbo v0, "timeline"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "markers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v0

    iget-object v1, p0, Ly8/q$c;->a:Ly8/q;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS8/c;

    invoke-static {v1, v2, p1, p2}, Ly8/q;->i(Ly8/q;LS8/c;Ljava/util/List;Ljava/util/List;)LYg/s;

    move-result-object v2

    invoke-virtual {v2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {v2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v6, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    new-instance p1, LTe/J;

    sget-object v2, Lgc/b;->SIGNAL:Lgc/b;

    sget-object v4, LTe/M$b$b;->a:LTe/M$b$b;

    iget-object p2, p0, Ly8/q$c;->a:Ly8/q;

    invoke-virtual {p2}, Ly8/f;->e()LTe/L;

    move-result-object v5

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v7

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, LTe/J;-><init>(Lgc/b;Ljava/util/List;LTe/M;LTe/L;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ly8/q$c;->a(Ljava/util/List;Ljava/util/List;)LTe/J;

    move-result-object p1

    return-object p1
.end method
