.class final Lcom/ui/wifiman/model/wmw/h$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->b(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$x;->a:Lcom/ui/wifiman/model/wmw/h;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$x;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LDj/a;
    .locals 7

    const-string v0, "startedAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$x;->a:Lcom/ui/wifiman/model/wmw/h;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$x;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/ui/wifiman/model/wmw/h;->q(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$x;->a:Lcom/ui/wifiman/model/wmw/h;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$x;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lcom/ui/wifiman/model/wmw/h;->r(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$x;->a:Lcom/ui/wifiman/model/wmw/h;

    iget-object v3, p0, Lcom/ui/wifiman/model/wmw/h$x;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lcom/ui/wifiman/model/wmw/h;->s(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Lcom/ui/wifiman/model/wmw/h$x;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v5

    new-instance v6, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;

    invoke-direct {v6, v5, v3, v4}, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;-><init>(Lcom/ui/common/semver/SemVer;J)V

    invoke-static {v6}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [LDj/a;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$x$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$x;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {v1, p1, v2}, Lcom/ui/wifiman/model/wmw/h$x$a;-><init>(Ljava/lang/Long;Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-virtual {v0, v1}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$x;->a(Ljava/lang/Long;)LDj/a;

    move-result-object p1

    return-object p1
.end method
