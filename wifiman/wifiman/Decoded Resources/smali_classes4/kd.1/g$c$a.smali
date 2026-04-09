.class final Lkd/g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/g$c;->a(LZc/e;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkd/g;


# direct methods
.method constructor <init>(Lkd/g;)V
    .locals 0

    iput-object p1, p0, Lkd/g$c$a;->a:Lkd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a;)Lgg/D;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd/g$c$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lkd/g$c$a$a;-><init>(LIa/a;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    new-instance v0, Lkd/g$c$a$b;

    iget-object v1, p0, Lkd/g$c$a;->a:Lkd/g;

    invoke-direct {v0, v1}, Lkd/g$c$a$b;-><init>(Lkd/g;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

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

    check-cast p1, LIa/a;

    invoke-virtual {p0, p1}, Lkd/g$c$a;->a(LIa/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
