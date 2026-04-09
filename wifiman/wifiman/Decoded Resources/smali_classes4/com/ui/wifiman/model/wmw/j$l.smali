.class final Lcom/ui/wifiman/model/wmw/j$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;->w()Lgg/b;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$l;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/b;)Lgg/f;
    .locals 1

    const-string v0, "adoption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/b$a$b;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$l;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-static {p1}, Lcom/ui/wifiman/model/wmw/j;->o(Lcom/ui/wifiman/model/wmw/j;)Lcom/ui/wifiman/model/wmw/b$d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/b$b;->a:Lcom/ui/wifiman/model/wmw/b$b;

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/wmw/b$d;->b(Lcom/ui/wifiman/model/wmw/b;)Lgg/b;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/wmw/j$l$a;->a:Lcom/ui/wifiman/model/wmw/j$l$a;

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/b$a$a;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/b$b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$l;->a(Lcom/ui/wifiman/model/wmw/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
