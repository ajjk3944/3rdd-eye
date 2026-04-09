.class final Lcom/google/ar/core/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/ar/core/L;


# direct methods
.method constructor <init>(Lcom/google/ar/core/L;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/core/d;->a:Lcom/google/ar/core/L;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    const-string/jumbo v0, "com.google.android.play.core.install.ACTION_INSTALL_STATUS"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    const-string/jumbo p1, "install.status"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p2, 0x6

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/ar/core/d;->a:Lcom/google/ar/core/L;

    sget-object p2, Lcom/google/ar/core/M;->b:Lcom/google/ar/core/M;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/ar/core/d;->a:Lcom/google/ar/core/L;

    sget-object p2, Lcom/google/ar/core/M;->c:Lcom/google/ar/core/M;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/ar/core/d;->a:Lcom/google/ar/core/L;

    sget-object p2, Lcom/google/ar/core/M;->a:Lcom/google/ar/core/M;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    :cond_3
    :goto_0
    return-void
.end method
