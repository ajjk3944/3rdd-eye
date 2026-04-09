.class public final synthetic Linet/ipaddr/ipv6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:[B

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>([BLjava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/a;->a:[B

    iput-object p2, p0, Linet/ipaddr/ipv6/a;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/a;->a:[B

    iget-object v1, p0, Linet/ipaddr/ipv6/a;->b:Ljava/lang/Integer;

    check-cast p1, Linet/ipaddr/a;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv6/b;->u1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;

    move-result-object p1

    return-object p1
.end method
