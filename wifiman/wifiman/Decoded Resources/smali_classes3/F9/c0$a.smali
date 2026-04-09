.class final LF9/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/c0;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:J

.field final synthetic d:LT/q0;

.field final synthetic e:LH/l;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:LCi/e;

.field final synthetic h:Lk0/e;

.field final synthetic i:Landroidx/compose/ui/focus/o;

.field final synthetic j:LH/b;

.field final synthetic k:LL0/U;

.field final synthetic l:LF/D;

.field final synthetic m:LH/d;

.field final synthetic n:Lm0/l0;

.field final synthetic o:I


# direct methods
.method constructor <init>(Ljava/lang/String;ZJLT/q0;LH/l;Ljava/lang/String;LCi/e;Lk0/e;Landroidx/compose/ui/focus/o;LH/b;LL0/U;LF/D;LH/d;Lm0/l0;I)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF9/c0$a;->a:Ljava/lang/String;

    move v1, p2

    iput-boolean v1, v0, LF9/c0$a;->b:Z

    move-wide v1, p3

    iput-wide v1, v0, LF9/c0$a;->c:J

    move-object v1, p5

    iput-object v1, v0, LF9/c0$a;->d:LT/q0;

    move-object v1, p6

    iput-object v1, v0, LF9/c0$a;->e:LH/l;

    move-object v1, p7

    iput-object v1, v0, LF9/c0$a;->f:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, LF9/c0$a;->g:LCi/e;

    move-object v1, p9

    iput-object v1, v0, LF9/c0$a;->h:Lk0/e;

    move-object v1, p10

    iput-object v1, v0, LF9/c0$a;->i:Landroidx/compose/ui/focus/o;

    move-object v1, p11

    iput-object v1, v0, LF9/c0$a;->j:LH/b;

    move-object v1, p12

    iput-object v1, v0, LF9/c0$a;->k:LL0/U;

    move-object/from16 v1, p13

    iput-object v1, v0, LF9/c0$a;->l:LF/D;

    move-object/from16 v1, p14

    iput-object v1, v0, LF9/c0$a;->m:LH/d;

    move-object/from16 v1, p15

    iput-object v1, v0, LF9/c0$a;->n:Lm0/l0;

    move/from16 v1, p16

    iput v1, v0, LF9/c0$a;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LH/l;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LF9/c0$a;->c(LH/l;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LH/l;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "autofill"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LH/l;->r()LH/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0, p1}, LH/f;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p0, v0}, LH/l;->d(LH/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LH/l;->f()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LH/l;->f()V

    throw p1
.end method


# virtual methods
.method public final b(Lz/Y;LT/l;I)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettingsBase"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v8, 0x10

    if-ne v2, v8, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_8

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.settings.UiSettingsTextField2.<anonymous> (UiSettingsTextField2.kt:107)"

    const v4, -0x26563ae7

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    iget-object v7, v0, LF9/c0$a;->a:Ljava/lang/String;

    iget-boolean v6, v0, LF9/c0$a;->b:Z

    iget-wide v14, v0, LF9/c0$a;->c:J

    iget-object v5, v0, LF9/c0$a;->d:LT/q0;

    iget-object v3, v0, LF9/c0$a;->e:LH/l;

    iget-object v13, v0, LF9/c0$a;->f:Ljava/lang/String;

    iget-object v4, v0, LF9/c0$a;->g:LCi/e;

    iget-object v9, v0, LF9/c0$a;->h:Lk0/e;

    iget-object v10, v0, LF9/c0$a;->i:Landroidx/compose/ui/focus/o;

    iget-object v11, v0, LF9/c0$a;->j:LH/b;

    iget-object v8, v0, LF9/c0$a;->k:LL0/U;

    move-wide/from16 v16, v14

    iget-object v15, v0, LF9/c0$a;->l:LF/D;

    iget-object v14, v0, LF9/c0$a;->m:LH/d;

    move-object/from16 v20, v15

    iget-object v15, v0, LF9/c0$a;->n:Lm0/l0;

    move-object/from16 v21, v15

    iget v15, v0, LF9/c0$a;->o:I

    move/from16 v28, v15

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v18, Lz/c;->a:Lz/c;

    invoke-virtual/range {v18 .. v18}, Lz/c;->f()Lz/c$e;

    move-result-object v0

    move-object/from16 p3, v5

    const/16 v5, 0x30

    invoke-static {v0, v2, v12, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v12, v5}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    move-object/from16 v30, v11

    invoke-static {v12, v15}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v19, LE0/g;->K:LE0/g$a;

    move-object/from16 v31, v13

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v22

    if-nez v22, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v22

    if-eqz v22, :cond_4

    invoke-interface {v12, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    move-object/from16 v32, v14

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v0, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v13, v5, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v13}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v19 .. v19}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v13, v11, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    const v2, 0x5e42f81f

    invoke-interface {v12, v2}, LT/l;->U(I)V

    const/4 v5, 0x6

    if-eqz v7, :cond_7

    const/16 v2, 0x40

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v11, 0x20

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v11, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v11, v12, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->a()Lma/a$a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v11

    move-object/from16 v34, v15

    invoke-virtual {v11}, Lr9/a$b;->f()J

    move-result-wide v14

    int-to-float v11, v5

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-static {v11}, LE/h;->d(F)LE/g;

    move-result-object v11

    invoke-static {v2, v14, v15, v11}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v11, 0x4

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v2, v11, v14, v13, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    goto :goto_2

    :cond_7
    move-object/from16 v34, v15

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v26, 0x2

    const/16 v27, 0x0

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    move-object/from16 v22, v0

    move-object/from16 v23, v34

    invoke-static/range {v22 .. v27}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v1}, Lf0/c$a;->e()Lf0/c;

    move-result-object v11

    const/4 v13, 0x0

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v11

    invoke-static {v12, v13}, LT/j;->a(LT/l;I)I

    move-result v22

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v12, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v23

    if-nez v23, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v23

    if-eqz v23, :cond_9

    invoke-interface {v12, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v5, v11, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->g()Lmh/p;

    move-result-object v11

    invoke-static {v5, v13, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->b()Lmh/p;

    move-result-object v11

    invoke-interface {v5}, LT/l;->o()Z

    move-result v13

    if-nez v13, :cond_a

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_b

    :cond_a
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v5, v13}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v5, v13, v11}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual/range {v19 .. v19}, LE0/g$a;->f()Lmh/p;

    move-result-object v11

    invoke-static {v5, v2, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Lz/c;->b()Lz/c$f;

    move-result-object v2

    const/16 v5, 0x36

    invoke-static {v2, v1, v12, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v14, 0x0

    invoke-static {v12, v14}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v11

    move-object/from16 v13, v34

    invoke-static {v12, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_d

    invoke-interface {v12, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_d
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v1, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v14, v11, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v19 .. v19}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v14}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_e

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    :cond_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v14, v2, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v19 .. v19}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v14, v5, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/16 v26, 0x2

    const/16 v27, 0x0

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    move-object/from16 v22, v0

    move-object/from16 v23, v13

    invoke-static/range {v22 .. v27}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0x341735dd    # -3.0512198E7f

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_10

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_11

    :cond_10
    new-instance v5, LF9/b0;

    invoke-direct {v5, v3}, LF9/b0;-><init>(LH/l;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v1, v4, v5}, LM9/c;->a(Landroidx/compose/ui/e;LCi/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v9, v10}, LM9/i;->d(Landroidx/compose/ui/e;Lk0/e;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v10}, Landroidx/compose/ui/focus/p;->a(Landroidx/compose/ui/e;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v9}, LM9/i;->k(Landroidx/compose/ui/e;Lk0/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v9, LH/k$c;->b:LH/k$c;

    const/16 v18, 0x0

    const/16 v19, 0x7608

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v5, v30

    const/4 v1, 0x0

    move-object/from16 v22, v13

    move-object/from16 v15, v31

    const/4 v14, 0x0

    move-object v13, v1

    move-wide/from16 v30, v16

    move-object/from16 v16, v32

    const/16 v23, 0x0

    move-object v14, v1

    move-object/from16 v36, v15

    move/from16 v37, v28

    move-object v15, v1

    const/high16 v17, 0x6000000

    move-object v1, v3

    move-object/from16 v32, v3

    move v3, v6

    move-object/from16 v29, p3

    move/from16 v33, v23

    move/from16 v34, v6

    move-object v6, v8

    move-object/from16 v35, v7

    move-object/from16 v7, v20

    move-object/from16 v8, v16

    move-object/from16 v12, v21

    move-object/from16 v16, p2

    invoke-static/range {v1 .. v19}, LF/f;->a(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LH/e;LH/j;Landroidx/compose/foundation/o;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const/4 v1, 0x1

    move-object/from16 v2, v36

    if-eqz v2, :cond_13

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_5

    :cond_12
    invoke-virtual/range {v32 .. v32}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_13

    move v3, v1

    goto :goto_6

    :cond_13
    :goto_5
    move/from16 v3, v33

    :goto_6
    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v6, v5, v4, v6}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v7

    invoke-static {v6, v5, v4, v6}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v4

    new-instance v5, LF9/c0$a$a;

    move/from16 v6, v37

    invoke-direct {v5, v2, v6}, LF9/c0$a$a;-><init>(Ljava/lang/String;I)V

    const v2, 0x2554e997

    move-object/from16 v15, p2

    const/16 v6, 0x36

    invoke-static {v2, v1, v5, v15, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const v8, 0x30d80

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move v1, v3

    move-object v3, v7

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const v1, 0x5e4452c8

    invoke-interface {v15, v1}, LT/l;->U(I)V

    if-eqz v35, :cond_15

    const/16 v1, 0x10

    int-to-float v2, v1

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v23

    const/16 v27, 0xe

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const v3, 0x5e4467eb

    invoke-interface {v15, v3}, LT/l;->U(I)V

    if-eqz v34, :cond_14

    move-object v4, v15

    goto :goto_7

    :cond_14
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v11

    const/16 v3, 0xe

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v9, v30

    move-object v4, v15

    move v15, v3

    invoke-static/range {v9 .. v16}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    move-wide/from16 v30, v5

    :goto_7
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v1}, LY0/w;->g(I)J

    move-result-wide v5

    sget-object v1, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v1}, LQ0/A$a;->e()LQ0/A;

    move-result-object v8

    const/16 v1, 0x18

    invoke-static {v1}, LY0/w;->g(I)J

    move-result-wide v14

    invoke-static/range {v33 .. v33}, LY0/w;->g(I)J

    move-result-wide v10

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v16

    const/16 v24, 0xc36

    const v25, 0x1d350

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v23, 0xc30c30

    move-object/from16 v1, v35

    move-wide/from16 v3, v30

    move-object/from16 v22, p2

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    :cond_15
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {v29 .. v29}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const v2, 0x5e44ab51

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LT/l;->U(I)V

    move-object/from16 v2, v32

    invoke-interface {v3, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_16

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_17

    :cond_16
    new-instance v5, LF9/c0$a$b;

    invoke-direct {v5, v2}, LF9/c0$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v5, Lmh/a;

    const/4 v2, 0x6

    invoke-static {v0, v1, v5, v3, v2}, LG9/c;->b(Lz/Y;ZLmh/a;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/c0$a;->b(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
