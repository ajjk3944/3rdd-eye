.class public abstract Landroidx/compose/animation/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/s0;

.field private static final b:Lr/h0;

.field private static final c:Lr/h0;

.field private static final d:Lr/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Landroidx/compose/animation/g$a;->a:Landroidx/compose/animation/g$a;

    sget-object v1, Landroidx/compose/animation/g$b;->a:Landroidx/compose/animation/g$b;

    invoke-static {v0, v1}, Lr/u0;->a(Lmh/l;Lmh/l;)Lr/s0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/g;->a:Lr/s0;

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v0, v3}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/g;->b:Lr/h0;

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-static {v0}, Lr/I0;->c(LY0/n$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/n;->b(J)LY0/n;

    move-result-object v0

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v4, v3}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/g;->c:Lr/h0;

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-static {v0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v5

    invoke-static {v5, v6}, LY0/r;->b(J)LY0/r;

    move-result-object v0

    invoke-static {v1, v2, v0, v4, v3}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/g;->d:Lr/h0;

    return-void
.end method

.method public static final A(Lr/H;Lmh/l;)Landroidx/compose/animation/i;
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$v;

    invoke-direct {v0, p1}, Landroidx/compose/animation/g$v;-><init>(Lmh/l;)V

    invoke-static {p0, v0}, Landroidx/compose/animation/g;->z(Lr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final B(Lr/H;Lmh/l;)Landroidx/compose/animation/i;
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$w;

    invoke-direct {v0, p1}, Landroidx/compose/animation/g$w;-><init>(Lmh/l;)V

    invoke-static {p0, v0}, Landroidx/compose/animation/g;->z(Lr/H;Lmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final C(Lr/H;Lmh/l;)Landroidx/compose/animation/k;
    .locals 11

    new-instance v0, Landroidx/compose/animation/l;

    new-instance v10, Lq/A;

    new-instance v3, Lq/w;

    invoke-direct {v3, p1, p0}, Lq/w;-><init>(Lmh/l;Lr/H;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/l;-><init>(Lq/A;)V

    return-object v0
.end method

.method public static final D(Lr/H;Lmh/l;)Landroidx/compose/animation/k;
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$x;

    invoke-direct {v0, p1}, Landroidx/compose/animation/g$x;-><init>(Lmh/l;)V

    invoke-static {p0, v0}, Landroidx/compose/animation/g;->C(Lr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static final E(Lr/H;Lmh/l;)Landroidx/compose/animation/k;
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$y;

    invoke-direct {v0, p1}, Landroidx/compose/animation/g$y;-><init>(Lmh/l;)V

    invoke-static {p0, v0}, Landroidx/compose/animation/g;->C(Lr/H;Lmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lf0/c$b;)Lf0/c;
    .locals 2

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lf0/c$a;->h()Lf0/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Lf0/c$a;->f()Lf0/c;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lf0/c$a;->e()Lf0/c;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final G(Lf0/c$c;)Lf0/c;
    .locals 2

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lf0/c$a;->m()Lf0/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf0/c$a;->a()Lf0/c$c;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Lf0/c$a;->b()Lf0/c;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lf0/c$a;->e()Lf0/c;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final H(Lr/o0;Landroidx/compose/animation/i;LT/l;I)Landroidx/compose/animation/i;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)"

    const v2, 0x149cfa6

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LT/q0;

    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lq/k;->Visible:Lq/k;

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lr/o0;->u()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {v0, p1}, Landroidx/compose/animation/g;->J(LT/q0;Landroidx/compose/animation/i;)V

    goto :goto_1

    :cond_6
    sget-object p0, Landroidx/compose/animation/i;->a:Landroidx/compose/animation/i$a;

    invoke-virtual {p0}, Landroidx/compose/animation/i$a;->a()Landroidx/compose/animation/i;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/compose/animation/g;->J(LT/q0;Landroidx/compose/animation/i;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lq/k;->Visible:Lq/k;

    if-ne p0, p2, :cond_8

    invoke-static {v0}, Landroidx/compose/animation/g;->I(LT/q0;)Landroidx/compose/animation/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/compose/animation/g;->J(LT/q0;Landroidx/compose/animation/i;)V

    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/compose/animation/g;->I(LT/q0;)Landroidx/compose/animation/i;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-object p0
.end method

.method private static final I(LT/q0;)Landroidx/compose/animation/i;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/i;

    return-object p0
.end method

.method private static final J(LT/q0;Landroidx/compose/animation/i;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final K(Lr/o0;Landroidx/compose/animation/k;LT/l;I)Landroidx/compose/animation/k;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)"

    const v2, -0x514aece4

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LT/q0;

    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lq/k;->Visible:Lq/k;

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lr/o0;->u()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {v0, p1}, Landroidx/compose/animation/g;->M(LT/q0;Landroidx/compose/animation/k;)V

    goto :goto_1

    :cond_6
    sget-object p0, Landroidx/compose/animation/k;->a:Landroidx/compose/animation/k$a;

    invoke-virtual {p0}, Landroidx/compose/animation/k$a;->a()Landroidx/compose/animation/k;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/compose/animation/g;->M(LT/q0;Landroidx/compose/animation/k;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lq/k;->Visible:Lq/k;

    if-eq p0, p2, :cond_8

    invoke-static {v0}, Landroidx/compose/animation/g;->L(LT/q0;)Landroidx/compose/animation/k;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/compose/animation/g;->M(LT/q0;Landroidx/compose/animation/k;)V

    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/compose/animation/g;->L(LT/q0;)Landroidx/compose/animation/k;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-object p0
.end method

.method private static final L(LT/q0;)Landroidx/compose/animation/k;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/k;

    return-object p0
.end method

.method private static final M(LT/q0;Landroidx/compose/animation/k;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lr/o0$a;Lr/o0$a;Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lr/o0$a;)Lmh/l;
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/g;->f(Lr/o0$a;Lr/o0$a;Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lr/o0$a;)Lmh/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lr/h0;
    .locals 1

    sget-object v0, Landroidx/compose/animation/g;->b:Lr/h0;

    return-object v0
.end method

.method public static final synthetic c()Lr/h0;
    .locals 1

    sget-object v0, Landroidx/compose/animation/g;->c:Lr/h0;

    return-object v0
.end method

.method public static final synthetic d()Lr/h0;
    .locals 1

    sget-object v0, Landroidx/compose/animation/g;->d:Lr/h0;

    return-object v0
.end method

.method private static final e(Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LT/l;I)Lq/p;
    .locals 20

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)"

    const v3, 0x264802d5

    invoke-static {v3, v8, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->c()Lq/m;

    move-result-object v1

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v1, :cond_2

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->c()Lq/m;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v10

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v9

    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v2

    invoke-virtual {v2}, Lq/A;->e()Lq/t;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v2

    invoke-virtual {v2}, Lq/A;->e()Lq/t;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    move v11, v10

    goto :goto_3

    :cond_4
    :goto_2
    move v11, v9

    :goto_3
    const/4 v12, 0x0

    if-eqz v1, :cond_6

    const v1, -0x28419f14

    invoke-interface {v7, v1}, LT/l;->U(I)V

    sget-object v1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v1}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v2

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " alpha"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    and-int/lit8 v1, v8, 0xe

    or-int/lit16 v5, v1, 0x180

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p4

    invoke-static/range {v1 .. v6}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object v1

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    move-object v14, v1

    goto :goto_4

    :cond_6
    const v1, -0x283f88d1

    invoke-interface {v7, v1}, LT/l;->U(I)V

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    move-object v14, v12

    :goto_4
    if-eqz v11, :cond_8

    const v1, -0x283ea3b4

    invoke-interface {v7, v1}, LT/l;->U(I)V

    sget-object v1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v1}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v1

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " scale"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Ljava/lang/String;

    and-int/lit8 v0, v8, 0xe

    or-int/lit16 v4, v0, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p4

    invoke-static/range {v0 .. v5}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object v0

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    move-object v15, v0

    goto :goto_5

    :cond_8
    const v0, -0x283c8d71

    invoke-interface {v7, v0}, LT/l;->U(I)V

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    move-object v15, v12

    :goto_5
    if-eqz v11, :cond_9

    const v0, -0x283b7fa4

    invoke-interface {v7, v0}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/animation/g;->a:Lr/s0;

    and-int/lit8 v0, v8, 0xe

    or-int/lit16 v4, v0, 0x180

    const/4 v5, 0x0

    const-string v2, "TransformOriginInterruptionHandling"

    move-object/from16 v0, p0

    move-object/from16 v3, p4

    invoke-static/range {v0 .. v5}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object v12

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    goto :goto_6

    :cond_9
    const v0, -0x28392d51

    invoke-interface {v7, v0}, LT/l;->U(I)V

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    :goto_6
    invoke-interface {v7, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v1, v8, 0x70

    xor-int/lit8 v1, v1, 0x30

    const/16 v2, 0x20

    if-le v1, v2, :cond_a

    move-object/from16 v1, p1

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_7

    :cond_a
    move-object/from16 v1, p1

    :goto_7
    and-int/lit8 v3, v8, 0x30

    if-ne v3, v2, :cond_c

    :cond_b
    move v2, v9

    goto :goto_8

    :cond_c
    move v2, v10

    :goto_8
    or-int/2addr v0, v2

    and-int/lit16 v2, v8, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v3, 0x100

    if-le v2, v3, :cond_d

    move-object/from16 v2, p2

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_9

    :cond_d
    move-object/from16 v2, p2

    :goto_9
    and-int/lit16 v4, v8, 0x180

    if-ne v4, v3, :cond_f

    :cond_e
    move v3, v9

    goto :goto_a

    :cond_f
    move v3, v10

    :goto_a
    or-int/2addr v0, v3

    invoke-interface {v7, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    and-int/lit8 v3, v8, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    if-le v3, v4, :cond_10

    move-object/from16 v3, p0

    invoke-interface {v7, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_b

    :cond_10
    move-object/from16 v3, p0

    :goto_b
    and-int/lit8 v5, v8, 0x6

    if-ne v5, v4, :cond_11

    goto :goto_c

    :cond_11
    move v9, v10

    :cond_12
    :goto_c
    or-int/2addr v0, v9

    invoke-interface {v7, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_13

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_14

    :cond_13
    new-instance v4, Lq/l;

    move-object v13, v4

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move-object/from16 v19, v12

    invoke-direct/range {v13 .. v19}, Lq/l;-><init>(Lr/o0$a;Lr/o0$a;Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lr/o0$a;)V

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lq/p;

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    return-object v4
.end method

.method private static final f(Lr/o0$a;Lr/o0$a;Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lr/o0$a;)Lmh/l;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance v1, Landroidx/compose/animation/g$c;

    invoke-direct {v1, p3, p4}, Landroidx/compose/animation/g$c;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V

    new-instance v2, Landroidx/compose/animation/g$d;

    invoke-direct {v2, p3, p4}, Landroidx/compose/animation/g$d;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V

    invoke-virtual {p0, v1, v2}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v1, Landroidx/compose/animation/g$f;

    invoke-direct {v1, p3, p4}, Landroidx/compose/animation/g$f;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V

    new-instance v2, Landroidx/compose/animation/g$g;

    invoke-direct {v2, p3, p4}, Landroidx/compose/animation/g$g;-><init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V

    invoke-virtual {p1, v1, v2}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    invoke-virtual {p2}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Lq/k;->PreEnter:Lq/k;

    if-ne p2, v1, :cond_4

    invoke-virtual {p3}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p2

    invoke-virtual {p2}, Lq/A;->e()Lq/t;

    move-result-object p2

    if-eqz p2, :cond_2

    :goto_2
    invoke-virtual {p2}, Lq/t;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p2

    goto :goto_4

    :cond_2
    invoke-virtual {p4}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p2

    invoke-virtual {p2}, Lq/A;->e()Lq/t;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v0

    goto :goto_4

    :cond_4
    invoke-virtual {p4}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p2

    invoke-virtual {p2}, Lq/A;->e()Lq/t;

    move-result-object p2

    if-eqz p2, :cond_5

    :goto_3
    invoke-virtual {p2}, Lq/t;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p2

    goto :goto_4

    :cond_5
    invoke-virtual {p3}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p2

    invoke-virtual {p2}, Lq/A;->e()Lq/t;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_3

    :goto_4
    if-eqz p5, :cond_6

    sget-object v0, Landroidx/compose/animation/g$h;->a:Landroidx/compose/animation/g$h;

    new-instance v1, Landroidx/compose/animation/g$i;

    invoke-direct {v1, p2, p3, p4}, Landroidx/compose/animation/g$i;-><init>(Landroidx/compose/ui/graphics/f;Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V

    invoke-virtual {p5, v0, v1}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object v0

    :cond_6
    new-instance p2, Landroidx/compose/animation/g$e;

    invoke-direct {p2, p0, p1, v0}, Landroidx/compose/animation/g$e;-><init>(LT/z1;LT/z1;LT/z1;)V

    return-object p2
.end method

.method public static final g(Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/a;Ljava/lang/String;LT/l;II)Landroidx/compose/ui/e;
    .locals 21

    move-object/from16 v6, p0

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/compose/animation/g$j;->a:Landroidx/compose/animation/g$j;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p3

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)"

    const v2, 0x1af3d96

    invoke-static {v2, v9, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 v11, v9, 0xe

    and-int/lit8 v0, v9, 0x7e

    move-object/from16 v1, p1

    invoke-static {v6, v1, v8, v0}, Landroidx/compose/animation/g;->H(Lr/o0;Landroidx/compose/animation/i;LT/l;I)Landroidx/compose/animation/i;

    move-result-object v12

    shr-int/lit8 v13, v9, 0x3

    and-int/lit8 v0, v13, 0x70

    or-int/2addr v0, v11

    move-object/from16 v1, p2

    invoke-static {v6, v1, v8, v0}, Landroidx/compose/animation/g;->K(Lr/o0;Landroidx/compose/animation/k;LT/l;I)Landroidx/compose/animation/k;

    move-result-object v14

    invoke-virtual {v12}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->f()Lq/w;

    move-result-object v0

    const/4 v15, 0x1

    const/16 v16, 0x0

    if-nez v0, :cond_3

    invoke-virtual {v14}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->f()Lq/w;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v0, v16

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v15

    :goto_2
    invoke-virtual {v12}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->a()Lq/g;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {v14}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v1

    invoke-virtual {v1}, Lq/A;->a()Lq/g;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v17, v16

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v17, v15

    :goto_4
    const/16 v18, 0x0

    if-eqz v0, :cond_7

    const v0, -0x30f533db

    invoke-interface {v8, v0}, LT/l;->U(I)V

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-static {v0}, Lr/u0;->d(LY0/n$a;)Lr/s0;

    move-result-object v1

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " slide"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v11, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    invoke-static/range {v0 .. v5}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object v0

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    move-object/from16 v19, v0

    goto :goto_5

    :cond_7
    const v0, -0x30f3b590

    invoke-interface {v8, v0}, LT/l;->U(I)V

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    move-object/from16 v19, v18

    :goto_5
    if-eqz v17, :cond_9

    const v0, -0x30f28d01

    invoke-interface {v8, v0}, LT/l;->U(I)V

    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-static {v0}, Lr/u0;->e(LY0/r$a;)Lr/s0;

    move-result-object v1

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " shrink/expand"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v11, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    invoke-static/range {v0 .. v5}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object v0

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    move-object/from16 v20, v0

    goto :goto_6

    :cond_9
    const v0, -0x30f0fa21

    invoke-interface {v8, v0}, LT/l;->U(I)V

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    move-object/from16 v20, v18

    :goto_6
    if-eqz v17, :cond_b

    const v0, -0x30effc12

    invoke-interface {v8, v0}, LT/l;->U(I)V

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-static {v0}, Lr/u0;->d(LY0/n$a;)Lr/s0;

    move-result-object v1

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " InterruptionHandlingOffset"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v11, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    invoke-static/range {v0 .. v5}, Lr/p0;->c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;

    move-result-object v0

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    move-object/from16 v18, v0

    goto :goto_7

    :cond_b
    const v0, -0x30edb141

    invoke-interface {v8, v0}, LT/l;->U(I)V

    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    :goto_7
    invoke-virtual {v12}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lq/g;->c()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lq/g;->c()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_8

    :cond_d
    if-nez v17, :cond_e

    :goto_8
    move v5, v15

    goto :goto_9

    :cond_e
    move/from16 v5, v16

    :goto_9
    and-int/lit16 v0, v13, 0x1c00

    or-int/2addr v11, v0

    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v14

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move v7, v5

    move v5, v11

    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/g;->e(Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LT/l;I)Lq/p;

    move-result-object v11

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {v8, v7}, LT/l;->c(Z)Z

    move-result v1

    and-int/lit16 v2, v9, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    const/16 v3, 0x800

    if-le v2, v3, :cond_f

    invoke-interface {v8, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_f
    and-int/lit16 v2, v9, 0xc00

    if-ne v2, v3, :cond_10

    goto :goto_a

    :cond_10
    move/from16 v15, v16

    :cond_11
    :goto_a
    or-int/2addr v1, v15

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_13

    :cond_12
    new-instance v2, Landroidx/compose/animation/g$k;

    invoke-direct {v2, v7, v10}, Landroidx/compose/animation/g$k;-><init>(ZLmh/a;)V

    invoke-interface {v8, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, Lmh/l;

    invoke-static {v0, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v9

    new-instance v13, Landroidx/compose/animation/EnterExitTransitionElement;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, v20

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object v5, v12

    move-object v6, v14

    move-object v7, v10

    move-object v8, v11

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/EnterExitTransitionElement;-><init>(Lr/o0;Lr/o0$a;Lr/o0$a;Lr/o0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/a;Lq/p;)V

    invoke-interface {v9, v13}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    return-object v0
.end method

.method public static final h(Lr/H;Lf0/c$b;ZLmh/l;)Landroidx/compose/animation/i;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/g;->F(Lf0/c$b;)Lf0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/g$m;

    invoke-direct {v0, p3}, Landroidx/compose/animation/g$m;-><init>(Lmh/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/g;->j(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lr/H;Lf0/c$b;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/r;->b:LY0/r$a;

    invoke-static {p0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p1}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/g$l;->a:Landroidx/compose/animation/g$l;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->h(Lr/H;Lf0/c$b;ZLmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/i;
    .locals 11

    new-instance v0, Landroidx/compose/animation/j;

    new-instance v10, Lq/A;

    new-instance v4, Lq/g;

    invoke-direct {v4, p1, p3, p0, p2}, Lq/g;-><init>(Lf0/c;Lmh/l;Lr/H;Z)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/j;-><init>(Lq/A;)V

    return-object v0
.end method

.method public static synthetic k(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/r;->b:LY0/r$a;

    invoke-static {p0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p1}, Lf0/c$a;->c()Lf0/c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/g$n;->a:Landroidx/compose/animation/g$n;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->j(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lr/H;Lf0/c$c;ZLmh/l;)Landroidx/compose/animation/i;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/g;->G(Lf0/c$c;)Lf0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/g$p;

    invoke-direct {v0, p3}, Landroidx/compose/animation/g$p;-><init>(Lmh/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/g;->j(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/r;->b:LY0/r$a;

    invoke-static {p0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p1}, Lf0/c$a;->a()Lf0/c$c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/g$o;->a:Landroidx/compose/animation/g$o;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->l(Lr/H;Lf0/c$c;ZLmh/l;)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lr/H;F)Landroidx/compose/animation/i;
    .locals 11

    new-instance v0, Landroidx/compose/animation/j;

    new-instance v10, Lq/A;

    new-instance v2, Lq/m;

    invoke-direct {v2, p1, p0}, Lq/m;-><init>(FLr/H;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/j;-><init>(Lq/A;)V

    return-object v0
.end method

.method public static synthetic o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;
    .locals 2

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p3, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p3, v1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p1, v0

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/g;->n(Lr/H;F)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lr/H;F)Landroidx/compose/animation/k;
    .locals 11

    new-instance v0, Landroidx/compose/animation/l;

    new-instance v10, Lq/A;

    new-instance v2, Lq/m;

    invoke-direct {v2, p1, p0}, Lq/m;-><init>(FLr/H;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/l;-><init>(Lq/A;)V

    return-object v0
.end method

.method public static synthetic q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;
    .locals 2

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p3, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p3, v1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p1, v0

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/g;->p(Lr/H;F)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lr/H;FJ)Landroidx/compose/animation/i;
    .locals 11

    new-instance v0, Landroidx/compose/animation/j;

    new-instance v10, Lq/A;

    new-instance v7, Lq/t;

    const/4 v6, 0x0

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lq/t;-><init>(FJLr/H;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 p0, 0x0

    move-object v1, v10

    move-object v5, v7

    move-object v7, p0

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/j;-><init>(Lq/A;)V

    return-object v0
.end method

.method public static synthetic s(Lr/H;FJILjava/lang/Object;)Landroidx/compose/animation/i;
    .locals 2

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p5, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p5, v1}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p1, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p2

    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->r(Lr/H;FJ)Landroidx/compose/animation/i;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lr/H;Lf0/c$b;ZLmh/l;)Landroidx/compose/animation/k;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/g;->F(Lf0/c$b;)Lf0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/g$r;

    invoke-direct {v0, p3}, Landroidx/compose/animation/g$r;-><init>(Lmh/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/g;->v(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lr/H;Lf0/c$b;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/r;->b:LY0/r$a;

    invoke-static {p0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p1}, Lf0/c$a;->j()Lf0/c$b;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/g$q;->a:Landroidx/compose/animation/g$q;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->t(Lr/H;Lf0/c$b;ZLmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/k;
    .locals 11

    new-instance v0, Landroidx/compose/animation/l;

    new-instance v10, Lq/A;

    new-instance v4, Lq/g;

    invoke-direct {v4, p1, p3, p0, p2}, Lq/g;-><init>(Lf0/c;Lmh/l;Lr/H;Z)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/l;-><init>(Lq/A;)V

    return-object v0
.end method

.method public static synthetic w(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/r;->b:LY0/r$a;

    invoke-static {p0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p1}, Lf0/c$a;->c()Lf0/c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/g$s;->a:Landroidx/compose/animation/g$s;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->v(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Lr/H;Lf0/c$c;ZLmh/l;)Landroidx/compose/animation/k;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/g;->G(Lf0/c$c;)Lf0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/g$u;

    invoke-direct {v0, p3}, Landroidx/compose/animation/g$u;-><init>(Lmh/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/g;->v(Lr/H;Lf0/c;ZLmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/r;->b:LY0/r$a;

    invoke-static {p0}, Lr/I0;->d(LY0/r$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p1}, Lf0/c$a;->a()Lf0/c$c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/g$t;->a:Landroidx/compose/animation/g$t;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/g;->x(Lr/H;Lf0/c$c;ZLmh/l;)Landroidx/compose/animation/k;

    move-result-object p0

    return-object p0
.end method

.method public static final z(Lr/H;Lmh/l;)Landroidx/compose/animation/i;
    .locals 11

    new-instance v0, Landroidx/compose/animation/j;

    new-instance v10, Lq/A;

    new-instance v3, Lq/w;

    invoke-direct {v3, p1, p0}, Lq/w;-><init>(Lmh/l;Lr/H;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lq/A;-><init>(Lq/m;Lq/w;Lq/g;Lq/t;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/j;-><init>(Lq/A;)V

    return-object v0
.end method
