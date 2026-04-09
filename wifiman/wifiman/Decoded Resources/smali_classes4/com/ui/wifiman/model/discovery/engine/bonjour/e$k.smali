.class final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e;-><init>(LZc/f;Landroid/net/wifi/WifiManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Linet/ipaddr/g;)LDj/a;
    .locals 3

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x3e8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k$a;-><init>(Linet/ipaddr/g;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Linet/ipaddr/g;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;->a(Linet/ipaddr/g;)LDj/a;

    move-result-object p1

    return-object p1
.end method
