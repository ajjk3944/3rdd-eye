.class LM6/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/c;->d()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/c;


# direct methods
.method constructor <init>(LM6/c;)V
    .locals 0

    iput-object p1, p0, LM6/c$e;->a:LM6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothGatt;
    .locals 2

    iget-object v0, p0, LM6/c$e;->a:LM6/c;

    iget-object v0, v0, LM6/c;->g:LK6/m;

    sget-object v1, LG6/N$b;->CONNECTED:LG6/N$b;

    invoke-interface {v0, v1}, LK6/m;->a(LG6/N$b;)V

    iget-object v0, p0, LM6/c$e;->a:LM6/c;

    iget-object v0, v0, LM6/c;->d:LK6/a;

    invoke-virtual {v0}, LK6/a;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM6/c$e;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method
