.class LM6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/g;->b(Lgg/t;LO6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/t;

.field final synthetic b:LO6/i;

.field final synthetic c:LM6/g;


# direct methods
.method constructor <init>(LM6/g;Lgg/t;LO6/i;)V
    .locals 0

    iput-object p1, p0, LM6/g$a;->c:LM6/g;

    iput-object p2, p0, LM6/g$a;->a:Lgg/t;

    iput-object p3, p0, LM6/g$a;->b:LO6/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    iget-object p1, p0, LM6/g$a;->c:LM6/g;

    iget-object v0, p0, LM6/g$a;->a:Lgg/t;

    iget-object v1, p0, LM6/g$a;->b:LO6/i;

    invoke-virtual {p1, v0, v1}, LM6/g;->d(Lgg/h;LO6/i;)V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Disconnect operation has been executed but finished with an error - considering disconnected."

    invoke-static {p1, v1, v0}, LI6/q;->r(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LM6/g$a;->c:LM6/g;

    iget-object v0, p0, LM6/g$a;->a:Lgg/t;

    iget-object v1, p0, LM6/g$a;->b:LO6/i;

    invoke-virtual {p1, v0, v1}, LM6/g;->d(Lgg/h;LO6/i;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, p1}, LM6/g$a;->a(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method
