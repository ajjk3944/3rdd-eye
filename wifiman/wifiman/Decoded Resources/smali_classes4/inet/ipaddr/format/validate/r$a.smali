.class Linet/ipaddr/format/validate/r$a;
.super Linet/ipaddr/format/validate/r$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Linet/ipaddr/format/validate/r;->N1(ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic p:Linet/ipaddr/format/validate/r;


# direct methods
.method constructor <init>(Linet/ipaddr/format/validate/r;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$a;->p:Linet/ipaddr/format/validate/r;

    invoke-direct {p0, p1}, Linet/ipaddr/format/validate/r$l;-><init>(Linet/ipaddr/format/validate/r;)V

    return-void
.end method


# virtual methods
.method y()Linet/ipaddr/format/validate/f;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$a;->p:Linet/ipaddr/format/validate/r;

    invoke-static {v0}, Linet/ipaddr/format/validate/r;->G1(Linet/ipaddr/format/validate/r;)Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method
