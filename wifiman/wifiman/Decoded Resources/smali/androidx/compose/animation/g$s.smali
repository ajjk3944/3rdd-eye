.class final Landroidx/compose/animation/g$s;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->w(Lr/H;Lf0/c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Landroidx/compose/animation/g$s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/g$s;

    invoke-direct {v0}, Landroidx/compose/animation/g$s;-><init>()V

    sput-object v0, Landroidx/compose/animation/g$s;->a:Landroidx/compose/animation/g$s;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/animation/g$s;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    return-object p1
.end method
