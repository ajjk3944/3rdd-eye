.class public final synthetic LR4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LR4/e;

.field public final synthetic b:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(LR4/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/d;->a:LR4/e;

    iput-object p2, p0, LR4/d;->b:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LR4/d;->a:LR4/e;

    iget-object v1, p0, LR4/d;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, LR4/e;->b(LR4/e;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
