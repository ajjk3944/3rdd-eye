.class final LF9/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/a;

.field final synthetic c:Ljava/lang/Boolean;

.field final synthetic d:Z

.field final synthetic e:Lz/N;

.field final synthetic f:Lmh/q;

.field final synthetic g:Lmh/q;

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:Lmh/q;

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:J

.field final synthetic l:J

.field final synthetic m:I

.field final synthetic n:Lmh/q;

.field final synthetic o:LF9/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/a;Ljava/lang/Boolean;ZLz/N;Lmh/q;Lmh/q;Ljava/lang/String;Lmh/q;Ljava/lang/String;JJILmh/q;LF9/l;)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF9/q$a;->a:Landroidx/compose/ui/e;

    move-object v1, p2

    iput-object v1, v0, LF9/q$a;->b:Lmh/a;

    move-object v1, p3

    iput-object v1, v0, LF9/q$a;->c:Ljava/lang/Boolean;

    move v1, p4

    iput-boolean v1, v0, LF9/q$a;->d:Z

    move-object v1, p5

    iput-object v1, v0, LF9/q$a;->e:Lz/N;

    move-object v1, p6

    iput-object v1, v0, LF9/q$a;->f:Lmh/q;

    move-object v1, p7

    iput-object v1, v0, LF9/q$a;->g:Lmh/q;

    move-object v1, p8

    iput-object v1, v0, LF9/q$a;->h:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, LF9/q$a;->i:Lmh/q;

    move-object v1, p10

    iput-object v1, v0, LF9/q$a;->j:Ljava/lang/String;

    move-wide v1, p11

    iput-wide v1, v0, LF9/q$a;->k:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, LF9/q$a;->l:J

    move/from16 v1, p15

    iput v1, v0, LF9/q$a;->m:I

    move-object/from16 v1, p16

    iput-object v1, v0, LF9/q$a;->n:Lmh/q;

    move-object/from16 v1, p17

    iput-object v1, v0, LF9/q$a;->o:LF9/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    const/4 v15, 0x3

    and-int/lit8 v2, v1, 0x3

    const/4 v13, 0x2

    if-ne v2, v13, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_11

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.settings.UiSettingsBase.<anonymous> (UiSettingsBase.kt:88)"

    const v4, 0x376334f0

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LF9/q$a;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LF9/q$a;->b:Lmh/a;

    if-eqz v2, :cond_4

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v2, v0, LF9/q$a;->c:Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_1
    move v4, v2

    goto :goto_2

    :cond_3
    iget-boolean v2, v0, LF9/q$a;->d:Z

    goto :goto_1

    :goto_2
    iget-object v7, v0, LF9/q$a;->b:Lmh/a;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    goto :goto_3

    :cond_4
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_3
    invoke-interface {v1, v2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LF9/q$a;->e:Lz/N;

    iget-object v12, v0, LF9/q$a;->f:Lmh/q;

    iget-object v3, v0, LF9/q$a;->g:Lmh/q;

    iget-object v4, v0, LF9/q$a;->h:Ljava/lang/String;

    iget-object v11, v0, LF9/q$a;->i:Lmh/q;

    iget-object v5, v0, LF9/q$a;->j:Ljava/lang/String;

    iget-wide v6, v0, LF9/q$a;->k:J

    iget-wide v8, v0, LF9/q$a;->l:J

    iget v10, v0, LF9/q$a;->m:I

    iget-boolean v13, v0, LF9/q$a;->d:Z

    iget-object v15, v0, LF9/q$a;->n:Lmh/q;

    move-object/from16 p2, v12

    iget-object v12, v0, LF9/q$a;->o:LF9/l;

    sget-object v17, Lz/c;->a:Lz/c;

    invoke-virtual/range {v17 .. v17}, Lz/c;->g()Lz/c$m;

    move-result-object v0

    sget-object v18, Lf0/c;->a:Lf0/c$a;

    move-object/from16 v19, v15

    invoke-virtual/range {v18 .. v18}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v15

    move/from16 v20, v13

    const/4 v13, 0x0

    invoke-static {v0, v15, v14, v13}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v0

    invoke-static {v14, v13}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v22, LE0/g;->K:LE0/g$a;

    move/from16 v23, v10

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v24

    if-nez v24, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v24

    if-eqz v24, :cond_6

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_6
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_4
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    move-wide/from16 v24, v8

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v10, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v10, v13, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v22 .. v22}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v10, v1, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/k;->a:Lz/k;

    invoke-virtual/range {v18 .. v18}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v13, 0x30

    int-to-float v1, v13

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    invoke-static {v15, v10, v1, v9, v8}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v10, v9, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, Lz/c;->f()Lz/c$e;

    move-result-object v2

    invoke-static {v2, v0, v14, v13}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v14, v2}, LT/j;->a(LT/l;I)I

    move-result v26

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v27

    if-nez v27, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v27

    if-eqz v27, :cond_a

    invoke-interface {v14, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_5
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v10, v0, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v10, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v10}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual/range {v22 .. v22}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v10, v1, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    const v1, -0x743ba5f0

    invoke-interface {v14, v1}, LT/l;->U(I)V

    const/16 v33, 0x6

    if-nez v3, :cond_d

    goto/16 :goto_7

    :cond_d
    invoke-virtual/range {v18 .. v18}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, Lz/c;->f()Lz/c$e;

    move-result-object v2

    invoke-static {v2, v1, v14, v13}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v14, v2}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v14, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v26

    if-nez v26, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v26

    if-eqz v26, :cond_f

    invoke-interface {v14, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_f
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_6
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v13, v1, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v13, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v13}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v22 .. v22}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v13, v10, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v14, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    sget-object v1, LYg/J;->a:LYg/J;

    :goto_7
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v1, 0x8

    if-eqz v3, :cond_12

    if-eqz v4, :cond_12

    int-to-float v2, v1

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move/from16 v27, v2

    const/4 v2, 0x0

    goto :goto_8

    :cond_12
    const/4 v2, 0x0

    int-to-float v3, v2

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    move/from16 v27, v3

    :goto_8
    if-eqz v11, :cond_13

    if-eqz v4, :cond_13

    int-to-float v1, v1

    :goto_9
    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move/from16 v29, v1

    goto :goto_a

    :cond_13
    int-to-float v1, v2

    goto :goto_9

    :goto_a
    const/16 v31, 0xa

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v26, v15

    invoke-static/range {v26 .. v32}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    instance-of v13, v12, LF9/l$b;

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v13, :cond_14

    const/4 v9, 0x1

    invoke-interface {v0, v1, v10, v9}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v8, 0x0

    goto :goto_b

    :cond_14
    const/4 v9, 0x1

    instance-of v2, v12, LF9/l$a;

    if-eqz v2, :cond_22

    move-object v2, v12

    check-cast v2, LF9/l$a;

    invoke-virtual {v2}, LF9/l$a;->a()F

    move-result v2

    invoke-static {v1, v2}, LF9/q;->k(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v8, 0x0

    invoke-static {v1, v3, v8, v2, v3}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    :goto_b
    const/16 v21, 0x0

    const/16 v26, 0x0

    move-object v2, v5

    move-object/from16 v27, v3

    move-object v3, v4

    move-wide v4, v6

    move-wide/from16 v6, v24

    move/from16 v24, v8

    move/from16 v8, v23

    move/from16 v9, v20

    move-object/from16 v10, v19

    move-object/from16 v34, v11

    move-object/from16 v11, p1

    move-object/from16 v35, p2

    move-object/from16 p2, v0

    move-object v0, v12

    move/from16 v12, v21

    move/from16 v16, v13

    move/from16 v13, v26

    invoke-static/range {v1 .. v13}, LF9/q;->j(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;LT/l;II)V

    const v1, -0x743adbd9

    invoke-interface {v14, v1}, LT/l;->U(I)V

    move-object/from16 v1, v34

    if-nez v1, :cond_15

    move-object/from16 v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto/16 :goto_e

    :cond_15
    if-eqz v16, :cond_16

    move-object v12, v0

    check-cast v12, LF9/l$b;

    invoke-virtual {v12}, LF9/l$b;->a()F

    move-result v0

    invoke-static {v15, v0}, LF9/q;->k(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v4, v3, v2, v4}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    move-object/from16 v2, p2

    goto :goto_c

    :cond_16
    const/4 v3, 0x0

    const/4 v4, 0x0

    instance-of v0, v0, LF9/l$a;

    if-eqz v0, :cond_21

    move-object/from16 v2, p2

    const/4 v0, 0x1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v2, v15, v5, v0}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v0

    :goto_c
    invoke-virtual/range {v17 .. v17}, Lz/c;->c()Lz/c$e;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    const/16 v7, 0x36

    invoke-static {v5, v6, v14, v7}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v14, v3}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v14, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_17

    invoke-static {}, LT/j;->c()V

    :cond_17
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_18

    invoke-interface {v14, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_d

    :cond_18
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_d
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v5, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v8, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v8}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_19

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1a
    invoke-virtual/range {v22 .. v22}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v8, v0, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v14, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_e
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    const v0, 0x2f9d14f

    invoke-interface {v14, v0}, LT/l;->U(I)V

    move-object/from16 v0, v35

    if-nez v0, :cond_1b

    goto/16 :goto_10

    :cond_1b
    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v15, v1, v6, v5, v4}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    invoke-virtual/range {v17 .. v17}, Lz/c;->f()Lz/c$e;

    move-result-object v5

    const/16 v6, 0x30

    invoke-static {v5, v4, v14, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v14, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v14, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_1c

    invoke-static {}, LT/j;->c()V

    :cond_1c
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v14, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_1d
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_f
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v4, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v6, v5, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v22 .. v22}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_1e

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    :cond_1e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1f
    invoke-virtual/range {v22 .. v22}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v6, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v14, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_10
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LT/o;->P()V

    :cond_20
    :goto_11
    return-void

    :cond_21
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_22
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF9/q$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
