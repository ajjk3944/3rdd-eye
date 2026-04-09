.class final Lsg/h$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lsg/h$a;

.field volatile b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lsg/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lsg/h$a$a;->a:Lsg/h$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lsg/h$a$a;->a:Lsg/h$a;

    invoke-virtual {v0, p0}, Lsg/h$a;->g(Lsg/h$a$a;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method d()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/h$a$a;->a:Lsg/h$a;

    invoke-virtual {v0, p0, p1}, Lsg/h$a;->l(Lsg/h$a$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lsg/h$a$a;->b:Ljava/lang/Object;

    iget-object p1, p0, Lsg/h$a$a;->a:Lsg/h$a;

    invoke-virtual {p1}, Lsg/h$a;->d()V

    return-void
.end method
