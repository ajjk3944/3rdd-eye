.class public Linet/ipaddr/format/validate/r$k;
.super Linet/ipaddr/format/validate/r$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field private final b:J

.field private final c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/r$j;-><init>(Z)V

    iput-wide p1, p0, Linet/ipaddr/format/validate/r$k;->b:J

    iput-wide p3, p0, Linet/ipaddr/format/validate/r$k;->c:J

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 0

    iget-wide p1, p0, Linet/ipaddr/format/validate/r$k;->b:J

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 0

    iget-wide p1, p0, Linet/ipaddr/format/validate/r$k;->c:J

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method
