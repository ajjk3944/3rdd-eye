.class public final synthetic LBe/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LBe/b0;


# direct methods
.method public synthetic constructor <init>(LBe/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/j0;->a:LBe/b0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBe/j0;->a:LBe/b0;

    check-cast p1, LR0/Q;

    invoke-static {v0, p1}, LBe/m0$a;->c(LBe/b0;LR0/Q;)LYg/J;

    move-result-object p1

    return-object p1
.end method
