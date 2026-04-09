.class public final Lr/c0;
.super Lr/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/c0$a;,
        Lr/c0$b;
    }
.end annotation


# static fields
.field private static final r:Lr/c0$a;

.field public static final s:I

.field private static final t:Lr/m;

.field private static final u:Lr/m;


# instance fields
.field private final b:LT/q0;

.field private final c:LT/q0;

.field private d:Ljava/lang/Object;

.field private e:Lr/o0;

.field private f:J

.field private final g:Lmh/a;

.field private final h:LT/m0;

.field private i:LIi/n;

.field private final j:LTi/a;

.field private final k:Lr/Z;

.field private l:J

.field private final m:Lo/F;

.field private n:Lr/c0$b;

.field private final o:Lmh/l;

.field private p:F

.field private final q:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/c0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr/c0;->r:Lr/c0$a;

    const/16 v0, 0x8

    sput v0, Lr/c0;->s:I

    new-instance v0, Lr/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/m;-><init>(F)V

    sput-object v0, Lr/c0;->t:Lr/m;

    new-instance v0, Lr/m;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lr/m;-><init>(F)V

    sput-object v0, Lr/c0;->u:Lr/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lr/q0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, p0, Lr/c0;->b:LT/q0;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, Lr/c0;->c:LT/q0;

    iput-object p1, p0, Lr/c0;->d:Ljava/lang/Object;

    new-instance p1, Lr/c0$f;

    invoke-direct {p1, p0}, Lr/c0$f;-><init>(Lr/c0;)V

    iput-object p1, p0, Lr/c0;->g:Lmh/a;

    const/4 p1, 0x0

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, Lr/c0;->h:LT/m0;

    const/4 p1, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, LTi/g;->b(ZILjava/lang/Object;)LTi/a;

    move-result-object v2

    iput-object v2, p0, Lr/c0;->j:LTi/a;

    new-instance v2, Lr/Z;

    invoke-direct {v2}, Lr/Z;-><init>()V

    iput-object v2, p0, Lr/c0;->k:Lr/Z;

    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, p0, Lr/c0;->l:J

    new-instance v2, Lo/F;

    invoke-direct {v2, p1, v1, v0}, Lo/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Lr/c0;->m:Lo/F;

    new-instance p1, Lr/c0$e;

    invoke-direct {p1, p0}, Lr/c0$e;-><init>(Lr/c0;)V

    iput-object p1, p0, Lr/c0;->o:Lmh/l;

    new-instance p1, Lr/c0$c;

    invoke-direct {p1, p0}, Lr/c0$c;-><init>(Lr/c0;)V

    iput-object p1, p0, Lr/c0;->q:Lmh/l;

    return-void
.end method

.method private final A(Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, Lr/m0;->n(Ldh/i;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    invoke-direct {p0}, Lr/c0;->E()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    iput v0, p0, Lr/c0;->p:F

    iget-object v0, p0, Lr/c0;->q:Lmh/l;

    invoke-static {v0, p1}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static synthetic C(Lr/c0;Ljava/lang/Object;Lr/H;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lr/c0;->B(Ljava/lang/Object;Lr/H;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final D(Ldh/e;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lr/c0;->l:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lr/c0;->o:Lmh/l;

    invoke-static {v0, p1}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lr/c0;->A(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final E()V
    .locals 1

    iget-object v0, p0, Lr/c0;->e:Lr/o0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr/o0;->g()V

    :cond_0
    iget-object v0, p0, Lr/c0;->m:Lo/F;

    invoke-virtual {v0}, Lo/F;->h()V

    iget-object v0, p0, Lr/c0;->n:Lr/c0$b;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lr/c0;->n:Lr/c0$b;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lr/c0;->U(F)V

    invoke-direct {p0}, Lr/c0;->R()V

    :cond_1
    return-void
.end method

.method private final K()V
    .locals 9

    iget-object v0, p0, Lr/c0;->e:Lr/o0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lr/c0;->n:Lr/c0$b;

    const/4 v2, 0x0

    if-nez v1, :cond_4

    iget-wide v3, p0, Lr/c0;->f:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_3

    invoke-virtual {p0}, Lr/c0;->I()F

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v3

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Lr/c0$b;

    invoke-direct {v1}, Lr/c0$b;-><init>()V

    invoke-virtual {p0}, Lr/c0;->I()F

    move-result v3

    invoke-virtual {v1, v3}, Lr/c0$b;->o(F)V

    iget-wide v3, p0, Lr/c0;->f:J

    invoke-virtual {v1, v3, v4}, Lr/c0$b;->l(J)V

    long-to-double v3, v3

    invoke-virtual {p0}, Lr/c0;->I()F

    move-result v5

    float-to-double v5, v5

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v7, v5

    mul-double/2addr v3, v7

    invoke-static {v3, v4}, Loh/b;->f(D)J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lr/c0$b;->j(J)V

    invoke-virtual {v1}, Lr/c0$b;->f()Lr/m;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0}, Lr/c0;->I()F

    move-result v5

    invoke-virtual {v3, v4, v5}, Lr/m;->e(IF)V

    goto :goto_1

    :cond_3
    :goto_0
    move-object v1, v2

    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    iget-wide v3, p0, Lr/c0;->f:J

    invoke-virtual {v1, v3, v4}, Lr/c0$b;->l(J)V

    iget-object v3, p0, Lr/c0;->m:Lo/F;

    invoke-virtual {v3, v1}, Lo/F;->g(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Lr/o0;->I(Lr/c0$b;)V

    :cond_5
    iput-object v2, p0, Lr/c0;->n:Lr/c0$b;

    return-void
.end method

.method private final N(Lr/c0$b;J)V
    .locals 8

    invoke-virtual {p1}, Lr/c0$b;->e()J

    move-result-wide v0

    add-long v3, v0, p2

    invoke-virtual {p1, v3, v4}, Lr/c0$b;->n(J)V

    invoke-virtual {p1}, Lr/c0$b;->b()J

    move-result-wide p2

    cmp-long v0, v3, p2

    const/high16 v1, 0x3f800000    # 1.0f

    if-ltz v0, :cond_0

    invoke-virtual {p1, v1}, Lr/c0$b;->o(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lr/c0$b;->a()Lr/v0;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lr/c0$b;->f()Lr/m;

    move-result-object v5

    sget-object v6, Lr/c0;->u:Lr/m;

    invoke-virtual {p1}, Lr/c0$b;->d()Lr/m;

    move-result-object p2

    if-nez p2, :cond_1

    sget-object p2, Lr/c0;->t:Lr/m;

    :cond_1
    move-object v7, p2

    invoke-interface/range {v2 .. v7}, Lr/v0;->c(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object p2

    check-cast p2, Lr/m;

    invoke-virtual {p2, v0}, Lr/m;->a(I)F

    move-result p2

    const/4 p3, 0x0

    invoke-static {p2, p3, v1}, Lsh/m;->j(FFF)F

    move-result p2

    invoke-virtual {p1, p2}, Lr/c0$b;->o(F)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lr/c0$b;->f()Lr/m;

    move-result-object v2

    invoke-virtual {v2, v0}, Lr/m;->a(I)F

    move-result v0

    long-to-float v2, v3

    long-to-float p2, p2

    div-float/2addr v2, p2

    invoke-static {v0, v1, v2}, Lr/u0;->k(FFF)F

    move-result p2

    invoke-virtual {p1, p2}, Lr/c0$b;->o(F)V

    :goto_0
    return-void
.end method

.method private final O(Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lr/c0$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr/c0$g;

    iget v1, v0, Lr/c0$g;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr/c0$g;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr/c0$g;

    invoke-direct {v0, p0, p1}, Lr/c0$g;-><init>(Lr/c0;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lr/c0$g;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr/c0$g;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-wide/high16 v5, -0x8000000000000000L

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object v2, v0, Lr/c0$g;->a:Ljava/lang/Object;

    check-cast v2, Lr/c0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/c0;->m:Lo/F;

    invoke-virtual {p1}, Lo/M;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lr/c0;->n:Lr/c0$b;

    if-nez p1, :cond_4

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p1

    invoke-static {p1}, Lr/m0;->n(Ldh/i;)F

    move-result p1

    const/4 v2, 0x0

    cmpg-float p1, p1, v2

    if-nez p1, :cond_5

    invoke-direct {p0}, Lr/c0;->E()V

    iput-wide v5, p0, Lr/c0;->l:J

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_5
    iget-wide v7, p0, Lr/c0;->l:J

    cmp-long p1, v7, v5

    if-nez p1, :cond_6

    iget-object p1, p0, Lr/c0;->o:Lmh/l;

    iput-object p0, v0, Lr/c0$g;->a:Ljava/lang/Object;

    iput v4, v0, Lr/c0$g;->d:I

    invoke-static {p1, v0}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :cond_7
    :goto_2
    iget-object p1, v2, Lr/c0;->m:Lo/F;

    invoke-virtual {p1}, Lo/M;->d()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, v2, Lr/c0;->n:Lr/c0$b;

    if-eqz p1, :cond_8

    goto :goto_3

    :cond_8
    iput-wide v5, v2, Lr/c0;->l:J

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_9
    :goto_3
    iput-object v2, v0, Lr/c0$g;->a:Ljava/lang/Object;

    iput v3, v0, Lr/c0$g;->d:I

    invoke-direct {v2, v0}, Lr/c0;->A(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1
.end method

.method public static synthetic Q(Lr/c0;FLjava/lang/Object;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lr/c0;->P(FLjava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final R()V
    .locals 5

    iget-object v0, p0, Lr/c0;->e:Lr/o0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lr/c0;->I()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0}, Lr/o0;->q()J

    move-result-wide v3

    long-to-double v3, v3

    mul-double/2addr v1, v3

    invoke-static {v1, v2}, Loh/b;->f(D)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lr/o0;->H(J)V

    return-void
.end method

.method private final U(F)V
    .locals 1

    iget-object v0, p0, Lr/c0;->h:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final Y(Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lr/c0$j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr/c0$j;

    iget v1, v0, Lr/c0$j;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr/c0$j;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr/c0$j;

    invoke-direct {v0, p0, p1}, Lr/c0$j;-><init>(Lr/c0;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lr/c0$j;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr/c0$j;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lr/c0$j;->b:Ljava/lang/Object;

    iget-object v0, v0, Lr/c0$j;->a:Ljava/lang/Object;

    check-cast v0, Lr/c0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lr/c0$j;->b:Ljava/lang/Object;

    iget-object v6, v0, Lr/c0$j;->a:Ljava/lang/Object;

    check-cast v6, Lr/c0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lr/c0;->j:LTi/a;

    iput-object p0, v0, Lr/c0$j;->a:Ljava/lang/Object;

    iput-object p1, v0, Lr/c0$j;->b:Ljava/lang/Object;

    iput v5, v0, Lr/c0$j;->e:I

    invoke-static {v2, v4, v0, v5, v4}, LTi/a$a;->a(LTi/a;Ljava/lang/Object;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, p0

    :goto_1
    iput-object v6, v0, Lr/c0$j;->a:Ljava/lang/Object;

    iput-object p1, v0, Lr/c0$j;->b:Ljava/lang/Object;

    iput v3, v0, Lr/c0$j;->e:I

    new-instance v2, LIi/p;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v3

    invoke-direct {v2, v3, v5}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v2}, LIi/p;->A()V

    invoke-virtual {v6, v2}, Lr/c0;->T(LIi/n;)V

    invoke-virtual {v6}, Lr/c0;->H()LTi/a;

    move-result-object v3

    invoke-static {v3, v4, v5, v4}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_5

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_5
    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v1, p1

    move-object p1, v2

    move-object v0, v6

    :goto_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, v0, Lr/c0;->l:J

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "targetState while waiting for composition"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final Z(Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lr/c0$k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr/c0$k;

    iget v1, v0, Lr/c0$k;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr/c0$k;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr/c0$k;

    invoke-direct {v0, p0, p1}, Lr/c0$k;-><init>(Lr/c0;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lr/c0$k;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lr/c0$k;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lr/c0$k;->b:Ljava/lang/Object;

    iget-object v0, v0, Lr/c0$k;->a:Ljava/lang/Object;

    check-cast v0, Lr/c0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lr/c0$k;->b:Ljava/lang/Object;

    iget-object v6, v0, Lr/c0$k;->a:Ljava/lang/Object;

    check-cast v6, Lr/c0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lr/c0;->j:LTi/a;

    iput-object p0, v0, Lr/c0$k;->a:Ljava/lang/Object;

    iput-object p1, v0, Lr/c0$k;->b:Ljava/lang/Object;

    iput v5, v0, Lr/c0$k;->e:I

    invoke-static {v2, v4, v0, v5, v4}, LTi/a$a;->a(LTi/a;Ljava/lang/Object;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v6, p0

    :goto_1
    iget-object v2, v6, Lr/c0;->d:Ljava/lang/Object;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p1, v6, Lr/c0;->j:LTi/a;

    invoke-static {p1, v4, v5, v4}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    iput-object v6, v0, Lr/c0$k;->a:Ljava/lang/Object;

    iput-object p1, v0, Lr/c0$k;->b:Ljava/lang/Object;

    iput v3, v0, Lr/c0$k;->e:I

    new-instance v2, LIi/p;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v3

    invoke-direct {v2, v3, v5}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v2}, LIi/p;->A()V

    invoke-virtual {v6, v2}, Lr/c0;->T(LIi/n;)V

    invoke-virtual {v6}, Lr/c0;->H()LTi/a;

    move-result-object v3

    invoke-static {v3, v4, v5, v4}, LTi/a$a;->c(LTi/a;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_6

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_6
    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v1, p1

    move-object p1, v2

    move-object v0, v6

    :goto_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_8
    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, v0, Lr/c0;->l:J

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "snapTo() was canceled because state was changed to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " instead of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic h(Lr/c0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lr/c0;->D(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lr/c0;)V
    .locals 0

    invoke-direct {p0}, Lr/c0;->E()V

    return-void
.end method

.method public static final synthetic j()Lr/c0$a;
    .locals 1

    sget-object v0, Lr/c0;->r:Lr/c0$a;

    return-object v0
.end method

.method public static final synthetic k(Lr/c0;)Lr/c0$b;
    .locals 0

    iget-object p0, p0, Lr/c0;->n:Lr/c0$b;

    return-object p0
.end method

.method public static final synthetic l(Lr/c0;)F
    .locals 0

    iget p0, p0, Lr/c0;->p:F

    return p0
.end method

.method public static final synthetic m(Lr/c0;)Lo/F;
    .locals 0

    iget-object p0, p0, Lr/c0;->m:Lo/F;

    return-object p0
.end method

.method public static final synthetic n(Lr/c0;)J
    .locals 2

    iget-wide v0, p0, Lr/c0;->l:J

    return-wide v0
.end method

.method public static final synthetic o()Lr/m;
    .locals 1

    sget-object v0, Lr/c0;->u:Lr/m;

    return-object v0
.end method

.method public static final synthetic p(Lr/c0;)Lr/o0;
    .locals 0

    iget-object p0, p0, Lr/c0;->e:Lr/o0;

    return-object p0
.end method

.method public static final synthetic q()Lr/m;
    .locals 1

    sget-object v0, Lr/c0;->t:Lr/m;

    return-object v0
.end method

.method public static final synthetic r(Lr/c0;)V
    .locals 0

    invoke-direct {p0}, Lr/c0;->K()V

    return-void
.end method

.method public static final synthetic s(Lr/c0;Lr/c0$b;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr/c0;->N(Lr/c0$b;J)V

    return-void
.end method

.method public static final synthetic t(Lr/c0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lr/c0;->O(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(Lr/c0;)V
    .locals 0

    invoke-direct {p0}, Lr/c0;->R()V

    return-void
.end method

.method public static final synthetic v(Lr/c0;Lr/c0$b;)V
    .locals 0

    iput-object p1, p0, Lr/c0;->n:Lr/c0$b;

    return-void
.end method

.method public static final synthetic w(Lr/c0;F)V
    .locals 0

    invoke-direct {p0, p1}, Lr/c0;->U(F)V

    return-void
.end method

.method public static final synthetic x(Lr/c0;J)V
    .locals 0

    iput-wide p1, p0, Lr/c0;->l:J

    return-void
.end method

.method public static final synthetic y(Lr/c0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lr/c0;->Y(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z(Lr/c0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lr/c0;->Z(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;Lr/H;Ldh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v1, p0, Lr/c0;->e:Lr/o0;

    if-nez v1, :cond_0

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    iget-object v6, p0, Lr/c0;->k:Lr/Z;

    new-instance v7, Lr/c0$d;

    const/4 v5, 0x0

    move-object v0, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lr/c0$d;-><init>(Lr/o0;Lr/c0;Ljava/lang/Object;Lr/H;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v1, 0x0

    move-object v0, v6

    move-object v2, v7

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lr/Z;->e(Lr/Z;Lr/X;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final F()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/c0;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final G()LIi/n;
    .locals 1

    iget-object v0, p0, Lr/c0;->i:LIi/n;

    return-object v0
.end method

.method public final H()LTi/a;
    .locals 1

    iget-object v0, p0, Lr/c0;->j:LTi/a;

    return-object v0
.end method

.method public final I()F
    .locals 1

    iget-object v0, p0, Lr/c0;->h:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final J()J
    .locals 2

    iget-wide v0, p0, Lr/c0;->f:J

    return-wide v0
.end method

.method public final L()V
    .locals 3

    invoke-static {}, Lr/p0;->e()Landroidx/compose/runtime/snapshots/l;

    move-result-object v0

    invoke-static {}, Lr/p0;->a()Lmh/l;

    move-result-object v1

    iget-object v2, p0, Lr/c0;->g:Lmh/a;

    invoke-virtual {v0, p0, v1, v2}, Landroidx/compose/runtime/snapshots/l;->o(Ljava/lang/Object;Lmh/l;Lmh/a;)V

    return-void
.end method

.method public final M()V
    .locals 5

    iget-wide v0, p0, Lr/c0;->f:J

    invoke-virtual {p0}, Lr/c0;->L()V

    iget-wide v2, p0, Lr/c0;->f:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/c0;->n:Lr/c0$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2, v3}, Lr/c0$b;->l(J)V

    invoke-virtual {v0}, Lr/c0$b;->a()Lr/v0;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lr/c0$b;->f()Lr/m;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lr/m;->a(I)F

    move-result v1

    float-to-double v1, v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v1

    iget-wide v1, p0, Lr/c0;->f:J

    long-to-double v1, v1

    mul-double/2addr v3, v1

    invoke-static {v3, v4}, Loh/b;->f(D)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lr/c0$b;->j(J)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lr/c0;->R()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final P(FLjava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 12

    const/4 v0, 0x0

    cmpg-float v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expecting fraction between 0 and 1. Got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr/a0;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v5, p0, Lr/c0;->e:Lr/o0;

    if-nez v5, :cond_2

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v0, p0, Lr/c0;->k:Lr/Z;

    new-instance v8, Lr/c0$h;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p2

    move-object v4, p0

    move v6, p1

    invoke-direct/range {v1 .. v7}, Lr/c0$h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr/c0;Lr/o0;FLdh/e;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, v0

    move-object v9, p3

    invoke-static/range {v6 .. v11}, Lr/Z;->e(Lr/Z;Lr/X;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final S(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lr/c0;->d:Ljava/lang/Object;

    return-void
.end method

.method public final T(LIi/n;)V
    .locals 0

    iput-object p1, p0, Lr/c0;->i:LIi/n;

    return-void
.end method

.method public V(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/c0;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final W(J)V
    .locals 0

    iput-wide p1, p0, Lr/c0;->f:J

    return-void
.end method

.method public final X(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lr/c0;->e:Lr/o0;

    if-nez v0, :cond_0

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    iget-object v1, p0, Lr/c0;->k:Lr/Z;

    new-instance v2, Lr/c0$i;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, Lr/c0$i;-><init>(Lr/c0;Ljava/lang/Object;Lr/o0;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 p1, 0x0

    move-object v0, v1

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lr/Z;->e(Lr/Z;Lr/X;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/c0;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/c0;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/c0;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public f(Lr/o0;)V
    .locals 2

    iget-object v0, p0, Lr/c0;->e:Lr/o0;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr/c0;->e:Lr/o0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new instance: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr/a0;->b(Ljava/lang/String;)V

    :cond_2
    iput-object p1, p0, Lr/c0;->e:Lr/o0;

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lr/c0;->e:Lr/o0;

    invoke-static {}, Lr/p0;->e()Landroidx/compose/runtime/snapshots/l;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/l;->k(Ljava/lang/Object;)V

    return-void
.end method
