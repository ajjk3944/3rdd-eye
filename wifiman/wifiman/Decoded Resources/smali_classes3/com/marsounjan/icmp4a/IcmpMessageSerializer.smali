.class public abstract Lcom/marsounjan/icmp4a/IcmpMessageSerializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/marsounjan/icmp4a/IcmpMessageSerializer$a;,
        Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;,
        Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/marsounjan/icmp4a/IcmpMessageSerializer$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer;->a:Lcom/marsounjan/icmp4a/IcmpMessageSerializer$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/nio/ByteBuffer;)Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;
    .locals 7

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, LYg/A;->b(B)B

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, LYg/A;->b(B)B

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {p1, v0, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    sget-object p1, LYg/J;->a:LYg/J;

    const-string/jumbo p1, "apply(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;-><init>(BBSLjava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    new-instance v0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Incoming message doesn\'t match minimal length requirements. Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x7d

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 3

    const-string/jumbo v0, "byteBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer;->c(Ljava/nio/ByteBuffer;)Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    const/16 v2, 0x8

    sub-int/2addr p1, v2

    invoke-static {v1, v2, p1}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer;->b(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;Ljava/nio/ByteBuffer;)Ljava/lang/Object;
.end method

.method protected final d([BBSS[B)Ljava/nio/ByteBuffer;
    .locals 1

    const-string/jumbo v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "datagram"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1
.end method

.method public abstract e(Ljava/lang/Object;[B[B)Ljava/nio/ByteBuffer;
.end method
