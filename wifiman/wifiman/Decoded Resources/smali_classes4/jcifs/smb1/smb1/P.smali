.class public final Ljcifs/smb1/smb1/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final l:Ljava/lang/String;

.field private static final m:I

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field private static final p:I

.field static q:[LSg/g;


# instance fields
.field a:I

.field b:I

.field c:Ljava/util/Vector;

.field private d:LRg/b;

.field private e:I

.field private f:I

.field private g:Ljava/net/InetAddress;

.field h:Ljcifs/smb1/smb1/Q;

.field i:Ljcifs/smb1/smb1/k;

.field j:J

.field k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "jcifs.smb1.smb.client.logonShare"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/P;->l:Ljava/lang/String;

    const-string v0, "jcifs.smb1.netbios.lookupRespLimit"

    const/4 v2, 0x3

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/P;->m:I

    const-string v0, "jcifs.smb1.smb.client.domain"

    invoke-static {v0, v1}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/P;->n:Ljava/lang/String;

    const-string v0, "jcifs.smb1.smb.client.username"

    invoke-static {v0, v1}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/P;->o:Ljava/lang/String;

    const-string v0, "jcifs.smb1.netbios.cachePolicy"

    const/16 v2, 0x258

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    sput v0, Ljcifs/smb1/smb1/P;->p:I

    sput-object v1, Ljcifs/smb1/smb1/P;->q:[LSg/g;

    return-void
.end method

.method constructor <init>(LRg/b;ILjava/net/InetAddress;ILjcifs/smb1/smb1/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iput-object v0, p0, Ljcifs/smb1/smb1/P;->k:Ljava/lang/String;

    iput-object p1, p0, Ljcifs/smb1/smb1/P;->d:LRg/b;

    iput p2, p0, Ljcifs/smb1/smb1/P;->e:I

    iput-object p3, p0, Ljcifs/smb1/smb1/P;->g:Ljava/net/InetAddress;

    iput p4, p0, Ljcifs/smb1/smb1/P;->f:I

    iput-object p5, p0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    new-instance p1, Ljava/util/Vector;

    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    iput-object p1, p0, Ljcifs/smb1/smb1/P;->c:Ljava/util/Vector;

    const/4 p1, 0x0

    iput p1, p0, Ljcifs/smb1/smb1/P;->a:I

    return-void
.end method


# virtual methods
.method declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;
    .locals 3

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, "IPC$"

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Ljcifs/smb1/smb1/P;->c:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljcifs/smb1/smb1/S;

    invoke-virtual {v1, p1, p2}, Ljcifs/smb1/smb1/S;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    monitor-exit p0

    return-object v1

    :cond_2
    :try_start_1
    new-instance v0, Ljcifs/smb1/smb1/S;

    invoke-direct {v0, p0, p1, p2}, Ljcifs/smb1/smb1/S;-><init>(Ljcifs/smb1/smb1/P;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ljcifs/smb1/smb1/P;->c:Ljava/util/Vector;

    invoke-virtual {p1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method b(Z)V
    .locals 4

    invoke-virtual {p0}, Ljcifs/smb1/smb1/P;->f()Ljcifs/smb1/smb1/Q;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ljcifs/smb1/smb1/P;->a:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x3

    iput v1, p0, Ljcifs/smb1/smb1/P;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Ljcifs/smb1/smb1/P;->k:Ljava/lang/String;

    iget-object v2, p0, Ljcifs/smb1/smb1/P;->c:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljcifs/smb1/smb1/S;

    invoke-virtual {v3, p1}, Ljcifs/smb1/smb1/S;->d(Z)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object p1, p1, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget p1, p1, Ljcifs/smb1/smb1/Q$a;->g:I

    if-eqz p1, :cond_2

    new-instance p1, Ljcifs/smb1/smb1/p;

    invoke-direct {p1, v1}, Ljcifs/smb1/smb1/p;-><init>(Ljcifs/smb1/smb1/l;)V

    iget v3, p0, Ljcifs/smb1/smb1/P;->b:I

    iput v3, p1, Ljcifs/smb1/smb1/l;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v3, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v3, p1, v1}, Ljcifs/smb1/smb1/Q;->y(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_1
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    iput v2, p0, Ljcifs/smb1/smb1/P;->b:I

    :cond_2
    iput v2, p0, Ljcifs/smb1/smb1/P;->a:I

    iget-object p1, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method c(Ljcifs/smb1/smb1/k;)Z
    .locals 1

    iget-object v0, p0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    if-eq v0, p1, :cond_1

    invoke-virtual {v0, p1}, Ljcifs/smb1/smb1/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method d(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    .locals 5

    invoke-virtual {p0}, Ljcifs/smb1/smb1/P;->f()Ljcifs/smb1/smb1/Q;

    move-result-object v0

    monitor-enter v0

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p2, Ljcifs/smb1/smb1/l;->q:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget v3, Ljcifs/smb1/smb1/L;->V0:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Ljcifs/smb1/smb1/P;->j:J

    invoke-virtual {p0, p1, p2}, Ljcifs/smb1/smb1/P;->e(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    if-eqz p2, :cond_1

    iget-boolean v1, p2, Ljcifs/smb1/smb1/l;->q:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    instance-of v1, p1, Ljcifs/smb1/smb1/E;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ljcifs/smb1/smb1/E;

    iget-object v2, p0, Ljcifs/smb1/smb1/P;->k:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, v1, Ljcifs/smb1/smb1/E;->J:Ljava/lang/String;

    const-string v3, "\\IPC$"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\\\\"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ljcifs/smb1/smb1/P;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\\IPC$"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ljcifs/smb1/smb1/E;->J:Ljava/lang/String;

    :cond_2
    iget v1, p0, Ljcifs/smb1/smb1/P;->b:I

    iput v1, p1, Ljcifs/smb1/smb1/l;->l:I

    iget-object v1, p0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iput-object v1, p1, Ljcifs/smb1/smb1/l;->v:Ljcifs/smb1/smb1/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v1, p1, p2}, Ljcifs/smb1/smb1/Q;->y(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_1
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-void

    :catch_0
    move-exception p2

    instance-of v1, p1, Ljcifs/smb1/smb1/E;

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljcifs/smb1/smb1/P;->b(Z)V

    :cond_3
    const/4 v1, 0x0

    iput-object v1, p1, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    throw p2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method e(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    .locals 16

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Ljcifs/smb1/smb1/P;->f()Ljcifs/smb1/smb1/Q;

    move-result-object v2

    monitor-enter v2

    const/4 v3, 0x0

    :try_start_0
    new-array v0, v3, [B

    :goto_0
    iget v4, v1, Ljcifs/smb1/smb1/P;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x2

    if-eqz v4, :cond_2

    if-eq v4, v5, :cond_1

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v4, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_11

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v3, Ljcifs/smb1/smb1/SmbException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :cond_1
    :goto_1
    monitor-exit v2

    return-void

    :cond_2
    const/4 v4, 0x1

    iput v4, v1, Ljcifs/smb1/smb1/P;->a:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v6, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v6}, Ljcifs/smb1/smb1/Q;->n()V

    sget-object v6, Ljcifs/smb1/smb1/Q;->E:[B

    sget v6, LUg/e;->b:I
    :try_end_3
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v7, 0x4

    if-lt v6, v7, :cond_3

    :try_start_4
    sget-object v6, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "sessionSetup: accountName="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v9, v9, Ljcifs/smb1/smb1/k;->b:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ",primaryDomain="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v9, v9, Ljcifs/smb1/smb1/k;->a:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_4
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_10

    :catch_1
    move-exception v0

    goto/16 :goto_f

    :cond_3
    :goto_2
    :try_start_5
    iput v3, v1, Ljcifs/smb1/smb1/P;->b:I
    :try_end_5
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const/16 v6, 0xa

    const/4 v8, 0x0

    move-object v9, v0

    move v10, v6

    move-object v0, v8

    move-object v11, v0

    :goto_3
    const v12, -0x3fffff93    # -2.000026f

    const/16 v13, 0x14

    if-eq v10, v6, :cond_f

    if-ne v10, v13, :cond_e

    if-nez v11, :cond_5

    :try_start_6
    iget-object v11, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget v11, v11, Ljcifs/smb1/smb1/Q;->w:I

    and-int/2addr v11, v7

    if-eqz v11, :cond_4

    move v11, v4

    goto :goto_4

    :cond_4
    move v11, v3

    :goto_4
    new-instance v13, Ljcifs/smb1/smb1/j;

    iget-object v14, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    invoke-direct {v13, v14, v11}, Ljcifs/smb1/smb1/j;-><init>(Ljcifs/smb1/smb1/k;Z)V

    move-object v11, v13

    :cond_5
    sget-object v13, Ljcifs/smb1/smb1/Q;->E:[B

    sget v13, LUg/e;->b:I

    if-lt v13, v7, :cond_6

    sget-object v13, Ljcifs/smb1/smb1/Q;->G:LUg/e;

    invoke-virtual {v13, v11}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v11}, Ljcifs/smb1/smb1/j;->d()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-virtual {v11}, Ljcifs/smb1/smb1/j;->a()Ljava/lang/String;

    move-result-object v10

    iput-object v10, v1, Ljcifs/smb1/smb1/P;->k:Ljava/lang/String;

    iput v5, v1, Ljcifs/smb1/smb1/P;->a:I
    :try_end_6
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    :goto_5
    move v10, v3

    goto/16 :goto_d

    :cond_7
    :try_start_7
    array-length v13, v9

    invoke-virtual {v11, v9, v3, v13}, Ljcifs/smb1/smb1/j;->c([BII)[B

    move-result-object v9
    :try_end_7
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v9, :cond_c

    :try_start_8
    new-instance v13, Ljcifs/smb1/smb1/A;

    invoke-direct {v13, v1, v8, v9}, Ljcifs/smb1/smb1/A;-><init>(Ljcifs/smb1/smb1/P;Ljcifs/smb1/smb1/l;Ljava/lang/Object;)V

    new-instance v9, Ljcifs/smb1/smb1/B;

    invoke-direct {v9, v8}, Ljcifs/smb1/smb1/B;-><init>(Ljcifs/smb1/smb1/l;)V

    iget-object v14, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v15, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    invoke-virtual {v14, v15}, Ljcifs/smb1/smb1/Q;->v(Ljcifs/smb1/smb1/k;)Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-virtual {v11}, Ljcifs/smb1/smb1/j;->b()[B

    move-result-object v14

    if-eqz v14, :cond_8

    new-instance v15, Ljcifs/smb1/smb1/m;

    invoke-direct {v15, v14, v4}, Ljcifs/smb1/smb1/m;-><init>([BZ)V

    iput-object v15, v13, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    :cond_8
    iget v14, v1, Ljcifs/smb1/smb1/P;->b:I

    iput v14, v13, Ljcifs/smb1/smb1/l;->l:I

    iput v3, v1, Ljcifs/smb1/smb1/P;->b:I
    :try_end_8
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    iget-object v14, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v14, v13, v9}, Ljcifs/smb1/smb1/Q;->y(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_9
    .catch Ljcifs/smb1/smb1/SmbAuthException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_7

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_9

    :goto_6
    :try_start_a
    iget-object v14, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v14, v4}, LVg/c;->b(Z)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catch_4
    :goto_7
    :try_start_b
    iget-boolean v14, v9, Ljcifs/smb1/smb1/B;->H:Z

    if-eqz v14, :cond_a

    const-string v14, "GUEST"

    iget-object v15, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v15, v15, Ljcifs/smb1/smb1/k;->b:Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_9

    goto :goto_8

    :cond_9
    new-instance v0, Ljcifs/smb1/smb1/SmbAuthException;

    invoke-direct {v0, v12}, Ljcifs/smb1/smb1/SmbAuthException;-><init>(I)V

    throw v0

    :cond_a
    :goto_8
    if-nez v0, :cond_d

    iget v12, v9, Ljcifs/smb1/smb1/l;->l:I

    iput v12, v1, Ljcifs/smb1/smb1/P;->b:I

    iget-object v12, v13, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    if-eqz v12, :cond_b

    iget-object v13, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iput-object v12, v13, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    :cond_b
    iget-object v9, v9, Ljcifs/smb1/smb1/B;->I:[B

    :cond_c
    move-object/from16 v14, p1

    move-object/from16 v15, p2

    goto/16 :goto_d

    :cond_d
    throw v0

    :goto_9
    throw v0
    :try_end_b
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :catch_5
    move-exception v0

    :try_start_c
    iget-object v5, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v5, v4}, LVg/c;->b(Z)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :catch_6
    :try_start_d
    iput v3, v1, Ljcifs/smb1/smb1/P;->b:I

    throw v0

    :cond_e
    new-instance v0, Ljcifs/smb1/smb1/SmbException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected session setup state: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :cond_f
    :try_start_e
    iget-object v10, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    sget-object v14, Ljcifs/smb1/smb1/k;->p:Ljcifs/smb1/smb1/k;
    :try_end_e
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    if-eq v10, v14, :cond_10

    :try_start_f
    iget-object v10, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    const/high16 v14, -0x80000000

    invoke-virtual {v10, v14}, Ljcifs/smb1/smb1/Q;->u(I)Z

    move-result v10
    :try_end_f
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    if-eqz v10, :cond_10

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move v10, v13

    goto/16 :goto_d

    :cond_10
    :try_start_10
    new-instance v10, Ljcifs/smb1/smb1/A;

    iget-object v13, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    move-object/from16 v14, p1

    invoke-direct {v10, v1, v14, v13}, Ljcifs/smb1/smb1/A;-><init>(Ljcifs/smb1/smb1/P;Ljcifs/smb1/smb1/l;Ljava/lang/Object;)V

    new-instance v13, Ljcifs/smb1/smb1/B;

    move-object/from16 v15, p2

    invoke-direct {v13, v15}, Ljcifs/smb1/smb1/B;-><init>(Ljcifs/smb1/smb1/l;)V

    iget-object v6, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v7, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    invoke-virtual {v6, v7}, Ljcifs/smb1/smb1/Q;->v(Ljcifs/smb1/smb1/k;)Z

    move-result v6

    if-eqz v6, :cond_12

    iget-object v6, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-boolean v7, v6, Ljcifs/smb1/smb1/k;->f:Z

    if-eqz v7, :cond_11

    sget-object v7, Ljcifs/smb1/smb1/k;->o:Ljava/lang/String;

    const-string v4, ""

    if-eq v7, v4, :cond_11

    iget-object v4, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    sget-object v6, Ljcifs/smb1/smb1/k;->s:Ljcifs/smb1/smb1/k;

    invoke-virtual {v4, v6}, Ljcifs/smb1/smb1/Q;->r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;

    move-result-object v4

    sget-object v6, Ljcifs/smb1/smb1/P;->l:Ljava/lang/String;

    invoke-virtual {v4, v6, v8}, Ljcifs/smb1/smb1/P;->a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;

    move-result-object v4

    invoke-virtual {v4, v8, v8}, Ljcifs/smb1/smb1/S;->c(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    goto :goto_a

    :catch_7
    move-exception v0

    const/4 v4, 0x1

    goto :goto_f

    :cond_11
    iget-object v4, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v4, v4, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget-object v4, v4, Ljcifs/smb1/smb1/Q$a;->p:[B

    invoke-virtual {v6, v4}, Ljcifs/smb1/smb1/k;->p([B)[B

    move-result-object v4

    new-instance v6, Ljcifs/smb1/smb1/m;

    invoke-direct {v6, v4, v3}, Ljcifs/smb1/smb1/m;-><init>([BZ)V

    iput-object v6, v10, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    :cond_12
    :goto_a
    iget-object v4, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iput-object v4, v10, Ljcifs/smb1/smb1/l;->v:Ljcifs/smb1/smb1/k;
    :try_end_10
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :try_start_11
    iget-object v4, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v4, v10, v13}, Ljcifs/smb1/smb1/Q;->y(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_11
    .catch Ljcifs/smb1/smb1/SmbAuthException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    goto :goto_b

    :catch_8
    move-exception v0

    goto :goto_b

    :catch_9
    move-exception v0

    goto :goto_e

    :goto_b
    :try_start_12
    iget-boolean v4, v13, Ljcifs/smb1/smb1/B;->H:Z

    if-eqz v4, :cond_14

    const-string v4, "GUEST"

    iget-object v6, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v6, v6, Ljcifs/smb1/smb1/k;->b:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_14

    iget-object v4, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v4, v4, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v4, v4, Ljcifs/smb1/smb1/Q$a;->g:I

    if-eqz v4, :cond_14

    iget-object v4, v1, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    sget-object v6, Ljcifs/smb1/smb1/k;->p:Ljcifs/smb1/smb1/k;

    if-ne v4, v6, :cond_13

    goto :goto_c

    :cond_13
    new-instance v0, Ljcifs/smb1/smb1/SmbAuthException;

    invoke-direct {v0, v12}, Ljcifs/smb1/smb1/SmbAuthException;-><init>(I)V

    throw v0

    :cond_14
    :goto_c
    if-nez v0, :cond_17

    iget v4, v13, Ljcifs/smb1/smb1/l;->l:I

    iput v4, v1, Ljcifs/smb1/smb1/P;->b:I

    iget-object v4, v10, Ljcifs/smb1/smb1/l;->x:Ljcifs/smb1/smb1/m;

    if-eqz v4, :cond_15

    iget-object v6, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iput-object v4, v6, Ljcifs/smb1/smb1/Q;->t:Ljcifs/smb1/smb1/m;

    :cond_15
    iput v5, v1, Ljcifs/smb1/smb1/P;->a:I
    :try_end_12
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    goto/16 :goto_5

    :goto_d
    if-nez v10, :cond_16

    :try_start_13
    iget-object v0, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    return-void

    :cond_16
    const/4 v4, 0x1

    const/16 v6, 0xa

    const/4 v7, 0x4

    goto/16 :goto_3

    :cond_17
    :try_start_14
    throw v0

    :goto_e
    throw v0
    :try_end_14
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    :goto_f
    :try_start_15
    invoke-virtual {v1, v4}, Ljcifs/smb1/smb1/P;->b(Z)V

    iput v3, v1, Ljcifs/smb1/smb1/P;->a:I

    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    :goto_10
    :try_start_16
    iget-object v3, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    throw v0

    :goto_11
    monitor-exit v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    throw v0
.end method

.method declared-synchronized f()Ljcifs/smb1/smb1/Q;
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    if-nez v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/P;->d:LRg/b;

    iget v1, p0, Ljcifs/smb1/smb1/P;->e:I

    iget-object v2, p0, Ljcifs/smb1/smb1/P;->g:Ljava/net/InetAddress;

    iget v3, p0, Ljcifs/smb1/smb1/P;->f:I

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Ljcifs/smb1/smb1/Q;->t(LRg/b;ILjava/net/InetAddress;ILjava/lang/String;)Ljcifs/smb1/smb1/Q;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SmbSession[accountName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v1, v1, Ljcifs/smb1/smb1/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",primaryDomain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljcifs/smb1/smb1/P;->i:Ljcifs/smb1/smb1/k;

    iget-object v1, v1, Ljcifs/smb1/smb1/k;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ljcifs/smb1/smb1/P;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",connectionState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ljcifs/smb1/smb1/P;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
