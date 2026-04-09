.class public final Lkb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/c;

    invoke-direct {v0}, Lkb/c;-><init>()V

    sput-object v0, Lkb/c;->a:Lkb/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a([B)[B
    .locals 3

    new-instance v0, Ljava/util/zip/Deflater;

    invoke-direct {v0}, Ljava/util/zip/Deflater;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/zip/Deflater;->setInput([B)V

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finish()V

    const/16 p1, 0x7fff

    new-array p1, p1, [B

    invoke-virtual {v0, p1}, Ljava/util/zip/Deflater;->deflate([B)I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public static synthetic e(Lkb/c;[BLkb/l$b;Ljava/nio/ByteBuffer;Lkb/l$b;ZILjava/lang/Object;)Ljava/nio/ByteBuffer;
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lkb/c;->c([BLkb/l$b;Ljava/nio/ByteBuffer;Lkb/l$b;Z)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/nio/ByteBuffer;Lkb/l$c;Lkb/l$b;Z[B)V
    .locals 0

    invoke-virtual {p2}, Lkb/l$c;->getValue()B

    move-result p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {p3}, Lkb/l$b;->getValue()B

    move-result p2

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-byte p2, p4

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    array-length p2, p5

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final b(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 10

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "{\"type\":\"message\"}"

    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string/jumbo v0, "getBytes(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lkb/l$b;->JSON:Lkb/l$b;

    sget-object v6, Lkb/l$b;->BINARY:Lkb/l$b;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v2 .. v9}, Lkb/c;->e(Lkb/c;[BLkb/l$b;Ljava/nio/ByteBuffer;Lkb/l$b;ZILjava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public final c([BLkb/l$b;Ljava/nio/ByteBuffer;Lkb/l$b;Z)Ljava/nio/ByteBuffer;
    .locals 7

    const-string/jumbo v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "headerFormat"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bodyFormat"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p3

    move-object v4, p3

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-object v4, v0

    :goto_0
    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lkb/c;->d([BLkb/l$b;[BLkb/l$b;Z)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public final d([BLkb/l$b;[BLkb/l$b;Z)Ljava/nio/ByteBuffer;
    .locals 8

    const-string/jumbo v1, "header"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "headerFormat"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "body"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "bodyFormat"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_0

    invoke-direct {p0, p1}, Lkb/c;->a([B)[B

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p1

    :goto_0
    if-eqz p5, :cond_1

    invoke-direct {p0, p3}, Lkb/c;->a([B)[B

    move-result-object v0

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p3

    :goto_1
    array-length v0, v5

    add-int/lit8 v0, v0, 0x10

    array-length v1, v6

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object v2, Lkb/l$c;->HEADER:Lkb/l$c;

    move-object v0, p0

    move-object v1, v7

    move-object v3, p2

    move v4, p5

    invoke-direct/range {v0 .. v5}, Lkb/c;->f(Ljava/nio/ByteBuffer;Lkb/l$c;Lkb/l$b;Z[B)V

    sget-object v2, Lkb/l$c;->BODY:Lkb/l$c;

    move-object v3, p4

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lkb/c;->f(Ljava/nio/ByteBuffer;Lkb/l$c;Lkb/l$b;Z[B)V

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object v7
.end method
