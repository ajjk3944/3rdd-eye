.class final Lqg/P$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/P$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lqg/P$a;


# direct methods
.method constructor <init>(Lqg/P$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqg/P$a$a;->a:Lqg/P$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/P$a$a;->a:Lqg/P$a;

    invoke-virtual {v0}, Lqg/P$a;->c()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/P$a$a;->a:Lqg/P$a;

    invoke-virtual {v0, p1}, Lqg/P$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method
