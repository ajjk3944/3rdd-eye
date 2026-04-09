.class public final Lj$/time/DesugarDuration;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static toDaysPart(Ljava/time/Duration;)J
    .locals 4

    .line 160
    invoke-virtual {p0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    const-wide/32 v2, 0x15180

    .line 161
    div-long/2addr v0, v2

    return-wide v0
.end method

.method public static toHoursPart(Ljava/time/Duration;)I
    .locals 4

    .line 177
    invoke-virtual {p0}, Ljava/time/Duration;->toHours()J

    move-result-wide v0

    const-wide/16 v2, 0x18

    rem-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public static toMinutesPart(Ljava/time/Duration;)I
    .locals 4

    .line 193
    invoke-virtual {p0}, Ljava/time/Duration;->toMinutes()J

    move-result-wide v0

    const-wide/16 v2, 0x3c

    rem-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method
