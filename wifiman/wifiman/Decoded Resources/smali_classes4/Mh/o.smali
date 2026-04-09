.class public final LMh/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMh/n;


# instance fields
.field public a:Lgi/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LQh/g;)LBh/e;
    .locals 1

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LMh/o;->b()Lgi/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgi/c;->b(LQh/g;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lgi/c;
    .locals 1

    iget-object v0, p0, LMh/o;->a:Lgi/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "resolver"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c(Lgi/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMh/o;->a:Lgi/c;

    return-void
.end method
