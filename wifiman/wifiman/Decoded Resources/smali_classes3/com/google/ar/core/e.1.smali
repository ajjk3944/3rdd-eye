.class final Lcom/google/ar/core/e;
.super Lcom/google/ar/core/dependencies/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/google/ar/core/g;

.field final synthetic d:Lcom/google/ar/core/L;


# direct methods
.method constructor <init>(Lcom/google/ar/core/g;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/ar/core/L;Landroid/app/Activity;)V
    .locals 0

    iput-object p2, p0, Lcom/google/ar/core/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    iput-object p4, p0, Lcom/google/ar/core/e;->b:Landroid/app/Activity;

    iput-object p1, p0, Lcom/google/ar/core/e;->c:Lcom/google/ar/core/g;

    invoke-direct {p0}, Lcom/google/ar/core/dependencies/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lcom/google/ar/core/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string/jumbo v0, "error.code"

    const/16 v1, -0x64

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string/jumbo v1, "install.status"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    sget-object v0, Lcom/google/ar/core/M;->c:Lcom/google/ar/core/M;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x28

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo p1, "requestInstall = "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", launching fullscreen."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ARCore-InstallService"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/ar/core/e;->c:Lcom/google/ar/core/g;

    iget-object v0, p0, Lcom/google/ar/core/e;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    iget-object p1, p1, Lcom/google/ar/core/g;->c:Lcom/google/ar/core/N;

    invoke-virtual {p1, v0, v1}, Lcom/google/ar/core/N;->i(Landroid/app/Activity;Lcom/google/ar/core/L;)V

    return-void

    :cond_2
    const-string/jumbo v0, "resolution.intent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/ar/core/e;->c:Lcom/google/ar/core/g;

    iget-object v1, p0, Lcom/google/ar/core/e;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    iget-object v0, v0, Lcom/google/ar/core/g;->c:Lcom/google/ar/core/N;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/ar/core/N;->j(Landroid/app/Activity;Landroid/os/Bundle;Lcom/google/ar/core/L;)V

    return-void

    :cond_3
    const/16 p1, 0xa

    if-eq v1, p1, :cond_4

    packed-switch v1, :pswitch_data_0

    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const/16 v2, 0x1b

    const-string/jumbo v3, "Unexpected install status: "

    invoke-static {v2, v1, v3}, Lcom/google/ar/core/F;->b(BILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    sget-object v0, Lcom/google/ar/core/M;->b:Lcom/google/ar/core/M;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string/jumbo v1, "Unexpected FAILED install status without error."

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    sget-object v0, Lcom/google/ar/core/M;->c:Lcom/google/ar/core/M;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    sget-object v0, Lcom/google/ar/core/M;->a:Lcom/google/ar/core/M;

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->a(Lcom/google/ar/core/M;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/ar/core/e;->d:Lcom/google/ar/core/L;

    new-instance v0, Lcom/google/ar/core/exceptions/FatalException;

    const-string/jumbo v1, "Unexpected REQUIRES_UI_INTENT install status without an intent."

    invoke-direct {v0, v1}, Lcom/google/ar/core/exceptions/FatalException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/ar/core/L;->b(Ljava/lang/Exception;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method
