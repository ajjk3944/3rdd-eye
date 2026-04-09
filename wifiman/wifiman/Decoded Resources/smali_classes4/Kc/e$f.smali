.class final LKc/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKc/e;-><init>(LKc/a$a;Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LKc/e;


# direct methods
.method constructor <init>(LKc/e;)V
    .locals 0

    iput-object p1, p0, LKc/e$f;->a:LKc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 2

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKc/e$f;->a:LKc/e;

    new-instance v1, LKc/e$f$a;

    invoke-direct {v1, p1, v0}, LKc/e$f$a;-><init>(Ljava/util/List;LKc/e;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LKc/e$f;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
