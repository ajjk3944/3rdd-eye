.class public final LW7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW7/c$a;
    }
.end annotation


# instance fields
.field private final a:LW7/c$a;

.field private final b:Ljava/lang/Double;

.field private final c:Landroid/location/Location;


# direct methods
.method public constructor <init>(LW7/c$a;Ljava/lang/Double;)V
    .locals 2

    const-string/jumbo v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LW7/c;->a:LW7/c$a;

    .line 3
    iput-object p2, p0, LW7/c;->b:Ljava/lang/Double;

    .line 4
    new-instance p2, Landroid/location/Location;

    const-string v0, ""

    invoke-direct {p2, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, LW7/c$a;->b()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    .line 6
    invoke-virtual {p1}, LW7/c$a;->a()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Landroid/location/Location;->setLatitude(D)V

    .line 7
    iput-object p2, p0, LW7/c;->c:Landroid/location/Location;

    return-void
.end method

.method public synthetic constructor <init>(LW7/c$a;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;)V

    return-void
.end method


# virtual methods
.method public final a(LW7/c;)F
    .locals 4

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LW7/c;->c:Landroid/location/Location;

    new-instance v1, Landroid/location/Location;

    const-string v2, ""

    invoke-direct {v1, v2}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-object v2, p1, LW7/c;->a:LW7/c$a;

    invoke-virtual {v2}, LW7/c$a;->b()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/location/Location;->setLongitude(D)V

    iget-object p1, p1, LW7/c;->a:LW7/c$a;

    invoke-virtual {p1}, LW7/c$a;->a()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {v0, v1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    return p1
.end method

.method public final b()LW7/c$a;
    .locals 1

    iget-object v0, p0, LW7/c;->a:LW7/c$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LW7/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LW7/c;

    iget-object v1, p0, LW7/c;->a:LW7/c$a;

    iget-object v3, p1, LW7/c;->a:LW7/c$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LW7/c;->b:Ljava/lang/Double;

    iget-object p1, p1, LW7/c;->b:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LW7/c;->a:LW7/c$a;

    invoke-virtual {v0}, LW7/c$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LW7/c;->b:Ljava/lang/Double;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LW7/c;->a:LW7/c$a;

    iget-object v1, p0, LW7/c;->b:Ljava/lang/Double;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Location(coordinates="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accuracy="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
