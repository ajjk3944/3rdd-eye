.class public final synthetic Linet/ipaddr/ipv4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/j$e;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/I;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/y;->a:Linet/ipaddr/ipv4/I;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv4/y;->a:Linet/ipaddr/ipv4/I;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1, p2}, Linet/ipaddr/ipv4/I;->Z2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;I)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method
