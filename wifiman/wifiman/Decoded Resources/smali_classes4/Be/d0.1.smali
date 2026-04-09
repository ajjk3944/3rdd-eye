.class public final synthetic LBe/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:LR0/Q;

.field public final synthetic d:Lmh/l;


# direct methods
.method public synthetic constructor <init>(ZZLR0/Q;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LBe/d0;->a:Z

    iput-boolean p2, p0, LBe/d0;->b:Z

    iput-object p3, p0, LBe/d0;->c:LR0/Q;

    iput-object p4, p0, LBe/d0;->d:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, LBe/d0;->a:Z

    iget-boolean v1, p0, LBe/d0;->b:Z

    iget-object v2, p0, LBe/d0;->c:LR0/Q;

    iget-object v3, p0, LBe/d0;->d:Lmh/l;

    invoke-static {v0, v1, v2, v3}, LBe/m0;->f(ZZLR0/Q;Lmh/l;)LT/q0;

    move-result-object v0

    return-object v0
.end method
