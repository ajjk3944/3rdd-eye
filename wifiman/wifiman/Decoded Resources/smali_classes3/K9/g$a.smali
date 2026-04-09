.class final LK9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK9/g;->h(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(ZLmh/l;)V
    .locals 0

    iput-boolean p1, p0, LK9/g$a;->a:Z

    iput-object p2, p0, LK9/g$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;)LYg/J;
    .locals 0

    invoke-static {p0}, LK9/g$a;->f(Lmh/l;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/l;)LYg/J;
    .locals 0

    invoke-static {p0}, LK9/g$a;->e(Lmh/l;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lmh/l;)LYg/J;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lmh/l;)LYg/J;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lq/e;LT/l;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v9, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.theme.UiThemeSwitcher.<anonymous>.<anonymous> (UiThemeSwitcher.kt:63)"

    const v3, 0x4e6f4e01

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static {v10, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x4

    int-to-float v14, v2

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->d()Lz/c$f;

    move-result-object v2

    iget-boolean v15, v0, LK9/g$a;->a:Z

    iget-object v8, v0, LK9/g$a;->b:Lmh/l;

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v2, v3, v9, v4}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v9, v7}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v9, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v9, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_0
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

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

    if-nez v4, :cond_3

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v22, Lz/Z;->a:Lz/Z;

    const/16 v1, 0x8

    int-to-float v7, v1

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v10, v1, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v16, v22

    invoke-static/range {v16 .. v21}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lt9/b;->g:I

    const/4 v6, 0x0

    invoke-static {v2, v9, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ls9/c$a;

    sget v4, Lt9/a;->d:I

    const/4 v5, 0x2

    invoke-direct {v3, v4, v13, v5, v13}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    xor-int/lit8 v4, v15, 0x1

    const v5, 0x5fdd68c9

    invoke-interface {v9, v5}, LT/l;->U(I)V

    invoke-interface {v9, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_5

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_6

    :cond_5
    new-instance v6, LK9/e;

    invoke-direct {v6, v8}, LK9/e;-><init>(Lmh/l;)V

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v5, v6

    check-cast v5, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v6, 0x2

    const/16 v16, 0x0

    move-object/from16 v6, p2

    move/from16 v16, v7

    move/from16 v7, v17

    move-object/from16 v23, v8

    move/from16 v8, v18

    invoke-static/range {v1 .. v8}, LK9/g;->k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;LT/l;II)V

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v10, v1, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v16, v22

    invoke-static/range {v16 .. v21}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lt9/b;->e:I

    const/4 v3, 0x0

    invoke-static {v2, v9, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ls9/c$a;

    sget v4, Lt9/a;->e:I

    const/4 v5, 0x2

    invoke-direct {v3, v4, v13, v5, v13}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v4, 0x5fddac48

    invoke-interface {v9, v4}, LT/l;->U(I)V

    move-object/from16 v4, v23

    invoke-interface {v9, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_8

    :cond_7
    new-instance v6, LK9/f;

    invoke-direct {v6, v4}, LK9/f;-><init>(Lmh/l;)V

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v5, v6

    check-cast v5, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v4, v15

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LK9/g;->k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LK9/g$a;->c(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
