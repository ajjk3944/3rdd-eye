.class public final Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/uisp/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$a;,
        Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$Error;,
        Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$b;
    }
.end annotation


# static fields
.field public static final e:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$a;


# instance fields
.field private final a:LZc/f;

.field private final b:Lfd/b;

.field private final c:Lgg/z;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->e:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lfd/b;)V
    .locals 1

    const-string v0, "networkConnectionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedOkHttpClientHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->a:LZc/f;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->b:Lfd/b;

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$f;

    invoke-direct {p1, p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$f;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->c:Lgg/z;

    sget-object p1, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$c;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$c;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$e;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$e;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->d:Lgg/i;

    return-void
.end method

.method public static final synthetic b(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)LZc/f;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->a:LZc/f;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;)Lfd/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->b:Lfd/b;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;LZc/e;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->f(LZc/e;)Z

    move-result p0

    return p0
.end method

.method private final f(LZc/e;)Z
    .locals 3

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_2

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, LZc/e;->c()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :cond_3
    :goto_1
    return v1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->d:Lgg/i;

    return-object v0
.end method

.method public final e()Lgg/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispControllerDiscoveryImpl;->c:Lgg/z;

    return-object v0
.end method
