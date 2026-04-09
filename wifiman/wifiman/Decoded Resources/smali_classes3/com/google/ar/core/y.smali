.class final Lcom/google/ar/core/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ar/core/x;


# instance fields
.field final synthetic a:Lcom/google/ar/core/A;


# direct methods
.method constructor <init>(Lcom/google/ar/core/A;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/y;->a:Lcom/google/ar/core/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/ArCoreApk$Availability;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ar/core/y;->a:Lcom/google/ar/core/A;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/ar/core/y;->a:Lcom/google/ar/core/A;

    invoke-virtual {v1, p1}, Lcom/google/ar/core/A;->f(Lcom/google/ar/core/ArCoreApk$Availability;)V

    iget-object p1, p0, Lcom/google/ar/core/y;->a:Lcom/google/ar/core/A;

    invoke-virtual {p1}, Lcom/google/ar/core/A;->g()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
