.class public final synthetic Linet/ipaddr/ipv6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv6/Q;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv6/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv6/g;->a:Linet/ipaddr/ipv6/Q;

    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/g;->a:Linet/ipaddr/ipv6/Q;

    invoke-static {v0, p1}, Linet/ipaddr/ipv6/Q;->M2(Linet/ipaddr/ipv6/Q;I)I

    move-result p1

    return p1
.end method
