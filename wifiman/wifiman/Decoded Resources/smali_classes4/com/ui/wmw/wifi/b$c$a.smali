.class final Lcom/ui/wmw/wifi/b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b$c;->a(Lcom/ui/wmw/api/v1/b$e;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/wifi/b;


# direct methods
.method constructor <init>(Lcom/ui/wmw/wifi/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/wifi/b$c$a;->a:Lcom/ui/wmw/wifi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/wifi/b$c$a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string v0, "Failed to parse WMW scan result"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/wifi/b$c$a;->b(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;)Ljava/util/Set;
    .locals 4

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/ui/wmw/wifi/b$c$a;->a:Lcom/ui/wmw/wifi/b;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    if-eqz v2, :cond_0

    :try_start_0
    invoke-static {v1, v2}, Lcom/ui/wmw/wifi/b;->f(Lcom/ui/wmw/wifi/b;Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)Lcom/ui/wmw/wifi/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Lcom/ui/wmw/wifi/c;

    invoke-direct {v3}, Lcom/ui/wmw/wifi/c;-><init>()V

    invoke-static {v3, v2}, LNf/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method
