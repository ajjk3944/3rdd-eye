.class Lbg/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg/b;->b2(LZf/d;IIILinet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:I

.field private d:I

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:I

.field final synthetic i:Linet/ipaddr/c$a;

.field final synthetic j:Ljava/lang/Integer;


# direct methods
.method constructor <init>(IIIILinet/ipaddr/c$a;Ljava/lang/Integer;)V
    .locals 0

    iput p1, p0, Lbg/b$c;->e:I

    iput p2, p0, Lbg/b$c;->f:I

    iput p3, p0, Lbg/b$c;->g:I

    iput p4, p0, Lbg/b$c;->h:I

    iput-object p5, p0, Lbg/b$c;->i:Linet/ipaddr/c$a;

    iput-object p6, p0, Lbg/b$c;->j:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, 0x1

    iput-boolean p4, p0, Lbg/b$c;->a:Z

    ushr-int/2addr p1, p3

    iput p1, p0, Lbg/b$c;->c:I

    ushr-int p1, p2, p3

    iput p1, p0, Lbg/b$c;->d:I

    return-void
.end method


# virtual methods
.method public a()LZf/d;
    .locals 5

    iget-boolean v0, p0, Lbg/b$c;->a:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lbg/b$c;->c:I

    iget v1, p0, Lbg/b$c;->g:I

    shl-int v1, v0, v1

    iget v2, p0, Lbg/b$c;->h:I

    or-int/2addr v2, v1

    const/4 v3, 0x1

    add-int/2addr v0, v3

    iput v0, p0, Lbg/b$c;->c:I

    iget-boolean v4, p0, Lbg/b$c;->b:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lbg/b$c;->e:I

    iput-boolean v3, p0, Lbg/b$c;->b:Z

    :goto_0
    iget v3, p0, Lbg/b$c;->d:I

    if-gt v0, v3, :cond_1

    goto :goto_1

    :cond_1
    iget v2, p0, Lbg/b$c;->f:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbg/b$c;->a:Z

    :goto_1
    iget-object v0, p0, Lbg/b$c;->i:Linet/ipaddr/c$a;

    iget-object v3, p0, Lbg/b$c;->j:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2, v3}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lbg/b$c;->a:Z

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/b$c;->a()LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
