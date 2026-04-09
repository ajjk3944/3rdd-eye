.class public final Lcom/marsounjan/icmp4a/l;
.super Lcom/marsounjan/icmp4a/j;
.source "SourceFile"


# instance fields
.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lcom/marsounjan/icmp4a/j;-><init>()V

    invoke-static {}, Lcom/marsounjan/icmp4a/i$b$a$a;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lsh/m;->d(II)I

    move-result v2

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/marsounjan/icmp4a/i$b$a$a;

    invoke-virtual {v5}, Lcom/marsounjan/icmp4a/i$b$a$a;->getId-w2LRezQ()B

    move-result v5

    invoke-static {v5}, LYg/A;->a(B)LYg/A;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v4, p0, Lcom/marsounjan/icmp4a/l;->b:Ljava/util/Map;

    invoke-static {}, Lcom/marsounjan/icmp4a/i$b$e$a;->getEntries()Lfh/a;

    move-result-object v0

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, LZg/U;->d(I)I

    move-result v2

    invoke-static {v2, v3}, Lsh/m;->d(II)I

    move-result v2

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/marsounjan/icmp4a/i$b$e$a;

    invoke-virtual {v5}, Lcom/marsounjan/icmp4a/i$b$e$a;->getId-w2LRezQ()B

    move-result v5

    invoke-static {v5}, LYg/A;->a(B)LYg/A;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iput-object v4, p0, Lcom/marsounjan/icmp4a/l;->c:Ljava/util/Map;

    invoke-static {}, Lcom/marsounjan/icmp4a/i$b$d$a;->getEntries()Lfh/a;

    move-result-object v0

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    invoke-static {v1, v3}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/marsounjan/icmp4a/i$b$d$a;

    invoke-virtual {v3}, Lcom/marsounjan/icmp4a/i$b$d$a;->getId-w2LRezQ()B

    move-result v3

    invoke-static {v3}, LYg/A;->a(B)LYg/A;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iput-object v2, p0, Lcom/marsounjan/icmp4a/l;->d:Ljava/util/Map;

    return-void
.end method

.method private final f(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$a;
    .locals 2

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$a;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/l;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result p1

    invoke-static {p1}, LYg/A;->a(B)LYg/A;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/marsounjan/icmp4a/i$b$a$a;

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/i$b$a;-><init>(Lcom/marsounjan/icmp4a/i$b$a$a;)V

    return-object v0
.end method

.method private final g(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$b;
    .locals 3

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    invoke-static {p1}, LYg/H;->b(S)S

    move-result p1

    new-instance v1, Lcom/marsounjan/icmp4a/i$b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lcom/marsounjan/icmp4a/i$b$b;-><init>(SSLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Echo message must always have code 0 but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result p1

    invoke-static {p1}, LYg/A;->g(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final h(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$c;
    .locals 3

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$c;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    invoke-static {p1}, LYg/C;->b(I)I

    move-result p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/marsounjan/icmp4a/i$b$c;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Echo message must always have code 0 but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result p1

    invoke-static {p1}, LYg/A;->g(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final i(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$d;
    .locals 3

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$d;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/l;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result v2

    invoke-static {v2}, LYg/A;->a(B)LYg/A;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/marsounjan/icmp4a/i$b$d$a;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    invoke-static {p1}, LYg/C;->b(I)I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/marsounjan/icmp4a/i$b$d;-><init>(Lcom/marsounjan/icmp4a/i$b$d$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final k(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$e;
    .locals 2

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$e;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/l;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->a()B

    move-result p1

    invoke-static {p1}, LYg/A;->a(B)LYg/A;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/marsounjan/icmp4a/i$b$e$a;

    invoke-direct {v0, p1}, Lcom/marsounjan/icmp4a/i$b$e;-><init>(Lcom/marsounjan/icmp4a/i$b$e$a;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic b(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;Ljava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/l;->j(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;Ljava/nio/ByteBuffer;)Lcom/marsounjan/icmp4a/i$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;[B[B)Ljava/nio/ByteBuffer;
    .locals 0

    check-cast p1, Lcom/marsounjan/icmp4a/i$a;

    invoke-virtual {p0, p1, p2, p3}, Lcom/marsounjan/icmp4a/l;->l(Lcom/marsounjan/icmp4a/i$a;[B[B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public j(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;Ljava/nio/ByteBuffer;)Lcom/marsounjan/icmp4a/i$b;
    .locals 2

    const-string/jumbo v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b()B

    move-result p2

    sget-object v0, Lcom/marsounjan/icmp4a/i$c;->ECHO_REPLY:Lcom/marsounjan/icmp4a/i$c;

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/i$c;->getId-w2LRezQ()B

    move-result v0

    if-ne p2, v0, :cond_0

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/l;->g(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$b;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/marsounjan/icmp4a/i$c;->DESTINATION_UNREACHABLE:Lcom/marsounjan/icmp4a/i$c;

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/i$c;->getId-w2LRezQ()B

    move-result v0

    if-ne p2, v0, :cond_1

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/l;->f(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/marsounjan/icmp4a/i$c;->PACKET_TOO_BIG:Lcom/marsounjan/icmp4a/i$c;

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/i$c;->getId-w2LRezQ()B

    move-result v0

    if-ne p2, v0, :cond_2

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/l;->h(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$c;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/marsounjan/icmp4a/i$c;->TIME_EXCEEDED:Lcom/marsounjan/icmp4a/i$c;

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/i$c;->getId-w2LRezQ()B

    move-result v0

    if-ne p2, v0, :cond_3

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/l;->k(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$e;

    move-result-object p1

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/marsounjan/icmp4a/i$c;->PARAMETER_PROBLEM:Lcom/marsounjan/icmp4a/i$c;

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/i$c;->getId-w2LRezQ()B

    move-result v0

    if-ne p2, v0, :cond_4

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/l;->i(Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;)Lcom/marsounjan/icmp4a/i$b$d;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_4
    new-instance p2, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unknown response type received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$b;->b()B

    move-result p1

    invoke-static {p1}, LYg/A;->g(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public l(Lcom/marsounjan/icmp4a/i$a;[B[B)Ljava/nio/ByteBuffer;
    .locals 7

    const-string/jumbo v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "datagram"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/marsounjan/icmp4a/i$a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/i;->a()Lcom/marsounjan/icmp4a/i$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/i$c;->getId-w2LRezQ()B

    move-result v3

    check-cast p1, Lcom/marsounjan/icmp4a/i$a$a;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/i$a$a;->b()S

    move-result v4

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/i$a$a;->c()S

    move-result v5

    move-object v1, p0

    move-object v2, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/marsounjan/icmp4a/IcmpMessageSerializer;->d([BBSS[B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
