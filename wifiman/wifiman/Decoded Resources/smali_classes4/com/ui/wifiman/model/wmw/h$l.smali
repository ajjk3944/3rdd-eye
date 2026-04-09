.class final Lcom/ui/wifiman/model/wmw/h$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->c()Lgg/b;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$l;->a:Lcom/ui/wifiman/model/wmw/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$a;)Lgg/f;
    .locals 1

    const-string v0, "availability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$l;->a:Lcom/ui/wifiman/model/wmw/h;

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$a$a;->a()Lcom/ui/wifiman/model/wmw/g$b;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/wmw/h;->p(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$a$b;

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/g$a$c;

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

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$l;->a(Lcom/ui/wifiman/model/wmw/g$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
