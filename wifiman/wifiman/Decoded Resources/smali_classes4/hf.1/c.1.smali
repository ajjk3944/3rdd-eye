.class public final Lhf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/c$a;,
        Lhf/c$b;
    }
.end annotation


# static fields
.field public static final a:Lhf/c;

.field private static final b:D

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhf/c;

    invoke-direct {v0}, Lhf/c;-><init>()V

    sput-object v0, Lhf/c;->a:Lhf/c;

    const-wide v0, 0x3fe999999999999aL    # 0.8

    sput-wide v0, Lhf/c;->b:D

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Lff/a;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lhf/c$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "<down>"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "<up>"

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(LW7/a;ZLW7/a;ZLjava/lang/String;Ls9/d;LT/l;II)LL0/d;
    .locals 39

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    move/from16 v2, p8

    const v3, -0x536feed3

    invoke-interface {v1, v3}, LT/l;->U(I)V

    const/4 v4, 0x2

    and-int/lit8 v5, p9, 0x2

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    move/from16 v5, p2

    :goto_0
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_1

    move v7, v6

    goto :goto_1

    :cond_1
    move/from16 v7, p4

    :goto_1
    and-int/lit8 v8, p9, 0x10

    if-eqz v8, :cond_2

    const-string v8, "%.1f"

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_3

    const/4 v9, -0x1

    const-string v10, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.bidirectional (NetworkSpeedString.kt:110)"

    invoke-static {v3, v2, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v3

    invoke-interface {v1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    new-instance v9, LL0/d$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct {v9, v10, v6, v11}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v10, "format(...)"

    if-eqz p1, :cond_4

    invoke-virtual/range {p1 .. p1}, LW7/a;->c()F

    move-result v12

    sget-object v13, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    move-object v12, v11

    :goto_3
    const v13, -0x1c030d25

    invoke-interface {v1, v13}, LT/l;->U(I)V

    if-nez v12, :cond_6

    if-nez v0, :cond_5

    move-object v12, v11

    goto :goto_4

    :cond_5
    shr-int/lit8 v12, v2, 0xf

    and-int/lit8 v12, v12, 0xe

    invoke-static {v0, v1, v12}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v12

    :cond_6
    :goto_4
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    const v13, -0x1c02fffd

    invoke-interface {v1, v13}, LT/l;->U(I)V

    const-string v13, "getString(...)"

    const-string v14, "\u00a0"

    const/4 v15, 0x6

    if-nez v12, :cond_7

    move/from16 p2, v7

    goto/16 :goto_6

    :cond_7
    new-instance v6, LL0/D;

    move-object/from16 v16, v6

    sget-object v4, Lff/a;->DOWN:Lff/a;

    invoke-static {v4, v1, v15}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v17

    const v37, 0xfffe

    const/16 v38, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v16 .. v38}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v6}, LL0/d$a;->n(LL0/D;)I

    move-result v6

    :try_start_0
    sget-object v16, Lhf/c$a;->DOWN:Lhf/c$a;

    invoke-virtual/range {v16 .. v16}, Lhf/c$a;->getInlineContentId()Ljava/lang/String;

    move-result-object v15

    move/from16 p2, v7

    const/4 v7, 0x2

    invoke-static {v9, v15, v11, v7, v11}, LF/u;->b(LL0/d$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v9, v14}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {v9, v12}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v7, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    invoke-virtual {v9, v6}, LL0/d$a;->l(I)V

    const v6, -0x5b876ff2

    invoke-interface {v1, v6}, LT/l;->U(I)V

    if-eqz v5, :cond_8

    new-instance v5, LL0/D;

    move-object v15, v5

    const/4 v6, 0x6

    invoke-static {v4, v1, v6}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v16

    sget-wide v6, Lhf/c;->b:D

    invoke-static {v6, v7}, LY0/w;->d(D)J

    move-result-wide v18

    const v36, 0xfffc

    const/16 v37, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v15 .. v37}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v5}, LL0/d$a;->n(LL0/D;)I

    move-result v4

    :try_start_1
    invoke-virtual {v9, v14}, LL0/d$a;->i(Ljava/lang/String;)V

    sget v5, Lm8/c;->s4:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v5}, LL0/d$a;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v9, v4}, LL0/d$a;->l(I)V

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-virtual {v9, v4}, LL0/d$a;->l(I)V

    throw v0

    :cond_8
    :goto_5
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    :goto_6
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    if-eqz p3, :cond_9

    invoke-virtual/range {p3 .. p3}, LW7/a;->c()F

    move-result v4

    sget-object v5, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :cond_9
    move-object v4, v11

    :goto_7
    const v5, -0x1c02a587

    invoke-interface {v1, v5}, LT/l;->U(I)V

    if-nez v4, :cond_b

    if-nez v0, :cond_a

    move-object v4, v11

    goto :goto_8

    :cond_a
    shr-int/lit8 v2, v2, 0xf

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v1, v2}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v4

    :cond_b
    :goto_8
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    const v0, -0x1c029855

    invoke-interface {v1, v0}, LT/l;->U(I)V

    if-nez v4, :cond_c

    goto/16 :goto_a

    :cond_c
    invoke-virtual {v9}, LL0/d$a;->j()I

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, " "

    invoke-virtual {v9, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    :cond_d
    new-instance v0, LL0/D;

    move-object v15, v0

    sget-object v2, Lff/a;->UP:Lff/a;

    const/4 v5, 0x6

    invoke-static {v2, v1, v5}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v16

    const v36, 0xfffe

    const/16 v37, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v15 .. v37}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v0}, LL0/d$a;->n(LL0/D;)I

    move-result v5

    :try_start_2
    sget-object v0, Lhf/c$a;->UP:Lhf/c$a;

    invoke-virtual {v0}, Lhf/c$a;->getInlineContentId()Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x2

    invoke-static {v9, v0, v11, v6, v11}, LF/u;->b(LL0/d$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v9, v14}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v9, v5}, LL0/d$a;->l(I)V

    const v0, -0x5b86fed8

    invoke-interface {v1, v0}, LT/l;->U(I)V

    if-eqz p2, :cond_e

    new-instance v0, LL0/D;

    move-object v15, v0

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v16

    sget-wide v4, Lhf/c;->b:D

    invoke-static {v4, v5}, LY0/w;->d(D)J

    move-result-wide v18

    const v36, 0xfffc

    const/16 v37, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v15 .. v37}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v0}, LL0/d$a;->n(LL0/D;)I

    move-result v2

    :try_start_3
    invoke-virtual {v9, v14}, LL0/d$a;->i(Ljava/lang/String;)V

    sget v0, Lm8/c;->s4:I

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v13}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, LL0/d$a;->i(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v9, v2}, LL0/d$a;->l(I)V

    goto :goto_9

    :catchall_1
    move-exception v0

    invoke-virtual {v9, v2}, LL0/d$a;->l(I)V

    throw v0

    :cond_e
    :goto_9
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    :goto_a
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    invoke-virtual {v9}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    invoke-interface/range {p7 .. p7}, LT/l;->J()V

    return-object v0

    :catchall_2
    move-exception v0

    invoke-virtual {v9, v5}, LL0/d$a;->l(I)V

    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v9, v6}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public final b(LW7/a;Lff/a;Ljava/lang/String;ZLT/l;II)LL0/d;
    .locals 34

    move-object/from16 v0, p2

    move-object/from16 v1, p5

    move/from16 v2, p6

    const-string v3, "\u00a0"

    const-string v4, "throughput"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "direction"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x464ed18f

    invoke-interface {v1, v4}, LT/l;->U(I)V

    and-int/lit8 v6, p7, 0x4

    if-eqz v6, :cond_0

    const-string v6, "%.1f"

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.directional (NetworkSpeedString.kt:53)"

    invoke-static {v4, v2, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v4

    invoke-interface {v1, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    new-instance v7, LL0/d$a;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct {v7, v8, v9, v10}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, LL0/D;

    move-object v11, v8

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v1, v2}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v12

    const v32, 0xfffe

    const/16 v33, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v11 .. v33}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v8}, LL0/d$a;->n(LL0/D;)I

    move-result v8

    :try_start_0
    sget-object v11, Lhf/c;->a:Lhf/c;

    invoke-direct {v11, v0}, Lhf/c;->d(Lff/a;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x2

    invoke-static {v7, v11, v10, v12, v10}, LF/u;->b(LL0/d$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v7, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v10, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-virtual/range {p1 .. p1}, LW7/a;->c()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "format(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v5}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v5, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {v7, v8}, LL0/d$a;->l(I)V

    const v5, 0x6ab0c5fd

    invoke-interface {v1, v5}, LT/l;->U(I)V

    if-eqz p4, :cond_2

    new-instance v5, LL0/D;

    move-object v8, v5

    invoke-static {v0, v1, v2}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v9

    sget-wide v11, Lhf/c;->b:D

    invoke-static {v11, v12}, LY0/w;->d(D)J

    move-result-wide v11

    const v29, 0xfffc

    const/16 v30, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v8 .. v30}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v5}, LL0/d$a;->n(LL0/D;)I

    move-result v2

    :try_start_1
    invoke-virtual {v7, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    sget v0, Lm8/c;->s4:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "getString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, LL0/d$a;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v7, v2}, LL0/d$a;->l(I)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v7, v2}, LL0/d$a;->l(I)V

    throw v0

    :cond_2
    :goto_1
    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    invoke-virtual {v7}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    return-object v0

    :catchall_1
    move-exception v0

    invoke-virtual {v7, v8}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public final c(Lff/a;ZLT/l;I)LL0/d;
    .locals 32

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "\u00a0"

    const-string v4, "direction"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x77f8e999

    invoke-interface {v1, v4}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.directionalValueNotAvailable (NetworkSpeedString.kt:79)"

    invoke-static {v4, v2, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v4

    invoke-interface {v1, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    new-instance v5, LL0/d$a;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v5, v7, v6, v8}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v6, -0x1af45eec

    invoke-interface {v1, v6}, LT/l;->U(I)V

    new-instance v6, LL0/D;

    move-object v9, v6

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v1, v2}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v10

    const v30, 0xfffe

    const/16 v31, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v9 .. v31}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, LL0/d$a;->n(LL0/D;)I

    move-result v6

    :try_start_0
    sget-object v9, Lhf/c;->a:Lhf/c;

    invoke-direct {v9, v0}, Lhf/c;->d(Lff/a;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x2

    invoke-static {v5, v9, v8, v10, v8}, LF/u;->b(LL0/d$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v5, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    sget v8, Lm8/c;->A4:I

    invoke-static {v8, v1, v7}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v7, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {v5, v6}, LL0/d$a;->l(I)V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const v6, -0x1af43d3c

    invoke-interface {v1, v6}, LT/l;->U(I)V

    if-eqz p2, :cond_1

    new-instance v15, LL0/D;

    move-object v6, v15

    invoke-static {v0, v1, v2}, Lff/c;->a(Lff/a;LT/l;I)J

    move-result-wide v7

    sget-wide v9, Lhf/c;->b:D

    invoke-static {v9, v10}, LY0/w;->d(D)J

    move-result-wide v9

    const v27, 0xfffc

    const/16 v28, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v0, 0x0

    move-object v2, v15

    move-object v15, v0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v6 .. v28}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v2}, LL0/d$a;->n(LL0/D;)I

    move-result v2

    :try_start_1
    invoke-virtual {v5, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    sget v0, Lm8/c;->s4:I

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "getString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, LL0/d$a;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v5, v2}, LL0/d$a;->l(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v5, v2}, LL0/d$a;->l(I)V

    throw v0

    :cond_1
    :goto_0
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-virtual {v5}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    return-object v0

    :catchall_1
    move-exception v0

    invoke-virtual {v5, v6}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public final e(LW7/a;ZLW7/a;ZLT/l;II)LL0/d;
    .locals 13

    move/from16 v0, p6

    const v1, -0x1b8d759f

    move-object/from16 v12, p5

    invoke-interface {v12, v1}, LT/l;->U(I)V

    and-int/lit8 v2, p7, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, p2

    :goto_0
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_1

    move v6, v3

    goto :goto_1

    :cond_1
    move/from16 v6, p4

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.newWirelessRatesString (NetworkSpeedString.kt:164)"

    invoke-static {v1, v0, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    and-int/lit8 v1, v0, 0xe

    const v2, 0x36000

    or-int/2addr v1, v2

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x1c00

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x6

    const/high16 v2, 0x380000

    and-int/2addr v0, v2

    or-int v10, v1, v0

    const/4 v11, 0x0

    const-string v7, "%.0f"

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v5, p3

    move-object/from16 v9, p5

    invoke-virtual/range {v2 .. v11}, Lhf/c;->a(LW7/a;ZLW7/a;ZLjava/lang/String;Ls9/d;LT/l;II)LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface/range {p5 .. p5}, LT/l;->J()V

    return-object v0
.end method

.method public final f(JLT/l;I)Ljava/util/Map;
    .locals 17

    move-object/from16 v0, p3

    move/from16 v1, p4

    const v2, 0x6a44bad0

    invoke-interface {v0, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.speedtest.component.NetworkSpeedString.rememberInlineContent (NetworkSpeedString.kt:174)"

    invoke-static {v2, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v2, 0x17e22745

    invoke-interface {v0, v2}, LT/l;->U(I)V

    and-int/lit8 v2, v1, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    move-wide/from16 v11, p1

    if-le v2, v3, :cond_1

    invoke-interface {v0, v11, v12}, LT/l;->j(J)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    and-int/lit8 v1, v1, 0x6

    if-ne v1, v3, :cond_3

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_5

    :cond_4
    sget-object v1, Lhf/c$a;->DOWN:Lhf/c$a;

    invoke-virtual {v1}, Lhf/c$a;->getInlineContentId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LF/t;

    new-instance v3, LL0/x;

    invoke-static/range {p1 .. p2}, LY0/w;->b(J)V

    invoke-static/range {p1 .. p2}, LY0/v;->f(J)J

    move-result-wide v4

    invoke-static/range {p1 .. p2}, LY0/v;->h(J)F

    move-result v6

    const/high16 v13, 0x40400000    # 3.0f

    div-float/2addr v6, v13

    invoke-static {v4, v5, v6}, LY0/w;->j(JF)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/w;->b(J)V

    invoke-static {v4, v5}, LY0/v;->f(J)J

    move-result-wide v6

    invoke-static {v4, v5}, LY0/v;->h(J)F

    move-result v4

    const/high16 v14, 0x40000000    # 2.0f

    mul-float/2addr v4, v14

    invoke-static {v6, v7, v4}, LY0/w;->j(JF)J

    move-result-wide v5

    sget-object v15, LL0/y;->a:LL0/y$a;

    invoke-virtual {v15}, LL0/y$a;->a()I

    move-result v9

    const/4 v10, 0x0

    move-object v4, v3

    move-wide/from16 v7, p1

    invoke-direct/range {v4 .. v10}, LL0/x;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v16, Lhf/a;->a:Lhf/a;

    invoke-virtual/range {v16 .. v16}, Lhf/a;->a()Lmh/q;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LF/t;-><init>(LL0/x;Lmh/q;)V

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    sget-object v2, Lhf/c$a;->UP:Lhf/c$a;

    invoke-virtual {v2}, Lhf/c$a;->getInlineContentId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, LF/t;

    new-instance v10, LL0/x;

    invoke-static/range {p1 .. p2}, LY0/w;->b(J)V

    invoke-static/range {p1 .. p2}, LY0/v;->f(J)J

    move-result-wide v4

    invoke-static/range {p1 .. p2}, LY0/v;->h(J)F

    move-result v6

    div-float/2addr v6, v13

    invoke-static {v4, v5, v6}, LY0/w;->j(JF)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/w;->b(J)V

    invoke-static {v4, v5}, LY0/v;->f(J)J

    move-result-wide v6

    invoke-static {v4, v5}, LY0/v;->h(J)F

    move-result v4

    mul-float/2addr v4, v14

    invoke-static {v6, v7, v4}, LY0/w;->j(JF)J

    move-result-wide v5

    invoke-virtual {v15}, LL0/y$a;->a()I

    move-result v9

    const/4 v13, 0x0

    move-object v4, v10

    move-wide/from16 v7, p1

    move-object v11, v10

    move-object v10, v13

    invoke-direct/range {v4 .. v10}, LL0/x;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v16 .. v16}, Lhf/a;->b()Lmh/q;

    move-result-object v4

    invoke-direct {v3, v11, v4}, LF/t;-><init>(LL0/x;Lmh/q;)V

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    filled-new-array {v1, v2}, [LYg/s;

    move-result-object v1

    invoke-static {v1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Ljava/util/Map;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    return-object v2
.end method
