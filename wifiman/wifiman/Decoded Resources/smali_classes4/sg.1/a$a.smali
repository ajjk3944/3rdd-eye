.class final Lsg/a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lgg/d;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field b:Lgg/v;


# direct methods
.method constructor <init>(Lgg/x;Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lsg/a$a;->b:Lgg/v;

    iput-object p1, p0, Lsg/a$a;->a:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lsg/a$a;->b:Lgg/v;

    if-nez v0, :cond_0

    iget-object v0, p0, Lsg/a$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lsg/a$a;->b:Lgg/v;

    invoke-interface {v0, p0}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsg/a$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/c;

    invoke-static {v0}, Llg/b;->isDisposed(Lhg/c;)Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/a$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
