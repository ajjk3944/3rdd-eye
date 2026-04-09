.class final LCc/p$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p;->c(Lh9/a;Lmh/l;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCc/p;

.field final synthetic b:Lmh/l;

.field final synthetic c:Lh9/a;


# direct methods
.method constructor <init>(LCc/p;Lmh/l;Lh9/a;)V
    .locals 0

    iput-object p1, p0, LCc/p$l;->a:LCc/p;

    iput-object p2, p0, LCc/p$l;->b:Lmh/l;

    iput-object p3, p0, LCc/p$l;->c:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/l;

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz p1, :cond_0

    iget-object v1, p0, LCc/p$l;->a:LCc/p;

    iget-object v2, p0, LCc/p$l;->b:Lmh/l;

    iget-object v3, p0, LCc/p$l;->c:Lh9/a;

    new-instance v4, LCc/p$l$a;

    invoke-direct {v4, v1, v2, p1, v3}, LCc/p$l$a;-><init>(LCc/p;Lmh/l;LCc/l;Lh9/a;)V

    invoke-static {v4}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LCc/p$l;->a:LCc/p;

    iget-object v1, p0, LCc/p$l;->b:Lmh/l;

    iget-object v2, p0, LCc/p$l;->c:Lh9/a;

    new-instance v3, LCc/p$l$b;

    invoke-direct {v3, p1, v1, v2}, LCc/p$l$b;-><init>(LCc/p;Lmh/l;Lh9/a;)V

    invoke-static {v3}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LCc/p$l;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
