.class public final Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;
.super Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->a:F

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x3d4ccccd    # 0.05f

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;-><init>(F)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->a:F

    return v0
.end method

.method public final b(F)Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;-><init>(F)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    iget v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->a:F

    iget p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->a:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->a:F

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TokenFetch(progress="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
