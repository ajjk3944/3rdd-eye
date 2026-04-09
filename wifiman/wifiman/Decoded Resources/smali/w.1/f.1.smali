.class public final Lw/f;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LD/c;
.implements LE0/A;
.implements LE0/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/f$a;,
        Lw/f$b;
    }
.end annotation


# instance fields
.field private n:Lw/q;

.field private final o:Lw/A;

.field private p:Z

.field private q:Lw/d;

.field private final r:Z

.field private final s:Lw/c;

.field private t:LC0/r;

.field private u:Ll0/i;

.field private v:Z

.field private w:J

.field private x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lw/q;Lw/A;ZLw/d;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Lw/f;->n:Lw/q;

    iput-object p2, p0, Lw/f;->o:Lw/A;

    iput-boolean p3, p0, Lw/f;->p:Z

    iput-object p4, p0, Lw/f;->q:Lw/d;

    new-instance p1, Lw/c;

    invoke-direct {p1}, Lw/c;-><init>()V

    iput-object p1, p0, Lw/f;->s:Lw/c;

    sget-object p1, LY0/r;->b:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lw/f;->w:J

    return-void
.end method

.method public static final synthetic D2(Lw/f;Lw/d;)F
    .locals 0

    invoke-direct {p0, p1}, Lw/f;->N2(Lw/d;)F

    move-result p0

    return p0
.end method

.method public static final synthetic E2(Lw/f;)Lw/c;
    .locals 0

    iget-object p0, p0, Lw/f;->s:Lw/c;

    return-object p0
.end method

.method public static final synthetic F2(Lw/f;)Ll0/i;
    .locals 0

    invoke-direct {p0}, Lw/f;->S2()Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G2(Lw/f;)Z
    .locals 0

    iget-boolean p0, p0, Lw/f;->p:Z

    return p0
.end method

.method public static final synthetic H2(Lw/f;)Lw/A;
    .locals 0

    iget-object p0, p0, Lw/f;->o:Lw/A;

    return-object p0
.end method

.method public static final synthetic I2(Lw/f;)Z
    .locals 0

    iget-boolean p0, p0, Lw/f;->v:Z

    return p0
.end method

.method public static final synthetic J2(Lw/f;)Z
    .locals 0

    iget-boolean p0, p0, Lw/f;->x:Z

    return p0
.end method

.method public static final synthetic K2(Lw/f;)V
    .locals 0

    invoke-direct {p0}, Lw/f;->W2()V

    return-void
.end method

.method public static final synthetic L2(Lw/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lw/f;->x:Z

    return-void
.end method

.method public static final synthetic M2(Lw/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lw/f;->v:Z

    return-void
.end method

.method private final N2(Lw/d;)F
    .locals 5

    iget-wide v0, p0, Lw/f;->w:J

    sget-object v2, LY0/r;->b:LY0/r$a;

    invoke-virtual {v2}, LY0/r$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/r;->e(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Lw/f;->R2()Ll0/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lw/f;->v:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lw/f;->S2()Ll0/i;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-wide v1, p0, Lw/f;->w:J

    invoke-static {v1, v2}, LY0/s;->d(J)J

    move-result-wide v1

    iget-object v3, p0, Lw/f;->n:Lw/q;

    sget-object v4, Lw/f$b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_4

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v3

    invoke-virtual {v0}, Ll0/i;->l()F

    move-result v4

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v0

    sub-float/2addr v4, v0

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v0

    invoke-interface {p1, v3, v4, v0}, Lw/d;->a(FFF)F

    move-result p1

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v3

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v4

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v0

    sub-float/2addr v4, v0

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v0

    invoke-interface {p1, v3, v4, v0}, Lw/d;->a(FFF)F

    move-result p1

    :goto_1
    return p1
.end method

.method private final O2(JJ)I
    .locals 2

    iget-object v0, p0, Lw/f;->n:Lw/q;

    sget-object v1, Lw/f$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LY0/r;->g(J)I

    move-result p1

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2}, LY0/r;->f(J)I

    move-result p1

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final P2(JJ)I
    .locals 2

    iget-object v0, p0, Lw/f;->n:Lw/q;

    sget-object v1, Lw/f$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ll0/m;->i(J)F

    move-result p1

    invoke-static {p3, p4}, Ll0/m;->i(J)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2}, Ll0/m;->g(J)F

    move-result p1

    invoke-static {p3, p4}, Ll0/m;->g(J)F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final Q2(Ll0/i;J)Ll0/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw/f;->Y2(Ll0/i;J)J

    move-result-wide p2

    invoke-static {p2, p3}, Ll0/g;->u(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ll0/i;->x(J)Ll0/i;

    move-result-object p1

    return-object p1
.end method

.method private final R2()Ll0/i;
    .locals 8

    iget-object v0, p0, Lw/f;->s:Lw/c;

    invoke-static {v0}, Lw/c;->a(Lw/c;)LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    :cond_0
    aget-object v3, v0, v1

    check-cast v3, Lw/f$a;

    invoke-virtual {v3}, Lw/f$a;->b()Lmh/a;

    move-result-object v3

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/i;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ll0/i;->m()J

    move-result-wide v4

    iget-wide v6, p0, Lw/f;->w:J

    invoke-static {v6, v7}, LY0/s;->d(J)J

    move-result-wide v6

    invoke-direct {p0, v4, v5, v6, v7}, Lw/f;->P2(JJ)I

    move-result v4

    if-gtz v4, :cond_1

    move-object v2, v3

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    move-object v2, v3

    :cond_2
    return-object v2

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_0

    :cond_4
    return-object v2
.end method

.method private final S2()Ll0/i;
    .locals 4

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, LE0/k;->k(LE0/j;)LC0/r;

    move-result-object v0

    iget-object v2, p0, Lw/f;->t:LC0/r;

    if-eqz v2, :cond_3

    invoke-interface {v2}, LC0/r;->M()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-interface {v0, v2, v1}, LC0/r;->J(LC0/r;Z)Ll0/i;

    move-result-object v0

    return-object v0

    :cond_3
    :goto_1
    return-object v1
.end method

.method private final U2(Ll0/i;J)Z
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lw/f;->Y2(Ll0/i;J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float p3, p3, v0

    if-gtz p3, :cond_0

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method static synthetic V2(Lw/f;Ll0/i;JILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    iget-wide p2, p0, Lw/f;->w:J

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lw/f;->U2(Ll0/i;J)Z

    move-result p0

    return p0
.end method

.method private final W2()V
    .locals 9

    invoke-direct {p0}, Lw/f;->Z2()Lw/d;

    move-result-object v0

    iget-boolean v1, p0, Lw/f;->x:Z

    if-nez v1, :cond_0

    new-instance v1, Lw/G;

    invoke-interface {v0}, Lw/d;->b()Lr/i;

    move-result-object v2

    invoke-direct {v1, v2}, Lw/G;-><init>(Lr/i;)V

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v3

    sget-object v5, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v6, Lw/f$c;

    const/4 v2, 0x0

    invoke-direct {v6, p0, v1, v0, v2}, Lw/f$c;-><init>(Lw/f;Lw/G;Lw/d;Ldh/e;)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "launchAnimation called when previous animation was running"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final Y2(Ll0/i;J)J
    .locals 4

    invoke-static {p2, p3}, LY0/s;->d(J)J

    move-result-wide p2

    iget-object v0, p0, Lw/f;->n:Lw/q;

    sget-object v1, Lw/f$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lw/f;->Z2()Lw/d;

    move-result-object v0

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result p1

    sub-float/2addr v3, p1

    invoke-static {p2, p3}, Ll0/m;->i(J)F

    move-result p1

    invoke-interface {v0, v1, v3, p1}, Lw/d;->a(FFF)F

    move-result p1

    invoke-static {p1, v2}, Ll0/h;->a(FF)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, Lw/f;->Z2()Lw/d;

    move-result-object v0

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result v3

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result p1

    sub-float/2addr v3, p1

    invoke-static {p2, p3}, Ll0/m;->g(J)F

    move-result p1

    invoke-interface {v0, v1, v3, p1}, Lw/d;->a(FFF)F

    move-result p1

    invoke-static {v2, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private final Z2()Lw/d;
    .locals 1

    iget-object v0, p0, Lw/f;->q:Lw/d;

    if-nez v0, :cond_0

    invoke-static {}, Lw/e;->a()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/d;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public K0(Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 7

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll0/i;

    if-eqz v2, :cond_3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lw/f;->V2(Lw/f;Ll0/i;JILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, Lw/f$a;

    invoke-direct {v1, p1, v0}, Lw/f$a;-><init>(Lmh/a;LIi/n;)V

    invoke-static {p0}, Lw/f;->E2(Lw/f;)Lw/c;

    move-result-object p1

    invoke-virtual {p1, v1}, Lw/c;->c(Lw/f$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lw/f;->J2(Lw/f;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0}, Lw/f;->K2(Lw/f;)V

    :cond_0
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final T2()J
    .locals 2

    iget-wide v0, p0, Lw/f;->w:J

    return-wide v0
.end method

.method public final X2(LC0/r;)V
    .locals 0

    iput-object p1, p0, Lw/f;->t:LC0/r;

    return-void
.end method

.method public a0(J)V
    .locals 5

    iget-wide v0, p0, Lw/f;->w:J

    iput-wide p1, p0, Lw/f;->w:J

    invoke-direct {p0, p1, p2, v0, v1}, Lw/f;->O2(JJ)I

    move-result v2

    if-ltz v2, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lw/f;->S2()Ll0/i;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v3, p0, Lw/f;->u:Ll0/i;

    if-nez v3, :cond_1

    move-object v3, v2

    :cond_1
    iget-boolean v4, p0, Lw/f;->x:Z

    if-nez v4, :cond_2

    iget-boolean v4, p0, Lw/f;->v:Z

    if-nez v4, :cond_2

    invoke-direct {p0, v3, v0, v1}, Lw/f;->U2(Ll0/i;J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v2, p1, p2}, Lw/f;->U2(Ll0/i;J)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lw/f;->v:Z

    invoke-direct {p0}, Lw/f;->W2()V

    :cond_2
    iput-object v2, p0, Lw/f;->u:Ll0/i;

    :cond_3
    return-void
.end method

.method public final a3(Lw/q;ZLw/d;)V
    .locals 0

    iput-object p1, p0, Lw/f;->n:Lw/q;

    iput-boolean p2, p0, Lw/f;->p:Z

    iput-object p3, p0, Lw/f;->q:Lw/d;

    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Lw/f;->r:Z

    return v0
.end method

.method public w0(Ll0/i;)Ll0/i;
    .locals 4

    iget-wide v0, p0, Lw/f;->w:J

    sget-object v2, LY0/r;->b:LY0/r$a;

    invoke-virtual {v2}, LY0/r$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lw/f;->w:J

    invoke-direct {p0, p1, v0, v1}, Lw/f;->Q2(Ll0/i;J)Ll0/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expected BringIntoViewRequester to not be used before parents are placed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
