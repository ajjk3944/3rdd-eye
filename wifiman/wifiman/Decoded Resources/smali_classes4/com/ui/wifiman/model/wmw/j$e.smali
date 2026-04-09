.class final Lcom/ui/wifiman/model/wmw/j$e;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$e;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/b;

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/a;

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/b$b;

    const-string v2, "just(...)"

    if-eqz p1, :cond_1

    new-instance p1, Lcom/ui/wifiman/model/wmw/b$c$d;

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/wmw/b$c$d;-><init>(Lcom/ui/wifiman/model/wmw/b;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/b$a$a;

    if-eqz p1, :cond_2

    new-instance p1, Lcom/ui/wifiman/model/wmw/b$c$c$a;

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/wmw/b$c$c$a;-><init>(Lcom/ui/wifiman/model/wmw/b;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2
    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/b$a$b;

    if-eqz p1, :cond_9

    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-nez p1, :cond_8

    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez p1, :cond_8

    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$b;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/ui/wifiman/model/wmw/b$c$b;

    const v1, 0x3dcccccd    # 0.1f

    invoke-direct {p1, v0, v1}, Lcom/ui/wifiman/model/wmw/b$c$b;-><init>(Lcom/ui/wifiman/model/wmw/b;F)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-eqz p1, :cond_5

    new-instance p1, Lcom/ui/wifiman/model/wmw/b$c$b;

    const v1, 0x3ecccccd    # 0.4f

    invoke-direct {p1, v0, v1}, Lcom/ui/wifiman/model/wmw/b$c$b;-><init>(Lcom/ui/wifiman/model/wmw/b;F)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$e;->a:Lcom/ui/wifiman/model/wmw/j;

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/ui/wifiman/model/wmw/j;->r(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wmw/g;)Lgg/z;

    move-result-object p1

    new-instance v2, Lcom/ui/wifiman/model/wmw/j$e$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/wmw/j$e;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {v2, v0, v3, v1}, Lcom/ui/wifiman/model/wmw/j$e$a;-><init>(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)V

    invoke-virtual {p1, v2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    instance-of p1, v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$a;

    if-eqz p1, :cond_7

    new-instance p1, Lcom/ui/wifiman/model/wmw/b$c$c$b;

    check-cast v1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c$a;->b()Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/ui/wifiman/model/wmw/b$c$c$b;-><init>(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_0
    new-instance p1, Lcom/ui/wifiman/model/wmw/b$c$b;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/ui/wifiman/model/wmw/b$c$b;-><init>(Lcom/ui/wifiman/model/wmw/b;F)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$e;->a(LYg/y;)LDj/a;

    move-result-object p1

    return-object p1
.end method
