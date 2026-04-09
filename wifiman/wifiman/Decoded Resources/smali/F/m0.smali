.class public final LF/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LL0/d;

.field private final b:LT/q0;

.field private c:LL0/d;

.field private final d:Landroidx/compose/runtime/snapshots/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LL0/d;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/m0;->a:LL0/d;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LF/m0;->b:LT/q0;

    new-instance v0, LL0/d$a;

    invoke-direct {v0, p1}, LL0/d$a;-><init>(LL0/d;)V

    invoke-virtual {p1}, LL0/d;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, LL0/d;->d(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LL0/d$c;

    invoke-virtual {v3}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL0/i;

    invoke-virtual {v4}, LL0/i;->b()LL0/N;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, LL0/N;->d()LL0/D;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, LL0/d$c;->h()I

    move-result v5

    invoke-virtual {v3}, LL0/d$c;->f()I

    move-result v3

    invoke-virtual {v0, v4, v5, v3}, LL0/d$a;->c(LL0/D;II)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LL0/d$a;->p()LL0/d;

    move-result-object p1

    iput-object p1, p0, LF/m0;->c:LL0/d;

    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object p1

    iput-object p1, p0, LF/m0;->d:Landroidx/compose/runtime/snapshots/k;

    return-void
.end method

.method public static synthetic a(LF/m0;LL0/d$c;LF/r0;)LF/q0;
    .locals 0

    invoke-static {p0, p1, p2}, LF/m0;->u(LF/m0;LL0/d$c;LF/r0;)LF/q0;

    move-result-object p0

    return-object p0
.end method

.method private final c([Ljava/lang/Object;Lmh/l;LT/l;I)V
    .locals 7

    const v0, -0x7c28da43

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_1

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_3

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    array-length v3, p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v4, -0x18d54837

    invoke-interface {p3, v4, v3}, LT/l;->s(ILjava/lang/Object;)V

    array-length v3, p1

    const/4 v4, 0x0

    move v5, v4

    :goto_3
    if-ge v5, v3, :cond_5

    aget-object v6, p1, v5

    invoke-interface {p3, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, 0x4

    goto :goto_4

    :cond_4
    move v6, v4

    :goto_4
    or-int/2addr v1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {p3}, LT/l;->N()V

    and-int/lit8 v3, v1, 0xe

    if-nez v3, :cond_6

    or-int/lit8 v1, v1, 0x2

    :cond_6
    and-int/lit16 v3, v1, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_8

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_7

    :cond_8
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v3, -0x1

    const-string v5, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:298)"

    invoke-static {v0, v1, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    new-instance v0, Lkotlin/jvm/internal/T;

    const/4 v3, 0x2

    invoke-direct {v0, v3}, Lkotlin/jvm/internal/T;-><init>(I)V

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/T;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/T;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/T;->c()I

    move-result v3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/T;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v2, :cond_a

    const/4 v1, 0x1

    goto :goto_6

    :cond_a
    move v1, v4

    :goto_6
    or-int/2addr v1, v3

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_b

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_c

    :cond_b
    new-instance v2, LF/m0$f;

    invoke-direct {v2, p0, p2}, LF/m0$f;-><init>(LF/m0;Lmh/l;)V

    invoke-interface {p3, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lmh/l;

    invoke-static {v0, v2, p3, v4}, LT/O;->d([Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_e

    new-instance v0, LF/m0$g;

    invoke-direct {v0, p0, p1, p2, p4}, LF/m0$g;-><init>(LF/m0;[Ljava/lang/Object;Lmh/l;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_e
    return-void
.end method

.method public static final synthetic d(LF/m0;[Ljava/lang/Object;Lmh/l;LT/l;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LF/m0;->c([Ljava/lang/Object;Lmh/l;LT/l;I)V

    return-void
.end method

.method public static final synthetic e(LF/m0;)Landroidx/compose/runtime/snapshots/k;
    .locals 0

    iget-object p0, p0, LF/m0;->d:Landroidx/compose/runtime/snapshots/k;

    return-object p0
.end method

.method public static final synthetic f(LF/m0;LL0/i;Landroidx/compose/ui/platform/t1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LF/m0;->o(LL0/i;Landroidx/compose/ui/platform/t1;)V

    return-void
.end method

.method public static final synthetic g(LF/m0;LL0/D;LL0/D;)LL0/D;
    .locals 0

    invoke-direct {p0, p1, p2}, LF/m0;->p(LL0/D;LL0/D;)LL0/D;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(LF/m0;LL0/d$c;)Lm0/i1;
    .locals 0

    invoke-direct {p0, p1}, LF/m0;->s(LL0/d$c;)Lm0/i1;

    move-result-object p0

    return-object p0
.end method

.method private final j(LL0/d$c;LL0/M;)LL0/d$c;
    .locals 8

    invoke-virtual {p2}, LL0/M;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v0, v1, v2, v3}, LL0/M;->p(LL0/M;IZILjava/lang/Object;)I

    move-result p2

    invoke-virtual {p1}, LL0/d$c;->h()I

    move-result v0

    if-ge v0, p2, :cond_0

    invoke-virtual {p1}, LL0/d$c;->f()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LL0/d$c;->e(LL0/d$c;Ljava/lang/Object;IILjava/lang/String;ILjava/lang/Object;)LL0/d$c;

    move-result-object v3

    :cond_0
    return-object v3
.end method

.method private final k(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, LF/m0$h;

    invoke-direct {v0, p0, p2}, LF/m0$h;-><init>(LF/m0;LL0/d$c;)V

    invoke-static {p1, v0}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method private final o(LL0/i;Landroidx/compose/ui/platform/t1;)V
    .locals 1

    instance-of v0, p1, LL0/i$b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LL0/i;->a()LL0/j;

    :try_start_0
    check-cast p1, LL0/i$b;

    invoke-virtual {p1}, LL0/i$b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Landroidx/compose/ui/platform/t1;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    instance-of p2, p1, LL0/i$a;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, LL0/i;->a()LL0/j;

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method private final p(LL0/D;LL0/D;)LL0/D;
    .locals 0

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, LL0/D;->y(LL0/D;)LL0/D;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :cond_1
    :goto_0
    return-object p2
.end method

.method private final q(LL0/d$c;)Lm0/U0;
    .locals 5

    invoke-virtual {p0}, LF/m0;->l()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LF/m0;->n()LL0/M;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, v0}, LF/m0;->j(LL0/d$c;LL0/M;)LL0/d$c;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, LL0/d$c;->h()I

    move-result v1

    invoke-virtual {p1}, LL0/d$c;->f()I

    move-result v2

    invoke-virtual {v0, v1, v2}, LL0/M;->z(II)Lm0/U0;

    move-result-object v1

    invoke-virtual {p1}, LL0/d$c;->h()I

    move-result v2

    invoke-virtual {v0, v2}, LL0/M;->d(I)Ll0/i;

    move-result-object v2

    invoke-virtual {p1}, LL0/d$c;->f()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, LL0/M;->d(I)Ll0/i;

    move-result-object v3

    invoke-virtual {p1}, LL0/d$c;->h()I

    move-result v4

    invoke-virtual {v0, v4}, LL0/M;->q(I)I

    move-result v4

    invoke-virtual {p1}, LL0/d$c;->f()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, LL0/M;->q(I)I

    move-result p1

    if-ne v4, p1, :cond_2

    invoke-virtual {v3}, Ll0/i;->k()F

    move-result p1

    invoke-virtual {v2}, Ll0/i;->k()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v2}, Ll0/i;->n()F

    move-result v0

    invoke-static {p1, v0}, Ll0/h;->a(FF)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->u(J)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lm0/U0;->r(J)V

    :cond_3
    :goto_1
    return-object v1
.end method

.method private final s(LL0/d$c;)Lm0/i1;
    .locals 1

    invoke-direct {p0, p1}, LF/m0;->q(LL0/d$c;)Lm0/U0;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LF/m0$i;

    invoke-direct {v0, p1}, LF/m0$i;-><init>(Lm0/U0;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final t(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;
    .locals 2

    new-instance v0, LF/s0;

    new-instance v1, LF/l0;

    invoke-direct {v1, p0, p2}, LF/l0;-><init>(LF/m0;LL0/d$c;)V

    invoke-direct {v0, v1}, LF/s0;-><init>(LF/t0;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method private static final u(LF/m0;LL0/d$c;LF/r0;)LF/q0;
    .locals 2

    invoke-virtual {p0}, LF/m0;->n()LL0/M;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object p0, LF/m0$l;->a:LF/m0$l;

    invoke-virtual {p2, v1, v1, p0}, LF/r0;->a(IILmh/a;)LF/q0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-direct {p0, p1, v0}, LF/m0;->j(LL0/d$c;LL0/M;)LL0/d$c;

    move-result-object p0

    if-nez p0, :cond_1

    sget-object p0, LF/m0$m;->a:LF/m0$m;

    invoke-virtual {p2, v1, v1, p0}, LF/r0;->a(IILmh/a;)LF/q0;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, LL0/d$c;->h()I

    move-result p1

    invoke-virtual {p0}, LL0/d$c;->f()I

    move-result p0

    invoke-virtual {v0, p1, p0}, LL0/M;->z(II)Lm0/U0;

    move-result-object p0

    invoke-interface {p0}, Lm0/U0;->getBounds()Ll0/i;

    move-result-object p0

    invoke-static {p0}, LY0/q;->b(Ll0/i;)LY0/p;

    move-result-object p0

    invoke-virtual {p0}, LY0/p;->j()I

    move-result p1

    invoke-virtual {p0}, LY0/p;->e()I

    move-result v0

    new-instance v1, LF/m0$k;

    invoke-direct {v1, p0}, LF/m0$k;-><init>(LY0/p;)V

    invoke-virtual {p2, p1, v0, v1}, LF/r0;->a(IILmh/a;)LF/q0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p2

    const v2, 0x44d294da

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, v1, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    and-int/lit8 v6, v4, 0x3

    if-ne v6, v5, :cond_3

    invoke-interface {v3}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v3}, LT/l;->C()V

    goto/16 :goto_b

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v6, -0x1

    const-string v7, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:200)"

    invoke-static {v2, v4, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/k0;->s()LT/H0;

    move-result-object v2

    invoke-interface {v3, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/platform/t1;

    iget-object v6, v0, LF/m0;->c:LL0/d;

    invoke-virtual {v6}, LL0/d;->length()I

    move-result v7

    const/4 v8, 0x0

    invoke-virtual {v6, v8, v7}, LL0/d;->d(II)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    move v9, v8

    :goto_3
    if-ge v9, v7, :cond_12

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LL0/d$c;

    invoke-virtual {v10}, LL0/d$c;->h()I

    move-result v11

    invoke-virtual {v10}, LL0/d$c;->f()I

    move-result v12

    if-eq v11, v12, :cond_11

    const v11, 0x52959b10

    invoke-interface {v3, v11}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v11, v13, :cond_5

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v11

    invoke-interface {v3, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v11, Ly/m;

    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-direct {v0, v13, v10}, LF/m0;->k(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-direct {v0, v13, v10}, LF/m0;->t(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;

    move-result-object v13

    const/4 v15, 0x0

    invoke-static {v13, v11, v8, v5, v15}, Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/e;Ly/m;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    sget-object v14, Ly0/t;->a:Ly0/t$a;

    invoke-virtual {v14}, Ly0/t$a;->b()Ly0/t;

    move-result-object v14

    invoke-static {v13, v14, v8, v5, v15}, Ly0/u;->b(Landroidx/compose/ui/e;Ly0/t;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    sget-object v14, LF/m0$a;->a:LF/m0$a;

    const/4 v5, 0x1

    invoke-static {v13, v8, v14, v5, v15}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-interface {v3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v3, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_6

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v14, v5, :cond_7

    :cond_6
    new-instance v14, LF/m0$b;

    invoke-direct {v14, v0, v10, v2}, LF/m0$b;-><init>(LF/m0;LL0/d$c;Landroidx/compose/ui/platform/t1;)V

    invoke-interface {v3, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v22, v14

    check-cast v22, Lmh/a;

    const/16 v23, 0xfc

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v14, v11

    move-object v15, v5

    invoke-static/range {v13 .. v24}, Landroidx/compose/foundation/d;->f(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v5, v3, v8}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual {v10}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LL0/i;

    invoke-virtual {v5}, LL0/i;->b()LL0/N;

    move-result-object v5

    invoke-static {v5}, LF/n0;->a(LL0/N;)Z

    move-result v5

    if-nez v5, :cond_10

    const v5, 0x52a13676

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v5, v13, :cond_8

    new-instance v5, LF/F;

    invoke-direct {v5}, LF/F;-><init>()V

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, LF/F;

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v13, v14, :cond_9

    new-instance v13, LF/m0$c;

    const/4 v14, 0x0

    invoke-direct {v13, v5, v11, v14}, LF/m0$c;-><init>(LF/F;Ly/m;Ldh/e;)V

    invoke-interface {v3, v13}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    const/4 v14, 0x0

    :goto_4
    check-cast v13, Lmh/p;

    const/4 v15, 0x6

    invoke-static {v11, v13, v3, v15}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {v5}, LF/F;->g()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    invoke-virtual {v5}, LF/F;->f()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    invoke-virtual {v5}, LF/F;->h()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    invoke-virtual {v10}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LL0/i;

    invoke-virtual {v11}, LL0/i;->b()LL0/N;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-virtual {v11}, LL0/N;->d()LL0/D;

    move-result-object v11

    move-object/from16 v19, v11

    goto :goto_5

    :cond_a
    move-object/from16 v19, v14

    :goto_5
    invoke-virtual {v10}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LL0/i;

    invoke-virtual {v11}, LL0/i;->b()LL0/N;

    move-result-object v11

    if-eqz v11, :cond_b

    invoke-virtual {v11}, LL0/N;->a()LL0/D;

    move-result-object v11

    move-object/from16 v20, v11

    goto :goto_6

    :cond_b
    move-object/from16 v20, v14

    :goto_6
    invoke-virtual {v10}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LL0/i;

    invoke-virtual {v11}, LL0/i;->b()LL0/N;

    move-result-object v11

    if-eqz v11, :cond_c

    invoke-virtual {v11}, LL0/N;->b()LL0/D;

    move-result-object v11

    move-object/from16 v21, v11

    goto :goto_7

    :cond_c
    move-object/from16 v21, v14

    :goto_7
    invoke-virtual {v10}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LL0/i;

    invoke-virtual {v11}, LL0/i;->b()LL0/N;

    move-result-object v11

    if-eqz v11, :cond_d

    invoke-virtual {v11}, LL0/N;->c()LL0/D;

    move-result-object v11

    move-object/from16 v22, v11

    goto :goto_8

    :cond_d
    move-object/from16 v22, v14

    :goto_8
    filled-new-array/range {v16 .. v22}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v3, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    invoke-interface {v3, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_e

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v14, v12, :cond_f

    :cond_e
    new-instance v14, LF/m0$d;

    invoke-direct {v14, v0, v10, v5}, LF/m0$d;-><init>(LF/m0;LL0/d$c;LF/F;)V

    invoke-interface {v3, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v14, Lmh/l;

    shl-int/lit8 v5, v4, 0x6

    and-int/lit16 v5, v5, 0x380

    invoke-direct {v0, v11, v14, v3, v5}, LF/m0;->c([Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v3}, LT/l;->J()V

    goto :goto_9

    :cond_10
    const v5, 0x52bdb80e

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->J()V

    :goto_9
    invoke-interface {v3}, LT/l;->J()V

    goto :goto_a

    :cond_11
    const v5, 0x52bdee4e

    invoke-interface {v3, v5}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->J()V

    :goto_a
    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x2

    goto/16 :goto_3

    :cond_12
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_b
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_14

    new-instance v3, LF/m0$e;

    invoke-direct {v3, v0, v1}, LF/m0$e;-><init>(LF/m0;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method public final i()LL0/d;
    .locals 6

    iget-object v0, p0, LF/m0;->d:Landroidx/compose/runtime/snapshots/k;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/k;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/m0;->c:LL0/d;

    goto :goto_1

    :cond_0
    new-instance v0, LL0/d$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, LF/m0;->a:LL0/d;

    invoke-virtual {v0, v1}, LL0/d$a;->g(LL0/d;)V

    new-instance v1, LF/P;

    invoke-direct {v1, v0}, LF/P;-><init>(LL0/d$a;)V

    iget-object v3, p0, LF/m0;->d:Landroidx/compose/runtime/snapshots/k;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    :goto_0
    if-ge v2, v4, :cond_1

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmh/l;

    invoke-interface {v5, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    :goto_1
    iput-object v0, p0, LF/m0;->c:LL0/d;

    return-object v0
.end method

.method public final l()Lmh/a;
    .locals 1

    new-instance v0, LF/m0$j;

    invoke-direct {v0, p0}, LF/m0$j;-><init>(LF/m0;)V

    return-object v0
.end method

.method public final m()LL0/d;
    .locals 1

    iget-object v0, p0, LF/m0;->c:LL0/d;

    return-object v0
.end method

.method public final n()LL0/M;
    .locals 1

    iget-object v0, p0, LF/m0;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/M;

    return-object v0
.end method

.method public final r(LL0/M;)V
    .locals 1

    iget-object v0, p0, LF/m0;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
