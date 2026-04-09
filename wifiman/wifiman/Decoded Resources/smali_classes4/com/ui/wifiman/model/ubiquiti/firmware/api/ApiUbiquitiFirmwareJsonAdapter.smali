.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u0019\u00a8\u0006$"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;",
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
        "(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "b",
        "LY6/h;",
        "nullableStringAdapter",
        "",
        "c",
        "nullableLongAdapter",
        "",
        "d",
        "nullableIntAdapter",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;",
        "e",
        "nullableLinksAdapter",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
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
    .locals 13

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LY6/h;-><init>()V

    const-string v11, "version_prerelease"

    const-string v12, "_links"

    const-string v1, "id"

    const-string v2, "channel"

    const-string v3, "created"

    const-string v4, "product"

    const-string v5, "file_size"

    const-string v6, "sha256_checksum"

    const-string v7, "version"

    const-string v8, "version_major"

    const-string v9, "version_minor"

    const-string v10, "version_patch"

    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->a:LY6/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v1, "id"

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v0, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string v1, "adapter(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v2, "fileSize"

    const-class v3, Ljava/lang/Long;

    invoke-virtual {p1, v3, v0, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->c:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v2, "versionMajor"

    const-class v3, Ljava/lang/Integer;

    invoke-virtual {p1, v3, v0, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v2, "links"

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    invoke-virtual {p1, v3, v0, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->e:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->l(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->m(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;
    .locals 14

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY6/k;->g()V

    const/4 v0, 0x0

    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->a:LY6/k$b;

    invoke-virtual {p1, v0}, LY6/k;->p0(LY6/k$b;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->e:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;

    goto :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    :pswitch_9
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    goto :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, LY6/k;->j()V

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    move-object v1, p1

    invoke-direct/range {v1 .. v13}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)V

    return-object p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string v0, "id"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "channel"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "created"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "product"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "file_size"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "sha256_checksum"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "version"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "version_major"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "version_minor"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "version_patch"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "version_prerelease"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "_links"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmwareJsonAdapter;->e:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    invoke-virtual {p1}, LY6/o;->v()LY6/o;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "GeneratedJsonAdapter("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ApiUbiquitiFirmware"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
