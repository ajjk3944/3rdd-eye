.class final LF9/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LT/q0;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:I

.field final synthetic f:Z

.field final synthetic g:LT/q0;

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:J

.field final synthetic j:LCi/e;

.field final synthetic k:Lmh/l;

.field final synthetic l:Landroidx/compose/ui/focus/o;

.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Lk0/e;

.field final synthetic o:LT/q0;

.field final synthetic p:LF/D;

.field final synthetic q:LF/C;

.field final synthetic r:Lm0/l0;


# direct methods
.method constructor <init>(Ljava/lang/String;LT/q0;ZZIZLT/q0;Ljava/lang/String;JLCi/e;Lmh/l;Landroidx/compose/ui/focus/o;Ljava/lang/String;Lk0/e;LT/q0;LF/D;LF/C;Lm0/l0;)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF9/k0$a;->a:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, LF9/k0$a;->b:LT/q0;

    move v1, p3

    iput-boolean v1, v0, LF9/k0$a;->c:Z

    move v1, p4

    iput-boolean v1, v0, LF9/k0$a;->d:Z

    move v1, p5

    iput v1, v0, LF9/k0$a;->e:I

    move v1, p6

    iput-boolean v1, v0, LF9/k0$a;->f:Z

    move-object v1, p7

    iput-object v1, v0, LF9/k0$a;->g:LT/q0;

    move-object v1, p8

    iput-object v1, v0, LF9/k0$a;->h:Ljava/lang/String;

    move-wide v1, p9

    iput-wide v1, v0, LF9/k0$a;->i:J

    move-object v1, p11

    iput-object v1, v0, LF9/k0$a;->j:LCi/e;

    move-object v1, p12

    iput-object v1, v0, LF9/k0$a;->k:Lmh/l;

    move-object/from16 v1, p13

    iput-object v1, v0, LF9/k0$a;->l:Landroidx/compose/ui/focus/o;

    move-object/from16 v1, p14

    iput-object v1, v0, LF9/k0$a;->m:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, LF9/k0$a;->n:Lk0/e;

    move-object/from16 v1, p16

    iput-object v1, v0, LF9/k0$a;->o:LT/q0;

    move-object/from16 v1, p17

    iput-object v1, v0, LF9/k0$a;->p:LF/D;

    move-object/from16 v1, p18

    iput-object v1, v0, LF9/k0$a;->q:LF/C;

    move-object/from16 v1, p19

    iput-object v1, v0, LF9/k0$a;->r:Lm0/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/graphics/c;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/k0$a;->h(Landroidx/compose/ui/graphics/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/k0$a;->k(LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LF9/k0$a;->j(Lmh/l;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LT/q0;Ljava/lang/String;Lk0/l;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LF9/k0$a;->i(LT/q0;Ljava/lang/String;Lk0/l;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/graphics/c;)LYg/J;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/graphics/c;->I1(Lm0/i1;)V

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Landroidx/compose/ui/graphics/c;->G(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(LT/q0;Ljava/lang/String;Lk0/l;)LYg/J;
    .locals 1

    const-string/jumbo v0, "focusState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lk0/l;->getHasFocus()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Lmh/l;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(LT/q0;)LYg/J;
    .locals 1

    invoke-static {p0}, LF9/k0;->j(LT/q0;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, LF9/k0;->k(LT/q0;Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final f(Lz/Y;LT/l;I)V
    .locals 54

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettingsBase"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v12, 0x10

    if-ne v2, v12, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_f

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.settings.UiSettingsTextField.<anonymous> (UiSettingsTextField.kt:109)"

    const v4, 0x7adf0aeb

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LF9/k0$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    iget-object v2, v0, LF9/k0$a;->b:LT/q0;

    iget-boolean v3, v0, LF9/k0$a;->c:Z

    const/4 v6, 0x0

    if-eqz v3, :cond_4

    if-eqz v1, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    move v3, v6

    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v2, v3}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LN/a1;->e()LT/H0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, LL0/U;

    if-eqz v1, :cond_6

    iget-boolean v2, v0, LF9/k0$a;->d:Z

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    const v2, -0x4a55d08b

    invoke-interface {v15, v2}, LT/l;->U(I)V

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v15, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v2

    :goto_3
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-wide/from16 v17, v2

    goto :goto_5

    :cond_6
    :goto_4
    const v2, -0x4a55d40b

    invoke-interface {v15, v2}, LT/l;->U(I)V

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v15, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->d()J

    move-result-wide v2

    goto :goto_3

    :goto_5
    invoke-static {v12}, LY0/w;->g(I)J

    move-result-wide v19

    sget-object v48, LQ0/A;->b:LQ0/A$a;

    invoke-virtual/range {v48 .. v48}, LQ0/A$a;->e()LQ0/A;

    move-result-object v21

    const/16 v49, 0x18

    invoke-static/range {v49 .. v49}, LY0/w;->g(I)J

    move-result-wide v38

    invoke-static {v6}, LY0/w;->g(I)J

    move-result-wide v26

    iget v2, v0, LF9/k0$a;->e:I

    move/from16 v36, v2

    const v46, 0xfd7f78

    const/16 v47, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-static/range {v16 .. v47}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v17

    sget-object v21, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v21 .. v21}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    iget-boolean v4, v0, LF9/k0$a;->f:Z

    iget-object v3, v0, LF9/k0$a;->g:LT/q0;

    iget-object v14, v0, LF9/k0$a;->h:Ljava/lang/String;

    iget-boolean v13, v0, LF9/k0$a;->d:Z

    iget-wide v10, v0, LF9/k0$a;->i:J

    iget-object v9, v0, LF9/k0$a;->b:LT/q0;

    iget-object v5, v0, LF9/k0$a;->j:LCi/e;

    move/from16 v16, v13

    iget-object v13, v0, LF9/k0$a;->k:Lmh/l;

    iget-object v12, v0, LF9/k0$a;->l:Landroidx/compose/ui/focus/o;

    iget-object v7, v0, LF9/k0$a;->m:Ljava/lang/String;

    iget-object v8, v0, LF9/k0$a;->n:Lk0/e;

    iget-object v6, v0, LF9/k0$a;->o:LT/q0;

    move-wide/from16 v24, v10

    iget-object v11, v0, LF9/k0$a;->p:LF/D;

    iget-object v10, v0, LF9/k0$a;->q:LF/C;

    move-object/from16 v18, v11

    iget-object v11, v0, LF9/k0$a;->r:Lm0/l0;

    move-object/from16 v32, v11

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v19, Lz/c;->a:Lz/c;

    invoke-virtual/range {v19 .. v19}, Lz/c;->f()Lz/c$e;

    move-result-object v0

    move/from16 v33, v4

    const/16 v4, 0x30

    invoke-static {v0, v2, v15, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v15, v2}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v2

    move-object/from16 v34, v9

    invoke-static {v15, v11}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v20, LE0/g;->K:LE0/g$a;

    move-object/from16 v35, v10

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v26

    if-nez v26, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v26

    if-eqz v26, :cond_8

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_6
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    move-object/from16 v36, v3

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v10, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v10, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v10}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v10, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v20 .. v20}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v10, v9, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    const v2, 0x5ac09821

    invoke-interface {v15, v2}, LT/l;->U(I)V

    const v2, 0x5ac09bad

    invoke-interface {v15, v2}, LT/l;->U(I)V

    const/4 v3, 0x6

    if-eqz v14, :cond_b

    const/16 v2, 0x40

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v9, 0x20

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v9, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v9, v15, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->a()Lma/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v9

    invoke-virtual {v9}, Lr9/a$b;->f()J

    move-result-wide v9

    int-to-float v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v4}, LE/h;->d(F)LE/g;

    move-result-object v4

    invoke-static {v2, v9, v10, v4}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v9, 0x2

    move-object/from16 v37, v14

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-static {v2, v4, v14, v9, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    goto :goto_7

    :cond_b
    move-object/from16 v37, v14

    const/4 v14, 0x0

    const/16 v30, 0x2

    const/16 v31, 0x0

    const/high16 v28, 0x3f800000    # 1.0f

    const/16 v29, 0x0

    move-object/from16 v26, v0

    move-object/from16 v27, v11

    invoke-static/range {v26 .. v31}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    :goto_7
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {v21 .. v21}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    invoke-virtual/range {v19 .. v19}, Lz/c;->b()Lz/c$f;

    move-result-object v9

    const/16 v10, 0x36

    invoke-static {v9, v4, v15, v10}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v15, v9}, LT/j;->a(LT/l;I)I

    move-result v19

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v26

    if-nez v26, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v26

    if-eqz v26, :cond_d

    invoke-interface {v15, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_8

    :cond_d
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_8
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v3, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v3, v9, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v20 .. v20}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v3}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_e

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    :cond_e
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v3, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v3, v9, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v20 .. v20}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v3, v2, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const/16 v30, 0x2

    const/16 v31, 0x0

    const/high16 v28, 0x3f800000    # 1.0f

    const/16 v29, 0x0

    move-object/from16 v26, v0

    move-object/from16 v27, v11

    invoke-static/range {v26 .. v31}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v5, v13}, LM9/c;->a(Landroidx/compose/ui/e;LCi/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v12}, Landroidx/compose/ui/focus/p;->a(Landroidx/compose/ui/e;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/e;

    move-result-object v2

    const v3, -0x659c0046

    invoke-interface {v15, v3}, LT/l;->U(I)V

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_10

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_11

    :cond_10
    new-instance v4, LF9/g0;

    invoke-direct {v4, v6, v7}, LF9/g0;-><init>(LT/q0;Ljava/lang/String;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v2, v4}, Landroidx/compose/ui/focus/e;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v8}, LM9/i;->k(Landroidx/compose/ui/e;Lk0/e;)Landroidx/compose/ui/e;

    move-result-object v3

    if-nez v1, :cond_12

    invoke-interface {v6}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_12

    const-string v1, ""

    :cond_12
    invoke-static/range {v36 .. v36}, LF9/k0;->j(LT/q0;)Z

    move-result v2

    if-nez v2, :cond_13

    invoke-interface {v6}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_14

    :cond_13
    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    goto :goto_a

    :cond_14
    new-instance v2, LR0/J;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct {v2, v6, v7, v8}, LR0/J;-><init>(CILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_9
    move-object v12, v2

    goto :goto_b

    :goto_a
    sget-object v2, LR0/c0;->a:LR0/c0$a;

    invoke-virtual {v2}, LR0/c0$a;->c()LR0/c0;

    move-result-object v2

    goto :goto_9

    :goto_b
    const v2, -0x659bc6da

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-interface {v15, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_15

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_16

    :cond_15
    new-instance v4, LF9/h0;

    invoke-direct {v4, v13}, LF9/h0;-><init>(Lmh/l;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    move-object v2, v4

    check-cast v2, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v19, 0x0

    const v20, 0xb610

    const/4 v5, 0x0

    const/4 v9, 0x1

    move-object/from16 v30, v34

    const/4 v10, 0x0

    move-wide/from16 v22, v24

    move-object/from16 v24, v35

    const/16 v4, 0x36

    const/16 v25, 0x0

    move-object/from16 v50, v11

    move-object/from16 v26, v18

    move-object/from16 v27, v32

    move/from16 v11, v25

    const/16 v18, 0x0

    move-object/from16 v51, v13

    move/from16 v25, v16

    move-object/from16 v13, v18

    const/16 v16, 0x0

    move/from16 v28, v14

    move-object/from16 v31, v37

    move-object/from16 v14, v16

    const/high16 v18, 0x6000000

    move-object/from16 v52, v36

    move/from16 v28, v33

    move/from16 v4, v25

    move/from16 v32, v6

    move-object/from16 v6, v17

    move-object/from16 v7, v26

    move-object/from16 v8, v24

    move-object/from16 v15, v27

    move-object/from16 v17, p2

    invoke-static/range {v1 .. v20}, LF/f;->d(Ljava/lang/String;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    const v1, 0x5ac18983

    move-object/from16 v13, p2

    invoke-interface {v13, v1}, LT/l;->U(I)V

    if-eqz v28, :cond_19

    const/16 v9, 0x10

    int-to-float v1, v9

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move-object/from16 v12, v50

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v10, 0x6

    invoke-static {v1, v13, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v21 .. v21}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v2

    const v1, 0x5ac1ac12

    invoke-interface {v13, v1}, LT/l;->U(I)V

    move-object/from16 v1, v52

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_17

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_18

    :cond_17
    new-instance v4, LF9/i0;

    invoke-direct {v4, v1}, LF9/i0;-><init>(LT/q0;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_18
    move-object v3, v4

    check-cast v3, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v4, LF9/k0$a$a;

    invoke-direct {v4, v1}, LF9/k0$a$a;-><init>(LT/q0;)V

    const v1, 0x2c6377b0

    const/4 v11, 0x1

    const/16 v14, 0x36

    invoke-static {v1, v11, v4, v13, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/16 v7, 0x6000

    const/16 v8, 0xc

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v3

    move v3, v4

    move-object v4, v6

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    goto :goto_c

    :cond_19
    move-object/from16 v12, v50

    const/16 v9, 0x10

    const/4 v10, 0x6

    const/4 v11, 0x1

    const/16 v14, 0x36

    :goto_c
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v1, 0x5ac20457

    invoke-interface {v13, v1}, LT/l;->U(I)V

    if-eqz v31, :cond_1b

    int-to-float v1, v9

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v13, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const v1, 0x5ac218a1

    invoke-interface {v13, v1}, LT/l;->U(I)V

    if-eqz v25, :cond_1a

    move-wide/from16 v3, v22

    goto :goto_d

    :cond_1a
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v1

    invoke-interface {v13, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v24

    const/16 v28, 0xe

    const/16 v29, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v22 .. v29}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    move-wide v3, v1

    :goto_d
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v9}, LY0/w;->g(I)J

    move-result-wide v5

    invoke-virtual/range {v48 .. v48}, LQ0/A$a;->e()LQ0/A;

    move-result-object v8

    invoke-static/range {v49 .. v49}, LY0/w;->g(I)J

    move-result-wide v1

    move v9, v14

    move-wide v14, v1

    invoke-static/range {v32 .. v32}, LY0/w;->g(I)J

    move-result-wide v1

    move v7, v11

    move-wide v10, v1

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v16

    const/16 v24, 0xc36

    const v25, 0x1d352

    const/4 v2, 0x0

    const/4 v1, 0x0

    move-object v7, v1

    move-object v9, v1

    move-object/from16 v53, v12

    move-object v12, v1

    move-object v13, v1

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v23, 0xc30c00

    move-object/from16 v1, v31

    move-object/from16 v22, p2

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    goto :goto_e

    :cond_1b
    move-object/from16 v53, v12

    :goto_e
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface/range {v30 .. v30}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    sget-object v1, LF9/b;->a:LF9/b;

    invoke-virtual {v1}, LF9/b;->a()Lmh/q;

    move-result-object v7

    const v9, 0x180006

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const v1, 0x5ac269d9

    move-object/from16 v11, p2

    invoke-interface {v11, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1c

    new-instance v1, LF9/j0;

    invoke-direct {v1}, LF9/j0;-><init>()V

    invoke-interface {v11, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1c
    check-cast v1, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object/from16 v2, v53

    invoke-static {v2, v1}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-interface/range {v30 .. v30}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v1, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v5, v1, v4}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v6

    invoke-static {v4, v5, v1, v4}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v5

    new-instance v1, LF9/k0$a$b;

    move-object/from16 v4, v51

    invoke-direct {v1, v0, v4}, LF9/k0$a$b;-><init>(Lz/Y;Lmh/l;)V

    const v4, 0x3f3c6398

    const/4 v7, 0x1

    const/16 v8, 0x36

    invoke-static {v4, v7, v1, v11, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x186d86

    const/16 v10, 0x10

    const/4 v8, 0x0

    move-object v1, v0

    move-object v4, v6

    move-object v6, v8

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LT/o;->P()V

    :cond_1d
    :goto_f
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/k0$a;->f(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
