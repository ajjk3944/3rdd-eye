.class final LTd/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTd/d;-><init>(Ljava/lang/String;LTd/a$a;LUd/a;Lxa/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTd/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTd/d$f;

    invoke-direct {v0}, LTd/d$f;-><init>()V

    sput-object v0, LTd/d$f;->a:LTd/d$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LVd/b;
    .locals 3

    const-string v0, "apiSiteFeatures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, LVd/b;

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature$a;->SPEED_TEST:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature$a;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;->b()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p1, v0}, LVd/b;-><init>(Z)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LTd/d$f;->a(Ljava/util/List;)LVd/b;

    move-result-object p1

    return-object p1
.end method
