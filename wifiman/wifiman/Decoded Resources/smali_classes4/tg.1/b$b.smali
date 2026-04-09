.class final Ltg/b$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:Ltg/b$a;

.field final b:I

.field final c:Lgg/x;

.field d:Z


# direct methods
.method constructor <init>(Ltg/b$a;ILgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/b$b;->a:Ltg/b$a;

    iput p2, p0, Ltg/b$b;->b:I

    iput-object p3, p0, Ltg/b$b;->c:Lgg/x;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Ltg/b$b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/b$b;->c:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltg/b$b;->a:Ltg/b$a;

    iget v1, p0, Ltg/b$b;->b:I

    invoke-virtual {v0, v1}, Ltg/b$a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/b$b;->d:Z

    iget-object v0, p0, Ltg/b$b;->c:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public d()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Ltg/b$b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/b$b;->c:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltg/b$b;->a:Ltg/b$a;

    iget v1, p0, Ltg/b$b;->b:I

    invoke-virtual {v0, v1}, Ltg/b$a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/b$b;->d:Z

    iget-object v0, p0, Ltg/b$b;->c:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-boolean v0, p0, Ltg/b$b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltg/b$b;->c:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltg/b$b;->a:Ltg/b$a;

    iget v1, p0, Ltg/b$b;->b:I

    invoke-virtual {v0, v1}, Ltg/b$a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/b$b;->d:Z

    iget-object v0, p0, Ltg/b$b;->c:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
