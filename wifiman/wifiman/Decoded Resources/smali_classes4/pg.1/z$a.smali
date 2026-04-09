.class final Lpg/z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/z$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final b:Lhg/b;

.field final c:Lgg/d;

.field final synthetic d:Lpg/z;


# direct methods
.method constructor <init>(Lpg/z;Ljava/util/concurrent/atomic/AtomicBoolean;Lhg/b;Lgg/d;)V
    .locals 0

    iput-object p1, p0, Lpg/z$a;->d:Lpg/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpg/z$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lpg/z$a;->b:Lhg/b;

    iput-object p4, p0, Lpg/z$a;->c:Lgg/d;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lpg/z$a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpg/z$a;->b:Lhg/b;

    invoke-virtual {v0}, Lhg/b;->d()V

    iget-object v0, p0, Lpg/z$a;->d:Lpg/z;

    iget-object v0, v0, Lpg/z;->e:Lgg/f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lpg/z$a;->c:Lgg/d;

    new-instance v1, Ljava/util/concurrent/TimeoutException;

    iget-object v2, p0, Lpg/z$a;->d:Lpg/z;

    iget-wide v3, v2, Lpg/z;->b:J

    iget-object v2, v2, Lpg/z;->c:Ljava/util/concurrent/TimeUnit;

    invoke-static {v3, v4, v2}, Lzg/h;->g(JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lpg/z$a$a;

    invoke-direct {v1, p0}, Lpg/z$a$a;-><init>(Lpg/z$a;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    :cond_1
    :goto_0
    return-void
.end method
