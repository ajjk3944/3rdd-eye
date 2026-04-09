.class LMh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LMh/k;

.field private final b:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;


# direct methods
.method public constructor <init>(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMh/b;->a:LMh/k;

    iput-object p2, p0, LMh/b;->b:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LMh/b;->a:LMh/k;

    iget-object v1, p0, LMh/b;->b:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    invoke-static {v0, v1}, LMh/c;->b(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LJh/E;

    move-result-object v0

    return-object v0
.end method
