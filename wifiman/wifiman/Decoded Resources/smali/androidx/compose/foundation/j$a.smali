.class final Landroidx/compose/foundation/j$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/j$a;

    invoke-direct {v0}, Landroidx/compose/foundation/j$a;-><init>()V

    sput-object v0, Landroidx/compose/foundation/j$a;->a:Landroidx/compose/foundation/j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ls/G;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/g;->a:Landroidx/compose/foundation/g;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/j$a;->a()Ls/G;

    move-result-object v0

    return-object v0
.end method
