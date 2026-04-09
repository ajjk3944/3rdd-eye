.class final LP8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/b;->o0(LIf/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/b;

.field final synthetic b:LIf/c;


# direct methods
.method constructor <init>(LP8/b;LIf/c;)V
    .locals 0

    iput-object p1, p0, LP8/b$b;->a:LP8/b;

    iput-object p2, p0, LP8/b$b;->b:LIf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)Lgg/r;
    .locals 3

    const-string/jumbo v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/b$b;->a:LP8/b;

    iget-object v1, p0, LP8/b$b;->b:LIf/c;

    new-instance v2, LP8/b$b$a;

    invoke-direct {v2, p1, v0, v1}, LP8/b$b$a;-><init>(Ljava/util/Set;LP8/b;LIf/c;)V

    invoke-static {v2}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    invoke-virtual {p0, p1}, LP8/b$b;->a(Ljava/util/Set;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
