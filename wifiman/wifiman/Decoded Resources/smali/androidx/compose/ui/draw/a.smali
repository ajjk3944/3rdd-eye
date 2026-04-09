.class final Landroidx/compose/ui/draw/a;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements Lj0/c;
.implements LE0/h0;
.implements Lj0/b;


# instance fields
.field private final n:Lj0/d;

.field private o:Z

.field private p:Landroidx/compose/ui/draw/f;

.field private q:Lmh/l;


# direct methods
.method public constructor <init>(Lj0/d;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/a;->n:Lj0/d;

    iput-object p2, p0, Landroidx/compose/ui/draw/a;->q:Lmh/l;

    invoke-virtual {p1, p0}, Lj0/d;->q(Lj0/b;)V

    new-instance p2, Landroidx/compose/ui/draw/a$a;

    invoke-direct {p2, p0}, Landroidx/compose/ui/draw/a$a;-><init>(Landroidx/compose/ui/draw/a;)V

    invoke-virtual {p1, p2}, Lj0/d;->v(Lmh/a;)V

    return-void
.end method

.method private final F2(Lo0/c;)Lj0/h;
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/draw/a;->o:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->n:Lj0/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj0/d;->s(Lj0/h;)V

    invoke-virtual {v0, p1}, Lj0/d;->r(Lo0/c;)V

    new-instance p1, Landroidx/compose/ui/draw/a$b;

    invoke-direct {p1, p0, v0}, Landroidx/compose/ui/draw/a$b;-><init>(Landroidx/compose/ui/draw/a;Lj0/d;)V

    invoke-static {p0, p1}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    invoke-virtual {v0}, Lj0/d;->b()Lj0/h;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/draw/a;->o:Z

    goto :goto_0

    :cond_0
    const-string p1, "DrawResult not defined, did you forget to call onDraw?"

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/draw/a;->n:Lj0/d;

    invoke-virtual {p1}, Lj0/d;->b()Lj0/h;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final D2()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->q:Lmh/l;

    return-object v0
.end method

.method public final E2()Lm0/H0;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->p:Landroidx/compose/ui/draw/f;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/ui/draw/f;

    invoke-direct {v0}, Landroidx/compose/ui/draw/f;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/draw/a;->p:Landroidx/compose/ui/draw/f;

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/draw/f;->c()Lm0/H0;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {p0}, LE0/k;->j(LE0/j;)Lm0/H0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/draw/f;->e(Lm0/H0;)V

    :cond_1
    return-object v0
.end method

.method public final G2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draw/a;->q:Lmh/l;

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->c0()V

    return-void
.end method

.method public H0()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->c0()V

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/compose/ui/draw/a;->F2(Lo0/c;)Lj0/h;

    move-result-object v0

    invoke-virtual {v0}, Lj0/h;->a()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
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

.method public c0()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->p:Landroidx/compose/ui/draw/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/draw/f;->d()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/draw/a;->o:Z

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->n:Lj0/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj0/d;->s(Lj0/h;)V

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    return-void
.end method

.method public getDensity()LY0/d;
    .locals 1

    invoke-static {p0}, LE0/k;->i(LE0/j;)LY0/d;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    invoke-static {p0}, LE0/k;->l(LE0/j;)LY0/t;

    move-result-object v0

    return-object v0
.end method

.method public o2()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/e$c;->o2()V

    iget-object v0, p0, Landroidx/compose/ui/draw/a;->p:Landroidx/compose/ui/draw/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/draw/f;->d()V

    :cond_0
    return-void
.end method

.method public q1()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->c0()V

    return-void
.end method
