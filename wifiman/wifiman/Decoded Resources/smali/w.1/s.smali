.class public final Lw/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/r;
.implements LY0/d;


# instance fields
.field private final synthetic a:LY0/d;

.field private b:Z

.field private c:Z

.field private final d:LTi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/s;->a:LY0/d;

    const/4 p1, 0x0

    invoke-static {p1}, LTi/g;->a(Z)LTi/a;

    move-result-object p1

    iput-object p1, p0, Lw/s;->d:LTi/a;

    return-void
.end method


# virtual methods
.method public F0(F)J
    .locals 2

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public F1(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lw/s$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw/s$a;

    iget v1, v0, Lw/s$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/s$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/s$a;

    invoke-direct {v0, p0, p1}, Lw/s$a;-><init>(Lw/s;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lw/s$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/s$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iput v3, v0, Lw/s$a;->c:I

    invoke-virtual {p0, v0}, Lw/s;->q0(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    new-instance p1, Landroidx/compose/foundation/gestures/GestureCancellationException;

    const-string v0, "The press gesture was canceled."

    invoke-direct {p1, v0}, Landroidx/compose/foundation/gestures/GestureCancellationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public final b()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw/s;->c:Z

    iget-object v1, p0, Lw/s;->d:LTi/a;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public final p()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw/s;->b:Z

    iget-object v1, p0, Lw/s;->d:LTi/a;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final q(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lw/s$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw/s$b;

    iget v1, v0, Lw/s$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/s$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/s$b;

    invoke-direct {v0, p0, p1}, Lw/s$b;-><init>(Lw/s;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lw/s$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/s$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lw/s$b;->a:Ljava/lang/Object;

    check-cast v0, Lw/s;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/s;->d:LTi/a;

    iput-object p0, v0, Lw/s$b;->a:Ljava/lang/Object;

    iput v3, v0, Lw/s$b;->d:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v3, v2}, LTi/a$a;->a(LTi/a;Ljava/lang/Object;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, v0, Lw/s;->b:Z

    iput-boolean p1, v0, Lw/s;->c:Z

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public q0(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lw/s$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw/s$c;

    iget v1, v0, Lw/s$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/s$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/s$c;

    invoke-direct {v0, p0, p1}, Lw/s$c;-><init>(Lw/s;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lw/s$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/s$c;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lw/s$c;->a:Ljava/lang/Object;

    check-cast v0, Lw/s;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lw/s;->b:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lw/s;->c:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Lw/s;->d:LTi/a;

    iput-object p0, v0, Lw/s$c;->a:Ljava/lang/Object;

    iput v4, v0, Lw/s$c;->d:I

    invoke-static {p1, v3, v0, v4, v3}, LTi/a$a;->a(LTi/a;Ljava/lang/Object;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lw/s;->d:LTi/a;

    invoke-static {p1, v3, v4, v3}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    iget-boolean p1, v0, Lw/s;->b:Z

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Lw/s;->a:LY0/d;

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method
