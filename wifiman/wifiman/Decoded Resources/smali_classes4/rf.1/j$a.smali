.class final Lrf/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf/j;->f(Landroidx/compose/ui/e;Lrf/e;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrf/e;


# direct methods
.method constructor <init>(Lrf/e;)V
    .locals 0

    iput-object p1, p0, Lrf/j$a;->a:Lrf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lrf/e;LT/l;I)V
    .locals 15

    move-object/from16 v0, p1

    move-object/from16 v7, p2

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v7, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p3, v1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p3

    :goto_1
    and-int/lit8 v1, v8, 0x13

    const/16 v3, 0x12

    if-ne v1, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    move-object v10, p0

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.component.TeleportTopologyItem.<anonymous> (TeleportTunnelNetworkTopology.kt:193)"

    const v4, -0x3cdbfaf7

    invoke-static {v4, v8, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v1, Lz/c;->a:Lz/c;

    invoke-virtual {v1}, Lz/c;->b()Lz/c$f;

    move-result-object v1

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    move-object v10, p0

    iget-object v4, v10, Lrf/j$a;->a:Lrf/e;

    const/16 v5, 0x36

    invoke-static {v1, v3, v7, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v7, v3}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v7, v9}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

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

    invoke-interface {v7, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_3
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v1, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v13, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v13}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v6, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v13, v5, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v13, v11, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const v1, 0x7390a6ae

    invoke-interface {v7, v1}, LT/l;->U(I)V

    invoke-virtual {v4}, Lrf/e;->c()Lcom/ui/wifiman/ui/teleport/z;

    move-result-object v1

    if-eqz v1, :cond_9

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v9, v1, v5, v2, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v4}, Lrf/e;->c()Lcom/ui/wifiman/ui/teleport/z;

    move-result-object v2

    invoke-static {v2, v7, v3}, Lcom/ui/wifiman/ui/teleport/C;->b(Lcom/ui/wifiman/ui/teleport/z;LT/l;I)J

    move-result-wide v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    :cond_9
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    shl-int/lit8 v1, v8, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    invoke-static {v9, v0, v7, v1}, Lcom/ui/wifiman/ui/component/network/B;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrf/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lrf/j$a;->a(Lrf/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
