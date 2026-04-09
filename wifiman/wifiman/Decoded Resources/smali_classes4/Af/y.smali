.class public abstract LAf/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LS8/j$b;)I
    .locals 0

    invoke-static {p0}, LAf/y;->b(LS8/j$b;)I

    move-result p0

    return p0
.end method

.method private static final b(LS8/j$b;)I
    .locals 1

    instance-of v0, p0, LS8/j$b$e;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, LS8/j$b$f$b;

    if-eqz v0, :cond_1

    const/16 p0, 0xa

    goto :goto_0

    :cond_1
    instance-of v0, p0, LS8/j$b$f$a;

    if-eqz v0, :cond_2

    const/16 p0, 0xb

    goto :goto_0

    :cond_2
    instance-of v0, p0, LS8/j$b$g$b;

    if-eqz v0, :cond_3

    const/16 p0, 0x14

    goto :goto_0

    :cond_3
    instance-of v0, p0, LS8/j$b$g$a;

    if-eqz v0, :cond_4

    const/16 p0, 0x15

    goto :goto_0

    :cond_4
    instance-of v0, p0, LS8/j$b$h$d;

    if-eqz v0, :cond_5

    const/16 p0, 0x1e

    goto :goto_0

    :cond_5
    instance-of v0, p0, LS8/j$b$h$b;

    if-eqz v0, :cond_6

    const/16 p0, 0x1f

    goto :goto_0

    :cond_6
    instance-of v0, p0, LS8/j$b$h$c;

    if-eqz v0, :cond_7

    const/16 p0, 0x20

    goto :goto_0

    :cond_7
    instance-of v0, p0, LS8/j$b$h$a;

    if-eqz v0, :cond_8

    const/16 p0, 0x21

    goto :goto_0

    :cond_8
    instance-of v0, p0, LS8/j$b$d;

    if-eqz v0, :cond_9

    const/16 p0, 0x3e8

    goto :goto_0

    :cond_9
    instance-of v0, p0, LS8/j$b$i;

    if-eqz v0, :cond_a

    const/16 p0, 0x3e9

    goto :goto_0

    :cond_a
    instance-of v0, p0, LS8/j$b$a;

    if-eqz v0, :cond_b

    const/16 p0, 0x3ea

    goto :goto_0

    :cond_b
    instance-of v0, p0, LS8/j$b$c;

    if-eqz v0, :cond_c

    const/16 p0, 0x3eb

    goto :goto_0

    :cond_c
    instance-of p0, p0, LS8/j$b$b;

    if-eqz p0, :cond_d

    const/16 p0, 0x270f

    :goto_0
    return p0

    :cond_d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final c(LS8/j;)Ls9/d;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LS8/j;->a()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, LAf/y$a;

    invoke-direct {v0}, LAf/y$a;-><init>()V

    invoke-static {p0, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS8/j$b;

    invoke-static {v1}, LAf/y;->d(LS8/j$b;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->z4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto/16 :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_2

    new-instance p0, Ls9/d$b;

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v1, 0x2

    if-ne p0, v1, :cond_3

    new-instance p0, Ls9/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LAf/y$b;

    invoke-direct {v2, v0}, LAf/y$b;-><init>(Ljava/util/List;)V

    invoke-direct {p0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v1, 0x3

    if-ne p0, v1, :cond_4

    new-instance p0, Ls9/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LAf/y$c;

    invoke-direct {v2, v0}, LAf/y$c;-><init>(Ljava/util/List;)V

    invoke-direct {p0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    const/4 v1, 0x4

    if-ne p0, v1, :cond_5

    new-instance p0, Ls9/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LAf/y$d;

    invoke-direct {v2, v0}, LAf/y$d;-><init>(Ljava/util/List;)V

    invoke-direct {p0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_1

    :cond_5
    new-instance p0, Ls9/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LAf/y$e;

    invoke-direct {v2, v0}, LAf/y$e;-><init>(Ljava/util/List;)V

    invoke-direct {p0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :goto_1
    return-object p0
.end method

.method public static final d(LS8/j$b;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LS8/j$b$b;

    if-eqz v0, :cond_0

    sget p0, Lm8/c;->t5:I

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, LS8/j$b$e;

    if-eqz v0, :cond_1

    sget p0, Lm8/c;->w5:I

    goto :goto_0

    :cond_1
    instance-of v0, p0, LS8/j$b$i;

    if-eqz v0, :cond_2

    sget p0, Lm8/c;->F5:I

    goto :goto_0

    :cond_2
    instance-of v0, p0, LS8/j$b$a;

    if-eqz v0, :cond_3

    sget p0, Lm8/c;->s5:I

    goto :goto_0

    :cond_3
    instance-of v0, p0, LS8/j$b$f$b;

    if-eqz v0, :cond_4

    sget p0, Lm8/c;->E5:I

    goto :goto_0

    :cond_4
    instance-of v0, p0, LS8/j$b$f$a;

    if-eqz v0, :cond_5

    sget p0, Lm8/c;->D5:I

    goto :goto_0

    :cond_5
    instance-of v0, p0, LS8/j$b$g$b;

    if-eqz v0, :cond_6

    sget p0, Lm8/c;->y5:I

    goto :goto_0

    :cond_6
    instance-of v0, p0, LS8/j$b$g$a;

    if-eqz v0, :cond_7

    sget p0, Lm8/c;->x5:I

    goto :goto_0

    :cond_7
    instance-of v0, p0, LS8/j$b$h$d;

    if-eqz v0, :cond_8

    sget p0, Lm8/c;->C5:I

    goto :goto_0

    :cond_8
    instance-of v0, p0, LS8/j$b$h$b;

    if-eqz v0, :cond_9

    sget p0, Lm8/c;->A5:I

    goto :goto_0

    :cond_9
    instance-of v0, p0, LS8/j$b$h$c;

    if-eqz v0, :cond_a

    sget p0, Lm8/c;->B5:I

    goto :goto_0

    :cond_a
    instance-of v0, p0, LS8/j$b$h$a;

    if-eqz v0, :cond_b

    sget p0, Lm8/c;->z5:I

    goto :goto_0

    :cond_b
    instance-of v0, p0, LS8/j$b$d;

    if-eqz v0, :cond_c

    sget p0, Lm8/c;->v5:I

    goto :goto_0

    :cond_c
    instance-of p0, p0, LS8/j$b$c;

    if-eqz p0, :cond_d

    sget p0, Lm8/c;->u5:I

    :goto_0
    return p0

    :cond_d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
