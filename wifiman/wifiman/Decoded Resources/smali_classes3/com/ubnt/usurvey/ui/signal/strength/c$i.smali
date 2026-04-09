.class final Lcom/ubnt/usurvey/ui/signal/strength/c$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c;-><init>(Lje/u;Ly8/p;Ly8/d;Ly8/n;Ly8/m;LCd/f;Ly8/v;Lde/z;Lre/a;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/signal/strength/c$i$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/strength/c;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/strength/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$i;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc/b;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, LTe/K0$b;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p5}, Lcom/ubnt/usurvey/ui/signal/strength/c$i;->b(Lgc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;LTe/K0$b;Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;LTe/K0$b;Ljava/lang/Boolean;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiConnected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "comparingAps"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "gatewaySpeedtestAvailable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/c$i$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 p3, 0x2

    if-eq p1, p3, :cond_1

    const/4 p3, 0x3

    if-ne p1, p3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$i;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/strength/c$a;->DISCONNECTED:Lcom/ubnt/usurvey/ui/signal/strength/c$a;

    invoke-static {p1, p2}, Lcom/ubnt/usurvey/ui/signal/strength/c;->e(Lcom/ubnt/usurvey/ui/signal/strength/c;Lcom/ubnt/usurvey/ui/signal/strength/c$a;)LTe/K0$f;

    move-result-object p4

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$i;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/strength/c$a;->DISCONNECTED:Lcom/ubnt/usurvey/ui/signal/strength/c$a;

    invoke-static {p1, p2}, Lcom/ubnt/usurvey/ui/signal/strength/c;->e(Lcom/ubnt/usurvey/ui/signal/strength/c;Lcom/ubnt/usurvey/ui/signal/strength/c$a;)LTe/K0$f;

    move-result-object p4

    goto :goto_0

    :cond_2
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p4, LTe/K0$d;->a:LTe/K0$d;

    goto :goto_0

    :cond_3
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$i;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/strength/c$a;->DISCONNECTED:Lcom/ubnt/usurvey/ui/signal/strength/c$a;

    invoke-static {p1, p2}, Lcom/ubnt/usurvey/ui/signal/strength/c;->e(Lcom/ubnt/usurvey/ui/signal/strength/c;Lcom/ubnt/usurvey/ui/signal/strength/c$a;)LTe/K0$f;

    move-result-object p4

    :cond_5
    :goto_0
    invoke-direct {v0, p4}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
