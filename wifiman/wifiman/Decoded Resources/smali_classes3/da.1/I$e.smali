.class final Lda/I$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->X0(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;


# direct methods
.method constructor <init>(Lda/I;)V
    .locals 0

    iput-object p1, p0, Lda/I$e;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/j;)V
    .locals 2

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LEb/j;->b()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lda/I$e;->a:Lda/I;

    invoke-virtual {v0}, Lda/I;->p0()LH/l;

    move-result-object v0

    invoke-virtual {v0}, LH/l;->r()LH/f;

    move-result-object v1

    :try_start_0
    invoke-virtual {v1, p1}, LH/f;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v0, v1}, LH/l;->d(LH/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LH/l;->f()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, LH/l;->f()V

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LEb/j;

    invoke-virtual {p0, p1}, Lda/I$e;->a(LEb/j;)V

    return-void
.end method
