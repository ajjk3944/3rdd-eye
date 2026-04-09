.class public interface abstract LIi/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIi/y0$a;,
        LIi/y0$b;
    }
.end annotation


# static fields
.field public static final O:LIi/y0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LIi/y0$b;->a:LIi/y0$b;

    sput-object v0, LIi/y0;->O:LIi/y0$b;

    return-void
.end method


# virtual methods
.method public abstract attachChild(LIi/w;)LIi/u;
.end method

.method public abstract synthetic cancel()V
.end method

.method public abstract cancel(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract synthetic cancel(Ljava/lang/Throwable;)Z
.end method

.method public abstract getCancellationException()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract getChildren()Lzi/j;
.end method

.method public abstract getOnJoin()LSi/a;
.end method

.method public abstract getParent()LIi/y0;
.end method

.method public abstract invokeOnCompletion(Lmh/l;)LIi/e0;
.end method

.method public abstract invokeOnCompletion(ZZLmh/l;)LIi/e0;
.end method

.method public abstract isActive()Z
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract isCompleted()Z
.end method

.method public abstract join(Ldh/e;)Ljava/lang/Object;
.end method

.method public abstract plus(LIi/y0;)LIi/y0;
.end method

.method public abstract start()Z
.end method
