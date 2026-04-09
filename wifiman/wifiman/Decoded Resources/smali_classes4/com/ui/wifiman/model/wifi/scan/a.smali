.class public final Lcom/ui/wifiman/model/wifi/scan/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lle/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wifi/scan/a$a;,
        Lcom/ui/wifiman/model/wifi/scan/a$b;
    }
.end annotation


# static fields
.field public static final l:Lcom/ui/wifiman/model/wifi/scan/a$a;


# instance fields
.field private final a:Lme/F;

.field private final b:Loe/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wifi/scan/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/wifi/scan/a;->l:Lcom/ui/wifiman/model/wifi/scan/a$a;

    return-void
.end method

.method public constructor <init>(Lme/f;Lje/B;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lme/F;Loe/a;Lfe/u;)V
    .locals 3

    const-string v0, "wifiScanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiConnectionService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifimanWizard"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalFactoryAndroid"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalFactoryWizard"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Lcom/ui/wifiman/model/wifi/scan/a;->a:Lme/F;

    iput-object p6, p0, Lcom/ui/wifiman/model/wifi/scan/a;->b:Loe/a;

    invoke-interface {p4}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object p4

    sget-object p5, Lcom/ui/wifiman/model/wifi/scan/a$e;->a:Lcom/ui/wifiman/model/wifi/scan/a$e;

    invoke-virtual {p4, p5}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p4

    const/4 p5, 0x1

    invoke-virtual {p4, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p4

    invoke-virtual {p4}, Ljg/a;->i2()Lgg/i;

    move-result-object p4

    const-string p6, "refCount(...)"

    invoke-static {p4, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/ui/wifiman/model/wifi/scan/a;->c:Lgg/i;

    invoke-virtual {p2}, Lje/B;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wifi/scan/a$l;->a:Lcom/ui/wifiman/model/wifi/scan/a$l;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->d:Lgg/i;

    new-instance v1, Lcom/ui/wifiman/model/wifi/scan/a$m;

    invoke-direct {v1, p0, p3}, Lcom/ui/wifiman/model/wifi/scan/a$m;-><init>(Lcom/ui/wifiman/model/wifi/scan/a;Lcom/ui/wifiman/model/vendor/d$b;)V

    invoke-virtual {p4, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wifi/scan/a$n;

    invoke-direct {v2, p7}, Lcom/ui/wifiman/model/wifi/scan/a$n;-><init>(Lfe/u;)V

    invoke-virtual {v1, v2}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p7

    invoke-virtual {p7}, Lgg/i;->W()Lgg/i;

    move-result-object p7

    sget-object v1, Lcom/ui/wifiman/model/wifi/scan/a$o;->a:Lcom/ui/wifiman/model/wifi/scan/a$o;

    invoke-virtual {p7, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p7

    invoke-virtual {p7, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p7

    invoke-virtual {p7}, Ljg/a;->i2()Lgg/i;

    move-result-object p7

    invoke-static {p7, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p7, p0, Lcom/ui/wifiman/model/wifi/scan/a;->e:Lgg/i;

    sget-object v1, LAg/c;->a:LAg/c;

    invoke-interface {p1}, Lme/f;->a()Lgg/i;

    move-result-object p1

    invoke-interface {p3}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object p3

    invoke-virtual {p3}, Lgg/z;->W()Lgg/i;

    move-result-object p3

    const-string v2, "toFlowable(...)"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, p1, p3}, LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance p3, Lcom/ui/wifiman/model/wifi/scan/a$c;

    invoke-direct {p3, p0}, Lcom/ui/wifiman/model/wifi/scan/a$c;-><init>(Lcom/ui/wifiman/model/wifi/scan/a;)V

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/wifi/scan/a$d;->a:Lcom/ui/wifiman/model/wifi/scan/a$d;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a;->f:Lgg/i;

    new-instance p1, Lcom/ui/wifiman/model/wifi/scan/a$i;

    invoke-direct {p1, p0}, Lcom/ui/wifiman/model/wifi/scan/a$i;-><init>(Lcom/ui/wifiman/model/wifi/scan/a;)V

    invoke-virtual {p7, p1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a;->g:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wifi/scan/a;->a()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/wifi/scan/a$g;->a:Lcom/ui/wifiman/model/wifi/scan/a$g;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/wifi/scan/a$h;->a:Lcom/ui/wifiman/model/wifi/scan/a$h;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a;->h:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wifi/scan/a;->a()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/wifi/scan/a$j;->a:Lcom/ui/wifiman/model/wifi/scan/a$j;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a;->i:Lgg/i;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/wifi/scan/a;->e()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/wifi/scan/a$f;->a:Lcom/ui/wifiman/model/wifi/scan/a$f;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a;->j:Lgg/i;

    new-instance p1, Lcom/ui/wifiman/model/wifi/scan/a$k;

    invoke-direct {p1, p2}, Lcom/ui/wifiman/model/wifi/scan/a$k;-><init>(Lje/B;)V

    invoke-virtual {p4, p1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p5}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a;->k:Lgg/i;

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/wifi/scan/a;Lcom/ui/wifiman/model/wifi/scan/a$b;Ljava/util/List;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/wifi/scan/a;->k(Lcom/ui/wifiman/model/wifi/scan/a$b;Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/wifi/scan/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/wifi/scan/a;)Lme/F;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->a:Lme/F;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/wifi/scan/a;)Loe/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->b:Loe/a;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/wifi/scan/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->d:Lgg/i;

    return-object p0
.end method

.method private final k(Lcom/ui/wifiman/model/wifi/scan/a$b;Ljava/util/List;)Ljava/util/Map;
    .locals 4

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lme/k;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;->a()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2}, Lme/k;->b()Lh9/a;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lme/k;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lme/k;->a()Ljava/util/Set;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;->a()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh9/a;

    sget-object v2, Lke/a$a$b;->a:Lke/a$a$b;

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {p2}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->g:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->i:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->k:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->j:Lgg/i;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a;->h:Lgg/i;

    return-object v0
.end method
