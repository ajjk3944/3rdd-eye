.class final LF/V$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/V;->a(Landroidx/compose/ui/e;LF/E;LR0/Q;LR0/H;Lm0/l0;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/l0;

.field final synthetic b:LF/E;

.field final synthetic c:LR0/Q;

.field final synthetic d:LR0/H;


# direct methods
.method constructor <init>(Lm0/l0;LF/E;LR0/Q;LR0/H;)V
    .locals 0

    iput-object p1, p0, LF/V$a;->a:Lm0/l0;

    iput-object p2, p0, LF/V$a;->b:LF/E;

    iput-object p3, p0, LF/V$a;->c:LR0/Q;

    iput-object p4, p0, LF/V$a;->d:LR0/H;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 8

    const v0, -0x5097aed    # -6.4000205E35f

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_1

    new-instance p3, LI/G;

    invoke-direct {p3}, LI/G;-><init>()V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p3

    check-cast v2, LI/G;

    iget-object p3, p0, LF/V$a;->a:Lm0/l0;

    instance-of v1, p3, Lm0/j1;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    check-cast p3, Lm0/j1;

    invoke-virtual {p3}, Lm0/j1;->b()J

    move-result-wide v4

    const-wide/16 v6, 0x10

    cmp-long p3, v4, v6

    if-nez p3, :cond_2

    move p3, v3

    goto :goto_0

    :cond_2
    const/4 p3, 0x1

    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->u()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/platform/E1;

    invoke-interface {v1}, Landroidx/compose/ui/platform/E1;->a()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LF/V$a;->b:LF/E;

    invoke-virtual {v1}, LF/E;->e()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LF/V$a;->c:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->h(J)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p3, :cond_7

    const p3, 0x302dfc9d

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, LF/V$a;->c:LR0/Q;

    invoke-virtual {p3}, LR0/Q;->f()LL0/d;

    move-result-object p3

    iget-object v1, p0, LF/V$a;->c:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->b(J)LL0/S;

    move-result-object v1

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, LF/V$a$a;

    const/4 v4, 0x0

    invoke-direct {v5, v2, v4}, LF/V$a$a;-><init>(LI/G;Ldh/e;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lmh/p;

    invoke-static {p3, v1, v5, p2, v3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p3

    iget-object v1, p0, LF/V$a;->d:LR0/H;

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v1, p0, LF/V$a;->c:LR0/Q;

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v1, p0, LF/V$a;->b:LF/E;

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v1, p0, LF/V$a;->a:Lm0/l0;

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    iget-object v3, p0, LF/V$a;->d:LR0/H;

    iget-object v4, p0, LF/V$a;->c:LR0/Q;

    iget-object v5, p0, LF/V$a;->b:LF/E;

    iget-object v6, p0, LF/V$a;->a:Lm0/l0;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_5

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_6

    :cond_5
    new-instance p3, LF/V$a$b;

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, LF/V$a$b;-><init>(LI/G;LR0/H;LR0/Q;LF/E;Lm0/l0;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lmh/l;

    invoke-static {p1, v1}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_7
    const p1, 0x3040856e

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF/V$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
