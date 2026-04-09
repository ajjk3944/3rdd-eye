.class final LE0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/n0;


# instance fields
.field private final a:LC0/D;

.field private final b:LE0/P;


# direct methods
.method public constructor <init>(LC0/D;LE0/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/r0;->a:LC0/D;

    iput-object p2, p0, LE0/r0;->b:LE0/P;

    return-void
.end method


# virtual methods
.method public final a()LE0/P;
    .locals 1

    iget-object v0, p0, LE0/r0;->b:LE0/P;

    return-object v0
.end method

.method public final b()LC0/D;
    .locals 1

    iget-object v0, p0, LE0/r0;->a:LC0/D;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LE0/r0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LE0/r0;

    iget-object v1, p0, LE0/r0;->a:LC0/D;

    iget-object v3, p1, LE0/r0;->a:LC0/D;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LE0/r0;->b:LE0/P;

    iget-object p1, p1, LE0/r0;->b:LE0/P;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public h0()Z
    .locals 1

    iget-object v0, p0, LE0/r0;->b:LE0/P;

    invoke-virtual {v0}, LE0/P;->c1()LC0/r;

    move-result-object v0

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LE0/r0;->a:LC0/D;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LE0/r0;->b:LE0/P;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PlaceableResult(result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LE0/r0;->a:LC0/D;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LE0/r0;->b:LE0/P;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
