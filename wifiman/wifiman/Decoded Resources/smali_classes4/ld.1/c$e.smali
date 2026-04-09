.class final Lld/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lld/c;-><init>(LUb/a;Lmd/b;LP7/a;LQ7/a;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lld/c;


# direct methods
.method constructor <init>(Lld/c;)V
    .locals 0

    iput-object p1, p0, Lld/c$e;->a:Lld/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lld/a;)Lgg/D;
    .locals 4

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lld/c$e;->a:Lld/c;

    invoke-static {v0}, Lld/c;->c(Lld/c;)LP7/a;

    move-result-object v0

    invoke-virtual {p1}, Lld/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LP7/a;->a(Ljava/lang/String;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lld/c$e;->a:Lld/c;

    new-instance v2, Lld/c$e$a;

    invoke-direct {v2, v1, p1}, Lld/c$e$a;-><init>(Lld/c;Lld/a;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lld/a;

    invoke-virtual {p0, p1}, Lld/c$e;->a(Lld/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
