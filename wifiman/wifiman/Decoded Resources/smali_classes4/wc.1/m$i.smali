.class final Lwc/m$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m;-><init>(Lwc/d;Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;Lcom/ui/wifiman/model/bluetooth/le/BleScanner;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwc/m;


# direct methods
.method constructor <init>(Lwc/m;)V
    .locals 0

    iput-object p1, p0, Lwc/m$i;->a:Lwc/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string p1, "Bluetooth Classic Discovery subscribed and enabled"

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lwc/m$i;->a:Lwc/m;

    invoke-static {p1}, Lwc/m;->g(Lwc/m;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Lwc/m$i$a;->a:Lwc/m$i$a;

    invoke-virtual {p1, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Bluetooth Classic Discovery subscribed but disabled"

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lwc/m$i;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
