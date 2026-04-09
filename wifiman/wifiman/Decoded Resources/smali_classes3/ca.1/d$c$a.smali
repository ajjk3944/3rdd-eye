.class final Lca/d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/d$c;->a(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lca/d$c$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lca/d$a;
    .locals 3

    const-string/jumbo v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lca/d$a;

    iget-object v1, p0, Lca/d$c$a;->a:Ljava/lang/String;

    invoke-static {p1}, Lca/b;->a(Ljava/lang/String;)Lca/b;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lca/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/b;

    invoke-virtual {p1}, Lca/b;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lca/d$c$a;->a(Ljava/lang/String;)Lca/d$a;

    move-result-object p1

    return-object p1
.end method
