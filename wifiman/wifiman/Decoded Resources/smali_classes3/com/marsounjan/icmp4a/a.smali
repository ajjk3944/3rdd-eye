.class public final Lcom/marsounjan/icmp4a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/marsounjan/icmp4a/Icmp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/marsounjan/icmp4a/a$a;,
        Lcom/marsounjan/icmp4a/a$b;,
        Lcom/marsounjan/icmp4a/a$c;
    }
.end annotation


# static fields
.field public static final a:Lcom/marsounjan/icmp4a/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/marsounjan/icmp4a/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/marsounjan/icmp4a/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/marsounjan/icmp4a/a;->a:Lcom/marsounjan/icmp4a/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic b(Lcom/marsounjan/icmp4a/a;Ljava/io/FileDescriptor;Landroid/net/Network;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/marsounjan/icmp4a/a;->h(Ljava/io/FileDescriptor;Landroid/net/Network;)V

    return-void
.end method

.method public static final synthetic c(Lcom/marsounjan/icmp4a/a;Ljava/net/InetAddress;)Ljava/io/FileDescriptor;
    .locals 0

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/a;->i(Ljava/net/InetAddress;)Ljava/io/FileDescriptor;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/marsounjan/icmp4a/a;Ljava/net/InetAddress;I)Lcom/marsounjan/icmp4a/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/marsounjan/icmp4a/a;->j(Ljava/net/InetAddress;I)Lcom/marsounjan/icmp4a/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/marsounjan/icmp4a/a;Ljava/io/FileDescriptor;[B)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/marsounjan/icmp4a/a;->l(Ljava/io/FileDescriptor;[B)I

    move-result p0

    return p0
.end method

.method public static final synthetic f(Lcom/marsounjan/icmp4a/a;Landroid/net/Network;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/marsounjan/icmp4a/a;->m(Landroid/net/Network;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/marsounjan/icmp4a/a;Ljava/io/FileDescriptor;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/a;->n(Ljava/io/FileDescriptor;)V

    return-void
.end method

.method private final h(Ljava/io/FileDescriptor;Landroid/net/Network;)V
    .locals 2

    :try_start_0
    invoke-virtual {p2, p1}, Landroid/net/Network;->bindSocket(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;

    const-string/jumbo p2, "Failed to bind socket to specified network"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v0, v1}, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method private final i(Ljava/net/InetAddress;)Ljava/io/FileDescriptor;
    .locals 3

    :try_start_0
    instance-of v0, p1, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    sget p1, Landroid/system/OsConstants;->AF_INET:I

    sget v0, Landroid/system/OsConstants;->SOCK_DGRAM:I

    sget v1, Landroid/system/OsConstants;->IPPROTO_ICMP:I

    invoke-static {p1, v0, v1}, Landroid/system/Os;->socket(III)Ljava/io/FileDescriptor;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ljava/net/Inet6Address;

    if-eqz v0, :cond_2

    sget p1, Landroid/system/OsConstants;->AF_INET6:I

    sget v0, Landroid/system/OsConstants;->SOCK_DGRAM:I

    sget v1, Landroid/system/OsConstants;->IPPROTO_ICMPV6:I

    invoke-static {p1, v0, v1}, Landroid/system/Os;->socket(III)Ljava/io/FileDescriptor;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->valid()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;

    const-string v0, "Created file descriptor is invalid"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unsupported destination address type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;

    const-string/jumbo v1, "Socket creation failed"

    invoke-direct {v0, v1, p1}, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final j(Ljava/net/InetAddress;I)Lcom/marsounjan/icmp4a/b;
    .locals 2

    instance-of v0, p1, Ljava/net/Inet4Address;

    if-eqz v0, :cond_0

    new-instance p1, Lcom/marsounjan/icmp4a/h;

    invoke-direct {p1, p2}, Lcom/marsounjan/icmp4a/h;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/net/Inet6Address;

    if-eqz v0, :cond_1

    new-instance p1, Lcom/marsounjan/icmp4a/m;

    invoke-direct {p1, p2}, Lcom/marsounjan/icmp4a/m;-><init>(I)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unsupported destination address type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final k(Lcom/marsounjan/icmp4a/a$b;Ljava/lang/Integer;JIJLandroid/net/Network;)LLi/g;
    .locals 12

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "packet count must be null (infinite ping) or > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-lez v0, :cond_3

    if-lez p5, :cond_2

    new-instance v11, Lcom/marsounjan/icmp4a/a$d;

    const/4 v10, 0x0

    move-object v0, v11

    move-object v1, p1

    move-object v2, p0

    move-object/from16 v3, p8

    move-wide v4, p3

    move/from16 v6, p5

    move-object v7, p2

    move-wide/from16 v8, p6

    invoke-direct/range {v0 .. v10}, Lcom/marsounjan/icmp4a/a$d;-><init>(Lcom/marsounjan/icmp4a/a$b;Lcom/marsounjan/icmp4a/a;Landroid/net/Network;JILjava/lang/Integer;JLdh/e;)V

    invoke-static {v11}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object v0

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v1

    invoke-static {v0, v1}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "packet size must be > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "timeout must be > 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l(Ljava/io/FileDescriptor;[B)I
    .locals 6

    array-length v3, p2

    const/16 v4, 0x40

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Landroid/system/Os;->recvfrom(Ljava/io/FileDescriptor;[BIIILjava/net/InetSocketAddress;)I

    move-result p1

    sget v0, Landroid/system/OsConstants;->EMSGSIZE:I

    if-ne p1, v0, :cond_0

    array-length p1, p2

    :cond_0
    return p1
.end method

.method private final m(Landroid/net/Network;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v7, Lcom/marsounjan/icmp4a/a$e;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/marsounjan/icmp4a/a$e;-><init>(Ljava/lang/String;JLandroid/net/Network;Ldh/e;)V

    invoke-static {v0, v7, p5}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final n(Ljava/io/FileDescriptor;)V
    .locals 3

    :try_start_0
    sget v0, Landroid/system/OsConstants;->IPPROTO_IP:I

    sget v1, Landroid/system/OsConstants;->IP_TOS:I

    const/16 v2, 0x10

    invoke-static {p1, v0, v1, v2}, Landroid/system/Os;->setsockoptInt(Ljava/io/FileDescriptor;III)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;

    const-string/jumbo v0, "Failed to set IP_TOS to low delay"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Integer;JIJLandroid/net/Network;)LLi/g;
    .locals 11

    move-object v0, p1

    const-string/jumbo v1, "host"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/marsounjan/icmp4a/a$b$a;

    invoke-direct {v3, p1}, Lcom/marsounjan/icmp4a/a$b$a;-><init>(Ljava/lang/String;)V

    move-object v2, p0

    move-object v4, p2

    move-wide v5, p3

    move/from16 v7, p5

    move-wide/from16 v8, p6

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/marsounjan/icmp4a/a;->k(Lcom/marsounjan/icmp4a/a$b;Ljava/lang/Integer;JIJLandroid/net/Network;)LLi/g;

    move-result-object v0

    return-object v0
.end method
