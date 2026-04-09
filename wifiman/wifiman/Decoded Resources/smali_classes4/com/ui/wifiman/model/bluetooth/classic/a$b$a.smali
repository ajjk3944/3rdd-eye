.class public final Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/classic/a$b;->a(LYg/s;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/classic/a;

.field final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field final synthetic c:Ljava/lang/Integer;

.field final synthetic d:Lcom/ui/wifiman/model/vendor/d$a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/bluetooth/classic/a;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;Lcom/ui/wifiman/model/vendor/d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->b:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->c:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->d:Lcom/ui/wifiman/model/vendor/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->b:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->c:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$b$a;->d:Lcom/ui/wifiman/model/vendor/d$a;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lcom/ui/wifiman/model/bluetooth/classic/a;->f(Lcom/ui/wifiman/model/bluetooth/classic/a;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;ZLcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
