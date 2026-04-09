.class LLg/s;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field static b:LEj/b;


# instance fields
.field private final a:LLg/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/s;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/s;->b:LEj/b;

    return-void
.end method

.method constructor <init>(LLg/l;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocketListener("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    iput-object p1, p0, LLg/s;->a:LLg/l;

    return-void
.end method

.method private a()V
    .locals 4

    iget-object v0, p0, LLg/s;->a:LLg/l;

    iget-wide v0, v0, LLg/l;->j:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, LLg/s;->b:LEj/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".run() interrupted "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    const-string v0, ".run() exception "

    const/16 v1, 0x230c

    :try_start_0
    new-array v2, v1, [B

    new-instance v3, Ljava/net/DatagramPacket;

    invoke-direct {v3, v2, v1}, Ljava/net/DatagramPacket;-><init>([BI)V

    :cond_0
    :goto_0
    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->W0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->V0()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-direct {p0}, LLg/s;->a()V

    invoke-virtual {v3, v1}, Ljava/net/DatagramPacket;->setLength(I)V

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->L0()Ljava/net/MulticastSocket;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->W0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->V0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->X0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->isClosed()Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_1
    :try_start_1
    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->F0()LLg/k;

    move-result-object v2

    invoke-virtual {v2, v3}, LLg/k;->D(Ljava/net/DatagramPacket;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v2, LLg/c;

    invoke-direct {v2, v3}, LLg/c;-><init>(Ljava/net/DatagramPacket;)V

    invoke-virtual {v2}, LLg/e;->s()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_6

    sget-object v4, LLg/s;->b:LEj/b;

    invoke-interface {v4}, LEj/b;->m()Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, LLg/s;->b:LEj/b;

    const-string v6, "{}.run() JmDNS in:{}"

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v5}, LLg/c;->E(Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v6, v7, v5}, LEj/b;->g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v2}, LLg/e;->p()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getPort()I

    move-result v4

    sget v5, Ljavax/jmdns/impl/constants/a;->c:I

    if-eq v4, v5, :cond_4

    iget-object v4, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v6

    invoke-virtual {v3}, Ljava/net/DatagramPacket;->getPort()I

    move-result v7

    invoke-virtual {v4, v2, v6, v7}, LLg/l;->N0(LLg/c;Ljava/net/InetAddress;I)V

    :cond_4
    iget-object v4, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v4}, LLg/l;->C0()Ljava/net/InetAddress;

    move-result-object v6

    invoke-virtual {v4, v2, v6, v5}, LLg/l;->N0(LLg/c;Ljava/net/InetAddress;I)V

    goto/16 :goto_0

    :cond_5
    iget-object v4, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v4, v2}, LLg/l;->P0(LLg/c;)V

    goto/16 :goto_0

    :cond_6
    sget-object v4, LLg/s;->b:LEj/b;

    invoke-interface {v4}, LEj/b;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, LLg/s;->b:LEj/b;

    const-string v6, "{}.run() JmDNS in message with error code: {}"

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v5}, LLg/c;->E(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v6, v7, v2}, LEj/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :goto_2
    :try_start_2
    sget-object v4, LLg/s;->b:LEj/b;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v2}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->W0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->V0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->X0()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v2}, LLg/l;->isClosed()Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, LLg/s;->b:LEj/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0, v1}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, LLg/s;->a:LLg/l;

    invoke-virtual {v0}, LLg/l;->c1()V

    :cond_7
    :goto_3
    sget-object v0, LLg/s;->b:LEj/b;

    const-string v1, "{}.run() exiting."

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
