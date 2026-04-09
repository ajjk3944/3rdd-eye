.class Linet/ipaddr/format/validate/r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field protected a:Linet/ipaddr/g;

.field protected b:Linet/ipaddr/g;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p1}, Linet/ipaddr/format/validate/r$d;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;)V

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/g;Linet/ipaddr/g;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    .line 5
    iput-object p2, p0, Linet/ipaddr/format/validate/r$d;->b:Linet/ipaddr/g;

    return-void
.end method


# virtual methods
.method public a()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    return-object v0
.end method
