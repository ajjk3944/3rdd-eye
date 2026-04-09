.class public final Lb0/e$a;
.super LY/f;
.source "SourceFile"

# interfaces
.implements LT/A0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private g:Lb0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lb0/e;)V
    .locals 0

    invoke-direct {p0, p1}, LY/f;-><init>(LY/d;)V

    iput-object p1, p0, Lb0/e$a;->g:Lb0/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LT/A0;
    .locals 1

    invoke-virtual {p0}, Lb0/e$a;->r()Lb0/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LT/u;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LT/u;

    invoke-virtual {p0, p1}, Lb0/e$a;->s(LT/u;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LT/F1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LT/F1;

    invoke-virtual {p0, p1}, Lb0/e$a;->t(LT/F1;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic g()LY/d;
    .locals 1

    invoke-virtual {p0}, Lb0/e$a;->r()Lb0/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LT/u;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LT/u;

    invoke-virtual {p0, p1}, Lb0/e$a;->u(LT/u;)LT/F1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LT/u;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, LT/u;

    check-cast p2, LT/F1;

    invoke-virtual {p0, p1, p2}, Lb0/e$a;->v(LT/u;LT/F1;)LT/F1;

    move-result-object p1

    return-object p1
.end method

.method public r()Lb0/e;
    .locals 3

    invoke-virtual {p0}, LY/f;->i()LY/t;

    move-result-object v0

    iget-object v1, p0, Lb0/e$a;->g:Lb0/e;

    invoke-virtual {v1}, LY/d;->s()LY/t;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lb0/e$a;->g:Lb0/e;

    goto :goto_0

    :cond_0
    new-instance v0, La0/e;

    invoke-direct {v0}, La0/e;-><init>()V

    invoke-virtual {p0, v0}, LY/f;->p(La0/e;)V

    new-instance v0, Lb0/e;

    invoke-virtual {p0}, LY/f;->i()LY/t;

    move-result-object v1

    invoke-virtual {p0}, LZg/i;->size()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lb0/e;-><init>(LY/t;I)V

    :goto_0
    iput-object v0, p0, Lb0/e$a;->g:Lb0/e;

    return-object v0
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LT/u;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LT/u;

    invoke-virtual {p0, p1}, Lb0/e$a;->w(LT/u;)LT/F1;

    move-result-object p1

    return-object p1
.end method

.method public bridge s(LT/u;)Z
    .locals 0

    invoke-super {p0, p1}, LY/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge t(LT/F1;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge u(LT/u;)LT/F1;
    .locals 0

    invoke-super {p0, p1}, LY/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT/F1;

    return-object p1
.end method

.method public bridge v(LT/u;LT/F1;)LT/F1;
    .locals 0

    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT/F1;

    return-object p1
.end method

.method public bridge w(LT/u;)LT/F1;
    .locals 0

    invoke-super {p0, p1}, LY/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT/F1;

    return-object p1
.end method
