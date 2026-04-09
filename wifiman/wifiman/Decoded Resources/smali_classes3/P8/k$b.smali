.class final LP8/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/k;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/k;


# direct methods
.method constructor <init>(LP8/k;)V
    .locals 0

    iput-object p1, p0, LP8/k$b;->a:LP8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/g$a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/a;

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    iget-object p1, p0, LP8/k$b;->a:LP8/k;

    invoke-static {p1}, LP8/k;->p0(LP8/k;)Lcom/ui/wifiman/model/wmw/g;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/g;->e()Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/g$a$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, LP8/k$b;->a:LP8/k;

    invoke-static {p1}, LP8/k;->p0(LP8/k;)Lcom/ui/wifiman/model/wmw/g;

    move-result-object p1

    check-cast v0, Lcom/ui/wifiman/model/wmw/g$a$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/wmw/g$a$a;->a()Lcom/ui/wifiman/model/wmw/g$b;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/wmw/g;->d(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LP8/k$b;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
