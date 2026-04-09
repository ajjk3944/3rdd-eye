.class public final Lcom/ui/binme/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/binme/BinaryMessage$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/binme/a$a;
    }
.end annotation


# instance fields
.field private final b:Lcom/ui/binme/compress/Compressor;

.field private final c:I

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/ui/binme/compress/Compressor;)V
    .locals 7

    const-string/jumbo v0, "compressor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/binme/a;->b:Lcom/ui/binme/compress/Compressor;

    const/16 p1, 0x8

    iput p1, p0, Lcom/ui/binme/a;->c:I

    invoke-static {}, Lcom/ui/binme/BinaryMessage$f;->values()[Lcom/ui/binme/BinaryMessage$f;

    move-result-object p1

    array-length v0, p1

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_0

    aget-object v5, p1, v4

    invoke-virtual {v5}, Lcom/ui/binme/BinaryMessage$f;->getId$binme_release()B

    move-result v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lcom/ui/binme/a;->d:Ljava/util/Map;

    invoke-static {}, Lcom/ui/binme/BinaryMessage$c;->values()[Lcom/ui/binme/BinaryMessage$c;

    move-result-object p1

    array-length v0, p1

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, p1

    move v4, v3

    :goto_1
    if-ge v4, v0, :cond_1

    aget-object v5, p1, v4

    invoke-virtual {v5}, Lcom/ui/binme/BinaryMessage$c;->getId$binme_release()B

    move-result v6

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iput-object v2, p0, Lcom/ui/binme/a;->e:Ljava/util/Map;

    invoke-static {}, Lcom/ui/binme/BinaryMessage$b;->values()[Lcom/ui/binme/BinaryMessage$b;

    move-result-object p1

    array-length v0, p1

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v0, p1

    :goto_2
    if-ge v3, v0, :cond_2

    aget-object v2, p1, v3

    invoke-virtual {v2}, Lcom/ui/binme/BinaryMessage$b;->getId$binme_release()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    iput-object v1, p0, Lcom/ui/binme/a;->f:Ljava/util/Map;

    return-void
.end method

.method private final c(Lcom/ui/binme/BinaryMessage$d;)[B
    .locals 4

    :try_start_0
    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->a()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v0

    sget-object v1, Lcom/ui/binme/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ui/binme/a;->b:Lcom/ui/binme/compress/Compressor;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->b()[B

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ui/binme/compress/Compressor;->b([B)[B

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->b()[B

    move-result-object p1
    :try_end_0
    .catch Lcom/ui/binme/compress/Compressor$CompressionError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :goto_1
    new-instance v1, Lcom/ui/binme/BinaryMessage$Error$Compression;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->d()Lcom/ui/binme/BinaryMessage$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$f;->getId$binme_release()B

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Binary message (fragment type: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\') content compression failed"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/ui/binme/BinaryMessage$Error$Compression;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private final d(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$b;
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    iget-object v0, p0, Lcom/ui/binme/a;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/binme/BinaryMessage$b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown Message compression "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    const-string/jumbo v1, "Message compression couldn\'t be parsed"

    invoke-direct {v0, v1, p1}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final e(Ljava/nio/ByteBuffer;)[B
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v1, [B

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    new-instance v1, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Message content couldn\'t be parsed (length "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private final f(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$c;
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    iget-object v0, p0, Lcom/ui/binme/a;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/binme/BinaryMessage$c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown Message format "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    const-string/jumbo v1, "Message format couldn\'t be parsed"

    invoke-direct {v0, v1, p1}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final g(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$f;
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    iget-object v0, p0, Lcom/ui/binme/a;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/binme/BinaryMessage$f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown Message type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    const-string/jumbo v1, "Message type couldn\'t be parsed"

    invoke-direct {v0, v1, p1}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final h(Ljava/nio/ByteBuffer;Lmh/q;)Lcom/ui/binme/BinaryMessage$d;
    .locals 4

    invoke-direct {p0, p1}, Lcom/ui/binme/a;->f(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$c;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/ui/binme/a;->d(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$b;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/ui/binme/a;->i(Ljava/nio/ByteBuffer;)V

    invoke-direct {p0, p1}, Lcom/ui/binme/a;->e(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    :try_start_0
    sget-object v2, Lcom/ui/binme/a$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/ui/binme/a;->b:Lcom/ui/binme/compress/Compressor;

    invoke-interface {v2, p1}, Lcom/ui/binme/compress/Compressor;->a([B)[B

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_0
    .catch Lcom/ui/binme/compress/Compressor$CompressionError; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    invoke-interface {p2, v0, v1, p1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/binme/BinaryMessage$d;

    return-object p1

    :goto_1
    new-instance p2, Lcom/ui/binme/BinaryMessage$Error$Compression;

    const-string v0, "Binary message content decompression failed"

    invoke-direct {p2, v0, p1}, Lcom/ui/binme/BinaryMessage$Error$Compression;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private final i(Ljava/nio/ByteBuffer;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    const-string/jumbo v1, "Message doesn\'t contain reserved byte"

    invoke-direct {v0, v1, p1}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a(Lcom/ui/binme/BinaryMessage;)[B
    .locals 5

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->b()Lcom/ui/binme/BinaryMessage$d$b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ui/binme/a;->c(Lcom/ui/binme/BinaryMessage$d;)[B

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->a()Lcom/ui/binme/BinaryMessage$d$a;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ui/binme/a;->c(Lcom/ui/binme/BinaryMessage$d;)[B

    move-result-object v1

    iget v2, p0, Lcom/ui/binme/a;->c:I

    array-length v3, v0

    add-int/2addr v3, v2

    add-int/2addr v3, v2

    array-length v2, v1

    add-int/2addr v3, v2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Lcom/ui/binme/BinaryMessage;->c:Lcom/ui/binme/BinaryMessage$a;

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$a;->a()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->b()Lcom/ui/binme/BinaryMessage$d$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$d$b;->d()Lcom/ui/binme/BinaryMessage$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$f;->getId$binme_release()B

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->b()Lcom/ui/binme/BinaryMessage$d$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$d$b;->c()Lcom/ui/binme/BinaryMessage$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$c;->getId$binme_release()B

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->b()Lcom/ui/binme/BinaryMessage$d$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$d$b;->a()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/binme/BinaryMessage$b;->getId$binme_release()B

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    array-length v4, v0

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->a()Lcom/ui/binme/BinaryMessage$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/binme/BinaryMessage$d$a;->d()Lcom/ui/binme/BinaryMessage$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/binme/BinaryMessage$f;->getId$binme_release()B

    move-result v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->a()Lcom/ui/binme/BinaryMessage$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/binme/BinaryMessage$d$a;->c()Lcom/ui/binme/BinaryMessage$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/binme/BinaryMessage$c;->getId$binme_release()B

    move-result v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage;->a()Lcom/ui/binme/BinaryMessage$d$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d$a;->a()Lcom/ui/binme/BinaryMessage$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$b;->getId$binme_release()B

    move-result p1

    invoke-virtual {v2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    array-length p1, v1

    invoke-virtual {v2, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string/jumbo v0, "buffer.array()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b([B)Lcom/ui/binme/BinaryMessage;
    .locals 5

    const-string/jumbo v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v0, Lcom/ui/binme/BinaryMessage;->c:Lcom/ui/binme/BinaryMessage$a;

    invoke-virtual {v0}, Lcom/ui/binme/BinaryMessage$a;->a()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/binme/a;->g(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$f;

    move-result-object v0

    sget-object v1, Lcom/ui/binme/BinaryMessage$f;->HEADER:Lcom/ui/binme/BinaryMessage$f;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/ui/binme/a$c;->a:Lcom/ui/binme/a$c;

    invoke-direct {p0, p1, v0}, Lcom/ui/binme/a;->h(Ljava/nio/ByteBuffer;Lmh/q;)Lcom/ui/binme/BinaryMessage$d;

    move-result-object v0

    check-cast v0, Lcom/ui/binme/BinaryMessage$d$b;

    invoke-direct {p0, p1}, Lcom/ui/binme/a;->g(Ljava/nio/ByteBuffer;)Lcom/ui/binme/BinaryMessage$f;

    move-result-object v1

    sget-object v4, Lcom/ui/binme/BinaryMessage$f;->BODY:Lcom/ui/binme/BinaryMessage$f;

    if-ne v1, v4, :cond_0

    sget-object v1, Lcom/ui/binme/a$b;->a:Lcom/ui/binme/a$b;

    invoke-direct {p0, p1, v1}, Lcom/ui/binme/a;->h(Ljava/nio/ByteBuffer;Lmh/q;)Lcom/ui/binme/BinaryMessage$d;

    move-result-object p1

    check-cast p1, Lcom/ui/binme/BinaryMessage$d$a;

    new-instance v1, Lcom/ui/binme/BinaryMessage;

    invoke-direct {v1, v0, p1}, Lcom/ui/binme/BinaryMessage;-><init>(Lcom/ui/binme/BinaryMessage$d$b;Lcom/ui/binme/BinaryMessage$d$a;)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    const-string v0, "Binary message must always contain body"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;

    const-string v0, "Binary message must always start with header"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/binme/BinaryMessage$Error$InvalidFormat;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method
