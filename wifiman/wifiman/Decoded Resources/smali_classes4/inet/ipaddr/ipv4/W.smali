.class public final synthetic Linet/ipaddr/ipv4/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/m$e;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Linet/ipaddr/ipv4/b;

    check-cast p2, Linet/ipaddr/ipv4/b;

    invoke-static {p1, p2, p3}, Linet/ipaddr/ipv4/Y;->f1(Linet/ipaddr/ipv4/b;Linet/ipaddr/ipv4/b;I)Z

    move-result p1

    return p1
.end method
