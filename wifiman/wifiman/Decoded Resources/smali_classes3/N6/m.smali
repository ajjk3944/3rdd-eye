.class public LN6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN6/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/le/ScanResult;)LQ6/b;
    .locals 0

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->isConnectable()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LQ6/b;->CONNECTABLE:LQ6/b;

    goto :goto_0

    :cond_0
    sget-object p1, LQ6/b;->NOT_CONNECTABLE:LQ6/b;

    :goto_0
    return-object p1
.end method
