.class public final Ls/z;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements Lk0/b;
.implements LE0/v0;
.implements LE0/t;
.implements Lk0/k;


# instance fields
.field private final p:Z

.field private q:Lk0/l;

.field private final r:Ls/y;

.field private final s:Ls/A;

.field private final t:Ls/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly/m;)V
    .locals 1

    invoke-direct {p0}, LE0/m;-><init>()V

    new-instance v0, Ls/y;

    invoke-direct {v0, p1}, Ls/y;-><init>(Ly/m;)V

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object p1

    check-cast p1, Ls/y;

    iput-object p1, p0, Ls/z;->r:Ls/y;

    new-instance p1, Ls/A;

    invoke-direct {p1}, Ls/A;-><init>()V

    invoke-virtual {p0, p1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object p1

    check-cast p1, Ls/A;

    iput-object p1, p0, Ls/z;->s:Ls/A;

    new-instance p1, Ls/C;

    invoke-direct {p1}, Ls/C;-><init>()V

    invoke-virtual {p0, p1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object p1

    check-cast p1, Ls/C;

    iput-object p1, p0, Ls/z;->t:Ls/C;

    invoke-static {}, Lk0/o;->a()Lk0/n;

    move-result-object p1

    invoke-virtual {p0, p1}, LE0/m;->D2(LE0/j;)LE0/j;

    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iget-object v0, p0, Ls/z;->t:Ls/C;

    invoke-virtual {v0, p1}, Ls/C;->B(LC0/r;)V

    return-void
.end method

.method public J1(Lk0/l;)V
    .locals 7

    iget-object v0, p0, Ls/z;->q:Lk0/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v1

    new-instance v4, Ls/z$b;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v2}, Ls/z$b;-><init>(Ls/z;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_1
    iget-object v1, p0, Ls/z;->r:Ls/y;

    invoke-virtual {v1, v0}, Ls/y;->F2(Z)V

    iget-object v1, p0, Ls/z;->t:Ls/C;

    invoke-virtual {v1, v0}, Ls/C;->F2(Z)V

    iget-object v1, p0, Ls/z;->s:Ls/A;

    invoke-virtual {v1, v0}, Ls/A;->E2(Z)V

    iput-object p1, p0, Ls/z;->q:Lk0/l;

    :cond_2
    return-void
.end method

.method public final J2(Ly/m;)V
    .locals 1

    iget-object v0, p0, Ls/z;->r:Ls/y;

    invoke-virtual {v0, p1}, Ls/y;->G2(Ly/m;)V

    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Ls/z;->p:Z

    return v0
.end method

.method public q(LJ0/w;)V
    .locals 3

    iget-object v0, p0, Ls/z;->q:Lk0/l;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk0/l;->isFocused()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-static {p1, v1}, LJ0/t;->d0(LJ0/w;Z)V

    new-instance v0, Ls/z$a;

    invoke-direct {v0, p0}, Ls/z$a;-><init>(Ls/z;)V

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->S(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    return-void
.end method
