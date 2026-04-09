.class final Lcom/ui/wifiman/ui/signal/P$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/P$a$a;->a(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/N;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/P$a$a$a;->a:Lcom/ui/wifiman/ui/signal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 7

    const-string v0, "$this$UiToolbarSideContainer"

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous>.<anonymous>.<anonymous> (SignalTabUi.kt:59)"

    const v1, 0x1223c9ad

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget p1, Lm8/c;->C2:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/P$a$a$a;->a:Lcom/ui/wifiman/ui/signal/N;

    const p3, -0x4b582ec5

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
    new-instance v1, Lcom/ui/wifiman/ui/signal/P$a$a$a$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/ui/signal/P$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v3, v1

    check-cast v3, Lmh/a;

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v6}, LL9/O;->c(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;LT/l;II)V

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

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/P$a$a$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
