.class public final synthetic Linet/ipaddr/ipv6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/d$d;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/j;->a:Linet/ipaddr/ipv6/Q;

    iput p2, p0, Linet/ipaddr/ipv6/j;->b:I

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/j;->a:Linet/ipaddr/ipv6/Q;

    iget v1, p0, Linet/ipaddr/ipv6/j;->b:I

    check-cast p3, Linet/ipaddr/ipv6/b;

    invoke-static {v0, v1, p1, p2, p3}, Linet/ipaddr/ipv6/Q;->T2(Linet/ipaddr/ipv6/Q;IZZLinet/ipaddr/ipv6/b;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
