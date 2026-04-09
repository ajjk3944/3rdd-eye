.class final Ld8/b$c;
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
.field public static final a:Ld8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld8/b$c;

    invoke-direct {v0}, Ld8/b$c;-><init>()V

    sput-object v0, Ld8/b$c;->a:Ld8/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/a$b;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lre/a$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lre/a$b$a;

    invoke-virtual {p1}, Lre/a$b$a;->a()Lre/c;

    move-result-object v0

    invoke-interface {v0}, Lre/c;->e()Lgg/b;

    move-result-object v0

    invoke-virtual {p1}, Lre/a$b$a;->b()Lre/n;

    move-result-object p1

    invoke-interface {p1}, Lre/n;->c()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lre/a$b$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/a$b;

    invoke-virtual {p0, p1}, Ld8/b$c;->a(Lre/a$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
