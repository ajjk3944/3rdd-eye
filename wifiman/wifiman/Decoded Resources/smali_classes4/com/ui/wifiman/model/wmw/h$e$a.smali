.class final Lcom/ui/wifiman/model/wmw/h$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$e;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;

.field final synthetic b:Lcom/ui/common/semver/SemVer;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/common/semver/SemVer;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$e$a;->a:Lcom/ui/wifiman/model/wmw/h;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$e$a;->b:Lcom/ui/common/semver/SemVer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$b;

    sget-object v0, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$e$a$a;->a:Lcom/ui/wifiman/model/wmw/h$e$a$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$e$a;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v1}, Lcom/ui/wifiman/model/wmw/h;->l(Lcom/ui/wifiman/model/wmw/h;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wmw/h$e$a$b;

    iget-object v3, p0, Lcom/ui/wifiman/model/wmw/h$e$a;->b:Lcom/ui/common/semver/SemVer;

    invoke-direct {v2, p1, v3}, Lcom/ui/wifiman/model/wmw/h$e$a$b;-><init>(Lcom/ui/wifiman/model/wmw/g$b;Lcom/ui/common/semver/SemVer;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$e$a;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
