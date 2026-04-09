.class final Lcom/ui/wifiman/ui/signal/M$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/M$a;->e(Landroidx/compose/ui/e;LTe/K0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTe/K0;


# direct methods
.method constructor <init>(LTe/K0;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/M$a$c;->a:LTe/K0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 2

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.signal.SignalMapperTabSignalUi.<anonymous>.<anonymous>.<anonymous> (SignalTabSignalStrengthUi.kt:134)"

    const v1, -0x5568aa58

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/M$a$c;->a:LTe/K0;

    check-cast p1, LTe/K0$b;

    invoke-virtual {p1}, LTe/K0$b;->a()LTe/S;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x6

    invoke-static {p3, p1, p2, v0}, LTe/U;->b(Landroidx/compose/ui/e;LTe/S;LT/l;I)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/signal/M$a$c;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
