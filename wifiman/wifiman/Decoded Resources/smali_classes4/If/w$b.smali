.class final LIf/w$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIf/w;->l(Landroidx/compose/ui/e;LIf/o;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIf/o;


# direct methods
.method constructor <init>(LIf/o;)V
    .locals 0

    iput-object p1, p0, LIf/w$b;->a:LIf/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 25

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$StatusContainerColumn"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wmw.StatusContainer.<anonymous>.<anonymous>.<anonymous> (WmwStatusPopupConnected.kt:180)"

    const v3, -0x2d2fc4a2

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    move-object/from16 v13, p0

    iget-object v0, v13, LIf/w$b;->a:LIf/o;

    invoke-virtual {v0}, LIf/o;->n0()LLi/N;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v0, v1, v15, v6, v7}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LIf/n;

    const v0, 0x4e342cf7    # 7.557114E8f

    invoke-interface {v15, v0}, LT/l;->U(I)V

    if-nez v8, :cond_3

    goto/16 :goto_2

    :cond_3
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    sget-object v1, Lz/c;->a:Lz/c;

    invoke-virtual {v1}, Lz/c;->c()Lz/c$e;

    move-result-object v1

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v2, 0x36

    invoke-static {v1, v0, v15, v2}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v0

    invoke-static {v15, v6}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface/range {p2 .. p2}, LT/l;->G()LT/x;

    move-result-object v2

    invoke-static {v15, v14}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface/range {p2 .. p2}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_4

    invoke-static {}, LT/j;->c()V

    :cond_4
    invoke-interface/range {p2 .. p2}, LT/l;->u()V

    invoke-interface/range {p2 .. p2}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v15, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->I()V

    :goto_1
    invoke-static/range {p2 .. p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v5, v0, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v5, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v5}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_7
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v5, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v8}, LIf/n;->b()F

    move-result v1

    invoke-virtual {v8}, LIf/n;->a()Z

    move-result v2

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, LJf/d;->c(Landroidx/compose/ui/e;FZLT/l;II)V

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v15, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget v0, Lm8/c;->w4:I

    invoke-static {v0, v15, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, LIf/n;->b()F

    move-result v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v0, v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v1, v15, v2}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->b()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->a()LL0/U;

    move-result-object v20

    sget-object v1, LJf/a;->a:LJf/a;

    invoke-virtual {v8}, LIf/n;->b()F

    move-result v2

    const/16 v3, 0x30

    invoke-virtual {v1, v2, v15, v3}, LJf/a;->a(FLT/l;I)J

    move-result-wide v2

    const/16 v23, 0x0

    const v24, 0xfff8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object v1, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x30

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->R()V

    sget-object v1, LYg/J;->a:LYg/J;

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    if-nez v1, :cond_8

    new-instance v1, Ls9/d$b;

    sget v0, Lm8/c;->z4:I

    invoke-direct {v1, v0}, Ls9/d$b;-><init>(I)V

    sget-object v0, LW0/j;->b:LW0/j$a;

    invoke-virtual {v0}, LW0/j$a;->b()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v5}, LIf/w;->v(Landroidx/compose/ui/e;Ls9/d;ILT/l;II)V

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LIf/w$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
