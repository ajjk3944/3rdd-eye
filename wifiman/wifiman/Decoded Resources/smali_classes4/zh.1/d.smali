.class public final Lzh/d;
.super Lii/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Loi/n;Lzh/b;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lii/f;-><init>(Loi/n;LBh/e;)V

    return-void
.end method


# virtual methods
.method protected j()Ljava/util/List;
    .locals 3

    invoke-virtual {p0}, Lii/f;->m()LBh/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lzh/b;

    invoke-virtual {v0}, Lzh/b;->U0()Lzh/f;

    move-result-object v0

    sget-object v1, Lzh/f$a;->e:Lzh/f$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lzh/e;->E:Lzh/e$a;

    invoke-virtual {p0}, Lii/f;->m()LBh/e;

    move-result-object v1

    check-cast v1, Lzh/b;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lzh/e$a;->a(Lzh/b;Z)Lzh/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Lzh/f$d;->e:Lzh/f$d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lzh/e;->E:Lzh/e$a;

    invoke-virtual {p0}, Lii/f;->m()LBh/e;

    move-result-object v1

    check-cast v1, Lzh/b;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lzh/e$a;->a(Lzh/b;Z)Lzh/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method
