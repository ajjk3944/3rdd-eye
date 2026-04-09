.class public final synthetic Linet/ipaddr/ipv4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Linet/ipaddr/ipv4/i;->a:I

    iput-object p2, p0, Linet/ipaddr/ipv4/i;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 2

    iget v0, p0, Linet/ipaddr/ipv4/i;->a:I

    iget-object v1, p0, Linet/ipaddr/ipv4/i;->b:Ljava/lang/Integer;

    check-cast p1, Linet/ipaddr/ipv4/b;

    invoke-static {v0, v1, p1}, Linet/ipaddr/ipv4/I;->c3(ILjava/lang/Integer;Linet/ipaddr/ipv4/b;)J

    move-result-wide v0

    return-wide v0
.end method
