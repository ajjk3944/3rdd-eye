.class public final LE0/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/B;
.implements LE0/r;
.implements LE0/v0;
.implements LE0/s0;
.implements LD0/h;
.implements LD0/k;
.implements LE0/p0;
.implements LE0/A;
.implements LE0/t;
.implements Lk0/b;
.implements Lk0/h;
.implements Lk0/k;
.implements LE0/n0;
.implements Lj0/b;


# instance fields
.field private n:Landroidx/compose/ui/e$b;

.field private o:Z

.field private p:LD0/a;

.field private q:Ljava/util/HashSet;

.field private r:LC0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/e$b;)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    invoke-static {p1}, LE0/f0;->f(Landroidx/compose/ui/e$b;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/e$c;->x2(I)V

    iput-object p1, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const/4 p1, 0x1

    iput-boolean p1, p0, LE0/c;->o:Z

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LE0/c;->q:Ljava/util/HashSet;

    return-void
.end method

.method private final F2(Z)V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "initializeModifier called on unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const/16 v1, 0x20

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    instance-of v1, v0, LD0/d;

    if-eqz v1, :cond_1

    new-instance v1, LE0/c$a;

    invoke-direct {v1, p0}, LE0/c$a;-><init>(LE0/c;)V

    invoke-virtual {p0, v1}, Landroidx/compose/ui/e$c;->B2(Lmh/a;)V

    :cond_1
    instance-of v1, v0, LD0/j;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LD0/j;

    invoke-direct {p0, v1}, LE0/c;->K2(LD0/j;)V

    :cond_2
    const/4 v1, 0x4

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    invoke-static {p0}, LE0/E;->a(LE0/B;)V

    :cond_3
    const/4 v1, 0x2

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_5

    invoke-static {p0}, LE0/d;->c(LE0/c;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, LE0/C;

    invoke-virtual {v2, p0}, LE0/C;->G3(LE0/B;)V

    invoke-virtual {v1}, LE0/c0;->W2()V

    :cond_4
    if-nez p1, :cond_5

    invoke-static {p0}, LE0/E;->a(LE0/B;)V

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->F0()V

    :cond_5
    instance-of p1, v0, LC0/O;

    if-eqz p1, :cond_6

    move-object p1, v0

    check-cast p1, LC0/O;

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v1

    invoke-interface {p1, v1}, LC0/O;->X(LC0/N;)V

    :cond_6
    const/16 p1, 0x80

    invoke-static {p1}, LE0/e0;->a(I)I

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    const/16 p1, 0x100

    invoke-static {p1}, LE0/e0;->a(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr p1, v1

    if-eqz p1, :cond_7

    instance-of p1, v0, LC0/J;

    if-eqz p1, :cond_7

    invoke-static {p0}, LE0/d;->c(LE0/c;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->F0()V

    :cond_7
    const/16 p1, 0x10

    invoke-static {p1}, LE0/e0;->a(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr p1, v1

    if-eqz p1, :cond_8

    instance-of p1, v0, Ly0/F;

    if-eqz p1, :cond_8

    check-cast v0, Ly0/F;

    invoke-interface {v0}, Ly0/F;->L0()Ly0/E;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->c2()LE0/c0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ly0/E;->f(LC0/r;)V

    :cond_8
    const/16 p1, 0x8

    invoke-static {p1}, LE0/e0;->a(I)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_9

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object p1

    invoke-interface {p1}, LE0/m0;->z()V

    :cond_9
    return-void
.end method

.method private final I2()V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "unInitializeModifier called on unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const/16 v1, 0x20

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    instance-of v1, v0, LD0/j;

    if-eqz v1, :cond_1

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v1

    invoke-interface {v1}, LE0/m0;->getModifierLocalManager()LD0/f;

    move-result-object v1

    move-object v2, v0

    check-cast v2, LD0/j;

    invoke-interface {v2}, LD0/j;->getKey()LD0/l;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, LD0/f;->d(LE0/c;LD0/c;)V

    :cond_1
    instance-of v1, v0, LD0/d;

    if-eqz v1, :cond_2

    check-cast v0, LD0/d;

    invoke-static {}, LE0/d;->a()LE0/d$a;

    move-result-object v1

    invoke-interface {v0, v1}, LD0/d;->Z0(LD0/k;)V

    :cond_2
    const/16 v0, 0x8

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->z()V

    :cond_3
    return-void
.end method

.method private final K2(LD0/j;)V
    .locals 2

    iget-object v0, p0, LE0/c;->p:LD0/a;

    if-eqz v0, :cond_0

    invoke-interface {p1}, LD0/j;->getKey()LD0/l;

    move-result-object v1

    invoke-virtual {v0, v1}, LD0/a;->a(LD0/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, LD0/a;->c(LD0/j;)V

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getModifierLocalManager()LD0/f;

    move-result-object v0

    invoke-interface {p1}, LD0/j;->getKey()LD0/l;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, LD0/f;->f(LE0/c;LD0/c;)V

    goto :goto_0

    :cond_0
    new-instance v0, LD0/a;

    invoke-direct {v0, p1}, LD0/a;-><init>(LD0/j;)V

    iput-object v0, p0, LE0/c;->p:LD0/a;

    invoke-static {p0}, LE0/d;->c(LE0/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getModifierLocalManager()LD0/f;

    move-result-object v0

    invoke-interface {p1}, LD0/j;->getKey()LD0/l;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, LD0/f;->a(LE0/c;LD0/c;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public A(LC0/o;LC0/n;I)I
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/x;

    invoke-interface {v0, p1, p2, p3}, LC0/x;->A(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public B(LC0/r;)V
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/J;

    invoke-interface {v0, p1}, LC0/J;->B(LC0/r;)V

    return-void
.end method

.method public C0()V
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly0/F;

    invoke-interface {v0}, Ly0/F;->L0()Ly0/E;

    move-result-object v0

    invoke-virtual {v0}, Ly0/E;->d()V

    return-void
.end method

.method public final D2()Landroidx/compose/ui/e$b;
    .locals 1

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    return-object v0
.end method

.method public E1()Z
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly0/F;

    invoke-interface {v0}, Ly0/F;->L0()Ly0/E;

    move-result-object v0

    invoke-virtual {v0}, Ly0/E;->c()Z

    move-result v0

    return v0
.end method

.method public final E2()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, LE0/c;->q:Ljava/util/HashSet;

    return-object v0
.end method

.method public final G2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/c;->o:Z

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method

.method public H0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/c;->o:Z

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method

.method public final H2(Landroidx/compose/ui/e$b;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LE0/c;->I2()V

    :cond_0
    iput-object p1, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    invoke-static {p1}, LE0/f0;->f(Landroidx/compose/ui/e$b;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/e$c;->x2(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LE0/c;->F2(Z)V

    :cond_1
    return-void
.end method

.method public I0()Z
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly0/F;

    invoke-interface {v0}, Ly0/F;->L0()Ly0/E;

    move-result-object v0

    invoke-virtual {v0}, Ly0/E;->a()Z

    move-result v0

    return v0
.end method

.method public J(Lo0/c;)V
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj0/g;

    invoke-interface {v0, p1}, Lj0/g;->J(Lo0/c;)V

    return-void
.end method

.method public J1(Lk0/l;)V
    .locals 1

    iget-object p1, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v0, "onFocusEvent called on wrong node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final J2()V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/c;->q:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    invoke-static {p0}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    invoke-static {}, LE0/d;->b()Lmh/l;

    move-result-object v1

    new-instance v2, LE0/c$b;

    invoke-direct {v2, p0}, LE0/c$b;-><init>(LE0/c;)V

    invoke-virtual {v0, p0, v1, v2}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    :cond_0
    return-void
.end method

.method public M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/K;

    invoke-interface {v0, p1, p2}, LC0/K;->M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public S0()LD0/g;
    .locals 1

    iget-object v0, p0, LE0/c;->p:LD0/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LD0/i;->a()LD0/g;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public Y1(LC0/r;)V
    .locals 0

    iput-object p1, p0, LE0/c;->r:LC0/r;

    return-void
.end method

.method public a0(J)V
    .locals 0

    return-void
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/x;

    invoke-interface {v0, p1, p2, p3, p4}, LC0/x;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;

    move-result-object p1

    return-object p1
.end method

.method public c()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/s;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getDensity()LY0/d;
    .locals 1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K()LY0/d;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->getLayoutDirection()LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public h0()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    return v0
.end method

.method public n2()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LE0/c;->F2(Z)V

    return-void
.end method

.method public o0(Landroidx/compose/ui/focus/k;)V
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "applyFocusProperties called on wrong node"

    invoke-static {v1}, LB0/a;->b(Ljava/lang/String;)V

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    new-instance v0, Lk0/f;

    invoke-direct {v0, p1}, Lk0/f;-><init>(Landroidx/compose/ui/focus/k;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public o2()V
    .locals 0

    invoke-direct {p0}, LE0/c;->I2()V

    return-void
.end method

.method public p(LC0/o;LC0/n;I)I
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/x;

    invoke-interface {v0, p1, p2, p3}, LC0/x;->p(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public q(LJ0/w;)V
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LJ0/l;

    invoke-interface {v0}, LJ0/l;->U1()LJ0/j;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LJ0/j;

    invoke-virtual {p1, v0}, LJ0/j;->e(LJ0/j;)V

    return-void
.end method

.method public r(LC0/o;LC0/n;I)I
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/x;

    invoke-interface {v0, p1, p2, p3}, LC0/x;->r(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly0/F;

    invoke-interface {v0}, Ly0/F;->L0()Ly0/E;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ly0/E;->e(Ly0/n;Ly0/p;J)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(LC0/o;LC0/n;I)I
    .locals 2

    iget-object v0, p0, LE0/c;->n:Landroidx/compose/ui/e$b;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LC0/x;

    invoke-interface {v0, p1, p2, p3}, LC0/x;->v(LC0/o;LC0/n;I)I

    move-result p1

    return p1
.end method

.method public z(LD0/c;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LE0/c;->q:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x20

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_a

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v3

    invoke-virtual {v3}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->a2()I

    move-result v3

    and-int/2addr v3, v0

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    :goto_1
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v0

    if-eqz v3, :cond_7

    move-object v3, v1

    move-object v5, v4

    :goto_2
    if-eqz v3, :cond_7

    instance-of v6, v3, LD0/h;

    if-eqz v6, :cond_0

    check-cast v3, LD0/h;

    invoke-interface {v3}, LD0/h;->S0()LD0/g;

    move-result-object v6

    invoke-virtual {v6, p1}, LD0/g;->a(LD0/c;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v3}, LD0/h;->S0()LD0/g;

    move-result-object v0

    invoke-virtual {v0, p1}, LD0/g;->b(LD0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v0

    if-eqz v6, :cond_6

    instance-of v6, v3, LE0/m;

    if-eqz v6, :cond_6

    move-object v6, v3

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_4

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_1

    move-object v3, v6

    goto :goto_4

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v5, v3}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v3, v4

    :cond_3
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_3

    :cond_5
    if-ne v8, v9, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_2

    :cond_7
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_1

    :cond_8
    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    move-object v1, v4

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, LD0/c;->a()Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
