.class final Lcom/ui/wifiman/model/wmw/j$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j$e;->a(LYg/y;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/b;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/j;

.field final synthetic c:Lcom/ui/wifiman/model/wmw/WifimanWizard$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$e$a;->a:Lcom/ui/wifiman/model/wmw/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j$e$a;->b:Lcom/ui/wifiman/model/wmw/j;

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/j$e$a;->c:Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 3

    const-string v0, "bonded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/wmw/b$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$e$a;->a:Lcom/ui/wifiman/model/wmw/b;

    const v2, 0x3f4ccccd    # 0.8f

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/b$c$a;-><init>(Lcom/ui/wifiman/model/wmw/b;F)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$e$a;->b:Lcom/ui/wifiman/model/wmw/j;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$e$a;->c:Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    check-cast v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/ui/wifiman/model/wmw/j;->j(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wmw/g;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [LDj/a;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$e$a;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
