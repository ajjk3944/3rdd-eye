.class public final synthetic Linet/ipaddr/ipv6/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/e$a;

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/F;->a:Linet/ipaddr/ipv6/e$a;

    iput-object p2, p0, Linet/ipaddr/ipv6/F;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/F;->a:Linet/ipaddr/ipv6/e$a;

    iget-object v1, p0, Linet/ipaddr/ipv6/F;->b:Ljava/lang/Integer;

    check-cast p1, [Linet/ipaddr/ipv6/V;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv6/Q;->J2(Linet/ipaddr/ipv6/e$a;Ljava/lang/Integer;[Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    return-object p1
.end method
