.class final Lrg/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicReference;

.field final b:Lgg/p;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lgg/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/i$b;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lrg/i$b;->b:Lgg/p;

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lrg/i$b;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lrg/i$b;->b:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lrg/i$b;->b:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
