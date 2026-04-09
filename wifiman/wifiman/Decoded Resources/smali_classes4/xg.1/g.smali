.class abstract Lxg/g;
.super Lxg/f;
.source "SourceFile"


# instance fields
.field final b:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lxg/f;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lxg/g;->b:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method
