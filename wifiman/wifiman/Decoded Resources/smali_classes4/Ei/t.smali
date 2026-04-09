.class public final LEi/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEi/t$a;
    }
.end annotation


# static fields
.field public static final e:LEi/t$a;

.field private static final f:LEi/t;


# instance fields
.field private a:I

.field private b:I

.field private final c:LHi/f;

.field private d:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LEi/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEi/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEi/t;->e:LEi/t$a;

    new-instance v0, LEi/t;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v1, v2}, LEi/t;-><init>(II[Ljava/lang/Object;)V

    sput-object v0, LEi/t;->f:LEi/t;

    return-void
.end method

.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-void
.end method

.method public constructor <init>(II[Ljava/lang/Object;LHi/f;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LEi/t;->a:I

    .line 3
    iput p2, p0, LEi/t;->b:I

    .line 4
    iput-object p4, p0, LEi/t;->c:LHi/f;

    .line 5
    iput-object p3, p0, LEi/t;->d:[Ljava/lang/Object;

    return-void
.end method

.method private final A(LEi/t;IILHi/b;LEi/f;)LEi/t;
    .locals 16

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p4

    invoke-direct {v9, v1}, LEi/t;->o(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v9, v1}, LEi/t;->J(I)I

    move-result v3

    invoke-virtual {v9, v3}, LEi/t;->I(I)LEi/t;

    move-result-object v10

    invoke-direct/range {p1 .. p2}, LEi/t;->o(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual/range {p1 .. p2}, LEi/t;->J(I)I

    move-result v1

    invoke-virtual {v0, v1}, LEi/t;->I(I)LEi/t;

    move-result-object v0

    add-int/lit8 v1, p3, 0x5

    move-object/from16 v7, p5

    invoke-virtual {v10, v0, v1, v2, v7}, LEi/t;->z(LEi/t;ILHi/b;LEi/f;)LEi/t;

    move-result-object v10

    goto/16 :goto_3

    :cond_0
    move-object/from16 v7, p5

    invoke-virtual/range {p1 .. p2}, LEi/t;->n(I)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual/range {p1 .. p2}, LEi/t;->j(I)I

    move-result v1

    invoke-direct {v0, v1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v12

    invoke-direct {v0, v1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual/range {p5 .. p5}, LZg/i;->size()I

    move-result v0

    if-eqz v12, :cond_1

    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :cond_1
    move v11, v4

    add-int/lit8 v14, p3, 0x5

    move-object/from16 v15, p5

    invoke-virtual/range {v10 .. v15}, LEi/t;->y(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;

    move-result-object v10

    invoke-virtual/range {p5 .. p5}, LZg/i;->size()I

    move-result v1

    if-ne v1, v0, :cond_a

    invoke-virtual/range {p4 .. p4}, LHi/b;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, LHi/b;->c(I)V

    goto/16 :goto_3

    :cond_2
    move-object/from16 v7, p5

    invoke-direct/range {p1 .. p2}, LEi/t;->o(I)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual/range {p1 .. p2}, LEi/t;->J(I)I

    move-result v3

    invoke-virtual {v0, v3}, LEi/t;->I(I)LEi/t;

    move-result-object v0

    invoke-virtual {v9, v1}, LEi/t;->n(I)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v9, v1}, LEi/t;->j(I)I

    move-result v1

    invoke-direct {v9, v1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_0
    add-int/lit8 v6, p3, 0x5

    invoke-virtual {v0, v3, v5, v6}, LEi/t;->g(ILjava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual/range {p4 .. p4}, LHi/b;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, LHi/b;->c(I)V

    goto :goto_1

    :cond_4
    invoke-direct {v9, v1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :cond_5
    move v3, v4

    move-object v2, v0

    move-object v4, v5

    move-object v5, v1

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, LEi/t;->y(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;

    move-result-object v10

    goto :goto_3

    :cond_6
    :goto_1
    move-object v10, v0

    goto :goto_3

    :cond_7
    invoke-virtual {v9, v1}, LEi/t;->j(I)I

    move-result v2

    invoke-direct {v9, v2}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v9, v2}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual/range {p1 .. p2}, LEi/t;->j(I)I

    move-result v1

    invoke-direct {v0, v1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v0, v1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    move v1, v0

    goto :goto_2

    :cond_8
    move v1, v4

    :goto_2
    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v0

    move v4, v0

    :cond_9
    add-int/lit8 v10, p3, 0x5

    invoke-virtual/range {p5 .. p5}, LEi/f;->k()LHi/f;

    move-result-object v11

    move-object/from16 v0, p0

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v8

    move v7, v10

    move-object v8, v11

    invoke-direct/range {v0 .. v8}, LEi/t;->q(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILHi/f;)LEi/t;

    move-result-object v10

    :cond_a
    :goto_3
    return-object v10
.end method

.method private final D(IILEi/f;)LEi/t;
    .locals 2

    invoke-virtual {p3}, LZg/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p3, v0}, LEi/f;->r(I)V

    invoke-direct {p0, p1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, v0}, LEi/f;->q(Ljava/lang/Object;)V

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LEi/t;->c:LHi/f;

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object p3, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {p3, p1}, LEi/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LEi/t;->d:[Ljava/lang/Object;

    iget p1, p0, LEi/t;->a:I

    xor-int/2addr p1, p2

    iput p1, p0, LEi/t;->a:I

    return-object p0

    :cond_1
    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {v0, p1}, LEi/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LEi/t;

    iget v1, p0, LEi/t;->a:I

    xor-int/2addr p2, v1

    iget v1, p0, LEi/t;->b:I

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object p3

    invoke-direct {v0, p2, v1, p1, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object v0
.end method

.method private final E(IILHi/f;)LEi/t;
    .locals 3

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, LEi/t;->c:LHi/f;

    if-ne v1, p3, :cond_1

    invoke-static {v0, p1}, LEi/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LEi/t;->d:[Ljava/lang/Object;

    iget p1, p0, LEi/t;->b:I

    xor-int/2addr p1, p2

    iput p1, p0, LEi/t;->b:I

    return-object p0

    :cond_1
    invoke-static {v0, p1}, LEi/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LEi/t;

    iget v1, p0, LEi/t;->a:I

    iget v2, p0, LEi/t;->b:I

    xor-int/2addr p2, v2

    invoke-direct {v0, v1, p2, p1, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object v0
.end method

.method private final F(LEi/t;LEi/t;IILHi/f;)LEi/t;
    .locals 0

    if-nez p2, :cond_0

    invoke-direct {p0, p3, p4, p5}, LEi/t;->E(IILHi/f;)LEi/t;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eq p1, p2, :cond_1

    invoke-direct {p0, p3, p2, p5}, LEi/t;->G(ILEi/t;LHi/f;)LEi/t;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method private final G(ILEi/t;LHi/f;)LEi/t;
    .locals 3

    iget-object v0, p2, LEi/t;->c:LHi/f;

    const/4 v1, 0x1

    if-ne v0, p3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHi/a;->a(Z)V

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v2, v0

    if-ne v2, v1, :cond_1

    iget-object v1, p2, LEi/t;->d:[Ljava/lang/Object;

    array-length v1, v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget v1, p2, LEi/t;->b:I

    if-nez v1, :cond_1

    iget p1, p0, LEi/t;->b:I

    iput p1, p2, LEi/t;->a:I

    return-object p2

    :cond_1
    iget-object v1, p0, LEi/t;->c:LHi/f;

    if-ne v1, p3, :cond_2

    aput-object p2, v0, p1

    return-object p0

    :cond_2
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object p2, v0, p1

    new-instance p1, LEi/t;

    iget p2, p0, LEi/t;->a:I

    iget v1, p0, LEi/t;->b:I

    invoke-direct {p1, p2, v1, v0, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object p1
.end method

.method private final H(ILjava/lang/Object;LEi/f;)LEi/t;
    .locals 2

    iget-object v0, p0, LEi/t;->c:LHi/f;

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object p3, p0, LEi/t;->d:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aput-object p2, p3, p1

    return-object p0

    :cond_0
    invoke-virtual {p3}, LEi/f;->i()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p3, v0}, LEi/f;->n(I)V

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    aput-object p2, v0, p1

    new-instance p1, LEi/t;

    iget p2, p0, LEi/t;->a:I

    iget v1, p0, LEi/t;->b:I

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object p3

    invoke-direct {p1, p2, v1, v0, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object p1
.end method

.method private final K(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public static final synthetic a()LEi/t;
    .locals 1

    sget-object v0, LEi/t;->f:LEi/t;

    return-object v0
.end method

.method private final b(IIILjava/lang/Object;Ljava/lang/Object;ILHi/f;)[Ljava/lang/Object;
    .locals 10

    move-object v9, p0

    invoke-direct {p0, p1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {p0, p1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v7, p6, 0x5

    move-object v0, p0

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LEi/t;->q(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILHi/f;)LEi/t;

    move-result-object v0

    move v1, p2

    invoke-virtual {p0, p2}, LEi/t;->J(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, v9, LEi/t;->d:[Ljava/lang/Object;

    move v3, p1

    invoke-static {v2, p1, v1, v0}, LEi/x;->d([Ljava/lang/Object;IILEi/t;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final c()I
    .locals 4

    iget v0, p0, LEi/t;->b:I

    if-nez v0, :cond_0

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0

    :cond_0
    iget v0, p0, LEi/t;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    iget-object v2, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v2, v2

    :goto_0
    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, LEi/t;->I(I)LEi/t;

    move-result-object v3

    invoke-direct {v3}, LEi/t;->c()I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private final d(Ljava/lang/Object;)Z
    .locals 1

    invoke-direct {p0, p1}, LEi/t;->f(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0, p1}, LEi/t;->f(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final f(Ljava/lang/Object;)I
    .locals 4

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v1

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->k()I

    move-result v0

    if-lez v0, :cond_0

    if-le v1, v2, :cond_1

    :cond_0
    if-gez v0, :cond_3

    if-gt v2, v1, :cond_3

    :cond_1
    :goto_0
    invoke-direct {p0, v1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return v1

    :cond_2
    if-eq v1, v2, :cond_3

    add-int/2addr v1, v0

    goto :goto_0

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method private final h(LEi/t;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, LEi/t;->b:I

    iget v2, p1, LEi/t;->b:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    return v3

    :cond_1
    iget v1, p0, LEi/t;->a:I

    iget v2, p1, LEi/t;->a:I

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    iget-object v1, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v1, v1

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_4

    iget-object v4, p0, LEi/t;->d:[Ljava/lang/Object;

    aget-object v4, v4, v2

    iget-object v5, p1, LEi/t;->d:[Ljava/lang/Object;

    aget-object v5, v5, v2

    if-eq v4, v5, :cond_3

    return v3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method private final o(I)Z
    .locals 1

    iget v0, p0, LEi/t;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final p(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method private final q(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILHi/f;)LEi/t;
    .locals 13

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v0, p7

    move-object/from16 v9, p8

    const/16 v1, 0x1e

    const/4 v10, 0x0

    if-le v0, v1, :cond_0

    new-instance v0, LEi/t;

    filled-new-array {p2, v3, v5, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v10, v10, v1, v9}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object v0

    :cond_0
    move v1, p1

    invoke-static {p1, v0}, LEi/x;->e(II)I

    move-result v11

    move/from16 v4, p4

    invoke-static {v4, v0}, LEi/x;->e(II)I

    move-result v7

    const/4 v12, 0x1

    if-eq v11, v7, :cond_2

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v4, 0x4

    if-ge v11, v7, :cond_1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v10

    aput-object v3, v4, v12

    aput-object v5, v4, v1

    aput-object v6, v4, v0

    goto :goto_0

    :cond_1
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v5, v4, v10

    aput-object v6, v4, v12

    aput-object v2, v4, v1

    aput-object v3, v4, v0

    :goto_0
    new-instance v0, LEi/t;

    shl-int v1, v12, v11

    shl-int v2, v12, v7

    or-int/2addr v1, v2

    invoke-direct {v0, v1, v10, v4, v9}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object v0

    :cond_2
    add-int/lit8 v7, v0, 0x5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LEi/t;->q(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILHi/f;)LEi/t;

    move-result-object v0

    new-instance v1, LEi/t;

    shl-int v2, v12, v11

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v1, v10, v2, v0, v9}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object v1
.end method

.method private final r(Ljava/lang/Object;Ljava/lang/Object;LEi/f;)LEi/t;
    .locals 3

    invoke-direct {p0, p1}, LEi/t;->f(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    invoke-direct {p0, v0}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, p1}, LEi/f;->q(Ljava/lang/Object;)V

    iget-object p1, p0, LEi/t;->c:LHi/f;

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object v1

    if-ne p1, v1, :cond_0

    iget-object p1, p0, LEi/t;->d:[Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    aput-object p2, p1, v0

    return-object p0

    :cond_0
    invoke-virtual {p3}, LEi/f;->i()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p3, p1}, LEi/f;->n(I)V

    iget-object p1, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v1, "copyOf(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    aput-object p2, p1, v0

    new-instance p2, LEi/t;

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object p3

    invoke-direct {p2, v2, v2, p1, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object p2

    :cond_1
    invoke-virtual {p3}, LZg/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p3, v0}, LEi/f;->r(I)V

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {v0, v2, p1, p2}, LEi/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p2, LEi/t;

    invoke-virtual {p3}, LEi/f;->k()LHi/f;

    move-result-object p3

    invoke-direct {p2, v2, v2, p1, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object p2
.end method

.method private final s(LEi/t;LHi/b;LHi/f;)LEi/t;
    .locals 11

    iget v0, p0, LEi/t;->b:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, LHi/a;->a(Z)V

    iget v0, p0, LEi/t;->a:I

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-static {v0}, LHi/a;->a(Z)V

    iget v0, p1, LEi/t;->b:I

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    invoke-static {v0}, LHi/a;->a(Z)V

    iget v0, p1, LEi/t;->a:I

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    invoke-static {v0}, LHi/a;->a(Z)V

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v3, v0

    iget-object v4, p1, LEi/t;->d:[Ljava/lang/Object;

    array-length v4, v4

    add-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v3, "copyOf(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v4, v4

    iget-object v5, p1, LEi/t;->d:[Ljava/lang/Object;

    array-length v5, v5

    invoke-static {v2, v5}, Lsh/m;->s(II)Lsh/i;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v5

    invoke-virtual {v5}, Lsh/g;->i()I

    move-result v6

    invoke-virtual {v5}, Lsh/g;->j()I

    move-result v7

    invoke-virtual {v5}, Lsh/g;->k()I

    move-result v5

    if-lez v5, :cond_4

    if-le v6, v7, :cond_5

    :cond_4
    if-gez v5, :cond_7

    if-gt v7, v6, :cond_7

    :cond_5
    :goto_4
    iget-object v8, p1, LEi/t;->d:[Ljava/lang/Object;

    aget-object v8, v8, v6

    invoke-direct {p0, v8}, LEi/t;->d(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    iget-object v8, p1, LEi/t;->d:[Ljava/lang/Object;

    aget-object v9, v8, v6

    aput-object v9, v0, v4

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v10, v6, 0x1

    aget-object v8, v8, v10

    aput-object v8, v0, v9

    add-int/lit8 v4, v4, 0x2

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, LHi/b;->a()I

    move-result v8

    add-int/2addr v8, v1

    invoke-virtual {p2, v8}, LHi/b;->c(I)V

    :goto_5
    if-eq v6, v7, :cond_7

    add-int/2addr v6, v5

    goto :goto_4

    :cond_7
    iget-object p2, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length p2, p2

    if-ne v4, p2, :cond_8

    move-object p1, p0

    goto :goto_6

    :cond_8
    iget-object p2, p1, LEi/t;->d:[Ljava/lang/Object;

    array-length p2, p2

    if-ne v4, p2, :cond_9

    goto :goto_6

    :cond_9
    array-length p1, v0

    if-ne v4, p1, :cond_a

    new-instance p1, LEi/t;

    invoke-direct {p1, v2, v2, v0, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    goto :goto_6

    :cond_a
    new-instance p1, LEi/t;

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v2, v2, p2, p3}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    :goto_6
    return-object p1
.end method

.method private final t(Ljava/lang/Object;LEi/f;)LEi/t;
    .locals 1

    invoke-direct {p0, p1}, LEi/t;->f(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1, p2}, LEi/t;->v(ILEi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method private final u(Ljava/lang/Object;Ljava/lang/Object;LEi/f;)LEi/t;
    .locals 1

    invoke-direct {p0, p1}, LEi/t;->f(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, p3}, LEi/t;->v(ILEi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method private final v(ILEi/f;)LEi/t;
    .locals 2

    invoke-virtual {p2}, LZg/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, LEi/f;->r(I)V

    invoke-direct {p0, p1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, LEi/f;->q(Ljava/lang/Object;)V

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LEi/t;->c:LHi/f;

    invoke-virtual {p2}, LEi/f;->k()LHi/f;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object p2, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {p2, p1}, LEi/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LEi/t;->d:[Ljava/lang/Object;

    return-object p0

    :cond_1
    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {v0, p1}, LEi/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LEi/t;

    invoke-virtual {p2}, LEi/f;->k()LHi/f;

    move-result-object p2

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, p2}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object v0
.end method

.method private final w(ILjava/lang/Object;Ljava/lang/Object;LHi/f;)LEi/t;
    .locals 2

    invoke-virtual {p0, p1}, LEi/t;->j(I)I

    move-result v0

    iget-object v1, p0, LEi/t;->c:LHi/f;

    if-ne v1, p4, :cond_0

    iget-object p4, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {p4, v0, p2, p3}, LEi/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LEi/t;->d:[Ljava/lang/Object;

    iget p2, p0, LEi/t;->a:I

    or-int/2addr p1, p2

    iput p1, p0, LEi/t;->a:I

    return-object p0

    :cond_0
    iget-object v1, p0, LEi/t;->d:[Ljava/lang/Object;

    invoke-static {v1, v0, p2, p3}, LEi/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    new-instance p3, LEi/t;

    iget v0, p0, LEi/t;->a:I

    or-int/2addr p1, v0

    iget v0, p0, LEi/t;->b:I

    invoke-direct {p3, p1, v0, p2, p4}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object p3
.end method

.method private final x(IIILjava/lang/Object;Ljava/lang/Object;ILHi/f;)LEi/t;
    .locals 1

    iget-object v0, p0, LEi/t;->c:LHi/f;

    if-ne v0, p7, :cond_0

    invoke-direct/range {p0 .. p7}, LEi/t;->b(IIILjava/lang/Object;Ljava/lang/Object;ILHi/f;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LEi/t;->d:[Ljava/lang/Object;

    iget p1, p0, LEi/t;->a:I

    xor-int/2addr p1, p2

    iput p1, p0, LEi/t;->a:I

    iget p1, p0, LEi/t;->b:I

    or-int/2addr p1, p2

    iput p1, p0, LEi/t;->b:I

    return-object p0

    :cond_0
    invoke-direct/range {p0 .. p7}, LEi/t;->b(IIILjava/lang/Object;Ljava/lang/Object;ILHi/f;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p3, LEi/t;

    iget p4, p0, LEi/t;->a:I

    xor-int/2addr p4, p2

    iget p5, p0, LEi/t;->b:I

    or-int/2addr p2, p5

    invoke-direct {p3, p4, p2, p1, p7}, LEi/t;-><init>(II[Ljava/lang/Object;LHi/f;)V

    return-object p3
.end method


# virtual methods
.method public final B(ILjava/lang/Object;ILEi/f;)LEi/t;
    .locals 8

    const-string v0, "mutator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p1, p3}, LEi/x;->e(II)I

    move-result v1

    shl-int v6, v0, v1

    invoke-virtual {p0, v6}, LEi/t;->n(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v6}, LEi/t;->j(I)I

    move-result p1

    invoke-direct {p0, p1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, v6, p4}, LEi/t;->D(IILEi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    invoke-direct {p0, v6}, LEi/t;->o(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v6}, LEi/t;->J(I)I

    move-result v5

    invoke-virtual {p0, v5}, LEi/t;->I(I)LEi/t;

    move-result-object v3

    const/16 v0, 0x1e

    if-ne p3, v0, :cond_2

    invoke-direct {v3, p2, p4}, LEi/t;->t(Ljava/lang/Object;LEi/f;)LEi/t;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_2
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v3, p1, p2, p3, p4}, LEi/t;->B(ILjava/lang/Object;ILEi/f;)LEi/t;

    move-result-object p1

    goto :goto_0

    :goto_1
    invoke-virtual {p4}, LEi/f;->k()LHi/f;

    move-result-object v7

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, LEi/t;->F(LEi/t;LEi/t;IILHi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p0
.end method

.method public final C(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;
    .locals 11

    move-object v6, p0

    move-object v2, p2

    move-object v3, p3

    move v0, p4

    move-object/from16 v7, p5

    const-string v1, "mutator"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    move v4, p1

    invoke-static {p1, p4}, LEi/x;->e(II)I

    move-result v5

    shl-int v8, v1, v5

    invoke-virtual {p0, v8}, LEi/t;->n(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v8}, LEi/t;->j(I)I

    move-result v0

    invoke-direct {p0, v0}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, v8, v7}, LEi/t;->D(IILEi/f;)LEi/t;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v6

    :cond_1
    invoke-direct {p0, v8}, LEi/t;->o(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v8}, LEi/t;->J(I)I

    move-result v9

    invoke-virtual {p0, v9}, LEi/t;->I(I)LEi/t;

    move-result-object v10

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_2

    invoke-direct {v10, p2, p3, v7}, LEi/t;->u(Ljava/lang/Object;Ljava/lang/Object;LEi/f;)LEi/t;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v0, 0x5

    move-object v0, v10

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, v5

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, LEi/t;->C(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p5 .. p5}, LEi/f;->k()LHi/f;

    move-result-object v5

    move-object v0, p0

    move-object v1, v10

    move v3, v9

    move v4, v8

    invoke-direct/range {v0 .. v5}, LEi/t;->F(LEi/t;LEi/t;IILHi/f;)LEi/t;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v6
.end method

.method public final I(I)LEi/t;
    .locals 1

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    const-string v0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LEi/t;

    return-object p1
.end method

.method public final J(I)I
    .locals 2

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, LEi/t;->b:I

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final g(ILjava/lang/Object;I)Z
    .locals 2

    const/4 v0, 0x1

    invoke-static {p1, p3}, LEi/x;->e(II)I

    move-result v1

    shl-int/2addr v0, v1

    invoke-virtual {p0, v0}, LEi/t;->n(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, LEi/t;->j(I)I

    move-result p1

    invoke-direct {p0, p1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, v0}, LEi/t;->o(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, LEi/t;->J(I)I

    move-result v0

    invoke-virtual {p0, v0}, LEi/t;->I(I)LEi/t;

    move-result-object v0

    const/16 v1, 0x1e

    if-ne p3, v1, :cond_1

    invoke-direct {v0, p2}, LEi/t;->d(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v0, p1, p2, p3}, LEi/t;->g(ILjava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LEi/t;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    return v0
.end method

.method public final j(I)I
    .locals 1

    iget v0, p0, LEi/t;->a:I

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public final k(LEi/t;Lmh/p;)Z
    .locals 8

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equalityComparator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, LEi/t;->a:I

    iget v2, p1, LEi/t;->a:I

    const/4 v3, 0x0

    if-ne v1, v2, :cond_f

    iget v2, p0, LEi/t;->b:I

    iget v4, p1, LEi/t;->b:I

    if-eq v2, v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v4, 0x2

    if-nez v1, :cond_7

    if-nez v2, :cond_7

    iget-object v1, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v2, v1

    iget-object v5, p1, LEi/t;->d:[Ljava/lang/Object;

    array-length v5, v5

    if-eq v2, v5, :cond_2

    return v3

    :cond_2
    array-length v1, v1

    invoke-static {v3, v1}, Lsh/m;->s(II)Lsh/i;

    move-result-object v1

    invoke-static {v1, v4}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v2, v1

    check-cast v2, LZg/Q;

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v2

    invoke-direct {p1, v2}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {p1, v2}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v4}, LEi/t;->f(Ljava/lang/Object;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_5

    invoke-direct {p0, v4}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_0

    :cond_5
    move v2, v3

    :goto_0
    if-nez v2, :cond_4

    move v0, v3

    :cond_6
    :goto_1
    return v0

    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    mul-int/2addr v1, v4

    invoke-static {v3, v1}, Lsh/m;->s(II)Lsh/i;

    move-result-object v2

    invoke-static {v2, v4}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v2

    invoke-virtual {v2}, Lsh/g;->i()I

    move-result v4

    invoke-virtual {v2}, Lsh/g;->j()I

    move-result v5

    invoke-virtual {v2}, Lsh/g;->k()I

    move-result v2

    if-lez v2, :cond_8

    if-le v4, v5, :cond_9

    :cond_8
    if-gez v2, :cond_c

    if-gt v5, v4, :cond_c

    :cond_9
    :goto_2
    invoke-direct {p0, v4}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {p1, v4}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    return v3

    :cond_a
    invoke-direct {p0, v4}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {p1, v4}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {p2, v6, v7}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_b

    return v3

    :cond_b
    if-eq v4, v5, :cond_c

    add-int/2addr v4, v2

    goto :goto_2

    :cond_c
    iget-object v2, p0, LEi/t;->d:[Ljava/lang/Object;

    array-length v2, v2

    :goto_3
    if-ge v1, v2, :cond_e

    invoke-virtual {p0, v1}, LEi/t;->I(I)LEi/t;

    move-result-object v4

    invoke-virtual {p1, v1}, LEi/t;->I(I)LEi/t;

    move-result-object v5

    invoke-virtual {v4, v5, p2}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result v4

    if-nez v4, :cond_d

    return v3

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_e
    return v0

    :cond_f
    :goto_4
    return v3
.end method

.method public final l(ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, p3}, LEi/x;->e(II)I

    move-result v1

    shl-int/2addr v0, v1

    invoke-virtual {p0, v0}, LEi/t;->n(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, LEi/t;->j(I)I

    move-result p1

    invoke-direct {p0, p1}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    invoke-direct {p0, v0}, LEi/t;->o(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, LEi/t;->J(I)I

    move-result v0

    invoke-virtual {p0, v0}, LEi/t;->I(I)LEi/t;

    move-result-object v0

    const/16 v1, 0x1e

    if-ne p3, v1, :cond_2

    invoke-direct {v0, p2}, LEi/t;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v0, p1, p2, p3}, LEi/t;->l(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v2
.end method

.method public final m()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LEi/t;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final n(I)Z
    .locals 1

    iget v0, p0, LEi/t;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final y(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;
    .locals 10

    const-string v0, "mutator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p4}, LEi/x;->e(II)I

    move-result v0

    const/4 v1, 0x1

    shl-int v4, v1, v0

    invoke-virtual {p0, v4}, LEi/t;->n(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v4}, LEi/t;->j(I)I

    move-result v3

    invoke-direct {p0, v3}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v3}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p5, p1}, LEi/f;->q(Ljava/lang/Object;)V

    invoke-direct {p0, v3}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p3, :cond_0

    return-object p0

    :cond_0
    invoke-direct {p0, v3, p3, p5}, LEi/t;->H(ILjava/lang/Object;LEi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p5}, LZg/i;->size()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p5, v0}, LEi/f;->r(I)V

    invoke-virtual {p5}, LEi/f;->k()LHi/f;

    move-result-object v9

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v9}, LEi/t;->x(IIILjava/lang/Object;Ljava/lang/Object;ILHi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, v4}, LEi/t;->o(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v4}, LEi/t;->J(I)I

    move-result v0

    invoke-virtual {p0, v0}, LEi/t;->I(I)LEi/t;

    move-result-object v7

    const/16 v1, 0x1e

    if-ne p4, v1, :cond_3

    invoke-direct {v7, p2, p3, p5}, LEi/t;->r(Ljava/lang/Object;Ljava/lang/Object;LEi/f;)LEi/t;

    move-result-object p1

    goto :goto_0

    :cond_3
    add-int/lit8 v5, p4, 0x5

    move-object v1, v7

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LEi/t;->y(ILjava/lang/Object;Ljava/lang/Object;ILEi/f;)LEi/t;

    move-result-object p1

    :goto_0
    if-ne v7, p1, :cond_4

    return-object p0

    :cond_4
    invoke-virtual {p5}, LEi/f;->k()LHi/f;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, LEi/t;->G(ILEi/t;LHi/f;)LEi/t;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p5}, LZg/i;->size()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p5, p1}, LEi/f;->r(I)V

    invoke-virtual {p5}, LEi/f;->k()LHi/f;

    move-result-object p1

    invoke-direct {p0, v4, p2, p3, p1}, LEi/t;->w(ILjava/lang/Object;Ljava/lang/Object;LHi/f;)LEi/t;

    move-result-object p1

    return-object p1
.end method

.method public final z(LEi/t;ILHi/b;LEi/f;)LEi/t;
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    const-string v0, "otherNode"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intersectionCounter"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutator"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne v6, v7, :cond_0

    invoke-direct/range {p0 .. p0}, LEi/t;->c()I

    move-result v0

    invoke-virtual {v8, v0}, LHi/b;->b(I)V

    return-object v6

    :cond_0
    const/16 v0, 0x1e

    move/from16 v10, p2

    if-le v10, v0, :cond_1

    invoke-virtual/range {p4 .. p4}, LEi/f;->k()LHi/f;

    move-result-object v0

    invoke-direct {v6, v7, v8, v0}, LEi/t;->s(LEi/t;LHi/b;LHi/f;)LEi/t;

    move-result-object v0

    return-object v0

    :cond_1
    iget v0, v6, LEi/t;->b:I

    iget v1, v7, LEi/t;->b:I

    or-int/2addr v0, v1

    iget v1, v6, LEi/t;->a:I

    iget v2, v7, LEi/t;->a:I

    xor-int v3, v1, v2

    not-int v4, v0

    and-int/2addr v3, v4

    and-int/2addr v1, v2

    move v11, v3

    :goto_0
    if-eqz v1, :cond_3

    invoke-static {v1}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v2

    invoke-virtual {v6, v2}, LEi/t;->j(I)I

    move-result v3

    invoke-direct {v6, v3}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v7, v2}, LEi/t;->j(I)I

    move-result v4

    invoke-direct {v7, v4}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    or-int v3, v11, v2

    move v11, v3

    goto :goto_1

    :cond_2
    or-int/2addr v0, v2

    :goto_1
    xor-int/2addr v1, v2

    goto :goto_0

    :cond_3
    and-int v1, v0, v11

    if-nez v1, :cond_b

    iget-object v1, v6, LEi/t;->c:LHi/f;

    invoke-virtual/range {p4 .. p4}, LEi/f;->k()LHi/f;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, v6, LEi/t;->a:I

    if-ne v1, v11, :cond_4

    iget v1, v6, LEi/t;->b:I

    if-ne v1, v0, :cond_4

    move-object v12, v6

    goto :goto_2

    :cond_4
    invoke-static {v11}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v2

    add-int/2addr v1, v2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, LEi/t;

    invoke-direct {v2, v11, v0, v1}, LEi/t;-><init>(II[Ljava/lang/Object;)V

    move-object v12, v2

    :goto_2
    const/4 v13, 0x0

    move v14, v0

    move v15, v13

    :goto_3
    if-eqz v14, :cond_5

    invoke-static {v14}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v16

    iget-object v5, v12, LEi/t;->d:[Ljava/lang/Object;

    array-length v0, v5

    add-int/lit8 v0, v0, -0x1

    sub-int v17, v0, v15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v16

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v18, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, LEi/t;->A(LEi/t;IILHi/b;LEi/f;)LEi/t;

    move-result-object v0

    aput-object v0, v18, v17

    add-int/lit8 v15, v15, 0x1

    xor-int v14, v14, v16

    goto :goto_3

    :cond_5
    :goto_4
    if-eqz v11, :cond_8

    invoke-static {v11}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v0

    mul-int/lit8 v1, v13, 0x2

    invoke-virtual {v7, v0}, LEi/t;->n(I)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v6, v0}, LEi/t;->j(I)I

    move-result v2

    iget-object v3, v12, LEi/t;->d:[Ljava/lang/Object;

    invoke-direct {v6, v2}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, v12, LEi/t;->d:[Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v6, v2}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    goto :goto_5

    :cond_6
    invoke-virtual {v7, v0}, LEi/t;->j(I)I

    move-result v2

    iget-object v3, v12, LEi/t;->d:[Ljava/lang/Object;

    invoke-direct {v7, v2}, LEi/t;->p(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, v12, LEi/t;->d:[Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v7, v2}, LEi/t;->K(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-virtual {v6, v0}, LEi/t;->n(I)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual/range {p3 .. p3}, LHi/b;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v8, v1}, LHi/b;->c(I)V

    :cond_7
    :goto_5
    add-int/lit8 v13, v13, 0x1

    xor-int/2addr v11, v0

    goto :goto_4

    :cond_8
    invoke-direct {v6, v12}, LEi/t;->h(LEi/t;)Z

    move-result v0

    if-eqz v0, :cond_9

    move-object v12, v6

    goto :goto_6

    :cond_9
    invoke-direct {v7, v12}, LEi/t;->h(LEi/t;)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object v12, v7

    :cond_a
    :goto_6
    return-object v12

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
