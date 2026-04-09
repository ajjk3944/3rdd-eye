.class public Linet/ipaddr/format/validate/r$i;
.super Linet/ipaddr/format/validate/r$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field private final b:J

.field public final c:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 2

    invoke-direct {p0, p2}, Linet/ipaddr/format/validate/r$j;-><init>(Z)V

    iput p1, p0, Linet/ipaddr/format/validate/r$i;->c:I

    const-wide/16 v0, -0x1

    ushr-long p1, v0, p1

    iput-wide p1, p0, Linet/ipaddr/format/validate/r$i;->b:J

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 2

    iget-wide v0, p0, Linet/ipaddr/format/validate/r$i;->b:J

    not-long v0, v0

    and-long/2addr p1, v0

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 2

    iget-wide v0, p0, Linet/ipaddr/format/validate/r$i;->b:J

    or-long/2addr p1, v0

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method
