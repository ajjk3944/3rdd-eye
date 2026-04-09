.class public final synthetic Linet/ipaddr/ipv6/l;
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

    iput p1, p0, Linet/ipaddr/ipv6/l;->a:I

    iput p2, p0, Linet/ipaddr/ipv6/l;->b:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Linet/ipaddr/ipv6/l;->a:I

    iget v1, p0, Linet/ipaddr/ipv6/l;->b:I

    check-cast p1, Linet/ipaddr/ipv6/b;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv6/Q;->K2(IILinet/ipaddr/ipv6/b;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method
