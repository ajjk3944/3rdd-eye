.class final Ld8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/b;-><init>(Lld/b;Lje/C;Lne/a$a;Lie/f;Lwc/b$a;LDc/e;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;Lkd/d;Lrd/a;Ljd/b;LBc/a;Lrc/b;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/WifimanWizard;LO8/a;LP8/f;Lre/a;LLd/f;LOd/a$a;Lcom/ubnt/usurvey/product/p;Lxa/o;LCc/n;Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;Lhd/a$c;LFd/C;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LSd/d;LFd/D;Lpc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ld8/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld8/b$b;

    invoke-direct {v0}, Ld8/b$b;-><init>()V

    sput-object v0, Ld8/b$b;->a:Ld8/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTd/a;

    const-string/jumbo v0, "complete(...)"

    if-eqz p1, :cond_0

    invoke-interface {p1}, LTd/a;->a()Lgg/i;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lgg/i;->E0()Lgg/b;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, LTd/a;->e()Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [Lgg/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ld8/b$b;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
