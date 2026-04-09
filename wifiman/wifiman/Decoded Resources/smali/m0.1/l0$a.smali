.class public final Lm0/l0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm0/l0$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/high16 p3, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {p4}, Lm0/m1$a;->a()I

    move-result p4

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lm0/l0$a;->a(Ljava/util/List;FFI)Lm0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm0/l0$a;Ljava/util/List;JFIILjava/lang/Object;)Lm0/l0;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->b()J

    move-result-wide p2

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/high16 p4, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    move v4, p4

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    sget-object p2, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {p2}, Lm0/m1$a;->a()I

    move-result p5

    :cond_2
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lm0/l0$a;->e(Ljava/util/List;JFI)Lm0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lm0/l0$a;Ljava/util/List;FFIILjava/lang/Object;)Lm0/l0;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/high16 p3, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {p4}, Lm0/m1$a;->a()I

    move-result p4

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lm0/l0$a;->g(Ljava/util/List;FFI)Lm0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lm0/l0$a;[LYg/s;FFIILjava/lang/Object;)Lm0/l0;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/high16 p3, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {p4}, Lm0/m1$a;->a()I

    move-result p4

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lm0/l0$a;->h([LYg/s;FFI)Lm0/l0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;FFI)Lm0/l0;
    .locals 8

    const/4 v0, 0x0

    invoke-static {p2, v0}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-static {p3, v0}, Ll0/h;->a(FF)J

    move-result-wide v5

    move-object v1, p0

    move-object v2, p1

    move v7, p4

    invoke-virtual/range {v1 .. v7}, Lm0/l0$a;->c(Ljava/util/List;JJI)Lm0/l0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/util/List;JJI)Lm0/l0;
    .locals 10

    new-instance v9, Lm0/N0;

    const/4 v2, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    invoke-direct/range {v0 .. v8}, Lm0/N0;-><init>(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public final d([LYg/s;JJI)Lm0/l0;
    .locals 11

    move-object v0, p1

    array-length v1, v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {v5}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/v0;

    invoke-virtual {v5}, Lm0/v0;->u()J

    move-result-wide v5

    invoke-static {v5, v6}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    array-length v1, v0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v5, v0, v2

    invoke-virtual {v5}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Lm0/N0;

    const/4 v10, 0x0

    move-object v2, v0

    move-wide v5, p2

    move-wide v7, p4

    move/from16 v9, p6

    invoke-direct/range {v2 .. v10}, Lm0/N0;-><init>(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final e(Ljava/util/List;JFI)Lm0/l0;
    .locals 9

    new-instance v8, Lm0/a1;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v7}, Lm0/a1;-><init>(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public final g(Ljava/util/List;FFI)Lm0/l0;
    .locals 8

    const/4 v0, 0x0

    invoke-static {v0, p2}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-static {v0, p3}, Ll0/h;->a(FF)J

    move-result-wide v5

    move-object v1, p0

    move-object v2, p1

    move v7, p4

    invoke-virtual/range {v1 .. v7}, Lm0/l0$a;->c(Ljava/util/List;JJI)Lm0/l0;

    move-result-object p1

    return-object p1
.end method

.method public final h([LYg/s;FFI)Lm0/l0;
    .locals 7

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, [LYg/s;

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ll0/h;->a(FF)J

    move-result-wide v2

    invoke-static {p1, p3}, Ll0/h;->a(FF)J

    move-result-wide v4

    move-object v0, p0

    move v6, p4

    invoke-virtual/range {v0 .. v6}, Lm0/l0$a;->d([LYg/s;JJI)Lm0/l0;

    move-result-object p1

    return-object p1
.end method
