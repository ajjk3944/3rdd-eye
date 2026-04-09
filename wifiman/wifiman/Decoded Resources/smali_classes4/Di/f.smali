.class public final LDi/f;
.super LZg/h;
.source "SourceFile"

# interfaces
.implements LCi/f$a;


# instance fields
.field private a:I

.field private b:LCi/f;

.field private c:LHi/f;

.field private d:[Ljava/lang/Object;

.field private e:[Ljava/lang/Object;

.field private f:I


# direct methods
.method public constructor <init>(LCi/f;[Ljava/lang/Object;[Ljava/lang/Object;I)V
    .locals 1

    const-string v0, "vector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vectorTail"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/h;-><init>()V

    iput p4, p0, LDi/f;->a:I

    iput-object p1, p0, LDi/f;->b:LCi/f;

    new-instance p4, LHi/f;

    invoke-direct {p4}, LHi/f;-><init>()V

    iput-object p4, p0, LDi/f;->c:LHi/f;

    iput-object p2, p0, LDi/f;->d:[Ljava/lang/Object;

    iput-object p3, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, LDi/f;->f:I

    return-void
.end method

.method private final K0([Ljava/lang/Object;)Z
    .locals 2

    array-length v0, p1

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    aget-object p1, p1, v0

    iget-object v0, p0, LDi/f;->c:LHi/f;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final M0(I)Ljava/util/ListIterator;
    .locals 4

    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    shr-int/lit8 v0, v0, 0x5

    invoke-static {p1, v0}, LHi/d;->b(II)V

    iget v1, p0, LDi/f;->a:I

    if-nez v1, :cond_0

    new-instance v0, LDi/i;

    iget-object v1, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, LDi/i;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_0
    div-int/lit8 v1, v1, 0x5

    new-instance v2, LDi/k;

    iget-object v3, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v2, v3, p1, v0, v1}, LDi/k;-><init>([Ljava/lang/Object;III)V

    return-object v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final N0([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 8

    if-nez p1, :cond_0

    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LDi/f;->K0([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v2

    array-length v0, p1

    const/16 v1, 0x20

    invoke-static {v0, v1}, Lsh/m;->g(II)I

    move-result v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LZg/n;->q([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final T(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    shr-int/lit8 v0, p2, 0x5

    move-object v1, p0

    move v2, v0

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v1 .. v6}, LDi/f;->q1(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    invoke-direct {p0}, LDi/f;->m1()I

    move-result p3

    shr-int/lit8 p3, p3, 0x5

    add-int/lit8 p3, p3, -0x1

    sub-int/2addr p3, v0

    sub-int v7, p5, p3

    if-ge v7, p5, :cond_0

    aget-object p6, p4, v7

    invoke-static {p6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_0
    move-object v8, p6

    const/16 v5, 0x20

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v8}, LDi/f;->r1(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final U0([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 3

    invoke-direct {p0, p1}, LDi/f;->K0([Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    rsub-int/lit8 v0, p2, 0x20

    invoke-static {p1, p1, p2, v1, v0}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v0

    rsub-int/lit8 v2, p2, 0x20

    invoke-static {p1, v0, p2, v1, v2}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final V0()[Ljava/lang/Object;
    .locals 3

    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0x20

    iget-object v2, p0, LDi/f;->c:LHi/f;

    aput-object v2, v0, v1

    return-object v0
.end method

.method private final W0(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/16 p1, 0x20

    iget-object v1, p0, LDi/f;->c:LHi/f;

    aput-object v1, v0, p1

    return-object v0
.end method

.method private final X0([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 3

    if-ltz p3, :cond_4

    if-nez p3, :cond_0

    return-object p1

    :cond_0
    invoke-static {p2, p3}, LDi/l;->a(II)I

    move-result v0

    aget-object v1, p1, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    add-int/lit8 p3, p3, -0x5

    invoke-direct {p0, v1, p2, p3}, LDi/f;->X0([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p2

    const/16 p3, 0x1f

    if-ge v0, p3, :cond_2

    add-int/lit8 p3, v0, 0x1

    aget-object v1, p1, p3

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, LDi/f;->K0([Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    const/16 v2, 0x20

    invoke-static {p1, v1, p3, v2}, LZg/n;->v([Ljava/lang/Object;Ljava/lang/Object;II)V

    :cond_1
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v2, p3}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p1

    :cond_2
    aget-object p3, p1, v0

    if-eq p2, p3, :cond_3

    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p2, p1, v0

    :cond_3
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final Y0([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;
    .locals 5

    add-int/lit8 v0, p3, -0x1

    invoke-static {v0, p2}, LDi/l;->a(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x5

    if-ne p2, v2, :cond_0

    aget-object p2, p1, v0

    invoke-virtual {p4, p2}, LDi/d;->b(Ljava/lang/Object;)V

    move-object p2, v1

    goto :goto_0

    :cond_0
    aget-object v3, p1, v0

    const-string v4, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, [Ljava/lang/Object;

    sub-int/2addr p2, v2

    invoke-direct {p0, v3, p2, p3, p4}, LDi/f;->Y0([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p2, p1, v0

    return-object p1
.end method

.method private final Z0([Ljava/lang/Object;II)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p3, :cond_1

    invoke-direct {p0, v1}, LDi/f;->o1([Ljava/lang/Object;)V

    if-nez p1, :cond_0

    new-array p1, v0, [Ljava/lang/Object;

    :cond_0
    invoke-direct {p0, p1}, LDi/f;->p1([Ljava/lang/Object;)V

    iput p2, p0, LDi/f;->f:I

    iput p3, p0, LDi/f;->a:I

    return-void

    :cond_1
    new-instance v2, LDi/d;

    invoke-direct {v2, v1}, LDi/d;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p3, p2, v2}, LDi/f;->Y0([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, LDi/d;->a()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-direct {p0, v1}, LDi/f;->p1([Ljava/lang/Object;)V

    iput p2, p0, LDi/f;->f:I

    const/4 p2, 0x1

    aget-object p2, p1, p2

    if-nez p2, :cond_2

    aget-object p1, p1, v0

    check-cast p1, [Ljava/lang/Object;

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    add-int/lit8 p3, p3, -0x5

    iput p3, p0, LDi/f;->a:I

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    iput p3, p0, LDi/f;->a:I

    :goto_0
    return-void
.end method

.method private final a1([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;
    .locals 2

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v1, "Check failed."

    if-eqz v0, :cond_3

    if-ltz p3, :cond_2

    if-nez p3, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3}, LDi/l;->a(II)I

    move-result v0

    aget-object v1, p1, v0

    check-cast v1, [Ljava/lang/Object;

    add-int/lit8 p3, p3, -0x5

    invoke-direct {p0, v1, p2, p3, p4}, LDi/f;->a1([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    const/16 p2, 0x20

    if-ge v0, p2, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    aget-object p2, p1, v0

    check-cast p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p3, p4}, LDi/f;->a1([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final b0([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;
    .locals 8

    invoke-static {p3, p2}, LDi/l;->a(II)I

    move-result v0

    if-nez p2, :cond_0

    const/16 p2, 0x1f

    aget-object p3, p1, p2

    invoke-virtual {p5, p3}, LDi/d;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 p5, v0, 0x1

    invoke-static {p1, p3, p5, v0, p2}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p1

    aput-object p4, p1, v0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 p2, p2, -0x5

    aget-object v1, p1, v0

    const-string v7, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, [Ljava/lang/Object;

    move-object v1, p0

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LDi/f;->b0([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;

    move-result-object p3

    aput-object p3, p1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    const/16 p3, 0x20

    if-ge v0, p3, :cond_1

    aget-object p3, p1, v0

    if-eqz p3, :cond_1

    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p3

    check-cast v2, [Ljava/lang/Object;

    invoke-virtual {p5}, LDi/d;->a()Ljava/lang/Object;

    move-result-object v5

    const/4 v4, 0x0

    move-object v1, p0

    move v3, p2

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LDi/f;->b0([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;

    move-result-object p3

    aput-object p3, p1, v0

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method private final b1([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    invoke-static {p3}, Lkotlin/jvm/internal/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p3

    shr-int/lit8 v0, p2, 0x5

    iget v1, p0, LDi/f;->a:I

    const/4 v2, 0x1

    shl-int v3, v2, v1

    if-ge v0, v3, :cond_0

    invoke-direct {p0, p1, p2, v1, p3}, LDi/f;->a1([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p0, LDi/f;->a:I

    add-int/lit8 p2, p2, 0x5

    iput p2, p0, LDi/f;->a:I

    invoke-direct {p0, p1}, LDi/f;->W0(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget p2, p0, LDi/f;->a:I

    shl-int v0, v2, p2

    invoke-direct {p0, p1, v0, p2, p3}, LDi/f;->a1([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method private final c1([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 4

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    shr-int/lit8 v0, v0, 0x5

    iget v1, p0, LDi/f;->a:I

    const/4 v2, 0x1

    shl-int v3, v2, v1

    if-le v0, v3, :cond_0

    invoke-direct {p0, p1}, LDi/f;->W0(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, LDi/f;->a:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, p1, p2, v0}, LDi/f;->d1([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-direct {p0, p3}, LDi/f;->p1([Ljava/lang/Object;)V

    iget p1, p0, LDi/f;->a:I

    add-int/lit8 p1, p1, 0x5

    iput p1, p0, LDi/f;->a:I

    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    add-int/2addr p1, v2

    iput p1, p0, LDi/f;->f:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    invoke-direct {p0, p2}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-direct {p0, p3}, LDi/f;->p1([Ljava/lang/Object;)V

    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    add-int/2addr p1, v2

    iput p1, p0, LDi/f;->f:I

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2, v1}, LDi/f;->d1([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-direct {p0, p3}, LDi/f;->p1([Ljava/lang/Object;)V

    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    add-int/2addr p1, v2

    iput p1, p0, LDi/f;->f:I

    :goto_0
    return-void
.end method

.method private final d1([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, p3}, LDi/l;->a(II)I

    move-result v0

    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x5

    if-ne p3, v1, :cond_0

    aput-object p2, p1, v0

    goto :goto_0

    :cond_0
    aget-object v2, p1, v0

    check-cast v2, [Ljava/lang/Object;

    sub-int/2addr p3, v1

    invoke-direct {p0, v2, p2, p3}, LDi/f;->d1([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    :goto_0
    return-object p1
.end method

.method private final e1(Lmh/l;[Ljava/lang/Object;IILDi/d;Ljava/util/List;Ljava/util/List;)I
    .locals 6

    invoke-direct {p0, p2}, LDi/f;->K0([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p6, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p5}, LDi/d;->a()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    move-object v3, v0

    move v2, v1

    :goto_0
    if-ge v2, p3, :cond_4

    aget-object v4, p2, v2

    invoke-interface {p1, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_3

    const/16 v5, 0x20

    if-ne p4, v5, :cond_2

    move-object p4, p6

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    invoke-interface {p6, p4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Ljava/lang/Object;

    :goto_1
    move-object v3, p4

    goto :goto_2

    :cond_1
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object p4

    goto :goto_1

    :goto_2
    move p4, v1

    :cond_2
    add-int/lit8 v5, p4, 0x1

    aput-object v4, v3, p4

    move p4, v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p5, v3}, LDi/d;->b(Ljava/lang/Object;)V

    invoke-virtual {p5}, LDi/d;->a()Ljava/lang/Object;

    move-result-object p1

    if-eq v0, p1, :cond_5

    invoke-interface {p7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return p4
.end method

.method private final f1(Lmh/l;[Ljava/lang/Object;ILDi/d;)I
    .locals 6

    const/4 v0, 0x0

    move-object v2, p2

    move v3, p3

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_2

    aget-object v4, p2, v0

    invoke-interface {p1, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_0

    if-nez v1, :cond_1

    invoke-direct {p0, p2}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const/4 v1, 0x1

    move v3, v0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    add-int/lit8 v5, v3, 0x1

    aput-object v4, v2, v3

    move v3, v5

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p4, v2}, LDi/d;->b(Ljava/lang/Object;)V

    return v3
.end method

.method private final g1(Lmh/l;)Z
    .locals 18

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    invoke-direct/range {p0 .. p0}, LDi/f;->s1()I

    move-result v10

    new-instance v11, LDi/d;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, LDi/d;-><init>(Ljava/lang/Object;)V

    iget-object v0, v8, LDi/f;->d:[Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v13, 0x1

    if-nez v0, :cond_1

    invoke-direct {v8, v9, v10, v11}, LDi/f;->h1(Lmh/l;ILDi/d;)I

    move-result v0

    if-eq v0, v10, :cond_0

    move v1, v13

    :cond_0
    return v1

    :cond_1
    invoke-direct {v8, v1}, LDi/f;->M0(I)Ljava/util/ListIterator;

    move-result-object v14

    const/16 v15, 0x20

    move v0, v15

    :goto_0
    if-ne v0, v15, :cond_2

    invoke-interface {v14}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v14}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-direct {v8, v9, v0, v15, v11}, LDi/f;->f1(Lmh/l;[Ljava/lang/Object;ILDi/d;)I

    move-result v0

    goto :goto_0

    :cond_2
    if-ne v0, v15, :cond_5

    invoke-interface {v14}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    xor-int/2addr v0, v13

    invoke-static {v0}, LHi/a;->a(Z)V

    invoke-direct {v8, v9, v10, v11}, LDi/f;->h1(Lmh/l;ILDi/d;)I

    move-result v0

    if-nez v0, :cond_3

    iget-object v2, v8, LDi/f;->d:[Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, LZg/h;->size()I

    move-result v3

    iget v4, v8, LDi/f;->a:I

    invoke-direct {v8, v2, v3, v4}, LDi/f;->Z0([Ljava/lang/Object;II)V

    :cond_3
    if-eq v0, v10, :cond_4

    move v1, v13

    :cond_4
    return v1

    :cond_5
    invoke-interface {v14}, Ljava/util/ListIterator;->previousIndex()I

    move-result v1

    shl-int/lit8 v7, v1, 0x5

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_1
    invoke-interface {v14}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v14}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    const/16 v3, 0x20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v5, v11

    move-object/from16 v6, v17

    move v13, v7

    move-object/from16 v7, v16

    invoke-direct/range {v0 .. v7}, LDi/f;->e1(Lmh/l;[Ljava/lang/Object;IILDi/d;Ljava/util/List;Ljava/util/List;)I

    move-result v4

    move v7, v13

    const/4 v13, 0x1

    goto :goto_1

    :cond_6
    move v13, v7

    iget-object v2, v8, LDi/f;->e:[Ljava/lang/Object;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v3, v10

    move-object v5, v11

    move-object/from16 v6, v17

    move-object/from16 v7, v16

    invoke-direct/range {v0 .. v7}, LDi/f;->e1(Lmh/l;[Ljava/lang/Object;IILDi/d;Ljava/util/List;Ljava/util/List;)I

    move-result v0

    invoke-virtual {v11}, LDi/d;->a()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1, v12, v0, v15}, LZg/n;->v([Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v8, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    iget-object v2, v8, LDi/f;->d:[Ljava/lang/Object;

    iget v3, v8, LDi/f;->a:I

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-direct {v8, v2, v13, v3, v4}, LDi/f;->a1([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v2

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v3

    shl-int/lit8 v3, v3, 0x5

    add-int v7, v13, v3

    invoke-direct {v8, v2, v7}, LDi/f;->l1([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v8, v2}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-direct {v8, v1}, LDi/f;->p1([Ljava/lang/Object;)V

    add-int/2addr v7, v0

    iput v7, v8, LDi/f;->f:I

    const/4 v0, 0x1

    return v0
.end method

.method private final h1(Lmh/l;ILDi/d;)I
    .locals 1

    iget-object v0, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, p1, v0, p2, p3}, LDi/f;->f1(Lmh/l;[Ljava/lang/Object;ILDi/d;)I

    move-result p1

    if-ne p1, p2, :cond_1

    invoke-virtual {p3}, LDi/d;->a()Ljava/lang/Object;

    move-result-object p1

    iget-object p3, p0, LDi/f;->e:[Ljava/lang/Object;

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, LHi/a;->a(Z)V

    return p2

    :cond_1
    invoke-virtual {p3}, LDi/d;->a()Ljava/lang/Object;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p3, v0, p1, p2}, LZg/n;->v([Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-direct {p0, p3}, LDi/f;->p1([Ljava/lang/Object;)V

    invoke-virtual {p0}, LZg/h;->size()I

    move-result p3

    sub-int/2addr p2, p1

    sub-int/2addr p3, p2

    iput p3, p0, LDi/f;->f:I

    return p1
.end method

.method private final j1([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;
    .locals 6

    invoke-static {p3, p2}, LDi/l;->a(II)I

    move-result v0

    const/16 v1, 0x1f

    if-nez p2, :cond_0

    aget-object p2, p1, v0

    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 v2, v0, 0x1

    const/16 v3, 0x20

    invoke-static {p1, p3, v0, v2, v3}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p4}, LDi/d;->a()Ljava/lang/Object;

    move-result-object p3

    aput-object p3, p1, v1

    invoke-virtual {p4, p2}, LDi/d;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    aget-object v2, p1, v1

    if-nez v2, :cond_1

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, p2}, LDi/l;->a(II)I

    move-result v1

    :cond_1
    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 p2, p2, -0x5

    add-int/lit8 v2, v0, 0x1

    const-string v3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    if-gt v2, v1, :cond_2

    :goto_0
    aget-object v4, p1, v1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-direct {p0, v4, p2, v5, p4}, LDi/f;->j1([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;

    move-result-object v4

    aput-object v4, p1, v1

    if-eq v1, v2, :cond_2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    aget-object v1, p1, v0

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-direct {p0, v1, p2, p3, p4}, LDi/f;->j1([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v0

    return-object p1
.end method

.method private final k1([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    sub-int/2addr v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge p4, v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-static {v3}, LHi/a;->a(Z)V

    if-ne v0, v2, :cond_1

    iget-object p4, p0, LDi/f;->e:[Ljava/lang/Object;

    aget-object p4, p4, v1

    invoke-direct {p0, p1, p2, p3}, LDi/f;->Z0([Ljava/lang/Object;II)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    aget-object v3, v1, p4

    invoke-direct {p0, v1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, p4, 0x1

    invoke-static {v1, v4, p4, v5, v0}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v1, v0, -0x1

    const/4 v4, 0x0

    aput-object v4, p4, v1

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-direct {p0, p4}, LDi/f;->p1([Ljava/lang/Object;)V

    add-int/2addr p2, v0

    sub-int/2addr p2, v2

    iput p2, p0, LDi/f;->f:I

    iput p3, p0, LDi/f;->a:I

    move-object p4, v3

    :goto_1
    return-object p4
.end method

.method private final l1([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 3

    and-int/lit8 v0, p2, 0x1f

    if-nez v0, :cond_2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iput v0, p0, LDi/f;->a:I

    const/4 p1, 0x0

    return-object p1

    :cond_0
    add-int/lit8 p2, p2, -0x1

    :goto_0
    iget v1, p0, LDi/f;->a:I

    shr-int v2, p2, v1

    if-nez v2, :cond_1

    add-int/lit8 v1, v1, -0x5

    iput v1, p0, LDi/f;->a:I

    aget-object p1, p1, v0

    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2, v1}, LDi/f;->X0([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final m1()I
    .locals 2

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {v0}, LDi/l;->c(I)I

    move-result v0

    return v0
.end method

.method private final n1([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;
    .locals 9

    invoke-static {p3, p2}, LDi/l;->a(II)I

    move-result v0

    invoke-direct {p0, p1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_1

    if-eq v1, p1, :cond_0

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    aget-object p1, v1, v0

    invoke-virtual {p5, p1}, LDi/d;->b(Ljava/lang/Object;)V

    aput-object p4, v1, v0

    return-object v1

    :cond_1
    aget-object p1, v1, v0

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, [Ljava/lang/Object;

    add-int/lit8 v5, p2, -0x5

    move-object v3, p0

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v3 .. v8}, LDi/f;->n1([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v0

    return-object v1
.end method

.method private final o1([Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LDi/f;->b:LCi/f;

    iput-object p1, p0, LDi/f;->d:[Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final p1([Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LDi/f;->e:[Ljava/lang/Object;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LDi/f;->b:LCi/f;

    iput-object p1, p0, LDi/f;->e:[Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final q0([Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 5

    invoke-direct {p0}, LDi/f;->s1()I

    move-result v0

    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0x20

    if-ge v0, v2, :cond_0

    iget-object v2, p0, LDi/f;->e:[Ljava/lang/Object;

    add-int/lit8 v3, p2, 0x1

    invoke-static {v2, v1, v3, p2, v0}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    aput-object p3, v1, p2

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-direct {p0, v1}, LDi/f;->p1([Ljava/lang/Object;)V

    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LDi/f;->f:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, LDi/f;->e:[Ljava/lang/Object;

    const/16 v2, 0x1f

    aget-object v3, v0, v2

    add-int/lit8 v4, p2, 0x1

    invoke-static {v0, v1, v4, p2, v2}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    aput-object p3, v1, p2

    invoke-direct {p0, v3}, LDi/f;->W0(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p0, p1, v1, p2}, LDi/f;->c1([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final q1(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    shr-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, LDi/f;->M0(I)Ljava/util/ListIterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v1

    if-eq v1, p1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    rsub-int/lit8 v2, p2, 0x20

    const/4 v3, 0x0

    const/16 v4, 0x20

    invoke-static {v1, p5, v3, v2, v4}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    invoke-direct {p0, v1, p2}, LDi/f;->U0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p5

    add-int/lit8 p4, p4, -0x1

    aput-object p5, p3, p4

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final r1(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 5

    const/4 v0, 0x1

    if-lt p6, v0, :cond_3

    invoke-direct {p0, p3}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    const/4 v1, 0x0

    aput-object p3, p5, v1

    and-int/lit8 v2, p2, 0x1f

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    add-int/2addr p2, v3

    sub-int/2addr p2, v0

    and-int/lit8 p2, p2, 0x1f

    sub-int v3, p4, v2

    add-int/2addr v3, p2

    const/16 v4, 0x20

    if-ge v3, v4, :cond_0

    add-int/2addr p2, v0

    invoke-static {p3, p7, p2, v2, p4}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, -0x1f

    if-ne p6, v0, :cond_1

    move-object v4, p3

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 p6, p6, -0x1

    aput-object v4, p5, p6

    :goto_0
    sub-int v3, p4, v3

    invoke-static {p3, p7, v1, v3, p4}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    add-int/2addr p2, v0

    invoke-static {p3, v4, p2, v2, v3}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-object p7, v4

    :goto_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-direct {p0, p3, v2, p1}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    :goto_2
    if-ge v0, p6, :cond_2

    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p0, p2, v1, p1}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    invoke-direct {p0, p7, v1, p1}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final s(I)[Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    if-gt v0, p1, :cond_0

    iget-object p1, p0, LDi/f;->e:[Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v1, p0, LDi/f;->a:I

    :goto_0
    if-lez v1, :cond_1

    invoke-static {p1, v1}, LDi/l;->a(II)I

    move-result v2

    aget-object v0, v0, v2

    const-string v2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x5

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final s1()I
    .locals 1

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-direct {p0, v0}, LDi/f;->t1(I)I

    move-result v0

    return v0
.end method

.method private final t1(I)I
    .locals 1

    const/16 v0, 0x20

    if-gt p1, v0, :cond_0

    return p1

    :cond_0
    invoke-static {p1}, LDi/l;->c(I)I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method private final v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;
    .locals 2

    :goto_0
    const/16 v0, 0x20

    if-ge p2, v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p2, 0x1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p1, p2

    move p2, v0

    goto :goto_0

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final C()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final J()I
    .locals 1

    iget v0, p0, LDi/f;->a:I

    return v0
.end method

.method public final S()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDi/f;->e:[Ljava/lang/Object;

    return-object v0
.end method

.method public a()LCi/f;
    .locals 5

    iget-object v0, p0, LDi/f;->b:LCi/f;

    if-nez v0, :cond_2

    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    new-instance v2, LHi/f;

    invoke-direct {v2}, LHi/f;-><init>()V

    iput-object v2, p0, LDi/f;->c:LHi/f;

    if-nez v0, :cond_1

    array-length v0, v1

    if-nez v0, :cond_0

    invoke-static {}, LDi/l;->b()LCi/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, LDi/j;

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LDi/j;-><init>([Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v2, LDi/e;

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v3

    iget v4, p0, LDi/f;->a:I

    invoke-direct {v2, v0, v1, v3, v4}, LDi/e;-><init>([Ljava/lang/Object;[Ljava/lang/Object;II)V

    move-object v0, v2

    :goto_0
    iput-object v0, p0, LDi/f;->b:LCi/f;

    :cond_2
    return-object v0
.end method

.method public add(ILjava/lang/Object;)V
    .locals 8

    .line 9
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->b(II)V

    .line 10
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 11
    invoke-virtual {p0, p2}, LDi/f;->add(Ljava/lang/Object;)Z

    return-void

    .line 12
    :cond_0
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 13
    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 14
    iget-object v1, p0, LDi/f;->d:[Ljava/lang/Object;

    sub-int/2addr p1, v0

    invoke-direct {p0, v1, p1, p2}, LDi/f;->q0([Ljava/lang/Object;ILjava/lang/Object;)V

    return-void

    .line 15
    :cond_1
    new-instance v0, LDi/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDi/d;-><init>(Ljava/lang/Object;)V

    .line 16
    iget-object v3, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, p0, LDi/f;->a:I

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, v0

    invoke-direct/range {v2 .. v7}, LDi/f;->b0([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    .line 17
    invoke-virtual {v0}, LDi/d;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LDi/f;->q0([Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 2
    invoke-direct {p0}, LDi/f;->s1()I

    move-result v0

    const/16 v2, 0x20

    if-ge v0, v2, :cond_0

    .line 3
    iget-object v2, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v2}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 4
    aput-object p1, v2, v0

    .line 5
    invoke-direct {p0, v2}, LDi/f;->p1([Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, LDi/f;->f:I

    goto :goto_0

    .line 7
    :cond_0
    invoke-direct {p0, p1}, LDi/f;->W0(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 8
    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    iget-object v2, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v0, v2, p1}, LDi/f;->c1([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_0
    return v1
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 13

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->b(II)V

    .line 16
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 17
    invoke-virtual {p0, p2}, LDi/f;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 18
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    .line 19
    :cond_1
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    shr-int/lit8 v0, p1, 0x5

    shl-int/lit8 v0, v0, 0x5

    .line 20
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v3, v4

    sub-int/2addr v3, v2

    div-int/lit8 v3, v3, 0x20

    if-nez v3, :cond_3

    .line 21
    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    if-lt p1, v0, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, LHi/a;->a(Z)V

    and-int/lit8 v0, p1, 0x1f

    .line 22
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr p1, v1

    sub-int/2addr p1, v2

    and-int/lit8 p1, p1, 0x1f

    .line 23
    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    add-int/2addr p1, v2

    invoke-direct {p0}, LDi/f;->s1()I

    move-result v4

    invoke-static {v1, v3, p1, v0, v4}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object p1

    .line 24
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    .line 25
    invoke-direct {p0, p1}, LDi/f;->p1([Ljava/lang/Object;)V

    .line 26
    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, LDi/f;->f:I

    return v2

    .line 27
    :cond_3
    new-array v12, v3, [[Ljava/lang/Object;

    .line 28
    invoke-direct {p0}, LDi/f;->s1()I

    move-result v8

    .line 29
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v4

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {p0, v4}, LDi/f;->t1(I)I

    move-result v4

    .line 30
    invoke-direct {p0}, LDi/f;->m1()I

    move-result v5

    if-lt p1, v5, :cond_4

    .line 31
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v1

    .line 32
    iget-object v7, p0, LDi/f;->e:[Ljava/lang/Object;

    move-object v4, p0

    move-object v5, p2

    move v6, p1

    move-object v9, v12

    move v10, v3

    move-object v11, v1

    invoke-direct/range {v4 .. v11}, LDi/f;->r1(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    if-le v4, v8, :cond_5

    sub-int v7, v4, v8

    .line 33
    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v1, v7}, LDi/f;->U0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v4, p0

    move-object v5, p2

    move v6, p1

    move-object v8, v12

    move v9, v3

    move-object v10, v1

    .line 34
    invoke-direct/range {v4 .. v10}, LDi/f;->T(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_0

    .line 35
    :cond_5
    iget-object v5, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v6

    sub-int v4, v8, v4

    invoke-static {v5, v6, v1, v4, v8}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    move-result-object v1

    rsub-int/lit8 v6, v4, 0x20

    .line 36
    iget-object v4, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v4, v6}, LDi/f;->U0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v3, -0x1

    .line 37
    aput-object v9, v12, v8

    move-object v3, p0

    move-object v4, p2

    move v5, p1

    move-object v7, v12

    .line 38
    invoke-direct/range {v3 .. v9}, LDi/f;->T(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 39
    :goto_0
    iget-object p1, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-direct {p0, p1, v0, v12}, LDi/f;->b1([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    .line 40
    invoke-direct {p0, v1}, LDi/f;->p1([Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p0}, LZg/h;->size()I

    move-result p1

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, LDi/f;->f:I

    return v2
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 7

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 3
    invoke-direct {p0}, LDi/f;->s1()I

    move-result v0

    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    rsub-int/lit8 v4, v0, 0x20

    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v5

    if-lt v4, v5, :cond_1

    .line 6
    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v1}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1, v0, v3}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, LDi/f;->p1([Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LDi/f;->f:I

    goto :goto_1

    .line 8
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v4, v0

    sub-int/2addr v4, v2

    div-int/lit8 v4, v4, 0x20

    .line 9
    new-array v5, v4, [[Ljava/lang/Object;

    .line 10
    iget-object v6, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v6}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    invoke-direct {p0, v6, v0, v3}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v5, v1

    move v0, v2

    :goto_0
    if-ge v0, v4, :cond_2

    .line 11
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v6

    invoke-direct {p0, v6, v1, v3}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v4

    invoke-direct {p0, v0, v4, v5}, LDi/f;->b1([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, LDi/f;->o1([Ljava/lang/Object;)V

    .line 13
    invoke-direct {p0}, LDi/f;->V0()[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0, v1, v3}, LDi/f;->v([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, LDi/f;->p1([Ljava/lang/Object;)V

    .line 14
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LDi/f;->f:I

    :goto_1
    return v2
.end method

.method public g()I
    .locals 1

    iget v0, p0, LDi/f;->f:I

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->a(II)V

    invoke-direct {p0, p1}, LDi/f;->s(I)[Ljava/lang/Object;

    move-result-object v0

    and-int/lit8 p1, p1, 0x1f

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final i1(Lmh/l;)Z
    .locals 1

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LDi/f;->g1(Lmh/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LDi/f;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public j(I)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->a(II)V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v1, p0, LDi/f;->d:[Ljava/lang/Object;

    iget v2, p0, LDi/f;->a:I

    sub-int/2addr p1, v0

    invoke-direct {p0, v1, v0, v2, p1}, LDi/f;->k1([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, LDi/d;

    iget-object v2, p0, LDi/f;->e:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, LDi/d;-><init>(Ljava/lang/Object;)V

    iget-object v2, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, p0, LDi/f;->a:I

    invoke-direct {p0, v2, v4, p1, v1}, LDi/f;->j1([Ljava/lang/Object;IILDi/d;)[Ljava/lang/Object;

    move-result-object p1

    iget v2, p0, LDi/f;->a:I

    invoke-direct {p0, p1, v0, v2, v3}, LDi/f;->k1([Ljava/lang/Object;III)Ljava/lang/Object;

    invoke-virtual {v1}, LDi/d;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, LDi/f;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->b(II)V

    .line 3
    new-instance v0, LDi/h;

    invoke-direct {v0, p0, p1}, LDi/h;-><init>(LDi/f;I)V

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, LDi/f$a;

    invoke-direct {v0, p1}, LDi/f$a;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, LDi/f;->i1(Lmh/l;)Z

    move-result p1

    return p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, LZg/h;->size()I

    move-result v0

    invoke-static {p1, v0}, LHi/d;->a(II)V

    invoke-direct {p0}, LDi/f;->m1()I

    move-result v0

    if-gt v0, p1, :cond_1

    iget-object v0, p0, LDi/f;->e:[Ljava/lang/Object;

    invoke-direct {p0, v0}, LDi/f;->N0([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LDi/f;->e:[Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    iget v1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ljava/util/AbstractList;->modCount:I

    :cond_0
    and-int/lit8 p1, p1, 0x1f

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    invoke-direct {p0, v0}, LDi/f;->p1([Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v0, LDi/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDi/d;-><init>(Ljava/lang/Object;)V

    iget-object v3, p0, LDi/f;->d:[Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, p0, LDi/f;->a:I

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, v0

    invoke-direct/range {v2 .. v7}, LDi/f;->n1([Ljava/lang/Object;IILjava/lang/Object;LDi/d;)[Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, LDi/f;->o1([Ljava/lang/Object;)V

    invoke-virtual {v0}, LDi/d;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y()I
    .locals 1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    return v0
.end method
