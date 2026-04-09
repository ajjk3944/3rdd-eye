.class final Lcom/google/android/gms/internal/measurement/zzjr$a;
.super Lcom/google/android/gms/internal/measurement/zzjr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzjr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final d:[B

.field private final e:I

.field private f:I


# direct methods
.method constructor <init>([BII)V
    .locals 2

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;-><init>(Lcom/google/android/gms/internal/measurement/m4;)V

    if-eqz p1, :cond_1

    array-length p2, p1

    sub-int/2addr p2, p3

    or-int/2addr p2, p3

    const/4 v0, 0x0

    if-ltz p2, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p1, v0, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p3, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"

    invoke-static {v1, p3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "buffer"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final A0([BII)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    invoke-direct {p2, v0, v1, p3, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(IIILjava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public final H(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    return-void

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzjr;->N(J)V

    return-void
.end method

.method public final K(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->H(I)V

    return-void
.end method

.method public final L(IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzjr;->N(J)V

    return-void
.end method

.method public final M(ILcom/google/android/gms/internal/measurement/V3;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->b0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->n(ILcom/google/android/gms/internal/measurement/V3;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    return-void
.end method

.method public final N(J)V
    .locals 10

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjr;->W()Z

    move-result v1

    const/4 v2, 0x7

    const-wide/16 v3, 0x0

    const-wide/16 v5, -0x80

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->b()I

    move-result v1

    const/16 v7, 0xa

    if-lt v1, v7, :cond_1

    :goto_0
    and-long v7, p1, v5

    cmp-long v1, v7, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    add-int/lit8 v2, v0, 0x1

    int-to-long v3, v0

    long-to-int p1, p1

    int-to-byte p1, p1

    invoke-static {v1, v3, v4, p1}, Lcom/google/android/gms/internal/measurement/N5;->m([BJB)V

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    add-int/lit8 v7, v0, 0x1

    int-to-long v8, v0

    long-to-int v0, p1

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-static {v1, v8, v9, v0}, Lcom/google/android/gms/internal/measurement/N5;->m([BJB)V

    ushr-long/2addr p1, v2

    move v0, v7

    goto :goto_0

    :cond_1
    :goto_1
    and-long v7, p1, v5

    cmp-long v1, v7, v3

    if-nez v1, :cond_2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v0, 0x1

    long-to-int p1, p1

    int-to-byte p1, p1

    :try_start_1
    aput-byte p1, v1, v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    move v0, v2

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_2
    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v7, v0, 0x1

    long-to-int v8, p1

    or-int/lit16 v8, v8, 0x80

    int-to-byte v8, v8

    :try_start_3
    aput-byte v8, v1, v0
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2

    ushr-long/2addr p1, v2

    move v0, v7

    goto :goto_1

    :catch_2
    move-exception p1

    move v0, v7

    :goto_3
    new-instance p2, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v2, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(IIILjava/lang/Throwable;)V

    throw p2
.end method

.method public final U(I)V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    :goto_0
    and-int/lit8 v1, p1, -0x80

    if-nez v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v0, 0x1

    int-to-byte p1, p1

    :try_start_1
    aput-byte p1, v1, v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    move v0, v2

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v2, v0, 0x1

    or-int/lit16 v3, p1, 0x80

    int-to-byte v3, v3

    :try_start_3
    aput-byte v3, v1, v0
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    ushr-int/lit8 p1, p1, 0x7

    move v0, v2

    goto :goto_0

    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(IIILjava/lang/Throwable;)V

    throw v1
.end method

.method public final V(II)V
    .locals 0

    shl-int/lit8 p1, p1, 0x3

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    return-void
.end method

.method public final a([BII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzjr$a;->A0([BII)V

    return-void
.end method

.method public final b()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final b0(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    return-void
.end method

.method public final j(B)V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v2, v0, 0x1

    :try_start_1
    aput-byte p1, v1, v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    move v0, v2

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(IIILjava/lang/Throwable;)V

    throw v1
.end method

.method public final k(I)V
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    const/4 v1, 0x4

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    int-to-byte v3, p1

    aput-byte v3, v2, v0

    add-int/lit8 v3, v0, 0x1

    shr-int/lit8 v4, p1, 0x8

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x2

    shr-int/lit8 v4, p1, 0x10

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x3

    shr-int/lit8 p1, p1, 0x18

    aput-byte p1, v2, v3
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    iget v3, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    invoke-direct {v2, v0, v3, v1, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(IIILjava/lang/Throwable;)V

    throw v2
.end method

.method public final l(II)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->k(I)V

    return-void
.end method

.method public final m(IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/measurement/zzjr;->s(J)V

    return-void
.end method

.method public final n(ILcom/google/android/gms/internal/measurement/V3;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->t(Lcom/google/android/gms/internal/measurement/V3;)V

    return-void
.end method

.method public final o(ILcom/google/android/gms/internal/measurement/h5;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->b0(II)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->u(Lcom/google/android/gms/internal/measurement/h5;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    return-void
.end method

.method final p(ILcom/google/android/gms/internal/measurement/h5;Lcom/google/android/gms/internal/measurement/x5;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/measurement/N3;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/measurement/N3;->a(Lcom/google/android/gms/internal/measurement/x5;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjr;->a:Lcom/google/android/gms/internal/measurement/o4;

    invoke-interface {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/x5;->d(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/d6;)V

    return-void
.end method

.method public final q(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/zzjr;->v(Ljava/lang/String;)V

    return-void
.end method

.method public final r(IZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->V(II)V

    int-to-byte p1, p2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjr;->j(B)V

    return-void
.end method

.method public final s(J)V
    .locals 6

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    const/16 v1, 0x8

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    long-to-int v3, p1

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v3, v0, 0x1

    shr-long v4, p1, v1

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x2

    const/16 v4, 0x10

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x3

    const/16 v4, 0x18

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x4

    const/16 v4, 0x20

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x5

    const/16 v4, 0x28

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x6

    const/16 v4, 0x30

    shr-long v4, p1, v4

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x7

    const/16 v4, 0x38

    shr-long/2addr p1, v4

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v2, v3
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->e:I

    invoke-direct {p2, v0, v2, v1, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(IIILjava/lang/Throwable;)V

    throw p2
.end method

.method public final t(Lcom/google/android/gms/internal/measurement/V3;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/V3;->S()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/V3;->F(Lcom/google/android/gms/internal/measurement/X3;)V

    return-void
.end method

.method public final u(Lcom/google/android/gms/internal/measurement/h5;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/h5;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/measurement/h5;->b(Lcom/google/android/gms/internal/measurement/zzjr;)V

    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzjr;->v0(I)I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzjr;->v0(I)I

    move-result v2

    if-ne v2, v1, :cond_0

    add-int v1, v0, v2

    iput v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->b()I

    move-result v4

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/measurement/R5;->b(Ljava/lang/String;[BII)I

    move-result v1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    sub-int v3, v1, v0

    sub-int/2addr v3, v2

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    iput v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/R5;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/zzjr;->U(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->d:[B

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjr;->b()I

    move-result v3

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/R5;->b(Ljava/lang/String;[BII)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/V5; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjr$zzb;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/zzjr$zzb;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzjr$a;->f:I

    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzjr;->w(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/V5;)V

    return-void
.end method
