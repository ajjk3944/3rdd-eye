.class final LP8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/b;


# direct methods
.method constructor <init>(LP8/b;)V
    .locals 0

    iput-object p1, p0, LP8/b$a;->a:LP8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)LIf/d;
    .locals 9

    const-string/jumbo v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LP8/b$a;->a:LP8/b;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/wmw/d$a;

    new-instance v3, LIf/c;

    invoke-static {v0, v2}, LP8/b;->p0(LP8/b;Lcom/ui/wifiman/model/wmw/d$a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ls9/c$a;

    sget-object v6, Lcom/ubnt/usurvey/product/l;->WM_W_d64:Lcom/ubnt/usurvey/product/l;

    invoke-static {v6}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/ubnt/usurvey/product/r;->a()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct {v5, v6, v8, v7, v8}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, LQ8/a;->a:LQ8/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/d$a;->b()Lh9/a;

    move-result-object v2

    invoke-virtual {v6, v2}, LQ8/a;->a(Lh9/a;)Ls9/d;

    move-result-object v2

    invoke-direct {v3, v4, v5, v2}, LIf/c;-><init>(Ljava/lang/String;Ls9/c;Ls9/d;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, LIf/d;

    invoke-direct {p1, v1}, LIf/d;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LP8/b$a;->a(Ljava/util/Set;)LIf/d;

    move-result-object p1

    return-object p1
.end method
