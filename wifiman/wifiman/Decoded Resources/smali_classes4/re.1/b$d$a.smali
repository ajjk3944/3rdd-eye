.class final Lre/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/b$d;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lre/g;


# direct methods
.method constructor <init>(Lre/g;)V
    .locals 0

    iput-object p1, p0, Lre/b$d$a;->a:Lre/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Lre/a$b;
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    if-eqz v0, :cond_0

    new-instance v0, Lre/a$b$a;

    iget-object v1, p0, Lre/b$d$a;->a:Lre/g;

    new-instance v2, Lre/q;

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$a;->b()Lcom/ui/wmw/g;

    move-result-object p1

    iget-object v3, p0, Lre/b$d$a;->a:Lre/g;

    invoke-direct {v2, p1, v3}, Lre/q;-><init>(Lcom/ui/wmw/g;Lre/c;)V

    invoke-direct {v0, v1, v2}, Lre/a$b$a;-><init>(Lre/c;Lre/n;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$b;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$c;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    sget-object v0, Lre/a$b$b;->a:Lre/a$b$b;

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1}, Lre/b$d$a;->a(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)Lre/a$b;

    move-result-object p1

    return-object p1
.end method
