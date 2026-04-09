.class final Lrg/u$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method constructor <init>(Lgg/B;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/u$a$a;->a:Lgg/B;

    iput-object p2, p0, Lrg/u$a$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lrg/u$a$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lrg/u$a$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lrg/u$a$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
