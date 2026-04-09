.class final Lrf/v$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/v;->s(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:LN/R0;

.field final synthetic c:Z

.field final synthetic d:Ly/m;

.field final synthetic e:Ls9/d;

.field final synthetic f:Ls9/d;


# direct methods
.method constructor <init>(Lmh/l;LN/R0;ZLy/m;Ls9/d;Ls9/d;)V
    .locals 0

    iput-object p1, p0, Lrf/v$e;->a:Lmh/l;

    iput-object p2, p0, Lrf/v$e;->b:LN/R0;

    iput-boolean p3, p0, Lrf/v$e;->c:Z

    iput-object p4, p0, Lrf/v$e;->d:Ly/m;

    iput-object p5, p0, Lrf/v$e;->e:Ls9/d;

    iput-object p6, p0, Lrf/v$e;->f:Ls9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(ZZ)LN/b1;
    .locals 0

    invoke-static {p0, p1}, Lrf/v$e;->c(ZZ)LN/b1;

    move-result-object p0

    return-object p0
.end method

.method private static final c(ZZ)LN/b1;
    .locals 0

    new-instance p0, LN/Y;

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-direct {p0, p1}, LN/Y;-><init>(F)V

    return-object p0
.end method


# virtual methods
.method public final b(Lz/f;LT/l;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    const-string v2, "$this$BoxWithConstraints"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.teleport.component.TeleportTunnelSwitch.<anonymous> (TeleportTunnelSwitch.kt:93)"

    const v6, 0x45f60544

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lz/f;->b()F

    move-result v2

    invoke-interface/range {p1 .. p1}, Lz/f;->e()F

    move-result v4

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v11, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    int-to-float v3, v3

    div-float v3, v2, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-interface {v1, v3}, LY0/d;->d1(F)F

    move-result v1

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v5}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    filled-new-array {v3, v1}, [LYg/s;

    move-result-object v1

    invoke-static {v1}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object v14

    sget-object v15, Lw/q;->Horizontal:Lw/q;

    iget-object v1, v0, Lrf/v$e;->a:Lmh/l;

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    move/from16 v16, v1

    goto :goto_3

    :cond_5
    move/from16 v16, v3

    :goto_3
    iget-object v13, v0, Lrf/v$e;->b:LN/R0;

    iget-boolean v1, v0, Lrf/v$e;->c:Z

    iget-object v5, v0, Lrf/v$e;->d:Ly/m;

    const v6, -0x2a65f045

    invoke-interface {v11, v6}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_6

    new-instance v6, Lrf/w;

    invoke-direct {v6}, Lrf/w;-><init>()V

    invoke-interface {v11, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v19, v6

    check-cast v19, Lmh/p;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v22, 0x100

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v17, v1

    move-object/from16 v18, v5

    invoke-static/range {v12 .. v23}, LN/Q0;->g(Landroidx/compose/ui/e;LN/R0;Ljava/util/Map;Lw/q;ZZLy/m;Lmh/p;LN/x0;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v7, v0, Lrf/v$e;->b:LN/R0;

    iget-object v5, v0, Lrf/v$e;->e:Ls9/d;

    iget-object v6, v0, Lrf/v$e;->f:Ls9/d;

    iget-object v8, v0, Lrf/v$e;->d:Ly/m;

    sget-object v9, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v9}, Lf0/c$a;->o()Lf0/c;

    move-result-object v9

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v9

    invoke-static {v11, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v11, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v11, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_4
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v9, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v13, v10, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v13, v3, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v13, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v7}, LN/R0;->s()LT/z1;

    move-result-object v9

    const v10, 0xc00006

    move v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v9

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v10}, Lrf/v;->v(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lrf/v$e;->b(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
