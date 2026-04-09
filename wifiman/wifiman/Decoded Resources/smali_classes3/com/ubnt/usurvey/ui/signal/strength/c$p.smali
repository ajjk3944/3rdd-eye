.class final Lcom/ubnt/usurvey/ui/signal/strength/c$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


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

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$p;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc/b;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ubnt/usurvey/ui/signal/strength/c$p;->b(Lgc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isWifiConnected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isComparingAccessPoints"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTe/K0$k;

    iget-object v1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$p;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->l(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LTe/K0$k;-><init>(Ljava/util/List;Lgc/b;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
