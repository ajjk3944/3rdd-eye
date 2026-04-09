.class final LN/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/f;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F


# direct methods
.method private constructor <init>(FFFFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LN/v;->a:F

    .line 4
    iput p2, p0, LN/v;->b:F

    .line 5
    iput p3, p0, LN/v;->c:F

    .line 6
    iput p4, p0, LN/v;->d:F

    .line 7
    iput p5, p0, LN/v;->e:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LN/v;-><init>(FFFFF)V

    return-void
.end method

.method public static final synthetic b(LN/v;)F
    .locals 0

    iget p0, p0, LN/v;->e:F

    return p0
.end method

.method public static final synthetic c(LN/v;)F
    .locals 0

    iget p0, p0, LN/v;->d:F

    return p0
.end method

.method public static final synthetic d(LN/v;)F
    .locals 0

    iget p0, p0, LN/v;->b:F

    return p0
.end method


# virtual methods
.method public a(ZLy/k;LT/l;I)LT/z1;
    .locals 18

    move-object/from16 v7, p0

    move/from16 v3, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v1, p4

    const v2, -0x5eb281ab

    invoke-interface {v8, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:506)"

    invoke-static {v2, v1, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_1

    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object v2

    invoke-interface {v8, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Landroidx/compose/runtime/snapshots/k;

    and-int/lit8 v5, v1, 0x70

    xor-int/lit8 v5, v5, 0x30

    const/16 v6, 0x20

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-le v5, v6, :cond_2

    invoke-interface {v8, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    and-int/lit8 v5, v1, 0x30

    if-ne v5, v6, :cond_4

    :cond_3
    move v5, v9

    goto :goto_0

    :cond_4
    move v5, v10

    :goto_0
    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_5

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_6

    :cond_5
    new-instance v6, LN/v$a;

    const/4 v5, 0x0

    invoke-direct {v6, v0, v2, v5}, LN/v$a;-><init>(Ly/k;Landroidx/compose/runtime/snapshots/k;Ldh/e;)V

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lmh/p;

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v0, v6, v8, v5}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {v2}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ly/j;

    if-nez v3, :cond_7

    iget v0, v7, LN/v;->c:F

    :goto_1
    move v2, v0

    goto :goto_2

    :cond_7
    instance-of v0, v5, Ly/o$b;

    if-eqz v0, :cond_8

    iget v0, v7, LN/v;->b:F

    goto :goto_1

    :cond_8
    instance-of v0, v5, Ly/g;

    if-eqz v0, :cond_9

    iget v0, v7, LN/v;->d:F

    goto :goto_1

    :cond_9
    instance-of v0, v5, Ly/d;

    if-eqz v0, :cond_a

    iget v0, v7, LN/v;->e:F

    goto :goto_1

    :cond_a
    iget v0, v7, LN/v;->a:F

    goto :goto_1

    :goto_2
    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_b

    new-instance v0, Lr/a;

    invoke-static {v2}, LY0/h;->d(F)LY0/h;

    move-result-object v12

    sget-object v6, LY0/h;->b:LY0/h$a;

    invoke-static {v6}, Lr/u0;->b(LY0/h$a;)Lr/s0;

    move-result-object v13

    const/16 v16, 0xc

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v17}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v0

    check-cast v11, Lr/a;

    invoke-static {v2}, LY0/h;->d(F)LY0/h;

    move-result-object v12

    invoke-interface {v8, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v8, v2}, LT/l;->g(F)Z

    move-result v6

    or-int/2addr v0, v6

    and-int/lit8 v6, v1, 0xe

    xor-int/lit8 v6, v6, 0x6

    const/4 v13, 0x4

    if-le v6, v13, :cond_c

    invoke-interface {v8, v3}, LT/l;->c(Z)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    and-int/lit8 v6, v1, 0x6

    if-ne v6, v13, :cond_e

    :cond_d
    move v6, v9

    goto :goto_3

    :cond_e
    move v6, v10

    :goto_3
    or-int/2addr v0, v6

    and-int/lit16 v6, v1, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v13, 0x100

    if-le v6, v13, :cond_f

    invoke-interface {v8, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_f
    and-int/lit16 v1, v1, 0x180

    if-ne v1, v13, :cond_10

    goto :goto_4

    :cond_10
    move v9, v10

    :cond_11
    :goto_4
    or-int/2addr v0, v9

    invoke-interface {v8, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_13

    :cond_12
    new-instance v9, LN/v$b;

    const/4 v6, 0x0

    move-object v0, v9

    move-object v1, v11

    move/from16 v3, p1

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v6}, LN/v$b;-><init>(Lr/a;FZLN/v;Ly/j;Ldh/e;)V

    invoke-interface {v8, v9}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v9

    :cond_13
    check-cast v1, Lmh/p;

    invoke-static {v12, v1, v8, v10}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {v11}, Lr/a;->g()LT/z1;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    return-object v0
.end method
