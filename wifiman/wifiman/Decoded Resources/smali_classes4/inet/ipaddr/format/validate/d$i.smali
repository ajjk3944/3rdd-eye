.class public Linet/ipaddr/format/validate/d$i;
.super Linet/ipaddr/format/validate/d$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field private final c:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Linet/ipaddr/o;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Linet/ipaddr/format/validate/d$i;-><init>(Ljava/lang/CharSequence;Linet/ipaddr/o;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/CharSequence;Linet/ipaddr/o;)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, Linet/ipaddr/format/validate/d$l;-><init>(Linet/ipaddr/o;)V

    .line 3
    iput-object p1, p0, Linet/ipaddr/format/validate/d$i;->c:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method a()Linet/ipaddr/format/validate/r$d;
    .locals 3

    invoke-static {}, Ljava/net/InetAddress;->getLoopbackAddress()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v1, v0, Ljava/net/Inet6Address;

    iget-object v2, p0, Linet/ipaddr/format/validate/d$i;->c:Ljava/lang/CharSequence;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v1, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-virtual {v1}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    iget-object v2, p0, Linet/ipaddr/format/validate/d$i;->c:Ljava/lang/CharSequence;

    invoke-virtual {v1, v0, v2}, Linet/ipaddr/format/validate/f;->m([BLjava/lang/CharSequence;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->r()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/j0;->t()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/i;->n()Linet/ipaddr/g;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-virtual {v0}, Linet/ipaddr/o;->p()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z;->r()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/i;->n()Linet/ipaddr/g;

    move-result-object v0

    :goto_0
    new-instance v1, Linet/ipaddr/format/validate/r$d;

    invoke-direct {v1, v0}, Linet/ipaddr/format/validate/r$d;-><init>(Linet/ipaddr/g;)V

    return-object v1
.end method

.method public g0()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
