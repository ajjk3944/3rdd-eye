.class public abstract LHf/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I = 0x3c

.field private static final b:I = 0x12c

.field private static final c:I = 0x28


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static synthetic a(LHf/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LHf/f;->c(LHf/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LHf/d;LT/l;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "vm"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x4c08d394    # 3.586824E7f

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

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wizard.AppWizardStepUi (AppWizardStep.kt:60)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v3, v5, v4}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v2, LHf/f$a;

    invoke-direct {v2, v0}, LHf/f$a;-><init>(LHf/d;)V

    const/16 v4, 0x36

    const v6, 0x57c67396

    invoke-static {v6, v5, v2, v15, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v25

    const/high16 v28, 0xc00000

    const v29, 0x1fffe

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v27, 0x6

    move-object/from16 v26, v2

    invoke-static/range {v3 .. v29}, LN/C0;->a(Landroidx/compose/ui/e;LN/E0;Lmh/p;Lmh/p;Lmh/q;Lmh/p;IZLmh/q;ZLm0/i1;FJJJJJLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, LHf/e;

    invoke-direct {v3, v0, v1}, LHf/e;-><init>(LHf/d;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method private static final c(LHf/d;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LHf/f;->b(LHf/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LHf/f;->a:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, LHf/f;->b:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, LHf/f;->c:I

    return v0
.end method
