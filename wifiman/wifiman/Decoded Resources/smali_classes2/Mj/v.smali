.class final LMj/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMj/v$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Ljava/lang/reflect/Method;

.field private final c:Lokhttp3/HttpUrl;

.field final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lokhttp3/Headers;

.field private final g:Lokhttp3/MediaType;

.field private final h:Z

.field private final i:Z

.field private final j:Z

.field private final k:[LMj/r;

.field final l:Z


# direct methods
.method constructor <init>(LMj/v$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, LMj/v$a;->b:Ljava/lang/Class;

    iput-object v0, p0, LMj/v;->a:Ljava/lang/Class;

    iget-object v0, p1, LMj/v$a;->c:Ljava/lang/reflect/Method;

    iput-object v0, p0, LMj/v;->b:Ljava/lang/reflect/Method;

    iget-object v0, p1, LMj/v$a;->a:LMj/x;

    iget-object v0, v0, LMj/x;->c:Lokhttp3/HttpUrl;

    iput-object v0, p0, LMj/v;->c:Lokhttp3/HttpUrl;

    iget-object v0, p1, LMj/v$a;->o:Ljava/lang/String;

    iput-object v0, p0, LMj/v;->d:Ljava/lang/String;

    iget-object v0, p1, LMj/v$a;->s:Ljava/lang/String;

    iput-object v0, p0, LMj/v;->e:Ljava/lang/String;

    iget-object v0, p1, LMj/v$a;->t:Lokhttp3/Headers;

    iput-object v0, p0, LMj/v;->f:Lokhttp3/Headers;

    iget-object v0, p1, LMj/v$a;->u:Lokhttp3/MediaType;

    iput-object v0, p0, LMj/v;->g:Lokhttp3/MediaType;

    iget-boolean v0, p1, LMj/v$a;->p:Z

    iput-boolean v0, p0, LMj/v;->h:Z

    iget-boolean v0, p1, LMj/v$a;->q:Z

    iput-boolean v0, p0, LMj/v;->i:Z

    iget-boolean v0, p1, LMj/v$a;->r:Z

    iput-boolean v0, p0, LMj/v;->j:Z

    iget-object v0, p1, LMj/v$a;->w:[LMj/r;

    iput-object v0, p0, LMj/v;->k:[LMj/r;

    iget-boolean p1, p1, LMj/v$a;->x:Z

    iput-boolean p1, p0, LMj/v;->l:Z

    return-void
.end method

.method static b(LMj/x;Ljava/lang/Class;Ljava/lang/reflect/Method;)LMj/v;
    .locals 1

    new-instance v0, LMj/v$a;

    invoke-direct {v0, p0, p1, p2}, LMj/v$a;-><init>(LMj/x;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    invoke-virtual {v0}, LMj/v$a;->b()LMj/v;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method a(Ljava/lang/Object;[Ljava/lang/Object;)Lokhttp3/Request;
    .locals 12

    iget-object v0, p0, LMj/v;->k:[LMj/r;

    array-length v1, p2

    array-length v2, v0

    if-ne v1, v2, :cond_2

    new-instance v2, LMj/u;

    iget-object v4, p0, LMj/v;->d:Ljava/lang/String;

    iget-object v5, p0, LMj/v;->c:Lokhttp3/HttpUrl;

    iget-object v6, p0, LMj/v;->e:Ljava/lang/String;

    iget-object v7, p0, LMj/v;->f:Lokhttp3/Headers;

    iget-object v8, p0, LMj/v;->g:Lokhttp3/MediaType;

    iget-boolean v9, p0, LMj/v;->h:Z

    iget-boolean v10, p0, LMj/v;->i:Z

    iget-boolean v11, p0, LMj/v;->j:Z

    move-object v3, v2

    invoke-direct/range {v3 .. v11}, LMj/u;-><init>(Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/MediaType;ZZZ)V

    iget-boolean v3, p0, LMj/v;->l:Z

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, -0x1

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, p2, v4

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-object v5, v0, v4

    aget-object v6, p2, v4

    invoke-virtual {v5, v2, v6}, LMj/r;->a(LMj/u;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, LMj/u;->k()Lokhttp3/Request$Builder;

    move-result-object p2

    new-instance v0, LMj/n;

    iget-object v1, p0, LMj/v;->a:Ljava/lang/Class;

    iget-object v2, p0, LMj/v;->b:Ljava/lang/reflect/Method;

    invoke-direct {v0, v1, p1, v2, v3}, LMj/n;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/List;)V

    const-class p1, LMj/n;

    invoke-virtual {p2, p1, v0}, Lokhttp3/Request$Builder;->g(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Argument count ("

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") doesn\'t match expected count ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
