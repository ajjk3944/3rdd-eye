.class public final Lpg/e;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/e$a;
    }
.end annotation


# instance fields
.field final a:Lgg/e;


# direct methods
.method public constructor <init>(Lgg/e;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/e;->a:Lgg/e;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 1

    new-instance v0, Lpg/e$a;

    invoke-direct {v0, p1}, Lpg/e$a;-><init>(Lgg/d;)V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    :try_start_0
    iget-object p1, p0, Lpg/e;->a:Lgg/e;

    invoke-interface {p1, v0}, Lgg/e;->a(Lgg/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lpg/e$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
