.class final Lcom/ui/wifiman/model/wifi/scan/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/a;-><init>(Lme/f;Lje/B;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lme/F;Loe/a;Lfe/u;)V
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$c;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)Ljava/util/List;
    .locals 9

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wifi/scan/a$b;

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "component3(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/vendor/d$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/wifi/scan/a$c;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-static {v2, v0, v1}, Lcom/ui/wifiman/model/wifi/scan/a;->f(Lcom/ui/wifiman/model/wifi/scan/a;Lcom/ui/wifiman/model/wifi/scan/a$b;Ljava/util/List;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v4, p0, Lcom/ui/wifiman/model/wifi/scan/a$c;->a:Lcom/ui/wifiman/model/wifi/scan/a;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lme/k;

    :try_start_0
    invoke-static {v4}, Lcom/ui/wifiman/model/wifi/scan/a;->h(Lcom/ui/wifiman/model/wifi/scan/a;)Lme/F;

    move-result-object v6

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wifi/scan/a$b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v5, p1, v7, v2}, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory;->a(Ljava/lang/Object;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v6, "Ignoring Wifi Signal"

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static {v6, v5, v8, v7, v8}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$c;->a(LYg/y;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
