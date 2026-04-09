.class final Lcom/ui/wifiman/model/wmw/h$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->x(Lcom/ui/wifiman/model/wmw/g$b;J)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$b;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$r;->a:Lcom/ui/wifiman/model/wmw/h;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$r;->b:Lcom/ui/wifiman/model/wmw/g$b;

    iput-wide p3, p0, Lcom/ui/wifiman/model/wmw/h$r;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LMf/a;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/wmw/h$r;->c(LMf/a;)V

    return-void
.end method

.method private static final c(LMf/a;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, LMf/a;->b()Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v0, "Failed to close FW file"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p0, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMf/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$r;->b(LMf/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LMf/a;)LDj/a;
    .locals 11

    const-string v0, "fw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$r;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/h;->m(Lcom/ui/wifiman/model/wmw/h;)Lcom/ui/wifiman/model/wmw/WifimanWizard;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$r$a;->a:Lcom/ui/wifiman/model/wmw/h$r$a;

    invoke-virtual {v0, v1}, Lgg/i;->M1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$r$b;->a:Lcom/ui/wifiman/model/wmw/h$r$b;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$r$c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/wmw/h$r$c;-><init>(LMf/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/h$r$d;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/h$r;->b:Lcom/ui/wifiman/model/wmw/g$b;

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/h$r;->c:J

    invoke-direct {v1, v2, v3, v4}, Lcom/ui/wifiman/model/wmw/h$r$d;-><init>(Lcom/ui/wifiman/model/wmw/g$b;J)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/wmw/i;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/wmw/i;-><init>(LMf/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object v0

    new-instance v10, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$r;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object v2

    iget-wide v3, p0, Lcom/ui/wifiman/model/wmw/h$r;->c:J

    invoke-virtual {p1}, LMf/a;->a()J

    move-result-wide v5

    sget-object p1, Lcom/ui/wifiman/model/wmw/h$b;->UPLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/ui/wifiman/model/wmw/h$b;->mapStageProgressToTotalProgress(F)F

    move-result v9

    const-wide/16 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/model/wmw/g$c$b$d;-><init>(Lcom/ui/common/semver/SemVer;JJJF)V

    invoke-virtual {v0, v10}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
