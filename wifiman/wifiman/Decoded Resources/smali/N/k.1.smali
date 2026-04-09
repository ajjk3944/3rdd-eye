.class public final LN/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/k;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/k;

    invoke-direct {v0}, LN/k;-><init>()V

    sput-object v0, LN/k;->a:LN/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJJJLT/l;II)LN/j;
    .locals 30

    move-object/from16 v0, p11

    move/from16 v1, p12

    and-int/lit8 v2, p13, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->l()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v2, p13, 0x2

    if-eqz v2, :cond_1

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->i()J

    move-result-wide v6

    const/16 v12, 0xe

    const/4 v13, 0x0

    const v8, 0x3f19999a    # 0.6f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    move-wide v11, v6

    goto :goto_1

    :cond_1
    move-wide/from16 v11, p3

    :goto_1
    and-int/lit8 v2, p13, 0x4

    if-eqz v2, :cond_2

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->n()J

    move-result-wide v6

    move-wide v7, v6

    goto :goto_2

    :cond_2
    move-wide/from16 v7, p5

    :goto_2
    and-int/lit8 v2, p13, 0x8

    if-eqz v2, :cond_3

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->i()J

    move-result-wide v9

    sget-object v2, LN/r;->a:LN/r;

    invoke-virtual {v2, v0, v3}, LN/r;->b(LT/l;I)F

    move-result v2

    const/16 v6, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 p1, v9

    move/from16 p3, v2

    move/from16 p4, v14

    move/from16 p5, v15

    move/from16 p6, v16

    move/from16 p7, v6

    move-object/from16 p8, v13

    invoke-static/range {p1 .. p8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    move-wide v13, v9

    goto :goto_3

    :cond_3
    move-wide/from16 v13, p7

    :goto_3
    and-int/lit8 v2, p13, 0x10

    if-eqz v2, :cond_4

    sget-object v2, LN/r;->a:LN/r;

    invoke-virtual {v2, v0, v3}, LN/r;->b(LT/l;I)F

    move-result v2

    const/16 v6, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 p1, v4

    move/from16 p3, v2

    move/from16 p4, v10

    move/from16 p5, v15

    move/from16 p6, v16

    move/from16 p7, v6

    move-object/from16 p8, v9

    invoke-static/range {p1 .. p8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p9

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v6, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:231)"

    const v15, 0x1bfc5e88

    invoke-static {v15, v1, v2, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    and-int/lit8 v2, v1, 0xe

    xor-int/2addr v2, v3

    const/4 v3, 0x4

    const/4 v15, 0x1

    if-le v2, v3, :cond_6

    invoke-interface {v0, v4, v5}, LT/l;->j(J)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    and-int/lit8 v2, v1, 0x6

    if-ne v2, v3, :cond_8

    :cond_7
    move v2, v15

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    and-int/lit8 v3, v1, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v6, 0x20

    if-le v3, v6, :cond_9

    invoke-interface {v0, v11, v12}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    and-int/lit8 v3, v1, 0x30

    if-ne v3, v6, :cond_b

    :cond_a
    move v3, v15

    goto :goto_6

    :cond_b
    const/4 v3, 0x0

    :goto_6
    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v6, 0x100

    if-le v3, v6, :cond_c

    invoke-interface {v0, v7, v8}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    and-int/lit16 v3, v1, 0x180

    if-ne v3, v6, :cond_e

    :cond_d
    move v3, v15

    goto :goto_7

    :cond_e
    const/4 v3, 0x0

    :goto_7
    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x1c00

    xor-int/lit16 v3, v3, 0xc00

    const/16 v6, 0x800

    if-le v3, v6, :cond_f

    invoke-interface {v0, v13, v14}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_10

    :cond_f
    and-int/lit16 v3, v1, 0xc00

    if-ne v3, v6, :cond_11

    :cond_10
    move v3, v15

    goto :goto_8

    :cond_11
    const/4 v3, 0x0

    :goto_8
    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    xor-int/lit16 v3, v3, 0x6000

    const/16 v6, 0x4000

    if-le v3, v6, :cond_12

    invoke-interface {v0, v9, v10}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    and-int/lit16 v1, v1, 0x6000

    if-ne v1, v6, :cond_14

    :cond_13
    move v6, v15

    goto :goto_9

    :cond_14
    const/4 v6, 0x0

    :goto_9
    or-int v1, v2, v6

    invoke-interface/range {p11 .. p11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_15

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_16

    :cond_15
    const/16 v1, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 p1, v7

    move/from16 p3, v3

    move/from16 p4, v6

    move/from16 p5, v15

    move/from16 p6, v16

    move/from16 p7, v1

    move-object/from16 p8, v2

    invoke-static/range {p1 .. p8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move-wide/from16 v27, v9

    move-wide v9, v1

    const/16 v1, 0xe

    const/4 v2, 0x0

    move-wide/from16 p1, v4

    move/from16 p7, v1

    move-object/from16 p8, v2

    invoke-static/range {p1 .. p8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move-wide/from16 v25, v13

    move-wide v13, v1

    const/16 v1, 0xe

    const/4 v2, 0x0

    move-wide/from16 p1, v25

    move/from16 p7, v1

    move-object/from16 p8, v2

    invoke-static/range {p1 .. p8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v17

    new-instance v2, LN/w;

    move-object v6, v2

    const/16 v29, 0x0

    move-wide/from16 v23, v11

    move-wide v11, v4

    move-wide/from16 v15, v25

    move-wide/from16 v19, v27

    move-wide/from16 v21, v4

    invoke-direct/range {v6 .. v29}, LN/w;-><init>(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v2, LN/w;

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    return-object v2
.end method
