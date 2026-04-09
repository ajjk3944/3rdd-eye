.class LK6/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LO6/d;

.field private final b:LM6/k;


# direct methods
.method constructor <init>(LO6/d;LM6/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/w;->a:LO6/d;

    iput-object p2, p0, LK6/w;->b:LM6/k;

    return-void
.end method


# virtual methods
.method a(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lgg/b;
    .locals 2

    iget-object v0, p0, LK6/w;->a:LO6/d;

    iget-object v1, p0, LK6/w;->b:LM6/k;

    invoke-interface {v1, p1, p2}, LM6/k;->b(Landroid/bluetooth/BluetoothGattDescriptor;[B)LM6/f;

    move-result-object p1

    invoke-interface {v0, p1}, LO6/a;->a(LM6/j;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    return-object p1
.end method
