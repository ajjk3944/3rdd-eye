.class public final Ls3/Z;
.super Ls3/O;
.source "SourceFile"


# instance fields
.field private a:Ls3/c;

.field private final b:I


# direct methods
.method public constructor <init>(Ls3/c;I)V
    .locals 0

    invoke-direct {p0}, Ls3/O;-><init>()V

    iput-object p1, p0, Ls3/Z;->a:Ls3/c;

    iput p2, p0, Ls3/Z;->b:I

    return-void
.end method


# virtual methods
.method public final A(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final K(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ls3/Z;->a:Ls3/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ls3/Z;->a:Ls3/c;

    iget v1, p0, Ls3/Z;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Ls3/c;->L(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Ls3/Z;->a:Ls3/c;

    return-void
.end method

.method public final z(ILandroid/os/IBinder;Ls3/d0;)V
    .locals 2

    iget-object v0, p0, Ls3/Z;->a:Ls3/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Ls3/c;->a0(Ls3/c;Ls3/d0;)V

    iget-object p3, p3, Ls3/d0;->a:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Ls3/Z;->K(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method
