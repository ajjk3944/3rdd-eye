.class public final LLe/j$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLe/j;->d(Landroidx/compose/ui/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, LLe/j$d;->a:Ljava/util/List;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 19

    move/from16 v0, p2

    move-object/from16 v1, p3

    const/4 v2, 0x6

    and-int/lit8 v3, p4, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    move-object/from16 v3, p1

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    const/16 v5, 0x30

    and-int/lit8 v6, p4, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_3

    invoke-interface {v1, v0}, LT/l;->i(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v3, 0x93

    const/16 v8, 0x92

    if-ne v6, v8, :cond_5

    invoke-interface/range {p3 .. p3}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface/range {p3 .. p3}, LT/l;->C()V

    move-object/from16 v3, p0

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v8, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v9, -0x25b7f321

    invoke-static {v9, v3, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    move-object/from16 v3, p0

    iget-object v6, v3, LLe/j$d;->a:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    const v0, 0x8ccaf86

    invoke-interface {v1, v0}, LT/l;->U(I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v6, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v10, v1, v2}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v10

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v10, v6, v7, v8, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v10, Lz/c;->a:Lz/c;

    const/16 v11, 0xa

    int-to-float v11, v11

    invoke-static {v11}, LY0/h;->j(F)F

    move-result v11

    invoke-virtual {v10, v11}, Lz/c;->n(F)Lz/c$f;

    move-result-object v10

    sget-object v11, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v11}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v11

    invoke-static {v10, v11, v1, v2}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v10, 0x0

    invoke-static {v1, v10}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface/range {p3 .. p3}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v1, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface/range {p3 .. p3}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface/range {p3 .. p3}, LT/l;->u()V

    invoke-interface/range {p3 .. p3}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface/range {p3 .. p3}, LT/l;->I()V

    :goto_4
    invoke-static/range {p3 .. p3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v2, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v14, v12, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v14}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_9

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v14, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v14, v7, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    const v2, 0x3e99999a    # 0.3f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/r;->g(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v2, 0x14

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v2, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v2, v1, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v11

    invoke-virtual {v11}, Lra/a;->a()Lra/b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b;->a()Lra/b$a$a;

    move-result-object v11

    invoke-virtual {v11}, Lra/b$a$a;->c()F

    move-result v11

    invoke-static {v0, v11, v6, v4, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v12

    invoke-virtual {v2, v1, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->b()J

    move-result-wide v13

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v2, v1, v7}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v2

    invoke-virtual {v2}, Loa/a;->a()LE/a;

    move-result-object v2

    invoke-static {v0, v2}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v1, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const v0, 0x24c7e510

    invoke-interface {v1, v0}, LT/l;->U(I)V

    const/4 v0, 0x5

    invoke-static {v10, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    move-object v2, v0

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v6, v8, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    int-to-float v7, v5

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v7, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v7, v1, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v12

    invoke-virtual {v12}, Lra/a;->a()Lra/b;

    move-result-object v12

    invoke-virtual {v12}, Lra/b;->a()Lra/b$a$a;

    move-result-object v12

    invoke-virtual {v12}, Lra/b$a$a;->c()F

    move-result v12

    invoke-static {v2, v12, v6, v4, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    invoke-virtual {v7, v1, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->b()J

    move-result-wide v14

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v7, v1, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v7

    invoke-virtual {v7}, Loa/a;->a()LE/a;

    move-result-object v7

    invoke-static {v2, v7}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v1, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    goto :goto_5

    :cond_b
    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-interface/range {p3 .. p3}, LT/l;->R()V

    invoke-interface/range {p3 .. p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LLe/j$d;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
