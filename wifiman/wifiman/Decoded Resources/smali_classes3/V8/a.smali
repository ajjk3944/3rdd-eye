.class public final LV8/a;
.super La9/c;
.source "SourceFile"


# instance fields
.field private final b:Lgg/b;


# direct methods
.method public constructor <init>(LG6/N;Landroid/bluetooth/BluetoothGattCharacteristic;Lgg/b;)V
    .locals 1

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "characteristic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connectionErrorStream"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La9/c;-><init>()V

    invoke-interface {p1, p2}, LG6/N;->h(Landroid/bluetooth/BluetoothGattCharacteristic;)Lgg/s;

    move-result-object p1

    sget-object v0, LV8/a$a;->a:LV8/a$a;

    invoke-virtual {p1, v0}, Lgg/s;->O0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance v0, LV8/a$b;

    invoke-direct {v0, p0, p2}, LV8/a$b;-><init>(LV8/a;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-virtual {p1, v0}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    sget-object p2, LV8/a$c;->a:LV8/a$c;

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/b;->K(Lgg/f;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "connection.setupNotifica\u2026th(connectionErrorStream)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LV8/a;->b:Lgg/b;

    return-void
.end method

.method public static final synthetic c(LV8/a;Lmh/a;)V
    .locals 0

    invoke-direct {p0, p1}, LV8/a;->g(Lmh/a;)V

    return-void
.end method

.method public static final synthetic d(LV8/a;[B)V
    .locals 0

    invoke-virtual {p0, p1}, La9/c;->b([B)V

    return-void
.end method

.method private final g(Lmh/a;)V
    .locals 1

    sget-object v0, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LX8/a;->c(Lmh/a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final e()Lgg/b;
    .locals 1

    iget-object v0, p0, LV8/a;->b:Lgg/b;

    return-object v0
.end method
