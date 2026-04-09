.class public final synthetic LBe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(LT/q0;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/d;->a:LT/q0;

    iput-object p2, p0, LBe/d;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LBe/d;->a:LT/q0;

    iget-object v1, p0, LBe/d;->b:Lmh/l;

    check-cast p1, Ll0/g;

    invoke-static {v0, v1, p1}, LBe/f$a;->o(LT/q0;Lmh/l;Ll0/g;)LYg/J;

    move-result-object p1

    return-object p1
.end method
