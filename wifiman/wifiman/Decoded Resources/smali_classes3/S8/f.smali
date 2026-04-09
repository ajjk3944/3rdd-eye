.class public final LS8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/f$a;
    }
.end annotation


# instance fields
.field private final a:D

.field private final b:LS8/f$a;


# direct methods
.method public constructor <init>(D)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LS8/f;->a:D

    const-wide v0, 0x3fe3333333333333L    # 0.6

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    sget-object p1, LS8/f$a;->EXCELLENT:LS8/f$a;

    goto :goto_0

    :cond_0
    const-wide v0, 0x3fd999999999999aL    # 0.4

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_1

    sget-object p1, LS8/f$a;->GOOD:LS8/f$a;

    goto :goto_0

    :cond_1
    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    cmpl-double p1, p1, v0

    if-ltz p1, :cond_2

    sget-object p1, LS8/f$a;->FAIR:LS8/f$a;

    goto :goto_0

    :cond_2
    sget-object p1, LS8/f$a;->POOR:LS8/f$a;

    :goto_0
    iput-object p1, p0, LS8/f;->b:LS8/f$a;

    return-void
.end method


# virtual methods
.method public a(LS8/f;)I
    .locals 4

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LS8/f;->a:D

    iget-wide v2, p1, LS8/f;->a:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method

.method public final b()LS8/f$a;
    .locals 1

    iget-object v0, p0, LS8/f;->b:LS8/f$a;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LS8/f;

    invoke-virtual {p0, p1}, LS8/f;->a(LS8/f;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LS8/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LS8/f;

    iget-wide v3, p0, LS8/f;->a:D

    iget-wide v5, p1, LS8/f;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LS8/f;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, LS8/f;->a:D

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "WifiChannelHealth(channelCapacity="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
