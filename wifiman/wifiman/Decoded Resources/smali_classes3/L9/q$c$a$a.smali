.class final LL9/q$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/q$c$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/C;

.field final synthetic b:LIi/N;

.field final synthetic c:Lmh/p;


# direct methods
.method constructor <init>(Lr/C;LIi/N;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LL9/q$c$a$a;->a:Lr/C;

    iput-object p2, p0, LL9/q$c$a$a;->b:LIi/N;

    iput-object p3, p0, LL9/q$c$a$a;->c:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lr/C;LIi/N;LC0/d;LC0/B;LY0/b;)LC0/D;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LL9/q$c$a$a;->h(Lr/C;LIi/N;LC0/d;LC0/B;LY0/b;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LL9/q$c$a$a;->i(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lr/C;LIi/N;LY0/r;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LL9/q$c$a$a;->f(Lr/C;LIi/N;LY0/r;)Z

    move-result p0

    return p0
.end method

.method private static final f(Lr/C;LIi/N;LY0/r;)Z
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lr/C;->g(Lr/C;Ljava/lang/Object;LIi/N;Lr/H;ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lr/C;->d()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final h(Lr/C;LIi/N;LC0/d;LC0/B;LY0/b;)LC0/D;
    .locals 8

    const-string p4, "$this$approachLayout"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p4, "measurable"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LC0/c;->N()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->b(J)LY0/r;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Lr/C;->g(Lr/C;Ljava/lang/Object;LIi/N;Lr/H;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/r;

    invoke-virtual {p0}, LY0/r;->j()J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/r;->g(J)I

    move-result p4

    invoke-static {p0, p1}, LY0/r;->f(J)I

    move-result p0

    sget-object p1, LY0/b;->b:LY0/b$a;

    invoke-virtual {p1, p4, p0}, LY0/b$a;->c(II)J

    move-result-wide p0

    invoke-interface {p3, p0, p1}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    new-instance v4, LL9/t;

    invoke-direct {v4, p0}, LL9/t;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t$a;)LYg/J;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p0

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final e(Landroidx/compose/ui/layout/j;LT/l;I)V
    .locals 8

    const-string v0, "$this$LookaheadScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.component.toolbar.Title.<anonymous>.<anonymous>.<anonymous> (UiToolbarBase.kt:147)"

    const v1, -0x7e3cb38d

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const p1, 0x5dfda1b9

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LL9/q$c$a$a;->a:Lr/C;

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LL9/q$c$a$a;->b:LIi/N;

    invoke-interface {p2, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    iget-object p3, p0, LL9/q$c$a$a;->a:Lr/C;

    iget-object v0, p0, LL9/q$c$a$a;->b:LIi/N;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_1

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v1, p1, :cond_2

    :cond_1
    new-instance v1, LL9/r;

    invoke-direct {v1, p3, v0}, LL9/r;-><init>(Lr/C;LIi/N;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v3, v1

    check-cast v3, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const p1, 0x5dfdc0ba

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LL9/q$c$a$a;->a:Lr/C;

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p3, p0, LL9/q$c$a$a;->b:LIi/N;

    invoke-interface {p2, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    iget-object p3, p0, LL9/q$c$a$a;->a:Lr/C;

    iget-object v0, p0, LL9/q$c$a$a;->b:LIi/N;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_3

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v1, p1, :cond_4

    :cond_3
    new-instance v1, LL9/s;

    invoke-direct {v1, p3, v0}, LL9/s;-><init>(Lr/C;LIi/N;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v1

    check-cast v5, Lmh/q;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/layout/l;->c(Landroidx/compose/ui/e;Lmh/l;Lmh/p;Lmh/q;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object p3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p3}, Lf0/c$a;->e()Lf0/c;

    move-result-object p3

    iget-object v0, p0, LL9/q$c$a$a;->c:Lmh/p;

    const/4 v1, 0x0

    invoke-static {p3, v1}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object p3

    invoke-static {p2, v1}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p2, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_6
    invoke-interface {p2}, LT/l;->I()V

    :goto_0
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, p3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object p3

    invoke-static {v5, v3, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object p3

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

    invoke-interface {v5, v2, p3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object p3

    invoke-static {v5, p1, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LL9/q$c$a$a;->e(Landroidx/compose/ui/layout/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
