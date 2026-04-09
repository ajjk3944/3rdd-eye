.class final Landroidx/compose/foundation/gestures/DraggableElement$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/gestures/DraggableElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/gestures/DraggableElement$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/DraggableElement$a;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/DraggableElement$a;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/DraggableElement$a;->a:Landroidx/compose/foundation/gestures/DraggableElement$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/y;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/DraggableElement$a;->a(Ly0/y;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
