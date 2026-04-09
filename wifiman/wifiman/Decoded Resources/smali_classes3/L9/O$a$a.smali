.class final LL9/O$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/O$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LL9/O$a$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 25

    move-object/from16 v15, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.toolbar.UiToolbarTextButton.<anonymous>.<anonymous> (UiToolbarTextButton.kt:29)"

    const v3, -0x2642f82a

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v0, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v0, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$a;->f()J

    move-result-wide v5

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-virtual {v0, v15, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v0

    invoke-virtual {v0}, Lpa/c;->b()Lpa/b;

    move-result-object v0

    invoke-virtual {v0}, Lpa/b;->b()LL0/U;

    move-result-object v20

    move-object/from16 v13, p0

    iget-object v0, v13, LL9/O$a$a;->a:Ljava/lang/String;

    const/16 v23, 0x0

    const v24, 0xfff8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x30

    move-object/from16 v21, p1

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LL9/O$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
