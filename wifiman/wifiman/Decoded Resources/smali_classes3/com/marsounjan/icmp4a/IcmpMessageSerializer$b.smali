.class public final Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/IcmpMessageSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:B

.field private final b:B

.field private final c:S

.field private final d:Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>(BBSLjava/nio/ByteBuffer;)V
    .locals 1

    const-string/jumbo v0, "typeSpecificHeaderPart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-byte p1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a:B

    .line 4
    iput-byte p2, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b:B

    .line 5
    iput-short p3, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c:S

    .line 6
    iput-object p4, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->d:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public synthetic constructor <init>(BBSLjava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;-><init>(BBSLjava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 1

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b:B

    return v0
.end method

.method public final b()B
    .locals 1

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a:B

    return v0
.end method

.method public final c()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->d:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;

    iget-byte v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a:B

    iget-byte v3, p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a:B

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b:B

    iget-byte v3, p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-short v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c:S

    iget-short v3, p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c:S

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->d:Ljava/nio/ByteBuffer;

    iget-object p1, p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->d:Ljava/nio/ByteBuffer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a:B

    invoke-static {v0}, LYg/A;->d(B)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b:B

    invoke-static {v1}, LYg/A;->d(B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "MessageHeader(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a:B

    invoke-static {v1}, LYg/A;->g(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b:B

    invoke-static {v1}, LYg/A;->g(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", checksum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", typeSpecificHeaderPart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
