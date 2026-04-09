.class public final synthetic Linet/ipaddr/ipv4/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lag/b$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Linet/ipaddr/ipv4/e$a;

.field public final synthetic c:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(ILinet/ipaddr/ipv4/e$a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Linet/ipaddr/ipv4/K;->a:I

    iput-object p2, p0, Linet/ipaddr/ipv4/K;->b:Linet/ipaddr/ipv4/e$a;

    iput-object p3, p0, Linet/ipaddr/ipv4/K;->c:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(ZZII)Ljava/util/Iterator;
    .locals 7

    iget v0, p0, Linet/ipaddr/ipv4/K;->a:I

    iget-object v1, p0, Linet/ipaddr/ipv4/K;->b:Linet/ipaddr/ipv4/e$a;

    iget-object v2, p0, Linet/ipaddr/ipv4/K;->c:Ljava/lang/Integer;

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v0 .. v6}, Linet/ipaddr/ipv4/M;->Z2(ILinet/ipaddr/ipv4/e$a;Ljava/lang/Integer;ZZII)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
