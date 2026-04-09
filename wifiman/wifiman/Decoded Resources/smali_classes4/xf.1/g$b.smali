.class final Lxf/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxf/g;->b(Landroidx/compose/ui/e;Lxf/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxf/e;


# direct methods
.method constructor <init>(Lxf/e;)V
    .locals 0

    iput-object p1, p0, Lxf/g$b;->a:Lxf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v12, p2

    const-string v1, "innerPadding"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {v12, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUiContent.<anonymous> (WifiAccessPointDetailUiContent.kt:141)"

    const v4, -0x5d724a59

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v14, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v14, v12, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->a()J

    move-result-wide v6

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, v13

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v11, p0

    iget-object v2, v11, Lxf/g$b;->a:Lxf/e;

    invoke-virtual {v2}, Lxf/e;->t0()LLi/N;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v4, v12, v5, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEe/g;

    sget-object v3, Lxf/a;->a:Lxf/a;

    invoke-virtual {v3}, Lxf/a;->b()Lmh/r;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v16, 0x7c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v9, p2

    move/from16 v11, v16

    invoke-static/range {v1 .. v11}, LEe/z;->L(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v14, v12, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->e()Lma/a$e;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$e;->a()J

    move-result-wide v1

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, LEe/B;->b(Landroidx/compose/ui/e;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lxf/g$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
