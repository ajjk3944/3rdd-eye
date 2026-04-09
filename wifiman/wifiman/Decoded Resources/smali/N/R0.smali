.class public LN/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/R0$a;
    }
.end annotation


# static fields
.field public static final q:LN/R0$a;


# instance fields
.field private final a:Lr/i;

.field private final b:Lmh/l;

.field private final c:LT/q0;

.field private final d:LT/q0;

.field private final e:LT/m0;

.field private final f:LT/m0;

.field private final g:LT/m0;

.field private final h:LT/q0;

.field private final i:LT/q0;

.field private final j:LLi/g;

.field private k:F

.field private l:F

.field private final m:LT/q0;

.field private final n:LT/m0;

.field private final o:LT/q0;

.field private final p:Lw/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/R0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/R0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/R0;->q:LN/R0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lr/i;Lmh/l;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LN/R0;->a:Lr/i;

    iput-object p3, p0, LN/R0;->b:Lmh/l;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/R0;->c:LT/q0;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/R0;->d:LT/q0;

    const/4 p1, 0x0

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object v0

    iput-object v0, p0, LN/R0;->e:LT/m0;

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object v0

    iput-object v0, p0, LN/R0;->f:LT/m0;

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object v0

    iput-object v0, p0, LN/R0;->g:LT/m0;

    invoke-static {p2, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LN/R0;->h:LT/q0;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LN/R0;->i:LT/q0;

    new-instance v0, LN/R0$e;

    invoke-direct {v0, p0}, LN/R0$e;-><init>(LN/R0;)V

    invoke-static {v0}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v0

    new-instance v1, LN/R0$i;

    invoke-direct {v1, v0}, LN/R0$i;-><init>(LLi/g;)V

    const/4 v0, 0x1

    invoke-static {v1, v0}, LLi/i;->N(LLi/g;I)LLi/g;

    move-result-object v0

    iput-object v0, p0, LN/R0;->j:LLi/g;

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    iput v0, p0, LN/R0;->k:F

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    iput v0, p0, LN/R0;->l:F

    sget-object v0, LN/R0$j;->a:LN/R0$j;

    invoke-static {v0, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LN/R0;->m:LT/q0;

    invoke-static {p1}, LT/C0;->a(F)LT/m0;

    move-result-object p1

    iput-object p1, p0, LN/R0;->n:LT/m0;

    invoke-static {p2, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LN/R0;->o:LT/q0;

    new-instance p1, LN/R0$d;

    invoke-direct {p1, p0}, LN/R0$d;-><init>(LN/R0;)V

    invoke-static {p1}, Lw/l;->a(Lmh/l;)Lw/m;

    move-result-object p1

    iput-object p1, p0, LN/R0;->p:Lw/m;

    return-void
.end method

.method private final B(Z)V
    .locals 1

    iget-object v0, p0, LN/R0;->d:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final C(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LN/R0;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final G(FLdh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LN/R0;->p:Lw/m;

    new-instance v2, LN/R0$h;

    const/4 v1, 0x0

    invoke-direct {v2, p1, p0, v1}, LN/R0$h;-><init>(FLN/R0;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lw/m;->b(Lw/m;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static final synthetic a(LN/R0;FLr/i;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LN/R0;->h(FLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LN/R0;)LT/m0;
    .locals 0

    iget-object p0, p0, LN/R0;->g:LT/m0;

    return-object p0
.end method

.method public static final synthetic c(LN/R0;)LT/q0;
    .locals 0

    iget-object p0, p0, LN/R0;->h:LT/q0;

    return-object p0
.end method

.method public static final synthetic d(LN/R0;)LT/m0;
    .locals 0

    iget-object p0, p0, LN/R0;->e:LT/m0;

    return-object p0
.end method

.method public static final synthetic e(LN/R0;)LT/m0;
    .locals 0

    iget-object p0, p0, LN/R0;->f:LT/m0;

    return-object p0
.end method

.method public static final synthetic f(LN/R0;Z)V
    .locals 0

    invoke-direct {p0, p1}, LN/R0;->B(Z)V

    return-void
.end method

.method public static final synthetic g(LN/R0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, LN/R0;->C(Ljava/lang/Object;)V

    return-void
.end method

.method private final h(FLr/i;Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LN/R0;->p:Lw/m;

    new-instance v2, LN/R0$b;

    const/4 v1, 0x0

    invoke-direct {v2, p0, p1, p2, v1}, LN/R0$b;-><init>(LN/R0;FLr/i;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lw/m;->b(Lw/m;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static synthetic j(LN/R0;Ljava/lang/Object;Lr/i;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget-object p2, p0, LN/R0;->a:Lr/i;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LN/R0;->i(Ljava/lang/Object;Lr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: animateTo"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A(Ljava/util/Map;)V
    .locals 1

    iget-object v0, p0, LN/R0;->i:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final D(LN/x0;)V
    .locals 1

    iget-object v0, p0, LN/R0;->o:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final E(Lmh/p;)V
    .locals 1

    iget-object v0, p0, LN/R0;->m:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final F(F)V
    .locals 1

    iget-object v0, p0, LN/R0;->n:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method public final i(Ljava/lang/Object;Lr/i;Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LN/R0;->j:LLi/g;

    new-instance v1, LN/R0$c;

    invoke-direct {v1, p1, p0, p2}, LN/R0$c;-><init>(Ljava/lang/Object;LN/R0;Lr/i;)V

    invoke-interface {v0, v1, p3}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final k(Ljava/util/Map;)V
    .locals 2

    invoke-virtual {p0}, LN/R0;->l()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LN/R0;->e:LT/m0;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-interface {v0, v1}, LT/m0;->k(F)V

    iget-object v0, p0, LN/R0;->g:LT/m0;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The initial value must have an associated anchor."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final l()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LN/R0;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final m()Lr/i;
    .locals 1

    iget-object v0, p0, LN/R0;->a:Lr/i;

    return-object v0
.end method

.method public final n()Lmh/l;
    .locals 1

    iget-object v0, p0, LN/R0;->b:Lmh/l;

    return-object v0
.end method

.method public final o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN/R0;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final p()Lw/m;
    .locals 1

    iget-object v0, p0, LN/R0;->p:Lw/m;

    return-object v0
.end method

.method public final q()F
    .locals 1

    iget v0, p0, LN/R0;->l:F

    return v0
.end method

.method public final r()F
    .locals 1

    iget v0, p0, LN/R0;->k:F

    return v0
.end method

.method public final s()LT/z1;
    .locals 1

    iget-object v0, p0, LN/R0;->e:LT/m0;

    return-object v0
.end method

.method public final t()LN/x0;
    .locals 1

    iget-object v0, p0, LN/R0;->o:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/x0;

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LN/R0;->h:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, LN/R0;->s()LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {p0}, LN/R0;->l()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LN/R0;->s()LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, LN/R0;->l()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p0}, LN/R0;->v()Lmh/p;

    move-result-object v4

    const/4 v5, 0x0

    const/high16 v6, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static/range {v1 .. v6}, LN/Q0;->a(FFLjava/util/Set;Lmh/p;FF)F

    move-result v0

    :goto_2
    invoke-virtual {p0}, LN/R0;->l()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final v()Lmh/p;
    .locals 1

    iget-object v0, p0, LN/R0;->m:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/p;

    return-object v0
.end method

.method public final w()F
    .locals 1

    iget-object v0, p0, LN/R0;->n:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final x()Z
    .locals 1

    iget-object v0, p0, LN/R0;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final y(FLdh/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LN/R0;->j:LLi/g;

    new-instance v1, LN/R0$f;

    invoke-direct {v1, p0, p1}, LN/R0$f;-><init>(LN/R0;F)V

    invoke-interface {v0, v1, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final z(Ljava/util/Map;Ljava/util/Map;Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, LN/R0$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LN/R0$g;

    iget v1, v0, LN/R0$g;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/R0$g;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/R0$g;

    invoke-direct {v0, p0, p3}, LN/R0$g;-><init>(LN/R0;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LN/R0$g;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/R0$g;->f:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LN/R0$g;->c:F

    iget-object p2, v0, LN/R0$g;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    iget-object v0, v0, LN/R0$g;->a:Ljava/lang/Object;

    check-cast v0, LN/R0;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception p3

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, LN/R0$g;->c:F

    iget-object p2, v0, LN/R0$g;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    iget-object v2, v0, LN/R0$g;->a:Ljava/lang/Object;

    check-cast v2, LN/R0;

    :try_start_1
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_5

    :catchall_1
    move-exception p3

    move-object v0, v2

    goto/16 :goto_7

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->I0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, LN/R0;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->G0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, LN/R0;->l:F

    invoke-virtual {p0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput v5, v0, LN/R0$g;->f:I

    invoke-direct {p0, p1, v0}, LN/R0;->G(FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must have an associated anchor."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_16

    const/high16 p3, -0x800000    # Float.NEGATIVE_INFINITY

    iput p3, p0, LN/R0;->k:F

    const/high16 p3, 0x7f800000    # Float.POSITIVE_INFINITY

    iput p3, p0, LN/R0;->l:F

    iget-object p3, p0, LN/R0;->h:LT/q0;

    invoke-interface {p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    const/4 v2, 0x0

    if-eqz p3, :cond_d

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto/16 :goto_4

    :cond_8
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    move-object p1, v2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v6

    sub-float/2addr p1, v6

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v8

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    invoke-static {p1, v7}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-lez v8, :cond_c

    move-object v2, v6

    move p1, v7

    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_b

    :goto_2
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p1

    goto/16 :goto_4

    :cond_d
    invoke-virtual {p0}, LN/R0;->s()LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-virtual {p0}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p1

    :cond_e
    invoke-static {p2, p1}, LN/Q0;->b(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_4

    :cond_f
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_10

    goto :goto_3

    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_11

    goto :goto_3

    :cond_11
    move-object p3, v2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-virtual {p0}, LN/R0;->s()LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    sub-float/2addr p3, v5

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    :cond_12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-virtual {p0}, LN/R0;->s()LT/z1;

    move-result-object v7

    invoke-interface {v7}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static {p3, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-lez v7, :cond_13

    move-object v2, v5

    move p3, v6

    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_12

    :goto_3
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result p1

    :goto_4
    :try_start_2
    iget-object p3, p0, LN/R0;->a:Lr/i;

    iput-object p0, v0, LN/R0$g;->a:Ljava/lang/Object;

    iput-object p2, v0, LN/R0$g;->b:Ljava/lang/Object;

    iput p1, v0, LN/R0$g;->c:F

    iput v4, v0, LN/R0$g;->f:I

    invoke-direct {p0, p1, p3, v0}, LN/R0;->h(FLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p3, v1, :cond_14

    return-object v1

    :cond_14
    move-object v2, p0

    :goto_5
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2, p1}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v2, p1}, LN/R0;->C(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->I0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v2, LN/R0;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->G0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v2, LN/R0;->l:F

    goto/16 :goto_8

    :catchall_2
    move-exception p3

    move-object v0, p0

    goto :goto_7

    :catch_0
    move-object v2, p0

    :catch_1
    :try_start_3
    iput-object v2, v0, LN/R0$g;->a:Ljava/lang/Object;

    iput-object p2, v0, LN/R0$g;->b:Ljava/lang/Object;

    iput p1, v0, LN/R0$g;->c:F

    iput v3, v0, LN/R0$g;->f:I

    invoke-direct {v2, p1, v0}, LN/R0;->G(FLdh/e;)Ljava/lang/Object;

    move-result-object p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p3, v1, :cond_15

    return-object v1

    :cond_15
    move-object v0, v2

    :goto_6
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2, p1}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, LN/R0;->C(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->I0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, LN/R0;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->G0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, LN/R0;->l:F

    goto :goto_8

    :goto_7
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2, p1}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, LN/R0;->C(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->I0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, LN/R0;->k:F

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->G0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, LN/R0;->l:F

    throw p3

    :cond_16
    :goto_8
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
