.class LBh/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LBh/e0;

.field private final b:Lkotlin/reflect/jvm/internal/impl/types/checker/g;


# direct methods
.method public constructor <init>(LBh/e0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/d0;->a:LBh/e0;

    iput-object p2, p0, LBh/d0;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LBh/d0;->a:LBh/e0;

    iget-object v1, p0, LBh/d0;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static {v0, v1}, LBh/e0;->b(LBh/e0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object v0

    return-object v0
.end method
