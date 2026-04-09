.class final Ljf/p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf/p$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljf/h;


# direct methods
.method constructor <init>(Ljf/h;)V
    .locals 0

    iput-object p1, p0, Ljf/p$a$a;->a:Ljf/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljf/d;LT/l;I)V
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

    const-string v1, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailUi.<anonymous>.<anonymous> (SpeedtestResultDetailUi.kt:43)"

    const v2, -0x64094a1f

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    instance-of p3, p1, Ljf/d$b;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p3, :cond_5

    const p1, -0x6c4ed2bf

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {v2, p2, v1, v0}, Ljf/n;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    instance-of p1, p1, Ljf/d$a;

    if-eqz p1, :cond_7

    const p1, -0x6c4ec698

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, Ljf/p$a$a;->a:Ljf/h;

    invoke-static {v2, p1, p2, v1, v0}, Ljf/l;->e(Landroidx/compose/ui/e;Ljf/h;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void

    :cond_7
    const p1, -0x6c4edb9c

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljf/d;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ljf/p$a$a;->a(Ljf/d;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
