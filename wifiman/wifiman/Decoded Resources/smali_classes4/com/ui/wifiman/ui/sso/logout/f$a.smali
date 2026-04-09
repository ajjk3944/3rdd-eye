.class final Lcom/ui/wifiman/ui/sso/logout/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/sso/logout/f;->b(Lcom/ui/wifiman/ui/sso/logout/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/sso/logout/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/sso/logout/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/sso/logout/f$a;->a:Lcom/ui/wifiman/ui/sso/logout/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/sso/logout/b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/sso/logout/f$a;->e(Lcom/ui/wifiman/ui/sso/logout/b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/sso/logout/f$a;->f(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/wifiman/ui/sso/logout/b;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/sso/logout/b;->n0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Lz/j;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    move/from16 v1, p3

    const-string v2, "$this$ModalScaffold"

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.sso.logout.SsoLogoutConfirmationUi.<anonymous> (SsoLogoutConfirmationUi.kt:38)"

    const v4, -0x12fe1ff1

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v13, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v13, v14, v12}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->a()Lra/b$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lra/b$a$a;->d()F

    move-result v1

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v9, 0x0

    invoke-static {v15, v1, v10, v11, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v6

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget v3, Lm8/c;->T1:I

    const/4 v8, 0x0

    invoke-static {v3, v14, v8}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    move/from16 v26, v1

    move-object v1, v3

    invoke-virtual {v13, v14, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v3

    invoke-virtual {v3}, Lpa/c;->b()Lpa/b;

    move-result-object v3

    invoke-virtual {v3}, Lpa/b;->a()LL0/U;

    move-result-object v21

    invoke-virtual {v13, v14, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v3

    const/16 v24, 0x0

    const v25, 0xfff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v16, 0x0

    move-object/from16 v8, v16

    move-object/from16 v9, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move/from16 v27, v12

    move-object/from16 v12, v16

    move-object/from16 v28, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v29, v15

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v1 .. v25}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    const/4 v12, 0x1

    move-object/from16 v13, v29

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v13, v14, v12, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v11, p2

    move/from16 v9, v27

    move-object/from16 v10, v28

    invoke-virtual {v10, v11, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    const/4 v8, 0x2

    invoke-static {v1, v2, v14, v8, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const v2, -0x24ac4326

    invoke-interface {v11, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lcom/ui/wifiman/ui/sso/logout/f$a;->a:Lcom/ui/wifiman/ui/sso/logout/b;

    invoke-interface {v11, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lcom/ui/wifiman/ui/sso/logout/f$a;->a:Lcom/ui/wifiman/ui/sso/logout/b;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_4

    :cond_3
    new-instance v4, Lcom/ui/wifiman/ui/sso/logout/d;

    invoke-direct {v4, v3}, Lcom/ui/wifiman/ui/sso/logout/d;-><init>(Lcom/ui/wifiman/ui/sso/logout/b;)V

    invoke-interface {v11, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v2, v4

    check-cast v2, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget-object v6, Lw9/p;->ALERT:Lw9/p;

    sget v3, Lm8/c;->S1:I

    const/4 v7, 0x0

    invoke-static {v3, v11, v7}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v16

    const/high16 v17, 0x30000

    const/16 v18, 0x9c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, v16

    move-object/from16 v8, v19

    move/from16 v30, v9

    move-object/from16 v9, p2

    move-object/from16 v31, v10

    move/from16 v10, v17

    move-object v12, v11

    move/from16 v11, v18

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxe/f$b;

    const/4 v2, 0x1

    invoke-static {v13, v14, v2, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    move/from16 v11, v30

    move-object/from16 v10, v31

    invoke-virtual {v10, v12, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v3

    invoke-virtual {v3}, Lra/a;->a()Lra/b;

    move-result-object v3

    invoke-virtual {v3}, Lra/b;->a()Lra/b$a$a;

    move-result-object v3

    invoke-virtual {v3}, Lra/b$a$a;->d()F

    move-result v3

    const/4 v4, 0x2

    invoke-static {v2, v3, v14, v4, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const v3, -0x24ac0fe0

    invoke-interface {v12, v3}, LT/l;->U(I)V

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    :cond_5
    new-instance v4, Lcom/ui/wifiman/ui/sso/logout/e;

    invoke-direct {v4, v1}, Lcom/ui/wifiman/ui/sso/logout/e;-><init>(Lxe/f$b;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v3, v4

    check-cast v3, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget v1, Lm8/c;->R1:I

    const/4 v14, 0x0

    invoke-static {v1, v12, v14}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v9, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v7

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-virtual {v10, v12, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->b()Lra/b$a$b;

    move-result-object v1

    invoke-static/range {v26 .. v26}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lra/b$a;->a(F)F

    move-result v1

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v12, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/sso/logout/f$a;->c(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
