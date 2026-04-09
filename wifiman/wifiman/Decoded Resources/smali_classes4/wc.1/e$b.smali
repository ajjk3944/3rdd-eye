.class public final Lwc/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/e;-><init>(Landroid/bluetooth/BluetoothManager;Landroid/content/pm/PackageManager;Ltc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/bluetooth/BluetoothManager;

.field final synthetic b:Lwc/e;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothManager;Lwc/e;)V
    .locals 0

    iput-object p1, p0, Lwc/e$b;->a:Landroid/bluetooth/BluetoothManager;

    iput-object p2, p0, Lwc/e$b;->b:Lwc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lwc/e$b;->a:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwc/e$b;->b:Lwc/e;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    invoke-static {v1, v0}, Lwc/e;->b(Lwc/e;I)Lwc/d$a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lwc/d$a;->ERROR:Lwc/d$a;

    :cond_1
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
