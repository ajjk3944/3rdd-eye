.class final Lcom/ui/wifiman/ui/signal/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/i;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/g;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/g;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/i$a;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 12

    const-string v0, "$this$ModalScaffold"

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabApComparisonConfigUi.<anonymous> (SignalTabApComparisonConfigUi.kt:56)"

    const v1, -0x1be7aabc

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/i$a;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/signal/g;->c()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, v1, p2, p3, v0}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ls9/d;

    new-instance v4, LL9/d$c$b;

    new-instance p1, Ls9/d$b;

    sget v5, Lm8/c;->b:I

    invoke-direct {p1, v5}, Ls9/d$b;-><init>(I)V

    const/4 v5, 0x2

    invoke-direct {v4, p1, p3, v5, v1}, LL9/d$c$b;-><init>(Ls9/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/i$a;->a:Lcom/ui/wifiman/ui/signal/g;

    const p3, 0x6d3f722a

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_3

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_4

    :cond_3
    new-instance v1, Lcom/ui/wifiman/ui/signal/i$a$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/ui/signal/i$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v5, v1

    check-cast v5, Lmh/a;

    new-instance p1, Lcom/ui/wifiman/ui/signal/i$a$b;

    iget-object p3, p0, Lcom/ui/wifiman/ui/signal/i$a;->a:Lcom/ui/wifiman/ui/signal/g;

    invoke-direct {p1, p3}, Lcom/ui/wifiman/ui/signal/i$a$b;-><init>(Lcom/ui/wifiman/ui/signal/g;)V

    const/16 p3, 0x36

    const v1, 0xe93e5dd

    invoke-static {v1, v0, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v10, 0x6006

    const/16 v11, 0x20

    const-wide/16 v7, 0x0

    move-object v9, p2

    invoke-static/range {v2 .. v11}, LFe/j;->c(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/i$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
