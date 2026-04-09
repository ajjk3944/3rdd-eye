.class final LFf/i$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i$a$b;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;

.field final synthetic b:LT/o0;


# direct methods
.method constructor <init>(LFf/e;LT/o0;)V
    .locals 0

    iput-object p1, p0, LFf/i$a$b$a;->a:LFf/e;

    iput-object p2, p0, LFf/i$a$b$a;->b:LT/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LFf/e;LT/o0;Lic/b;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LFf/i$a$b$a;->c(LFf/e;LT/o0;Lic/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LFf/e;LT/o0;Lic/b;)LYg/J;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LFf/e;->z0(Lic/b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LFf/i;->j(LT/o0;J)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:170)"

    const v3, -0xbfa688f

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v8, v0, LFf/i$a$b$a;->a:LFf/e;

    iget-object v1, v0, LFf/i$a$b$a;->b:LT/o0;

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v15, 0x0

    invoke-static {v3, v5, v7, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v7, v15}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v7, v10}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v11, LE0/g;->K:LE0/g$a;

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v13

    if-nez v13, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v7, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_0
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v3, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v12, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v12}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v12, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v12, v9, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v10, v3}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v5, 0x6

    invoke-static {v3, v7, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v7, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->c()F

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v9, 0x0

    invoke-static {v10, v3, v5, v6, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    invoke-virtual {v2}, Lz/c;->f()Lz/c$e;

    move-result-object v2

    const/16 v14, 0x30

    invoke-static {v2, v4, v7, v14}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    invoke-static {v7, v15}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v7, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v11}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v7, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v11}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v6, v2, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v6, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v11}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v11}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v6, v3, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v11, Lz/Z;->a:Lz/Z;

    invoke-virtual {v8}, LFf/e;->s0()LLi/N;

    move-result-object v2

    const/4 v13, 0x1

    invoke-static {v2, v9, v7, v15, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LGf/h;

    const v3, -0x7a034696

    invoke-interface {v7, v3}, LT/l;->U(I)V

    invoke-interface {v7, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, LFf/j;

    invoke-direct {v4, v8, v1}, LFf/j;-><init>(LFf/e;LT/o0;)V

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v3, v4

    check-cast v3, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, LGf/g;->c(Landroidx/compose/ui/e;LGf/h;Lmh/l;LT/l;II)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    move-object v9, v11

    move v11, v3

    move v3, v13

    move v13, v1

    move v1, v14

    move-object v14, v2

    invoke-static/range {v9 .. v14}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v7, v15}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LN/c0;->b()LT/H0;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v4}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v2

    new-instance v4, LFf/i$a$b$a$a;

    invoke-direct {v4, v8}, LFf/i$a$b$a$a;-><init>(LFf/e;)V

    const/16 v5, 0x36

    const v6, 0x12b0e897

    invoke-static {v6, v3, v4, v7, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    sget v4, LT/I0;->i:I

    or-int/2addr v1, v4

    invoke-static {v2, v3, v7, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$a$b$a;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
