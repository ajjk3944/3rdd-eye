.class final LF/d0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d0$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Ly/m;


# direct methods
.method constructor <init>(LT/q0;Ly/m;)V
    .locals 0

    iput-object p1, p0, LF/d0$a$a;->a:LT/q0;

    iput-object p2, p0, LF/d0$a$a;->b:Ly/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, LF/d0$a$a;->a:LT/q0;

    iget-object v0, p0, LF/d0$a$a;->b:Ly/m;

    new-instance v1, LF/d0$a$a$a;

    invoke-direct {v1, p1, v0}, LF/d0$a$a$a;-><init>(LT/q0;Ly/m;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, LF/d0$a$a;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
