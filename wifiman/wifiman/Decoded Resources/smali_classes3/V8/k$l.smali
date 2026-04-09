.class final LV8/k$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;


# direct methods
.method constructor <init>(LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$l;->a:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 7

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG6/N;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/b;

    iget-object v1, p0, LV8/k$l;->a:LV8/k;

    invoke-static {v1, v0}, LV8/k;->F(LV8/k;LG6/N;)Lgg/b;

    move-result-object v1

    new-instance v2, LV8/k$l$a;

    iget-object v3, p0, LV8/k$l;->a:LV8/k;

    invoke-direct {v2, v3}, LV8/k$l$a;-><init>(LV8/k;)V

    invoke-virtual {v1, v2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v1

    sget-object v2, LAg/e;->a:LAg/e;

    iget-object v3, p0, LV8/k$l;->a:LV8/k;

    invoke-static {v3, v0, p1}, LV8/k;->z(LV8/k;LG6/N;Lgg/b;)Lgg/z;

    move-result-object p1

    new-instance v3, LV8/k$l$b;

    iget-object v4, p0, LV8/k$l;->a:LV8/k;

    invoke-direct {v3, v4}, LV8/k$l$b;-><init>(LV8/k;)V

    invoke-virtual {p1, v3}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v3, "apply"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, LV8/k$l;->a:LV8/k;

    invoke-static {v4, v0}, LV8/k;->A(LV8/k;LG6/N;)Lgg/z;

    move-result-object v4

    new-instance v5, LV8/k$l$c;

    iget-object v6, p0, LV8/k$l;->a:LV8/k;

    invoke-direct {v5, v6}, LV8/k$l$c;-><init>(LV8/k;)V

    invoke-virtual {v4, v5}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v4}, LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    new-instance v1, LV8/k$l$d;

    iget-object v2, p0, LV8/k$l;->a:LV8/k;

    invoke-direct {v1, v2, v0}, LV8/k$l$d;-><init>(LV8/k;LG6/N;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LV8/k$l;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
