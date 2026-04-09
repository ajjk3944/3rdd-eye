.class Lbg/b$b;
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

.field private b:I

.field private c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:Linet/ipaddr/c$a;

.field final synthetic h:I

.field final synthetic i:Ljava/lang/Integer;


# direct methods
.method constructor <init>(IIILinet/ipaddr/c$a;ILjava/lang/Integer;)V
    .locals 0

    iput p1, p0, Lbg/b$b;->d:I

    iput p2, p0, Lbg/b$b;->e:I

    iput p3, p0, Lbg/b$b;->f:I

    iput-object p4, p0, Lbg/b$b;->g:Linet/ipaddr/c$a;

    iput p5, p0, Lbg/b$b;->h:I

    iput-object p6, p0, Lbg/b$b;->i:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, 0x1

    iput-boolean p4, p0, Lbg/b$b;->a:Z

    ushr-int/2addr p1, p3

    iput p1, p0, Lbg/b$b;->b:I

    ushr-int p1, p2, p3

    iput p1, p0, Lbg/b$b;->c:I

    return-void
.end method


# virtual methods
.method public a()LZf/d;
    .locals 5

    iget-boolean v0, p0, Lbg/b$b;->a:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lbg/b$b;->b:I

    iget v1, p0, Lbg/b$b;->f:I

    shl-int v1, v0, v1

    iget-object v2, p0, Lbg/b$b;->g:Linet/ipaddr/c$a;

    iget v3, p0, Lbg/b$b;->h:I

    or-int/2addr v3, v1

    iget-object v4, p0, Lbg/b$b;->i:Ljava/lang/Integer;

    invoke-interface {v2, v1, v3, v4}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    iget v2, p0, Lbg/b$b;->c:I

    if-le v0, v2, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbg/b$b;->a:Z

    goto :goto_0

    :cond_0
    iput v0, p0, Lbg/b$b;->b:I

    :goto_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lbg/b$b;->a:Z

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/b$b;->a()LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
