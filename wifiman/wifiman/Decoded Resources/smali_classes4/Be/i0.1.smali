.class public final synthetic LBe/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LBe/b0;

.field public final synthetic b:Lk0/e;


# direct methods
.method public synthetic constructor <init>(LBe/b0;Lk0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/i0;->a:LBe/b0;

    iput-object p2, p0, LBe/i0;->b:Lk0/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LBe/i0;->a:LBe/b0;

    iget-object v1, p0, LBe/i0;->b:Lk0/e;

    check-cast p1, LF/B;

    invoke-static {v0, v1, p1}, LBe/m0$a;->e(LBe/b0;Lk0/e;LF/B;)LYg/J;

    move-result-object p1

    return-object p1
.end method
