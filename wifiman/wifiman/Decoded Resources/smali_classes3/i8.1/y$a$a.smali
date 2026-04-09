.class final Li8/y$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/y$a;->b(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/y;


# direct methods
.method constructor <init>(Li8/y;)V
    .locals 0

    iput-object p1, p0, Li8/y$a$a;->a:Li8/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/s;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li8/y$a$a;->a:Li8/y;

    new-instance v1, Li8/y$a$a$a;

    invoke-direct {v1, v0, p1}, Li8/y$a$a$a;-><init>(Li8/y;Li8/s;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/s;

    invoke-virtual {p0, p1}, Li8/y$a$a;->a(Li8/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
