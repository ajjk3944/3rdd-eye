.class public final LWd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWd/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWd/g$a;
    }
.end annotation


# static fields
.field public static final d:LWd/g$a;


# instance fields
.field private final a:Lfd/b;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LWd/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LWd/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LWd/g;->d:LWd/g$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;Lfd/b;Lcom/ubnt/usurvey/a$b;)V
    .locals 1

    const-string v0, "ssoAccountManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "okHttpClientHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfigurationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LWd/g;->a:Lfd/b;

    invoke-interface {p3}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object p2

    sget-object p3, LWd/g$e;->a:LWd/g$e;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string p3, "distinctUntilChanged(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LWd/g;->b:Lgg/i;

    sget-object p3, LAg/c;->a:LAg/c;

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->c()Lgg/i;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    sget-object p2, LWd/g$b;->a:LWd/g$b;

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, LWd/g$c;

    invoke-direct {p2, p0}, LWd/g$c;-><init>(LWd/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, LWd/g$d;

    invoke-direct {p2, p0}, LWd/g$d;-><init>(LWd/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LWd/g;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic a(LWd/g;Ljava/lang/String;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LWd/g;->b(Ljava/lang/String;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;)Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/firmware/b;

    iget-object v1, p0, LWd/g;->a:Lfd/b;

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;-><init>(Lfd/b;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public getClient()Lgg/i;
    .locals 1

    iget-object v0, p0, LWd/g;->c:Lgg/i;

    return-object v0
.end method
