.class public abstract Laa/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Laa/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Laa/c;->c(Laa/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Laa/d;LT/l;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string/jumbo v2, "vm"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x3e754455

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    if-ne v5, v4, :cond_3

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LT/l;->C()V

    move-object v2, v15

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.sso.mfa.methods.UiMFAMethodPickerLayout (UiMFAMethodPickerLayout.kt:37)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_5

    sget-object v2, Ldh/j;->a:Ldh/j;

    invoke-static {v2, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v2

    new-instance v3, LT/A;

    invoke-direct {v3, v2}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_5
    check-cast v2, LT/A;

    invoke-virtual {v2}, LT/A;->a()LIi/N;

    move-result-object v2

    new-instance v3, Laa/c$a;

    invoke-direct {v3, v0, v2}, Laa/c$a;-><init>(Laa/d;LIi/N;)V

    const v4, 0x300b295a

    const/4 v6, 0x1

    const/16 v7, 0x36

    invoke-static {v4, v6, v3, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->a()J

    move-result-wide v21

    new-instance v3, Laa/c$b;

    invoke-direct {v3, v0, v2}, Laa/c$b;-><init>(Laa/d;LIi/N;)V

    const v2, 0x1b560e93

    invoke-static {v2, v6, v3, v15, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

    const/high16 v28, 0xc00000

    const v29, 0x17ffb

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-object v2, v15

    move-wide/from16 v15, v16

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x180

    move-object/from16 v26, v2

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Laa/a;

    invoke-direct {v3, v0, v1}, Laa/a;-><init>(Laa/d;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_7
    return-void
.end method

.method private static final c(Laa/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Laa/c;->b(Laa/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
