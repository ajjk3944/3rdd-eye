.class public final LTh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTh/a$a;
    }
.end annotation


# instance fields
.field private final a:LTh/a$a;

.field private final b:LYh/e;

.field private final c:[Ljava/lang/String;

.field private final d:[Ljava/lang/String;

.field private final e:[Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:I

.field private final h:Ljava/lang/String;

.field private final i:[B


# direct methods
.method public constructor <init>(LTh/a$a;LYh/e;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[B)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTh/a;->a:LTh/a$a;

    iput-object p2, p0, LTh/a;->b:LYh/e;

    iput-object p3, p0, LTh/a;->c:[Ljava/lang/String;

    iput-object p4, p0, LTh/a;->d:[Ljava/lang/String;

    iput-object p5, p0, LTh/a;->e:[Ljava/lang/String;

    iput-object p6, p0, LTh/a;->f:Ljava/lang/String;

    iput p7, p0, LTh/a;->g:I

    iput-object p8, p0, LTh/a;->h:Ljava/lang/String;

    iput-object p9, p0, LTh/a;->i:[B

    return-void
.end method

.method private final h(II)Z
    .locals 0

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final a()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTh/a;->c:[Ljava/lang/String;

    return-object v0
.end method

.method public final b()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTh/a;->d:[Ljava/lang/String;

    return-object v0
.end method

.method public final c()LTh/a$a;
    .locals 1

    iget-object v0, p0, LTh/a;->a:LTh/a$a;

    return-object v0
.end method

.method public final d()LYh/e;
    .locals 1

    iget-object v0, p0, LTh/a;->b:LYh/e;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LTh/a;->f:Ljava/lang/String;

    iget-object v1, p0, LTh/a;->a:LTh/a$a;

    sget-object v2, LTh/a$a;->MULTIFILE_CLASS_PART:LTh/a$a;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 4

    iget-object v0, p0, LTh/a;->c:[Ljava/lang/String;

    iget-object v1, p0, LTh/a;->a:LTh/a$a;

    sget-object v2, LTh/a$a;->MULTIFILE_CLASS:LTh/a$a;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LZg/n;->e([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    :cond_2
    return-object v3
.end method

.method public final g()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTh/a;->e:[Ljava/lang/String;

    return-object v0
.end method

.method public final i()Z
    .locals 2

    iget v0, p0, LTh/a;->g:I

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, LTh/a;->h(II)Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 2

    iget v0, p0, LTh/a;->g:I

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, LTh/a;->h(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LTh/a;->g:I

    const/16 v1, 0x20

    invoke-direct {p0, v0, v1}, LTh/a;->h(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LTh/a;->a:LTh/a$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LTh/a;->b:LYh/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
