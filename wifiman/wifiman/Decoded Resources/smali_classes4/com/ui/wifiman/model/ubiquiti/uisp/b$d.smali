.class final Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/b;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/a;LP7/a;Lfd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->i(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ljava/lang/String;Ljava/lang/String;)LXd/a;

    move-result-object v1

    new-instance v2, LYd/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LYd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, LXd/a;->c(LYd/a;)Lgg/z;

    move-result-object v1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b;

    invoke-direct {v2, v3, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Lcom/ui/wifiman/model/ubiquiti/uisp/a$a;)V

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance v1, Ll9/a;

    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$b;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b$d$b;

    invoke-virtual {p1, v0}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
