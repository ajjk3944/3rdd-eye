.class final LFf/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/t;->c(Landroidx/compose/ui/e;LFf/e;Lof/a$c;LBe/b0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;


# direct methods
.method constructor <init>(LFf/e;)V
    .locals 0

    iput-object p1, p0, LFf/t$a;->a:LFf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WifiScanToolbar.<anonymous> (WifiScanUi.kt:124)"

    const v2, 0x3003fbad

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v0, v4, v1, v2}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    iget-object v5, p0, LFf/t$a;->a:LFf/e;

    const/4 v6, 0x0

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {p1, v6}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {p1, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {p1, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v4, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v10, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v10, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/foundation/layout/r;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual {v5}, LFf/e;->v0()LLi/N;

    move-result-object p2

    invoke-static {p2, v2, p1, v6, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p2

    invoke-interface {p2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v8, p2

    check-cast v8, LAf/H;

    const p2, 0x3c0eedfe

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_7

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_8

    :cond_7
    new-instance v0, LFf/t$a$a;

    invoke-direct {v0, v5}, LFf/t$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lth/g;

    invoke-interface {p1}, LT/l;->J()V

    move-object v9, v0

    check-cast v9, Lmh/a;

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p1

    invoke-static/range {v7 .. v12}, LAf/K;->c(Landroidx/compose/ui/e;LAf/H;Lmh/a;LT/l;II)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LFf/t$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
