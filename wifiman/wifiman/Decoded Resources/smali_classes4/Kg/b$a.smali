.class public abstract LKg/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static volatile a:LKg/b;

.field private static final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, LKg/b$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a()LKg/b;
    .locals 2

    sget-object v0, LKg/b$a;->a:LKg/b;

    if-nez v0, :cond_1

    const-class v0, LKg/b$a;

    monitor-enter v0

    :try_start_0
    sget-object v1, LKg/b$a;->a:LKg/b;

    if-nez v1, :cond_0

    invoke-static {}, LKg/b$a;->b()LKg/b;

    move-result-object v1

    sput-object v1, LKg/b$a;->a:LKg/b;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, LKg/b$a;->a:LKg/b;

    return-object v0
.end method

.method protected static b()LKg/b;
    .locals 1

    sget-object v0, LKg/b$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    new-instance v0, LLg/o;

    invoke-direct {v0}, LLg/o;-><init>()V

    return-object v0
.end method
