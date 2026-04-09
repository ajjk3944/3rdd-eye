.class public final Landroidx/compose/ui/layout/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/j;


# instance fields
.field private a:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/ui/layout/k;->a:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/layout/k;-><init>(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lmh/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/k;->a:Lmh/a;

    return-void
.end method
