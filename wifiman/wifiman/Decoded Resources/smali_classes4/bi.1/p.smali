.class public final Lbi/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/types/checker/b;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;

.field private final c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

.field private final d:Lkotlin/reflect/jvm/internal/impl/types/checker/f;

.field private final e:Lmh/p;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lkotlin/reflect/jvm/internal/impl/types/checker/f;Lmh/p;)V
    .locals 1

    const-string v0, "equalityAxioms"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi/p;->a:Ljava/util/Map;

    iput-object p2, p0, Lbi/p;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;

    iput-object p3, p0, Lbi/p;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    iput-object p4, p0, Lbi/p;->d:Lkotlin/reflect/jvm/internal/impl/types/checker/f;

    iput-object p5, p0, Lbi/p;->e:Lmh/p;

    return-void
.end method

.method public static final synthetic I0(Lbi/p;)Lmh/p;
    .locals 0

    iget-object p0, p0, Lbi/p;->e:Lmh/p;

    return-object p0
.end method

.method private final J0(Lpi/v0;Lpi/v0;)Z
    .locals 4

    iget-object v0, p0, Lbi/p;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;->a(Lpi/v0;Lpi/v0;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lbi/p;->a:Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/v0;

    iget-object v3, p0, Lbi/p;->a:Ljava/util/Map;

    invoke-interface {v3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/v0;

    if-eqz v0, :cond_2

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :cond_4
    :goto_0
    return v1
.end method


# virtual methods
.method public A(Lri/j;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public A0(Lri/d;)Lri/c;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->m0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/d;)Lri/c;

    move-result-object p1

    return-object p1
.end method

.method public B(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->P(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public B0(Lri/e;)Lri/j;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->g0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/e;)Lri/j;

    move-result-object p1

    return-object p1
.end method

.method public C(Lri/i;I)Lri/l;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->m(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;I)Lri/l;

    move-result-object p1

    return-object p1
.end method

.method public C0(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lri/j;

    if-eqz v0, :cond_0

    check-cast p1, Lri/j;

    invoke-interface {p0, p1}, Lri/o;->t(Lri/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public D(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->K(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public D0(Lri/j;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->S(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Z

    move-result p1

    return p1
.end method

.method public E(Lri/n;)Lri/s;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->z(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/n;)Lri/s;

    move-result-object p1

    return-object p1
.end method

.method public E0(Lri/n;Lri/m;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->B(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/n;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public F(Lri/j;Lri/m;)Ljava/util/List;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "constructor"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public F0(Lri/i;)Lri/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->u(Lri/i;)Lri/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, Lri/o;->g(Lri/g;)Lri/j;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p0, p1}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public G(Lri/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->s(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p1

    return-object p1
.end method

.method public G0(Lri/i;)Lri/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {p0, v0, v1}, Lri/o;->b(Lri/j;Z)Lri/j;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    return-object p1
.end method

.method public H(Lri/i;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->n(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public H0(Lri/i;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->a0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Z

    move-result p1

    return p1
.end method

.method public I(Lri/d;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->T(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/d;)Z

    move-result p1

    return p1
.end method

.method public J(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v0

    invoke-interface {p0, v0}, Lri/o;->t(Lri/j;)Z

    move-result v0

    invoke-interface {p0, p1}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->t(Lri/j;)Z

    move-result p1

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public K(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lri/o;->V(Lri/j;)Lri/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public K0(ZZ)Lpi/u0;
    .locals 7

    iget-object v0, p0, Lbi/p;->e:Lmh/p;

    if-nez v0, :cond_0

    iget-object v0, p0, Lbi/p;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    iget-object v1, p0, Lbi/p;->d:Lkotlin/reflect/jvm/internal/impl/types/checker/f;

    invoke-static {p1, p2, p0, v1, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/a;->a(ZZLkotlin/reflect/jvm/internal/impl/types/checker/b;Lkotlin/reflect/jvm/internal/impl/types/checker/f;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/u0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v4, p0, Lbi/p;->d:Lkotlin/reflect/jvm/internal/impl/types/checker/f;

    iget-object v5, p0, Lbi/p;->c:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    new-instance v6, Lbi/p$a;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lbi/p$a;-><init>(ZZLbi/p;Lkotlin/reflect/jvm/internal/impl/types/checker/f;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V

    return-object v6
.end method

.method public L(Lri/i;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->O(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Z

    move-result p1

    return p1
.end method

.method public M(Lri/j;I)Lri/l;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_0

    invoke-interface {p0, p1}, Lri/o;->k0(Lri/i;)I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-interface {p0, p1, p2}, Lri/o;->C(Lri/i;I)Lri/l;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public N(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->E(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public O(Lri/m;Lri/m;)Z
    .locals 2

    const-string v0, "c1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpi/v0;

    const-string v1, "Failed requirement."

    if-eqz v0, :cond_3

    instance-of v0, p2, Lpi/v0;

    if-eqz v0, :cond_2

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->a(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;Lri/m;)Z

    move-result v0

    if-nez v0, :cond_1

    check-cast p1, Lpi/v0;

    check-cast p2, Lpi/v0;

    invoke-direct {p0, p1, p2}, Lbi/p;->J0(Lpi/v0;Lpi/v0;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public P(Lri/c;)Lri/l;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->j0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/c;)Lri/l;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lri/j;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->Z(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Z

    move-result p1

    return p1
.end method

.method public R(Lri/i;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->U(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Z

    move-result p1

    return p1
.end method

.method public S(Lri/n;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->x(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/n;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public T(Ljava/util/Collection;)Lri/i;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->D(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Ljava/util/Collection;)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public U(Lri/k;I)Lri/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lri/j;

    if-eqz v0, :cond_0

    check-cast p1, Lri/i;

    invoke-interface {p0, p1, p2}, Lri/o;->C(Lri/i;I)Lri/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lri/a;

    if-eqz v0, :cond_1

    check-cast p1, Lri/a;

    invoke-virtual {p1, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lri/l;

    :goto_0
    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown type argument list type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public V(Lri/j;)Lri/e;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->e(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Lri/e;

    move-result-object p1

    return-object p1
.end method

.method public W(Lri/i;Z)Lri/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->e0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;Z)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public X(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->G(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public Y(Lri/g;)Lri/f;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->f(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/g;)Lri/f;

    const/4 p1, 0x0

    return-object p1
.end method

.method public Z(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->F(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public a(Lri/j;)Lri/d;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->d(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Lri/d;

    move-result-object p1

    return-object p1
.end method

.method public a0(Lri/m;I)Lri/n;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->p(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;I)Lri/n;

    move-result-object p1

    return-object p1
.end method

.method public b(Lri/j;Z)Lri/j;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->q0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;Z)Lri/j;

    move-result-object p1

    return-object p1
.end method

.method public b0(Lri/i;)Lri/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->u(Lri/i;)Lri/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0, v0}, Lri/o;->e(Lri/g;)Lri/j;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-interface {p0, p1}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public c(Lri/i;)Lri/j;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->h(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Lri/j;

    move-result-object p1

    return-object p1
.end method

.method public c0(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->u(Lri/i;)Lri/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lri/o;->Y(Lri/g;)Lri/f;

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Lri/j;)Lri/m;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->n0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Lri/m;

    move-result-object p1

    return-object p1
.end method

.method public d0()Z
    .locals 1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->M(Lkotlin/reflect/jvm/internal/impl/types/checker/b;)Z

    move-result v0

    return v0
.end method

.method public e(Lri/g;)Lri/j;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->c0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/g;)Lri/j;

    move-result-object p1

    return-object p1
.end method

.method public e0(Lri/m;)Lri/n;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->v(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Lri/n;

    move-result-object p1

    return-object p1
.end method

.method public f(Lri/j;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->V(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Z

    move-result p1

    return p1
.end method

.method public f0(Lri/i;)Lri/m;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v0

    :cond_0
    invoke-interface {p0, v0}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p1

    return-object p1
.end method

.method public g(Lri/g;)Lri/j;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->o0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/g;)Lri/j;

    move-result-object p1

    return-object p1
.end method

.method public g0(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lri/o;->a(Lri/j;)Lri/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public h(Lri/i;)Lri/i;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->w(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public h0(Lri/j;)Lpi/u0$c;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->k0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Lpi/u0$c;

    move-result-object p1

    return-object p1
.end method

.method public i(Lri/j;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->D(Lri/m;)Z

    move-result p1

    return p1
.end method

.method public i0(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->L(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public j(Lri/l;)Lri/i;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->u(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/l;)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public j0(Lri/m;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->q(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public k(Lri/d;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->R(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/d;)Z

    move-result p1

    return p1
.end method

.method public k0(Lri/i;)I
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->b(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)I

    move-result p1

    return p1
.end method

.method public l(Lri/k;)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lri/j;

    if-eqz v0, :cond_0

    check-cast p1, Lri/i;

    invoke-interface {p0, p1}, Lri/o;->k0(Lri/i;)I

    move-result p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lri/a;

    if-eqz v0, :cond_1

    check-cast p1, Lri/a;

    invoke-virtual {p1}, Lri/a;->size()I

    move-result p1

    :goto_0
    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown type argument list type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l0(Lri/j;)Lri/k;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->c(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Lri/k;

    move-result-object p1

    return-object p1
.end method

.method public m(Lri/j;Lri/j;)Lri/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->l(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;Lri/j;)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public m0(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v0

    invoke-interface {p0, v0}, Lri/o;->B(Lri/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lri/o;->v0(Lri/i;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public n(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->b0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public n0(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->J(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public o(Lri/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->r(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Lkotlin/reflect/jvm/internal/impl/builtins/l;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lri/j;)Lri/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->V(Lri/j;)Lri/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0, v0}, Lri/o;->B0(Lri/e;)Lri/j;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    :goto_0
    return-object p1
.end method

.method public p(Lri/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->X(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/l;)Z

    move-result p1

    return p1
.end method

.method public p0(Lri/d;)Lri/i;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->d0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/d;)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public q(Lri/m;)I
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->h0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)I

    move-result p1

    return p1
.end method

.method public q0(Lri/j;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->Z(Lri/m;)Z

    move-result p1

    return p1
.end method

.method public r(Lri/j;Lri/j;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->C(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;Lri/j;)Z

    move-result p1

    return p1
.end method

.method public r0(Lri/m;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->H(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Z

    move-result p1

    return p1
.end method

.method public s(Lri/i;)Lri/l;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->i(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Lri/l;

    move-result-object p1

    return-object p1
.end method

.method public s0(Lri/m;)LZh/d;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->o(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)LZh/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Lri/j;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->N(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Z

    move-result p1

    return p1
.end method

.method public t0(Lri/i;LZh/c;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->A(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;LZh/c;)Z

    move-result p1

    return p1
.end method

.method public u(Lri/i;)Lri/g;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->g(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Lri/g;

    move-result-object p1

    return-object p1
.end method

.method public u0(Lri/n;)Lri/i;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->t(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/n;)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public v(Lri/l;)Lri/s;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->y(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/l;)Lri/s;

    move-result-object p1

    return-object p1
.end method

.method public v0(Lri/i;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->Q(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Z

    move-result p1

    return p1
.end method

.method public w(Lri/i;)Lri/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lri/o;->W(Lri/i;Z)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public w0(Lri/i;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->I(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;)Z

    move-result p1

    return p1
.end method

.method public x(Lri/i;Z)Lri/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->p0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/i;Z)Lri/i;

    move-result-object p1

    return-object p1
.end method

.method public x0(Lri/m;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->l0(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/m;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public y(Lri/j;Lri/b;)Lri/j;
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->j(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;Lri/b;)Lri/j;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lri/d;)Lri/b;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->k(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/d;)Lri/b;

    move-result-object p1

    return-object p1
.end method

.method public z(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v0

    invoke-interface {p0, v0}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v0

    invoke-interface {p0, p1}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public z0(Lri/j;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/b$a;->Y(Lkotlin/reflect/jvm/internal/impl/types/checker/b;Lri/j;)Z

    move-result p1

    return p1
.end method
