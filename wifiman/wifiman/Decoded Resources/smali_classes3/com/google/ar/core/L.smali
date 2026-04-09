.class final Lcom/google/ar/core/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field final synthetic b:Lcom/google/ar/core/InstallActivity;


# direct methods
.method constructor <init>(Lcom/google/ar/core/InstallActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/ar/core/L;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/M;)V
    .locals 3

    iget-object v0, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/ar/core/L;->a:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    invoke-virtual {v1, p1}, Lcom/google/ar/core/InstallActivity;->f(Lcom/google/ar/core/M;)V

    sget-object v1, Lcom/google/ar/core/ArCoreApk$UserMessageType;->APPLICATION:Lcom/google/ar/core/ArCoreApk$UserMessageType;

    sget-object v1, Lcom/google/ar/core/ArCoreApk$Availability;->UNKNOWN_ERROR:Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    invoke-virtual {p1}, Lcom/google/ar/core/InstallActivity;->g()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {}, Lcom/google/ar/core/A;->a()Lcom/google/ar/core/A;

    move-result-object p1

    iget-boolean p1, p1, Lcom/google/ar/core/A;->d:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    invoke-virtual {p1}, Lcom/google/ar/core/InstallActivity;->e()V

    :cond_2
    iget-object p1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lcom/google/ar/core/InstallActivity;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    new-instance v2, Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException;

    invoke-direct {v2}, Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException;-><init>()V

    invoke-virtual {p1, v2}, Lcom/google/ar/core/InstallActivity;->c(Ljava/lang/Exception;)V

    :goto_0
    iput-boolean v1, p0, Lcom/google/ar/core/L;->a:Z

    monitor-exit v0

    return-void

    :cond_4
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/ar/core/L;->a:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/ar/core/L;->a:Z

    iget-object v1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    sget-object v2, Lcom/google/ar/core/M;->b:Lcom/google/ar/core/M;

    invoke-virtual {v1, v2}, Lcom/google/ar/core/InstallActivity;->f(Lcom/google/ar/core/M;)V

    iget-object v1, p0, Lcom/google/ar/core/L;->b:Lcom/google/ar/core/InstallActivity;

    invoke-virtual {v1, p1}, Lcom/google/ar/core/InstallActivity;->c(Ljava/lang/Exception;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
