.class public final synthetic Linet/ipaddr/ipv6/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/x;->a:Linet/ipaddr/ipv6/Q;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/x;->a:Linet/ipaddr/ipv6/Q;

    invoke-static {v0}, Linet/ipaddr/ipv6/Q;->d3(Linet/ipaddr/ipv6/Q;)[Linet/ipaddr/ipv6/V;

    move-result-object v0

    return-object v0
.end method
