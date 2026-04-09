.class public final Landroidx/compose/ui/graphics/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/graphics/c;


# instance fields
.field private a:I

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:J

.field private i:J

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:J

.field private o:Lm0/i1;

.field private p:Z

.field private q:I

.field private r:J

.field private s:LY0/d;

.field private t:LY0/t;

.field private u:Lm0/Q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/compose/ui/graphics/d;->b:F

    iput v0, p0, Landroidx/compose/ui/graphics/d;->c:F

    iput v0, p0, Landroidx/compose/ui/graphics/d;->d:F

    invoke-static {}, Lm0/I0;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->h:J

    invoke-static {}, Lm0/I0;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->i:J

    const/high16 v1, 0x41000000    # 8.0f

    iput v1, p0, Landroidx/compose/ui/graphics/d;->m:F

    sget-object v1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->n:J

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/graphics/d;->o:Lm0/i1;

    sget-object v1, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result v1

    iput v1, p0, Landroidx/compose/ui/graphics/d;->q:I

    sget-object v1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v1}, Ll0/m$a;->a()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/graphics/d;->r:J

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LY0/f;->b(FFILjava/lang/Object;)LY0/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/d;->s:LY0/d;

    sget-object v0, LY0/t;->Ltr:LY0/t;

    iput-object v0, p0, Landroidx/compose/ui/graphics/d;->t:LY0/t;

    return-void
.end method


# virtual methods
.method public final A()Lm0/Q0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->u:Lm0/Q0;

    return-object v0
.end method

.method public B()Lm0/d1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public C()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->f:F

    return v0
.end method

.method public D(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->h:J

    invoke-static {v0, v1, p1, p2}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->h:J

    :cond_0
    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->m:F

    return v0
.end method

.method public F()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->e:F

    return v0
.end method

.method public G(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/graphics/d;->p:Z

    if-eq v0, p1, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput-boolean p1, p0, Landroidx/compose/ui/graphics/d;->p:Z

    :cond_0
    return-void
.end method

.method public H()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->j:F

    return v0
.end method

.method public I(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->i:J

    invoke-static {v0, v1, p1, p2}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->i:J

    :cond_0
    return-void
.end method

.method public I1(Lm0/i1;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->o:Lm0/i1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput-object p1, p0, Landroidx/compose/ui/graphics/d;->o:Lm0/i1;

    :cond_0
    return-void
.end method

.method public J()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->g:F

    return v0
.end method

.method public K()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->c:F

    return v0
.end method

.method public L()Lm0/i1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->o:Lm0/i1;

    return-object v0
.end method

.method public M()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->i:J

    return-wide v0
.end method

.method public final O()V
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->i(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->g(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->a(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->j(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->f(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->o(F)V

    invoke-static {}, Lm0/I0;->a()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/d;->D(J)V

    invoke-static {}, Lm0/I0;->a()J

    move-result-wide v1

    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/d;->I(J)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->m(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->d(F)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->e(F)V

    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->l(F)V

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/graphics/d;->y1(J)V

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->I1(Lm0/i1;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/graphics/d;->G(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/compose/ui/graphics/d;->k(Lm0/d1;)V

    sget-object v2, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/a$a;->a()I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/compose/ui/graphics/d;->t(I)V

    sget-object v2, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v2}, Ll0/m$a;->a()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Landroidx/compose/ui/graphics/d;->S(J)V

    iput-object v1, p0, Landroidx/compose/ui/graphics/d;->u:Lm0/Q0;

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    return-void
.end method

.method public final Q(LY0/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/d;->s:LY0/d;

    return-void
.end method

.method public final R(LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/d;->t:LY0/t;

    return-void
.end method

.method public S(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->r:J

    return-void
.end method

.method public final T()V
    .locals 5

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/d;->L()Lm0/i1;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/d;->c()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/compose/ui/graphics/d;->t:LY0/t;

    iget-object v4, p0, Landroidx/compose/ui/graphics/d;->s:LY0/d;

    invoke-interface {v0, v1, v2, v3, v4}, Lm0/i1;->a(JLY0/t;LY0/d;)Lm0/Q0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/d;->u:Lm0/Q0;

    return-void
.end method

.method public a(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->d:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->d:F

    :goto_0
    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->d:F

    return v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->r:J

    return-wide v0
.end method

.method public d(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->k:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->k:F

    :goto_0
    return-void
.end method

.method public e(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->l:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->l:F

    :goto_0
    return-void
.end method

.method public f(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->f:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->f:F

    :goto_0
    return-void
.end method

.method public g(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->c:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->c:F

    :goto_0
    return-void
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->s:LY0/d;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public i(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->b:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->b:F

    :goto_0
    return-void
.end method

.method public j(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->e:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->e:F

    :goto_0
    return-void
.end method

.method public k(Lm0/d1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, Landroidx/compose/ui/graphics/d;->a:I

    const/high16 v0, 0x20000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/ui/graphics/d;->a:I

    :cond_0
    return-void
.end method

.method public l(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->m:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->m:F

    :goto_0
    return-void
.end method

.method public m(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->j:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->j:F

    :goto_0
    return-void
.end method

.method public n()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->b:F

    return v0
.end method

.method public o(F)V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->g:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->g:F

    :goto_0
    return-void
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->h:J

    return-wide v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/graphics/d;->p:Z

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->q:I

    return v0
.end method

.method public final s()LY0/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->s:LY0/d;

    return-object v0
.end method

.method public t(I)V
    .locals 2

    iget v0, p0, Landroidx/compose/ui/graphics/d;->q:I

    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput p1, p0, Landroidx/compose/ui/graphics/d;->q:I

    :cond_0
    return-void
.end method

.method public t1()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->n:J

    return-wide v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->k:F

    return v0
.end method

.method public final v()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->t:LY0/t;

    return-object v0
.end method

.method public w()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->l:F

    return v0
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/d;->s:LY0/d;

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method

.method public y1(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/d;->n:J

    invoke-static {v0, v1, p1, p2}, Landroidx/compose/ui/graphics/f;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    iput-wide p1, p0, Landroidx/compose/ui/graphics/d;->n:J

    :cond_0
    return-void
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/d;->a:I

    return v0
.end method
