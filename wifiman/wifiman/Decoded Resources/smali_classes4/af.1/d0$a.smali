.class final Laf/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/d0;->l(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/v0;

.field final synthetic b:Laf/Q;


# direct methods
.method constructor <init>(Lm0/v0;Laf/Q;)V
    .locals 0

    iput-object p1, p0, Laf/d0$a;->a:Lm0/v0;

    iput-object p2, p0, Laf/d0$a;->b:Laf/Q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speed.component.BandTabs.<anonymous>.<anonymous> (SpeedTabSpeedFactorCardUi.kt:353)"

    const v3, -0x5b63fddf

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v7, v0, Laf/d0$a;->a:Lm0/v0;

    if-nez v7, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v8, v0, Laf/d0$a;->b:Laf/Q;

    invoke-virtual {v7}, Lm0/v0;->u()J

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v17

    const/16 v20, 0xd

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-virtual {v4, v1}, Lz/c;->n(F)Lz/c$f;

    move-result-object v1

    const/16 v4, 0x36

    invoke-static {v1, v3, v14, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v9, 0x0

    invoke-static {v14, v9}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v14, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_2

    invoke-static {}, LT/j;->c()V

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_0
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v6, v1, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v6, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_5
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v6, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    invoke-virtual {v7}, Lm0/v0;->u()J

    move-result-wide v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    if-nez v8, :cond_6

    new-instance v1, Ls9/d$c;

    const-string v2, ""

    invoke-direct {v1, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v8}, Laf/Q;->c()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, LAf/p$a;->a:LAf/p$a;

    invoke-virtual {v1}, LAf/p$a;->a()Ls9/d;

    move-result-object v1

    goto :goto_1

    :cond_7
    sget-object v1, LAf/p$c;->a:LAf/p$c;

    invoke-virtual {v1}, LAf/p$c;->a()Ls9/d;

    move-result-object v1

    :goto_1
    invoke-static {v1, v14, v9}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v14, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->f()LL0/U;

    move-result-object v21

    invoke-virtual {v7}, Lm0/v0;->u()J

    move-result-wide v3

    const/16 v24, 0x0

    const v25, 0xfffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Laf/d0$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
