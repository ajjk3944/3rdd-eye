.class public final synthetic Linet/ipaddr/format/validate/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/a$a;


# instance fields
.field public final synthetic a:[Linet/ipaddr/ipv6/V;


# direct methods
.method public synthetic constructor <init>([Linet/ipaddr/ipv6/V;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/format/validate/k;->a:[Linet/ipaddr/ipv6/V;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/k;->a:[Linet/ipaddr/ipv6/V;

    invoke-static {v0, p1}, Linet/ipaddr/format/validate/r;->B1([Linet/ipaddr/ipv6/V;I)I

    move-result p1

    return p1
.end method
