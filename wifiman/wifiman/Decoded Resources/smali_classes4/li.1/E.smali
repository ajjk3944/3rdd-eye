.class Lli/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lli/K;

.field private final b:Lkotlin/reflect/jvm/internal/impl/protobuf/n;

.field private final c:Lli/d;


# direct methods
.method public constructor <init>(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/E;->a:Lli/K;

    iput-object p2, p0, Lli/E;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    iput-object p3, p0, Lli/E;->c:Lli/d;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lli/E;->a:Lli/K;

    iget-object v1, p0, Lli/E;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    iget-object v2, p0, Lli/E;->c:Lli/d;

    invoke-static {v0, v1, v2}, Lli/K;->c(Lli/K;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
