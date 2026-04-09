.class public final Lcom/ui/uidb/api/ApiProductJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/uidb/api/ApiProduct;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u0019R\"\u0010&\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u0019R\"\u0010)\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010\u0019R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010\u0019R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u0010\u0019R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0019\u00a8\u00068"
    }
    d2 = {
        "Lcom/ui/uidb/api/ApiProductJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/uidb/api/ApiProduct;",
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
        "(LY6/k;)Lcom/ui/uidb/api/ApiProduct;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/uidb/api/ApiProduct;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "b",
        "LY6/h;",
        "nullableStringAdapter",
        "Lcom/ui/uidb/api/ApiProduct$Names;",
        "c",
        "nullableNamesAdapter",
        "Lcom/ui/uidb/api/ApiProduct$Line;",
        "d",
        "nullableLineAdapter",
        "",
        "e",
        "nullableMapOfStringStringAdapter",
        "",
        "f",
        "nullableListOfStringAdapter",
        "Lcom/ui/uidb/api/ApiProduct$Triplet;",
        "g",
        "nullableListOfTripletAdapter",
        "Lcom/ui/uidb/api/ApiProductUnifi;",
        "h",
        "nullableApiProductUnifiAdapter",
        "Lcom/ui/uidb/api/ApiProductUisp;",
        "i",
        "nullableApiProductUispAdapter",
        "Lcom/ui/uidb/api/ApiProduct$Btle;",
        "j",
        "nullableBtleAdapter",
        "Lcom/ui/uidb/api/ApiProductCompliance;",
        "k",
        "nullableApiProductComplianceAdapter",
        "",
        "nullableBooleanAdapter",
        "uidb"
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

.field private final f:LY6/h;

.field private final g:LY6/h;

.field private final h:LY6/h;

.field private final i:LY6/h;

.field private final j:LY6/h;

.field private final k:LY6/h;

.field private final l:LY6/h;


# direct methods
.method public constructor <init>(LY6/r;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LY6/h;-><init>()V

    const-string/jumbo v17, "minAdoptVersion"

    const-string/jumbo v18, "isARSupported"

    const-string/jumbo v3, "id"

    const-string/jumbo v4, "product"

    const-string/jumbo v5, "line"

    const-string/jumbo v6, "deviceType"

    const-string/jumbo v7, "images"

    const-string/jumbo v8, "videos"

    const-string/jumbo v9, "sysids"

    const-string/jumbo v10, "triplets"

    const-string/jumbo v11, "unifi"

    const-string/jumbo v12, "uisp"

    const-string/jumbo v13, "btle"

    const-string/jumbo v14, "shortnames"

    const-string/jumbo v15, "guids"

    const-string/jumbo v16, "compliance"

    filled-new-array/range {v3 .. v18}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v2

    const-string/jumbo v3, "of(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->a:LY6/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v3, "id"

    const-class v4, Ljava/lang/String;

    invoke-virtual {v1, v4, v2, v3}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    const-string/jumbo v3, "adapter(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->b:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v5, "names"

    const-class v6, Lcom/ui/uidb/api/ApiProduct$Names;

    invoke-virtual {v1, v6, v2, v5}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->c:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v5, "line"

    const-class v6, Lcom/ui/uidb/api/ApiProduct$Line;

    invoke-virtual {v1, v6, v2, v5}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->d:LY6/h;

    const-class v2, Ljava/util/Map;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/reflect/Type;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    const/4 v7, 0x1

    aput-object v4, v5, v7

    invoke-static {v2, v5}, LY6/v;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v2

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v5

    const-string/jumbo v8, "image"

    invoke-virtual {v1, v2, v5, v8}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    new-array v2, v7, [Ljava/lang/reflect/Type;

    aput-object v4, v2, v6

    const-class v4, Ljava/util/List;

    invoke-static {v4, v2}, LY6/v;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v2

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v5

    const-string/jumbo v8, "systemIds"

    invoke-virtual {v1, v2, v5, v8}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    new-array v2, v7, [Ljava/lang/reflect/Type;

    const-class v5, Lcom/ui/uidb/api/ApiProduct$Triplet;

    aput-object v5, v2, v6

    invoke-static {v4, v2}, LY6/v;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v2

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v4

    const-string/jumbo v5, "lookupTriplets"

    invoke-virtual {v1, v2, v4, v5}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->g:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v4, "unifi"

    const-class v5, Lcom/ui/uidb/api/ApiProductUnifi;

    invoke-virtual {v1, v5, v2, v4}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->h:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v4, "uisp"

    const-class v5, Lcom/ui/uidb/api/ApiProductUisp;

    invoke-virtual {v1, v5, v2, v4}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->i:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v4, "btle"

    const-class v5, Lcom/ui/uidb/api/ApiProduct$Btle;

    invoke-virtual {v1, v5, v2, v4}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->j:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v4, "compliance"

    const-class v5, Lcom/ui/uidb/api/ApiProductCompliance;

    invoke-virtual {v1, v5, v2, v4}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->k:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string/jumbo v4, "isArSupported"

    const-class v5, Ljava/lang/Boolean;

    invoke-virtual {v1, v5, v2, v4}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->l:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/uidb/api/ApiProductJsonAdapter;->l(LY6/k;)Lcom/ui/uidb/api/ApiProduct;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/uidb/api/ApiProduct;

    invoke-virtual {p0, p1, p2}, Lcom/ui/uidb/api/ApiProductJsonAdapter;->m(LY6/o;Lcom/ui/uidb/api/ApiProduct;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/uidb/api/ApiProduct;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LY6/k;->g()V

    const/4 v2, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    :goto_0
    invoke-virtual/range {p1 .. p1}, LY6/k;->s()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->a:LY6/k$b;

    invoke-virtual {v1, v2}, LY6/k;->p0(LY6/k$b;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->l:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/Boolean;

    goto :goto_0

    :pswitch_1
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/util/Map;

    goto :goto_0

    :pswitch_2
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->k:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/ui/uidb/api/ApiProductCompliance;

    goto :goto_0

    :pswitch_3
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/util/List;

    goto :goto_0

    :pswitch_4
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    goto :goto_0

    :pswitch_5
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->j:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/ui/uidb/api/ApiProduct$Btle;

    goto :goto_0

    :pswitch_6
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->i:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/ui/uidb/api/ApiProductUisp;

    goto :goto_0

    :pswitch_7
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->h:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/ui/uidb/api/ApiProductUnifi;

    goto :goto_0

    :pswitch_8
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->g:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/util/List;

    goto :goto_0

    :pswitch_9
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/util/List;

    goto :goto_0

    :pswitch_a
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/Map;

    goto/16 :goto_0

    :pswitch_b
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/Map;

    goto/16 :goto_0

    :pswitch_c
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_d
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->d:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/ui/uidb/api/ApiProduct$Line;

    goto/16 :goto_0

    :pswitch_e
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->c:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/ui/uidb/api/ApiProduct$Names;

    goto/16 :goto_0

    :pswitch_f
    iget-object v2, v0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual/range {p1 .. p1}, LY6/k;->t0()V

    invoke-virtual/range {p1 .. p1}, LY6/k;->u0()V

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LY6/k;->j()V

    new-instance v1, Lcom/ui/uidb/api/ApiProduct;

    move-object v3, v1

    invoke-direct/range {v3 .. v19}, Lcom/ui/uidb/api/ApiProduct;-><init>(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)V

    return-object v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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

.method public m(LY6/o;Lcom/ui/uidb/api/ApiProduct;)V
    .locals 2

    const-string/jumbo v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string/jumbo v0, "id"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "product"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->i()Lcom/ui/uidb/api/ApiProduct$Names;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "line"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->f()Lcom/ui/uidb/api/ApiProduct$Line;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "deviceType"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "images"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->e()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "videos"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->o()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "sysids"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->k()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "triplets"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->g:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "unifi"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->h:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->n()Lcom/ui/uidb/api/ApiProductUnifi;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "uisp"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->i:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->m()Lcom/ui/uidb/api/ApiProductUisp;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "btle"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->j:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->a()Lcom/ui/uidb/api/ApiProduct$Btle;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "shortnames"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->j()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "guids"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->f:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "compliance"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->k:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->b()Lcom/ui/uidb/api/ApiProductCompliance;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "minAdoptVersion"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->e:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->h()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "isARSupported"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductJsonAdapter;->l:LY6/h;

    invoke-virtual {p2}, Lcom/ui/uidb/api/ApiProduct;->p()Ljava/lang/Boolean;

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

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ApiProduct"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
