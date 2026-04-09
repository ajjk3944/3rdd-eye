.class public final synthetic Linet/ipaddr/ipv6/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/G;->a:Linet/ipaddr/ipv6/Q;

    iput p2, p0, Linet/ipaddr/ipv6/G;->b:I

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/G;->a:Linet/ipaddr/ipv6/Q;

    iget v1, p0, Linet/ipaddr/ipv6/G;->b:I

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv6/Q;->I2(Linet/ipaddr/ipv6/Q;I[Linet/ipaddr/ipv6/V;)Z

    move-result p1

    return p1
.end method
