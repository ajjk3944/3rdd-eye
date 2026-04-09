.class final Lcom/ui/wifiman/model/wmw/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;-><init>(Landroid/content/Context;Lmc/a;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/b$d;LP7/a;LT8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/j;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$d;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "component2(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/wmw/b;

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$b;

    if-eqz v1, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$d;->a:Lcom/ui/wifiman/model/wmw/j;

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$a;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/wmw/j;->m(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$a;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$b;

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$a;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$b;-><init>(Lcom/ui/wifiman/model/wmw/b$a;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$d;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
