.class final Lxd/d$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d$e;->a(LIa/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIa/a;


# direct methods
.method constructor <init>(LIa/a;)V
    .locals 0

    iput-object p1, p0, Lxd/d$e$c;->a:LIa/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/k$a;)Lgg/D;
    .locals 3

    const-string v0, "reportParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd/d$e$c$a;

    iget-object v1, p0, Lxd/d$e$c;->a:LIa/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lxd/d$e$c$a;-><init>(LIa/a;LIa/k$a;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v2, v0, p1, v2}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/k$a;

    invoke-virtual {p0, p1}, Lxd/d$e$c;->a(LIa/k$a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
