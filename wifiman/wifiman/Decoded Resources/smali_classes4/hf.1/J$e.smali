.class final Lhf/J$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


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

    iput-object p1, p0, Lhf/J$e;->a:Lhf/t$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFLT/l;I)V
    .locals 9

    and-int/lit8 p1, p4, 0x30

    if-nez p1, :cond_1

    invoke-interface {p3, p2}, LT/l;->g(F)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x20

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    or-int/2addr p4, p1

    :cond_1
    and-int/lit16 p1, p4, 0x91

    const/16 v0, 0x90

    if-ne p1, v0, :cond_3

    invoke-interface {p3}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.<anonymous>.<anonymous> (SpeedtestTopology.kt:205)"

    const v1, 0x4aca11c0    # 6621408.0f

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p4, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p4, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 p4, 0x0

    int-to-float v0, p4

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LY0/h;->d(F)LY0/h;

    move-result-object v0

    const/16 v1, 0xa

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    add-float/2addr p2, v1

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    const/high16 v1, 0x41a80000    # 21.0f

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    sub-float/2addr p2, v1

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    invoke-static {p2}, LY0/h;->d(F)LY0/h;

    move-result-object p2

    invoke-static {v0, p2}, Lch/a;->k(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result v4

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, Lhf/J$e;->a:Lhf/t$a;

    sget-object v1, Lz/c;->a:Lz/c;

    invoke-virtual {v1}, Lz/c;->f()Lz/c$e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v2

    invoke-static {v1, v2, p3, p4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    invoke-static {p3, p4}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p3}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p3, p2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p3}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p3}, LT/l;->u()V

    invoke-interface {p3}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p3, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_6
    invoke-interface {p3}, LT/l;->I()V

    :goto_2
    invoke-static {p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, p2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p2, Lz/Z;->a:Lz/Z;

    instance-of v1, v0, Lhf/t$a$b;

    const/4 v8, 0x6

    if-eqz v1, :cond_9

    const v1, -0x50604847

    invoke-interface {p3, v1}, LT/l;->U(I)V

    check-cast v0, Lhf/t$a$b;

    invoke-virtual {v0}, Lhf/t$a$b;->a()Lhf/t$b;

    move-result-object v1

    invoke-static {p1, v1, p3, v8}, Lhf/J;->H(Landroidx/compose/ui/e;Lhf/t$b;LT/l;I)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-static {p2, p3, p4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v0}, Lhf/t$a$b;->b()Lhf/t$b;

    move-result-object p2

    invoke-static {p1, p2, p3, v8}, Lhf/J;->H(Landroidx/compose/ui/e;Lhf/t$b;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_3

    :cond_9
    instance-of v1, v0, Lhf/t$a$a;

    if-eqz v1, :cond_b

    const v1, -0x50593ec4

    invoke-interface {p3, v1}, LT/l;->U(I)V

    check-cast v0, Lhf/t$a$a;

    invoke-virtual {v0}, Lhf/t$a$a;->c()Lhf/t$b;

    move-result-object v1

    invoke-static {p1, v1, p3, v8}, Lhf/J;->H(Landroidx/compose/ui/e;Lhf/t$b;LT/l;I)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, p3, p4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v0}, Lhf/t$a$a;->a()Lhf/t$b;

    move-result-object v1

    invoke-static {p1, v1, p3, v8}, Lhf/J;->H(Landroidx/compose/ui/e;Lhf/t$b;LT/l;I)V

    invoke-static/range {v2 .. v7}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-static {p2, p3, p4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v0}, Lhf/t$a$a;->e()Lhf/t$b;

    move-result-object p2

    invoke-static {p1, p2, p3, v8}, Lhf/J;->H(Landroidx/compose/ui/e;Lhf/t$b;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_3
    invoke-interface {p3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    return-void

    :cond_b
    const p1, 0x583eef6a

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lhf/J$e;->a(FFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
