.class final Lx8/j$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx8/j;


# direct methods
.method constructor <init>(Lx8/j;)V
    .locals 0

    iput-object p1, p0, Lx8/j$k;->a:Lx8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)LDj/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTe/a;

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/a;

    iget-object v2, p0, Lx8/j$k;->a:Lx8/j;

    new-instance v3, Lx8/j$k$c;

    invoke-direct {v3, v1, v0, v2, p1}, Lx8/j$k$c;-><init>(Ljava/util/List;LTe/a;Lx8/j;La8/a;)V

    invoke-static {v3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx8/j$k$a;->a:Lx8/j$k$a;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lx8/j$k$b;->a:Lx8/j$k$b;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lx8/j$k;->a(LYg/y;)LDj/a;

    move-result-object p1

    return-object p1
.end method
