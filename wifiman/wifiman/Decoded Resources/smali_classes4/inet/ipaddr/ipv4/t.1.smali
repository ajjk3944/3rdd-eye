.class public final synthetic Linet/ipaddr/ipv4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/I;

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/t;->a:Linet/ipaddr/ipv4/I;

    iput-object p2, p0, Linet/ipaddr/ipv4/t;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv4/t;->a:Linet/ipaddr/ipv4/I;

    iget-object v1, p0, Linet/ipaddr/ipv4/t;->b:Ljava/lang/Integer;

    check-cast p1, [Linet/ipaddr/ipv4/M;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv4/I;->L2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;[Linet/ipaddr/ipv4/M;)Z

    move-result p1

    return p1
.end method
