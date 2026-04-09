.class public Linet/ipaddr/format/validate/r$m;
.super Linet/ipaddr/format/validate/r$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "m"
.end annotation


# instance fields
.field private final b:Linet/ipaddr/format/validate/r$j;


# direct methods
.method constructor <init>(Linet/ipaddr/format/validate/r$j;)V
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/r$j;->d()Z

    move-result v0

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/r$f;-><init>(Z)V

    iput-object p1, p0, Linet/ipaddr/format/validate/r$m;->b:Linet/ipaddr/format/validate/r$j;

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$m;->b:Linet/ipaddr/format/validate/r$j;

    invoke-virtual {v0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->a(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public c(JJ)J
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$m;->b:Linet/ipaddr/format/validate/r$j;

    invoke-virtual {v0, p1, p2, p3, p4}, Linet/ipaddr/format/validate/r$j;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method
