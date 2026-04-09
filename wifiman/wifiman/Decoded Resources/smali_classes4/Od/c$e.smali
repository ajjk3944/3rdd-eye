.class final LOd/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/c;-><init>(LZc/f;Lfd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LOd/c;


# direct methods
.method constructor <init>(LOd/c;)V
    .locals 0

    iput-object p1, p0, LOd/c$e;->a:LOd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)Lgg/z;
    .locals 0

    invoke-static {p0}, LOd/c$e;->c(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Throwable;)Lgg/z;
    .locals 1

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/squareup/moshi/JsonDataException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_1

    instance-of v0, p0, Lretrofit2/HttpException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPd/d;

    invoke-virtual {p0, p1}, LOd/c$e;->b(LPd/d;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LPd/d;)LDj/a;
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object v1, p0, LOd/c$e;->a:LOd/c;

    invoke-static {v1}, LOd/c;->d(LOd/c;)Lgg/i;

    move-result-object v1

    sget-object v2, LOd/c$e$a;->a:LOd/c$e$a;

    invoke-virtual {v1, v2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, LOd/c$e$b;

    invoke-direct {v2, p1}, LOd/c$e$b;-><init>(LPd/d;)V

    invoke-virtual {v1, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v1, LOd/c$e$c;->a:LOd/c$e$c;

    invoke-virtual {p1, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v1, LOd/c$e$d;->a:LOd/c$e$d;

    invoke-virtual {p1, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    sget-object v1, LOd/c$e$e;->a:LOd/c$e$e;

    invoke-virtual {p1, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    new-instance v1, LOd/c$e$f;

    iget-object v2, p0, LOd/c$e;->a:LOd/c;

    invoke-direct {v1, v2}, LOd/c$e$f;-><init>(LOd/c;)V

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v1, "map(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LOd/d;

    invoke-direct {v1}, LOd/d;-><init>()V

    invoke-static {p1, v1}, Lfe/h;->d(Lgg/z;Lmh/l;)Lgg/s;

    move-result-object p1

    new-instance v1, LOd/c$e$g;

    iget-object v2, p0, LOd/c$e;->a:LOd/c;

    invoke-direct {v1, v0, v2}, LOd/c$e$g;-><init>(Lkotlin/jvm/internal/N;LOd/c;)V

    invoke-virtual {p1, v1}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    new-instance v1, LOd/c$e$h;

    invoke-direct {v1, v0}, LOd/c$e$h;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v1}, Lgg/s;->v0(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v0}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
