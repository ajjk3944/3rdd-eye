.class public final synthetic Lcom/ui/wifiman/model/ubiquiti/console/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

.field public final synthetic b:LLd/e;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;LLd/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/c;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/c;->b:LLd/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/c;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/c;->b:LLd/e;

    check-cast p1, LWc/b;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->a(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;LLd/e;LWc/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
