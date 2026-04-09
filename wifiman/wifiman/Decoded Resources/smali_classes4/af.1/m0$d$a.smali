.class final Laf/m0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/m0$d;->a(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Ljava/lang/Boolean;


# direct methods
.method constructor <init>(Lmh/l;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Laf/m0$d$a;->a:Lmh/l;

    iput-object p2, p0, Laf/m0$d$a;->b:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Boolean;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Laf/m0$d$a;->c(Lmh/l;Ljava/lang/Boolean;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;Ljava/lang/Boolean;)LYg/J;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speed.component.SpeedTestButtonsContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedtestCardUi.kt:179)"

    const v4, -0x1647365f

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const v2, -0x10dba834

    invoke-interface {v14, v2}, LT/l;->U(I)V

    iget-object v2, v0, Laf/m0$d$a;->a:Lmh/l;

    invoke-interface {v14, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Laf/m0$d$a;->b:Ljava/lang/Boolean;

    invoke-interface {v14, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Laf/m0$d$a;->a:Lmh/l;

    iget-object v6, v0, Laf/m0$d$a;->b:Ljava/lang/Boolean;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_4

    :cond_3
    new-instance v7, Laf/n0;

    invoke-direct {v7, v3, v6}, Laf/n0;-><init>(Lmh/l;Ljava/lang/Boolean;)V

    invoke-interface {v14, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v9, v7

    check-cast v9, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v5

    const/16 v6, 0x10

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v2, v6, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    sget-object v6, Lz/c;->a:Lz/c;

    invoke-virtual {v6}, Lz/c;->b()Lz/c$f;

    move-result-object v6

    iget-object v7, v0, Laf/m0$d$a;->b:Ljava/lang/Boolean;

    iget-object v8, v0, Laf/m0$d$a;->a:Lmh/l;

    const/16 v9, 0x36

    invoke-static {v6, v5, v14, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v14, v6}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v14, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v14, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v13, v5, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v13, v11, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_7

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v13, v2, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/Z;->a:Lz/Z;

    invoke-static {}, LN/c0;->b()LT/H0;

    move-result-object v2

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v5}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v2

    new-instance v5, Laf/m0$d$a$a;

    invoke-direct {v5, v7, v8}, Laf/m0$d$a$a;-><init>(Ljava/lang/Boolean;Lmh/l;)V

    const v7, -0x53e55c03

    invoke-static {v7, v4, v5, v14, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v4

    sget v5, LT/I0;->i:I

    or-int/lit8 v5, v5, 0x30

    invoke-static {v2, v4, v14, v5}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v14, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->O2:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v14, v6}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->b()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->a()LL0/U;

    move-result-object v22

    invoke-virtual {v2, v14, v3}, Lla/a;->a(LT/l;I)Lma/a;

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

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laf/m0$d$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
