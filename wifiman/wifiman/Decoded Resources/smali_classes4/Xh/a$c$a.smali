.class final LXh/a$c$a;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXh/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LXh/a$c$a;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$c;

    move-result-object p1

    return-object p1
.end method

.method public j(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;)LXh/a$c;
    .locals 2

    new-instance v0, LXh/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LXh/a$c;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;LXh/a$a;)V

    return-object v0
.end method
