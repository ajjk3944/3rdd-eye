.class final LF9/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/r0;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF9/r0$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lm0/v0;

.field final synthetic b:Lm0/v0;

.field final synthetic c:Ls9/b;

.field final synthetic d:LF9/k;

.field final synthetic e:Z

.field final synthetic f:Lmh/a;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lmh/a;

.field final synthetic i:I


# direct methods
.method constructor <init>(Lm0/v0;Lm0/v0;Ls9/b;LF9/k;ZLmh/a;Ljava/lang/String;Lmh/a;I)V
    .locals 0

    iput-object p1, p0, LF9/r0$a;->a:Lm0/v0;

    iput-object p2, p0, LF9/r0$a;->b:Lm0/v0;

    iput-object p3, p0, LF9/r0$a;->c:Ls9/b;

    iput-object p4, p0, LF9/r0$a;->d:LF9/k;

    iput-boolean p5, p0, LF9/r0$a;->e:Z

    iput-object p6, p0, LF9/r0$a;->f:Lmh/a;

    iput-object p7, p0, LF9/r0$a;->g:Ljava/lang/String;

    iput-object p8, p0, LF9/r0$a;->h:Lmh/a;

    iput p9, p0, LF9/r0$a;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    const-string v2, "$this$UiSettingsBase"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    const/4 v12, 0x4

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v12

    goto :goto_0

    :cond_0
    move v2, v3

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

    goto/16 :goto_9

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.component.settings.UiSettingsTextValue.<anonymous> (UiSettingsTextValue.kt:157)"

    const v6, 0x5eea9122

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LF9/r0$a;->a:Lm0/v0;

    const v4, -0x179d5ab2

    invoke-interface {v11, v4}, LT/l;->U(I)V

    if-nez v2, :cond_5

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v11, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v4

    :goto_3
    move-wide v13, v4

    goto :goto_4

    :cond_5
    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v4

    goto :goto_3

    :goto_4
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v11, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v15

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    iget-object v2, v0, LF9/r0$a;->b:Lm0/v0;

    if-nez v2, :cond_6

    iget-object v2, v0, LF9/r0$a;->a:Lm0/v0;

    :cond_6
    const v4, -0x179d4b00

    invoke-interface {v11, v4}, LT/l;->U(I)V

    if-nez v2, :cond_7

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v11, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v4

    :goto_5
    move-wide v15, v4

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v4

    goto :goto_5

    :goto_6
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v11, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v15

    iget-object v2, v0, LF9/r0$a;->c:Ls9/b;

    if-eqz v2, :cond_c

    const v2, 0x23f6d286

    invoke-interface {v11, v2}, LT/l;->U(I)V

    iget-object v2, v0, LF9/r0$a;->d:LF9/k;

    sget-object v4, LF9/r0$a$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x1

    const/4 v10, 0x6

    if-eq v2, v4, :cond_a

    if-ne v2, v3, :cond_9

    const v2, 0x2401c2d1

    invoke-interface {v11, v2}, LT/l;->U(I)V

    const v2, -0x179cd5f8

    invoke-interface {v11, v2}, LT/l;->U(I)V

    iget-object v2, v0, LF9/r0$a;->g:Ljava/lang/String;

    if-eqz v2, :cond_8

    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move-object v2, v9

    invoke-static/range {v1 .. v6}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LF9/r0$a;->g:Ljava/lang/String;

    iget-boolean v5, v0, LF9/r0$a;->e:Z

    iget-object v6, v0, LF9/r0$a;->h:Lmh/a;

    iget v7, v0, LF9/r0$a;->i:I

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide v3, v13

    move-object/from16 v8, p2

    move-object v13, v9

    move/from16 v9, v17

    move v14, v10

    move/from16 v10, v18

    invoke-static/range {v1 .. v10}, LF9/r0;->h(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;ILT/l;II)V

    int-to-float v1, v12

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v11, v14}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    :cond_8
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    iget-object v1, v0, LF9/r0$a;->c:Ls9/b;

    iget-boolean v4, v0, LF9/r0$a;->e:Z

    iget-object v5, v0, LF9/r0$a;->f:Lmh/a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v2, v15

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, LF9/r0;->i(Ls9/b;JZLmh/a;LT/l;II)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_7

    :cond_9
    const v1, -0x179d30e4

    invoke-interface {v11, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    const v2, 0x23f78ef2

    invoke-interface {v11, v2}, LT/l;->U(I)V

    iget-object v2, v0, LF9/r0$a;->c:Ls9/b;

    iget-boolean v5, v0, LF9/r0$a;->e:Z

    iget-object v6, v0, LF9/r0$a;->f:Lmh/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v3, v15

    move-object/from16 v7, p2

    invoke-static/range {v2 .. v9}, LF9/r0;->i(Ls9/b;JZLmh/a;LT/l;II)V

    iget-object v2, v0, LF9/r0$a;->g:Ljava/lang/String;

    if-eqz v2, :cond_b

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v3, v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v11, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LF9/r0$a;->g:Ljava/lang/String;

    iget-boolean v5, v0, LF9/r0$a;->e:Z

    iget-object v6, v0, LF9/r0$a;->h:Lmh/a;

    iget v7, v0, LF9/r0$a;->i:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide v3, v13

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LF9/r0;->h(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;ILT/l;II)V

    :cond_b
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_7
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_8

    :cond_c
    const v1, 0x240bfcbe

    invoke-interface {v11, v1}, LT/l;->U(I)V

    iget-object v2, v0, LF9/r0$a;->g:Ljava/lang/String;

    if-eqz v2, :cond_d

    iget-boolean v5, v0, LF9/r0$a;->e:Z

    iget-object v6, v0, LF9/r0$a;->h:Lmh/a;

    iget v7, v0, LF9/r0$a;->i:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v1, 0x0

    move-wide v3, v13

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, LF9/r0;->h(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;ILT/l;II)V

    :cond_d
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_9
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/r0$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
