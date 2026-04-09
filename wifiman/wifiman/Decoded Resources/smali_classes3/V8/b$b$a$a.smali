.class final LV8/b$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/b$b$a;->c(Z)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/b;

.field final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field final synthetic c:[B


# direct methods
.method constructor <init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 0

    iput-object p1, p0, LV8/b$b$a$a;->a:LV8/b;

    iput-object p2, p0, LV8/b$b$a$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p3, p0, LV8/b$b$a$a;->c:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LV8/b$b$a$a;->a:LV8/b;

    new-instance v0, LV8/b$b$a$a$a;

    iget-object v1, p0, LV8/b$b$a$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v2, p0, LV8/b$b$a$a;->c:[B

    invoke-direct {v0, v1, v2}, LV8/b$b$a$a$a;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-static {p1, v0}, LV8/b;->i(LV8/b;Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LV8/b$b$a$a;->a(Lhg/c;)V

    return-void
.end method
