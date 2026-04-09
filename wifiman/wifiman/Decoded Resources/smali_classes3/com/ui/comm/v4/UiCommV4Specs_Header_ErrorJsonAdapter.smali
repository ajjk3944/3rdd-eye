.class public final Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0019R\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0019\u00a8\u0006#"
    }
    d2 = {
        "Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;",
        "LY6/r;",
        "moshi",
        "<init>",
        "(LY6/r;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "LY6/k;",
        "reader",
        "l",
        "(LY6/k;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "b",
        "LY6/h;",
        "stringAdapter",
        "",
        "c",
        "longAdapter",
        "d",
        "nullableStringAdapter",
        "",
        "e",
        "intAdapter",
        "ui-communication-v4_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:LY6/k$b;

.field private final b:LY6/h;

.field private final c:LY6/h;

.field private final d:LY6/h;

.field private final e:LY6/h;


# direct methods
.method public constructor <init>(LY6/r;)V
    .locals 6

    const-string/jumbo v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LY6/h;-><init>()V

    const-string/jumbo v0, "id"

    const-string/jumbo v1, "timestamp"

    const-string/jumbo v2, "error"

    const-string/jumbo v3, "errorCode"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v0

    const-string/jumbo v4, "of(\"id\", \"timestamp\", \"error\",\n      \"errorCode\")"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->a:LY6/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string/jumbo v4, "guid"

    const-class v5, Ljava/lang/String;

    invoke-virtual {p1, v5, v0, v4}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string/jumbo v4, "moshi.adapter(String::cl\u2026emptySet(),\n      \"guid\")"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->b:LY6/h;

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {p1, v0, v4, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string/jumbo v1, "moshi.adapter(Long::clas\u2026Set(),\n      \"timestamp\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->c:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v5, v0, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string/jumbo v1, "moshi.adapter(String::cl\u2026     emptySet(), \"error\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->d:LY6/h;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v3}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object p1

    const-string/jumbo v0, "moshi.adapter(Int::class\u2026 emptySet(), \"errorCode\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->e:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->l(LY6/k;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    invoke-virtual {p0, p1, p2}, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->m(LY6/o;Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;
    .locals 10

    const-string/jumbo v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY6/k;->g()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    move-object v5, v2

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v3

    const-string/jumbo v4, "id"

    const-string/jumbo v6, "guid"

    const-string/jumbo v7, "timestamp"

    const-string/jumbo v8, "errorCode"

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->a:LY6/k$b;

    invoke-virtual {p1, v3}, LY6/k;->p0(LY6/k$b;)I

    move-result v3

    const/4 v9, -0x1

    if-eq v3, v9, :cond_7

    if-eqz v3, :cond_5

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->e:LY6/h;

    invoke-virtual {v1, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v8, v8, p1}, La7/c;->w(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    const-string/jumbo v0, "unexpectedNull(\"errorCod\u2026     \"errorCode\", reader)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v3, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->d:LY6/h;

    invoke-virtual {v3, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v7, v7, p1}, La7/c;->w(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    const-string/jumbo v0, "unexpectedNull(\"timestam\u2026     \"timestamp\", reader)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v2, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v6, v4, p1}, La7/c;->w(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    const-string/jumbo v0, "unexpectedNull(\"guid\", \"id\",\n            reader)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, LY6/k;->j()V

    new-instance v9, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    if-eqz v2, :cond_b

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v1, v9

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    return-object v9

    :cond_9
    invoke-static {v8, v8, p1}, La7/c;->o(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    const-string/jumbo v0, "missingProperty(\"errorCode\", \"errorCode\", reader)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {v7, v7, p1}, La7/c;->o(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    const-string/jumbo v0, "missingProperty(\"timestamp\", \"timestamp\", reader)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {v6, v4, p1}, La7/c;->o(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    const-string/jumbo v0, "missingProperty(\"guid\", \"id\", reader)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    throw p1
.end method

.method public m(LY6/o;Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;)V
    .locals 3

    const-string/jumbo v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string/jumbo v0, "id"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "timestamp"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "error"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "errorCode"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs_Header_ErrorJsonAdapter;->e:LY6/h;

    invoke-virtual {p2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    invoke-virtual {p1}, LY6/o;->v()LY6/o;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x30

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "UiCommV4Specs.Header.Error"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
