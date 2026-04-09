.class public final synthetic LBe/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/K;

.field public final synthetic b:LQ/A;

.field public final synthetic c:Lkotlin/jvm/internal/K;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/I;->a:Lkotlin/jvm/internal/K;

    iput-object p2, p0, LBe/I;->b:LQ/A;

    iput-object p3, p0, LBe/I;->c:Lkotlin/jvm/internal/K;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LBe/I;->a:Lkotlin/jvm/internal/K;

    iget-object v1, p0, LBe/I;->b:LQ/A;

    iget-object v2, p0, LBe/I;->c:Lkotlin/jvm/internal/K;

    check-cast p1, Lr/h;

    invoke-static {v0, v1, v2, p1}, LBe/M;->b(Lkotlin/jvm/internal/K;LQ/A;Lkotlin/jvm/internal/K;Lr/h;)LYg/J;

    move-result-object p1

    return-object p1
.end method
