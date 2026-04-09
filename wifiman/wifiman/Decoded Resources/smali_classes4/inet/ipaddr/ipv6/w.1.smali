.class public final synthetic Linet/ipaddr/ipv6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv6/V;

    invoke-virtual {p1}, Linet/ipaddr/ipv6/V;->n3()Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method
