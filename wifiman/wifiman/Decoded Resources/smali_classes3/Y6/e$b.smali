.class LY6/e$b;
.super LY6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY6/e;->m(Ljava/lang/reflect/Type;LY6/r;)LY6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(LY6/h;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LY6/e;-><init>(LY6/h;LY6/e$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1}, LY6/e;->l(LY6/k;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-super {p0, p1, p2}, LY6/e;->p(LY6/o;Ljava/util/Collection;)V

    return-void
.end method

.method n()Ljava/util/Collection;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
