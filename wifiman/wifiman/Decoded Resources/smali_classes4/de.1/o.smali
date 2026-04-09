.class public final Lde/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/n;


# instance fields
.field private final a:LNb/a;


# direct methods
.method public constructor <init>(LNb/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/o;->a:LNb/a;

    return-void
.end method

.method public static final synthetic c(Lde/o;)LNb/a;
    .locals 0

    iget-object p0, p0, Lde/o;->a:LNb/a;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/i;
    .locals 1

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lde/o;->a:LNb/a;

    invoke-virtual {v0, p1}, LNb/a;->c(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    sget-object v0, Lde/o$a;->a:Lde/o$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;Z)Lgg/b;
    .locals 1

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/o$b;

    invoke-direct {v0, p0, p1, p2}, Lde/o$b;-><init>(Lde/o;Ljava/lang/String;Z)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
