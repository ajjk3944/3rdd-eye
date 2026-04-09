.class final LV8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/b;->b([B)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/b;

.field final synthetic b:[B


# direct methods
.method constructor <init>(LV8/b;[B)V
    .locals 0

    iput-object p1, p0, LV8/b$b;->a:LV8/b;

    iput-object p2, p0, LV8/b$b;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/f;
    .locals 4

    const-string/jumbo v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/b$b;->a:LV8/b;

    iget-object v1, p0, LV8/b$b;->b:[B

    array-length v1, v1

    invoke-static {v0, v1}, LV8/b;->c(LV8/b;I)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/b$b$a;

    iget-object v2, p0, LV8/b$b;->a:LV8/b;

    iget-object v3, p0, LV8/b$b;->b:[B

    invoke-direct {v1, v2, p1, v3}, LV8/b$b$a;-><init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, p1}, LV8/b$b;->a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
