.class final Ltg/K$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lhg/c;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field b:J


# direct methods
.method constructor <init>(Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/K$a;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public a(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public isDisposed()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 5

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Llg/b;->DISPOSED:Llg/b;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ltg/K$a;->a:Lgg/x;

    iget-wide v1, p0, Ltg/K$a;->b:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ltg/K$a;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lgg/x;->h(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
