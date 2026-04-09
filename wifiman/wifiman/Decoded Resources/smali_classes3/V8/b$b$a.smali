.class final LV8/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/b$b;->a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/f;
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

    iput-object p1, p0, LV8/b$b$a;->a:LV8/b;

    iput-object p2, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput-object p3, p0, LV8/b$b$a;->c:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 0

    invoke-static {p0, p1, p2}, LV8/b$b$a;->d(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-void
.end method

.method public static synthetic b(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 0

    invoke-static {p0, p1, p2}, LV8/b$b$a;->e(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-void
.end method

.method private static final d(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$frame"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/b$b$a$b;

    invoke-direct {v0, p1, p2}, LV8/b$b$a$b;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-static {p0, v0}, LV8/b;->i(LV8/b;Lmh/a;)V

    return-void
.end method

.method private static final e(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$frame"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/b$b$a$d;

    invoke-direct {v0, p1, p2}, LV8/b$b$a$d;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-static {p0, v0}, LV8/b;->i(LV8/b;Lmh/a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, LV8/b$b$a;->c(Z)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(Z)Lgg/f;
    .locals 4

    if-eqz p1, :cond_0

    iget-object p1, p0, LV8/b$b$a;->a:LV8/b;

    invoke-static {p1}, LV8/b;->e(LV8/b;)LG6/N;

    move-result-object p1

    invoke-interface {p1}, LG6/N;->c()LG6/N$a;

    move-result-object p1

    iget-object v0, p0, LV8/b$b$a;->a:LV8/b;

    invoke-static {v0}, LV8/b;->g(LV8/b;)I

    move-result v0

    invoke-interface {p1, v0}, LG6/N$a;->b(I)LG6/N$a;

    move-result-object p1

    iget-object v0, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-interface {p1, v0}, LG6/N$a;->c(Landroid/bluetooth/BluetoothGattCharacteristic;)LG6/N$a;

    move-result-object p1

    iget-object v0, p0, LV8/b$b$a;->c:[B

    invoke-interface {p1, v0}, LG6/N$a;->d([B)LG6/N$a;

    move-result-object p1

    invoke-interface {p1}, LG6/N$a;->a()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    new-instance v0, LV8/b$b$a$a;

    iget-object v1, p0, LV8/b$b$a;->a:LV8/b;

    iget-object v2, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v3, p0, LV8/b$b$a;->c:[B

    invoke-direct {v0, v1, v2, v3}, LV8/b$b$a$a;-><init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, LV8/b$b$a;->a:LV8/b;

    iget-object v1, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v2, p0, LV8/b$b$a;->c:[B

    new-instance v3, LV8/c;

    invoke-direct {v3, v0, v1, v2}, LV8/c;-><init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-virtual {p1, v3}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LV8/b$b$a;->a:LV8/b;

    invoke-static {p1}, LV8/b;->e(LV8/b;)LG6/N;

    move-result-object p1

    iget-object v0, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v1, p0, LV8/b$b$a;->c:[B

    invoke-interface {p1, v0, v1}, LG6/N;->f(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    new-instance v0, LV8/b$b$a$c;

    iget-object v1, p0, LV8/b$b$a;->a:LV8/b;

    iget-object v2, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v3, p0, LV8/b$b$a;->c:[B

    invoke-direct {v0, v1, v2, v3}, LV8/b$b$a$c;-><init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, LV8/b$b$a;->a:LV8/b;

    iget-object v1, p0, LV8/b$b$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v2, p0, LV8/b$b$a;->c:[B

    new-instance v3, LV8/d;

    invoke-direct {v3, v0, v1, v2}, LV8/d;-><init>(LV8/b;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    invoke-virtual {p1, v3}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
