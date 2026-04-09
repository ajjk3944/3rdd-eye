.class final LLi/c;
.super LMi/d;
.source "SourceFile"


# static fields
.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic consumed$volatile:I

.field private final d:LKi/v;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LLi/c;

    const-string v1, "consumed$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LLi/c;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LKi/v;ZLdh/i;ILKi/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p3, p4, p5}, LMi/d;-><init>(Ldh/i;ILKi/a;)V

    .line 5
    iput-object p1, p0, LLi/c;->d:LKi/v;

    .line 6
    iput-boolean p2, p0, LLi/c;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(LKi/v;ZLdh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, Ldh/j;->a:Ldh/j;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x3

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 2
    sget-object p5, LKi/a;->SUSPEND:LKi/a;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 3
    invoke-direct/range {v0 .. v5}, LLi/c;-><init>(LKi/v;ZLdh/i;ILKi/a;)V

    return-void
.end method

.method private static final synthetic p()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, LLi/c;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final q()V
    .locals 2

    iget-boolean v0, p0, LLi/c;->e:Z

    if-eqz v0, :cond_1

    invoke-static {}, LLi/c;->p()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ReceiveChannel.consumeAsFlow can be collected just once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LMi/d;->b:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, LLi/c;->q()V

    iget-object v0, p0, LLi/c;->d:LKi/v;

    iget-boolean v1, p0, LLi/c;->e:Z

    invoke-static {p1, v0, v1, p2}, LLi/k;->a(LLi/h;LKi/v;ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    invoke-super {p0, p1, p2}, LMi/d;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected e()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLi/c;->d:LKi/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected g(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LMi/x;

    invoke-direct {v0, p1}, LMi/x;-><init>(LKi/w;)V

    iget-object p1, p0, LLi/c;->d:LKi/v;

    iget-boolean v1, p0, LLi/c;->e:Z

    invoke-static {v0, p1, v1, p2}, LLi/k;->a(LLi/h;LKi/v;ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method protected i(Ldh/i;ILKi/a;)LMi/d;
    .locals 7

    new-instance v6, LLi/c;

    iget-object v1, p0, LLi/c;->d:LKi/v;

    iget-boolean v2, p0, LLi/c;->e:Z

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LLi/c;-><init>(LKi/v;ZLdh/i;ILKi/a;)V

    return-object v6
.end method

.method public k()LLi/g;
    .locals 9

    new-instance v8, LLi/c;

    iget-object v1, p0, LLi/c;->d:LKi/v;

    iget-boolean v2, p0, LLi/c;->e:Z

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LLi/c;-><init>(LKi/v;ZLdh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public o(LIi/N;)LKi/v;
    .locals 2

    invoke-direct {p0}, LLi/c;->q()V

    iget v0, p0, LMi/d;->b:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LLi/c;->d:LKi/v;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LMi/d;->o(LIi/N;)LKi/v;

    move-result-object p1

    :goto_0
    return-object p1
.end method
