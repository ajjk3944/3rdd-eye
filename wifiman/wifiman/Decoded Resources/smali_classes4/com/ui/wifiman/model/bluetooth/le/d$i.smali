.class final Lcom/ui/wifiman/model/bluetooth/le/d$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/d;->a(Lh9/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/d$i;->a:Lcom/ui/wifiman/model/bluetooth/le/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)LDj/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/d$i;->a:Lcom/ui/wifiman/model/bluetooth/le/d;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->n(Lcom/ui/wifiman/model/bluetooth/le/d;Landroid/bluetooth/BluetoothDevice;)Lgg/s;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d;->j(Lcom/ui/wifiman/model/bluetooth/le/d;Lgg/s;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/d$i;->a(Landroid/bluetooth/BluetoothDevice;)LDj/a;

    move-result-object p1

    return-object p1
.end method
