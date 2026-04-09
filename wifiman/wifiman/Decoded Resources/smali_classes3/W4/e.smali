.class public LW4/e;
.super Ls3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ls3/d;Lcom/google/android/gms/common/api/e$a;Lcom/google/android/gms/common/api/e$b;)V
    .locals 7

    const/16 v3, 0x83

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ls3/g;-><init>(Landroid/content/Context;Landroid/os/Looper;ILs3/d;Lcom/google/android/gms/common/api/e$a;Lcom/google/android/gms/common/api/e$b;)V

    return-void
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService"

    return-object v0
.end method

.method protected D()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "com.google.firebase.dynamiclinks.service.START"

    return-object v0
.end method

.method public Q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h()I
    .locals 1

    const v0, 0xbdfcb8

    return v0
.end method

.method protected j0(Landroid/os/IBinder;)LW4/i;
    .locals 0

    invoke-static {p1}, LW4/i$a;->b(Landroid/os/IBinder;)LW4/i;

    move-result-object p1

    return-object p1
.end method

.method k0(LW4/h$a;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ls3/c;->B()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LW4/i;

    invoke-interface {v0, p1, p2}, LW4/i;->q(LW4/h;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic q(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 0

    invoke-virtual {p0, p1}, LW4/e;->j0(Landroid/os/IBinder;)LW4/i;

    move-result-object p1

    return-object p1
.end method
