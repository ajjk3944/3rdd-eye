.class final LV8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/a;-><init>(LG6/N;Landroid/bluetooth/BluetoothGattCharacteristic;Lgg/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV8/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/a$c;

    invoke-direct {v0}, LV8/a$c;-><init>()V

    sput-object v0, LV8/a$c;->a:LV8/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/polidea/rxandroidble3/exceptions/BleException;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$Error;

    const-string v1, "BTLE frame reader ended with an error"

    invoke-direct {v0, v1, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LV8/a$c;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
