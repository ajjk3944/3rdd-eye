.class final Lcom/ubnt/usurvey/ui/signal/strength/b$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/b;-><init>(LBc/a;Lde/z;Lcom/ui/wifiman/model/android/permissions/d;Ly8/g;Ly8/k;Ly8/u;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/strength/b;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/strength/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$p;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Ll9/a;
    .locals 4

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$p;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b;->j(Lcom/ubnt/usurvey/ui/signal/strength/b;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$p;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-static {v1, v3}, Lcom/ubnt/usurvey/ui/signal/strength/b;->f(Lcom/ubnt/usurvey/ui/signal/strength/b;Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lgc/b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$p;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b;->f(Lcom/ubnt/usurvey/ui/signal/strength/b;Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lgc/b;

    move-result-object p1

    new-instance v0, LTe/K0$k;

    invoke-direct {v0, v2, p1}, LTe/K0$k;-><init>(Ljava/util/List;Lgc/b;)V

    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$p;->a(Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
