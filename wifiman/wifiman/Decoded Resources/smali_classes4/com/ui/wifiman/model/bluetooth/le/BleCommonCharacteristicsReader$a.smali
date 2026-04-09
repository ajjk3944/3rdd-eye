.class public final Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/i$a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "char"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/bluetooth/le/i$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/bluetooth/le/i$a;->getFormatter()Lmh/l;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    iget-object v3, p1, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->b:Ljava/lang/Object;

    iget-object p1, p1, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->b:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->a:Lcom/ui/wifiman/model/bluetooth/le/i$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$a;->b:Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CharacteristicsData(char="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
