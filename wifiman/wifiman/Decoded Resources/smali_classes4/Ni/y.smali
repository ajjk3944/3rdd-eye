.class public LNi/y;
.super LIi/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field public final d:Ldh/e;


# direct methods
.method public constructor <init>(Ldh/i;Ldh/e;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, LIi/a;-><init>(Ldh/i;ZZ)V

    iput-object p2, p0, LNi/y;->d:Ldh/e;

    return-void
.end method


# virtual methods
.method protected N0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-static {p1, v0}, LIi/D;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public R0()V
    .locals 0

    return-void
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, LNi/y;->d:Ldh/e;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected final i0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected w(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LNi/y;->d:Ldh/e;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v0

    iget-object v1, p0, LNi/y;->d:Ldh/e;

    invoke-static {p1, v1}, LIi/D;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LNi/h;->b(Ldh/e;Ljava/lang/Object;)V

    return-void
.end method
