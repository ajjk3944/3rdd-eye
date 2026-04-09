.class public final LJ0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/compose/ui/e$c;

.field private final b:Z

.field private final c:LE0/G;

.field private final d:LJ0/j;

.field private e:Z

.field private f:LJ0/n;

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/e$c;ZLE0/G;LJ0/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ0/n;->a:Landroidx/compose/ui/e$c;

    iput-boolean p2, p0, LJ0/n;->b:Z

    iput-object p3, p0, LJ0/n;->c:LE0/G;

    iput-object p4, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {p3}, LE0/G;->q0()I

    move-result p1

    iput p1, p0, LJ0/n;->g:I

    return-void
.end method

.method private final B(LJ0/j;)V
    .locals 5

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v0}, LJ0/j;->s()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, LJ0/n;->D(LJ0/n;ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/n;

    invoke-direct {v3}, LJ0/n;->y()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, v3, LJ0/n;->d:LJ0/j;

    invoke-virtual {p1, v4}, LJ0/j;->v(LJ0/j;)V

    invoke-direct {v3, p1}, LJ0/n;->B(LJ0/j;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic D(LJ0/n;ZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LJ0/n;->C(ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/util/List;)V
    .locals 3

    invoke-static {p0}, LJ0/o;->c(LJ0/n;)LJ0/g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v1}, LJ0/j;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, LJ0/n$a;

    invoke-direct {v1, v0}, LJ0/n$a;-><init>(LJ0/g;)V

    invoke-direct {p0, v0, v1}, LJ0/n;->c(LJ0/g;Lmh/l;)LJ0/n;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->d()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v0}, LJ0/j;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v1}, LJ0/q;->d()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    new-instance v2, LJ0/n$b;

    invoke-direct {v2, v0}, LJ0/n$b;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1, v2}, LJ0/n;->c(LJ0/g;Lmh/l;)LJ0/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private final c(LJ0/g;Lmh/l;)LJ0/n;
    .locals 5

    new-instance v0, LJ0/j;

    invoke-direct {v0}, LJ0/j;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ0/j;->x(Z)V

    invoke-virtual {v0, v1}, LJ0/j;->w(Z)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LJ0/n;

    new-instance v3, LJ0/n$c;

    invoke-direct {v3, p2}, LJ0/n$c;-><init>(Lmh/l;)V

    new-instance p2, LE0/G;

    if-eqz p1, :cond_0

    invoke-static {p0}, LJ0/o;->d(LJ0/n;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p0}, LJ0/o;->b(LJ0/n;)I

    move-result p1

    :goto_0
    const/4 v4, 0x1

    invoke-direct {p2, v4, p1}, LE0/G;-><init>(ZI)V

    invoke-direct {v2, v3, v1, p2, v0}, LJ0/n;-><init>(Landroidx/compose/ui/e$c;ZLE0/G;LJ0/j;)V

    iput-boolean v4, v2, LJ0/n;->e:Z

    iput-object p0, v2, LJ0/n;->f:LJ0/n;

    return-object v2
.end method

.method private final d(LE0/G;Ljava/util/List;Z)V
    .locals 5

    invoke-virtual {p1}, LE0/G;->v0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LE0/G;

    invoke-virtual {v2}, LE0/G;->K0()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p3, :cond_1

    invoke-virtual {v2}, LE0/G;->L0()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_1
    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v3

    const/16 v4, 0x8

    invoke-static {v4}, LE0/e0;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, LE0/a0;->q(I)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, LJ0/n;->b:Z

    invoke-static {v2, v3}, LJ0/o;->a(LE0/G;Z)LJ0/n;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0, v2, p2, p3}, LJ0/n;->d(LE0/G;Ljava/util/List;Z)V

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_4
    return-void
.end method

.method private final f(Ljava/util/List;)Ljava/util/List;
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v2, v0, v1}, LJ0/n;->D(LJ0/n;ZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/n;

    invoke-direct {v3}, LJ0/n;->y()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v4, v3, LJ0/n;->d:LJ0/j;

    invoke-virtual {v4}, LJ0/j;->s()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-direct {v3, p1}, LJ0/n;->f(Ljava/util/List;)Ljava/util/List;

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method static synthetic g(LJ0/n;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, LJ0/n;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(LJ0/n;ZZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, LJ0/n;->b:Z

    xor-int/lit8 p1, p1, 0x1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LJ0/n;->l(ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final y()Z
    .locals 1

    iget-boolean v0, p0, LJ0/n;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v0}, LJ0/j;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final A()Z
    .locals 2

    iget-boolean v0, p0, LJ0/n;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LJ0/n;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ0/n;->c:LE0/G;

    sget-object v1, LJ0/n$d;->a:LJ0/n$d;

    invoke-static {v0, v1}, LJ0/o;->f(LE0/G;Lmh/l;)LE0/G;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final C(ZZ)Ljava/util/List;
    .locals 2

    iget-boolean v0, p0, LJ0/n;->e:Z

    if-eqz v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LJ0/n;->c:LE0/G;

    invoke-direct {p0, v1, v0, p2}, LJ0/n;->d(LE0/G;Ljava/util/List;Z)V

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, LJ0/n;->b(Ljava/util/List;)V

    :cond_1
    return-object v0
.end method

.method public final a()LJ0/n;
    .locals 5

    new-instance v0, LJ0/n;

    iget-object v1, p0, LJ0/n;->a:Landroidx/compose/ui/e$c;

    iget-object v2, p0, LJ0/n;->c:LE0/G;

    iget-object v3, p0, LJ0/n;->d:LJ0/j;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2, v3}, LJ0/n;-><init>(Landroidx/compose/ui/e$c;ZLE0/G;LJ0/j;)V

    return-object v0
.end method

.method public final e()LE0/c0;
    .locals 2

    iget-boolean v0, p0, LJ0/n;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LJ0/n;->r()LJ0/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJ0/n;->e()LE0/c0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, LJ0/n;->c:LE0/G;

    invoke-static {v0}, LJ0/o;->g(LE0/G;)LE0/v0;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LJ0/n;->a:Landroidx/compose/ui/e$c;

    :goto_1
    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {v0, v1}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ll0/i;
    .locals 5

    invoke-virtual {p0}, LJ0/n;->r()LJ0/n;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LE0/c0;->M()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, LE0/c0;->c1()LC0/r;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v0, v0, LJ0/n;->a:Landroidx/compose/ui/e$c;

    const/16 v2, 0x8

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v2

    invoke-static {v0, v2}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v1, v2, v4, v3}, LC0/r;->c0(LC0/r;LC0/r;ZILjava/lang/Object;)Ll0/i;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ll0/i;
    .locals 2

    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LC0/s;->b(LC0/r;)Ll0/i;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final j()Ll0/i;
    .locals 2

    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LC0/s;->c(LC0/r;)Ll0/i;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LJ0/n;->m(LJ0/n;ZZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final l(ZZZ)Ljava/util/List;
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {p1}, LJ0/j;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LJ0/n;->y()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, p1, p2}, LJ0/n;->g(LJ0/n;Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p2, p3}, LJ0/n;->C(ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final n()LJ0/j;
    .locals 1

    invoke-direct {p0}, LJ0/n;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v0}, LJ0/j;->i()LJ0/j;

    move-result-object v0

    invoke-direct {p0, v0}, LJ0/n;->B(LJ0/j;)V

    return-object v0

    :cond_0
    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, LJ0/n;->g:I

    return v0
.end method

.method public final p()LC0/v;
    .locals 1

    iget-object v0, p0, LJ0/n;->c:LE0/G;

    return-object v0
.end method

.method public final q()LE0/G;
    .locals 1

    iget-object v0, p0, LJ0/n;->c:LE0/G;

    return-object v0
.end method

.method public final r()LJ0/n;
    .locals 3

    iget-object v0, p0, LJ0/n;->f:LJ0/n;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-boolean v0, p0, LJ0/n;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ0/n;->c:LE0/G;

    sget-object v2, LJ0/n$e;->a:LJ0/n$e;

    invoke-static {v0, v2}, LJ0/o;->f(LE0/G;Lmh/l;)LE0/G;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, LJ0/n;->c:LE0/G;

    sget-object v2, LJ0/n$f;->a:LJ0/n$f;

    invoke-static {v0, v2}, LJ0/o;->f(LE0/G;Lmh/l;)LE0/G;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    return-object v1

    :cond_3
    iget-boolean v1, p0, LJ0/n;->b:Z

    invoke-static {v0, v1}, LJ0/o;->a(LE0/G;Z)LJ0/n;

    move-result-object v0

    return-object v0
.end method

.method public final s()J
    .locals 2

    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/c0;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LC0/s;->e(LC0/r;)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    :goto_1
    return-wide v0
.end method

.method public final t()Ljava/util/List;
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LJ0/n;->m(LJ0/n;ZZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final u()J
    .locals 2

    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/c0;->h()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-virtual {v0}, LY0/r$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final v()Ll0/i;
    .locals 2

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    invoke-virtual {v0}, LJ0/j;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ0/n;->c:LE0/G;

    invoke-static {v0}, LJ0/o;->g(LE0/G;)LE0/v0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJ0/n;->a:Landroidx/compose/ui/e$c;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LJ0/n;->a:Landroidx/compose/ui/e$c;

    :goto_0
    invoke-interface {v0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    iget-object v1, p0, LJ0/n;->d:LJ0/j;

    invoke-static {v1}, LE0/w0;->a(LJ0/j;)Z

    move-result v1

    invoke-static {v0, v1}, LE0/w0;->c(Landroidx/compose/ui/e$c;Z)Ll0/i;

    move-result-object v0

    return-object v0
.end method

.method public final w()LJ0/j;
    .locals 1

    iget-object v0, p0, LJ0/n;->d:LJ0/j;

    return-object v0
.end method

.method public final x()Z
    .locals 1

    iget-boolean v0, p0, LJ0/n;->e:Z

    return v0
.end method

.method public final z()Z
    .locals 1

    invoke-virtual {p0}, LJ0/n;->e()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/c0;->T2()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
