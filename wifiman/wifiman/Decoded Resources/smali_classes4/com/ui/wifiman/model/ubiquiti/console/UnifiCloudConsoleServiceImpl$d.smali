.class final Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;-><init>(LLd/f;LQd/e;LZc/f;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;Ljava/util/List;)Ljava/util/List;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "cloudConsolesFetch"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "persistentCloudConsoles"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, LWc/b$c;

    if-nez v2, :cond_3

    instance-of v2, v0, LWc/b$b;

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    instance-of v2, v0, LWc/b$a$a;

    if-eqz v2, :cond_1

    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/console/e;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v18, 0x3fbf

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v3 .. v19}, Lcom/ui/wifiman/model/ubiquiti/console/e;->b(Lcom/ui/wifiman/model/ubiquiti/console/e;Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;ILjava/lang/Object;)Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v1, v0, LWc/b$a$b;

    if-eqz v1, :cond_2

    check-cast v0, LWc/b$a$b;

    invoke-virtual {v0}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;->b()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d$a;-><init>()V

    invoke-static {v1, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;->a(LWc/b;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
