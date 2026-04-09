.class public final synthetic Linet/ipaddr/ipv4/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/m$c;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p3, Linet/ipaddr/ipv4/Y;

    invoke-static {p1, p2, p3}, Linet/ipaddr/ipv4/Y;->g1(ZZLinet/ipaddr/ipv4/Y;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
