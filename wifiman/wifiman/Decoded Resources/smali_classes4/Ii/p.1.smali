.class public LIi/p;
.super LIi/a0;
.source "SourceFile"

# interfaces
.implements LIi/n;
.implements Lkotlin/coroutines/jvm/internal/e;
.implements LIi/a1;


# static fields
.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decisionAndIndex$volatile:I

.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field private final d:Ldh/e;

.field private final e:Ldh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_decisionAndIndex$volatile"

    const-class v1, LIi/p;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LIi/p;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "_state$volatile"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LIi/p;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle$volatile"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LIi/p;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ldh/e;I)V
    .locals 0

    invoke-direct {p0, p2}, LIi/a0;-><init>(I)V

    iput-object p1, p0, LIi/p;->d:Ldh/e;

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object p1

    iput-object p1, p0, LIi/p;->e:Ldh/i;

    const p1, 0x1fffffff

    iput p1, p0, LIi/p;->_decisionAndIndex$volatile:I

    sget-object p1, LIi/d;->a:LIi/d;

    iput-object p1, p0, LIi/p;->_state$volatile:Ljava/lang/Object;

    return-void
.end method

.method private final C()LIi/e0;
    .locals 5

    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object v0

    sget-object v1, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, LIi/y0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, LIi/t;

    invoke-direct {v2, p0}, LIi/t;-><init>(LIi/p;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v3, v1}, LIi/A0;->o(LIi/y0;ZLIi/C0;ILjava/lang/Object;)LIi/e0;

    move-result-object v0

    invoke-static {}, LIi/p;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v0
.end method

.method private final D(Ljava/lang/Object;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v3, v11, LIi/d;

    if-eqz v3, :cond_1

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, v0, v11, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_1
    instance-of v3, v11, LIi/m;

    if-nez v3, :cond_e

    instance-of v3, v11, LNi/z;

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    instance-of v3, v11, LIi/C;

    if-eqz v3, :cond_8

    move-object v2, v11

    check-cast v2, LIi/C;

    invoke-virtual {v2}, LIi/C;->c()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-direct {v0, v1, v11}, LIi/p;->G(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    instance-of v3, v11, LIi/s;

    if-eqz v3, :cond_7

    instance-of v3, v11, LIi/C;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_5

    iget-object v4, v2, LIi/C;->a:Ljava/lang/Throwable;

    :cond_5
    instance-of v2, v1, LIi/m;

    if-eqz v2, :cond_6

    check-cast v1, LIi/m;

    invoke-virtual {v0, v1, v4}, LIi/p;->j(LIi/m;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_6
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LNi/z;

    invoke-direct {v0, v1, v4}, LIi/p;->l(LNi/z;Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    return-void

    :cond_8
    instance-of v3, v11, LIi/B;

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"

    if-eqz v3, :cond_c

    move-object v12, v11

    check-cast v12, LIi/B;

    iget-object v3, v12, LIi/B;->b:LIi/m;

    if-eqz v3, :cond_9

    invoke-direct {v0, v1, v11}, LIi/p;->G(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_9
    instance-of v3, v1, LNi/z;

    if-eqz v3, :cond_a

    return-void

    :cond_a
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v1

    check-cast v14, LIi/m;

    invoke-virtual {v12}, LIi/B;->c()Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v1, v12, LIi/B;->e:Ljava/lang/Throwable;

    invoke-virtual {v0, v14, v1}, LIi/p;->j(LIi/m;Ljava/lang/Throwable;)V

    return-void

    :cond_b
    const/16 v18, 0x1d

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, LIi/B;->b(LIi/B;Ljava/lang/Object;LIi/m;Lmh/q;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LIi/B;

    move-result-object v3

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-static {v4, v0, v11, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_c
    instance-of v3, v1, LNi/z;

    if-eqz v3, :cond_d

    return-void

    :cond_d
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    check-cast v5, LIi/m;

    new-instance v12, LIi/B;

    const/16 v9, 0x1c

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v12

    move-object v4, v11

    invoke-direct/range {v3 .. v10}, LIi/B;-><init>(Ljava/lang/Object;LIi/m;Lmh/q;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, v0, v11, v12}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_e
    :goto_3
    invoke-direct {v0, v1, v11}, LIi/p;->G(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method private final F()Z
    .locals 2

    iget v0, p0, LIi/a0;->c:I

    invoke-static {v0}, LIi/b0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LIi/p;->d:Ldh/e;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LNi/g;

    invoke-virtual {v0}, LNi/g;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final G(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final N(Lmh/l;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic P(LIi/p;Ljava/lang/Object;ILmh/q;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LIi/p;->O(Ljava/lang/Object;ILmh/q;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final Q(LIi/L0;Ljava/lang/Object;ILmh/q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, LIi/C;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p3}, LIi/b0;->b(I)Z

    move-result p3

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    goto :goto_2

    :cond_1
    if-nez p4, :cond_2

    instance-of p3, p1, LIi/m;

    if-nez p3, :cond_2

    if-eqz p5, :cond_4

    :cond_2
    new-instance p3, LIi/B;

    instance-of v0, p1, LIi/m;

    if-eqz v0, :cond_3

    check-cast p1, LIi/m;

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, LIi/B;-><init>(Ljava/lang/Object;LIi/m;Lmh/q;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, p3

    :cond_4
    :goto_2
    return-object p2
.end method

.method private final R()Z
    .locals 6

    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const v4, 0x1fffffff

    and-int/2addr v4, v1

    const/high16 v5, 0x40000000    # 2.0f

    add-int/2addr v5, v4

    invoke-virtual {v2, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v3
.end method

.method private final S(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)LNi/C;
    .locals 9

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LIi/L0;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, LIi/L0;

    iget v6, p0, LIi/a0;->c:I

    move-object v3, p0

    move-object v5, p1

    move-object v7, p3

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LIi/p;->Q(LIi/L0;Ljava/lang/Object;ILmh/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LIi/p;->o()V

    sget-object p1, LIi/q;->a:LNi/C;

    return-object p1

    :cond_1
    instance-of p1, v1, LIi/B;

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    check-cast v1, LIi/B;

    iget-object p1, v1, LIi/B;->d:Ljava/lang/Object;

    if-ne p1, p2, :cond_2

    sget-object p3, LIi/q;->a:LNi/C;

    :cond_2
    return-object p3
.end method

.method private final T()Z
    .locals 5

    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_2

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v2

    const v3, 0x1fffffff

    and-int/2addr v3, v1

    const/high16 v4, 0x20000000

    add-int/2addr v4, v3

    invoke-virtual {v2, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method public static synthetic h(Lmh/l;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LIi/p;->N(Lmh/l;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l(LNi/z;Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object v1

    invoke-virtual {p1, v0, p2, v1}, LNi/z;->s(ILjava/lang/Throwable;Ldh/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object p2

    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The index for Segment.onCancellation(..) is broken"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final m(Ljava/lang/Throwable;)Z
    .locals 2

    invoke-direct {p0}, LIi/p;->F()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LIi/p;->d:Ldh/e;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LNi/g;

    invoke-virtual {v0, p1}, LNi/g;->n(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private final o()V
    .locals 1

    invoke-direct {p0}, LIi/p;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LIi/p;->n()V

    :cond_0
    return-void
.end method

.method private final q(I)V
    .locals 1

    invoke-direct {p0}, LIi/p;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, LIi/b0;->a(LIi/a0;I)V

    return-void
.end method

.method private final t()LIi/e0;
    .locals 1

    invoke-static {}, LIi/p;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIi/e0;

    return-object v0
.end method

.method private final w()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LIi/p;->v()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/L0;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    :cond_0
    instance-of v0, v0, LIi/s;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method private static final synthetic x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, LIi/p;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private static final synthetic y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LIi/p;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    sget-object v0, LIi/p;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 2

    invoke-direct {p0}, LIi/p;->C()LIi/e0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LIi/p;->isCompleted()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, LIi/e0;->dispose()V

    invoke-static {}, LIi/p;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LIi/K0;->a:LIi/K0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public B(Lmh/l;)V
    .locals 1

    new-instance v0, LIi/m$a;

    invoke-direct {v0, p1}, LIi/m$a;-><init>(Lmh/l;)V

    invoke-static {p0, v0}, LIi/r;->c(LIi/n;LIi/m;)V

    return-void
.end method

.method public C0(Ljava/lang/Object;)V
    .locals 0

    iget p1, p0, LIi/a0;->c:I

    invoke-direct {p0, p1}, LIi/p;->q(I)V

    return-void
.end method

.method public final E(LIi/m;)V
    .locals 0

    invoke-direct {p0, p1}, LIi/p;->D(Ljava/lang/Object;)V

    return-void
.end method

.method protected H()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final I(Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0, p1}, LIi/p;->m(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LIi/p;->cancel(Ljava/lang/Throwable;)Z

    invoke-direct {p0}, LIi/p;->o()V

    return-void
.end method

.method public J(LIi/J;Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LIi/p;->d:Ldh/e;

    instance-of v1, v0, LNi/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LNi/g;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, v0, LNi/g;->d:LIi/J;

    :cond_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x4

    :goto_1
    move v2, p1

    goto :goto_2

    :cond_2
    iget p1, p0, LIi/a0;->c:I

    goto :goto_1

    :goto_2
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LIi/p;->P(LIi/p;Ljava/lang/Object;ILmh/q;ILjava/lang/Object;)V

    return-void
.end method

.method public final K()V
    .locals 2

    iget-object v0, p0, LIi/p;->d:Ldh/e;

    instance-of v1, v0, LNi/g;

    if-eqz v1, :cond_0

    check-cast v0, LNi/g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, LNi/g;->q(LIi/n;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LIi/p;->n()V

    invoke-virtual {p0, v0}, LIi/p;->cancel(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final L()Z
    .locals 2

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/B;

    if-eqz v1, :cond_0

    check-cast v0, LIi/B;

    iget-object v0, v0, LIi/B;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LIi/p;->n()V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const v1, 0x1fffffff

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LIi/d;->a:LIi/d;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method public M(Ljava/lang/Object;Lmh/l;)V
    .locals 2

    iget v0, p0, LIi/a0;->c:I

    if-eqz p2, :cond_0

    new-instance v1, LIi/o;

    invoke-direct {v1, p2}, LIi/o;-><init>(Lmh/l;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0, v1}, LIi/p;->O(Ljava/lang/Object;ILmh/q;)V

    return-void
.end method

.method public final O(Ljava/lang/Object;ILmh/q;)V
    .locals 9

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LIi/L0;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, LIi/L0;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, LIi/p;->Q(LIi/L0;Ljava/lang/Object;ILmh/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LIi/p;->o()V

    invoke-direct {p0, p2}, LIi/p;->q(I)V

    return-void

    :cond_1
    instance-of p2, v1, LIi/s;

    if-eqz p2, :cond_3

    check-cast v1, LIi/s;

    invoke-virtual {v1}, LIi/s;->e()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iget-object p2, v1, LIi/C;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p2, p1}, LIi/p;->k(Lmh/q;Ljava/lang/Throwable;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0, p1}, LIi/p;->i(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v2, v10, LIi/L0;

    if-nez v2, :cond_4

    instance-of v2, v10, LIi/C;

    if-eqz v2, :cond_1

    return-void

    :cond_1
    instance-of v2, v10, LIi/B;

    if-eqz v2, :cond_3

    move-object v2, v10

    check-cast v2, LIi/B;

    invoke-virtual {v2}, LIi/B;->c()Z

    move-result v3

    if-nez v3, :cond_2

    const/16 v17, 0xf

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v2

    move-object/from16 v16, p2

    invoke-static/range {v11 .. v18}, LIi/B;->b(LIi/B;Ljava/lang/Object;LIi/m;Lmh/q;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LIi/B;

    move-result-object v3

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    invoke-static {v4, v0, v10, v3}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v11, p2

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0, v11}, LIi/B;->d(LIi/p;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Must be called at most once"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object/from16 v11, p2

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v12

    new-instance v13, LIi/B;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v13

    move-object v3, v10

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v9}, LIi/B;-><init>(Ljava/lang/Object;LIi/m;Lmh/q;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v12, v0, v10, v13}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Not completed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(LNi/z;I)V
    .locals 4

    invoke-static {}, LIi/p;->x()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x1fffffff

    and-int v3, v1, v2

    if-ne v3, v2, :cond_1

    shr-int/lit8 v2, v1, 0x1d

    shl-int/lit8 v2, v2, 0x1d

    add-int/2addr v2, p2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, LIi/p;->D(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "invokeOnCancellation should be called at most once"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b0(Ljava/lang/Object;Lmh/q;)V
    .locals 1

    iget v0, p0, LIi/a0;->c:I

    invoke-virtual {p0, p1, v0, p2}, LIi/p;->O(Ljava/lang/Object;ILmh/q;)V

    return-void
.end method

.method public final c()Ldh/e;
    .locals 1

    iget-object v0, p0, LIi/p;->d:Ldh/e;

    return-object v0
.end method

.method public cancel(Ljava/lang/Throwable;)Z
    .locals 6

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LIi/L0;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    return v3

    :cond_1
    new-instance v2, LIi/s;

    instance-of v4, v1, LIi/m;

    const/4 v5, 0x1

    if-nez v4, :cond_2

    instance-of v4, v1, LNi/z;

    if-eqz v4, :cond_3

    :cond_2
    move v3, v5

    :cond_3
    invoke-direct {v2, p0, p1, v3}, LIi/s;-><init>(Ldh/e;Ljava/lang/Throwable;Z)V

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    invoke-static {v3, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    check-cast v0, LIi/L0;

    instance-of v2, v0, LIi/m;

    if-eqz v2, :cond_4

    check-cast v1, LIi/m;

    invoke-virtual {p0, v1, p1}, LIi/p;->j(LIi/m;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    instance-of v0, v0, LNi/z;

    if-eqz v0, :cond_5

    check-cast v1, LNi/z;

    invoke-direct {p0, v1, p1}, LIi/p;->l(LNi/z;Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    invoke-direct {p0}, LIi/p;->o()V

    iget p1, p0, LIi/a0;->c:I

    invoke-direct {p0, p1}, LIi/p;->q(I)V

    return v5
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, LIi/a0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LIi/B;

    if-eqz v0, :cond_0

    check-cast p1, LIi/B;

    iget-object p1, p1, LIi/B;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIi/p;->v()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, LIi/p;->d:Ldh/e;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Ldh/i;
    .locals 1

    iget-object v0, p0, LIi/p;->e:Ldh/i;

    return-object v0
.end method

.method public isCompleted()Z
    .locals 1

    invoke-virtual {p0}, LIi/p;->v()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, LIi/L0;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final j(LIi/m;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    invoke-interface {p1, p2}, LIi/m;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object p2

    new-instance v0, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final k(Lmh/q;Ljava/lang/Throwable;Ljava/lang/Object;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object v0

    invoke-interface {p1, p2, p3, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object p2

    new-instance p3, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0, p1}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, p3}, LIi/L;->a(Ldh/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final n()V
    .locals 2

    invoke-direct {p0}, LIi/p;->t()LIi/e0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, LIi/e0;->dispose()V

    invoke-static {}, LIi/p;->y()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sget-object v1, LIi/K0;->a:LIi/K0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public p(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LIi/p;->S(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)LNi/C;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LIi/C;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0, v3, v3}, LIi/p;->S(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)LNi/C;

    move-result-object p1

    return-object p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1, p0}, LIi/D;->c(Ljava/lang/Object;LIi/n;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, LIi/a0;->c:I

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/p;->P(LIi/p;Ljava/lang/Object;ILmh/q;ILjava/lang/Object;)V

    return-void
.end method

.method public s(LIi/y0;)Ljava/lang/Throwable;
    .locals 0

    invoke-interface {p1}, LIi/y0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LIi/p;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LIi/p;->d:Ldh/e;

    invoke-static {v1}, LIi/S;->c(Ldh/e;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LIi/p;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LIi/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, LIi/p;->F()Z

    move-result v0

    invoke-direct {p0}, LIi/p;->T()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, LIi/p;->t()LIi/e0;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0}, LIi/p;->C()LIi/e0;

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, LIi/p;->K()V

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, LIi/p;->K()V

    :cond_3
    invoke-virtual {p0}, LIi/p;->v()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/C;

    if-nez v1, :cond_6

    iget v1, p0, LIi/a0;->c:I

    invoke-static {v1}, LIi/b0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LIi/p;->getContext()Ldh/i;

    move-result-object v1

    sget-object v2, LIi/y0;->O:LIi/y0$b;

    invoke-interface {v1, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v1

    check-cast v1, LIi/y0;

    if-eqz v1, :cond_5

    invoke-interface {v1}, LIi/y0;->isActive()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v1}, LIi/y0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LIi/p;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    throw v1

    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, LIi/p;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_6
    check-cast v0, LIi/C;

    iget-object v0, v0, LIi/C;->a:Ljava/lang/Throwable;

    throw v0
.end method

.method public final v()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LIi/p;->z()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
