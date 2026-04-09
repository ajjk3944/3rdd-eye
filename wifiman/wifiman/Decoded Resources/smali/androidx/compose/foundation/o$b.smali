.class final Landroidx/compose/foundation/o$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/o$b;

    invoke-direct {v0}, Landroidx/compose/foundation/o$b;-><init>()V

    sput-object v0, Landroidx/compose/foundation/o$b;->a:Landroidx/compose/foundation/o$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Landroidx/compose/foundation/o;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/o;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/o;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/o$b;->a(I)Landroidx/compose/foundation/o;

    move-result-object p1

    return-object p1
.end method
