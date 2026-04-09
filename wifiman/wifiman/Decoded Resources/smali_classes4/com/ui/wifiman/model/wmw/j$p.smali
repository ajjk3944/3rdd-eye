.class final Lcom/ui/wifiman/model/wmw/j$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;->y(Lcom/ui/wifiman/model/wmw/b$a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/b$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$p;->a:Lcom/ui/wifiman/model/wmw/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error;

    if-eqz v0, :cond_0

    const-string v0, "WMW bonded connection disconnected because of an error"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$p;->a:Lcom/ui/wifiman/model/wmw/b$a;

    new-instance v2, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Connection;

    const-string v3, "Wizard connection failed"

    invoke-direct {v2, v3, p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Connection;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$a;-><init>(Lcom/ui/wifiman/model/wmw/b$a;Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$p;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
