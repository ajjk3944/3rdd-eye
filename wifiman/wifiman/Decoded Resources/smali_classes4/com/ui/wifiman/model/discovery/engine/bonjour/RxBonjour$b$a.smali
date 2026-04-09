.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;
.super Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V
    .locals 1

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    iget-object p1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$b$a;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found(service="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
