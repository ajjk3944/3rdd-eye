.class public final synthetic Linet/ipaddr/ipv4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/d$d;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/I;

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/j;->a:Linet/ipaddr/ipv4/I;

    iput-object p2, p0, Linet/ipaddr/ipv4/j;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv4/j;->a:Linet/ipaddr/ipv4/I;

    iget-object v1, p0, Linet/ipaddr/ipv4/j;->b:Ljava/lang/Integer;

    check-cast p3, Linet/ipaddr/ipv4/b;

    invoke-static {v0, v1, p1, p2, p3}, Linet/ipaddr/ipv4/I;->J2(Linet/ipaddr/ipv4/I;Ljava/lang/Integer;ZZLinet/ipaddr/ipv4/b;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
