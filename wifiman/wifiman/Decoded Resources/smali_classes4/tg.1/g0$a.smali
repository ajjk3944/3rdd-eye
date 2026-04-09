.class final Ltg/g0$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Ltg/g0$b;

.field final b:J

.field final c:I

.field volatile d:LDg/g;

.field volatile e:Z


# direct methods
.method constructor <init>(Ltg/g0$b;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ltg/g0$a;->a:Ltg/g0$b;

    iput-wide p2, p0, Ltg/g0$a;->b:J

    iput p4, p0, Ltg/g0$a;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-wide v0, p0, Ltg/g0$a;->b:J

    iget-object v2, p0, Ltg/g0$a;->a:Ltg/g0$b;

    iget-wide v2, v2, Ltg/g0$b;->j:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/g0$a;->e:Z

    iget-object v0, p0, Ltg/g0$a;->a:Ltg/g0$b;

    invoke-virtual {v0}, Ltg/g0$b;->g()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 2

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, LDg/b;

    if-eqz v0, :cond_1

    check-cast p1, LDg/b;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, LDg/c;->requestFusion(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Ltg/g0$a;->d:LDg/g;

    iput-boolean v1, p0, Ltg/g0$a;->e:Z

    iget-object p1, p0, Ltg/g0$a;->a:Ltg/g0$b;

    invoke-virtual {p1}, Ltg/g0$b;->g()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput-object p1, p0, Ltg/g0$a;->d:LDg/g;

    return-void

    :cond_1
    new-instance p1, LDg/i;

    iget v0, p0, Ltg/g0$a;->c:I

    invoke-direct {p1, v0}, LDg/i;-><init>(I)V

    iput-object p1, p0, Ltg/g0$a;->d:LDg/g;

    :cond_2
    return-void
.end method

.method public d()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Ltg/g0$a;->d:LDg/g;

    iget-wide v1, p0, Ltg/g0$a;->b:J

    iget-object v3, p0, Ltg/g0$a;->a:Ltg/g0$b;

    iget-wide v3, v3, Ltg/g0$b;->j:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, LDg/g;->offer(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Ltg/g0$a;->a:Ltg/g0$b;

    invoke-virtual {p1}, Ltg/g0$b;->g()V

    :cond_1
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/g0$a;->a:Ltg/g0$b;

    invoke-virtual {v0, p0, p1}, Ltg/g0$b;->j(Ltg/g0$a;Ljava/lang/Throwable;)V

    return-void
.end method
