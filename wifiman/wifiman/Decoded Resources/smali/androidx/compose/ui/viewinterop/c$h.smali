.class final Landroidx/compose/ui/viewinterop/c$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/viewinterop/c$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/c$h;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/c$h;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/c$h;->a:Landroidx/compose/ui/viewinterop/c$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$h;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
