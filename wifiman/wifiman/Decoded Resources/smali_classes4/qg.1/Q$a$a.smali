.class final Lqg/Q$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/Q$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lqg/Q$a;


# direct methods
.method constructor <init>(Lqg/Q$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/Q$a$a;->a:Lqg/Q$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/Q$a$a;->a:Lqg/Q$a;

    invoke-virtual {v0}, Lqg/Q$a;->l()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/Q$a$a;->a:Lqg/Q$a;

    invoke-virtual {v0, p1}, Lqg/Q$a;->n(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/Q$a$a;->a:Lqg/Q$a;

    invoke-virtual {v0, p1}, Lqg/Q$a;->o(Ljava/lang/Object;)V

    return-void
.end method
