.class public final LIi/J0;
.super Ldh/a;
.source "SourceFile"

# interfaces
.implements LIi/y0;


# static fields
.field public static final b:LIi/J0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/J0;

    invoke-direct {v0}, LIi/J0;-><init>()V

    sput-object v0, LIi/J0;->b:LIi/J0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-direct {p0, v0}, Ldh/a;-><init>(Ldh/i$c;)V

    return-void
.end method


# virtual methods
.method public attachChild(LIi/w;)LIi/u;
    .locals 0

    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1
.end method

.method public synthetic cancel()V
    .locals 0

    .line 1
    invoke-static {p0}, LIi/y0$a;->a(LIi/y0;)V

    return-void
.end method

.method public cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 2
    return-void
.end method

.method public synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 0

    .line 3
    const/4 p1, 0x0

    return p1
.end method

.method public getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getChildren()Lzi/j;
    .locals 1

    invoke-static {}, Lzi/m;->i()Lzi/j;

    move-result-object v0

    return-object v0
.end method

.method public getOnJoin()LSi/a;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getParent()LIi/y0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public invokeOnCompletion(Lmh/l;)LIi/e0;
    .locals 0

    .line 1
    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1
.end method

.method public invokeOnCompletion(ZZLmh/l;)LIi/e0;
    .locals 0

    .line 2
    sget-object p1, LIi/K0;->a:LIi/K0;

    return-object p1
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCompleted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public join(Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This job is always active"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public plus(LIi/y0;)LIi/y0;
    .locals 0

    invoke-static {p0, p1}, LIi/y0$a;->f(LIi/y0;LIi/y0;)LIi/y0;

    move-result-object p1

    return-object p1
.end method

.method public start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonCancellable"

    return-object v0
.end method
