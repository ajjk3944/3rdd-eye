.class public final Lxd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

.field private final b:Lkd/d;

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;Lkd/d;Lje/u;)V
    .locals 1

    const-string v0, "uispController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publicIPService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiConnectionService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    iput-object p2, p0, Lxd/g;->b:Lkd/d;

    invoke-interface {p3}, Lje/u;->a()Lgg/i;

    move-result-object p1

    sget-object p2, Lxd/g$e;->a:Lxd/g$e;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxd/g;->c:Lgg/i;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)Lxd/g$a;
    .locals 0

    invoke-static {p0}, Lxd/g;->f(Ljava/lang/Throwable;)Lxd/g$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lxd/g;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lxd/g;->d(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lxd/g;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;
    .locals 0

    iget-object p0, p0, Lxd/g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    return-object p0
.end method

.method private final d(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
    .locals 4

    iget-object v0, p0, Lxd/g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lxd/g;->b:Lkd/d;

    invoke-interface {v1}, Lkd/d;->a()Lgg/i;

    move-result-object v1

    iget-object v2, p0, Lxd/g;->c:Lgg/i;

    new-instance v3, Lxd/g$b;

    invoke-direct {v3, p1}, Lxd/g$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-static {v0, v1, v2, v3}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    const-string v0, "firstOrError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final f(Ljava/lang/Throwable;)Lxd/g$a;
    .locals 3

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "UISP Controller speedtest report failed"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v0, Lxd/g$a$a$a;

    invoke-direct {v0, p0}, Lxd/g$a$a$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public e(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxd/g;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lxd/g$c;

    invoke-direct {v1, p0, p1}, Lxd/g$c;-><init>(Lxd/g;Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lxd/f;

    invoke-direct {v0}, Lxd/f;-><init>()V

    invoke-virtual {p1, v0}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lxd/g$d;->a:Lxd/g$d;

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string v0, "doOnSubscribe(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
