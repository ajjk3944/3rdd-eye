.class public final LSg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSg/g$a;
    }
.end annotation


# static fields
.field static final l:[Ljava/net/InetAddress;

.field private static final m:LSg/e;

.field private static final n:I

.field private static o:I

.field private static final p:Ljava/util/HashMap;

.field private static final q:Ljava/util/HashMap;

.field static final r:LSg/b;

.field static final s:LSg/g;

.field static final t:[B

.field static u:LSg/g;


# instance fields
.field a:LSg/b;

.field b:I

.field c:I

.field d:Z

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field i:Z

.field j:[B

.field k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/net/InetAddress;

    const-string v2, "jcifs.smb1.netbios.wins"

    const-string v3, ","

    invoke-static {v2, v3, v1}, LRg/a;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/net/InetAddress;)[Ljava/net/InetAddress;

    move-result-object v1

    sput-object v1, LSg/g;->l:[Ljava/net/InetAddress;

    new-instance v1, LSg/e;

    invoke-direct {v1}, LSg/e;-><init>()V

    sput-object v1, LSg/g;->m:LSg/e;

    const-string v2, "jcifs.smb1.netbios.cachePolicy"

    const/16 v3, 0x1e

    invoke-static {v2, v3}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v2

    sput v2, LSg/g;->n:I

    sput v0, LSg/g;->o:I

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, LSg/g;->p:Ljava/util/HashMap;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    sput-object v3, LSg/g;->q:Ljava/util/HashMap;

    new-instance v3, LSg/b;

    const-string v4, "0.0.0.0"

    const/4 v5, 0x0

    invoke-direct {v3, v4, v0, v5}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, LSg/g;->r:LSg/b;

    new-instance v4, LSg/g;

    invoke-direct {v4, v3, v0, v0, v0}, LSg/g;-><init>(LSg/b;IZI)V

    sput-object v4, LSg/g;->s:LSg/g;

    const/4 v6, 0x6

    new-array v6, v6, [B

    fill-array-data v6, :array_0

    sput-object v6, LSg/g;->t:[B

    new-instance v6, LSg/g$a;

    const-wide/16 v7, -0x1

    invoke-direct {v6, v3, v4, v7, v8}, LSg/g$a;-><init>(LSg/b;LSg/g;J)V

    invoke-virtual {v2, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v1, LSg/e;->m:Ljava/net/InetAddress;

    if-nez v1, :cond_0

    :try_start_0
    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v1
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    const-string v2, "127.0.0.1"

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_0
    :goto_0
    const-string v2, "jcifs.smb1.netbios.hostname"

    invoke-static {v2, v5}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    invoke-virtual {v1}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JCIFS"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    aget-byte v6, v2, v4

    and-int/lit16 v6, v6, 0xff

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "_"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v9, 0x3

    aget-byte v2, v2, v9

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v9

    const-wide v11, 0x406fe00000000000L    # 255.0

    mul-double/2addr v9, v11

    double-to-int v2, v9

    invoke-static {v2, v4}, LUg/d;->c(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    new-instance v3, LSg/b;

    const-string v4, "jcifs.smb1.netbios.scope"

    invoke-static {v4, v5}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v0, v4}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, LSg/g;

    invoke-virtual {v1}, Ljava/net/InetAddress;->hashCode()I

    move-result v11

    const/16 v17, 0x0

    sget-object v18, LSg/g;->t:[B

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    move-object v9, v0

    move-object v10, v3

    invoke-direct/range {v9 .. v18}, LSg/g;-><init>(LSg/b;IZIZZZZ[B)V

    sput-object v0, LSg/g;->u:LSg/g;

    invoke-static {v3, v0, v7, v8}, LSg/g;->b(LSg/b;LSg/g;J)V

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method constructor <init>(LSg/b;IZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LSg/g;->a:LSg/b;

    .line 3
    iput p2, p0, LSg/g;->b:I

    .line 4
    iput-boolean p3, p0, LSg/g;->d:Z

    .line 5
    iput p4, p0, LSg/g;->c:I

    return-void
.end method

.method constructor <init>(LSg/b;IZIZZZZ[B)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LSg/g;->a:LSg/b;

    .line 8
    iput p2, p0, LSg/g;->b:I

    .line 9
    iput-boolean p3, p0, LSg/g;->d:Z

    .line 10
    iput p4, p0, LSg/g;->c:I

    .line 11
    iput-boolean p5, p0, LSg/g;->e:Z

    .line 12
    iput-boolean p6, p0, LSg/g;->f:Z

    .line 13
    iput-boolean p7, p0, LSg/g;->g:Z

    .line 14
    iput-boolean p8, p0, LSg/g;->h:Z

    .line 15
    iput-object p9, p0, LSg/g;->j:[B

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, LSg/g;->i:Z

    return-void
.end method

.method static a(LSg/b;LSg/g;)V
    .locals 5

    sget v0, LSg/g;->n:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v3, v0

    add-long/2addr v1, v3

    goto :goto_0

    :cond_1
    const-wide/16 v1, -0x1

    :goto_0
    invoke-static {p0, p1, v1, v2}, LSg/g;->b(LSg/b;LSg/g;J)V

    return-void
.end method

.method static b(LSg/b;LSg/g;J)V
    .locals 2

    sget v0, LSg/g;->n:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LSg/g;->p:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LSg/g$a;

    if-nez v1, :cond_1

    new-instance v1, LSg/g$a;

    invoke-direct {v1, p0, p1, p2, p3}, LSg/g$a;-><init>(LSg/b;LSg/g;J)V

    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    iput-object p1, v1, LSg/g$a;->b:LSg/g;

    iput-wide p2, v1, LSg/g$a;->c:J

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static c(LSg/b;)Ljava/lang/Object;
    .locals 3

    sget-object v0, LSg/g;->q:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    :cond_0
    :goto_0
    sget-object v1, LSg/g;->q:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {p0}, LSg/g;->i(LSg/b;)LSg/g;

    move-result-object v0

    if-nez v0, :cond_2

    monitor-enter v1

    :try_start_3
    invoke-virtual {v1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    goto :goto_1

    :catchall_1
    move-exception p0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    :cond_2
    :goto_1
    return-object v0

    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p0
.end method

.method static d(LSg/b;Ljava/net/InetAddress;)LSg/g;
    .locals 2

    iget v0, p0, LSg/b;->c:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    if-nez p1, :cond_0

    sget-object p1, LSg/g;->m:LSg/e;

    iget-object p1, p1, LSg/e;->n:Ljava/net/InetAddress;

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/net/InetAddress;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, LSg/b;->d:I

    invoke-static {p0}, LSg/g;->i(LSg/b;)LSg/g;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p0}, LSg/g;->c(LSg/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSg/g;

    if-nez v0, :cond_2

    :try_start_0
    sget-object v1, LSg/g;->m:LSg/e;

    invoke-virtual {v1, p0, p1}, LSg/e;->b(LSg/b;Ljava/net/InetAddress;)LSg/g;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-static {p0, v0}, LSg/g;->a(LSg/b;LSg/g;)V

    invoke-static {p0}, LSg/g;->t(LSg/b;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :try_start_1
    sget-object v0, LSg/g;->s:LSg/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_2
    invoke-static {p0, v0}, LSg/g;->a(LSg/b;LSg/g;)V

    invoke-static {p0}, LSg/g;->t(LSg/b;)V

    throw p1

    :cond_2
    :goto_3
    sget-object p1, LSg/g;->s:LSg/g;

    if-eq v0, p1, :cond_3

    return-object v0

    :cond_3
    new-instance p1, Ljava/net/UnknownHostException;

    invoke-virtual {p0}, LSg/b;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static f(Ljava/lang/String;)LSg/g;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LSg/g;->g(Ljava/lang/String;ILjava/lang/String;)LSg/g;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/String;ILjava/lang/String;)LSg/g;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, LSg/g;->h(Ljava/lang/String;ILjava/lang/String;Ljava/net/InetAddress;)LSg/g;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;ILjava/lang/String;Ljava/net/InetAddress;)LSg/g;
    .locals 10

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, LSg/b;

    invoke-direct {v0, p0, p1, p2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0, p3}, LSg/g;->d(LSg/b;Ljava/net/InetAddress;)LSg/g;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    move v2, v0

    move v3, v2

    move v4, v3

    :goto_0
    array-length v5, v1

    if-ge v2, v5, :cond_9

    aget-char v5, v1, v2

    const/16 v6, 0x30

    if-lt v5, v6, :cond_8

    const/16 v7, 0x39

    if-le v5, v7, :cond_2

    goto :goto_4

    :cond_2
    move v8, v0

    :goto_1
    const/16 v9, 0x2e

    if-eq v5, v9, :cond_6

    if-lt v5, v6, :cond_5

    if-le v5, v7, :cond_3

    goto :goto_2

    :cond_3
    mul-int/lit8 v8, v8, 0xa

    add-int/2addr v8, v5

    sub-int/2addr v8, v6

    add-int/lit8 v2, v2, 0x1

    array-length v5, v1

    if-lt v2, v5, :cond_4

    goto :goto_3

    :cond_4
    aget-char v5, v1, v2

    goto :goto_1

    :cond_5
    :goto_2
    new-instance v0, LSg/b;

    invoke-direct {v0, p0, p1, p2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0, p3}, LSg/g;->d(LSg/b;Ljava/net/InetAddress;)LSg/g;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_3
    const/16 v5, 0xff

    if-le v8, v5, :cond_7

    new-instance v0, LSg/b;

    invoke-direct {v0, p0, p1, p2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0, p3}, LSg/g;->d(LSg/b;Ljava/net/InetAddress;)LSg/g;

    move-result-object p0

    return-object p0

    :cond_7
    shl-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v8

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    :goto_4
    new-instance v0, LSg/b;

    invoke-direct {v0, p0, p1, p2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0, p3}, LSg/g;->d(LSg/b;Ljava/net/InetAddress;)LSg/g;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 v1, 0x4

    if-ne v3, v1, :cond_b

    const-string v1, "."

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    new-instance p0, LSg/g;

    sget-object p1, LSg/g;->r:LSg/b;

    invoke-direct {p0, p1, v4, v0, v0}, LSg/g;-><init>(LSg/b;IZI)V

    return-object p0

    :cond_b
    :goto_5
    new-instance v0, LSg/b;

    invoke-direct {v0, p0, p1, p2}, LSg/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {v0, p3}, LSg/g;->d(LSg/b;Ljava/net/InetAddress;)LSg/g;

    move-result-object p0

    return-object p0

    :cond_c
    :goto_6
    invoke-static {}, LSg/g;->m()LSg/g;

    move-result-object p0

    return-object p0
.end method

.method static i(LSg/b;)LSg/g;
    .locals 6

    sget v0, LSg/g;->n:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LSg/g;->p:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LSg/g$a;

    if-eqz p0, :cond_1

    iget-wide v2, p0, LSg/g$a;->c:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    iget-wide v2, p0, LSg/g$a;->c:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    move-object p0, v1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    iget-object v1, p0, LSg/g$a;->b:LSg/g;

    :cond_2
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static m()LSg/g;
    .locals 1

    sget-object v0, LSg/g;->u:LSg/g;

    return-object v0
.end method

.method public static n()LSg/b;
    .locals 1

    sget-object v0, LSg/g;->u:LSg/g;

    iget-object v0, v0, LSg/g;->a:LSg/b;

    return-object v0
.end method

.method public static p()Ljava/net/InetAddress;
    .locals 2

    sget-object v0, LSg/g;->l:[Ljava/net/InetAddress;

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget v1, LSg/g;->o:I

    aget-object v0, v0, v1

    :goto_0
    return-object v0
.end method

.method public static q(Ljava/net/InetAddress;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-eqz p0, :cond_1

    sget-object v2, LSg/g;->l:[Ljava/net/InetAddress;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    invoke-virtual {p0}, Ljava/net/InetAddress;->hashCode()I

    move-result v3

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/net/InetAddress;->hashCode()I

    move-result v2

    if-ne v3, v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method static s()Ljava/net/InetAddress;
    .locals 4

    sget v0, LSg/g;->o:I

    add-int/lit8 v1, v0, 0x1

    sget-object v2, LSg/g;->l:[Ljava/net/InetAddress;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput v0, LSg/g;->o:I

    array-length v1, v2

    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    aget-object v0, v2, v0

    :goto_1
    return-object v0
.end method

.method private static t(LSg/b;)V
    .locals 1

    sget-object v0, LSg/g;->q:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, LSg/g;->a:LSg/b;

    iget-object v0, v0, LSg/b;->a:Ljava/lang/String;

    iput-object v0, p0, LSg/g;->k:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    const-string v2, "*SMBSERVER     "

    if-eqz v0, :cond_2

    iget-object v0, p0, LSg/g;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v3, p0, LSg/g;->k:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    move v4, v1

    :goto_0
    if-ge v1, v0, :cond_3

    add-int/lit8 v5, v1, 0x1

    aget-char v6, v3, v1

    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-eqz v6, :cond_3

    if-ne v5, v0, :cond_0

    const/4 v6, 0x3

    if-ne v4, v6, :cond_0

    iput-object v2, p0, LSg/g;->k:Ljava/lang/String;

    goto :goto_1

    :cond_0
    if-ge v5, v0, :cond_1

    aget-char v6, v3, v5

    const/16 v7, 0x2e

    if-ne v6, v7, :cond_1

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    move v1, v5

    goto :goto_0

    :cond_2
    iget-object v0, p0, LSg/g;->a:LSg/b;

    iget v0, v0, LSg/b;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iput-object v2, p0, LSg/g;->k:Ljava/lang/String;

    :cond_3
    :goto_1
    iget-object v0, p0, LSg/g;->k:Ljava/lang/String;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, LSg/g;

    if-eqz v0, :cond_0

    check-cast p1, LSg/g;

    iget p1, p1, LSg/g;->b:I

    iget v0, p0, LSg/g;->b:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LSg/g;->b:I

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, LSg/g;->b:I

    ushr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LSg/g;->b:I

    ushr-int/lit8 v2, v2, 0x10

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LSg/g;->b:I

    ushr-int/lit8 v2, v2, 0x8

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LSg/g;->b:I

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LSg/g;->a:LSg/b;

    sget-object v1, LSg/g;->r:LSg/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LSg/g;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, v0, LSg/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, LSg/g;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, LSg/g;->a:LSg/b;

    iget v0, v0, LSg/b;->c:I

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LSg/g;->k:Ljava/lang/String;

    iget-object v1, p0, LSg/g;->a:LSg/b;

    iget-object v1, v1, LSg/b;->a:Ljava/lang/String;

    const-string v2, "*SMBSERVER     "

    if-ne v0, v1, :cond_0

    iput-object v2, p0, LSg/g;->k:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    if-ne v0, v2, :cond_4

    :try_start_0
    sget-object v0, LSg/g;->m:LSg/e;

    invoke-virtual {v0, p0}, LSg/e;->d(LSg/g;)[LSg/g;

    move-result-object v0

    iget-object v2, p0, LSg/g;->a:LSg/b;

    iget v3, v2, LSg/b;->c:I

    const/16 v4, 0x1d

    if-ne v3, v4, :cond_3

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_2

    aget-object v3, v0, v2

    iget-object v3, v3, LSg/g;->a:LSg/b;

    iget v4, v3, LSg/b;->c:I

    const/16 v5, 0x20

    if-ne v4, v5, :cond_1

    iget-object v0, v3, LSg/b;->a:Ljava/lang/String;

    return-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :cond_3
    iget-boolean v0, p0, LSg/g;->i:Z

    if-eqz v0, :cond_5

    iput-object v1, p0, LSg/g;->k:Ljava/lang/String;

    iget-object v0, v2, LSg/b;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    iput-object v1, p0, LSg/g;->k:Ljava/lang/String;

    goto :goto_1

    :cond_4
    iput-object v1, p0, LSg/g;->k:Ljava/lang/String;

    :cond_5
    :goto_1
    iget-object v0, p0, LSg/g;->k:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LSg/g;->a:LSg/b;

    invoke-virtual {v1}, LSg/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LSg/g;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
