.class final Lcom/ui/wifiman/model/wifi/scan/a$f;
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/wifi/scan/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/a$f;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wifi/scan/a$f;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wifi/scan/a$f;->a:Lcom/ui/wifiman/model/wifi/scan/a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ll9/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lle/f;

    invoke-virtual {v2}, Lle/f;->e()Lle/i;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lle/i;->m()Lke/a;

    move-result-object v1

    :cond_1
    instance-of v1, v1, Lke/a$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    :cond_2
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$f;->a(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
