.class LN6/y$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y$c;->a(Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LN6/y$c;


# direct methods
.method constructor <init>(LN6/y$c;)V
    .locals 0

    iput-object p1, p0, LN6/y$c$b;->a:LN6/y$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LN6/o;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, LN6/o;->c()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN6/o;

    invoke-virtual {p0, p1}, LN6/y$c$b;->a(LN6/o;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
