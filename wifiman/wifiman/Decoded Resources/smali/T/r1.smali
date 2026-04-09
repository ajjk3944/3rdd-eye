.class abstract synthetic LT/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lo/I;Ljava/util/Set;)Z
    .locals 0

    invoke-static {p0, p1}, LT/r1;->d(Lo/I;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final b(LLi/g;Ljava/lang/Object;Ldh/i;LT/l;II)LT/z1;
    .locals 6

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Ldh/j;->a:Ldh/j;

    :cond_0
    move-object v2, p2

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    const-string p5, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)"

    const v0, -0x24285d4a

    invoke-static {v0, p4, p2, p5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p2, p5

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez p2, :cond_2

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p5, p2, :cond_3

    :cond_2
    new-instance p5, LT/r1$a;

    const/4 p2, 0x0

    invoke-direct {p5, v2, p0, p2}, LT/r1$a;-><init>(Ldh/i;LLi/g;Ldh/e;)V

    invoke-interface {p3, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v3, p5

    check-cast v3, Lmh/p;

    shr-int/lit8 p2, p4, 0x3

    and-int/lit8 p2, p2, 0xe

    shl-int/lit8 p5, p4, 0x3

    and-int/lit8 p5, p5, 0x70

    or-int/2addr p2, p5

    and-int/lit16 p4, p4, 0x380

    or-int v5, p2, p4

    move-object v0, p1

    move-object v1, p0

    move-object v4, p3

    invoke-static/range {v0 .. v5}, LT/o1;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)LT/z1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object p0
.end method

.method public static final c(LLi/N;Ldh/i;LT/l;II)LT/z1;
    .locals 6

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    move-object v2, p1

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string p4, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)"

    const v0, -0x55d2e28f

    invoke-static {v0, p3, p1, p4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p0}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v1

    and-int/lit8 p1, p3, 0xe

    shl-int/lit8 p3, p3, 0x3

    and-int/lit16 p3, p3, 0x380

    or-int v4, p1, p3

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LT/o1;->a(LLi/g;Ljava/lang/Object;Ldh/i;LT/l;II)LT/z1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-object p0
.end method

.method private static final d(Lo/I;Ljava/util/Set;)Z
    .locals 13

    iget-object v0, p0, Lo/T;->b:[Ljava/lang/Object;

    iget-object p0, p0, Lo/T;->a:[J

    array-length v1, p0

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x0

    if-ltz v1, :cond_3

    move v3, v2

    :goto_0
    aget-wide v4, p0, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_2

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_1

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_0

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    aget-object v9, v0, v9

    invoke-interface {p1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v2, 0x1

    goto :goto_2

    :cond_0
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    if-ne v6, v7, :cond_3

    :cond_2
    if-eq v3, v1, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return v2
.end method

.method public static final e(Lmh/a;)LLi/g;
    .locals 2

    new-instance v0, LT/r1$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LT/r1$b;-><init>(Lmh/a;Ldh/e;)V

    invoke-static {v0}, LLi/i;->A(Lmh/p;)LLi/g;

    move-result-object p0

    return-object p0
.end method
