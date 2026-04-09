.class public abstract Ljj/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljj/i$c;
    }
.end annotation


# static fields
.field public static final o:Ljj/i$c;

.field public static final p:I

.field private static final q:Lmh/l;

.field private static final r:Lmh/l;


# instance fields
.field private final a:LIi/N;

.field private final b:F

.field private final c:Lmh/p;

.field private final d:Lmh/p;

.field private final e:Lmh/p;

.field private final f:Ljj/b;

.field private final g:LT/q0;

.field private final h:LKi/g;

.field private final i:LKi/g;

.field private final j:LT/q0;

.field private final k:LT/q0;

.field private l:LIi/y0;

.field private final m:Ljava/util/List;

.field private final n:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljj/i$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljj/i$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljj/i;->o:Ljj/i$c;

    const/16 v0, 0x8

    sput v0, Ljj/i;->p:I

    sget-object v0, Ljj/i$b;->a:Ljj/i$b;

    sput-object v0, Ljj/i;->q:Lmh/l;

    sget-object v0, Ljj/i$a;->a:Ljj/i$a;

    sput-object v0, Ljj/i;->r:Lmh/l;

    return-void
.end method

.method public constructor <init>(LIi/N;FLmh/p;Lmh/p;Lmh/p;Ljj/b;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onMove"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dragCancelledAnimation"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljj/i;->a:LIi/N;

    iput p2, p0, Ljj/i;->b:F

    iput-object p3, p0, Ljj/i;->c:Lmh/p;

    iput-object p4, p0, Ljj/i;->d:Lmh/p;

    iput-object p5, p0, Ljj/i;->e:Lmh/p;

    iput-object p6, p0, Ljj/i;->f:Ljj/b;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, Ljj/i;->g:LT/q0;

    const/4 p3, 0x0

    const/4 p4, 0x7

    invoke-static {p3, p1, p1, p4, p1}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p5

    iput-object p5, p0, Ljj/i;->h:LKi/g;

    invoke-static {p3, p1, p1, p4, p1}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p3

    iput-object p3, p0, Ljj/i;->i:LKi/g;

    sget-object p3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p3}, Ll0/g$a;->c()J

    move-result-wide p3

    invoke-static {p3, p4}, Ll0/g;->d(J)Ll0/g;

    move-result-object p3

    invoke-static {p3, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, Ljj/i;->j:LT/q0;

    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Ljj/i;->k:LT/q0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ljj/i;->m:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ljj/i;->n:Ljava/util/List;

    return-void
.end method

.method private final C()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljj/i;->k:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final N(J)V
    .locals 1

    iget-object v0, p0, Ljj/i;->j:LT/q0;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final O(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Ljj/i;->g:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final P(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ljj/i;->k:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a(Ljj/i;JF)F
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ljj/i;->h(JF)F

    move-result p0

    return p0
.end method

.method public static final synthetic b(Ljj/i;)LIi/y0;
    .locals 0

    iget-object p0, p0, Ljj/i;->l:LIi/y0;

    return-object p0
.end method

.method public static final synthetic c()Lmh/l;
    .locals 1

    sget-object v0, Ljj/i;->r:Lmh/l;

    return-object v0
.end method

.method public static final synthetic d()Lmh/l;
    .locals 1

    sget-object v0, Ljj/i;->q:Lmh/l;

    return-object v0
.end method

.method public static final synthetic e(Ljj/i;)F
    .locals 0

    iget p0, p0, Ljj/i;->b:F

    return p0
.end method

.method public static final synthetic f(Ljj/i;)Lmh/p;
    .locals 0

    iget-object p0, p0, Ljj/i;->c:Lmh/p;

    return-object p0
.end method

.method private final g(F)V
    .locals 8

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ljj/i;->i()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljj/i;->l:LIi/y0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LIi/y0;->isActive()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Ljj/i;->a:LIi/N;

    new-instance v5, Ljj/i$d;

    const/4 v0, 0x0

    invoke-direct {v5, p1, p0, v0}, Ljj/i$d;-><init>(FLjj/i;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    iput-object p1, p0, Ljj/i;->l:LIi/y0;

    :goto_0
    return-void
.end method

.method private final h(JF)F
    .locals 9

    invoke-direct {p0}, Ljj/i;->s()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ljj/i;->I()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v0}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Ljj/i;->r()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {p0, v0}, Ljj/i;->v(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Ljj/i;->q()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {p0, v0}, Ljj/i;->H(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v3

    :goto_0
    cmpl-float v4, v3, v1

    if-lez v4, :cond_3

    invoke-virtual {p0}, Ljj/i;->E()I

    move-result v3

    int-to-float v3, v3

    sub-float v3, v0, v3

    invoke-static {v3, v1}, Lsh/m;->c(FF)F

    move-result v1

    :cond_2
    :goto_1
    move v5, v1

    goto :goto_2

    :cond_3
    cmpg-float v3, v3, v1

    if-gez v3, :cond_2

    invoke-virtual {p0}, Ljj/i;->F()I

    move-result v3

    int-to-float v3, v3

    sub-float v3, v2, v3

    invoke-static {v3, v1}, Lsh/m;->f(FF)F

    move-result v1

    goto :goto_1

    :goto_2
    sget-object v3, Ljj/i;->o:Ljj/i$c;

    sub-float/2addr v0, v2

    float-to-int v4, v0

    move-wide v6, p1

    move v8, p3

    invoke-static/range {v3 .. v8}, Ljj/i$c;->a(Ljj/i$c;IFJF)F

    move-result p1

    return p1
.end method

.method private final i()V
    .locals 3

    iget-object v0, p0, Ljj/i;->l:LIi/y0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Ljj/i;->l:LIi/y0;

    return-void
.end method

.method private final n()J
    .locals 2

    iget-object v0, p0, Ljj/i;->j:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method private final s()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljj/i;->G()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {p0}, Ljj/i;->o()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return-object v1
.end method


# virtual methods
.method protected abstract A(Ljava/lang/Object;)I
.end method

.method public final B()LKi/g;
    .locals 1

    iget-object v0, p0, Ljj/i;->i:LKi/g;

    return-object v0
.end method

.method protected abstract D(Ljava/lang/Object;)I
.end method

.method protected abstract E()I
.end method

.method protected abstract F()I
.end method

.method protected abstract G()Ljava/util/List;
.end method

.method protected abstract H(Ljava/lang/Object;)I
.end method

.method public abstract I()Z
.end method

.method public final J(II)V
    .locals 10

    invoke-direct {p0}, Ljj/i;->C()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v1

    int-to-float p1, p1

    add-float/2addr v1, p1

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result p1

    int-to-float p2, p2

    add-float/2addr p1, p2

    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Ljj/i;->N(J)V

    invoke-direct {p0}, Ljj/i;->s()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p0}, Ljj/i;->r()F

    move-result v1

    add-float/2addr p2, v1

    invoke-virtual {p0, p1}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Ljj/i;->q()F

    move-result v2

    add-float/2addr v1, v2

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v2

    float-to-int v2, v2

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0, v2, v3, v0}, Ljj/i;->k(IILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    float-to-int v1, v1

    float-to-int p2, p2

    invoke-virtual {p0, p1, v0, v1, p2}, Ljj/i;->j(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Ljj/i;->t()I

    move-result v1

    if-eq v0, v1, :cond_3

    invoke-virtual {p0, p1}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Ljj/i;->t()I

    move-result v1

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ljj/i;->c:Lmh/p;

    new-instance v1, Ljj/d;

    invoke-virtual {p0, p1}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {p0, p1}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljj/d;-><init>(ILjava/lang/Object;)V

    new-instance p1, Ljj/d;

    invoke-virtual {p0, p2}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {p0, p2}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {p1, v2, v3}, Ljj/d;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v4, p0, Ljj/i;->a:LIi/N;

    new-instance v7, Ljj/i$e;

    const/4 v0, 0x0

    invoke-direct {v7, p0, p1, p2, v0}, Ljj/i$e;-><init>(Ljj/i;Ljava/lang/Object;Ljava/lang/Object;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :goto_1
    invoke-virtual {p0, p2}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Ljj/i;->O(Ljava/lang/Integer;)V

    :cond_4
    const-wide/16 p1, 0x0

    iget v0, p0, Ljj/i;->b:F

    invoke-direct {p0, p1, p2, v0}, Ljj/i;->h(JF)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    invoke-direct {p0, p1}, Ljj/i;->g(F)V

    :goto_2
    return-void
.end method

.method public final K()V
    .locals 13

    invoke-virtual {p0}, Ljj/i;->o()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v4, Ljj/d;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0}, Ljj/i;->C()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-direct {v4, v0, v2}, Ljj/d;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0}, Ljj/i;->q()F

    move-result v0

    invoke-virtual {p0}, Ljj/i;->r()F

    move-result v2

    invoke-static {v0, v2}, Ll0/h;->a(FF)J

    move-result-wide v5

    iget-object v0, p0, Ljj/i;->a:LIi/N;

    new-instance v10, Ljj/i$f;

    const/4 v7, 0x0

    move-object v2, v10

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ljj/i$f;-><init>(Ljj/i;Ljj/d;JLdh/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v0

    invoke-static/range {v7 .. v12}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    invoke-direct {p0}, Ljj/i;->C()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    invoke-virtual {p0}, Ljj/i;->o()Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v1}, Ljj/i;->P(Ljava/lang/Object;)V

    sget-object v3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v3}, Ll0/g$a;->c()J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Ljj/i;->N(J)V

    invoke-direct {p0, v1}, Ljj/i;->O(Ljava/lang/Integer;)V

    invoke-direct {p0}, Ljj/i;->i()V

    iget-object v1, p0, Ljj/i;->e:Lmh/p;

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    invoke-interface {v1, v0, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public L(II)Z
    .locals 5

    invoke-virtual {p0}, Ljj/i;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljj/i;->F()I

    move-result v0

    add-int/2addr p2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljj/i;->F()I

    move-result v0

    add-int/2addr p1, v0

    :goto_0
    invoke-virtual {p0}, Ljj/i;->G()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p0, v1}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v4

    if-gt p1, v4, :cond_1

    if-gt v3, p1, :cond_1

    invoke-virtual {p0, v1}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p0, v1}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v4

    if-gt p2, v4, :cond_1

    if-gt v3, p2, :cond_1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_3

    invoke-direct {p0, v1}, Ljj/i;->P(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Ljj/i;->O(Ljava/lang/Integer;)V

    move-object v2, v1

    :cond_3
    if-eqz v2, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    return p1
.end method

.method protected abstract M(IILdh/e;)Ljava/lang/Object;
.end method

.method public final Q()LLi/g;
    .locals 3

    new-instance v0, Ljj/i$h;

    invoke-direct {v0, p0}, Ljj/i$h;-><init>(Ljj/i;)V

    invoke-static {v0}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v0

    new-instance v1, Ljj/i$g;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ljj/i$g;-><init>(Ldh/e;Ljj/i;)V

    invoke-static {v0, v1}, LLi/i;->O(LLi/g;Lmh/q;)LLi/g;

    move-result-object v0

    invoke-static {v0}, LLi/i;->w(LLi/g;)LLi/g;

    move-result-object v0

    new-instance v1, Ljj/i$j;

    invoke-direct {v1, p0}, Ljj/i$j;-><init>(Ljj/i;)V

    invoke-static {v0, v1}, LLi/i;->o(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    return-object v0
.end method

.method protected j(Ljava/lang/Object;Ljava/util/List;II)Ljava/lang/Object;
    .locals 14

    move-object v0, p0

    move-object/from16 v1, p2

    const-string v2, "items"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljj/i;->o()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static/range {p2 .. p2}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    return-object v2

    :cond_1
    invoke-virtual {p0, p1}, Ljj/i;->H(Ljava/lang/Object;)I

    move-result v3

    add-int v3, p3, v3

    invoke-virtual {p0, p1}, Ljj/i;->v(Ljava/lang/Object;)I

    move-result v4

    add-int v4, p4, v4

    invoke-virtual {p0, p1}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, p3, v5

    invoke-virtual {p0, p1}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, p4, v6

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, -0x1

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_6

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    if-lez v5, :cond_2

    invoke-virtual {p0, v10}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v11

    sub-int/2addr v11, v3

    if-gez v11, :cond_2

    invoke-virtual {p0, v10}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v12

    invoke-virtual {p0, p1}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v13

    if-le v12, v13, :cond_2

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    if-le v11, v8, :cond_2

    move-object v2, v10

    move v8, v11

    :cond_2
    if-gez v5, :cond_3

    invoke-virtual {p0, v10}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v11, p3

    if-lez v11, :cond_3

    invoke-virtual {p0, v10}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v12

    invoke-virtual {p0, p1}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v13

    if-ge v12, v13, :cond_3

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    if-le v11, v8, :cond_3

    move-object v2, v10

    move v8, v11

    :cond_3
    if-gez v6, :cond_4

    invoke-virtual {p0, v10}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v11, p4

    if-lez v11, :cond_4

    invoke-virtual {p0, v10}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v12

    invoke-virtual {p0, p1}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v13

    if-ge v12, v13, :cond_4

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    if-le v11, v8, :cond_4

    move-object v2, v10

    move v8, v11

    :cond_4
    if-lez v6, :cond_5

    invoke-virtual {p0, v10}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v11

    sub-int/2addr v11, v4

    if-gez v11, :cond_5

    invoke-virtual {p0, v10}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v12

    invoke-virtual {p0, p1}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v13

    if-le v12, v13, :cond_5

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    if-le v11, v8, :cond_5

    move-object v2, v10

    move v8, v11

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_6
    return-object v2
.end method

.method protected k(IILjava/lang/Object;)Ljava/util/List;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-object v2, v0, Ljj/i;->m:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, v0, Ljj/i;->n:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    invoke-virtual {v0, v1}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v2

    add-int v2, p1, v2

    invoke-virtual {v0, v1}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v3

    add-int v3, p1, v3

    invoke-virtual {v0, v1}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v4

    add-int v4, p2, v4

    invoke-virtual {v0, v1}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v5

    add-int v5, p2, v5

    add-int v6, v2, v3

    div-int/lit8 v6, v6, 0x2

    add-int v7, v4, v5

    div-int/lit8 v7, v7, 0x2

    invoke-virtual/range {p0 .. p0}, Ljj/i;->G()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_6

    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Ljj/i;->o()Ljava/lang/Integer;

    move-result-object v14

    if-nez v14, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-eq v13, v14, :cond_1

    :goto_1
    invoke-virtual {v0, v12}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v13

    if-lt v13, v4, :cond_1

    invoke-virtual {v0, v12}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v13

    if-gt v13, v5, :cond_1

    invoke-virtual {v0, v12}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v13

    if-lt v13, v2, :cond_1

    invoke-virtual {v0, v12}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v13

    if-le v13, v3, :cond_2

    :cond_1
    move/from16 v16, v2

    goto/16 :goto_3

    :cond_2
    iget-object v13, v0, Ljj/i;->d:Lmh/p;

    if-eqz v13, :cond_3

    new-instance v14, Ljj/d;

    invoke-virtual {v0, v12}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v15

    invoke-virtual {v0, v12}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-direct {v14, v15, v10}, Ljj/d;-><init>(ILjava/lang/Object;)V

    new-instance v10, Ljj/d;

    invoke-virtual {v0, v1}, Ljj/i;->x(Ljava/lang/Object;)I

    move-result v15

    move/from16 v16, v2

    invoke-virtual {v0, v1}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v10, v15, v2}, Ljj/d;-><init>(ILjava/lang/Object;)V

    invoke-interface {v13, v14, v10}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_3
    move/from16 v16, v2

    :cond_4
    invoke-virtual {v0, v12}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v0, v12}, Ljj/i;->A(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v2, v10

    div-int/lit8 v2, v2, 0x2

    sub-int v2, v6, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-virtual {v0, v12}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v10

    invoke-virtual {v0, v12}, Ljj/i;->l(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v10, v13

    div-int/lit8 v10, v10, 0x2

    sub-int v10, v7, v10

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    mul-int/2addr v2, v2

    mul-int/2addr v10, v10

    add-int/2addr v2, v10

    iget-object v10, v0, Ljj/i;->m:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v13, v10, :cond_5

    iget-object v15, v0, Ljj/i;->n:Ljava/util/List;

    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    if-le v2, v15, :cond_5

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_5
    iget-object v10, v0, Ljj/i;->m:Ljava/util/List;

    invoke-interface {v10, v14, v12}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v10, v0, Ljj/i;->n:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v14, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :goto_3
    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v16

    goto/16 :goto_0

    :cond_6
    iget-object v1, v0, Ljj/i;->m:Ljava/util/List;

    return-object v1
.end method

.method protected abstract l(Ljava/lang/Object;)I
.end method

.method public final m()Ljj/b;
    .locals 1

    iget-object v0, p0, Ljj/i;->f:Ljj/b;

    return-object v0
.end method

.method public final o()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Ljj/i;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Ljj/i;->C()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Ljj/i;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final q()F
    .locals 4

    invoke-direct {p0}, Ljj/i;->s()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ljj/i;->C()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    int-to-float v1, v1

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0, v0}, Ljj/i;->z(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public final r()F
    .locals 4

    invoke-direct {p0}, Ljj/i;->s()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ljj/i;->C()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    int-to-float v1, v1

    invoke-direct {p0}, Ljj/i;->n()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p0, v0}, Ljj/i;->D(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method protected abstract t()I
.end method

.method protected abstract u()I
.end method

.method protected abstract v(Ljava/lang/Object;)I
.end method

.method public final w()LKi/g;
    .locals 1

    iget-object v0, p0, Ljj/i;->h:LKi/g;

    return-object v0
.end method

.method protected abstract x(Ljava/lang/Object;)I
.end method

.method protected abstract y(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract z(Ljava/lang/Object;)I
.end method
