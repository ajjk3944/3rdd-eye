.class final Lcom/google/ar/core/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/google/ar/core/N;


# direct methods
.method constructor <init>(Lcom/google/ar/core/N;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/O;->a:Lcom/google/ar/core/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    iget-object p1, p0, Lcom/google/ar/core/O;->a:Lcom/google/ar/core/N;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/N;->d(Landroid/os/IBinder;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    iget-object p1, p0, Lcom/google/ar/core/O;->a:Lcom/google/ar/core/N;

    invoke-virtual {p1}, Lcom/google/ar/core/N;->e()V

    return-void
.end method
