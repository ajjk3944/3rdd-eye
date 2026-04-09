.class public final LN/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/b$a;
    }
.end annotation


# static fields
.field public static final p:LN/b$a;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lmh/a;

.field private final c:Lr/i;

.field private final d:Lmh/l;

.field private final e:LN/d0;

.field private final f:Lw/m;

.field private final g:LT/q0;

.field private final h:LT/z1;

.field private final i:LT/z1;

.field private final j:LT/m0;

.field private final k:LT/z1;

.field private final l:LT/m0;

.field private final m:LT/q0;

.field private final n:LT/q0;

.field private final o:LN/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/b;->p:LN/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LN/b;->a:Lmh/l;

    iput-object p3, p0, LN/b;->b:Lmh/a;

    iput-object p4, p0, LN/b;->c:Lr/i;

    iput-object p5, p0, LN/b;->d:Lmh/l;

    new-instance p2, LN/d0;

    invoke-direct {p2}, LN/d0;-><init>()V

    iput-object p2, p0, LN/b;->e:LN/d0;

    new-instance p2, LN/b$h;

    invoke-direct {p2, p0}, LN/b$h;-><init>(LN/b;)V

    iput-object p2, p0, LN/b;->f:Lw/m;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/b;->g:LT/q0;

    new-instance p1, LN/b$j;

    invoke-direct {p1, p0}, LN/b$j;-><init>(LN/b;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LN/b;->h:LT/z1;

    new-instance p1, LN/b$g;

    invoke-direct {p1, p0}, LN/b$g;-><init>(LN/b;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LN/b;->i:LT/z1;

    const/high16 p1, 0x7fc00000    # Float.NaN

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LN/b;->j:LT/m0;

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p1

    new-instance p4, LN/b$i;

    invoke-direct {p4, p0}, LN/b$i;-><init>(LN/b;)V

    invoke-static {p1, p4}, LT/o1;->d(LT/n1;Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LN/b;->k:LT/z1;

    const/4 p1, 0x0

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LN/b;->l:LT/m0;

    invoke-static {p2, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/b;->m:LT/q0;

    invoke-static {}, Landroidx/compose/material/a;->b()Landroidx/compose/material/c;

    move-result-object p1

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/b;->n:LT/q0;

    new-instance p1, LN/b$f;

    invoke-direct {p1, p0}, LN/b$f;-><init>(LN/b;)V

    iput-object p1, p0, LN/b;->o:LN/a;

    return-void
.end method

.method private final B(LN/D;)V
    .locals 1

    iget-object v0, p0, LN/b;->n:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final C(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LN/b;->g:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final D(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LN/b;->m:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final E(F)V
    .locals 1

    iget-object v0, p0, LN/b;->l:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final F(F)V
    .locals 1

    iget-object v0, p0, LN/b;->j:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method private final H(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, LN/b;->e:LN/d0;

    new-instance v1, LN/b$k;

    invoke-direct {v1, p0, p1}, LN/b$k;-><init>(LN/b;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LN/d0;->e(Lmh/a;)Z

    move-result p1

    return p1
.end method

.method public static synthetic J(LN/b;LN/D;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, LN/b;->w()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, LN/b;->w()F

    move-result p2

    invoke-interface {p1, p2}, LN/D;->d(F)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, LN/b;->x()Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/b;->x()Ljava/lang/Object;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, LN/b;->I(LN/D;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a(LN/b;FLjava/lang/Object;F)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LN/b;->l(FLjava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LN/b;FLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LN/b;->m(FLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LN/b;)LN/a;
    .locals 0

    iget-object p0, p0, LN/b;->o:LN/a;

    return-object p0
.end method

.method public static final synthetic d(LN/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LN/b;->t()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LN/b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, LN/b;->C(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic f(LN/b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, LN/b;->D(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic g(LN/b;F)V
    .locals 0

    invoke-direct {p0, p1}, LN/b;->E(F)V

    return-void
.end method

.method public static final synthetic h(LN/b;F)V
    .locals 0

    invoke-direct {p0, p1}, LN/b;->F(F)V

    return-void
.end method

.method public static synthetic k(LN/b;Ljava/lang/Object;Ls/L;Lmh/r;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Ls/L;->Default:Ls/L;

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LN/b;->i(Ljava/lang/Object;Ls/L;Lmh/r;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final l(FLjava/lang/Object;F)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, LN/b;->o()LN/D;

    move-result-object v0

    invoke-interface {v0, p2}, LN/D;->e(Ljava/lang/Object;)F

    move-result v1

    iget-object v2, p0, LN/b;->b:Lmh/a;

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpg-float v3, v1, p1

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_0

    :cond_1
    if-gez v3, :cond_4

    cmpl-float p3, p3, v2

    const/4 v2, 0x1

    if-ltz p3, :cond_2

    invoke-interface {v0, p1, v2}, LN/D;->c(FZ)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_2
    invoke-interface {v0, p1, v2}, LN/D;->c(FZ)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p3}, LN/D;->e(Ljava/lang/Object;)F

    move-result v0

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v2, p0, LN/b;->a:Lmh/l;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    add-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_3

    goto :goto_0

    :cond_3
    move-object p2, p3

    goto :goto_0

    :cond_4
    neg-float v2, v2

    cmpg-float p3, p3, v2

    const/4 v2, 0x0

    if-gtz p3, :cond_5

    invoke-interface {v0, p1, v2}, LN/D;->c(FZ)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-interface {v0, p1, v2}, LN/D;->c(FZ)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, p3}, LN/D;->e(Ljava/lang/Object;)F

    move-result v0

    sub-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v2, p0, LN/b;->a:Lmh/l;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    if-gez v1, :cond_6

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, v0

    if-gez p1, :cond_3

    goto :goto_0

    :cond_6
    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    :goto_0
    return-object p2
.end method

.method private final m(FLjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LN/b;->o()LN/D;

    move-result-object v0

    invoke-interface {v0, p2}, LN/D;->e(Ljava/lang/Object;)F

    move-result v1

    cmpg-float v2, v1, p1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    if-gez v2, :cond_3

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, LN/D;->c(FZ)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, p1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, LN/D;->c(FZ)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    :goto_0
    return-object p2
.end method

.method private final t()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN/b;->m:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A()F
    .locals 2

    invoke-virtual {p0}, LN/b;->w()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN/b;->w()F

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final G(FLdh/e;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LN/b;->A()F

    move-result v1

    invoke-direct {p0, v1, v0, p1}, LN/b;->l(FLjava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LN/b;->d:Lmh/l;

    invoke-interface {v2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0, v1, p1, p2}, Landroidx/compose/material/a;->f(LN/b;Ljava/lang/Object;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    invoke-static {p0, v0, p1, p2}, Landroidx/compose/material/a;->f(LN/b;Ljava/lang/Object;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final I(LN/D;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LN/b;->o()LN/D;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, LN/b;->B(LN/D;)V

    invoke-direct {p0, p2}, LN/b;->H(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, LN/b;->D(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/Object;Ls/L;Lmh/r;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, LN/b$d;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LN/b$d;

    iget v1, v0, LN/b$d;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/b$d;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/b$d;

    invoke-direct {v0, p0, p4}, LN/b$d;-><init>(LN/b;Ldh/e;)V

    :goto_0
    iget-object p4, v0, LN/b$d;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/b$d;->d:I

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LN/b$d;->a:Ljava/lang/Object;

    check-cast p1, LN/b;

    :try_start_0
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LN/b;->o()LN/D;

    move-result-object p4

    invoke-interface {p4, p1}, LN/D;->f(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_5

    :try_start_1
    iget-object p4, p0, LN/b;->e:LN/d0;

    new-instance v2, LN/b$e;

    invoke-direct {v2, p0, p1, p3, v5}, LN/b$e;-><init>(LN/b;Ljava/lang/Object;Lmh/r;Ldh/e;)V

    iput-object p0, v0, LN/b$d;->a:Ljava/lang/Object;

    iput v4, v0, LN/b$d;->d:I

    invoke-virtual {p4, p2, v2, v0}, LN/d0;->d(Ls/L;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-direct {p1, v5}, LN/b;->D(Ljava/lang/Object;)V

    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object p2

    invoke-virtual {p1}, LN/b;->w()F

    move-result p3

    invoke-interface {p2, p3}, LN/D;->d(F)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, LN/b;->w()F

    move-result p3

    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object p4

    invoke-interface {p4, p2}, LN/D;->e(Ljava/lang/Object;)F

    move-result p4

    sub-float/2addr p3, p4

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, p3, v3

    if-gtz p3, :cond_6

    iget-object p3, p1, LN/b;->d:Lmh/l;

    invoke-interface {p3, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-direct {p1, p2}, LN/b;->C(Ljava/lang/Object;)V

    goto :goto_3

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    invoke-direct {p1, v5}, LN/b;->D(Ljava/lang/Object;)V

    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object p3

    invoke-virtual {p1}, LN/b;->w()F

    move-result p4

    invoke-interface {p3, p4}, LN/D;->d(F)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {p1}, LN/b;->w()F

    move-result p4

    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object v0

    invoke-interface {v0, p3}, LN/D;->e(Ljava/lang/Object;)F

    move-result v0

    sub-float/2addr p4, v0

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p4

    cmpg-float p4, p4, v3

    if-gtz p4, :cond_4

    iget-object p4, p1, LN/b;->d:Lmh/l;

    invoke-interface {p4, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-direct {p1, p3}, LN/b;->C(Ljava/lang/Object;)V

    :cond_4
    throw p2

    :cond_5
    invoke-direct {p0, p1}, LN/b;->C(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final j(Ls/L;Lmh/q;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, LN/b$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LN/b$b;

    iget v1, v0, LN/b$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/b$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/b$b;

    invoke-direct {v0, p0, p3}, LN/b$b;-><init>(LN/b;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LN/b$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/b$b;->d:I

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, LN/b$b;->a:Ljava/lang/Object;

    check-cast p1, LN/b;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, LN/b;->e:LN/d0;

    new-instance v2, LN/b$c;

    const/4 v5, 0x0

    invoke-direct {v2, p0, p2, v5}, LN/b$c;-><init>(LN/b;Lmh/q;Ldh/e;)V

    iput-object p0, v0, LN/b$b;->a:Ljava/lang/Object;

    iput v4, v0, LN/b$b;->d:I

    invoke-virtual {p3, p1, v2, v0}, LN/d0;->d(Ls/L;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object p2

    invoke-virtual {p1}, LN/b;->w()F

    move-result p3

    invoke-interface {p2, p3}, LN/D;->d(F)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, LN/b;->w()F

    move-result p3

    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object v0

    invoke-interface {v0, p2}, LN/D;->e(Ljava/lang/Object;)F

    move-result v0

    sub-float/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, p3, v3

    if-gtz p3, :cond_4

    iget-object p3, p1, LN/b;->d:Lmh/l;

    invoke-interface {p3, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-direct {p1, p2}, LN/b;->C(Ljava/lang/Object;)V

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object p3

    invoke-virtual {p1}, LN/b;->w()F

    move-result v0

    invoke-interface {p3, v0}, LN/D;->d(F)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p1}, LN/b;->w()F

    move-result v0

    invoke-virtual {p1}, LN/b;->o()LN/D;

    move-result-object v1

    invoke-interface {v1, p3}, LN/D;->e(Ljava/lang/Object;)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_5

    iget-object v0, p1, LN/b;->d:Lmh/l;

    invoke-interface {v0, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p1, p3}, LN/b;->C(Ljava/lang/Object;)V

    :cond_5
    throw p2
.end method

.method public final n(F)F
    .locals 1

    invoke-virtual {p0, p1}, LN/b;->z(F)F

    move-result p1

    invoke-virtual {p0}, LN/b;->w()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/b;->w()F

    move-result v0

    :goto_0
    invoke-direct {p0, p1}, LN/b;->F(F)V

    sub-float/2addr p1, v0

    return p1
.end method

.method public final o()LN/D;
    .locals 1

    iget-object v0, p0, LN/b;->n:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/D;

    return-object v0
.end method

.method public final p()Lr/i;
    .locals 1

    iget-object v0, p0, LN/b;->c:Lr/i;

    return-object v0
.end method

.method public final q()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN/b;->i:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lmh/l;
    .locals 1

    iget-object v0, p0, LN/b;->d:Lmh/l;

    return-object v0
.end method

.method public final s()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN/b;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lw/m;
    .locals 1

    iget-object v0, p0, LN/b;->f:Lw/m;

    return-object v0
.end method

.method public final v()F
    .locals 1

    iget-object v0, p0, LN/b;->l:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final w()F
    .locals 1

    iget-object v0, p0, LN/b;->j:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final x()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN/b;->h:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final y()Z
    .locals 1

    invoke-direct {p0}, LN/b;->t()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final z(F)F
    .locals 2

    invoke-virtual {p0}, LN/b;->w()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LN/b;->w()F

    move-result v0

    :goto_0
    add-float/2addr v0, p1

    invoke-virtual {p0}, LN/b;->o()LN/D;

    move-result-object p1

    invoke-interface {p1}, LN/D;->b()F

    move-result p1

    invoke-virtual {p0}, LN/b;->o()LN/D;

    move-result-object v1

    invoke-interface {v1}, LN/D;->g()F

    move-result v1

    invoke-static {v0, p1, v1}, Lsh/m;->j(FFF)F

    move-result p1

    return p1
.end method
