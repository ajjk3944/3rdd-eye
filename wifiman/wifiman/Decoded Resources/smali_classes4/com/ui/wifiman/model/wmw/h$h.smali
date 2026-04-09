.class final Lcom/ui/wifiman/model/wmw/h$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lcc/b;LWd/f;Lse/a;LP7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/h$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$h;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/h$h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$h;->a:Lcom/ui/wifiman/model/wmw/h$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcc/a;)Ll9/a;
    .locals 1

    const-string v0, "adoption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcc/a;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {v0, p1}, Lcom/ui/common/semver/SemVer$a;->b(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Ll9/a;

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcc/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$h;->a(Lcc/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
