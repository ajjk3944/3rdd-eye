.class public abstract LA5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:LA5/l;

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, LA5/j;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LA5/j;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, LA5/l;

    invoke-direct {v0}, LA5/l;-><init>()V

    iput-object v0, p0, LA5/j;->a:LA5/l;

    return-void
.end method
