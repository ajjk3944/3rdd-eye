.class public abstract Lb1/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[Lth/l;

.field private static final b:LJ0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/z;

    const-string v1, "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"

    const/4 v2, 0x1

    const-class v3, Lb1/C;

    const-string v4, "designInfoProvider"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    new-array v1, v2, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lb1/C;->a:[Lth/l;

    new-instance v0, LJ0/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "DesignInfoProvider"

    invoke-direct {v0, v3, v1, v2, v1}, LJ0/v;-><init>(Ljava/lang/String;Lmh/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lb1/C;->b:LJ0/v;

    return-void
.end method

.method public static final a(LJ0/w;Lb1/r;)V
    .locals 3

    sget-object v0, Lb1/C;->b:LJ0/v;

    sget-object v1, Lb1/C;->a:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, LJ0/v;->d(LJ0/w;Lth/l;Ljava/lang/Object;)V

    return-void
.end method
