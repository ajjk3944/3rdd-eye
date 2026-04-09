.class final LN/Q0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Q0;->g(Landroidx/compose/ui/e;LN/R0;Ljava/util/Map;Lw/q;ZZLy/m;Lmh/p;LN/x0;FILjava/lang/Object;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/Q0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/Q0$a;

    invoke-direct {v0}, LN/Q0$a;-><init>()V

    sput-object v0, LN/Q0$a;->a:LN/Q0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)LN/T;
    .locals 1

    new-instance p1, LN/T;

    const/16 p2, 0x38

    int-to-float p2, p2

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, LN/T;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/Q0$a;->a(Ljava/lang/Object;Ljava/lang/Object;)LN/T;

    move-result-object p1

    return-object p1
.end method
