.class final LM/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM/E$a;
    }
.end annotation


# static fields
.field public static final f:LM/E$a;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:LM/l;

.field private final e:LM/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM/E$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM/E$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LM/E;->f:LM/E$a;

    return-void
.end method

.method public constructor <init>(ZIILM/l;LM/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LM/E;->a:Z

    iput p2, p0, LM/E;->b:I

    iput p3, p0, LM/E;->c:I

    iput-object p4, p0, LM/E;->d:LM/l;

    iput-object p5, p0, LM/E;->e:LM/k;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LM/E;->a:Z

    return v0
.end method

.method public c()LM/k;
    .locals 1

    iget-object v0, p0, LM/E;->e:LM/k;

    return-object v0
.end method

.method public d()LM/l;
    .locals 1

    iget-object v0, p0, LM/E;->d:LM/l;

    return-object v0
.end method

.method public e()LM/k;
    .locals 1

    iget-object v0, p0, LM/E;->e:LM/k;

    return-object v0
.end method

.method public f(Lmh/l;)V
    .locals 0

    return-void
.end method

.method public g()I
    .locals 1

    iget v0, p0, LM/E;->c:I

    return v0
.end method

.method public h()LM/k;
    .locals 1

    iget-object v0, p0, LM/E;->e:LM/k;

    return-object v0
.end method

.method public i()LM/e;
    .locals 2

    invoke-virtual {p0}, LM/E;->l()I

    move-result v0

    invoke-virtual {p0}, LM/E;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    sget-object v0, LM/e;->NOT_CROSSED:LM/e;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LM/E;->l()I

    move-result v0

    invoke-virtual {p0}, LM/E;->g()I

    move-result v1

    if-le v0, v1, :cond_1

    sget-object v0, LM/e;->CROSSED:LM/e;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM/E;->e:LM/k;

    invoke-virtual {v0}, LM/k;->d()LM/e;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public j(LM/x;)Z
    .locals 2

    invoke-virtual {p0}, LM/E;->d()LM/l;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    instance-of v0, p1, LM/E;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LM/E;->l()I

    move-result v0

    check-cast p1, LM/E;

    invoke-virtual {p1}, LM/E;->l()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LM/E;->g()I

    move-result v0

    invoke-virtual {p1}, LM/E;->g()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LM/E;->b()Z

    move-result v0

    invoke-virtual {p1}, LM/E;->b()Z

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LM/E;->e:LM/k;

    iget-object p1, p1, LM/E;->e:LM/k;

    invoke-virtual {v0, p1}, LM/k;->m(LM/k;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public k()LM/k;
    .locals 1

    iget-object v0, p0, LM/E;->e:LM/k;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, LM/E;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SingleSelectionLayout(isStartHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LM/E;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", crossed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LM/E;->i()LM/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", info=\n\t"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM/E;->e:LM/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
