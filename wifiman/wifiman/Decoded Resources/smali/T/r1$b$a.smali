.class final LT/r1$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/r1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/I;


# direct methods
.method constructor <init>(Lo/I;)V
    .locals 0

    iput-object p1, p0, LT/r1$b$a;->a:Lo/I;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Ld0/l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld0/l;

    const/4 v1, 0x4

    invoke-static {v1}, Landroidx/compose/runtime/snapshots/e;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ld0/l;->q(I)V

    :cond_0
    iget-object v0, p0, LT/r1$b$a;->a:Lo/I;

    invoke-virtual {v0, p1}, Lo/I;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LT/r1$b$a;->a(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
