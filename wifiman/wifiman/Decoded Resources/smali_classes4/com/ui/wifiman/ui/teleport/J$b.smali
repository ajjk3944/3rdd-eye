.class final Lcom/ui/wifiman/ui/teleport/J$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/J;->l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/A;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/B;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/J$b;->a:Lcom/ui/wifiman/ui/teleport/A;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/J$b;->b:Lcom/ui/wifiman/ui/teleport/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v2, v1}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.teleport.TeleportTunnelUi.<anonymous>.<anonymous> (TeleportTunnelUi.kt:263)"

    const v7, -0x148bb158

    invoke-static {v7, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_9

    const v1, 0x2748f07e

    invoke-interface {v2, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->g()Lz/c$m;

    move-result-object v9

    sget-object v10, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v10}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v10

    invoke-static {v9, v10, v2, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v9

    invoke-static {v2, v7}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v2, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v2, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v9, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v13, v11, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_7

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v9

    invoke-static {v13, v8, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v8, Lz/k;->a:Lz/k;

    invoke-static {v6, v2, v7, v5}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-static {v1, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v8, v2, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v8

    invoke-virtual {v8}, Lra/a;->a()Lra/b;

    move-result-object v8

    invoke-virtual {v8}, Lra/b;->a()Lra/b$a$a;

    move-result-object v8

    invoke-virtual {v8}, Lra/b$a$a;->c()F

    move-result v8

    invoke-static {v1, v8, v3, v4, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v2, v7}, Lcom/ui/wifiman/ui/teleport/J;->u(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v6, v2, v7, v5}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto/16 :goto_5

    :cond_9
    iget-object v1, v0, Lcom/ui/wifiman/ui/teleport/J$b;->a:Lcom/ui/wifiman/ui/teleport/A;

    if-eqz v1, :cond_e

    const v1, 0x27502c23

    invoke-interface {v2, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-static {v7, v2, v7, v5}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    iget-object v9, v0, Lcom/ui/wifiman/ui/teleport/J$b;->a:Lcom/ui/wifiman/ui/teleport/A;

    iget-object v10, v0, Lcom/ui/wifiman/ui/teleport/J$b;->b:Lcom/ui/wifiman/ui/teleport/B;

    sget-object v11, Lz/c;->a:Lz/c;

    invoke-virtual {v11}, Lz/c;->g()Lz/c$m;

    move-result-object v11

    sget-object v12, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v12}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v12

    invoke-static {v11, v12, v2, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v11

    invoke-static {v2, v7}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v2, v8}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v14, LE0/g;->K:LE0/g$a;

    invoke-virtual {v14}, LE0/g$a;->a()Lmh/a;

    move-result-object v15

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v2, v15}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_b
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v15

    invoke-virtual {v14}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v15, v11, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v14}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v15, v13, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v14}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v15}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_c

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_d

    :cond_c
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v15, v11, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v14}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v15, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    invoke-static {v6, v2, v7, v5}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-static {v1, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v4, v2, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v8, 0x2

    invoke-static {v1, v4, v3, v8, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v9, v10, v2, v7}, Lcom/ui/wifiman/ui/teleport/J;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/A;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    invoke-static {v6, v2, v7, v5}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_5

    :cond_e
    const v1, 0x275903be

    invoke-interface {v2, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/J$b;->a(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
