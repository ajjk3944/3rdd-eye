.class public final Landroidx/compose/ui/window/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/window/g;

.field public static b:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/compose/ui/window/g;

    invoke-direct {v0}, Landroidx/compose/ui/window/g;-><init>()V

    sput-object v0, Landroidx/compose/ui/window/g;->a:Landroidx/compose/ui/window/g;

    const/4 v0, 0x0

    sget-object v1, Landroidx/compose/ui/window/g$a;->a:Landroidx/compose/ui/window/g$a;

    const v2, -0x43764c14

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/window/g;->b:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    sget-object v0, Landroidx/compose/ui/window/g;->b:Lmh/p;

    return-object v0
.end method
