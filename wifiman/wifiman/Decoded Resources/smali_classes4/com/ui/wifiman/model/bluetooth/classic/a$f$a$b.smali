.class public final Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;->a(Ljava/util/List;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/ui/wifiman/model/vendor/d$a;

.field final synthetic c:Lcom/ui/wifiman/model/bluetooth/classic/a;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/ui/wifiman/model/vendor/d$a;Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->b:Lcom/ui/wifiman/model/vendor/d$a;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->c:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 8

    :try_start_0
    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->a:Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->a:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothProfile;

    invoke-interface {v2}, Landroid/bluetooth/BluetoothProfile;->getConnectedDevices()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->b:Lcom/ui/wifiman/model/vendor/d$a;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->b:Lcom/ui/wifiman/model/vendor/d$a;

    iget-object v5, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a$b;->c:Lcom/ui/wifiman/model/bluetooth/classic/a;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v5, v3, v6, v7, v4}, Lcom/ui/wifiman/model/bluetooth/classic/a;->f(Lcom/ui/wifiman/model/bluetooth/classic/a;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;ZLcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
