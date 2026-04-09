.class final Ltg/d$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:Ltg/d$a;


# direct methods
.method constructor <init>(Lgg/x;Ltg/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/d$a$a;->a:Lgg/x;

    iput-object p2, p0, Ltg/d$a$a;->b:Ltg/d$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ltg/d$a$a;->b:Ltg/d$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ltg/d$a;->i:Z

    invoke-virtual {v0}, Ltg/d$a;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method d()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ltg/d$a$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Ltg/d$a$a;->b:Ltg/d$a;

    iget-object v1, v0, Ltg/d$a;->d:Lzg/c;

    invoke-virtual {v1, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, v0, Ltg/d$a;->f:Z

    if-nez p1, :cond_0

    iget-object p1, v0, Ltg/d$a;->h:Lhg/c;

    invoke-interface {p1}, Lhg/c;->dispose()V

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, v0, Ltg/d$a;->i:Z

    invoke-virtual {v0}, Ltg/d$a;->d()V

    :cond_1
    return-void
.end method
