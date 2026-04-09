.class final Lcom/ui/wifiman/ui/teleport/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/teleport/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/teleport/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/teleport/a$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/teleport/a$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/teleport/a$a;->a:Lcom/ui/wifiman/ui/teleport/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 40

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$UiContentCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.ComposableSingletons$TeleportTunnelUiKt.lambda-1.<anonymous> (TeleportTunnelUi.kt:157)"

    const v4, 0x30924056

    invoke-static {v4, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v13, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v13, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->b()J

    move-result-wide v25

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static {v12, v11, v0, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    int-to-float v10, v2

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v0, v3, v1}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v27, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v1

    sget-object v8, Lz/c;->a:Lz/c;

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v8, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v3, v1, v15, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v15, v7}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v28, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v15, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v1, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v5, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v5}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v5, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    const/16 v0, 0x90

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    const/4 v6, 0x2

    invoke-static {v12, v1, v11, v6, v9}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v13, v15, v14}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v3

    invoke-virtual {v3}, Loa/a;->a()LE/a;

    move-result-object v3

    invoke-static {v1, v3}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v16

    invoke-virtual {v13, v15, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->e()F

    move-result v18

    const/16 v21, 0xd

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v1, 0x2

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-wide/from16 v4, v25

    move-object/from16 v6, v17

    move v7, v1

    move-object/from16 v29, v8

    move-object/from16 v8, v16

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lcom/ui/wifiman/ui/teleport/y$a;->a:Lcom/ui/wifiman/ui/teleport/y$a;

    const/4 v7, 0x6

    invoke-static {v8, v15, v7}, Lcom/ui/wifiman/ui/teleport/J;->x(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)LL0/U;

    move-result-object v20

    invoke-virtual {v13, v15, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v3

    move/from16 v30, v2

    move-wide v2, v3

    const/16 v23, 0x6000

    const v24, 0xbff8

    const-string v4, ""

    move/from16 v31, v0

    move-object v0, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, v16

    move-object/from16 v32, v8

    move-object/from16 v8, v16

    const-wide/16 v16, 0x0

    move/from16 v33, v10

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move-object/from16 v11, v16

    move-object/from16 v34, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-object/from16 v35, v13

    move/from16 v36, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v22, 0x6

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const/16 v0, 0x20

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    move-object/from16 v15, v34

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v13, p2

    const/4 v2, 0x6

    invoke-static {v0, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static {v15, v1, v14, v11, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v29 .. v29}, Lz/c;->f()Lz/c$e;

    move-result-object v3

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v3, v4, v13, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v13, v9}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v13, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_2
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v3, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v6, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v6, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    invoke-virtual/range {v29 .. v29}, Lz/c;->g()Lz/c$m;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v3, v13, v5}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v13, v9}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v13, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v13, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_c
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/16 v3, 0x44

    int-to-float v10, v3

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v15, v3, v4}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    move-object/from16 v8, v35

    move/from16 v7, v36

    invoke-virtual {v8, v13, v7}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a;->a()LE/a;

    move-result-object v4

    invoke-static {v3, v4}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v6, 0x0

    move-wide/from16 v4, v25

    move v11, v7

    move/from16 v7, v16

    move-object v12, v8

    move-object/from16 v8, v17

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v13, v9}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v3

    invoke-static/range {v30 .. v30}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v15, v3, v4}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v12, v13, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v4

    invoke-virtual {v4}, Loa/a;->a()LE/a;

    move-result-object v4

    invoke-static {v3, v4}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-wide/from16 v4, v25

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v13, v9}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const/16 v3, 0x78

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v1, v3, v4, v9}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v13, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {v29 .. v29}, Lz/c;->g()Lz/c$m;

    move-result-object v1

    invoke-virtual/range {v27 .. v27}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v3

    invoke-static {v1, v3, v13, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    invoke-static {v13, v9}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v13, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_f

    invoke-static {}, LT/j;->c()V

    :cond_f
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v13, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_10
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v1, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v6, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v28 .. v28}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_11

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_12
    invoke-virtual/range {v28 .. v28}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v6, v5, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v15, v1, v3}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v12, v13, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v3

    invoke-virtual {v3}, Loa/a;->a()LE/a;

    move-result-object v3

    invoke-static {v1, v3}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-wide/from16 v4, v25

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v13, v9}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v0

    invoke-static/range {v30 .. v30}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v15, v0, v1}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v12, v13, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v1

    invoke-virtual {v1}, Loa/a;->a()LE/a;

    move-result-object v1

    invoke-static {v0, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v13, v9}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static/range {v33 .. v33}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v13, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static/range {v31 .. v31}, LY0/h;->j(F)F

    move-result v0

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-static {v15, v0, v14, v10, v9}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v12, v13, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v1

    invoke-virtual {v1}, Loa/a;->a()LE/a;

    move-result-object v1

    invoke-static {v0, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v0, v32

    invoke-static {v0, v13, v2}, Lcom/ui/wifiman/ui/teleport/J;->x(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)LL0/U;

    move-result-object v20

    const/16 v23, 0x6000

    const v24, 0xbffc

    const-string v0, ""

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v18, v9

    move/from16 v19, v10

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move/from16 v37, v11

    move-object/from16 v11, v16

    move-object/from16 v38, v12

    move-object/from16 v12, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 v39, v15

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v22, 0x6

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const/16 v0, 0xe0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    move-object/from16 v1, v39

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v15, p2

    move/from16 v9, v37

    move-object/from16 v2, v38

    invoke-virtual {v2, v15, v9}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v1

    invoke-virtual {v1}, Loa/a;->a()LE/a;

    move-result-object v1

    invoke-static {v0, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v7, 0x2

    move-wide/from16 v4, v25

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v2, v15, v9}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v0

    invoke-virtual {v0}, Lpa/c;->b()Lpa/b;

    move-result-object v0

    invoke-virtual {v0}, Lpa/b;->a()LL0/U;

    move-result-object v20

    const-string v0, ""

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move/from16 v15, v16

    const/16 v18, 0x2

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
