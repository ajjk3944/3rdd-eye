.class public final LI/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/o1$a;,
        LI/o1$b;
    }
.end annotation


# static fields
.field private static final g:LI/o1$a;


# instance fields
.field private final a:LH/l;

.field private b:LH/b;

.field private final c:LI/o;

.field private final d:LT/z1;

.field private final e:LT/z1;

.field private final f:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI/o1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI/o1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI/o1;->g:LI/o1$a;

    return-void
.end method

.method public constructor <init>(LH/l;LH/b;LI/o;LH/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/o1;->a:LH/l;

    iput-object p2, p0, LI/o1;->b:LH/b;

    iput-object p3, p0, LI/o1;->c:LI/o;

    const/4 p1, 0x0

    iput-object p1, p0, LI/o1;->d:LT/z1;

    if-eqz p3, :cond_0

    new-instance p2, LI/o1$c;

    invoke-direct {p2, p0, p3}, LI/o1$c;-><init>(LI/o1;LI/o;)V

    invoke-static {p2}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, LI/o1;->e:LT/z1;

    new-instance p2, LI/X0;

    sget-object p3, LI/p1;->Start:LI/p1;

    invoke-direct {p2, p3}, LI/X0;-><init>(LI/p1;)V

    const/4 p3, 0x2

    invoke-static {p2, p1, p3, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LI/o1;->f:LT/q0;

    return-void
.end method

.method public static final synthetic a()LI/o1$a;
    .locals 1

    sget-object v0, LI/o1;->g:LI/o1$a;

    return-object v0
.end method

.method public static final synthetic b(LI/o1;)LH/b;
    .locals 0

    iget-object p0, p0, LI/o1;->b:LH/b;

    return-object p0
.end method

.method public static final synthetic c(LI/o1;)LT/z1;
    .locals 0

    iget-object p0, p0, LI/o1;->d:LT/z1;

    return-object p0
.end method

.method public static final synthetic d(LI/o1;)LH/l;
    .locals 0

    iget-object p0, p0, LI/o1;->a:LH/l;

    return-object p0
.end method

.method public static synthetic u(LI/o1;Ljava/lang/CharSequence;ZLK/c;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, LK/c;->MergeIfPossible:LK/c;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LI/o1;->t(Ljava/lang/CharSequence;ZLK/c;)V

    return-void
.end method

.method public static synthetic w(LI/o1;Ljava/lang/CharSequence;JLK/c;ZILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    sget-object p4, LK/c;->MergeIfPossible:LK/c;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    const/4 p5, 0x1

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, LI/o1;->v(Ljava/lang/CharSequence;JLK/c;Z)V

    return-void
.end method


# virtual methods
.method public final A(LI/X0;)V
    .locals 1

    iget-object v0, p0, LI/o1;->f:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final B()V
    .locals 1

    iget-object v0, p0, LI/o1;->a:LH/l;

    invoke-virtual {v0}, LH/l;->k()LH/r;

    move-result-object v0

    invoke-virtual {v0}, LH/r;->b()V

    return-void
.end method

.method public final C(LH/b;)V
    .locals 0

    iput-object p1, p0, LI/o1;->b:LH/b;

    return-void
.end method

.method public final e()V
    .locals 7

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->i(J)I

    move-result v4

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v5

    invoke-virtual {v3, v4, v5}, LI/I;->u(II)V

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LI/o1;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LI/o1;->a:LH/l;

    check-cast p1, LI/o1;

    iget-object v2, p1, LI/o1;->a:LH/l;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, LI/o1;->c:LI/o;

    iget-object v2, p1, LI/o1;->c:LI/o;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()V
    .locals 7

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->k(J)I

    move-result v4

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->k(J)I

    move-result v5

    invoke-virtual {v3, v4, v5}, LI/I;->u(II)V

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public final g(LH/l$a;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LI/o1$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LI/o1$d;

    iget v1, v0, LI/o1$d;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LI/o1$d;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LI/o1$d;

    invoke-direct {v0, p0, p2}, LI/o1$d;-><init>(LI/o1;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LI/o1$d;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI/o1$d;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, LI/o1$d;->b:Ljava/lang/Object;

    check-cast p1, LH/l$a;

    iget-object p1, v0, LI/o1$d;->a:Ljava/lang/Object;

    check-cast p1, LI/o1;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LI/o1$d;->a:Ljava/lang/Object;

    iput-object p1, v0, LI/o1$d;->b:Ljava/lang/Object;

    iput v3, v0, LI/o1$d;->e:I

    new-instance p2, LIi/p;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v2

    invoke-direct {p2, v2, v3}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {p2}, LIi/p;->A()V

    invoke-static {p0}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v2

    invoke-virtual {v2, p1}, LH/l;->c(LH/l$a;)V

    new-instance v2, LI/o1$e;

    invoke-direct {v2, p0, p1}, LI/o1$e;-><init>(LI/o1;LH/l$a;)V

    invoke-interface {p2, v2}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {p2}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_3
    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->NeverMerge:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->l(J)I

    move-result v4

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->k(J)I

    move-result v5

    invoke-virtual {v3, v4, v5}, LI/I;->d(II)V

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->l(J)I

    move-result v4

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->l(J)I

    move-result v5

    invoke-virtual {v3, v4, v5}, LI/I;->u(II)V

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LI/o1;->a:LH/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI/o1;->c:LI/o;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final i()LH/h;
    .locals 1

    iget-object v0, p0, LI/o1;->d:LT/z1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/o1$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI/o1$b;->b()LH/h;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LI/o1;->k()LH/h;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final j()LI/X0;
    .locals 1

    iget-object v0, p0, LI/o1;->f:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/X0;

    return-object v0
.end method

.method public final k()LH/h;
    .locals 1

    iget-object v0, p0, LI/o1;->a:LH/l;

    invoke-virtual {v0}, LH/l;->l()LH/h;

    move-result-object v0

    return-object v0
.end method

.method public final l()LH/h;
    .locals 1

    iget-object v0, p0, LI/o1;->e:LT/z1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/o1$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI/o1$b;->b()LH/h;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LI/o1;->i()LH/h;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final m(IJ)V
    .locals 5

    invoke-virtual {p0, p2, p3}, LI/o1;->o(J)J

    move-result-wide p2

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-static {p2, p3}, LL0/S;->n(J)I

    move-result v4

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p2

    invoke-virtual {v3, p1, v4, p2}, LI/I;->t(III)V

    const/4 p1, 0x1

    invoke-static {v0, v1, p1, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public final n(I)J
    .locals 3

    iget-object v0, p0, LI/o1;->d:LT/z1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/o1$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI/o1$b;->a()LI/S0;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, LI/o1;->e:LT/z1;

    if-eqz v2, :cond_1

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI/o1$b;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LI/o1$b;->a()LI/S0;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, LI/S0;->b(I)J

    move-result-wide v1

    goto :goto_1

    :cond_2
    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v1

    :goto_1
    if-eqz v0, :cond_3

    sget-object p1, LI/o1;->g:LI/o1$a;

    invoke-static {p1, v1, v2, v0}, LI/o1$a;->b(LI/o1$a;JLI/S0;)J

    move-result-wide v1

    :cond_3
    return-wide v1
.end method

.method public final o(J)J
    .locals 3

    iget-object v0, p0, LI/o1;->d:LT/z1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/o1$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI/o1$b;->a()LI/S0;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, LI/o1;->e:LT/z1;

    if-eqz v2, :cond_1

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI/o1$b;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LI/o1$b;->a()LI/S0;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    sget-object v2, LI/o1;->g:LI/o1$a;

    invoke-static {v2, p1, p2, v1}, LI/o1$a;->b(LI/o1$a;JLI/S0;)J

    move-result-wide p1

    :cond_2
    if-eqz v0, :cond_3

    sget-object v1, LI/o1;->g:LI/o1$a;

    invoke-static {v1, p1, p2, v0}, LI/o1$a;->b(LI/o1$a;JLI/S0;)J

    move-result-wide p1

    :cond_3
    return-wide p1
.end method

.method public final p(J)J
    .locals 9

    iget-object v0, p0, LI/o1;->d:LT/z1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/o1$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI/o1$b;->a()LI/S0;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v1

    :goto_0
    iget-object v0, p0, LI/o1;->e:LT/z1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/o1$b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LI/o1$b;->a()LI/S0;

    move-result-object v1

    :cond_1
    if-eqz v5, :cond_2

    sget-object v2, LI/o1;->g:LI/o1$a;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-wide v3, p1

    invoke-static/range {v2 .. v8}, LI/o1$a;->g(LI/o1$a;JLI/S0;LI/X0;ILjava/lang/Object;)J

    move-result-wide p1

    :cond_2
    if-eqz v1, :cond_3

    sget-object v0, LI/o1;->g:LI/o1$a;

    invoke-virtual {p0}, LI/o1;->j()LI/X0;

    move-result-object v2

    invoke-static {v0, p1, p2, v1, v2}, LI/o1$a;->c(LI/o1$a;JLI/S0;LI/X0;)J

    move-result-wide p1

    :cond_3
    return-wide p1
.end method

.method public final q(I)V
    .locals 2

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LI/o1;->y(J)V

    return-void
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, LI/o1;->a:LH/l;

    invoke-virtual {v0}, LH/l;->k()LH/r;

    move-result-object v0

    invoke-virtual {v0}, LH/r;->a()V

    return-void
.end method

.method public final s(Ljava/lang/CharSequence;)V
    .locals 5

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-static {v3}, LI/H;->b(LI/I;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x1

    invoke-static {v3, p1, v4}, LI/H;->a(LI/I;Ljava/lang/String;I)V

    invoke-static {v0, v1, v4, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public final t(Ljava/lang/CharSequence;ZLK/c;)V
    .locals 6

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v2

    invoke-virtual {v2}, LI/I;->f()LI/m;

    move-result-object v2

    invoke-virtual {v2}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v2

    if-eqz p2, :cond_0

    invoke-virtual {v2}, LI/I;->c()V

    :cond_0
    invoke-virtual {v2}, LI/I;->m()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result p2

    invoke-static {v3, v4}, LL0/S;->k(J)I

    move-result v5

    invoke-virtual {v2, p2, v5, p1}, LI/I;->q(IILjava/lang/CharSequence;)V

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/2addr p2, p1

    invoke-virtual {v2, p2, p2}, LI/I;->u(II)V

    const/4 p1, 0x1

    invoke-static {v0, v1, p1, p3}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TransformedTextFieldState(textFieldState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/o1;->a:LH/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputTransformation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputTransformedText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/o1;->d:LT/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", codepointTransformation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/o1;->c:LI/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", codepointTransformedText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/o1;->e:LT/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputText=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI/o1;->i()LH/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\", visualText=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ljava/lang/CharSequence;JLK/c;Z)V
    .locals 5

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v2

    invoke-virtual {v2}, LI/I;->f()LI/m;

    move-result-object v2

    invoke-virtual {v2}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v2

    invoke-virtual {p0, p2, p3}, LI/o1;->o(J)J

    move-result-wide p2

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result v3

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result v4

    invoke-virtual {v2, v3, v4, p1}, LI/I;->q(IILjava/lang/CharSequence;)V

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/2addr p2, p1

    invoke-virtual {v2, p2, p2}, LI/I;->u(II)V

    invoke-static {v0, v1, p5, p4}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public final x()V
    .locals 6

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->l()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4}, LI/I;->u(II)V

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method

.method public final y(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/o1;->o(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LI/o1;->z(J)V

    return-void
.end method

.method public final z(J)V
    .locals 5

    iget-object v0, p0, LI/o1;->a:LH/l;

    iget-object v1, p0, LI/o1;->b:LH/b;

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v0}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v4

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p1

    invoke-virtual {v3, v4, p1}, LI/I;->u(II)V

    const/4 p1, 0x1

    invoke-static {v0, v1, p1, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    return-void
.end method
