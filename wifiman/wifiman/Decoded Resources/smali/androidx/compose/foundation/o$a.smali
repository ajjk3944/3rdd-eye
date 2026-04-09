.class final Landroidx/compose/foundation/o$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/o$a;

    invoke-direct {v0}, Landroidx/compose/foundation/o$a;-><init>()V

    sput-object v0, Landroidx/compose/foundation/o$a;->a:Landroidx/compose/foundation/o$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;Landroidx/compose/foundation/o;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p2}, Landroidx/compose/foundation/o;->m()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, Landroidx/compose/foundation/o;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/o$a;->a(Lc0/m;Landroidx/compose/foundation/o;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
