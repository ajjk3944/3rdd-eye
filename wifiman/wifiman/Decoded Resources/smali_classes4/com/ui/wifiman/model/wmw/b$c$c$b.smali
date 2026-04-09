.class public final Lcom/ui/wifiman/model/wmw/b$c$c$b;
.super Lcom/ui/wifiman/model/wmw/b$c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/b$c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/wmw/b;

.field private final b:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

.field private final c:F


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;)V
    .locals 1

    const-string v0, "adoption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/wmw/b$c$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->a:Lcom/ui/wifiman/model/wmw/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->c:F

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/wifiman/model/wmw/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->a:Lcom/ui/wifiman/model/wmw/b;

    return-object v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->c:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$c$c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/wmw/b$c$c$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->a:Lcom/ui/wifiman/model/wmw/b;

    iget-object v3, p1, Lcom/ui/wifiman/model/wmw/b$c$c$b;->a:Lcom/ui/wifiman/model/wmw/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    iget-object p1, p1, Lcom/ui/wifiman/model/wmw/b$c$c$b;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->a:Lcom/ui/wifiman/model/wmw/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->a:Lcom/ui/wifiman/model/wmw/b;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/b$c$c$b;->b:Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed(adoption="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reason="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
