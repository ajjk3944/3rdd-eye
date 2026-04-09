.class final LLg/q$b;
.super LLg/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final g:LLg/q;


# direct methods
.method public constructor <init>(LLg/q;)V
    .locals 0

    invoke-direct {p0}, LLg/i$b;-><init>()V

    iput-object p1, p0, LLg/q$b;->g:LLg/q;

    return-void
.end method


# virtual methods
.method protected C(LMg/a;)V
    .locals 1

    invoke-super {p0, p1}, LLg/i$b;->C(LMg/a;)V

    iget-object p1, p0, LLg/i$b;->b:LMg/a;

    if-nez p1, :cond_2

    iget-object p1, p0, LLg/q$b;->g:LLg/q;

    invoke-virtual {p1}, LLg/q;->e0()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object p1, p0, LLg/i$b;->b:LMg/a;

    if-nez p1, :cond_1

    iget-object p1, p0, LLg/q$b;->g:LLg/q;

    invoke-virtual {p1}, LLg/q;->e0()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LLg/i$b;->c:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p1}, Ljavax/jmdns/impl/constants/g;->isAnnounced()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljavax/jmdns/impl/constants/g;->ANNOUNCING_1:Ljavax/jmdns/impl/constants/g;

    invoke-virtual {p0, p1}, LLg/i$b;->B(Ljavax/jmdns/impl/constants/g;)V

    invoke-virtual {p0}, LLg/i$b;->d()LLg/l;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LLg/i$b;->d()LLg/l;

    move-result-object p1

    invoke-virtual {p1}, LLg/l;->J()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, LLg/q$b;->g:LLg/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LLg/q;->l0(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1

    :cond_2
    :goto_2
    return-void
.end method

.method public y(LLg/l;)V
    .locals 0

    invoke-super {p0, p1}, LLg/i$b;->y(LLg/l;)V

    return-void
.end method
