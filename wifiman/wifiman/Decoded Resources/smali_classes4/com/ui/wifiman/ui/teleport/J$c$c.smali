.class final Lcom/ui/wifiman/ui/teleport/J$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/J$c;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/B;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/J$c$c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/J$c$c;->b:Lcom/ui/wifiman/ui/teleport/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/teleport/B;LT/q0;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/J$c$c;->i(Lcom/ui/wifiman/ui/teleport/B;LT/q0;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LT/q0;)Z
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/teleport/J$c$c;->f(LT/q0;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(LT/q0;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/teleport/J$c$c;->h(LT/q0;Z)V

    return-void
.end method

.method private static final f(LT/q0;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h(LT/q0;Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lcom/ui/wifiman/ui/teleport/B;LT/q0;Z)LYg/J;
    .locals 0

    invoke-static {p1, p2}, Lcom/ui/wifiman/ui/teleport/J$c$c;->h(LT/q0;Z)V

    invoke-virtual {p0, p2}, Lcom/ui/wifiman/ui/teleport/B;->r0(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final e(Lq/e;LT/l;I)V
    .locals 11

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.teleport.TunnelCard.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelUi.kt:115)"

    const v1, 0x3709e6d2

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/ui/teleport/J$c$c;->a:Landroidx/compose/ui/e;

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object p3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p3}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object p3

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/J$c$c;->b:Lcom/ui/wifiman/ui/teleport/B;

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v3, p3, p2, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object p3

    const/4 v3, 0x0

    invoke-static {p2, v3}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LT/l;->I()V

    :goto_0
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, p3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object p3

    invoke-static {v7, v5, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object p3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, p3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object p3

    invoke-static {v7, p1, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p1, Lz/k;->a:Lz/k;

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p1, 0x4

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    invoke-static {v4, p1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    const/4 p3, 0x6

    invoke-static {p1, p2, p3}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const p1, 0x7640924e

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne p1, v5, :cond_5

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/teleport/B;->o0()LLi/N;

    move-result-object p1

    invoke-interface {p1}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object p1

    const/4 v5, 0x2

    invoke-static {p1, v1, v5, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast p1, LT/q0;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {p1}, Lcom/ui/wifiman/ui/teleport/J$c$c;->f(LT/q0;)Z

    move-result v5

    new-instance v6, Ls9/d$b;

    sget v7, Lm8/c;->H3:I

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    new-instance v7, Ls9/d$b;

    sget v8, Lm8/c;->G3:I

    invoke-direct {v7, v8}, Ls9/d$b;-><init>(I)V

    const v8, 0x7640b11c

    invoke-interface {p2, v8}, LT/l;->U(I)V

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_6

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_7

    :cond_6
    new-instance v9, Lcom/ui/wifiman/ui/teleport/K;

    invoke-direct {v9, v2, p1}, Lcom/ui/wifiman/ui/teleport/K;-><init>(Lcom/ui/wifiman/ui/teleport/B;LT/q0;)V

    invoke-interface {p2, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v9

    check-cast v8, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v10, 0x6

    move-object v9, p2

    invoke-static/range {v4 .. v10}, Lrf/v;->s(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;LT/l;I)V

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/teleport/B;->o0()LLi/N;

    move-result-object v2

    invoke-static {v2, v1, p2, v3, v0}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {p1}, Lcom/ui/wifiman/ui/teleport/J$c$c;->f(LT/q0;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const v5, 0x7640f6af

    invoke-interface {p2, v5}, LT/l;->U(I)V

    invoke-interface {p2, v2}, LT/l;->c(Z)Z

    move-result v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_8

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v6, p3, :cond_9

    :cond_8
    new-instance v6, Lcom/ui/wifiman/ui/teleport/J$c$c$a;

    invoke-direct {v6, v2, p1, v1}, Lcom/ui/wifiman/ui/teleport/J$c$c$a;-><init>(ZLT/q0;Ldh/e;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v4, v0, v6, p2, v3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/J$c$c;->e(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
