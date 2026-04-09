.class public abstract Lr/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lr/s0;Ljava/lang/Object;)Lr/q;
    .locals 0

    invoke-static {p0, p1}, Lr/j;->b(Lr/s0;Ljava/lang/Object;)Lr/q;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lr/s0;Ljava/lang/Object;)Lr/q;
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lr/s0;->a()Lmh/l;

    move-result-object p0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr/q;

    return-object p0
.end method

.method public static final c(Lr/i;J)Lr/i;
    .locals 1

    new-instance v0, Lr/i0;

    invoke-direct {v0, p0, p1, p2}, Lr/i0;-><init>(Lr/i;J)V

    return-object v0
.end method

.method public static final d(Lr/D;Lr/b0;J)Lr/N;
    .locals 7

    new-instance v6, Lr/N;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, Lr/N;-><init>(Lr/D;Lr/b0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public static synthetic e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p1, Lr/b0;->Restart:Lr/b0;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p3, p3, p4, p2}, Lr/k0;->c(IIILkotlin/jvm/internal/DefaultConstructorMarker;)J

    move-result-wide p2

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lr/j;->d(Lr/D;Lr/b0;J)Lr/N;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lmh/l;)Lr/T;
    .locals 2

    new-instance v0, Lr/T;

    new-instance v1, Lr/T$b;

    invoke-direct {v1}, Lr/T$b;-><init>()V

    invoke-interface {p0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1}, Lr/T;-><init>(Lr/T$b;)V

    return-object v0
.end method

.method public static final g(I)Lr/d0;
    .locals 1

    new-instance v0, Lr/d0;

    invoke-direct {v0, p0}, Lr/d0;-><init>(I)V

    return-object v0
.end method

.method public static synthetic h(IILjava/lang/Object;)Lr/d0;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lr/j;->g(I)Lr/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(FFLjava/lang/Object;)Lr/h0;
    .locals 1

    new-instance v0, Lr/h0;

    invoke-direct {v0, p0, p1, p2}, Lr/h0;-><init>(FFLjava/lang/Object;)V

    return-object v0
.end method

.method public static synthetic j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    const p1, 0x44bb8000    # 1500.0f

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, Lr/j;->i(FFLjava/lang/Object;)Lr/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(IILr/E;)Lr/r0;
    .locals 1

    new-instance v0, Lr/r0;

    invoke-direct {v0, p0, p1, p2}, Lr/r0;-><init>(IILr/E;)V

    return-object v0
.end method

.method public static synthetic l(IILr/E;ILjava/lang/Object;)Lr/r0;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p0, 0x12c

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    const/4 p1, 0x0

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    invoke-static {}, Lr/G;->c()Lr/E;

    move-result-object p2

    :cond_2
    invoke-static {p0, p1, p2}, Lr/j;->k(IILr/E;)Lr/r0;

    move-result-object p0

    return-object p0
.end method
