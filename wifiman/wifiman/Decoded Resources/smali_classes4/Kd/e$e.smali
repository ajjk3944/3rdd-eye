.class final LKd/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/e;->d(Ljava/lang/String;LKd/a$a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKd/e;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LKd/a$a;


# direct methods
.method constructor <init>(LKd/e;Ljava/lang/String;LKd/a$a;)V
    .locals 0

    iput-object p1, p0, LKd/e$e;->a:LKd/e;

    iput-object p2, p0, LKd/e$e;->b:Ljava/lang/String;

    iput-object p3, p0, LKd/e$e;->c:LKd/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lgg/f;
    .locals 4

    const-string v0, "catalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKd/e$e;->a:LKd/e;

    iget-object v1, p0, LKd/e$e;->b:Ljava/lang/String;

    iget-object v2, p0, LKd/e$e;->c:LKd/a$a;

    new-instance v3, LKd/e$e$a;

    invoke-direct {v3, v0, v1, p1, v2}, LKd/e$e$a;-><init>(LKd/e;Ljava/lang/String;Lwa/a;LKd/a$a;)V

    invoke-static {v3}, Lgg/b;->r(Lgg/e;)Lgg/b;

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

    check-cast p1, Lwa/a;

    invoke-virtual {p0, p1}, LKd/e$e;->a(Lwa/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
