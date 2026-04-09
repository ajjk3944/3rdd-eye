.class public final synthetic LBe/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lk0/e;

.field public final synthetic b:LBe/b0;


# direct methods
.method public synthetic constructor <init>(Lk0/e;LBe/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/k0;->a:Lk0/e;

    iput-object p2, p0, LBe/k0;->b:LBe/b0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LBe/k0;->a:Lk0/e;

    iget-object v1, p0, LBe/k0;->b:LBe/b0;

    invoke-static {v0, v1}, LBe/m0$a;->a(Lk0/e;LBe/b0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
