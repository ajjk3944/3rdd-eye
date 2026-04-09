.class final Lsg/d$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lsg/d$a;


# direct methods
.method constructor <init>(Lsg/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lsg/d$a$a;->a:Lsg/d$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lsg/d$a$a;->a:Lsg/d$a;

    invoke-virtual {v0}, Lsg/d$a;->t()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method d()V
    .locals 0

    invoke-static {p0}, Llg/b;->dispose(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsg/d$a$a;->a:Lsg/d$a;

    invoke-virtual {v0, p1}, Lsg/d$a;->v(Ljava/lang/Throwable;)V

    return-void
.end method
