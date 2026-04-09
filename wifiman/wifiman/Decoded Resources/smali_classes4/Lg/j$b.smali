.class public final LLg/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static volatile b:LLg/j$b;

.field private static final c:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, LLg/j$b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, LLg/j$b;->a:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method public static b()LLg/j$b;
    .locals 2

    sget-object v0, LLg/j$b;->b:LLg/j$b;

    if-nez v0, :cond_1

    const-class v0, LLg/j$b;

    monitor-enter v0

    :try_start_0
    sget-object v1, LLg/j$b;->b:LLg/j$b;

    if-nez v1, :cond_0

    new-instance v1, LLg/j$b;

    invoke-direct {v1}, LLg/j$b;-><init>()V

    sput-object v1, LLg/j$b;->b:LLg/j$b;

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
    sget-object v0, LLg/j$b;->b:LLg/j$b;

    return-object v0
.end method

.method protected static d(LLg/l;)LLg/j;
    .locals 1

    sget-object v0, LLg/j$b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    new-instance v0, LLg/j$a;

    invoke-direct {v0, p0}, LLg/j$a;-><init>(LLg/l;)V

    return-object v0
.end method


# virtual methods
.method public a(LLg/l;)V
    .locals 1

    iget-object v0, p0, LLg/j$b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(LLg/l;)LLg/j;
    .locals 2

    iget-object v0, p0, LLg/j$b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/j;

    if-nez v0, :cond_0

    iget-object v0, p0, LLg/j$b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1}, LLg/j$b;->d(LLg/l;)LLg/j;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LLg/j$b;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, LLg/j;

    :cond_0
    return-object v0
.end method
