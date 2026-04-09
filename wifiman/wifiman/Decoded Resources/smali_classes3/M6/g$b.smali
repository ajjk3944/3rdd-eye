.class LM6/g$b;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field final a:Landroid/bluetooth/BluetoothGatt;

.field private final b:LK6/l0;

.field private final c:Lgg/y;


# direct methods
.method constructor <init>(Landroid/bluetooth/BluetoothGatt;LK6/l0;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, LM6/g$b;->a:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, LM6/g$b;->b:LK6/l0;

    iput-object p3, p0, LM6/g$b;->c:Lgg/y;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 2

    iget-object v0, p0, LM6/g$b;->b:LK6/l0;

    invoke-virtual {v0}, LK6/l0;->d()Lgg/s;

    move-result-object v0

    new-instance v1, LM6/g$b$b;

    invoke-direct {v1, p0}, LM6/g$b$b;-><init>(LM6/g$b;)V

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->P()Lgg/z;

    move-result-object v0

    new-instance v1, LM6/g$b$a;

    invoke-direct {v1, p0}, LM6/g$b$a;-><init>(LM6/g$b;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/z;->a(Lgg/B;)V

    iget-object p1, p0, LM6/g$b;->c:Lgg/y;

    invoke-virtual {p1}, Lgg/y;->c()Lgg/y$c;

    move-result-object p1

    new-instance v0, LM6/g$b$c;

    invoke-direct {v0, p0}, LM6/g$b$c;-><init>(LM6/g$b;)V

    invoke-virtual {p1, v0}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method
