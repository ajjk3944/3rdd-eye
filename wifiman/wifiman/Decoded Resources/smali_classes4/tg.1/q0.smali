.class final Ltg/q0;
.super Lgg/s;
.source "SourceFile"


# instance fields
.field final a:LHg/d;

.field final b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(LHg/d;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/q0;->a:LHg/d;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Ltg/q0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Ltg/q0;->a:LHg/d;

    invoke-virtual {v0, p1}, Lgg/s;->d(Lgg/x;)V

    iget-object p1, p0, Ltg/q0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method i1()Z
    .locals 3

    iget-object v0, p0, Ltg/q0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltg/q0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method
