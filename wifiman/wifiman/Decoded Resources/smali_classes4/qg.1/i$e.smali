.class final Lqg/i$e;
.super Lqg/i$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/i$h;-><init>(LDj/b;)V

    return-void
.end method


# virtual methods
.method p()V
    .locals 2

    new-instance v0, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    const-string v1, "create: Could not emit value due to lack of requests"

    invoke-direct {v0, v1}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lqg/i$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
