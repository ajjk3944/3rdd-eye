.class public final synthetic Linet/ipaddr/ipv4/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/e$a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/e$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/N;->a:Linet/ipaddr/ipv4/e$a;

    iput p2, p0, Linet/ipaddr/ipv4/N;->b:I

    iput p3, p0, Linet/ipaddr/ipv4/N;->c:I

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Linet/ipaddr/ipv4/N;->a:Linet/ipaddr/ipv4/e$a;

    iget v1, p0, Linet/ipaddr/ipv4/N;->b:I

    iget v2, p0, Linet/ipaddr/ipv4/N;->c:I

    check-cast p1, Linet/ipaddr/m$d;

    invoke-static {v0, v1, v2, p1}, Linet/ipaddr/ipv4/Y;->i1(Linet/ipaddr/ipv4/e$a;IILinet/ipaddr/m$d;)Z

    move-result p1

    return p1
.end method
