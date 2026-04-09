.class final Lug/A$c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final a:Lug/A$b;

.field final b:I


# direct methods
.method constructor <init>(Lug/A$b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lug/A$c;->a:Lug/A$b;

    iput p2, p0, Lug/A$c;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lug/A$c;->a:Lug/A$b;

    iget v1, p0, Lug/A$c;->b:I

    invoke-virtual {v0, p1, v1}, Lug/A$b;->c(Ljava/lang/Throwable;I)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lug/A$c;->a:Lug/A$b;

    iget v1, p0, Lug/A$c;->b:I

    invoke-virtual {v0, p1, v1}, Lug/A$b;->d(Ljava/lang/Object;I)V

    return-void
.end method
