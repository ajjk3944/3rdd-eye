.class public final synthetic Linet/ipaddr/ipv6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/h;->a:Linet/ipaddr/ipv6/Q;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/h;->a:Linet/ipaddr/ipv6/Q;

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method
