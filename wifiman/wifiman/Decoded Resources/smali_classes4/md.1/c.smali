.class public final Lmd/c;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lmd/b;


# instance fields
.field private final c:Lcom/ui/wifiman/model/support/a;


# direct methods
.method public constructor <init>(LVb/a;Lcom/ui/wifiman/model/support/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFileDataCollector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    iput-object p2, p0, Lmd/c;->c:Lcom/ui/wifiman/model/support/a;

    return-void
.end method

.method public static final synthetic h(Lmd/c;)Lcom/ui/wifiman/model/support/a;
    .locals 0

    iget-object p0, p0, Lmd/c;->c:Lcom/ui/wifiman/model/support/a;

    return-object p0
.end method


# virtual methods
.method public c()Lmd/a;
    .locals 9

    new-instance v8, Lmd/a;

    sget-object v0, LO7/e;->a:LO7/e;

    invoke-virtual {v0}, LO7/e;->a()LT7/b;

    move-result-object v1

    sget-object v0, LT7/c;->Companion:LT7/c$a;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "getDefault(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LT7/c$a;->a(Ljava/util/Locale;)LT7/c;

    move-result-object v2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lmd/a;-><init>(LT7/b;LT7/c;ZZZZZ)V

    return-object v8
.end method

.method public bridge synthetic d(Ljava/lang/Object;)Lgg/b;
    .locals 0

    check-cast p1, Lmd/a;

    invoke-virtual {p0, p1}, Lmd/c;->i(Lmd/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LVb/c;

    invoke-virtual {p0, p1}, Lmd/c;->j(LVb/c;)Lmd/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmd/c;->k()Lmd/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmd/a;

    invoke-virtual {p0, p1}, Lmd/c;->l(Lmd/a;)LVb/c;

    move-result-object p1

    return-object p1
.end method

.method protected i(Lmd/a;)Lgg/b;
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmd/c$a;

    invoke-direct {v0, p1, p0}, Lmd/c$a;-><init>(Lmd/a;Lmd/c;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected j(LVb/c;)Lmd/a;
    .locals 9

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmd/a;

    invoke-virtual {p1}, LVb/c;->d()LT7/b;

    move-result-object v2

    invoke-virtual {p1}, LVb/c;->f()LT7/c;

    move-result-object v3

    invoke-virtual {p1}, LVb/c;->a()Z

    move-result v4

    invoke-virtual {p1}, LVb/c;->b()Z

    move-result v5

    invoke-virtual {p1}, LVb/c;->e()Z

    move-result v6

    invoke-virtual {p1}, LVb/c;->j()Z

    move-result v7

    invoke-virtual {p1}, LVb/c;->k()Z

    move-result v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lmd/a;-><init>(LT7/b;LT7/c;ZZZZZ)V

    return-object v0
.end method

.method protected k()Lmd/a;
    .locals 1

    invoke-virtual {p0}, Lmd/c;->c()Lmd/a;

    move-result-object v0

    return-object v0
.end method

.method protected l(Lmd/a;)LVb/c;
    .locals 9

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVb/c;

    invoke-virtual {p1}, Lmd/a;->e()LT7/b;

    move-result-object v2

    invoke-virtual {p1}, Lmd/a;->g()LT7/c;

    move-result-object v3

    invoke-virtual {p1}, Lmd/a;->c()Z

    move-result v4

    invoke-virtual {p1}, Lmd/a;->d()Z

    move-result v5

    invoke-virtual {p1}, Lmd/a;->f()Z

    move-result v6

    invoke-virtual {p1}, Lmd/a;->h()Z

    move-result v7

    invoke-virtual {p1}, Lmd/a;->i()Z

    move-result v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, LVb/c;-><init>(LT7/b;LT7/c;ZZZZZ)V

    return-object v0
.end method
