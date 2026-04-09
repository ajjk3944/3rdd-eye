.class public final LN/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/v0;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/v0;

    invoke-direct {v0}, LN/v0;-><init>()V

    sput-object v0, LN/v0;->a:LN/v0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JJJLT/l;II)LN/u0;
    .locals 19

    move-object/from16 v0, p7

    move/from16 v1, p8

    and-int/lit8 v2, p9, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->l()J

    move-result-wide v4

    move-wide v7, v4

    goto :goto_0

    :cond_0
    move-wide/from16 v7, p1

    :goto_0
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_1

    sget-object v2, LN/f0;->a:LN/f0;

    invoke-virtual {v2, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->i()J

    move-result-wide v9

    const/16 v15, 0xe

    const/16 v16, 0x0

    const v11, 0x3f19999a    # 0.6f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v9, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v9, p3

    :goto_1
    const/4 v2, 0x4

    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_2

    sget-object v4, LN/f0;->a:LN/f0;

    invoke-virtual {v4, v0, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v4

    invoke-virtual {v4}, LN/m;->i()J

    move-result-wide v11

    sget-object v4, LN/r;->a:LN/r;

    invoke-virtual {v4, v0, v3}, LN/r;->b(LT/l;I)F

    move-result v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide v11, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v11, p5

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, -0x1

    const-string v5, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:165)"

    const v6, 0x51b3583a

    invoke-static {v6, v1, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    and-int/lit8 v4, v1, 0xe

    xor-int/2addr v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v3, v2, :cond_4

    invoke-interface {v0, v7, v8}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    and-int/lit8 v3, v1, 0x6

    if-ne v3, v2, :cond_6

    :cond_5
    move v2, v5

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_3
    and-int/lit8 v3, v1, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v6, 0x20

    if-le v3, v6, :cond_7

    invoke-interface {v0, v9, v10}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    and-int/lit8 v3, v1, 0x30

    if-ne v3, v6, :cond_9

    :cond_8
    move v3, v5

    goto :goto_4

    :cond_9
    move v3, v4

    :goto_4
    or-int/2addr v2, v3

    and-int/lit16 v3, v1, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v6, 0x100

    if-le v3, v6, :cond_a

    invoke-interface {v0, v11, v12}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    and-int/lit16 v1, v1, 0x180

    if-ne v1, v6, :cond_c

    :cond_b
    move v4, v5

    :cond_c
    or-int v1, v2, v4

    invoke-interface/range {p7 .. p7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_d

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_e

    :cond_d
    new-instance v2, LN/A;

    const/4 v13, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v13}, LN/A;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, LN/A;

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    return-object v2
.end method
