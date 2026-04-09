.class final LTe/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/t;->f(Landroidx/compose/ui/e;LTe/p;Lmh/a;Lmh/a;Lmh/a;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTe/p;

.field final synthetic b:Lmh/a;

.field final synthetic c:Lmh/a;

.field final synthetic d:Lmh/a;


# direct methods
.method constructor <init>(LTe/p;Lmh/a;Lmh/a;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LTe/t$a;->a:LTe/p;

    iput-object p2, p0, LTe/t$a;->b:Lmh/a;

    iput-object p3, p0, LTe/t$a;->c:Lmh/a;

    iput-object p4, p0, LTe/t$a;->d:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const-string v3, "$this$UiContentCard"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x11

    const/16 v4, 0x10

    if-ne v3, v4, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.signal.components.SignalMapperFloorplanRecordItem.<anonymous> (FloorplanRecordItem.kt:69)"

    const v6, 0x396acedd

    invoke-static {v6, v2, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v2, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, Lz/c;->a:Lz/c;

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v9

    invoke-virtual {v7, v9}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    iget-object v9, v0, LTe/t$a;->a:LTe/p;

    iget-object v10, v0, LTe/t$a;->b:Lmh/a;

    iget-object v11, v0, LTe/t$a;->c:Lmh/a;

    iget-object v12, v0, LTe/t$a;->d:Lmh/a;

    sget-object v13, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v13}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v13

    const/4 v14, 0x6

    invoke-static {v7, v13, v1, v14}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v13, 0x0

    invoke-static {v1, v13}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v1, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_4

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v14, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v14, v15, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v14}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v14, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v14, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v14, v4, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    const/4 v3, 0x0

    invoke-static {v2, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v7

    const/4 v13, 0x2

    invoke-static {v4, v7, v3, v13, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v7, 0x6

    invoke-static {v4, v9, v1, v7}, LTe/t;->k(Landroidx/compose/ui/e;LTe/p;LT/l;I)V

    const/16 v4, 0xbe

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual {v9}, LTe/p;->a()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-static {v4, v9, v10, v1, v7}, LUe/f;->e(Landroidx/compose/ui/e;Ljava/lang/Long;Lmh/a;LT/l;I)V

    invoke-static {v2, v3, v5, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v17

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v11, v12, v1, v3}, LTe/t;->j(Landroidx/compose/ui/e;Lmh/a;Lmh/a;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LTe/t$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
