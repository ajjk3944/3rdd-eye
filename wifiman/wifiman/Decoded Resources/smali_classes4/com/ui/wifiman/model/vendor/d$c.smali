.class public final Lcom/ui/wifiman/model/vendor/d$c;
.super Lcom/ui/wifiman/model/vendor/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/vendor/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/vendor/d$d;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/vendor/d$d;)V
    .locals 1

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/vendor/d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$d;->getHomepageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/model/vendor/d$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/vendor/d$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/vendor/d$c;

    iget-object v1, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    iget-object p1, p1, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$d;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/d$c;->a:Lcom/ui/wifiman/model/vendor/d$d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Recognized(record="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
