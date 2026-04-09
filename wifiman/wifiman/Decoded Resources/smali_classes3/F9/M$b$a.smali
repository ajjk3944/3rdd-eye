.class final LF9/M$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/M$b;->a(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/c;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:LD9/o;

.field final synthetic d:Lmh/l;

.field final synthetic e:Lmh/q;

.field final synthetic f:I


# direct methods
.method constructor <init>(LCi/c;Ljava/lang/Object;LD9/o;Lmh/l;Lmh/q;I)V
    .locals 0

    iput-object p1, p0, LF9/M$b$a;->a:LCi/c;

    iput-object p2, p0, LF9/M$b$a;->b:Ljava/lang/Object;

    iput-object p3, p0, LF9/M$b$a;->c:LD9/o;

    iput-object p4, p0, LF9/M$b$a;->d:Lmh/l;

    iput-object p5, p0, LF9/M$b$a;->e:Lmh/q;

    iput p6, p0, LF9/M$b$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LD9/o;Lmh/l;Ljava/lang/Object;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LF9/M$b$a;->c(LD9/o;Lmh/l;Ljava/lang/Object;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LD9/o;Lmh/l;Ljava/lang/Object;)LYg/J;
    .locals 0

    invoke-virtual {p0}, LD9/o;->c()V

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous>.<anonymous> (UiSettingsDropdown.kt:68)"

    const v4, 0x1d68c642

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v2, Lz/J;->Max:Lz/J;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/i;->b(Landroidx/compose/ui/e;Lz/J;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v1, 0x0

    const/4 v11, 0x1

    invoke-static {v1, v10, v1, v11}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/m;->d(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, LF9/M$b$a;->a:LCi/c;

    iget-object v12, v0, LF9/M$b$a;->b:Ljava/lang/Object;

    iget-object v13, v0, LF9/M$b$a;->c:LD9/o;

    iget-object v14, v0, LF9/M$b$a;->d:Lmh/l;

    iget-object v15, v0, LF9/M$b$a;->e:Lmh/q;

    iget v9, v0, LF9/M$b$a;->f:I

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->g()Lz/c$m;

    move-result-object v4

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    invoke-static {v4, v5, v10, v1}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v10, v1}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v10, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v10, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v5, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v1, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v7, v2, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    const v1, 0x78810b5e

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v3, 0x78811f32

    invoke-interface {v10, v3}, LT/l;->U(I)V

    invoke-static {v12, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v10, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->a()Lma/a$a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lr9/a$b;->f()J

    move-result-wide v3

    goto :goto_3

    :cond_7
    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->e()J

    move-result-wide v3

    :goto_3
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v5, 0x6

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v5}, LE/h;->d(F)LE/g;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    const v3, 0x4a51da4c    # 3438227.0f

    invoke-interface {v10, v3}, LT/l;->U(I)V

    invoke-interface {v10, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v10, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v10, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_9

    :cond_8
    new-instance v4, LF9/N;

    invoke-direct {v4, v13, v14, v1}, LF9/N;-><init>(LD9/o;Lmh/l;Ljava/lang/Object;)V

    invoke-interface {v10, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v3, v4

    check-cast v3, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v4, LF9/M$b$a$a;

    invoke-direct {v4, v15, v1, v9, v12}, LF9/M$b$a$a;-><init>(Lmh/q;Ljava/lang/Object;ILjava/lang/Object;)V

    const/16 v1, 0x36

    const v5, 0x2a63d592

    invoke-static {v5, v11, v4, v10, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/high16 v8, 0x30000

    const/16 v17, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object/from16 v7, p1

    move/from16 v18, v9

    move/from16 v9, v17

    invoke-static/range {v1 .. v9}, LN/c;->b(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V

    move/from16 v9, v18

    goto/16 :goto_2

    :cond_a
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF9/M$b$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
