.class final Lre/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/b;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lje/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/WifimanWizard;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;)V
    .locals 0

    iput-object p1, p0, Lre/b$d;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lre/g;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lre/b$d;->a:Lcom/ui/wifiman/model/wmw/WifimanWizard;

    invoke-interface {v0}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->getState()Lgg/i;

    move-result-object v0

    new-instance v1, Lre/b$d$a;

    invoke-direct {v1, p1}, Lre/b$d$a;-><init>(Lre/g;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lre/a$b$b;->a:Lre/a$b$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lre/b$d;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
