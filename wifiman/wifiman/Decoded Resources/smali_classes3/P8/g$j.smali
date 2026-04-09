.class final LP8/g$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g;->a()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/g$j$a;
    }
.end annotation


# instance fields
.field final synthetic a:LP8/g;


# direct methods
.method constructor <init>(LP8/g;)V
    .locals 0

    iput-object p1, p0, LP8/g$j;->a:LP8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIf/a;)Lgg/f;
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x1

    const-string/jumbo v2, "contentType"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LP8/g$j$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, LP8/g$j;->a:LP8/g;

    invoke-virtual {p1}, LP8/g;->close()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LP8/g$j;->a:LP8/g;

    invoke-static {p1}, LP8/g;->g(LP8/g;)Lcom/ui/wifiman/model/wmw/g;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/wmw/g;->c()Lgg/b;

    move-result-object p1

    iget-object v3, p0, LP8/g$j;->a:LP8/g;

    invoke-static {v3}, LP8/g;->g(LP8/g;)Lcom/ui/wifiman/model/wmw/g;

    move-result-object v3

    invoke-interface {v3}, Lcom/ui/wifiman/model/wmw/g;->e()Lgg/b;

    move-result-object v3

    iget-object v4, p0, LP8/g$j;->a:LP8/g;

    new-instance v5, LP8/g$j$c;

    invoke-direct {v5, v4}, LP8/g$j$c;-><init>(LP8/g;)V

    invoke-static {v5}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    new-array v2, v2, [Lgg/f;

    const/4 v5, 0x0

    aput-object p1, v2, v5

    aput-object v3, v2, v1

    aput-object v4, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LP8/g$j;->a:LP8/g;

    new-instance v0, LP8/g$j$b;

    invoke-direct {v0, p1}, LP8/g$j$b;-><init>(LP8/g;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIf/a;

    invoke-virtual {p0, p1}, LP8/g$j;->a(LIf/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
