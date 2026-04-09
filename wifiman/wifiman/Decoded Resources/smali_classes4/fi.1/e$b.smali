.class public final Lfi/e$b;
.super Lxi/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfi/e;->h(LBh/b;ZLmh/l;)LBh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lfi/e$b;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lfi/e$b;->b:Lmh/l;

    invoke-direct {p0}, Lxi/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfi/e$b;->f()LBh/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LBh/b;

    invoke-virtual {p0, p1}, Lfi/e$b;->d(LBh/b;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LBh/b;

    invoke-virtual {p0, p1}, Lfi/e$b;->e(LBh/b;)Z

    move-result p1

    return p1
.end method

.method public d(LBh/b;)V
    .locals 1

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfi/e$b;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, Lfi/e$b;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfi/e$b;->a:Lkotlin/jvm/internal/N;

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public e(LBh/b;)Z
    .locals 1

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lfi/e$b;->a:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()LBh/b;
    .locals 1

    iget-object v0, p0, Lfi/e$b;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, LBh/b;

    return-object v0
.end method
