.class public final synthetic Linet/ipaddr/ipv6/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Linet/ipaddr/ipv6/B;->a:I

    iput p2, p0, Linet/ipaddr/ipv6/B;->b:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Linet/ipaddr/ipv6/B;->a:I

    iget v1, p0, Linet/ipaddr/ipv6/B;->b:I

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv6/Q;->V2(IILinet/ipaddr/ipv6/Q;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method
