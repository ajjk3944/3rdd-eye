.class final Lcom/ui/wifiman/model/wmw/h$e;
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


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$e;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/common/semver/SemVer;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$e;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/h;->n(Lcom/ui/wifiman/model/wmw/h;)Lse/a;

    move-result-object v0

    invoke-interface {v0}, Lse/a;->a()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$e$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$e;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/wmw/h$e$a;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/common/semver/SemVer;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ui/wifiman/model/wmw/g$a$c;->a:Lcom/ui/wifiman/model/wmw/g$a$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$e;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
