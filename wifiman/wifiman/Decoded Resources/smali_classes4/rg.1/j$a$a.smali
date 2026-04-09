.class final Lrg/j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/j$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lrg/j$a;


# direct methods
.method constructor <init>(Lrg/j$a;)V
    .locals 0

    iput-object p1, p0, Lrg/j$a$a;->a:Lrg/j$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lrg/j$a$a;->a:Lrg/j$a;

    iget-object v0, v0, Lrg/j$a;->a:Lgg/p;

    invoke-interface {v0}, Lgg/p;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lrg/j$a$a;->a:Lrg/j$a;

    invoke-static {v0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lrg/j$a$a;->a:Lrg/j$a;

    iget-object v0, v0, Lrg/j$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lrg/j$a$a;->a:Lrg/j$a;

    iget-object v0, v0, Lrg/j$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
