.class final Lw8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/c;->w0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/c;


# direct methods
.method constructor <init>(Lw8/c;)V
    .locals 0

    iput-object p1, p0, Lw8/c$c;->a:Lw8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 5

    const/4 v0, 0x0

    const-string v1, "<destruct>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/4 v4, 0x0

    if-nez v2, :cond_2

    iget-object p1, p0, Lw8/c$c;->a:Lw8/c;

    invoke-static {p1}, Lw8/c;->I0(Lw8/c;)Li8/a;

    move-result-object p1

    new-instance v2, Li8/a$b$t;

    invoke-virtual {v1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->c()Ljava/lang/String;

    move-result-object v4

    :cond_1
    invoke-direct {v2, v4}, Li8/a$b$t;-><init>(Ljava/lang/String;)V

    new-array v1, v3, [Li8/a$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lw8/c$c;->a:Lw8/c;

    invoke-static {p1}, Lw8/c;->I0(Lw8/c;)Li8/a;

    move-result-object p1

    new-array v1, v3, [Li8/a$b;

    sget-object v2, Li8/a$b$r;->a:Li8/a$b$r;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lw8/c$c;->a:Lw8/c;

    invoke-static {p1}, Lw8/c;->I0(Lw8/c;)Li8/a;

    move-result-object p1

    new-instance v1, Li8/a$b$t;

    invoke-direct {v1, v4, v3, v4}, Li8/a$b$t;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v2, v3, [Li8/a$b;

    aput-object v1, v2, v0

    invoke-interface {p1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lw8/c$c;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
