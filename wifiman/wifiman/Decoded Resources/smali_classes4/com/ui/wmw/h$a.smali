.class final Lcom/ui/wmw/h$a;
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
.field public static final a:Lcom/ui/wmw/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wmw/h$a;

    invoke-direct {v0}, Lcom/ui/wmw/h$a;-><init>()V

    sput-object v0, Lcom/ui/wmw/h$a;->a:Lcom/ui/wmw/h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/ApiVersion;)V
    .locals 5

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/api/ApiVersion;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1.0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedApiLevel;

    invoke-virtual {p1}, Lcom/ui/wmw/api/ApiVersion;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    invoke-direct {v0, p1}, Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedApiLevel;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/ui/wmw/api/ApiVersion;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    const-string v3, "0.2.0"

    invoke-virtual {v0, v3}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wmw/api/ApiVersion;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/ui/common/semver/SemVer$a;->b(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v3, v0}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result v0

    if-gtz v0, :cond_2

    return-void

    :cond_2
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedFirmwareVersion;

    invoke-virtual {p1}, Lcom/ui/wmw/api/ApiVersion;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedFirmwareVersion;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-virtual {p1}, Lcom/ui/wmw/api/ApiVersion;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Firware version in incompatible format: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_4
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    const-string v0, "Firmare version not available"

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/ApiVersion;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/h$a;->a(Lcom/ui/wmw/api/ApiVersion;)V

    return-void
.end method
