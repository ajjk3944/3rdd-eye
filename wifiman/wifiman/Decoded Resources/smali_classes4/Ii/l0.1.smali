.class public abstract LIi/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LIi/i0;
    .locals 2

    new-instance v0, LIi/h;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, LIi/h;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
