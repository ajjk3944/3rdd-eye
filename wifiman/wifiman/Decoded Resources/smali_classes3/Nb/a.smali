.class public abstract LNb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LNb/c;)V
.end method

.method public abstract b(Ljava/lang/String;)Lgg/i;
.end method

.method public final c(Ljava/lang/String;)Lgg/i;
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LNb/a;->b(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    sget-object v0, LNb/a$a;->a:LNb/a$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d(Ljava/lang/String;Z)V
    .locals 2

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LNb/a;->e(Ljava/lang/String;Z)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    new-instance v0, LNb/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LNb/c;-><init>(Ljava/lang/String;ZLjava/util/List;)V

    invoke-virtual {p0, v0}, LNb/a;->a(LNb/c;)V

    :cond_0
    return-void
.end method

.method public abstract e(Ljava/lang/String;Z)I
.end method
