.class final Lcom/ui/wifiman/model/wmw/j$o;
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

.field final synthetic b:Lcom/ui/wifiman/model/wmw/j;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/b$a;Lcom/ui/wifiman/model/wmw/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$o;->a:Lcom/ui/wifiman/model/wmw/b$a;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j$o;->b:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/d$a;

    if-nez p1, :cond_0

    new-instance p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$o;->a:Lcom/ui/wifiman/model/wmw/b$a;

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$d;-><init>(Lcom/ui/wifiman/model/wmw/b$a;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$o;->a:Lcom/ui/wifiman/model/wmw/b$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/WifimanWizard$a$a$b;-><init>(Lcom/ui/wifiman/model/wmw/b$a;F)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/wmw/j$o$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/wmw/j$o;->b:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {v2, v3, p1}, Lcom/ui/wifiman/model/wmw/j$o$a;-><init>(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/d$a;)V

    invoke-virtual {v1, v2}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/wmw/j$o$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/j$o;->b:Lcom/ui/wifiman/model/wmw/j;

    iget-object v3, p0, Lcom/ui/wifiman/model/wmw/j$o;->a:Lcom/ui/wifiman/model/wmw/b$a;

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/model/wmw/j$o$b;-><init>(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$a;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [LDj/a;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$o;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
