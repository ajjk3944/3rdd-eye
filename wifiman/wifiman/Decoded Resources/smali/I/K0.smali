.class public final LI/K0;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/M0;
.implements LE0/h;
.implements LE0/t;
.implements LI/N0$a;


# instance fields
.field private n:LI/N0;

.field private o:LF/E;

.field private p:LM/G;

.field private final q:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/N0;LF/E;LM/G;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, LI/K0;->n:LI/N0;

    iput-object p2, p0, LI/K0;->o:LF/E;

    iput-object p3, p0, LI/K0;->p:LM/G;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LI/K0;->q:LT/q0;

    return-void
.end method

.method private D2(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/K0;->q:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A0()LM/G;
    .locals 1

    iget-object v0, p0, LI/K0;->p:LM/G;

    return-object v0
.end method

.method public B(LC0/r;)V
    .locals 0

    invoke-direct {p0, p1}, LI/K0;->D2(LC0/r;)V

    return-void
.end method

.method public E2(LF/E;)V
    .locals 0

    iput-object p1, p0, LI/K0;->o:LF/E;

    return-void
.end method

.method public final F2(LI/N0;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI/K0;->n:LI/N0;

    invoke-interface {v0}, LR0/L;->d()V

    iget-object v0, p0, LI/K0;->n:LI/N0;

    invoke-virtual {v0, p0}, LI/N0;->l(LI/N0$a;)V

    :cond_0
    iput-object p1, p0, LI/K0;->n:LI/N0;

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LI/K0;->n:LI/N0;

    invoke-virtual {p1, p0}, LI/N0;->j(LI/N0$a;)V

    :cond_1
    return-void
.end method

.method public G2(LM/G;)V
    .locals 0

    iput-object p1, p0, LI/K0;->p:LM/G;

    return-void
.end method

.method public O1()LF/E;
    .locals 1

    iget-object v0, p0, LI/K0;->o:LF/E;

    return-object v0
.end method

.method public U0(Lmh/p;)LIi/y0;
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    sget-object v4, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v5, LI/K0$a;

    invoke-direct {v5, p0, p1, v1}, LI/K0$a;-><init>(LI/K0;Lmh/p;Ldh/e;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    return-object p1
.end method

.method public getSoftwareKeyboardController()Landroidx/compose/ui/platform/n1;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->q()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/n1;

    return-object v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/w1;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/w1;

    return-object v0
.end method

.method public n2()V
    .locals 1

    iget-object v0, p0, LI/K0;->n:LI/N0;

    invoke-virtual {v0, p0}, LI/N0;->j(LI/N0$a;)V

    return-void
.end method

.method public o1()LC0/r;
    .locals 1

    iget-object v0, p0, LI/K0;->q:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/r;

    return-object v0
.end method

.method public o2()V
    .locals 1

    iget-object v0, p0, LI/K0;->n:LI/N0;

    invoke-virtual {v0, p0}, LI/N0;->l(LI/N0$a;)V

    return-void
.end method
