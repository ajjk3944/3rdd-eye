.class final LV8/k$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;->M(LG6/N;)Lgg/z;
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

    iput-object p1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LG6/P;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "services"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/k$w;->a:LV8/k;

    invoke-static {v0}, LV8/k;->x(LV8/k;)Ljava/util/UUID;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV8/k$w;->a:LV8/k;

    invoke-static {v0}, LV8/k;->x(LV8/k;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, LG6/P;->c(Ljava/util/UUID;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$w$a;

    iget-object v1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$w$a;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$w$b;

    iget-object v1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$w$b;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$w$c;

    iget-object v1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$w$c;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$w$d;

    iget-object v1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$w$d;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV8/k$w;->a:LV8/k;

    invoke-static {v0}, LV8/k;->w(LV8/k;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, LG6/P;->b(Ljava/util/UUID;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$w$e;

    iget-object v1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$w$e;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v0, LV8/k$w$f;

    iget-object v1, p0, LV8/k$w;->a:LV8/k;

    invoke-direct {v0, v1}, LV8/k$w$f;-><init>(LV8/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/P;

    invoke-virtual {p0, p1}, LV8/k$w;->a(LG6/P;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
