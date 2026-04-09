.class final Lcom/ui/wifiman/model/wmw/h$e$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$e$a;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/g$b;

.field final synthetic b:Lcom/ui/common/semver/SemVer;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/g$b;Lcom/ui/common/semver/SemVer;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$e$a$b;->a:Lcom/ui/wifiman/model/wmw/g$b;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$e$a$b;->b:Lcom/ui/common/semver/SemVer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;Ll9/a;)Lcom/ui/wifiman/model/wmw/g$a;
    .locals 2

    const-string v0, "upgradeAlwaysRecommended"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/common/semver/SemVer;

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$e$a$b;->a:Lcom/ui/wifiman/model/wmw/g$b;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/h$e$a$b;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$e$a$b;->b:Lcom/ui/common/semver/SemVer;

    invoke-virtual {p1, v0}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result p1

    if-lez p1, :cond_1

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/wmw/g$a$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$e$a$b;->a:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-direct {p1, v0, p2}, Lcom/ui/wifiman/model/wmw/g$a$a;-><init>(Lcom/ui/wifiman/model/wmw/g$b;Z)V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/ui/wifiman/model/wmw/g$a$b;->a:Lcom/ui/wifiman/model/wmw/g$a$b;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/wmw/h$e$a$b;->a(Ljava/lang/Boolean;Ll9/a;)Lcom/ui/wifiman/model/wmw/g$a;

    move-result-object p1

    return-object p1
.end method
