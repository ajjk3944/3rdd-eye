.class public final Lcom/ui/wifiman/db/WifimanDB_Impl;
.super Lcom/ui/wifiman/db/WifimanDB;
.source "SourceFile"


# instance fields
.field private volatile A:LZb/a;

.field private volatile B:LXb/e;

.field private volatile C:LYb/b;

.field private volatile D:Lcc/b;

.field private volatile E:LLb/b;

.field private volatile F:LNb/e;

.field private volatile G:Lac/c;

.field private volatile H:Lac/e;

.field private volatile I:LPb/c;

.field private volatile J:LPb/e;

.field private volatile K:LPb/a;

.field private volatile L:LRb/a;

.field private volatile M:LNb/a;

.field private volatile q:LVb/a;

.field private volatile r:LUb/a;

.field private volatile s:Lbc/a;

.field private volatile t:LMb/a;

.field private volatile u:LOb/a;

.field private volatile v:LTb/b;

.field private volatile w:LSb/b;

.field private volatile x:LWb/j;

.field private volatile y:LWb/h;

.field private volatile z:LWb/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/ui/wifiman/db/WifimanDB;-><init>()V

    return-void
.end method

.method static synthetic Z(Lcom/ui/wifiman/db/WifimanDB_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lm2/q;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic a0(Lcom/ui/wifiman/db/WifimanDB_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lm2/q;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b0(Lcom/ui/wifiman/db/WifimanDB_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/sqlite/db/SupportSQLiteDatabase;
    .locals 0

    iput-object p1, p0, Lm2/q;->a:Landroidx/sqlite/db/SupportSQLiteDatabase;

    return-object p1
.end method

.method static synthetic c0(Lcom/ui/wifiman/db/WifimanDB_Impl;Landroidx/sqlite/db/SupportSQLiteDatabase;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm2/q;->v(Landroidx/sqlite/db/SupportSQLiteDatabase;)V

    return-void
.end method

.method static synthetic d0(Lcom/ui/wifiman/db/WifimanDB_Impl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lm2/q;->h:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public C()LMb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->t:LMb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->t:LMb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->t:LMb/a;

    if-nez v0, :cond_1

    new-instance v0, LMb/b;

    invoke-direct {v0, p0}, LMb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->t:LMb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->t:LMb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public D()LUb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->r:LUb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->r:LUb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->r:LUb/a;

    if-nez v0, :cond_1

    new-instance v0, LUb/b;

    invoke-direct {v0, p0}, LUb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->r:LUb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->r:LUb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public E()LVb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->q:LVb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->q:LVb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->q:LVb/a;

    if-nez v0, :cond_1

    new-instance v0, LVb/b;

    invoke-direct {v0, p0}, LVb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->q:LVb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->q:LVb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public F()Lbc/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->s:Lbc/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->s:Lbc/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->s:Lbc/a;

    if-nez v0, :cond_1

    new-instance v0, Lbc/b;

    invoke-direct {v0, p0}, Lbc/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->s:Lbc/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->s:Lbc/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public G()LNb/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->F:LNb/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->F:LNb/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->F:LNb/e;

    if-nez v0, :cond_1

    new-instance v0, LNb/f;

    invoke-direct {v0, p0}, LNb/f;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->F:LNb/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->F:LNb/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public H()LOb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->u:LOb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->u:LOb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->u:LOb/a;

    if-nez v0, :cond_1

    new-instance v0, LOb/b;

    invoke-direct {v0, p0}, LOb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->u:LOb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->u:LOb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public I()LNb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->M:LNb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->M:LNb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->M:LNb/a;

    if-nez v0, :cond_1

    new-instance v0, LNb/b;

    invoke-direct {v0, p0}, LNb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->M:LNb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->M:LNb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public J()LPb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->K:LPb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->K:LPb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->K:LPb/a;

    if-nez v0, :cond_1

    new-instance v0, LPb/b;

    invoke-direct {v0, p0}, LPb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->K:LPb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->K:LPb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public K()LPb/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->I:LPb/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->I:LPb/c;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->I:LPb/c;

    if-nez v0, :cond_1

    new-instance v0, LPb/d;

    invoke-direct {v0, p0}, LPb/d;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->I:LPb/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->I:LPb/c;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public L()LPb/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->J:LPb/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->J:LPb/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->J:LPb/e;

    if-nez v0, :cond_1

    new-instance v0, LPb/f;

    invoke-direct {v0, p0}, LPb/f;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->J:LPb/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->J:LPb/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public M()LRb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->L:LRb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->L:LRb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->L:LRb/a;

    if-nez v0, :cond_1

    new-instance v0, LRb/b;

    invoke-direct {v0, p0}, LRb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->L:LRb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->L:LRb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public N()LWb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->z:LWb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->z:LWb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->z:LWb/a;

    if-nez v0, :cond_1

    new-instance v0, LWb/b;

    invoke-direct {v0, p0}, LWb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->z:LWb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->z:LWb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public O()LWb/h;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->y:LWb/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->y:LWb/h;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->y:LWb/h;

    if-nez v0, :cond_1

    new-instance v0, LWb/i;

    invoke-direct {v0, p0}, LWb/i;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->y:LWb/h;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->y:LWb/h;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public P()LWb/j;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->x:LWb/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->x:LWb/j;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->x:LWb/j;

    if-nez v0, :cond_1

    new-instance v0, LWb/k;

    invoke-direct {v0, p0}, LWb/k;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->x:LWb/j;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->x:LWb/j;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public Q()LYb/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->C:LYb/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->C:LYb/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->C:LYb/b;

    if-nez v0, :cond_1

    new-instance v0, LYb/d;

    invoke-direct {v0, p0}, LYb/d;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->C:LYb/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->C:LYb/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public R()LZb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->A:LZb/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->A:LZb/a;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->A:LZb/a;

    if-nez v0, :cond_1

    new-instance v0, LZb/b;

    invoke-direct {v0, p0}, LZb/b;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->A:LZb/a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->A:LZb/a;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public S()LXb/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->B:LXb/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->B:LXb/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->B:LXb/e;

    if-nez v0, :cond_1

    new-instance v0, LXb/g;

    invoke-direct {v0, p0}, LXb/g;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->B:LXb/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->B:LXb/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public T()LLb/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->E:LLb/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->E:LLb/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->E:LLb/b;

    if-nez v0, :cond_1

    new-instance v0, LLb/c;

    invoke-direct {v0, p0}, LLb/c;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->E:LLb/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->E:LLb/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public U()Lac/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->G:Lac/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->G:Lac/c;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->G:Lac/c;

    if-nez v0, :cond_1

    new-instance v0, Lac/d;

    invoke-direct {v0, p0}, Lac/d;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->G:Lac/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->G:Lac/c;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public V()Lac/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->H:Lac/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->H:Lac/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->H:Lac/e;

    if-nez v0, :cond_1

    new-instance v0, Lac/f;

    invoke-direct {v0, p0}, Lac/f;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->H:Lac/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->H:Lac/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public W()LSb/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->w:LSb/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->w:LSb/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->w:LSb/b;

    if-nez v0, :cond_1

    new-instance v0, LSb/c;

    invoke-direct {v0, p0}, LSb/c;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->w:LSb/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->w:LSb/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public X()LTb/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->v:LTb/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->v:LTb/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->v:LTb/b;

    if-nez v0, :cond_1

    new-instance v0, LTb/c;

    invoke-direct {v0, p0}, LTb/c;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->v:LTb/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->v:LTb/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public Y()Lcc/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->D:Lcc/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->D:Lcc/b;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->D:Lcc/b;

    if-nez v0, :cond_1

    new-instance v0, Lcc/c;

    invoke-direct {v0, p0}, Lcc/c;-><init>(Lm2/q;)V

    iput-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->D:Lcc/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/db/WifimanDB_Impl;->D:Lcc/b;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected g()Landroidx/room/c;
    .locals 30

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, Landroidx/room/c;

    const-string/jumbo v28, "directConsoleConnectionPopup"

    const-string/jumbo v29, "wifiNetworkDetail"

    const-string/jumbo v3, "speedTestServer"

    const-string/jumbo v4, "settings"

    const-string/jumbo v5, "session"

    const-string/jumbo v6, "discoveryListUiState"

    const-string/jumbo v7, "deviceInformation"

    const-string/jumbo v8, "wifiScan"

    const-string/jumbo v9, "wizardState"

    const-string/jumbo v10, "appReviewState"

    const-string/jumbo v11, "speedTestId"

    const-string/jumbo v12, "speedTestEnv"

    const-string/jumbo v13, "speedTestMeasurement"

    const-string/jumbo v14, "bluetoothListUiState"

    const-string/jumbo v15, "signalMapperPlaces"

    const-string/jumbo v16, "signalMapperPlaceName"

    const-string/jumbo v17, "signalMapperUiState"

    const-string/jumbo v18, "speedtestSettings"

    const-string/jumbo v19, "teleportWizardState"

    const-string/jumbo v20, "ssoAccount"

    const-string/jumbo v21, "wifimanWizardAdoption"

    const-string/jumbo v22, "console"

    const-string/jumbo v23, "cloudConsoles"

    const-string/jumbo v24, "discoveryHome"

    const-string/jumbo v25, "favoriteHost"

    const-string/jumbo v26, "floorplanRecord"

    const-string/jumbo v27, "floorplanGpx"

    filled-new-array/range {v3 .. v29}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-direct {v1, v4, v0, v2, v3}, Landroidx/room/c;-><init>(Lm2/q;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v1
.end method

.method protected h(Lm2/f;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    .locals 4

    new-instance v0, Lm2/s;

    new-instance v1, Lcom/ui/wifiman/db/WifimanDB_Impl$a;

    const/16 v2, 0x45

    invoke-direct {v1, p0, v2}, Lcom/ui/wifiman/db/WifimanDB_Impl$a;-><init>(Lcom/ui/wifiman/db/WifimanDB_Impl;I)V

    const-string/jumbo v2, "ef3df847d6d240519519ee77ffcabe3b"

    const-string/jumbo v3, "b3126cbb2544e031699805839aaab9eb"

    invoke-direct {v0, p1, v1, v2, v3}, Lm2/s;-><init>(Lm2/f;Lm2/s$b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lm2/f;->a:Landroid/content/Context;

    invoke-static {v1}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;->a(Landroid/content/Context;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;

    move-result-object v1

    iget-object v2, p1, Lm2/f;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;->c(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;->b(Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$a;->a()Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;

    move-result-object v0

    iget-object p1, p1, Lm2/f;->c:Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;->create(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .locals 0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public o()Ljava/util/Set;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method protected p()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-class v1, LVb/a;

    invoke-static {}, LVb/b;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LUb/a;

    invoke-static {}, LUb/b;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lbc/a;

    invoke-static {}, Lbc/b;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LMb/a;

    invoke-static {}, LMb/b;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LOb/a;

    invoke-static {}, LOb/b;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LTb/b;

    invoke-static {}, LTb/c;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LSb/b;

    invoke-static {}, LSb/c;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LWb/j;

    invoke-static {}, LWb/k;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LWb/h;

    invoke-static {}, LWb/i;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LWb/a;

    invoke-static {}, LWb/b;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LZb/a;

    invoke-static {}, LZb/b;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LXb/e;

    invoke-static {}, LXb/g;->B()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LYb/b;

    invoke-static {}, LYb/d;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lcc/b;

    invoke-static {}, Lcc/c;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LLb/b;

    invoke-static {}, LLb/c;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LNb/e;

    invoke-static {}, LNb/f;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lac/c;

    invoke-static {}, Lac/d;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lac/e;

    invoke-static {}, Lac/f;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LPb/c;

    invoke-static {}, LPb/d;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LPb/e;

    invoke-static {}, LPb/f;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LPb/a;

    invoke-static {}, LPb/b;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LRb/a;

    invoke-static {}, LRb/b;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, LNb/a;

    invoke-static {}, LNb/b;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
