.class public abstract LT/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:Ljava/lang/Object;

.field private static final c:Ljava/lang/Object;

.field private static final d:Ljava/lang/Object;

.field private static final e:Ljava/lang/Object;

.field private static final f:Ljava/lang/Object;

.field private static final g:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT/t0;

    const-string v1, "provider"

    invoke-direct {v0, v1}, LT/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, LT/o;->a:Ljava/lang/Object;

    new-instance v0, LT/t0;

    invoke-direct {v0, v1}, LT/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, LT/o;->b:Ljava/lang/Object;

    new-instance v0, LT/t0;

    const-string v1, "compositionLocalMap"

    invoke-direct {v0, v1}, LT/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, LT/o;->c:Ljava/lang/Object;

    new-instance v0, LT/t0;

    const-string v1, "providerValues"

    invoke-direct {v0, v1}, LT/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, LT/o;->d:Ljava/lang/Object;

    new-instance v0, LT/t0;

    const-string v1, "providers"

    invoke-direct {v0, v1}, LT/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, LT/o;->e:Ljava/lang/Object;

    new-instance v0, LT/t0;

    const-string v1, "reference"

    invoke-direct {v0, v1}, LT/t0;-><init>(Ljava/lang/String;)V

    sput-object v0, LT/o;->f:Ljava/lang/Object;

    new-instance v0, LT/n;

    invoke-direct {v0}, LT/n;-><init>()V

    sput-object v0, LT/o;->g:Ljava/util/Comparator;

    return-void
.end method

.method private static final A(LT/a0;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LT/a0;->d()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, LT/Z;

    invoke-virtual {p0}, LT/a0;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LT/a0;->d()Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LT/Z;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LT/a0;->a()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static final B()Ljava/lang/Object;
    .locals 1

    sget-object v0, LT/o;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public static final C()Ljava/lang/Object;
    .locals 1

    sget-object v0, LT/o;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public static final D()Ljava/lang/Object;
    .locals 1

    sget-object v0, LT/o;->f:Ljava/lang/Object;

    return-object v0
.end method

.method private static final E(Ljava/util/List;ILT/K0;Ljava/lang/Object;)V
    .locals 3

    invoke-static {p0, p1}, LT/o;->w(Ljava/util/List;I)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_1

    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    instance-of v2, p3, LT/H;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, v1

    :goto_0
    new-instance v1, LT/X;

    invoke-direct {v1, p2, p1, p3}, LT/X;-><init>(LT/K0;ILjava/lang/Object;)V

    invoke-interface {p0, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LT/X;

    instance-of p1, p3, LT/H;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, LT/X;->a()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {p0, p3}, LT/X;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of p2, p1, Lo/I;

    if-eqz p2, :cond_3

    check-cast p1, Lo/I;

    invoke-virtual {p1, p3}, Lo/I;->h(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1, p3}, Lo/U;->b(Ljava/lang/Object;Ljava/lang/Object;)Lo/I;

    move-result-object p1

    invoke-virtual {p0, p1}, LT/X;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v1}, LT/X;->e(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static final F(LT/a1;)Z
    .locals 2

    invoke-virtual {p0}, LT/a1;->k()I

    move-result v0

    invoke-virtual {p0}, LT/a1;->u()I

    move-result p0

    const/4 v1, 0x1

    add-int/2addr p0, v1

    if-le v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final G(LT/e1;)Z
    .locals 2

    invoke-virtual {p0}, LT/e1;->a0()I

    move-result v0

    invoke-virtual {p0}, LT/e1;->c0()I

    move-result p0

    const/4 v1, 0x1

    add-int/2addr p0, v1

    if-le v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private static final I(I)Lo/H;
    .locals 1

    new-instance v0, Lo/H;

    invoke-direct {v0, p0}, Lo/H;-><init>(I)V

    invoke-static {v0}, LT/p0;->b(Lo/H;)Lo/H;

    move-result-object p0

    return-object p0
.end method

.method private static final J(LT/a1;III)I
    .locals 4

    if-ne p1, p2, :cond_0

    return p1

    :cond_0
    if-eq p1, p3, :cond_8

    if-ne p2, p3, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {p0, p1}, LT/a1;->P(I)I

    move-result v0

    if-ne v0, p2, :cond_2

    return p2

    :cond_2
    invoke-virtual {p0, p2}, LT/a1;->P(I)I

    move-result v0

    if-ne v0, p1, :cond_3

    return p1

    :cond_3
    invoke-virtual {p0, p1}, LT/a1;->P(I)I

    move-result v0

    invoke-virtual {p0, p2}, LT/a1;->P(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    invoke-virtual {p0, p1}, LT/a1;->P(I)I

    move-result p0

    return p0

    :cond_4
    invoke-static {p0, p1, p3}, LT/o;->u(LT/a1;II)I

    move-result v0

    invoke-static {p0, p2, p3}, LT/o;->u(LT/a1;II)I

    move-result p3

    sub-int v1, v0, p3

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    invoke-virtual {p0, p1}, LT/a1;->P(I)I

    move-result p1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    sub-int/2addr p3, v0

    :goto_1
    if-ge v2, p3, :cond_6

    invoke-virtual {p0, p2}, LT/a1;->P(I)I

    move-result p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    if-eq p1, p2, :cond_7

    invoke-virtual {p0, p1}, LT/a1;->P(I)I

    move-result p1

    invoke-virtual {p0, p2}, LT/a1;->P(I)I

    move-result p2

    goto :goto_2

    :cond_7
    return p1

    :cond_8
    :goto_3
    return p3
.end method

.method public static final K(LT/e1;LT/R0;)V
    .locals 8

    invoke-virtual {p0}, LT/e1;->a0()I

    move-result v0

    invoke-static {p0, v0}, LT/e1;->p(LT/e1;I)I

    move-result v0

    invoke-static {p0}, LT/e1;->i(LT/e1;)[I

    move-result-object v1

    invoke-static {p0, v1, v0}, LT/e1;->c(LT/e1;[II)I

    move-result v0

    invoke-static {p0}, LT/e1;->i(LT/e1;)[I

    move-result-object v1

    invoke-virtual {p0}, LT/e1;->a0()I

    move-result v2

    invoke-virtual {p0}, LT/e1;->a0()I

    move-result v3

    invoke-virtual {p0, v3}, LT/e1;->k0(I)I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {p0, v2}, LT/e1;->p(LT/e1;I)I

    move-result v2

    invoke-static {p0, v1, v2}, LT/e1;->c(LT/e1;[II)I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_4

    invoke-static {p0}, LT/e1;->k(LT/e1;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0, v0}, LT/e1;->d(LT/e1;I)I

    move-result v3

    aget-object v2, v2, v3

    instance-of v3, v2, LT/k;

    const/4 v4, -0x1

    if-eqz v3, :cond_0

    invoke-virtual {p0}, LT/e1;->e0()I

    move-result v3

    sub-int/2addr v3, v0

    move-object v5, v2

    check-cast v5, LT/k;

    invoke-interface {p1, v5, v3, v4, v4}, LT/R0;->b(LT/k;III)V

    :cond_0
    instance-of v3, v2, LT/T0;

    if-eqz v3, :cond_2

    invoke-virtual {p0}, LT/e1;->e0()I

    move-result v3

    sub-int/2addr v3, v0

    move-object v5, v2

    check-cast v5, LT/T0;

    invoke-virtual {v5}, LT/T0;->a()LT/d;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, LT/d;->b()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, LT/e1;->F(LT/d;)I

    move-result v4

    invoke-virtual {p0}, LT/e1;->e0()I

    move-result v6

    invoke-virtual {p0, v4}, LT/e1;->b1(I)I

    move-result v7

    sub-int/2addr v6, v7

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    invoke-virtual {v5}, LT/T0;->b()LT/S0;

    move-result-object v5

    invoke-interface {p1, v5, v3, v4, v6}, LT/R0;->c(LT/S0;III)V

    :cond_2
    instance-of v3, v2, LT/K0;

    if-eqz v3, :cond_3

    check-cast v2, LT/K0;

    invoke-virtual {v2}, LT/K0;->x()V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, LT/e1;->L0()Z

    return-void
.end method

.method private static final L(LT/e1;IILjava/lang/Object;)V
    .locals 1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, LT/e1;->R0(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-ne p3, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, "Slot table is out of sync"

    invoke-static {p0}, LT/o;->r(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static final M(Ljava/util/List;I)LT/X;
    .locals 0

    invoke-static {p0, p1}, LT/o;->w(Ljava/util/List;I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LT/X;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final N(Ljava/util/List;II)V
    .locals 1

    invoke-static {p0, p1}, LT/o;->v(Ljava/util/List;I)I

    move-result p1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/X;

    invoke-virtual {v0}, LT/X;->b()I

    move-result v0

    if-ge v0, p2, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final O(Z)V
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "Check failed"

    invoke-static {p0}, LT/o;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final P()V
    .locals 0

    return-void
.end method

.method public static final Q(IIILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static synthetic a(LT/X;LT/X;)I
    .locals 0

    invoke-static {p0, p1}, LT/o;->b(LT/X;LT/X;)I

    move-result p0

    return p0
.end method

.method private static final b(LT/X;LT/X;)I
    .locals 0

    invoke-virtual {p0}, LT/X;->b()I

    move-result p0

    invoke-virtual {p1}, LT/X;->b()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p0

    return p0
.end method

.method public static final synthetic c(I)Z
    .locals 0

    invoke-static {p0}, LT/o;->n(I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Z)I
    .locals 0

    invoke-static {p0}, LT/o;->o(Z)I

    move-result p0

    return p0
.end method

.method public static final synthetic e(LT/b1;LT/d;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LT/o;->p(LT/b1;LT/d;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ljava/util/List;II)LT/X;
    .locals 0

    invoke-static {p0, p1, p2}, LT/o;->x(Ljava/util/List;II)LT/X;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g()Ljava/util/Comparator;
    .locals 1

    sget-object v0, LT/o;->g:Ljava/util/Comparator;

    return-object v0
.end method

.method public static final synthetic h(LT/a0;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LT/o;->A(LT/a0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Ljava/util/List;ILT/K0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LT/o;->E(Ljava/util/List;ILT/K0;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic j(I)Lo/H;
    .locals 0

    invoke-static {p0}, LT/o;->I(I)Lo/H;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LT/a1;III)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LT/o;->J(LT/a1;III)I

    move-result p0

    return p0
.end method

.method public static final synthetic l(Ljava/util/List;I)LT/X;
    .locals 0

    invoke-static {p0, p1}, LT/o;->M(Ljava/util/List;I)LT/X;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Ljava/util/List;II)V
    .locals 0

    invoke-static {p0, p1, p2}, LT/o;->N(Ljava/util/List;II)V

    return-void
.end method

.method private static final n(I)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final o(Z)I
    .locals 0

    return p0
.end method

.method private static final p(LT/b1;LT/d;)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LT/b1;->D()LT/a1;

    move-result-object v1

    :try_start_0
    invoke-virtual {p0, p1}, LT/b1;->e(LT/d;)I

    move-result p0

    invoke-static {v1, v0, p0}, LT/o;->q(LT/a1;Ljava/util/List;I)V

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, LT/a1;->d()V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, LT/a1;->d()V

    throw p0
.end method

.method private static final q(LT/a1;Ljava/util/List;I)V
    .locals 2

    invoke-virtual {p0, p2}, LT/a1;->J(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, LT/a1;->L(I)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p0, p2}, LT/a1;->E(I)I

    move-result v1

    add-int/2addr p2, v1

    :goto_0
    if-ge v0, p2, :cond_1

    invoke-static {p0, p1, v0}, LT/o;->q(LT/a1;Ljava/util/List;I)V

    invoke-virtual {p0, v0}, LT/a1;->E(I)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static final r(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroidx/compose/runtime/ComposeRuntimeError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "). Please report to Google or use https://goo.gle/compose-feedback"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/compose/runtime/ComposeRuntimeError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final s(Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Landroidx/compose/runtime/ComposeRuntimeError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "). Please report to Google or use https://goo.gle/compose-feedback"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/compose/runtime/ComposeRuntimeError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final t(LT/e1;LT/R0;)V
    .locals 12

    invoke-virtual {p0}, LT/e1;->a0()I

    move-result v0

    invoke-virtual {p0}, LT/e1;->b0()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_5

    invoke-virtual {p0, v0}, LT/e1;->A0(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LT/k;

    const/4 v4, -0x1

    if-eqz v3, :cond_0

    invoke-virtual {p0}, LT/e1;->e0()I

    move-result v3

    invoke-virtual {p0, v0}, LT/e1;->d1(I)I

    move-result v5

    sub-int/2addr v3, v5

    check-cast v2, LT/k;

    invoke-interface {p1, v2, v3, v4, v4}, LT/R0;->a(LT/k;III)V

    :cond_0
    invoke-static {p0, v0}, LT/e1;->p(LT/e1;I)I

    move-result v2

    invoke-static {p0}, LT/e1;->i(LT/e1;)[I

    move-result-object v3

    invoke-static {p0, v3, v2}, LT/e1;->A(LT/e1;[II)I

    move-result v2

    invoke-static {p0}, LT/e1;->i(LT/e1;)[I

    move-result-object v3

    add-int/lit8 v5, v0, 0x1

    invoke-static {p0, v5}, LT/e1;->p(LT/e1;I)I

    move-result v6

    invoke-static {p0, v3, v6}, LT/e1;->c(LT/e1;[II)I

    move-result v3

    move v6, v2

    :goto_1
    if-ge v6, v3, :cond_4

    sub-int v7, v6, v2

    invoke-static {p0}, LT/e1;->k(LT/e1;)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {p0, v6}, LT/e1;->d(LT/e1;I)I

    move-result v9

    aget-object v8, v8, v9

    instance-of v9, v8, LT/T0;

    if-eqz v9, :cond_2

    move-object v9, v8

    check-cast v9, LT/T0;

    invoke-virtual {v9}, LT/T0;->b()LT/S0;

    move-result-object v10

    instance-of v11, v10, LT/V0;

    if-nez v11, :cond_3

    invoke-static {p0, v0, v7, v8}, LT/o;->L(LT/e1;IILjava/lang/Object;)V

    invoke-virtual {p0}, LT/e1;->e0()I

    move-result v8

    sub-int/2addr v8, v7

    invoke-virtual {v9}, LT/T0;->a()LT/d;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, LT/d;->b()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {p0, v7}, LT/e1;->F(LT/d;)I

    move-result v7

    invoke-virtual {p0}, LT/e1;->e0()I

    move-result v9

    invoke-virtual {p0, v7}, LT/e1;->b1(I)I

    move-result v11

    sub-int/2addr v9, v11

    goto :goto_2

    :cond_1
    move v7, v4

    move v9, v7

    :goto_2
    invoke-interface {p1, v10, v8, v7, v9}, LT/R0;->c(LT/S0;III)V

    goto :goto_3

    :cond_2
    instance-of v9, v8, LT/K0;

    if-eqz v9, :cond_3

    invoke-static {p0, v0, v7, v8}, LT/o;->L(LT/e1;IILjava/lang/Object;)V

    check-cast v8, LT/K0;

    invoke-virtual {v8}, LT/K0;->x()V

    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    move v0, v5

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method private static final u(LT/a1;II)I
    .locals 1

    const/4 v0, 0x0

    :goto_0
    if-lez p1, :cond_0

    if-eq p1, p2, :cond_0

    invoke-virtual {p0, p1}, LT/a1;->P(I)I

    move-result p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method private static final v(Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1}, LT/o;->w(Ljava/util/List;I)I

    move-result p0

    if-gez p0, :cond_0

    add-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    :cond_0
    return p0
.end method

.method private static final w(Ljava/util/List;I)I
    .locals 4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT/X;

    invoke-virtual {v3}, LT/X;->b()I

    move-result v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-lez v3, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    neg-int p0, v1

    return p0
.end method

.method private static final x(Ljava/util/List;II)LT/X;
    .locals 1

    invoke-static {p0, p1}, LT/o;->v(Ljava/util/List;I)I

    move-result p1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LT/X;

    invoke-virtual {p0}, LT/X;->b()I

    move-result p1

    if-ge p1, p2, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final y()Ljava/lang/Object;
    .locals 1

    sget-object v0, LT/o;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public static final z()Ljava/lang/Object;
    .locals 1

    sget-object v0, LT/o;->a:Ljava/lang/Object;

    return-object v0
.end method
