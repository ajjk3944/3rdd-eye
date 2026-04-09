.class public Ljcifs/smb1/smb1/Q;
.super LVg/c;
.source "SourceFile"

# interfaces
.implements Ljcifs/smb1/smb1/L;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljcifs/smb1/smb1/Q$a;
    }
.end annotation


# static fields
.field static final E:[B

.field static final F:Ljcifs/smb1/smb1/s;

.field static G:LUg/e;

.field static H:Ljava/util/HashMap;


# instance fields
.field A:I

.field B:I

.field C:Z

.field D:Ljava/lang/String;

.field h:Ljava/net/InetAddress;

.field i:I

.field j:LRg/b;

.field k:Ljava/net/Socket;

.field l:I

.field m:I

.field n:Ljava/io/OutputStream;

.field o:Ljava/io/InputStream;

.field p:[B

.field q:Ljcifs/smb1/smb1/n;

.field r:J

.field s:Ljava/util/LinkedList;

.field t:Ljcifs/smb1/smb1/m;

.field u:Ljava/util/LinkedList;

.field v:Ljcifs/smb1/smb1/Q$a;

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0xffff

    new-array v0, v0, [B

    sput-object v0, Ljcifs/smb1/smb1/Q;->E:[B

    new-instance v0, Ljcifs/smb1/smb1/s;

    invoke-direct {v0}, Ljcifs/smb1/smb1/s;-><init>()V

    sput-object v0, Ljcifs/smb1/smb1/Q;->F:Ljcifs/smb1/smb1/s;

    invoke-static {}, LUg/e;->a()LUg/e;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    const/4 v0, 0x0

    sput-object v0, Ljcifs/smb1/smb1/Q;->H:Ljava/util/HashMap;

    return-void
.end method

.method constructor <init>(LRg/b;ILjava/net/InetAddress;I)V
    .locals 4

    invoke-direct {p0}, LVg/c;-><init>()V

    const/16 v0, 0x200

    new-array v0, v0, [B

    iput-object v0, p0, Ljcifs/smb1/smb1/Q;->p:[B

    new-instance v0, Ljcifs/smb1/smb1/n;

    invoke-direct {v0}, Ljcifs/smb1/smb1/n;-><init>()V

    iput-object v0, p0, Ljcifs/smb1/smb1/Q;->q:Ljcifs/smb1/smb1/n;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget v2, Ljcifs/smb1/smb1/L;->V0:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Ljcifs/smb1/smb1/Q;->r:J

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ljcifs/smb1/smb1/Q;->s:Ljava/util/LinkedList;

    const/4 v0, 0x0

    iput-object v0, p0, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->u:Ljava/util/LinkedList;

    new-instance v1, Ljcifs/smb1/smb1/Q$a;

    invoke-direct {v1, p0}, Ljcifs/smb1/smb1/Q$a;-><init>(Ljcifs/smb1/smb1/Q;)V

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    sget v1, Ljcifs/smb1/smb1/L;->P0:I

    iput v1, p0, Ljcifs/smb1/smb1/Q;->w:I

    sget v1, Ljcifs/smb1/smb1/L;->y0:I

    iput v1, p0, Ljcifs/smb1/smb1/Q;->x:I

    sget v1, Ljcifs/smb1/smb1/L;->z0:I

    iput v1, p0, Ljcifs/smb1/smb1/Q;->y:I

    sget v1, Ljcifs/smb1/smb1/L;->A0:I

    iput v1, p0, Ljcifs/smb1/smb1/Q;->z:I

    sget v1, Ljcifs/smb1/smb1/L;->Q0:I

    iput v1, p0, Ljcifs/smb1/smb1/Q;->A:I

    const/4 v1, 0x0

    iput v1, p0, Ljcifs/smb1/smb1/Q;->B:I

    sget-boolean v1, Ljcifs/smb1/smb1/L;->B0:Z

    iput-boolean v1, p0, Ljcifs/smb1/smb1/Q;->C:Z

    iput-object v0, p0, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    iput-object p1, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    iput p2, p0, Ljcifs/smb1/smb1/Q;->l:I

    iput-object p3, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    iput p4, p0, Ljcifs/smb1/smb1/Q;->i:I

    return-void
.end method

.method static declared-synchronized s(LRg/b;I)Ljcifs/smb1/smb1/Q;
    .locals 4

    const-class v0, Ljcifs/smb1/smb1/Q;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljcifs/smb1/smb1/L;->w0:Ljava/net/InetAddress;

    sget v2, Ljcifs/smb1/smb1/L;->x0:I

    const/4 v3, 0x0

    invoke-static {p0, p1, v1, v2, v3}, Ljcifs/smb1/smb1/Q;->t(LRg/b;ILjava/net/InetAddress;ILjava/lang/String;)Ljcifs/smb1/smb1/Q;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method static declared-synchronized t(LRg/b;ILjava/net/InetAddress;ILjava/lang/String;)Ljcifs/smb1/smb1/Q;
    .locals 10

    const-class v0, Ljcifs/smb1/smb1/Q;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljcifs/smb1/smb1/L;->T0:Ljava/util/LinkedList;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget v2, Ljcifs/smb1/smb1/L;->U0:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljcifs/smb1/smb1/Q;

    move-object v4, v3

    move-object v5, p0

    move v6, p1

    move-object v7, p2

    move v8, p3

    move-object v9, p4

    invoke-virtual/range {v4 .. v9}, Ljcifs/smb1/smb1/Q;->w(LRg/b;ILjava/net/InetAddress;ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget v4, Ljcifs/smb1/smb1/L;->U0:I

    if-eqz v4, :cond_1

    iget-object v5, v3, Ljcifs/smb1/smb1/Q;->u:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->size()I

    move-result v5

    if-ge v5, v4, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v3

    :cond_2
    :try_start_2
    new-instance p4, Ljcifs/smb1/smb1/Q;

    invoke-direct {p4, p0, p1, p2, p3}, Ljcifs/smb1/smb1/Q;-><init>(LRg/b;ILjava/net/InetAddress;I)V

    sget-object p0, Ljcifs/smb1/smb1/L;->T0:Ljava/util/LinkedList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p4}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p4

    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p0
.end method

.method private x(ILjcifs/smb1/smb1/l;)V
    .locals 8

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->p:[B

    monitor-enter v0

    const/16 v1, 0x8b

    if-ne p1, v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/Q;->z()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    if-nez p1, :cond_1

    const/16 p1, 0x1bd

    :cond_1
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    if-eqz v2, :cond_2

    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    iget v4, p0, Ljcifs/smb1/smb1/Q;->i:I

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v1, v2}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    :cond_2
    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v3}, LRg/b;->f()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    sget p1, Ljcifs/smb1/smb1/L;->W0:I

    invoke-virtual {v1, v2, p1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    sget v1, Ljcifs/smb1/smb1/L;->V0:I

    invoke-virtual {p1, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    :goto_0
    iget p1, p0, Ljcifs/smb1/smb1/Q;->m:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Ljcifs/smb1/smb1/Q;->m:I

    const/16 v2, 0x7d00

    if-ne p1, v2, :cond_3

    iput v1, p0, Ljcifs/smb1/smb1/Q;->m:I

    :cond_3
    sget-object p1, Ljcifs/smb1/smb1/Q;->F:Ljcifs/smb1/smb1/s;

    iget v1, p0, Ljcifs/smb1/smb1/Q;->m:I

    iput v1, p1, Ljcifs/smb1/smb1/l;->m:I

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v2, 0x4

    invoke-virtual {p1, v1, v2}, Ljcifs/smb1/smb1/l;->f([BI)I

    move-result v1

    const v3, 0xffff

    and-int v4, v1, v3

    iget-object v5, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v6, 0x0

    invoke-static {v4, v5, v6}, LUg/b;->d(I[BI)I

    sget v4, LUg/e;->b:I

    const/4 v5, 0x6

    if-lt v4, v2, :cond_4

    sget-object v4, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {v4, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget p1, LUg/e;->b:I

    if-lt p1, v5, :cond_4

    sget-object p1, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    iget-object v4, p0, Ljcifs/smb1/smb1/Q;->p:[B

    invoke-static {p1, v4, v2, v1}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_4
    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    iget-object v4, p0, Ljcifs/smb1/smb1/Q;->p:[B

    add-int/lit8 v7, v1, 0x4

    invoke-virtual {p1, v4, v6, v7}, Ljava/io/OutputStream;->write([BII)V

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p0}, Ljcifs/smb1/smb1/Q;->j()LVg/a;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v4, 0x2

    invoke-static {p1, v4}, LUg/b;->a([BI)S

    move-result p1

    and-int/2addr p1, v3

    const/16 v3, 0x21

    if-lt p1, v3, :cond_6

    add-int/lit8 v3, p1, 0x4

    iget-object v4, p0, Ljcifs/smb1/smb1/Q;->p:[B

    array-length v6, v4

    if-gt v3, v6, :cond_6

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    add-int/lit8 p1, p1, -0x20

    const/16 v6, 0x24

    invoke-static {v3, v4, v6, p1}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->p:[B

    invoke-virtual {p2, p1, v2}, Ljcifs/smb1/smb1/l;->e([BI)I

    sget p1, LUg/e;->b:I

    if-lt p1, v2, :cond_5

    sget-object p1, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget p1, LUg/e;->b:I

    if-lt p1, v5, :cond_5

    sget-object p1, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    iget-object p2, p0, Ljcifs/smb1/smb1/Q;->p:[B

    invoke-static {p1, p2, v2, v1}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_5
    monitor-exit v0

    return-void

    :cond_6
    new-instance p2, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid payload size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "transport closed in negotiate"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method protected c()V
    .locals 4

    new-instance v0, Ljcifs/smb1/smb1/t;

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    invoke-direct {v0, v1}, Ljcifs/smb1/smb1/t;-><init>(Ljcifs/smb1/smb1/Q$a;)V

    const/16 v1, 0x8b

    const/16 v2, 0x1bd

    :try_start_0
    iget v3, p0, Ljcifs/smb1/smb1/Q;->l:I

    invoke-direct {p0, v3, v0}, Ljcifs/smb1/smb1/Q;->x(ILjcifs/smb1/smb1/l;)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/NoRouteToHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iget v3, p0, Ljcifs/smb1/smb1/Q;->l:I

    if-eqz v3, :cond_1

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    invoke-direct {p0, v1, v0}, Ljcifs/smb1/smb1/Q;->x(ILjcifs/smb1/smb1/l;)V

    iput v1, p0, Ljcifs/smb1/smb1/Q;->l:I

    goto :goto_2

    :catch_1
    iget v3, p0, Ljcifs/smb1/smb1/Q;->l:I

    if-eqz v3, :cond_3

    if-ne v3, v2, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :cond_3
    :goto_1
    invoke-direct {p0, v1, v0}, Ljcifs/smb1/smb1/Q;->x(ILjcifs/smb1/smb1/l;)V

    iput v1, p0, Ljcifs/smb1/smb1/Q;->l:I

    :goto_2
    iget v0, v0, Ljcifs/smb1/smb1/t;->B:I

    const/16 v1, 0xa

    if-gt v0, v1, :cond_c

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v1, v0, Ljcifs/smb1/smb1/Q$a;->d:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eq v1, v2, :cond_5

    iget v0, v0, Ljcifs/smb1/smb1/Q$a;->o:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_5

    sget v0, Ljcifs/smb1/smb1/L;->I0:I

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljcifs/smb1/smb1/SmbException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected encryption key length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v2, v2, Ljcifs/smb1/smb1/Q$a;->o:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v0}, LRg/b;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget-boolean v1, v0, Ljcifs/smb1/smb1/Q$a;->j:Z

    if-nez v1, :cond_7

    iget-boolean v1, v0, Ljcifs/smb1/smb1/Q$a;->i:Z

    if-eqz v1, :cond_6

    sget-boolean v1, Ljcifs/smb1/smb1/L;->E0:Z

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    iget v1, p0, Ljcifs/smb1/smb1/Q;->w:I

    const v3, 0xfffb

    and-int/2addr v1, v3

    iput v1, p0, Ljcifs/smb1/smb1/Q;->w:I

    goto :goto_5

    :cond_7
    :goto_4
    iget v1, p0, Ljcifs/smb1/smb1/Q;->w:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ljcifs/smb1/smb1/Q;->w:I

    :goto_5
    iget v1, p0, Ljcifs/smb1/smb1/Q;->x:I

    iget v0, v0, Ljcifs/smb1/smb1/Q$a;->a:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/Q;->x:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_8

    iput v1, p0, Ljcifs/smb1/smb1/Q;->x:I

    :cond_8
    iget v0, p0, Ljcifs/smb1/smb1/Q;->y:I

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v1, v1, Ljcifs/smb1/smb1/Q$a;->b:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ljcifs/smb1/smb1/Q;->y:I

    iget v0, p0, Ljcifs/smb1/smb1/Q;->A:I

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v1, v1, Ljcifs/smb1/smb1/Q$a;->d:I

    and-int/2addr v0, v1

    iput v0, p0, Ljcifs/smb1/smb1/Q;->A:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_9

    or-int/2addr v0, v2

    iput v0, p0, Ljcifs/smb1/smb1/Q;->A:I

    :cond_9
    iget v0, p0, Ljcifs/smb1/smb1/Q;->A:I

    and-int/lit8 v1, v0, 0x4

    if-nez v1, :cond_b

    sget-boolean v1, Ljcifs/smb1/smb1/L;->C0:Z

    if-eqz v1, :cond_a

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ljcifs/smb1/smb1/Q;->A:I

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljcifs/smb1/smb1/Q;->C:Z

    iget v0, p0, Ljcifs/smb1/smb1/Q;->w:I

    and-int/lit16 v0, v0, 0x7fff

    iput v0, p0, Ljcifs/smb1/smb1/Q;->w:I

    :cond_b
    :goto_6
    return-void

    :cond_c
    new-instance v0, Ljcifs/smb1/smb1/SmbException;

    const-string v1, "This client does not support the negotiated dialect."

    invoke-direct {v0, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected d(Z)V
    .locals 3

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->u:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljcifs/smb1/smb1/P;

    invoke-virtual {v2, p1}, Ljcifs/smb1/smb1/P;->b(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->shutdownOutput()V

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    return-void

    :goto_1
    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    throw p1
.end method

.method protected e(LVg/b;)V
    .locals 8

    move-object v0, p1

    check-cast v0, Ljcifs/smb1/smb1/l;

    iget-boolean v1, p0, Ljcifs/smb1/smb1/Q;->C:Z

    iput-boolean v1, v0, Ljcifs/smb1/smb1/l;->p:Z

    iget v1, p0, Ljcifs/smb1/smb1/Q;->A:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iput-boolean v1, v0, Ljcifs/smb1/smb1/l;->r:Z

    sget-object v1, Ljcifs/smb1/smb1/Q;->E:[B

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/16 v4, 0x24

    invoke-static {v2, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x2

    invoke-static {v1, v2}, LUg/b;->a([BI)S

    move-result v2

    const v3, 0xffff

    and-int/2addr v2, v3

    const/16 v3, 0x21

    if-lt v2, v3, :cond_7

    add-int/lit8 v3, v2, 0x4

    iget v5, p0, Ljcifs/smb1/smb1/Q;->z:I

    if-gt v3, v5, :cond_7

    const/16 v3, 0x9

    invoke-static {v1, v3}, LUg/b;->c([BI)I

    move-result v3

    iget-byte v5, v0, Ljcifs/smb1/smb1/l;->c:B

    const/16 v6, 0x2e

    const/4 v7, 0x4

    if-ne v5, v6, :cond_3

    if-eqz v3, :cond_1

    const v5, -0x7ffffffb

    if-ne v3, v5, :cond_3

    :cond_1
    move-object v3, v0

    check-cast v3, Ljcifs/smb1/smb1/z;

    iget-object v5, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    const/16 v6, 0x1b

    invoke-static {v5, v1, v4, v6}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    invoke-virtual {v0, v1, v7}, Ljcifs/smb1/smb1/l;->e([BI)I

    iget v4, v3, Ljcifs/smb1/smb1/z;->I:I

    add-int/lit8 v4, v4, -0x3b

    iget v5, v3, Ljcifs/smb1/smb1/l;->o:I

    if-lez v5, :cond_2

    if-lez v4, :cond_2

    if-ge v4, v7, :cond_2

    iget-object v5, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    const/16 v6, 0x3f

    invoke-static {v5, v1, v6, v4}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    iget v4, v3, Ljcifs/smb1/smb1/z;->H:I

    if-lez v4, :cond_4

    iget-object v5, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    iget-object v6, v3, Ljcifs/smb1/smb1/z;->E:[B

    iget v3, v3, Ljcifs/smb1/smb1/z;->F:I

    invoke-static {v5, v6, v3, v4}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    goto :goto_2

    :cond_3
    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    add-int/lit8 v5, v2, -0x20

    invoke-static {v3, v1, v4, v5}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    invoke-virtual {v0, v1, v7}, Ljcifs/smb1/smb1/l;->e([BI)I

    instance-of v3, v0, Ljcifs/smb1/smb1/D;

    if-eqz v3, :cond_4

    move-object v3, v0

    check-cast v3, Ljcifs/smb1/smb1/D;

    invoke-virtual {v3}, Ljcifs/smb1/smb1/D;->nextElement()Ljava/lang/Object;

    :cond_4
    :goto_2
    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    if-eqz v3, :cond_5

    iget v4, v0, Ljcifs/smb1/smb1/l;->h:I

    if-nez v4, :cond_5

    invoke-virtual {v3, v1, v7, v0}, Ljcifs/smb1/smb1/m;->d([BILjcifs/smb1/smb1/l;)Z

    :cond_5
    sget v0, LUg/e;->b:I

    if-lt v0, v7, :cond_6

    sget-object v0, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget p1, LUg/e;->b:I

    const/4 v0, 0x6

    if-lt p1, v0, :cond_6

    sget-object p1, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-static {p1, v1, v7, v2}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_6
    monitor-exit v1

    return-void

    :cond_7
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid payload size: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected f(LVg/a;)V
    .locals 5

    sget-object v0, Ljcifs/smb1/smb1/Q;->E:[B

    monitor-enter v0

    :try_start_0
    check-cast p1, Ljcifs/smb1/smb1/l;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Ljcifs/smb1/smb1/l;->f([BI)I

    move-result v2

    const v3, 0xffff

    and-int/2addr v3, v2

    const/4 v4, 0x0

    invoke-static {v3, v0, v4}, LUg/b;->d(I[BI)I

    sget v3, LUg/e;->b:I

    if-lt v3, v1, :cond_2

    :cond_0
    sget-object v3, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {v3, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    instance-of v3, p1, Ljcifs/smb1/smb1/b;

    if-eqz v3, :cond_1

    check-cast p1, Ljcifs/smb1/smb1/b;

    iget-object p1, p1, Ljcifs/smb1/smb1/b;->D:Ljcifs/smb1/smb1/l;

    if-nez p1, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    sget p1, LUg/e;->b:I

    const/4 v3, 0x6

    if-lt p1, v3, :cond_2

    sget-object p1, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    sget-object v3, Ljcifs/smb1/smb1/Q;->E:[B

    invoke-static {p1, v3, v1, v2}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_2
    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    sget-object v3, Ljcifs/smb1/smb1/Q;->E:[B

    add-int/2addr v2, v1

    invoke-virtual {p1, v3, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method protected g()V
    .locals 4

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v1, 0x2

    invoke-static {v0, v1}, LUg/b;->a([BI)S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    add-int/lit8 v1, v0, 0x4

    iget v2, p0, Ljcifs/smb1/smb1/Q;->z:I

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    add-int/lit8 v0, v0, -0x20

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/io/InputStream;->skip(J)J

    :goto_1
    return-void
.end method

.method protected i(LVg/a;)V
    .locals 3

    iget v0, p0, Ljcifs/smb1/smb1/Q;->m:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ljcifs/smb1/smb1/Q;->m:I

    const/16 v2, 0x7d00

    if-ne v0, v2, :cond_0

    iput v1, p0, Ljcifs/smb1/smb1/Q;->m:I

    :cond_0
    check-cast p1, Ljcifs/smb1/smb1/l;

    iget v0, p0, Ljcifs/smb1/smb1/Q;->m:I

    iput v0, p1, Ljcifs/smb1/smb1/l;->m:I

    return-void
.end method

.method protected j()LVg/a;
    .locals 8

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    move-result v0

    const/4 v1, 0x0

    if-ge v0, v3, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->p:[B

    aget-byte v4, v0, v2

    const/16 v5, -0x7b

    if-eq v4, v5, :cond_0

    iget-object v4, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    const/16 v5, 0x20

    invoke-static {v4, v0, v3, v5}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    move-result v0

    if-ge v0, v5, :cond_2

    return-object v1

    :cond_2
    sget v0, LUg/e;->b:I

    if-lt v0, v3, :cond_3

    sget-object v0, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "New data read: "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    iget-object v4, p0, Ljcifs/smb1/smb1/Q;->p:[B

    invoke-static {v0, v4, v3, v5}, LUg/d;->a(Ljava/io/PrintStream;[BII)V

    :cond_3
    :goto_0
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->p:[B

    aget-byte v4, v0, v2

    const/4 v5, -0x1

    if-nez v4, :cond_4

    const/4 v4, 0x1

    aget-byte v4, v0, v4

    if-nez v4, :cond_4

    aget-byte v4, v0, v3

    if-ne v4, v5, :cond_4

    const/4 v4, 0x5

    aget-byte v4, v0, v4

    const/16 v6, 0x53

    if-ne v4, v6, :cond_4

    const/4 v4, 0x6

    aget-byte v4, v0, v4

    const/16 v6, 0x4d

    if-ne v4, v6, :cond_4

    const/4 v4, 0x7

    aget-byte v4, v0, v4

    const/16 v6, 0x42

    if-ne v4, v6, :cond_4

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->q:Ljcifs/smb1/smb1/n;

    const/16 v2, 0x22

    invoke-static {v0, v2}, LUg/b;->b([BI)S

    move-result v0

    const v2, 0xffff

    and-int/2addr v0, v2

    iput v0, v1, Ljcifs/smb1/smb1/l;->m:I

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->q:Ljcifs/smb1/smb1/n;

    return-object v0

    :cond_4
    move v0, v2

    :goto_1
    const/16 v4, 0x23

    if-ge v0, v4, :cond_5

    iget-object v4, p0, Ljcifs/smb1/smb1/Q;->p:[B

    add-int/lit8 v6, v0, 0x1

    aget-byte v7, v4, v6

    aput-byte v7, v4, v0

    move v0, v6

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ne v0, v5, :cond_6

    return-object v1

    :cond_6
    iget-object v5, p0, Ljcifs/smb1/smb1/Q;->p:[B

    int-to-byte v0, v0

    aput-byte v0, v5, v4

    goto :goto_0
.end method

.method m(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    .locals 4

    iget v0, p2, Ljcifs/smb1/smb1/l;->h:I

    invoke-static {v0}, Ljcifs/smb1/smb1/SmbException;->h(I)I

    move-result v0

    iput v0, p2, Ljcifs/smb1/smb1/l;->h:I

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljcifs/smb1/smb1/SmbException;

    iget p2, p2, Ljcifs/smb1/smb1/l;->h:I

    invoke-direct {p1, p2, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(ILjava/lang/Throwable;)V

    throw p1

    :sswitch_0
    iget-object v0, p1, Ljcifs/smb1/smb1/l;->v:Ljcifs/smb1/smb1/k;

    if-eqz v0, :cond_1

    iget-object v2, p1, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {p0, v0, v2, v3}, Ljcifs/smb1/smb1/Q;->q(Ljcifs/smb1/smb1/k;Ljava/lang/String;I)Ljcifs/smb1/smb1/DfsReferral;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljcifs/smb1/smb1/SmbException;

    iget p2, p2, Ljcifs/smb1/smb1/l;->h:I

    invoke-direct {p1, p2, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(ILjava/lang/Throwable;)V

    throw p1

    :cond_0
    sget-object p2, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    iget-object p1, p1, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Ljcifs/smb1/smb1/d;->d(Ljava/lang/String;Ljcifs/smb1/smb1/DfsReferral;)V

    throw v0

    :cond_1
    new-instance p1, Ljcifs/smb1/smb1/SmbException;

    iget p2, p2, Ljcifs/smb1/smb1/l;->h:I

    invoke-direct {p1, p2, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(ILjava/lang/Throwable;)V

    throw p1

    :pswitch_0
    :sswitch_1
    new-instance p1, Ljcifs/smb1/smb1/SmbAuthException;

    iget p2, p2, Ljcifs/smb1/smb1/l;->h:I

    invoke-direct {p1, p2}, Ljcifs/smb1/smb1/SmbAuthException;-><init>(I)V

    throw p1

    :cond_2
    :sswitch_2
    iget-boolean p1, p2, Ljcifs/smb1/smb1/l;->u:Z

    if-nez p1, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljcifs/smb1/smb1/SmbException;

    const-string p2, "Signature verification failed."

    invoke-direct {p1, p2}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ffffffb -> :sswitch_2
        -0x3fffffea -> :sswitch_2
        -0x3fffffde -> :sswitch_1
        -0x3fffff96 -> :sswitch_1
        -0x3ffffe74 -> :sswitch_1
        -0x3ffffdcc -> :sswitch_1
        -0x3ffffda9 -> :sswitch_0
        0x0 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x3fffff93
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public n()V
    .locals 4

    :try_start_0
    sget v0, Ljcifs/smb1/smb1/L;->S0:I

    int-to-long v0, v0

    invoke-super {p0, v0, v1}, LVg/c;->a(J)V
    :try_end_0
    .catch Ljcifs/smb1/util/transport/TransportException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljcifs/smb1/smb1/SmbException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to connect: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method o(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 7

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ne v2, v0, :cond_0

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v0

    return-void

    :cond_0
    if-eq v3, v1, :cond_1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x5c

    if-ne v5, v6, :cond_2

    :cond_1
    add-int/lit8 v5, v2, 0x1

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    aput-object v4, p2, v2

    add-int/lit8 v2, v3, 0x1

    move v4, v2

    move v2, v5

    :cond_2
    add-int/lit8 v5, v3, 0x1

    if-lt v3, v1, :cond_4

    :goto_1
    array-length p1, p2

    if-ge v2, p1, :cond_3

    add-int/lit8 p1, v2, 0x1

    const-string v0, ""

    aput-object v0, p2, v2

    move v2, p1

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    move v3, v5

    goto :goto_0
.end method

.method protected p(LVg/a;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Ljcifs/smb1/smb1/Q;->f(LVg/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget v0, LUg/e;->b:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    sget-object v0, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {p0, v0}, LVg/c;->b(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v1, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :goto_0
    throw p1
.end method

.method q(Ljcifs/smb1/smb1/k;Ljava/lang/String;I)Ljcifs/smb1/smb1/DfsReferral;
    .locals 9

    invoke-virtual {p0, p1}, Ljcifs/smb1/smb1/Q;->r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;

    move-result-object v0

    const-string v1, "IPC$"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljcifs/smb1/smb1/P;->a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;

    move-result-object v0

    new-instance v1, Ljcifs/smb1/smb1/U;

    invoke-direct {v1}, Ljcifs/smb1/smb1/U;-><init>()V

    new-instance v3, Ljcifs/smb1/smb1/T;

    invoke-direct {v3, p2}, Ljcifs/smb1/smb1/T;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Ljcifs/smb1/smb1/S;->b(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    iget v0, v1, Ljcifs/smb1/smb1/U;->m1:I

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    if-eqz p3, :cond_1

    if-ge v0, p3, :cond_2

    :cond_1
    move p3, v0

    :cond_2
    new-instance v0, Ljcifs/smb1/smb1/DfsReferral;

    invoke-direct {v0}, Ljcifs/smb1/smb1/DfsReferral;-><init>()V

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v5, Ljcifs/smb1/smb1/d;->e:J

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    add-long/2addr v3, v5

    const/4 v5, 0x0

    :goto_0
    iget-boolean v6, p1, Ljcifs/smb1/smb1/k;->f:Z

    iput-boolean v6, v0, Ljcifs/smb1/smb1/DfsReferral;->i:Z

    iget-object v6, v1, Ljcifs/smb1/smb1/U;->o1:[Ljcifs/smb1/smb1/U$a;

    aget-object v6, v6, v5

    iget v6, v6, Ljcifs/smb1/smb1/U$a;->j:I

    int-to-long v6, v6

    iput-wide v6, v0, Ljcifs/smb1/smb1/DfsReferral;->d:J

    iput-wide v3, v0, Ljcifs/smb1/smb1/DfsReferral;->j:J

    const-string v6, ""

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_3

    iget-object v6, v1, Ljcifs/smb1/smb1/U;->o1:[Ljcifs/smb1/smb1/U$a;

    aget-object v6, v6, v5

    iget-object v6, v6, Ljcifs/smb1/smb1/U$a;->k:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Ljcifs/smb1/smb1/DfsReferral;->e:Ljava/lang/String;

    goto :goto_1

    :cond_3
    iget-object v6, v1, Ljcifs/smb1/smb1/U;->o1:[Ljcifs/smb1/smb1/U$a;

    aget-object v6, v6, v5

    iget-object v6, v6, Ljcifs/smb1/smb1/U$a;->l:Ljava/lang/String;

    invoke-virtual {p0, v6, v2}, Ljcifs/smb1/smb1/Q;->o(Ljava/lang/String;[Ljava/lang/String;)V

    aget-object v6, v2, v7

    iput-object v6, v0, Ljcifs/smb1/smb1/DfsReferral;->e:Ljava/lang/String;

    const/4 v6, 0x2

    aget-object v6, v2, v6

    iput-object v6, v0, Ljcifs/smb1/smb1/DfsReferral;->f:Ljava/lang/String;

    const/4 v6, 0x3

    aget-object v6, v2, v6

    iput-object v6, v0, Ljcifs/smb1/smb1/DfsReferral;->h:Ljava/lang/String;

    :goto_1
    iget v6, v1, Ljcifs/smb1/smb1/U;->l1:I

    iput v6, v0, Ljcifs/smb1/smb1/DfsReferral;->c:I

    add-int/lit8 v5, v5, 0x1

    if-ne v5, p3, :cond_4

    iget-object p1, v0, Ljcifs/smb1/smb1/DfsReferral;->k:Ljcifs/smb1/smb1/DfsReferral;

    return-object p1

    :cond_4
    new-instance v6, Ljcifs/smb1/smb1/DfsReferral;

    invoke-direct {v6}, Ljcifs/smb1/smb1/DfsReferral;-><init>()V

    invoke-virtual {v0, v6}, Ljcifs/smb1/smb1/DfsReferral;->j(Ljcifs/smb1/smb1/DfsReferral;)V

    iget-object v0, v0, Ljcifs/smb1/smb1/DfsReferral;->k:Ljcifs/smb1/smb1/DfsReferral;

    goto :goto_0
.end method

.method declared-synchronized r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->u:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljcifs/smb1/smb1/P;

    invoke-virtual {v1, p1}, Ljcifs/smb1/smb1/P;->c(Ljcifs/smb1/smb1/k;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p1, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_1
    sget v0, Ljcifs/smb1/smb1/L;->V0:I

    if-lez v0, :cond_3

    iget-wide v1, p0, Ljcifs/smb1/smb1/Q;->r:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_3

    int-to-long v0, v0

    add-long/2addr v0, v3

    iput-wide v0, p0, Ljcifs/smb1/smb1/Q;->r:J

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->u:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljcifs/smb1/smb1/P;

    iget-wide v5, v1, Ljcifs/smb1/smb1/P;->j:J

    cmp-long v2, v5, v3

    if-gez v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljcifs/smb1/smb1/P;->b(Z)V

    goto :goto_0

    :cond_3
    new-instance v6, Ljcifs/smb1/smb1/P;

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    iget v2, p0, Ljcifs/smb1/smb1/Q;->l:I

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    iget v4, p0, Ljcifs/smb1/smb1/Q;->i:I

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ljcifs/smb1/smb1/P;-><init>(LRg/b;ILjava/net/InetAddress;ILjcifs/smb1/smb1/k;)V

    iput-object p0, v6, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->u:Ljava/util/LinkedList;

    invoke-virtual {p1, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v6

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LVg/c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ljcifs/smb1/smb1/Q;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method u(I)Z
    .locals 2

    :try_start_0
    sget v0, Ljcifs/smb1/smb1/L;->S0:I

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, LVg/c;->a(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget v0, p0, Ljcifs/smb1/smb1/Q;->A:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :catch_0
    move-exception p1

    new-instance v0, Ljcifs/smb1/smb1/SmbException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method v(Ljcifs/smb1/smb1/k;)Z
    .locals 1

    iget v0, p0, Ljcifs/smb1/smb1/Q;->w:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    if-nez v0, :cond_0

    sget-object v0, Ljcifs/smb1/smb1/k;->q:Ljcifs/smb1/smb1/k;

    if-eq p1, v0, :cond_0

    invoke-virtual {v0, p1}, Ljcifs/smb1/smb1/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method w(LRg/b;ILjava/net/InetAddress;ILjava/lang/String;)Z
    .locals 1

    if-nez p5, :cond_0

    invoke-virtual {p1}, LRg/b;->g()Ljava/lang/String;

    move-result-object p5

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_4

    :cond_1
    iget-object p5, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {p1, p5}, LRg/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p2, :cond_2

    iget p1, p0, Ljcifs/smb1/smb1/Q;->l:I

    if-eq p2, p1, :cond_2

    const/16 p5, 0x1bd

    if-ne p2, p5, :cond_4

    const/16 p2, 0x8b

    if-ne p1, p2, :cond_4

    :cond_2
    iget-object p1, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    if-eq p3, p1, :cond_3

    if-eqz p3, :cond_4

    invoke-virtual {p3, p1}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    iget p1, p0, Ljcifs/smb1/smb1/Q;->i:I

    if-ne p4, p1, :cond_4

    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method y(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    .locals 6

    invoke-virtual {p0}, Ljcifs/smb1/smb1/Q;->n()V

    iget v0, p1, Ljcifs/smb1/smb1/l;->i:I

    iget v1, p0, Ljcifs/smb1/smb1/Q;->w:I

    or-int/2addr v0, v1

    iput v0, p1, Ljcifs/smb1/smb1/l;->i:I

    iget-boolean v0, p0, Ljcifs/smb1/smb1/Q;->C:Z

    iput-boolean v0, p1, Ljcifs/smb1/smb1/l;->p:Z

    iput-object p2, p1, Ljcifs/smb1/smb1/l;->y:Ljcifs/smb1/smb1/l;

    iget-object v0, p1, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    if-nez v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    iput-object v0, p1, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    :cond_0
    if-nez p2, :cond_1

    :try_start_0
    invoke-virtual {p0, p1}, Ljcifs/smb1/smb1/Q;->p(LVg/a;)V

    return-void

    :catch_0
    move-exception p1

    goto/16 :goto_9

    :catch_1
    move-exception p1

    goto/16 :goto_a

    :cond_1
    instance-of v0, p1, Ljcifs/smb1/smb1/C;

    if-eqz v0, :cond_9

    iget-byte v0, p1, Ljcifs/smb1/smb1/l;->c:B

    iput-byte v0, p2, Ljcifs/smb1/smb1/l;->c:B

    move-object v0, p1

    check-cast v0, Ljcifs/smb1/smb1/C;

    move-object v1, p2

    check-cast v1, Ljcifs/smb1/smb1/D;

    iget v2, p0, Ljcifs/smb1/smb1/Q;->y:I

    iput v2, v0, Ljcifs/smb1/smb1/C;->q1:I

    invoke-virtual {v1}, Ljcifs/smb1/smb1/D;->t()V
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v0, v1}, Ljcifs/smb1/smb1/c;->b(Ljcifs/smb1/smb1/C;Ljcifs/smb1/smb1/D;)V

    invoke-virtual {v0}, Ljcifs/smb1/smb1/C;->nextElement()Ljava/lang/Object;

    invoke-virtual {v0}, Ljcifs/smb1/smb1/C;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljcifs/smb1/smb1/n;

    invoke-direct {v2}, Ljcifs/smb1/smb1/n;-><init>()V

    sget v3, Ljcifs/smb1/smb1/L;->S0:I

    int-to-long v3, v3

    invoke-super {p0, v0, v2, v3, v4}, LVg/c;->l(LVg/a;LVg/b;J)V

    iget v3, v2, Ljcifs/smb1/smb1/l;->h:I

    if-eqz v3, :cond_2

    invoke-virtual {p0, v0, v2}, Ljcifs/smb1/smb1/Q;->m(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljcifs/smb1/smb1/C;->nextElement()Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0}, Ljcifs/smb1/smb1/Q;->i(LVg/a;)V

    :goto_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x0

    :try_start_2
    iput-boolean v2, p2, Ljcifs/smb1/smb1/l;->q:Z

    iput-boolean v2, v1, LVg/b;->b:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v2, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p0, v0}, Ljcifs/smb1/smb1/Q;->p(LVg/a;)V

    invoke-virtual {v0}, Ljcifs/smb1/smb1/C;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljcifs/smb1/smb1/C;->nextElement()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception p1

    goto :goto_4

    :cond_5
    :goto_2
    sget v2, Ljcifs/smb1/smb1/L;->S0:I

    int-to-long v2, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    add-long/2addr v4, v2

    iput-wide v4, v1, LVg/b;->a:J

    :goto_3
    invoke-virtual {v1}, Ljcifs/smb1/smb1/D;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V

    iget-wide v2, v1, LVg/b;->a:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Ljcifs/smb1/util/transport/TransportException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " timedout waiting for response to "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget v2, p2, Ljcifs/smb1/smb1/l;->h:I

    if-eqz v2, :cond_8

    invoke-virtual {p0, v0, v1}, Ljcifs/smb1/smb1/Q;->m(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_8
    :try_start_4
    iget-object v2, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iget-object v0, v0, Ljcifs/smb1/smb1/C;->r1:[B

    invoke-static {v0}, Ljcifs/smb1/smb1/c;->c([B)V

    iget-object v0, v1, Ljcifs/smb1/smb1/D;->k1:[B

    invoke-static {v0}, Ljcifs/smb1/smb1/c;->c([B)V
    :try_end_5
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_8

    :catchall_2
    move-exception p1

    goto :goto_6

    :goto_4
    :try_start_6
    new-instance p2, Ljcifs/smb1/util/transport/TransportException;

    invoke-direct {p2, p1}, Ljcifs/smb1/util/transport/TransportException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_5
    :try_start_7
    iget-object p2, p0, LVg/c;->e:Ljava/util/HashMap;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1

    :goto_6
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_7
    :try_start_9
    iget-object p2, v0, Ljcifs/smb1/smb1/C;->r1:[B

    invoke-static {p2}, Ljcifs/smb1/smb1/c;->c([B)V

    iget-object p2, v1, Ljcifs/smb1/smb1/D;->k1:[B

    invoke-static {p2}, Ljcifs/smb1/smb1/c;->c([B)V

    throw p1

    :cond_9
    iget-byte v0, p1, Ljcifs/smb1/smb1/l;->c:B

    iput-byte v0, p2, Ljcifs/smb1/smb1/l;->c:B

    sget v0, Ljcifs/smb1/smb1/L;->S0:I

    int-to-long v0, v0

    invoke-super {p0, p1, p2, v0, v1}, LVg/c;->l(LVg/a;LVg/b;J)V
    :try_end_9
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    :goto_8
    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/Q;->m(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    return-void

    :goto_9
    new-instance p2, Ljcifs/smb1/smb1/SmbException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_a
    throw p1
.end method

.method z()V
    .locals 7

    new-instance v0, LSg/b;

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v1}, LRg/b;->a()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x20

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    :goto_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->h:Ljava/net/InetAddress;

    iget v4, p0, Ljcifs/smb1/smb1/Q;->i:I

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v1, v2}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    :cond_0
    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    new-instance v2, Ljava/net/InetSocketAddress;

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v3}, LRg/b;->f()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x8b

    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    sget v3, Ljcifs/smb1/smb1/L;->W0:I

    invoke-virtual {v1, v2, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    sget v2, Ljcifs/smb1/smb1/L;->V0:I

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iput-object v1, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    new-instance v1, LSg/j;

    invoke-static {}, LSg/g;->n()LSg/b;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LSg/j;-><init>(LSg/b;LSg/b;)V

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->n:Ljava/io/OutputStream;

    iget-object v3, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, LSg/k;->d([BI)I

    move-result v1

    invoke-virtual {v2, v3, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->p:[B

    const/4 v3, 0x4

    invoke-static {v1, v2, v4, v3}, LVg/c;->k(Ljava/io/InputStream;[BII)I

    move-result v1

    if-lt v1, v3, :cond_8

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->p:[B

    aget-byte v1, v1, v4

    and-int/lit16 v1, v1, 0xff

    const/4 v2, -0x1

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v1, v2, :cond_7

    const/16 v2, 0x82

    if-eq v1, v2, :cond_5

    const/16 v3, 0x83

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->o:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    const/16 v3, 0x80

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v6}, LVg/c;->b(Z)V

    new-instance v0, Ljcifs/smb1/netbios/NbtException;

    invoke-direct {v0, v5, v1}, Ljcifs/smb1/netbios/NbtException;-><init>(II)V

    throw v0

    :cond_2
    :goto_1
    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V

    iget-object v1, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v1}, LRg/b;->k()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LSg/b;->a:Ljava/lang/String;

    if-eqz v1, :cond_3

    goto/16 :goto_0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to establish session with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0, v6}, LVg/c;->b(Z)V

    new-instance v0, Ljcifs/smb1/netbios/NbtException;

    invoke-direct {v0, v5, v4}, Ljcifs/smb1/netbios/NbtException;-><init>(II)V

    throw v0

    :cond_5
    sget v0, LUg/e;->b:I

    if-lt v0, v3, :cond_6

    sget-object v0, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "session established ok with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/Q;->j:LRg/b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_6
    return-void

    :cond_7
    invoke-virtual {p0, v6}, LVg/c;->b(Z)V

    new-instance v0, Ljcifs/smb1/netbios/NbtException;

    invoke-direct {v0, v5, v2}, Ljcifs/smb1/netbios/NbtException;-><init>(II)V

    throw v0

    :cond_8
    :try_start_0
    iget-object v0, p0, Ljcifs/smb1/smb1/Q;->k:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v0, Ljcifs/smb1/smb1/SmbException;

    const-string v1, "EOF during NetBIOS session request"

    invoke-direct {v0, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
