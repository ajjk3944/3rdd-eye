.class final Lcom/ui/wifiman/model/wmw/h$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h;->v(Lcom/ui/wifiman/model/wmw/g$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/h;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/g$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/h;Lcom/ui/wifiman/model/wmw/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$j;->a:Lcom/ui/wifiman/model/wmw/h;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/h$j;->b:Lcom/ui/wifiman/model/wmw/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcc/a;)Lgg/f;
    .locals 3

    const-string v0, "adoption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$j;->a:Lcom/ui/wifiman/model/wmw/h;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/h$j;->b:Lcom/ui/wifiman/model/wmw/g$b;

    new-instance v2, Lcom/ui/wifiman/model/wmw/h$j$a;

    invoke-direct {v2, v0, p1, v1}, Lcom/ui/wifiman/model/wmw/h$j$a;-><init>(Lcom/ui/wifiman/model/wmw/h;Lcc/a;Lcom/ui/wifiman/model/wmw/g$b;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcc/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$j;->a(Lcc/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
