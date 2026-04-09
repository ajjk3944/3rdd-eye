.class public abstract LF/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LYg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYg/s;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, LF/b;->a:LYg/s;

    return-void
.end method

.method public static final a(LL0/d;Ljava/util/List;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0x6af76057

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v4

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-interface {v4, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_5

    invoke-interface {v4}, LT/l;->v()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v4}, LT/l;->C()V

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v6, -0x1

    const-string v7, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)"

    invoke-static {v3, v5, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    move v6, v5

    :goto_4
    if-ge v6, v3, :cond_b

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LL0/d$c;

    invoke-virtual {v7}, LL0/d$c;->a()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lmh/q;

    invoke-virtual {v7}, LL0/d$c;->b()I

    move-result v9

    invoke-virtual {v7}, LL0/d$c;->c()I

    move-result v7

    sget-object v10, LF/b$a;->a:LF/b$a;

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v4, v5}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v13

    invoke-static {v4, v11}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v14, LE0/g;->K:LE0/g$a;

    invoke-virtual {v14}, LE0/g$a;->a()Lmh/a;

    move-result-object v15

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v4, v15}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_8
    invoke-interface {v4}, LT/l;->I()V

    :goto_5
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v15

    invoke-virtual {v14}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v15, v10, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v14}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v15, v13, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v14}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v15, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v15, v10, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v14}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v15, v11, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v0, v9, v7}, LL0/d;->r(II)LL0/d;

    move-result-object v5

    invoke-virtual {v5}, LL0/d;->k()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v5, v4, v9}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4}, LT/l;->R()V

    add-int/lit8 v6, v6, 0x1

    move v5, v7

    goto/16 :goto_4

    :cond_b
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_6
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v4, LF/b$b;

    invoke-direct {v4, v0, v1, v2}, LF/b$b;-><init>(LL0/d;Ljava/util/List;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method public static final b(LL0/d;)Z
    .locals 3

    invoke-virtual {p0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "androidx.compose.foundation.text.inlineContent"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, LL0/d;->p(Ljava/lang/String;II)Z

    move-result p0

    return p0
.end method

.method public static final c(LL0/d;Ljava/util/Map;)LYg/s;
    .locals 10

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "androidx.compose.foundation.text.inlineContent"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, LL0/d;->j(Ljava/lang/String;II)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL0/d$c;

    invoke-virtual {v4}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF/t;

    if-eqz v5, :cond_1

    new-instance v6, LL0/d$c;

    invoke-virtual {v5}, LF/t;->b()LL0/x;

    move-result-object v7

    invoke-virtual {v4}, LL0/d$c;->h()I

    move-result v8

    invoke-virtual {v4}, LL0/d$c;->f()I

    move-result v9

    invoke-direct {v6, v7, v8, v9}, LL0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v6, LL0/d$c;

    invoke-virtual {v5}, LF/t;->a()Lmh/q;

    move-result-object v5

    invoke-virtual {v4}, LL0/d$c;->h()I

    move-result v7

    invoke-virtual {v4}, LL0/d$c;->f()I

    move-result v4

    invoke-direct {v6, v5, v7, v4}, LL0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, LYg/s;

    invoke-direct {p0, v0, v1}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_3
    :goto_1
    sget-object p0, LF/b;->a:LYg/s;

    return-object p0
.end method
