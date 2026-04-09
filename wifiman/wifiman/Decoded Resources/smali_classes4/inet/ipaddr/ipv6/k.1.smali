.class public final synthetic Linet/ipaddr/ipv6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Linet/ipaddr/ipv6/k;->a:I

    iput p2, p0, Linet/ipaddr/ipv6/k;->b:I

    return-void
.end method


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 2

    iget v0, p0, Linet/ipaddr/ipv6/k;->a:I

    iget v1, p0, Linet/ipaddr/ipv6/k;->b:I

    check-cast p1, Linet/ipaddr/ipv6/b;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv6/Q;->L2(IILinet/ipaddr/ipv6/b;)J

    move-result-wide v0

    return-wide v0
.end method
