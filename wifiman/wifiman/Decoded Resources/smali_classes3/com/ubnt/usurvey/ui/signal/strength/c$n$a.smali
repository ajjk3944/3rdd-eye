.class final Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c$n;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/strength/c;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/strength/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly8/c;

    instance-of v0, p1, Ly8/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    check-cast p1, Ly8/p;

    invoke-interface {p1}, Ly8/c;->a()Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->q(Lcom/ubnt/usurvey/ui/signal/strength/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ly8/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    check-cast p1, Ly8/d;

    invoke-interface {p1}, Ly8/c;->a()Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->p(Lcom/ubnt/usurvey/ui/signal/strength/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ly8/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    check-cast p1, Ly8/g;

    invoke-interface {p1}, Ly8/c;->a()Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->p(Lcom/ubnt/usurvey/ui/signal/strength/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ly8/n;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    check-cast p1, Ly8/n;

    invoke-interface {p1}, Ly8/c;->a()Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->p(Lcom/ubnt/usurvey/ui/signal/strength/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ly8/l;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    check-cast p1, Ly8/l;

    invoke-interface {p1}, Ly8/c;->a()Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->p(Lcom/ubnt/usurvey/ui/signal/strength/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ly8/j;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    check-cast p1, Ly8/j;

    invoke-interface {p1}, Ly8/c;->a()Lgg/i;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->p(Lcom/ubnt/usurvey/ui/signal/strength/c;Lgg/i;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_5
    if-nez p1, :cond_6

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
