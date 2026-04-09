.class final Landroidx/compose/ui/layout/l$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/layout/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/layout/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/l$e;

    invoke-direct {v0}, Landroidx/compose/ui/layout/l$e;-><init>()V

    sput-object v0, Landroidx/compose/ui/layout/l$e;->a:Landroidx/compose/ui/layout/l$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;LC0/r;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    check-cast p2, LC0/r;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/l$e;->a(Landroidx/compose/ui/layout/t$a;LC0/r;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
