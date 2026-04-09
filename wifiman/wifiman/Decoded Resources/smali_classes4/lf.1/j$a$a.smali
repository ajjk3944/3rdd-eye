.class final Llf/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf/j$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Llf/l;


# direct methods
.method constructor <init>(Llf/l;)V
    .locals 0

    iput-object p1, p0, Llf/j$a$a;->a:Llf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llf/k;LT/l;I)V
    .locals 3

    const-string v0, "cnt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerUi.<anonymous>.<anonymous> (SpeedtestInternetServerPickerUi.kt:36)"

    const v2, 0x53cdf887

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    instance-of p3, p1, Llf/k$c;

    const/4 v0, 0x6

    if-eqz p3, :cond_5

    const p1, 0x2bd1596c

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, p2, v0}, Llf/h;->b(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    instance-of p3, p1, Llf/k$b;

    if-eqz p3, :cond_6

    const p3, 0x2bd16ec9

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    check-cast p1, Llf/k$b;

    iget-object v1, p0, Llf/j$a$a;->a:Llf/l;

    invoke-static {p3, p1, v1, p2, v0}, Llf/f;->b(Landroidx/compose/ui/e;Llf/k$b;Llf/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_6
    instance-of p1, p1, Llf/k$a;

    if-eqz p1, :cond_8

    const p1, 0x2bd18ba9

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object p3, p0, Llf/j$a$a;->a:Llf/l;

    invoke-static {p1, p3, p2, v0}, Llf/d;->b(Landroidx/compose/ui/e;Llf/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    return-void

    :cond_8
    const p1, 0x2bd150be

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llf/k;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Llf/j$a$a;->a(Llf/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
