.class public Lm5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lm5/d;


# instance fields
.field private final a:Ljava/util/Set;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lm5/d;->a:Ljava/util/Set;

    return-void
.end method

.method public static a()Lm5/d;
    .locals 2

    sget-object v0, Lm5/d;->b:Lm5/d;

    if-nez v0, :cond_1

    const-class v1, Lm5/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lm5/d;->b:Lm5/d;

    if-nez v0, :cond_0

    new-instance v0, Lm5/d;

    invoke-direct {v0}, Lm5/d;-><init>()V

    sput-object v0, Lm5/d;->b:Lm5/d;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    goto :goto_2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    return-object v0
.end method


# virtual methods
.method b()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lm5/d;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm5/d;->a:Ljava/util/Set;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
