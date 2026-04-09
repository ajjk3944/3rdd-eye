.class public final Laf/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Laf/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/z;

    invoke-direct {v0}, Laf/z;-><init>()V

    sput-object v0, Laf/z;->a:Laf/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Laf/z;Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, Laf/z;->c(Laf/z;Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Laf/z;Landroidx/compose/ui/e;Ls9/d;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Laf/z;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V
    .locals 30

    move-object/from16 v3, p2

    const-string v0, "text"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1e7e0164

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, p4, 0x6

    move v5, v4

    move-object/from16 v4, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int v5, p4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p1

    move/from16 v5, p4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_5

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_7

    invoke-interface {v1}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v4

    goto :goto_6

    :cond_7
    :goto_4
    if-eqz v2, :cond_8

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v2, v4

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.speed.component.SpeedTabCardDefaults.TitleText (SpeedTabCardDefaults.kt:26)"

    invoke-static {v0, v5, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    shr-int/lit8 v0, v5, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v1, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v0, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v0, v1, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->a()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->b()LL0/U;

    move-result-object v25

    invoke-virtual {v0, v1, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->a()J

    move-result-wide v6

    shl-int/lit8 v0, v5, 0x3

    and-int/lit8 v27, v0, 0x70

    const/16 v28, 0x0

    const v29, 0x1fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v5, v2

    move-object/from16 v26, v1

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_6
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v7, Laf/y;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Laf/y;-><init>(Laf/z;Landroidx/compose/ui/e;Ls9/d;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method public final d(ZJJLT/l;II)LT/z1;
    .locals 9

    move-object v8, p6

    const v0, -0x39555bd4

    invoke-interface {p6, v0}, LT/l;->U(I)V

    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, p6, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->b()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide v1, p2

    :goto_0
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, p6, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->e()J

    move-result-wide v3

    goto :goto_1

    :cond_1
    move-wide v3, p4

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.speed.component.SpeedTabCardDefaults.backgroundColor (SpeedTabCardDefaults.kt:20)"

    move/from16 v7, p7

    invoke-static {v0, v7, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    move-wide v0, v3

    goto :goto_2

    :cond_3
    move-wide v0, v1

    :goto_2
    const/16 v6, 0x180

    const/16 v7, 0xa

    const/4 v2, 0x0

    const-string v3, "bg color"

    const/4 v4, 0x0

    move-object v5, p6

    invoke-static/range {v0 .. v7}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p6}, LT/l;->J()V

    return-object v0
.end method
