.class final LCc/p$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p;->c(Lh9/a;Lmh/l;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh9/a;


# direct methods
.method constructor <init>(Lh9/a;)V
    .locals 0

    iput-object p1, p0, LCc/p$k;->a:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ll9/a;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La8/b;->c:La8/b$a;

    iget-object v1, p0, LCc/p$k;->a:Lh9/a;

    invoke-virtual {v0, v1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LCc/l;

    invoke-virtual {v2}, LCc/l;->d()La8/b;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LCc/p$k;->a(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
