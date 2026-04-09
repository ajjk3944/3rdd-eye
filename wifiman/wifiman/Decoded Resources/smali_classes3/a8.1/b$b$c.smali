.class public final La8/b$b$c;
.super La8/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:[B

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    const-string/jumbo v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La8/b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, La8/b$b$c;->a:[B

    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object p1

    const/4 v0, 0x0

    aget-byte p1, p1, v0

    invoke-static {p1}, LYg/A;->b(B)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    const/4 v0, 0x2

    ushr-int/2addr p1, v0

    iput p1, p0, La8/b$b$c;->b:I

    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object p1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    iput p1, p0, La8/b$b$c;->c:I

    return-void
.end method


# virtual methods
.method protected a()[B
    .locals 1

    iget-object v0, p0, La8/b$b$c;->a:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, La8/b$b$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object v0

    check-cast p1, La8/b$b$c;

    invoke-virtual {p1}, La8/b$b$c;->a()[B

    move-result-object v2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    return v3

    :cond_1
    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object v0

    aget-byte v0, v0, v3

    invoke-virtual {p1}, La8/b$b$c;->a()[B

    move-result-object v2

    aget-byte v2, v2, v3

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object v0

    const/4 v2, 0x2

    aget-byte v0, v0, v2

    invoke-virtual {p1}, La8/b$b$c;->a()[B

    move-result-object v4

    aget-byte v2, v4, v2

    if-eq v0, v2, :cond_3

    return v1

    :cond_3
    iget v0, p0, La8/b$b$c;->b:I

    iget v2, p1, La8/b$b$c;->b:I

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v2, 0x6

    if-le v0, v2, :cond_4

    return v1

    :cond_4
    iget v0, p0, La8/b$b$c;->c:I

    iget p1, p1, La8/b$b$c;->c:I

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-le p1, v2, :cond_5

    return v1

    :cond_5
    return v3
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object v0

    const/4 v1, 0x1

    aget-byte v0, v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, La8/b$b$c;->a()[B

    move-result-object v1

    const/4 v2, 0x2

    aget-byte v1, v1, v2

    add-int/2addr v0, v1

    return v0
.end method
