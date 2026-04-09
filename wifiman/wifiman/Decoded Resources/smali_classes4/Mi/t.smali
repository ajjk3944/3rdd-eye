.class public final LMi/t;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"

# interfaces
.implements LLi/h;
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field public final a:LLi/h;

.field public final b:Ldh/i;

.field public final c:I

.field private d:Ldh/i;

.field private e:Ldh/e;


# direct methods
.method public constructor <init>(LLi/h;Ldh/i;)V
    .locals 2

    sget-object v0, LMi/p;->a:LMi/p;

    sget-object v1, Ldh/j;->a:Ldh/j;

    invoke-direct {p0, v0, v1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;Ldh/i;)V

    iput-object p1, p0, LMi/t;->a:LLi/h;

    iput-object p2, p0, LMi/t;->b:Ldh/i;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, LMi/s;

    invoke-direct {v0}, LMi/s;-><init>()V

    invoke-interface {p2, p1, v0}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, LMi/t;->c:I

    return-void
.end method

.method private final E(LMi/k;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, LMi/k;->b:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic n(ILdh/i$b;)I
    .locals 0

    invoke-static {p0, p1}, LMi/t;->t(ILdh/i$b;)I

    move-result p0

    return p0
.end method

.method private final o(Ldh/i;Ldh/i;Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p2, LMi/k;

    if-eqz v0, :cond_0

    check-cast p2, LMi/k;

    invoke-direct {p0, p2, p3}, LMi/t;->E(LMi/k;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0, p1}, LMi/w;->b(LMi/t;Ldh/i;)V

    return-void
.end method

.method private static final t(ILdh/i$b;)I
    .locals 0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final v(Ldh/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {v0}, LIi/A0;->l(Ldh/i;)V

    iget-object v1, p0, LMi/t;->d:Ldh/i;

    if-eq v1, v0, :cond_0

    invoke-direct {p0, v0, v1, p2}, LMi/t;->o(Ldh/i;Ldh/i;Ljava/lang/Object;)V

    iput-object v0, p0, LMi/t;->d:Ldh/i;

    :cond_0
    iput-object p1, p0, LMi/t;->e:Ldh/e;

    invoke-static {}, LMi/u;->a()Lmh/q;

    move-result-object p1

    iget-object v0, p0, LMi/t;->a:LLi/h;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p2, p0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, LMi/t;->e:Ldh/e;

    :cond_1
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-direct {p0, p2, p1}, LMi/t;->v(Ldh/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, LMi/k;

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object p2

    invoke-direct {v0, p1, p2}, LMi/k;-><init>(Ljava/lang/Throwable;Ldh/i;)V

    iput-object v0, p0, LMi/t;->d:Ldh/i;

    throw p1
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, LMi/t;->e:Ldh/e;

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

    iget-object v0, p0, LMi/t;->d:Ldh/i;

    if-nez v0, :cond_0

    sget-object v0, Ldh/j;->a:Ldh/j;

    :cond_0
    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, LYg/u;->h(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LMi/k;

    invoke-virtual {p0}, LMi/t;->getContext()Ldh/i;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LMi/k;-><init>(Ljava/lang/Throwable;Ldh/i;)V

    iput-object v1, p0, LMi/t;->d:Ldh/i;

    :cond_0
    iget-object v0, p0, LMi/t;->e:Ldh/e;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public releaseIntercepted()V
    .locals 0

    invoke-super {p0}, Lkotlin/coroutines/jvm/internal/d;->releaseIntercepted()V

    return-void
.end method
