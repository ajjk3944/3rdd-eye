.class final Ly8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;-><init>(Lre/a;Lje/u;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/e;


# direct methods
.method constructor <init>(Ly8/e;)V
    .locals 0

    iput-object p1, p0, Ly8/e$b;->a:Ly8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LTe/J;
    .locals 13

    const-string/jumbo v0, "apComparison"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/e$b;->a:Ly8/e;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v4, Lre/n$a;

    invoke-static {v0, v3}, Ly8/e;->j(Ly8/e;I)LTe/N;

    move-result-object v3

    invoke-static {v0, v4, v3}, Ly8/e;->i(Ly8/e;Lre/n$a;LTe/N;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_0

    :cond_1
    invoke-static {v1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    new-instance p1, LTe/J;

    sget-object v7, Lgc/b;->SIGNAL:Lgc/b;

    sget-object v9, LTe/M$b$b;->a:LTe/M$b$b;

    iget-object v0, p0, Ly8/e$b;->a:Ly8/e;

    invoke-virtual {v0}, Ly8/f;->e()LTe/L;

    move-result-object v10

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v11

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v12

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, LTe/J;-><init>(Lgc/b;Ljava/util/List;LTe/M;LTe/L;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ly8/e$b;->a(Ljava/util/List;)LTe/J;

    move-result-object p1

    return-object p1
.end method
