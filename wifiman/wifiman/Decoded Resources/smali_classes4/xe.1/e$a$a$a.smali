.class final Lxe/e$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/e$a$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxe/r0;

.field final synthetic b:Lf2/w;

.field final synthetic c:Lf2/w;

.field final synthetic d:Landroidx/lifecycle/a;

.field final synthetic e:LGe/g$a;

.field final synthetic f:Lxe/h;


# direct methods
.method constructor <init>(Lxe/r0;Lf2/w;Lf2/w;Landroidx/lifecycle/a;LGe/g$a;Lxe/h;)V
    .locals 0

    iput-object p1, p0, Lxe/e$a$a$a;->a:Lxe/r0;

    iput-object p2, p0, Lxe/e$a$a$a;->b:Lf2/w;

    iput-object p3, p0, Lxe/e$a$a$a;->c:Lf2/w;

    iput-object p4, p0, Lxe/e$a$a$a;->d:Landroidx/lifecycle/a;

    iput-object p5, p0, Lxe/e$a$a$a;->e:LGe/g$a;

    iput-object p6, p0, Lxe/e$a$a$a;->f:Lxe/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "scaffoldPadding"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.WifimanAppUi.<anonymous>.<anonymous>.<anonymous> (WiFiManAppUi.kt:122)"

    const v6, 0x142d84d

    invoke-static {v6, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface/range {p1 .. p1}, Lz/N;->c()F

    move-result v10

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/o;->e(FFFFILjava/lang/Object;)Lz/N;

    move-result-object v1

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v1}, Lz/i0;->a(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v3, v0, Lxe/e$a$a$a;->a:Lxe/r0;

    iget-object v4, v0, Lxe/e$a$a$a;->b:Lf2/w;

    iget-object v7, v0, Lxe/e$a$a$a;->c:Lf2/w;

    iget-object v8, v0, Lxe/e$a$a$a;->d:Landroidx/lifecycle/a;

    iget-object v9, v0, Lxe/e$a$a$a;->e:LGe/g$a;

    iget-object v10, v0, Lxe/e$a$a$a;->f:Lxe/h;

    sget-object v11, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v11}, Lf0/c$a;->o()Lf0/c;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v11

    invoke-static {v2, v12}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v2, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v15, LE0/g;->K:LE0/g$a;

    invoke-virtual {v15}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v2, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v15}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v6, v11, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v6, v14, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v15}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v6}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_7

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v6, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v6, v11, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v15}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v6, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v3, v4, v2, v12}, Lxe/B;->u(Lxe/r0;Lf2/w;LT/l;I)V

    invoke-static {v3, v7, v2, v12}, Lxe/B;->r(Lxe/r0;Lf2/w;LT/l;I)V

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v1

    invoke-virtual {v1, v8}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    new-instance v3, Lxe/e$a$a$a$a;

    invoke-direct {v3, v10}, Lxe/e$a$a$a$a;-><init>(Lxe/h;)V

    const/16 v4, 0x36

    const v5, -0x7a959e6d

    const/4 v6, 0x1

    invoke-static {v5, v6, v3, v2, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    sget v4, LT/I0;->i:I

    or-int/lit8 v4, v4, 0x30

    invoke-static {v1, v3, v2, v4}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-virtual {v9}, LGe/g$a;->n0()LLi/N;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v12, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCi/c;

    const v3, -0x15fe2ae1

    invoke-interface {v2, v3}, LT/l;->U(I)V

    invoke-interface {v2, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, Lxe/e$a$a$a$b;

    invoke-direct {v4, v9}, Lxe/e$a$a$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v4, Lmh/l;

    invoke-static {v1, v4, v2, v12}, LGe/l;->e(LCi/c;Lmh/l;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lxe/e$a$a$a;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
