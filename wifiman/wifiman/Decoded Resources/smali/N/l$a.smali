.class final LN/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/l;->a(ZLmh/l;Landroidx/compose/ui/e;ZLy/m;LN/j;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lmh/l;Z)V
    .locals 0

    iput-object p1, p0, LN/l$a;->a:Lmh/l;

    iput-boolean p2, p0, LN/l$a;->b:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LN/l$a;->a:Lmh/l;

    iget-boolean v1, p0, LN/l$a;->b:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/l$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
