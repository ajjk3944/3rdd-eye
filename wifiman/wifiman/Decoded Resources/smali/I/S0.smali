.class public final LI/S0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[I

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    invoke-static {v0}, LI/T0;->a(I)[I

    move-result-object v0

    iput-object v0, p0, LI/S0;->a:[I

    return-void
.end method

.method private final a(IZ)J
    .locals 12

    iget-object v0, p0, LI/S0;->a:[I

    iget v1, p0, LI/S0;->b:I

    if-ltz v1, :cond_3

    if-nez p2, :cond_1

    add-int/lit8 v1, v1, -0x1

    move v3, p1

    :goto_0
    const/4 v2, -0x1

    if-ge v2, v1, :cond_0

    mul-int/lit8 v2, v1, 0x3

    aget v8, v0, v2

    add-int/lit8 v4, v2, 0x1

    aget v9, v0, v4

    add-int/lit8 v2, v2, 0x2

    aget v10, v0, v2

    move-object v2, p0

    move v4, v8

    move v5, v9

    move v6, v10

    move v7, p2

    invoke-direct/range {v2 .. v7}, LI/S0;->d(IIIIZ)J

    move-result-wide v2

    move-object v4, p0

    move v5, p1

    move v6, v8

    move v7, v9

    move v8, v10

    move v9, p2

    invoke-direct/range {v4 .. v9}, LI/S0;->d(IIIIZ)J

    move-result-wide v4

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p1

    invoke-static {v4, v5}, LL0/S;->n(J)I

    move-result v6

    invoke-static {p1, v6}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v2

    invoke-static {v4, v5}, LL0/S;->i(J)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v1, v1, -0x1

    move v3, p1

    move p1, v2

    goto :goto_0

    :cond_0
    move p2, p1

    move p1, v3

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    move v4, p1

    :goto_1
    if-ge v2, v1, :cond_2

    mul-int/lit8 v3, v2, 0x3

    aget v9, v0, v3

    add-int/lit8 v5, v3, 0x1

    aget v10, v0, v5

    add-int/lit8 v3, v3, 0x2

    aget v11, v0, v3

    move-object v3, p0

    move v5, v9

    move v6, v10

    move v7, v11

    move v8, p2

    invoke-direct/range {v3 .. v8}, LI/S0;->d(IIIIZ)J

    move-result-wide v3

    move-object v5, p0

    move v6, p1

    move v7, v9

    move v8, v10

    move v9, v11

    move v10, p2

    invoke-direct/range {v5 .. v10}, LI/S0;->d(IIIIZ)J

    move-result-wide v5

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result p1

    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v7

    invoke-static {p1, v7}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v3, v4}, LL0/S;->i(J)I

    move-result v3

    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    move v4, p1

    move p1, v3

    goto :goto_1

    :cond_2
    move p2, p1

    move p1, v4

    goto :goto_2

    :cond_3
    move p2, p1

    :goto_2
    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide p1

    return-wide p1
.end method

.method private final d(IIIIZ)J
    .locals 1

    if-eqz p5, :cond_0

    move v0, p3

    goto :goto_0

    :cond_0
    move v0, p4

    :goto_0
    if-eqz p5, :cond_1

    move p3, p4

    :cond_1
    if-ge p1, p2, :cond_2

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide p1

    goto :goto_1

    :cond_2
    if-ne p1, p2, :cond_4

    if-nez v0, :cond_3

    add-int/2addr p3, p2

    invoke-static {p2, p3}, LL0/T;->b(II)J

    move-result-wide p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, LL0/T;->a(I)J

    move-result-wide p1

    goto :goto_1

    :cond_4
    add-int p4, p2, v0

    if-ge p1, p4, :cond_6

    if-nez p3, :cond_5

    invoke-static {p2}, LL0/T;->a(I)J

    move-result-wide p1

    goto :goto_1

    :cond_5
    add-int/2addr p3, p2

    invoke-static {p2, p3}, LL0/T;->b(II)J

    move-result-wide p1

    goto :goto_1

    :cond_6
    sub-int/2addr p1, v0

    add-int/2addr p1, p3

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide p1

    :goto_1
    return-wide p1
.end method


# virtual methods
.method public final b(I)J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LI/S0;->a(IZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(I)J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LI/S0;->a(IZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(III)V
    .locals 4

    if-ltz p3, :cond_2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    sub-int/2addr p2, p1

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
    iget v1, p0, LI/S0;->b:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, LI/S0;->a:[I

    invoke-static {v2}, LI/T0;->d([I)I

    move-result v2

    if-le v1, v2, :cond_1

    mul-int/lit8 v2, v1, 0x2

    iget-object v3, p0, LI/S0;->a:[I

    invoke-static {v3}, LI/T0;->d([I)I

    move-result v3

    mul-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v2, p0, LI/S0;->a:[I

    invoke-static {v2, v0}, LI/T0;->c([II)[I

    move-result-object v0

    iput-object v0, p0, LI/S0;->a:[I

    :cond_1
    iget-object v0, p0, LI/S0;->a:[I

    iget v2, p0, LI/S0;->b:I

    invoke-static {v0, v2, p1, p2, p3}, LI/T0;->e([IIIII)V

    iput v1, p0, LI/S0;->b:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected newLen to be \u2265 0, was "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
