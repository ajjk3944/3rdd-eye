.class final Lcom/ui/wifiman/model/wmw/j$t;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$t;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT8/a$d;)LDj/a;
    .locals 2

    const-string v0, "btleState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LT8/a$d$a;

    const-string v1, "just(...)"

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$a;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$a;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LT8/a$d$d;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$d;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$d;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LT8/a$d$c;

    if-eqz v0, :cond_2

    sget-object p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, LT8/a$d$b;

    if-eqz v0, :cond_3

    sget-object p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$b;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    instance-of p1, p1, LT8/a$d$e;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$t;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-static {p1}, Lcom/ui/wifiman/model/wmw/j;->n(Lcom/ui/wifiman/model/wmw/j;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT8/a$d;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$t;->a(LT8/a$d;)LDj/a;

    move-result-object p1

    return-object p1
.end method
