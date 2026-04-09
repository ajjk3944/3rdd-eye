.class public final synthetic LBe/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:LJ9/a;


# direct methods
.method public synthetic constructor <init>(Lmh/l;LJ9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/Z;->a:Lmh/l;

    iput-object p2, p0, LBe/Z;->b:LJ9/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LBe/Z;->a:Lmh/l;

    iget-object v1, p0, LBe/Z;->b:LJ9/a;

    invoke-static {v0, v1}, LBe/a0$a;->a(Lmh/l;LJ9/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
