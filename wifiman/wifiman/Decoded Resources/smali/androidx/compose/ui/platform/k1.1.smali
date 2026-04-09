.class public final Landroidx/compose/ui/platform/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LJ0/n;

.field private final b:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LJ0/n;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/k1;->a:LJ0/n;

    iput-object p2, p0, Landroidx/compose/ui/platform/k1;->b:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final b()LJ0/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->a:LJ0/n;

    return-object v0
.end method
