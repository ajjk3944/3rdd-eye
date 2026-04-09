.class public Linet/ipaddr/ipv6/Q$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/Q$c$b;,
        Linet/ipaddr/ipv6/Q$c$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Linet/ipaddr/ipv6/Q$c$a;

.field public final c:Linet/ipaddr/ipv6/Q$c$b;


# direct methods
.method public constructor <init>(ZLinet/ipaddr/ipv6/Q$c$a;)V
    .locals 1

    .line 1
    sget-object v0, Linet/ipaddr/ipv6/Q$c$b;->YES:Linet/ipaddr/ipv6/Q$c$b;

    invoke-direct {p0, p1, p2, v0}, Linet/ipaddr/ipv6/Q$c;-><init>(ZLinet/ipaddr/ipv6/Q$c$a;Linet/ipaddr/ipv6/Q$c$b;)V

    return-void
.end method

.method public constructor <init>(ZLinet/ipaddr/ipv6/Q$c$a;Linet/ipaddr/ipv6/Q$c$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Linet/ipaddr/ipv6/Q$c;->a:Z

    .line 4
    iput-object p2, p0, Linet/ipaddr/ipv6/Q$c;->b:Linet/ipaddr/ipv6/Q$c$a;

    if-nez p3, :cond_0

    .line 5
    sget-object p3, Linet/ipaddr/ipv6/Q$c$b;->YES:Linet/ipaddr/ipv6/Q$c$b;

    :cond_0
    iput-object p3, p0, Linet/ipaddr/ipv6/Q$c;->c:Linet/ipaddr/ipv6/Q$c$b;

    return-void
.end method
