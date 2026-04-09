.class final Lw8/t$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/t;->Q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/t;


# direct methods
.method constructor <init>(Lw8/t;)V
    .locals 0

    iput-object p1, p0, Lw8/t$l;->a:Lw8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;->invalidate()Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw8/t$l;->a:Lw8/t;

    new-instance v0, Lw8/t$l$a;

    invoke-direct {v0, p1}, Lw8/t$l$a;-><init>(Lw8/t;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lw8/t$l;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
