.class public final synthetic LBe/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LQ/A;


# direct methods
.method public synthetic constructor <init>(LQ/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/J;->a:LQ/A;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBe/J;->a:LQ/A;

    check-cast p1, Lr/h;

    invoke-static {v0, p1}, LBe/M;->a(LQ/A;Lr/h;)LYg/J;

    move-result-object p1

    return-object p1
.end method
