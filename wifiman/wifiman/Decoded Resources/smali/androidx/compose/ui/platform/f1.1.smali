.class public final Landroidx/compose/ui/platform/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/l0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/f1$b;
    }
.end annotation


# static fields
.field public static final n:Landroidx/compose/ui/platform/f1$b;

.field public static final o:I

.field private static final p:Lmh/p;


# instance fields
.field private final a:Landroidx/compose/ui/platform/r;

.field private b:Lmh/p;

.field private c:Lmh/a;

.field private d:Z

.field private final e:Landroidx/compose/ui/platform/K0;

.field private f:Z

.field private g:Z

.field private h:Lm0/S0;

.field private final i:Landroidx/compose/ui/platform/F0;

.field private final j:Lm0/o0;

.field private k:J

.field private final l:Landroidx/compose/ui/platform/n0;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/f1$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/f1$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/f1;->n:Landroidx/compose/ui/platform/f1$b;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/f1;->o:I

    sget-object v0, Landroidx/compose/ui/platform/f1$a;->a:Landroidx/compose/ui/platform/f1$a;

    sput-object v0, Landroidx/compose/ui/platform/f1;->p:Lmh/p;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/r;Lmh/p;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/f1;->a:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Landroidx/compose/ui/platform/f1;->b:Lmh/p;

    iput-object p3, p0, Landroidx/compose/ui/platform/f1;->c:Lmh/a;

    new-instance p2, Landroidx/compose/ui/platform/K0;

    invoke-direct {p2}, Landroidx/compose/ui/platform/K0;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    new-instance p2, Landroidx/compose/ui/platform/F0;

    sget-object p3, Landroidx/compose/ui/platform/f1;->p:Lmh/p;

    invoke-direct {p2, p3}, Landroidx/compose/ui/platform/F0;-><init>(Lmh/p;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    new-instance p2, Lm0/o0;

    invoke-direct {p2}, Lm0/o0;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/f1;->j:Lm0/o0;

    sget-object p2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Landroidx/compose/ui/platform/f1;->k:J

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1d

    if-lt p2, p3, :cond_0

    new-instance p2, Landroidx/compose/ui/platform/d1;

    invoke-direct {p2, p1}, Landroidx/compose/ui/platform/d1;-><init>(Landroidx/compose/ui/platform/r;)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroidx/compose/ui/platform/Q0;

    invoke-direct {p2, p1}, Landroidx/compose/ui/platform/Q0;-><init>(Landroidx/compose/ui/platform/r;)V

    :goto_0
    const/4 p1, 0x1

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/n0;->H(Z)Z

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/n0;->w(Z)V

    iput-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    return-void
.end method

.method private final l(Lm0/n0;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->F()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/K0;->a(Lm0/n0;)V

    :cond_1
    return-void
.end method

.method private final m(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/f1;->d:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/f1;->d:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/platform/r;->A0(LE0/l0;Z)V

    :cond_0
    return-void
.end method

.method private final n()V
    .locals 2

    sget-object v0, Landroidx/compose/ui/platform/L1;->a:Landroidx/compose/ui/platform/L1;

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/L1;->a(Landroidx/compose/ui/platform/r;)V

    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/F0;->b(Ljava/lang/Object;)[F

    move-result-object v0

    invoke-static {p1, v0}, Lm0/O0;->n([F[F)V

    return-void
.end method

.method public b(J)Z
    .locals 4

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/n0;->C()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    cmpg-float p2, p1, v0

    if-gtz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/n0;->getWidth()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {p1}, Landroidx/compose/ui/platform/n0;->getHeight()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v1, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->F()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/K0;->f(J)Z

    move-result p1

    return p1

    :cond_2
    return v3
.end method

.method public c(Landroidx/compose/ui/graphics/d;)V
    .locals 13

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->z()I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/f1;->m:I

    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->t1()J

    move-result-wide v2

    iput-wide v2, p0, Landroidx/compose/ui/platform/f1;->k:J

    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/n0;->F()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/K0;->e()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    and-int/lit8 v5, v0, 0x1

    if-eqz v5, :cond_2

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->n()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->i(F)V

    :cond_2
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_3

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->K()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->g(F)V

    :cond_3
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_4

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->b()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->a(F)V

    :cond_4
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_5

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->F()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->j(F)V

    :cond_5
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_6

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->C()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->f(F)V

    :cond_6
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_7

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->z(F)V

    :cond_7
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_8

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->p()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/x0;->j(J)I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->E(I)V

    :cond_8
    and-int/lit16 v5, v0, 0x80

    if-eqz v5, :cond_9

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->M()J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/x0;->j(J)I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->J(I)V

    :cond_9
    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_a

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->w()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->e(F)V

    :cond_a
    and-int/lit16 v5, v0, 0x100

    if-eqz v5, :cond_b

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->H()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->m(F)V

    :cond_b
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_c

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->u()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->d(F)V

    :cond_c
    and-int/lit16 v5, v0, 0x800

    if-eqz v5, :cond_d

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->E()F

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->l(F)V

    :cond_d
    if-eqz v1, :cond_e

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-wide v5, p0, Landroidx/compose/ui/platform/f1;->k:J

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v5

    iget-object v6, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v6}, Landroidx/compose/ui/platform/n0;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-interface {v1, v5}, Landroidx/compose/ui/platform/n0;->v(F)V

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-wide v5, p0, Landroidx/compose/ui/platform/f1;->k:J

    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v5

    iget-object v6, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v6}, Landroidx/compose/ui/platform/n0;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-interface {v1, v5}, Landroidx/compose/ui/platform/n0;->y(F)V

    :cond_e
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->q()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->L()Lm0/i1;

    move-result-object v1

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v5

    if-eq v1, v5, :cond_f

    move v1, v4

    goto :goto_1

    :cond_f
    move v1, v3

    :goto_1
    and-int/lit16 v5, v0, 0x6000

    if-eqz v5, :cond_11

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v5, v1}, Landroidx/compose/ui/platform/n0;->G(Z)V

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->q()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->L()Lm0/i1;

    move-result-object v6

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v7

    if-ne v6, v7, :cond_10

    move v6, v4

    goto :goto_2

    :cond_10
    move v6, v3

    :goto_2
    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->w(Z)V

    :cond_11
    const/high16 v5, 0x20000

    and-int/2addr v5, v0

    if-eqz v5, :cond_12

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->B()Lm0/d1;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->k(Lm0/d1;)V

    :cond_12
    const v5, 0x8000

    and-int/2addr v5, v0

    if-eqz v5, :cond_13

    iget-object v5, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->r()I

    move-result v6

    invoke-interface {v5, v6}, Landroidx/compose/ui/platform/n0;->t(I)V

    :cond_13
    iget-object v6, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->A()Lm0/Q0;

    move-result-object v7

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->b()F

    move-result v8

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->J()F

    move-result v10

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->c()J

    move-result-wide v11

    move v9, v1

    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/platform/K0;->h(Lm0/Q0;FZFJ)Z

    move-result v5

    iget-object v6, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v6}, Landroidx/compose/ui/platform/K0;->c()Z

    move-result v6

    if-eqz v6, :cond_14

    iget-object v6, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-object v7, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v7}, Landroidx/compose/ui/platform/K0;->b()Landroid/graphics/Outline;

    move-result-object v7

    invoke-interface {v6, v7}, Landroidx/compose/ui/platform/n0;->B(Landroid/graphics/Outline;)V

    :cond_14
    if-eqz v1, :cond_15

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/K0;->e()Z

    move-result v1

    if-nez v1, :cond_15

    move v3, v4

    :cond_15
    if-ne v2, v3, :cond_17

    if-eqz v3, :cond_16

    if-eqz v5, :cond_16

    goto :goto_3

    :cond_16
    invoke-direct {p0}, Landroidx/compose/ui/platform/f1;->n()V

    goto :goto_4

    :cond_17
    :goto_3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/f1;->invalidate()V

    :goto_4
    iget-boolean v1, p0, Landroidx/compose/ui/platform/f1;->g:Z

    if-nez v1, :cond_18

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/n0;->L()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_18

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->c:Lmh/a;

    if-eqz v1, :cond_18

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_18
    and-int/lit16 v0, v0, 0x1f1b

    if-eqz v0, :cond_19

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/F0;->c()V

    :cond_19
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/d;->z()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/platform/f1;->m:I

    return-void
.end method

.method public d(Lm0/n0;Lp0/c;)V
    .locals 8

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result p2

    const/4 v6, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/f1;->j()V

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/n0;->L()F

    move-result p2

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-lez p2, :cond_0

    const/4 v6, 0x1

    :cond_0
    iput-boolean v6, p0, Landroidx/compose/ui/platform/f1;->g:Z

    if-eqz v6, :cond_1

    invoke-interface {p1}, Lm0/n0;->y()V

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {p2, v0}, Landroidx/compose/ui/platform/n0;->u(Landroid/graphics/Canvas;)V

    iget-boolean p2, p0, Landroidx/compose/ui/platform/f1;->g:Z

    if-eqz p2, :cond_6

    invoke-interface {p1}, Lm0/n0;->k()V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/n0;->c()I

    move-result p2

    int-to-float p2, p2

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/n0;->D()I

    move-result v1

    int-to-float v7, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/n0;->n()I

    move-result v1

    int-to-float v3, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/n0;->s()I

    move-result v1

    int-to-float v4, v1

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/n0;->b()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_4

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->h:Lm0/S0;

    if-nez v1, :cond_3

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/f1;->h:Lm0/S0;

    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/n0;->b()F

    move-result v2

    invoke-interface {v1, v2}, Lm0/S0;->a(F)V

    invoke-interface {v1}, Lm0/S0;->x()Landroid/graphics/Paint;

    move-result-object v5

    move v1, p2

    move v2, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    goto :goto_0

    :cond_4
    invoke-interface {p1}, Lm0/n0;->j()V

    :goto_0
    invoke-interface {p1, p2, v7}, Lm0/n0;->c(FF)V

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p2, v0}, Landroidx/compose/ui/platform/F0;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-interface {p1, p2}, Lm0/n0;->n([F)V

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/f1;->l(Lm0/n0;)V

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->b:Lmh/p;

    if-eqz p2, :cond_5

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-direct {p0, v6}, Landroidx/compose/ui/platform/f1;->m(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->h()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/f1;->b:Lmh/p;

    iput-object v0, p0, Landroidx/compose/ui/platform/f1;->c:Lmh/a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/f1;->f:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/f1;->m(Z)V

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->L0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/r;->J0(LE0/l0;)Z

    return-void
.end method

.method public e(JZ)J
    .locals 1

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p3, v0}, Landroidx/compose/ui/platform/F0;->a(Ljava/lang/Object;)[F

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p3, v0}, Landroidx/compose/ui/platform/F0;->b(Ljava/lang/Object;)[F

    move-result-object p3

    invoke-static {p3, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public f(J)V
    .locals 4

    invoke-static {p1, p2}, LY0/r;->g(J)I

    move-result v0

    invoke-static {p1, p2}, LY0/r;->f(J)I

    move-result p1

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-wide v1, p0, Landroidx/compose/ui/platform/f1;->k:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v1

    int-to-float v2, v0

    mul-float/2addr v1, v2

    invoke-interface {p2, v1}, Landroidx/compose/ui/platform/n0;->v(F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-wide v1, p0, Landroidx/compose/ui/platform/f1;->k:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v1

    int-to-float v2, p1

    mul-float/2addr v1, v2

    invoke-interface {p2, v1}, Landroidx/compose/ui/platform/n0;->y(F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {p2}, Landroidx/compose/ui/platform/n0;->c()I

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v2}, Landroidx/compose/ui/platform/n0;->D()I

    move-result v2

    iget-object v3, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v3}, Landroidx/compose/ui/platform/n0;->c()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->D()I

    move-result v0

    add-int/2addr v0, p1

    invoke-interface {p2, v1, v2, v3, v0}, Landroidx/compose/ui/platform/n0;->x(IIII)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/K0;->b()Landroid/graphics/Outline;

    move-result-object p2

    invoke-interface {p1, p2}, Landroidx/compose/ui/platform/n0;->B(Landroid/graphics/Outline;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/f1;->invalidate()V

    iget-object p1, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/F0;->c()V

    :cond_0
    return-void
.end method

.method public g(Lmh/p;Lmh/a;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/f1;->m(Z)V

    iput-boolean v0, p0, Landroidx/compose/ui/platform/f1;->f:Z

    iput-boolean v0, p0, Landroidx/compose/ui/platform/f1;->g:Z

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/f1;->k:J

    iput-object p1, p0, Landroidx/compose/ui/platform/f1;->b:Lmh/p;

    iput-object p2, p0, Landroidx/compose/ui/platform/f1;->c:Lmh/a;

    return-void
.end method

.method public h([F)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/F0;->a(Ljava/lang/Object;)[F

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Lm0/O0;->n([F[F)V

    :cond_0
    return-void
.end method

.method public i(J)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->c()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v1}, Landroidx/compose/ui/platform/n0;->D()I

    move-result v1

    invoke-static {p1, p2}, LY0/n;->h(J)I

    move-result v2

    invoke-static {p1, p2}, LY0/n;->i(J)I

    move-result p1

    if-ne v0, v2, :cond_0

    if-eq v1, p1, :cond_3

    :cond_0
    if-eq v0, v2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    sub-int/2addr v2, v0

    invoke-interface {p2, v2}, Landroidx/compose/ui/platform/n0;->r(I)V

    :cond_1
    if-eq v1, p1, :cond_2

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    sub-int/2addr p1, v1

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/n0;->A(I)V

    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/platform/f1;->n()V

    iget-object p1, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/F0;->c()V

    :cond_3
    return-void
.end method

.method public invalidate()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/f1;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/ui/platform/f1;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/f1;->m(Z)V

    :cond_0
    return-void
.end method

.method public j()V
    .locals 5

    iget-boolean v0, p0, Landroidx/compose/ui/platform/f1;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->q()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-interface {v0}, Landroidx/compose/ui/platform/n0;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/K0;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->e:Landroidx/compose/ui/platform/K0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/K0;->d()Lm0/U0;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/platform/f1;->b:Lmh/p;

    if-eqz v1, :cond_2

    iget-object v2, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    iget-object v3, p0, Landroidx/compose/ui/platform/f1;->j:Lm0/o0;

    new-instance v4, Landroidx/compose/ui/platform/f1$c;

    invoke-direct {v4, v1}, Landroidx/compose/ui/platform/f1$c;-><init>(Lmh/p;)V

    invoke-interface {v2, v3, v0, v4}, Landroidx/compose/ui/platform/n0;->I(Lm0/o0;Lm0/U0;Lmh/l;)V

    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/f1;->m(Z)V

    :cond_3
    return-void
.end method

.method public k(Ll0/e;Z)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p2, v0}, Landroidx/compose/ui/platform/F0;->a(Ljava/lang/Object;)[F

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Ll0/e;->g(FFFF)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p1}, Lm0/O0;->g([FLl0/e;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/f1;->i:Landroidx/compose/ui/platform/F0;

    iget-object v0, p0, Landroidx/compose/ui/platform/f1;->l:Landroidx/compose/ui/platform/n0;

    invoke-virtual {p2, v0}, Landroidx/compose/ui/platform/F0;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-static {p2, p1}, Lm0/O0;->g([FLl0/e;)V

    :goto_0
    return-void
.end method
