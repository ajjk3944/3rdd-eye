.class final Lcom/ubnt/usurvey/product/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/product/q;->a(ZJ)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/ubnt/usurvey/product/q;


# direct methods
.method constructor <init>(JLcom/ubnt/usurvey/product/q;)V
    .locals 0

    iput-wide p1, p0, Lcom/ubnt/usurvey/product/q$b;->a:J

    iput-object p3, p0, Lcom/ubnt/usurvey/product/q$b;->b:Lcom/ubnt/usurvey/product/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 6

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/uidb/UiDB$c;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ui/uidb/UiDB$c;->c()Lbb/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lbb/a$a;->a()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/ubnt/usurvey/product/q$b;->a:J

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ubnt/usurvey/product/q$b$b;

    invoke-direct {v0, p1}, Lcom/ubnt/usurvey/product/q$b$b;-><init>(Lcom/ui/uidb/UiDB$c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ubnt/usurvey/product/q$b;->b:Lcom/ubnt/usurvey/product/q;

    invoke-static {v0}, Lcom/ubnt/usurvey/product/q;->b(Lcom/ubnt/usurvey/product/q;)Lxa/o;

    move-result-object v0

    invoke-interface {v0}, Lxa/o;->a()Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/usurvey/product/q$b$a;

    invoke-direct {v1, p1}, Lcom/ubnt/usurvey/product/q$b$a;-><init>(Lcom/ui/uidb/UiDB$c;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/product/q$b;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
