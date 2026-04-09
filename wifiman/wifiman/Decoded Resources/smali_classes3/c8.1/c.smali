.class public final Lc8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LY6/r;

.field private final b:Lgg/z;


# direct methods
.method public constructor <init>(Lc8/a;)V
    .locals 1

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LY6/r$a;

    invoke-direct {v0}, LY6/r$a;-><init>()V

    invoke-virtual {v0}, LY6/r$a;->c()LY6/r;

    move-result-object v0

    iput-object v0, p0, Lc8/c;->a:LY6/r;

    new-instance v0, Lc8/c$a;

    invoke-direct {v0, p1, p0}, Lc8/c$a;-><init>(Lc8/a;Lc8/c;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "cache(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lc8/c;->b:Lgg/z;

    return-void
.end method

.method public static final synthetic a(Lc8/c;)LY6/r;
    .locals 0

    iget-object p0, p0, Lc8/c;->a:LY6/r;

    return-object p0
.end method


# virtual methods
.method public final b()Lgg/z;
    .locals 1

    iget-object v0, p0, Lc8/c;->b:Lgg/z;

    return-object v0
.end method
