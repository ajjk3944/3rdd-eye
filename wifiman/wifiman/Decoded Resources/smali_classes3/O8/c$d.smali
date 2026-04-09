.class final LO8/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO8/c;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lhc/b;LP8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO8/c;


# direct methods
.method constructor <init>(LO8/c;)V
    .locals 0

    iput-object p1, p0, LO8/c$d;->a:LO8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    if-eqz p1, :cond_5

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-nez v1, :cond_5

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez v1, :cond_5

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-nez v1, :cond_5

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-nez p1, :cond_1

    iget-object p1, p0, LO8/c$d;->a:LO8/c;

    new-instance v0, LO8/c$d$a;

    invoke-direct {v0, p1}, LO8/c$d$a;-><init>(LO8/c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-eqz p1, :cond_4

    if-eqz v0, :cond_3

    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz p1, :cond_3

    iget-object p1, p0, LO8/c$d;->a:LO8/c;

    new-instance v0, LO8/c$d$b;

    invoke-direct {v0, p1}, LO8/c$d$b;-><init>(LO8/c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LO8/c$d;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
