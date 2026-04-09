.class final Laf/m0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/m0;->q(Landroidx/compose/ui/e;Laf/e0$a;Lmh/a;Lmh/a;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/e0$a;

.field final synthetic b:Lmh/a;

.field final synthetic c:Lmh/a;

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(Laf/e0$a;Lmh/a;Lmh/a;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Laf/m0$c;->a:Laf/e0$a;

    iput-object p2, p0, Laf/m0$c;->b:Lmh/a;

    iput-object p3, p0, Laf/m0$c;->c:Lmh/a;

    iput-object p4, p0, Laf/m0$c;->d:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 12

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedtestCardUi.<anonymous>.<anonymous> (SpeedTabSpeedtestCardUi.kt:114)"

    const v1, 0x5435b90f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, p3, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 p1, 0x8

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result v4

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object p3, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {p3, p2, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object p3

    invoke-virtual {p3}, Lra/a;->a()Lra/b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b;->a()Lra/b$a$a;

    move-result-object p3

    invoke-virtual {p3}, Lra/b$a$a;->c()F

    move-result p3

    const/4 v2, 0x2

    invoke-static {p1, p3, v0, v2, v1}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    iget-object p1, p0, Laf/m0$c;->a:Laf/e0$a;

    instance-of p3, p1, Laf/e0$a$b;

    if-eqz p3, :cond_1

    const/4 p1, 0x0

    :goto_0
    move v4, p1

    goto :goto_1

    :cond_1
    instance-of p3, p1, Laf/e0$a$a;

    if-eqz p3, :cond_7

    check-cast p1, Laf/e0$a$a;

    invoke-virtual {p1}, Laf/e0$a$a;->d()Z

    move-result p1

    goto :goto_0

    :goto_1
    iget-object p1, p0, Laf/m0$c;->a:Laf/e0$a;

    instance-of p3, p1, Laf/e0$a$b;

    if-eqz p3, :cond_2

    :goto_2
    move-object v6, v1

    goto :goto_3

    :cond_2
    instance-of p3, p1, Laf/e0$a$a;

    if-eqz p3, :cond_6

    check-cast p1, Laf/e0$a$a;

    invoke-virtual {p1}, Laf/e0$a$a;->c()Ls9/d;

    move-result-object v1

    goto :goto_2

    :goto_3
    iget-object p1, p0, Laf/m0$c;->a:Laf/e0$a;

    instance-of p3, p1, Laf/e0$a$b;

    if-eqz p3, :cond_3

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_4
    move-object v5, p1

    goto :goto_5

    :cond_3
    instance-of p3, p1, Laf/e0$a$a;

    if-eqz p3, :cond_5

    check-cast p1, Laf/e0$a$a;

    invoke-virtual {p1}, Laf/e0$a$a;->b()Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_4

    :goto_5
    iget-object v7, p0, Laf/m0$c;->b:Lmh/a;

    iget-object v8, p0, Laf/m0$c;->c:Lmh/a;

    iget-object v9, p0, Laf/m0$c;->d:Lmh/l;

    const/4 v11, 0x0

    move-object v10, p2

    invoke-static/range {v3 .. v11}, Laf/m0;->x(Landroidx/compose/ui/e;ZLjava/lang/Boolean;Ls9/d;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Laf/m0$c;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
