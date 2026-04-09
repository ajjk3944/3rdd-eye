.class public final Ldh/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/e;
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh/k$a;
    }
.end annotation


# static fields
.field private static final b:Ldh/k$a;

.field private static final c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final a:Ldh/e;

.field private volatile result:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldh/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldh/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldh/k;->b:Ldh/k$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "result"

    const-class v2, Ldh/k;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ldh/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ldh/e;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Leh/a;->UNDECIDED:Leh/a;

    invoke-direct {p0, p1, v0}, Ldh/k;-><init>(Ldh/e;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ldh/e;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldh/k;->a:Ldh/e;

    .line 3
    iput-object p2, p0, Ldh/k;->result:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ldh/k;->result:Ljava/lang/Object;

    sget-object v1, Leh/a;->UNDECIDED:Leh/a;

    if-ne v0, v1, :cond_1

    sget-object v0, Ldh/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ldh/k;->result:Ljava/lang/Object;

    :cond_1
    sget-object v1, Leh/a;->RESUMED:Leh/a;

    if-ne v0, v1, :cond_2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v1, v0, LYg/u$b;

    if-nez v1, :cond_3

    :goto_0
    return-object v0

    :cond_3
    check-cast v0, LYg/u$b;

    iget-object v0, v0, LYg/u$b;->a:Ljava/lang/Throwable;

    throw v0
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, Ldh/k;->a:Ldh/e;

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

    iget-object v0, p0, Ldh/k;->a:Ldh/e;

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 3

    :cond_0
    iget-object v0, p0, Ldh/k;->result:Ljava/lang/Object;

    sget-object v1, Leh/a;->UNDECIDED:Leh/a;

    if-ne v0, v1, :cond_1

    sget-object v0, Ldh/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v1, p1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    sget-object v0, Ldh/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Leh/a;->RESUMED:Leh/a;

    invoke-static {v0, p0, v1, v2}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldh/k;->a:Ldh/e;

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SafeContinuation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldh/k;->a:Ldh/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
