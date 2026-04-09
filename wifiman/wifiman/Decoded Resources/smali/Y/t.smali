.class public final LY/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/t$a;,
        LY/t$b;
    }
.end annotation


# static fields
.field public static final e:LY/t$a;

.field public static final f:I

.field private static final g:LY/t;


# instance fields
.field private a:I

.field private b:I

.field private final c:La0/e;

.field private d:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LY/t;->e:LY/t$a;

    const/16 v0, 0x8

    sput v0, LY/t;->f:I

    new-instance v0, LY/t;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v1, v2}, LY/t;-><init>(II[Ljava/lang/Object;)V

    sput-object v0, LY/t;->g:LY/t;

    return-void
.end method

.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-void
.end method

.method public constructor <init>(II[Ljava/lang/Object;La0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LY/t;->a:I

    .line 3
    iput p2, p0, LY/t;->b:I

    .line 4
    iput-object p4, p0, LY/t;->c:La0/e;

    .line 5
    iput-object p3, p0, LY/t;->d:[Ljava/lang/Object;

    return-void
.end method

.method private final A(ILY/f;)LY/t;
    .locals 2

    invoke-virtual {p2}, LZg/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, v0}, LY/f;->q(I)V

    invoke-direct {p0, p1}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, LY/f;->n(Ljava/lang/Object;)V

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LY/t;->c:La0/e;

    invoke-virtual {p2}, LY/f;->j()La0/e;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object p2, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {p2, p1}, LY/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    return-object p0

    :cond_1
    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {v0, p1}, LY/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LY/t;

    invoke-virtual {p2}, LY/f;->j()La0/e;

    move-result-object p2

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1, p2}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object v0
.end method

.method private final B(ILjava/lang/Object;Ljava/lang/Object;La0/e;)LY/t;
    .locals 2

    invoke-virtual {p0, p1}, LY/t;->n(I)I

    move-result v0

    iget-object v1, p0, LY/t;->c:La0/e;

    if-ne v1, p4, :cond_0

    iget-object p4, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {p4, v0, p2, p3}, LY/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LY/t;->d:[Ljava/lang/Object;

    iget p2, p0, LY/t;->a:I

    or-int/2addr p1, p2

    iput p1, p0, LY/t;->a:I

    return-object p0

    :cond_0
    iget-object v1, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {v1, v0, p2, p3}, LY/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    new-instance p3, LY/t;

    iget v0, p0, LY/t;->a:I

    or-int/2addr p1, v0

    iget v0, p0, LY/t;->b:I

    invoke-direct {p3, p1, v0, p2, p4}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object p3
.end method

.method private final C(IIILjava/lang/Object;Ljava/lang/Object;ILa0/e;)LY/t;
    .locals 1

    iget-object v0, p0, LY/t;->c:La0/e;

    if-ne v0, p7, :cond_0

    invoke-direct/range {p0 .. p7}, LY/t;->d(IIILjava/lang/Object;Ljava/lang/Object;ILa0/e;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    iget p1, p0, LY/t;->a:I

    xor-int/2addr p1, p2

    iput p1, p0, LY/t;->a:I

    iget p1, p0, LY/t;->b:I

    or-int/2addr p1, p2

    iput p1, p0, LY/t;->b:I

    return-object p0

    :cond_0
    invoke-direct/range {p0 .. p7}, LY/t;->d(IIILjava/lang/Object;Ljava/lang/Object;ILa0/e;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p3, LY/t;

    iget p4, p0, LY/t;->a:I

    xor-int/2addr p4, p2

    iget p5, p0, LY/t;->b:I

    or-int/2addr p2, p5

    invoke-direct {p3, p4, p2, p1, p7}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object p3
.end method

.method private final F(LY/t;IILa0/b;LY/f;)LY/t;
    .locals 16

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p4

    invoke-direct {v9, v1}, LY/t;->r(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v9, v1}, LY/t;->O(I)I

    move-result v3

    invoke-virtual {v9, v3}, LY/t;->N(I)LY/t;

    move-result-object v10

    invoke-direct/range {p1 .. p2}, LY/t;->r(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual/range {p1 .. p2}, LY/t;->O(I)I

    move-result v1

    invoke-virtual {v0, v1}, LY/t;->N(I)LY/t;

    move-result-object v0

    add-int/lit8 v1, p3, 0x5

    move-object/from16 v7, p5

    invoke-virtual {v10, v0, v1, v2, v7}, LY/t;->E(LY/t;ILa0/b;LY/f;)LY/t;

    move-result-object v10

    goto/16 :goto_3

    :cond_0
    move-object/from16 v7, p5

    invoke-virtual/range {p1 .. p2}, LY/t;->q(I)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual/range {p1 .. p2}, LY/t;->n(I)I

    move-result v1

    invoke-direct {v0, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v12

    invoke-direct {v0, v1}, LY/t;->W(I)Ljava/lang/Object;

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

    invoke-virtual/range {v10 .. v15}, LY/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;

    move-result-object v10

    invoke-virtual/range {p5 .. p5}, LZg/i;->size()I

    move-result v1

    if-ne v1, v0, :cond_a

    invoke-virtual/range {p4 .. p4}, La0/b;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, La0/b;->c(I)V

    goto/16 :goto_3

    :cond_2
    move-object/from16 v7, p5

    invoke-direct/range {p1 .. p2}, LY/t;->r(I)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual/range {p1 .. p2}, LY/t;->O(I)I

    move-result v3

    invoke-virtual {v0, v3}, LY/t;->N(I)LY/t;

    move-result-object v0

    invoke-virtual {v9, v1}, LY/t;->q(I)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v9, v1}, LY/t;->n(I)I

    move-result v1

    invoke-direct {v9, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_0
    add-int/lit8 v6, p3, 0x5

    invoke-virtual {v0, v3, v5, v6}, LY/t;->k(ILjava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual/range {p4 .. p4}, La0/b;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, La0/b;->c(I)V

    goto :goto_1

    :cond_4
    invoke-direct {v9, v1}, LY/t;->W(I)Ljava/lang/Object;

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

    invoke-virtual/range {v2 .. v7}, LY/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;

    move-result-object v10

    goto :goto_3

    :cond_6
    :goto_1
    move-object v10, v0

    goto :goto_3

    :cond_7
    invoke-virtual {v9, v1}, LY/t;->n(I)I

    move-result v2

    invoke-direct {v9, v2}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v9, v2}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual/range {p1 .. p2}, LY/t;->n(I)I

    move-result v1

    invoke-direct {v0, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v0, v1}, LY/t;->W(I)Ljava/lang/Object;

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

    invoke-virtual/range {p5 .. p5}, LY/f;->j()La0/e;

    move-result-object v11

    move-object/from16 v0, p0

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v8

    move v7, v10

    move-object v8, v11

    invoke-direct/range {v0 .. v8}, LY/t;->u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILa0/e;)LY/t;

    move-result-object v10

    :cond_a
    :goto_3
    return-object v10
.end method

.method private final I(IILY/f;)LY/t;
    .locals 2

    invoke-virtual {p3}, LZg/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p3, v0}, LY/f;->q(I)V

    invoke-direct {p0, p1}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, v0}, LY/f;->n(Ljava/lang/Object;)V

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LY/t;->c:La0/e;

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object p3, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {p3, p1}, LY/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    iget p1, p0, LY/t;->a:I

    xor-int/2addr p1, p2

    iput p1, p0, LY/t;->a:I

    return-object p0

    :cond_1
    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {v0, p1}, LY/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LY/t;

    iget v1, p0, LY/t;->a:I

    xor-int/2addr p2, v1

    iget v1, p0, LY/t;->b:I

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object p3

    invoke-direct {v0, p2, v1, p1, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object v0
.end method

.method private final J(IILa0/e;)LY/t;
    .locals 3

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, LY/t;->c:La0/e;

    if-ne v1, p3, :cond_1

    invoke-static {v0, p1}, LY/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    iget p1, p0, LY/t;->b:I

    xor-int/2addr p1, p2

    iput p1, p0, LY/t;->b:I

    return-object p0

    :cond_1
    invoke-static {v0, p1}, LY/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LY/t;

    iget v1, p0, LY/t;->a:I

    iget v2, p0, LY/t;->b:I

    xor-int/2addr p2, v2

    invoke-direct {v0, v1, p2, p1, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object v0
.end method

.method private final K(LY/t;LY/t;IILa0/e;)LY/t;
    .locals 0

    if-nez p2, :cond_0

    invoke-direct {p0, p3, p4, p5}, LY/t;->J(IILa0/e;)LY/t;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object p4, p0, LY/t;->c:La0/e;

    if-eq p4, p5, :cond_2

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, p0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-direct {p0, p3, p2, p5}, LY/t;->L(ILY/t;La0/e;)LY/t;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private final L(ILY/t;La0/e;)LY/t;
    .locals 3

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p2, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    iget v1, p2, LY/t;->b:I

    if-nez v1, :cond_0

    iget p1, p0, LY/t;->b:I

    iput p1, p2, LY/t;->a:I

    return-object p2

    :cond_0
    iget-object v1, p0, LY/t;->c:La0/e;

    if-ne v1, p3, :cond_1

    aput-object p2, v0, p1

    return-object p0

    :cond_1
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(this, size)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object p2, v0, p1

    new-instance p1, LY/t;

    iget p2, p0, LY/t;->a:I

    iget v1, p0, LY/t;->b:I

    invoke-direct {p1, p2, v1, v0, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object p1
.end method

.method private final M(ILjava/lang/Object;LY/f;)LY/t;
    .locals 2

    iget-object v0, p0, LY/t;->c:La0/e;

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object p3, p0, LY/t;->d:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aput-object p2, p3, p1

    return-object p0

    :cond_0
    invoke-virtual {p3}, LY/f;->h()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p3, v0}, LY/f;->k(I)V

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(this, size)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    aput-object p2, v0, p1

    new-instance p1, LY/t;

    iget p2, p0, LY/t;->a:I

    iget v1, p0, LY/t;->b:I

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object p3

    invoke-direct {p1, p2, v1, v0, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object p1
.end method

.method private final R(II)LY/t;
    .locals 3

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, p1}, LY/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LY/t;

    iget v1, p0, LY/t;->a:I

    xor-int/2addr p2, v1

    iget v1, p0, LY/t;->b:I

    invoke-direct {v0, p2, v1, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object v0
.end method

.method private final S(II)LY/t;
    .locals 3

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, p1}, LY/x;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LY/t;

    iget v1, p0, LY/t;->a:I

    iget v2, p0, LY/t;->b:I

    xor-int/2addr p2, v2

    invoke-direct {v0, v1, p2, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object v0
.end method

.method private final T(LY/t;LY/t;II)LY/t;
    .locals 0

    if-nez p2, :cond_0

    invoke-direct {p0, p3, p4}, LY/t;->S(II)LY/t;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eq p1, p2, :cond_1

    invoke-direct {p0, p3, p4, p2}, LY/t;->U(IILY/t;)LY/t;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method private final U(IILY/t;)LY/t;
    .locals 4

    iget-object v0, p3, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iget v1, p3, LY/t;->b:I

    if-nez v1, :cond_1

    iget-object v1, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget p1, p0, LY/t;->b:I

    iput p1, p3, LY/t;->a:I

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, LY/t;->n(I)I

    move-result p3

    iget-object v1, p0, LY/t;->d:[Ljava/lang/Object;

    const/4 v3, 0x0

    aget-object v3, v0, v3

    aget-object v0, v0, v2

    invoke-static {v1, p1, p3, v3, v0}, LY/x;->e([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p3, LY/t;

    iget v0, p0, LY/t;->a:I

    xor-int/2addr v0, p2

    iget v1, p0, LY/t;->b:I

    xor-int/2addr p2, v1

    invoke-direct {p3, v0, p2, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object p3

    :cond_1
    iget-object p2, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v0, "copyOf(this, newSize)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object p3, p2, p1

    new-instance p1, LY/t;

    iget p3, p0, LY/t;->a:I

    iget v0, p0, LY/t;->b:I

    invoke-direct {p1, p3, v0, p2}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object p1
.end method

.method private final V(ILjava/lang/Object;)LY/t;
    .locals 2

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(this, size)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    aput-object p2, v0, p1

    new-instance p1, LY/t;

    iget p2, p0, LY/t;->a:I

    iget v1, p0, LY/t;->b:I

    invoke-direct {p1, p2, v1, v0}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object p1
.end method

.method private final W(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public static final synthetic a()LY/t;
    .locals 1

    sget-object v0, LY/t;->g:LY/t;

    return-object v0
.end method

.method private final b()LY/t$b;
    .locals 2

    new-instance v0, LY/t$b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LY/t$b;-><init>(LY/t;I)V

    return-object v0
.end method

.method private final c()LY/t$b;
    .locals 2

    new-instance v0, LY/t$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LY/t$b;-><init>(LY/t;I)V

    return-object v0
.end method

.method private final d(IIILjava/lang/Object;Ljava/lang/Object;ILa0/e;)[Ljava/lang/Object;
    .locals 10

    move-object v9, p0

    invoke-direct {p0, p1}, LY/t;->t(I)Ljava/lang/Object;

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
    invoke-direct {p0, p1}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v7, p6, 0x5

    move-object v0, p0

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LY/t;->u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILa0/e;)LY/t;

    move-result-object v0

    move v1, p2

    invoke-virtual {p0, p2}, LY/t;->O(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, v9, LY/t;->d:[Ljava/lang/Object;

    move v3, p1

    invoke-static {v2, p1, v1, v0}, LY/x;->d([Ljava/lang/Object;IILY/t;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final e()I
    .locals 4

    iget v0, p0, LY/t;->b:I

    if-nez v0, :cond_0

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0

    :cond_0
    iget v0, p0, LY/t;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    iget-object v2, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v2, v2

    :goto_0
    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, LY/t;->N(I)LY/t;

    move-result-object v3

    invoke-direct {v3}, LY/t;->e()I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private final f(Ljava/lang/Object;)Z
    .locals 5

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v3

    invoke-virtual {v0}, Lsh/g;->k()I

    move-result v0

    if-lez v0, :cond_0

    if-le v2, v3, :cond_1

    :cond_0
    if-gez v0, :cond_3

    if-gt v3, v2, :cond_3

    :cond_1
    :goto_0
    iget-object v4, p0, LY/t;->d:[Ljava/lang/Object;

    aget-object v4, v4, v2

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    if-eq v2, v3, :cond_3

    add-int/2addr v2, v0

    goto :goto_0

    :cond_3
    return v1
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

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
    invoke-direct {p0, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v1}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    if-eq v1, v2, :cond_3

    add-int/2addr v1, v0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;)LY/t$b;
    .locals 5

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v3

    invoke-virtual {v0}, Lsh/g;->k()I

    move-result v0

    if-lez v0, :cond_0

    if-le v2, v3, :cond_1

    :cond_0
    if-gez v0, :cond_4

    if-gt v3, v2, :cond_4

    :cond_1
    :goto_0
    invoke-direct {p0, v2}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v2}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(this, size)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    aput-object p2, p1, v2

    new-instance p2, LY/t;

    invoke-direct {p2, v1, v1, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    invoke-direct {p2}, LY/t;->c()LY/t$b;

    move-result-object p1

    return-object p1

    :cond_3
    if-eq v2, v3, :cond_4

    add-int/2addr v2, v0

    goto :goto_0

    :cond_4
    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, LY/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p2, LY/t;

    invoke-direct {p2, v1, v1, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    invoke-direct {p2}, LY/t;->b()LY/t$b;

    move-result-object p1

    return-object p1
.end method

.method private final i(Ljava/lang/Object;)LY/t;
    .locals 4

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

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
    invoke-direct {p0, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v1}, LY/t;->j(I)LY/t;

    move-result-object p1

    return-object p1

    :cond_2
    if-eq v1, v2, :cond_3

    add-int/2addr v1, v0

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method private final j(I)LY/t;
    .locals 3

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, p1}, LY/x;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LY/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object v0
.end method

.method private final l(LY/t;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, LY/t;->b:I

    iget v2, p1, LY/t;->b:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    return v3

    :cond_1
    iget v1, p0, LY/t;->a:I

    iget v2, p1, LY/t;->a:I

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    iget-object v1, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v1, v1

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_4

    iget-object v4, p0, LY/t;->d:[Ljava/lang/Object;

    aget-object v4, v4, v2

    iget-object v5, p1, LY/t;->d:[Ljava/lang/Object;

    aget-object v5, v5, v2

    if-eq v4, v5, :cond_3

    return v3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method private final r(I)Z
    .locals 1

    iget v0, p0, LY/t;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final s(ILjava/lang/Object;Ljava/lang/Object;)LY/t;
    .locals 2

    invoke-virtual {p0, p1}, LY/t;->n(I)I

    move-result v0

    iget-object v1, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {v1, v0, p2, p3}, LY/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    new-instance p3, LY/t;

    iget v0, p0, LY/t;->a:I

    or-int/2addr p1, v0

    iget v0, p0, LY/t;->b:I

    invoke-direct {p3, p1, v0, p2}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object p3
.end method

.method private final t(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method private final u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILa0/e;)LY/t;
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

    new-instance v0, LY/t;

    filled-new-array {p2, v3, v5, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v10, v10, v1, v9}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object v0

    :cond_0
    move v1, p1

    invoke-static {p1, v0}, LY/x;->f(II)I

    move-result v11

    move/from16 v4, p4

    invoke-static {v4, v0}, LY/x;->f(II)I

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
    new-instance v0, LY/t;

    shl-int v1, v12, v11

    shl-int v2, v12, v7

    or-int/2addr v1, v2

    invoke-direct {v0, v1, v10, v4, v9}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

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

    invoke-direct/range {v0 .. v8}, LY/t;->u(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILa0/e;)LY/t;

    move-result-object v0

    new-instance v1, LY/t;

    shl-int v2, v12, v11

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v1, v10, v2, v0, v9}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object v1
.end method

.method private final v(IIILjava/lang/Object;Ljava/lang/Object;I)LY/t;
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, LY/t;->d(IIILjava/lang/Object;Ljava/lang/Object;ILa0/e;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p3, LY/t;

    iget p4, p0, LY/t;->a:I

    xor-int/2addr p4, p2

    iget p5, p0, LY/t;->b:I

    or-int/2addr p2, p5

    invoke-direct {p3, p4, p2, p1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    return-object p3
.end method

.method private final w(Ljava/lang/Object;Ljava/lang/Object;LY/f;)LY/t;
    .locals 5

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lsh/m;->r(Lsh/g;I)Lsh/g;

    move-result-object v0

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v3

    invoke-virtual {v0}, Lsh/g;->k()I

    move-result v0

    if-lez v0, :cond_0

    if-le v2, v3, :cond_1

    :cond_0
    if-gez v0, :cond_4

    if-gt v3, v2, :cond_4

    :cond_1
    :goto_0
    invoke-direct {p0, v2}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v2}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, p1}, LY/f;->n(Ljava/lang/Object;)V

    iget-object p1, p0, LY/t;->c:La0/e;

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object v0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    aput-object p2, p1, v2

    return-object p0

    :cond_2
    invoke-virtual {p3}, LY/f;->h()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p3, p1}, LY/f;->k(I)V

    iget-object p1, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(this, size)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    aput-object p2, p1, v2

    new-instance p2, LY/t;

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object p3

    invoke-direct {p2, v1, v1, p1, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object p2

    :cond_3
    if-eq v2, v3, :cond_4

    add-int/2addr v2, v0

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, LZg/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p3, v0}, LY/f;->q(I)V

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, LY/x;->a([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    new-instance p2, LY/t;

    invoke-virtual {p3}, LY/f;->j()La0/e;

    move-result-object p3

    invoke-direct {p2, v1, v1, p1, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    return-object p2
.end method

.method private final x(LY/t;La0/b;La0/e;)LY/t;
    .locals 11

    iget v0, p0, LY/t;->b:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, La0/a;->a(Z)V

    iget v0, p0, LY/t;->a:I

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-static {v0}, La0/a;->a(Z)V

    iget v0, p1, LY/t;->b:I

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    invoke-static {v0}, La0/a;->a(Z)V

    iget v0, p1, LY/t;->a:I

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    invoke-static {v0}, La0/a;->a(Z)V

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v3, v0

    iget-object v4, p1, LY/t;->d:[Ljava/lang/Object;

    array-length v4, v4

    add-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v3, "copyOf(this, newSize)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v4, v4

    iget-object v5, p1, LY/t;->d:[Ljava/lang/Object;

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
    iget-object v8, p1, LY/t;->d:[Ljava/lang/Object;

    aget-object v8, v8, v6

    invoke-direct {p0, v8}, LY/t;->f(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    iget-object v8, p1, LY/t;->d:[Ljava/lang/Object;

    aget-object v9, v8, v6

    aput-object v9, v0, v4

    add-int/lit8 v9, v4, 0x1

    add-int/lit8 v10, v6, 0x1

    aget-object v8, v8, v10

    aput-object v8, v0, v9

    add-int/lit8 v4, v4, 0x2

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, La0/b;->a()I

    move-result v8

    add-int/2addr v8, v1

    invoke-virtual {p2, v8}, La0/b;->c(I)V

    :goto_5
    if-eq v6, v7, :cond_7

    add-int/2addr v6, v5

    goto :goto_4

    :cond_7
    iget-object p2, p0, LY/t;->d:[Ljava/lang/Object;

    array-length p2, p2

    if-ne v4, p2, :cond_8

    move-object p1, p0

    goto :goto_6

    :cond_8
    iget-object p2, p1, LY/t;->d:[Ljava/lang/Object;

    array-length p2, p2

    if-ne v4, p2, :cond_9

    goto :goto_6

    :cond_9
    array-length p1, v0

    if-ne v4, p1, :cond_a

    new-instance p1, LY/t;

    invoke-direct {p1, v2, v2, v0, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    goto :goto_6

    :cond_a
    new-instance p1, LY/t;

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v2, v2, p2, p3}, LY/t;-><init>(II[Ljava/lang/Object;La0/e;)V

    :goto_6
    return-object p1
.end method

.method private final y(Ljava/lang/Object;LY/f;)LY/t;
    .locals 4

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

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
    invoke-direct {p0, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v1, p2}, LY/t;->A(ILY/f;)LY/t;

    move-result-object p1

    return-object p1

    :cond_2
    if-eq v1, v2, :cond_3

    add-int/2addr v1, v0

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method private final z(Ljava/lang/Object;Ljava/lang/Object;LY/f;)LY/t;
    .locals 4

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

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
    invoke-direct {p0, v1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v1}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0, v1, p3}, LY/t;->A(ILY/f;)LY/t;

    move-result-object p1

    return-object p1

    :cond_2
    if-eq v1, v2, :cond_3

    add-int/2addr v1, v0

    goto :goto_0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public final D(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;
    .locals 10

    invoke-static {p1, p4}, LY/x;->f(II)I

    move-result v0

    const/4 v1, 0x1

    shl-int v4, v1, v0

    invoke-virtual {p0, v4}, LY/t;->q(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v4}, LY/t;->n(I)I

    move-result v3

    invoke-direct {p0, v3}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v3}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p5, p1}, LY/f;->n(Ljava/lang/Object;)V

    invoke-direct {p0, v3}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p3, :cond_0

    return-object p0

    :cond_0
    invoke-direct {p0, v3, p3, p5}, LY/t;->M(ILjava/lang/Object;LY/f;)LY/t;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p5}, LZg/i;->size()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p5, v0}, LY/f;->q(I)V

    invoke-virtual {p5}, LY/f;->j()La0/e;

    move-result-object v9

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v9}, LY/t;->C(IIILjava/lang/Object;Ljava/lang/Object;ILa0/e;)LY/t;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, v4}, LY/t;->r(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v4}, LY/t;->O(I)I

    move-result v0

    invoke-virtual {p0, v0}, LY/t;->N(I)LY/t;

    move-result-object v7

    const/16 v1, 0x1e

    if-ne p4, v1, :cond_3

    invoke-direct {v7, p2, p3, p5}, LY/t;->w(Ljava/lang/Object;Ljava/lang/Object;LY/f;)LY/t;

    move-result-object p1

    goto :goto_0

    :cond_3
    add-int/lit8 v5, p4, 0x5

    move-object v1, v7

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LY/t;->D(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;

    move-result-object p1

    :goto_0
    if-ne v7, p1, :cond_4

    return-object p0

    :cond_4
    invoke-virtual {p5}, LY/f;->j()La0/e;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, LY/t;->L(ILY/t;La0/e;)LY/t;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p5}, LZg/i;->size()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p5, p1}, LY/f;->q(I)V

    invoke-virtual {p5}, LY/f;->j()La0/e;

    move-result-object p1

    invoke-direct {p0, v4, p2, p3, p1}, LY/t;->B(ILjava/lang/Object;Ljava/lang/Object;La0/e;)LY/t;

    move-result-object p1

    return-object p1
.end method

.method public final E(LY/t;ILa0/b;LY/f;)LY/t;
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    if-ne v6, v7, :cond_0

    invoke-direct/range {p0 .. p0}, LY/t;->e()I

    move-result v0

    invoke-virtual {v8, v0}, La0/b;->b(I)V

    return-object v6

    :cond_0
    const/16 v0, 0x1e

    move/from16 v9, p2

    if-le v9, v0, :cond_1

    invoke-virtual/range {p4 .. p4}, LY/f;->j()La0/e;

    move-result-object v0

    invoke-direct {v6, v7, v8, v0}, LY/t;->x(LY/t;La0/b;La0/e;)LY/t;

    move-result-object v0

    return-object v0

    :cond_1
    iget v0, v6, LY/t;->b:I

    iget v1, v7, LY/t;->b:I

    or-int/2addr v0, v1

    iget v1, v6, LY/t;->a:I

    iget v2, v7, LY/t;->a:I

    xor-int v3, v1, v2

    not-int v4, v0

    and-int/2addr v3, v4

    and-int/2addr v1, v2

    move v10, v3

    :goto_0
    if-eqz v1, :cond_3

    invoke-static {v1}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v2

    invoke-virtual {v6, v2}, LY/t;->n(I)I

    move-result v3

    invoke-direct {v6, v3}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v7, v2}, LY/t;->n(I)I

    move-result v4

    invoke-direct {v7, v4}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    or-int v3, v10, v2

    move v10, v3

    goto :goto_1

    :cond_2
    or-int/2addr v0, v2

    :goto_1
    xor-int/2addr v1, v2

    goto :goto_0

    :cond_3
    and-int v1, v0, v10

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-nez v1, :cond_4

    move v1, v12

    goto :goto_2

    :cond_4
    move v1, v11

    :goto_2
    if-nez v1, :cond_5

    const-string v1, "Check failed."

    invoke-static {v1}, LT/B0;->b(Ljava/lang/String;)V

    :cond_5
    iget-object v1, v6, LY/t;->c:La0/e;

    invoke-virtual/range {p4 .. p4}, LY/f;->j()La0/e;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget v1, v6, LY/t;->a:I

    if-ne v1, v10, :cond_6

    iget v1, v6, LY/t;->b:I

    if-ne v1, v0, :cond_6

    move-object v13, v6

    goto :goto_3

    :cond_6
    invoke-static {v10}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v2

    add-int/2addr v1, v2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, LY/t;

    invoke-direct {v2, v10, v0, v1}, LY/t;-><init>(II[Ljava/lang/Object;)V

    move-object v13, v2

    :goto_3
    move v14, v0

    move v15, v11

    :goto_4
    if-eqz v14, :cond_7

    invoke-static {v14}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v16

    iget-object v5, v13, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v5

    sub-int/2addr v0, v12

    sub-int v17, v0, v15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v16

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v18, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, LY/t;->F(LY/t;IILa0/b;LY/f;)LY/t;

    move-result-object v0

    aput-object v0, v18, v17

    add-int/2addr v15, v12

    xor-int v14, v14, v16

    goto :goto_4

    :cond_7
    :goto_5
    if-eqz v10, :cond_a

    invoke-static {v10}, Ljava/lang/Integer;->lowestOneBit(I)I

    move-result v0

    mul-int/lit8 v1, v11, 0x2

    invoke-virtual {v7, v0}, LY/t;->q(I)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v6, v0}, LY/t;->n(I)I

    move-result v2

    iget-object v3, v13, LY/t;->d:[Ljava/lang/Object;

    invoke-direct {v6, v2}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, v13, LY/t;->d:[Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v6, v2}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    goto :goto_6

    :cond_8
    invoke-virtual {v7, v0}, LY/t;->n(I)I

    move-result v2

    iget-object v3, v13, LY/t;->d:[Ljava/lang/Object;

    invoke-direct {v7, v2}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, v13, LY/t;->d:[Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v7, v2}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-virtual {v6, v0}, LY/t;->q(I)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual/range {p3 .. p3}, La0/b;->a()I

    move-result v1

    add-int/2addr v1, v12

    invoke-virtual {v8, v1}, La0/b;->c(I)V

    :cond_9
    :goto_6
    add-int/lit8 v11, v11, 0x1

    xor-int/2addr v10, v0

    goto :goto_5

    :cond_a
    invoke-direct {v6, v13}, LY/t;->l(LY/t;)Z

    move-result v0

    if-eqz v0, :cond_b

    move-object v13, v6

    goto :goto_7

    :cond_b
    invoke-direct {v7, v13}, LY/t;->l(LY/t;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object v13, v7

    :cond_c
    :goto_7
    return-object v13
.end method

.method public final G(ILjava/lang/Object;ILY/f;)LY/t;
    .locals 8

    const/4 v0, 0x1

    invoke-static {p1, p3}, LY/x;->f(II)I

    move-result v1

    shl-int v6, v0, v1

    invoke-virtual {p0, v6}, LY/t;->q(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v6}, LY/t;->n(I)I

    move-result p1

    invoke-direct {p0, p1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, v6, p4}, LY/t;->I(IILY/f;)LY/t;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    invoke-direct {p0, v6}, LY/t;->r(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v6}, LY/t;->O(I)I

    move-result v5

    invoke-virtual {p0, v5}, LY/t;->N(I)LY/t;

    move-result-object v3

    const/16 v0, 0x1e

    if-ne p3, v0, :cond_2

    invoke-direct {v3, p2, p4}, LY/t;->y(Ljava/lang/Object;LY/f;)LY/t;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_2
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v3, p1, p2, p3, p4}, LY/t;->G(ILjava/lang/Object;ILY/f;)LY/t;

    move-result-object p1

    goto :goto_0

    :goto_1
    invoke-virtual {p4}, LY/f;->j()La0/e;

    move-result-object v7

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, LY/t;->K(LY/t;LY/t;IILa0/e;)LY/t;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p0
.end method

.method public final H(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;
    .locals 11

    move-object v6, p0

    move-object v2, p2

    move-object v3, p3

    move v0, p4

    move-object/from16 v7, p5

    const/4 v1, 0x1

    move v4, p1

    invoke-static {p1, p4}, LY/x;->f(II)I

    move-result v5

    shl-int v8, v1, v5

    invoke-virtual {p0, v8}, LY/t;->q(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v8}, LY/t;->n(I)I

    move-result v0

    invoke-direct {p0, v0}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0, v8, v7}, LY/t;->I(IILY/f;)LY/t;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v6

    :cond_1
    invoke-direct {p0, v8}, LY/t;->r(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v8}, LY/t;->O(I)I

    move-result v9

    invoke-virtual {p0, v9}, LY/t;->N(I)LY/t;

    move-result-object v10

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_2

    invoke-direct {v10, p2, p3, v7}, LY/t;->z(Ljava/lang/Object;Ljava/lang/Object;LY/f;)LY/t;

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

    invoke-virtual/range {v0 .. v5}, LY/t;->H(ILjava/lang/Object;Ljava/lang/Object;ILY/f;)LY/t;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p5 .. p5}, LY/f;->j()La0/e;

    move-result-object v5

    move-object v0, p0

    move-object v1, v10

    move v3, v9

    move v4, v8

    invoke-direct/range {v0 .. v5}, LY/t;->K(LY/t;LY/t;IILa0/e;)LY/t;

    move-result-object v0

    return-object v0

    :cond_3
    return-object v6
.end method

.method public final N(I)LY/t;
    .locals 1

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LY/t;

    return-object p1
.end method

.method public final O(I)I
    .locals 2

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, LY/t;->b:I

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final P(ILjava/lang/Object;Ljava/lang/Object;I)LY/t$b;
    .locals 9

    const/4 v0, 0x1

    invoke-static {p1, p4}, LY/x;->f(II)I

    move-result v1

    shl-int v4, v0, v1

    invoke-virtual {p0, v4}, LY/t;->q(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v4}, LY/t;->n(I)I

    move-result v3

    invoke-direct {p0, v3}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v3}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p3, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, v3, p3}, LY/t;->V(ILjava/lang/Object;)LY/t;

    move-result-object p1

    invoke-direct {p1}, LY/t;->c()LY/t$b;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, LY/t;->v(IIILjava/lang/Object;Ljava/lang/Object;I)LY/t;

    move-result-object p1

    invoke-direct {p1}, LY/t;->b()LY/t$b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, v4}, LY/t;->r(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v4}, LY/t;->O(I)I

    move-result v0

    invoke-virtual {p0, v0}, LY/t;->N(I)LY/t;

    move-result-object v2

    const/16 v3, 0x1e

    if-ne p4, v3, :cond_3

    invoke-direct {v2, p2, p3}, LY/t;->h(Ljava/lang/Object;Ljava/lang/Object;)LY/t$b;

    move-result-object p1

    if-nez p1, :cond_4

    return-object v1

    :cond_3
    add-int/lit8 p4, p4, 0x5

    invoke-virtual {v2, p1, p2, p3, p4}, LY/t;->P(ILjava/lang/Object;Ljava/lang/Object;I)LY/t$b;

    move-result-object p1

    if-nez p1, :cond_4

    return-object v1

    :cond_4
    invoke-virtual {p1}, LY/t$b;->a()LY/t;

    move-result-object p2

    invoke-direct {p0, v0, v4, p2}, LY/t;->U(IILY/t;)LY/t;

    move-result-object p2

    invoke-virtual {p1, p2}, LY/t$b;->c(LY/t;)V

    return-object p1

    :cond_5
    invoke-direct {p0, v4, p2, p3}, LY/t;->s(ILjava/lang/Object;Ljava/lang/Object;)LY/t;

    move-result-object p1

    invoke-direct {p1}, LY/t;->b()LY/t$b;

    move-result-object p1

    return-object p1
.end method

.method public final Q(ILjava/lang/Object;I)LY/t;
    .locals 4

    const/4 v0, 0x1

    invoke-static {p1, p3}, LY/x;->f(II)I

    move-result v1

    shl-int/2addr v0, v1

    invoke-virtual {p0, v0}, LY/t;->q(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, LY/t;->n(I)I

    move-result p1

    invoke-direct {p0, p1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1, v0}, LY/t;->R(II)LY/t;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    invoke-direct {p0, v0}, LY/t;->r(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, LY/t;->O(I)I

    move-result v1

    invoke-virtual {p0, v1}, LY/t;->N(I)LY/t;

    move-result-object v2

    const/16 v3, 0x1e

    if-ne p3, v3, :cond_2

    invoke-direct {v2, p2}, LY/t;->i(Ljava/lang/Object;)LY/t;

    move-result-object p1

    goto :goto_0

    :cond_2
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v2, p1, p2, p3}, LY/t;->Q(ILjava/lang/Object;I)LY/t;

    move-result-object p1

    :goto_0
    invoke-direct {p0, v2, p1, v1, v0}, LY/t;->T(LY/t;LY/t;II)LY/t;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p0
.end method

.method public final k(ILjava/lang/Object;I)Z
    .locals 2

    const/4 v0, 0x1

    invoke-static {p1, p3}, LY/x;->f(II)I

    move-result v1

    shl-int/2addr v0, v1

    invoke-virtual {p0, v0}, LY/t;->q(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, LY/t;->n(I)I

    move-result p1

    invoke-direct {p0, p1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, v0}, LY/t;->r(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, LY/t;->O(I)I

    move-result v0

    invoke-virtual {p0, v0}, LY/t;->N(I)LY/t;

    move-result-object v0

    const/16 v1, 0x1e

    if-ne p3, v1, :cond_1

    invoke-direct {v0, p2}, LY/t;->f(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v0, p1, p2, p3}, LY/t;->k(ILjava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final m()I
    .locals 1

    iget v0, p0, LY/t;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    return v0
.end method

.method public final n(I)I
    .locals 1

    iget v0, p0, LY/t;->a:I

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public final o(ILjava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, p3}, LY/x;->f(II)I

    move-result v1

    shl-int/2addr v0, v1

    invoke-virtual {p0, v0}, LY/t;->q(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, LY/t;->n(I)I

    move-result p1

    invoke-direct {p0, p1}, LY/t;->t(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, LY/t;->W(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    invoke-direct {p0, v0}, LY/t;->r(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, LY/t;->O(I)I

    move-result v0

    invoke-virtual {p0, v0}, LY/t;->N(I)LY/t;

    move-result-object v0

    const/16 v1, 0x1e

    if-ne p3, v1, :cond_2

    invoke-direct {v0, p2}, LY/t;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    add-int/lit8 p3, p3, 0x5

    invoke-virtual {v0, p1, p2, p3}, LY/t;->o(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v2
.end method

.method public final p()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LY/t;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method public final q(I)Z
    .locals 1

    iget v0, p0, LY/t;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
