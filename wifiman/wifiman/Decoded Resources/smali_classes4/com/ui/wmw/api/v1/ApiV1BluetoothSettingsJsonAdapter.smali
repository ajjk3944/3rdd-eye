.class public final Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;",
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
        "(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "b",
        "LY6/h;",
        "stringAdapter",
        "",
        "c",
        "nullableIntAdapter",
        "",
        "d",
        "nullableBooleanAdapter",
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
    .locals 7

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LY6/h;-><init>()V

    const-string v5, "latency"

    const-string v6, "enableLatency"

    const-string v1, "btMode"

    const-string v2, "intervalMin"

    const-string v3, "intervalMax"

    const-string v4, "timeout"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v0

    const-string v1, "of(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->a:LY6/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v1, "modeId"

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v0, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string v1, "adapter(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->b:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v2, "intervalMin"

    const-class v3, Ljava/lang/Integer;

    invoke-virtual {p1, v3, v0, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string v2, "enableLatency"

    const-class v3, Ljava/lang/Boolean;

    invoke-virtual {p1, v3, v0, v2}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->d:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->l(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->m(LY6/o;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LY6/k;->g()V

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v6, v2

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    :goto_0
    invoke-virtual/range {p1 .. p1}, LY6/k;->s()Z

    move-result v4

    const-string v5, "btMode"

    const-string v11, "modeId"

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->a:LY6/k$b;

    invoke-virtual {v1, v4}, LY6/k;->p0(LY6/k$b;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->d:LY6/h;

    invoke-virtual {v4, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ljava/lang/Boolean;

    and-int/lit8 v3, v3, -0x21

    goto :goto_0

    :pswitch_1
    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {v4, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/lang/Integer;

    and-int/lit8 v3, v3, -0x11

    goto :goto_0

    :pswitch_2
    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {v4, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/Integer;

    and-int/lit8 v3, v3, -0x9

    goto :goto_0

    :pswitch_3
    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {v4, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/lang/Integer;

    and-int/lit8 v3, v3, -0x5

    goto :goto_0

    :pswitch_4
    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {v4, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/Integer;

    and-int/lit8 v3, v3, -0x3

    goto :goto_0

    :pswitch_5
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v11, v5, v1}, La7/c;->w(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :pswitch_6
    invoke-virtual/range {p1 .. p1}, LY6/k;->t0()V

    invoke-virtual/range {p1 .. p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, LY6/k;->j()V

    const/16 v4, -0x3f

    if-ne v3, v4, :cond_3

    new-instance v3, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    if-eqz v2, :cond_2

    move-object v4, v3

    move-object v5, v2

    invoke-direct/range {v4 .. v10}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-object v3

    :cond_2
    invoke-static {v11, v5, v1}, La7/c;->o(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :cond_3
    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->e:Ljava/lang/reflect/Constructor;

    if-nez v4, :cond_4

    sget-object v18, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v19, La7/c;->c:Ljava/lang/Class;

    const-class v12, Ljava/lang/String;

    const-class v13, Ljava/lang/Integer;

    const-class v14, Ljava/lang/Integer;

    const-class v15, Ljava/lang/Integer;

    const-class v16, Ljava/lang/Integer;

    const-class v17, Ljava/lang/Boolean;

    filled-new-array/range {v12 .. v19}, [Ljava/lang/Class;

    move-result-object v4

    const-class v12, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-virtual {v12, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    iput-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->e:Ljava/lang/reflect/Constructor;

    const-string v12, "also(...)"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    move-object v12, v4

    if-eqz v2, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v11, 0x0

    move-object v4, v2

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v1

    filled-new-array/range {v4 .. v11}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    return-object v1

    :cond_5
    invoke-static {v11, v5, v1}, La7/c;->o(Ljava/lang/String;Ljava/lang/String;LY6/k;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(LY6/o;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string v0, "btMode"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "intervalMin"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "intervalMax"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "timeout"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->f()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "latency"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "enableLatency"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;->a()Ljava/lang/Boolean;

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

    const/16 v1, 0x2c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ApiV1BluetoothSettings"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
