.class public final LP/a;
.super LP/o;
.source "SourceFile"

# interfaces
.implements LT/S0;
.implements LP/k;


# instance fields
.field private final c:Z

.field private final d:F

.field private final e:LT/z1;

.field private final f:LT/z1;

.field private final g:Landroid/view/ViewGroup;

.field private h:LP/j;

.field private final i:LT/q0;

.field private final j:LT/q0;

.field private k:J

.field private l:I

.field private final m:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ZFLT/z1;LT/z1;Landroid/view/ViewGroup;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p4}, LP/o;-><init>(ZLT/z1;)V

    .line 3
    iput-boolean p1, p0, LP/a;->c:Z

    .line 4
    iput p2, p0, LP/a;->d:F

    .line 5
    iput-object p3, p0, LP/a;->e:LT/z1;

    .line 6
    iput-object p4, p0, LP/a;->f:LT/z1;

    .line 7
    iput-object p5, p0, LP/a;->g:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 8
    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, LP/a;->i:LT/q0;

    .line 9
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LP/a;->j:LT/q0;

    .line 10
    sget-object p1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p1}, Ll0/m$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LP/a;->k:J

    const/4 p1, -0x1

    .line 11
    iput p1, p0, LP/a;->l:I

    .line 12
    new-instance p1, LP/a$a;

    invoke-direct {p1, p0}, LP/a$a;-><init>(LP/a;)V

    iput-object p1, p0, LP/a;->m:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(ZFLT/z1;LT/z1;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LP/a;-><init>(ZFLT/z1;LT/z1;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static final synthetic i(LP/a;)Z
    .locals 0

    invoke-direct {p0}, LP/a;->l()Z

    move-result p0

    return p0
.end method

.method public static final synthetic j(LP/a;Z)V
    .locals 0

    invoke-direct {p0, p1}, LP/a;->o(Z)V

    return-void
.end method

.method private final k()V
    .locals 1

    iget-object v0, p0, LP/a;->h:LP/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, LP/j;->a(LP/k;)V

    :cond_0
    return-void
.end method

.method private final l()Z
    .locals 1

    iget-object v0, p0, LP/a;->j:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final m()LP/j;
    .locals 1

    iget-object v0, p0, LP/a;->h:LP/j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget-object v0, p0, LP/a;->g:Landroid/view/ViewGroup;

    invoke-static {v0}, LP/t;->a(Landroid/view/ViewGroup;)LP/j;

    move-result-object v0

    iput-object v0, p0, LP/a;->h:LP/j;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final n()LP/n;
    .locals 1

    iget-object v0, p0, LP/a;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/n;

    return-object v0
.end method

.method private final o(Z)V
    .locals 1

    iget-object v0, p0, LP/a;->j:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final p(LP/n;)V
    .locals 1

    iget-object v0, p0, LP/a;->i:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public E0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LP/a;->p(LP/n;)V

    return-void
.end method

.method public a(Lo0/c;)V
    .locals 8

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, LP/a;->k:J

    iget v0, p0, LP/a;->d:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LP/a;->c:Z

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, LP/i;->a(LY0/d;ZJ)F

    move-result v0

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, LP/a;->d:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result v0

    :goto_0
    iput v0, p0, LP/a;->l:I

    iget-object v0, p0, LP/a;->e:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v4

    iget-object v0, p0, LP/a;->f:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/g;

    invoke-virtual {v0}, LP/g;->d()F

    move-result v6

    invoke-interface {p1}, Lo0/c;->X1()V

    iget v0, p0, LP/a;->d:F

    invoke-virtual {p0, p1, v0, v4, v5}, LP/o;->f(Lo0/f;FJ)V

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-direct {p0}, LP/a;->l()Z

    invoke-direct {p0}, LP/a;->n()LP/n;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v2

    move-object v1, v7

    invoke-virtual/range {v1 .. v6}, LP/n;->f(JJF)V

    invoke-static {v0}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v7, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, LP/a;->k()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, LP/a;->k()V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Ly/o$b;LIi/N;)V
    .locals 10

    invoke-direct {p0}, LP/a;->m()LP/j;

    move-result-object p2

    invoke-virtual {p2, p0}, LP/j;->b(LP/k;)LP/n;

    move-result-object p2

    iget-boolean v2, p0, LP/a;->c:Z

    iget-wide v3, p0, LP/a;->k:J

    iget v5, p0, LP/a;->l:I

    iget-object v0, p0, LP/a;->e:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v6

    iget-object v0, p0, LP/a;->f:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/g;

    invoke-virtual {v0}, LP/g;->d()F

    move-result v8

    iget-object v9, p0, LP/a;->m:Lmh/a;

    move-object v0, p2

    move-object v1, p1

    invoke-virtual/range {v0 .. v9}, LP/n;->b(Ly/o$b;ZJIJFLmh/a;)V

    invoke-direct {p0, p2}, LP/a;->p(LP/n;)V

    return-void
.end method

.method public g(Ly/o$b;)V
    .locals 0

    invoke-direct {p0}, LP/a;->n()LP/n;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LP/n;->e()V

    :cond_0
    return-void
.end method
