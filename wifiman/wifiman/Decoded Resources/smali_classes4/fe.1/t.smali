.class public final synthetic Lfe/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/ThreadGroup;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/ThreadGroup;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/t;->a:Ljava/lang/String;

    iput-object p2, p0, Lfe/t;->b:Ljava/lang/ThreadGroup;

    iput-object p3, p0, Lfe/t;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    iget-object v0, p0, Lfe/t;->a:Ljava/lang/String;

    iget-object v1, p0, Lfe/t;->b:Ljava/lang/ThreadGroup;

    iget-object v2, p0, Lfe/t;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v0, v1, v2, p1}, Lfe/u$a$a;->a(Ljava/lang/String;Ljava/lang/ThreadGroup;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    return-object p1
.end method
