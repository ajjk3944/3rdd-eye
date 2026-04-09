.class public final synthetic Linet/ipaddr/ipv6/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/D;->a:Linet/ipaddr/ipv6/Q;

    iput p2, p0, Linet/ipaddr/ipv6/D;->b:I

    iput p3, p0, Linet/ipaddr/ipv6/D;->c:I

    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 3

    iget-object v0, p0, Linet/ipaddr/ipv6/D;->a:Linet/ipaddr/ipv6/Q;

    iget v1, p0, Linet/ipaddr/ipv6/D;->b:I

    iget v2, p0, Linet/ipaddr/ipv6/D;->c:I

    invoke-static {v0, v1, v2, p1}, Linet/ipaddr/ipv6/Q;->Y2(Linet/ipaddr/ipv6/Q;III)I

    move-result p1

    return p1
.end method
