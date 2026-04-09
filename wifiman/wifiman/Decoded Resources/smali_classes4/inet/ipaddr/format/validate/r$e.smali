.class public Linet/ipaddr/format/validate/r$e;
.super Linet/ipaddr/format/validate/r$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private final b:J

.field private final c:J


# direct methods
.method constructor <init>(IZ)V
    .locals 4

    invoke-direct {p0, p2}, Linet/ipaddr/format/validate/r$f;-><init>(Z)V

    const-wide/16 v0, -0x1

    const/16 p2, 0x40

    if-lt p1, p2, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Linet/ipaddr/format/validate/r$e;->c:J

    sub-int/2addr p1, p2

    ushr-long p1, v0, p1

    iput-wide p1, p0, Linet/ipaddr/format/validate/r$e;->b:J

    goto :goto_0

    :cond_0
    ushr-long p1, v0, p1

    iput-wide p1, p0, Linet/ipaddr/format/validate/r$e;->c:J

    iput-wide v0, p0, Linet/ipaddr/format/validate/r$e;->b:J

    :goto_0
    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 2

    iget-wide v0, p0, Linet/ipaddr/format/validate/r$e;->b:J

    not-long v0, v0

    and-long/2addr p1, v0

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 2

    iget-wide v0, p0, Linet/ipaddr/format/validate/r$e;->b:J

    or-long/2addr p1, v0

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public g(JJ)J
    .locals 2

    iget-wide v0, p0, Linet/ipaddr/format/validate/r$e;->c:J

    not-long v0, v0

    and-long/2addr p1, v0

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$f;->g(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public h(JJ)J
    .locals 2

    iget-wide v0, p0, Linet/ipaddr/format/validate/r$e;->c:J

    or-long/2addr p1, v0

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method
