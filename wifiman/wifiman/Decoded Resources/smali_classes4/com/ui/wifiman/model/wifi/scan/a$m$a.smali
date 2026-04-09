.class final Lcom/ui/wifiman/model/wifi/scan/a$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/a$m;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wifi/scan/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wifi/scan/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$m$a;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wifi/scan/a$b;

    check-cast p2, Lcom/ui/wifiman/model/vendor/d$a;

    check-cast p3, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/model/wifi/scan/a$m$a;->b(Lcom/ui/wifiman/model/wifi/scan/a$b;Lcom/ui/wifiman/model/vendor/d$a;Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/wifi/scan/a$b;Lcom/ui/wifiman/model/vendor/d$a;Ljava/util/List;)Ll9/a;
    .locals 6

    const-string v0, "connectionProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorDirectory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signals"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/ui/wifiman/model/wifi/scan/a$m$a;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wmw/wifi/a;

    :try_start_0
    invoke-static {v1}, Lcom/ui/wifiman/model/wifi/scan/a;->i(Lcom/ui/wifiman/model/wifi/scan/a;)Loe/a;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;->a()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v3, v2, p2, v4, v5}, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory;->a(Ljava/lang/Object;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Ignoring Wifi Signal"

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static {v3, v2, v5, v4, v5}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
