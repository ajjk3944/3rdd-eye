.class public final Landroidx/compose/animation/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/e$a;,
        Landroidx/compose/animation/e$b;
    }
.end annotation


# instance fields
.field private final a:Lr/o0;

.field private b:Lf0/c;

.field private c:LY0/t;

.field private final d:LT/q0;

.field private final e:Lo/H;

.field private f:LT/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/o0;Lf0/c;LY0/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    iput-object p2, p0, Landroidx/compose/animation/e;->b:Lf0/c;

    iput-object p3, p0, Landroidx/compose/animation/e;->c:LY0/t;

    sget-object p1, LY0/r;->b:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/animation/e;->d:LT/q0;

    invoke-static {}, Lo/S;->d()Lo/H;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/animation/e;->e:Lo/H;

    return-void
.end method

.method public static final synthetic h(Landroidx/compose/animation/e;JJ)J
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/animation/e;->j(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic i(Landroidx/compose/animation/e;)J
    .locals 2

    invoke-direct {p0}, Landroidx/compose/animation/e;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method private final j(JJ)J
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/animation/e;->n()Lf0/c;

    move-result-object v0

    sget-object v5, LY0/t;->Ltr:LY0/t;

    move-wide v1, p1

    move-wide v3, p3

    invoke-interface/range {v0 .. v5}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide p1

    return-wide p1
.end method

.method private static final l(LT/q0;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final m(LT/q0;Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final o()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/e;->f:LT/z1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/r;

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/animation/e;->p()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final s(I)Z
    .locals 3

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->c()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->e()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/compose/animation/e;->c:LY0/t;

    sget-object v2, LY0/t;->Ltr:LY0/t;

    if-eq v1, v2, :cond_2

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/animation/e;->c:LY0/t;

    sget-object v0, LY0/t;->Rtl:LY0/t;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final t(I)Z
    .locals 3

    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->d()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->e()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/compose/animation/e;->c:LY0/t;

    sget-object v2, LY0/t;->Rtl:LY0/t;

    if-eq v1, v2, :cond_2

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/animation/e;->c:LY0/t;

    sget-object v0, LY0/t;->Ltr:LY0/t;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public b(ILr/H;Lmh/l;)Landroidx/compose/animation/i;
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/animation/e;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Landroidx/compose/animation/e$c;

    invoke-direct {p1, p3, p0}, Landroidx/compose/animation/e$c;-><init>(Lmh/l;Landroidx/compose/animation/e;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->A(Lr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/animation/e;->t(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Landroidx/compose/animation/e$d;

    invoke-direct {p1, p3, p0}, Landroidx/compose/animation/e$d;-><init>(Lmh/l;Landroidx/compose/animation/e;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->A(Lr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->f()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p1, Landroidx/compose/animation/e$e;

    invoke-direct {p1, p3, p0}, Landroidx/compose/animation/e$e;-><init>(Lmh/l;Landroidx/compose/animation/e;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->B(Lr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Landroidx/compose/animation/e$f;

    invoke-direct {p1, p3, p0}, Landroidx/compose/animation/e$f;-><init>(Lmh/l;Landroidx/compose/animation/e;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->B(Lr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object p1, Landroidx/compose/animation/i;->a:Landroidx/compose/animation/i$a;

    invoke-virtual {p1}, Landroidx/compose/animation/i$a;->a()Landroidx/compose/animation/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    invoke-interface {v0}, Lr/o0$b;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    invoke-interface {v0}, Lr/o0$b;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g(ILr/H;Lmh/l;)Landroidx/compose/animation/k;
    .locals 2

    invoke-direct {p0, p1}, Landroidx/compose/animation/e;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Landroidx/compose/animation/e$g;

    invoke-direct {p1, p0, p3}, Landroidx/compose/animation/e$g;-><init>(Landroidx/compose/animation/e;Lmh/l;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->D(Lr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/animation/e;->t(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Landroidx/compose/animation/e$h;

    invoke-direct {p1, p0, p3}, Landroidx/compose/animation/e$h;-><init>(Landroidx/compose/animation/e;Lmh/l;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->D(Lr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/compose/animation/d$a;->a:Landroidx/compose/animation/d$a$a;

    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->f()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p1, Landroidx/compose/animation/e$i;

    invoke-direct {p1, p0, p3}, Landroidx/compose/animation/e$i;-><init>(Landroidx/compose/animation/e;Lmh/l;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->E(Lr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/animation/d$a$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/animation/d$a;->h(II)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Landroidx/compose/animation/e$j;

    invoke-direct {p1, p0, p3}, Landroidx/compose/animation/e$j;-><init>(Landroidx/compose/animation/e;Lmh/l;)V

    invoke-static {p2, p1}, Landroidx/compose/animation/g;->E(Lr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object p1, Landroidx/compose/animation/k;->a:Landroidx/compose/animation/k$a;

    invoke-virtual {p1}, Landroidx/compose/animation/k$a;->a()Landroidx/compose/animation/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final k(Lq/i;LT/l;I)Landroidx/compose/ui/e;
    .locals 6

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)"

    const v2, 0x59699de

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p3, :cond_1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p3, v1, v0, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, LT/q0;

    invoke-virtual {p1}, Lq/i;->b()Lq/v;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    iget-object v2, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    invoke-virtual {v2}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    invoke-virtual {v3}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0, p3}, Landroidx/compose/animation/e;->m(LT/q0;Z)V

    goto :goto_0

    :cond_3
    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_4

    const/4 p3, 0x1

    invoke-static {v0, p3}, Landroidx/compose/animation/e;->m(LT/q0;Z)V

    :cond_4
    :goto_0
    invoke-static {v0}, Landroidx/compose/animation/e;->l(LT/q0;)Z

    move-result p3

    if-eqz p3, :cond_8

    const p3, 0xed801fd

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    sget-object p3, LY0/r;->b:LY0/r$a;

    invoke-static {p3}, Lr/u0;->e(LY0/r$a;)Lr/s0;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v2, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_7

    :cond_5
    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/v;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lq/v;->a()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_1

    :cond_6
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v0}, Lj0/e;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    :goto_1
    new-instance v1, Landroidx/compose/animation/e$b;

    invoke-direct {v1, p0, p3, p1}, Landroidx/compose/animation/e$b;-><init>(Landroidx/compose/animation/e;Lr/o0$a;LT/z1;)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Landroidx/compose/ui/e;

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_8
    const p1, 0xedcd5fe

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    iput-object v1, p0, Landroidx/compose/animation/e;->f:LT/z1;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-object v1
.end method

.method public n()Lf0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->b:Lf0/c;

    return-object v0
.end method

.method public final p()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/e;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/r;

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public final q()Lo/H;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->e:Lo/H;

    return-object v0
.end method

.method public final r()Lr/o0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lr/o0;

    return-object v0
.end method

.method public final u(LT/z1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e;->f:LT/z1;

    return-void
.end method

.method public v(Lf0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e;->b:Lf0/c;

    return-void
.end method

.method public final w(LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e;->c:LY0/t;

    return-void
.end method

.method public final x(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->d:LT/q0;

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
