.class final Lcom/ui/wmw/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/h;->e()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wmw/h$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/h$c;

    invoke-direct {v0}, Lcom/ui/wmw/h$c;-><init>()V

    sput-object v0, Lcom/ui/wmw/h$c;->a:Lcom/ui/wmw/h$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wmw/k;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/h$c;->e(Lcom/ui/wmw/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wmw/k;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wmw/h$c;->d(Lcom/ui/wmw/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/ui/wmw/k;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/ui/wmw/k;->h()LKf/e;

    move-result-object v0

    invoke-virtual {v0}, LKf/e;->j()Lcom/ui/wmw/api/v1/ApiV1Device;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1Device;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ui/wmw/k;->h()LKf/e;

    move-result-object v1

    invoke-virtual {v1}, LKf/e;->l()Lcom/ui/wmw/api/v1/ApiV1Firmware;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wmw/api/v1/ApiV1Firmware;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ui/wmw/k;->h()LKf/e;

    move-result-object p0

    invoke-virtual {p0}, LKf/e;->q()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a()Ljava/lang/Integer;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WMW Session initialized - MAC: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", FW: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", battery: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "%"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/ui/wmw/k;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wmw/k;->h()LKf/e;

    move-result-object p0

    invoke-virtual {p0}, LKf/e;->l()Lcom/ui/wmw/api/v1/ApiV1Firmware;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WMW Session FW state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/k;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/h$c;->c(Lcom/ui/wmw/k;)V

    return-void
.end method

.method public final c(Lcom/ui/wmw/k;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/i;

    invoke-direct {v0, p1}, Lcom/ui/wmw/i;-><init>(Lcom/ui/wmw/k;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    new-instance v0, Lcom/ui/wmw/j;

    invoke-direct {v0, p1}, Lcom/ui/wmw/j;-><init>(Lcom/ui/wmw/k;)V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method
