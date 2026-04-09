.class final Lcom/ui/wifiman/model/wifi/scan/a$l;
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
.field public static final a:Lcom/ui/wifiman/model/wifi/scan/a$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/a$l;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wifi/scan/a$l;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wifi/scan/a$l;->a:Lcom/ui/wifiman/model/wifi/scan/a$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Lcom/ui/wifiman/model/wifi/scan/a$b;
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lje/r$b$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Lje/r$b$a;

    invoke-virtual {v0}, Lje/r$b$a;->i()Lke/c;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lke/c;->b()Ljava/lang/String;

    move-result-object v1

    :cond_0
    instance-of v2, v0, Lje/r$b$a$b;

    if-eqz v2, :cond_2

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v0

    check-cast p1, Lje/r$b$a$b;

    invoke-virtual {p1}, Lje/r$b$a$b;->c()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v2, Lke/a$a$a$a;->a:Lke/a$a$a$a;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {v0}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, v0, Lje/r$b$a$a;

    if-eqz v0, :cond_7

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v0

    check-cast p1, Lje/r$b$a$a;

    invoke-virtual {p1}, Lje/r$b$a$a;->c()Lh9/a;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v3, Lke/a$a$b;->a:Lke/a$a$b;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lke/a;

    :cond_3
    invoke-virtual {p1}, Lje/r$b$a$a;->q()Lje/q;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lje/q;->e()Lh9/a;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lje/r$b$a$a;->q()Lje/q;

    move-result-object v3

    invoke-virtual {v3}, Lje/q;->i()Lke/a;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lke/a;

    :cond_4
    invoke-virtual {p1}, Lje/r$b$a$a;->r()Lje/q;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lje/q;->e()Lh9/a;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lje/r$b$a$a;->r()Lje/q;

    move-result-object v3

    invoke-virtual {v3}, Lje/q;->i()Lke/a;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lke/a;

    :cond_5
    invoke-virtual {p1}, Lje/r$b$a$a;->s()Lje/q;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lje/q;->e()Lh9/a;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Lje/r$b$a$a;->s()Lje/q;

    move-result-object p1

    invoke-virtual {p1}, Lje/q;->i()Lke/a;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-static {v0}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    :goto_0
    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/a$b;

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    instance-of v0, p1, Lje/r$b$b;

    if-nez v0, :cond_a

    instance-of p1, p1, Lje/r$a;

    if-eqz p1, :cond_9

    goto :goto_1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_1
    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/a$b;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/model/wifi/scan/a$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    :goto_2
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$l;->a(Lje/r;)Lcom/ui/wifiman/model/wifi/scan/a$b;

    move-result-object p1

    return-object p1
.end method
