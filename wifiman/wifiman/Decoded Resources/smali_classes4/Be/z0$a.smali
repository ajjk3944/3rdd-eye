.class final LBe/z0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/z0;->b(Landroidx/compose/ui/e;Ls9/d;Ls9/d;Ls9/d;ZIIILT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ls9/d;

.field final synthetic c:I

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(ZLs9/d;ILandroidx/compose/ui/e;II)V
    .locals 0

    iput-boolean p1, p0, LBe/z0$a;->a:Z

    iput-object p2, p0, LBe/z0$a;->b:Ls9/d;

    iput p3, p0, LBe/z0$a;->c:I

    iput-object p4, p0, LBe/z0$a;->d:Landroidx/compose/ui/e;

    iput p5, p0, LBe/z0$a;->e:I

    iput p6, p0, LBe/z0$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LBe/z0$a;->f(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LBe/z0$a;->e(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    sget-object p0, Lvf/a;->a:Lvf/a;

    invoke-virtual {p0, p2}, Lvf/a;->a(Landroid/content/Context;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;I)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    sget-object p0, Lvf/a;->a:Lvf/a;

    invoke-virtual {p0, p2}, Lvf/a;->a(Landroid/content/Context;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lz/Y;LT/l;I)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettingsBase"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.UiSettingsTextValueExtended.<anonymous> (UiSettingsUrlClickableTextValue.kt:35)"

    const v4, 0x129d6beb

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/k0;->f()LT/H0;

    move-result-object v1

    invoke-interface {v13, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroidx/compose/ui/platform/h0;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v1

    invoke-interface {v13, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/content/Context;

    iget-boolean v1, v0, LBe/z0$a;->a:Z

    const/4 v11, 0x0

    if-eqz v1, :cond_7

    const v1, 0x559dc2b7

    invoke-interface {v13, v1}, LT/l;->U(I)V

    iget-object v1, v0, LBe/z0$a;->b:Ls9/d;

    invoke-static {v1, v13, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    const/4 v7, 0x0

    const/16 v8, 0xe

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lvf/f;->a(LL0/d;JLandroidx/compose/ui/platform/t1;LIi/N;LT/l;II)Lvf/e;

    move-result-object v1

    invoke-virtual {v1}, Lvf/e;->g()LLi/N;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v13, v11, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LL0/d;

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v13, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->b()LL0/U;

    move-result-object v14

    sget-object v5, LY0/v;->b:LY0/v$a;

    invoke-virtual {v5}, LY0/v$a;->a()J

    move-result-wide v36

    invoke-virtual {v3, v13, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v15

    iget v3, v0, LBe/z0$a;->c:I

    move/from16 v34, v3

    const v44, 0xfd7ffe

    const/16 v45, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-static/range {v14 .. v45}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v3

    const v4, -0x370b2036

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, LBe/z0$a$a;

    invoke-direct {v5, v1}, LBe/z0$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    iget-object v4, v0, LBe/z0$a;->d:Landroidx/compose/ui/e;

    iget v6, v0, LBe/z0$a;->e:I

    iget v7, v0, LBe/z0$a;->f:I

    const v1, -0x370b17f7

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface {v13, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v1, v8

    invoke-interface {v13, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v1, v8

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v8, v1, :cond_6

    :cond_5
    new-instance v8, LBe/x0;

    invoke-direct {v8, v9, v2, v10}, LBe/x0;-><init>(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)V

    invoke-interface {v13, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v9, v5

    check-cast v9, Lmh/l;

    const/4 v11, 0x0

    const/16 v12, 0x48

    const/4 v5, 0x0

    const/4 v10, 0x0

    move-object v1, v2

    move-object v2, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-object v7, v10

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LBe/f;->d(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;Lmh/l;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto/16 :goto_1

    :cond_7
    const v1, 0x55ab4508

    invoke-interface {v13, v1}, LT/l;->U(I)V

    iget-object v1, v0, LBe/z0$a;->b:Ls9/d;

    invoke-static {v1, v13, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v13, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->b()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->b()LL0/U;

    move-result-object v14

    sget-object v4, LY0/v;->b:LY0/v$a;

    invoke-virtual {v4}, LY0/v$a;->a()J

    move-result-wide v36

    invoke-virtual {v2, v13, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v15

    iget v2, v0, LBe/z0$a;->c:I

    move/from16 v34, v2

    const v44, 0xfd7ffe

    const/16 v45, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-static/range {v14 .. v45}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v3

    iget-object v2, v0, LBe/z0$a;->d:Landroidx/compose/ui/e;

    iget v5, v0, LBe/z0$a;->e:I

    iget v6, v0, LBe/z0$a;->f:I

    const v4, -0x370ab9f7

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-interface {v13, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-interface {v13, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_8

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_9

    :cond_8
    new-instance v7, LBe/y0;

    invoke-direct {v7, v9, v1, v10}, LBe/y0;-><init>(Landroidx/compose/ui/platform/h0;LL0/d;Landroid/content/Context;)V

    invoke-interface {v13, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v8, v7

    check-cast v8, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/high16 v11, 0x6000000

    const/16 v12, 0x48

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LBe/f;->d(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;Lmh/l;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LBe/z0$a;->c(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
