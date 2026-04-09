.class public final LO/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:I = 0x8


# instance fields
.field private final a:LIi/N;

.field private final b:LT/z1;

.field private final c:LT/z1;

.field private final d:LT/q0;

.field private final e:LT/m0;

.field private final f:LT/m0;

.field private final g:LT/m0;

.field private final h:LT/m0;

.field private final i:Ls/M;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LIi/N;LT/z1;FF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO/g;->a:LIi/N;

    iput-object p2, p0, LO/g;->b:LT/z1;

    new-instance p1, LO/g$a;

    invoke-direct {p1, p0}, LO/g$a;-><init>(LO/g;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LO/g;->c:LT/z1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LO/g;->d:LT/q0;

    const/4 p1, 0x0

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p2

    iput-object p2, p0, LO/g;->e:LT/m0;

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LO/g;->f:LT/m0;

    invoke-static {p4}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LO/g;->g:LT/m0;

    invoke-static {p3}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LO/g;->h:LT/m0;

    new-instance p1, Ls/M;

    invoke-direct {p1}, Ls/M;-><init>()V

    iput-object p1, p0, LO/g;->i:Ls/M;

    return-void
.end method

.method public static final synthetic a(LO/g;)F
    .locals 0

    invoke-direct {p0}, LO/g;->h()F

    move-result p0

    return p0
.end method

.method public static final synthetic b(LO/g;)Ls/M;
    .locals 0

    iget-object p0, p0, LO/g;->i:Ls/M;

    return-object p0
.end method

.method public static final synthetic c(LO/g;)F
    .locals 0

    invoke-direct {p0}, LO/g;->m()F

    move-result p0

    return p0
.end method

.method public static final synthetic d(LO/g;F)V
    .locals 0

    invoke-direct {p0, p1}, LO/g;->w(F)V

    return-void
.end method

.method private final e(F)LIi/y0;
    .locals 6

    iget-object v0, p0, LO/g;->a:LIi/N;

    new-instance v3, LO/g$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, v1}, LO/g$b;-><init>(LO/g;FLdh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    return-object p1
.end method

.method private final f()F
    .locals 5

    invoke-direct {p0}, LO/g;->g()F

    move-result v0

    invoke-virtual {p0}, LO/g;->l()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-direct {p0}, LO/g;->g()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LO/g;->j()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-gez v2, :cond_1

    move v0, v1

    :cond_1
    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v2, v0, v1

    if-lez v2, :cond_2

    move v0, v1

    :cond_2
    float-to-double v1, v0

    const/4 v3, 0x2

    int-to-double v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    invoke-virtual {p0}, LO/g;->l()F

    move-result v1

    mul-float/2addr v1, v0

    invoke-virtual {p0}, LO/g;->l()F

    move-result v0

    add-float/2addr v0, v1

    :goto_0
    return v0
.end method

.method private final g()F
    .locals 1

    iget-object v0, p0, LO/g;->c:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method private final h()F
    .locals 1

    iget-object v0, p0, LO/g;->f:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method private final m()F
    .locals 1

    iget-object v0, p0, LO/g;->e:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method private final n()Z
    .locals 1

    iget-object v0, p0, LO/g;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final o()F
    .locals 1

    iget-object v0, p0, LO/g;->h:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method private final p()F
    .locals 1

    iget-object v0, p0, LO/g;->g:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method private final s(F)V
    .locals 1

    iget-object v0, p0, LO/g;->f:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final w(F)V
    .locals 1

    iget-object v0, p0, LO/g;->e:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final x(Z)V
    .locals 1

    iget-object v0, p0, LO/g;->d:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final y(F)V
    .locals 1

    iget-object v0, p0, LO/g;->h:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final z(F)V
    .locals 1

    iget-object v0, p0, LO/g;->g:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method


# virtual methods
.method public final i()F
    .locals 1

    invoke-direct {p0}, LO/g;->m()F

    move-result v0

    return v0
.end method

.method public final j()F
    .locals 2

    invoke-direct {p0}, LO/g;->g()F

    move-result v0

    invoke-virtual {p0}, LO/g;->l()F

    move-result v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final k()Z
    .locals 1

    invoke-direct {p0}, LO/g;->n()Z

    move-result v0

    return v0
.end method

.method public final l()F
    .locals 1

    invoke-direct {p0}, LO/g;->p()F

    move-result v0

    return v0
.end method

.method public final q(F)F
    .locals 2

    invoke-direct {p0}, LO/g;->n()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, LO/g;->h()F

    move-result v0

    add-float/2addr v0, p1

    invoke-static {v0, v1}, Lsh/m;->c(FF)F

    move-result p1

    invoke-direct {p0}, LO/g;->h()F

    move-result v0

    sub-float v0, p1, v0

    invoke-direct {p0, p1}, LO/g;->s(F)V

    invoke-direct {p0}, LO/g;->f()F

    move-result p1

    invoke-direct {p0, p1}, LO/g;->w(F)V

    return v0
.end method

.method public final r(F)F
    .locals 3

    invoke-virtual {p0}, LO/g;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, LO/g;->g()F

    move-result v0

    invoke-virtual {p0}, LO/g;->l()F

    move-result v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, LO/g;->b:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_1
    invoke-direct {p0, v1}, LO/g;->e(F)LIi/y0;

    invoke-direct {p0}, LO/g;->h()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    :goto_0
    move p1, v1

    goto :goto_1

    :cond_2
    cmpg-float v0, p1, v1

    if-gez v0, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    invoke-direct {p0, v1}, LO/g;->s(F)V

    return p1
.end method

.method public final t(Z)V
    .locals 1

    invoke-direct {p0}, LO/g;->n()Z

    move-result v0

    if-eq v0, p1, :cond_1

    invoke-direct {p0, p1}, LO/g;->x(Z)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LO/g;->s(F)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, LO/g;->o()F

    move-result v0

    :cond_0
    invoke-direct {p0, v0}, LO/g;->e(F)LIi/y0;

    :cond_1
    return-void
.end method

.method public final u(F)V
    .locals 1

    invoke-direct {p0}, LO/g;->o()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LO/g;->y(F)V

    invoke-virtual {p0}, LO/g;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, LO/g;->e(F)LIi/y0;

    :cond_1
    :goto_0
    return-void
.end method

.method public final v(F)V
    .locals 0

    invoke-direct {p0, p1}, LO/g;->z(F)V

    return-void
.end method
