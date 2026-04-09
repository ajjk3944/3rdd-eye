.class public final Lcom/ui/wifiman/model/bluetooth/le/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/le/i$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/bluetooth/le/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/i;

    invoke-direct {v0}, Lcom/ui/wifiman/model/bluetooth/le/i;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/i;->a:Lcom/ui/wifiman/model/bluetooth/le/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/util/UUID;
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Lkotlin/text/a;->a(I)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-0000-1000-8000-00805f9b34fb"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    const-string v0, "fromString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/bluetooth/le/i$a;)Ljava/util/UUID;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->getCharacteristic()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/i;->a(I)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method
