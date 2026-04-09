.class final Lhf/J$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhf/J;->E(Landroidx/compose/ui/e;Lhf/t$a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhf/t$a;


# direct methods
.method constructor <init>(Lhf/t$a;)V
    .locals 0

    iput-object p1, p0, Lhf/J$d;->a:Lhf/t$a;

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.<anonymous>.<anonymous> (SpeedtestTopology.kt:178)"

    const v3, -0x2c4d1e6b

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/16 v5, 0x2a

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    int-to-float v6, v1

    div-float/2addr v5, v6

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5, v0, v1, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    iget-object v1, p0, Lhf/J$d;->a:Lhf/t$a;

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->f()Lz/c$e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, p1, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {p1, v5}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {p1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {p1, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    instance-of v3, v1, Lhf/t$a$b;

    const/4 v4, 0x6

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v3, :cond_7

    const v1, -0x5075f29d

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-interface {v0, p2, v6, v2}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v0, Lhf/t;->a:Lhf/t;

    invoke-virtual {v0, p1, v4}, Lhf/t;->a(LT/l;I)Lhf/t$c;

    move-result-object v0

    invoke-static {p2, v0, p1, v5}, Lhf/J;->G(Landroidx/compose/ui/e;Lhf/t$c;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_2

    :cond_7
    instance-of v1, v1, Lhf/t$a$a;

    if-eqz v1, :cond_9

    const v1, -0x5070eec7

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-interface {v0, p2, v6, v2}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lhf/t;->a:Lhf/t;

    invoke-virtual {v3, p1, v4}, Lhf/t;->a(LT/l;I)Lhf/t$c;

    move-result-object v7

    invoke-static {v1, v7, p1, v5}, Lhf/J;->G(Landroidx/compose/ui/e;Lhf/t$c;LT/l;I)V

    invoke-interface {v0, p2, v6, v2}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-virtual {v3, p1, v4}, Lhf/t;->a(LT/l;I)Lhf/t$c;

    move-result-object v0

    invoke-static {p2, v0, p1, v5}, Lhf/J;->G(Landroidx/compose/ui/e;Lhf/t$c;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_2
    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void

    :cond_9
    const p2, 0x583e3b8f

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lhf/J$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
