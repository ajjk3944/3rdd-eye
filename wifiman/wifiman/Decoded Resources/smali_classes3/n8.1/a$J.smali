.class public final Ln8/a$J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Linet/ipaddr/g;

    instance-of v0, p1, Linet/ipaddr/ipv4/b;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v0, :cond_0

    move-object p1, v3

    goto :goto_0

    :cond_0
    instance-of p1, p1, Linet/ipaddr/ipv6/b;

    if-eqz p1, :cond_1

    move-object p1, v2

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    check-cast p2, Linet/ipaddr/g;

    instance-of v0, p2, Linet/ipaddr/ipv4/b;

    if-eqz v0, :cond_2

    move-object v1, v3

    goto :goto_1

    :cond_2
    instance-of p2, p2, Linet/ipaddr/ipv6/b;

    if-eqz p2, :cond_3

    move-object v1, v2

    :cond_3
    :goto_1
    invoke-static {p1, v1}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
