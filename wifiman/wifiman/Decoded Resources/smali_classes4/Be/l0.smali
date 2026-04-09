.class public final synthetic LBe/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LBe/n0;


# direct methods
.method public synthetic constructor <init>(LBe/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/l0;->a:LBe/n0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBe/l0;->a:LBe/n0;

    check-cast p1, LT/L;

    invoke-static {v0, p1}, LBe/m0$a;->b(LBe/n0;LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
