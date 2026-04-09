.class final Laf/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Laf/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/a$a;

    invoke-direct {v0}, Laf/a$a;-><init>()V

    sput-object v0, Laf/a$a;->a:Laf/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;Laf/Q;LT/l;I)V
    .locals 30

    move-object/from16 v0, p2

    move-object/from16 v14, p3

    const-string v1, "$this$UiSelectorHorizontalBase"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "item"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_1

    invoke-interface {v14, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit16 v2, v1, 0x91

    const/16 v3, 0x90

    if-ne v2, v3, :cond_3

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedFactorCardUiKt.lambda-1.<anonymous> (SpeedTabSpeedFactorCardUi.kt:296)"

    const v4, 0x3f447347

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, Lz/c;->a:Lz/c;

    invoke-virtual {v1}, Lz/c;->b()Lz/c$f;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v15, 0x36

    invoke-static {v1, v2, v14, v15}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v11, 0x0

    invoke-static {v14, v11}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_3
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v1, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v6, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v6, v3, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v26, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p2 .. p2}, Laf/Q;->d()Z

    move-result v2

    new-instance v1, Laf/a$a$a;

    invoke-direct {v1, v0}, Laf/a$a$a;-><init>(Laf/Q;)V

    const v3, -0x41615a75

    const/4 v12, 0x1

    invoke-static {v3, v12, v1, v14, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v27, 0x180006

    move-object/from16 v1, v26

    move-object/from16 v8, p3

    move/from16 v9, v27

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const v1, 0x125464c1

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-virtual/range {p2 .. p2}, Laf/Q;->e()Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lma/a$b;->a:Lma/a$b;

    invoke-virtual {v1}, Lma/a$b;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v1

    goto :goto_4

    :cond_9
    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v14, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->c()J

    move-result-wide v1

    :goto_4
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/16 v7, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "textColor"

    const/4 v5, 0x0

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Laf/Q;->a()LS8/c;

    move-result-object v1

    invoke-static {v1}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v1

    invoke-static {v1, v14, v11}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->a()I

    move-result v5

    sget-object v10, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v10, v14, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->f()LL0/U;

    move-result-object v21

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v3

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->a()I

    move-result v16

    invoke-static {v5}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const/16 v24, 0xc30

    const v25, 0xd5fa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v28, v10

    move/from16 v29, v11

    move-wide/from16 v10, v17

    const/16 v17, 0x0

    move-object/from16 v12, v17

    const-wide/16 v17, 0x0

    move-wide/from16 v14, v17

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p3

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const v1, 0x1254ae68

    move-object/from16 v10, p3

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-virtual/range {p2 .. p2}, Laf/Q;->e()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lma/a$b;->a:Lma/a$b;

    invoke-virtual {v1}, Lma/a$b;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v1

    goto :goto_5

    :cond_a
    move-object/from16 v1, v28

    move/from16 v2, v29

    invoke-virtual {v1, v10, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->h()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->h()J

    move-result-wide v1

    :goto_5
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/16 v7, 0x180

    const/16 v8, 0xa

    const/4 v3, 0x0

    const-string v4, "textColor"

    const/4 v5, 0x0

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Laf/Q;->b()Z

    move-result v2

    new-instance v0, Laf/a$a$b;

    invoke-direct {v0, v1}, Laf/a$a$b;-><init>(LT/z1;)V

    const v1, 0x43538374

    const/16 v3, 0x36

    const/4 v4, 0x1

    invoke-static {v1, v4, v0, v10, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v9, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, v26

    move v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object/from16 v7, p3

    move/from16 v8, v27

    invoke-static/range {v0 .. v9}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, Laf/Q;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Laf/a$a;->a(Lz/Y;Laf/Q;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
