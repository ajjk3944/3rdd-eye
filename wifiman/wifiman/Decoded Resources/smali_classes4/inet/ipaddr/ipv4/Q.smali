.class public final synthetic Linet/ipaddr/ipv4/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Linet/ipaddr/ipv4/b;

    invoke-virtual {p1}, Linet/ipaddr/ipv4/b;->D1()Linet/ipaddr/ipv4/b;

    move-result-object p1

    return-object p1
.end method
