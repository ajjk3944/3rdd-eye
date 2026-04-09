.class public Linet/ipaddr/j$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/j$g$a;
    }
.end annotation


# instance fields
.field public final a:Linet/ipaddr/j$g$a;

.field public final b:Lbg/d$i$b;


# direct methods
.method public constructor <init>(Linet/ipaddr/j$g$a;)V
    .locals 1

    .line 1
    new-instance v0, Lbg/d$i$b;

    invoke-direct {v0}, Lbg/d$i$b;-><init>()V

    invoke-direct {p0, p1, v0}, Linet/ipaddr/j$g;-><init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/j$g$a;Lbg/d$i$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Linet/ipaddr/j$g;->a:Linet/ipaddr/j$g$a;

    .line 4
    iput-object p2, p0, Linet/ipaddr/j$g;->b:Lbg/d$i$b;

    return-void
.end method
