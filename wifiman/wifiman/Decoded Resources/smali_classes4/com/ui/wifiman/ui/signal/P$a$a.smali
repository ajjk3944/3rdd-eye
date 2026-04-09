.class final Lcom/ui/wifiman/ui/signal/P$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/P$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/e;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/N;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/e;Lcom/ui/wifiman/ui/signal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/P$a$a;->a:Lcom/ui/wifiman/ui/signal/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/P$a$a;->b:Lcom/ui/wifiman/ui/signal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 3

    const-string v0, "$this$WifimanNetworkConnectionToolbar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous>.<anonymous> (SignalTabUi.kt:54)"

    const v1, -0x59ef82bf

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/P$a$a;->a:Lcom/ui/wifiman/ui/signal/e;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/signal/e;->n0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p3, p2, v0, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/ui/signal/d;

    iget-object v2, p0, Lcom/ui/wifiman/ui/signal/P$a$a;->b:Lcom/ui/wifiman/ui/signal/N;

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/signal/N;->p0()LLi/N;

    move-result-object v2

    invoke-static {v2, p3, p2, v0, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v2, Lcom/ui/wifiman/ui/signal/d;->SIGNAL:Lcom/ui/wifiman/ui/signal/d;

    if-ne p1, v2, :cond_3

    if-eqz v0, :cond_5

    new-instance p1, Lcom/ui/wifiman/ui/signal/P$a$a$a;

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/P$a$a;->b:Lcom/ui/wifiman/ui/signal/N;

    invoke-direct {p1, v0}, Lcom/ui/wifiman/ui/signal/P$a$a$a;-><init>(Lcom/ui/wifiman/ui/signal/N;)V

    const/16 v0, 0x36

    const v2, 0x1223c9ad

    invoke-static {v2, v1, p1, p2, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    const/16 v0, 0x30

    invoke-static {p3, p1, p2, v0, v1}, LL9/L;->b(Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    goto :goto_1

    :cond_3
    sget-object p2, Lcom/ui/wifiman/ui/signal/d;->FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

    if-eq p1, p2, :cond_5

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/P$a$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
