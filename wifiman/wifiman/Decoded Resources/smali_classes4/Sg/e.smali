.class LSg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final o:I

.field private static final p:I

.field private static final q:I

.field private static final r:I

.field private static final s:I

.field private static final t:I

.field private static final u:Ljava/net/InetAddress;

.field private static final v:Ljava/lang/String;

.field private static w:LUg/e;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:I

.field private c:I

.field private d:[B

.field private e:[B

.field private f:Ljava/net/DatagramSocket;

.field private g:Ljava/net/DatagramPacket;

.field private h:Ljava/net/DatagramPacket;

.field private i:Ljava/util/HashMap;

.field private j:Ljava/lang/Thread;

.field private k:I

.field private l:[I

.field m:Ljava/net/InetAddress;

.field n:Ljava/net/InetAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jcifs.smb1.netbios.snd_buf_size"

    const/16 v1, 0x240

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, LSg/e;->o:I

    const-string v0, "jcifs.smb1.netbios.rcv_buf_size"

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, LSg/e;->p:I

    const-string v0, "jcifs.smb1.netbios.soTimeout"

    const/16 v1, 0x1388

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, LSg/e;->q:I

    const-string v0, "jcifs.smb1.netbios.retryCount"

    const/4 v1, 0x2

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, LSg/e;->r:I

    const-string v0, "jcifs.smb1.netbios.retryTimeout"

    const/16 v1, 0xbb8

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, LSg/e;->s:I

    const-string v0, "jcifs.smb1.netbios.lport"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, LSg/e;->t:I

    const-string v0, "jcifs.smb1.netbios.laddr"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LRg/a;->b(Ljava/lang/String;Ljava/net/InetAddress;)Ljava/net/InetAddress;

    move-result-object v0

    sput-object v0, LSg/e;->u:Ljava/net/InetAddress;

    const-string v0, "jcifs.smb1.resolveOrder"

    invoke-static {v0}, LRg/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LSg/e;->v:Ljava/lang/String;

    invoke-static {}, LUg/e;->a()LUg/e;

    move-result-object v0

    sput-object v0, LSg/e;->w:LUg/e;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 1
    sget v0, LSg/e;->t:I

    sget-object v1, LSg/e;->u:Ljava/net/InetAddress;

    invoke-direct {p0, v0, v1}, LSg/e;-><init>(ILjava/net/InetAddress;)V

    return-void
.end method

.method constructor <init>(ILjava/net/InetAddress;)V
    .locals 9

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LSg/e;->a:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LSg/e;->i:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, LSg/e;->k:I

    .line 6
    iput p1, p0, LSg/e;->b:I

    .line 7
    iput-object p2, p0, LSg/e;->m:Ljava/net/InetAddress;

    .line 8
    :try_start_0
    const-string p1, "jcifs.smb1.netbios.baddr"

    const-string p2, "255.255.255.255"

    .line 9
    invoke-static {p2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p2

    .line 10
    invoke-static {p1, p2}, LRg/a;->b(Ljava/lang/String;Ljava/net/InetAddress;)Ljava/net/InetAddress;

    move-result-object p1

    iput-object p1, p0, LSg/e;->n:Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :catch_0
    sget p1, LSg/e;->o:I

    new-array p2, p1, [B

    iput-object p2, p0, LSg/e;->d:[B

    .line 12
    sget p2, LSg/e;->p:I

    new-array v1, p2, [B

    iput-object v1, p0, LSg/e;->e:[B

    .line 13
    new-instance v1, Ljava/net/DatagramPacket;

    iget-object v2, p0, LSg/e;->d:[B

    iget-object v3, p0, LSg/e;->n:Ljava/net/InetAddress;

    const/16 v4, 0x89

    invoke-direct {v1, v2, p1, v3, v4}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    iput-object v1, p0, LSg/e;->h:Ljava/net/DatagramPacket;

    .line 14
    new-instance p1, Ljava/net/DatagramPacket;

    iget-object v1, p0, LSg/e;->e:[B

    invoke-direct {p1, v1, p2}, Ljava/net/DatagramPacket;-><init>([BI)V

    iput-object p1, p0, LSg/e;->g:Ljava/net/DatagramPacket;

    .line 15
    sget-object p1, LSg/e;->v:Ljava/lang/String;

    const/4 p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    .line 16
    :cond_0
    new-array v3, p2, [I

    .line 17
    new-instance v4, Ljava/util/StringTokenizer;

    const-string v5, ","

    invoke-direct {v4, p1, v5}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move p1, v0

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {v4}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 19
    invoke-virtual {v4}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 20
    const-string v6, "LMHOSTS"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v5, p1, 0x1

    .line 21
    aput v2, v3, p1

    :goto_1
    move p1, v5

    goto :goto_0

    .line 22
    :cond_2
    const-string v6, "WINS"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 23
    invoke-static {}, LSg/g;->p()Ljava/net/InetAddress;

    move-result-object v5

    if-nez v5, :cond_3

    .line 24
    sget v5, LUg/e;->b:I

    if-le v5, v2, :cond_1

    .line 25
    sget-object v5, LSg/e;->w:LUg/e;

    const-string v6, "NetBIOS resolveOrder specifies WINS however the jcifs.smb1.netbios.wins property has not been set"

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    add-int/lit8 v5, p1, 0x1

    .line 26
    aput p2, v3, p1

    goto :goto_1

    .line 27
    :cond_4
    const-string v6, "BCAST"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    add-int/lit8 v5, p1, 0x1

    .line 28
    aput v1, v3, p1

    goto :goto_1

    .line 29
    :cond_5
    const-string v6, "DNS"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_0

    .line 30
    :cond_6
    sget v6, LUg/e;->b:I

    if-le v6, v2, :cond_1

    .line 31
    sget-object v6, LSg/e;->w:LUg/e;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "unknown resolver method: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 32
    :cond_7
    new-array p2, p1, [I

    iput-object p2, p0, LSg/e;->l:[I

    .line 33
    invoke-static {v3, v0, p2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    .line 34
    :cond_8
    :goto_2
    invoke-static {}, LSg/g;->p()Ljava/net/InetAddress;

    move-result-object p1

    if-nez p1, :cond_9

    .line 35
    new-array p1, v1, [I

    iput-object p1, p0, LSg/e;->l:[I

    .line 36
    aput v2, p1, v0

    .line 37
    aput v1, p1, v2

    goto :goto_3

    .line 38
    :cond_9
    new-array p1, p2, [I

    iput-object p1, p0, LSg/e;->l:[I

    .line 39
    aput v2, p1, v0

    .line 40
    aput p2, p1, v2

    .line 41
    aput v1, p1, v1

    :goto_3
    return-void
.end method


# virtual methods
.method a(I)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LSg/e;->c:I

    sget v0, LSg/e;->q:I

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LSg/e;->c:I

    :cond_0
    iget-object p1, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    if-nez p1, :cond_1

    new-instance p1, Ljava/net/DatagramSocket;

    iget v0, p0, LSg/e;->b:I

    iget-object v1, p0, LSg/e;->m:Ljava/net/InetAddress;

    invoke-direct {p1, v0, v1}, Ljava/net/DatagramSocket;-><init>(ILjava/net/InetAddress;)V

    iput-object p1, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    new-instance p1, Ljava/lang/Thread;

    const-string v0, "JCIFS-NameServiceClient"

    invoke-direct {p1, p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object p1, p0, LSg/e;->j:Ljava/lang/Thread;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    iget-object p1, p0, LSg/e;->j:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_1
    return-void
.end method

.method b(LSg/b;Ljava/net/InetAddress;)LSg/g;
    .locals 7

    new-instance v0, LSg/c;

    invoke-direct {v0, p1}, LSg/c;-><init>(LSg/b;)V

    new-instance v1, LSg/d;

    invoke-direct {v1}, LSg/d;-><init>()V

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_4

    iput-object p2, v0, LSg/f;->y:Ljava/net/InetAddress;

    invoke-virtual {p2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v5

    aget-byte v2, v5, v2

    const/4 v5, -0x1

    if-ne v2, v5, :cond_0

    move v3, v4

    :cond_0
    iput-boolean v3, v0, LSg/f;->p:Z

    sget v2, LSg/e;->r:I

    :goto_0
    :try_start_0
    sget v3, LSg/e;->s:I

    invoke-virtual {p0, v0, v1, v3}, LSg/e;->e(LSg/f;LSg/f;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v3, v1, LSg/f;->j:Z

    if-eqz v3, :cond_1

    iget v3, v1, LSg/f;->e:I

    if-nez v3, :cond_1

    iget-object p1, v1, LSg/f;->b:[LSg/g;

    array-length v0, p1

    sub-int/2addr v0, v4

    aget-object p1, p1, v0

    iget-object p1, p1, LSg/g;->a:LSg/b;

    invoke-virtual {p2}, Ljava/net/InetAddress;->hashCode()I

    move-result p2

    iput p2, p1, LSg/b;->d:I

    iget-object p1, v1, LSg/f;->b:[LSg/g;

    aget-object p1, p1, v0

    return-object p1

    :cond_1
    add-int/2addr v2, v5

    if-lez v2, :cond_2

    iget-boolean v3, v0, LSg/f;->p:Z

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/net/UnknownHostException;

    iget-object p1, p1, LSg/b;->a:Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p2

    :catch_0
    move-exception p2

    sget v0, LUg/e;->b:I

    if-le v0, v4, :cond_3

    sget-object v0, LSg/e;->w:LUg/e;

    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_3
    new-instance p2, Ljava/net/UnknownHostException;

    iget-object p1, p1, LSg/b;->a:Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    move p2, v3

    :goto_1
    iget-object v5, p0, LSg/e;->l:[I

    array-length v6, v5

    if-ge p2, v6, :cond_c

    :try_start_1
    aget v5, v5, p2

    if-eq v5, v4, :cond_a

    const/4 v6, 0x2

    if-eq v5, v6, :cond_5

    if-eq v5, v2, :cond_5

    goto :goto_4

    :cond_5
    if-ne v5, v2, :cond_6

    iget-object v5, p1, LSg/b;->a:Ljava/lang/String;

    const-string v6, "\u0001\u0002__MSBROWSE__\u0002"

    if-eq v5, v6, :cond_6

    iget v5, p1, LSg/b;->c:I

    const/16 v6, 0x1d

    if-eq v5, v6, :cond_6

    invoke-static {}, LSg/g;->p()Ljava/net/InetAddress;

    move-result-object v5

    iput-object v5, v0, LSg/f;->y:Ljava/net/InetAddress;

    iput-boolean v3, v0, LSg/f;->p:Z

    goto :goto_2

    :cond_6
    iget-object v5, p0, LSg/e;->n:Ljava/net/InetAddress;

    iput-object v5, v0, LSg/f;->y:Ljava/net/InetAddress;

    iput-boolean v4, v0, LSg/f;->p:Z

    :goto_2
    sget v5, LSg/e;->r:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    :goto_3
    add-int/lit8 v6, v5, -0x1

    if-lez v5, :cond_b

    :try_start_2
    sget v5, LSg/e;->s:I

    invoke-virtual {p0, v0, v1, v5}, LSg/e;->e(LSg/f;LSg/f;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    iget-boolean v5, v1, LSg/f;->j:Z

    if-eqz v5, :cond_7

    iget v5, v1, LSg/f;->e:I

    if-nez v5, :cond_7

    iget-object v5, v1, LSg/f;->b:[LSg/g;

    aget-object v5, v5, v3

    iget-object v5, v5, LSg/g;->a:LSg/b;

    iget-object v6, v0, LSg/f;->y:Ljava/net/InetAddress;

    invoke-virtual {v6}, Ljava/net/InetAddress;->hashCode()I

    move-result v6

    iput v6, v5, LSg/b;->d:I

    iget-object v5, v1, LSg/f;->b:[LSg/g;

    aget-object p1, v5, v3

    return-object p1

    :cond_7
    iget-object v5, p0, LSg/e;->l:[I

    aget v5, v5, p2

    if-ne v5, v2, :cond_8

    goto :goto_4

    :cond_8
    move v5, v6

    goto :goto_3

    :catch_1
    move-exception v5

    sget v6, LUg/e;->b:I

    if-le v6, v4, :cond_9

    sget-object v6, LSg/e;->w:LUg/e;

    invoke-virtual {v5, v6}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_9
    new-instance v5, Ljava/net/UnknownHostException;

    iget-object v6, p1, LSg/b;->a:Ljava/lang/String;

    invoke-direct {v5, v6}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v5

    :cond_a
    invoke-static {p1}, LSg/a;->a(LSg/b;)LSg/g;

    move-result-object v5

    if-eqz v5, :cond_b

    iget-object v6, v5, LSg/g;->a:LSg/b;

    iput v3, v6, LSg/b;->d:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    return-object v5

    :catch_2
    :cond_b
    :goto_4
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_c
    new-instance p2, Ljava/net/UnknownHostException;

    iget-object p1, p1, LSg/b;->a:Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method c()I
    .locals 3

    iget v0, p0, LSg/e;->k:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LSg/e;->k:I

    const v2, 0xffff

    and-int/2addr v0, v2

    if-nez v0, :cond_0

    iput v1, p0, LSg/e;->k:I

    :cond_0
    iget v0, p0, LSg/e;->k:I

    return v0
.end method

.method d(LSg/g;)[LSg/g;
    .locals 6

    new-instance v0, LSg/i;

    invoke-direct {v0, p1}, LSg/i;-><init>(LSg/g;)V

    new-instance v1, LSg/h;

    new-instance v2, LSg/b;

    const/4 v3, 0x0

    const-string v4, "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5, v3}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {v1, v2}, LSg/h;-><init>(LSg/b;)V

    invoke-virtual {p1}, LSg/g;->l()Ljava/net/InetAddress;

    move-result-object v2

    iput-object v2, v1, LSg/f;->y:Ljava/net/InetAddress;

    sget v2, LSg/e;->r:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-lez v2, :cond_3

    :try_start_0
    sget v2, LSg/e;->s:I

    invoke-virtual {p0, v1, v0, v2}, LSg/e;->e(LSg/f;LSg/f;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v2, v0, LSg/f;->j:Z

    if-eqz v2, :cond_1

    iget v2, v0, LSg/f;->e:I

    if-nez v2, :cond_1

    iget-object p1, v1, LSg/f;->y:Ljava/net/InetAddress;

    invoke-virtual {p1}, Ljava/net/InetAddress;->hashCode()I

    move-result p1

    :goto_1
    iget-object v1, v0, LSg/i;->D:[LSg/g;

    array-length v2, v1

    if-ge v5, v2, :cond_0

    aget-object v1, v1, v5

    iget-object v1, v1, LSg/g;->a:LSg/b;

    iput p1, v1, LSg/b;->d:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    return-object v1

    :cond_1
    move v2, v3

    goto :goto_0

    :catch_0
    move-exception v0

    sget v1, LUg/e;->b:I

    const/4 v2, 0x1

    if-le v1, v2, :cond_2

    sget-object v1, LSg/e;->w:LUg/e;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_2
    new-instance v0, Ljava/net/UnknownHostException;

    invoke-virtual {p1}, LSg/g;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/net/UnknownHostException;

    iget-object p1, p1, LSg/g;->a:LSg/b;

    iget-object p1, p1, LSg/b;->a:Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method e(LSg/f;LSg/f;I)V
    .locals 10

    sget-object v0, LSg/g;->l:[Ljava/net/InetAddress;

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    monitor-enter p2

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-lez v0, :cond_6

    :try_start_0
    iget-object v0, p0, LSg/e;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :try_start_1
    invoke-virtual {p0}, LSg/e;->c()I

    move-result v3

    iput v3, p1, LSg/f;->c:I

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v3}, Ljava/lang/Integer;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    iget-object v1, p0, LSg/e;->h:Ljava/net/DatagramPacket;

    iget-object v3, p1, LSg/f;->y:Ljava/net/InetAddress;

    invoke-virtual {v1, v3}, Ljava/net/DatagramPacket;->setAddress(Ljava/net/InetAddress;)V

    iget-object v1, p0, LSg/e;->h:Ljava/net/DatagramPacket;

    iget-object v3, p0, LSg/e;->d:[B

    const/4 v5, 0x0

    invoke-virtual {p1, v3, v5}, LSg/f;->n([BI)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/net/DatagramPacket;->setLength(I)V

    iput-boolean v5, p2, LSg/f;->j:Z

    iget-object v1, p0, LSg/e;->i:Ljava/util/HashMap;

    invoke-virtual {v1, v4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit16 v1, p3, 0x3e8

    invoke-virtual {p0, v1}, LSg/e;->a(I)V

    iget-object v1, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    iget-object v3, p0, LSg/e;->h:Ljava/net/DatagramPacket;

    invoke-virtual {v1, v3}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    sget v1, LUg/e;->b:I

    const/4 v3, 0x3

    if-le v1, v3, :cond_1

    sget-object v1, LSg/e;->w:LUg/e;

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget-object v1, LSg/e;->w:LUg/e;

    iget-object v3, p0, LSg/e;->d:[B

    iget-object v6, p0, LSg/e;->h:Ljava/net/DatagramPacket;

    invoke-virtual {v6}, Ljava/net/DatagramPacket;->getLength()I

    move-result v6

    invoke-static {v1, v3, v5, v6}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v1, v4

    goto :goto_4

    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_2
    if-lez p3, :cond_3

    int-to-long v6, p3

    invoke-virtual {p2, v6, v7}, Ljava/lang/Object;->wait(J)V

    iget-boolean p3, p2, LSg/f;->j:Z

    if-eqz p3, :cond_2

    iget p3, p1, LSg/f;->s:I

    iget v3, p2, LSg/f;->u:I
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p3, v3, :cond_2

    :try_start_4
    iget-object p1, p0, LSg/e;->i:Ljava/util/HashMap;

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    goto :goto_8

    :catchall_2
    move-exception p1

    move-object v1, v4

    goto :goto_6

    :catch_0
    move-exception p1

    move-object v1, v4

    goto :goto_5

    :cond_2
    :try_start_5
    iput-boolean v5, p2, LSg/f;->j:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    sub-long/2addr v8, v0

    sub-long/2addr v6, v8

    long-to-int p3, v6

    goto :goto_2

    :cond_3
    :try_start_6
    iget-object v0, p0, LSg/e;->i:Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LSg/e;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    iget-object v1, p1, LSg/f;->y:Ljava/net/InetAddress;

    invoke-static {v1}, LSg/g;->q(Ljava/net/InetAddress;)Z

    move-result v1

    if-nez v1, :cond_4

    monitor-exit v0

    goto :goto_7

    :catchall_3
    move-exception p1

    goto :goto_3

    :cond_4
    iget-object v1, p1, LSg/f;->y:Ljava/net/InetAddress;

    invoke-static {}, LSg/g;->p()Ljava/net/InetAddress;

    move-result-object v3

    if-ne v1, v3, :cond_5

    invoke-static {}, LSg/g;->s()Ljava/net/InetAddress;

    :cond_5
    invoke-static {}, LSg/g;->p()Ljava/net/InetAddress;

    move-result-object v1

    iput-object v1, p1, LSg/f;->y:Ljava/net/InetAddress;

    monitor-exit v0

    move v0, v2

    move-object v1, v4

    goto/16 :goto_0

    :goto_3
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_4
    move-exception p1

    :goto_4
    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    throw p1
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p1

    :goto_5
    :try_start_b
    new-instance p3, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :goto_6
    :try_start_c
    iget-object p3, p0, LSg/e;->i:Ljava/util/HashMap;

    invoke-virtual {p3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1

    :cond_6
    :goto_7
    monitor-exit p2

    return-void

    :goto_8
    monitor-exit p2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    throw p1
.end method

.method f()V
    .locals 3

    iget-object v0, p0, LSg/e;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->close()V

    iput-object v2, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object v2, p0, LSg/e;->j:Ljava/lang/Thread;

    iget-object v1, p0, LSg/e;->i:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public run()V
    .locals 5

    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, LSg/e;->j:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LSg/e;->g:Ljava/net/DatagramPacket;

    sget v1, LSg/e;->p:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramPacket;->setLength(I)V

    iget-object v0, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    iget v1, p0, LSg/e;->c:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    iget-object v0, p0, LSg/e;->f:Ljava/net/DatagramSocket;

    iget-object v1, p0, LSg/e;->g:Ljava/net/DatagramPacket;

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    sget v0, LUg/e;->b:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    sget-object v0, LSg/e;->w:LUg/e;

    const-string v2, "NetBIOS: new data read from socket"

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_1
    :goto_1
    iget-object v0, p0, LSg/e;->e:[B

    const/4 v2, 0x0

    invoke-static {v0, v2}, LSg/f;->e([BI)I

    move-result v0

    iget-object v3, p0, LSg/e;->i:Ljava/util/HashMap;

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSg/f;

    if-eqz v0, :cond_0

    iget-boolean v3, v0, LSg/f;->j:Z

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    monitor-enter v0
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v3, p0, LSg/e;->e:[B

    invoke-virtual {v0, v3, v2}, LSg/f;->i([BI)I

    const/4 v3, 0x1

    iput-boolean v3, v0, LSg/f;->j:Z

    sget v3, LUg/e;->b:I

    if-le v3, v1, :cond_3

    sget-object v1, LSg/e;->w:LUg/e;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget-object v1, LSg/e;->w:LUg/e;

    iget-object v3, p0, LSg/e;->e:[B

    iget-object v4, p0, LSg/e;->g:Ljava/net/DatagramPacket;

    invoke-virtual {v4}, Ljava/net/DatagramPacket;->getLength()I

    move-result v4

    invoke-static {v1, v3, v2, v4}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    goto :goto_0

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_1
    :cond_4
    :goto_4
    invoke-virtual {p0}, LSg/e;->f()V

    goto :goto_7

    :goto_5
    :try_start_3
    sget v1, LUg/e;->b:I

    const/4 v2, 0x2

    if-le v1, v2, :cond_4

    sget-object v1, LSg/e;->w:LUg/e;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :goto_6
    invoke-virtual {p0}, LSg/e;->f()V

    throw v0

    :goto_7
    return-void
.end method
