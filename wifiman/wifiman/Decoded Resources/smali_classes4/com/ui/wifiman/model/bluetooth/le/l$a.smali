.class public final Lcom/ui/wifiman/model/bluetooth/le/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/bluetooth/le/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/bluetooth/le/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/bluetooth/le/l$c;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/l$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/bluetooth/le/l$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/bluetooth/le/l$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/bluetooth/le/l$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    iget-object p1, p1, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/l$a;->a:Lcom/ui/wifiman/model/bluetooth/le/l$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Beacon(deviceType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
