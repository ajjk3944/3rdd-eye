.class public abstract LLg/i$b;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "SourceFile"

# interfaces
.implements LLg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field private static f:LEj/b;


# instance fields
.field private volatile a:LLg/l;

.field protected volatile b:LMg/a;

.field protected volatile c:Ljavax/jmdns/impl/constants/g;

.field private final d:LLg/i$a;

.field private final e:LLg/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/i$b;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/i$b;->f:LEj/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LLg/i$b;->a:LLg/l;

    iput-object v0, p0, LLg/i$b;->b:LMg/a;

    sget-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_1:Ljavax/jmdns/impl/constants/g;

    iput-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    new-instance v0, LLg/i$a;

    const-string v1, "Announce"

    invoke-direct {v0, v1}, LLg/i$a;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LLg/i$b;->d:LLg/i$a;

    new-instance v0, LLg/i$a;

    const-string v1, "Cancel"

    invoke-direct {v0, v1}, LLg/i$a;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LLg/i$b;->e:LLg/i$a;

    return-void
.end method

.method private F()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isCanceling()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private J()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isClosing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method protected B(Ljavax/jmdns/impl/constants/g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iput-object p1, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p0}, LLg/i$b;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LLg/i$b;->d:LLg/i$a;

    invoke-virtual {p1}, LLg/i$a;->a()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, LLg/i$b;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LLg/i$b;->e:LLg/i$a;

    invoke-virtual {p1}, LLg/i$a;->a()V

    iget-object p1, p0, LLg/i$b;->d:LLg/i$a;

    invoke-virtual {p1}, LLg/i$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method protected C(LMg/a;)V
    .locals 0

    iput-object p1, p0, LLg/i$b;->b:LMg/a;

    return-void
.end method

.method public E(J)Z
    .locals 2

    invoke-virtual {p0}, LLg/i$b;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LLg/i$b;->e:LLg/i$a;

    invoke-virtual {v0, p1, p2}, LLg/i$a;->b(J)V

    :cond_0
    invoke-virtual {p0}, LLg/i$b;->m()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LLg/i$b;->e:LLg/i$a;

    const-wide/16 v0, 0xa

    invoke-virtual {p1, v0, v1}, LLg/i$a;->b(J)V

    invoke-virtual {p0}, LLg/i$b;->m()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, LLg/i$b;->J()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, LLg/i$b;->f:LEj/b;

    const-string p2, "Wait for canceled timed out: {}"

    invoke-interface {p1, p2, p0}, LEj/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, LLg/i$b;->m()Z

    move-result p1

    return p1
.end method

.method public a(LMg/a;Ljavax/jmdns/impl/constants/g;)V
    .locals 1

    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-nez v0, :cond_1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    if-ne v0, p2, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-nez v0, :cond_0

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    if-ne v0, p2, :cond_0

    invoke-virtual {p0, p1}, LLg/i$b;->C(LMg/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_1
    :goto_2
    return-void
.end method

.method public c()Z
    .locals 2

    invoke-direct {p0}, LLg/i$b;->F()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-direct {p0}, LLg/i$b;->F()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ljavax/jmdns/impl/constants/g;->CANCELING_1:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p0, v0}, LLg/i$b;->B(Ljavax/jmdns/impl/constants/g;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/i$b;->C(LMg/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_1
    :goto_2
    return v1
.end method

.method public d()LLg/l;
    .locals 1

    iget-object v0, p0, LLg/i$b;->a:LLg/l;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isAnnounced()Z

    move-result v0

    return v0
.end method

.method public h(LMg/a;)Z
    .locals 3

    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p1}, Ljavax/jmdns/impl/constants/g;->advance()Ljavax/jmdns/impl/constants/g;

    move-result-object p1

    invoke-virtual {p0, p1}, LLg/i$b;->B(Ljavax/jmdns/impl/constants/g;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object v0, LLg/i$b;->f:LEj/b;

    const-string v1, "Trying to advance state whhen not the owner. owner: {} perpetrator: {}"

    iget-object v2, p0, LLg/i$b;->b:LMg/a;

    invoke-interface {v0, v1, v2, p1}, LEj/b;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_1
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isAnnouncing()Z

    move-result v0

    return v0
.end method

.method public l(LMg/a;Ljavax/jmdns/impl/constants/g;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return p1

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isCanceled()Z

    move-result v0

    return v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isCanceling()Z

    move-result v0

    return v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isClosed()Z

    move-result v0

    return v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isClosing()Z

    move-result v0

    return v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->isProbing()Z

    move-result v0

    return v0
.end method

.method public s()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    sget-object v0, Ljavax/jmdns/impl/constants/g;->PROBING_1:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p0, v0}, LLg/i$b;->B(Ljavax/jmdns/impl/constants/g;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/i$b;->C(LMg/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public t(LMg/a;)V
    .locals 1

    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LLg/i$b;->C(LMg/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_1
    :goto_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    const-string v0, " task: "

    const-string v1, " state: "

    const-string v2, "NO DNS"

    const-string v3, "DNS: "

    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, LLg/i$b;->a:LLg/l;

    if-eqz v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, LLg/i$b;->a:LLg/l;

    invoke-virtual {v6}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " ["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, LLg/i$b;->a:LLg/l;

    invoke-virtual {v6}, LLg/l;->D0()Ljava/net/InetAddress;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v2

    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, LLg/i$b;->b:LMg/a;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, LLg/i$b;->a:LLg/l;

    if-eqz v5, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LLg/i$b;->a:LLg/l;

    invoke-virtual {v3}, LLg/l;->G0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LLg/i$b;->b:LMg/a;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Z
    .locals 1

    invoke-direct {p0}, LLg/i$b;->F()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-direct {p0}, LLg/i$b;->F()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {v0}, Ljavax/jmdns/impl/constants/g;->revert()Ljavax/jmdns/impl/constants/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LLg/i$b;->B(Ljavax/jmdns/impl/constants/g;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LLg/i$b;->C(LMg/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_1
    :goto_2
    const/4 v0, 0x1

    return v0
.end method

.method protected y(LLg/l;)V
    .locals 0

    iput-object p1, p0, LLg/i$b;->a:LLg/l;

    return-void
.end method
