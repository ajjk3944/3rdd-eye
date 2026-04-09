.class public final synthetic Linet/ipaddr/ipv6/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Linet/ipaddr/ipv6/K;->a:I

    return-void
.end method


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 2

    iget v0, p0, Linet/ipaddr/ipv6/K;->a:I

    check-cast p1, Linet/ipaddr/ipv6/Q;

    invoke-static {v0, p1}, Linet/ipaddr/ipv6/Q;->Q2(ILinet/ipaddr/ipv6/Q;)J

    move-result-wide v0

    return-wide v0
.end method
