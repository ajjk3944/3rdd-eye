.class public final Lni/w$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lni/w$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

.field final synthetic b:Ljava/io/ByteArrayInputStream;

.field final synthetic c:Lni/w;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/p;Ljava/io/ByteArrayInputStream;Lni/w;)V
    .locals 0

    iput-object p1, p0, Lni/w$c$a;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    iput-object p2, p0, Lni/w$c$a;->b:Ljava/io/ByteArrayInputStream;

    iput-object p3, p0, Lni/w$c$a;->c:Lni/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 3

    iget-object v0, p0, Lni/w$c$a;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/p;

    iget-object v1, p0, Lni/w$c$a;->b:Ljava/io/ByteArrayInputStream;

    iget-object v2, p0, Lni/w$c$a;->c:Lni/w;

    invoke-virtual {v2}, Lni/w;->s()Lli/p;

    move-result-object v2

    invoke-virtual {v2}, Lli/p;->c()Lli/n;

    move-result-object v2

    invoke-virtual {v2}, Lli/n;->k()Lkotlin/reflect/jvm/internal/impl/protobuf/f;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/p;->c(Ljava/io/InputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lni/w$c$a;->a()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v0

    return-object v0
.end method
