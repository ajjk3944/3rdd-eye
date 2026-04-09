.class final Ld8/b$a;
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
.field public static final a:Ld8/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld8/b$a;

    invoke-direct {v0}, Ld8/b$a;-><init>()V

    sput-object v0, Ld8/b$a;->a:Ld8/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLd/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LLd/e;->d()Lcom/ui/wifiman/model/ubiquiti/console/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/console/b;->a()Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ld8/b$a;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
