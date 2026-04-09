.class final Lcom/ui/wifiman/ui/signal/P$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/P;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lof/a$c;

.field final synthetic b:Lcom/ui/wifiman/ui/component/network/c$b;

.field final synthetic c:Lcom/ui/wifiman/ui/signal/e;

.field final synthetic d:Lcom/ui/wifiman/ui/signal/N;


# direct methods
.method constructor <init>(Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lcom/ui/wifiman/ui/signal/e;Lcom/ui/wifiman/ui/signal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/P$a;->a:Lof/a$c;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/P$a;->b:Lcom/ui/wifiman/ui/component/network/c$b;

    iput-object p3, p0, Lcom/ui/wifiman/ui/signal/P$a;->c:Lcom/ui/wifiman/ui/signal/e;

    iput-object p4, p0, Lcom/ui/wifiman/ui/signal/P$a;->d:Lcom/ui/wifiman/ui/signal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.SignalTabUi.<anonymous> (SignalTabUi.kt:47)"

    const v2, 0x1aad89c3

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p2, v0, v2, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-static {p2}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/ui/signal/P$a;->a:Lof/a$c;

    iget-object v5, p0, Lcom/ui/wifiman/ui/signal/P$a;->b:Lcom/ui/wifiman/ui/component/network/c$b;

    new-instance p2, Lcom/ui/wifiman/ui/signal/P$a$a;

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/P$a;->c:Lcom/ui/wifiman/ui/signal/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/P$a;->d:Lcom/ui/wifiman/ui/signal/N;

    invoke-direct {p2, v0, v1}, Lcom/ui/wifiman/ui/signal/P$a$a;-><init>(Lcom/ui/wifiman/ui/signal/e;Lcom/ui/wifiman/ui/signal/N;)V

    const/16 v0, 0x36

    const v1, -0x59ef82bf

    invoke-static {v1, v2, p2, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v8, 0xc00

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LHe/C;->b(Landroidx/compose/ui/e;Lof/a$c;Lcom/ui/wifiman/ui/component/network/c$b;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/P$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
