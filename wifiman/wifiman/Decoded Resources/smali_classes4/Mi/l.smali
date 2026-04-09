.class final LMi/l;
.super LNi/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ldh/i;Ldh/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LNi/y;-><init>(Ldh/i;Ldh/e;)V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/Throwable;)Z
    .locals 1

    instance-of v0, p1, Lkotlinx/coroutines/flow/internal/ChildCancelledException;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LIi/D0;->D(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
