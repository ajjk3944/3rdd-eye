.class final Laf/m0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/m0;->s(Landroidx/compose/ui/e;ZLjava/lang/Boolean;Ls9/d;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Boolean;

.field final synthetic b:Lmh/a;

.field final synthetic c:Ls9/d;


# direct methods
.method constructor <init>(Ljava/lang/Boolean;Lmh/a;Ls9/d;)V
    .locals 0

    iput-object p1, p0, Laf/m0$e;->a:Ljava/lang/Boolean;

    iput-object p2, p0, Laf/m0$e;->b:Lmh/a;

    iput-object p3, p0, Laf/m0$e;->c:Ls9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, Laf/m0$e;->c(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/a;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.component.SpeedTestButtonsContainer.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedtestCardUi.kt:216)"

    const v4, -0x3ee3f807

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v9, 0x0

    invoke-static {v8, v1, v2, v9}, Landroidx/compose/foundation/layout/r;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v15

    iget-object v1, v0, Laf/m0$e;->a:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v16, v1, 0x1

    const v1, 0x63129dd5

    invoke-interface {v14, v1}, LT/l;->U(I)V

    iget-object v1, v0, Laf/m0$e;->b:Lmh/a;

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Laf/m0$e;->b:Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_4

    :cond_3
    new-instance v4, Laf/p0;

    invoke-direct {v4, v2}, Laf/p0;-><init>(Lmh/a;)V

    invoke-interface {v14, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v19, v4

    check-cast v19, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v2, 0x8

    int-to-float v10, v2

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v2

    const/16 v4, 0x10

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1, v4, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Laf/m0$e;->a:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_1

    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_1
    invoke-static {v1, v2}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    sget-object v3, Lz/c;->a:Lz/c;

    invoke-virtual {v3}, Lz/c;->b()Lz/c$f;

    move-result-object v3

    iget-object v11, v0, Laf/m0$e;->c:Ls9/d;

    const/16 v4, 0x36

    invoke-static {v3, v2, v14, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v12, 0x0

    invoke-static {v14, v12}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_6

    invoke-static {}, LT/j;->c()V

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_7
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_2
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_9
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    sget-object v1, LPe/a;->a:LPe/a;

    invoke-virtual {v1}, LPe/a;->x()Ls9/b;

    move-result-object v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v13, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v13, v14, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$a;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v3

    const/16 v6, 0x36

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v14, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const v1, -0x10da7b7f

    invoke-interface {v14, v1}, LT/l;->U(I)V

    if-nez v11, :cond_a

    goto :goto_3

    :cond_a
    invoke-static {v11, v14, v12}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v9

    :goto_3
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v1, -0x10da7d42

    invoke-interface {v14, v1}, LT/l;->U(I)V

    if-nez v9, :cond_b

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->Q2:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v14, v12}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    goto :goto_4

    :cond_b
    move-object v1, v9

    :goto_4
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-virtual {v13, v14, v15}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->f()LL0/U;

    move-result-object v22

    invoke-virtual {v13, v14, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v3

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v16

    const/16 v25, 0xc30

    const v26, 0x1d7fa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v17, 0x0

    move-wide/from16 v14, v17

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, p1

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laf/m0$e;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
