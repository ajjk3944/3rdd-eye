.class final Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/signalmapper/floorplan/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/signalmapper/floorplan/a$b$a;
    }
.end annotation


# instance fields
.field private final a:LS8/l;

.field private final b:Ljava/lang/Float;

.field private final c:Ljava/lang/Float;


# direct methods
.method public constructor <init>(LS8/l;Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a:LS8/l;

    .line 3
    iput-object p2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b:Ljava/lang/Float;

    .line 4
    iput-object p3, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c:Ljava/lang/Float;

    return-void
.end method

.method public synthetic constructor <init>(LS8/l;Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;-><init>(LS8/l;Ljava/lang/Float;Ljava/lang/Float;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b:Ljava/lang/Float;

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()LS8/l;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a:LS8/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a:LS8/l;

    iget-object v3, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c:Ljava/lang/Float;

    iget-object p1, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c:Ljava/lang/Float;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a:LS8/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LS8/l;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c:Ljava/lang/Float;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a:LS8/l;

    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b:Ljava/lang/Float;

    iget-object v2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c:Ljava/lang/Float;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WifimanExtension(wifi="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", granularity="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scale="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
