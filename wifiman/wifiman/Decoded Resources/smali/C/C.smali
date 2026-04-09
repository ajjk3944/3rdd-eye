.class public abstract LC/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# instance fields
.field private final A:LT/q0;

.field private final B:LC0/O;

.field private C:J

.field private final D:LB/E;

.field private final E:LT/q0;

.field private final F:LT/q0;

.field private final G:LT/q0;

.field private final H:LT/q0;

.field private final I:LT/q0;

.field private final J:LT/q0;

.field private final a:LT/q0;

.field private final b:LB/h;

.field private final c:LC/x;

.field private d:I

.field private e:I

.field private f:J

.field private g:J

.field private h:F

.field private i:F

.field private final j:Lw/y;

.field private k:I

.field private l:I

.field private m:Z

.field private n:I

.field private o:Landroidx/compose/foundation/lazy/layout/d$b;

.field private p:Z

.field private q:LT/q0;

.field private r:LY0/d;

.field private final s:Ly/m;

.field private final t:LT/n0;

.field private final u:LT/n0;

.field private final v:LT/z1;

.field private final w:LT/z1;

.field private final x:Landroidx/compose/foundation/lazy/layout/d;

.field private final y:LB/j;

.field private final z:LB/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 1

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0}, LC/C;-><init>(IFLB/Q;)V

    return-void
.end method

.method public constructor <init>(IFLB/Q;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    float-to-double v0, p2

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    cmpg-double v2, v2, v0

    if-gtz v2, :cond_0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 2
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LC/C;->a:LT/q0;

    .line 3
    invoke-static {p0}, LC/q;->a(LC/C;)LB/h;

    move-result-object v0

    iput-object v0, p0, LC/C;->b:LB/h;

    .line 4
    new-instance v0, LC/x;

    invoke-direct {v0, p1, p2, p0}, LC/x;-><init>(IFLC/C;)V

    iput-object v0, p0, LC/C;->c:LC/x;

    .line 5
    iput p1, p0, LC/C;->d:I

    const-wide v3, 0x7fffffffffffffffL

    .line 6
    iput-wide v3, p0, LC/C;->f:J

    .line 7
    new-instance p2, LC/C$f;

    invoke-direct {p2, p0}, LC/C$f;-><init>(LC/C;)V

    invoke-static {p2}, Lw/z;->a(Lmh/l;)Lw/y;

    move-result-object p2

    iput-object p2, p0, LC/C;->j:Lw/y;

    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p0, LC/C;->m:Z

    const/4 v3, -0x1

    .line 9
    iput v3, p0, LC/C;->n:I

    .line 10
    invoke-static {}, LC/D;->j()LC/u;

    move-result-object v4

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v5

    invoke-static {v4, v5}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v4

    iput-object v4, p0, LC/C;->q:LT/q0;

    .line 11
    invoke-static {}, LC/D;->c()LC/D$b;

    move-result-object v4

    iput-object v4, p0, LC/C;->r:LY0/d;

    .line 12
    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v4

    iput-object v4, p0, LC/C;->s:Ly/m;

    .line 13
    invoke-static {v3}, LT/f1;->a(I)LT/n0;

    move-result-object v3

    iput-object v3, p0, LC/C;->t:LT/n0;

    .line 14
    invoke-static {p1}, LT/f1;->a(I)LT/n0;

    move-result-object p1

    iput-object p1, p0, LC/C;->u:LT/n0;

    .line 15
    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p1

    new-instance v3, LC/C$g;

    invoke-direct {v3, p0}, LC/C$g;-><init>(LC/C;)V

    invoke-static {p1, v3}, LT/o1;->d(LT/n1;Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LC/C;->v:LT/z1;

    .line 16
    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p1

    new-instance v3, LC/C$h;

    invoke-direct {v3, p0}, LC/C$h;-><init>(LC/C;)V

    invoke-static {p1, v3}, LT/o1;->d(LT/n1;Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LC/C;->w:LT/z1;

    .line 17
    new-instance p1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-direct {p1, p3, v1, v2, v1}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LB/Q;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LC/C;->x:Landroidx/compose/foundation/lazy/layout/d;

    .line 18
    new-instance p1, LB/j;

    invoke-direct {p1}, LB/j;-><init>()V

    iput-object p1, p0, LC/C;->y:LB/j;

    .line 19
    new-instance p1, LB/b;

    invoke-direct {p1}, LB/b;-><init>()V

    iput-object p1, p0, LC/C;->z:LB/b;

    .line 20
    invoke-static {v1, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LC/C;->A:LT/q0;

    .line 21
    new-instance p1, LC/C$c;

    invoke-direct {p1, p0}, LC/C$c;-><init>(LC/C;)V

    iput-object p1, p0, LC/C;->B:LC0/O;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 22
    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v3

    iput-wide v3, p0, LC/C;->C:J

    .line 23
    new-instance p1, LB/E;

    invoke-direct {p1}, LB/E;-><init>()V

    iput-object p1, p0, LC/C;->D:LB/E;

    .line 24
    invoke-virtual {v0}, LC/x;->d()LB/B;

    .line 25
    invoke-static {v1, p2, v1}, LB/M;->c(LT/q0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LC/C;->E:LT/q0;

    .line 26
    invoke-static {v1, p2, v1}, LB/M;->c(LT/q0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LC/C;->F:LT/q0;

    .line 27
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p2

    iput-object p2, p0, LC/C;->G:LT/q0;

    .line 28
    invoke-static {p1, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p2

    iput-object p2, p0, LC/C;->H:LT/q0;

    .line 29
    invoke-static {p1, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p2

    iput-object p2, p0, LC/C;->I:LT/q0;

    .line 30
    invoke-static {p1, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LC/C;->J:LT/q0;

    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "currentPageOffsetFraction "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is not within the range -0.5 to 0.5"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 32
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final N()I
    .locals 1

    iget-object v0, p0, LC/C;->t:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method private final Q()I
    .locals 1

    iget-object v0, p0, LC/C;->u:LT/n0;

    invoke-interface {v0}, LT/W;->e()I

    move-result v0

    return v0
.end method

.method private final S(F)Z
    .locals 2

    invoke-virtual {p0}, LC/C;->C()LC/n;

    move-result-object v0

    invoke-interface {v0}, LC/n;->e()Lw/q;

    move-result-object v0

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    invoke-virtual {p0}, LC/C;->R()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    invoke-virtual {p0}, LC/C;->R()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LC/C;->T()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method private final T()Z
    .locals 2

    invoke-virtual {p0}, LC/C;->R()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LC/C;->R()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final V(FLC/n;)V
    .locals 5

    iget-boolean v0, p0, LC/C;->m:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    const/4 v1, 0x1

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p2}, LC/n;->h()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC/f;

    invoke-interface {v2}, LC/f;->getIndex()I

    move-result v2

    invoke-interface {p2}, LC/n;->k()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v2, v1

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LC/n;->h()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC/f;

    invoke-interface {v2}, LC/f;->getIndex()I

    move-result v2

    invoke-interface {p2}, LC/n;->k()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    :goto_1
    if-ltz v2, :cond_6

    invoke-virtual {p0}, LC/C;->F()I

    move-result v1

    if-ge v2, v1, :cond_6

    iget v1, p0, LC/C;->n:I

    if-eq v2, v1, :cond_4

    iget-boolean v1, p0, LC/C;->p:Z

    if-eq v1, v0, :cond_3

    iget-object v1, p0, LC/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    :cond_3
    iput-boolean v0, p0, LC/C;->p:Z

    iput v2, p0, LC/C;->n:I

    iget-object v1, p0, LC/C;->x:Landroidx/compose/foundation/lazy/layout/d;

    iget-wide v3, p0, LC/C;->C:J

    invoke-virtual {v1, v2, v3, v4}, Landroidx/compose/foundation/lazy/layout/d;->e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;

    move-result-object v1

    iput-object v1, p0, LC/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    :cond_4
    if-eqz v0, :cond_5

    invoke-interface {p2}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/f;

    invoke-interface {p2}, LC/n;->i()I

    move-result v1

    invoke-interface {p2}, LC/n;->j()I

    move-result v2

    add-int/2addr v1, v2

    invoke-interface {v0}, LC/f;->b()I

    move-result v0

    add-int/2addr v0, v1

    invoke-interface {p2}, LC/n;->d()I

    move-result p2

    sub-int/2addr v0, p2

    int-to-float p2, v0

    cmpg-float p1, p2, p1

    if-gez p1, :cond_6

    iget-object p1, p0, LC/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->b()V

    goto :goto_2

    :cond_5
    invoke-interface {p2}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/f;

    invoke-interface {p2}, LC/n;->g()I

    move-result p2

    invoke-interface {v0}, LC/f;->b()I

    move-result v0

    sub-int/2addr p2, v0

    int-to-float p2, p2

    neg-float p1, p1

    cmpg-float p1, p2, p1

    if-gez p1, :cond_6

    iget-object p1, p0, LC/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->b()V

    :cond_6
    :goto_2
    return-void
.end method

.method private final W(F)F
    .locals 11

    invoke-static {p0}, LC/y;->a(LC/C;)J

    move-result-wide v0

    iget v2, p0, LC/C;->h:F

    add-float/2addr v2, p1

    invoke-static {v2}, Loh/b;->g(F)J

    move-result-wide v3

    long-to-float v5, v3

    sub-float/2addr v2, v5

    iput v2, p0, LC/C;->h:F

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v5, 0x38d1b717    # 1.0E-4f

    cmpg-float v2, v2, v5

    if-gez v2, :cond_0

    return p1

    :cond_0
    add-long/2addr v3, v0

    iget-wide v7, p0, LC/C;->g:J

    iget-wide v9, p0, LC/C;->f:J

    move-wide v5, v3

    invoke-static/range {v5 .. v10}, Lsh/m;->m(JJJ)J

    move-result-wide v5

    cmp-long v2, v3, v5

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    sub-long/2addr v5, v0

    long-to-float v0, v5

    iput v0, p0, LC/C;->i:F

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v1, v7, v9

    if-eqz v1, :cond_4

    iget-object v1, p0, LC/C;->I:LT/q0;

    const/4 v7, 0x0

    cmpl-float v8, v0, v7

    if-lez v8, :cond_2

    move v8, v4

    goto :goto_1

    :cond_2
    move v8, v3

    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-interface {v1, v8}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, LC/C;->J:LT/q0;

    cmpg-float v0, v0, v7

    if-gez v0, :cond_3

    move v3, v4

    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, LC/C;->q:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/u;

    long-to-int v1, v5

    neg-int v3, v1

    invoke-virtual {v0, v3}, LC/u;->v(I)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v0, v4}, LC/C;->o(LC/u;Z)V

    iget-object v0, p0, LC/C;->E:LT/q0;

    invoke-static {v0}, LB/M;->d(LT/q0;)V

    iget v0, p0, LC/C;->l:I

    add-int/2addr v0, v4

    iput v0, p0, LC/C;->l:I

    goto :goto_2

    :cond_5
    iget-object v0, p0, LC/C;->c:LC/x;

    invoke-virtual {v0, v1}, LC/x;->a(I)V

    invoke-virtual {p0}, LC/C;->O()LC0/N;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, LC0/N;->j()V

    :cond_6
    iget v0, p0, LC/C;->k:I

    add-int/2addr v0, v4

    iput v0, p0, LC/C;->k:I

    :goto_2
    if-eqz v2, :cond_7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_3

    :cond_7
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method

.method static synthetic X(LC/C;Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, LC/C$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LC/C$d;

    iget v1, v0, LC/C$d;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC/C$d;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LC/C$d;

    invoke-direct {v0, p0, p3}, LC/C$d;-><init>(LC/C;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LC/C$d;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LC/C$d;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LC/C$d;->a:Ljava/lang/Object;

    check-cast p0, LC/C;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, LC/C$d;->c:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lmh/p;

    iget-object p0, v0, LC/C$d;->b:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ls/L;

    iget-object p0, v0, LC/C$d;->a:Ljava/lang/Object;

    check-cast p0, LC/C;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LC/C$d;->a:Ljava/lang/Object;

    iput-object p1, v0, LC/C$d;->b:Ljava/lang/Object;

    iput-object p2, v0, LC/C$d;->c:Ljava/lang/Object;

    iput v4, v0, LC/C$d;->f:I

    invoke-direct {p0, v0}, LC/C;->q(Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-virtual {p0}, LC/C;->a()Z

    move-result p3

    if-nez p3, :cond_5

    invoke-virtual {p0}, LC/C;->v()I

    move-result p3

    invoke-direct {p0, p3}, LC/C;->g0(I)V

    :cond_5
    iget-object p3, p0, LC/C;->j:Lw/y;

    iput-object p0, v0, LC/C$d;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, LC/C$d;->b:Ljava/lang/Object;

    iput-object v2, v0, LC/C$d;->c:Ljava/lang/Object;

    iput v3, v0, LC/C$d;->f:I

    invoke-interface {p3, p1, p2, v0}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    const/4 p1, -0x1

    invoke-direct {p0, p1}, LC/C;->e0(I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic Z(LC/C;IFLdh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LC/C;->Y(IFLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: scrollToPage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final a0(Z)V
    .locals 1

    iget-object v0, p0, LC/C;->H:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final b0(Z)V
    .locals 1

    iget-object v0, p0, LC/C;->G:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final e0(I)V
    .locals 1

    iget-object v0, p0, LC/C;->t:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method private final f0(LC0/N;)V
    .locals 1

    iget-object v0, p0, LC/C;->A:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic g(LC/C;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LC/C;->q(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g0(I)V
    .locals 1

    iget-object v0, p0, LC/C;->u:LT/n0;

    invoke-interface {v0, p1}, LT/n0;->l(I)V

    return-void
.end method

.method public static final synthetic h(LC/C;I)I
    .locals 0

    invoke-direct {p0, p1}, LC/C;->s(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic i(LC/C;)I
    .locals 0

    invoke-direct {p0}, LC/C;->N()I

    move-result p0

    return p0
.end method

.method public static final synthetic j(LC/C;)I
    .locals 0

    invoke-direct {p0}, LC/C;->Q()I

    move-result p0

    return p0
.end method

.method private final j0(LC/u;)V
    .locals 6

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    :try_start_0
    iget v4, p0, LC/C;->i:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_1

    iget-boolean v4, p0, LC/C;->m:Z

    if-eqz v4, :cond_1

    iget v4, p0, LC/C;->i:F

    invoke-direct {p0, v4}, LC/C;->S(F)Z

    move-result v4

    if-eqz v4, :cond_1

    iget v4, p0, LC/C;->i:F

    invoke-direct {p0, v4, p1}, LC/C;->V(FLC/n;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    return-void

    :goto_2
    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method public static final synthetic k(LC/C;F)F
    .locals 0

    invoke-direct {p0, p1}, LC/C;->W(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic l(LC/C;LC0/N;)V
    .locals 0

    invoke-direct {p0, p1}, LC/C;->f0(LC0/N;)V

    return-void
.end method

.method public static synthetic n(LC/C;IFLr/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x7

    const/4 p5, 0x0

    invoke-static {v0, v0, p5, p3, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LC/C;->m(IFLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: animateScrollToPage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic p(LC/C;LC/u;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LC/C;->o(LC/u;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: applyMeasureResult"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final q(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC/C;->z:LB/b;

    invoke-virtual {v0, p1}, LB/b;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final r(LC/n;)V
    .locals 2

    iget v0, p0, LC/C;->n:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    invoke-interface {p1}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, LC/C;->p:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/f;

    invoke-interface {v0}, LC/f;->getIndex()I

    move-result v0

    invoke-interface {p1}, LC/n;->k()I

    move-result p1

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LC/n;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/f;

    invoke-interface {v0}, LC/f;->getIndex()I

    move-result v0

    invoke-interface {p1}, LC/n;->k()I

    move-result p1

    sub-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget p1, p0, LC/C;->n:I

    if-eq p1, v0, :cond_2

    iput v1, p0, LC/C;->n:I

    iget-object p1, p0, LC/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/d$b;->cancel()V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, LC/C;->o:Landroidx/compose/foundation/lazy/layout/d$b;

    :cond_2
    return-void
.end method

.method private final s(I)I
    .locals 2

    invoke-virtual {p0}, LC/C;->F()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LC/C;->F()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v1, v0}, Lsh/m;->k(III)I

    move-result v1

    :cond_0
    return v1
.end method


# virtual methods
.method public final A()Ly/m;
    .locals 1

    iget-object v0, p0, LC/C;->s:Ly/m;

    return-object v0
.end method

.method public B()Z
    .locals 1

    iget-object v0, p0, LC/C;->I:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final C()LC/n;
    .locals 1

    iget-object v0, p0, LC/C;->q:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/n;

    return-object v0
.end method

.method public final D()LT/q0;
    .locals 1

    iget-object v0, p0, LC/C;->F:LT/q0;

    return-object v0
.end method

.method public final E()Lsh/i;
    .locals 1

    iget-object v0, p0, LC/C;->c:LC/x;

    invoke-virtual {v0}, LC/x;->d()LB/B;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    return-object v0
.end method

.method public abstract F()I
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, LC/C;->q:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/u;

    invoke-virtual {v0}, LC/u;->i()I

    move-result v0

    return v0
.end method

.method public final H()I
    .locals 2

    invoke-virtual {p0}, LC/C;->G()I

    move-result v0

    invoke-virtual {p0}, LC/C;->I()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final I()I
    .locals 1

    iget-object v0, p0, LC/C;->q:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/u;

    invoke-virtual {v0}, LC/u;->j()I

    move-result v0

    return v0
.end method

.method public final J()LB/E;
    .locals 1

    iget-object v0, p0, LC/C;->D:LB/E;

    return-object v0
.end method

.method public final K()LT/q0;
    .locals 1

    iget-object v0, p0, LC/C;->E:LT/q0;

    return-object v0
.end method

.method public final L()F
    .locals 3

    iget-object v0, p0, LC/C;->r:LY0/d;

    invoke-static {}, LC/D;->i()F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->d1(F)F

    move-result v0

    invoke-virtual {p0}, LC/C;->G()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {p0}, LC/C;->G()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final M()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    iget-object v0, p0, LC/C;->x:Landroidx/compose/foundation/lazy/layout/d;

    return-object v0
.end method

.method public final O()LC0/N;
    .locals 1

    iget-object v0, p0, LC/C;->A:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/N;

    return-object v0
.end method

.method public final P()LC0/O;
    .locals 1

    iget-object v0, p0, LC/C;->B:LC0/O;

    return-object v0
.end method

.method public final R()J
    .locals 2

    iget-object v0, p0, LC/C;->a:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public final U(LC/r;I)I
    .locals 1

    iget-object v0, p0, LC/C;->c:LC/x;

    invoke-virtual {v0, p1, p2}, LC/x;->e(LC/r;I)I

    move-result p1

    return p1
.end method

.method public final Y(IFLdh/e;)Ljava/lang/Object;
    .locals 6

    new-instance v2, LC/C$e;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p2, p1, v0}, LC/C$e;-><init>(LC/C;FILdh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lw/y;->b(Lw/y;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, LC/C;->j:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    return v0
.end method

.method public c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LC/C;->X(LC/C;Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c0(LY0/d;)V
    .locals 0

    iput-object p1, p0, LC/C;->r:LY0/d;

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, LC/C;->H:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d0(J)V
    .locals 0

    iput-wide p1, p0, LC/C;->C:J

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, LC/C;->G:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public f(F)F
    .locals 1

    iget-object v0, p0, LC/C;->j:Lw/y;

    invoke-interface {v0, p1}, Lw/y;->f(F)F

    move-result p1

    return p1
.end method

.method public final h0(J)V
    .locals 1

    iget-object v0, p0, LC/C;->a:LT/q0;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final i0(IFZ)V
    .locals 1

    iget-object v0, p0, LC/C;->c:LC/x;

    invoke-virtual {v0, p1, p2}, LC/x;->f(IF)V

    if-eqz p3, :cond_0

    invoke-virtual {p0}, LC/C;->O()LC0/N;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, LC0/N;->j()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LC/C;->F:LT/q0;

    invoke-static {p1}, LB/M;->d(LT/q0;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final k0(Lw/v;I)V
    .locals 0

    invoke-direct {p0, p2}, LC/C;->s(I)I

    move-result p1

    invoke-direct {p0, p1}, LC/C;->e0(I)V

    return-void
.end method

.method public final m(IFLr/i;Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p4, LC/C$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LC/C$a;

    iget v1, v0, LC/C$a;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LC/C$a;->g:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, LC/C$a;

    invoke-direct {v0, p0, p4}, LC/C$a;-><init>(LC/C;Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, LC/C$a;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LC/C$a;->g:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p2, v6, LC/C$a;->d:F

    iget p1, v6, LC/C$a;->c:I

    iget-object p3, v6, LC/C$a;->b:Ljava/lang/Object;

    check-cast p3, Lr/i;

    iget-object v1, v6, LC/C$a;->a:Ljava/lang/Object;

    check-cast v1, LC/C;

    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    :goto_2
    move-object v4, p3

    goto :goto_4

    :cond_3
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LC/C;->v()I

    move-result p4

    if-ne p1, p4, :cond_4

    invoke-virtual {p0}, LC/C;->w()F

    move-result p4

    cmpg-float p4, p4, p2

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, LC/C;->F()I

    move-result p4

    if-nez p4, :cond_5

    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_5
    iput-object p0, v6, LC/C$a;->a:Ljava/lang/Object;

    iput-object p3, v6, LC/C$a;->b:Ljava/lang/Object;

    iput p1, v6, LC/C$a;->c:I

    iput p2, v6, LC/C$a;->d:F

    iput v3, v6, LC/C$a;->g:I

    invoke-direct {p0, v6}, LC/C;->q(Ldh/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_6

    return-object v0

    :cond_6
    move-object v1, p0

    goto :goto_2

    :goto_4
    float-to-double p3, p2

    const-wide/high16 v7, -0x4020000000000000L    # -0.5

    cmpg-double v3, v7, p3

    if-gtz v3, :cond_8

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    cmpg-double p3, p3, v7

    if-gtz p3, :cond_8

    invoke-direct {v1, p1}, LC/C;->s(I)I

    move-result p1

    invoke-virtual {v1}, LC/C;->H()I

    move-result p3

    int-to-float p3, p3

    mul-float v3, p2, p3

    iget-object p2, v1, LC/C;->b:LB/h;

    new-instance v5, LC/C$b;

    invoke-direct {v5, v1}, LC/C$b;-><init>(LC/C;)V

    const/4 p3, 0x0

    iput-object p3, v6, LC/C$a;->a:Ljava/lang/Object;

    iput-object p3, v6, LC/C$a;->b:Ljava/lang/Object;

    iput v2, v6, LC/C$a;->g:I

    move-object v1, p2

    move v2, p1

    invoke-static/range {v1 .. v6}, LC/D;->a(LB/h;IFLr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "pageOffsetFraction "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is not within the range -0.5 to 0.5"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final o(LC/u;Z)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object p2, p0, LC/C;->c:LC/x;

    invoke-virtual {p1}, LC/u;->s()F

    move-result v0

    invoke-virtual {p2, v0}, LC/x;->j(F)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LC/C;->c:LC/x;

    invoke-virtual {p2, p1}, LC/x;->k(LC/u;)V

    invoke-direct {p0, p1}, LC/C;->r(LC/n;)V

    :goto_0
    iget-object p2, p0, LC/C;->q:LT/q0;

    invoke-interface {p2, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, LC/u;->n()Z

    move-result p2

    invoke-direct {p0, p2}, LC/C;->b0(Z)V

    invoke-virtual {p1}, LC/u;->m()Z

    move-result p2

    invoke-direct {p0, p2}, LC/C;->a0(Z)V

    invoke-virtual {p1}, LC/u;->t()LC/e;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LC/e;->getIndex()I

    move-result p2

    iput p2, p0, LC/C;->d:I

    :cond_1
    invoke-virtual {p1}, LC/u;->u()I

    move-result p2

    iput p2, p0, LC/C;->e:I

    invoke-direct {p0, p1}, LC/C;->j0(LC/u;)V

    invoke-virtual {p0}, LC/C;->F()I

    move-result p2

    invoke-static {p1, p2}, LC/D;->g(LC/n;I)J

    move-result-wide v0

    iput-wide v0, p0, LC/C;->f:J

    invoke-virtual {p0}, LC/C;->F()I

    move-result p2

    invoke-static {p1, p2}, LC/D;->b(LC/u;I)J

    move-result-wide p1

    iput-wide p1, p0, LC/C;->g:J

    return-void
.end method

.method public final t()LB/b;
    .locals 1

    iget-object v0, p0, LC/C;->z:LB/b;

    return-object v0
.end method

.method public final u()LB/j;
    .locals 1

    iget-object v0, p0, LC/C;->y:LB/j;

    return-object v0
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, LC/C;->c:LC/x;

    invoke-virtual {v0}, LC/x;->b()I

    move-result v0

    return v0
.end method

.method public final w()F
    .locals 1

    iget-object v0, p0, LC/C;->c:LC/x;

    invoke-virtual {v0}, LC/x;->c()F

    move-result v0

    return v0
.end method

.method public final x()LY0/d;
    .locals 1

    iget-object v0, p0, LC/C;->r:LY0/d;

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, LC/C;->d:I

    return v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, LC/C;->e:I

    return v0
.end method
