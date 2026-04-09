.class final Lnf/p$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnf/p$e;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnf/h;


# direct methods
.method constructor <init>(Lnf/h;)V
    .locals 0

    iput-object p1, p0, Lnf/p$e$a;->a:Lnf/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFLT/l;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v1, p3

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v1, v0}, LT/l;->g(F)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit16 v4, v2, 0x83

    const/16 v5, 0x82

    if-ne v4, v5, :cond_3

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    move-object/from16 v2, p0

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.speedtest.test.SpeedtestProcessTest.<anonymous>.<anonymous> (SpeedtestProcessUi.kt:120)"

    const v6, -0x4b35d704

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    move-object/from16 v2, p0

    iget-object v4, v2, Lnf/p$e$a;->a:Lnf/h;

    invoke-virtual {v4}, Lnf/h;->t0()LLi/N;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v4, v5, v1, v6, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhf/t$a;

    const v8, -0x142a8f21

    invoke-interface {v1, v8}, LT/l;->U(I)V

    const/16 v8, 0x48

    const/4 v9, 0x0

    if-nez v4, :cond_5

    move-object v4, v5

    goto :goto_3

    :cond_5
    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v11, v8

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v10, v11, v9, v3, v5}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v9, v7, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v7, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v7, v1, v10}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v12

    invoke-virtual {v12}, Lra/a;->a()Lra/b;

    move-result-object v12

    invoke-virtual {v12}, Lra/b;->a()Lra/b$a$a;

    move-result-object v12

    const/16 v13, 0x20

    int-to-float v13, v13

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v14

    invoke-virtual {v12, v14}, Lra/b$a;->a(F)F

    move-result v12

    invoke-virtual {v7, v1, v10}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v14

    invoke-virtual {v14}, Lra/a;->a()Lra/b;

    move-result-object v14

    invoke-virtual {v14}, Lra/b;->a()Lra/b$a$a;

    move-result-object v14

    invoke-static {v13}, LY0/h;->j(F)F

    move-result v13

    invoke-virtual {v14, v13}, Lra/b$a;->a(F)F

    move-result v14

    invoke-virtual {v7, v1, v10}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->b()Lra/b$a$b;

    move-result-object v7

    const/16 v10, 0x18

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-virtual {v7, v10}, Lra/b$a;->a(F)F

    move-result v13

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-static {v7, v4, v1, v6}, Lhf/J;->E(Landroidx/compose/ui/e;Lhf/t$a;LT/l;I)V

    sget-object v4, LYg/J;->a:LYg/J;

    :goto_3
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    if-nez v4, :cond_6

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v7, v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v4, v7, v9, v3, v5}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v1, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    :cond_6
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lnf/p$e$a;->a(FFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
