.class public final Lwg/p;
.super Lgg/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg/p$a;,
        Lwg/p$b;,
        Lwg/p$c;
    }
.end annotation


# static fields
.field private static final c:Lwg/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwg/p;

    invoke-direct {v0}, Lwg/p;-><init>()V

    sput-object v0, Lwg/p;->c:Lwg/p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/y;-><init>()V

    return-void
.end method

.method public static i()Lwg/p;
    .locals 1

    sget-object v0, Lwg/p;->c:Lwg/p;

    return-object v0
.end method


# virtual methods
.method public c()Lgg/y$c;
    .locals 1

    new-instance v0, Lwg/p$c;

    invoke-direct {v0}, Lwg/p$c;-><init>()V

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;)Lhg/c;
    .locals 0

    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1
.end method

.method public f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 0

    :try_start_0
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->sleep(J)V

    invoke-static {p1}, LEg/a;->x(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1
.end method
