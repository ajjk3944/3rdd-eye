.class public final Lcom/ui/wmw/api/v1/f$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/api/v1/f;->c()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/api/v1/f;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/f$i;->a:Lcom/ui/wmw/api/v1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/comm/v4/a$g;)Lgg/r;
    .locals 4

    const-string v0, "Failed to parse content body"

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$g;->a()Lcom/ui/comm/v4/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object v1

    array-length v1, v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/ui/wmw/api/v1/f$i;->a:Lcom/ui/wmw/api/v1/f;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$g;->a()Lcom/ui/comm/v4/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/comm/v4/b;->a()[B

    move-result-object p1

    :try_start_0
    invoke-static {v1}, Lcom/ui/wmw/api/v1/f;->r(Lcom/ui/wmw/api/v1/f;)LY6/r;

    move-result-object v1

    const-string v2, "access$getMoshi$p(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v2

    invoke-static {v1, v2}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v1

    invoke-virtual {v1}, LY6/h;->e()LY6/h;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v1, v2}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_3

    :cond_1
    :try_start_1
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    const-string v1, "Null content body when body expected"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p1, v1, v3, v2, v3}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_1
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_1
    new-instance v1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v1, v0, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    new-instance v1, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;

    invoke-direct {v1, v0, p1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/comm/v4/a$g;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/f$i;->a(Lcom/ui/comm/v4/a$g;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
