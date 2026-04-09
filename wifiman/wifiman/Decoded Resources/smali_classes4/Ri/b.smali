.class public final LRi/b;
.super LIi/p0;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final d:LRi/b;

.field private static final e:LIi/J;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LRi/b;

    invoke-direct {v0}, LRi/b;-><init>()V

    sput-object v0, LRi/b;->d:LRi/b;

    sget-object v0, LRi/k;->c:LRi/k;

    const/16 v1, 0x40

    invoke-static {}, LNi/D;->a()I

    move-result v2

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LNi/D;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LIi/J;->o0(LIi/J;ILjava/lang/String;ILjava/lang/Object;)LIi/J;

    move-result-object v0

    sput-object v0, LRi/b;->e:LIi/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, LRi/b;->e:LIi/J;

    invoke-virtual {v0, p1, p2}, LIi/J;->Y(Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public b0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, LRi/b;->e:LIi/J;

    invoke-virtual {v0, p1, p2}, LIi/J;->b0(Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-virtual {p0, v0, p1}, LRi/b;->Y(Ldh/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public n0(ILjava/lang/String;)LIi/J;
    .locals 1

    sget-object v0, LRi/k;->c:LRi/k;

    invoke-virtual {v0, p1, p2}, LRi/k;->n0(ILjava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
