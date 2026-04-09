.class final LFf/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/N;

.field final synthetic b:LFf/e;

.field final synthetic c:LA/B;


# direct methods
.method constructor <init>(Lz/N;LFf/e;LA/B;)V
    .locals 0

    iput-object p1, p0, LFf/i$b$a;->a:Lz/N;

    iput-object p2, p0, LFf/i$b$a;->b:LFf/e;

    iput-object p3, p0, LFf/i$b$a;->c:LA/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LFf/c;LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    const-string v2, "itemType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-interface {v9, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

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

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:209)"

    const v6, -0x282c45d2

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const v4, -0x5783a3c4

    invoke-interface {v9, v4}, LT/l;->U(I)V

    and-int/lit8 v2, v2, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_5

    move v2, v5

    goto :goto_3

    :cond_5
    move v2, v4

    :goto_3
    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    if-nez v2, :cond_6

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_8

    :cond_6
    instance-of v2, v1, LFf/c$b;

    if-eqz v2, :cond_7

    move-object v2, v1

    check-cast v2, LFf/c$b;

    invoke-virtual {v2}, LFf/c$b;->a()F

    move-result v3

    invoke-virtual {v2}, LFf/c$b;->b()F

    move-result v2

    new-instance v7, LGf/u;

    invoke-direct {v7, v2, v3, v6}, LGf/u;-><init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_4
    move-object v3, v7

    goto :goto_5

    :cond_7
    instance-of v2, v1, LFf/c$a;

    if-eqz v2, :cond_a

    int-to-float v2, v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    new-instance v7, LGf/u;

    invoke-direct {v7, v2, v3, v6}, LGf/u;-><init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :goto_5
    invoke-interface {v9, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, LGf/u;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v2, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v2, v9, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->a()J

    move-result-wide v11

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v2, v7, v5, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v7, v0, LFf/i$b$a;->a:Lz/N;

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v7, v0, LFf/i$b$a;->b:LFf/e;

    invoke-virtual {v7}, LFf/e;->q0()LLi/N;

    move-result-object v7

    invoke-static {v7, v6, v9, v4, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LEe/g;

    iget-object v6, v0, LFf/i$b$a;->c:LA/B;

    new-instance v7, LFf/i$b$a$a;

    iget-object v8, v0, LFf/i$b$a;->b:LFf/e;

    invoke-direct {v7, v1, v8, v3}, LFf/i$b$a$a;-><init>(LFf/c;LFf/e;LGf/u;)V

    const/16 v1, 0x36

    const v3, 0x8607ca9

    invoke-static {v3, v5, v7, v9, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v11, 0x78

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    move-object v1, v2

    move-object v2, v4

    move-object v3, v6

    move v4, v5

    move v5, v7

    move-object v6, v12

    move-object v7, v13

    move-object/from16 v9, p2

    invoke-static/range {v1 .. v11}, LEe/z;->L(Landroidx/compose/ui/e;LEe/g;LA/B;ZZLmh/r;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_6
    return-void

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFf/c;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$b$a;->a(LFf/c;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
