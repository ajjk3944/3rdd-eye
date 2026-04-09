.class final Lcom/ui/wifiman/ui/signal/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/v;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/l;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/l;Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/v$a;->a:Lcom/ui/wifiman/ui/signal/l;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/v$a;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLT/l;I)V
    .locals 8

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

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabFloorplanUi.<anonymous> (SignalTabFloorplanUi.kt:22)"

    const v1, -0x699deee5

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/v$a;->a:Lcom/ui/wifiman/ui/signal/l;

    instance-of p3, p1, Lcom/ui/wifiman/ui/signal/l$a;

    if-eqz p3, :cond_3

    const p1, -0x3822d6eb

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, p0, Lcom/ui/wifiman/ui/signal/v$a;->b:Lcom/ui/wifiman/ui/signal/m;

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/v$a;->a:Lcom/ui/wifiman/ui/signal/l;

    move-object v4, p1

    check-cast v4, Lcom/ui/wifiman/ui/signal/l$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Lcom/ui/wifiman/ui/signal/r;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_3
    instance-of p1, p1, Lcom/ui/wifiman/ui/signal/l$b;

    if-eqz p1, :cond_5

    const p1, -0x3822bd01

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/v$a;->a:Lcom/ui/wifiman/ui/signal/l;

    move-object v1, p1

    check-cast v1, Lcom/ui/wifiman/ui/signal/l$b;

    iget-object v2, p0, Lcom/ui/wifiman/ui/signal/v$a;->b:Lcom/ui/wifiman/ui/signal/m;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/signal/t;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void

    :cond_5
    const p1, -0x3822df3c

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/v$a;->a(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
