.class final Lcom/ui/wifiman/model/wmw/h$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lcc/b;LWd/f;Lse/a;LP7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$A;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$c;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$A;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/h;->i(Lcom/ui/wifiman/model/wmw/h;)LP7/a;

    move-result-object v0

    new-instance v1, LP7/c$q$b;

    invoke-direct {v1}, LP7/c$q$b;-><init>()V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "mergeWith(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$A;->a(Lcom/ui/wifiman/model/wmw/g$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
