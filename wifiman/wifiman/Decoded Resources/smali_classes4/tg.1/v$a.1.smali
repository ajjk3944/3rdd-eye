.class final Ltg/v$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:J

.field final b:Ltg/v$b;

.field volatile c:Z

.field volatile d:LDg/g;

.field e:I


# direct methods
.method constructor <init>(Ltg/v$b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p2, p0, Ltg/v$a;->a:J

    iput-object p1, p0, Ltg/v$a;->b:Ltg/v$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/v$a;->c:Z

    iget-object v0, p0, Ltg/v$a;->b:Ltg/v$b;

    invoke-virtual {v0}, Ltg/v$b;->m()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 2

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_1

    check-cast p1, LDg/b;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, LDg/c;->requestFusion(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Ltg/v$a;->e:I

    iput-object p1, p0, Ltg/v$a;->d:LDg/g;

    iput-boolean v1, p0, Ltg/v$a;->c:Z

    iget-object p1, p0, Ltg/v$a;->b:Ltg/v$b;

    invoke-virtual {p1}, Ltg/v$b;->m()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Ltg/v$a;->e:I

    iput-object p1, p0, Ltg/v$a;->d:LDg/g;

    :cond_1
    return-void
.end method

.method public d()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ltg/v$a;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/v$a;->b:Ltg/v$b;

    invoke-virtual {v0, p1, p0}, Ltg/v$b;->y(Ljava/lang/Object;Ltg/v$a;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ltg/v$a;->b:Ltg/v$b;

    invoke-virtual {p1}, Ltg/v$b;->m()V

    :goto_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/v$a;->b:Ltg/v$b;

    iget-object v0, v0, Ltg/v$b;->h:Lzg/c;

    invoke-virtual {v0, p1}, Lzg/c;->g(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ltg/v$a;->b:Ltg/v$b;

    iget-boolean v0, p1, Ltg/v$b;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ltg/v$b;->j()Z

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ltg/v$a;->c:Z

    iget-object p1, p0, Ltg/v$a;->b:Ltg/v$b;

    invoke-virtual {p1}, Ltg/v$b;->m()V

    :cond_1
    return-void
.end method
