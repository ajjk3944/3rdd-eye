.class public final Lcom/ui/wifiman/model/ubiquiti/console/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/console/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/g$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/ui/wifiman/model/ubiquiti/console/g$a;


# instance fields
.field private final a:Lcb/c;

.field private final b:Lxa/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/g;->c:Lcom/ui/wifiman/model/ubiquiti/console/g$a;

    return-void
.end method

.method public constructor <init>(Lcb/c;Lxa/o;)V
    .locals 1

    const-string v0, "unifiCore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/g;->a:Lcb/c;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/g;->b:Lxa/o;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/g;->g(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/g;->h(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/ubiquiti/console/g;)Lxa/o;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/g;->b:Lxa/o;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/ubiquiti/console/g;Ljava/lang/String;Leb/g;LTd/a$a;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wifiman/model/ubiquiti/console/g;->i(Ljava/lang/String;Leb/g;LTd/a$a;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WebRTC Console["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] connection finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "UnifiConsoleConnectionService"

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final h(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Direct Console["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] connection finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "UnifiConsoleConnectionService"

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final i(Ljava/lang/String;Leb/g;LTd/a$a;)Lgg/z;
    .locals 1

    sget-object v0, Lmb/j;->NETWORK:Lmb/j;

    invoke-interface {p2, v0}, Leb/g;->a(Lmb/j;)Lgg/z;

    move-result-object p2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/g$h;

    invoke-direct {v0, p1, p3, p0}, Lcom/ui/wifiman/model/ubiquiti/console/g$h;-><init>(Ljava/lang/String;LTd/a$a;Lcom/ui/wifiman/model/ubiquiti/console/g;)V

    invoke-virtual {p2, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Linet/ipaddr/g;Lh9/a;Ljava/lang/String;Ljava/util/Set;)Lgg/i;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ip"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ncaToken"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trustedCerts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/g;->a:Lcb/c;

    invoke-virtual {p2}, Linet/ipaddr/g;->r0()Ljava/lang/String;

    move-result-object p2

    const-string v1, "toFullString(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ":"

    invoke-virtual {p3, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3, p4}, Lcb/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Leb/g;

    move-result-object p2

    check-cast p5, Ljava/util/Collection;

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/security/cert/Certificate;

    invoke-interface {p5, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/security/cert/Certificate;

    invoke-interface {p2, p3}, Leb/g;->c([Ljava/security/cert/Certificate;)V

    invoke-interface {p2}, Leb/g;->connect()Lgg/i;

    move-result-object p2

    new-instance p3, Lcom/ui/wifiman/model/ubiquiti/console/g$b;

    invoke-direct {p3, p1}, Lcom/ui/wifiman/model/ubiquiti/console/g$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p2

    new-instance p3, LQd/l;

    invoke-direct {p3, p1}, LQd/l;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p2

    new-instance p3, Lcom/ui/wifiman/model/ubiquiti/console/g$c;

    invoke-direct {p3, p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/g$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/g;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/console/g$d;->a:Lcom/ui/wifiman/model/ubiquiti/console/g$d;

    invoke-virtual {p1, p2}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "onErrorResumeNext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lgg/i;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/g;->a:Lcb/c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcb/c;->h(Lcb/c;Ljava/lang/String;ZLeb/g$b;ILjava/lang/Object;)Leb/g;

    move-result-object v0

    invoke-interface {v0}, Leb/g;->connect()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/g$e;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/g$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, LQd/k;

    invoke-direct {v1, p1}, LQd/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/g$f;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/g$f;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/g;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/g$g;->a:Lcom/ui/wifiman/model/ubiquiti/console/g$g;

    invoke-virtual {p1, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
