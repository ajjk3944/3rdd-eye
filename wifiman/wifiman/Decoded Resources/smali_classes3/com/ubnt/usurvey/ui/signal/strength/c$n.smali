.class final Lcom/ubnt/usurvey/ui/signal/strength/c$n;
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

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string/jumbo v0, "statsBarEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->f(Lcom/ubnt/usurvey/ui/signal/strength/c;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;

    iget-object v1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$n;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {v0, v1}, Lcom/ubnt/usurvey/ui/signal/strength/c$n$a;-><init>(Lcom/ubnt/usurvey/ui/signal/strength/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$n;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
