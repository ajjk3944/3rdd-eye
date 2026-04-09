.class public final Lo/F;
.super Lo/M;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lo/M;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lo/F;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Z
    .locals 3

    iget v0, p0, Lo/M;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lo/F;->i(I)V

    iget-object v0, p0, Lo/M;->a:[Ljava/lang/Object;

    iget v2, p0, Lo/M;->b:I

    aput-object p1, v0, v2

    add-int/2addr v2, v1

    iput v2, p0, Lo/M;->b:I

    return v1
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lo/M;->a:[Ljava/lang/Object;

    iget v1, p0, Lo/M;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, LZg/n;->v([Ljava/lang/Object;Ljava/lang/Object;II)V

    iput v3, p0, Lo/M;->b:I

    return-void
.end method

.method public final i(I)V
    .locals 2

    iget-object v0, p0, Lo/M;->a:[Ljava/lang/Object;

    array-length v1, v0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(this, newSize)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo/M;->a:[Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final j(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lo/M;->b(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lo/F;->k(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final k(I)Ljava/lang/Object;
    .locals 4

    if-ltz p1, :cond_1

    iget v0, p0, Lo/M;->b:I

    if-ge p1, v0, :cond_1

    iget-object v1, p0, Lo/M;->a:[Ljava/lang/Object;

    aget-object v2, v1, p1

    add-int/lit8 v3, v0, -0x1

    if-eq p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    invoke-static {v1, v1, p1, v3, v0}, LZg/n;->m([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :cond_0
    iget p1, p0, Lo/M;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lo/M;->b:I

    const/4 v0, 0x0

    aput-object v0, v1, p1

    return-object v2

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in 0.."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lo/M;->b:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
