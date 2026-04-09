.class LM6/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/g$b;->N(Lgg/B;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/g$b;


# direct methods
.method constructor <init>(LM6/g$b;)V
    .locals 0

    iput-object p1, p0, LM6/g$b$a;->a:LM6/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG6/N$b;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    iget-object p1, p0, LM6/g$b$a;->a:LM6/g$b;

    iget-object p1, p1, LM6/g$b;->a:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/N$b;

    invoke-virtual {p0, p1}, LM6/g$b$a;->a(LG6/N$b;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    return-object p1
.end method
