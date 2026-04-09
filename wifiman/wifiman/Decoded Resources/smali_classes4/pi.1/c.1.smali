.class public final Lpi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpi/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/c;

    invoke-direct {v0}, Lpi/c;-><init>()V

    sput-object v0, Lpi/c;->a:Lpi/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Lpi/u0;Lri/j;Lri/m;)Z
    .locals 3

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v0

    invoke-interface {v0, p2}, Lri/o;->m0(Lri/i;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-interface {v0, p2}, Lri/o;->t(Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p1}, Lpi/u0;->n()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0, p2}, Lri/o;->z0(Lri/j;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    invoke-interface {v0, p2}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lri/o;->O(Lri/m;Lri/m;)Z

    move-result p1

    return p1
.end method

.method private final e(Lpi/u0;Lri/j;Lri/j;)Z
    .locals 4

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v0

    sget-boolean v1, Lpi/g;->b:Z

    if-eqz v1, :cond_1

    invoke-interface {v0, p2}, Lri/o;->f(Lri/j;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p2}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lri/o;->i0(Lri/m;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, p2}, Lpi/u0;->l(Lri/i;)Z

    move-result v1

    :cond_0
    invoke-interface {v0, p3}, Lri/o;->f(Lri/j;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1, p3}, Lpi/u0;->l(Lri/i;)Z

    move-result v1

    :cond_1
    invoke-interface {v0, p3}, Lri/o;->t(Lri/j;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    invoke-interface {v0, p2}, Lri/o;->K(Lri/i;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-interface {v0, p2}, Lri/o;->L(Lri/i;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    instance-of v1, p2, Lri/d;

    if-eqz v1, :cond_4

    move-object v1, p2

    check-cast v1, Lri/d;

    invoke-interface {v0, v1}, Lri/o;->I(Lri/d;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    sget-object v1, Lpi/c;->a:Lpi/c;

    sget-object v3, Lpi/u0$c$b;->a:Lpi/u0$c$b;

    invoke-virtual {v1, p1, p2, v3}, Lpi/c;->a(Lpi/u0;Lri/j;Lpi/u0$c;)Z

    move-result v3

    if-eqz v3, :cond_5

    return v2

    :cond_5
    invoke-interface {v0, p3}, Lri/o;->K(Lri/i;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    return v3

    :cond_6
    sget-object v2, Lpi/u0$c$d;->a:Lpi/u0$c$d;

    invoke-virtual {v1, p1, p3, v2}, Lpi/c;->a(Lpi/u0;Lri/j;Lpi/u0$c;)Z

    move-result v2

    if-eqz v2, :cond_7

    return v3

    :cond_7
    invoke-interface {v0, p2}, Lri/o;->q0(Lri/j;)Z

    move-result v2

    if-eqz v2, :cond_8

    return v3

    :cond_8
    invoke-interface {v0, p3}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p3

    invoke-virtual {v1, p1, p2, p3}, Lpi/c;->b(Lpi/u0;Lri/j;Lri/m;)Z

    move-result p1

    return p1

    :cond_9
    :goto_0
    return v2
.end method


# virtual methods
.method public final a(Lpi/u0;Lri/j;Lpi/u0$c;)Z
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "supertypesPolicy"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v2

    invoke-interface {v2, v1}, Lri/o;->q0(Lri/j;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    invoke-interface {v2, v1}, Lri/o;->t(Lri/j;)Z

    move-result v4

    if-eqz v4, :cond_b

    :cond_0
    invoke-interface {v2, v1}, Lri/o;->K(Lri/i;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->k()V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->h()Ljava/util/ArrayDeque;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->i()Ljava/util/Set;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v7

    const/16 v8, 0x3e8

    if-gt v7, v8, :cond_9

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lri/j;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v2, v7}, Lri/o;->t(Lri/j;)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    goto :goto_1

    :cond_3
    move-object v8, v3

    :goto_1
    sget-object v9, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v9

    invoke-interface {v9, v7}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v7

    invoke-interface {v9, v7}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lri/i;

    invoke-virtual {v8, v0, v9}, Lpi/u0$c;->a(Lpi/u0;Lri/i;)Lri/j;

    move-result-object v9

    invoke-interface {v2, v9}, Lri/o;->q0(Lri/j;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v2, v9}, Lri/o;->t(Lri/j;)Z

    move-result v10

    if-eqz v10, :cond_7

    :cond_6
    invoke-interface {v2, v9}, Lri/o;->K(Lri/i;)Z

    move-result v10

    if-eqz v10, :cond_8

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->e()V

    goto :goto_4

    :cond_8
    invoke-virtual {v4, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many supertypes for type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Supertypes = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    const/16 v14, 0x3f

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->e()V

    const/4 v5, 0x0

    :cond_b
    :goto_4
    return v5
.end method

.method public final b(Lpi/u0;Lri/j;Lri/m;)Z
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "state"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "start"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "end"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v3

    sget-object v4, Lpi/c;->a:Lpi/c;

    invoke-direct {v4, v0, v1, v2}, Lpi/c;->c(Lpi/u0;Lri/j;Lri/m;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->k()V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->h()Ljava/util/ArrayDeque;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->i()Ljava/util/Set;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v7

    const/16 v8, 0x3e8

    if-gt v7, v8, :cond_6

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lri/j;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v3, v7}, Lri/o;->t(Lri/j;)Z

    move-result v8

    if-eqz v8, :cond_2

    sget-object v8, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    goto :goto_1

    :cond_2
    sget-object v8, Lpi/u0$c$b;->a:Lpi/u0$c$b;

    :goto_1
    sget-object v9, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v9

    invoke-interface {v9, v7}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v7

    invoke-interface {v9, v7}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lri/i;

    invoke-virtual {v8, v0, v9}, Lpi/u0$c;->a(Lpi/u0;Lri/i;)Lri/j;

    move-result-object v9

    sget-object v10, Lpi/c;->a:Lpi/c;

    invoke-direct {v10, v0, v9, v2}, Lpi/c;->c(Lpi/u0;Lri/j;Lri/m;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->e()V

    goto :goto_4

    :cond_5
    invoke-virtual {v4, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many supertypes for type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Supertypes = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    const/16 v14, 0x3f

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->e()V

    const/4 v5, 0x0

    :goto_4
    return v5
.end method

.method public final d(Lpi/u0;Lri/j;Lri/j;)Z
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lpi/c;->e(Lpi/u0;Lri/j;Lri/j;)Z

    move-result p1

    return p1
.end method
