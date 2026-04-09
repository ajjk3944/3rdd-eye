.class final Lcom/ubnt/usurvey/ui/signal/strength/c$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c;-><init>(Lje/u;Ly8/p;Ly8/d;Ly8/n;Ly8/m;LCd/f;Ly8/v;Lde/z;Lre/a;Li8/a;)V
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

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 3

    const-string/jumbo v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->k(Lcom/ubnt/usurvey/ui/signal/strength/c;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c;->m(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ly8/v;

    move-result-object v0

    invoke-virtual {v0}, Ly8/t;->c()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->m(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ly8/v;

    move-result-object v1

    invoke-virtual {v1}, Ly8/t;->e()Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ubnt/usurvey/ui/signal/strength/c$l$b;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$b;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;

    invoke-static {p1, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
