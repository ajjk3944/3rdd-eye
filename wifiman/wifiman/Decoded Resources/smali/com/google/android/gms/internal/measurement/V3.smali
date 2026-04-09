.class public abstract Lcom/google/android/gms/internal/measurement/V3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Iterable;


# static fields
.field public static final b:Lcom/google/android/gms/internal/measurement/V3;

.field private static final c:Lcom/google/android/gms/internal/measurement/d4;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/h4;

    sget-object v1, Lcom/google/android/gms/internal/measurement/F4;->b:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/h4;-><init>([B)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/V3;->b:Lcom/google/android/gms/internal/measurement/V3;

    new-instance v0, Lcom/google/android/gms/internal/measurement/g4;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g4;-><init>(Lcom/google/android/gms/internal/measurement/j4;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/V3;->c:Lcom/google/android/gms/internal/measurement/d4;

    new-instance v0, Lcom/google/android/gms/internal/measurement/Y3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/Y3;-><init>()V

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/V3;->a:I

    return-void
.end method

.method public static C([BII)Lcom/google/android/gms/internal/measurement/V3;
    .locals 2

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/V3;->o(III)I

    new-instance v0, Lcom/google/android/gms/internal/measurement/h4;

    sget-object v1, Lcom/google/android/gms/internal/measurement/V3;->c:Lcom/google/android/gms/internal/measurement/d4;

    invoke-interface {v1, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/d4;->a([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/h4;-><init>([B)V

    return-object v0
.end method

.method static b0(I)Lcom/google/android/gms/internal/measurement/f4;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/f4;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/measurement/f4;-><init>(ILcom/google/android/gms/internal/measurement/j4;)V

    return-object v0
.end method

.method static synthetic m(B)I
    .locals 0

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method static o(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Beginning index larger than ending index: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "End index: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Beginning index: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " < 0"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method

.method public static v(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/V3;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/h4;

    sget-object v1, Lcom/google/android/gms/internal/measurement/F4;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/h4;-><init>([B)V

    return-object v0
.end method

.method public static y([B)Lcom/google/android/gms/internal/measurement/V3;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/V3;->C([BII)Lcom/google/android/gms/internal/measurement/V3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method abstract F(Lcom/google/android/gms/internal/measurement/X3;)V
.end method

.method abstract J(I)B
.end method

.method public abstract S()I
.end method

.method protected abstract T(III)I
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract g(I)B
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/V3;->a:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/V3;->S()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lcom/google/android/gms/internal/measurement/V3;->T(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lcom/google/android/gms/internal/measurement/V3;->a:I

    :cond_1
    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/Z3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/Z3;-><init>(Lcom/google/android/gms/internal/measurement/V3;)V

    return-object v0
.end method

.method protected final j()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/V3;->a:I

    return v0
.end method

.method public abstract s(II)Lcom/google/android/gms/internal/measurement/V3;
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/V3;->S()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/V3;->S()I

    move-result v3

    const/16 v4, 0x32

    if-gt v3, v4, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/I5;->a(Lcom/google/android/gms/internal/measurement/V3;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/16 v4, 0x2f

    invoke-virtual {p0, v3, v4}, Lcom/google/android/gms/internal/measurement/V3;->s(II)Lcom/google/android/gms/internal/measurement/V3;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/I5;->a(Lcom/google/android/gms/internal/measurement/V3;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "..."

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "<ByteString@%s size=%d contents=\"%s\">"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
