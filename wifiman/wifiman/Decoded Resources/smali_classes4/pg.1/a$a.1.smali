.class final Lpg/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/atomic/AtomicReference;

.field final b:Lgg/d;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lgg/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg/a$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lpg/a$a;->b:Lgg/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lpg/a$a;->b:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lpg/a$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpg/a$a;->b:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
