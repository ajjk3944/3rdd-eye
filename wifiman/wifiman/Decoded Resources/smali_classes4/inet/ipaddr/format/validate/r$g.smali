.class public Linet/ipaddr/format/validate/r$g;
.super Linet/ipaddr/format/validate/r$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method public constructor <init>(JJJJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/r$f;-><init>(Z)V

    iput-wide p3, p0, Linet/ipaddr/format/validate/r$g;->c:J

    iput-wide p7, p0, Linet/ipaddr/format/validate/r$g;->e:J

    iput-wide p1, p0, Linet/ipaddr/format/validate/r$g;->b:J

    iput-wide p5, p0, Linet/ipaddr/format/validate/r$g;->d:J

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 0

    iget-wide p1, p0, Linet/ipaddr/format/validate/r$g;->c:J

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 0

    iget-wide p1, p0, Linet/ipaddr/format/validate/r$g;->e:J

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public g(JJ)J
    .locals 0

    iget-wide p1, p0, Linet/ipaddr/format/validate/r$g;->b:J

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$f;->g(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public h(JJ)J
    .locals 0

    iget-wide p1, p0, Linet/ipaddr/format/validate/r$g;->d:J

    invoke-super {p0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$f;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method
