.class final Lc0/f$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/f;->d(Ljava/lang/Object;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/f;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lc0/f$d;


# direct methods
.method constructor <init>(Lc0/f;Ljava/lang/Object;Lc0/f$d;)V
    .locals 0

    iput-object p1, p0, Lc0/f$e;->a:Lc0/f;

    iput-object p2, p0, Lc0/f$e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lc0/f$e;->c:Lc0/f$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 3

    iget-object p1, p0, Lc0/f$e;->a:Lc0/f;

    invoke-static {p1}, Lc0/f;->a(Lc0/f;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lc0/f$e;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    iget-object v0, p0, Lc0/f$e;->b:Ljava/lang/Object;

    if-nez p1, :cond_0

    iget-object p1, p0, Lc0/f$e;->a:Lc0/f;

    invoke-static {p1}, Lc0/f;->b(Lc0/f;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lc0/f$e;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc0/f$e;->a:Lc0/f;

    invoke-static {p1}, Lc0/f;->a(Lc0/f;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lc0/f$e;->b:Ljava/lang/Object;

    iget-object v1, p0, Lc0/f$e;->c:Lc0/f$d;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc0/f$e;->c:Lc0/f$d;

    iget-object v0, p0, Lc0/f$e;->a:Lc0/f;

    iget-object v1, p0, Lc0/f$e;->b:Ljava/lang/Object;

    new-instance v2, Lc0/f$e$a;

    invoke-direct {v2, p1, v0, v1}, Lc0/f$e$a;-><init>(Lc0/f$d;Lc0/f;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Key "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " was used multiple times "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lc0/f$e;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
