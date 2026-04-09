.class public final synthetic Linet/ipaddr/ipv4/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b$b;


# instance fields
.field public final synthetic a:Linet/ipaddr/ipv4/e$a;

.field public final synthetic b:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Linet/ipaddr/ipv4/L;->a:Linet/ipaddr/ipv4/e$a;

    iput-object p2, p0, Linet/ipaddr/ipv4/L;->b:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(II)LZf/d;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv4/L;->a:Linet/ipaddr/ipv4/e$a;

    iget-object v1, p0, Linet/ipaddr/ipv4/L;->b:Ljava/lang/Integer;

    invoke-static {v0, v1, p1, p2}, Linet/ipaddr/ipv4/M;->a3(Linet/ipaddr/ipv4/e$a;Ljava/lang/Integer;II)Linet/ipaddr/ipv4/M;

    move-result-object p1

    return-object p1
.end method
