.class public final Lcom/wireguard/crypto/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[I

.field private final b:[I

.field private final c:[I

.field private final d:[I

.field private final e:[I

.field private final f:[I

.field private final g:[I

.field private final h:[I

.field private final i:[I

.field private final j:[J

.field private final k:[I

.field private final l:[I

.field private final m:[I

.field private final n:[I

.field private final o:[I

.field private final p:[I


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->l:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->m:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->n:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->o:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->p:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->a:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->c:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->e:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->g:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->i:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->b:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->d:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lcom/wireguard/crypto/a;->h:[I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/wireguard/crypto/a;->f:[I

    const/16 v0, 0x14

    new-array v1, v0, [J

    iput-object v1, p0, Lcom/wireguard/crypto/a;->j:[J

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/wireguard/crypto/a;->k:[I

    return-void
.end method

.method private a([I[I[I)V
    .locals 4

    const/4 v0, 0x0

    aget v1, p2, v0

    aget v2, p3, v0

    add-int/2addr v1, v2

    const v2, 0x3ffffff

    and-int v3, v1, v2

    aput v3, p1, v0

    const/4 v0, 0x1

    :goto_0
    const/16 v3, 0xa

    if-ge v0, v3, :cond_0

    shr-int/lit8 v1, v1, 0x1a

    aget v3, p2, v0

    add-int/2addr v1, v3

    aget v3, p3, v0

    add-int/2addr v1, v3

    and-int v3, v1, v2

    aput v3, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/wireguard/crypto/a;->k([I)V

    return-void
.end method

.method private static b(I[I[I)V
    .locals 3

    neg-int p0, p0

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget v1, p1, v0

    aget v2, p2, v0

    xor-int/2addr v2, v1

    and-int/2addr v2, p0

    xor-int/2addr v1, v2

    aput v1, p1, v0

    aget v1, p2, v0

    xor-int/2addr v1, v2

    aput v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c()V
    .locals 4

    iget-object v0, p0, Lcom/wireguard/crypto/a;->l:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->m:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->n:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->o:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->p:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->c:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->e:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->g:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->i:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->b:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->d:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->h:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->f:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->j:[J

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    iget-object v0, p0, Lcom/wireguard/crypto/a;->k:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public static d([BI[B[B)V
    .locals 11

    new-instance v0, Lcom/wireguard/crypto/a;

    invoke-direct {v0}, Lcom/wireguard/crypto/a;-><init>()V

    :try_start_0
    iget-object v1, v0, Lcom/wireguard/crypto/a;->l:[I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/16 v1, 0x12

    const/16 v3, 0x20

    if-eqz p3, :cond_2

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_1

    mul-int/lit8 v5, v4, 0x8

    rem-int/lit8 v6, v5, 0x1a

    div-int/lit8 v5, v5, 0x1a

    aget-byte v7, p3, v4

    and-int/lit16 v7, v7, 0xff

    if-gt v6, v1, :cond_0

    iget-object v8, v0, Lcom/wireguard/crypto/a;->l:[I

    aget v9, v8, v5

    shl-int v6, v7, v6

    or-int/2addr v6, v9

    aput v6, v8, v5

    goto :goto_1

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_0
    iget-object v8, v0, Lcom/wireguard/crypto/a;->l:[I

    aget v9, v8, v5

    shl-int v10, v7, v6

    or-int/2addr v9, v10

    aput v9, v8, v5

    const v10, 0x3ffffff

    and-int/2addr v9, v10

    aput v9, v8, v5

    add-int/lit8 v5, v5, 0x1

    aget v9, v8, v5

    rsub-int/lit8 v6, v6, 0x1a

    shr-int v6, v7, v6

    or-int/2addr v6, v9

    aput v6, v8, v5

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object p3, v0, Lcom/wireguard/crypto/a;->l:[I

    invoke-direct {v0, p3}, Lcom/wireguard/crypto/a;->k([I)V

    iget-object p3, v0, Lcom/wireguard/crypto/a;->l:[I

    invoke-direct {v0, p3}, Lcom/wireguard/crypto/a;->k([I)V

    goto :goto_2

    :cond_2
    iget-object p3, v0, Lcom/wireguard/crypto/a;->l:[I

    const/16 v4, 0x9

    aput v4, p3, v2

    :goto_2
    iget-object p3, v0, Lcom/wireguard/crypto/a;->m:[I

    invoke-static {p3, v2}, Ljava/util/Arrays;->fill([II)V

    iget-object p3, v0, Lcom/wireguard/crypto/a;->m:[I

    const/4 v4, 0x1

    aput v4, p3, v2

    iget-object p3, v0, Lcom/wireguard/crypto/a;->o:[I

    invoke-static {p3, v2}, Ljava/util/Arrays;->fill([II)V

    iget-object p3, v0, Lcom/wireguard/crypto/a;->l:[I

    iget-object v5, v0, Lcom/wireguard/crypto/a;->n:[I

    array-length v6, p3

    invoke-static {p3, v2, v5, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p3, v0, Lcom/wireguard/crypto/a;->p:[I

    invoke-static {p3, v2}, Ljava/util/Arrays;->fill([II)V

    iget-object p3, v0, Lcom/wireguard/crypto/a;->p:[I

    aput v4, p3, v2

    invoke-direct {v0, p2}, Lcom/wireguard/crypto/a;->e([B)V

    iget-object p2, v0, Lcom/wireguard/crypto/a;->p:[I

    iget-object p3, v0, Lcom/wireguard/crypto/a;->o:[I

    invoke-direct {v0, p2, p3}, Lcom/wireguard/crypto/a;->i([I[I)V

    iget-object p2, v0, Lcom/wireguard/crypto/a;->m:[I

    iget-object p3, v0, Lcom/wireguard/crypto/a;->p:[I

    invoke-direct {v0, p2, p2, p3}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    :goto_3
    if-ge v2, v3, :cond_4

    mul-int/lit8 p2, v2, 0x8

    rem-int/lit8 p3, p2, 0x1a

    div-int/lit8 p2, p2, 0x1a

    if-gt p3, v1, :cond_3

    add-int v4, p1, v2

    iget-object v5, v0, Lcom/wireguard/crypto/a;->m:[I

    aget p2, v5, p2

    shr-int/2addr p2, p3

    int-to-byte p2, p2

    aput-byte p2, p0, v4

    goto :goto_4

    :cond_3
    add-int v4, p1, v2

    iget-object v5, v0, Lcom/wireguard/crypto/a;->m:[I

    aget v6, v5, p2

    shr-int/2addr v6, p3

    add-int/lit8 p2, p2, 0x1

    aget p2, v5, p2

    rsub-int/lit8 p3, p3, 0x1a

    shl-int/2addr p2, p3

    or-int/2addr p2, v6

    int-to-byte p2, p2

    aput-byte p2, p0, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    invoke-direct {v0}, Lcom/wireguard/crypto/a;->c()V

    return-void

    :goto_5
    invoke-direct {v0}, Lcom/wireguard/crypto/a;->c()V

    throw p0
.end method

.method private e([B)V
    .locals 9

    const/16 v0, 0x1f

    aget-byte v1, p1, v0

    or-int/lit8 v1, v1, 0x40

    const/4 v2, 0x6

    const/4 v3, 0x0

    :goto_0
    shr-int v4, v1, v2

    const/4 v5, 0x1

    and-int/2addr v4, v5

    xor-int/2addr v3, v4

    iget-object v6, p0, Lcom/wireguard/crypto/a;->m:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->n:[I

    invoke-static {v3, v6, v7}, Lcom/wireguard/crypto/a;->b(I[I[I)V

    iget-object v6, p0, Lcom/wireguard/crypto/a;->o:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->p:[I

    invoke-static {v3, v6, v7}, Lcom/wireguard/crypto/a;->b(I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->a:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->m:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->o:[I

    invoke-direct {p0, v3, v6, v7}, Lcom/wireguard/crypto/a;->a([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->b:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, v3, v6}, Lcom/wireguard/crypto/a;->l([I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->c:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->m:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->o:[I

    invoke-static {v3, v6, v7}, Lcom/wireguard/crypto/a;->m([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->d:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->c:[I

    invoke-direct {p0, v3, v6}, Lcom/wireguard/crypto/a;->l([I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->i:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->b:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->d:[I

    invoke-static {v3, v6, v7}, Lcom/wireguard/crypto/a;->m([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->e:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->n:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->p:[I

    invoke-direct {p0, v3, v6, v7}, Lcom/wireguard/crypto/a;->a([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->g:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->n:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->p:[I

    invoke-static {v3, v6, v7}, Lcom/wireguard/crypto/a;->m([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->h:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->g:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, v3, v6, v7}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->f:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->e:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->c:[I

    invoke-direct {p0, v3, v6, v7}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->n:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->h:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->f:[I

    invoke-direct {p0, v3, v6, v7}, Lcom/wireguard/crypto/a;->a([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->n:[I

    invoke-direct {p0, v3, v3}, Lcom/wireguard/crypto/a;->l([I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->p:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->h:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->f:[I

    invoke-static {v3, v6, v7}, Lcom/wireguard/crypto/a;->m([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->p:[I

    invoke-direct {p0, v3, v3}, Lcom/wireguard/crypto/a;->l([I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->p:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->l:[I

    invoke-direct {p0, v3, v3, v6}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->m:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->b:[I

    iget-object v7, p0, Lcom/wireguard/crypto/a;->d:[I

    invoke-direct {p0, v3, v6, v7}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->o:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->i:[I

    invoke-direct {p0, v3, v6}, Lcom/wireguard/crypto/a;->g([I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->o:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->b:[I

    invoke-direct {p0, v3, v3, v6}, Lcom/wireguard/crypto/a;->a([I[I[I)V

    iget-object v3, p0, Lcom/wireguard/crypto/a;->o:[I

    iget-object v6, p0, Lcom/wireguard/crypto/a;->i:[I

    invoke-direct {p0, v3, v3, v6}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    if-lez v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_0
    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/wireguard/crypto/a;->m:[I

    iget-object v0, p0, Lcom/wireguard/crypto/a;->n:[I

    invoke-static {v4, p1, v0}, Lcom/wireguard/crypto/a;->b(I[I[I)V

    iget-object p1, p0, Lcom/wireguard/crypto/a;->o:[I

    iget-object v0, p0, Lcom/wireguard/crypto/a;->p:[I

    invoke-static {v4, p1, v0}, Lcom/wireguard/crypto/a;->b(I[I[I)V

    return-void

    :cond_1
    const/4 v1, 0x7

    if-ne v0, v5, :cond_2

    add-int/lit8 v0, v0, -0x1

    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xf8

    :goto_1
    move v8, v2

    move v2, v1

    move v1, v8

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, -0x1

    aget-byte v2, p1, v0

    goto :goto_1

    :goto_2
    move v3, v4

    goto/16 :goto_0
.end method

.method private f([I[I[I)V
    .locals 14

    move-object v0, p0

    const/4 v1, 0x0

    aget v2, p2, v1

    int-to-long v2, v2

    move v4, v1

    :goto_0
    const/16 v5, 0xa

    if-ge v4, v5, :cond_0

    iget-object v5, v0, Lcom/wireguard/crypto/a;->j:[J

    aget v6, p3, v4

    int-to-long v6, v6

    mul-long/2addr v6, v2

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    move v3, v2

    :goto_1
    if-ge v3, v5, :cond_2

    aget v4, p2, v3

    int-to-long v6, v4

    move v4, v1

    :goto_2
    const/16 v8, 0x9

    if-ge v4, v8, :cond_1

    iget-object v8, v0, Lcom/wireguard/crypto/a;->j:[J

    add-int v9, v3, v4

    aget-wide v10, v8, v9

    aget v12, p3, v4

    int-to-long v12, v12

    mul-long/2addr v12, v6

    add-long/2addr v10, v12

    aput-wide v10, v8, v9

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    iget-object v4, v0, Lcom/wireguard/crypto/a;->j:[J

    add-int/lit8 v9, v3, 0x9

    aget v8, p3, v8

    int-to-long v10, v8

    mul-long/2addr v6, v10

    aput-wide v6, v4, v9

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    iget-object v3, v0, Lcom/wireguard/crypto/a;->j:[J

    aget-wide v6, v3, v1

    iget-object v3, v0, Lcom/wireguard/crypto/a;->k:[I

    long-to-int v4, v6

    const v8, 0x3ffffff

    and-int/2addr v4, v8

    aput v4, v3, v1

    :goto_3
    const/16 v1, 0x14

    if-ge v2, v1, :cond_3

    const/16 v1, 0x1a

    shr-long v3, v6, v1

    iget-object v1, v0, Lcom/wireguard/crypto/a;->j:[J

    aget-wide v6, v1, v2

    add-long/2addr v6, v3

    iget-object v1, v0, Lcom/wireguard/crypto/a;->k:[I

    long-to-int v3, v6

    and-int/2addr v3, v8

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    iget-object v1, v0, Lcom/wireguard/crypto/a;->k:[I

    move-object v2, p1

    invoke-direct {p0, p1, v1, v5}, Lcom/wireguard/crypto/a;->j([I[II)V

    return-void
.end method

.method private g([I[I)V
    .locals 8

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const v3, 0x3ffffff

    const/16 v4, 0xa

    if-ge v2, v4, :cond_0

    aget v4, p2, v2

    int-to-long v4, v4

    const-wide/32 v6, 0x1db41

    mul-long/2addr v4, v6

    add-long/2addr v0, v4

    iget-object v4, p0, Lcom/wireguard/crypto/a;->k:[I

    long-to-int v5, v0

    and-int/2addr v3, v5

    aput v3, v4, v2

    const/16 v3, 0x1a

    shr-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/wireguard/crypto/a;->k:[I

    long-to-int v0, v0

    and-int/2addr v0, v3

    aput v0, p2, v4

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/wireguard/crypto/a;->j([I[II)V

    return-void
.end method

.method private h([I[I)V
    .locals 3

    iget-object v0, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, v0, p2}, Lcom/wireguard/crypto/a;->l([I[I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x9

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, v2, v2}, Lcom/wireguard/crypto/a;->l([I[I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, p1, v1, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    move p2, v0

    :goto_1
    const/16 v1, 0x17

    if-ge p2, v1, :cond_2

    move v1, v0

    :goto_2
    const/16 v2, 0xa

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, v2, v2}, Lcom/wireguard/crypto/a;->l([I[I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, p1, p1, v1}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, p2, p1}, Lcom/wireguard/crypto/a;->l([I[I)V

    iget-object p2, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, p1, p1, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    :goto_3
    const/16 p2, 0x8

    if-ge v0, p2, :cond_3

    iget-object p2, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, p2, p2}, Lcom/wireguard/crypto/a;->l([I[I)V

    iget-object p2, p0, Lcom/wireguard/crypto/a;->a:[I

    invoke-direct {p0, p1, p1, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method

.method private i([I[I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/wireguard/crypto/a;->h([I[I)V

    invoke-direct {p0, p1, p1}, Lcom/wireguard/crypto/a;->l([I[I)V

    invoke-direct {p0, p1, p1}, Lcom/wireguard/crypto/a;->l([I[I)V

    invoke-direct {p0, p1, p1, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    invoke-direct {p0, p1, p1}, Lcom/wireguard/crypto/a;->l([I[I)V

    invoke-direct {p0, p1, p1}, Lcom/wireguard/crypto/a;->l([I[I)V

    invoke-direct {p0, p1, p1, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    invoke-direct {p0, p1, p1}, Lcom/wireguard/crypto/a;->l([I[I)V

    invoke-direct {p0, p1, p1, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    return-void
.end method

.method private j([I[II)V
    .locals 9

    const/16 v0, 0x9

    aget v1, p2, v0

    shr-int/lit8 v2, v1, 0x15

    const v3, 0x1fffff

    and-int/2addr v1, v3

    aput v1, p2, v0

    const/4 v1, 0x0

    move v4, v1

    move v5, v4

    :goto_0
    const v6, 0x3ffffff

    if-ge v4, p3, :cond_0

    add-int/lit8 v7, v4, 0xa

    aget v7, p2, v7

    shl-int/lit8 v7, v7, 0x5

    add-int/2addr v2, v7

    and-int v7, v2, v6

    mul-int/lit8 v7, v7, 0x13

    aget v8, p2, v4

    add-int/2addr v7, v8

    add-int/2addr v5, v7

    and-int/2addr v6, v5

    aput v6, p2, v4

    shr-int/lit8 v2, v2, 0x1a

    shr-int/lit8 v5, v5, 0x1a

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/16 v2, 0xa

    if-ge p3, v2, :cond_1

    :goto_1
    if-ge p3, v2, :cond_1

    aget v4, p2, p3

    add-int/2addr v5, v4

    and-int v4, v5, v6

    aput v4, p2, p3

    shr-int/lit8 v5, v5, 0x1a

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_1
    aget p3, p2, v0

    shr-int/lit8 v4, p3, 0x15

    mul-int/lit8 v4, v4, 0x13

    and-int/2addr p3, v3

    aput p3, p2, v0

    :goto_2
    if-ge v1, v2, :cond_2

    aget p3, p2, v1

    add-int/2addr v4, p3

    and-int p3, v4, v6

    aput p3, p1, v1

    shr-int/lit8 v4, v4, 0x1a

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    invoke-direct {p0, p1}, Lcom/wireguard/crypto/a;->k([I)V

    return-void
.end method

.method private k([I)V
    .locals 8

    const/16 v0, 0x13

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0xa

    if-ge v2, v3, :cond_0

    aget v3, p1, v2

    add-int/2addr v0, v3

    iget-object v3, p0, Lcom/wireguard/crypto/a;->k:[I

    const v4, 0x3ffffff

    and-int/2addr v4, v0

    aput v4, v3, v2

    shr-int/lit8 v0, v0, 0x1a

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/wireguard/crypto/a;->k:[I

    const/16 v2, 0x9

    aget v4, v0, v2

    shr-int/lit8 v5, v4, 0x15

    and-int/lit8 v5, v5, 0x1

    neg-int v5, v5

    not-int v6, v5

    const v7, 0x1fffff

    and-int/2addr v4, v7

    aput v4, v0, v2

    :goto_1
    if-ge v1, v3, :cond_1

    aget v0, p1, v1

    and-int/2addr v0, v6

    iget-object v2, p0, Lcom/wireguard/crypto/a;->k:[I

    aget v2, v2, v1

    and-int/2addr v2, v5

    or-int/2addr v0, v2

    aput v0, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private l([I[I)V
    .locals 0

    invoke-direct {p0, p1, p2, p2}, Lcom/wireguard/crypto/a;->f([I[I[I)V

    return-void
.end method

.method private static m([I[I[I)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0xa

    const v4, 0x3ffffff

    const/4 v5, 0x1

    if-ge v1, v3, :cond_0

    aget v3, p1, v1

    aget v6, p2, v1

    sub-int/2addr v3, v6

    shr-int/lit8 v2, v2, 0x1a

    and-int/2addr v2, v5

    sub-int v2, v3, v2

    and-int v3, v2, v4

    aput v3, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    aget p1, p0, v0

    shr-int/lit8 p2, v2, 0x1a

    and-int/2addr p2, v5

    neg-int p2, p2

    and-int/lit8 p2, p2, 0x13

    sub-int/2addr p1, p2

    and-int p2, p1, v4

    aput p2, p0, v0

    move p2, v5

    :goto_1
    if-ge p2, v3, :cond_1

    aget v0, p0, p2

    shr-int/lit8 p1, p1, 0x1a

    and-int/2addr p1, v5

    sub-int p1, v0, p1

    and-int v0, p1, v4

    aput v0, p0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    const/16 p1, 0x9

    aget p2, p0, p1

    const v0, 0x1fffff

    and-int/2addr p2, v0

    aput p2, p0, p1

    return-void
.end method
