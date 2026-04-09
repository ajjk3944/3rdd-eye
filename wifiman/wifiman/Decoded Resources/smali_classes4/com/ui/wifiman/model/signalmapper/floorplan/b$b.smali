.class public final Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/signalmapper/floorplan/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:LW7/d;

.field private final b:J

.field private final c:LS8/l;


# direct methods
.method public constructor <init>(LW7/d;JLS8/l;)V
    .locals 1

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a:LW7/d;

    iput-wide p2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b:J

    iput-object p4, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c:LS8/l;

    return-void
.end method


# virtual methods
.method public final a()LW7/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a:LW7/d;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b:J

    return-wide v0
.end method

.method public final c()LS8/l;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c:LS8/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a:LW7/d;

    iget-object v3, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a:LW7/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c:LS8/l;

    iget-object p1, p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c:LS8/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a:LW7/d;

    invoke-virtual {v0}, LW7/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c:LS8/l;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LS8/l;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a:LW7/d;

    iget-wide v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b:J

    iget-object v3, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c:LS8/l;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PathPoint(coordinates="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", wifiSignal="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
