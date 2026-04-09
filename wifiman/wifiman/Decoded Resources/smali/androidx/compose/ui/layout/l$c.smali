.class final Landroidx/compose/ui/layout/l$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/l;->a(Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/layout/l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/l$c;

    invoke-direct {v0}, Landroidx/compose/ui/layout/l$c;-><init>()V

    sput-object v0, Landroidx/compose/ui/layout/l$c;->a:Landroidx/compose/ui/layout/l$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;Landroidx/compose/ui/layout/k;)V
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/l$c$a;

    invoke-direct {v0, p1}, Landroidx/compose/ui/layout/l$c$a;-><init>(LE0/G;)V

    invoke-virtual {p2, v0}, Landroidx/compose/ui/layout/k;->a(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, Landroidx/compose/ui/layout/k;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/l$c;->a(LE0/G;Landroidx/compose/ui/layout/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
