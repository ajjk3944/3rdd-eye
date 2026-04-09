.class public abstract LQ/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LQ/w$a;->a:LQ/w$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, LQ/w;->a:LT/H0;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;Lm0/i1;JJFFLs/g;Lmh/p;LT/l;II)V
    .locals 14

    move-object/from16 v0, p10

    move/from16 v1, p11

    and-int/lit8 v2, p12, 0x1

    if-eqz v2, :cond_0

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    and-int/lit8 v3, p12, 0x2

    if-eqz v3, :cond_1

    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, p1

    :goto_1
    and-int/lit8 v4, p12, 0x4

    if-eqz v4, :cond_2

    sget-object v4, LQ/l;->a:LQ/l;

    const/4 v5, 0x6

    invoke-virtual {v4, v0, v5}, LQ/l;->a(LT/l;I)LQ/c;

    move-result-object v4

    invoke-virtual {v4}, LQ/c;->u()J

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p2

    :goto_2
    and-int/lit8 v6, p12, 0x8

    if-eqz v6, :cond_3

    shr-int/lit8 v6, v1, 0x6

    and-int/lit8 v6, v6, 0xe

    invoke-static {v4, v5, v0, v6}, LQ/d;->c(JLT/l;I)J

    move-result-wide v6

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p4

    :goto_3
    and-int/lit8 v8, p12, 0x10

    const/4 v9, 0x0

    if-eqz v8, :cond_4

    int-to-float v8, v9

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    goto :goto_4

    :cond_4
    move/from16 v8, p6

    :goto_4
    and-int/lit8 v10, p12, 0x20

    if-eqz v10, :cond_5

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    goto :goto_5

    :cond_5
    move/from16 v9, p7

    :goto_5
    and-int/lit8 v10, p12, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_7

    const/4 v11, -0x1

    const-string v12, "androidx.compose.material3.Surface (Surface.kt:102)"

    const v13, -0x1ea1368d

    invoke-static {v13, v1, v11, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v1, LQ/w;->a:LT/H0;

    invoke-interface {v0, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LY0/h;

    invoke-virtual {v11}, LY0/h;->s()F

    move-result v11

    add-float/2addr v11, v8

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v8

    invoke-static {}, LQ/f;->a()LT/H0;

    move-result-object v11

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    invoke-virtual {v11, v6}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v6

    invoke-static {v8}, LY0/h;->d(F)LY0/h;

    move-result-object v7

    invoke-virtual {v1, v7}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    filled-new-array {v6, v1}, [LT/I0;

    move-result-object v1

    new-instance v6, LQ/w$b;

    move-object p0, v6

    move-object p1, v2

    move-object/from16 p2, v3

    move-wide/from16 p3, v4

    move/from16 p5, v8

    move-object/from16 p6, v10

    move/from16 p7, v9

    move-object/from16 p8, p9

    invoke-direct/range {p0 .. p8}, LQ/w$b;-><init>(Landroidx/compose/ui/e;Lm0/i1;JFLs/g;FLmh/p;)V

    const/16 v2, 0x36

    const v3, -0x43a11cd

    const/4 v4, 0x1

    invoke-static {v3, v4, v6, v0, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    sget v3, LT/I0;->i:I

    or-int/lit8 v3, v3, 0x30

    invoke-static {v1, v2, v0, v3}, LT/w;->b([LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void
.end method

.method public static final synthetic b(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;
    .locals 0

    invoke-static/range {p0 .. p5}, LQ/w;->d(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(JFLT/l;I)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LQ/w;->e(JFLT/l;I)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final d(Landroidx/compose/ui/e;Lm0/i1;JLs/g;F)Landroidx/compose/ui/e;
    .locals 23

    move-object/from16 v13, p1

    move-object/from16 v6, p4

    const/4 v0, 0x0

    cmpl-float v0, p5, v0

    if-lez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v21, 0x1e7df

    const/16 v22, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    move/from16 v6, p5

    move-object/from16 v13, p1

    invoke-static/range {v0 .. v22}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLm0/i1;ZLm0/d1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    :goto_0
    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_0

    :goto_1
    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v1, p4

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v3, p1

    invoke-static {v2, v1, v3}, Ls/e;->e(Landroidx/compose/ui/e;Ls/g;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v1

    goto :goto_2

    :cond_1
    move-object/from16 v3, p1

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_2
    invoke-interface {v0, v1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    move-wide/from16 v1, p2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v3}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    return-object v0
.end method

.method private static final e(JFLT/l;I)J
    .locals 8

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)"

    const v2, -0x7bf9080a

    invoke-static {v2, p4, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LQ/l;->a:LQ/l;

    const/4 v1, 0x6

    invoke-virtual {v0, p3, v1}, LQ/l;->a(LT/l;I)LQ/c;

    move-result-object v2

    shl-int/lit8 p4, p4, 0x3

    and-int/lit16 v7, p4, 0x3f0

    move-wide v3, p0

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v7}, LQ/d;->a(LQ/c;JFLT/l;I)J

    move-result-wide p0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-wide p0
.end method
