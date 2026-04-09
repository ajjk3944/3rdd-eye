.class final Ltg/X$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:Ltg/X$b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Ltg/X$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/X$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Ltg/X$h;->b:Ltg/X$b;

    return-void
.end method


# virtual methods
.method public d(Lgg/x;)V
    .locals 3

    :goto_0
    iget-object v0, p0, Ltg/X$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltg/X$g;

    if-nez v0, :cond_1

    iget-object v0, p0, Ltg/X$h;->b:Ltg/X$b;

    invoke-interface {v0}, Ltg/X$b;->call()Ltg/X$e;

    move-result-object v0

    new-instance v1, Ltg/X$g;

    iget-object v2, p0, Ltg/X$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v0, v2}, Ltg/X$g;-><init>(Ltg/X$e;Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v0, p0, Ltg/X$h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lr/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    new-instance v1, Ltg/X$c;

    invoke-direct {v1, v0, p1}, Ltg/X$c;-><init>(Ltg/X$g;Lgg/x;)V

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v0, v1}, Ltg/X$g;->d(Ltg/X$c;)Z

    invoke-virtual {v1}, Ltg/X$c;->isDisposed()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Ltg/X$g;->g(Ltg/X$c;)V

    return-void

    :cond_2
    iget-object p1, v0, Ltg/X$g;->a:Ltg/X$e;

    invoke-interface {p1, v1}, Ltg/X$e;->S(Ltg/X$c;)V

    return-void
.end method
