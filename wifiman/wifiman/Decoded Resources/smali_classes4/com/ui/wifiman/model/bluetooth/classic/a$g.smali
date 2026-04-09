.class public final Lcom/ui/wifiman/model/bluetooth/classic/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/classic/a;->m(I)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lgg/j;

.field final synthetic c:Lcom/ui/wifiman/model/bluetooth/classic/a;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lgg/j;Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->b:Lgg/j;

    iput-object p3, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->c:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 2

    const-string v0, "proxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bluetooth proxy connected for profile "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->b:Lgg/j;

    new-instance v0, Ll9/a;

    invoke-direct {v0, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bluetooth proxy lost for profile "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->a:Lkotlin/jvm/internal/N;

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->b:Lgg/j;

    new-instance v3, Ll9/a;

    invoke-direct {v3, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Lgg/h;->h(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bluetooth proxy requested AGAIN for "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->c:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/classic/a;->i(Lcom/ui/wifiman/model/bluetooth/classic/a;)Landroid/bluetooth/BluetoothManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$g;->c:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-static {v1}, Lcom/ui/wifiman/model/bluetooth/classic/a;->g(Lcom/ui/wifiman/model/bluetooth/classic/a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p0, p1}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    return-void
.end method
