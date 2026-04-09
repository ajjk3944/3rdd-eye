.class public final Lw/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lw/y;

.field private b:Ls/S;

.field private c:Lw/n;

.field private d:Lw/q;

.field private e:Z

.field private f:Lx0/b;

.field private g:I

.field private h:Lw/v;

.field private final i:Lw/A$c;

.field private final j:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lw/y;Ls/S;Lw/n;Lw/q;ZLx0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/A;->a:Lw/y;

    iput-object p2, p0, Lw/A;->b:Ls/S;

    iput-object p3, p0, Lw/A;->c:Lw/n;

    iput-object p4, p0, Lw/A;->d:Lw/q;

    iput-boolean p5, p0, Lw/A;->e:Z

    iput-object p6, p0, Lw/A;->f:Lx0/b;

    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->b()I

    move-result p1

    iput p1, p0, Lw/A;->g:I

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->b()Lw/v;

    move-result-object p1

    iput-object p1, p0, Lw/A;->h:Lw/v;

    new-instance p1, Lw/A$c;

    invoke-direct {p1, p0}, Lw/A$c;-><init>(Lw/A;)V

    iput-object p1, p0, Lw/A;->i:Lw/A$c;

    new-instance p1, Lw/A$e;

    invoke-direct {p1, p0}, Lw/A$e;-><init>(Lw/A;)V

    iput-object p1, p0, Lw/A;->j:Lmh/l;

    return-void
.end method

.method private final D(JF)J
    .locals 8

    iget-object v0, p0, Lw/A;->d:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-wide v2, p1

    move v4, p3

    invoke-static/range {v2 .. v7}, LY0/y;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-wide v0, p1

    move v3, p3

    invoke-static/range {v0 .. v5}, LY0/y;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public static final synthetic a(Lw/A;)Lw/n;
    .locals 0

    iget-object p0, p0, Lw/A;->c:Lw/n;

    return-object p0
.end method

.method public static final synthetic b(Lw/A;)I
    .locals 0

    iget p0, p0, Lw/A;->g:I

    return p0
.end method

.method public static final synthetic c(Lw/A;)Lx0/b;
    .locals 0

    iget-object p0, p0, Lw/A;->f:Lx0/b;

    return-object p0
.end method

.method public static final synthetic d(Lw/A;)Lw/A$c;
    .locals 0

    iget-object p0, p0, Lw/A;->i:Lw/A$c;

    return-object p0
.end method

.method public static final synthetic e(Lw/A;)Lw/v;
    .locals 0

    iget-object p0, p0, Lw/A;->h:Lw/v;

    return-object p0
.end method

.method public static final synthetic f(Lw/A;)Ls/S;
    .locals 0

    iget-object p0, p0, Lw/A;->b:Ls/S;

    return-object p0
.end method

.method public static final synthetic g(Lw/A;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lw/A;->j:Lmh/l;

    return-object p0
.end method

.method public static final synthetic h(Lw/A;)Z
    .locals 0

    invoke-direct {p0}, Lw/A;->o()Z

    move-result p0

    return p0
.end method

.method public static final synthetic i(Lw/A;Lw/v;JI)J
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lw/A;->s(Lw/v;JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic j(Lw/A;I)V
    .locals 0

    iput p1, p0, Lw/A;->g:I

    return-void
.end method

.method public static final synthetic k(Lw/A;Lw/v;)V
    .locals 0

    iput-object p1, p0, Lw/A;->h:Lw/v;

    return-void
.end method

.method public static final synthetic l(Lw/A;J)F
    .locals 0

    invoke-direct {p0, p1, p2}, Lw/A;->z(J)F

    move-result p0

    return p0
.end method

.method public static final synthetic m(Lw/A;JF)J
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw/A;->D(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method private final o()Z
    .locals 1

    iget-object v0, p0, Lw/A;->a:Lw/y;

    invoke-interface {v0}, Lw/y;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw/A;->a:Lw/y;

    invoke-interface {v0}, Lw/y;->d()Z

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
    return v0
.end method

.method private final s(Lw/v;JI)J
    .locals 10

    iget-object v0, p0, Lw/A;->f:Lx0/b;

    invoke-virtual {v0, p2, p3, p4}, Lx0/b;->d(JI)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ll0/g;->q(JJ)J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Lw/A;->x(J)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lw/A;->u(J)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lw/A;->A(J)F

    move-result v2

    invoke-interface {p1, v2}, Lw/v;->a(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lw/A;->B(F)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lw/A;->u(J)J

    move-result-wide v2

    invoke-static {p2, p3, v2, v3}, Ll0/g;->q(JJ)J

    move-result-wide v7

    iget-object v4, p0, Lw/A;->f:Lx0/b;

    move-wide v5, v2

    move v9, p4

    invoke-virtual/range {v4 .. v9}, Lx0/b;->b(JJI)J

    move-result-wide p1

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide p3

    invoke-static {p3, p4, p1, p2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private final y(J)J
    .locals 8

    iget-object v0, p0, Lw/A;->d:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v2, p1

    invoke-static/range {v2 .. v7}, LY0/y;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, LY0/y;->e(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method private final z(J)F
    .locals 2

    iget-object v0, p0, Lw/A;->d:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LY0/y;->h(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LY0/y;->i(J)F

    move-result p1

    :goto_0
    return p1
.end method


# virtual methods
.method public final A(J)F
    .locals 2

    iget-object v0, p0, Lw/A;->d:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method public final B(F)J
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lw/A;->d:Lw/q;

    sget-object v2, Lw/q;->Horizontal:Lw/q;

    if-ne v1, v2, :cond_1

    invoke-static {p1, v0}, Ll0/h;->a(FF)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final C(Lw/y;Lw/q;Ls/S;ZLw/n;Lx0/b;)Z
    .locals 2

    iget-object v0, p0, Lw/A;->a:Lw/y;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lw/A;->a:Lw/y;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p3, p0, Lw/A;->b:Ls/S;

    iget-object p3, p0, Lw/A;->d:Lw/q;

    if-eq p3, p2, :cond_1

    iput-object p2, p0, Lw/A;->d:Lw/q;

    move p1, v1

    :cond_1
    iget-boolean p2, p0, Lw/A;->e:Z

    if-eq p2, p4, :cond_2

    iput-boolean p4, p0, Lw/A;->e:Z

    goto :goto_1

    :cond_2
    move v1, p1

    :goto_1
    iput-object p5, p0, Lw/A;->c:Lw/n;

    iput-object p6, p0, Lw/A;->f:Lx0/b;

    return v1
.end method

.method public final n(JLdh/e;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lw/A$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lw/A$a;

    iget v1, v0, Lw/A$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/A$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/A$a;

    invoke-direct {v0, p0, p3}, Lw/A$a;-><init>(Lw/A;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lw/A$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/A$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lw/A$a;->a:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/M;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p3, Lkotlin/jvm/internal/M;

    invoke-direct {p3}, Lkotlin/jvm/internal/M;-><init>()V

    iput-wide p1, p3, Lkotlin/jvm/internal/M;->a:J

    sget-object v2, Ls/L;->Default:Ls/L;

    new-instance v10, Lw/A$b;

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, p0

    move-object v6, p3

    move-wide v7, p1

    invoke-direct/range {v4 .. v9}, Lw/A$b;-><init>(Lw/A;Lkotlin/jvm/internal/M;JLdh/e;)V

    iput-object p3, v0, Lw/A$a;->a:Ljava/lang/Object;

    iput v3, v0, Lw/A$a;->d:I

    invoke-virtual {p0, v2, v10, v0}, Lw/A;->v(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p3

    :goto_1
    iget-wide p1, p1, Lkotlin/jvm/internal/M;->a:J

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method

.method public final p()Z
    .locals 2

    iget-object v0, p0, Lw/A;->d:Lw/q;

    sget-object v1, Lw/q;->Vertical:Lw/q;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q(JLdh/e;)Ljava/lang/Object;
    .locals 3

    invoke-direct {p0, p1, p2}, Lw/A;->y(J)J

    move-result-wide p1

    new-instance v0, Lw/A$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw/A$d;-><init>(Lw/A;Ldh/e;)V

    iget-object v1, p0, Lw/A;->b:Ls/S;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lw/A;->o()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1, p1, p2, v0, p3}, Ls/S;->a(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final r(J)J
    .locals 1

    iget-object v0, p0, Lw/A;->a:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw/A;->a:Lw/y;

    invoke-virtual {p0, p1, p2}, Lw/A;->A(J)F

    move-result p1

    invoke-virtual {p0, p1}, Lw/A;->t(F)F

    move-result p1

    invoke-interface {v0, p1}, Lw/y;->f(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lw/A;->t(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lw/A;->B(F)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final t(F)F
    .locals 1

    iget-boolean v0, p0, Lw/A;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr p1, v0

    :cond_0
    return p1
.end method

.method public final u(J)J
    .locals 1

    iget-boolean v0, p0, Lw/A;->e:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p1, p2, v0}, Ll0/g;->s(JF)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final v(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lw/A;->a:Lw/y;

    new-instance v1, Lw/A$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, v2}, Lw/A$f;-><init>(Lw/A;Lmh/p;Ldh/e;)V

    invoke-interface {v0, p1, v1, p3}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final w()Z
    .locals 2

    iget-object v0, p0, Lw/A;->a:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lw/A;->b:Ls/S;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls/S;->d()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final x(J)J
    .locals 8

    iget-object v0, p0, Lw/A;->d:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v2, p1

    invoke-static/range {v2 .. v7}, Ll0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Ll0/g;->g(JFFILjava/lang/Object;)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method
