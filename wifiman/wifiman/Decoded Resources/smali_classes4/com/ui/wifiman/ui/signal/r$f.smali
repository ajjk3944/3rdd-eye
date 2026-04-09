.class final Lcom/ui/wifiman/ui/signal/r$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/r;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/c;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/c;Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/r$f;->a:Lcom/ui/wifiman/ui/signal/c;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/r$f;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 11

    const-string v0, "$this$UiContentCard"

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

    const-string v0, "com.ui.wifiman.ui.signal.SignalTabFloorplanUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabFloorplanUiContent.kt:91)"

    const v1, 0x23a5333

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    new-instance p1, LC9/i;

    sget-object p3, LN9/b;->a:LN9/b;

    invoke-virtual {p3}, LN9/b;->v()Ls9/b;

    move-result-object p3

    new-instance v0, Ls9/b$b;

    const-string v1, "orange"

    sget-object v3, Lcom/ui/wifiman/ui/signal/r$f$a;->a:Lcom/ui/wifiman/ui/signal/r$f$a;

    invoke-direct {v0, v1, v3}, Ls9/b$b;-><init>(Ljava/lang/String;Lmh/p;)V

    invoke-virtual {p3, v0}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v5

    iget-object p3, p0, Lcom/ui/wifiman/ui/signal/r$f;->a:Lcom/ui/wifiman/ui/signal/c;

    check-cast p3, Lcom/ui/wifiman/ui/signal/c$c;

    invoke-virtual {p3}, Lcom/ui/wifiman/ui/signal/c$c;->c()Lcom/ui/wifiman/ui/signal/l$b$b$d;

    move-result-object p3

    invoke-static {p3}, Lcom/ui/wifiman/ui/signal/r;->j(Lcom/ui/wifiman/ui/signal/l$b$b$d;)Ls9/d;

    move-result-object v6

    new-instance v7, LC9/i$a$b;

    new-instance p3, Ls9/d$b;

    sget v0, Lm8/c;->J1:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-direct {v7, p3}, LC9/i$a$b;-><init>(Ls9/d;)V

    const/16 v9, 0x10

    const/4 v10, 0x0

    const-string v4, "requirement"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, LC9/i;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;LC9/i$a;LC9/i$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p3, 0x3c4980f3

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, Lcom/ui/wifiman/ui/signal/r$f;->b:Lcom/ui/wifiman/ui/signal/m;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/r$f;->a:Lcom/ui/wifiman/ui/signal/c;

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/r$f;->b:Lcom/ui/wifiman/ui/signal/m;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/r$f;->a:Lcom/ui/wifiman/ui/signal/c;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p3, :cond_3

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v3, p3, :cond_4

    :cond_3
    new-instance v3, Lcom/ui/wifiman/ui/signal/r$f$b;

    invoke-direct {v3, v0, v1}, Lcom/ui/wifiman/ui/signal/r$f$b;-><init>(Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/c;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v3

    check-cast v5, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const p3, 0x3c498dd9

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_5

    sget-object p3, Lcom/ui/wifiman/ui/signal/r$f$c;->a:Lcom/ui/wifiman/ui/signal/r$f$c;

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v6, p3

    check-cast v6, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/16 v9, 0x6006

    const/16 v10, 0x24

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    move-object v8, p2

    invoke-static/range {v2 .. v10}, LC9/s;->o(Landroidx/compose/ui/e;LC9/i;ZLmh/a;Lmh/a;LC9/h;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/r$f;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
