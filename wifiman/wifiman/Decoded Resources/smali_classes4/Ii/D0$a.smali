.class final LIi/D0$a;
.super LIi/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/D0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final i:LIi/D0;


# direct methods
.method public constructor <init>(Ldh/e;LIi/D0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LIi/p;-><init>(Ldh/e;I)V

    iput-object p2, p0, LIi/D0$a;->i:LIi/D0;

    return-void
.end method


# virtual methods
.method protected H()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public s(LIi/y0;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, LIi/D0$a;->i:LIi/D0;

    invoke-virtual {v0}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LIi/D0$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LIi/D0$c;

    invoke-virtual {v1}, LIi/D0$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, LIi/C;

    if-eqz v1, :cond_1

    check-cast v0, LIi/C;

    iget-object p1, v0, LIi/C;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-interface {p1}, LIi/y0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
