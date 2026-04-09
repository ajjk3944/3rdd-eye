.class public final Lpg/d;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/d$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/d;->a:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public V(Lgg/d;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lpg/d;->a:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "The iterator returned is null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lpg/d$a;

    invoke-direct {v1, p1, v0}, Lpg/d$a;-><init>(Lgg/d;Ljava/util/Iterator;)V

    iget-object v0, v1, Lpg/d$a;->c:Llg/e;

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    invoke-virtual {v1}, Lpg/d$a;->d()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/d;)V

    return-void
.end method
