.class public Ljcifs/smb1/smb1/M;
.super Ljava/net/URLConnection;
.source "SourceFile"

# interfaces
.implements Ljcifs/smb1/smb1/L;


# static fields
.field static v:LUg/e;

.field static w:J

.field static x:Z

.field protected static y:Ljcifs/smb1/smb1/d;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:I

.field private f:J

.field private g:J

.field private h:J

.field private i:Z

.field private j:I

.field private k:Ljcifs/smb1/smb1/n;

.field private l:Ljcifs/smb1/smb1/DfsReferral;

.field m:Ljcifs/smb1/smb1/k;

.field n:Ljcifs/smb1/smb1/S;

.field o:Ljava/lang/String;

.field p:I

.field q:I

.field r:Z

.field s:I

.field t:[LRg/b;

.field u:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, LUg/e;->a()LUg/e;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/M;->v:LUg/e;

    :try_start_0
    sget-object v0, LRg/a;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const-string v0, "jcifs.smb1.smb.client.attrExpirationPeriod"

    const-wide/16 v1, 0x1388

    invoke-static {v0, v1, v2}, LRg/a;->f(Ljava/lang/String;J)J

    move-result-wide v0

    sput-wide v0, Ljcifs/smb1/smb1/M;->w:J

    const-string v0, "jcifs.smb1.smb.client.ignoreCopyToException"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ljcifs/smb1/smb1/M;->x:Z

    new-instance v0, Ljcifs/smb1/smb1/d;

    invoke-direct {v0}, Ljcifs/smb1/smb1/d;-><init>()V

    sput-object v0, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/net/URL;

    const/4 v1, 0x0

    sget-object v2, Ljcifs/smb1/smb1/f;->a:Ljava/net/URLStreamHandler;

    invoke-direct {v0, v1, p1, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/net/URLStreamHandler;)V

    invoke-direct {p0, v0}, Ljcifs/smb1/smb1/M;-><init>(Ljava/net/URL;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 2

    .line 2
    new-instance v0, Ljcifs/smb1/smb1/k;

    invoke-virtual {p1}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljcifs/smb1/smb1/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Ljcifs/smb1/smb1/M;-><init>(Ljava/net/URL;Ljcifs/smb1/smb1/k;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Ljcifs/smb1/smb1/k;)V
    .locals 1

    .line 3
    invoke-direct {p0, p1}, Ljava/net/URLConnection;-><init>(Ljava/net/URL;)V

    const/4 v0, 0x7

    .line 4
    iput v0, p0, Ljcifs/smb1/smb1/M;->j:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ljcifs/smb1/smb1/M;->k:Ljcifs/smb1/smb1/n;

    .line 6
    iput-object v0, p0, Ljcifs/smb1/smb1/M;->l:Ljcifs/smb1/smb1/DfsReferral;

    .line 7
    iput-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    if-nez p2, :cond_0

    .line 8
    new-instance p2, Ljcifs/smb1/smb1/k;

    invoke-virtual {p1}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljcifs/smb1/smb1/k;-><init>(Ljava/lang/String;)V

    :cond_0
    iput-object p2, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    .line 9
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    return-void
.end method

.method private a()Ljcifs/smb1/smb1/n;
    .locals 1

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->k:Ljcifs/smb1/smb1/n;

    if-nez v0, :cond_0

    new-instance v0, Ljcifs/smb1/smb1/n;

    invoke-direct {v0}, Ljcifs/smb1/smb1/n;-><init>()V

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->k:Ljcifs/smb1/smb1/n;

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->k:Ljcifs/smb1/smb1/n;

    return-object v0
.end method

.method static w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v0, v3, :cond_3

    aget-char v3, p0, v0

    const/16 v4, 0x26

    if-ne v3, v4, :cond_1

    if-le v1, v2, :cond_0

    new-instance v3, Ljava/lang/String;

    sub-int v4, v1, v2

    invoke-direct {v3, p0, v2, v4}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    new-instance p1, Ljava/lang/String;

    sub-int/2addr v0, v1

    invoke-direct {p1, p0, v1, v0}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_0
    add-int/lit8 v2, v0, 0x1

    goto :goto_1

    :cond_1
    const/16 v4, 0x3d

    if-ne v3, v4, :cond_2

    move v1, v0

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    if-le v1, v2, :cond_4

    new-instance v0, Ljava/lang/String;

    sub-int v3, v1, v2

    invoke-direct {v0, p0, v2, v3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    add-int/lit8 v1, v1, 0x1

    new-instance p1, Ljava/lang/String;

    array-length v0, p0

    sub-int/2addr v0, v1

    invoke-direct {p1, p0, v1, v0}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method b()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljcifs/smb1/smb1/M;->d(J)V

    return-void
.end method

.method c(IJ)V
    .locals 3

    sget v0, LUg/e;->b:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    sget-object v0, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "close: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ljcifs/smb1/smb1/o;

    invoke-direct {v0, p1, p2, p3}, Ljcifs/smb1/smb1/o;-><init>(IJ)V

    invoke-direct {p0}, Ljcifs/smb1/smb1/M;->a()Ljcifs/smb1/smb1/n;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    return-void
.end method

.method public connect()V
    .locals 3

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v1, v0, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object v1, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v1, v1, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljcifs/smb1/smb1/S;->d(Z)V

    :cond_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->i()LRg/b;

    :cond_2
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->f()V
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbAuthException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->j()LRg/b;

    move-result-object v1

    if-eqz v1, :cond_3

    sget v1, LUg/e;->b:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    sget-object v1, Ljcifs/smb1/smb1/M;->v:LUg/e;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    goto :goto_0

    :cond_3
    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method d(J)V
    .locals 1

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->q()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Ljcifs/smb1/smb1/M;->p:I

    invoke-virtual {p0, v0, p1, p2}, Ljcifs/smb1/smb1/M;->c(IJ)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ljcifs/smb1/smb1/M;->r:Z

    return-void
.end method

.method e()V
    .locals 3

    const-string v0, "Failed to connect to server"

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->connect()V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    new-instance v2, Ljcifs/smb1/smb1/SmbException;

    invoke-direct {v2, v0, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v1

    new-instance v2, Ljcifs/smb1/smb1/SmbException;

    invoke-direct {v2, v0, v1}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljcifs/smb1/smb1/M;

    if-eqz v0, :cond_1

    check-cast p1, Ljcifs/smb1/smb1/M;

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljcifs/smb1/smb1/M;->v(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    invoke-virtual {p1}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    iget-object v1, p1, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->h()LRg/b;

    move-result-object v0

    invoke-virtual {p1}, Ljcifs/smb1/smb1/M;->h()LRg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, LRg/b;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljcifs/smb1/smb1/M;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method f()V
    .locals 10

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->h()LRg/b;

    move-result-object v0

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object v1, v1, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getPort()I

    move-result v1

    invoke-static {v0, v1}, Ljcifs/smb1/smb1/Q;->s(LRg/b;I)Ljcifs/smb1/smb1/Q;

    move-result-object v1

    iget-object v3, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    invoke-virtual {v1, v3}, Ljcifs/smb1/smb1/Q;->r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;

    move-result-object v3

    iget-object v4, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Ljcifs/smb1/smb1/P;->a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;

    move-result-object v3

    iput-object v3, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    :goto_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->l()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    sget-object v5, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    iget-object v6, v4, Ljcifs/smb1/smb1/S;->c:Ljava/lang/String;

    iget-object v7, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    invoke-virtual {v5, v3, v6, v2, v7}, Ljcifs/smb1/smb1/d;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/DfsReferral;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    iput-boolean v5, v4, Ljcifs/smb1/smb1/S;->h:Z

    iget-object v4, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-boolean v5, v4, Ljcifs/smb1/smb1/S;->h:Z

    const/4 v8, 0x2

    if-eqz v5, :cond_2

    iput v8, v4, Ljcifs/smb1/smb1/S;->a:I

    :cond_2
    :try_start_0
    sget v4, LUg/e;->b:I

    const/4 v5, 0x3

    if-lt v4, v5, :cond_3

    sget-object v4, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "doConnect: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    invoke-virtual {v0, v2, v2}, Ljcifs/smb1/smb1/S;->c(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbAuthException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    iget-object v4, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    if-nez v4, :cond_4

    sget-object v0, Ljcifs/smb1/smb1/k;->q:Ljcifs/smb1/smb1/k;

    invoke-virtual {v1, v0}, Ljcifs/smb1/smb1/Q;->r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljcifs/smb1/smb1/P;->a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    invoke-virtual {v0, v2, v2}, Ljcifs/smb1/smb1/S;->c(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    goto :goto_4

    :cond_4
    iget-object v4, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Ljcifs/smb1/smb1/i;->a(Ljava/lang/String;Ljcifs/smb1/smb1/SmbAuthException;)Ljcifs/smb1/smb1/k;

    move-result-object v4

    if-eqz v4, :cond_7

    iput-object v4, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    invoke-virtual {v1, v4}, Ljcifs/smb1/smb1/Q;->r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;

    move-result-object v0

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljcifs/smb1/smb1/P;->a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    sget-object v1, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    iget-object v4, v0, Ljcifs/smb1/smb1/S;->c:Ljava/lang/String;

    iget-object v5, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    invoke-virtual {v1, v3, v4, v2, v5}, Ljcifs/smb1/smb1/d;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/DfsReferral;

    move-result-object v1

    if-eqz v1, :cond_5

    move v6, v7

    :cond_5
    iput-boolean v6, v0, Ljcifs/smb1/smb1/S;->h:Z

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-boolean v1, v0, Ljcifs/smb1/smb1/S;->h:Z

    if-eqz v1, :cond_6

    iput v8, v0, Ljcifs/smb1/smb1/S;->a:I

    :cond_6
    invoke-virtual {v0, v2, v2}, Ljcifs/smb1/smb1/S;->c(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    :goto_4
    return-void

    :cond_7
    sget v1, LUg/e;->b:I

    if-lt v1, v7, :cond_8

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->o()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Ljcifs/smb1/smb1/M;->v:LUg/e;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    :cond_8
    throw v0
.end method

.method public g()Z
    .locals 4

    iget-wide v0, p0, Ljcifs/smb1/smb1/M;->f:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-boolean v0, p0, Ljcifs/smb1/smb1/M;->i:Z

    return v0

    :cond_0
    const/16 v0, 0x11

    iput v0, p0, Ljcifs/smb1/smb1/M;->e:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->c:J

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->d:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljcifs/smb1/smb1/M;->i:Z

    :try_start_0
    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->m()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, LRg/b;->e(Ljava/lang/String;Z)LRg/b;

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LRg/b;->d(Ljava/lang/String;)LRg/b;

    move-result-object v0

    invoke-virtual {v0}, LRg/b;->g()Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    const-string v2, "IPC$"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x101

    invoke-virtual {p0, v0, v2}, Ljcifs/smb1/smb1/M;->x(Ljava/lang/String;I)Ljcifs/smb1/smb1/g;

    move-result-object v0

    invoke-interface {v0}, Ljcifs/smb1/smb1/g;->b()I

    move-result v2

    iput v2, p0, Ljcifs/smb1/smb1/M;->e:I

    invoke-interface {v0}, Ljcifs/smb1/smb1/g;->c()J

    move-result-wide v2

    iput-wide v2, p0, Ljcifs/smb1/smb1/M;->c:J

    invoke-interface {v0}, Ljcifs/smb1/smb1/g;->d()J

    move-result-wide v2

    iput-wide v2, p0, Ljcifs/smb1/smb1/M;->d:J

    goto :goto_1

    :cond_5
    :goto_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->e()V

    :goto_1
    iput-boolean v1, p0, Ljcifs/smb1/smb1/M;->i:Z
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    invoke-virtual {v0}, Ljcifs/smb1/smb1/SmbException;->d()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    throw v0

    :catch_1
    :goto_3
    :sswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Ljcifs/smb1/smb1/M;->w:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->f:J

    iget-boolean v0, p0, Ljcifs/smb1/smb1/M;->i:Z

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3ffffff1 -> :sswitch_0
        -0x3fffffcd -> :sswitch_0
        -0x3fffffcc -> :sswitch_0
        -0x3fffffc6 -> :sswitch_0
    .end sparse-switch
.end method

.method public getContentLength()I
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->s()J

    move-result-wide v0
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public getDate()J
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->r()J

    move-result-wide v0
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 1

    new-instance v0, Ljcifs/smb1/smb1/N;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/N;-><init>(Ljcifs/smb1/smb1/M;)V

    return-object v0
.end method

.method public getLastModified()J
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->r()J

    move-result-wide v0
    :try_end_0
    .catch Ljcifs/smb1/smb1/SmbException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 1

    new-instance v0, Ljcifs/smb1/smb1/O;

    invoke-direct {v0, p0}, Ljcifs/smb1/smb1/O;-><init>(Ljcifs/smb1/smb1/M;)V

    return-object v0
.end method

.method h()LRg/b;
    .locals 2

    iget v0, p0, Ljcifs/smb1/smb1/M;->u:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->i()LRg/b;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v1, v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->h()LRg/b;

    move-result-object v0

    invoke-virtual {v0}, LRg/b;->hashCode()I

    move-result v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method i()LRg/b;
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Ljcifs/smb1/smb1/M;->u:I

    iget-object v1, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v2}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    const-string v5, "server"

    invoke-static {v3, v5}, Ljcifs/smb1/smb1/M;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_0

    new-array v1, v4, [LRg/b;

    iput-object v1, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    invoke-static {v5}, LRg/b;->d(Ljava/lang/String;)LRg/b;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->j()LRg/b;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v5, "address"

    invoke-static {v3, v5}, Ljcifs/smb1/smb1/M;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    invoke-static {v3}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    new-array v3, v4, [LRg/b;

    iput-object v3, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    new-instance v4, LRg/b;

    invoke-static {v1, v2}, Ljava/net/InetAddress;->getByAddress(Ljava/lang/String;[B)Ljava/net/InetAddress;

    move-result-object v1

    invoke-direct {v4, v1}, LRg/b;-><init>(Ljava/lang/Object;)V

    aput-object v4, v3, v0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->j()LRg/b;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_3

    :try_start_0
    const-string v1, "\u0001\u0002__MSBROWSE__\u0002"

    const/4 v2, 0x0

    invoke-static {v1, v4, v2}, LSg/g;->g(Ljava/lang/String;ILjava/lang/String;)LSg/g;

    move-result-object v1

    new-array v2, v4, [LRg/b;

    iput-object v2, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    invoke-virtual {v1}, LSg/g;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LRg/b;->d(Ljava/lang/String;)LRg/b;

    move-result-object v1

    aput-object v1, v2, v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {}, Ljcifs/smb1/smb1/k;->v()V

    sget-object v1, Ljcifs/smb1/smb1/k;->m:Ljava/lang/String;

    const-string v2, "?"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v0, Ljcifs/smb1/smb1/k;->m:Ljava/lang/String;

    invoke-static {v0, v4}, LRg/b;->c(Ljava/lang/String;Z)[LRg/b;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    goto :goto_1

    :cond_2
    throw v0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v1, v0}, LRg/b;->c(Ljava/lang/String;Z)[LRg/b;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    goto :goto_1

    :cond_5
    :goto_0
    invoke-static {v1, v4}, LRg/b;->c(Ljava/lang/String;Z)[LRg/b;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    :goto_1
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->j()LRg/b;

    move-result-object v0

    return-object v0
.end method

.method j()LRg/b;
    .locals 3

    iget v0, p0, Ljcifs/smb1/smb1/M;->u:I

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ljcifs/smb1/smb1/M;->u:I

    aget-object v0, v1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->l:Ljcifs/smb1/smb1/DfsReferral;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ljcifs/smb1/smb1/DfsReferral;->e:Ljava/lang/String;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()I
    .locals 3

    iget v0, p0, Ljcifs/smb1/smb1/M;->q:I

    if-nez v0, :cond_9

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iput v1, p0, Ljcifs/smb1/smb1/M;->q:I

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->e()V

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    const-string v1, "IPC$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x10

    iput v0, p0, Ljcifs/smb1/smb1/M;->q:I

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v0, v0, Ljcifs/smb1/smb1/S;->d:Ljava/lang/String;

    const-string v1, "LPT1:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    iput v0, p0, Ljcifs/smb1/smb1/M;->q:I

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v0, v0, Ljcifs/smb1/smb1/S;->d:Ljava/lang/String;

    const-string v1, "COMM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x40

    iput v0, p0, Ljcifs/smb1/smb1/M;->q:I

    goto :goto_1

    :cond_3
    const/16 v0, 0x8

    iput v0, p0, Ljcifs/smb1/smb1/M;->q:I

    goto :goto_1

    :cond_4
    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_8

    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    :try_start_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->h()LRg/b;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, LRg/b;->b()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, LSg/g;

    if-eqz v2, :cond_7

    invoke-virtual {v0}, LRg/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSg/g;

    invoke-virtual {v0}, LSg/g;->o()I

    move-result v0

    const/16 v2, 0x1d

    if-eq v0, v2, :cond_6

    const/16 v2, 0x1b

    if-ne v0, v2, :cond_7

    :cond_6
    iput v1, p0, Ljcifs/smb1/smb1/M;->q:I

    return v1

    :cond_7
    const/4 v0, 0x4

    iput v0, p0, Ljcifs/smb1/smb1/M;->q:I

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljcifs/smb1/smb1/SmbException;

    iget-object v2, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_8
    :goto_0
    iput v1, p0, Ljcifs/smb1/smb1/M;->q:I

    :cond_9
    :goto_1
    iget v0, p0, Ljcifs/smb1/smb1/M;->q:I

    return v0
.end method

.method n()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    if-nez v0, :cond_12

    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [C

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    const/16 v8, 0x2f

    const/4 v9, 0x1

    if-ge v4, v2, :cond_d

    if-eqz v6, :cond_b

    const/4 v7, 0x2

    if-eq v6, v9, :cond_0

    if-eq v6, v7, :cond_9

    goto/16 :goto_4

    :cond_0
    aget-char v10, v0, v4

    if-ne v10, v8, :cond_1

    goto :goto_4

    :cond_1
    const/16 v11, 0x2e

    if-ne v10, v11, :cond_3

    add-int/lit8 v12, v4, 0x1

    if-ge v12, v2, :cond_2

    aget-char v13, v0, v12

    if-ne v13, v8, :cond_3

    :cond_2
    move v4, v12

    goto :goto_4

    :cond_3
    add-int/lit8 v12, v4, 0x1

    if-ge v12, v2, :cond_8

    if-ne v10, v11, :cond_8

    aget-char v10, v0, v12

    if-ne v10, v11, :cond_8

    add-int/lit8 v10, v4, 0x2

    if-ge v10, v2, :cond_4

    aget-char v11, v0, v10

    if-ne v11, v8, :cond_8

    :cond_4
    if-ne v5, v9, :cond_5

    :goto_1
    move v4, v10

    goto :goto_4

    :cond_5
    :goto_2
    add-int/lit8 v4, v5, -0x1

    if-le v4, v9, :cond_7

    add-int/lit8 v5, v5, -0x2

    aget-char v5, v1, v5

    if-ne v5, v8, :cond_6

    goto :goto_3

    :cond_6
    move v5, v4

    goto :goto_2

    :cond_7
    :goto_3
    move v5, v4

    goto :goto_1

    :cond_8
    move v6, v7

    :cond_9
    aget-char v7, v0, v4

    if-ne v7, v8, :cond_a

    move v6, v9

    :cond_a
    add-int/lit8 v8, v5, 0x1

    aput-char v7, v1, v5

    move v5, v8

    goto :goto_4

    :cond_b
    aget-char v6, v0, v4

    if-eq v6, v8, :cond_c

    return-object v7

    :cond_c
    add-int/lit8 v7, v5, 0x1

    aput-char v6, v1, v5

    move v5, v7

    move v6, v9

    :goto_4
    add-int/2addr v4, v9

    goto :goto_0

    :cond_d
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1, v3, v5}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    const-string v2, "\\"

    if-le v5, v9, :cond_11

    add-int/lit8 v3, v5, -0x1

    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-gez v0, :cond_e

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    iput-object v2, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    goto :goto_5

    :cond_e
    if-ne v0, v3, :cond_f

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    invoke-virtual {v1, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    iput-object v2, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    goto :goto_5

    :cond_f
    iget-object v2, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    invoke-virtual {v2, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    iget-object v2, p0, Ljcifs/smb1/smb1/M;->a:Ljava/lang/String;

    aget-char v1, v1, v3

    if-ne v1, v8, :cond_10

    move v5, v3

    :cond_10
    invoke-virtual {v2, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    const/16 v1, 0x5c

    invoke-virtual {v0, v8, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    goto :goto_5

    :cond_11
    iput-object v7, p0, Ljcifs/smb1/smb1/M;->b:Ljava/lang/String;

    iput-object v2, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    :cond_12
    :goto_5
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    return-object v0
.end method

.method o()Z
    .locals 2

    iget v0, p0, Ljcifs/smb1/smb1/M;->u:I

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->t:[LRg/b;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method p()Z
    .locals 2

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    if-eqz v0, :cond_0

    iget v0, v0, Ljcifs/smb1/smb1/S;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method q()Z
    .locals 2

    iget-boolean v0, p0, Ljcifs/smb1/smb1/M;->r:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ljcifs/smb1/smb1/M;->s:I

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget v1, v1, Ljcifs/smb1/smb1/S;->i:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public r()J
    .locals 2

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->g()Z

    iget-wide v0, p0, Ljcifs/smb1/smb1/M;->d:J

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public s()J
    .locals 4

    iget-wide v0, p0, Ljcifs/smb1/smb1/M;->h:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Ljcifs/smb1/smb1/M;->g:J

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->m()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    new-instance v0, Ljcifs/smb1/smb1/W;

    invoke-direct {v0, v2}, Ljcifs/smb1/smb1/W;-><init>(I)V

    new-instance v1, Ljcifs/smb1/smb1/V;

    invoke-direct {v1, v2}, Ljcifs/smb1/smb1/V;-><init>(I)V

    invoke-virtual {p0, v1, v0}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    iget-object v0, v0, Ljcifs/smb1/smb1/W;->m1:Ljcifs/smb1/smb1/a;

    invoke-interface {v0}, Ljcifs/smb1/smb1/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->g:J

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_2

    iget v0, p0, Ljcifs/smb1/smb1/M;->q:I

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->n()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x102

    invoke-virtual {p0, v0, v1}, Ljcifs/smb1/smb1/M;->x(Ljava/lang/String;I)Ljcifs/smb1/smb1/g;

    move-result-object v0

    invoke-interface {v0}, Ljcifs/smb1/smb1/g;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->g:J

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->g:J

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Ljcifs/smb1/smb1/M;->w:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ljcifs/smb1/smb1/M;->h:J

    iget-wide v0, p0, Ljcifs/smb1/smb1/M;->g:J

    return-wide v0
.end method

.method t(IIII)V
    .locals 1

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Ljcifs/smb1/smb1/M;->u(IIII)I

    move-result p1

    iput p1, p0, Ljcifs/smb1/smb1/M;->p:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ljcifs/smb1/smb1/M;->r:Z

    iget-object p1, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget p1, p1, Ljcifs/smb1/smb1/S;->i:I

    iput p1, p0, Ljcifs/smb1/smb1/M;->s:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LWg/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method u(IIII)I
    .locals 10

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->e()V

    sget v0, LUg/e;->b:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    sget-object v0, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "open0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v0, v0, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljcifs/smb1/smb1/Q;->u(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljcifs/smb1/smb1/r;

    invoke-direct {v0}, Ljcifs/smb1/smb1/r;-><init>()V

    new-instance v9, Ljcifs/smb1/smb1/q;

    iget-object v2, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    iget v5, p0, Ljcifs/smb1/smb1/M;->j:I

    const/4 v8, 0x0

    move-object v1, v9

    move v3, p1

    move v4, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v1 .. v8}, Ljcifs/smb1/smb1/q;-><init>(Ljava/lang/String;IIIIILjcifs/smb1/smb1/l;)V

    invoke-virtual {p0, v9, v0}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    iget p1, v0, Ljcifs/smb1/smb1/r;->F:I

    iget p2, v0, Ljcifs/smb1/smb1/r;->H:I

    and-int/lit16 p2, p2, 0x7fff

    iput p2, p0, Ljcifs/smb1/smb1/M;->e:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    sget-wide v0, Ljcifs/smb1/smb1/M;->w:J

    add-long/2addr p2, v0

    iput-wide p2, p0, Ljcifs/smb1/smb1/M;->f:J

    const/4 p2, 0x1

    iput-boolean p2, p0, Ljcifs/smb1/smb1/M;->i:Z

    goto :goto_0

    :cond_1
    new-instance p3, Ljcifs/smb1/smb1/v;

    invoke-direct {p3}, Ljcifs/smb1/smb1/v;-><init>()V

    new-instance p4, Ljcifs/smb1/smb1/u;

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {p4, v0, p2, p1, v1}, Ljcifs/smb1/smb1/u;-><init>(Ljava/lang/String;IILjcifs/smb1/smb1/l;)V

    invoke-virtual {p0, p4, p3}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    iget p1, p3, Ljcifs/smb1/smb1/v;->E:I

    :goto_0
    return p1
.end method

.method protected v(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v6, v0, v3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v5

    const/16 v1, 0x2e

    const/4 v7, 0x1

    if-le v6, v7, :cond_0

    add-int/lit8 v2, v3, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v1, :cond_0

    return v7

    :cond_0
    if-le v0, v7, :cond_1

    add-int/lit8 v2, v5, 0x1

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v1, :cond_1

    return v7

    :cond_1
    if-ne v6, v0, :cond_2

    const/4 v2, 0x1

    move-object v1, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    return v7
.end method

.method x(Ljava/lang/String;I)Ljcifs/smb1/smb1/g;
    .locals 4

    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->e()V

    sget v0, LUg/e;->b:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    sget-object v0, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryPath: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v0, v0, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljcifs/smb1/smb1/Q;->u(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljcifs/smb1/smb1/Y;

    invoke-direct {v0, p2}, Ljcifs/smb1/smb1/Y;-><init>(I)V

    new-instance v1, Ljcifs/smb1/smb1/X;

    invoke-direct {v1, p1, p2}, Ljcifs/smb1/smb1/X;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v1, v0}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    iget-object p1, v0, Ljcifs/smb1/smb1/Y;->m1:Ljcifs/smb1/smb1/g;

    return-object p1

    :cond_1
    new-instance p2, Ljcifs/smb1/smb1/x;

    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v0, v0, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object v0, v0, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v0, v0, Ljcifs/smb1/smb1/Q;->v:Ljcifs/smb1/smb1/Q$a;

    iget v0, v0, Ljcifs/smb1/smb1/Q$a;->n:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    invoke-direct {p2, v0, v1}, Ljcifs/smb1/smb1/x;-><init>(J)V

    new-instance v0, Ljcifs/smb1/smb1/w;

    invoke-direct {v0, p1}, Ljcifs/smb1/smb1/w;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Ljcifs/smb1/smb1/M;->z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V

    return-object p2
.end method

.method y(Ljcifs/smb1/smb1/l;)V
    .locals 8

    instance-of v0, p1, Ljcifs/smb1/smb1/o;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljcifs/smb1/smb1/M;->e()V

    sget-object v1, Ljcifs/smb1/smb1/M;->y:Ljcifs/smb1/smb1/d;

    iget-object v2, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-object v3, v2, Ljcifs/smb1/smb1/S;->f:Ljcifs/smb1/smb1/P;

    iget-object v3, v3, Ljcifs/smb1/smb1/P;->h:Ljcifs/smb1/smb1/Q;

    iget-object v3, v3, Ljcifs/smb1/smb1/Q;->D:Ljava/lang/String;

    iget-object v2, v2, Ljcifs/smb1/smb1/S;->c:Ljava/lang/String;

    iget-object v4, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    iget-object v5, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    invoke-virtual {v1, v3, v2, v4, v5}, Ljcifs/smb1/smb1/d;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/DfsReferral;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    iget-byte v0, p1, Ljcifs/smb1/smb1/l;->c:B

    const/16 v4, 0x25

    const-string v5, "A:"

    if-eq v0, v4, :cond_1

    const/16 v4, 0x32

    if-eq v0, v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Ljcifs/smb1/smb1/C;

    iget-byte v0, v0, Ljcifs/smb1/smb1/C;->o1:B

    and-int/lit16 v0, v0, 0xff

    const/16 v4, 0x10

    if-eq v0, v4, :cond_2

    goto :goto_0

    :cond_2
    move-object v5, v3

    :goto_0
    move-object v0, v1

    :cond_3
    :try_start_0
    sget v4, LUg/e;->b:I

    const/4 v6, 0x2

    if-lt v4, v6, :cond_4

    sget-object v4, Ljcifs/smb1/smb1/M;->v:LUg/e;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DFS redirect: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v4, v0, Ljcifs/smb1/smb1/DfsReferral;->e:Ljava/lang/String;

    invoke-static {v4}, LRg/b;->d(Ljava/lang/String;)LRg/b;

    move-result-object v4

    iget-object v6, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v6}, Ljava/net/URL;->getPort()I

    move-result v6

    invoke-static {v4, v6}, Ljcifs/smb1/smb1/Q;->s(LRg/b;I)Ljcifs/smb1/smb1/Q;

    move-result-object v4

    invoke-virtual {v4}, Ljcifs/smb1/smb1/Q;->n()V

    iget-object v6, p0, Ljcifs/smb1/smb1/M;->m:Ljcifs/smb1/smb1/k;

    invoke-virtual {v4, v6}, Ljcifs/smb1/smb1/Q;->r(Ljcifs/smb1/smb1/k;)Ljcifs/smb1/smb1/P;

    move-result-object v4

    iget-object v6, v0, Ljcifs/smb1/smb1/DfsReferral;->f:Ljava/lang/String;

    invoke-virtual {v4, v6, v5}, Ljcifs/smb1/smb1/P;->a(Ljava/lang/String;Ljava/lang/String;)Ljcifs/smb1/smb1/S;

    move-result-object v4

    iput-object v4, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    if-eq v0, v1, :cond_6

    iget-object v4, v0, Ljcifs/smb1/smb1/DfsReferral;->m:Ljava/lang/String;

    if-eqz v4, :cond_6

    iget-object v6, v0, Ljcifs/smb1/smb1/DfsReferral;->l:Ljava/util/Map;

    invoke-interface {v6, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_2
    instance-of v6, v4, Ljcifs/smb1/smb1/SmbException;

    if-eqz v6, :cond_5

    check-cast v4, Ljcifs/smb1/smb1/SmbException;

    goto :goto_3

    :cond_5
    new-instance v6, Ljcifs/smb1/smb1/SmbException;

    iget-object v7, v0, Ljcifs/smb1/smb1/DfsReferral;->e:Ljava/lang/String;

    invoke-direct {v6, v7, v4}, Ljcifs/smb1/smb1/SmbException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v4, v6

    :goto_3
    iget-object v0, v0, Ljcifs/smb1/smb1/DfsReferral;->k:Ljcifs/smb1/smb1/DfsReferral;

    if-ne v0, v1, :cond_3

    move-object v3, v4

    :cond_6
    :goto_4
    if-nez v3, :cond_d

    sget v1, LUg/e;->b:I

    const/4 v3, 0x3

    if-lt v1, v3, :cond_7

    sget-object v1, Ljcifs/smb1/smb1/M;->v:LUg/e;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_7
    iput-object v0, p0, Ljcifs/smb1/smb1/M;->l:Ljcifs/smb1/smb1/DfsReferral;

    iget v1, v0, Ljcifs/smb1/smb1/DfsReferral;->c:I

    if-gez v1, :cond_8

    iput v2, v0, Ljcifs/smb1/smb1/DfsReferral;->c:I

    goto :goto_5

    :cond_8
    iget-object v2, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_9

    iget-object v1, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iput v1, v0, Ljcifs/smb1/smb1/DfsReferral;->c:I

    :cond_9
    :goto_5
    iget-object v1, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    iget v2, v0, Ljcifs/smb1/smb1/DfsReferral;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "\\"

    if-eqz v3, :cond_a

    move-object v1, v4

    :cond_a
    iget-object v3, v0, Ljcifs/smb1/smb1/DfsReferral;->h:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ljcifs/smb1/smb1/DfsReferral;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_b
    iput-object v1, p0, Ljcifs/smb1/smb1/M;->o:Ljava/lang/String;

    if-eqz p1, :cond_c

    iget-object v0, p1, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_c
    if-eqz p1, :cond_11

    iput-object v1, p1, Ljcifs/smb1/smb1/l;->w:Ljava/lang/String;

    iget v0, p1, Ljcifs/smb1/smb1/l;->i:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p1, Ljcifs/smb1/smb1/l;->i:I

    goto :goto_7

    :cond_d
    throw v3

    :cond_e
    iget-object v1, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    iget-boolean v1, v1, Ljcifs/smb1/smb1/S;->h:Z

    if-eqz v1, :cond_10

    if-eqz v0, :cond_f

    goto :goto_6

    :cond_f
    new-instance p1, Ljcifs/smb1/smb1/SmbException;

    const v0, -0x3ffffddb    # -2.000131f

    invoke-direct {p1, v0, v2}, Ljcifs/smb1/smb1/SmbException;-><init>(IZ)V

    throw p1

    :cond_10
    :goto_6
    if-eqz p1, :cond_11

    iget v0, p1, Ljcifs/smb1/smb1/l;->i:I

    and-int/lit16 v0, v0, -0x1001

    iput v0, p1, Ljcifs/smb1/smb1/l;->i:I

    :cond_11
    :goto_7
    return-void
.end method

.method z(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    .locals 2

    :goto_0
    invoke-virtual {p0, p1}, Ljcifs/smb1/smb1/M;->y(Ljcifs/smb1/smb1/l;)V

    :try_start_0
    iget-object v0, p0, Ljcifs/smb1/smb1/M;->n:Ljcifs/smb1/smb1/S;

    invoke-virtual {v0, p1, p2}, Ljcifs/smb1/smb1/S;->b(Ljcifs/smb1/smb1/l;Ljcifs/smb1/smb1/l;)V
    :try_end_0
    .catch Ljcifs/smb1/smb1/DfsReferral; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-boolean v1, v0, Ljcifs/smb1/smb1/DfsReferral;->i:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljcifs/smb1/smb1/l;->t()V

    goto :goto_0

    :cond_0
    throw v0
.end method
