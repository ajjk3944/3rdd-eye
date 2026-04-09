.class public final synthetic Linet/ipaddr/ipv6/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/j$e;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/E;->a:Linet/ipaddr/ipv6/Q;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/E;->a:Linet/ipaddr/ipv6/Q;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1, p2}, Linet/ipaddr/ipv6/Q;->P2(Linet/ipaddr/ipv6/Q;Ljava/lang/Integer;I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method
