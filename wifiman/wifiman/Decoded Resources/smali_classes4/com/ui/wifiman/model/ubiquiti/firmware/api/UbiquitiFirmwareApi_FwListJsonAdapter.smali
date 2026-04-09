.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;",
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
        "(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;",
        "b",
        "LY6/h;",
        "nullableListOfApiUbiquitiFirmwareAdapter",
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


# direct methods
.method public constructor <init>(LY6/r;)V
    .locals 3

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LY6/h;-><init>()V

    const-string v0, "firmware"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->a:LY6/k$b;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljava/util/List;

    invoke-static {v1, v0}, LY6/v;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    const-string v2, "fw"

    invoke-virtual {p1, v0, v1, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object p1

    const-string v0, "adapter(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->b:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->l(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->m(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;
    .locals 3

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY6/k;->g()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->a:LY6/k$b;

    invoke-virtual {p1, v1}, LY6/k;->p0(LY6/k$b;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LY6/k;->j()V

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;

    invoke-direct {p1, v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public m(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string v0, "firmware"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_FwListJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$FwList;->a()Ljava/util/List;

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
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x30

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "UbiquitiFirmwareApi.FwList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
