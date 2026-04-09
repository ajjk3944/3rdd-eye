.class final LV8/a$a;
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
.field public static final a:LV8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/a$a;

    invoke-direct {v0}, LV8/a$a;-><init>()V

    sput-object v0, LV8/a$a;->a:LV8/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/s;)Lgg/v;
    .locals 1

    const-string/jumbo v0, "packetFrameStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LV8/a$a;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
