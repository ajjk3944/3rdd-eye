.class final Lkf/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf/f;->b(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkf/b;


# direct methods
.method constructor <init>(Lkf/b;)V
    .locals 0

    iput-object p1, p0, Lkf/f$a;->a:Lkf/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkf/b;Lhf/o;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lkf/f$a;->f(Lkf/b;Lhf/o;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkf/b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lkf/f$a;->e(Lkf/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkf/b;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lkf/b;->q0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lkf/b;Lhf/o;)LYg/J;
    .locals 0

    invoke-virtual {p1}, Lhf/o;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkf/b;->s0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Landroidx/compose/ui/e;Lhf/o;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    const-string v2, "itemModifier"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "item"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    const/16 v13, 0x10

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-interface {v12, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move v3, v13

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_5

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsContentUi.<anonymous> (SpeedtestResultsContentUi.kt:30)"

    const v6, 0x5d82882

    invoke-static {v6, v2, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v3, 0x67294f94

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lkf/f$a;->a:Lkf/b;

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v5, v0, Lkf/f$a;->a:Lkf/b;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_7

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_8

    :cond_7
    new-instance v6, Lkf/d;

    invoke-direct {v6, v5}, Lkf/d;-><init>(Lkf/b;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const v3, 0x672946fb

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lkf/f$a;->a:Lkf/b;

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v14, v2, 0x70

    if-ne v14, v4, :cond_9

    const/4 v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    or-int/2addr v2, v3

    iget-object v3, v0, Lkf/f$a;->a:Lkf/b;

    invoke-interface/range {p3 .. p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_a

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_b

    :cond_a
    new-instance v4, Lkf/e;

    invoke-direct {v4, v3, v11}, Lkf/e;-><init>(Lkf/b;Lhf/o;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v8, v4

    check-cast v8, Lmh/a;

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    const/16 v9, 0x2f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/d;->h(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Ljava/lang/String;Lmh/a;Lmh/a;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    int-to-float v2, v13

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v12, v14}, Lhf/s;->f(Landroidx/compose/ui/e;Lhf/o;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, Lhf/o;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lkf/f$a;->c(Landroidx/compose/ui/e;Lhf/o;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
