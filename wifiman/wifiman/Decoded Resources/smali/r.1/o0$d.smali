.class public final Lr/o0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final a:Lr/s0;

.field private final b:Ljava/lang/String;

.field private final c:LT/q0;

.field private final d:Lr/h0;

.field private final e:LT/q0;

.field private final f:LT/q0;

.field private g:Lr/c0$b;

.field private h:Lr/n0;

.field private final i:LT/q0;

.field private final j:LT/m0;

.field private k:Z

.field private final l:LT/q0;

.field private m:Lr/q;

.field private final n:LT/o0;

.field private o:Z

.field private final p:Lr/H;

.field final synthetic q:Lr/o0;


# direct methods
.method public constructor <init>(Lr/o0;Ljava/lang/Object;Lr/q;Lr/s0;Ljava/lang/String;)V
    .locals 8

    iput-object p1, p0, Lr/o0$d;->q:Lr/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lr/o0$d;->a:Lr/s0;

    iput-object p5, p0, Lr/o0$d;->b:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 p5, 0x2

    invoke-static {p2, p1, p5, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->c:LT/q0;

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0, p1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->d:Lr/h0;

    invoke-static {v0, p1, p5, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->e:LT/q0;

    new-instance v0, Lr/n0;

    invoke-virtual {p0}, Lr/o0$d;->j()Lr/H;

    move-result-object v3

    invoke-direct {p0}, Lr/o0$d;->s()Ljava/lang/Object;

    move-result-object v6

    move-object v2, v0

    move-object v4, p4

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lr/n0;-><init>(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Lr/q;)V

    invoke-static {v0, p1, p5, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->f:LT/q0;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, p1, p5, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->i:LT/q0;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, LT/C0;->a(F)LT/m0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->j:LT/m0;

    invoke-static {p2, p1, p5, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p5

    iput-object p5, p0, Lr/o0$d;->l:LT/q0;

    iput-object p3, p0, Lr/o0$d;->m:Lr/q;

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p3

    invoke-virtual {p3}, Lr/n0;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, LT/h1;->a(J)LT/o0;

    move-result-object p3

    iput-object p3, p0, Lr/o0$d;->n:LT/o0;

    invoke-static {}, Lr/I0;->h()Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-interface {p4}, Lr/s0;->a()Lmh/l;

    move-result-object p4

    invoke-interface {p4, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr/q;

    invoke-virtual {p2}, Lr/q;->b()I

    move-result p4

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p4, :cond_0

    invoke-virtual {p2, p5, p3}, Lr/q;->e(IF)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lr/o0$d;->a:Lr/s0;

    invoke-interface {p3}, Lr/s0;->b()Lmh/l;

    move-result-object p3

    invoke-interface {p3, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    const/4 p3, 0x3

    invoke-static {v1, v1, p2, p3, p1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p1

    iput-object p1, p0, Lr/o0$d;->p:Lr/H;

    return-void
.end method

.method private final E(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final G(Ljava/lang/Object;Z)V
    .locals 7

    iget-object v0, p0, Lr/o0$d;->h:Lr/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0}, Lr/o0$d;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Lr/n0;

    iget-object v2, p0, Lr/o0$d;->p:Lr/H;

    iget-object v3, p0, Lr/o0$d;->a:Lr/s0;

    iget-object v0, p0, Lr/o0$d;->m:Lr/q;

    invoke-static {v0}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v6

    move-object v1, p2

    move-object v4, p1

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lr/n0;-><init>(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Lr/q;)V

    invoke-direct {p0, p2}, Lr/o0$d;->y(Lr/n0;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr/o0$d;->k:Z

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->b()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lr/o0$d;->A(J)V

    return-void

    :cond_1
    if-eqz p2, :cond_3

    iget-boolean p2, p0, Lr/o0$d;->o:Z

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lr/o0$d;->j()Lr/H;

    move-result-object p2

    instance-of p2, p2, Lr/h0;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lr/o0$d;->j()Lr/H;

    move-result-object p2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lr/o0$d;->p:Lr/H;

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lr/o0$d;->j()Lr/H;

    move-result-object p2

    :goto_1
    iget-object v0, p0, Lr/o0$d;->q:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->m()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    :goto_2
    move-object v1, p2

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lr/o0$d;->q:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->m()J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lr/j;->c(Lr/i;J)Lr/i;

    move-result-object p2

    goto :goto_2

    :goto_3
    new-instance p2, Lr/n0;

    iget-object v2, p0, Lr/o0$d;->a:Lr/s0;

    invoke-direct {p0}, Lr/o0$d;->s()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lr/o0$d;->m:Lr/q;

    move-object v0, p2

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lr/n0;-><init>(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Lr/q;)V

    invoke-direct {p0, p2}, Lr/o0$d;->y(Lr/n0;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->b()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lr/o0$d;->A(J)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lr/o0$d;->k:Z

    iget-object p1, p0, Lr/o0$d;->q:Lr/o0;

    invoke-static {p1}, Lr/o0;->b(Lr/o0;)V

    return-void
.end method

.method static synthetic H(Lr/o0$d;Ljava/lang/Object;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lr/o0$d;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lr/o0$d;->G(Ljava/lang/Object;Z)V

    return-void
.end method

.method private final s()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/o0$d;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final y(Lr/n0;)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->f:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final z(Lr/H;)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->n:LT/o0;

    invoke-interface {v0, p1, p2}, LT/o0;->m(J)V

    return-void
.end method

.method public final B(Z)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->i:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final C(Lr/c0$b;)V
    .locals 7

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    invoke-virtual {v0}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v1

    invoke-virtual {v1}, Lr/n0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    iput-object v0, p0, Lr/o0$d;->h:Lr/n0;

    iput-object p1, p0, Lr/o0$d;->g:Lr/c0$b;

    :cond_0
    new-instance p1, Lr/n0;

    iget-object v2, p0, Lr/o0$d;->p:Lr/H;

    iget-object v3, p0, Lr/o0$d;->a:Lr/s0;

    invoke-virtual {p0}, Lr/o0$d;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0}, Lr/o0$d;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v0, p0, Lr/o0$d;->m:Lr/q;

    invoke-static {v0}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v6

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lr/n0;-><init>(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Lr/q;)V

    invoke-direct {p0, p1}, Lr/o0$d;->y(Lr/n0;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr/o0$d;->A(J)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr/o0$d;->k:Z

    return-void
.end method

.method public final D(F)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->j:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method public F(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/o0$d;->l:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final I(Ljava/lang/Object;Ljava/lang/Object;Lr/H;)V
    .locals 1

    invoke-direct {p0, p2}, Lr/o0$d;->E(Ljava/lang/Object;)V

    invoke-direct {p0, p3}, Lr/o0$d;->z(Lr/H;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p3

    invoke-virtual {p3}, Lr/n0;->i()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p3

    invoke-virtual {p3}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2, p3}, Lr/o0$d;->H(Lr/o0$d;Ljava/lang/Object;ZILjava/lang/Object;)V

    return-void
.end method

.method public final J()V
    .locals 6

    iget-object v0, p0, Lr/o0$d;->g:Lr/c0$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lr/o0$d;->h:Lr/n0;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lr/c0$b;->c()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-virtual {v0}, Lr/c0$b;->g()F

    move-result v4

    float-to-double v4, v4

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Loh/b;->f(D)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lr/n0;->f(J)Ljava/lang/Object;

    move-result-object v1

    iget-boolean v4, p0, Lr/o0$d;->k:Z

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v4

    invoke-virtual {v4, v1}, Lr/n0;->k(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v4

    invoke-virtual {v4, v1}, Lr/n0;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v4

    invoke-virtual {v4}, Lr/n0;->b()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Lr/o0$d;->A(J)V

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result v4

    const/high16 v5, -0x40000000    # -2.0f

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v4, p0, Lr/o0$d;->k:Z

    if-eqz v4, :cond_4

    :goto_0
    invoke-virtual {p0, v1}, Lr/o0$d;->F(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lr/o0$d;->q:Lr/o0;

    invoke-virtual {v1}, Lr/o0;->m()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Lr/o0$d;->x(J)V

    :goto_1
    invoke-virtual {v0}, Lr/c0$b;->c()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-ltz v1, :cond_5

    const/4 v0, 0x0

    iput-object v0, p0, Lr/o0$d;->g:Lr/c0$b;

    iput-object v0, p0, Lr/o0$d;->h:Lr/n0;

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr/c0$b;->k(Z)V

    :goto_2
    return-void
.end method

.method public final K(Ljava/lang/Object;Lr/H;)V
    .locals 4

    iget-boolean v0, p0, Lr/o0$d;->k:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/o0$d;->h:Lr/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lr/o0$d;->s()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-direct {p0, p1}, Lr/o0$d;->E(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lr/o0$d;->z(Lr/H;)V

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result p2

    const/high16 v0, -0x3fc00000    # -3.0f

    cmpg-float p2, p2, v0

    if-nez p2, :cond_3

    move-object p2, p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lr/o0$d;->getValue()Ljava/lang/Object;

    move-result-object p2

    :goto_1
    invoke-virtual {p0}, Lr/o0$d;->t()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-direct {p0, p2, v2}, Lr/o0$d;->G(Ljava/lang/Object;Z)V

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result p2

    cmpg-float p2, p2, v0

    const/4 v2, 0x0

    if-nez p2, :cond_4

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_2
    invoke-virtual {p0, v3}, Lr/o0$d;->B(Z)V

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result p2

    const/4 v3, 0x0

    cmpl-float p2, p2, v3

    if-ltz p2, :cond_5

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->b()J

    move-result-wide p1

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    long-to-float p1, p1

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result p2

    mul-float/2addr p1, p2

    float-to-long p1, p1

    invoke-virtual {v0, p1, p2}, Lr/n0;->f(J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lr/o0$d;->F(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result p2

    cmpg-float p2, p2, v0

    if-nez p2, :cond_6

    invoke-virtual {p0, p1}, Lr/o0$d;->F(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iput-boolean v2, p0, Lr/o0$d;->k:Z

    invoke-virtual {p0, v1}, Lr/o0$d;->D(F)V

    return-void
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lr/o0$d;->h:Lr/n0;

    iput-object v0, p0, Lr/o0$d;->g:Lr/c0$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr/o0$d;->k:Z

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/o0$d;->l:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lr/n0;
    .locals 1

    iget-object v0, p0, Lr/o0$d;->f:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/n0;

    return-object v0
.end method

.method public final j()Lr/H;
    .locals 1

    iget-object v0, p0, Lr/o0$d;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/H;

    return-object v0
.end method

.method public final p()J
    .locals 2

    iget-object v0, p0, Lr/o0$d;->n:LT/o0;

    invoke-interface {v0}, LT/f0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final q()Lr/c0$b;
    .locals 1

    iget-object v0, p0, Lr/o0$d;->g:Lr/c0$b;

    return-object v0
.end method

.method public final r()F
    .locals 1

    iget-object v0, p0, Lr/o0$d;->j:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lr/o0$d;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "current value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr/o0$d;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lr/o0$d;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lr/o0$d;->j()Lr/H;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(JZ)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->b()J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lr/n0;->f(J)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p3}, Lr/o0$d;->F(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lr/n0;->d(J)Lr/q;

    move-result-object p3

    iput-object p3, p0, Lr/o0$d;->m:Lr/q;

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Lr/d;->e(J)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lr/o0$d;->B(Z)V

    :cond_1
    return-void
.end method

.method public final v()V
    .locals 1

    const/high16 v0, -0x40000000    # -2.0f

    invoke-virtual {p0, v0}, Lr/o0$d;->D(F)V

    return-void
.end method

.method public final w(F)V
    .locals 2

    const/high16 v0, -0x3f800000    # -4.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v1, -0x3f600000    # -5.0f

    cmpg-float v1, p1, v1

    if-nez v1, :cond_3

    :goto_0
    iget-object p1, p0, Lr/o0$d;->h:Lr/n0;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v1

    invoke-virtual {p1}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lr/n0;->j(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lr/o0$d;->g:Lr/c0$b;

    iput-object p1, p0, Lr/o0$d;->h:Lr/n0;

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->i()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/n0;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/n0;->k(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lr/o0$d;->F(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr/o0$d;->A(J)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p1}, Lr/o0$d;->D(F)V

    :goto_2
    return-void
.end method

.method public final x(J)V
    .locals 2

    invoke-virtual {p0}, Lr/o0$d;->r()F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr/o0$d;->o:Z

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    invoke-virtual {v0}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v1

    invoke-virtual {v1}, Lr/n0;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object p1

    invoke-virtual {p1}, Lr/n0;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lr/o0$d;->F(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lr/n0;->f(J)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr/o0$d;->F(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/o0$d;->i()Lr/n0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lr/n0;->d(J)Lr/q;

    move-result-object p1

    iput-object p1, p0, Lr/o0$d;->m:Lr/q;

    :cond_1
    :goto_0
    return-void
.end method
