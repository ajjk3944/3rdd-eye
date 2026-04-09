.class final Laf/m0$b;
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

.field final synthetic e:Lmh/a;


# direct methods
.method constructor <init>(Laf/e0$a;Lmh/a;Lmh/a;Lmh/l;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Laf/m0$b;->a:Laf/e0$a;

    iput-object p2, p0, Laf/m0$b;->b:Lmh/a;

    iput-object p3, p0, Laf/m0$b;->c:Lmh/a;

    iput-object p4, p0, Laf/m0$b;->d:Lmh/l;

    iput-object p5, p0, Laf/m0$b;->e:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laf/e0$b;LT/l;I)V
    .locals 11

    const-string v0, "it"

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.component.SpeedTabSpeedtestCardUi.<anonymous>.<anonymous> (SpeedTabSpeedtestCardUi.kt:85)"

    const v1, -0x28fa4ae2

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Laf/m0$b;->a:Laf/e0$a;

    instance-of p3, p1, Laf/e0$a$b;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p3, :cond_3

    const p1, -0x3e05643a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v3, v2, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1, p2, v0}, Laf/m0;->u(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_3
    instance-of p3, p1, Laf/e0$a$a$a;

    if-eqz p3, :cond_4

    const p1, -0x3e055053

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v3, v2, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    iget-object p1, p0, Laf/m0$b;->a:Laf/e0$a;

    move-object v5, p1

    check-cast v5, Laf/e0$a$a$a;

    iget-object v6, p0, Laf/m0$b;->b:Lmh/a;

    iget-object v7, p0, Laf/m0$b;->c:Lmh/a;

    iget-object v8, p0, Laf/m0$b;->d:Lmh/l;

    const/4 v10, 0x6

    move-object v9, p2

    invoke-static/range {v4 .. v10}, Laf/m0;->v(Landroidx/compose/ui/e;Laf/e0$a$a$a;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_4
    instance-of p1, p1, Laf/e0$a$a$b;

    if-eqz p1, :cond_6

    const p1, -0x3e05213b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v3, v2, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, Laf/m0$b;->a:Laf/e0$a;

    check-cast p3, Laf/e0$a$a$b;

    iget-object v1, p0, Laf/m0$b;->e:Lmh/a;

    invoke-static {p1, p3, v1, p2, v0}, Laf/m0;->w(Landroidx/compose/ui/e;Laf/e0$a$a$b;Lmh/a;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void

    :cond_6
    const p1, -0x3e056a8f

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laf/e0$b;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Laf/m0$b;->a(Laf/e0$b;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
