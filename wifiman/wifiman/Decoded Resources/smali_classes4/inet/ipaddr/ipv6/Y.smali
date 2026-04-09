.class public final synthetic Linet/ipaddr/ipv6/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/e$a;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/Y;->a:Linet/ipaddr/ipv6/e$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/Y;->a:Linet/ipaddr/ipv6/e$a;

    check-cast p1, [Linet/ipaddr/ipv6/V;

    check-cast p2, [Linet/ipaddr/ipv6/V;

    invoke-static {v0, p1, p2}, Linet/ipaddr/ipv6/i0;->g1(Linet/ipaddr/ipv6/e$a;[Linet/ipaddr/ipv6/V;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/i0;

    move-result-object p1

    return-object p1
.end method
