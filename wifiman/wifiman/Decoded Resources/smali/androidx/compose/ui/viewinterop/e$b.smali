.class final Landroidx/compose/ui/viewinterop/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->b(Lmh/l;Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/viewinterop/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/e$b;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/e$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/e$b;->a:Landroidx/compose/ui/viewinterop/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;Lmh/l;)V
    .locals 0

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/e;->c(LE0/G;)Landroidx/compose/ui/viewinterop/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/compose/ui/viewinterop/i;->setResetBlock(Lmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, Lmh/l;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/e$b;->a(LE0/G;Lmh/l;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
