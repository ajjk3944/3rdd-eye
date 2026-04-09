.class public LNi/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _prev$volatile:Ljava/lang/Object;

.field private volatile synthetic _removedRef$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_next$volatile"

    const-class v1, LNi/n;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LNi/n;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_prev$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LNi/n;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_removedRef$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LNi/n;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LNi/n;->_next$volatile:Ljava/lang/Object;

    iput-object p0, p0, LNi/n;->_prev$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final g()LNi/n;
    .locals 7

    :goto_0
    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNi/n;

    const/4 v1, 0x0

    move-object v2, v0

    :goto_1
    move-object v3, v1

    :goto_2
    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_2

    if-ne v0, v2, :cond_0

    return-object v2

    :cond_0
    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {v1, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v2

    :cond_2
    invoke-virtual {p0}, LNi/n;->p()Z

    move-result v5

    if-eqz v5, :cond_3

    return-object v1

    :cond_3
    instance-of v5, v4, LNi/w;

    if-eqz v5, :cond_6

    if-eqz v3, :cond_5

    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v5

    check-cast v4, LNi/w;

    iget-object v4, v4, LNi/w;->a:LNi/n;

    invoke-static {v5, v3, v2, v4}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    move-object v2, v3

    goto :goto_1

    :cond_5
    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNi/n;

    goto :goto_2

    :cond_6
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v4

    check-cast v3, LNi/n;

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    goto :goto_2
.end method

.method private final h(LNi/n;)LNi/n;
    .locals 1

    :goto_0
    invoke-virtual {p1}, LNi/n;->p()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNi/n;

    goto :goto_0
.end method

.method private final i(LNi/n;)V
    .locals 3

    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNi/n;

    invoke-virtual {p0}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_1

    return-void

    :cond_1
    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-static {v2, p1, v1, p0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LNi/n;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p1}, LNi/n;->g()LNi/n;

    :cond_2
    return-void
.end method

.method private static final synthetic m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LNi/n;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LNi/n;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LNi/n;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final s()LNi/w;
    .locals 2

    invoke-static {}, LNi/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNi/w;

    if-nez v0, :cond_0

    new-instance v0, LNi/w;

    invoke-direct {v0, p0}, LNi/w;-><init>(LNi/n;)V

    invoke-static {}, LNi/n;->o()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final c(LNi/n;I)Z
    .locals 3

    :cond_0
    invoke-virtual {p0}, LNi/n;->l()LNi/n;

    move-result-object v0

    instance-of v1, v0, LNi/l;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, LNi/l;

    iget v1, v1, LNi/l;->d:I

    and-int/2addr v1, p2

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, LNi/n;->c(LNi/n;I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1, p0}, LNi/n;->d(LNi/n;LNi/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return v2
.end method

.method public final d(LNi/n;LNi/n;)Z
    .locals 1

    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {v0, p0, p2, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p1, p2}, LNi/n;->i(LNi/n;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e(LNi/n;)Z
    .locals 1

    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-static {v0, p0, p0, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p1, p0}, LNi/n;->i(LNi/n;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final f(I)V
    .locals 1

    new-instance v0, LNi/l;

    invoke-direct {v0, p1}, LNi/l;-><init>(I)V

    invoke-virtual {p0, v0, p1}, LNi/n;->c(LNi/n;I)Z

    return-void
.end method

.method public final j()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final k()LNi/n;
    .locals 2

    invoke-virtual {p0}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LNi/w;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LNi/w;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, v1, LNi/w;->a:LNi/n;

    if-nez v1, :cond_2

    :cond_1
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, LNi/n;

    :cond_2
    return-object v1
.end method

.method public final l()LNi/n;
    .locals 1

    invoke-direct {p0}, LNi/n;->g()LNi/n;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LNi/n;->n()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LNi/n;

    invoke-direct {p0, v0}, LNi/n;->h(LNi/n;)LNi/n;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public p()Z
    .locals 1

    invoke-virtual {p0}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LNi/w;

    return v0
.end method

.method public q()Z
    .locals 1

    invoke-virtual {p0}, LNi/n;->r()LNi/n;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final r()LNi/n;
    .locals 4

    :cond_0
    invoke-virtual {p0}, LNi/n;->j()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LNi/w;

    if-eqz v1, :cond_1

    check-cast v0, LNi/w;

    iget-object v0, v0, LNi/w;->a:LNi/n;

    return-object v0

    :cond_1
    if-ne v0, p0, :cond_2

    check-cast v0, LNi/n;

    return-object v0

    :cond_2
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, LNi/n;

    invoke-direct {v1}, LNi/n;->s()LNi/w;

    move-result-object v2

    invoke-static {}, LNi/n;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v0, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {v1}, LNi/n;->g()LNi/n;

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, LNi/n$a;

    invoke-direct {v1, p0}, LNi/n$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LIi/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
