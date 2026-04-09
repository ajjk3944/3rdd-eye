.class public final Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/wmw/api/v1/ApiV1Settings;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/wmw/api/v1/ApiV1Settings;",
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
        "(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1Settings;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/wmw/api/v1/ApiV1Settings;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "b",
        "LY6/h;",
        "nullableStringAdapter",
        "",
        "c",
        "booleanAdapter",
        "",
        "d",
        "longAdapter",
        "Ljava/lang/reflect/Constructor;",
        "e",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "wifiman-wizard_release"
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

.field private volatile e:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(LY6/r;)V
    .locals 4

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LY6/h;-><init>()V

    const-string v0, "hwResetBlocked"

    const-string v1, "autoSleepTime"

    const-string v2, "name"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->a:LY6/k$b;

    const-class v0, Ljava/lang/String;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string v1, "adapter(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->b:LY6/h;

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string v3, "isHwResetButtonBlocked"

    invoke-virtual {p1, v0, v2, v3}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->c:LY6/h;

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string v3, "autoSleepTimeMillis"

    invoke-virtual {p1, v0, v2, v3}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->d:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->l(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1Settings;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->m(LY6/o;Lcom/ui/wmw/api/v1/ApiV1Settings;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1Settings;
    .locals 9

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1}, LY6/k;->g()V

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v5, v2

    move v4, v3

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->a:LY6/k$b;

    invoke-virtual {p1, v6}, LY6/k;->p0(LY6/k$b;)I

    move-result v6

    if-eq v6, v3, :cond_5

    if-eqz v6, :cond_4

    const/4 v7, 0x1

    if-eq v6, v7, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->d:LY6/h;

    invoke-virtual {v1, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    if-eqz v1, :cond_1

    and-int/lit8 v4, v4, -0x5

    goto :goto_0

    :cond_1
    const-string v0, "autoSleepTimeMillis"

    const-string v1, "autoSleepTime"

    invoke-static {v0, v1, p1}, La7/c;->w(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    :cond_2
    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    and-int/lit8 v4, v4, -0x3

    goto :goto_0

    :cond_3
    const-string v0, "isHwResetButtonBlocked"

    const-string v1, "hwResetBlocked"

    invoke-static {v0, v1, p1}, La7/c;->w(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1

    :cond_4
    iget-object v5, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->b:LY6/h;

    invoke-virtual {v5, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, LY6/k;->j()V

    const/4 p1, -0x7

    if-ne v4, p1, :cond_7

    new-instance p1, Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-direct {p1, v5, v0, v1, v2}, Lcom/ui/wmw/api/v1/ApiV1Settings;-><init>(Ljava/lang/String;ZJ)V

    return-object p1

    :cond_7
    iget-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->e:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_8

    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v7, La7/c;->c:Ljava/lang/Class;

    const-class v8, Ljava/lang/String;

    filled-new-array {v8, p1, v3, v6, v7}, [Ljava/lang/Class;

    move-result-object p1

    const-class v3, Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->e:Ljava/lang/reflect/Constructor;

    const-string v3, "also(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v5, v0, v1, v3, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "newInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1Settings;

    return-object p1
.end method

.method public m(LY6/o;Lcom/ui/wmw/api/v1/ApiV1Settings;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string v0, "name"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1Settings;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "hwResetBlocked"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1Settings;->c()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "autoSleepTime"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1Settings;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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

    const/16 v1, 0x23

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ApiV1Settings"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
