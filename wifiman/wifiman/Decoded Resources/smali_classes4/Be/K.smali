.class public final synthetic LBe/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:F

.field public final synthetic c:LQ/z;


# direct methods
.method public synthetic constructor <init>(ZFLQ/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LBe/K;->a:Z

    iput p2, p0, LBe/K;->b:F

    iput-object p3, p0, LBe/K;->c:LQ/z;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, LBe/K;->a:Z

    iget v1, p0, LBe/K;->b:F

    iget-object v2, p0, LBe/K;->c:LQ/z;

    invoke-static {v0, v1, v2}, LBe/M$a;->b(ZFLQ/z;)LYg/J;

    move-result-object v0

    return-object v0
.end method
