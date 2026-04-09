.class public final LT/N0;
.super LT/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/N0$a;,
        LT/N0$b;,
        LT/N0$c;,
        LT/N0$d;
    }
.end annotation


# static fields
.field private static final A:LLi/z;

.field private static final B:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final y:LT/N0$a;

.field public static final z:I


# instance fields
.field private a:J

.field private final b:LT/h;

.field private final c:Ljava/lang/Object;

.field private d:LIi/y0;

.field private e:Ljava/lang/Throwable;

.field private final f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Lo/I;

.field private final i:LV/b;

.field private final j:Ljava/util/List;

.field private final k:Ljava/util/List;

.field private final l:Ljava/util/Map;

.field private final m:Ljava/util/Map;

.field private n:Ljava/util/List;

.field private o:Ljava/util/Set;

.field private p:LIi/n;

.field private q:I

.field private r:Z

.field private s:LT/N0$b;

.field private t:Z

.field private final u:LLi/z;

.field private final v:LIi/A;

.field private final w:Ldh/i;

.field private final x:LT/N0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT/N0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT/N0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LT/N0;->y:LT/N0$a;

    const/16 v0, 0x8

    sput v0, LT/N0;->z:I

    invoke-static {}, LW/a;->b()LW/f;

    move-result-object v0

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    sput-object v0, LT/N0;->A:LLi/z;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, LT/N0;->B:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Ldh/i;)V
    .locals 5

    invoke-direct {p0}, LT/q;-><init>()V

    new-instance v0, LT/h;

    new-instance v1, LT/N0$e;

    invoke-direct {v1, p0}, LT/N0$e;-><init>(LT/N0;)V

    invoke-direct {v0, v1}, LT/h;-><init>(Lmh/a;)V

    iput-object v0, p0, LT/N0;->b:LT/h;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LT/N0;->c:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LT/N0;->f:Ljava/util/List;

    new-instance v1, Lo/I;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, LT/N0;->h:Lo/I;

    new-instance v1, LV/b;

    const/16 v2, 0x10

    new-array v2, v2, [LT/E;

    invoke-direct {v1, v2, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v1, p0, LT/N0;->i:LV/b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LT/N0;->j:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LT/N0;->k:Ljava/util/List;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LT/N0;->l:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LT/N0;->m:Ljava/util/Map;

    sget-object v1, LT/N0$d;->Inactive:LT/N0$d;

    invoke-static {v1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v1

    iput-object v1, p0, LT/N0;->u:LLi/z;

    sget-object v1, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p1, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    check-cast v1, LIi/y0;

    invoke-static {v1}, LIi/A0;->a(LIi/y0;)LIi/A;

    move-result-object v1

    new-instance v2, LT/N0$f;

    invoke-direct {v2, p0}, LT/N0$f;-><init>(LT/N0;)V

    invoke-interface {v1, v2}, LIi/y0;->invokeOnCompletion(Lmh/l;)LIi/e0;

    iput-object v1, p0, LT/N0;->v:LIi/A;

    invoke-interface {p1, v0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    invoke-interface {p1, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    iput-object p1, p0, LT/N0;->w:Ldh/i;

    new-instance p1, LT/N0$c;

    invoke-direct {p1, p0}, LT/N0$c;-><init>(LT/N0;)V

    iput-object p1, p0, LT/N0;->x:LT/N0$c;

    return-void
.end method

.method public static final synthetic A(LT/N0;)Z
    .locals 0

    invoke-direct {p0}, LT/N0;->h0()Z

    move-result p0

    return p0
.end method

.method private final A0(LT/E;Lo/I;)Lmh/l;
    .locals 1

    new-instance v0, LT/N0$l;

    invoke-direct {v0, p1, p2}, LT/N0$l;-><init>(LT/E;Lo/I;)V

    return-object v0
.end method

.method public static final synthetic B(LT/N0;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LT/N0;->i0()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(LT/N0;)LT/N0$c;
    .locals 0

    iget-object p0, p0, LT/N0;->x:LT/N0$c;

    return-object p0
.end method

.method public static final synthetic D(LT/N0;)LIi/y0;
    .locals 0

    iget-object p0, p0, LT/N0;->d:LIi/y0;

    return-object p0
.end method

.method public static final synthetic E(LT/N0;)Z
    .locals 0

    invoke-direct {p0}, LT/N0;->j0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic F(LT/N0;)Lo/I;
    .locals 0

    iget-object p0, p0, LT/N0;->h:Lo/I;

    return-object p0
.end method

.method public static final synthetic G(LT/N0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LT/N0;->c:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic H(LT/N0;)LIi/n;
    .locals 0

    iget-object p0, p0, LT/N0;->p:LIi/n;

    return-object p0
.end method

.method public static final synthetic I()LLi/z;
    .locals 1

    sget-object v0, LT/N0;->A:LLi/z;

    return-object v0
.end method

.method public static final synthetic J(LT/N0;)LLi/z;
    .locals 0

    iget-object p0, p0, LT/N0;->u:LLi/z;

    return-object p0
.end method

.method public static final synthetic K(LT/N0;)Z
    .locals 0

    iget-boolean p0, p0, LT/N0;->r:Z

    return p0
.end method

.method public static final synthetic L(LT/N0;Ljava/util/List;Lo/I;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, LT/N0;->o0(Ljava/util/List;Lo/I;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M(LT/N0;LT/E;Lo/I;)LT/E;
    .locals 0

    invoke-direct {p0, p1, p2}, LT/N0;->p0(LT/E;Lo/I;)LT/E;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(LT/N0;)Z
    .locals 0

    invoke-direct {p0}, LT/N0;->u0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic O(LT/N0;LT/E;)V
    .locals 0

    invoke-direct {p0, p1}, LT/N0;->v0(LT/E;)V

    return-void
.end method

.method public static final synthetic P(LT/N0;LIi/y0;)V
    .locals 0

    invoke-direct {p0, p1}, LT/N0;->w0(LIi/y0;)V

    return-void
.end method

.method public static final synthetic Q(LT/N0;J)V
    .locals 0

    iput-wide p1, p0, LT/N0;->a:J

    return-void
.end method

.method public static final synthetic R(LT/N0;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LT/N0;->e:Ljava/lang/Throwable;

    return-void
.end method

.method public static final synthetic S(LT/N0;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, LT/N0;->o:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic T(LT/N0;LIi/y0;)V
    .locals 0

    iput-object p1, p0, LT/N0;->d:LIi/y0;

    return-void
.end method

.method public static final synthetic U(LT/N0;LIi/n;)V
    .locals 0

    iput-object p1, p0, LT/N0;->p:LIi/n;

    return-void
.end method

.method private final V(LT/E;)V
    .locals 1

    iget-object v0, p0, LT/N0;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LT/N0;->g:Ljava/util/List;

    return-void
.end method

.method private final W(Landroidx/compose/runtime/snapshots/b;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/b;->C()Landroidx/compose/runtime/snapshots/h;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/snapshots/h$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/b;->d()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/b;->d()V

    throw v0
.end method

.method private final X(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, LT/N0;->h0()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, LIi/p;

    invoke-static {p1}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-static {p0}, LT/N0;->G(LT/N0;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {p0}, LT/N0;->A(LT/N0;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, LT/N0;->U(LT/N0;LIi/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :goto_0
    monitor-exit v1

    if-eqz v2, :cond_1

    sget-object v1, LYg/u;->b:LYg/u$a;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_2
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_3

    return-object v0

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final Z()V
    .locals 1

    iget-object v0, p0, LT/N0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LT/N0;->g:Ljava/util/List;

    return-void
.end method

.method private final a0()LIi/n;
    .locals 4

    iget-object v0, p0, LT/N0;->u:LLi/z;

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/N0$d;

    sget-object v1, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gtz v0, :cond_1

    invoke-direct {p0}, LT/N0;->Z()V

    new-instance v0, Lo/I;

    invoke-direct {v0, v1, v2, v3}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LT/N0;->h:Lo/I;

    iget-object v0, p0, LT/N0;->i:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    iget-object v0, p0, LT/N0;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LT/N0;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iput-object v3, p0, LT/N0;->n:Ljava/util/List;

    iget-object v0, p0, LT/N0;->p:LIi/n;

    if-eqz v0, :cond_0

    invoke-static {v0, v3, v2, v3}, LIi/n$a;->a(LIi/n;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_0
    iput-object v3, p0, LT/N0;->p:LIi/n;

    iput-object v3, p0, LT/N0;->s:LT/N0$b;

    return-object v3

    :cond_1
    iget-object v0, p0, LT/N0;->s:LT/N0$b;

    if-eqz v0, :cond_2

    sget-object v0, LT/N0$d;->Inactive:LT/N0$d;

    goto :goto_1

    :cond_2
    iget-object v0, p0, LT/N0;->d:LIi/y0;

    if-nez v0, :cond_4

    new-instance v0, Lo/I;

    invoke-direct {v0, v1, v2, v3}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LT/N0;->h:Lo/I;

    iget-object v0, p0, LT/N0;->i:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    invoke-direct {p0}, LT/N0;->f0()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, LT/N0$d;->InactivePendingWork:LT/N0$d;

    goto :goto_1

    :cond_3
    sget-object v0, LT/N0$d;->Inactive:LT/N0$d;

    goto :goto_1

    :cond_4
    iget-object v0, p0, LT/N0;->i:LV/b;

    invoke-virtual {v0}, LV/b;->u()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LT/N0;->h:Lo/I;

    invoke-virtual {v0}, Lo/T;->e()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LT/N0;->j:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LT/N0;->k:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, LT/N0;->q:I

    if-gtz v0, :cond_6

    invoke-direct {p0}, LT/N0;->f0()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, LT/N0$d;->Idle:LT/N0$d;

    goto :goto_1

    :cond_6
    :goto_0
    sget-object v0, LT/N0$d;->PendingWork:LT/N0$d;

    :goto_1
    iget-object v1, p0, LT/N0;->u:LLi/z;

    invoke-interface {v1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    sget-object v1, LT/N0$d;->PendingWork:LT/N0$d;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, LT/N0;->p:LIi/n;

    iput-object v3, p0, LT/N0;->p:LIi/n;

    move-object v3, v0

    :cond_7
    return-object v3
.end method

.method private final b0()V
    .locals 8

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, LT/N0;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, LZg/v;->y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p0, LT/N0;->l:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_0

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LT/l0;

    iget-object v7, p0, LT/N0;->m:Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    iget-object v1, p0, LT/N0;->m:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    goto :goto_1

    :cond_1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v2, v0, :cond_2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYg/s;

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT/l0;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/k0;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method private final e0()Z
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, LT/N0;->f0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final f0()Z
    .locals 1

    iget-boolean v0, p0, LT/N0;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LT/N0;->b:LT/h;

    invoke-virtual {v0}, LT/h;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final g0()Z
    .locals 1

    iget-object v0, p0, LT/N0;->i:LV/b;

    invoke-virtual {v0}, LV/b;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LT/N0;->f0()Z

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

.method private final h0()Z
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->h:Lo/I;

    invoke-virtual {v1}, Lo/T;->e()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LT/N0;->i:LV/b;

    invoke-virtual {v1}, LV/b;->u()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0}, LT/N0;->f0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method private final i0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LT/N0;->g:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v0, p0, LT/N0;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, LT/N0;->g:Ljava/util/List;

    :cond_1
    return-object v0
.end method

.method private final j0()Z
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LT/N0;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz v1, :cond_2

    iget-object v0, p0, LT/N0;->v:LIi/A;

    invoke-interface {v0}, LIi/y0;->getChildren()Lzi/j;

    move-result-object v0

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LIi/y0;

    invoke-interface {v1}, LIi/y0;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final m0(LT/E;)V
    .locals 5

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT/l0;

    invoke-virtual {v4}, LT/l0;->b()LT/E;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, p0, p1}, LT/N0;->n0(Ljava/util/List;LT/N0;LT/E;)V

    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LT/N0;->o0(Ljava/util/List;Lo/I;)Ljava/util/List;

    invoke-static {v0, p0, p1}, LT/N0;->n0(Ljava/util/List;LT/N0;LT/E;)V

    goto :goto_1

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method private static final n0(Ljava/util/List;LT/N0;LT/E;)V
    .locals 3

    invoke-interface {p0}, Ljava/util/List;->clear()V

    iget-object v0, p1, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, LT/N0;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/l0;

    invoke-virtual {v1}, LT/l0;->b()LT/E;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method private final o0(Ljava/util/List;Lo/I;)Ljava/util/List;
    .locals 13

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LT/l0;

    invoke-virtual {v5}, LT/l0;->b()LT/E;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT/E;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v3}, LT/E;->l()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    invoke-static {v4}, LT/o;->O(Z)V

    sget-object v4, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-direct {p0, v3}, LT/N0;->s0(LT/E;)Lmh/l;

    move-result-object v5

    invoke-direct {p0, v3, p2}, LT/N0;->A0(LT/E;Lo/I;)Lmh/l;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroidx/compose/runtime/snapshots/g$a;->o(Lmh/l;Lmh/l;)Landroidx/compose/runtime/snapshots/b;

    move-result-object v4

    :try_start_0
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/g;->l()Landroidx/compose/runtime/snapshots/g;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v6, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    move v9, v2

    :goto_2
    const/4 v10, 0x0

    if-ge v9, v8, :cond_2

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LT/l0;

    iget-object v12, p0, LT/N0;->l:Ljava/util/Map;

    invoke-virtual {v11}, LT/l0;->c()LT/j0;

    invoke-static {v12, v10}, LT/O0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11, v10}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_2
    :try_start_3
    monitor-exit v6

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    move v6, v2

    :goto_3
    if-ge v6, v1, :cond_a

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LYg/s;

    invoke-virtual {v8}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_3
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    move v6, v2

    :goto_4
    if-ge v6, v1, :cond_a

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LYg/s;

    invoke-virtual {v8}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    move v8, v2

    :goto_5
    if-ge v8, v6, :cond_7

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LYg/s;

    invoke-virtual {v9}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_5

    invoke-virtual {v9}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LT/l0;

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_a

    :cond_5
    move-object v9, v10

    :goto_6
    if-eqz v9, :cond_6

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    iget-object v6, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v8, p0, LT/N0;->k:Ljava/util/List;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8, v1}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v6

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    move v8, v2

    :goto_7
    if-ge v8, v6, :cond_9

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, LYg/s;

    invoke-virtual {v10}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_8

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_9
    move-object v7, v1

    goto :goto_8

    :catchall_2
    move-exception p1

    monitor-exit v6

    throw p1

    :cond_a
    :goto_8
    invoke-interface {v3, v7}, LT/E;->m(Ljava/util/List;)V

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/snapshots/g;->s(Landroidx/compose/runtime/snapshots/g;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-direct {p0, v4}, LT/N0;->W(Landroidx/compose/runtime/snapshots/b;)V

    goto/16 :goto_1

    :catchall_3
    move-exception p1

    goto :goto_b

    :goto_9
    :try_start_7
    monitor-exit v6

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_a
    :try_start_8
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/snapshots/g;->s(Landroidx/compose/runtime/snapshots/g;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_b
    invoke-direct {p0, v4}, LT/N0;->W(Landroidx/compose/runtime/snapshots/b;)V

    throw p1

    :cond_b
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final p0(LT/E;Lo/I;)LT/E;
    .locals 5

    invoke-interface {p1}, LT/E;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-interface {p1}, LT/p;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LT/N0;->o:Ljava/util/Set;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_4

    :cond_0
    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-direct {p0, p1}, LT/N0;->s0(LT/E;)Lmh/l;

    move-result-object v3

    invoke-direct {p0, p1, p2}, LT/N0;->A0(LT/E;Lo/I;)Lmh/l;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroidx/compose/runtime/snapshots/g$a;->o(Lmh/l;Lmh/l;)Landroidx/compose/runtime/snapshots/b;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g;->l()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_1

    :try_start_1
    invoke-virtual {p2}, Lo/T;->e()Z

    move-result v4

    if-ne v4, v2, :cond_1

    new-instance v2, LT/N0$h;

    invoke-direct {v2, p2, p1}, LT/N0$h;-><init>(Lo/I;LT/E;)V

    invoke-interface {p1, v2}, LT/E;->b(Lmh/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-interface {p1}, LT/E;->u()Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/g;->s(Landroidx/compose/runtime/snapshots/g;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-direct {p0, v0}, LT/N0;->W(Landroidx/compose/runtime/snapshots/b;)V

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_3
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/g;->s(Landroidx/compose/runtime/snapshots/g;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    invoke-direct {p0, v0}, LT/N0;->W(Landroidx/compose/runtime/snapshots/b;)V

    throw p1

    :cond_3
    :goto_4
    return-object v1
.end method

.method private final q0(Ljava/lang/Exception;LT/E;Z)V
    .locals 5

    sget-object v0, LT/N0;->B:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v0, p1, Landroidx/compose/runtime/ComposeRuntimeError;

    if-nez v0, :cond_1

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v2, "Error was captured in composition while live edit was enabled."

    invoke-static {v2, p1}, LT/b;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v2, p0, LT/N0;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, p0, LT/N0;->i:LV/b;

    invoke-virtual {v2}, LV/b;->h()V

    new-instance v2, Lo/I;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v1, v3, v4}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, LT/N0;->h:Lo/I;

    iget-object v1, p0, LT/N0;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, LT/N0;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, LT/N0;->m:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    new-instance v1, LT/N0$b;

    invoke-direct {v1, p3, p1}, LT/N0$b;-><init>(ZLjava/lang/Exception;)V

    iput-object v1, p0, LT/N0;->s:LT/N0$b;

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, LT/N0;->v0(LT/E;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-direct {p0}, LT/N0;->a0()LIi/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :cond_1
    iget-object p2, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object p3, p0, LT/N0;->s:LT/N0$b;

    if-nez p3, :cond_2

    new-instance p3, LT/N0$b;

    invoke-direct {p3, v1, p1}, LT/N0$b;-><init>(ZLjava/lang/Exception;)V

    iput-object p3, p0, LT/N0;->s:LT/N0$b;

    sget-object p3, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :try_start_2
    invoke-virtual {p3}, LT/N0$b;->a()Ljava/lang/Exception;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit p2

    throw p1
.end method

.method static synthetic r0(LT/N0;Ljava/lang/Exception;LT/E;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LT/N0;->q0(Ljava/lang/Exception;LT/E;Z)V

    return-void
.end method

.method public static final synthetic s(LT/N0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LT/N0;->X(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final s0(LT/E;)Lmh/l;
    .locals 1

    new-instance v0, LT/N0$i;

    invoke-direct {v0, p1}, LT/N0$i;-><init>(LT/E;)V

    return-object v0
.end method

.method public static final synthetic t(LT/N0;)LIi/n;
    .locals 0

    invoke-direct {p0}, LT/N0;->a0()LIi/n;

    move-result-object p0

    return-object p0
.end method

.method private final t0(Lmh/q;Ldh/e;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, LT/i0;->a(Ldh/i;)LT/g0;

    move-result-object v0

    iget-object v1, p0, LT/N0;->b:LT/h;

    new-instance v2, LT/N0$j;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, LT/N0$j;-><init>(LT/N0;Lmh/q;LT/g0;Ldh/e;)V

    invoke-static {v1, v2, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static final synthetic u(LT/N0;)V
    .locals 0

    invoke-direct {p0}, LT/N0;->b0()V

    return-void
.end method

.method private final u0()Z
    .locals 9

    const/4 v0, 0x1

    iget-object v1, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LT/N0;->h:Lo/I;

    invoke-virtual {v2}, Lo/T;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, LT/N0;->g0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :try_start_1
    iget-object v2, p0, LT/N0;->h:Lo/I;

    invoke-static {v2}, LV/e;->a(Lo/T;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, Lo/I;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v5, v0, v4}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, LT/N0;->h:Lo/I;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    iget-object v1, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    invoke-direct {p0}, LT/N0;->i0()Ljava/util/List;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    monitor-exit v1

    :try_start_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move v6, v5

    :goto_0
    if-ge v6, v1, :cond_1

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LT/E;

    invoke-interface {v7, v2}, LT/E;->i(Ljava/util/Set;)V

    iget-object v7, p0, LT/N0;->u:LLi/z;

    invoke-interface {v7}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LT/N0$d;

    sget-object v8, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v7

    if-lez v7, :cond_1

    add-int/2addr v6, v0

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v1, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    new-instance v3, Lo/I;

    invoke-direct {v3, v5, v0, v4}, Lo/I;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, LT/N0;->h:Lo/I;

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_6
    invoke-direct {p0}, LT/N0;->a0()LIi/n;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-direct {p0}, LT/N0;->g0()Z

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v0

    return v1

    :catchall_2
    move-exception v1

    goto :goto_1

    :cond_2
    :try_start_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "called outside of runRecomposeAndApplyChanges"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_1
    monitor-exit v0

    throw v1

    :catchall_3
    move-exception v0

    :try_start_8
    monitor-exit v1

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    iget-object v1, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_9
    iget-object v3, p0, LT/N0;->h:Lo/I;

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual {v3, v2}, Lo/I;->i(Ljava/lang/Iterable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    monitor-exit v1

    throw v0

    :catchall_4
    move-exception v0

    monitor-exit v1

    throw v0

    :catchall_5
    move-exception v0

    monitor-exit v1

    throw v0

    :goto_3
    monitor-exit v1

    throw v0
.end method

.method public static final synthetic v(LT/N0;)LT/h;
    .locals 0

    iget-object p0, p0, LT/N0;->b:LT/h;

    return-object p0
.end method

.method private final v0(LT/E;)V
    .locals 2

    iget-object v0, p0, LT/N0;->n:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LT/N0;->n:Ljava/util/List;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-direct {p0, p1}, LT/N0;->x0(LT/E;)V

    return-void
.end method

.method public static final synthetic w(LT/N0;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, LT/N0;->e:Ljava/lang/Throwable;

    return-object p0
.end method

.method private final w0(LIi/y0;)V
    .locals 3

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->e:Ljava/lang/Throwable;

    if-nez v1, :cond_2

    iget-object v1, p0, LT/N0;->u:LLi/z;

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/N0$d;

    sget-object v2, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, LT/N0;->d:LIi/y0;

    if-nez v1, :cond_0

    iput-object p1, p0, LT/N0;->d:LIi/y0;

    invoke-direct {p0}, LT/N0;->a0()LIi/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Recomposer already running"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Recomposer shut down"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public static final synthetic x(LT/N0;)LV/b;
    .locals 0

    iget-object p0, p0, LT/N0;->i:LV/b;

    return-object p0
.end method

.method private final x0(LT/E;)V
    .locals 1

    iget-object v0, p0, LT/N0;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LT/N0;->g:Ljava/util/List;

    return-void
.end method

.method public static final synthetic y(LT/N0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LT/N0;->k:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic z(LT/N0;)Z
    .locals 0

    invoke-direct {p0}, LT/N0;->e0()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final Y()V
    .locals 3

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->u:LLi/z;

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT/N0$d;

    sget-object v2, LT/N0$d;->Idle:LT/N0$d;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, LT/N0;->u:LLi/z;

    sget-object v2, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-interface {v1, v2}, LLi/z;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LT/N0;->v:LIi/A;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public a(LT/E;Lmh/p;)V
    .locals 6

    invoke-interface {p1}, LT/E;->l()Z

    move-result v0

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-direct {p0, p1}, LT/N0;->s0(LT/E;)Lmh/l;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {p0, p1, v4}, LT/N0;->A0(LT/E;Lo/I;)Lmh/l;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroidx/compose/runtime/snapshots/g$a;->o(Lmh/l;Lmh/l;)Landroidx/compose/runtime/snapshots/b;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->l()Landroidx/compose/runtime/snapshots/g;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p1, p2}, LT/E;->r(Lmh/p;)V

    sget-object p2, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/g;->s(Landroidx/compose/runtime/snapshots/g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-direct {p0, v3}, LT/N0;->W(Landroidx/compose/runtime/snapshots/b;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-nez v0, :cond_0

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->g()V

    :cond_0
    iget-object p2, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_5
    iget-object v3, p0, LT/N0;->u:LLi/z;

    invoke-interface {v3}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LT/N0$d;

    sget-object v4, LT/N0$d;->ShuttingDown:LT/N0$d;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_1

    invoke-direct {p0}, LT/N0;->i0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-direct {p0, p1}, LT/N0;->V(LT/E;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p2

    :try_start_6
    invoke-direct {p0, p1}, LT/N0;->m0(LT/E;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    invoke-interface {p1}, LT/E;->k()V

    invoke-interface {p1}, LT/E;->d()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->g()V

    :cond_2
    return-void

    :catch_0
    move-exception p1

    move-object v1, p1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LT/N0;->r0(LT/N0;Ljava/lang/Exception;LT/E;ZILjava/lang/Object;)V

    return-void

    :catch_1
    move-exception p2

    invoke-direct {p0, p2, p1, v1}, LT/N0;->q0(Ljava/lang/Exception;LT/E;Z)V

    return-void

    :goto_1
    monitor-exit p2

    throw p1

    :catch_2
    move-exception p2

    goto :goto_3

    :catchall_1
    move-exception p2

    goto :goto_2

    :catchall_2
    move-exception p2

    :try_start_8
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/g;->s(Landroidx/compose/runtime/snapshots/g;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    :try_start_9
    invoke-direct {p0, v3}, LT/N0;->W(Landroidx/compose/runtime/snapshots/b;)V

    throw p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    :goto_3
    invoke-direct {p0, p2, p1, v1}, LT/N0;->q0(Ljava/lang/Exception;LT/E;Z)V

    return-void
.end method

.method public c()Z
    .locals 1

    sget-object v0, LT/N0;->B:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c0()J
    .locals 2

    iget-wide v0, p0, LT/N0;->a:J

    return-wide v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d0()LLi/N;
    .locals 1

    iget-object v0, p0, LT/N0;->u:LLi/z;

    return-object v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    const/16 v0, 0x3e8

    return v0
.end method

.method public h()Ldh/i;
    .locals 1

    iget-object v0, p0, LT/N0;->w:Ldh/i;

    return-object v0
.end method

.method public j(LT/l0;)V
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->k:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, LT/N0;->a0()LIi/n;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p1, :cond_0

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public k(LT/E;)V
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->i:LV/b;

    invoke-virtual {v1, p1}, LV/b;->i(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LT/N0;->i:LV/b;

    invoke-virtual {v1, p1}, LV/b;->b(Ljava/lang/Object;)Z

    invoke-direct {p0}, LT/N0;->a0()LIi/n;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    if-eqz p1, :cond_1

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final k0(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LT/N0;->d0()LLi/N;

    move-result-object v0

    new-instance v1, LT/N0$g;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LT/N0$g;-><init>(Ldh/e;)V

    invoke-static {v0, v1, p1}, LLi/i;->y(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public l(LT/l0;)LT/k0;
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->m:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT/k0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final l0()V
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LT/N0;->t:Z

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public m(Ljava/util/Set;)V
    .locals 0

    return-void
.end method

.method public o(LT/E;)V
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LT/N0;->o:Ljava/util/Set;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, LT/N0;->o:Ljava/util/Set;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public r(LT/E;)V
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1}, LT/N0;->x0(LT/E;)V

    iget-object v1, p0, LT/N0;->i:LV/b;

    invoke-virtual {v1, p1}, LV/b;->x(Ljava/lang/Object;)Z

    iget-object v1, p0, LT/N0;->j:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final y0()V
    .locals 2

    iget-object v0, p0, LT/N0;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LT/N0;->t:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, LT/N0;->t:Z

    invoke-direct {p0}, LT/N0;->a0()LIi/n;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    if-eqz v1, :cond_1

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final z0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LT/N0$k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LT/N0$k;-><init>(LT/N0;Ldh/e;)V

    invoke-direct {p0, v0, p1}, LT/N0;->t0(Lmh/q;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
