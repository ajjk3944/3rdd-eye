.class public final LR0/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/i;


# instance fields
.field private final a:LL0/d;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LL0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LR0/O;->a:LL0/d;

    .line 3
    iput p2, p0, LR0/O;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7

    .line 4
    new-instance v6, LL0/d;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v6, p2}, LR0/O;-><init>(LL0/d;I)V

    return-void
.end method


# virtual methods
.method public a(LR0/l;)V
    .locals 4

    invoke-virtual {p1}, LR0/l;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LR0/l;->f()I

    move-result v0

    invoke-virtual {p1}, LR0/l;->f()I

    move-result v1

    invoke-virtual {p1}, LR0/l;->e()I

    move-result v2

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, LR0/l;->m(IILjava/lang/String;)V

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v0, v1}, LR0/l;->n(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LR0/l;->k()I

    move-result v0

    invoke-virtual {p1}, LR0/l;->k()I

    move-result v1

    invoke-virtual {p1}, LR0/l;->j()I

    move-result v2

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, LR0/l;->m(IILjava/lang/String;)V

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v0, v1}, LR0/l;->n(II)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, LR0/l;->g()I

    move-result v0

    iget v1, p0, LR0/O;->b:I

    if-lez v1, :cond_2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    add-int/2addr v0, v1

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p1}, LR0/l;->h()I

    move-result v2

    invoke-static {v0, v1, v2}, Lsh/m;->k(III)I

    move-result v0

    invoke-virtual {p1, v0}, LR0/l;->o(I)V

    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LR0/O;->b:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LR0/O;->a:LL0/d;

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR0/O;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    check-cast p1, LR0/O;

    invoke-virtual {p1}, LR0/O;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LR0/O;->b:I

    iget p1, p1, LR0/O;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LR0/O;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SetComposingTextCommand(text=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR0/O;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', newCursorPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LR0/O;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
